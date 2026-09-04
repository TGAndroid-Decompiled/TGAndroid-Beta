package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;
public final class z implements View.OnApplyWindowInsetsListener {
    public l1 f44749a = null;
    public final View f44750b;
    public final n f44751c;

    public z(View view, n nVar) {
        this.f44750b = view;
        this.f44751c = nVar;
    }

    @Override
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        l1 h = l1.h(view, windowInsets);
        int i10 = Build.VERSION.SDK_INT;
        n nVar = this.f44751c;
        if (i10 < 30) {
            a0.a(windowInsets, this.f44750b);
            if (h.equals(this.f44749a)) {
                return nVar.T0(view, h).g();
            }
        }
        this.f44749a = h;
        l1 T0 = nVar.T0(view, h);
        if (i10 >= 30) {
            return T0.g();
        }
        WeakHashMap weakHashMap = i0.f44697a;
        y.c(view);
        return T0.g();
    }
}
