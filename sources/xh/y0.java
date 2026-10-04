package xh;

import android.view.View;
public final class y0 implements View.OnAttachStateChangeListener {
    public final org.telegram.messenger.voip.f f50318a;

    public y0(org.telegram.messenger.voip.f fVar) {
        this.f50318a = fVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f50318a.run();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
    }
}
