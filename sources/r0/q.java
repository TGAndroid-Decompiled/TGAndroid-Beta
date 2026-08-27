package r0;

import android.view.View;
import android.view.ViewTreeObserver;

public final class q implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    public final View f46624a;

    public ViewTreeObserver f46625b;

    public final Runnable f46626c;

    public q(View view, Runnable runnable) {
        this.f46624a = view;
        this.f46625b = view.getViewTreeObserver();
        this.f46626c = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        q qVar = new q(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(qVar);
        view.addOnAttachStateChangeListener(qVar);
    }

    @Override
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f46625b.isAlive();
        View view = this.f46624a;
        if (zIsAlive) {
            this.f46625b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f46626c.run();
        return true;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f46625b = view.getViewTreeObserver();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.f46625b.isAlive();
        View view2 = this.f46624a;
        if (zIsAlive) {
            this.f46625b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
