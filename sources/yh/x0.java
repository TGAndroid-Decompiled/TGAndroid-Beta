package yh;

import android.view.View;
public final class x0 implements View.OnAttachStateChangeListener {
    public final ai.z f50598a;

    public x0(ai.z zVar) {
        this.f50598a = zVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f50598a.run();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
    }
}
