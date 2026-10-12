package org.telegram.ui;

import android.view.TextureView;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class x40 implements sv0 {
    public final n60 f41743a;

    public x40(n60 n60Var) {
        this.f41743a = n60Var;
    }

    @Override
    public final void D0(MessageObject messageObject) {
        ViewGroup viewGroup;
        n60 n60Var = this.f41743a;
        n60Var.Q.I0(true);
        n60Var.f38452c2.f41667f.setRoundRadius(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0, 0);
        viewGroup = ((org.telegram.ui.ActionBar.e3) n60Var).containerView;
        viewGroup.invalidate();
    }

    @Override
    public final void H(MessageObject messageObject) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.e3) this.f41743a).containerView;
        viewGroup.invalidate();
    }

    @Override
    public final TextureView g0() {
        return null;
    }
}
