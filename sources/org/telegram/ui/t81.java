package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class t81 extends org.telegram.ui.Components.zq0 {
    public final a91 X0;

    public t81(a91 a91Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.X0 = a91Var;
    }

    @Override
    public final void O0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new wx0(this, iVar, i10, 29), 250L);
    }
}
