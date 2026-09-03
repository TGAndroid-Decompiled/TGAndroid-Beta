package org.telegram.ui.web;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.qc;
import org.telegram.ui.zn;
public final class e0 extends zn {
    public boolean Nc;
    public final TLRPC.User Oc;
    public final long Pc;
    public final c1 Qc;

    public e0(c1 c1Var, Bundle bundle, TLRPC.User user, long j10) {
        super(bundle);
        this.Qc = c1Var;
        this.Oc = user;
        this.Pc = j10;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.Nc) {
            this.Nc = true;
            qc.a0(this).M(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.Oc)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.Qc.R)), new gg.y1(this, this.Pc, 24)), R.raw.contact_check).j();
        }
    }
}
