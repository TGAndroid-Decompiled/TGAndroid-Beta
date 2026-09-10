package org.telegram.ui.web;

import android.os.Bundle;
import bi.va;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.wc;
import org.telegram.ui.eo;
public final class f0 extends eo {
    public boolean Qc;
    public final TLRPC.User Rc;
    public final long Sc;
    public final c1 Tc;

    public f0(c1 c1Var, Bundle bundle, TLRPC.User user, long j3) {
        super(bundle);
        this.Tc = c1Var;
        this.Rc = user;
        this.Sc = j3;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.Qc) {
            this.Qc = true;
            wc.a0(this).M(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.Rc)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.Tc.U)), new va(this, this.Sc, 23)), R.raw.contact_check).j();
        }
    }
}
