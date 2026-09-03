package qh;

import android.view.View;
import android.view.ViewTreeObserver;
public final class g3 implements View.OnAttachStateChangeListener {
    public final boolean f45354a;
    public final View f45355b;
    public final h3 f45356c;

    public g3(h3 h3Var, boolean z4, View view) {
        this.f45356c = h3Var;
        this.f45354a = z4;
        this.f45355b = view;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        boolean z4 = this.f45354a;
        h3 h3Var = this.f45356c;
        if (z4) {
            h3Var.f45392b = view.getRootView();
        }
        View view2 = this.f45355b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(h3Var.f45398j);
        view2.addOnLayoutChangeListener(h3Var.f45397i);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.f45355b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        h3 h3Var = this.f45356c;
        viewTreeObserver.removeOnGlobalLayoutListener(h3Var.f45398j);
        view2.removeOnLayoutChangeListener(h3Var.f45397i);
    }
}
