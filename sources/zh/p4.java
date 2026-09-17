package zh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class p4 implements RequestDelegate {
    public final int f52417a = 1;
    public final s5 f52418b;
    public final Utilities.Callback2 f52419c;
    public final Context d;
    public final org.telegram.ui.ActionBar.f6 f52420e;
    public final long f52421f;
    public final String f52422g;
    public final long h;
    public final TLObject f52423i;
    public final TLObject f52424j;

    public p4(s5 s5Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.f6 f6Var, long j3, String str, long j10, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f52418b = s5Var;
        this.f52419c = callback2;
        this.d = context;
        this.f52420e = f6Var;
        this.f52421f = j3;
        this.f52422g = str;
        this.h = j10;
        this.f52423i = tLObject;
        this.f52424j = tL_textWithEntities;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f52417a) {
            case 0:
                AndroidUtilities.runOnUIThread(new q4(this.f52418b, tLObject, tL_error, this.f52419c, this.d, this.f52420e, this.f52421f, this.f52422g, (TLRPC.TL_payments_paymentFormStarGift) this.f52423i, (TL_stars.StarGift) this.f52424j, this.h));
                return;
            default:
                AndroidUtilities.runOnUIThread(new q4(this.f52418b, tLObject, tL_error, this.f52419c, this.d, this.f52420e, this.f52421f, this.f52422g, this.h, this.f52423i, (TLRPC.TL_textWithEntities) this.f52424j));
                return;
        }
    }

    public p4(s5 s5Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.f6 f6Var, long j3, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10) {
        this.f52418b = s5Var;
        this.f52419c = callback2;
        this.d = context;
        this.f52420e = f6Var;
        this.f52421f = j3;
        this.f52422g = str;
        this.f52423i = tL_payments_paymentFormStarGift;
        this.f52424j = starGift;
        this.h = j10;
    }
}
