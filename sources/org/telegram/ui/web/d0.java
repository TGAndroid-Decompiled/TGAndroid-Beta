package org.telegram.ui.web;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.mc;
import org.telegram.ui.rn;

public final class d0 extends rn {
    public boolean Mc;
    public final TLRPC.User Nc;
    public final long Oc;
    public final z0 Pc;

    public d0(z0 z0Var, Bundle bundle, TLRPC.User user, long j10) {
        super(bundle);
        this.Pc = z0Var;
        this.Nc = user;
        this.Oc = j10;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.Mc) {
            return;
        }
        this.Mc = true;
        mc.a0(this).M(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.Nc)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.Pc.Q)), new c0(this, this.Oc, 0)), R.raw.contact_check).j();
    }
}
