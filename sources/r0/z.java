package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;
public final class z implements View.OnApplyWindowInsetsListener {
    public l1 f42207a = null;
    public final View f42208b;
    public final n f42209c;

    public z(View view, n nVar) {
        this.f42208b = view;
        this.f42209c = nVar;
    }

    @Override
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        l1 h = l1.h(view, windowInsets);
        int i10 = Build.VERSION.SDK_INT;
        n nVar = this.f42209c;
        if (i10 < 30) {
            a0.a(windowInsets, this.f42208b);
            if (h.equals(this.f42207a)) {
                return nVar.P0(view, h).g();
            }
        }
        this.f42207a = h;
        l1 P0 = nVar.P0(view, h);
        if (i10 >= 30) {
            return P0.g();
        }
        WeakHashMap weakHashMap = i0.f42163a;
        y.c(view);
        return P0.g();
    }
}
