package xh;

import android.view.View;
import org.telegram.ui.Components.o5;
public final class u0 implements View.OnAttachStateChangeListener {
    public final o5 f46417a;

    public u0(o5 o5Var) {
        this.f46417a = o5Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f46417a.a();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f46417a.b();
    }
}
