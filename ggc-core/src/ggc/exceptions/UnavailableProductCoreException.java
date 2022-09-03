package ggc.exceptions;

/** Exception thrown when a product is unavailable. */
public class UnavailableProductCoreException extends Exception {

  /** Serial number for serialization. */
  private static final long serialVersionUID = 202109091821L;

  private String _key;

  private int _requested;

  private int _available;
  /**
   * @param key       the requested key
   * @param requested Requested amount.
   * @param available Available amount.
   */
  public UnavailableProductCoreException(String key, int requested, int available) {
    _key = key;
    _requested = requested;
    _available = available;
  }

  public String getKey()
  {
      return _key;
  }

  public int getRequested()
  {
      return _requested;
  }

  public int getAvailable()
  {
      return _available;
  }

}