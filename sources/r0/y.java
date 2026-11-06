package r0;

import android.view.View;
import android.view.WindowInsets;
public abstract class y {
    public static WindowInsets a(View view, WindowInsets windowInsets) {
        int i7 = k0.f54107a;
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    public static WindowInsets b(View view, WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }

    public static void c(View view) {
        view.requestApplyInsets();
    }
}
