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
    public final int f41078a = 1;
    public final int f41079b;
    public final long f41080c;
    public final FrameLayout d;
    public final Object e;

    public sd(int i10, ei.d dVar, org.telegram.ui.ActionBar.f3 f3Var, long j10) {
        this.f41079b = i10;
        this.d = dVar;
        this.e = f3Var;
        this.f41080c = j10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41078a) {
            case 0:
                ke keVar = (ke) this.d;
                Context context = (Context) this.e;
                if (view.isEnabled()) {
                    ei.d dVar = keVar.T0;
                    if (!dVar.N) {
                        dVar.setLoading(true);
                        TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
                        int i10 = this.f41079b;
                        tL_payments_getStarsRevenueAdsAccountUrl.peer = MessagesController.getInstance(i10).getInputPeer(this.f41080c);
                        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new xc(1, keVar, context));
                        return;
                    }
                    return;
                }
                return;
            default:
                ei.d dVar2 = (ei.d) this.d;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.e;
                TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
                createconferencecall.random_id = Utilities.random.nextInt();
                int i11 = this.f41079b;
                ConnectionsManager.getInstance(i11).sendRequest(createconferencecall, new ai.c0(i11, dVar2, f3Var, this.f41080c));
                return;
        }
    }

    public sd(ke keVar, int i10, long j10, Context context) {
        this.d = keVar;
        this.f41079b = i10;
        this.f41080c = j10;
        this.e = context;
    }
}
