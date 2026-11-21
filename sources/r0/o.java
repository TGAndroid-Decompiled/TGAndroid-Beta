package r0;

import android.view.View;
import android.view.ViewTreeObserver;
public final class o implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View f56300a;
    public ViewTreeObserver f56301b;
    public final Runnable f56302c;

    public o(View view, Runnable runnable) {
        this.f56300a = view;
        this.f56301b = view.getViewTreeObserver();
        this.f56302c = runnable;
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
        boolean isAlive = this.f56301b.isAlive();
        View view = this.f56300a;
        if (isAlive) {
            this.f56301b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f56302c.run();
        return true;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f56301b = view.getViewTreeObserver();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f56301b.isAlive();
        View view2 = this.f56300a;
        if (isAlive) {
            this.f56301b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
