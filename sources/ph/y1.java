package ph;

import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.messenger.q20;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.v71;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.ProfileActivity;
import rh.u5;
public final class y1 implements q20 {
    public final int f45356a;
    public final f2 f45357b;
    public final TL_stars.SavedStarGift f45358c;

    public y1(f2 f2Var, TL_stars.SavedStarGift savedStarGift, int i10) {
        this.f45356a = i10;
        this.f45357b = f2Var;
        this.f45358c = savedStarGift;
    }

    @Override
    public final void a(Object obj) {
        int i10 = this.f45356a;
        TL_stars.SavedStarGift savedStarGift = this.f45358c;
        f2 f2Var = this.f45357b;
        switch (i10) {
            case 0:
                f2Var.f45042a.e.b((String) obj, new y1(f2Var, savedStarGift, 1));
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                vq0 vq0Var = f2Var.f45042a;
                u5 u5Var = vq0Var.e;
                int i11 = tL_starGiftCollection.collection_id;
                u5Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                u5Var.a(i11, arrayList);
                vq0Var.f(true);
                v71 v71Var = vq0Var.f45132n;
                int i12 = tL_starGiftCollection.collection_id;
                v71Var.d(i12, vq0Var.e.f(i12) + 1);
                org.telegram.ui.ActionBar.k2 k2Var = vq0Var.f45128a;
                if (k2Var instanceof ProfileActivity) {
                    ((ProfileActivity) k2Var).T4(true);
                }
                vq0Var.o();
                cc.a0(k2Var).R(savedStarGift.gift.getDocument(), org.telegram.messenger.i0.W2(cd.a0(null, null, 2131750402, rh.e4.A1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                return;
        }
    }
}
