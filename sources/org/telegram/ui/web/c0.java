package org.telegram.ui.web;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.oc;
import org.telegram.ui.qn;
public final class c0 extends qn {
    public boolean Mc;
    public final TLRPC.User Nc;
    public final long Oc;
    public final y0 Pc;

    public c0(y0 y0Var, Bundle bundle, TLRPC.User user, long j10) {
        super(bundle);
        this.Pc = y0Var;
        this.Nc = user;
        this.Oc = j10;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.Mc) {
            this.Mc = true;
            oc.a0(this).M(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.Nc)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.Pc.Q)), new b0(this, this.Oc, 0)), R.raw.contact_check).j();
        }
    }
}
