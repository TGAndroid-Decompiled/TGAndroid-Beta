package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;
public final class z implements View.OnApplyWindowInsetsListener {
    public l1 f44750a = null;
    public final View f44751b;
    public final n f44752c;

    public z(View view, n nVar) {
        this.f44751b = view;
        this.f44752c = nVar;
    }

    @Override
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        l1 h = l1.h(view, windowInsets);
        int i10 = Build.VERSION.SDK_INT;
        n nVar = this.f44752c;
        if (i10 < 30) {
            a0.a(windowInsets, this.f44751b);
            if (h.equals(this.f44750a)) {
                return nVar.T0(view, h).g();
            }
        }
        this.f44750a = h;
        l1 T0 = nVar.T0(view, h);
        if (i10 >= 30) {
            return T0.g();
        }
        WeakHashMap weakHashMap = i0.f44698a;
        y.c(view);
        return T0.g();
    }
}
