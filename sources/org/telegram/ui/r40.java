package org.telegram.ui;

import android.view.TextureView;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class r40 implements lv0 {
    public final g60 f41318a;

    public r40(g60 g60Var) {
        this.f41318a = g60Var;
    }

    @Override
    public final void H(MessageObject messageObject) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.e3) this.f41318a).containerView;
        viewGroup.invalidate();
    }

    @Override
    public final TextureView d0() {
        return null;
    }

    @Override
    public final void w0(MessageObject messageObject) {
        ViewGroup viewGroup;
        g60 g60Var = this.f41318a;
        g60Var.Q.I0(true);
        g60Var.f37879c2.f40969f.setRoundRadius(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0, 0);
        viewGroup = ((org.telegram.ui.ActionBar.e3) g60Var).containerView;
        viewGroup.invalidate();
    }
}
