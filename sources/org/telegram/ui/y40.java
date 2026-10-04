package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.ChatObject;
public final class y40 implements ViewTreeObserver.OnPreDrawListener {
    public final ChatObject.VideoParticipant f43059a;
    public final boolean f43060b;
    public final h60 f43061c;

    public y40(h60 h60Var, ChatObject.VideoParticipant videoParticipant, boolean z10) {
        this.f43061c = h60Var;
        this.f43059a = videoParticipant;
        this.f43060b = z10;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        h60 h60Var = this.f43061c;
        o50 o50Var = h60Var.Q;
        o50Var.getViewTreeObserver().removeOnPreDrawListener(this);
        h60Var.f36945q2 = null;
        a40 a40Var = h60Var.a2;
        ChatObject.VideoParticipant videoParticipant = this.f43059a;
        a40Var.j(videoParticipant);
        if (h60Var.f36953s0) {
            h60Var.f36953s0 = false;
            h60Var.O0(true);
            if (this.f43060b && videoParticipant != null) {
                o50Var.v0(0);
            }
            h60Var.f36953s0 = true;
        } else {
            h60Var.O0(true);
        }
        viewGroup = ((org.telegram.ui.ActionBar.f3) h60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
