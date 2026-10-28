package r0;

import android.view.View;
import android.view.ViewTreeObserver;
public final class p implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View f47158a;
    public ViewTreeObserver f47159b;
    public final Runnable f47160c;

    public p(View view, Runnable runnable) {
        this.f47158a = view;
        this.f47159b = view.getViewTreeObserver();
        this.f47160c = runnable;
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
        boolean isAlive = this.f47159b.isAlive();
        View view = this.f47158a;
        if (isAlive) {
            this.f47159b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f47160c.run();
        return true;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f47159b = view.getViewTreeObserver();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f47159b.isAlive();
        View view2 = this.f47158a;
        if (isAlive) {
            this.f47159b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
