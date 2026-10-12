package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class sd implements Runnable {
    public final int f41898a;
    public final oe f41899b;

    public sd(oe oeVar, int i10) {
        this.f41898a = i10;
        this.f41899b = oeVar;
    }

    @Override
    public final void run() {
        switch (this.f41898a) {
            case 0:
                of.f.s(this.f41899b.getContext(), LocaleController.getString(R.string.MonetizationStarsInfoLink));
                return;
            case 1:
                org.telegram.ui.Components.p71 p71Var = this.f41899b.f40655a1;
                if (p71Var != null) {
                    p71Var.W2.N(true);
                    return;
                }
                return;
            case 2:
                oe oeVar = this.f41899b;
                oeVar.getClass();
                try {
                    org.telegram.ui.Components.wm0 currentListView = oeVar.f40659e1.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 3:
                oe oeVar2 = this.f41899b;
                int i10 = oeVar2.f40679y0;
                AndroidUtilities.cancelRunOnUIThread(oeVar2.f40675v1);
                if (oeVar2.f40666m1 != oeVar2.f40667n1) {
                    TLRPC.TL_channels_restrictSponsoredMessages tL_channels_restrictSponsoredMessages = new TLRPC.TL_channels_restrictSponsoredMessages();
                    tL_channels_restrictSponsoredMessages.channel = MessagesController.getInstance(i10).getInputChannel(-oeVar2.f40680z0);
                    tL_channels_restrictSponsoredMessages.restricted = oeVar2.f40666m1;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_channels_restrictSponsoredMessages, new yd(oeVar2, 0));
                    return;
                }
                return;
            case 4:
                oe oeVar3 = this.f41899b;
                oeVar3.f40667n1 = oeVar3.f40666m1;
                return;
            case 5:
                this.f41899b.T0.setLoading(false);
                return;
            case 6:
                this.f41899b.f40657c1.setVisibility(8);
                return;
            case 7:
                this.f41899b.f40657c1.setVisibility(8);
                return;
            default:
                of.f.s(this.f41899b.getContext(), LocaleController.getString(R.string.MonetizationBalanceInfoLink));
                return;
        }
    }
}
