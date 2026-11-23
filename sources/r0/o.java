package r0;

import android.view.View;
import android.view.ViewTreeObserver;
public final class o implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View f56382a;
    public ViewTreeObserver f56383b;
    public final Runnable f56384c;

    public o(View view, Runnable runnable) {
        this.f56382a = view;
        this.f56383b = view.getViewTreeObserver();
        this.f56384c = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view != null) {
            o oVar = new o(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(oVar);
            view.addOnAttachStateChangeListener(oVar);
            return;
        }
        throw new NullPointerException("view == null");
    }

    @Override
    public final boolean onPreDraw() {
        boolean isAlive = this.f56383b.isAlive();
        View view = this.f56382a;
        if (isAlive) {
            this.f56383b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f56384c.run();
        return true;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f56383b = view.getViewTreeObserver();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f56383b.isAlive();
        View view2 = this.f56382a;
        if (isAlive) {
            this.f56383b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
