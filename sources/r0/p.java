package r0;

import android.view.View;
import android.view.ViewTreeObserver;
public final class p implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View f46827a;
    public ViewTreeObserver f46828b;
    public final Runnable f46829c;

    public p(View view, Runnable runnable) {
        this.f46827a = view;
        this.f46828b = view.getViewTreeObserver();
        this.f46829c = runnable;
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
        boolean isAlive = this.f46828b.isAlive();
        View view = this.f46827a;
        if (isAlive) {
            this.f46828b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f46829c.run();
        return true;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f46828b = view.getViewTreeObserver();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f46828b.isAlive();
        View view2 = this.f46827a;
        if (isAlive) {
            this.f46828b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
