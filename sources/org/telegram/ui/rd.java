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
    public final int f37982a = 1;
    public final int f37983b;
    public final long f37984c;
    public final FrameLayout d;
    public final Object e;

    public rd(int i10, ph.d dVar, org.telegram.ui.ActionBar.g3 g3Var, long j10) {
        this.f37983b = i10;
        this.d = dVar;
        this.e = g3Var;
        this.f37984c = j10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37982a) {
            case 0:
                ke keVar = (ke) this.d;
                Context context = (Context) this.e;
                if (view.isEnabled()) {
                    ph.d dVar = keVar.Q0;
                    if (!dVar.K) {
                        dVar.setLoading(true);
                        TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
                        int i10 = this.f37983b;
                        tL_payments_getStarsRevenueAdsAccountUrl.peer = MessagesController.getInstance(i10).getInputPeer(this.f37984c);
                        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new dg.d3(24, keVar, context));
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
                int i11 = this.f37983b;
                ConnectionsManager.getInstance(i11).sendRequest(createconferencecall, new lh.u(i11, dVar2, g3Var, this.f37984c));
                return;
        }
    }

    public rd(ke keVar, int i10, long j10, Context context) {
        this.d = keVar;
        this.f37983b = i10;
        this.f37984c = j10;
        this.e = context;
    }
}
