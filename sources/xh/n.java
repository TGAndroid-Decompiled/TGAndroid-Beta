package xh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.bb;
public final class n implements View.OnClickListener {
    public final int f46363a;
    public final long f46364b;
    public final Context f46365c;
    public final Object d;
    public final Object e;
    public final Object f46366f;

    public n(Context context, e6 e6Var, long j3, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.f46363a = 2;
        this.f46365c = context;
        this.d = e6Var;
        this.f46364b = j3;
        this.f46366f = starGift;
        this.e = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f46363a) {
            case 0:
                v.Q((v) this.f46366f, this.f46364b, this.f46365c, (e6) this.d, (Runnable) this.e);
                return;
            case 1:
                c0 c0Var = (c0) this.f46366f;
                c0Var.getClass();
                l lVar = new l(this.f46364b, true, null);
                GiftAuctionController.Auction auction = c0Var.f46160d0;
                m mVar = new m(this.f46365c, (e6) this.d, lVar, auction);
                mVar.show();
                mVar.f46341n0 = (Runnable) this.e;
                c0Var.dismiss();
                return;
            case 2:
                new c0(this.f46365c, (e6) this.d, this.f46364b, (TL_stars.StarGift) this.f46366f, (ArrayList) this.e, null, true).show();
                return;
            default:
                a5.S((a5) this.f46366f, this.f46364b, this.f46365c, (Runnable) this.e, (TL_stars.StarGift) this.d);
                return;
        }
    }

    public n(bb bbVar, long j3, Context context, e6 e6Var, Runnable runnable, int i10) {
        this.f46363a = i10;
        this.f46366f = bbVar;
        this.f46364b = j3;
        this.f46365c = context;
        this.d = e6Var;
        this.e = runnable;
    }

    public n(a5 a5Var, long j3, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.f46363a = 3;
        this.f46366f = a5Var;
        this.f46364b = j3;
        this.f46365c = context;
        this.e = runnable;
        this.d = starGift;
    }
}
