package yh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.bb;
public final class n implements View.OnClickListener {
    public final int f50401a;
    public final long f50402b;
    public final Context f50403c;
    public final Object d;
    public final Object e;
    public final Object f50404f;

    public n(Context context, d6 d6Var, long j10, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.f50401a = 2;
        this.f50403c = context;
        this.d = d6Var;
        this.f50402b = j10;
        this.f50404f = starGift;
        this.e = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f50401a) {
            case 0:
                v.R((v) this.f50404f, this.f50402b, this.f50403c, (d6) this.d, (Runnable) this.e);
                return;
            case 1:
                c0 c0Var = (c0) this.f50404f;
                c0Var.getClass();
                l lVar = new l(this.f50402b, true, null);
                GiftAuctionController.Auction auction = c0Var.f50179d0;
                m mVar = new m(this.f50403c, (d6) this.d, lVar, auction);
                mVar.show();
                mVar.f50382n0 = (Runnable) this.e;
                c0Var.dismiss();
                return;
            case 2:
                new c0(this.f50403c, (d6) this.d, this.f50402b, (TL_stars.StarGift) this.f50404f, (ArrayList) this.e, null, true).show();
                return;
            default:
                x4.T((x4) this.f50404f, this.f50402b, this.f50403c, (Runnable) this.e, (TL_stars.StarGift) this.d);
                return;
        }
    }

    public n(bb bbVar, long j10, Context context, d6 d6Var, Runnable runnable, int i10) {
        this.f50401a = i10;
        this.f50404f = bbVar;
        this.f50402b = j10;
        this.f50403c = context;
        this.d = d6Var;
        this.e = runnable;
    }

    public n(x4 x4Var, long j10, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.f50401a = 3;
        this.f50404f = x4Var;
        this.f50402b = j10;
        this.f50403c = context;
        this.e = runnable;
        this.d = starGift;
    }
}
