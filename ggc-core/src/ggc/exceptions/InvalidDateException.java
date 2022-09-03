package ggc.exceptions;

/** Exception for date-related problems. */
public class InvalidDateException extends Exception {

  /** Serial number for serialization. */
  private static final long serialVersionUID = 202110262819L;

  /** The requested date. */
	int _date;

  /** @param date bad date to report. */
  public InvalidDateException(int date) {
    _date = date;
  }

  /**
   * @return requested date.
   */
  public int getDate() {
      return _date;
  }

}