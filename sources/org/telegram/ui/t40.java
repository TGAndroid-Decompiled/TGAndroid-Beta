package org.telegram.ui;

import android.view.TextureView;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class t40 implements ov0 {
    public final i60 f42079a;

    public t40(i60 i60Var) {
        this.f42079a = i60Var;
    }

    @Override
    public final void H(MessageObject messageObject) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.e3) this.f42079a).containerView;
        viewGroup.invalidate();
    }

    @Override
    public final TextureView g0() {
        return null;
    }

    @Override
    public final void w0(MessageObject messageObject) {
        ViewGroup viewGroup;
        i60 i60Var = this.f42079a;
        i60Var.Q.I0(true);
        i60Var.f38688c2.f41996f.setRoundRadius(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0, 0);
        viewGroup = ((org.telegram.ui.ActionBar.e3) i60Var).containerView;
        viewGroup.invalidate();
    }
}
