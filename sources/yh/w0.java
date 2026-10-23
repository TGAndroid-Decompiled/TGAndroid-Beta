package yh;

import android.view.View;
public final class w0 implements View.OnAttachStateChangeListener {
    public final ai.z f50573a;

    public w0(ai.z zVar) {
        this.f50573a = zVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f50573a.run();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
    }
}
