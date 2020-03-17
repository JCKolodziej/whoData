object dataRetriver extends App{
  val url = "https://ghoapi.azureedge.net/api/DIMENSION/COUNTRY/DimensionValues"
  val result = scala.io.Source.fromURL(url)
  var res = result.filter(x => x == "Ago")
  println(result.value)
  println(res)
}
