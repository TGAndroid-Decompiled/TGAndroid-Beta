package th;

import android.view.View;
public final class a implements View.OnAttachStateChangeListener {
    public final b f56034a;

    public a(b bVar) {
        this.f56034a = bVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f56034a.f56037c.e();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f56034a.f56037c.f();
    }
}
