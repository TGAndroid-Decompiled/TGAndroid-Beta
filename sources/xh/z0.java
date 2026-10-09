package xh;

import android.view.View;
public final class z0 implements View.OnAttachStateChangeListener {
    public final org.telegram.messenger.voip.f f51616a;

    public z0(org.telegram.messenger.voip.f fVar) {
        this.f51616a = fVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f51616a.run();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
    }
}
