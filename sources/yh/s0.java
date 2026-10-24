package yh;

import android.view.View;
import org.telegram.ui.Components.n5;
public final class s0 implements View.OnAttachStateChangeListener {
    public final n5 f50958a;

    public s0(n5 n5Var) {
        this.f50958a = n5Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f50958a.a();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f50958a.b();
    }
}
