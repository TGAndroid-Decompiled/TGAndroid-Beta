package uh;

import android.view.View;
public final class a implements View.OnAttachStateChangeListener {
    public final b f56338a;

    public a(b bVar) {
        this.f56338a = bVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f56338a.f56341c.e();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f56338a.f56341c.f();
    }
}
