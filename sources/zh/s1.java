package zh;

import bi.k7;
import bi.t9;
import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.up0;
import org.telegram.ui.ProfileActivity;
public final class s1 implements c20 {
    public final int f60517a;
    public final z1 f60518b;
    public final TL_stars.SavedStarGift f60519c;

    public s1(z1 z1Var, TL_stars.SavedStarGift savedStarGift, int i7) {
        this.f60517a = i7;
        this.f60518b = z1Var;
        this.f60519c = savedStarGift;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f60517a;
        TL_stars.SavedStarGift savedStarGift = this.f60519c;
        z1 z1Var = this.f60518b;
        switch (i7) {
            case 0:
                z1Var.f60621a.f60285e.b((String) obj, new s1(z1Var, savedStarGift, 1));
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                up0 up0Var = z1Var.f60621a;
                t9 t9Var = up0Var.f60285e;
                int i10 = tL_starGiftCollection.collection_id;
                t9Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                t9Var.a(i10, arrayList);
                up0Var.f(true);
                u61 u61Var = up0Var.f60287n;
                int i11 = tL_starGiftCollection.collection_id;
                u61Var.d(i11, up0Var.f60285e.f(i11) + 1);
                org.telegram.ui.ActionBar.f2 f2Var = up0Var.f60282a;
                if (f2Var instanceof ProfileActivity) {
                    ((ProfileActivity) f2Var).U4(true);
                }
                up0Var.o();
                hc.a0(f2Var).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.X2(id.a0(null, null, 2131750394, k7.A1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                return;
        }
    }
}
