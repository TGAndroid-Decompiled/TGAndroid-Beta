package xh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.cb;
public final class n implements View.OnClickListener {
    public final int f50119a;
    public final long f50120b;
    public final Context f50121c;
    public final Object d;
    public final Object f50122e;
    public final Object f50123f;

    public n(Context context, d6 d6Var, long j3, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.f50119a = 2;
        this.f50121c = context;
        this.d = d6Var;
        this.f50120b = j3;
        this.f50123f = starGift;
        this.f50122e = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f50119a) {
            case 0:
                v.O((v) this.f50123f, this.f50120b, this.f50121c, (d6) this.d, (Runnable) this.f50122e);
                return;
            case 1:
                c0 c0Var = (c0) this.f50123f;
                c0Var.getClass();
                l lVar = new l(this.f50120b, true, null);
                GiftAuctionController.Auction auction = c0Var.f49901d0;
                m mVar = new m(this.f50121c, (d6) this.d, lVar, auction);
                mVar.show();
                mVar.f50087n0 = (Runnable) this.f50122e;
                c0Var.dismiss();
                return;
            case 2:
                new c0(this.f50121c, (d6) this.d, this.f50120b, (TL_stars.StarGift) this.f50123f, (ArrayList) this.f50122e, null, true).show();
                return;
            default:
                z4.Q((z4) this.f50123f, this.f50120b, this.f50121c, (Runnable) this.f50122e, (TL_stars.StarGift) this.d);
                return;
        }
    }

    public n(cb cbVar, long j3, Context context, d6 d6Var, Runnable runnable, int i10) {
        this.f50119a = i10;
        this.f50123f = cbVar;
        this.f50120b = j3;
        this.f50121c = context;
        this.d = d6Var;
        this.f50122e = runnable;
    }

    public n(z4 z4Var, long j3, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.f50119a = 3;
        this.f50123f = z4Var;
        this.f50120b = j3;
        this.f50121c = context;
        this.f50122e = runnable;
        this.d = starGift;
    }
}
