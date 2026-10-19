package yh;

import android.view.View;
public final class w0 implements View.OnAttachStateChangeListener {
    public final ai.z f50562a;

    public w0(ai.z zVar) {
        this.f50562a = zVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f50562a.run();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
    }
}
