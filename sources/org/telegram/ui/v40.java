package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.ChatObject;
public final class v40 implements ViewTreeObserver.OnPreDrawListener {
    public final ChatObject.VideoParticipant f38293a;
    public final boolean f38294b;
    public final f60 f38295c;

    public v40(f60 f60Var, ChatObject.VideoParticipant videoParticipant, boolean z10) {
        this.f38295c = f60Var;
        this.f38293a = videoParticipant;
        this.f38294b = z10;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        f60 f60Var = this.f38295c;
        l50 l50Var = f60Var.Q;
        l50Var.getViewTreeObserver().removeOnPreDrawListener(this);
        f60Var.f33164q2 = null;
        x30 x30Var = f60Var.a2;
        ChatObject.VideoParticipant videoParticipant = this.f38293a;
        x30Var.j(videoParticipant);
        if (f60Var.f33172s0) {
            f60Var.f33172s0 = false;
            f60Var.O0(true);
            if (this.f38294b && videoParticipant != null) {
                l50Var.u0(0);
            }
            f60Var.f33172s0 = true;
        } else {
            f60Var.O0(true);
        }
        viewGroup = ((org.telegram.ui.ActionBar.f3) f60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
