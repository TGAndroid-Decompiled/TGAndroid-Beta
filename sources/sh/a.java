package sh;

import android.view.View;
public final class a implements View.OnAttachStateChangeListener {
    public final b f46960a;

    public a(b bVar) {
        this.f46960a = bVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f46960a.f46963c.e();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f46960a.f46963c.f();
    }
}
