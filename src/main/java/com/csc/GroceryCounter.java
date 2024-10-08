package com.csc;

public class GroceryCounter {
  // Put your code here!


  int tensNum;
  int onesNum;
  int tenthsNum;
  int hundrethsNum;
  int overflows;

  public GroceryCounter()
  {
    tensNum = 0;
    onesNum = 0;
    tenthsNum = 0;
    hundrethsNum = 0;
    overflows = 0;
  }

  public void overflow()
  {
    this.overflows = this.overflows + 1;
  }

  public void tens()
  {
    this.tensNum = this.tensNum + 1;
    if (this.tensNum > 9)
    {
      overflow();
      this.tensNum = 0;
    }
  }

  public void ones()
  {
    this.onesNum = this.onesNum + 1;
    if (this.onesNum > 9)
    {
      tens();
      this.onesNum = 0;
    }
  }

  public void tenths()
  {
    this.tenthsNum = this.tenthsNum + 1;
    if (this.tenthsNum > 9)
    {
      ones();
      this.tenthsNum = 0;
    }
  }

  public void hundreths()
  {
    this.hundrethsNum = this.hundrethsNum + 1;
    if (this.hundrethsNum > 9)
    {
      tenths();
      this.hundrethsNum = 0;
    }
  }

  public void clear()
  {
    this.overflows = 0;
    this.tensNum = 0;
    this.onesNum = 0;
    this.tenthsNum = 0;
    this.hundrethsNum = 0;
  }
 
  public String total()
  {
    if (this.tensNum == 0)
    {
      return ("$" + Integer.toString(this.onesNum) + "." + Integer.toString(this.tenthsNum) + Integer.toString(this.hundrethsNum));
    }
    else
    {
      return ("$" + Integer.toString(this.tensNum) + Integer.toString(this.onesNum) + "." + Integer.toString(this.tenthsNum) + Integer.toString(this.hundrethsNum));
    }
  }

  public int number_of_overflows()
  {
    return this.overflows;
  }
}
