package org.assertj.examples.data.bug27;


/**
 * {@link MyModelClass} specific assertions - Generated by me.
 *
 * Although this class is not final to allow Soft assertions proxy, if you wish to extend it, 
 * extend {@link AbstractMyModelClassAssert} instead.
 */
public class MyModelClassAssert extends AbstractMyModelClassAssert<MyModelClassAssert, MyModelClass> {

  /**
   * Creates a new <code>{@link MyModelClassAssert}</code> to make assertions on actual MyModelClass.
   * @param actual the MyModelClass we want to make assertions on.
   */
  public MyModelClassAssert(MyModelClass actual) {
    super(actual, MyModelClassAssert.class);
  }

  /**
   * factory method for MyModelClass assertions.
   * @return a new <code>{@link MyModelClassAssert}</code>
   */
  public static MyModelClassAssert assertThat(MyModelClass actual) {
    return new MyModelClassAssert(actual);
  }
}
