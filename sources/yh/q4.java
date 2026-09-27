package yh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class q4 implements RequestDelegate {
    public final int f47966a = 1;
    public final s5 f47967b;
    public final Utilities.Callback2 f47968c;
    public final Context d;
    public final org.telegram.ui.ActionBar.e6 e;
    public final long f47969f;
    public final String f47970g;
    public final long h;
    public final TLObject f47971i;
    public final TLObject f47972j;

    public q4(s5 s5Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.e6 e6Var, long j3, String str, long j10, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f47967b = s5Var;
        this.f47968c = callback2;
        this.d = context;
        this.e = e6Var;
        this.f47969f = j3;
        this.f47970g = str;
        this.h = j10;
        this.f47971i = tLObject;
        this.f47972j = tL_textWithEntities;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47966a) {
            case 0:
                AndroidUtilities.runOnUIThread(new r4(this.f47967b, tLObject, tL_error, this.f47968c, this.d, this.e, this.f47969f, this.f47970g, (TLRPC.TL_payments_paymentFormStarGift) this.f47971i, (TL_stars.StarGift) this.f47972j, this.h));
                return;
            default:
                AndroidUtilities.runOnUIThread(new r4(this.f47967b, tLObject, tL_error, this.f47968c, this.d, this.e, this.f47969f, this.f47970g, this.h, this.f47971i, (TLRPC.TL_textWithEntities) this.f47972j));
                return;
        }
    }

    public q4(s5 s5Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.e6 e6Var, long j3, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10) {
        this.f47967b = s5Var;
        this.f47968c = callback2;
        this.d = context;
        this.e = e6Var;
        this.f47969f = j3;
        this.f47970g = str;
        this.f47971i = tL_payments_paymentFormStarGift;
        this.f47972j = starGift;
        this.h = j10;
    }
}
