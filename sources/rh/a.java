package rh;

import android.view.View;
public final class a implements View.OnAttachStateChangeListener {
    public final b f42863a;

    public a(b bVar) {
        this.f42863a = bVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f42863a.f42866c.e();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f42863a.f42866c.f();
    }
}
