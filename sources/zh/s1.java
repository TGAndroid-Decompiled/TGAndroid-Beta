package zh;

import bi.k7;
import bi.t9;
import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.ProfileActivity;
public final class s1 implements c20 {
    public final int f60533a;
    public final z1 f60534b;
    public final TL_stars.SavedStarGift f60535c;

    public s1(z1 z1Var, TL_stars.SavedStarGift savedStarGift, int i7) {
        this.f60533a = i7;
        this.f60534b = z1Var;
        this.f60535c = savedStarGift;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f60533a;
        TL_stars.SavedStarGift savedStarGift = this.f60535c;
        z1 z1Var = this.f60534b;
        switch (i7) {
            case 0:
                z1Var.f60639a.f60295e.b((String) obj, new s1(z1Var, savedStarGift, 1));
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                vp0 vp0Var = z1Var.f60639a;
                t9 t9Var = vp0Var.f60295e;
                int i10 = tL_starGiftCollection.collection_id;
                t9Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                t9Var.a(i10, arrayList);
                vp0Var.f(true);
                v61 v61Var = vp0Var.f60297n;
                int i11 = tL_starGiftCollection.collection_id;
                v61Var.d(i11, vp0Var.f60295e.f(i11) + 1);
                org.telegram.ui.ActionBar.f2 f2Var = vp0Var.f60292a;
                if (f2Var instanceof ProfileActivity) {
                    ((ProfileActivity) f2Var).X4(true);
                }
                vp0Var.o();
                hc.a0(f2Var).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.X2(id.a0(null, null, 2131750393, k7.z1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                return;
        }
    }
}
