package yf;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
public final class s2 implements View.OnApplyWindowInsetsListener {
    public final t2 f50105a;

    public s2(t2 t2Var) {
        this.f50105a = t2Var;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        WindowInsets windowInsets2;
        int i9;
        int i10;
        int i11;
        int i12;
        t2 t2Var = this.f50105a;
        q2 q2Var = t2Var.f50111b;
        Rect rect = t2Var.h;
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 30) {
            Insets insets = windowInsets.getInsets(647);
            i9 = insets.left;
            i10 = insets.top;
            i11 = insets.right;
            i12 = insets.bottom;
            rect.set(i9, i10, i11, i12);
        } else {
            rect.set(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        q2Var.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        q2Var.requestLayout();
        if (i13 >= 30) {
            windowInsets2 = WindowInsets.CONSUMED;
            return windowInsets2;
        }
        return windowInsets.consumeSystemWindowInsets();
    }
}
