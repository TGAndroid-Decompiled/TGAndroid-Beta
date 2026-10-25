package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;
public final class z implements View.OnApplyWindowInsetsListener {
    public k1 f47145a = null;
    public final View f47146b;
    public final n f47147c;

    public z(View view, n nVar) {
        this.f47146b = view;
        this.f47147c = nVar;
    }

    @Override
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        k1 h = k1.h(view, windowInsets);
        int i10 = Build.VERSION.SDK_INT;
        n nVar = this.f47147c;
        if (i10 < 30) {
            a0.a(windowInsets, this.f47146b);
            if (h.equals(this.f47145a)) {
                return nVar.P0(view, h).g();
            }
        }
        this.f47145a = h;
        k1 P0 = nVar.P0(view, h);
        if (i10 >= 30) {
            return P0.g();
        }
        WeakHashMap weakHashMap = i0.f47105a;
        y.c(view);
        return P0.g();
    }
}
