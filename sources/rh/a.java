package rh;

import android.view.View;
public final class a implements View.OnAttachStateChangeListener {
    public final b f42847a;

    public a(b bVar) {
        this.f42847a = bVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f42847a.f42850c.e();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f42847a.f42850c.f();
    }
}
