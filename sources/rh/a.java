package rh;

import android.view.View;
public final class a implements View.OnAttachStateChangeListener {
    public final b f46403a;

    public a(b bVar) {
        this.f46403a = bVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f46403a.f46406c.e();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f46403a.f46406c.f();
    }
}
