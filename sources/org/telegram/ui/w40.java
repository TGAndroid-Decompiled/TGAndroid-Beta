package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.ChatObject;
public final class w40 implements ViewTreeObserver.OnPreDrawListener {
    public final ChatObject.VideoParticipant f43084a;
    public final boolean f43085b;
    public final g60 f43086c;

    public w40(g60 g60Var, ChatObject.VideoParticipant videoParticipant, boolean z10) {
        this.f43086c = g60Var;
        this.f43084a = videoParticipant;
        this.f43085b = z10;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        g60 g60Var = this.f43086c;
        m50 m50Var = g60Var.Q;
        m50Var.getViewTreeObserver().removeOnPreDrawListener(this);
        g60Var.f37853q2 = null;
        y30 y30Var = g60Var.a2;
        ChatObject.VideoParticipant videoParticipant = this.f43084a;
        y30Var.j(videoParticipant);
        if (g60Var.f37861s0) {
            g60Var.f37861s0 = false;
            g60Var.P0(true);
            if (this.f43085b && videoParticipant != null) {
                m50Var.u0(0);
            }
            g60Var.f37861s0 = true;
        } else {
            g60Var.P0(true);
        }
        viewGroup = ((org.telegram.ui.ActionBar.f3) g60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
