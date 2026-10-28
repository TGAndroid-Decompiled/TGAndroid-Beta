package org.telegram.ui.web;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.wc;
import org.telegram.ui.nh0;
import org.telegram.ui.wn;
public final class e0 extends wn {
    public boolean f44730od;
    public final TLRPC.User f44731pd;
    public final long f44732qd;
    public final a1 f44733rd;

    public e0(a1 a1Var, Bundle bundle, TLRPC.User user, long j10) {
        super(bundle);
        this.f44733rd = a1Var;
        this.f44731pd = user;
        this.f44732qd = j10;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f44730od) {
            this.f44730od = true;
            wc.b0(this).M(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.f44731pd)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.f44733rd.U)), new nh0(this, this.f44732qd, 2)), R.raw.contact_check).j();
        }
    }
}
