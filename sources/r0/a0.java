package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;
public final class a0 implements View.OnApplyWindowInsetsListener {
    public m1 f46428a = null;
    public final View f46429b;
    public final o f46430c;

    public a0(View view, o oVar) {
        this.f46429b = view;
        this.f46430c = oVar;
    }

    @Override
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        m1 h = m1.h(view, windowInsets);
        int i10 = Build.VERSION.SDK_INT;
        o oVar = this.f46430c;
        if (i10 < 30) {
            b0.a(windowInsets, this.f46429b);
            if (h.equals(this.f46428a)) {
                return oVar.M0(view, h).g();
            }
        }
        this.f46428a = h;
        m1 M0 = oVar.M0(view, h);
        if (i10 >= 30) {
            return M0.g();
        }
        WeakHashMap weakHashMap = j0.f46469a;
        z.c(view);
        return M0.g();
    }
}
