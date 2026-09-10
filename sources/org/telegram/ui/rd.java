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
    public final int f36340a = 1;
    public final int f36341b;
    public final long f36342c;
    public final FrameLayout d;
    public final Object e;

    public rd(int i10, bi.d dVar, org.telegram.ui.ActionBar.h3 h3Var, long j3) {
        this.f36341b = i10;
        this.d = dVar;
        this.e = h3Var;
        this.f36342c = j3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36340a) {
            case 0:
                le leVar = (le) this.d;
                Context context = (Context) this.e;
                if (view.isEnabled()) {
                    bi.d dVar = leVar.T0;
                    if (!dVar.N) {
                        dVar.setLoading(true);
                        TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
                        int i10 = this.f36341b;
                        tL_payments_getStarsRevenueAdsAccountUrl.peer = MessagesController.getInstance(i10).getInputPeer(this.f36342c);
                        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new bi.o2(19, leVar, context));
                        return;
                    }
                    return;
                }
                return;
            default:
                bi.d dVar2 = (bi.d) this.d;
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.e;
                TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
                createconferencecall.random_id = Utilities.random.nextInt();
                int i11 = this.f36341b;
                ConnectionsManager.getInstance(i11).sendRequest(createconferencecall, new org.telegram.messenger.u0(i11, dVar2, h3Var, this.f36342c));
                return;
        }
    }

    public rd(le leVar, int i10, long j3, Context context) {
        this.d = leVar;
        this.f36341b = i10;
        this.f36342c = j3;
        this.e = context;
    }
}
