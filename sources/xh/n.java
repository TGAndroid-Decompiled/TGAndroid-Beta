package xh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.za;
public final class n implements View.OnClickListener {
    public final int f46052a;
    public final long f46053b;
    public final Context f46054c;
    public final Object d;
    public final Object e;
    public final Object f46055f;

    public n(Context context, f6 f6Var, long j3, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.f46052a = 2;
        this.f46054c = context;
        this.d = f6Var;
        this.f46053b = j3;
        this.f46055f = starGift;
        this.e = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f46052a) {
            case 0:
                v.Q((v) this.f46055f, this.f46053b, this.f46054c, (f6) this.d, (Runnable) this.e);
                return;
            case 1:
                c0 c0Var = (c0) this.f46055f;
                c0Var.getClass();
                l lVar = new l(this.f46053b, true, null);
                GiftAuctionController.Auction auction = c0Var.f45845d0;
                m mVar = new m(this.f46054c, (f6) this.d, lVar, auction);
                mVar.show();
                mVar.f46024n0 = (Runnable) this.e;
                c0Var.dismiss();
                return;
            case 2:
                new c0(this.f46054c, (f6) this.d, this.f46053b, (TL_stars.StarGift) this.f46055f, (ArrayList) this.e, null, true).show();
                return;
            default:
                y4.S((y4) this.f46055f, this.f46053b, this.f46054c, (Runnable) this.e, (TL_stars.StarGift) this.d);
                return;
        }
    }

    public n(za zaVar, long j3, Context context, f6 f6Var, Runnable runnable, int i10) {
        this.f46052a = i10;
        this.f46055f = zaVar;
        this.f46053b = j3;
        this.f46054c = context;
        this.d = f6Var;
        this.e = runnable;
    }

    public n(y4 y4Var, long j3, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.f46052a = 3;
        this.f46055f = y4Var;
        this.f46053b = j3;
        this.f46054c = context;
        this.e = runnable;
        this.d = starGift;
    }
}
