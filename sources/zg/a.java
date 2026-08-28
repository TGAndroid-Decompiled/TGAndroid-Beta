package zg;

import android.view.View;
public final class a implements View.OnAttachStateChangeListener {
    public final b f50814a;

    public a(b bVar) {
        this.f50814a = bVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f50814a.f50817c.e();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f50814a.f50817c.f();
    }
}
