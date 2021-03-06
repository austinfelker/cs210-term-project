package types;

/** 
 * Defines the properties for a response.
 * <p>
 * Do not modify the protocols.
 */
@SuppressWarnings("preview")
public record Response (
	String query, 
	boolean success,
	String message,
	Table table
) {}