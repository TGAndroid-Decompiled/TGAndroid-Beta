package r0;

import android.view.View;
import android.view.ViewTreeObserver;
public final class p implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View f44840a;
    public ViewTreeObserver f44841b;
    public final Runnable f44842c;

    public p(View view, Runnable runnable) {
        this.f44840a = view;
        this.f44841b = view.getViewTreeObserver();
        this.f44842c = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view != null) {
            p pVar = new p(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(pVar);
            view.addOnAttachStateChangeListener(pVar);
            return;
        }
        throw new NullPointerException("view == null");
    }

    @Override
    public final boolean onPreDraw() {
        boolean isAlive = this.f44841b.isAlive();
        View view = this.f44840a;
        if (isAlive) {
            this.f44841b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f44842c.run();
        return true;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f44841b = view.getViewTreeObserver();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f44841b.isAlive();
        View view2 = this.f44840a;
        if (isAlive) {
            this.f44841b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
