package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.ChatObject;
public final class y40 implements ViewTreeObserver.OnPreDrawListener {
    public final ChatObject.VideoParticipant f44295a;
    public final boolean f44296b;
    public final i60 f44297c;

    public y40(i60 i60Var, ChatObject.VideoParticipant videoParticipant, boolean z10) {
        this.f44297c = i60Var;
        this.f44295a = videoParticipant;
        this.f44296b = z10;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        i60 i60Var = this.f44297c;
        o50 o50Var = i60Var.Q;
        o50Var.getViewTreeObserver().removeOnPreDrawListener(this);
        i60Var.f38747q2 = null;
        a40 a40Var = i60Var.a2;
        ChatObject.VideoParticipant videoParticipant = this.f44295a;
        a40Var.j(videoParticipant);
        if (i60Var.f38755s0) {
            i60Var.f38755s0 = false;
            i60Var.P0(true);
            if (this.f44296b && videoParticipant != null) {
                o50Var.u0(0);
            }
            i60Var.f38755s0 = true;
        } else {
            i60Var.P0(true);
        }
        viewGroup = ((org.telegram.ui.ActionBar.e3) i60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
