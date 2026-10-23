package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;
public final class z implements View.OnApplyWindowInsetsListener {
    public k1 f44869a = null;
    public final View f44870b;
    public final n f44871c;

    public z(View view, n nVar) {
        this.f44870b = view;
        this.f44871c = nVar;
    }

    @Override
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        k1 h = k1.h(view, windowInsets);
        int i10 = Build.VERSION.SDK_INT;
        n nVar = this.f44871c;
        if (i10 < 30) {
            a0.a(windowInsets, this.f44870b);
            if (h.equals(this.f44869a)) {
                return nVar.B0(view, h).g();
            }
        }
        this.f44869a = h;
        k1 B0 = nVar.B0(view, h);
        if (i10 >= 30) {
            return B0.g();
        }
        WeakHashMap weakHashMap = i0.f44830a;
        y.c(view);
        return B0.g();
    }
}
