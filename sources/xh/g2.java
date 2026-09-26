package xh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.as0;
import org.telegram.ui.Components.w81;
import org.telegram.ui.Components.xc;
import org.telegram.ui.ProfileActivity;
import yh.j5;
public final class g2 implements Utilities.Callback {
    public final int f46153a;
    public final o2 f46154b;
    public final TL_stars.SavedStarGift f46155c;

    public g2(o2 o2Var, TL_stars.SavedStarGift savedStarGift, int i10) {
        this.f46153a = i10;
        this.f46154b = o2Var;
        this.f46155c = savedStarGift;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f46153a;
        TL_stars.SavedStarGift savedStarGift = this.f46155c;
        o2 o2Var = this.f46154b;
        switch (i10) {
            case 0:
                o2Var.f46326a.e.b((String) obj, new g2(o2Var, savedStarGift, 1));
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                as0 as0Var = o2Var.f46326a;
                j5 j5Var = as0Var.e;
                int i11 = tL_starGiftCollection.collection_id;
                j5Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                j5Var.a(i11, arrayList);
                as0Var.f(true);
                w81 w81Var = as0Var.f46399n;
                int i12 = tL_starGiftCollection.collection_id;
                w81Var.d(i12, as0Var.e.f(i12) + 1);
                org.telegram.ui.ActionBar.m2 m2Var = as0Var.f46395a;
                if (m2Var instanceof ProfileActivity) {
                    ((ProfileActivity) m2Var).G4(true);
                }
                as0Var.n();
                xc.a0(m2Var).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, yh.x3.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                return;
        }
    }
}
