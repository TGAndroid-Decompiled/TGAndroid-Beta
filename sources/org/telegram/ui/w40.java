package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
public final class w40 implements ViewTreeObserver.OnPreDrawListener {
    public final d60 f38890a;

    public w40(d60 d60Var) {
        this.f38890a = d60Var;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        d60 d60Var = this.f38890a;
        d60Var.Q.getViewTreeObserver().removeOnPreDrawListener(this);
        d60Var.a2.j(null);
        AndroidUtilities.updateVisibleRows(d60Var.f32982m2);
        viewGroup = ((org.telegram.ui.ActionBar.e3) d60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
