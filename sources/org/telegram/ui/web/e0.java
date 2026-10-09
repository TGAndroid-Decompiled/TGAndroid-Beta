package org.telegram.ui.web;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ad;
import org.telegram.ui.zn;
public final class e0 extends zn {
    public boolean Qc;
    public final TLRPC.User Rc;
    public final long Sc;
    public final b1 Tc;

    public e0(b1 b1Var, Bundle bundle, TLRPC.User user, long j3) {
        super(bundle);
        this.Tc = b1Var;
        this.Rc = user;
        this.Sc = j3;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.Qc) {
            this.Qc = true;
            ad.a0(this).M(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.Rc)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.Tc.U)), new d0(this, this.Sc, 0)), R.raw.contact_check).j();
        }
    }
}
