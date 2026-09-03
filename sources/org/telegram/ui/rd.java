package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class rd implements View.OnClickListener {
    public final int f40816a = 1;
    public final int f40817b;
    public final long f40818c;
    public final FrameLayout d;
    public final Object f40819e;

    public rd(int i10, qh.d dVar, org.telegram.ui.ActionBar.h3 h3Var, long j10) {
        this.f40817b = i10;
        this.d = dVar;
        this.f40819e = h3Var;
        this.f40818c = j10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40816a) {
            case 0:
                ke keVar = (ke) this.d;
                Context context = (Context) this.f40819e;
                if (view.isEnabled()) {
                    qh.d dVar = keVar.Q0;
                    if (!dVar.K) {
                        dVar.setLoading(true);
                        TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
                        int i10 = this.f40817b;
                        tL_payments_getStarsRevenueAdsAccountUrl.peer = MessagesController.getInstance(i10).getInputPeer(this.f40818c);
                        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new eg.b3(24, keVar, context));
                        return;
                    }
                    return;
                }
                return;
            default:
                qh.d dVar2 = (qh.d) this.d;
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.f40819e;
                TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
                createconferencecall.random_id = Utilities.random.nextInt();
                int i11 = this.f40817b;
                ConnectionsManager.getInstance(i11).sendRequest(createconferencecall, new mh.t(i11, dVar2, h3Var, this.f40818c));
                return;
        }
    }

    public rd(ke keVar, int i10, long j10, Context context) {
        this.d = keVar;
        this.f40817b = i10;
        this.f40818c = j10;
        this.f40819e = context;
    }
}
