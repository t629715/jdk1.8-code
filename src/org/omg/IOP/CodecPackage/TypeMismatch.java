package org.omg.IOP.CodecPackage;


/**
* org/omg/IOP/CodecPackage/TypeMismatch.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u171/10807/corba/src/share/classes/org/omg/PortableInterceptor/IOP.idl
* Wednesday, March 28, 2018 4:07:49 PM PDT
*/

public final class TypeMismatch extends org.omg.CORBA.UserException
{

  public TypeMismatch ()
  {
    super(TypeMismatchHelper.id());
  } // ctor


  public TypeMismatch (String $reason)
  {
    super(TypeMismatchHelper.id() + "  " + $reason);
  } // ctor

} // class TypeMismatch