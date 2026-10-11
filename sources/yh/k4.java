package yh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class k4 implements RequestDelegate {
    public final int f52899a = 1;
    public final n5 f52900b;
    public final Utilities.Callback2 f52901c;
    public final Context d;
    public final org.telegram.ui.ActionBar.d6 f52902e;
    public final long f52903f;
    public final String f52904g;
    public final long h;
    public final TLObject f52905i;
    public final TLObject f52906j;

    public k4(n5 n5Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.d6 d6Var, long j3, String str, long j10, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f52900b = n5Var;
        this.f52901c = callback2;
        this.d = context;
        this.f52902e = d6Var;
        this.f52903f = j3;
        this.f52904g = str;
        this.h = j10;
        this.f52905i = tLObject;
        this.f52906j = tL_textWithEntities;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f52899a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l4(this.f52900b, tLObject, tL_error, this.f52901c, this.d, this.f52902e, this.f52903f, this.f52904g, (TLRPC.TL_payments_paymentFormStarGift) this.f52905i, (TL_stars.StarGift) this.f52906j, this.h));
                return;
            default:
                AndroidUtilities.runOnUIThread(new l4(this.f52900b, tLObject, tL_error, this.f52901c, this.d, this.f52902e, this.f52903f, this.f52904g, this.h, this.f52905i, (TLRPC.TL_textWithEntities) this.f52906j));
                return;
        }
    }

    public k4(n5 n5Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.d6 d6Var, long j3, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10) {
        this.f52900b = n5Var;
        this.f52901c = callback2;
        this.d = context;
        this.f52902e = d6Var;
        this.f52903f = j3;
        this.f52904g = str;
        this.f52905i = tL_payments_paymentFormStarGift;
        this.f52906j = starGift;
        this.h = j10;
    }
}
