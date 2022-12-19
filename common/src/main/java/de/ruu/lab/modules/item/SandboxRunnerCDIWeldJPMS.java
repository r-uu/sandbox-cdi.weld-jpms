package de.ruu.lab.modules.item;

import jakarta.enterprise.inject.se.SeContainerInitializer;
import jakarta.enterprise.inject.spi.CDI;
import lombok.extern.slf4j.Slf4j;

@Slf4j class SandboxRunnerCDIWeldJPMS
{
	public static void main(String[] args)
	{
		log.debug("cdi container initialisation");

		try (final var seContainer = SeContainerInitializer.newInstance().initialize())
		{
			log.debug("cdi container initialised");

			log.debug("looking up context");
			var context = CDI.current().select(CDIContext.class).get();
			log.debug("looked  up context");
			log.debug("greetings from context.greeter {}", context.greeter().greet());

			log.debug("looking up greeter");
			var greeter = CDI.current().select(CDIGreeter.class).get();
			log.debug("looked  up context");
			log.debug("greetings from greeter {}", greeter.greet());
		}
		catch (Exception e)
		{
			log.debug("cdi container initialisation failed");
		}
		finally
		{
			log.debug("cdi container shut down");
		}
	}
}