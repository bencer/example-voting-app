FROM python:2.7-alpine
MAINTAINER Jorge Salamero Sanz <bencer@cauterized.net>

RUN pip install requests

ENV VOTE vote
ENV PORT 5000
ENV SLEEP 3

ADD voter.py /

ENTRYPOINT [ "python", "/voter.py" ]
