package r0;

import android.view.View;
import android.view.ViewTreeObserver;
public final class p implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View f44717a;
    public ViewTreeObserver f44718b;
    public final Runnable f44719c;

    public p(View view, Runnable runnable) {
        this.f44717a = view;
        this.f44718b = view.getViewTreeObserver();
        this.f44719c = runnable;
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
        boolean isAlive = this.f44718b.isAlive();
        View view = this.f44717a;
        if (isAlive) {
            this.f44718b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f44719c.run();
        return true;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f44718b = view.getViewTreeObserver();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f44718b.isAlive();
        View view2 = this.f44717a;
        if (isAlive) {
            this.f44718b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
