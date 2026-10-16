package r0;

import android.view.View;
import android.view.ViewTreeObserver;
public final class p implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View f43501a;
    public ViewTreeObserver f43502b;
    public final Runnable f43503c;

    public p(View view, Runnable runnable) {
        this.f43501a = view;
        this.f43502b = view.getViewTreeObserver();
        this.f43503c = runnable;
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
        boolean isAlive = this.f43502b.isAlive();
        View view = this.f43501a;
        if (isAlive) {
            this.f43502b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f43503c.run();
        return true;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f43502b = view.getViewTreeObserver();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f43502b.isAlive();
        View view2 = this.f43501a;
        if (isAlive) {
            this.f43502b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
