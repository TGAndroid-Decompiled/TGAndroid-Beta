package zh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class p4 implements RequestDelegate {
    public final int f52448a = 1;
    public final s5 f52449b;
    public final Utilities.Callback2 f52450c;
    public final Context d;
    public final org.telegram.ui.ActionBar.f6 f52451e;
    public final long f52452f;
    public final String f52453g;
    public final long h;
    public final TLObject f52454i;
    public final TLObject f52455j;

    public p4(s5 s5Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.f6 f6Var, long j3, String str, long j10, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f52449b = s5Var;
        this.f52450c = callback2;
        this.d = context;
        this.f52451e = f6Var;
        this.f52452f = j3;
        this.f52453g = str;
        this.h = j10;
        this.f52454i = tLObject;
        this.f52455j = tL_textWithEntities;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f52448a) {
            case 0:
                AndroidUtilities.runOnUIThread(new q4(this.f52449b, tLObject, tL_error, this.f52450c, this.d, this.f52451e, this.f52452f, this.f52453g, (TLRPC.TL_payments_paymentFormStarGift) this.f52454i, (TL_stars.StarGift) this.f52455j, this.h));
                return;
            default:
                AndroidUtilities.runOnUIThread(new q4(this.f52449b, tLObject, tL_error, this.f52450c, this.d, this.f52451e, this.f52452f, this.f52453g, this.h, this.f52454i, (TLRPC.TL_textWithEntities) this.f52455j));
                return;
        }
    }

    public p4(s5 s5Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.f6 f6Var, long j3, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10) {
        this.f52449b = s5Var;
        this.f52450c = callback2;
        this.d = context;
        this.f52451e = f6Var;
        this.f52452f = j3;
        this.f52453g = str;
        this.f52454i = tL_payments_paymentFormStarGift;
        this.f52455j = starGift;
        this.h = j10;
    }
}
