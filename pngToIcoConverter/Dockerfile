FROM alpine:3.18.4
RUN apk update && apk add --no-cache imagemagick
RUN mkdir /input /output
COPY input/*.png /input/
COPY convert.sh /input/
RUN chmod +x /input/convert.sh
WORKDIR /input
RUN mogrify -path /output -format ico *.png
WORKDIR /output
RUN mv *.ico /output/
WORKDIR /
# RUN rm -r /input /output

#Use following command to copy from Dockercontainer to host.
#  docker cp tools:/output .\imageMagic\output