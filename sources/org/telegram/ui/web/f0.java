package org.telegram.ui.web;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.zc;
import org.telegram.ui.fo;
public final class f0 extends fo {
    public boolean Qc;
    public final TLRPC.User Rc;
    public final long Sc;
    public final b1 Tc;

    public f0(b1 b1Var, Bundle bundle, TLRPC.User user, long j10) {
        super(bundle);
        this.Tc = b1Var;
        this.Rc = user;
        this.Sc = j10;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.Qc) {
            this.Qc = true;
            zc.a0(this).M(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.Rc)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.Tc.U)), new e0(this, this.Sc, 0)), R.raw.contact_check).j();
        }
    }
}
