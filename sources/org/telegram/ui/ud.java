package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class ud implements View.OnClickListener {
    public final int f42493a = 1;
    public final int f42494b;
    public final long f42495c;
    public final FrameLayout d;
    public final Object f42496e;

    public ud(int i10, ci.d dVar, org.telegram.ui.ActionBar.e3 e3Var, long j3) {
        this.f42494b = i10;
        this.d = dVar;
        this.f42496e = e3Var;
        this.f42495c = j3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42493a) {
            case 0:
                oe oeVar = (oe) this.d;
                Context context = (Context) this.f42496e;
                if (view.isEnabled()) {
                    ci.d dVar = oeVar.T0;
                    if (!dVar.N) {
                        dVar.setLoading(true);
                        TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
                        int i10 = this.f42494b;
                        tL_payments_getStarsRevenueAdsAccountUrl.peer = MessagesController.getInstance(i10).getInputPeer(this.f42495c);
                        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new ai.v1(24, oeVar, context));
                        return;
                    }
                    return;
                }
                return;
            default:
                ci.d dVar2 = (ci.d) this.d;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f42496e;
                TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
                createconferencecall.random_id = Utilities.random.nextInt();
                int i11 = this.f42494b;
                ConnectionsManager.getInstance(i11).sendRequest(createconferencecall, new ai.l8(i11, dVar2, e3Var, this.f42495c));
                return;
        }
    }

    public ud(oe oeVar, int i10, long j3, Context context) {
        this.d = oeVar;
        this.f42494b = i10;
        this.f42495c = j3;
        this.f42496e = context;
    }
}
