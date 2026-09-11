package yh;

import android.view.View;
import org.telegram.ui.Components.o5;
public final class t0 implements View.OnAttachStateChangeListener {
    public final o5 f50549a;

    public t0(o5 o5Var) {
        this.f50549a = o5Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f50549a.a();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f50549a.b();
    }
}
