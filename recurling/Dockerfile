FROM alpine:latest
MAINTAINER Jorge Salamero Sanz <bencer@cauterized.net>

RUN apk add --update coreutils openssl ca-certificates curl wget && update-ca-certificates

ENV URL localhost
ENV SLEEP 3
ENV WGET 0
ENV RANDOM 0

COPY entrypoint.sh /

ENTRYPOINT ["/entrypoint.sh"]
