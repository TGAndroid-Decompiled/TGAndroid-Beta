package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;
public final class z implements View.OnApplyWindowInsetsListener {
    public l1 f56296a = null;
    public final View f56297b;
    public final m f56298c;

    public z(View view, m mVar) {
        this.f56297b = view;
        this.f56298c = mVar;
    }

    @Override
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        l1 h = l1.h(view, windowInsets);
        int i7 = Build.VERSION.SDK_INT;
        m mVar = this.f56298c;
        if (i7 < 30) {
            a0.a(windowInsets, this.f56297b);
            if (h.equals(this.f56296a)) {
                return mVar.P0(view, h).g();
            }
        }
        this.f56296a = h;
        l1 P0 = mVar.P0(view, h);
        if (i7 >= 30) {
            return P0.g();
        }
        WeakHashMap weakHashMap = i0.f56244a;
        y.c(view);
        return P0.g();
    }
}
