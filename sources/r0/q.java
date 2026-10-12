package r0;

import android.view.View;
import android.view.ViewTreeObserver;
public final class q implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View f43746a;
    public ViewTreeObserver f43747b;
    public final Runnable f43748c;

    public q(View view, Runnable runnable) {
        this.f43746a = view;
        this.f43747b = view.getViewTreeObserver();
        this.f43748c = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view != null) {
            q qVar = new q(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(qVar);
            view.addOnAttachStateChangeListener(qVar);
            return;
        }
        throw new NullPointerException("view == null");
    }

    @Override
    public final boolean onPreDraw() {
        boolean isAlive = this.f43747b.isAlive();
        View view = this.f43746a;
        if (isAlive) {
            this.f43747b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f43748c.run();
        return true;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f43747b = view.getViewTreeObserver();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f43747b.isAlive();
        View view2 = this.f43746a;
        if (isAlive) {
            this.f43747b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
