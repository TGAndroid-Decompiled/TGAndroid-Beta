package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;
public final class a0 implements View.OnApplyWindowInsetsListener {
    public m1 f43104a = null;
    public final View f43105b;
    public final o f43106c;

    public a0(View view, o oVar) {
        this.f43105b = view;
        this.f43106c = oVar;
    }

    @Override
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        m1 h = m1.h(view, windowInsets);
        int i10 = Build.VERSION.SDK_INT;
        o oVar = this.f43106c;
        if (i10 < 30) {
            b0.a(windowInsets, this.f43105b);
            if (h.equals(this.f43104a)) {
                return oVar.M0(view, h).g();
            }
        }
        this.f43104a = h;
        m1 M0 = oVar.M0(view, h);
        if (i10 >= 30) {
            return M0.g();
        }
        WeakHashMap weakHashMap = j0.f43142a;
        z.c(view);
        return M0.g();
    }
}
