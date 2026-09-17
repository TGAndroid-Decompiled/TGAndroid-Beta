package rh;

import android.view.View;
public final class a implements View.OnAttachStateChangeListener {
    public final b f42599a;

    public a(b bVar) {
        this.f42599a = bVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f42599a.f42602c.e();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f42599a.f42602c.f();
    }
}
