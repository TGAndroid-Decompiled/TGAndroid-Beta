package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.ChatObject;
public final class t40 implements ViewTreeObserver.OnPreDrawListener {
    public final ChatObject.VideoParticipant f38548a;
    public final boolean f38549b;
    public final c60 f38550c;

    public t40(c60 c60Var, ChatObject.VideoParticipant videoParticipant, boolean z4) {
        this.f38550c = c60Var;
        this.f38548a = videoParticipant;
        this.f38549b = z4;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        c60 c60Var = this.f38550c;
        j50 j50Var = c60Var.N;
        j50Var.getViewTreeObserver().removeOnPreDrawListener(this);
        c60Var.f33152n2 = null;
        v30 v30Var = c60Var.X1;
        ChatObject.VideoParticipant videoParticipant = this.f38548a;
        v30Var.j(videoParticipant);
        if (c60Var.f33158p0) {
            c60Var.f33158p0 = false;
            c60Var.O0(true);
            if (this.f38549b && videoParticipant != null) {
                j50Var.u0(0);
            }
            c60Var.f33158p0 = true;
        } else {
            c60Var.O0(true);
        }
        viewGroup = ((org.telegram.ui.ActionBar.g3) c60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
