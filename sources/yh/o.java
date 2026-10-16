package yh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.db;
public final class o implements View.OnClickListener {
    public final int f49039a;
    public final long f49040b;
    public final Context f49041c;
    public final Object d;
    public final Object e;
    public final Object f49042f;

    public o(Context context, c6 c6Var, long j10, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.f49039a = 2;
        this.f49041c = context;
        this.d = c6Var;
        this.f49040b = j10;
        this.f49042f = starGift;
        this.e = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f49039a) {
            case 0:
                w.R((w) this.f49042f, this.f49040b, this.f49041c, (c6) this.d, (Runnable) this.e);
                return;
            case 1:
                d0 d0Var = (d0) this.f49042f;
                d0Var.getClass();
                m mVar = new m(this.f49040b, true, null);
                GiftAuctionController.Auction auction = d0Var.f48812d0;
                n nVar = new n(this.f49041c, (c6) this.d, mVar, auction);
                nVar.show();
                nVar.f49018n0 = (Runnable) this.e;
                d0Var.dismiss();
                return;
            case 2:
                new d0(this.f49041c, (c6) this.d, this.f49040b, (TL_stars.StarGift) this.f49042f, (ArrayList) this.e, null, true).show();
                return;
            default:
                x4.T((x4) this.f49042f, this.f49040b, this.f49041c, (Runnable) this.e, (TL_stars.StarGift) this.d);
                return;
        }
    }

    public o(db dbVar, long j10, Context context, c6 c6Var, Runnable runnable, int i10) {
        this.f49039a = i10;
        this.f49042f = dbVar;
        this.f49040b = j10;
        this.f49041c = context;
        this.d = c6Var;
        this.e = runnable;
    }

    public o(x4 x4Var, long j10, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.f49039a = 3;
        this.f49042f = x4Var;
        this.f49040b = j10;
        this.f49041c = context;
        this.e = runnable;
        this.d = starGift;
    }
}
