package zf;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

public final class s2 implements View.OnApplyWindowInsetsListener {

    public final t2 f50700a;

    public s2(t2 t2Var) {
        this.f50700a = t2Var;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        t2 t2Var = this.f50700a;
        qg.f fVar = t2Var.f50706b;
        Rect rect = t2Var.h;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            Insets insets = windowInsets.getInsets(647);
            rect.set(insets.left, insets.top, insets.right, insets.bottom);
        } else {
            rect.set(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        fVar.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        fVar.requestLayout();
        return i10 >= 30 ? WindowInsets.CONSUMED : windowInsets.consumeSystemWindowInsets();
    }
}
