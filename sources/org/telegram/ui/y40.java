package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.ChatObject;
public final class y40 implements ViewTreeObserver.OnPreDrawListener {
    public final ChatObject.VideoParticipant f43009a;
    public final boolean f43010b;
    public final j60 f43011c;

    public y40(j60 j60Var, ChatObject.VideoParticipant videoParticipant, boolean z10) {
        this.f43011c = j60Var;
        this.f43009a = videoParticipant;
        this.f43010b = z10;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        j60 j60Var = this.f43011c;
        p50 p50Var = j60Var.Q;
        p50Var.getViewTreeObserver().removeOnPreDrawListener(this);
        j60Var.f37606q2 = null;
        a40 a40Var = j60Var.a2;
        ChatObject.VideoParticipant videoParticipant = this.f43009a;
        a40Var.j(videoParticipant);
        if (j60Var.f37614s0) {
            j60Var.f37614s0 = false;
            j60Var.O0(true);
            if (this.f43010b && videoParticipant != null) {
                p50Var.u0(0);
            }
            j60Var.f37614s0 = true;
        } else {
            j60Var.O0(true);
        }
        viewGroup = ((org.telegram.ui.ActionBar.f3) j60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
