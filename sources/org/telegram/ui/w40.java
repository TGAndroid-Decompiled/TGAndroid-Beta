package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class w40 implements ViewTreeObserver.OnPreDrawListener {
    public final ChatObject.VideoParticipant f38528a;
    public final f60 f38529b;

    public w40(f60 f60Var, ChatObject.VideoParticipant videoParticipant) {
        this.f38529b = f60Var;
        this.f38528a = videoParticipant;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        f60 f60Var = this.f38529b;
        f60Var.Q.getViewTreeObserver().removeOnPreDrawListener(this);
        f60Var.f33164q2 = null;
        f60Var.a2.j(this.f38528a);
        AndroidUtilities.updateVisibleRows(f60Var.f33147m2);
        viewGroup = ((org.telegram.ui.ActionBar.f3) f60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
