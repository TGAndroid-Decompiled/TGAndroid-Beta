package rh;

import android.content.Context;
import org.telegram.messenger.j20;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a5 implements RequestDelegate {
    public final int f46629a = 1;
    public final e6 f46630b;
    public final j20 f46631c;
    public final Context d;
    public final org.telegram.ui.ActionBar.p6 e;
    public final long f46632f;
    public final String f46633g;
    public final long h;
    public final TLObject f46634i;
    public final TLObject f46635j;

    public a5(e6 e6Var, j20 j20Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, long j10, String str, long j11, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f46630b = e6Var;
        this.f46631c = j20Var;
        this.d = context;
        this.e = p6Var;
        this.f46632f = j10;
        this.f46633g = str;
        this.h = j11;
        this.f46634i = tLObject;
        this.f46635j = tL_textWithEntities;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f46629a) {
            case 0:
                org.telegram.messenger.i0.g3(new c5(this.f46630b, tLObject, tL_error, this.f46631c, this.d, this.e, this.f46632f, this.f46633g, (TLRPC.TL_payments_paymentFormStarGift) this.f46634i, (TL_stars.StarGift) this.f46635j, this.h));
                return;
            default:
                org.telegram.messenger.i0.g3(new c5(this.f46630b, tLObject, tL_error, this.f46631c, this.d, this.e, this.f46632f, this.f46633g, this.h, this.f46634i, (TLRPC.TL_textWithEntities) this.f46635j));
                return;
        }
    }

    public a5(e6 e6Var, j20 j20Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, long j10, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j11) {
        this.f46630b = e6Var;
        this.f46631c = j20Var;
        this.d = context;
        this.e = p6Var;
        this.f46632f = j10;
        this.f46633g = str;
        this.f46634i = tL_payments_paymentFormStarGift;
        this.f46635j = starGift;
        this.h = j11;
    }
}
