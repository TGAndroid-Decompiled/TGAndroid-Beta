package zh;

import android.view.View;
public final class w0 implements View.OnAttachStateChangeListener {
    public final bi.a0 f53368a;

    public w0(bi.a0 a0Var) {
        this.f53368a = a0Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f53368a.run();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
    }
}
