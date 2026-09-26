package xh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.v81;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.zr0;
import org.telegram.ui.ProfileActivity;
import yh.j5;
public final class g2 implements Utilities.Callback {
    public final int f46154a;
    public final o2 f46155b;
    public final TL_stars.SavedStarGift f46156c;

    public g2(o2 o2Var, TL_stars.SavedStarGift savedStarGift, int i10) {
        this.f46154a = i10;
        this.f46155b = o2Var;
        this.f46156c = savedStarGift;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f46154a;
        TL_stars.SavedStarGift savedStarGift = this.f46156c;
        o2 o2Var = this.f46155b;
        switch (i10) {
            case 0:
                o2Var.f46327a.e.b((String) obj, new g2(o2Var, savedStarGift, 1));
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                zr0 zr0Var = o2Var.f46327a;
                j5 j5Var = zr0Var.e;
                int i11 = tL_starGiftCollection.collection_id;
                j5Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                j5Var.a(i11, arrayList);
                zr0Var.f(true);
                v81 v81Var = zr0Var.f46400n;
                int i12 = tL_starGiftCollection.collection_id;
                v81Var.d(i12, zr0Var.e.f(i12) + 1);
                org.telegram.ui.ActionBar.m2 m2Var = zr0Var.f46396a;
                if (m2Var instanceof ProfileActivity) {
                    ((ProfileActivity) m2Var).G4(true);
                }
                zr0Var.n();
                xc.a0(m2Var).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, yh.x3.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                return;
        }
    }
}
