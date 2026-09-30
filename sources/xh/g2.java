package xh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.cs0;
import org.telegram.ui.Components.x81;
import org.telegram.ui.Components.yc;
import org.telegram.ui.ProfileActivity;
import yh.j5;
public final class g2 implements Utilities.Callback {
    public final int f46262a;
    public final o2 f46263b;
    public final TL_stars.SavedStarGift f46264c;

    public g2(o2 o2Var, TL_stars.SavedStarGift savedStarGift, int i10) {
        this.f46262a = i10;
        this.f46263b = o2Var;
        this.f46264c = savedStarGift;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f46262a;
        TL_stars.SavedStarGift savedStarGift = this.f46264c;
        o2 o2Var = this.f46263b;
        switch (i10) {
            case 0:
                o2Var.f46435a.e.b((String) obj, new g2(o2Var, savedStarGift, 1));
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                cs0 cs0Var = o2Var.f46435a;
                j5 j5Var = cs0Var.e;
                int i11 = tL_starGiftCollection.collection_id;
                j5Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                j5Var.a(i11, arrayList);
                cs0Var.f(true);
                x81 x81Var = cs0Var.f46508n;
                int i12 = tL_starGiftCollection.collection_id;
                x81Var.d(i12, cs0Var.e.f(i12) + 1);
                org.telegram.ui.ActionBar.m2 m2Var = cs0Var.f46504a;
                if (m2Var instanceof ProfileActivity) {
                    ((ProfileActivity) m2Var).G4(true);
                }
                cs0Var.n();
                yc.a0(m2Var).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, yh.x3.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                return;
        }
    }
}
