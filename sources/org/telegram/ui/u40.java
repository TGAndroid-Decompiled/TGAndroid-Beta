package org.telegram.ui;

import android.view.TextureView;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class u40 implements nv0 {
    public final j60 f37107a;

    public u40(j60 j60Var) {
        this.f37107a = j60Var;
    }

    @Override
    public final void D0(MessageObject messageObject) {
        ViewGroup viewGroup;
        j60 j60Var = this.f37107a;
        j60Var.Q.I0(true);
        j60Var.f33946c2.f36461f.setRoundRadius(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0, 0);
        viewGroup = ((org.telegram.ui.ActionBar.h3) j60Var).containerView;
        viewGroup.invalidate();
    }

    @Override
    public final void G(MessageObject messageObject) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.h3) this.f37107a).containerView;
        viewGroup.invalidate();
    }

    @Override
    public final TextureView g0() {
        return null;
    }
}
