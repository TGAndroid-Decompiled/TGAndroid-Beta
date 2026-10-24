package org.telegram.ui.web;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.vc;
import org.telegram.ui.nh0;
import org.telegram.ui.sn;
public final class f0 extends sn {
    public boolean f43094ed;
    public final TLRPC.User f43095fd;
    public final long f43096gd;
    public final b1 f43097hd;

    public f0(b1 b1Var, Bundle bundle, TLRPC.User user, long j10) {
        super(bundle);
        this.f43097hd = b1Var;
        this.f43095fd = user;
        this.f43096gd = j10;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f43094ed) {
            this.f43094ed = true;
            vc.a0(this).M(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.f43095fd)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.f43097hd.U)), new nh0(this, this.f43096gd, 2)), R.raw.contact_check).j();
        }
    }
}
