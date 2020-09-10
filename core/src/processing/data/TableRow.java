package processing.data;

import java.io.PrintWriter;

/**
 * A <b>TableRow</b> object represents a single row of data values, 
 * stored in columns, from a table.<br />
 * <br />
 * Additional <b>TableRow</b> methods are documented in the 
 * <a href="http://processing.github.io/processing-javadocs/core/">Processing Data Javadoc</a>.
 *
 * @webref data:composite
 * @webBrief represents a single row of data values, stored in columns, from a table.
 * @see Table
 * @see Table#addRow()
 * @see Table#removeRow(int)
 * @see Table#clearRows()
 * @see Table#getRow(int)
 * @see Table#rows()
 */
public interface TableRow {

  /**
   * Get an String value from the specified column
   *
   * @webref tablerow:method
   * @webBrief Get an String value from the specified column
   * @param column ID number of the column to reference
   * @see TableRow#getInt(int)
   * @see TableRow#getFloat(int)
   */
  public String getString(int column);

  /**
   * @param columnName title of the column to reference
   */
  public String getString(String columnName);

  /**
   * Get an integer value from the specified column
   *
   * @webref tablerow:method
   * @webBrief Get an integer value from the specified column
   * @param column ID number of the column to reference
   * @see TableRow#getFloat(int)
   * @see TableRow#getString(int)
   */
  public int getInt(int column);

  /**
   * @param columnName title of the column to reference
   */
  public int getInt(String columnName);

  /**
   * @webBrief Get a long value from the specified column
   * @param column ID number of the column to reference
   * @see TableRow#getFloat(int)
   * @see TableRow#getString(int)
   */

  public long getLong(int column);

  /**
   * @param columnName title of the column to reference
   */
  public long getLong(String columnName);

  /**
   * Get a float value from the specified column
   *
   * @webref tablerow:method
   * @webBrief Get a float value from the specified column
   * @param column ID number of the column to reference
   * @see TableRow#getInt(int)
   * @see TableRow#getString(int)
   */
  public float getFloat(int column);

  /**
   * @param columnName title of the column to reference
   */
  public float getFloat(String columnName);
  
  /**
   * @webBrief Get a double value from the specified column
   * @param column ID number of the column to reference
   * @see TableRow#getInt(int)
   * @see TableRow#getString(int)
   */
  public double getDouble(int column);
  
  /**
   * @param columnName title of the column to reference
   */
  public double getDouble(String columnName);

  /**
   * Store a String value in the specified column
   *
   * @webref tablerow:method
   * @webBrief Store a String value in the specified column
   * @param column ID number of the target column
   * @param value value to assign
   * @see TableRow#setInt(int, int)
   * @see TableRow#setFloat(int, float)
   */
  public void setString(int column, String value);
  /**
   * @param columnName title of the target column
   */
  public void setString(String columnName, String value);

  /**
   * Store an integer value in the specified column
   *
   * @webref tablerow:method
   * @webBrief Store an integer value in the specified column
   * @param column ID number of the target column
   * @param value value to assign
   * @see TableRow#setFloat(int, float)
   * @see TableRow#setString(int, String)
   */
  public void setInt(int column, int value);

  /**
   * @param columnName title of the target column
   */
  public void setInt(String columnName, int value);
  
  /**
   * @webBrief Store a long value in the specified column
   * @param column ID number of the target column
   * @param value value to assign
   * @see TableRow#setFloat(int, float)
   * @see TableRow#setString(int, String)
   */
  public void setLong(int column, long value);
  
  /**
   * @param columnName title of the target column
   */
  public void setLong(String columnName, long value);

  /**
   * Store a float value in the specified column
   *
   * @webref tablerow:method
   * @webBrief Store a float value in the specified column
   * @param column ID number of the target column
   * @param value value to assign
   * @see TableRow#setInt(int, int)
   * @see TableRow#setString(int, String)
   */
  public void setFloat(int column, float value);
  
  /**
   * @param columnName title of the target column
   */
  public void setFloat(String columnName, float value);

  /**
   * @webBrief Store a double value in the specified column
   * @param column ID number of the target column
   * @param value value to assign
   * @see TableRow#setFloat(int, float)
   * @see TableRow#setString(int, String)
   */
  public void setDouble(int column, double value);
  
  /**
   * @param columnName title of the target column
   */
  public void setDouble(String columnName, double value);

  /**
   * Get the column count.
   *
   * @webref tablerow:method
   * @webBrief Get the column count.
   * @return count of all columns
   */
  public int getColumnCount();
  
  /**
   * @webBrief Get the column type.
   * @param columnName title of the target column
   * @return type of the column
   */
  public int getColumnType(String columnName);
  
  /**
   * @param column ID number of the target column
   */
  public int getColumnType(int column);
  
  /**
   * @webBrief Get the all column types
   * @return list of all column types
   */
  public int[] getColumnTypes();

  /**
   * Get the column title.
   *
   * @webref tablerow:method
   * @webBrief Get the column title.
   * @param column ID number of the target column
   * @return title of the column
   */
  public String getColumnTitle(int column);

  /**
   * @webBrief Get the all column titles
   * @return list of all column titles
   */
  public String[] getColumnTitles();

  public void write(PrintWriter writer);
  public void print();
}
