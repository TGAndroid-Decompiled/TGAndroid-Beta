package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;
public final class y implements View.OnApplyWindowInsetsListener {
    public j1 f46173a = null;
    public final View f46174b;
    public final m f46175c;

    public y(View view, m mVar) {
        this.f46174b = view;
        this.f46175c = mVar;
    }

    @Override
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        j1 h = j1.h(view, windowInsets);
        int i10 = Build.VERSION.SDK_INT;
        m mVar = this.f46175c;
        if (i10 < 30) {
            z.a(windowInsets, this.f46174b);
            if (h.equals(this.f46173a)) {
                return mVar.R0(view, h).g();
            }
        }
        this.f46173a = h;
        j1 R0 = mVar.R0(view, h);
        if (i10 >= 30) {
            return R0.g();
        }
        WeakHashMap weakHashMap = h0.f46134a;
        x.c(view);
        return R0.g();
    }
}
