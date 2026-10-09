package org.telegram.ui;

import android.view.TextureView;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class r40 implements mv0 {
    public final g60 f41262a;

    public r40(g60 g60Var) {
        this.f41262a = g60Var;
    }

    @Override
    public final void H(MessageObject messageObject) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.f41262a).containerView;
        viewGroup.invalidate();
    }

    @Override
    public final TextureView d0() {
        return null;
    }

    @Override
    public final void w0(MessageObject messageObject) {
        ViewGroup viewGroup;
        g60 g60Var = this.f41262a;
        g60Var.Q.I0(true);
        g60Var.f37797c2.f41196f.setRoundRadius(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0, 0);
        viewGroup = ((org.telegram.ui.ActionBar.f3) g60Var).containerView;
        viewGroup.invalidate();
    }
}
