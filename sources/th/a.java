package th;

import android.view.View;
public final class a implements View.OnAttachStateChangeListener {
    public final b f55917a;

    public a(b bVar) {
        this.f55917a = bVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f55917a.f55920c.e();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f55917a.f55920c.f();
    }
}
