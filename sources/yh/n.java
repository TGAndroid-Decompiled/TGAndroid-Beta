package yh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.bb;
public final class n implements View.OnClickListener {
    public final int f50454a;
    public final long f50455b;
    public final Context f50456c;
    public final Object d;
    public final Object f50457e;
    public final Object f50458f;

    public n(Context context, f6 f6Var, long j3, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.f50454a = 2;
        this.f50456c = context;
        this.d = f6Var;
        this.f50455b = j3;
        this.f50458f = starGift;
        this.f50457e = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f50454a) {
            case 0:
                v.Q((v) this.f50458f, this.f50455b, this.f50456c, (f6) this.d, (Runnable) this.f50457e);
                return;
            case 1:
                c0 c0Var = (c0) this.f50458f;
                c0Var.getClass();
                l lVar = new l(this.f50455b, true, null);
                GiftAuctionController.Auction auction = c0Var.f50219d0;
                m mVar = new m(this.f50456c, (f6) this.d, lVar, auction);
                mVar.show();
                mVar.f50417n0 = (Runnable) this.f50457e;
                c0Var.dismiss();
                return;
            case 2:
                new c0(this.f50456c, (f6) this.d, this.f50455b, (TL_stars.StarGift) this.f50458f, (ArrayList) this.f50457e, null, true).show();
                return;
            default:
                x4.S((x4) this.f50458f, this.f50455b, this.f50456c, (Runnable) this.f50457e, (TL_stars.StarGift) this.d);
                return;
        }
    }

    public n(bb bbVar, long j3, Context context, f6 f6Var, Runnable runnable, int i10) {
        this.f50454a = i10;
        this.f50458f = bbVar;
        this.f50455b = j3;
        this.f50456c = context;
        this.d = f6Var;
        this.f50457e = runnable;
    }

    public n(x4 x4Var, long j3, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.f50454a = 3;
        this.f50458f = x4Var;
        this.f50455b = j3;
        this.f50456c = context;
        this.f50457e = runnable;
        this.d = starGift;
    }
}
