package xh;

import android.view.View;
import org.telegram.ui.Components.n5;
public final class u0 implements View.OnAttachStateChangeListener {
    public final n5 f46459a;

    public u0(n5 n5Var) {
        this.f46459a = n5Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f46459a.a();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f46459a.b();
    }
}
