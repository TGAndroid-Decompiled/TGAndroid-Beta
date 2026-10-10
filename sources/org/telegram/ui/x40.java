package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class x40 implements ViewTreeObserver.OnPreDrawListener {
    public final ChatObject.VideoParticipant f43866a;
    public final g60 f43867b;

    public x40(g60 g60Var, ChatObject.VideoParticipant videoParticipant) {
        this.f43867b = g60Var;
        this.f43866a = videoParticipant;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        g60 g60Var = this.f43867b;
        g60Var.Q.getViewTreeObserver().removeOnPreDrawListener(this);
        g60Var.f37899q2 = null;
        g60Var.a2.j(this.f43866a);
        AndroidUtilities.updateVisibleRows(g60Var.f37882m2);
        viewGroup = ((org.telegram.ui.ActionBar.f3) g60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
