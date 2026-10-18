package yh;

import android.view.View;
import org.telegram.ui.Components.p5;
public final class s0 implements View.OnAttachStateChangeListener {
    public final p5 f50491a;

    public s0(p5 p5Var) {
        this.f50491a = p5Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f50491a.a();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f50491a.b();
    }
}
