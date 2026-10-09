package yh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class k4 implements RequestDelegate {
    public final int f52775a = 1;
    public final m5 f52776b;
    public final Utilities.Callback2 f52777c;
    public final Context d;
    public final org.telegram.ui.ActionBar.e6 f52778e;
    public final long f52779f;
    public final String f52780g;
    public final long h;
    public final TLObject f52781i;
    public final TLObject f52782j;

    public k4(m5 m5Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.e6 e6Var, long j3, String str, long j10, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f52776b = m5Var;
        this.f52777c = callback2;
        this.d = context;
        this.f52778e = e6Var;
        this.f52779f = j3;
        this.f52780g = str;
        this.h = j10;
        this.f52781i = tLObject;
        this.f52782j = tL_textWithEntities;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f52775a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l4(this.f52776b, tLObject, tL_error, this.f52777c, this.d, this.f52778e, this.f52779f, this.f52780g, (TLRPC.TL_payments_paymentFormStarGift) this.f52781i, (TL_stars.StarGift) this.f52782j, this.h));
                return;
            default:
                AndroidUtilities.runOnUIThread(new l4(this.f52776b, tLObject, tL_error, this.f52777c, this.d, this.f52778e, this.f52779f, this.f52780g, this.h, this.f52781i, (TLRPC.TL_textWithEntities) this.f52782j));
                return;
        }
    }

    public k4(m5 m5Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.e6 e6Var, long j3, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10) {
        this.f52776b = m5Var;
        this.f52777c = callback2;
        this.d = context;
        this.f52778e = e6Var;
        this.f52779f = j3;
        this.f52780g = str;
        this.f52781i = tL_payments_paymentFormStarGift;
        this.f52782j = starGift;
        this.h = j10;
    }
}
