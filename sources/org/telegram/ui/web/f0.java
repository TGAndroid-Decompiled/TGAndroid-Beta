package org.telegram.ui.web;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.yc;
import org.telegram.ui.yn;
public final class f0 extends yn {
    public boolean Kc;
    public final TLRPC.User Lc;
    public final long Mc;
    public final c1 Nc;

    public f0(c1 c1Var, Bundle bundle, TLRPC.User user, long j3) {
        super(bundle);
        this.Nc = c1Var;
        this.Lc = user;
        this.Mc = j3;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.Kc) {
            this.Kc = true;
            yc.a0(this).M(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.Lc)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.Nc.U)), new ai.j(this, this.Mc, 28)), R.raw.contact_check).j();
        }
    }
}
