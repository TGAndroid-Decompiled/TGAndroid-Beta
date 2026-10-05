package yh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class r4 implements RequestDelegate {
    public final int f51916a = 1;
    public final u5 f51917b;
    public final Utilities.Callback2 f51918c;
    public final Context d;
    public final org.telegram.ui.ActionBar.d6 f51919e;
    public final long f51920f;
    public final String f51921g;
    public final long h;
    public final TLObject f51922i;
    public final TLObject f51923j;

    public r4(u5 u5Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.d6 d6Var, long j3, String str, long j10, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f51917b = u5Var;
        this.f51918c = callback2;
        this.d = context;
        this.f51919e = d6Var;
        this.f51920f = j3;
        this.f51921g = str;
        this.h = j10;
        this.f51922i = tLObject;
        this.f51923j = tL_textWithEntities;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f51916a) {
            case 0:
                AndroidUtilities.runOnUIThread(new s4(this.f51917b, tLObject, tL_error, this.f51918c, this.d, this.f51919e, this.f51920f, this.f51921g, (TLRPC.TL_payments_paymentFormStarGift) this.f51922i, (TL_stars.StarGift) this.f51923j, this.h));
                return;
            default:
                AndroidUtilities.runOnUIThread(new s4(this.f51917b, tLObject, tL_error, this.f51918c, this.d, this.f51919e, this.f51920f, this.f51921g, this.h, this.f51922i, (TLRPC.TL_textWithEntities) this.f51923j));
                return;
        }
    }

    public r4(u5 u5Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.d6 d6Var, long j3, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10) {
        this.f51917b = u5Var;
        this.f51918c = callback2;
        this.d = context;
        this.f51919e = d6Var;
        this.f51920f = j3;
        this.f51921g = str;
        this.f51922i = tL_payments_paymentFormStarGift;
        this.f51923j = starGift;
        this.h = j10;
    }
}
