package Aplicaciones_javaFx;

import JavaFx.ventanas.VentanaEmergente;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.awt.*;

public class Pedidos_pizza extends Application {
    private Label LblNombre, LblTel, LblDireccion, LblTitulo, Lbl_Tamaño, Lbl_Masa, Lbl_tipo;
    private RadioButton Rbutton_Pequeña, Rbutton_Mediana, Rbutton_Grande, Rbutton_Fina, Rbutton_normal;
    private TextField txtNombre, txtTel, txtDireccion;

    private Button BtnEnviar, BtnCancelar;
    private CheckBox Check_Queso, Check_Peperoni, Check_Aceinutas, Check_Champiñones, Check_Hawaiana, Check_Anchoas, Check_Tomate, Check_Pimiento;

    private ToggleGroup Toggle_Tamaño, Toggle_Masa;

    public static void main(String[] args) {
        launch(args);
    }

    public Pedidos_pizza() {
        Toggle_Tamaño = new ToggleGroup();
        Toggle_Masa = new ToggleGroup();

        Rbutton_Pequeña = new RadioButton("Pequeña");
        Rbutton_Mediana = new RadioButton("Mediana");
        Rbutton_Grande = new RadioButton("Grande");
        Rbutton_Fina = new RadioButton("Fina");
        Rbutton_normal = new RadioButton("Normal");

        Check_Aceinutas = new CheckBox("Aceitunas");
        Check_Anchoas = new CheckBox("Anchoas");
        Check_Champiñones = new CheckBox("Champiñones");
        Check_Hawaiana = new CheckBox("Hawaiana");
        Check_Queso = new CheckBox("Queso");
        Check_Pimiento = new CheckBox("Pimiento");
        Check_Tomate = new CheckBox("Tomate");
        Check_Peperoni = new CheckBox("Peperoni");

        Rbutton_Pequeña.setToggleGroup(Toggle_Tamaño);
        Rbutton_Mediana.setToggleGroup(Toggle_Tamaño);
        Rbutton_Grande.setToggleGroup(Toggle_Tamaño);
        Rbutton_Fina.setToggleGroup(Toggle_Masa);
        Rbutton_normal.setToggleGroup(Toggle_Masa);

        Rbutton_Mediana.setSelected(true);
        Rbutton_normal.setSelected(true);

        txtNombre = new TextField();
        txtTel = new TextField();
        txtDireccion = new TextField();

        LblNombre = new Label("Nombre");
        LblDireccion = new Label("Dirección");
        LblTel = new Label("Telefono");
        LblTitulo = new Label("¡Pide tu pizza ahora!");
        Lbl_Masa = new Label("Masa");
        Lbl_Tamaño = new Label("Tamaño");
        Lbl_tipo = new Label("Ingredientes");

        LblTitulo.setFont(new Font(20));
        txtNombre.setPrefSize(200, 10);
        txtTel.setPrefSize(200, 10);
        txtDireccion.setPrefSize(200, 10);

        txtNombre.setPromptText("Ingresa tú Nombre");
        txtDireccion.setPromptText("Ingresa tu Dirección");
        txtTel.setPromptText("Ingresa tú Telefono");

        BtnEnviar = new Button("Enviar pedido");
        BtnCancelar = new Button("Cancelar pedido");

        BtnEnviar.setId("btnEnviar");
        BtnCancelar.setId("btnCancelar");

        LblTitulo.getStyleClass().add("title-label");
        Check_Aceinutas.setStyle("-fx-text-fill: #000000; -fx-font-weight: bold;");
        Check_Anchoas.setStyle("-fx-text-fill: #000000; -fx-font-weight: bold;");
        Check_Champiñones.setStyle("-fx-text-fill: #000000; -fx-font-weight: bold;");
        Check_Hawaiana.setStyle("-fx-text-fill: #000000; -fx-font-weight: bold;");
        Check_Queso.setStyle("-fx-text-fill: #000000; -fx-font-weight: bold;");
        Check_Pimiento.setStyle("-fx-text-fill: #000000; -fx-font-weight: bold;");
        Check_Tomate.setStyle("-fx-text-fill: #000000; -fx-font-weight: bold;");
        Check_Peperoni.setStyle("-fx-text-fill: #000000; -fx-font-weight: bold;");

        Rbutton_Pequeña.setStyle("-fx-text-fill: #000000; -fx-font-weight: bold;");
        Rbutton_Mediana.setStyle("-fx-text-fill: #000000; -fx-font-weight: bold;");
        Rbutton_Grande.setStyle("-fx-text-fill: #000000; -fx-font-weight: bold;");
        Rbutton_Fina.setStyle("-fx-text-fill: #000000; -fx-font-weight: bold;");
        Rbutton_normal.setStyle("-fx-text-fill: #000000; -fx-font-weight: bold;");

        txtNombre.setPrefColumnCount(20);
        txtDireccion.setPrefColumnCount(20);
        txtTel.setPrefColumnCount(20);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Sistema de Gestion de Pedidos");
        stage.setHeight(680);
        stage.setWidth(650);
        stage.setResizable(false);
        //Creamos los contenedores que nos ayudaran para configurar la disposición de los elementos
        //Dentro de la aplicación
        HBox Contenedor_titulo = new HBox(20);
        HBox Contenedor_nombres = new HBox(20);
        HBox Contenedor_telefono = new HBox(15);
        HBox Contenedor_direccion = new HBox(10);
        HBox Contenedor_boton = new HBox(20);
        //Agregamos los elementos a los contenedores
        Contenedor_titulo.getChildren().add(LblTitulo);
        Contenedor_nombres.getChildren().addAll(LblNombre, txtNombre);
        Contenedor_telefono.getChildren().addAll(LblTel, txtTel);
        Contenedor_direccion.getChildren().addAll(LblDireccion, txtDireccion);
        Contenedor_boton.getChildren().addAll(BtnCancelar, BtnEnviar);
        //Configuramos el estilo del contenedor
        Contenedor_titulo.setPadding(new Insets(20));
        Contenedor_nombres.setPadding(new Insets(20));
        Contenedor_telefono.setPadding(new Insets(20));
        Contenedor_direccion.setPadding(new Insets(20));
        Contenedor_boton.setPadding(new Insets(20));
        Contenedor_boton.setAlignment(Pos.BASELINE_RIGHT);
        //Contenedor de opciones
        VBox Contenedor_opcion1 = new VBox(20, Lbl_Tamaño, Rbutton_Pequeña, Rbutton_Mediana, Rbutton_Grande);
        VBox Contenedor_opcion2 = new VBox(20, Lbl_Masa, Rbutton_Fina, Rbutton_normal);
        VBox Contenedor_opcion3 = new VBox(20, Lbl_tipo, Check_Aceinutas, Check_Champiñones, Check_Anchoas);
        VBox Contenedor_opcion4 = new VBox(20, new Label(""), Check_Peperoni, Check_Hawaiana, Check_Tomate);
        VBox Contenedor_opcion5 = new VBox(20, new Label(""), Check_Pimiento, Check_Queso);
        HBox Contenedor_opciones = new HBox(40, Contenedor_opcion1, Contenedor_opcion2, Contenedor_opcion3, Contenedor_opcion4, Contenedor_opcion5);
        //Configuramos el estilo de nuestro contenedor de opciones:
        Contenedor_opciones.setPadding(new Insets(20));
        //Agregamos los contenedores subyacentes al contenedor principal
        VBox Contenedor_general = new VBox(Contenedor_titulo, Contenedor_nombres, Contenedor_telefono, Contenedor_direccion, Contenedor_opciones, Contenedor_boton);
        Contenedor_general.getStyleClass().add("bordered-hbox");
        //Eventos
        stage.setOnCloseRequest(e -> {
            boolean isCancel = VentanaEmergente.showWindow("¿Estás seguro que quieres cancelar el pedido", "Aviso");
            if (!isCancel) e.consume();
        });
        RadioButton Tamaño_seleccionado = (RadioButton) Toggle_Tamaño.getSelectedToggle();
        RadioButton Masa_seleccionada = (RadioButton) Toggle_Masa.getSelectedToggle();
        BtnEnviar.setOnAction(e -> {
            if (txtNombre.getLength() > 0 && txtDireccion.getLength() > 0 && txtTel.getLength() > 0) {
                e.consume();
                Alert msg = new Alert(Alert.AlertType.INFORMATION);
                msg.setHeaderText("¡Gracias por tú compra!");
                msg.setContentText("Tu pedido ha sido enviado con exito" + "\n" + "\n" + "Detalles del cliente: " + "\n" + "Nombre: " + txtNombre.getText() + "\n" + "Telefono: " + txtTel.getText() + "\n" + "Dirección: " + txtDireccion.getText() + "\n" + "\n" + "Detalles del producto: " + "pizza" + "\n" + "Tamaño: " + Tamaño_seleccionado.getText() + "\n" + "Masa: " + Masa_seleccionada.getText() + "\n" + "\n" + "Total a pagar: ");
                msg.setTitle("Informacion del pedido");
                msg.show();
            } else {
                Alert msg_error = new Alert(Alert.AlertType.ERROR);
                msg_error.setHeaderText("¡No se ha podido procesar tu pedido!");
                msg_error.setContentText("¡No puedes dejar casillas sin responder!" + "\n" + "Por favor completalas para procesar correctamente tu pedido");
                msg_error.setTitle("Error de pedido");
                msg_error.show();
            }

        });
        BtnCancelar.setOnAction(e -> {
            Alert pedido_cancelado = new Alert(Alert.AlertType.WARNING);
            if (txtNombre.getLength() > 0 && txtDireccion.getLength() > 0 && txtTel.getLength() > 0) {
                pedido_cancelado.setHeaderText("¡Su pedido ha sido cancelado!");
                pedido_cancelado.setTitle("Cancelacion de pedido");
                pedido_cancelado.setContentText("¡Tu pedido ha sido cancelado! " + "\n" + "\n" + "Detalles del cliente: " + "\n" + "Nombre: " + txtNombre.getText() + "\n" + "Telefono: " + txtTel.getText() + "\n" + "Dirección: " + txtDireccion.getText() + "\n" + "\n" + "Detalles del producto: " + "pizza" + "\n" + "Tamaño: " + Tamaño_seleccionado.getText() + "\n" + "Masa: " + Masa_seleccionada.getText() + "\n" + "\n" + "Total a pagar: " + "$0");
                pedido_cancelado.show();
            } else {
                Alert msg_error = new Alert(Alert.AlertType.ERROR);
                msg_error.setHeaderText("¡No se ha podido cancelar tu pedido!");
                msg_error.setContentText("¡No puedes dejar casillas sin responder!" + "\n" + "Por favor completalas para procesar correctamente tu pedido");
                msg_error.setTitle("Error de pedido");
                msg_error.show();
            }

        });
        Contenedor_general.getStyleClass().add("root");
        Scene scene = new Scene(Contenedor_general);
        //scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
        scene.getStylesheets().add("styles.css");
        stage.setScene(scene);
        stage.show();

    }
}
