//ramramjiramramjuramramji
//ramramjiramramjuramramji
//ramramjiramramjiramramji
//ramramjiramramjuramramji
//ramramjiramramjuramramji
//ramramjiramramjiramramji
//ramramjiramramjuramramji
//ramramjiramramjuramramji
//ramramjiramramjiramramji
//ramramjiramramjiramramji
//ramramjiramramjuramramji
//ramramjiramramjuramramji
//ramramjiramramjiramramji
//ramramjiramramjuramramji
//ramramjiramramjuramramji
//ramramjiramramjiramramji
//ramramjiramramjuramramji
//ramramjiramramjuramramji
//ramramjiramramjiramramji

//> using javaOpt --enable-native-access=ALL-UNNAMED
//> using javaProp java.library.path=.

package bhilani.interoperability.jvm

@main def runScala(): Unit =
  val sdk = new JVMSDKit()
  println("Scala SDK")
  try
    val res = sdk.fetchInteroperability("", """{"page": "1"}""")
    println(res)
  catch
    case e: Exception => println(s"Error: ${e.getMessage}")
	
//ramramjiramramjuramramji
//ramramjiramramjuramramji
//ramramjiramramjiramramji
//ramramjiramramjuramramji
//ramramjiramramjuramramji
//ramramjiramramjiramramji
//ramramjiramramjuramramji
//ramramjiramramjuramramji
//ramramjiramramjiramramji
//ramramjiramramjiramramji
//ramramjiramramjuramramji
//ramramjiramramjuramramji
//ramramjiramramjiramramji
//ramramjiramramjuramramji
//ramramjiramramjuramramji
//ramramjiramramjiramramji
//ramramjiramramjuramramji
//ramramjiramramjuramramji
//ramramjiramramjiramramji