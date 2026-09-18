package r0;

import android.view.View;
import android.view.ViewTreeObserver;
public final class p implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View f41886a;
    public ViewTreeObserver f41887b;
    public final Runnable f41888c;

    public p(View view, Runnable runnable) {
        this.f41886a = view;
        this.f41887b = view.getViewTreeObserver();
        this.f41888c = runnable;
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
        boolean isAlive = this.f41887b.isAlive();
        View view = this.f41886a;
        if (isAlive) {
            this.f41887b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f41888c.run();
        return true;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f41887b = view.getViewTreeObserver();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f41887b.isAlive();
        View view2 = this.f41886a;
        if (isAlive) {
            this.f41887b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
