package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.ChatObject;
public final class y40 implements ViewTreeObserver.OnPreDrawListener {
    public final ChatObject.VideoParticipant f39815a;
    public final boolean f39816b;
    public final i60 f39817c;

    public y40(i60 i60Var, ChatObject.VideoParticipant videoParticipant, boolean z10) {
        this.f39817c = i60Var;
        this.f39815a = videoParticipant;
        this.f39816b = z10;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        i60 i60Var = this.f39817c;
        o50 o50Var = i60Var.Q;
        o50Var.getViewTreeObserver().removeOnPreDrawListener(this);
        i60Var.f34445q2 = null;
        a40 a40Var = i60Var.a2;
        ChatObject.VideoParticipant videoParticipant = this.f39815a;
        a40Var.j(videoParticipant);
        if (i60Var.f34453s0) {
            i60Var.f34453s0 = false;
            i60Var.O0(true);
            if (this.f39816b && videoParticipant != null) {
                o50Var.v0(0);
            }
            i60Var.f34453s0 = true;
        } else {
            i60Var.O0(true);
        }
        viewGroup = ((org.telegram.ui.ActionBar.f3) i60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
