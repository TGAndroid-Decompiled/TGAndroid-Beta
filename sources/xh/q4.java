package xh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class q4 implements RequestDelegate {
    public final int f45924a = 1;
    public final v5 f45925b;
    public final Utilities.Callback2 f45926c;
    public final Context d;
    public final org.telegram.ui.ActionBar.f6 e;
    public final long f45927f;
    public final String f45928g;
    public final long h;
    public final TLObject f45929i;
    public final TLObject f45930j;

    public q4(v5 v5Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.f6 f6Var, long j3, String str, long j10, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f45925b = v5Var;
        this.f45926c = callback2;
        this.d = context;
        this.e = f6Var;
        this.f45927f = j3;
        this.f45928g = str;
        this.h = j10;
        this.f45929i = tLObject;
        this.f45930j = tL_textWithEntities;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f45924a) {
            case 0:
                AndroidUtilities.runOnUIThread(new r4(this.f45925b, tLObject, tL_error, this.f45926c, this.d, this.e, this.f45927f, this.f45928g, (TLRPC.TL_payments_paymentFormStarGift) this.f45929i, (TL_stars.StarGift) this.f45930j, this.h));
                return;
            default:
                AndroidUtilities.runOnUIThread(new r4(this.f45925b, tLObject, tL_error, this.f45926c, this.d, this.e, this.f45927f, this.f45928g, this.h, this.f45929i, (TLRPC.TL_textWithEntities) this.f45930j));
                return;
        }
    }

    public q4(v5 v5Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.f6 f6Var, long j3, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10) {
        this.f45925b = v5Var;
        this.f45926c = callback2;
        this.d = context;
        this.e = f6Var;
        this.f45927f = j3;
        this.f45928g = str;
        this.f45929i = tL_payments_paymentFormStarGift;
        this.f45930j = starGift;
        this.h = j10;
    }
}
