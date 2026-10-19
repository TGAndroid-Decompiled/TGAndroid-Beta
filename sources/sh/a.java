package sh;

import android.view.View;
public final class a implements View.OnAttachStateChangeListener {
    public final b f46520a;

    public a(b bVar) {
        this.f46520a = bVar;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f46520a.f46523c.e();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f46520a.f46523c.f();
    }
}
