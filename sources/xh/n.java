package xh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.cb;
public final class n implements View.OnClickListener {
    public final int f50135a;
    public final long f50136b;
    public final Context f50137c;
    public final Object d;
    public final Object f50138e;
    public final Object f50139f;

    public n(Context context, d6 d6Var, long j3, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.f50135a = 2;
        this.f50137c = context;
        this.d = d6Var;
        this.f50136b = j3;
        this.f50139f = starGift;
        this.f50138e = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f50135a) {
            case 0:
                v.O((v) this.f50139f, this.f50136b, this.f50137c, (d6) this.d, (Runnable) this.f50138e);
                return;
            case 1:
                c0 c0Var = (c0) this.f50139f;
                c0Var.getClass();
                l lVar = new l(this.f50136b, true, null);
                GiftAuctionController.Auction auction = c0Var.f49917d0;
                m mVar = new m(this.f50137c, (d6) this.d, lVar, auction);
                mVar.show();
                mVar.f50103n0 = (Runnable) this.f50138e;
                c0Var.dismiss();
                return;
            case 2:
                new c0(this.f50137c, (d6) this.d, this.f50136b, (TL_stars.StarGift) this.f50139f, (ArrayList) this.f50138e, null, true).show();
                return;
            default:
                z4.Q((z4) this.f50139f, this.f50136b, this.f50137c, (Runnable) this.f50138e, (TL_stars.StarGift) this.d);
                return;
        }
    }

    public n(cb cbVar, long j3, Context context, d6 d6Var, Runnable runnable, int i10) {
        this.f50135a = i10;
        this.f50139f = cbVar;
        this.f50136b = j3;
        this.f50137c = context;
        this.d = d6Var;
        this.f50138e = runnable;
    }

    public n(z4 z4Var, long j3, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.f50135a = 3;
        this.f50139f = z4Var;
        this.f50136b = j3;
        this.f50137c = context;
        this.f50138e = runnable;
        this.d = starGift;
    }
}
