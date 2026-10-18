package yh;

import android.view.View;
import org.telegram.ui.Components.p5;
public final class t0 implements View.OnAttachStateChangeListener {
    public final p5 f50551a;

    public t0(p5 p5Var) {
        this.f50551a = p5Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f50551a.a();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f50551a.b();
    }
}
