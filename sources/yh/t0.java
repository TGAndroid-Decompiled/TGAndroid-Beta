package yh;

import android.view.View;
import org.telegram.ui.Components.p5;
public final class t0 implements View.OnAttachStateChangeListener {
    public final p5 f50526a;

    public t0(p5 p5Var) {
        this.f50526a = p5Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f50526a.a();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f50526a.b();
    }
}
