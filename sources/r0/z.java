package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;
public final class z implements View.OnApplyWindowInsetsListener {
    public k1 f54241a = null;
    public final View f54242b;
    public final m f54243c;

    public z(View view, m mVar) {
        this.f54242b = view;
        this.f54243c = mVar;
    }

    @Override
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        k1 h = k1.h(view, windowInsets);
        int i7 = Build.VERSION.SDK_INT;
        m mVar = this.f54243c;
        if (i7 < 30) {
            a0.a(windowInsets, this.f54242b);
            if (h.equals(this.f54241a)) {
                return mVar.S0(view, h).g();
            }
        }
        this.f54241a = h;
        k1 S0 = mVar.S0(view, h);
        if (i7 >= 30) {
            return S0.g();
        }
        WeakHashMap weakHashMap = i0.f54191a;
        y.c(view);
        return S0.g();
    }
}
