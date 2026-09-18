package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;
public final class z implements View.OnApplyWindowInsetsListener {
    public l1 f41914a = null;
    public final View f41915b;
    public final n f41916c;

    public z(View view, n nVar) {
        this.f41915b = view;
        this.f41916c = nVar;
    }

    @Override
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        l1 h = l1.h(view, windowInsets);
        int i10 = Build.VERSION.SDK_INT;
        n nVar = this.f41916c;
        if (i10 < 30) {
            a0.a(windowInsets, this.f41915b);
            if (h.equals(this.f41914a)) {
                return nVar.Q0(view, h).g();
            }
        }
        this.f41914a = h;
        l1 Q0 = nVar.Q0(view, h);
        if (i10 >= 30) {
            return Q0.g();
        }
        WeakHashMap weakHashMap = i0.f41870a;
        y.c(view);
        return Q0.g();
    }
}
