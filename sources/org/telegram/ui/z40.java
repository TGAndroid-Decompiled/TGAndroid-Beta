package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class z40 implements ViewTreeObserver.OnPreDrawListener {
    public final ChatObject.VideoParticipant f43316a;
    public final j60 f43317b;

    public z40(j60 j60Var, ChatObject.VideoParticipant videoParticipant) {
        this.f43317b = j60Var;
        this.f43316a = videoParticipant;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        j60 j60Var = this.f43317b;
        j60Var.Q.getViewTreeObserver().removeOnPreDrawListener(this);
        j60Var.f37606q2 = null;
        j60Var.a2.j(this.f43316a);
        AndroidUtilities.updateVisibleRows(j60Var.f37589m2);
        viewGroup = ((org.telegram.ui.ActionBar.f3) j60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
