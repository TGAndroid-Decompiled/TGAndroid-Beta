package ph;

import android.view.View;
import android.view.ViewTreeObserver;
public final class h3 implements View.OnAttachStateChangeListener {
    public final boolean f41740a;
    public final View f41741b;
    public final i3 f41742c;

    public h3(i3 i3Var, boolean z4, View view) {
        this.f41742c = i3Var;
        this.f41740a = z4;
        this.f41741b = view;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        boolean z4 = this.f41740a;
        i3 i3Var = this.f41742c;
        if (z4) {
            i3Var.f41772b = view.getRootView();
        }
        View view2 = this.f41741b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(i3Var.f41777j);
        view2.addOnLayoutChangeListener(i3Var.f41776i);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.f41741b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        i3 i3Var = this.f41742c;
        viewTreeObserver.removeOnGlobalLayoutListener(i3Var.f41777j);
        view2.removeOnLayoutChangeListener(i3Var.f41776i);
    }
}
