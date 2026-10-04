package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;
public final class z implements View.OnApplyWindowInsetsListener {
    public l1 f45648a = null;
    public final View f45649b;
    public final n f45650c;

    public z(View view, n nVar) {
        this.f45649b = view;
        this.f45650c = nVar;
    }

    @Override
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        l1 h = l1.h(view, windowInsets);
        int i10 = Build.VERSION.SDK_INT;
        n nVar = this.f45650c;
        if (i10 < 30) {
            a0.a(windowInsets, this.f45649b);
            if (h.equals(this.f45648a)) {
                return nVar.Q0(view, h).g();
            }
        }
        this.f45648a = h;
        l1 Q0 = nVar.Q0(view, h);
        if (i10 >= 30) {
            return Q0.g();
        }
        WeakHashMap weakHashMap = i0.f45596a;
        y.c(view);
        return Q0.g();
    }
}
