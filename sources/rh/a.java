package rh;

import android.view.View;
public final class a implements View.OnAttachStateChangeListener {
    public final b f42875a;

    public a(b bVar) {
        this.f42875a = bVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f42875a.f42878c.e();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f42875a.f42878c.f();
    }
}
