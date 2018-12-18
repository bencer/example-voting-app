FROM alpine:latest
MAINTAINER Jorge Salamero Sanz <bencer@cauterized.net>

RUN apk update && apk add openssl ca-certificates wget && update-ca-certificates

ENV URL localhost
ENV SLEEP 3

COPY entrypoint.sh /

ENTRYPOINT ["/entrypoint.sh"]
