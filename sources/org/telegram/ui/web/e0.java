package org.telegram.ui.web;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.wc;
import org.telegram.ui.lh0;
import org.telegram.ui.un;
public final class e0 extends un {
    public boolean f45219kd;
    public final TLRPC.User f45220ld;
    public final long f45221md;
    public final a1 f45222nd;

    public e0(a1 a1Var, Bundle bundle, TLRPC.User user, long j10) {
        super(bundle);
        this.f45222nd = a1Var;
        this.f45220ld = user;
        this.f45221md = j10;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f45219kd) {
            this.f45219kd = true;
            wc.b0(this).M(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.f45220ld)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.f45222nd.U)), new lh0(this, this.f45221md, 2)), R.raw.contact_check).j();
        }
    }
}
