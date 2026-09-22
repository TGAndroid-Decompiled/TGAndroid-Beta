package org.telegram.ui;

import android.view.TextureView;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class t40 implements lv0 {
    public final i60 f37641a;

    public t40(i60 i60Var) {
        this.f37641a = i60Var;
    }

    @Override
    public final void D0(MessageObject messageObject) {
        ViewGroup viewGroup;
        i60 i60Var = this.f37641a;
        i60Var.Q.J0(true);
        i60Var.f34390c2.f36718f.setRoundRadius(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0, 0);
        viewGroup = ((org.telegram.ui.ActionBar.f3) i60Var).containerView;
        viewGroup.invalidate();
    }

    @Override
    public final void H(MessageObject messageObject) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.f37641a).containerView;
        viewGroup.invalidate();
    }

    @Override
    public final TextureView h0() {
        return null;
    }
}
