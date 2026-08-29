package r0;

import android.view.View;
import android.view.ViewTreeObserver;
public final class q implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View f46848a;
    public ViewTreeObserver f46849b;
    public final Runnable f46850c;

    public q(View view, Runnable runnable) {
        this.f46848a = view;
        this.f46849b = view.getViewTreeObserver();
        this.f46850c = runnable;
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
        boolean isAlive = this.f46849b.isAlive();
        View view = this.f46848a;
        if (isAlive) {
            this.f46849b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f46850c.run();
        return true;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f46849b = view.getViewTreeObserver();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f46849b.isAlive();
        View view2 = this.f46848a;
        if (isAlive) {
            this.f46849b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
