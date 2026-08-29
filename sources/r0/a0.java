package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;
public final class a0 implements View.OnApplyWindowInsetsListener {
    public m1 f46788a = null;
    public final View f46789b;
    public final o f46790c;

    public a0(View view, o oVar) {
        this.f46789b = view;
        this.f46790c = oVar;
    }

    @Override
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        m1 h = m1.h(view, windowInsets);
        int i10 = Build.VERSION.SDK_INT;
        o oVar = this.f46790c;
        if (i10 < 30) {
            b0.a(windowInsets, this.f46789b);
            if (h.equals(this.f46788a)) {
                return oVar.I0(view, h).g();
            }
        }
        this.f46788a = h;
        m1 I0 = oVar.I0(view, h);
        if (i10 >= 30) {
            return I0.g();
        }
        WeakHashMap weakHashMap = j0.f46829a;
        z.c(view);
        return I0.g();
    }
}
