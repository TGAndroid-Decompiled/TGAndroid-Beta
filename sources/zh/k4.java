package zh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class k4 implements RequestDelegate {
    public final int f50758a = 1;
    public final n5 f50759b;
    public final Utilities.Callback2 f50760c;
    public final Context d;
    public final org.telegram.ui.ActionBar.c6 e;
    public final long f50761f;
    public final String f50762g;
    public final long h;
    public final TLObject f50763i;
    public final TLObject f50764j;

    public k4(n5 n5Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.c6 c6Var, long j10, String str, long j11, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f50759b = n5Var;
        this.f50760c = callback2;
        this.d = context;
        this.e = c6Var;
        this.f50761f = j10;
        this.f50762g = str;
        this.h = j11;
        this.f50763i = tLObject;
        this.f50764j = tL_textWithEntities;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f50758a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l4(this.f50759b, tLObject, tL_error, this.f50760c, this.d, this.e, this.f50761f, this.f50762g, (TLRPC.TL_payments_paymentFormStarGift) this.f50763i, (TL_stars.StarGift) this.f50764j, this.h));
                return;
            default:
                AndroidUtilities.runOnUIThread(new l4(this.f50759b, tLObject, tL_error, this.f50760c, this.d, this.e, this.f50761f, this.f50762g, this.h, this.f50763i, (TLRPC.TL_textWithEntities) this.f50764j));
                return;
        }
    }

    public k4(n5 n5Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.c6 c6Var, long j10, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j11) {
        this.f50759b = n5Var;
        this.f50760c = callback2;
        this.d = context;
        this.e = c6Var;
        this.f50761f = j10;
        this.f50762g = str;
        this.f50763i = tL_payments_paymentFormStarGift;
        this.f50764j = starGift;
        this.h = j11;
    }
}
