package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;
public final class a0 implements View.OnApplyWindowInsetsListener {
    public m1 f46874a = null;
    public final View f46875b;
    public final o f46876c;

    public a0(View view, o oVar) {
        this.f46875b = view;
        this.f46876c = oVar;
    }

    @Override
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        m1 h = m1.h(view, windowInsets);
        int i9 = Build.VERSION.SDK_INT;
        o oVar = this.f46876c;
        if (i9 < 30) {
            b0.a(windowInsets, this.f46875b);
            if (h.equals(this.f46874a)) {
                return oVar.L0(view, h).g();
            }
        }
        this.f46874a = h;
        m1 L0 = oVar.L0(view, h);
        if (i9 >= 30) {
            return L0.g();
        }
        WeakHashMap weakHashMap = j0.f46915a;
        z.c(view);
        return L0.g();
    }
}
