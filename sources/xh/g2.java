package xh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.f91;
import org.telegram.ui.Components.fs0;
import org.telegram.ui.Components.yc;
import org.telegram.ui.ProfileActivity;
import yh.j5;
public final class g2 implements Utilities.Callback {
    public final int f49968a;
    public final o2 f49969b;
    public final TL_stars.SavedStarGift f49970c;

    public g2(o2 o2Var, TL_stars.SavedStarGift savedStarGift, int i10) {
        this.f49968a = i10;
        this.f49969b = o2Var;
        this.f49970c = savedStarGift;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f49968a;
        TL_stars.SavedStarGift savedStarGift = this.f49970c;
        o2 o2Var = this.f49969b;
        switch (i10) {
            case 0:
                o2Var.f50152a.f50228e.b((String) obj, new g2(o2Var, savedStarGift, 1));
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                fs0 fs0Var = o2Var.f50152a;
                j5 j5Var = fs0Var.f50228e;
                int i11 = tL_starGiftCollection.collection_id;
                j5Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                j5Var.a(i11, arrayList);
                fs0Var.f(true);
                f91 f91Var = fs0Var.f50230n;
                int i12 = tL_starGiftCollection.collection_id;
                f91Var.d(i12, fs0Var.f50228e.f(i12) + 1);
                org.telegram.ui.ActionBar.n2 n2Var = fs0Var.f50225a;
                if (n2Var instanceof ProfileActivity) {
                    ((ProfileActivity) n2Var).G4(true);
                }
                fs0Var.n();
                yc.a0(n2Var).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, yh.x3.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                return;
        }
    }
}
