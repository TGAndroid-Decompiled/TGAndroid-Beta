package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;
public final class z implements View.OnApplyWindowInsetsListener {
    public m1 f42141a = null;
    public final View f42142b;
    public final n f42143c;

    public z(View view, n nVar) {
        this.f42142b = view;
        this.f42143c = nVar;
    }

    @Override
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        m1 h = m1.h(view, windowInsets);
        int i10 = Build.VERSION.SDK_INT;
        n nVar = this.f42143c;
        if (i10 < 30) {
            a0.a(windowInsets, this.f42142b);
            if (h.equals(this.f42141a)) {
                return nVar.Q0(view, h).g();
            }
        }
        this.f42141a = h;
        m1 Q0 = nVar.Q0(view, h);
        if (i10 >= 30) {
            return Q0.g();
        }
        WeakHashMap weakHashMap = i0.f42096a;
        y.c(view);
        return Q0.g();
    }
}
