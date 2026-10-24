package sh;

import android.view.View;
public final class a implements View.OnAttachStateChangeListener {
    public final b f46959a;

    public a(b bVar) {
        this.f46959a = bVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f46959a.f46962c.e();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f46959a.f46962c.f();
    }
}
