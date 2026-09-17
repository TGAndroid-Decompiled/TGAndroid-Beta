package xh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.za;
public final class n implements View.OnClickListener {
    public final int f46047a;
    public final long f46048b;
    public final Context f46049c;
    public final Object d;
    public final Object e;
    public final Object f46050f;

    public n(Context context, f6 f6Var, long j3, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.f46047a = 2;
        this.f46049c = context;
        this.d = f6Var;
        this.f46048b = j3;
        this.f46050f = starGift;
        this.e = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f46047a) {
            case 0:
                v.Q((v) this.f46050f, this.f46048b, this.f46049c, (f6) this.d, (Runnable) this.e);
                return;
            case 1:
                c0 c0Var = (c0) this.f46050f;
                c0Var.getClass();
                l lVar = new l(this.f46048b, true, null);
                GiftAuctionController.Auction auction = c0Var.f45840d0;
                m mVar = new m(this.f46049c, (f6) this.d, lVar, auction);
                mVar.show();
                mVar.f46019n0 = (Runnable) this.e;
                c0Var.dismiss();
                return;
            case 2:
                new c0(this.f46049c, (f6) this.d, this.f46048b, (TL_stars.StarGift) this.f46050f, (ArrayList) this.e, null, true).show();
                return;
            default:
                y4.S((y4) this.f46050f, this.f46048b, this.f46049c, (Runnable) this.e, (TL_stars.StarGift) this.d);
                return;
        }
    }

    public n(za zaVar, long j3, Context context, f6 f6Var, Runnable runnable, int i10) {
        this.f46047a = i10;
        this.f46050f = zaVar;
        this.f46048b = j3;
        this.f46049c = context;
        this.d = f6Var;
        this.e = runnable;
    }

    public n(y4 y4Var, long j3, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.f46047a = 3;
        this.f46050f = y4Var;
        this.f46048b = j3;
        this.f46049c = context;
        this.e = runnable;
        this.d = starGift;
    }
}
