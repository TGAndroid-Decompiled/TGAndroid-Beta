package yh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class k4 implements RequestDelegate {
    public final int f52865a = 1;
    public final n5 f52866b;
    public final Utilities.Callback2 f52867c;
    public final Context d;
    public final org.telegram.ui.ActionBar.d6 f52868e;
    public final long f52869f;
    public final String f52870g;
    public final long h;
    public final TLObject f52871i;
    public final TLObject f52872j;

    public k4(n5 n5Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.d6 d6Var, long j3, String str, long j10, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f52866b = n5Var;
        this.f52867c = callback2;
        this.d = context;
        this.f52868e = d6Var;
        this.f52869f = j3;
        this.f52870g = str;
        this.h = j10;
        this.f52871i = tLObject;
        this.f52872j = tL_textWithEntities;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f52865a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l4(this.f52866b, tLObject, tL_error, this.f52867c, this.d, this.f52868e, this.f52869f, this.f52870g, (TLRPC.TL_payments_paymentFormStarGift) this.f52871i, (TL_stars.StarGift) this.f52872j, this.h));
                return;
            default:
                AndroidUtilities.runOnUIThread(new l4(this.f52866b, tLObject, tL_error, this.f52867c, this.d, this.f52868e, this.f52869f, this.f52870g, this.h, this.f52871i, (TLRPC.TL_textWithEntities) this.f52872j));
                return;
        }
    }

    public k4(n5 n5Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.d6 d6Var, long j3, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10) {
        this.f52866b = n5Var;
        this.f52867c = callback2;
        this.d = context;
        this.f52868e = d6Var;
        this.f52869f = j3;
        this.f52870g = str;
        this.f52871i = tL_payments_paymentFormStarGift;
        this.f52872j = starGift;
        this.h = j10;
    }
}
