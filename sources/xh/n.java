package xh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.cb;
public final class n implements View.OnClickListener {
    public final int f50120a;
    public final long f50121b;
    public final Context f50122c;
    public final Object d;
    public final Object f50123e;
    public final Object f50124f;

    public n(Context context, d6 d6Var, long j3, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.f50120a = 2;
        this.f50122c = context;
        this.d = d6Var;
        this.f50121b = j3;
        this.f50124f = starGift;
        this.f50123e = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f50120a) {
            case 0:
                v.O((v) this.f50124f, this.f50121b, this.f50122c, (d6) this.d, (Runnable) this.f50123e);
                return;
            case 1:
                c0 c0Var = (c0) this.f50124f;
                c0Var.getClass();
                l lVar = new l(this.f50121b, true, null);
                GiftAuctionController.Auction auction = c0Var.f49902d0;
                m mVar = new m(this.f50122c, (d6) this.d, lVar, auction);
                mVar.show();
                mVar.f50088n0 = (Runnable) this.f50123e;
                c0Var.dismiss();
                return;
            case 2:
                new c0(this.f50122c, (d6) this.d, this.f50121b, (TL_stars.StarGift) this.f50124f, (ArrayList) this.f50123e, null, true).show();
                return;
            default:
                z4.Q((z4) this.f50124f, this.f50121b, this.f50122c, (Runnable) this.f50123e, (TL_stars.StarGift) this.d);
                return;
        }
    }

    public n(cb cbVar, long j3, Context context, d6 d6Var, Runnable runnable, int i10) {
        this.f50120a = i10;
        this.f50124f = cbVar;
        this.f50121b = j3;
        this.f50122c = context;
        this.d = d6Var;
        this.f50123e = runnable;
    }

    public n(z4 z4Var, long j3, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.f50120a = 3;
        this.f50124f = z4Var;
        this.f50121b = j3;
        this.f50122c = context;
        this.f50123e = runnable;
        this.d = starGift;
    }
}
