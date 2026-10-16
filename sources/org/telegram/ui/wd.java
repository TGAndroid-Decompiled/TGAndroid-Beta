package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class wd implements View.OnClickListener {
    public final int f40935a = 1;
    public final int f40936b;
    public final long f40937c;
    public final FrameLayout d;
    public final Object e;

    public wd(int i10, di.d dVar, org.telegram.ui.ActionBar.e3 e3Var, long j10) {
        this.f40936b = i10;
        this.d = dVar;
        this.e = e3Var;
        this.f40937c = j10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40935a) {
            case 0:
                qe qeVar = (qe) this.d;
                Context context = (Context) this.e;
                if (view.isEnabled()) {
                    di.d dVar = qeVar.T0;
                    if (!dVar.N) {
                        dVar.setLoading(true);
                        TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
                        int i10 = this.f40936b;
                        tL_payments_getStarsRevenueAdsAccountUrl.peer = MessagesController.getInstance(i10).getInputPeer(this.f40937c);
                        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new bi.m1(24, qeVar, context));
                        return;
                    }
                    return;
                }
                return;
            default:
                di.d dVar2 = (di.d) this.d;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.e;
                TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
                createconferencecall.random_id = Utilities.random.nextInt();
                int i11 = this.f40936b;
                ConnectionsManager.getInstance(i11).sendRequest(createconferencecall, new bi.w7(i11, dVar2, e3Var, this.f40937c));
                return;
        }
    }

    public wd(qe qeVar, int i10, long j10, Context context) {
        this.d = qeVar;
        this.f40936b = i10;
        this.f40937c = j10;
        this.e = context;
    }
}
