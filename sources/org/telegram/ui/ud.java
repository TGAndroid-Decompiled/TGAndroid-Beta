package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class ud implements Runnable {
    public final int f40374a;
    public final qe f40375b;

    public ud(qe qeVar, int i10) {
        this.f40374a = i10;
        this.f40375b = qeVar;
    }

    @Override
    public final void run() {
        switch (this.f40374a) {
            case 0:
                pf.d.r(this.f40375b.getContext(), LocaleController.getString(R.string.MonetizationStarsInfoLink));
                return;
            case 1:
                org.telegram.ui.Components.i71 i71Var = this.f40375b.f39117a1;
                if (i71Var != null) {
                    i71Var.W2.N(true);
                    return;
                }
                return;
            case 2:
                qe qeVar = this.f40375b;
                qeVar.getClass();
                try {
                    org.telegram.ui.Components.mm0 currentListView = qeVar.f39121e1.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 3:
                qe qeVar2 = this.f40375b;
                int i10 = qeVar2.f39141y0;
                AndroidUtilities.cancelRunOnUIThread(qeVar2.f39137v1);
                if (qeVar2.f39128m1 != qeVar2.f39129n1) {
                    TLRPC.TL_channels_restrictSponsoredMessages tL_channels_restrictSponsoredMessages = new TLRPC.TL_channels_restrictSponsoredMessages();
                    tL_channels_restrictSponsoredMessages.channel = MessagesController.getInstance(i10).getInputChannel(-qeVar2.f39142z0);
                    tL_channels_restrictSponsoredMessages.restricted = qeVar2.f39128m1;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_channels_restrictSponsoredMessages, new ae(qeVar2, 0));
                    return;
                }
                return;
            case 4:
                qe qeVar3 = this.f40375b;
                qeVar3.f39129n1 = qeVar3.f39128m1;
                return;
            case 5:
                this.f40375b.T0.setLoading(false);
                return;
            case 6:
                this.f40375b.f39119c1.setVisibility(8);
                return;
            case 7:
                this.f40375b.f39119c1.setVisibility(8);
                return;
            default:
                pf.d.r(this.f40375b.getContext(), LocaleController.getString(R.string.MonetizationBalanceInfoLink));
                return;
        }
    }
}
