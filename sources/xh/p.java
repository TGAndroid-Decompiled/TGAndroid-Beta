package xh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.eb;
public final class p implements View.OnClickListener {
    public final int f51449a;
    public final long f51450b;
    public final Context f51451c;
    public final Object d;
    public final Object f51452e;
    public final Object f51453f;

    public p(Context context, e6 e6Var, long j3, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.f51449a = 2;
        this.f51451c = context;
        this.d = e6Var;
        this.f51450b = j3;
        this.f51453f = starGift;
        this.f51452e = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f51449a) {
            case 0:
                x.R((x) this.f51453f, this.f51450b, this.f51451c, (e6) this.d, (Runnable) this.f51452e);
                return;
            case 1:
                e0 e0Var = (e0) this.f51453f;
                e0Var.getClass();
                n nVar = new n(this.f51450b, true, null);
                GiftAuctionController.Auction auction = e0Var.f51214d0;
                o oVar = new o(this.f51451c, (e6) this.d, nVar, auction);
                oVar.show();
                oVar.f51412n0 = (Runnable) this.f51452e;
                e0Var.dismiss();
                return;
            case 2:
                new e0(this.f51451c, (e6) this.d, this.f51450b, (TL_stars.StarGift) this.f51453f, (ArrayList) this.f51452e, null, true).show();
                return;
            default:
                z4.T((z4) this.f51453f, this.f51450b, this.f51451c, (Runnable) this.f51452e, (TL_stars.StarGift) this.d);
                return;
        }
    }

    public p(eb ebVar, long j3, Context context, e6 e6Var, Runnable runnable, int i10) {
        this.f51449a = i10;
        this.f51453f = ebVar;
        this.f51450b = j3;
        this.f51451c = context;
        this.d = e6Var;
        this.f51452e = runnable;
    }

    public p(z4 z4Var, long j3, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.f51449a = 3;
        this.f51453f = z4Var;
        this.f51450b = j3;
        this.f51451c = context;
        this.f51452e = runnable;
        this.d = starGift;
    }
}
