package zh;

import bi.k7;
import bi.t9;
import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.up0;
import org.telegram.ui.ProfileActivity;
public final class t1 implements c20 {
    public final int f60413a;
    public final a2 f60414b;
    public final TL_stars.SavedStarGift f60415c;

    public t1(a2 a2Var, TL_stars.SavedStarGift savedStarGift, int i7) {
        this.f60413a = i7;
        this.f60414b = a2Var;
        this.f60415c = savedStarGift;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f60413a;
        TL_stars.SavedStarGift savedStarGift = this.f60415c;
        a2 a2Var = this.f60414b;
        switch (i7) {
            case 0:
                a2Var.f60081a.f60190e.b((String) obj, new t1(a2Var, savedStarGift, 1));
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                up0 up0Var = a2Var.f60081a;
                t9 t9Var = up0Var.f60190e;
                int i10 = tL_starGiftCollection.collection_id;
                t9Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                t9Var.a(i10, arrayList);
                up0Var.f(true);
                o61 o61Var = up0Var.f60192n;
                int i11 = tL_starGiftCollection.collection_id;
                o61Var.d(i11, up0Var.f60190e.f(i11) + 1);
                org.telegram.ui.ActionBar.f2 f2Var = up0Var.f60187a;
                if (f2Var instanceof ProfileActivity) {
                    ((ProfileActivity) f2Var).U4(true);
                }
                up0Var.o();
                hc.a0(f2Var).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.X2(hd.a0(null, null, 2131750392, k7.A1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                return;
        }
    }
}
