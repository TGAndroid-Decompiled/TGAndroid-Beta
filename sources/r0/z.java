package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;
public final class z implements View.OnApplyWindowInsetsListener {
    public l1 f42186a = null;
    public final View f42187b;
    public final n f42188c;

    public z(View view, n nVar) {
        this.f42187b = view;
        this.f42188c = nVar;
    }

    @Override
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        l1 h = l1.h(view, windowInsets);
        int i10 = Build.VERSION.SDK_INT;
        n nVar = this.f42188c;
        if (i10 < 30) {
            a0.a(windowInsets, this.f42187b);
            if (h.equals(this.f42186a)) {
                return nVar.P0(view, h).g();
            }
        }
        this.f42186a = h;
        l1 P0 = nVar.P0(view, h);
        if (i10 >= 30) {
            return P0.g();
        }
        WeakHashMap weakHashMap = i0.f42142a;
        y.c(view);
        return P0.g();
    }
}
