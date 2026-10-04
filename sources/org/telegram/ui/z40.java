package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class z40 implements ViewTreeObserver.OnPreDrawListener {
    public final ChatObject.VideoParticipant f43698a;
    public final h60 f43699b;

    public z40(h60 h60Var, ChatObject.VideoParticipant videoParticipant) {
        this.f43699b = h60Var;
        this.f43698a = videoParticipant;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        h60 h60Var = this.f43699b;
        h60Var.Q.getViewTreeObserver().removeOnPreDrawListener(this);
        h60Var.f36940q2 = null;
        h60Var.a2.j(this.f43698a);
        AndroidUtilities.updateVisibleRows(h60Var.f36923m2);
        viewGroup = ((org.telegram.ui.ActionBar.f3) h60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
