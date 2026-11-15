package tg;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import org.telegram.ui.Components.m01;
public final class k2 implements View.OnApplyWindowInsetsListener {
    public final l2 f57416a;

    public k2(l2 l2Var) {
        this.f57416a = l2Var;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        WindowInsets windowInsets2;
        int i7;
        int i10;
        int i11;
        int i12;
        l2 l2Var = this.f57416a;
        m01 m01Var = l2Var.f57423b;
        Rect rect = l2Var.h;
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 30) {
            Insets insets = windowInsets.getInsets(647);
            i7 = insets.left;
            i10 = insets.top;
            i11 = insets.right;
            i12 = insets.bottom;
            rect.set(i7, i10, i11, i12);
        } else {
            rect.set(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        m01Var.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        m01Var.requestLayout();
        if (i13 >= 30) {
            windowInsets2 = WindowInsets.CONSUMED;
            return windowInsets2;
        }
        return windowInsets.consumeSystemWindowInsets();
    }
}
