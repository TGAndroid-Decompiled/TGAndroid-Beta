package rh;

import android.view.View;
public final class a implements View.OnAttachStateChangeListener {
    public final b f42969a;

    public a(b bVar) {
        this.f42969a = bVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f42969a.f42972c.e();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f42969a.f42972c.f();
    }
}
