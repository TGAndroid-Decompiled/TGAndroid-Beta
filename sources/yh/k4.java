package yh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class k4 implements RequestDelegate {
    public final int f53014a = 1;
    public final n5 f53015b;
    public final Utilities.Callback2 f53016c;
    public final Context d;
    public final org.telegram.ui.ActionBar.c6 f53017e;
    public final long f53018f;
    public final String f53019g;
    public final long h;
    public final TLObject f53020i;
    public final TLObject f53021j;

    public k4(n5 n5Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.c6 c6Var, long j3, String str, long j10, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f53015b = n5Var;
        this.f53016c = callback2;
        this.d = context;
        this.f53017e = c6Var;
        this.f53018f = j3;
        this.f53019g = str;
        this.h = j10;
        this.f53020i = tLObject;
        this.f53021j = tL_textWithEntities;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f53014a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l4(this.f53015b, tLObject, tL_error, this.f53016c, this.d, this.f53017e, this.f53018f, this.f53019g, (TLRPC.TL_payments_paymentFormStarGift) this.f53020i, (TL_stars.StarGift) this.f53021j, this.h));
                return;
            default:
                AndroidUtilities.runOnUIThread(new l4(this.f53015b, tLObject, tL_error, this.f53016c, this.d, this.f53017e, this.f53018f, this.f53019g, this.h, this.f53020i, (TLRPC.TL_textWithEntities) this.f53021j));
                return;
        }
    }

    public k4(n5 n5Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.c6 c6Var, long j3, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10) {
        this.f53015b = n5Var;
        this.f53016c = callback2;
        this.d = context;
        this.f53017e = c6Var;
        this.f53018f = j3;
        this.f53019g = str;
        this.f53020i = tL_payments_paymentFormStarGift;
        this.f53021j = starGift;
        this.h = j10;
    }
}
