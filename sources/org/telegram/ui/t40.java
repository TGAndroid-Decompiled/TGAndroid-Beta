package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.ChatObject;
public final class t40 implements ViewTreeObserver.OnPreDrawListener {
    public final ChatObject.VideoParticipant f37964a;
    public final boolean f37965b;
    public final d60 f37966c;

    public t40(d60 d60Var, ChatObject.VideoParticipant videoParticipant, boolean z10) {
        this.f37966c = d60Var;
        this.f37964a = videoParticipant;
        this.f37965b = z10;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        d60 d60Var = this.f37966c;
        j50 j50Var = d60Var.Q;
        j50Var.getViewTreeObserver().removeOnPreDrawListener(this);
        d60Var.f33000q2 = null;
        v30 v30Var = d60Var.a2;
        ChatObject.VideoParticipant videoParticipant = this.f37964a;
        v30Var.j(videoParticipant);
        if (d60Var.f33008s0) {
            d60Var.f33008s0 = false;
            d60Var.O0(true);
            if (this.f37965b && videoParticipant != null) {
                j50Var.u0(0);
            }
            d60Var.f33008s0 = true;
        } else {
            d60Var.O0(true);
        }
        viewGroup = ((org.telegram.ui.ActionBar.e3) d60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
