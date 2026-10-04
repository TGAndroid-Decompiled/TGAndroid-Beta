package r0;

import android.view.View;
import android.view.ViewTreeObserver;
public final class p implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View f45622a;
    public ViewTreeObserver f45623b;
    public final Runnable f45624c;

    public p(View view, Runnable runnable) {
        this.f45622a = view;
        this.f45623b = view.getViewTreeObserver();
        this.f45624c = runnable;
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
        boolean isAlive = this.f45623b.isAlive();
        View view = this.f45622a;
        if (isAlive) {
            this.f45623b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f45624c.run();
        return true;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f45623b = view.getViewTreeObserver();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f45623b.isAlive();
        View view2 = this.f45622a;
        if (isAlive) {
            this.f45623b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
