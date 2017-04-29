package com.redhat;

import org.springframework.data.couchbase.core.query.ViewIndexed;
import org.springframework.data.couchbase.repository.CouchbaseRepository;

@ViewIndexed(designDoc = "customer", viewName = "all")
public interface CustomerRepositoryCouchbase extends CouchbaseRepository<Customer, String>{

}
