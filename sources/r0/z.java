package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;
public final class z implements View.OnApplyWindowInsetsListener {
    public k1 f44903a = null;
    public final View f44904b;
    public final n f44905c;

    public z(View view, n nVar) {
        this.f44904b = view;
        this.f44905c = nVar;
    }

    @Override
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        k1 h = k1.h(view, windowInsets);
        int i10 = Build.VERSION.SDK_INT;
        n nVar = this.f44905c;
        if (i10 < 30) {
            a0.a(windowInsets, this.f44904b);
            if (h.equals(this.f44903a)) {
                return nVar.B0(view, h).g();
            }
        }
        this.f44903a = h;
        k1 B0 = nVar.B0(view, h);
        if (i10 >= 30) {
            return B0.g();
        }
        WeakHashMap weakHashMap = i0.f44864a;
        y.c(view);
        return B0.g();
    }
}
