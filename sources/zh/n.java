package zh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.bb;
public final class n implements View.OnClickListener {
    public final int f53213a;
    public final long f53214b;
    public final Context f53215c;
    public final Object d;
    public final Object e;
    public final Object f53216f;

    public n(Context context, u6 u6Var, long j10, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.f53213a = 2;
        this.f53215c = context;
        this.d = u6Var;
        this.f53214b = j10;
        this.f53216f = starGift;
        this.e = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f53213a) {
            case 0:
                v.Q((v) this.f53216f, this.f53214b, this.f53215c, (u6) this.d, (Runnable) this.e);
                return;
            case 1:
                c0 c0Var = (c0) this.f53216f;
                c0Var.getClass();
                l lVar = new l(this.f53214b, true, null);
                GiftAuctionController.Auction auction = c0Var.f52975d0;
                m mVar = new m(this.f53215c, (u6) this.d, lVar, auction);
                mVar.show();
                mVar.f53182n0 = (Runnable) this.e;
                c0Var.dismiss();
                return;
            case 2:
                new c0(this.f53215c, (u6) this.d, this.f53214b, (TL_stars.StarGift) this.f53216f, (ArrayList) this.e, null, true).show();
                return;
            default:
                y4.S((y4) this.f53216f, this.f53214b, this.f53215c, (Runnable) this.e, (TL_stars.StarGift) this.d);
                return;
        }
    }

    public n(bb bbVar, long j10, Context context, u6 u6Var, Runnable runnable, int i10) {
        this.f53213a = i10;
        this.f53216f = bbVar;
        this.f53214b = j10;
        this.f53215c = context;
        this.d = u6Var;
        this.e = runnable;
    }

    public n(y4 y4Var, long j10, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.f53213a = 3;
        this.f53216f = y4Var;
        this.f53214b = j10;
        this.f53215c = context;
        this.e = runnable;
        this.d = starGift;
    }
}
