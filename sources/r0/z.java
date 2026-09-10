package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;
public final class z implements View.OnApplyWindowInsetsListener {
    public l1 f41106a = null;
    public final View f41107b;
    public final n f41108c;

    public z(View view, n nVar) {
        this.f41107b = view;
        this.f41108c = nVar;
    }

    @Override
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        l1 h = l1.h(view, windowInsets);
        int i10 = Build.VERSION.SDK_INT;
        n nVar = this.f41108c;
        if (i10 < 30) {
            a0.a(windowInsets, this.f41107b);
            if (h.equals(this.f41106a)) {
                return nVar.Q0(view, h).g();
            }
        }
        this.f41106a = h;
        l1 Q0 = nVar.Q0(view, h);
        if (i10 >= 30) {
            return Q0.g();
        }
        WeakHashMap weakHashMap = i0.f41062a;
        y.c(view);
        return Q0.g();
    }
}
