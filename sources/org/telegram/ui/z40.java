package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class z40 implements ViewTreeObserver.OnPreDrawListener {
    public final ChatObject.VideoParticipant f43289a;
    public final j60 f43290b;

    public z40(j60 j60Var, ChatObject.VideoParticipant videoParticipant) {
        this.f43290b = j60Var;
        this.f43289a = videoParticipant;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        j60 j60Var = this.f43290b;
        j60Var.Q.getViewTreeObserver().removeOnPreDrawListener(this);
        j60Var.f37579q2 = null;
        j60Var.a2.j(this.f43289a);
        AndroidUtilities.updateVisibleRows(j60Var.f37562m2);
        viewGroup = ((org.telegram.ui.ActionBar.f3) j60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
