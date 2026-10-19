package yh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.bb;
public final class n implements View.OnClickListener {
    public final int f50403a;
    public final long f50404b;
    public final Context f50405c;
    public final Object d;
    public final Object e;
    public final Object f50406f;

    public n(Context context, d6 d6Var, long j10, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.f50403a = 2;
        this.f50405c = context;
        this.d = d6Var;
        this.f50404b = j10;
        this.f50406f = starGift;
        this.e = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f50403a) {
            case 0:
                v.R((v) this.f50406f, this.f50404b, this.f50405c, (d6) this.d, (Runnable) this.e);
                return;
            case 1:
                c0 c0Var = (c0) this.f50406f;
                c0Var.getClass();
                l lVar = new l(this.f50404b, true, null);
                GiftAuctionController.Auction auction = c0Var.f50181d0;
                m mVar = new m(this.f50405c, (d6) this.d, lVar, auction);
                mVar.show();
                mVar.f50384n0 = (Runnable) this.e;
                c0Var.dismiss();
                return;
            case 2:
                new c0(this.f50405c, (d6) this.d, this.f50404b, (TL_stars.StarGift) this.f50406f, (ArrayList) this.e, null, true).show();
                return;
            default:
                x4.T((x4) this.f50406f, this.f50404b, this.f50405c, (Runnable) this.e, (TL_stars.StarGift) this.d);
                return;
        }
    }

    public n(bb bbVar, long j10, Context context, d6 d6Var, Runnable runnable, int i10) {
        this.f50403a = i10;
        this.f50406f = bbVar;
        this.f50404b = j10;
        this.f50405c = context;
        this.d = d6Var;
        this.e = runnable;
    }

    public n(x4 x4Var, long j10, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.f50403a = 3;
        this.f50406f = x4Var;
        this.f50404b = j10;
        this.f50405c = context;
        this.e = runnable;
        this.d = starGift;
    }
}
