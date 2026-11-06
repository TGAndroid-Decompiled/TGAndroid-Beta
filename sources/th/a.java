package th;

import android.view.View;
public final class a implements View.OnAttachStateChangeListener {
    public final b f55941a;

    public a(b bVar) {
        this.f55941a = bVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f55941a.f55944c.e();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f55941a.f55944c.f();
    }
}
