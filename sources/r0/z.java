package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;
public final class z implements View.OnApplyWindowInsetsListener {
    public l1 f44778a = null;
    public final View f44779b;
    public final n f44780c;

    public z(View view, n nVar) {
        this.f44779b = view;
        this.f44780c = nVar;
    }

    @Override
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        l1 h = l1.h(view, windowInsets);
        int i10 = Build.VERSION.SDK_INT;
        n nVar = this.f44780c;
        if (i10 < 30) {
            a0.a(windowInsets, this.f44779b);
            if (h.equals(this.f44778a)) {
                return nVar.T0(view, h).g();
            }
        }
        this.f44778a = h;
        l1 T0 = nVar.T0(view, h);
        if (i10 >= 30) {
            return T0.g();
        }
        WeakHashMap weakHashMap = i0.f44726a;
        y.c(view);
        return T0.g();
    }
}
