package yh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class r4 implements RequestDelegate {
    public final int f47948a = 1;
    public final t5 f47949b;
    public final Utilities.Callback2 f47950c;
    public final Context d;
    public final org.telegram.ui.ActionBar.e6 e;
    public final long f47951f;
    public final String f47952g;
    public final long h;
    public final TLObject f47953i;
    public final TLObject f47954j;

    public r4(t5 t5Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.e6 e6Var, long j3, String str, long j10, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f47949b = t5Var;
        this.f47950c = callback2;
        this.d = context;
        this.e = e6Var;
        this.f47951f = j3;
        this.f47952g = str;
        this.h = j10;
        this.f47953i = tLObject;
        this.f47954j = tL_textWithEntities;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47948a) {
            case 0:
                AndroidUtilities.runOnUIThread(new s4(this.f47949b, tLObject, tL_error, this.f47950c, this.d, this.e, this.f47951f, this.f47952g, (TLRPC.TL_payments_paymentFormStarGift) this.f47953i, (TL_stars.StarGift) this.f47954j, this.h));
                return;
            default:
                AndroidUtilities.runOnUIThread(new s4(this.f47949b, tLObject, tL_error, this.f47950c, this.d, this.e, this.f47951f, this.f47952g, this.h, this.f47953i, (TLRPC.TL_textWithEntities) this.f47954j));
                return;
        }
    }

    public r4(t5 t5Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.e6 e6Var, long j3, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10) {
        this.f47949b = t5Var;
        this.f47950c = callback2;
        this.d = context;
        this.e = e6Var;
        this.f47951f = j3;
        this.f47952g = str;
        this.f47953i = tL_payments_paymentFormStarGift;
        this.f47954j = starGift;
        this.h = j10;
    }
}
