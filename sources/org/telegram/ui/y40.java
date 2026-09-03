package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
public final class y40 implements ViewTreeObserver.OnPreDrawListener {
    public final e60 f40138a;

    public y40(e60 e60Var) {
        this.f40138a = e60Var;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        e60 e60Var = this.f40138a;
        e60Var.N.getViewTreeObserver().removeOnPreDrawListener(this);
        e60Var.X1.j(null);
        AndroidUtilities.updateVisibleRows(e60Var.f33656j2);
        viewGroup = ((org.telegram.ui.ActionBar.g3) e60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
