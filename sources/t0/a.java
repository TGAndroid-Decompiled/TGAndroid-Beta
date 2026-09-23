package t0;

import android.view.inputmethod.EditorInfo;
public abstract class a {
    public static void a(EditorInfo editorInfo, CharSequence charSequence) {
        editorInfo.setInitialSurroundingSubText(charSequence, 0);
    }
}
