package xh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.za;
public final class n implements View.OnClickListener {
    public final int f46024a;
    public final long f46025b;
    public final Context f46026c;
    public final Object d;
    public final Object e;
    public final Object f46027f;

    public n(Context context, e6 e6Var, long j3, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.f46024a = 2;
        this.f46026c = context;
        this.d = e6Var;
        this.f46025b = j3;
        this.f46027f = starGift;
        this.e = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f46024a) {
            case 0:
                v.Q((v) this.f46027f, this.f46025b, this.f46026c, (e6) this.d, (Runnable) this.e);
                return;
            case 1:
                c0 c0Var = (c0) this.f46027f;
                c0Var.getClass();
                l lVar = new l(this.f46025b, true, null);
                GiftAuctionController.Auction auction = c0Var.f45817d0;
                m mVar = new m(this.f46026c, (e6) this.d, lVar, auction);
                mVar.show();
                mVar.f45996n0 = (Runnable) this.e;
                c0Var.dismiss();
                return;
            case 2:
                new c0(this.f46026c, (e6) this.d, this.f46025b, (TL_stars.StarGift) this.f46027f, (ArrayList) this.e, null, true).show();
                return;
            default:
                y4.S((y4) this.f46027f, this.f46025b, this.f46026c, (Runnable) this.e, (TL_stars.StarGift) this.d);
                return;
        }
    }

    public n(za zaVar, long j3, Context context, e6 e6Var, Runnable runnable, int i10) {
        this.f46024a = i10;
        this.f46027f = zaVar;
        this.f46025b = j3;
        this.f46026c = context;
        this.d = e6Var;
        this.e = runnable;
    }

    public n(y4 y4Var, long j3, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.f46024a = 3;
        this.f46027f = y4Var;
        this.f46025b = j3;
        this.f46026c = context;
        this.e = runnable;
        this.d = starGift;
    }
}
