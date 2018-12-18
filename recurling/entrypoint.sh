#!/bin/sh
while true
do
	if [ ${RANDOM} = "true" ];
	then
            SLEEP=
	else
	fi	
	curl -sS ${URL} > /dev/null
	sleep ${SLEEP}
done
