package r0;

import android.view.View;
public abstract class d0 {
    public static int a(View view) {
        return view.getImportantForAutofill();
    }

    public static void b(View view, int i9) {
        view.setImportantForAutofill(i9);
    }
}
