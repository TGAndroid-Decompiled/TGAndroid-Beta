package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;
public final class a0 implements View.OnApplyWindowInsetsListener {
    public m1 f43080a = null;
    public final View f43081b;
    public final o f43082c;

    public a0(View view, o oVar) {
        this.f43081b = view;
        this.f43082c = oVar;
    }

    @Override
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        m1 h = m1.h(view, windowInsets);
        int i10 = Build.VERSION.SDK_INT;
        o oVar = this.f43082c;
        if (i10 < 30) {
            b0.a(windowInsets, this.f43081b);
            if (h.equals(this.f43080a)) {
                return oVar.N0(view, h).g();
            }
        }
        this.f43080a = h;
        m1 N0 = oVar.N0(view, h);
        if (i10 >= 30) {
            return N0.g();
        }
        WeakHashMap weakHashMap = j0.f43118a;
        z.c(view);
        return N0.g();
    }
}
