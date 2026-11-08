package r0;

import android.view.View;
import android.view.ViewTreeObserver;
public final class o implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View f54203a;
    public ViewTreeObserver f54204b;
    public final Runnable f54205c;

    public o(View view, Runnable runnable) {
        this.f54203a = view;
        this.f54204b = view.getViewTreeObserver();
        this.f54205c = runnable;
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
        boolean isAlive = this.f54204b.isAlive();
        View view = this.f54203a;
        if (isAlive) {
            this.f54204b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f54205c.run();
        return true;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f54204b = view.getViewTreeObserver();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f54204b.isAlive();
        View view2 = this.f54203a;
        if (isAlive) {
            this.f54204b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
