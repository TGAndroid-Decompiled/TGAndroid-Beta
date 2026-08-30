package ph;

import android.view.View;
import android.view.ViewTreeObserver;
public final class h3 implements View.OnAttachStateChangeListener {
    public final boolean f41705a;
    public final View f41706b;
    public final i3 f41707c;

    public h3(i3 i3Var, boolean z4, View view) {
        this.f41707c = i3Var;
        this.f41705a = z4;
        this.f41706b = view;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        boolean z4 = this.f41705a;
        i3 i3Var = this.f41707c;
        if (z4) {
            i3Var.f41741b = view.getRootView();
        }
        View view2 = this.f41706b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(i3Var.f41746j);
        view2.addOnLayoutChangeListener(i3Var.f41745i);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.f41706b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        i3 i3Var = this.f41707c;
        viewTreeObserver.removeOnGlobalLayoutListener(i3Var.f41746j);
        view2.removeOnLayoutChangeListener(i3Var.f41745i);
    }
}
