package xh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.cb;
public final class n implements View.OnClickListener {
    public final int f50128a;
    public final long f50129b;
    public final Context f50130c;
    public final Object d;
    public final Object f50131e;
    public final Object f50132f;

    public n(Context context, d6 d6Var, long j3, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.f50128a = 2;
        this.f50130c = context;
        this.d = d6Var;
        this.f50129b = j3;
        this.f50132f = starGift;
        this.f50131e = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f50128a) {
            case 0:
                v.O((v) this.f50132f, this.f50129b, this.f50130c, (d6) this.d, (Runnable) this.f50131e);
                return;
            case 1:
                c0 c0Var = (c0) this.f50132f;
                c0Var.getClass();
                l lVar = new l(this.f50129b, true, null);
                GiftAuctionController.Auction auction = c0Var.f49910d0;
                m mVar = new m(this.f50130c, (d6) this.d, lVar, auction);
                mVar.show();
                mVar.f50096n0 = (Runnable) this.f50131e;
                c0Var.dismiss();
                return;
            case 2:
                new c0(this.f50130c, (d6) this.d, this.f50129b, (TL_stars.StarGift) this.f50132f, (ArrayList) this.f50131e, null, true).show();
                return;
            default:
                z4.Q((z4) this.f50132f, this.f50129b, this.f50130c, (Runnable) this.f50131e, (TL_stars.StarGift) this.d);
                return;
        }
    }

    public n(cb cbVar, long j3, Context context, d6 d6Var, Runnable runnable, int i10) {
        this.f50128a = i10;
        this.f50132f = cbVar;
        this.f50129b = j3;
        this.f50130c = context;
        this.d = d6Var;
        this.f50131e = runnable;
    }

    public n(z4 z4Var, long j3, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.f50128a = 3;
        this.f50132f = z4Var;
        this.f50129b = j3;
        this.f50130c = context;
        this.f50131e = runnable;
        this.d = starGift;
    }
}
