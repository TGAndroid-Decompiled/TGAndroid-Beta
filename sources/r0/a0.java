package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;
public final class a0 implements View.OnApplyWindowInsetsListener {
    public l1 f43693a = null;
    public final View f43694b;
    public final o f43695c;

    public a0(View view, o oVar) {
        this.f43694b = view;
        this.f43695c = oVar;
    }

    @Override
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        l1 h = l1.h(view, windowInsets);
        int i10 = Build.VERSION.SDK_INT;
        o oVar = this.f43695c;
        if (i10 < 30) {
            b0.a(windowInsets, this.f43694b);
            if (h.equals(this.f43693a)) {
                return oVar.Q0(view, h).g();
            }
        }
        this.f43693a = h;
        l1 Q0 = oVar.Q0(view, h);
        if (i10 >= 30) {
            return Q0.g();
        }
        WeakHashMap weakHashMap = j0.f43732a;
        z.c(view);
        return Q0.g();
    }
}
