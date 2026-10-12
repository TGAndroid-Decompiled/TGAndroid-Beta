package sh;

import android.view.View;
public final class a implements View.OnAttachStateChangeListener {
    public final b f45448a;

    public a(b bVar) {
        this.f45448a = bVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f45448a.f45451c.e();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f45448a.f45451c.f();
    }
}
