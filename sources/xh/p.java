package xh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.eb;
public final class p implements View.OnClickListener {
    public final int f51493a;
    public final long f51494b;
    public final Context f51495c;
    public final Object d;
    public final Object f51496e;
    public final Object f51497f;

    public p(Context context, e6 e6Var, long j3, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.f51493a = 2;
        this.f51495c = context;
        this.d = e6Var;
        this.f51494b = j3;
        this.f51497f = starGift;
        this.f51496e = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f51493a) {
            case 0:
                x.R((x) this.f51497f, this.f51494b, this.f51495c, (e6) this.d, (Runnable) this.f51496e);
                return;
            case 1:
                e0 e0Var = (e0) this.f51497f;
                e0Var.getClass();
                n nVar = new n(this.f51494b, true, null);
                GiftAuctionController.Auction auction = e0Var.f51258d0;
                o oVar = new o(this.f51495c, (e6) this.d, nVar, auction);
                oVar.show();
                oVar.f51456n0 = (Runnable) this.f51496e;
                e0Var.dismiss();
                return;
            case 2:
                new e0(this.f51495c, (e6) this.d, this.f51494b, (TL_stars.StarGift) this.f51497f, (ArrayList) this.f51496e, null, true).show();
                return;
            default:
                z4.T((z4) this.f51497f, this.f51494b, this.f51495c, (Runnable) this.f51496e, (TL_stars.StarGift) this.d);
                return;
        }
    }

    public p(eb ebVar, long j3, Context context, e6 e6Var, Runnable runnable, int i10) {
        this.f51493a = i10;
        this.f51497f = ebVar;
        this.f51494b = j3;
        this.f51495c = context;
        this.d = e6Var;
        this.f51496e = runnable;
    }

    public p(z4 z4Var, long j3, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.f51493a = 3;
        this.f51497f = z4Var;
        this.f51494b = j3;
        this.f51495c = context;
        this.f51496e = runnable;
        this.d = starGift;
    }
}
