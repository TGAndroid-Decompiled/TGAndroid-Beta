package r0;

import android.view.View;
import android.view.ViewTreeObserver;
public final class p implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View f45615a;
    public ViewTreeObserver f45616b;
    public final Runnable f45617c;

    public p(View view, Runnable runnable) {
        this.f45615a = view;
        this.f45616b = view.getViewTreeObserver();
        this.f45617c = runnable;
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
        boolean isAlive = this.f45616b.isAlive();
        View view = this.f45615a;
        if (isAlive) {
            this.f45616b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f45617c.run();
        return true;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f45616b = view.getViewTreeObserver();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f45616b.isAlive();
        View view2 = this.f45615a;
        if (isAlive) {
            this.f45616b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
