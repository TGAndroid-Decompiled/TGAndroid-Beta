package rh;

import android.view.View;
public final class a implements View.OnAttachStateChangeListener {
    public final b f42831a;

    public a(b bVar) {
        this.f42831a = bVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f42831a.f42834c.e();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f42831a.f42834c.f();
    }
}
