package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;
public final class z implements View.OnApplyWindowInsetsListener {
    public l1 f42277a = null;
    public final View f42278b;
    public final n f42279c;

    public z(View view, n nVar) {
        this.f42278b = view;
        this.f42279c = nVar;
    }

    @Override
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        l1 h = l1.h(view, windowInsets);
        int i10 = Build.VERSION.SDK_INT;
        n nVar = this.f42279c;
        if (i10 < 30) {
            a0.a(windowInsets, this.f42278b);
            if (h.equals(this.f42277a)) {
                return nVar.Q0(view, h).g();
            }
        }
        this.f42277a = h;
        l1 Q0 = nVar.Q0(view, h);
        if (i10 >= 30) {
            return Q0.g();
        }
        WeakHashMap weakHashMap = i0.f42233a;
        y.c(view);
        return Q0.g();
    }
}
