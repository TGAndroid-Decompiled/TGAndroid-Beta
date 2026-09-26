package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class u40 implements ViewTreeObserver.OnPreDrawListener {
    public final ChatObject.VideoParticipant f38310a;
    public final d60 f38311b;

    public u40(d60 d60Var, ChatObject.VideoParticipant videoParticipant) {
        this.f38311b = d60Var;
        this.f38310a = videoParticipant;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        d60 d60Var = this.f38311b;
        d60Var.Q.getViewTreeObserver().removeOnPreDrawListener(this);
        d60Var.f32999q2 = null;
        d60Var.a2.j(this.f38310a);
        AndroidUtilities.updateVisibleRows(d60Var.f32982m2);
        viewGroup = ((org.telegram.ui.ActionBar.e3) d60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
