package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class ud implements Runnable {
    public final int f40649a;
    public final qe f40650b;

    public ud(qe qeVar, int i10) {
        this.f40649a = i10;
        this.f40650b = qeVar;
    }

    @Override
    public final void run() {
        switch (this.f40649a) {
            case 0:
                pf.d.s(this.f40650b.getContext(), LocaleController.getString(R.string.MonetizationStarsInfoLink));
                return;
            case 1:
                org.telegram.ui.Components.h71 h71Var = this.f40650b.f39395a1;
                if (h71Var != null) {
                    h71Var.W2.N(true);
                    return;
                }
                return;
            case 2:
                qe qeVar = this.f40650b;
                qeVar.getClass();
                try {
                    org.telegram.ui.Components.mm0 currentListView = qeVar.f39399e1.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 3:
                qe qeVar2 = this.f40650b;
                int i10 = qeVar2.f39419y0;
                AndroidUtilities.cancelRunOnUIThread(qeVar2.f39415v1);
                if (qeVar2.f39406m1 != qeVar2.f39407n1) {
                    TLRPC.TL_channels_restrictSponsoredMessages tL_channels_restrictSponsoredMessages = new TLRPC.TL_channels_restrictSponsoredMessages();
                    tL_channels_restrictSponsoredMessages.channel = MessagesController.getInstance(i10).getInputChannel(-qeVar2.f39420z0);
                    tL_channels_restrictSponsoredMessages.restricted = qeVar2.f39406m1;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_channels_restrictSponsoredMessages, new ae(qeVar2, 0));
                    return;
                }
                return;
            case 4:
                qe qeVar3 = this.f40650b;
                qeVar3.f39407n1 = qeVar3.f39406m1;
                return;
            case 5:
                this.f40650b.T0.setLoading(false);
                return;
            case 6:
                this.f40650b.f39397c1.setVisibility(8);
                return;
            case 7:
                this.f40650b.f39397c1.setVisibility(8);
                return;
            default:
                pf.d.s(this.f40650b.getContext(), LocaleController.getString(R.string.MonetizationBalanceInfoLink));
                return;
        }
    }
}
