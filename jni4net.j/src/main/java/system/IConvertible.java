// ------------------------------------------------------------------------------
//  <autogenerated>
//      This code was generated by jni4net. See http://jni4net.sourceforge.net/ 
// 
//      Changes to this file may cause incorrect behavior and will be lost if 
//      the code is regenerated.
//  </autogenerated>
// ------------------------------------------------------------------------------

package system;

@net.sf.jni4net.attributes.ClrInterface
public interface IConvertible {
    
    //<generated-interface>
    @net.sf.jni4net.attributes.ClrMethod("()LSystem/TypeCode;")
    system.Enum GetTypeCode();
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/IFormatProvider;)Z")
    boolean ToBoolean(system.IFormatProvider provider);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/IFormatProvider;)C")
    char ToChar(system.IFormatProvider provider);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/IFormatProvider;)LSystem/SByte;")
    byte ToSByte(system.IFormatProvider provider);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/IFormatProvider;)B")
    byte ToByte(system.IFormatProvider provider);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/IFormatProvider;)S")
    short ToInt16(system.IFormatProvider provider);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/IFormatProvider;)LSystem/UInt16;")
    short ToUInt16(system.IFormatProvider provider);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/IFormatProvider;)I")
    int ToInt32(system.IFormatProvider provider);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/IFormatProvider;)LSystem/UInt32;")
    int ToUInt32(system.IFormatProvider provider);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/IFormatProvider;)J")
    long ToInt64(system.IFormatProvider provider);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/IFormatProvider;)LSystem/UInt64;")
    long ToUInt64(system.IFormatProvider provider);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/IFormatProvider;)F")
    float ToSingle(system.IFormatProvider provider);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/IFormatProvider;)D")
    double ToDouble(system.IFormatProvider provider);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/IFormatProvider;)LSystem/Decimal;")
    system.Decimal ToDecimal(system.IFormatProvider provider);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/IFormatProvider;)LSystem/DateTime;")
    system.DateTime ToDateTime(system.IFormatProvider provider);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/IFormatProvider;)LSystem/String;")
    java.lang.String ToString(system.IFormatProvider provider);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/Type;LSystem/IFormatProvider;)LSystem/Object;")
    system.Object ToType(system.Type conversionType, system.IFormatProvider provider);
    //</generated-interface>
}