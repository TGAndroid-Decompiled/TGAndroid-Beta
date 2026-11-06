package r0;

import android.view.View;
import android.view.ViewTreeObserver;
public final class o implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View f54111a;
    public ViewTreeObserver f54112b;
    public final Runnable f54113c;

    public o(View view, Runnable runnable) {
        this.f54111a = view;
        this.f54112b = view.getViewTreeObserver();
        this.f54113c = runnable;
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
        boolean isAlive = this.f54112b.isAlive();
        View view = this.f54111a;
        if (isAlive) {
            this.f54112b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f54113c.run();
        return true;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f54112b = view.getViewTreeObserver();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f54112b.isAlive();
        View view2 = this.f54111a;
        if (isAlive) {
            this.f54112b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
