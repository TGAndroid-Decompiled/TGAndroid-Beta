package t0;

import android.os.Build;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
public abstract class g {
    public static InputConnection a(InputConnection inputConnection, EditorInfo editorInfo, f fVar) {
        if (editorInfo != null) {
            if (Build.VERSION.SDK_INT >= 25) {
                return new d(inputConnection, fVar);
            }
            if (c.a(editorInfo).length == 0) {
                return inputConnection;
            }
            return new e(inputConnection, fVar);
        }
        throw new NullPointerException("editorInfo must be non-null");
    }
}
