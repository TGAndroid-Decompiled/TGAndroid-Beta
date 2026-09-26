package rh;

import android.view.View;
public final class a implements View.OnAttachStateChangeListener {
    public final b f42861a;

    public a(b bVar) {
        this.f42861a = bVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f42861a.f42864c.e();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f42861a.f42864c.f();
    }
}
