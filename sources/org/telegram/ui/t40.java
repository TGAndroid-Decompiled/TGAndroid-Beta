package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.ChatObject;
public final class t40 implements ViewTreeObserver.OnPreDrawListener {
    public final ChatObject.VideoParticipant f38072a;
    public final boolean f38073b;
    public final d60 f38074c;

    public t40(d60 d60Var, ChatObject.VideoParticipant videoParticipant, boolean z10) {
        this.f38074c = d60Var;
        this.f38072a = videoParticipant;
        this.f38073b = z10;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        d60 d60Var = this.f38074c;
        j50 j50Var = d60Var.Q;
        j50Var.getViewTreeObserver().removeOnPreDrawListener(this);
        d60Var.f33078q2 = null;
        v30 v30Var = d60Var.a2;
        ChatObject.VideoParticipant videoParticipant = this.f38072a;
        v30Var.j(videoParticipant);
        if (d60Var.f33086s0) {
            d60Var.f33086s0 = false;
            d60Var.O0(true);
            if (this.f38073b && videoParticipant != null) {
                j50Var.v0(0);
            }
            d60Var.f33086s0 = true;
        } else {
            d60Var.O0(true);
        }
        viewGroup = ((org.telegram.ui.ActionBar.e3) d60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
