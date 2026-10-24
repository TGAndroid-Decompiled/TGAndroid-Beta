package yh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.za;
public final class n implements View.OnClickListener {
    public final int f50867a;
    public final long f50868b;
    public final Context f50869c;
    public final Object d;
    public final Object e;
    public final Object f50870f;

    public n(Context context, g6 g6Var, long j10, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.f50867a = 2;
        this.f50869c = context;
        this.d = g6Var;
        this.f50868b = j10;
        this.f50870f = starGift;
        this.e = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f50867a) {
            case 0:
                v.Q((v) this.f50870f, this.f50868b, this.f50869c, (g6) this.d, (Runnable) this.e);
                return;
            case 1:
                c0 c0Var = (c0) this.f50870f;
                c0Var.getClass();
                l lVar = new l(this.f50868b, true, null);
                GiftAuctionController.Auction auction = c0Var.f50631d0;
                m mVar = new m(this.f50869c, (g6) this.d, lVar, auction);
                mVar.show();
                mVar.f50848n0 = (Runnable) this.e;
                c0Var.dismiss();
                return;
            case 2:
                new c0(this.f50869c, (g6) this.d, this.f50868b, (TL_stars.StarGift) this.f50870f, (ArrayList) this.e, null, true).show();
                return;
            default:
                x4.S((x4) this.f50870f, this.f50868b, this.f50869c, (Runnable) this.e, (TL_stars.StarGift) this.d);
                return;
        }
    }

    public n(za zaVar, long j10, Context context, g6 g6Var, Runnable runnable, int i10) {
        this.f50867a = i10;
        this.f50870f = zaVar;
        this.f50868b = j10;
        this.f50869c = context;
        this.d = g6Var;
        this.e = runnable;
    }

    public n(x4 x4Var, long j10, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.f50867a = 3;
        this.f50870f = x4Var;
        this.f50868b = j10;
        this.f50869c = context;
        this.e = runnable;
        this.d = starGift;
    }
}
