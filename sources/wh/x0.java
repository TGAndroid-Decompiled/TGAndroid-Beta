package wh;

import android.view.View;
public final class x0 implements View.OnAttachStateChangeListener {
    public final org.telegram.messenger.voip.g f44425a;

    public x0(org.telegram.messenger.voip.g gVar) {
        this.f44425a = gVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f44425a.run();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
    }
}
