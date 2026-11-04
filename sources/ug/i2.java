package ug;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import org.telegram.ui.Components.kw0;
public final class i2 implements View.OnApplyWindowInsetsListener {
    public final j2 f56065a;

    public i2(j2 j2Var) {
        this.f56065a = j2Var;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        WindowInsets windowInsets2;
        int i3;
        int i10;
        int i11;
        int i12;
        j2 j2Var = this.f56065a;
        kw0 kw0Var = j2Var.f56102b;
        Rect rect = j2Var.h;
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 30) {
            Insets insets = windowInsets.getInsets(647);
            i3 = insets.left;
            i10 = insets.top;
            i11 = insets.right;
            i12 = insets.bottom;
            rect.set(i3, i10, i11, i12);
        } else {
            rect.set(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        kw0Var.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        kw0Var.requestLayout();
        if (i13 >= 30) {
            windowInsets2 = WindowInsets.CONSUMED;
            return windowInsets2;
        }
        return windowInsets.consumeSystemWindowInsets();
    }
}
