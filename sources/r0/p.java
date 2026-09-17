package r0;

import android.view.View;
import android.view.ViewTreeObserver;
public final class p implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View f41881a;
    public ViewTreeObserver f41882b;
    public final Runnable f41883c;

    public p(View view, Runnable runnable) {
        this.f41881a = view;
        this.f41882b = view.getViewTreeObserver();
        this.f41883c = runnable;
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
        boolean isAlive = this.f41882b.isAlive();
        View view = this.f41881a;
        if (isAlive) {
            this.f41882b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f41883c.run();
        return true;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f41882b = view.getViewTreeObserver();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f41882b.isAlive();
        View view2 = this.f41881a;
        if (isAlive) {
            this.f41882b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
