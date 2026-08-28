package org.telegram.ui;

import android.view.TextureView;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class z30 implements ju0 {
    public final o50 f45016a;

    public z30(o50 o50Var) {
        this.f45016a = o50Var;
    }

    @Override
    public final TextureView G() {
        return null;
    }

    @Override
    public final void x0(MessageObject messageObject) {
        ViewGroup viewGroup;
        o50 o50Var = this.f45016a;
        o50Var.M.I0(true);
        o50Var.Y1.f40817f.setRoundRadius(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0, 0);
        viewGroup = ((org.telegram.ui.ActionBar.f3) o50Var).containerView;
        viewGroup.invalidate();
    }

    @Override
    public final void y(MessageObject messageObject) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.f45016a).containerView;
        viewGroup.invalidate();
    }
}
