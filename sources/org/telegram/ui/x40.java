package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class x40 implements ViewTreeObserver.OnPreDrawListener {
    public final ChatObject.VideoParticipant f43964a;
    public final g60 f43965b;

    public x40(g60 g60Var, ChatObject.VideoParticipant videoParticipant) {
        this.f43965b = g60Var;
        this.f43964a = videoParticipant;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        g60 g60Var = this.f43965b;
        g60Var.Q.getViewTreeObserver().removeOnPreDrawListener(this);
        g60Var.f37935q2 = null;
        g60Var.a2.j(this.f43964a);
        AndroidUtilities.updateVisibleRows(g60Var.f37918m2);
        viewGroup = ((org.telegram.ui.ActionBar.e3) g60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
