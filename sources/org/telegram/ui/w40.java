package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.ChatObject;
public final class w40 implements ViewTreeObserver.OnPreDrawListener {
    public final ChatObject.VideoParticipant f38810a;
    public final boolean f38811b;
    public final g60 f38812c;

    public w40(g60 g60Var, ChatObject.VideoParticipant videoParticipant, boolean z10) {
        this.f38812c = g60Var;
        this.f38810a = videoParticipant;
        this.f38811b = z10;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        g60 g60Var = this.f38812c;
        m50 m50Var = g60Var.Q;
        m50Var.getViewTreeObserver().removeOnPreDrawListener(this);
        g60Var.f33791q2 = null;
        y30 y30Var = g60Var.a2;
        ChatObject.VideoParticipant videoParticipant = this.f38810a;
        y30Var.j(videoParticipant);
        if (g60Var.f33799s0) {
            g60Var.f33799s0 = false;
            g60Var.O0(true);
            if (this.f38811b && videoParticipant != null) {
                m50Var.v0(0);
            }
            g60Var.f33799s0 = true;
        } else {
            g60Var.O0(true);
        }
        viewGroup = ((org.telegram.ui.ActionBar.g3) g60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
