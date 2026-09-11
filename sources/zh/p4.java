package zh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class p4 implements RequestDelegate {
    public final int f52416a = 1;
    public final s5 f52417b;
    public final Utilities.Callback2 f52418c;
    public final Context d;
    public final org.telegram.ui.ActionBar.f6 f52419e;
    public final long f52420f;
    public final String f52421g;
    public final long h;
    public final TLObject f52422i;
    public final TLObject f52423j;

    public p4(s5 s5Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.f6 f6Var, long j3, String str, long j10, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f52417b = s5Var;
        this.f52418c = callback2;
        this.d = context;
        this.f52419e = f6Var;
        this.f52420f = j3;
        this.f52421g = str;
        this.h = j10;
        this.f52422i = tLObject;
        this.f52423j = tL_textWithEntities;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f52416a) {
            case 0:
                AndroidUtilities.runOnUIThread(new q4(this.f52417b, tLObject, tL_error, this.f52418c, this.d, this.f52419e, this.f52420f, this.f52421g, (TLRPC.TL_payments_paymentFormStarGift) this.f52422i, (TL_stars.StarGift) this.f52423j, this.h));
                return;
            default:
                AndroidUtilities.runOnUIThread(new q4(this.f52417b, tLObject, tL_error, this.f52418c, this.d, this.f52419e, this.f52420f, this.f52421g, this.h, this.f52422i, (TLRPC.TL_textWithEntities) this.f52423j));
                return;
        }
    }

    public p4(s5 s5Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.f6 f6Var, long j3, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10) {
        this.f52417b = s5Var;
        this.f52418c = callback2;
        this.d = context;
        this.f52419e = f6Var;
        this.f52420f = j3;
        this.f52421g = str;
        this.f52422i = tL_payments_paymentFormStarGift;
        this.f52423j = starGift;
        this.h = j10;
    }
}
