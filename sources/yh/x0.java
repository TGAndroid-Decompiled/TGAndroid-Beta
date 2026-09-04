package yh;

import android.view.View;
public final class x0 implements View.OnAttachStateChangeListener {
    public final org.telegram.messenger.voip.f f50622a;

    public x0(org.telegram.messenger.voip.f fVar) {
        this.f50622a = fVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f50622a.run();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
    }
}
