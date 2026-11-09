package th;

import android.view.View;
public final class a implements View.OnAttachStateChangeListener {
    public final b f56046a;

    public a(b bVar) {
        this.f56046a = bVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f56046a.f56049c.e();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f56046a.f56049c.f();
    }
}
