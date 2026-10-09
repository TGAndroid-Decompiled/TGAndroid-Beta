package xh;

import android.view.View;
import org.telegram.ui.Components.q5;
public final class v0 implements View.OnAttachStateChangeListener {
    public final q5 f51545a;

    public v0(q5 q5Var) {
        this.f51545a = q5Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f51545a.a();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f51545a.b();
    }
}
