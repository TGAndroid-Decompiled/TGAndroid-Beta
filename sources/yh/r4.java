package yh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class r4 implements RequestDelegate {
    public final int f47638a = 1;
    public final t5 f47639b;
    public final Utilities.Callback2 f47640c;
    public final Context d;
    public final org.telegram.ui.ActionBar.d6 e;
    public final long f47641f;
    public final String f47642g;
    public final long h;
    public final TLObject f47643i;
    public final TLObject f47644j;

    public r4(t5 t5Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.d6 d6Var, long j3, String str, long j10, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f47639b = t5Var;
        this.f47640c = callback2;
        this.d = context;
        this.e = d6Var;
        this.f47641f = j3;
        this.f47642g = str;
        this.h = j10;
        this.f47643i = tLObject;
        this.f47644j = tL_textWithEntities;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47638a) {
            case 0:
                AndroidUtilities.runOnUIThread(new s4(this.f47639b, tLObject, tL_error, this.f47640c, this.d, this.e, this.f47641f, this.f47642g, (TLRPC.TL_payments_paymentFormStarGift) this.f47643i, (TL_stars.StarGift) this.f47644j, this.h));
                return;
            default:
                AndroidUtilities.runOnUIThread(new s4(this.f47639b, tLObject, tL_error, this.f47640c, this.d, this.e, this.f47641f, this.f47642g, this.h, this.f47643i, (TLRPC.TL_textWithEntities) this.f47644j));
                return;
        }
    }

    public r4(t5 t5Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.d6 d6Var, long j3, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10) {
        this.f47639b = t5Var;
        this.f47640c = callback2;
        this.d = context;
        this.e = d6Var;
        this.f47641f = j3;
        this.f47642g = str;
        this.f47643i = tL_payments_paymentFormStarGift;
        this.f47644j = starGift;
        this.h = j10;
    }
}
