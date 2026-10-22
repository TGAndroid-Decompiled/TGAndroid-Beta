package yh;

import android.view.View;
public final class w0 implements View.OnAttachStateChangeListener {
    public final ai.z f50572a;

    public w0(ai.z zVar) {
        this.f50572a = zVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f50572a.run();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
    }
}
