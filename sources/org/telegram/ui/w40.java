package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
public final class w40 implements ViewTreeObserver.OnPreDrawListener {
    public final d60 f42376a;

    public w40(d60 d60Var) {
        this.f42376a = d60Var;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        d60 d60Var = this.f42376a;
        d60Var.N.getViewTreeObserver().removeOnPreDrawListener(this);
        d60Var.X1.j(null);
        AndroidUtilities.updateVisibleRows(d60Var.f36051j2);
        viewGroup = ((org.telegram.ui.ActionBar.h3) d60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
