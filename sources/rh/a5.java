package rh;

import android.content.Context;
import org.telegram.messenger.k20;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a5 implements RequestDelegate {
    public final int f46624a = 1;
    public final e6 f46625b;
    public final k20 f46626c;
    public final Context d;
    public final org.telegram.ui.ActionBar.p6 e;
    public final long f46627f;
    public final String f46628g;
    public final long h;
    public final TLObject f46629i;
    public final TLObject f46630j;

    public a5(e6 e6Var, k20 k20Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, long j10, String str, long j11, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f46625b = e6Var;
        this.f46626c = k20Var;
        this.d = context;
        this.e = p6Var;
        this.f46627f = j10;
        this.f46628g = str;
        this.h = j11;
        this.f46629i = tLObject;
        this.f46630j = tL_textWithEntities;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f46624a) {
            case 0:
                org.telegram.messenger.i0.g3(new c5(this.f46625b, tLObject, tL_error, this.f46626c, this.d, this.e, this.f46627f, this.f46628g, (TLRPC.TL_payments_paymentFormStarGift) this.f46629i, (TL_stars.StarGift) this.f46630j, this.h));
                return;
            default:
                org.telegram.messenger.i0.g3(new c5(this.f46625b, tLObject, tL_error, this.f46626c, this.d, this.e, this.f46627f, this.f46628g, this.h, this.f46629i, (TLRPC.TL_textWithEntities) this.f46630j));
                return;
        }
    }

    public a5(e6 e6Var, k20 k20Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, long j10, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j11) {
        this.f46625b = e6Var;
        this.f46626c = k20Var;
        this.d = context;
        this.e = p6Var;
        this.f46627f = j10;
        this.f46628g = str;
        this.f46629i = tL_payments_paymentFormStarGift;
        this.f46630j = starGift;
        this.h = j11;
    }
}
