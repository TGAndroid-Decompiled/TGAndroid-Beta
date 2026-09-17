package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.ChatObject;
public final class y40 implements ViewTreeObserver.OnPreDrawListener {
    public final ChatObject.VideoParticipant f42983a;
    public final boolean f42984b;
    public final j60 f42985c;

    public y40(j60 j60Var, ChatObject.VideoParticipant videoParticipant, boolean z10) {
        this.f42985c = j60Var;
        this.f42983a = videoParticipant;
        this.f42984b = z10;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        j60 j60Var = this.f42985c;
        p50 p50Var = j60Var.Q;
        p50Var.getViewTreeObserver().removeOnPreDrawListener(this);
        j60Var.f37580q2 = null;
        a40 a40Var = j60Var.a2;
        ChatObject.VideoParticipant videoParticipant = this.f42983a;
        a40Var.j(videoParticipant);
        if (j60Var.f37588s0) {
            j60Var.f37588s0 = false;
            j60Var.O0(true);
            if (this.f42984b && videoParticipant != null) {
                p50Var.u0(0);
            }
            j60Var.f37588s0 = true;
        } else {
            j60Var.O0(true);
        }
        viewGroup = ((org.telegram.ui.ActionBar.f3) j60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
