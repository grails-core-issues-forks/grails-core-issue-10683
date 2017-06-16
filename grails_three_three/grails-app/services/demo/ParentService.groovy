package demo

import org.slf4j.Logger
import org.slf4j.LoggerFactory

class ParentService {

    protected Logger log = LoggerFactory.getLogger(getClass())

    def foo() {
	log.info("hello world")
    }
}
