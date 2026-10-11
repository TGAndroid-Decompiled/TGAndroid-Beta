package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.ChatObject;
public final class w40 implements ViewTreeObserver.OnPreDrawListener {
    public final ChatObject.VideoParticipant f43240a;
    public final boolean f43241b;
    public final g60 f43242c;

    public w40(g60 g60Var, ChatObject.VideoParticipant videoParticipant, boolean z10) {
        this.f43242c = g60Var;
        this.f43240a = videoParticipant;
        this.f43241b = z10;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        g60 g60Var = this.f43242c;
        m50 m50Var = g60Var.Q;
        m50Var.getViewTreeObserver().removeOnPreDrawListener(this);
        g60Var.f37969q2 = null;
        y30 y30Var = g60Var.a2;
        ChatObject.VideoParticipant videoParticipant = this.f43240a;
        y30Var.j(videoParticipant);
        if (g60Var.f37977s0) {
            g60Var.f37977s0 = false;
            g60Var.P0(true);
            if (this.f43241b && videoParticipant != null) {
                m50Var.u0(0);
            }
            g60Var.f37977s0 = true;
        } else {
            g60Var.P0(true);
        }
        viewGroup = ((org.telegram.ui.ActionBar.e3) g60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
