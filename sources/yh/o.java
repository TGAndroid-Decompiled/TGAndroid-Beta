package yh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.bb;
public final class o implements View.OnClickListener {
    public final int f50437a;
    public final long f50438b;
    public final Context f50439c;
    public final Object d;
    public final Object e;
    public final Object f50440f;

    public o(Context context, d6 d6Var, long j10, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.f50437a = 2;
        this.f50439c = context;
        this.d = d6Var;
        this.f50438b = j10;
        this.f50440f = starGift;
        this.e = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f50437a) {
            case 0:
                w.R((w) this.f50440f, this.f50438b, this.f50439c, (d6) this.d, (Runnable) this.e);
                return;
            case 1:
                d0 d0Var = (d0) this.f50440f;
                d0Var.getClass();
                m mVar = new m(this.f50438b, true, null);
                GiftAuctionController.Auction auction = d0Var.f50219d0;
                n nVar = new n(this.f50439c, (d6) this.d, mVar, auction);
                nVar.show();
                nVar.f50418n0 = (Runnable) this.e;
                d0Var.dismiss();
                return;
            case 2:
                new d0(this.f50439c, (d6) this.d, this.f50438b, (TL_stars.StarGift) this.f50440f, (ArrayList) this.e, null, true).show();
                return;
            default:
                y4.T((y4) this.f50440f, this.f50438b, this.f50439c, (Runnable) this.e, (TL_stars.StarGift) this.d);
                return;
        }
    }

    public o(bb bbVar, long j10, Context context, d6 d6Var, Runnable runnable, int i10) {
        this.f50437a = i10;
        this.f50440f = bbVar;
        this.f50438b = j10;
        this.f50439c = context;
        this.d = d6Var;
        this.e = runnable;
    }

    public o(y4 y4Var, long j10, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.f50437a = 3;
        this.f50440f = y4Var;
        this.f50438b = j10;
        this.f50439c = context;
        this.e = runnable;
        this.d = starGift;
    }
}
