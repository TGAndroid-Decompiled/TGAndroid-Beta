package yh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.bb;
public final class n implements View.OnClickListener {
    public final int f50453a;
    public final long f50454b;
    public final Context f50455c;
    public final Object d;
    public final Object f50456e;
    public final Object f50457f;

    public n(Context context, f6 f6Var, long j3, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.f50453a = 2;
        this.f50455c = context;
        this.d = f6Var;
        this.f50454b = j3;
        this.f50457f = starGift;
        this.f50456e = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f50453a) {
            case 0:
                v.Q((v) this.f50457f, this.f50454b, this.f50455c, (f6) this.d, (Runnable) this.f50456e);
                return;
            case 1:
                c0 c0Var = (c0) this.f50457f;
                c0Var.getClass();
                l lVar = new l(this.f50454b, true, null);
                GiftAuctionController.Auction auction = c0Var.f50218d0;
                m mVar = new m(this.f50455c, (f6) this.d, lVar, auction);
                mVar.show();
                mVar.f50416n0 = (Runnable) this.f50456e;
                c0Var.dismiss();
                return;
            case 2:
                new c0(this.f50455c, (f6) this.d, this.f50454b, (TL_stars.StarGift) this.f50457f, (ArrayList) this.f50456e, null, true).show();
                return;
            default:
                x4.S((x4) this.f50457f, this.f50454b, this.f50455c, (Runnable) this.f50456e, (TL_stars.StarGift) this.d);
                return;
        }
    }

    public n(bb bbVar, long j3, Context context, f6 f6Var, Runnable runnable, int i10) {
        this.f50453a = i10;
        this.f50457f = bbVar;
        this.f50454b = j3;
        this.f50455c = context;
        this.d = f6Var;
        this.f50456e = runnable;
    }

    public n(x4 x4Var, long j3, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.f50453a = 3;
        this.f50457f = x4Var;
        this.f50454b = j3;
        this.f50455c = context;
        this.f50456e = runnable;
        this.d = starGift;
    }
}
