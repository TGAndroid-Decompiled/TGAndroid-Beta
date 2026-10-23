package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;
public final class z implements View.OnApplyWindowInsetsListener {
    public k1 f45281a = null;
    public final View f45282b;
    public final n f45283c;

    public z(View view, n nVar) {
        this.f45282b = view;
        this.f45283c = nVar;
    }

    @Override
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        k1 h = k1.h(view, windowInsets);
        int i10 = Build.VERSION.SDK_INT;
        n nVar = this.f45283c;
        if (i10 < 30) {
            a0.a(windowInsets, this.f45282b);
            if (h.equals(this.f45281a)) {
                return nVar.B0(view, h).g();
            }
        }
        this.f45281a = h;
        k1 B0 = nVar.B0(view, h);
        if (i10 >= 30) {
            return B0.g();
        }
        WeakHashMap weakHashMap = i0.f45242a;
        y.c(view);
        return B0.g();
    }
}
