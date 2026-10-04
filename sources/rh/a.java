package rh;

import android.view.View;
public final class a implements View.OnAttachStateChangeListener {
    public final b f46411a;

    public a(b bVar) {
        this.f46411a = bVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f46411a.f46414c.e();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f46411a.f46414c.f();
    }
}
