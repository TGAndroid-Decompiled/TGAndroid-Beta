package xh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.db;
public final class p implements View.OnClickListener {
    public final int f51669a;
    public final long f51670b;
    public final Context f51671c;
    public final Object d;
    public final Object f51672e;
    public final Object f51673f;

    public p(Context context, c6 c6Var, long j3, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.f51669a = 2;
        this.f51671c = context;
        this.d = c6Var;
        this.f51670b = j3;
        this.f51673f = starGift;
        this.f51672e = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f51669a) {
            case 0:
                x.R((x) this.f51673f, this.f51670b, this.f51671c, (c6) this.d, (Runnable) this.f51672e);
                return;
            case 1:
                e0 e0Var = (e0) this.f51673f;
                e0Var.getClass();
                n nVar = new n(this.f51670b, true, null);
                GiftAuctionController.Auction auction = e0Var.f51433d0;
                o oVar = new o(this.f51671c, (c6) this.d, nVar, auction);
                oVar.show();
                oVar.f51648n0 = (Runnable) this.f51672e;
                e0Var.dismiss();
                return;
            case 2:
                new e0(this.f51671c, (c6) this.d, this.f51670b, (TL_stars.StarGift) this.f51673f, (ArrayList) this.f51672e, null, true).show();
                return;
            default:
                y4.T((y4) this.f51673f, this.f51670b, this.f51671c, (Runnable) this.f51672e, (TL_stars.StarGift) this.d);
                return;
        }
    }

    public p(db dbVar, long j3, Context context, c6 c6Var, Runnable runnable, int i10) {
        this.f51669a = i10;
        this.f51673f = dbVar;
        this.f51670b = j3;
        this.f51671c = context;
        this.d = c6Var;
        this.f51672e = runnable;
    }

    public p(y4 y4Var, long j3, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.f51669a = 3;
        this.f51673f = y4Var;
        this.f51670b = j3;
        this.f51671c = context;
        this.f51672e = runnable;
        this.d = starGift;
    }
}
