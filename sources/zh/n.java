package zh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.bb;
public final class n implements View.OnClickListener {
    public final int f53155a;
    public final long f53156b;
    public final Context f53157c;
    public final Object d;
    public final Object e;
    public final Object f53158f;

    public n(Context context, u6 u6Var, long j10, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.f53155a = 2;
        this.f53157c = context;
        this.d = u6Var;
        this.f53156b = j10;
        this.f53158f = starGift;
        this.e = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f53155a) {
            case 0:
                v.Q((v) this.f53158f, this.f53156b, this.f53157c, (u6) this.d, (Runnable) this.e);
                return;
            case 1:
                c0 c0Var = (c0) this.f53158f;
                c0Var.getClass();
                l lVar = new l(this.f53156b, true, null);
                GiftAuctionController.Auction auction = c0Var.f52917d0;
                m mVar = new m(this.f53157c, (u6) this.d, lVar, auction);
                mVar.show();
                mVar.f53124n0 = (Runnable) this.e;
                c0Var.dismiss();
                return;
            case 2:
                new c0(this.f53157c, (u6) this.d, this.f53156b, (TL_stars.StarGift) this.f53158f, (ArrayList) this.e, null, true).show();
                return;
            default:
                y4.S((y4) this.f53158f, this.f53156b, this.f53157c, (Runnable) this.e, (TL_stars.StarGift) this.d);
                return;
        }
    }

    public n(bb bbVar, long j10, Context context, u6 u6Var, Runnable runnable, int i10) {
        this.f53155a = i10;
        this.f53158f = bbVar;
        this.f53156b = j10;
        this.f53157c = context;
        this.d = u6Var;
        this.e = runnable;
    }

    public n(y4 y4Var, long j10, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.f53155a = 3;
        this.f53158f = y4Var;
        this.f53156b = j10;
        this.f53157c = context;
        this.e = runnable;
        this.d = starGift;
    }
}
