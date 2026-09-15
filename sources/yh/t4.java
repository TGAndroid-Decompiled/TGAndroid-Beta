package yh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class t4 implements RequestDelegate {
    public final int f47821a = 1;
    public final v5 f47822b;
    public final Utilities.Callback2 f47823c;
    public final Context d;
    public final org.telegram.ui.ActionBar.e6 e;
    public final long f47824f;
    public final String f47825g;
    public final long h;
    public final TLObject f47826i;
    public final TLObject f47827j;

    public t4(v5 v5Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.e6 e6Var, long j3, String str, long j10, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f47822b = v5Var;
        this.f47823c = callback2;
        this.d = context;
        this.e = e6Var;
        this.f47824f = j3;
        this.f47825g = str;
        this.h = j10;
        this.f47826i = tLObject;
        this.f47827j = tL_textWithEntities;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47821a) {
            case 0:
                AndroidUtilities.runOnUIThread(new u4(this.f47822b, tLObject, tL_error, this.f47823c, this.d, this.e, this.f47824f, this.f47825g, (TLRPC.TL_payments_paymentFormStarGift) this.f47826i, (TL_stars.StarGift) this.f47827j, this.h));
                return;
            default:
                AndroidUtilities.runOnUIThread(new u4(this.f47822b, tLObject, tL_error, this.f47823c, this.d, this.e, this.f47824f, this.f47825g, this.h, this.f47826i, (TLRPC.TL_textWithEntities) this.f47827j));
                return;
        }
    }

    public t4(v5 v5Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.e6 e6Var, long j3, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10) {
        this.f47822b = v5Var;
        this.f47823c = callback2;
        this.d = context;
        this.e = e6Var;
        this.f47824f = j3;
        this.f47825g = str;
        this.f47826i = tL_payments_paymentFormStarGift;
        this.f47827j = starGift;
        this.h = j10;
    }
}
