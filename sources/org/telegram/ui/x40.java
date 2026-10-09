package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class x40 implements ViewTreeObserver.OnPreDrawListener {
    public final ChatObject.VideoParticipant f43820a;
    public final g60 f43821b;

    public x40(g60 g60Var, ChatObject.VideoParticipant videoParticipant) {
        this.f43821b = g60Var;
        this.f43820a = videoParticipant;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        g60 g60Var = this.f43821b;
        g60Var.Q.getViewTreeObserver().removeOnPreDrawListener(this);
        g60Var.f37853q2 = null;
        g60Var.a2.j(this.f43820a);
        AndroidUtilities.updateVisibleRows(g60Var.f37836m2);
        viewGroup = ((org.telegram.ui.ActionBar.f3) g60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
