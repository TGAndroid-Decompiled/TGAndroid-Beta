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
    public final int f40788a = 1;
    public final int f40789b;
    public final long f40790c;
    public final FrameLayout d;
    public final Object f40791e;

    public td(int i10, ci.d dVar, org.telegram.ui.ActionBar.f3 f3Var, long j3) {
        this.f40789b = i10;
        this.d = dVar;
        this.f40791e = f3Var;
        this.f40790c = j3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40788a) {
            case 0:
                me meVar = (me) this.d;
                Context context = (Context) this.f40791e;
                if (view.isEnabled()) {
                    ci.d dVar = meVar.M1;
                    if (!dVar.N) {
                        dVar.setLoading(true);
                        TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
                        int i10 = this.f40789b;
                        tL_payments_getStarsRevenueAdsAccountUrl.peer = MessagesController.getInstance(i10).getInputPeer(this.f40790c);
                        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new ai.v1(24, meVar, context));
                        return;
                    }
                    return;
                }
                return;
            default:
                ci.d dVar2 = (ci.d) this.d;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f40791e;
                TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
                createconferencecall.random_id = Utilities.random.nextInt();
                int i11 = this.f40789b;
                ConnectionsManager.getInstance(i11).sendRequest(createconferencecall, new ai.k8(i11, dVar2, f3Var, this.f40790c));
                return;
        }
    }

    public td(me meVar, int i10, long j3, Context context) {
        this.d = meVar;
        this.f40789b = i10;
        this.f40790c = j3;
        this.f40791e = context;
    }
}
