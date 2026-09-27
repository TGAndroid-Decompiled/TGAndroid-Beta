package org.telegram.ui;

import android.view.TextureView;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class r40 implements gv0 {
    public final g60 f36991a;

    public r40(g60 g60Var) {
        this.f36991a = g60Var;
    }

    @Override
    public final void E0(MessageObject messageObject) {
        ViewGroup viewGroup;
        g60 g60Var = this.f36991a;
        g60Var.Q.J0(true);
        g60Var.f33736c2.f35167f.setRoundRadius(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0, 0);
        viewGroup = ((org.telegram.ui.ActionBar.g3) g60Var).containerView;
        viewGroup.invalidate();
    }

    @Override
    public final void H(MessageObject messageObject) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.g3) this.f36991a).containerView;
        viewGroup.invalidate();
    }

    @Override
    public final TextureView j0() {
        return null;
    }
}
