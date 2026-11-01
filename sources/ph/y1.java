package ph;

import java.util.ArrayList;
import org.telegram.messenger.dd;
import org.telegram.messenger.r20;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.w71;
import org.telegram.ui.Components.wq0;
import org.telegram.ui.ProfileActivity;
import rh.u5;
public final class y1 implements r20 {
    public final int f45367a;
    public final f2 f45368b;
    public final TL_stars.SavedStarGift f45369c;

    public y1(f2 f2Var, TL_stars.SavedStarGift savedStarGift, int i10) {
        this.f45367a = i10;
        this.f45368b = f2Var;
        this.f45369c = savedStarGift;
    }

    @Override
    public final void a(Object obj) {
        int i10 = this.f45367a;
        TL_stars.SavedStarGift savedStarGift = this.f45369c;
        f2 f2Var = this.f45368b;
        switch (i10) {
            case 0:
                f2Var.f45053a.e.b((String) obj, new y1(f2Var, savedStarGift, 1));
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                wq0 wq0Var = f2Var.f45053a;
                u5 u5Var = wq0Var.e;
                int i11 = tL_starGiftCollection.collection_id;
                u5Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                u5Var.a(i11, arrayList);
                wq0Var.f(true);
                w71 w71Var = wq0Var.f45143n;
                int i12 = tL_starGiftCollection.collection_id;
                w71Var.d(i12, wq0Var.e.f(i12) + 1);
                org.telegram.ui.ActionBar.k2 k2Var = wq0Var.f45139a;
                if (k2Var instanceof ProfileActivity) {
                    ((ProfileActivity) k2Var).U4(true);
                }
                wq0Var.o();
                cc.a0(k2Var).R(savedStarGift.gift.getDocument(), org.telegram.messenger.i0.W2(dd.a0(null, null, 2131750402, rh.e4.A1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                return;
        }
    }
}
