package r0;

import android.view.View;
import android.view.ViewTreeObserver;
public final class q implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View f43158a;
    public ViewTreeObserver f43159b;
    public final Runnable f43160c;

    public q(View view, Runnable runnable) {
        this.f43158a = view;
        this.f43159b = view.getViewTreeObserver();
        this.f43160c = runnable;
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
        boolean isAlive = this.f43159b.isAlive();
        View view = this.f43158a;
        if (isAlive) {
            this.f43159b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f43160c.run();
        return true;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f43159b = view.getViewTreeObserver();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f43159b.isAlive();
        View view2 = this.f43158a;
        if (isAlive) {
            this.f43159b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
