package th;

import android.view.View;
public final class a implements View.OnAttachStateChangeListener {
    public final b f49140a;

    public a(b bVar) {
        this.f49140a = bVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f49140a.f49143c.e();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f49140a.f49143c.f();
    }
}
