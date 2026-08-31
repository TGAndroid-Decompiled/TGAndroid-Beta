package qh;

import android.view.View;
import android.view.ViewTreeObserver;
public final class h3 implements View.OnAttachStateChangeListener {
    public final boolean f45373a;
    public final View f45374b;
    public final i3 f45375c;

    public h3(i3 i3Var, boolean z4, View view) {
        this.f45375c = i3Var;
        this.f45373a = z4;
        this.f45374b = view;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        boolean z4 = this.f45373a;
        i3 i3Var = this.f45375c;
        if (z4) {
            i3Var.f45410b = view.getRootView();
        }
        View view2 = this.f45374b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(i3Var.f45416j);
        view2.addOnLayoutChangeListener(i3Var.f45415i);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.f45374b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        i3 i3Var = this.f45375c;
        viewTreeObserver.removeOnGlobalLayoutListener(i3Var.f45416j);
        view2.removeOnLayoutChangeListener(i3Var.f45415i);
    }
}
