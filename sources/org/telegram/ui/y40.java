package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.ChatObject;
public final class y40 implements ViewTreeObserver.OnPreDrawListener {
    public final ChatObject.VideoParticipant f42982a;
    public final boolean f42983b;
    public final j60 f42984c;

    public y40(j60 j60Var, ChatObject.VideoParticipant videoParticipant, boolean z10) {
        this.f42984c = j60Var;
        this.f42982a = videoParticipant;
        this.f42983b = z10;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        j60 j60Var = this.f42984c;
        p50 p50Var = j60Var.Q;
        p50Var.getViewTreeObserver().removeOnPreDrawListener(this);
        j60Var.f37579q2 = null;
        a40 a40Var = j60Var.a2;
        ChatObject.VideoParticipant videoParticipant = this.f42982a;
        a40Var.j(videoParticipant);
        if (j60Var.f37587s0) {
            j60Var.f37587s0 = false;
            j60Var.O0(true);
            if (this.f42983b && videoParticipant != null) {
                p50Var.u0(0);
            }
            j60Var.f37587s0 = true;
        } else {
            j60Var.O0(true);
        }
        viewGroup = ((org.telegram.ui.ActionBar.f3) j60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
