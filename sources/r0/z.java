package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;
public final class z implements View.OnApplyWindowInsetsListener {
    public l1 f43527a = null;
    public final View f43528b;
    public final n f43529c;

    public z(View view, n nVar) {
        this.f43528b = view;
        this.f43529c = nVar;
    }

    @Override
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        l1 h = l1.h(view, windowInsets);
        int i10 = Build.VERSION.SDK_INT;
        n nVar = this.f43529c;
        if (i10 < 30) {
            a0.a(windowInsets, this.f43528b);
            if (h.equals(this.f43527a)) {
                return nVar.Q0(view, h).g();
            }
        }
        this.f43527a = h;
        l1 Q0 = nVar.Q0(view, h);
        if (i10 >= 30) {
            return Q0.g();
        }
        WeakHashMap weakHashMap = i0.f43485a;
        y.c(view);
        return Q0.g();
    }
}
