package yh;

import android.view.View;
import org.telegram.ui.Components.p5;
public final class s0 implements View.OnAttachStateChangeListener {
    public final p5 f50492a;

    public s0(p5 p5Var) {
        this.f50492a = p5Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f50492a.a();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f50492a.b();
    }
}
