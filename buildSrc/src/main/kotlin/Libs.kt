object Libs {

   const val kotlinVersion = "1.6.10"
   // const val dokkaVersion = "1.4.20"
   const val kotestGradlePlugin = "0.3.9"
   const val versionsPlugin = "0.41.0"

   object Kotest {
      private const val version = "5.0.3"
      const val assertionsCore = "io.kotest:kotest-assertions-core:$version"
      const val assertionsJson = "io.kotest:kotest-assertions-json:$version"
      const val junit5 = "io.kotest:kotest-runner-junit5:$version"
      const val proptest = "io.kotest:kotest-property:$version"
   }

   object Kotlinx {
      private const val version = "1.3.2"
      const val serializationCore = "org.jetbrains.kotlinx:kotlinx-serialization-core:$version"
      const val serializationJson = "org.jetbrains.kotlinx:kotlinx-serialization-json:$version"
   }

   object Xerial {
      const val snappy = "org.xerial.snappy:snappy-java:1.1.8.4"
   }

   object Avro {
      private const val version = "1.8.2"
      const val avro = "org.apache.avro:avro:$version"
   }
}
