package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;
public final class z implements View.OnApplyWindowInsetsListener {
    public k1 f55721a = null;
    public final View f55722b;
    public final m f55723c;

    public z(View view, m mVar) {
        this.f55722b = view;
        this.f55723c = mVar;
    }

    @Override
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        k1 h = k1.h(view, windowInsets);
        int i7 = Build.VERSION.SDK_INT;
        m mVar = this.f55723c;
        if (i7 < 30) {
            a0.a(windowInsets, this.f55722b);
            if (h.equals(this.f55721a)) {
                return mVar.M0(view, h).g();
            }
        }
        this.f55721a = h;
        k1 M0 = mVar.M0(view, h);
        if (i7 >= 30) {
            return M0.g();
        }
        WeakHashMap weakHashMap = i0.f55671a;
        y.c(view);
        return M0.g();
    }
}
