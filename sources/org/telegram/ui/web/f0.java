package org.telegram.ui.web;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xc;
import org.telegram.ui.oh0;
import org.telegram.ui.sn;
public final class f0 extends sn {
    public boolean f43105ed;
    public final TLRPC.User f43106fd;
    public final long f43107gd;
    public final b1 f43108hd;

    public f0(b1 b1Var, Bundle bundle, TLRPC.User user, long j10) {
        super(bundle);
        this.f43108hd = b1Var;
        this.f43106fd = user;
        this.f43107gd = j10;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f43105ed) {
            this.f43105ed = true;
            xc.a0(this).M(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.f43106fd)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.f43108hd.U)), new oh0(this, this.f43107gd, 2)), R.raw.contact_check).j();
        }
    }
}
