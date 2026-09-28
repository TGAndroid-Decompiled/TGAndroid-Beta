package xh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.bb;
public final class n implements View.OnClickListener {
    public final int f46299a;
    public final long f46300b;
    public final Context f46301c;
    public final Object d;
    public final Object e;
    public final Object f46302f;

    public n(Context context, d6 d6Var, long j3, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.f46299a = 2;
        this.f46301c = context;
        this.d = d6Var;
        this.f46300b = j3;
        this.f46302f = starGift;
        this.e = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f46299a) {
            case 0:
                v.Q((v) this.f46302f, this.f46300b, this.f46301c, (d6) this.d, (Runnable) this.e);
                return;
            case 1:
                c0 c0Var = (c0) this.f46302f;
                c0Var.getClass();
                l lVar = new l(this.f46300b, true, null);
                GiftAuctionController.Auction auction = c0Var.f46098d0;
                m mVar = new m(this.f46301c, (d6) this.d, lVar, auction);
                mVar.show();
                mVar.f46272n0 = (Runnable) this.e;
                c0Var.dismiss();
                return;
            case 2:
                new c0(this.f46301c, (d6) this.d, this.f46300b, (TL_stars.StarGift) this.f46302f, (ArrayList) this.e, null, true).show();
                return;
            default:
                z4.S((z4) this.f46302f, this.f46300b, this.f46301c, (Runnable) this.e, (TL_stars.StarGift) this.d);
                return;
        }
    }

    public n(bb bbVar, long j3, Context context, d6 d6Var, Runnable runnable, int i10) {
        this.f46299a = i10;
        this.f46302f = bbVar;
        this.f46300b = j3;
        this.f46301c = context;
        this.d = d6Var;
        this.e = runnable;
    }

    public n(z4 z4Var, long j3, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.f46299a = 3;
        this.f46302f = z4Var;
        this.f46300b = j3;
        this.f46301c = context;
        this.e = runnable;
        this.d = starGift;
    }
}
