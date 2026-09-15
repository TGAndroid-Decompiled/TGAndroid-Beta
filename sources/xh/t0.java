package xh;

import android.view.View;
import org.telegram.ui.Components.m5;
public final class t0 implements View.OnAttachStateChangeListener {
    public final m5 f46124a;

    public t0(m5 m5Var) {
        this.f46124a = m5Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f46124a.a();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f46124a.b();
    }
}
