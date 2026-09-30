package r0;

import android.view.View;
import android.view.ViewTreeObserver;
public final class p implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View f42249a;
    public ViewTreeObserver f42250b;
    public final Runnable f42251c;

    public p(View view, Runnable runnable) {
        this.f42249a = view;
        this.f42250b = view.getViewTreeObserver();
        this.f42251c = runnable;
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
        boolean isAlive = this.f42250b.isAlive();
        View view = this.f42249a;
        if (isAlive) {
            this.f42250b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f42251c.run();
        return true;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f42250b = view.getViewTreeObserver();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f42250b.isAlive();
        View view2 = this.f42249a;
        if (isAlive) {
            this.f42250b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
