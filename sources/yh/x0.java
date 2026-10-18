package yh;

import android.view.View;
public final class x0 implements View.OnAttachStateChangeListener {
    public final ai.z f50623a;

    public x0(ai.z zVar) {
        this.f50623a = zVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f50623a.run();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
    }
}
