package sh;

import android.view.View;
public final class a implements View.OnAttachStateChangeListener {
    public final b f46529a;

    public a(b bVar) {
        this.f46529a = bVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f46529a.f46532c.e();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f46529a.f46532c.f();
    }
}
