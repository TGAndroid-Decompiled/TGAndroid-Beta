package r0;

import android.view.View;
import android.view.ViewTreeObserver;
public final class p implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View f42179a;
    public ViewTreeObserver f42180b;
    public final Runnable f42181c;

    public p(View view, Runnable runnable) {
        this.f42179a = view;
        this.f42180b = view.getViewTreeObserver();
        this.f42181c = runnable;
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
        boolean isAlive = this.f42180b.isAlive();
        View view = this.f42179a;
        if (isAlive) {
            this.f42180b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f42181c.run();
        return true;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f42180b = view.getViewTreeObserver();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f42180b.isAlive();
        View view2 = this.f42179a;
        if (isAlive) {
            this.f42180b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
