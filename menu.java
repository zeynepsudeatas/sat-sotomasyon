<?xml version="1.0" encoding="UTF-8"?>

<?import javafx.scene.control.Button?>
<?import javafx.scene.image.Image?>
<?import javafx.scene.image.ImageView?>
<?import javafx.scene.layout.AnchorPane?>
<?import javafx.scene.text.Font?>


<AnchorPane prefHeight="500.0" prefWidth="500.0" style="-fx-background-color: pink;" xmlns:fx="http://javafx.com/fxml/1" xmlns="http://javafx.com/javafx/17" fx:controller="application.menuController">
   <children>
      <ImageView fx:id="imageview" fitHeight="233.0" fitWidth="500.0" layoutX="-6.0" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@../../../../Downloads/yonetici.jpg" />
         </image>
      </ImageView>
      <Button fx:id="btn_pekle" layoutX="21.0" layoutY="250.0" mnemonicParsing="false" onAction="#btn_pekle_Click" prefHeight="72.0" prefWidth="120.0" text="Personel Ekle">
         <font>
            <Font name="System Bold" size="12.0" />
         </font>
      </Button>
      <Button fx:id="btn_satıs" layoutX="287.0" layoutY="346.0" mnemonicParsing="false" onAction="#btn_satıs_Click" prefHeight="72.0" prefWidth="120.0" text="Satış Ekranı">
         <font>
            <Font name="System Bold" size="12.0" />
         </font>
      </Button>
      <Button fx:id="btn_psil" layoutX="287.0" layoutY="250.0" mnemonicParsing="false" onAction="#btn_psil_Click" prefHeight="72.0" prefWidth="120.0" text="Personel Sil">
         <font>
            <Font name="System Bold" size="12.0" />
         </font>
      </Button>
      <Button fx:id="btn_üekle" layoutX="21.0" layoutY="346.0" mnemonicParsing="false" onAction="#btn_üekle_Click" prefHeight="72.0" prefWidth="120.0" text="Ürün Ekle">
         <font>
            <Font name="System Bold" size="12.0" />
         </font>
      </Button>
   </children>
</AnchorPane>
