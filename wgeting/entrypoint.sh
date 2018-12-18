#!/bin/sh
while true
do
	#curl -sS ${URL} > /dev/null
        cd /tmp
	wget \
          --recursive --no-parent --page-requisites \
          ${URL} > /dev/null
        rm -fr *
	sleep ${SLEEP}
done
