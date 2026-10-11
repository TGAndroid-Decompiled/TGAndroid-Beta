package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class x40 implements ViewTreeObserver.OnPreDrawListener {
    public final ChatObject.VideoParticipant f43998a;
    public final g60 f43999b;

    public x40(g60 g60Var, ChatObject.VideoParticipant videoParticipant) {
        this.f43999b = g60Var;
        this.f43998a = videoParticipant;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        g60 g60Var = this.f43999b;
        g60Var.Q.getViewTreeObserver().removeOnPreDrawListener(this);
        g60Var.f37969q2 = null;
        g60Var.a2.j(this.f43998a);
        AndroidUtilities.updateVisibleRows(g60Var.f37952m2);
        viewGroup = ((org.telegram.ui.ActionBar.e3) g60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
