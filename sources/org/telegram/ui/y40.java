package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
public final class y40 implements ViewTreeObserver.OnPreDrawListener {
    public final g60 f44238a;

    public y40(g60 g60Var) {
        this.f44238a = g60Var;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        g60 g60Var = this.f44238a;
        g60Var.Q.getViewTreeObserver().removeOnPreDrawListener(this);
        g60Var.a2.j(null);
        AndroidUtilities.updateVisibleRows(g60Var.f37836m2);
        viewGroup = ((org.telegram.ui.ActionBar.f3) g60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
