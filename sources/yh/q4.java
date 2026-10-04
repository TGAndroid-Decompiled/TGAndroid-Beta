package yh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class q4 implements RequestDelegate {
    public final int f51857a = 1;
    public final t5 f51858b;
    public final Utilities.Callback2 f51859c;
    public final Context d;
    public final org.telegram.ui.ActionBar.d6 f51860e;
    public final long f51861f;
    public final String f51862g;
    public final long h;
    public final TLObject f51863i;
    public final TLObject f51864j;

    public q4(t5 t5Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.d6 d6Var, long j3, String str, long j10, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f51858b = t5Var;
        this.f51859c = callback2;
        this.d = context;
        this.f51860e = d6Var;
        this.f51861f = j3;
        this.f51862g = str;
        this.h = j10;
        this.f51863i = tLObject;
        this.f51864j = tL_textWithEntities;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f51857a) {
            case 0:
                AndroidUtilities.runOnUIThread(new r4(this.f51858b, tLObject, tL_error, this.f51859c, this.d, this.f51860e, this.f51861f, this.f51862g, (TLRPC.TL_payments_paymentFormStarGift) this.f51863i, (TL_stars.StarGift) this.f51864j, this.h));
                return;
            default:
                AndroidUtilities.runOnUIThread(new r4(this.f51858b, tLObject, tL_error, this.f51859c, this.d, this.f51860e, this.f51861f, this.f51862g, this.h, this.f51863i, (TLRPC.TL_textWithEntities) this.f51864j));
                return;
        }
    }

    public q4(t5 t5Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.d6 d6Var, long j3, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10) {
        this.f51858b = t5Var;
        this.f51859c = callback2;
        this.d = context;
        this.f51860e = d6Var;
        this.f51861f = j3;
        this.f51862g = str;
        this.f51863i = tL_payments_paymentFormStarGift;
        this.f51864j = starGift;
        this.h = j10;
    }
}
