package yh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class q4 implements RequestDelegate {
    public final int f47905a = 1;
    public final s5 f47906b;
    public final Utilities.Callback2 f47907c;
    public final Context d;
    public final org.telegram.ui.ActionBar.d6 e;
    public final long f47908f;
    public final String f47909g;
    public final long h;
    public final TLObject f47910i;
    public final TLObject f47911j;

    public q4(s5 s5Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.d6 d6Var, long j3, String str, long j10, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f47906b = s5Var;
        this.f47907c = callback2;
        this.d = context;
        this.e = d6Var;
        this.f47908f = j3;
        this.f47909g = str;
        this.h = j10;
        this.f47910i = tLObject;
        this.f47911j = tL_textWithEntities;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47905a) {
            case 0:
                AndroidUtilities.runOnUIThread(new r4(this.f47906b, tLObject, tL_error, this.f47907c, this.d, this.e, this.f47908f, this.f47909g, (TLRPC.TL_payments_paymentFormStarGift) this.f47910i, (TL_stars.StarGift) this.f47911j, this.h));
                return;
            default:
                AndroidUtilities.runOnUIThread(new r4(this.f47906b, tLObject, tL_error, this.f47907c, this.d, this.e, this.f47908f, this.f47909g, this.h, this.f47910i, (TLRPC.TL_textWithEntities) this.f47911j));
                return;
        }
    }

    public q4(s5 s5Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.d6 d6Var, long j3, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10) {
        this.f47906b = s5Var;
        this.f47907c = callback2;
        this.d = context;
        this.e = d6Var;
        this.f47908f = j3;
        this.f47909g = str;
        this.f47910i = tL_payments_paymentFormStarGift;
        this.f47911j = starGift;
        this.h = j10;
    }
}
