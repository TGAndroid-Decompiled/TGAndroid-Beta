package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.ChatObject;
public final class u40 implements ViewTreeObserver.OnPreDrawListener {
    public final ChatObject.VideoParticipant f41784a;
    public final boolean f41785b;
    public final d60 f41786c;

    public u40(d60 d60Var, ChatObject.VideoParticipant videoParticipant, boolean z4) {
        this.f41786c = d60Var;
        this.f41784a = videoParticipant;
        this.f41785b = z4;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        d60 d60Var = this.f41786c;
        k50 k50Var = d60Var.N;
        k50Var.getViewTreeObserver().removeOnPreDrawListener(this);
        d60Var.f36066n2 = null;
        w30 w30Var = d60Var.X1;
        ChatObject.VideoParticipant videoParticipant = this.f41784a;
        w30Var.j(videoParticipant);
        if (d60Var.f36072p0) {
            d60Var.f36072p0 = false;
            d60Var.O0(true);
            if (this.f41785b && videoParticipant != null) {
                k50Var.u0(0);
            }
            d60Var.f36072p0 = true;
        } else {
            d60Var.O0(true);
        }
        viewGroup = ((org.telegram.ui.ActionBar.h3) d60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
