package yh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.bb;
public final class n implements View.OnClickListener {
    public final int f50408a;
    public final long f50409b;
    public final Context f50410c;
    public final Object d;
    public final Object e;
    public final Object f50411f;

    public n(Context context, d6 d6Var, long j10, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.f50408a = 2;
        this.f50410c = context;
        this.d = d6Var;
        this.f50409b = j10;
        this.f50411f = starGift;
        this.e = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f50408a) {
            case 0:
                v.R((v) this.f50411f, this.f50409b, this.f50410c, (d6) this.d, (Runnable) this.e);
                return;
            case 1:
                c0 c0Var = (c0) this.f50411f;
                c0Var.getClass();
                l lVar = new l(this.f50409b, true, null);
                GiftAuctionController.Auction auction = c0Var.f50186d0;
                m mVar = new m(this.f50410c, (d6) this.d, lVar, auction);
                mVar.show();
                mVar.f50389n0 = (Runnable) this.e;
                c0Var.dismiss();
                return;
            case 2:
                new c0(this.f50410c, (d6) this.d, this.f50409b, (TL_stars.StarGift) this.f50411f, (ArrayList) this.e, null, true).show();
                return;
            default:
                x4.T((x4) this.f50411f, this.f50409b, this.f50410c, (Runnable) this.e, (TL_stars.StarGift) this.d);
                return;
        }
    }

    public n(bb bbVar, long j10, Context context, d6 d6Var, Runnable runnable, int i10) {
        this.f50408a = i10;
        this.f50411f = bbVar;
        this.f50409b = j10;
        this.f50410c = context;
        this.d = d6Var;
        this.e = runnable;
    }

    public n(x4 x4Var, long j10, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.f50408a = 3;
        this.f50411f = x4Var;
        this.f50409b = j10;
        this.f50410c = context;
        this.e = runnable;
        this.d = starGift;
    }
}
