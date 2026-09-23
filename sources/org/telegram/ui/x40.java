package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
public final class x40 implements ViewTreeObserver.OnPreDrawListener {
    public final f60 f39186a;

    public x40(f60 f60Var) {
        this.f39186a = f60Var;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        f60 f60Var = this.f39186a;
        f60Var.Q.getViewTreeObserver().removeOnPreDrawListener(this);
        f60Var.a2.j(null);
        AndroidUtilities.updateVisibleRows(f60Var.f33147m2);
        viewGroup = ((org.telegram.ui.ActionBar.f3) f60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
