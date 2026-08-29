package t0;

import android.os.Build;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
public abstract class f {
    public static InputConnection a(InputConnection inputConnection, EditorInfo editorInfo, e eVar) {
        if (editorInfo != null) {
            if (Build.VERSION.SDK_INT >= 25) {
                return new c(inputConnection, eVar);
            }
            if (b.a(editorInfo).length == 0) {
                return inputConnection;
            }
            return new d(inputConnection, eVar);
        }
        throw new NullPointerException("editorInfo must be non-null");
    }
}
