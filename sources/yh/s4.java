package yh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class s4 implements RequestDelegate {
    public final int f47726a = 1;
    public final u5 f47727b;
    public final Utilities.Callback2 f47728c;
    public final Context d;
    public final org.telegram.ui.ActionBar.e6 e;
    public final long f47729f;
    public final String f47730g;
    public final long h;
    public final TLObject f47731i;
    public final TLObject f47732j;

    public s4(u5 u5Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.e6 e6Var, long j3, String str, long j10, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f47727b = u5Var;
        this.f47728c = callback2;
        this.d = context;
        this.e = e6Var;
        this.f47729f = j3;
        this.f47730g = str;
        this.h = j10;
        this.f47731i = tLObject;
        this.f47732j = tL_textWithEntities;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47726a) {
            case 0:
                AndroidUtilities.runOnUIThread(new t4(this.f47727b, tLObject, tL_error, this.f47728c, this.d, this.e, this.f47729f, this.f47730g, (TLRPC.TL_payments_paymentFormStarGift) this.f47731i, (TL_stars.StarGift) this.f47732j, this.h));
                return;
            default:
                AndroidUtilities.runOnUIThread(new t4(this.f47727b, tLObject, tL_error, this.f47728c, this.d, this.e, this.f47729f, this.f47730g, this.h, this.f47731i, (TLRPC.TL_textWithEntities) this.f47732j));
                return;
        }
    }

    public s4(u5 u5Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.e6 e6Var, long j3, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10) {
        this.f47727b = u5Var;
        this.f47728c = callback2;
        this.d = context;
        this.e = e6Var;
        this.f47729f = j3;
        this.f47730g = str;
        this.f47731i = tL_payments_paymentFormStarGift;
        this.f47732j = starGift;
        this.h = j10;
    }
}
