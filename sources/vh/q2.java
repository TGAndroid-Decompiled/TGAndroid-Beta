package vh;

import android.view.View;
import android.view.ViewTreeObserver;
public final class q2 implements View.OnAttachStateChangeListener {
    public final boolean f51786a;
    public final View f51787b;
    public final r2 f51788c;

    public q2(r2 r2Var, boolean z10, View view) {
        this.f51788c = r2Var;
        this.f51786a = z10;
        this.f51787b = view;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        boolean z10 = this.f51786a;
        r2 r2Var = this.f51788c;
        if (z10) {
            r2Var.f51840b = view.getRootView();
        }
        View view2 = this.f51787b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(r2Var.f51845j);
        view2.addOnLayoutChangeListener(r2Var.f51844i);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.f51787b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        r2 r2Var = this.f51788c;
        viewTreeObserver.removeOnGlobalLayoutListener(r2Var.f51845j);
        view2.removeOnLayoutChangeListener(r2Var.f51844i);
    }
}
