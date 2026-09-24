package yh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class q4 implements RequestDelegate {
    public final int f47893a = 1;
    public final t5 f47894b;
    public final Utilities.Callback2 f47895c;
    public final Context d;
    public final org.telegram.ui.ActionBar.d6 e;
    public final long f47896f;
    public final String f47897g;
    public final long h;
    public final TLObject f47898i;
    public final TLObject f47899j;

    public q4(t5 t5Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.d6 d6Var, long j3, String str, long j10, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f47894b = t5Var;
        this.f47895c = callback2;
        this.d = context;
        this.e = d6Var;
        this.f47896f = j3;
        this.f47897g = str;
        this.h = j10;
        this.f47898i = tLObject;
        this.f47899j = tL_textWithEntities;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47893a) {
            case 0:
                AndroidUtilities.runOnUIThread(new r4(this.f47894b, tLObject, tL_error, this.f47895c, this.d, this.e, this.f47896f, this.f47897g, (TLRPC.TL_payments_paymentFormStarGift) this.f47898i, (TL_stars.StarGift) this.f47899j, this.h));
                return;
            default:
                AndroidUtilities.runOnUIThread(new r4(this.f47894b, tLObject, tL_error, this.f47895c, this.d, this.e, this.f47896f, this.f47897g, this.h, this.f47898i, (TLRPC.TL_textWithEntities) this.f47899j));
                return;
        }
    }

    public q4(t5 t5Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.d6 d6Var, long j3, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10) {
        this.f47894b = t5Var;
        this.f47895c = callback2;
        this.d = context;
        this.e = d6Var;
        this.f47896f = j3;
        this.f47897g = str;
        this.f47898i = tL_payments_paymentFormStarGift;
        this.f47899j = starGift;
        this.h = j10;
    }
}
