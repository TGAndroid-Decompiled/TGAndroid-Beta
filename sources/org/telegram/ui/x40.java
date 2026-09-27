package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class x40 implements ViewTreeObserver.OnPreDrawListener {
    public final ChatObject.VideoParticipant f39514a;
    public final g60 f39515b;

    public x40(g60 g60Var, ChatObject.VideoParticipant videoParticipant) {
        this.f39515b = g60Var;
        this.f39514a = videoParticipant;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        g60 g60Var = this.f39515b;
        g60Var.Q.getViewTreeObserver().removeOnPreDrawListener(this);
        g60Var.f33791q2 = null;
        g60Var.a2.j(this.f39514a);
        AndroidUtilities.updateVisibleRows(g60Var.f33774m2);
        viewGroup = ((org.telegram.ui.ActionBar.g3) g60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
