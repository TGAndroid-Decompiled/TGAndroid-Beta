package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.ChatObject;
public final class y40 implements ViewTreeObserver.OnPreDrawListener {
    public final ChatObject.VideoParticipant f39751a;
    public final boolean f39752b;
    public final i60 f39753c;

    public y40(i60 i60Var, ChatObject.VideoParticipant videoParticipant, boolean z10) {
        this.f39753c = i60Var;
        this.f39751a = videoParticipant;
        this.f39752b = z10;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        i60 i60Var = this.f39753c;
        o50 o50Var = i60Var.Q;
        o50Var.getViewTreeObserver().removeOnPreDrawListener(this);
        i60Var.f34475q2 = null;
        a40 a40Var = i60Var.a2;
        ChatObject.VideoParticipant videoParticipant = this.f39751a;
        a40Var.j(videoParticipant);
        if (i60Var.f34483s0) {
            i60Var.f34483s0 = false;
            i60Var.O0(true);
            if (this.f39752b && videoParticipant != null) {
                o50Var.u0(0);
            }
            i60Var.f34483s0 = true;
        } else {
            i60Var.O0(true);
        }
        viewGroup = ((org.telegram.ui.ActionBar.f3) i60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
