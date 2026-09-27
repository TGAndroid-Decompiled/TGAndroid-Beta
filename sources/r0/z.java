package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;
public final class z implements View.OnApplyWindowInsetsListener {
    public l1 f42217a = null;
    public final View f42218b;
    public final n f42219c;

    public z(View view, n nVar) {
        this.f42218b = view;
        this.f42219c = nVar;
    }

    @Override
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        l1 h = l1.h(view, windowInsets);
        int i10 = Build.VERSION.SDK_INT;
        n nVar = this.f42219c;
        if (i10 < 30) {
            a0.a(windowInsets, this.f42218b);
            if (h.equals(this.f42217a)) {
                return nVar.Q0(view, h).g();
            }
        }
        this.f42217a = h;
        l1 Q0 = nVar.Q0(view, h);
        if (i10 >= 30) {
            return Q0.g();
        }
        WeakHashMap weakHashMap = i0.f42173a;
        y.c(view);
        return Q0.g();
    }
}
