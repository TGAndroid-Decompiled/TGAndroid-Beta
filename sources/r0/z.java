package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;
public final class z implements View.OnApplyWindowInsetsListener {
    public k1 f54065a = null;
    public final View f54066b;
    public final m f54067c;

    public z(View view, m mVar) {
        this.f54066b = view;
        this.f54067c = mVar;
    }

    @Override
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        k1 h = k1.h(view, windowInsets);
        int i3 = Build.VERSION.SDK_INT;
        m mVar = this.f54067c;
        if (i3 < 30) {
            a0.a(windowInsets, this.f54066b);
            if (h.equals(this.f54065a)) {
                return mVar.R0(view, h).g();
            }
        }
        this.f54065a = h;
        k1 R0 = mVar.R0(view, h);
        if (i3 >= 30) {
            return R0.g();
        }
        WeakHashMap weakHashMap = i0.f54015a;
        y.c(view);
        return R0.g();
    }
}
