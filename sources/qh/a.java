package qh;

import android.view.View;
public final class a implements View.OnAttachStateChangeListener {
    public final b f41001a;

    public a(b bVar) {
        this.f41001a = bVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f41001a.f41004c.e();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f41001a.f41004c.f();
    }
}
