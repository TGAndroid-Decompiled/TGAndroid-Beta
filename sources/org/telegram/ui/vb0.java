package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class vb0 extends xn {
    public boolean Nc;
    public final TLRPC.User Oc;
    public final TLRPC.User[] Pc;
    public final long Qc;

    public vb0(Bundle bundle, TLRPC.User user, TLRPC.User[] userArr, long j10) {
        super(bundle);
        this.Oc = user;
        this.Pc = userArr;
        this.Qc = j10;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.Nc) {
            this.Nc = true;
            org.telegram.ui.Components.qc.a0(this).M(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.Oc)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.Pc[0])), new gg.y1(this, this.Qc, 22)), R.raw.contact_check).j();
        }
    }
}
