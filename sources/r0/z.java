package r0;

import android.view.View;
import android.view.WindowInsets;
public abstract class z {
    public static WindowInsets a(View view, WindowInsets windowInsets) {
        int i10 = l0.f43151a;
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    public static WindowInsets b(View view, WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }

    public static void c(View view) {
        view.requestApplyInsets();
    }
}
