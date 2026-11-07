package zh;

import bi.k7;
import bi.t9;
import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.up0;
import org.telegram.ui.ProfileActivity;
public final class t1 implements c20 {
    public final int f60443a;
    public final a2 f60444b;
    public final TL_stars.SavedStarGift f60445c;

    public t1(a2 a2Var, TL_stars.SavedStarGift savedStarGift, int i7) {
        this.f60443a = i7;
        this.f60444b = a2Var;
        this.f60445c = savedStarGift;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f60443a;
        TL_stars.SavedStarGift savedStarGift = this.f60445c;
        a2 a2Var = this.f60444b;
        switch (i7) {
            case 0:
                a2Var.f60111a.f60220e.b((String) obj, new t1(a2Var, savedStarGift, 1));
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                up0 up0Var = a2Var.f60111a;
                t9 t9Var = up0Var.f60220e;
                int i10 = tL_starGiftCollection.collection_id;
                t9Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                t9Var.a(i10, arrayList);
                up0Var.f(true);
                u61 u61Var = up0Var.f60222n;
                int i11 = tL_starGiftCollection.collection_id;
                u61Var.d(i11, up0Var.f60220e.f(i11) + 1);
                org.telegram.ui.ActionBar.f2 f2Var = up0Var.f60217a;
                if (f2Var instanceof ProfileActivity) {
                    ((ProfileActivity) f2Var).U4(true);
                }
                up0Var.o();
                hc.a0(f2Var).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.X2(hd.a0(null, null, 2131750392, k7.A1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                return;
        }
    }
}
