package ggc.exceptions;

/** Exception thrown when a partner key is duplicated. */
public class DuplicatePartnerKeyCoreException extends Exception {

  /** Serial number for serialization. */
  private static final long serialVersionUID = 202111080020L;

  private String _key;

  /** @param key the duplicated key */
  public DuplicatePartnerKeyCoreException(String key) {
    _key = key;
  }

  public String getKey() {
      return _key;
  }
}