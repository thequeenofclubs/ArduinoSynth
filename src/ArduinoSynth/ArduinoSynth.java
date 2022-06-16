package ArduinoSynth;

import org.firmata4j.I2CDevice;
import org.firmata4j.Pin;
import org.firmata4j.firmata.FirmataDevice;
import org.firmata4j.ssd1306.SSD1306;
import jm.music.data.*;
import jm.util.Play;
import jm.constants.*;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class ArduinoSynth {
    public static void main(String[] args) throws IOException, InterruptedException {
        var myGroveBoard = new FirmataDevice("/dev/cu.usbserial-0001");


            myGroveBoard.start();
            System.out.println("Board Started");
            myGroveBoard.ensureInitializationIsDone();

            I2CDevice i2cObject = myGroveBoard.getI2CDevice((byte) 0x3C);
            SSD1306 theOledObject = new SSD1306(i2cObject, SSD1306.Size.SSD1306_128_64);
            theOledObject.init();
            var button = myGroveBoard.getPin(6);
            button.setMode(Pin.Mode.INPUT);
            var pot = myGroveBoard.getPin(14);
            pot.setMode(Pin.Mode.ANALOG);

            var mainTimer = new Timer();
            mainTimer.schedule(new TimerTask() {

                @Override
                public void run() {

                    var potDouble = pot.getValue();

                    var value128 = (potDouble/1023.0*120);




        theOledObject.getCanvas().clear();
                    String note;
                    if (value128 <= 10 && value128 >= 0) {
                        note = "C3";
                    }else if(value128 <=20 && value128 >=11){
                        note = "C#3";
                    }else if(value128 <=30 && value128 >=21){
                        note = "D3";
                    }else if(value128 <=40 && value128 >=31){
                        note = "D#3";
                    }else if(value128 <=50 && value128 >=41){
                        note = "E3";
                    }else if(value128 <=60 && value128 >=51){
                        note = "F3";
                    }else if(value128 <=70 && value128 >=61){
                        note = "F#3";
                    }else if(value128 <=80 && value128 >=71){
                        note = "G3";
                    }else if(value128 <=90 && value128 >=81){
                        note = "G#3";
                    }else if(value128 <=100 && value128 >=91){
                        note = "A3";
                    }else if(value128 <=110 && value128 >=101){
                        note = "A#3";
                    }else if(value128 <=120 && value128 >=111){
                        note = "B3";
                    }else{
                        note = "Potentiometer Error";
                    }
                    theOledObject.getCanvas().drawString(0, 0, "Note to play: " + note);
var midiNote = note;
                    if (button.getValue() == 1){
                        if (value128 <= 10 && value128 >= 0) {
                            Play.midi(new Note(Pitches.C3, RhythmValues.TN));
                        }else if(value128 <=20 && value128 >=11){
                            Play.midi(new Note(Pitches.CS3, RhythmValues.TN));
                        }else if(value128 <=30 && value128 >=21){
                            Play.midi(new Note(Pitches.D3, RhythmValues.TN));
                        }else if(value128 <=40 && value128 >=31){
                            Play.midi(new Note(Pitches.DF3, RhythmValues.TN));
                        }else if(value128 <=50 && value128 >=41){
                            Play.midi(new Note(Pitches.E3, RhythmValues.TN));
                        }else if(value128 <=60 && value128 >=51){
                            Play.midi(new Note(Pitches.F3, RhythmValues.TN));
                        }else if(value128 <=70 && value128 >=61){
                            Play.midi(new Note(Pitches.FS3, RhythmValues.TN));
                        }else if(value128 <=80 && value128 >=71){
                            Play.midi(new Note(Pitches.G3, RhythmValues.TN));
                        }else if(value128 <=90 && value128 >=81){
                            Play.midi(new Note(Pitches.GS3, RhythmValues.TN));
                        }else if(value128 <=100 && value128 >=91){
                            Play.midi(new Note(Pitches.A3, RhythmValues.TN));
                        }else if(value128 <=110 && value128 >=101){
                            Play.midi(new Note(Pitches.AS3, RhythmValues.TN));
                        }else if(value128 <=120 && value128 >=111){
                            Play.midi(new Note(Pitches.B3, RhythmValues.TN));
                        }else{
                            note = "Potentiometer Error";
                        }


                    }



                    theOledObject.display();



                    theOledObject.getCanvas().clear();




                }
            },0,380);

        }
    }

