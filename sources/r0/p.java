package r0;

import android.view.View;
import android.view.ViewTreeObserver;
public final class p implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View f46998a;
    public ViewTreeObserver f46999b;
    public final Runnable f47000c;

    public p(View view, Runnable runnable) {
        this.f46998a = view;
        this.f46999b = view.getViewTreeObserver();
        this.f47000c = runnable;
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
        boolean isAlive = this.f46999b.isAlive();
        View view = this.f46998a;
        if (isAlive) {
            this.f46999b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f47000c.run();
        return true;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f46999b = view.getViewTreeObserver();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f46999b.isAlive();
        View view2 = this.f46998a;
        if (isAlive) {
            this.f46999b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
