package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class u40 implements ViewTreeObserver.OnPreDrawListener {
    public final ChatObject.VideoParticipant f38838a;
    public final c60 f38839b;

    public u40(c60 c60Var, ChatObject.VideoParticipant videoParticipant) {
        this.f38839b = c60Var;
        this.f38838a = videoParticipant;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        c60 c60Var = this.f38839b;
        c60Var.N.getViewTreeObserver().removeOnPreDrawListener(this);
        c60Var.f33152n2 = null;
        c60Var.X1.j(this.f38838a);
        AndroidUtilities.updateVisibleRows(c60Var.f33137j2);
        viewGroup = ((org.telegram.ui.ActionBar.g3) c60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
