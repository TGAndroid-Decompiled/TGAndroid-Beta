package xh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.ab;
public final class n implements View.OnClickListener {
    public final int f46319a;
    public final long f46320b;
    public final Context f46321c;
    public final Object d;
    public final Object e;
    public final Object f46322f;

    public n(Context context, f6 f6Var, long j3, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.f46319a = 2;
        this.f46321c = context;
        this.d = f6Var;
        this.f46320b = j3;
        this.f46322f = starGift;
        this.e = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f46319a) {
            case 0:
                v.Q((v) this.f46322f, this.f46320b, this.f46321c, (f6) this.d, (Runnable) this.e);
                return;
            case 1:
                c0 c0Var = (c0) this.f46322f;
                c0Var.getClass();
                l lVar = new l(this.f46320b, true, null);
                GiftAuctionController.Auction auction = c0Var.f46118d0;
                m mVar = new m(this.f46321c, (f6) this.d, lVar, auction);
                mVar.show();
                mVar.f46292n0 = (Runnable) this.e;
                c0Var.dismiss();
                return;
            case 2:
                new c0(this.f46321c, (f6) this.d, this.f46320b, (TL_stars.StarGift) this.f46322f, (ArrayList) this.e, null, true).show();
                return;
            default:
                z4.S((z4) this.f46322f, this.f46320b, this.f46321c, (Runnable) this.e, (TL_stars.StarGift) this.d);
                return;
        }
    }

    public n(ab abVar, long j3, Context context, f6 f6Var, Runnable runnable, int i10) {
        this.f46319a = i10;
        this.f46322f = abVar;
        this.f46320b = j3;
        this.f46321c = context;
        this.d = f6Var;
        this.e = runnable;
    }

    public n(z4 z4Var, long j3, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.f46319a = 3;
        this.f46322f = z4Var;
        this.f46320b = j3;
        this.f46321c = context;
        this.e = runnable;
        this.d = starGift;
    }
}
