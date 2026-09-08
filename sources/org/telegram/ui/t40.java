package org.telegram.ui;

import android.view.TextureView;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class t40 implements kv0 {
    public final j60 f40642a;

    public t40(j60 j60Var) {
        this.f40642a = j60Var;
    }

    @Override
    public final void E0(MessageObject messageObject) {
        ViewGroup viewGroup;
        j60 j60Var = this.f40642a;
        j60Var.Q.I0(true);
        j60Var.f37550c2.f39357f.setRoundRadius(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0, 0);
        viewGroup = ((org.telegram.ui.ActionBar.f3) j60Var).containerView;
        viewGroup.invalidate();
    }

    @Override
    public final void H(MessageObject messageObject) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.f40642a).containerView;
        viewGroup.invalidate();
    }

    @Override
    public final TextureView i0() {
        return null;
    }
}
