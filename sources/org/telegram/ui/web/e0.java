package org.telegram.ui.web;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xc;
import org.telegram.ui.wn;
public final class e0 extends wn {
    public boolean Pc;
    public final TLRPC.User Qc;
    public final long Rc;
    public final b1 Sc;

    public e0(b1 b1Var, Bundle bundle, TLRPC.User user, long j3) {
        super(bundle);
        this.Sc = b1Var;
        this.Qc = user;
        this.Rc = j3;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.Pc) {
            this.Pc = true;
            xc.a0(this).M(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.Qc)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.Sc.U)), new ai.j(this, this.Rc, 28)), R.raw.contact_check).j();
        }
    }
}
