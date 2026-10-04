package yh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class q4 implements RequestDelegate {
    public final int f51862a = 1;
    public final t5 f51863b;
    public final Utilities.Callback2 f51864c;
    public final Context d;
    public final org.telegram.ui.ActionBar.d6 f51865e;
    public final long f51866f;
    public final String f51867g;
    public final long h;
    public final TLObject f51868i;
    public final TLObject f51869j;

    public q4(t5 t5Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.d6 d6Var, long j3, String str, long j10, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f51863b = t5Var;
        this.f51864c = callback2;
        this.d = context;
        this.f51865e = d6Var;
        this.f51866f = j3;
        this.f51867g = str;
        this.h = j10;
        this.f51868i = tLObject;
        this.f51869j = tL_textWithEntities;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f51862a) {
            case 0:
                AndroidUtilities.runOnUIThread(new r4(this.f51863b, tLObject, tL_error, this.f51864c, this.d, this.f51865e, this.f51866f, this.f51867g, (TLRPC.TL_payments_paymentFormStarGift) this.f51868i, (TL_stars.StarGift) this.f51869j, this.h));
                return;
            default:
                AndroidUtilities.runOnUIThread(new r4(this.f51863b, tLObject, tL_error, this.f51864c, this.d, this.f51865e, this.f51866f, this.f51867g, this.h, this.f51868i, (TLRPC.TL_textWithEntities) this.f51869j));
                return;
        }
    }

    public q4(t5 t5Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.d6 d6Var, long j3, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10) {
        this.f51863b = t5Var;
        this.f51864c = callback2;
        this.d = context;
        this.f51865e = d6Var;
        this.f51866f = j3;
        this.f51867g = str;
        this.f51868i = tL_payments_paymentFormStarGift;
        this.f51869j = starGift;
        this.h = j10;
    }
}
