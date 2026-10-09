package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;
public final class z implements View.OnApplyWindowInsetsListener {
    public k1 f46813a = null;
    public final View f46814b;
    public final n f46815c;

    public z(View view, n nVar) {
        this.f46814b = view;
        this.f46815c = nVar;
    }

    @Override
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        k1 h = k1.h(view, windowInsets);
        int i10 = Build.VERSION.SDK_INT;
        n nVar = this.f46815c;
        if (i10 < 30) {
            a0.a(windowInsets, this.f46814b);
            if (h.equals(this.f46813a)) {
                return nVar.M0(view, h).g();
            }
        }
        this.f46813a = h;
        k1 M0 = nVar.M0(view, h);
        if (i10 >= 30) {
            return M0.g();
        }
        WeakHashMap weakHashMap = i0.f46766a;
        y.c(view);
        return M0.g();
    }
}
