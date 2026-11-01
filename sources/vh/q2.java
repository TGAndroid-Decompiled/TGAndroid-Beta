package vh;

import android.view.View;
import android.view.ViewTreeObserver;
public final class q2 implements View.OnAttachStateChangeListener {
    public final boolean f51801a;
    public final View f51802b;
    public final r2 f51803c;

    public q2(r2 r2Var, boolean z10, View view) {
        this.f51803c = r2Var;
        this.f51801a = z10;
        this.f51802b = view;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        boolean z10 = this.f51801a;
        r2 r2Var = this.f51803c;
        if (z10) {
            r2Var.f51825b = view.getRootView();
        }
        View view2 = this.f51802b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(r2Var.f51830j);
        view2.addOnLayoutChangeListener(r2Var.f51829i);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.f51802b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        r2 r2Var = this.f51803c;
        viewTreeObserver.removeOnGlobalLayoutListener(r2Var.f51830j);
        view2.removeOnLayoutChangeListener(r2Var.f51829i);
    }
}
