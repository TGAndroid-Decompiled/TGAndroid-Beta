package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class z40 implements ViewTreeObserver.OnPreDrawListener {
    public final ChatObject.VideoParticipant f40064a;
    public final i60 f40065b;

    public z40(i60 i60Var, ChatObject.VideoParticipant videoParticipant) {
        this.f40065b = i60Var;
        this.f40064a = videoParticipant;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        i60 i60Var = this.f40065b;
        i60Var.Q.getViewTreeObserver().removeOnPreDrawListener(this);
        i60Var.f34475q2 = null;
        i60Var.a2.j(this.f40064a);
        AndroidUtilities.updateVisibleRows(i60Var.f34458m2);
        viewGroup = ((org.telegram.ui.ActionBar.f3) i60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
