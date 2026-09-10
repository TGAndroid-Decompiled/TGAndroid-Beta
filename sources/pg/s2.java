package pg;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import bi.ld;
public final class s2 implements View.OnApplyWindowInsetsListener {
    public final t2 f40292a;

    public s2(t2 t2Var) {
        this.f40292a = t2Var;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        WindowInsets windowInsets2;
        int i10;
        int i11;
        int i12;
        int i13;
        t2 t2Var = this.f40292a;
        ld ldVar = t2Var.f40303b;
        Rect rect = t2Var.h;
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 30) {
            Insets insets = windowInsets.getInsets(647);
            i10 = insets.left;
            i11 = insets.top;
            i12 = insets.right;
            i13 = insets.bottom;
            rect.set(i10, i11, i12, i13);
        } else {
            rect.set(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        ldVar.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        ldVar.requestLayout();
        if (i14 >= 30) {
            windowInsets2 = WindowInsets.CONSUMED;
            return windowInsets2;
        }
        return windowInsets.consumeSystemWindowInsets();
    }
}
