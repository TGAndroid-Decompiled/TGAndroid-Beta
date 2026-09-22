package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;
public final class z implements View.OnApplyWindowInsetsListener {
    public l1 f41883a = null;
    public final View f41884b;
    public final n f41885c;

    public z(View view, n nVar) {
        this.f41884b = view;
        this.f41885c = nVar;
    }

    @Override
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        l1 h = l1.h(view, windowInsets);
        int i10 = Build.VERSION.SDK_INT;
        n nVar = this.f41885c;
        if (i10 < 30) {
            a0.a(windowInsets, this.f41884b);
            if (h.equals(this.f41883a)) {
                return nVar.Q0(view, h).g();
            }
        }
        this.f41883a = h;
        l1 Q0 = nVar.Q0(view, h);
        if (i10 >= 30) {
            return Q0.g();
        }
        WeakHashMap weakHashMap = i0.f41839a;
        y.c(view);
        return Q0.g();
    }
}
