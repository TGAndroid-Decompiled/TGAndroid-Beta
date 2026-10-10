package yh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class k4 implements RequestDelegate {
    public final int f52821a = 1;
    public final m5 f52822b;
    public final Utilities.Callback2 f52823c;
    public final Context d;
    public final org.telegram.ui.ActionBar.e6 f52824e;
    public final long f52825f;
    public final String f52826g;
    public final long h;
    public final TLObject f52827i;
    public final TLObject f52828j;

    public k4(m5 m5Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.e6 e6Var, long j3, String str, long j10, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f52822b = m5Var;
        this.f52823c = callback2;
        this.d = context;
        this.f52824e = e6Var;
        this.f52825f = j3;
        this.f52826g = str;
        this.h = j10;
        this.f52827i = tLObject;
        this.f52828j = tL_textWithEntities;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f52821a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l4(this.f52822b, tLObject, tL_error, this.f52823c, this.d, this.f52824e, this.f52825f, this.f52826g, (TLRPC.TL_payments_paymentFormStarGift) this.f52827i, (TL_stars.StarGift) this.f52828j, this.h));
                return;
            default:
                AndroidUtilities.runOnUIThread(new l4(this.f52822b, tLObject, tL_error, this.f52823c, this.d, this.f52824e, this.f52825f, this.f52826g, this.h, this.f52827i, (TLRPC.TL_textWithEntities) this.f52828j));
                return;
        }
    }

    public k4(m5 m5Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.e6 e6Var, long j3, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10) {
        this.f52822b = m5Var;
        this.f52823c = callback2;
        this.d = context;
        this.f52824e = e6Var;
        this.f52825f = j3;
        this.f52826g = str;
        this.f52827i = tL_payments_paymentFormStarGift;
        this.f52828j = starGift;
        this.h = j10;
    }
}
