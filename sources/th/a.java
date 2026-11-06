package th;

import android.view.View;
public final class a implements View.OnAttachStateChangeListener {
    public final b f55942a;

    public a(b bVar) {
        this.f55942a = bVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f55942a.f55945c.e();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f55942a.f55945c.f();
    }
}
