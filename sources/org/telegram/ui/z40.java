package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
public final class z40 implements ViewTreeObserver.OnPreDrawListener {
    public final g60 f44482a;

    public z40(g60 g60Var) {
        this.f44482a = g60Var;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        g60 g60Var = this.f44482a;
        g60Var.Q.getViewTreeObserver().removeOnPreDrawListener(this);
        g60Var.a2.j(null);
        AndroidUtilities.updateVisibleRows(g60Var.f37838m2);
        viewGroup = ((org.telegram.ui.ActionBar.f3) g60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
