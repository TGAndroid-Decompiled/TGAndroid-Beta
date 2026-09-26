package yh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class q4 implements RequestDelegate {
    public final int f47904a = 1;
    public final s5 f47905b;
    public final Utilities.Callback2 f47906c;
    public final Context d;
    public final org.telegram.ui.ActionBar.d6 e;
    public final long f47907f;
    public final String f47908g;
    public final long h;
    public final TLObject f47909i;
    public final TLObject f47910j;

    public q4(s5 s5Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.d6 d6Var, long j3, String str, long j10, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f47905b = s5Var;
        this.f47906c = callback2;
        this.d = context;
        this.e = d6Var;
        this.f47907f = j3;
        this.f47908g = str;
        this.h = j10;
        this.f47909i = tLObject;
        this.f47910j = tL_textWithEntities;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47904a) {
            case 0:
                AndroidUtilities.runOnUIThread(new r4(this.f47905b, tLObject, tL_error, this.f47906c, this.d, this.e, this.f47907f, this.f47908g, (TLRPC.TL_payments_paymentFormStarGift) this.f47909i, (TL_stars.StarGift) this.f47910j, this.h));
                return;
            default:
                AndroidUtilities.runOnUIThread(new r4(this.f47905b, tLObject, tL_error, this.f47906c, this.d, this.e, this.f47907f, this.f47908g, this.h, this.f47909i, (TLRPC.TL_textWithEntities) this.f47910j));
                return;
        }
    }

    public q4(s5 s5Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.d6 d6Var, long j3, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10) {
        this.f47905b = s5Var;
        this.f47906c = callback2;
        this.d = context;
        this.e = d6Var;
        this.f47907f = j3;
        this.f47908g = str;
        this.f47909i = tL_payments_paymentFormStarGift;
        this.f47910j = starGift;
        this.h = j10;
    }
}
