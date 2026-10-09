package r0;

import android.view.View;
import android.view.ViewTreeObserver;
public final class p implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View f46783a;
    public ViewTreeObserver f46784b;
    public final Runnable f46785c;

    public p(View view, Runnable runnable) {
        this.f46783a = view;
        this.f46784b = view.getViewTreeObserver();
        this.f46785c = runnable;
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
        boolean isAlive = this.f46784b.isAlive();
        View view = this.f46783a;
        if (isAlive) {
            this.f46784b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f46785c.run();
        return true;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f46784b = view.getViewTreeObserver();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f46784b.isAlive();
        View view2 = this.f46783a;
        if (isAlive) {
            this.f46784b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
