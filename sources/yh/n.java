package yh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.bb;
public final class n implements View.OnClickListener {
    public final int f50482a;
    public final long f50483b;
    public final Context f50484c;
    public final Object d;
    public final Object f50485e;
    public final Object f50486f;

    public n(Context context, f6 f6Var, long j3, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.f50482a = 2;
        this.f50484c = context;
        this.d = f6Var;
        this.f50483b = j3;
        this.f50486f = starGift;
        this.f50485e = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f50482a) {
            case 0:
                v.Q((v) this.f50486f, this.f50483b, this.f50484c, (f6) this.d, (Runnable) this.f50485e);
                return;
            case 1:
                c0 c0Var = (c0) this.f50486f;
                c0Var.getClass();
                l lVar = new l(this.f50483b, true, null);
                GiftAuctionController.Auction auction = c0Var.f50247d0;
                m mVar = new m(this.f50484c, (f6) this.d, lVar, auction);
                mVar.show();
                mVar.f50445n0 = (Runnable) this.f50485e;
                c0Var.dismiss();
                return;
            case 2:
                new c0(this.f50484c, (f6) this.d, this.f50483b, (TL_stars.StarGift) this.f50486f, (ArrayList) this.f50485e, null, true).show();
                return;
            default:
                x4.S((x4) this.f50486f, this.f50483b, this.f50484c, (Runnable) this.f50485e, (TL_stars.StarGift) this.d);
                return;
        }
    }

    public n(bb bbVar, long j3, Context context, f6 f6Var, Runnable runnable, int i10) {
        this.f50482a = i10;
        this.f50486f = bbVar;
        this.f50483b = j3;
        this.f50484c = context;
        this.d = f6Var;
        this.f50485e = runnable;
    }

    public n(x4 x4Var, long j3, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.f50482a = 3;
        this.f50486f = x4Var;
        this.f50483b = j3;
        this.f50484c = context;
        this.f50485e = runnable;
        this.d = starGift;
    }
}
