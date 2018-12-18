import os
import time
import random
import requests

host = os.getenv('VOTE', "vote")
url = os.getenv('URL', "")
port = os.getenv('PORT', "5000")
sleep = os.getenv('SLEEP', "3")

options = ['a', 'b']

while True:
	vote = random.choice(options)
	voter_id = hex(random.getrandbits(64))[2:-1]
	r = requests.post('http://%s:%s/%s' % (host, port, url), data = {'voter_id': voter_id, 'vote': vote})
        sleep_time = random.randrange(int(sleep))/10.0
        time.sleep(sleep_time)

