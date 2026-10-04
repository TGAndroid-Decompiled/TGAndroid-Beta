package r0;

import android.view.View;
import android.view.ViewTreeObserver;
public final class p implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View f45614a;
    public ViewTreeObserver f45615b;
    public final Runnable f45616c;

    public p(View view, Runnable runnable) {
        this.f45614a = view;
        this.f45615b = view.getViewTreeObserver();
        this.f45616c = runnable;
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
        boolean isAlive = this.f45615b.isAlive();
        View view = this.f45614a;
        if (isAlive) {
            this.f45615b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f45616c.run();
        return true;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f45615b = view.getViewTreeObserver();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f45615b.isAlive();
        View view2 = this.f45614a;
        if (isAlive) {
            this.f45615b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
