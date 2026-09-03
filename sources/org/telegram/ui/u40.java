package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.ChatObject;
public final class u40 implements ViewTreeObserver.OnPreDrawListener {
    public final ChatObject.VideoParticipant f41721a;
    public final boolean f41722b;
    public final d60 f41723c;

    public u40(d60 d60Var, ChatObject.VideoParticipant videoParticipant, boolean z4) {
        this.f41723c = d60Var;
        this.f41721a = videoParticipant;
        this.f41722b = z4;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        d60 d60Var = this.f41723c;
        k50 k50Var = d60Var.N;
        k50Var.getViewTreeObserver().removeOnPreDrawListener(this);
        d60Var.f36045n2 = null;
        w30 w30Var = d60Var.X1;
        ChatObject.VideoParticipant videoParticipant = this.f41721a;
        w30Var.j(videoParticipant);
        if (d60Var.f36051p0) {
            d60Var.f36051p0 = false;
            d60Var.O0(true);
            if (this.f41722b && videoParticipant != null) {
                k50Var.u0(0);
            }
            d60Var.f36051p0 = true;
        } else {
            d60Var.O0(true);
        }
        viewGroup = ((org.telegram.ui.ActionBar.h3) d60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
