package zh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class k4 implements RequestDelegate {
    public final int f50759a = 1;
    public final n5 f50760b;
    public final Utilities.Callback2 f50761c;
    public final Context d;
    public final org.telegram.ui.ActionBar.c6 e;
    public final long f50762f;
    public final String f50763g;
    public final long h;
    public final TLObject f50764i;
    public final TLObject f50765j;

    public k4(n5 n5Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.c6 c6Var, long j10, String str, long j11, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f50760b = n5Var;
        this.f50761c = callback2;
        this.d = context;
        this.e = c6Var;
        this.f50762f = j10;
        this.f50763g = str;
        this.h = j11;
        this.f50764i = tLObject;
        this.f50765j = tL_textWithEntities;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f50759a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l4(this.f50760b, tLObject, tL_error, this.f50761c, this.d, this.e, this.f50762f, this.f50763g, (TLRPC.TL_payments_paymentFormStarGift) this.f50764i, (TL_stars.StarGift) this.f50765j, this.h));
                return;
            default:
                AndroidUtilities.runOnUIThread(new l4(this.f50760b, tLObject, tL_error, this.f50761c, this.d, this.e, this.f50762f, this.f50763g, this.h, this.f50764i, (TLRPC.TL_textWithEntities) this.f50765j));
                return;
        }
    }

    public k4(n5 n5Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.c6 c6Var, long j10, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j11) {
        this.f50760b = n5Var;
        this.f50761c = callback2;
        this.d = context;
        this.e = c6Var;
        this.f50762f = j10;
        this.f50763g = str;
        this.f50764i = tL_payments_paymentFormStarGift;
        this.f50765j = starGift;
        this.h = j11;
    }
}
