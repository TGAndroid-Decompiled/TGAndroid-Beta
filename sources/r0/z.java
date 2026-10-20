package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;
public final class z implements View.OnApplyWindowInsetsListener {
    public k1 f44865a = null;
    public final View f44866b;
    public final n f44867c;

    public z(View view, n nVar) {
        this.f44866b = view;
        this.f44867c = nVar;
    }

    @Override
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        k1 h = k1.h(view, windowInsets);
        int i10 = Build.VERSION.SDK_INT;
        n nVar = this.f44867c;
        if (i10 < 30) {
            a0.a(windowInsets, this.f44866b);
            if (h.equals(this.f44865a)) {
                return nVar.B0(view, h).g();
            }
        }
        this.f44865a = h;
        k1 B0 = nVar.B0(view, h);
        if (i10 >= 30) {
            return B0.g();
        }
        WeakHashMap weakHashMap = i0.f44826a;
        y.c(view);
        return B0.g();
    }
}
