package rh;

import android.content.Context;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
public final class c2 implements org.telegram.ui.ActionBar.u1 {
    public final int f46701a;
    public final e4 f46702b;
    public final TL_stars.TL_starGiftUnique f46703c;

    public c2(e4 e4Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.f46701a = i10;
        this.f46702b = e4Var;
        this.f46703c = tL_starGiftUnique;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f46701a) {
            case 0:
                gf.e h = x1Var.h(-1, true, true);
                h.d();
                TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
                e4 e4Var = this.f46702b;
                updatestargiftprice.stargift = e4Var.B1();
                updatestargiftprice.resell_amount = TL_stars.StarsAmount.ofStars(0L);
                ConnectionsManager.getInstance(e4Var.f21583a).sendRequest(updatestargiftprice, new ag.p0(e4Var, h, this.f46703c, 19));
                return;
            default:
                Context context = this.f46702b.getContext();
                gf.f.t(context, "https://fragment.com/gift/" + this.f46703c.slug);
                return;
        }
    }
}
