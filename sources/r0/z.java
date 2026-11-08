package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;
public final class z implements View.OnApplyWindowInsetsListener {
    public k1 f54240a = null;
    public final View f54241b;
    public final m f54242c;

    public z(View view, m mVar) {
        this.f54241b = view;
        this.f54242c = mVar;
    }

    @Override
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        k1 h = k1.h(view, windowInsets);
        int i7 = Build.VERSION.SDK_INT;
        m mVar = this.f54242c;
        if (i7 < 30) {
            a0.a(windowInsets, this.f54241b);
            if (h.equals(this.f54240a)) {
                return mVar.S0(view, h).g();
            }
        }
        this.f54240a = h;
        k1 S0 = mVar.S0(view, h);
        if (i7 >= 30) {
            return S0.g();
        }
        WeakHashMap weakHashMap = i0.f54190a;
        y.c(view);
        return S0.g();
    }
}
