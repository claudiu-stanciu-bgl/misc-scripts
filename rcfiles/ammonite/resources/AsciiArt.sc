import scala.util.Random

final val MushroomClouds = Seq(
  """
            _ ._  _ , _ ._
          (_ ' ( `  )_  .__)
        ( (  (    )   `)  ) _)
       (__ (_   (_ . _) _) ,__)
           `~~`\ ' . /`~~`
                ;   ;
                /   \
  _____________/_ __ \_____________
  """,
  """
       _.-^^---....,,--
 _--                  --_
<                        >)
|                         |
 \._                   _./
    ```--. . , ; .--'''
          | |   |
       .-=||  | |=-.
       `-=#$%&%$#=-'
          | ;  :|
 _____.,-#%&$@%#&#~,._____
 """
)

final val HOUSE = """
       _
     _|=|__________
    /              \
   /                \
  /__________________\
   ||  || /--\ ||  ||
   ||[]|| | .| ||[]||
 ()||__||_|__|_||__||()
( )|-|-|-|====|-|-|-|( )
^^^^^^^^^^====^^^^^^^^^^^
"""

def mushroomCloud = {
  val rand = new Random(System.currentTimeMillis())
  rand.shuffle(MushroomClouds).head
}
