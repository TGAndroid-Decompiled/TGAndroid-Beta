package yh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.bb;
public final class n implements View.OnClickListener {
    public final int f50412a;
    public final long f50413b;
    public final Context f50414c;
    public final Object d;
    public final Object e;
    public final Object f50415f;

    public n(Context context, d6 d6Var, long j10, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.f50412a = 2;
        this.f50414c = context;
        this.d = d6Var;
        this.f50413b = j10;
        this.f50415f = starGift;
        this.e = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f50412a) {
            case 0:
                v.R((v) this.f50415f, this.f50413b, this.f50414c, (d6) this.d, (Runnable) this.e);
                return;
            case 1:
                c0 c0Var = (c0) this.f50415f;
                c0Var.getClass();
                l lVar = new l(this.f50413b, true, null);
                GiftAuctionController.Auction auction = c0Var.f50190d0;
                m mVar = new m(this.f50414c, (d6) this.d, lVar, auction);
                mVar.show();
                mVar.f50393n0 = (Runnable) this.e;
                c0Var.dismiss();
                return;
            case 2:
                new c0(this.f50414c, (d6) this.d, this.f50413b, (TL_stars.StarGift) this.f50415f, (ArrayList) this.e, null, true).show();
                return;
            default:
                x4.T((x4) this.f50415f, this.f50413b, this.f50414c, (Runnable) this.e, (TL_stars.StarGift) this.d);
                return;
        }
    }

    public n(bb bbVar, long j10, Context context, d6 d6Var, Runnable runnable, int i10) {
        this.f50412a = i10;
        this.f50415f = bbVar;
        this.f50413b = j10;
        this.f50414c = context;
        this.d = d6Var;
        this.e = runnable;
    }

    public n(x4 x4Var, long j10, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.f50412a = 3;
        this.f50415f = x4Var;
        this.f50413b = j10;
        this.f50414c = context;
        this.e = runnable;
        this.d = starGift;
    }
}
