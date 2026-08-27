package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

public final class a0 implements View.OnApplyWindowInsetsListener {

    public m1 f46564a = null;

    public final View f46565b;

    public final o f46566c;

    public a0(View view, o oVar) {
        this.f46565b = view;
        this.f46566c = oVar;
    }

    @Override
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        m1 m1VarH = m1.h(view, windowInsets);
        int i10 = Build.VERSION.SDK_INT;
        o oVar = this.f46566c;
        if (i10 < 30) {
            b0.a(windowInsets, this.f46565b);
            if (m1VarH.equals(this.f46564a)) {
                return oVar.I0(view, m1VarH).g();
            }
        }
        this.f46564a = m1VarH;
        m1 m1VarI0 = oVar.I0(view, m1VarH);
        if (i10 >= 30) {
            return m1VarI0.g();
        }
        WeakHashMap weakHashMap = j0.f46605a;
        z.c(view);
        return m1VarI0.g();
    }
}
