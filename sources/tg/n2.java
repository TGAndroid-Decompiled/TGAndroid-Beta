package tg;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import org.telegram.ui.Components.w01;
public final class n2 implements View.OnApplyWindowInsetsListener {
    public final o2 f58144a;

    public n2(o2 o2Var) {
        this.f58144a = o2Var;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        WindowInsets windowInsets2;
        int i7;
        int i10;
        int i11;
        int i12;
        o2 o2Var = this.f58144a;
        w01 w01Var = o2Var.f58153b;
        Rect rect = o2Var.h;
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
        w01Var.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        w01Var.requestLayout();
        if (i13 >= 30) {
            windowInsets2 = WindowInsets.CONSUMED;
            return windowInsets2;
        }
        return windowInsets.consumeSystemWindowInsets();
    }
}
