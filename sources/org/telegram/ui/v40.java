package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
public final class v40 implements ViewTreeObserver.OnPreDrawListener {
    public final c60 f39077a;

    public v40(c60 c60Var) {
        this.f39077a = c60Var;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        c60 c60Var = this.f39077a;
        c60Var.N.getViewTreeObserver().removeOnPreDrawListener(this);
        c60Var.X1.j(null);
        AndroidUtilities.updateVisibleRows(c60Var.f33137j2);
        viewGroup = ((org.telegram.ui.ActionBar.g3) c60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
