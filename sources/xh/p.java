package xh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.eb;
public final class p implements View.OnClickListener {
    public final int f51447a;
    public final long f51448b;
    public final Context f51449c;
    public final Object d;
    public final Object f51450e;
    public final Object f51451f;

    public p(Context context, e6 e6Var, long j3, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.f51447a = 2;
        this.f51449c = context;
        this.d = e6Var;
        this.f51448b = j3;
        this.f51451f = starGift;
        this.f51450e = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f51447a) {
            case 0:
                x.R((x) this.f51451f, this.f51448b, this.f51449c, (e6) this.d, (Runnable) this.f51450e);
                return;
            case 1:
                e0 e0Var = (e0) this.f51451f;
                e0Var.getClass();
                n nVar = new n(this.f51448b, true, null);
                GiftAuctionController.Auction auction = e0Var.f51212d0;
                o oVar = new o(this.f51449c, (e6) this.d, nVar, auction);
                oVar.show();
                oVar.f51410n0 = (Runnable) this.f51450e;
                e0Var.dismiss();
                return;
            case 2:
                new e0(this.f51449c, (e6) this.d, this.f51448b, (TL_stars.StarGift) this.f51451f, (ArrayList) this.f51450e, null, true).show();
                return;
            default:
                z4.T((z4) this.f51451f, this.f51448b, this.f51449c, (Runnable) this.f51450e, (TL_stars.StarGift) this.d);
                return;
        }
    }

    public p(eb ebVar, long j3, Context context, e6 e6Var, Runnable runnable, int i10) {
        this.f51447a = i10;
        this.f51451f = ebVar;
        this.f51448b = j3;
        this.f51449c = context;
        this.d = e6Var;
        this.f51450e = runnable;
    }

    public p(z4 z4Var, long j3, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.f51447a = 3;
        this.f51451f = z4Var;
        this.f51448b = j3;
        this.f51449c = context;
        this.f51450e = runnable;
        this.d = starGift;
    }
}
