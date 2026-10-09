package yh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class k4 implements RequestDelegate {
    public final int f52777a = 1;
    public final m5 f52778b;
    public final Utilities.Callback2 f52779c;
    public final Context d;
    public final org.telegram.ui.ActionBar.e6 f52780e;
    public final long f52781f;
    public final String f52782g;
    public final long h;
    public final TLObject f52783i;
    public final TLObject f52784j;

    public k4(m5 m5Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.e6 e6Var, long j3, String str, long j10, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f52778b = m5Var;
        this.f52779c = callback2;
        this.d = context;
        this.f52780e = e6Var;
        this.f52781f = j3;
        this.f52782g = str;
        this.h = j10;
        this.f52783i = tLObject;
        this.f52784j = tL_textWithEntities;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f52777a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l4(this.f52778b, tLObject, tL_error, this.f52779c, this.d, this.f52780e, this.f52781f, this.f52782g, (TLRPC.TL_payments_paymentFormStarGift) this.f52783i, (TL_stars.StarGift) this.f52784j, this.h));
                return;
            default:
                AndroidUtilities.runOnUIThread(new l4(this.f52778b, tLObject, tL_error, this.f52779c, this.d, this.f52780e, this.f52781f, this.f52782g, this.h, this.f52783i, (TLRPC.TL_textWithEntities) this.f52784j));
                return;
        }
    }

    public k4(m5 m5Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.e6 e6Var, long j3, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10) {
        this.f52778b = m5Var;
        this.f52779c = callback2;
        this.d = context;
        this.f52780e = e6Var;
        this.f52781f = j3;
        this.f52782g = str;
        this.f52783i = tL_payments_paymentFormStarGift;
        this.f52784j = starGift;
        this.h = j10;
    }
}
