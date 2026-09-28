package rh;

import android.view.View;
public final class a implements View.OnAttachStateChangeListener {
    public final b f42862a;

    public a(b bVar) {
        this.f42862a = bVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f42862a.f42865c.e();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f42862a.f42865c.f();
    }
}
