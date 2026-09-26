package xh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.bb;
public final class n implements View.OnClickListener {
    public final int f46298a;
    public final long f46299b;
    public final Context f46300c;
    public final Object d;
    public final Object e;
    public final Object f46301f;

    public n(Context context, d6 d6Var, long j3, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.f46298a = 2;
        this.f46300c = context;
        this.d = d6Var;
        this.f46299b = j3;
        this.f46301f = starGift;
        this.e = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f46298a) {
            case 0:
                v.Q((v) this.f46301f, this.f46299b, this.f46300c, (d6) this.d, (Runnable) this.e);
                return;
            case 1:
                c0 c0Var = (c0) this.f46301f;
                c0Var.getClass();
                l lVar = new l(this.f46299b, true, null);
                GiftAuctionController.Auction auction = c0Var.f46097d0;
                m mVar = new m(this.f46300c, (d6) this.d, lVar, auction);
                mVar.show();
                mVar.f46271n0 = (Runnable) this.e;
                c0Var.dismiss();
                return;
            case 2:
                new c0(this.f46300c, (d6) this.d, this.f46299b, (TL_stars.StarGift) this.f46301f, (ArrayList) this.e, null, true).show();
                return;
            default:
                z4.S((z4) this.f46301f, this.f46299b, this.f46300c, (Runnable) this.e, (TL_stars.StarGift) this.d);
                return;
        }
    }

    public n(bb bbVar, long j3, Context context, d6 d6Var, Runnable runnable, int i10) {
        this.f46298a = i10;
        this.f46301f = bbVar;
        this.f46299b = j3;
        this.f46300c = context;
        this.d = d6Var;
        this.e = runnable;
    }

    public n(z4 z4Var, long j3, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.f46298a = 3;
        this.f46301f = z4Var;
        this.f46299b = j3;
        this.f46300c = context;
        this.e = runnable;
        this.d = starGift;
    }
}
