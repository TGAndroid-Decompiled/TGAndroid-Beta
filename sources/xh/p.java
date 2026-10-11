package xh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.db;
public final class p implements View.OnClickListener {
    public final int f51570a;
    public final long f51571b;
    public final Context f51572c;
    public final Object d;
    public final Object f51573e;
    public final Object f51574f;

    public p(Context context, d6 d6Var, long j3, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.f51570a = 2;
        this.f51572c = context;
        this.d = d6Var;
        this.f51571b = j3;
        this.f51574f = starGift;
        this.f51573e = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f51570a) {
            case 0:
                x.R((x) this.f51574f, this.f51571b, this.f51572c, (d6) this.d, (Runnable) this.f51573e);
                return;
            case 1:
                e0 e0Var = (e0) this.f51574f;
                e0Var.getClass();
                n nVar = new n(this.f51571b, true, null);
                GiftAuctionController.Auction auction = e0Var.f51335d0;
                o oVar = new o(this.f51572c, (d6) this.d, nVar, auction);
                oVar.show();
                oVar.f51533n0 = (Runnable) this.f51573e;
                e0Var.dismiss();
                return;
            case 2:
                new e0(this.f51572c, (d6) this.d, this.f51571b, (TL_stars.StarGift) this.f51574f, (ArrayList) this.f51573e, null, true).show();
                return;
            default:
                z4.T((z4) this.f51574f, this.f51571b, this.f51572c, (Runnable) this.f51573e, (TL_stars.StarGift) this.d);
                return;
        }
    }

    public p(db dbVar, long j3, Context context, d6 d6Var, Runnable runnable, int i10) {
        this.f51570a = i10;
        this.f51574f = dbVar;
        this.f51571b = j3;
        this.f51572c = context;
        this.d = d6Var;
        this.f51573e = runnable;
    }

    public p(z4 z4Var, long j3, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.f51570a = 3;
        this.f51574f = z4Var;
        this.f51571b = j3;
        this.f51572c = context;
        this.f51573e = runnable;
        this.d = starGift;
    }
}
