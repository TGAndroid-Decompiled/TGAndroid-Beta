package wh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.ab;
public final class n implements View.OnClickListener {
    public final int f44258a;
    public final long f44259b;
    public final Context f44260c;
    public final Object d;
    public final Object e;
    public final Object f44261f;

    public n(Context context, f6 f6Var, long j3, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.f44258a = 2;
        this.f44260c = context;
        this.d = f6Var;
        this.f44259b = j3;
        this.f44261f = starGift;
        this.e = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f44258a) {
            case 0:
                w.Q((w) this.f44261f, this.f44259b, this.f44260c, (f6) this.d, (Runnable) this.e);
                return;
            case 1:
                d0 d0Var = (d0) this.f44261f;
                d0Var.getClass();
                l lVar = new l(this.f44259b, true, null);
                GiftAuctionController.Auction auction = d0Var.f44050d0;
                m mVar = new m(this.f44260c, (f6) this.d, lVar, auction);
                mVar.show();
                mVar.f44226n0 = (Runnable) this.e;
                d0Var.dismiss();
                return;
            case 2:
                new d0(this.f44260c, (f6) this.d, this.f44259b, (TL_stars.StarGift) this.f44261f, (ArrayList) this.e, null, true).show();
                return;
            default:
                y4.S((y4) this.f44261f, this.f44259b, this.f44260c, (Runnable) this.e, (TL_stars.StarGift) this.d);
                return;
        }
    }

    public n(ab abVar, long j3, Context context, f6 f6Var, Runnable runnable, int i10) {
        this.f44258a = i10;
        this.f44261f = abVar;
        this.f44259b = j3;
        this.f44260c = context;
        this.d = f6Var;
        this.e = runnable;
    }

    public n(y4 y4Var, long j3, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.f44258a = 3;
        this.f44261f = y4Var;
        this.f44259b = j3;
        this.f44260c = context;
        this.e = runnable;
        this.d = starGift;
    }
}
