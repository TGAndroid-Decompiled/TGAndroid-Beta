package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;
public final class z implements View.OnApplyWindowInsetsListener {
    public l1 f56337a = null;
    public final View f56338b;
    public final m f56339c;

    public z(View view, m mVar) {
        this.f56338b = view;
        this.f56339c = mVar;
    }

    @Override
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        l1 h = l1.h(view, windowInsets);
        int i7 = Build.VERSION.SDK_INT;
        m mVar = this.f56339c;
        if (i7 < 30) {
            a0.a(windowInsets, this.f56338b);
            if (h.equals(this.f56337a)) {
                return mVar.P0(view, h).g();
            }
        }
        this.f56337a = h;
        l1 P0 = mVar.P0(view, h);
        if (i7 >= 30) {
            return P0.g();
        }
        WeakHashMap weakHashMap = i0.f56285a;
        y.c(view);
        return P0.g();
    }
}
