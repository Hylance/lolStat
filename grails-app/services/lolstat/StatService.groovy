package lolstat

import grails.transaction.Transactional

@Transactional
class StatService {

    def lolHttpClient
    def serviceMethod() {
        lolHttpClient.get()
    }
}
