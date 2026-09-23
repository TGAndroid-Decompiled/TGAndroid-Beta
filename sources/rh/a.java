package rh;

import android.view.View;
public final class a implements View.OnAttachStateChangeListener {
    public final b f42528a;

    public a(b bVar) {
        this.f42528a = bVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f42528a.f42531c.e();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f42528a.f42531c.f();
    }
}
