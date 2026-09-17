package r0;

import android.view.View;
import android.view.ViewTreeObserver;
public final class p implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View f44745a;
    public ViewTreeObserver f44746b;
    public final Runnable f44747c;

    public p(View view, Runnable runnable) {
        this.f44745a = view;
        this.f44746b = view.getViewTreeObserver();
        this.f44747c = runnable;
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
        boolean isAlive = this.f44746b.isAlive();
        View view = this.f44745a;
        if (isAlive) {
            this.f44746b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f44747c.run();
        return true;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f44746b = view.getViewTreeObserver();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f44746b.isAlive();
        View view2 = this.f44745a;
        if (isAlive) {
            this.f44746b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
