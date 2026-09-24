package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;
public final class z implements View.OnApplyWindowInsetsListener {
    public l1 f42158a = null;
    public final View f42159b;
    public final n f42160c;

    public z(View view, n nVar) {
        this.f42159b = view;
        this.f42160c = nVar;
    }

    @Override
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        l1 h = l1.h(view, windowInsets);
        int i10 = Build.VERSION.SDK_INT;
        n nVar = this.f42160c;
        if (i10 < 30) {
            a0.a(windowInsets, this.f42159b);
            if (h.equals(this.f42158a)) {
                return nVar.Q0(view, h).g();
            }
        }
        this.f42158a = h;
        l1 Q0 = nVar.Q0(view, h);
        if (i10 >= 30) {
            return Q0.g();
        }
        WeakHashMap weakHashMap = i0.f42114a;
        y.c(view);
        return Q0.g();
    }
}
