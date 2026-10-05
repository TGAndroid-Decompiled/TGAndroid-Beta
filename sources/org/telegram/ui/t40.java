package org.telegram.ui;

import android.view.TextureView;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class t40 implements gv0 {
    public final h60 f40709a;

    public t40(h60 h60Var) {
        this.f40709a = h60Var;
    }

    @Override
    public final void G0(MessageObject messageObject) {
        ViewGroup viewGroup;
        h60 h60Var = this.f40709a;
        h60Var.Q.J0(true);
        h60Var.f36916c2.f38172f.setRoundRadius(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0, 0);
        viewGroup = ((org.telegram.ui.ActionBar.f3) h60Var).containerView;
        viewGroup.invalidate();
    }

    @Override
    public final void I(MessageObject messageObject) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.f40709a).containerView;
        viewGroup.invalidate();
    }

    @Override
    public final TextureView k0() {
        return null;
    }
}
