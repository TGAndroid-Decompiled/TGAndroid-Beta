package r0;

import android.view.View;
import android.view.ViewTreeObserver;
public final class p implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View f42113a;
    public ViewTreeObserver f42114b;
    public final Runnable f42115c;

    public p(View view, Runnable runnable) {
        this.f42113a = view;
        this.f42114b = view.getViewTreeObserver();
        this.f42115c = runnable;
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
        boolean isAlive = this.f42114b.isAlive();
        View view = this.f42113a;
        if (isAlive) {
            this.f42114b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f42115c.run();
        return true;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f42114b = view.getViewTreeObserver();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f42114b.isAlive();
        View view2 = this.f42113a;
        if (isAlive) {
            this.f42114b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
