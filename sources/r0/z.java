package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;
public final class z implements View.OnApplyWindowInsetsListener {
    public l1 f56419a = null;
    public final View f56420b;
    public final m f56421c;

    public z(View view, m mVar) {
        this.f56420b = view;
        this.f56421c = mVar;
    }

    @Override
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        l1 h = l1.h(view, windowInsets);
        int i7 = Build.VERSION.SDK_INT;
        m mVar = this.f56421c;
        if (i7 < 30) {
            a0.a(windowInsets, this.f56420b);
            if (h.equals(this.f56419a)) {
                return mVar.l1(view, h).g();
            }
        }
        this.f56419a = h;
        l1 l1 = mVar.l1(view, h);
        if (i7 >= 30) {
            return l1.g();
        }
        WeakHashMap weakHashMap = i0.f56367a;
        y.c(view);
        return l1.g();
    }
}
