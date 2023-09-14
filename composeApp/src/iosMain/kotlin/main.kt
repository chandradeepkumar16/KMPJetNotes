import androidx.compose.ui.window.ComposeUIViewController
import org.chandradeepdev.kmpnotes.App
import platform.UIKit.UIViewController

fun MainViewController(systemAppearance: (isLight: Boolean) -> Unit): UIViewController {
    return ComposeUIViewController { App(systemAppearance) }
}
