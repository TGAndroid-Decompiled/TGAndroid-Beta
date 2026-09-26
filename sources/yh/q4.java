package yh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class q4 implements RequestDelegate {
    public final int f47903a = 1;
    public final s5 f47904b;
    public final Utilities.Callback2 f47905c;
    public final Context d;
    public final org.telegram.ui.ActionBar.d6 e;
    public final long f47906f;
    public final String f47907g;
    public final long h;
    public final TLObject f47908i;
    public final TLObject f47909j;

    public q4(s5 s5Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.d6 d6Var, long j3, String str, long j10, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f47904b = s5Var;
        this.f47905c = callback2;
        this.d = context;
        this.e = d6Var;
        this.f47906f = j3;
        this.f47907g = str;
        this.h = j10;
        this.f47908i = tLObject;
        this.f47909j = tL_textWithEntities;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47903a) {
            case 0:
                AndroidUtilities.runOnUIThread(new r4(this.f47904b, tLObject, tL_error, this.f47905c, this.d, this.e, this.f47906f, this.f47907g, (TLRPC.TL_payments_paymentFormStarGift) this.f47908i, (TL_stars.StarGift) this.f47909j, this.h));
                return;
            default:
                AndroidUtilities.runOnUIThread(new r4(this.f47904b, tLObject, tL_error, this.f47905c, this.d, this.e, this.f47906f, this.f47907g, this.h, this.f47908i, (TLRPC.TL_textWithEntities) this.f47909j));
                return;
        }
    }

    public q4(s5 s5Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.d6 d6Var, long j3, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10) {
        this.f47904b = s5Var;
        this.f47905c = callback2;
        this.d = context;
        this.e = d6Var;
        this.f47906f = j3;
        this.f47907g = str;
        this.f47908i = tL_payments_paymentFormStarGift;
        this.f47909j = starGift;
        this.h = j10;
    }
}
