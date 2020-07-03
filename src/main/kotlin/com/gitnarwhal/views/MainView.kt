package com.gitnarwhal.views


import com.gitnarwhal.components.RepoTab
import javafx.fxml.FXML
import javafx.fxml.Initializable
import javafx.scene.control.Tab
import javafx.scene.control.TabPane
import java.net.URL
import java.util.*
import com.gitnarwhal.GitNarwhal
import javafx.scene.Parent

class MainView : Initializable {
    @FXML lateinit var tabPane : TabPane


    override fun initialize(location: URL?, resources: ResourceBundle?) {
        tabPane.tabs.add(RepoTab("D:\\Desktop\\repos\\architecture-helper"))
    }
}