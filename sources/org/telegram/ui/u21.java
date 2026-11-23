package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.UndoView;
public final class u21 extends UndoView {
    public final SessionsActivity f52522k0;

    public u21(SessionsActivity sessionsActivity, Context context) {
        super(context);
        this.f52522k0 = sessionsActivity;
    }

    @Override
    public final void d(int i7, boolean z10) {
        int i10;
        if (!z10 && getCurrentInfoObject() != null) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) getCurrentInfoObject();
            TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
            resetauthorization.hash = tL_authorization.hash;
            i10 = ((org.telegram.ui.ActionBar.g2) this.f52522k0).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(resetauthorization, new d00(27, this, tL_authorization));
        }
        super.d(i7, z10);
    }
}
