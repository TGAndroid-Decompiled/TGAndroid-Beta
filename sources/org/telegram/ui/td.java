package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class td implements View.OnClickListener {
    public final int f38464a = 1;
    public final int f38465b;
    public final long f38466c;
    public final FrameLayout d;
    public final Object e;

    public td(int i10, ph.d dVar, org.telegram.ui.ActionBar.g3 g3Var, long j10) {
        this.f38465b = i10;
        this.d = dVar;
        this.e = g3Var;
        this.f38466c = j10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38464a) {
            case 0:
                me meVar = (me) this.d;
                Context context = (Context) this.e;
                if (view.isEnabled()) {
                    ph.d dVar = meVar.Q0;
                    if (!dVar.K) {
                        dVar.setLoading(true);
                        TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
                        int i10 = this.f38465b;
                        tL_payments_getStarsRevenueAdsAccountUrl.peer = MessagesController.getInstance(i10).getInputPeer(this.f38466c);
                        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new dg.d3(24, meVar, context));
                        return;
                    }
                    return;
                }
                return;
            default:
                ph.d dVar2 = (ph.d) this.d;
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) this.e;
                TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
                createconferencecall.random_id = Utilities.random.nextInt();
                int i11 = this.f38465b;
                ConnectionsManager.getInstance(i11).sendRequest(createconferencecall, new lh.u(i11, dVar2, g3Var, this.f38466c));
                return;
        }
    }

    public td(me meVar, int i10, long j10, Context context) {
        this.d = meVar;
        this.f38465b = i10;
        this.f38466c = j10;
        this.e = context;
    }
}
