
package org.apereo.cas;

import org.apereo.cas.audit.spi.ServiceAccessEnforcementAuditResourceResolverTests;
import org.apereo.cas.audit.spi.ShortenedReturnValueAsStringResourceResolverTests;
import org.apereo.cas.audit.spi.ThreadLocalPrincipalResolverTests;
import org.apereo.cas.audit.spi.TicketValidationResourceResolverTests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * This is {@link AllTestsSuite}.
 *
 * @author Auto-generated by Gradle Build
 * @since 6.0.0-RC3
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    ShortenedReturnValueAsStringResourceResolverTests.class,
    ThreadLocalPrincipalResolverTests.class,
    ServiceAccessEnforcementAuditResourceResolverTests.class,
    TicketValidationResourceResolverTests.class
})
public class AllTestsSuite {
}
