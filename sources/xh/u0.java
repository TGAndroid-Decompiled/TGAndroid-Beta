package xh;

import android.view.View;
import org.telegram.ui.Components.q5;
public final class u0 implements View.OnAttachStateChangeListener {
    public final q5 f51765a;

    public u0(q5 q5Var) {
        this.f51765a = q5Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f51765a.a();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f51765a.b();
    }
}
