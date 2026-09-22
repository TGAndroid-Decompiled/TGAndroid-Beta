package yh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class r4 implements RequestDelegate {
    public final int f48012a = 1;
    public final u5 f48013b;
    public final Utilities.Callback2 f48014c;
    public final Context d;
    public final org.telegram.ui.ActionBar.f6 e;
    public final long f48015f;
    public final String f48016g;
    public final long h;
    public final TLObject f48017i;
    public final TLObject f48018j;

    public r4(u5 u5Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.f6 f6Var, long j3, String str, long j10, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f48013b = u5Var;
        this.f48014c = callback2;
        this.d = context;
        this.e = f6Var;
        this.f48015f = j3;
        this.f48016g = str;
        this.h = j10;
        this.f48017i = tLObject;
        this.f48018j = tL_textWithEntities;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f48012a) {
            case 0:
                AndroidUtilities.runOnUIThread(new s4(this.f48013b, tLObject, tL_error, this.f48014c, this.d, this.e, this.f48015f, this.f48016g, (TLRPC.TL_payments_paymentFormStarGift) this.f48017i, (TL_stars.StarGift) this.f48018j, this.h));
                return;
            default:
                AndroidUtilities.runOnUIThread(new s4(this.f48013b, tLObject, tL_error, this.f48014c, this.d, this.e, this.f48015f, this.f48016g, this.h, this.f48017i, (TLRPC.TL_textWithEntities) this.f48018j));
                return;
        }
    }

    public r4(u5 u5Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.f6 f6Var, long j3, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10) {
        this.f48013b = u5Var;
        this.f48014c = callback2;
        this.d = context;
        this.e = f6Var;
        this.f48015f = j3;
        this.f48016g = str;
        this.f48017i = tL_payments_paymentFormStarGift;
        this.f48018j = starGift;
        this.h = j10;
    }
}
