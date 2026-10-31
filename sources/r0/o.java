package r0;

import android.view.View;
import android.view.ViewTreeObserver;
public final class o implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View f46137a;
    public ViewTreeObserver f46138b;
    public final Runnable f46139c;

    public o(View view, Runnable runnable) {
        this.f46137a = view;
        this.f46138b = view.getViewTreeObserver();
        this.f46139c = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view != null) {
            o oVar = new o(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(oVar);
            view.addOnAttachStateChangeListener(oVar);
            return;
        }
        throw new NullPointerException("view == null");
    }

    @Override
    public final boolean onPreDraw() {
        boolean isAlive = this.f46138b.isAlive();
        View view = this.f46137a;
        if (isAlive) {
            this.f46138b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f46139c.run();
        return true;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f46138b = view.getViewTreeObserver();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f46138b.isAlive();
        View view2 = this.f46137a;
        if (isAlive) {
            this.f46138b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
