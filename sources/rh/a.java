package rh;

import android.view.View;
public final class a implements View.OnAttachStateChangeListener {
    public final b f42573a;

    public a(b bVar) {
        this.f42573a = bVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f42573a.f42576c.e();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f42573a.f42576c.f();
    }
}
