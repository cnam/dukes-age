/**
 * Copyright (c) 2014 Oracle and/or its affiliates. All rights reserved.
 *
 * You may not modify, use, reproduce, or distribute this software except in
 * compliance with  the terms of the License at:
 * http://java.net/projects/javaeetutorial/pages/BerkeleyLicense
 */
package firstcup.dukesage.resource;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * REST Web Service
 *
 */
@Path("dukesAge")
public class DukesAgeResource {

    /**
     * Creates a new instance of DukesAgeResource
     */
    public DukesAgeResource() {
    }

    /**
     * Retrieves representation of an instance of DukesAgeResource
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    public String getText() {
        Calendar duckesBurthday = new GregorianCalendar(1995, Calendar.MAY, 23);
        Calendar now = GregorianCalendar.getInstance();

        int duckesAge = now.get(Calendar.YEAR) - duckesBurthday.get(Calendar.YEAR);
        duckesBurthday.add(Calendar.YEAR, duckesAge);

        if (now.before(duckesBurthday)) {
            duckesAge--;
        }

        return "" + duckesAge;
    }
}
