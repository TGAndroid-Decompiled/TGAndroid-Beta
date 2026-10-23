package yh;

import android.view.View;
public final class w0 implements View.OnAttachStateChangeListener {
    public final ai.z f51030a;

    public w0(ai.z zVar) {
        this.f51030a = zVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f51030a.run();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
    }
}
