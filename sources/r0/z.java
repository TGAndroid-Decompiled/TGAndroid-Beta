package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;
public final class z implements View.OnApplyWindowInsetsListener {
    public k1 f46811a = null;
    public final View f46812b;
    public final n f46813c;

    public z(View view, n nVar) {
        this.f46812b = view;
        this.f46813c = nVar;
    }

    @Override
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        k1 h = k1.h(view, windowInsets);
        int i10 = Build.VERSION.SDK_INT;
        n nVar = this.f46813c;
        if (i10 < 30) {
            a0.a(windowInsets, this.f46812b);
            if (h.equals(this.f46811a)) {
                return nVar.M0(view, h).g();
            }
        }
        this.f46811a = h;
        k1 M0 = nVar.M0(view, h);
        if (i10 >= 30) {
            return M0.g();
        }
        WeakHashMap weakHashMap = i0.f46764a;
        y.c(view);
        return M0.g();
    }
}
