package org.telegram.ui.web;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.vc;
import org.telegram.ui.bo;
public final class f0 extends bo {
    public boolean Qc;
    public final TLRPC.User Rc;
    public final long Sc;
    public final d1 Tc;

    public f0(d1 d1Var, Bundle bundle, TLRPC.User user, long j3) {
        super(bundle);
        this.Tc = d1Var;
        this.Rc = user;
        this.Sc = j3;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.Qc) {
            this.Qc = true;
            vc.a0(this).M(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.Rc)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.Tc.U)), new ai.j(this, this.Sc, 28)), R.raw.contact_check).j();
        }
    }
}
