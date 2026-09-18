package yh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class t4 implements RequestDelegate {
    public final int f47849a = 1;
    public final v5 f47850b;
    public final Utilities.Callback2 f47851c;
    public final Context d;
    public final org.telegram.ui.ActionBar.f6 e;
    public final long f47852f;
    public final String f47853g;
    public final long h;
    public final TLObject f47854i;
    public final TLObject f47855j;

    public t4(v5 v5Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.f6 f6Var, long j3, String str, long j10, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f47850b = v5Var;
        this.f47851c = callback2;
        this.d = context;
        this.e = f6Var;
        this.f47852f = j3;
        this.f47853g = str;
        this.h = j10;
        this.f47854i = tLObject;
        this.f47855j = tL_textWithEntities;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47849a) {
            case 0:
                AndroidUtilities.runOnUIThread(new u4(this.f47850b, tLObject, tL_error, this.f47851c, this.d, this.e, this.f47852f, this.f47853g, (TLRPC.TL_payments_paymentFormStarGift) this.f47854i, (TL_stars.StarGift) this.f47855j, this.h));
                return;
            default:
                AndroidUtilities.runOnUIThread(new u4(this.f47850b, tLObject, tL_error, this.f47851c, this.d, this.e, this.f47852f, this.f47853g, this.h, this.f47854i, (TLRPC.TL_textWithEntities) this.f47855j));
                return;
        }
    }

    public t4(v5 v5Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.f6 f6Var, long j3, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10) {
        this.f47850b = v5Var;
        this.f47851c = callback2;
        this.d = context;
        this.e = f6Var;
        this.f47852f = j3;
        this.f47853g = str;
        this.f47854i = tL_payments_paymentFormStarGift;
        this.f47855j = starGift;
        this.h = j10;
    }
}
