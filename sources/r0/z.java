package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;
public final class z implements View.OnApplyWindowInsetsListener {
    public l1 f45655a = null;
    public final View f45656b;
    public final n f45657c;

    public z(View view, n nVar) {
        this.f45656b = view;
        this.f45657c = nVar;
    }

    @Override
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        l1 h = l1.h(view, windowInsets);
        int i10 = Build.VERSION.SDK_INT;
        n nVar = this.f45657c;
        if (i10 < 30) {
            a0.a(windowInsets, this.f45656b);
            if (h.equals(this.f45655a)) {
                return nVar.Q0(view, h).g();
            }
        }
        this.f45655a = h;
        l1 Q0 = nVar.Q0(view, h);
        if (i10 >= 30) {
            return Q0.g();
        }
        WeakHashMap weakHashMap = i0.f45603a;
        y.c(view);
        return Q0.g();
    }
}
