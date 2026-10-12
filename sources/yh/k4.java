package yh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class k4 implements RequestDelegate {
    public final int f53002a = 1;
    public final n5 f53003b;
    public final Utilities.Callback2 f53004c;
    public final Context d;
    public final org.telegram.ui.ActionBar.c6 f53005e;
    public final long f53006f;
    public final String f53007g;
    public final long h;
    public final TLObject f53008i;
    public final TLObject f53009j;

    public k4(n5 n5Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.c6 c6Var, long j3, String str, long j10, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f53003b = n5Var;
        this.f53004c = callback2;
        this.d = context;
        this.f53005e = c6Var;
        this.f53006f = j3;
        this.f53007g = str;
        this.h = j10;
        this.f53008i = tLObject;
        this.f53009j = tL_textWithEntities;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f53002a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l4(this.f53003b, tLObject, tL_error, this.f53004c, this.d, this.f53005e, this.f53006f, this.f53007g, (TLRPC.TL_payments_paymentFormStarGift) this.f53008i, (TL_stars.StarGift) this.f53009j, this.h));
                return;
            default:
                AndroidUtilities.runOnUIThread(new l4(this.f53003b, tLObject, tL_error, this.f53004c, this.d, this.f53005e, this.f53006f, this.f53007g, this.h, this.f53008i, (TLRPC.TL_textWithEntities) this.f53009j));
                return;
        }
    }

    public k4(n5 n5Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.c6 c6Var, long j3, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10) {
        this.f53003b = n5Var;
        this.f53004c = callback2;
        this.d = context;
        this.f53005e = c6Var;
        this.f53006f = j3;
        this.f53007g = str;
        this.f53008i = tL_payments_paymentFormStarGift;
        this.f53009j = starGift;
        this.h = j10;
    }
}
