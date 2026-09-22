package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class z40 implements ViewTreeObserver.OnPreDrawListener {
    public final ChatObject.VideoParticipant f40116a;
    public final i60 f40117b;

    public z40(i60 i60Var, ChatObject.VideoParticipant videoParticipant) {
        this.f40117b = i60Var;
        this.f40116a = videoParticipant;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        i60 i60Var = this.f40117b;
        i60Var.Q.getViewTreeObserver().removeOnPreDrawListener(this);
        i60Var.f34445q2 = null;
        i60Var.a2.j(this.f40116a);
        AndroidUtilities.updateVisibleRows(i60Var.f34428m2);
        viewGroup = ((org.telegram.ui.ActionBar.f3) i60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
