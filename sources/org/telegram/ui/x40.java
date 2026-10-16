package org.telegram.ui;

import android.view.TextureView;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class x40 implements rv0 {
    public final n60 f41427a;

    public x40(n60 n60Var) {
        this.f41427a = n60Var;
    }

    @Override
    public final void C0(MessageObject messageObject) {
        ViewGroup viewGroup;
        n60 n60Var = this.f41427a;
        n60Var.Q.I0(true);
        n60Var.f38167c2.f40772f.setRoundRadius(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0, 0);
        viewGroup = ((org.telegram.ui.ActionBar.e3) n60Var).containerView;
        viewGroup.invalidate();
    }

    @Override
    public final void H(MessageObject messageObject) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.e3) this.f41427a).containerView;
        viewGroup.invalidate();
    }

    @Override
    public final TextureView g0() {
        return null;
    }
}
