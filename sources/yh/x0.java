package yh;

import android.view.View;
public final class x0 implements View.OnAttachStateChangeListener {
    public final org.telegram.messenger.voip.f f50652a;

    public x0(org.telegram.messenger.voip.f fVar) {
        this.f50652a = fVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f50652a.run();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
    }
}
