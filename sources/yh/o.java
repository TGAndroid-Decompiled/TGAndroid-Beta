package yh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.bb;
public final class o implements View.OnClickListener {
    public final int f50462a;
    public final long f50463b;
    public final Context f50464c;
    public final Object d;
    public final Object e;
    public final Object f50465f;

    public o(Context context, d6 d6Var, long j10, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.f50462a = 2;
        this.f50464c = context;
        this.d = d6Var;
        this.f50463b = j10;
        this.f50465f = starGift;
        this.e = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f50462a) {
            case 0:
                w.R((w) this.f50465f, this.f50463b, this.f50464c, (d6) this.d, (Runnable) this.e);
                return;
            case 1:
                d0 d0Var = (d0) this.f50465f;
                d0Var.getClass();
                m mVar = new m(this.f50463b, true, null);
                GiftAuctionController.Auction auction = d0Var.f50244d0;
                n nVar = new n(this.f50464c, (d6) this.d, mVar, auction);
                nVar.show();
                nVar.f50443n0 = (Runnable) this.e;
                d0Var.dismiss();
                return;
            case 2:
                new d0(this.f50464c, (d6) this.d, this.f50463b, (TL_stars.StarGift) this.f50465f, (ArrayList) this.e, null, true).show();
                return;
            default:
                y4.T((y4) this.f50465f, this.f50463b, this.f50464c, (Runnable) this.e, (TL_stars.StarGift) this.d);
                return;
        }
    }

    public o(bb bbVar, long j10, Context context, d6 d6Var, Runnable runnable, int i10) {
        this.f50462a = i10;
        this.f50465f = bbVar;
        this.f50463b = j10;
        this.f50464c = context;
        this.d = d6Var;
        this.e = runnable;
    }

    public o(y4 y4Var, long j10, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.f50462a = 3;
        this.f50465f = y4Var;
        this.f50463b = j10;
        this.f50464c = context;
        this.e = runnable;
        this.d = starGift;
    }
}
