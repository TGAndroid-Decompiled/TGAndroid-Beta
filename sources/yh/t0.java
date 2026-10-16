package yh;

import android.view.View;
import org.telegram.ui.Components.q5;
public final class t0 implements View.OnAttachStateChangeListener {
    public final q5 f49121a;

    public t0(q5 q5Var) {
        this.f49121a = q5Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f49121a.a();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f49121a.b();
    }
}
