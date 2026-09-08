package zh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class p4 implements RequestDelegate {
    public final int f52447a = 1;
    public final s5 f52448b;
    public final Utilities.Callback2 f52449c;
    public final Context d;
    public final org.telegram.ui.ActionBar.f6 f52450e;
    public final long f52451f;
    public final String f52452g;
    public final long h;
    public final TLObject f52453i;
    public final TLObject f52454j;

    public p4(s5 s5Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.f6 f6Var, long j3, String str, long j10, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f52448b = s5Var;
        this.f52449c = callback2;
        this.d = context;
        this.f52450e = f6Var;
        this.f52451f = j3;
        this.f52452g = str;
        this.h = j10;
        this.f52453i = tLObject;
        this.f52454j = tL_textWithEntities;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f52447a) {
            case 0:
                AndroidUtilities.runOnUIThread(new q4(this.f52448b, tLObject, tL_error, this.f52449c, this.d, this.f52450e, this.f52451f, this.f52452g, (TLRPC.TL_payments_paymentFormStarGift) this.f52453i, (TL_stars.StarGift) this.f52454j, this.h));
                return;
            default:
                AndroidUtilities.runOnUIThread(new q4(this.f52448b, tLObject, tL_error, this.f52449c, this.d, this.f52450e, this.f52451f, this.f52452g, this.h, this.f52453i, (TLRPC.TL_textWithEntities) this.f52454j));
                return;
        }
    }

    public p4(s5 s5Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.f6 f6Var, long j3, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10) {
        this.f52448b = s5Var;
        this.f52449c = callback2;
        this.d = context;
        this.f52450e = f6Var;
        this.f52451f = j3;
        this.f52452g = str;
        this.f52453i = tL_payments_paymentFormStarGift;
        this.f52454j = starGift;
        this.h = j10;
    }
}
