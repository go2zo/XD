package com.xindian.deploy;

/**
 * A default Module implementation that basically avoids subclasses having to
 * implement the whole Module interface.</p>
 */
public class BasicModule implements Module
{
	/**
	 * The name of the module
	 */
	private String name;

	/**
	 * <p>
	 * Create a basic module with the given name.
	 * </p>
	 * 
	 * @param moduleName
	 *            The name for the module or null to use the default
	 */
	public BasicModule(String moduleName)
	{
		if (moduleName == null)
		{
			this.name = "No name assigned Module Class[" + getClass() + "]";
		} else
		{
			this.name = moduleName;
		}
	}

	/**
	 * <p>
	 * Obtain the name of the module.
	 * </p>
	 * 
	 * @return The name of the module
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * <p>
	 * Initializes the basic module.
	 * </p>
	 * <p/>
	 * <p>
	 * Inheriting classes that choose to override this method MUST call this
	 * initialize() method before accessing BasicModule resources.
	 * </p>
	 * 
	 * @param server
	 *            the server hosting this module.
	 */
	public void initialize(Container server)
	{
	}

	/**
	 * <p>
	 * Starts the basic module.
	 * </p>
	 * <p/>
	 * <p>
	 * Inheriting classes that choose to override this method MUST call this
	 * start() method before accessing BasicModule resources.
	 * </p>
	 * 
	 * @throws IllegalStateException
	 *             If start is called before initialize successfully returns
	 */
	public void start() throws IllegalStateException
	{
	}

	/**
	 * <p>
	 * Stops the basic module.
	 * </p>
	 * <p/>
	 * <p>
	 * Inheriting classes that choose to override this method MUST call this
	 * stop() method before accessing BasicModule resources.
	 * </p>
	 */
	public void stop()
	{
	}

	/**
	 * <p>
	 * Destroys the module.
	 * </p>
	 * <p/>
	 * <p>
	 * Does nothing in the basic module.
	 * </p>
	 */
	public void destroy()
	{
	}
}