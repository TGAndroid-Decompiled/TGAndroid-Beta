package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;
public final class z implements View.OnApplyWindowInsetsListener {
    public k1 f44883a = null;
    public final View f44884b;
    public final n f44885c;

    public z(View view, n nVar) {
        this.f44884b = view;
        this.f44885c = nVar;
    }

    @Override
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        k1 h = k1.h(view, windowInsets);
        int i10 = Build.VERSION.SDK_INT;
        n nVar = this.f44885c;
        if (i10 < 30) {
            a0.a(windowInsets, this.f44884b);
            if (h.equals(this.f44883a)) {
                return nVar.B0(view, h).g();
            }
        }
        this.f44883a = h;
        k1 B0 = nVar.B0(view, h);
        if (i10 >= 30) {
            return B0.g();
        }
        WeakHashMap weakHashMap = i0.f44844a;
        y.c(view);
        return B0.g();
    }
}
