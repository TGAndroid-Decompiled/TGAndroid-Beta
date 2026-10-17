package r0;

import android.view.View;
import android.view.ViewTreeObserver;
public final class p implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View f44858a;
    public ViewTreeObserver f44859b;
    public final Runnable f44860c;

    public p(View view, Runnable runnable) {
        this.f44858a = view;
        this.f44859b = view.getViewTreeObserver();
        this.f44860c = runnable;
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
        boolean isAlive = this.f44859b.isAlive();
        View view = this.f44858a;
        if (isAlive) {
            this.f44859b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f44860c.run();
        return true;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f44859b = view.getViewTreeObserver();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f44859b.isAlive();
        View view2 = this.f44858a;
        if (isAlive) {
            this.f44859b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
