package org.telegram.ui;

import android.view.TextureView;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class v40 implements nv0 {
    public final k60 f38273a;

    public v40(k60 k60Var) {
        this.f38273a = k60Var;
    }

    @Override
    public final void E0(MessageObject messageObject) {
        ViewGroup viewGroup;
        k60 k60Var = this.f38273a;
        k60Var.Q.J0(true);
        k60Var.f35022c2.f37314f.setRoundRadius(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0, 0);
        viewGroup = ((org.telegram.ui.ActionBar.g3) k60Var).containerView;
        viewGroup.invalidate();
    }

    @Override
    public final void H(MessageObject messageObject) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.g3) this.f38273a).containerView;
        viewGroup.invalidate();
    }

    @Override
    public final TextureView j0() {
        return null;
    }
}
