Help on contributing to wrapping JavaFX APIs

# Introduction #

This page contains the list of JavaFX APIs that we are going to wrap using Scala. If you want to add more APIs we can do it as and when possible but we should make sure that we complete the required JavaFX APIs.

# APIs Status #

Read below for more information about how to actually do the API wrapping.

Those who are contributing please update the relevant API/package with your name and date you started working on it. Don't take more than a week to complete the task. If you see something not updated in that past one week, you can override the previous contributor and start working on it.

Here's the list of APIs we should work on:

  * javafx.animation
  * javafx.application
    * Application
    * HostServices
    * Platform
    * Preloader
  * javafx.beans
  * javafx.beans.binding
  * javafx.beans.property
  * javafx.beans.value
  * javafx.collections
  * javafx.concurrent
  * javafx.embed.swing
  * javafx.event - (Luc Duponcheel 21/01/2012) - partially working on it
  * javafx.fxml
  * javafx.geometry
    * BoundingBox - (Rafael Afonso 16/03/2012) - done
    * Bounds - (Rafael Afonso 16/03/2012) - done
    * Dimension2D - (Rafael Afonso 16/03/2012) - done
    * Insets - (Stephen Chin) done
    * Point2D - (Rafael Afonso 16/03/2012) - done
    * Point3D - (Rafael Afonso 01/03/2012) - done
    * Rectangle2D - (Rafael Afonso 16/03/2012) - done
  * javafx.scene
    * Camera
    * Cursor
    * Group
    * ImageCursor
    * Node
    * ParallelCamera
    * Parent
    * PerspectiveCamera
    * Scene
  * javafx.scene.chart
  * javafx.scene.control
    * Accordion
    * Button - (Luc Duponcheel 20/01/2012) - done
    * ButtonBase - (Luc Duponcheel 20/01/2012) - done
    * Cell
    * CheckBox - (Rafael Afonso 26/01/2012) - done
    * CheckMenuItem
    * ChoiceBox - (Luc Duponcheel 26/01/2012)
    * ComboBox - (Rafael Afonso 17/03/2012) - done
    * ComboBoxBase - (Rafael Afonso 17/03/2012) - done
    * ContextMenu
    * Control
    * FocusModel
    * FocusModelBase
    * Hyperlink
    * IndexedCell
    * Label
    * Labeled
    * ListCell
    * ListView
    * Menu - (Danila Atmakin 10/05/2012) - done
    * MenuBar - (Danila Atmakin 10/05/2012) - done
    * MenuButton
    * MenuItem
    * MultipleSelectionModel - (Rafael Afonso 05/03/2012) - done
    * MultipleSelectionModelBase
    * NodeMenuItem
    * PasswordBox
    * PopupControl - (Rafael Afonso 22/02/2012) - done
    * ProgressBar - (Rafael Afonso 06/02/2012) - done
    * ProgressIndicator - (Rafael Afonso 04/02/2012) - done
    * RadioButton - (Luc Duponcheel 25/01/2012) - done
    * RadioMenuItem
    * Range
    * ScrollBar
    * ScrollPane -- Completed by Ken M, Jan 11 2012
    * SelectionModel - (Rafael Afonso 04/03/2012) - done
    * Separator - (Rafael Afonso 28/01/2012) - done
    * SeparatorMenuItem
    * SingleSelectionModel - (Rafael Afonso 04/03/2012) - done
    * Slider - (Rafael Afonso 12/02/2012) - done
    * SplitMenuButton
    * SplitPane
    * Tab - (Rafael Afonso 04/03/2012) - done
    * TableCell - (prassee) working on it
    * TableColumn -(prassee) working on it
    * TablePosition- (prassee) working on it
    * TableRow- (prassee) working on it
    * TableView- (prassee) working on it
    * TabPane - (Rafael Afonso 04/03/2012) - done
    * TextArea - (Rafael Afonso 28/01/2012) - done
    * TextBox
    * TextField - working on it
    * TextInput
    * TextInputControl - (Rafael Afonso 29/01/2012) - done
    * TitledPane
    * ToggleButton - (Luc Duponcheel 25/01/2012) - done
    * ToggleGroup - (Luc Duponcheel 25/01/2012) - done
    * ToolBar
    * Tooltip - (Rafael Afonso 22/02/2012) - done
    * TreeCell
    * TreeItem
    * TreeView

  * javafx.scene.control.cell ---  Steve do we need this ?

  * javafx.scene.effect - (Luc Duponcheel 21/01/2012) - partially working on it
    * Blend - (Rafael Afonso 19/03/2012) - done
    * Bloom - (Rafael Afonso 19/03/2012) - done
    * BoxBlur - (Rafael Afonso 19/03/2012) - done
    * Blend - (Rafael Afonso 19/03/2012) - done
    * Effect - done
  * javafx.scene.image
    * Image - (Luc Duponcheel 20/01/2012) -- done
    * ImageView - (Luc Duponcheel 20/01/2012) -- done
  * javafx.scene.input
    * Clipboard - (Rafael Afonso 07/03/2012) - done
    * ClipboardContent - (Rafael Afonso 07/03/2012) - done
    * ContextMenuEvent - (Rafael Afonso 09/03/2012) - done
    * DataFormat - (Rafael Afonso 07/03/2012) - done
    * Dragboard - (Rafael Afonso 09/03/2012) - done
    * DragEvent - (Rafael Afonso 09/03/2012) - done
    * InputEvent - done
    * InputMethodEvent - (Rafael Afonso 09/03/2012) - done
    * InputMethodTextRun - (Rafael Afonso 09/03/2012) - done
    * KeyCharacterCombination
    * KeyCharacterCombinationBuilder
    * KeyCodeCombination
    * KeyCodeCombinationBuilder
    * KeyCombination
    * KeyCombination.Modifier
    * KeyEvent
    * Mnemonic
    * MnemonicBuilder
    * MouseDragEvent
    * MouseEvent - done
    * ScrollEvent
  * javafx.scene.layout
    * AnchorPane
    * BorderPane
    * ColumnConstraints
    * ConstraintsBase
    * FlowPane
    * GridPane
    * HBox
    * Pane
    * Region
    * RowConstraints
    * StackPane
    * TilePane
    * VBox
  * javafx.scene.media
  * javafx.scene.paint
    * Color -- Ken: Added color constants Jan 11, but there may be more to do.
    * LinearGradient - (Rafael Afonso 19/03/2012) - done
    * Paint - (Rafael Afonso 19/03/2012) - done
    * RadialGradient - (Rafael Afonso 19/03/2012) - done
    * Stop - (Rafael Afonso 19/03/2012) - done
  * javafx.scene.shape
    * Arc
    * ArcTo
    * Circle
    * ClosePath
    * CubicCurve
    * CubicCurveTo
    * Ellipse
    * HLineTo
    * Line
    * LineTo
    * MoveTo
    * Path
    * PathElement
    * Polygon
    * Polyline
    * QuadCurve
    * QuadCurveTo
    * Rectangle
    * Shape
    * SVGPath
    * VLineTo
  * javafx.scene.text -- Ken: Jan 17 Done
  * javafx.scene.transform - (Rafael Afonso 01/03/2012) - done
    * Affine
    * Rotate
    * Scale
    * Shear
    * Transform
    * Translate
  * javafx.scene.web
    * HTMLEditor - (Rafael Afonso 24/03/2012) - done
    * PopupFeatures - (Rafael Afonso 24/03/2012) - done
    * PromptData - (Rafael Afonso 24/03/2012) - done
    * WebEngine - (Rafael Afonso 24/03/2012) - done
    * WebEvent - (Rafael Afonso 24/03/2012) - done
    * WebView - (Rafael Afonso 24/03/2012) - done
  * javafx.stage
    * DirectoryChooser - (Rafael Afonso 13/03/2012) - done
    * FileChooser - (Rafael Afonso 13/03/2012) - done
    * Popup - (Rafael Afonso 13/03/2012) - done
    * PopupWindow - (Rafael Afonso 13/03/2012) - done
    * Screen - (Rafael Afonso 13/03/2012) - done
    * Stage - Almost done: must be converted to Window subclass
    * Window - (Rafael Afonso 13/03/2012) - almost done
    * WindowEvent - (Rafael Afonso 13/03/2012) - done
  * javafx.util
    * Duration - done
    * Pair - Replace by Tuple2?
    * StringConverter - In translation (31/01/2012)


# Wrapping APIs #
Will be updated..

## Common Patterns ##
Will be updated..

### Wrap and Bind ###
Will be updated..

### Setting Properties ###
Will be updated..