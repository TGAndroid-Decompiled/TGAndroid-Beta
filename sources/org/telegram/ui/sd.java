package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class sd implements View.OnClickListener {
    public final int f37401a = 1;
    public final int f37402b;
    public final long f37403c;
    public final FrameLayout d;
    public final Object e;

    public sd(int i10, ci.d dVar, org.telegram.ui.ActionBar.g3 g3Var, long j3) {
        this.f37402b = i10;
        this.d = dVar;
        this.e = g3Var;
        this.f37403c = j3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37401a) {
            case 0:
                me meVar = (me) this.d;
                Context context = (Context) this.e;
                if (view.isEnabled()) {
                    ci.d dVar = meVar.T0;
                    if (!dVar.N) {
                        dVar.setLoading(true);
                        TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
                        int i10 = this.f37402b;
                        tL_payments_getStarsRevenueAdsAccountUrl.peer = MessagesController.getInstance(i10).getInputPeer(this.f37403c);
                        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new ai.v1(24, meVar, context));
                        return;
                    }
                    return;
                }
                return;
            default:
                ci.d dVar2 = (ci.d) this.d;
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) this.e;
                TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
                createconferencecall.random_id = Utilities.random.nextInt();
                int i11 = this.f37402b;
                ConnectionsManager.getInstance(i11).sendRequest(createconferencecall, new ai.k8(i11, dVar2, g3Var, this.f37403c));
                return;
        }
    }

    public sd(me meVar, int i10, long j3, Context context) {
        this.d = meVar;
        this.f37402b = i10;
        this.f37403c = j3;
        this.e = context;
    }
}
