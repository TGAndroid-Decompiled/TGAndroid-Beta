package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.ChatObject;
public final class v40 implements ViewTreeObserver.OnPreDrawListener {
    public final ChatObject.VideoParticipant f39002a;
    public final boolean f39003b;
    public final e60 f39004c;

    public v40(e60 e60Var, ChatObject.VideoParticipant videoParticipant, boolean z4) {
        this.f39004c = e60Var;
        this.f39002a = videoParticipant;
        this.f39003b = z4;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        e60 e60Var = this.f39004c;
        l50 l50Var = e60Var.N;
        l50Var.getViewTreeObserver().removeOnPreDrawListener(this);
        e60Var.f33671n2 = null;
        x30 x30Var = e60Var.X1;
        ChatObject.VideoParticipant videoParticipant = this.f39002a;
        x30Var.j(videoParticipant);
        if (e60Var.f33677p0) {
            e60Var.f33677p0 = false;
            e60Var.O0(true);
            if (this.f39003b && videoParticipant != null) {
                l50Var.u0(0);
            }
            e60Var.f33677p0 = true;
        } else {
            e60Var.O0(true);
        }
        viewGroup = ((org.telegram.ui.ActionBar.g3) e60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
