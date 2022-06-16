# ArduinoSynth - Project Info
#### Gabe Gonsalves
#### April 14, 2022
###### Coded in Java on macOS

## Introduction
For the EECS 1021 Major Project, I chose to create a musical instrument. In order for the musical instrument to be worth making, I had to do some research. I wanted to ensure that the project satisfied one of the challenges of engineering, and I found that individuals who are on the Autism spectrum have difficulty with verbal communication and the related communication skills. These individuals, are able to respond to auditory signals at an increased rate, and music has been shown to increase social communication skills and increase family morale. I will create the designs and the code for such an instrument so that individuals can build it at home for low cost. 

## Context
Musical instruments can be extremely costly, especially for those of sufficient quality. My goal in this project is to create an instrument that individuals on the autism spectrum can tinker with, build and play that is relatively inexpensive, and is programmable so that that individual can change the sounds the instrument makes. 

## Technical Specifications
- The Instrument should be simple to operate, and should provide visual and auditory feedback to a user's actions.
- It should be highly modifiable as well as easy to modify
- It should be low cost
- It should be modular, such that should a component be broken or damaged, it can be replaced easily.

### Flowchart of Code Logic
![Flowchart_MajProj.svg](/assets/Flowchart_MajProj.svg)
### Schematic Diagram
![SchematicDiagram.svg](/assets/SchematicDiagram.svg)

## Components List
- Arduino Uno
- Potentiometer
- USB Cable
- OLED Display (Used SSD1306 128x64)
- Button or Toggle Switch

## Procedure
### Building the Circuit
Since I used the Grove board for the assembly of this project, the button, potentiometer, and OLED Display all came pre-connected. I connected the Arduino UNO to the computer through USB and I was ready to go.

### Writing The Code
While I was writing the code, I wanted to make sure that it was simple to follow, and easily modifiable, in keeping with the requirements outlined in the section above. The instrument uses ``Firmata4j`` and ``jMusic`` libraries in order to both communicate with the computer and to synthesize a sound. I knew that an "example sketch" would be required, so that people who want to tinker with the instrument know what the basic structure to get it working would look like. I found that jMusic is a relatively simple library, with intuitive and easy to understand commands. This made it ideal for this project since one of my goals is to make it as easy as possible to learn how to use. 

### Designing the Interface
This is the more important part of the project. It was absolutely crucial that the instrument is easy to use, since the intended user base is primarily composed of individuals with limited verbal communication skills. I chose to go with a simple potentiometer (dial), a display to show the user what note they selected, and a button to tell the computer whether or not to play the note. 

## Testing
In order to test that the instrument worked, I tried to play <i>Mary had a little lamb</i>, which you'll see in the video demonstration. However, I quickly noticed that once I pressed the button, the computer would only play one note and then the program would end. I needed a timer object to repeat the ``Midi.play()`` function over and over again on a specific interval. Once I had implemented the ``TimerTask`` method, I was successful in having the note display on the screen and the note be played by the computer. 

## Learning Outcomes
1. This instrument demonstrated my ability to test and debug a given program since I was able to find, diagnose, and solve a bug in my code. I then proved its effectiveness in the video demonstration. 
2. I met the given requirement by designing a device that can improve the lives of other people, solve one of the 15 problems of engineering, and improve the lives of those people who are close to me and those who cannot express themselves in the same ways as many others.
3. I built an event driven application that uses input from two user-controlled sources to produce an auditory and visual response that the user can detect.
4. The design encompasses Software engineering in modifying the software, electrical engineering in constructing the circuit, and computer engineering in establishing the link between the two.


## Contingency
I initially wanted to create a speaker, so that people could enjoy their music with a low-cost Arduino powering their speaker instead of an expensive and bulky amplifier. I was unable to do this, however, since I was not able to afford to buy the parts that were required to build such a device (A 100-watt Class D Amplifier IC is very expensive). Because of this, I decided to make a more simple project hardware-wise, but I wanted to tie it into something that affects me very personally (I have several family members as well as friends who are on the Autism spectrum). In all honesty, I am happy that I decided to go with the musical instrument instead of making the speaker, since I believe it will be more meaningful to me, my family and my friends. 

## Additional Material
The musical instrument that I have designed is more than just the sum of its parts. It is a way for people who are on the Autism spectrum to experiment with technology, music, and electronics all at the same time. They can learn how to program in Java, compose a new melody, and build an electrical circuit by building one device that is low cost and easy to acquire the components for. 

## Conclusion
All in all, I believe that the device (instrument) that I have designed will improve the lives of those who are on the Autism spectrum by giving them an opportunity to unleash their creativity in ways they likely have never had the opportunity to experiment with. It is not limited to those who are on the spectrum, however, since this instrument can be tinkered with and built by someone who is not neurodivergent. It allows for creativity, problem solving, increased social skills and can improve confidence and self esteem. 

## Official Citations (MLA)
#### Source #1
“Music Improves Social Communication in Autistic Children.” _Newsroom_, 5 Nov. 2018, https://www.mcgill.ca/newsroom/channels/news/music-improves-social-communication-autistic-children-291353.

#### Source #2
Sharda, Megha, et al. “Music Improves Social Communication and Auditory-Motor Connectivity in Children with Autism.” _Translational Psychiatry_, Nature Publishing Group UK, 23 Oct. 2018, https://www.ncbi.nlm.nih.gov/pmc/articles/PMC6199253/.




