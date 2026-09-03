package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class rd implements Runnable {
    public final int f37800a;
    public final me f37801b;

    public rd(me meVar, int i10) {
        this.f37800a = i10;
        this.f37801b = meVar;
    }

    @Override
    public final void run() {
        switch (this.f37800a) {
            case 0:
                ze.d.s(this.f37801b.getContext(), LocaleController.getString(R.string.MonetizationStarsInfoLink));
                return;
            case 1:
                org.telegram.ui.Components.g61 g61Var = this.f37801b.X0;
                if (g61Var != null) {
                    g61Var.V2.N(true);
                    return;
                }
                return;
            case 2:
                me meVar = this.f37801b;
                meVar.getClass();
                try {
                    org.telegram.ui.Components.rl0 currentListView = meVar.f36038b1.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 3:
                me meVar2 = this.f37801b;
                int i10 = meVar2.f36058v0;
                AndroidUtilities.cancelRunOnUIThread(meVar2.f36054s1);
                if (meVar2.f36046j1 != meVar2.f36047k1) {
                    TLRPC.TL_channels_restrictSponsoredMessages tL_channels_restrictSponsoredMessages = new TLRPC.TL_channels_restrictSponsoredMessages();
                    tL_channels_restrictSponsoredMessages.channel = MessagesController.getInstance(i10).getInputChannel(-meVar2.f36059w0);
                    tL_channels_restrictSponsoredMessages.restricted = meVar2.f36046j1;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_channels_restrictSponsoredMessages, new xd(meVar2, 0));
                    return;
                }
                return;
            case 4:
                me meVar3 = this.f37801b;
                meVar3.f36047k1 = meVar3.f36046j1;
                return;
            case 5:
                this.f37801b.Q0.setLoading(false);
                return;
            case 6:
                this.f37801b.Z0.setVisibility(8);
                return;
            case 7:
                this.f37801b.Z0.setVisibility(8);
                return;
            default:
                ze.d.s(this.f37801b.getContext(), LocaleController.getString(R.string.MonetizationBalanceInfoLink));
                return;
        }
    }
}
