package xh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.bb;
public final class n implements View.OnClickListener {
    public final int f46272a;
    public final long f46273b;
    public final Context f46274c;
    public final Object d;
    public final Object e;
    public final Object f46275f;

    public n(Context context, e6 e6Var, long j3, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.f46272a = 2;
        this.f46274c = context;
        this.d = e6Var;
        this.f46273b = j3;
        this.f46275f = starGift;
        this.e = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f46272a) {
            case 0:
                v.Q((v) this.f46275f, this.f46273b, this.f46274c, (e6) this.d, (Runnable) this.e);
                return;
            case 1:
                c0 c0Var = (c0) this.f46275f;
                c0Var.getClass();
                l lVar = new l(this.f46273b, true, null);
                GiftAuctionController.Auction auction = c0Var.f46071d0;
                m mVar = new m(this.f46274c, (e6) this.d, lVar, auction);
                mVar.show();
                mVar.f46245n0 = (Runnable) this.e;
                c0Var.dismiss();
                return;
            case 2:
                new c0(this.f46274c, (e6) this.d, this.f46273b, (TL_stars.StarGift) this.f46275f, (ArrayList) this.e, null, true).show();
                return;
            default:
                z4.S((z4) this.f46275f, this.f46273b, this.f46274c, (Runnable) this.e, (TL_stars.StarGift) this.d);
                return;
        }
    }

    public n(bb bbVar, long j3, Context context, e6 e6Var, Runnable runnable, int i10) {
        this.f46272a = i10;
        this.f46275f = bbVar;
        this.f46273b = j3;
        this.f46274c = context;
        this.d = e6Var;
        this.e = runnable;
    }

    public n(z4 z4Var, long j3, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.f46272a = 3;
        this.f46275f = z4Var;
        this.f46273b = j3;
        this.f46274c = context;
        this.e = runnable;
        this.d = starGift;
    }
}
