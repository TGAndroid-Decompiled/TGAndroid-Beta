package xh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.db;
public final class p implements View.OnClickListener {
    public final int f51536a;
    public final long f51537b;
    public final Context f51538c;
    public final Object d;
    public final Object f51539e;
    public final Object f51540f;

    public p(Context context, d6 d6Var, long j3, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.f51536a = 2;
        this.f51538c = context;
        this.d = d6Var;
        this.f51537b = j3;
        this.f51540f = starGift;
        this.f51539e = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f51536a) {
            case 0:
                x.R((x) this.f51540f, this.f51537b, this.f51538c, (d6) this.d, (Runnable) this.f51539e);
                return;
            case 1:
                e0 e0Var = (e0) this.f51540f;
                e0Var.getClass();
                n nVar = new n(this.f51537b, true, null);
                GiftAuctionController.Auction auction = e0Var.f51301d0;
                o oVar = new o(this.f51538c, (d6) this.d, nVar, auction);
                oVar.show();
                oVar.f51499n0 = (Runnable) this.f51539e;
                e0Var.dismiss();
                return;
            case 2:
                new e0(this.f51538c, (d6) this.d, this.f51537b, (TL_stars.StarGift) this.f51540f, (ArrayList) this.f51539e, null, true).show();
                return;
            default:
                z4.T((z4) this.f51540f, this.f51537b, this.f51538c, (Runnable) this.f51539e, (TL_stars.StarGift) this.d);
                return;
        }
    }

    public p(db dbVar, long j3, Context context, d6 d6Var, Runnable runnable, int i10) {
        this.f51536a = i10;
        this.f51540f = dbVar;
        this.f51537b = j3;
        this.f51538c = context;
        this.d = d6Var;
        this.f51539e = runnable;
    }

    public p(z4 z4Var, long j3, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.f51536a = 3;
        this.f51540f = z4Var;
        this.f51537b = j3;
        this.f51538c = context;
        this.f51539e = runnable;
        this.d = starGift;
    }
}
