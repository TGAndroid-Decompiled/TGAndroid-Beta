package xh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.bb;
public final class n implements View.OnClickListener {
    public final int f45971a;
    public final long f45972b;
    public final Context f45973c;
    public final Object d;
    public final Object e;
    public final Object f45974f;

    public n(Context context, d6 d6Var, long j3, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.f45971a = 2;
        this.f45973c = context;
        this.d = d6Var;
        this.f45972b = j3;
        this.f45974f = starGift;
        this.e = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f45971a) {
            case 0:
                v.Q((v) this.f45974f, this.f45972b, this.f45973c, (d6) this.d, (Runnable) this.e);
                return;
            case 1:
                c0 c0Var = (c0) this.f45974f;
                c0Var.getClass();
                l lVar = new l(this.f45972b, true, null);
                GiftAuctionController.Auction auction = c0Var.f45770d0;
                m mVar = new m(this.f45973c, (d6) this.d, lVar, auction);
                mVar.show();
                mVar.f45944n0 = (Runnable) this.e;
                c0Var.dismiss();
                return;
            case 2:
                new c0(this.f45973c, (d6) this.d, this.f45972b, (TL_stars.StarGift) this.f45974f, (ArrayList) this.e, null, true).show();
                return;
            default:
                z4.S((z4) this.f45974f, this.f45972b, this.f45973c, (Runnable) this.e, (TL_stars.StarGift) this.d);
                return;
        }
    }

    public n(bb bbVar, long j3, Context context, d6 d6Var, Runnable runnable, int i10) {
        this.f45971a = i10;
        this.f45974f = bbVar;
        this.f45972b = j3;
        this.f45973c = context;
        this.d = d6Var;
        this.e = runnable;
    }

    public n(z4 z4Var, long j3, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.f45971a = 3;
        this.f45974f = z4Var;
        this.f45972b = j3;
        this.f45973c = context;
        this.e = runnable;
        this.d = starGift;
    }
}
