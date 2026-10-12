package yh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.db;
public final class o implements View.OnClickListener {
    public final int f49040a;
    public final long f49041b;
    public final Context f49042c;
    public final Object d;
    public final Object e;
    public final Object f49043f;

    public o(Context context, c6 c6Var, long j10, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.f49040a = 2;
        this.f49042c = context;
        this.d = c6Var;
        this.f49041b = j10;
        this.f49043f = starGift;
        this.e = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f49040a) {
            case 0:
                w.R((w) this.f49043f, this.f49041b, this.f49042c, (c6) this.d, (Runnable) this.e);
                return;
            case 1:
                d0 d0Var = (d0) this.f49043f;
                d0Var.getClass();
                m mVar = new m(this.f49041b, true, null);
                GiftAuctionController.Auction auction = d0Var.f48813d0;
                n nVar = new n(this.f49042c, (c6) this.d, mVar, auction);
                nVar.show();
                nVar.f49019n0 = (Runnable) this.e;
                d0Var.dismiss();
                return;
            case 2:
                new d0(this.f49042c, (c6) this.d, this.f49041b, (TL_stars.StarGift) this.f49043f, (ArrayList) this.e, null, true).show();
                return;
            default:
                x4.T((x4) this.f49043f, this.f49041b, this.f49042c, (Runnable) this.e, (TL_stars.StarGift) this.d);
                return;
        }
    }

    public o(db dbVar, long j10, Context context, c6 c6Var, Runnable runnable, int i10) {
        this.f49040a = i10;
        this.f49043f = dbVar;
        this.f49041b = j10;
        this.f49042c = context;
        this.d = c6Var;
        this.e = runnable;
    }

    public o(x4 x4Var, long j10, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.f49040a = 3;
        this.f49043f = x4Var;
        this.f49041b = j10;
        this.f49042c = context;
        this.e = runnable;
        this.d = starGift;
    }
}
