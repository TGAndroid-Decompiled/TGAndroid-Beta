package yh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.bb;
public final class n implements View.OnClickListener {
    public final int f50483a;
    public final long f50484b;
    public final Context f50485c;
    public final Object d;
    public final Object f50486e;
    public final Object f50487f;

    public n(Context context, f6 f6Var, long j3, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.f50483a = 2;
        this.f50485c = context;
        this.d = f6Var;
        this.f50484b = j3;
        this.f50487f = starGift;
        this.f50486e = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f50483a) {
            case 0:
                v.Q((v) this.f50487f, this.f50484b, this.f50485c, (f6) this.d, (Runnable) this.f50486e);
                return;
            case 1:
                c0 c0Var = (c0) this.f50487f;
                c0Var.getClass();
                l lVar = new l(this.f50484b, true, null);
                GiftAuctionController.Auction auction = c0Var.f50248d0;
                m mVar = new m(this.f50485c, (f6) this.d, lVar, auction);
                mVar.show();
                mVar.f50446n0 = (Runnable) this.f50486e;
                c0Var.dismiss();
                return;
            case 2:
                new c0(this.f50485c, (f6) this.d, this.f50484b, (TL_stars.StarGift) this.f50487f, (ArrayList) this.f50486e, null, true).show();
                return;
            default:
                x4.S((x4) this.f50487f, this.f50484b, this.f50485c, (Runnable) this.f50486e, (TL_stars.StarGift) this.d);
                return;
        }
    }

    public n(bb bbVar, long j3, Context context, f6 f6Var, Runnable runnable, int i10) {
        this.f50483a = i10;
        this.f50487f = bbVar;
        this.f50484b = j3;
        this.f50485c = context;
        this.d = f6Var;
        this.f50486e = runnable;
    }

    public n(x4 x4Var, long j3, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.f50483a = 3;
        this.f50487f = x4Var;
        this.f50484b = j3;
        this.f50485c = context;
        this.f50486e = runnable;
        this.d = starGift;
    }
}
