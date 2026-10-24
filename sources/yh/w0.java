package yh;

import android.view.View;
public final class w0 implements View.OnAttachStateChangeListener {
    public final ai.z f51029a;

    public w0(ai.z zVar) {
        this.f51029a = zVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f51029a.run();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
    }
}
