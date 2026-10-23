package yh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.bb;
public final class n implements View.OnClickListener {
    public final int f50868a;
    public final long f50869b;
    public final Context f50870c;
    public final Object d;
    public final Object e;
    public final Object f50871f;

    public n(Context context, g6 g6Var, long j10, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.f50868a = 2;
        this.f50870c = context;
        this.d = g6Var;
        this.f50869b = j10;
        this.f50871f = starGift;
        this.e = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f50868a) {
            case 0:
                v.Q((v) this.f50871f, this.f50869b, this.f50870c, (g6) this.d, (Runnable) this.e);
                return;
            case 1:
                c0 c0Var = (c0) this.f50871f;
                c0Var.getClass();
                l lVar = new l(this.f50869b, true, null);
                GiftAuctionController.Auction auction = c0Var.f50632d0;
                m mVar = new m(this.f50870c, (g6) this.d, lVar, auction);
                mVar.show();
                mVar.f50849n0 = (Runnable) this.e;
                c0Var.dismiss();
                return;
            case 2:
                new c0(this.f50870c, (g6) this.d, this.f50869b, (TL_stars.StarGift) this.f50871f, (ArrayList) this.e, null, true).show();
                return;
            default:
                x4.S((x4) this.f50871f, this.f50869b, this.f50870c, (Runnable) this.e, (TL_stars.StarGift) this.d);
                return;
        }
    }

    public n(bb bbVar, long j10, Context context, g6 g6Var, Runnable runnable, int i10) {
        this.f50868a = i10;
        this.f50871f = bbVar;
        this.f50869b = j10;
        this.f50870c = context;
        this.d = g6Var;
        this.e = runnable;
    }

    public n(x4 x4Var, long j10, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.f50868a = 3;
        this.f50871f = x4Var;
        this.f50869b = j10;
        this.f50870c = context;
        this.e = runnable;
        this.d = starGift;
    }
}
