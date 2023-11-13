# Software Tools
This repository has software tools for different purposes. 

## Tools Available:
1. [PNG to ICO Converter](#png-to-ico-converter)
2. [Key Generator](#key-generator)

---
### PNG to ICO Converter
- Use this tool to convert PNG files to ICO files for your website. 

##### Prerequisites for running:
1. [Docker Desktop](https://www.docker.com/products/docker-desktop/)


##### Steps for converting the PNG files to ICO files:
1. Paste the PNG files inside **_input_ folder**.
2. Open terminal in the directory 'pngToIcoConverter' and run either of the following commands:


    docker build -t ico_converter_image:latest .
    docker run -d --name tools_container ico_converter_image:latest
    docker cp tools_container:/output ./

**OR**

    docker build -t ico_converter_image:latest . ; docker run -d --name tools_container ico_converter_image:latest ; docker cp tools_container:/output ./

3. ICO files will be available inside **_output_ folder**
---
### Key Generator
- Use this tool generate keys of different lengths for your web applications.
- Generates keys of lengths (bits): 16, 32, 64, 128, 256, 512, 1024, and 2048.
- Program written in Java. 

If you want long key sizes, please add the key size to 'ARRAY_KEY_LENGTH_IN_BITS' in _src/main/java/com/jacob/KeyGenerator.java_. 

##### Prerequisites for running:
1. [Docker Desktop](https://www.docker.com/products/docker-desktop/)


##### Steps for converting the PNG files to ICO files:
1. Open terminal in the directory 'keyGenerator' and run either of the following commands:


    docker build -t key_generator_image:latest .
    docker run -t -d --name tools_container key_generator_image:latest
    docker logs -f tools_container

**OR**

    docker build -t key_generator_image:latest . ; docker run -t -d --name tools_container key_generator_image:latest ; docker logs -f tools_container

2. Keys of different lengths can be viewed on the Terminal window itself.  
