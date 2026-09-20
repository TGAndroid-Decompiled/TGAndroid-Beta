package yh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class r4 implements RequestDelegate {
    public final int f47991a = 1;
    public final u5 f47992b;
    public final Utilities.Callback2 f47993c;
    public final Context d;
    public final org.telegram.ui.ActionBar.f6 e;
    public final long f47994f;
    public final String f47995g;
    public final long h;
    public final TLObject f47996i;
    public final TLObject f47997j;

    public r4(u5 u5Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.f6 f6Var, long j3, String str, long j10, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f47992b = u5Var;
        this.f47993c = callback2;
        this.d = context;
        this.e = f6Var;
        this.f47994f = j3;
        this.f47995g = str;
        this.h = j10;
        this.f47996i = tLObject;
        this.f47997j = tL_textWithEntities;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47991a) {
            case 0:
                AndroidUtilities.runOnUIThread(new s4(this.f47992b, tLObject, tL_error, this.f47993c, this.d, this.e, this.f47994f, this.f47995g, (TLRPC.TL_payments_paymentFormStarGift) this.f47996i, (TL_stars.StarGift) this.f47997j, this.h));
                return;
            default:
                AndroidUtilities.runOnUIThread(new s4(this.f47992b, tLObject, tL_error, this.f47993c, this.d, this.e, this.f47994f, this.f47995g, this.h, this.f47996i, (TLRPC.TL_textWithEntities) this.f47997j));
                return;
        }
    }

    public r4(u5 u5Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.f6 f6Var, long j3, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10) {
        this.f47992b = u5Var;
        this.f47993c = callback2;
        this.d = context;
        this.e = f6Var;
        this.f47994f = j3;
        this.f47995g = str;
        this.f47996i = tL_payments_paymentFormStarGift;
        this.f47997j = starGift;
        this.h = j10;
    }
}
