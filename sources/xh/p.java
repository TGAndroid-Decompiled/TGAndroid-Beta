package xh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.db;
public final class p implements View.OnClickListener {
    public final int f51677a;
    public final long f51678b;
    public final Context f51679c;
    public final Object d;
    public final Object f51680e;
    public final Object f51681f;

    public p(Context context, c6 c6Var, long j3, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.f51677a = 2;
        this.f51679c = context;
        this.d = c6Var;
        this.f51678b = j3;
        this.f51681f = starGift;
        this.f51680e = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f51677a) {
            case 0:
                x.R((x) this.f51681f, this.f51678b, this.f51679c, (c6) this.d, (Runnable) this.f51680e);
                return;
            case 1:
                e0 e0Var = (e0) this.f51681f;
                e0Var.getClass();
                n nVar = new n(this.f51678b, true, null);
                GiftAuctionController.Auction auction = e0Var.f51441d0;
                o oVar = new o(this.f51679c, (c6) this.d, nVar, auction);
                oVar.show();
                oVar.f51656n0 = (Runnable) this.f51680e;
                e0Var.dismiss();
                return;
            case 2:
                new e0(this.f51679c, (c6) this.d, this.f51678b, (TL_stars.StarGift) this.f51681f, (ArrayList) this.f51680e, null, true).show();
                return;
            default:
                y4.T((y4) this.f51681f, this.f51678b, this.f51679c, (Runnable) this.f51680e, (TL_stars.StarGift) this.d);
                return;
        }
    }

    public p(db dbVar, long j3, Context context, c6 c6Var, Runnable runnable, int i10) {
        this.f51677a = i10;
        this.f51681f = dbVar;
        this.f51678b = j3;
        this.f51679c = context;
        this.d = c6Var;
        this.f51680e = runnable;
    }

    public p(y4 y4Var, long j3, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.f51677a = 3;
        this.f51681f = y4Var;
        this.f51678b = j3;
        this.f51679c = context;
        this.f51680e = runnable;
        this.d = starGift;
    }
}
