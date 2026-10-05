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
    public final int f40851a = 1;
    public final int f40852b;
    public final long f40853c;
    public final FrameLayout d;
    public final Object f40854e;

    public td(int i10, ci.d dVar, org.telegram.ui.ActionBar.f3 f3Var, long j3) {
        this.f40852b = i10;
        this.d = dVar;
        this.f40854e = f3Var;
        this.f40853c = j3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40851a) {
            case 0:
                me meVar = (me) this.d;
                Context context = (Context) this.f40854e;
                if (view.isEnabled()) {
                    ci.d dVar = meVar.J0;
                    if (!dVar.N) {
                        dVar.setLoading(true);
                        TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
                        int i10 = this.f40852b;
                        tL_payments_getStarsRevenueAdsAccountUrl.peer = MessagesController.getInstance(i10).getInputPeer(this.f40853c);
                        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new ai.v1(24, meVar, context));
                        return;
                    }
                    return;
                }
                return;
            default:
                ci.d dVar2 = (ci.d) this.d;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f40854e;
                TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
                createconferencecall.random_id = Utilities.random.nextInt();
                int i11 = this.f40852b;
                ConnectionsManager.getInstance(i11).sendRequest(createconferencecall, new ai.k8(i11, dVar2, f3Var, this.f40853c));
                return;
        }
    }

    public td(me meVar, int i10, long j3, Context context) {
        this.d = meVar;
        this.f40852b = i10;
        this.f40853c = j3;
        this.f40854e = context;
    }
}
