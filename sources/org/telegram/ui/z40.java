package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.ChatObject;
public final class z40 implements ViewTreeObserver.OnPreDrawListener {
    public final ChatObject.VideoParticipant f39210a;
    public final boolean f39211b;
    public final j60 f39212c;

    public z40(j60 j60Var, ChatObject.VideoParticipant videoParticipant, boolean z10) {
        this.f39212c = j60Var;
        this.f39210a = videoParticipant;
        this.f39211b = z10;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        j60 j60Var = this.f39212c;
        p50 p50Var = j60Var.Q;
        p50Var.getViewTreeObserver().removeOnPreDrawListener(this);
        j60Var.f34001q2 = null;
        b40 b40Var = j60Var.a2;
        ChatObject.VideoParticipant videoParticipant = this.f39210a;
        b40Var.j(videoParticipant);
        if (j60Var.f34009s0) {
            j60Var.f34009s0 = false;
            j60Var.O0(true);
            if (this.f39211b && videoParticipant != null) {
                p50Var.u0(0);
            }
            j60Var.f34009s0 = true;
        } else {
            j60Var.O0(true);
        }
        viewGroup = ((org.telegram.ui.ActionBar.h3) j60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
