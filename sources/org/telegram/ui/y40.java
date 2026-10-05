package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.ChatObject;
public final class y40 implements ViewTreeObserver.OnPreDrawListener {
    public final ChatObject.VideoParticipant f43115a;
    public final boolean f43116b;
    public final h60 f43117c;

    public y40(h60 h60Var, ChatObject.VideoParticipant videoParticipant, boolean z10) {
        this.f43117c = h60Var;
        this.f43115a = videoParticipant;
        this.f43116b = z10;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        h60 h60Var = this.f43117c;
        o50 o50Var = h60Var.Q;
        o50Var.getViewTreeObserver().removeOnPreDrawListener(this);
        h60Var.f36972q2 = null;
        a40 a40Var = h60Var.a2;
        ChatObject.VideoParticipant videoParticipant = this.f43115a;
        a40Var.j(videoParticipant);
        if (h60Var.f36980s0) {
            h60Var.f36980s0 = false;
            h60Var.O0(true);
            if (this.f43116b && videoParticipant != null) {
                o50Var.v0(0);
            }
            h60Var.f36980s0 = true;
        } else {
            h60Var.O0(true);
        }
        viewGroup = ((org.telegram.ui.ActionBar.f3) h60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
