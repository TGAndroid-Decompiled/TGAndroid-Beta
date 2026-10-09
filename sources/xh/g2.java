package xh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.n91;
import org.telegram.ui.Components.rs0;
import org.telegram.ui.ProfileActivity;
import yh.d5;
public final class g2 implements Utilities.Callback {
    public final int f51251a;
    public final o2 f51252b;
    public final TL_stars.SavedStarGift f51253c;

    public g2(o2 o2Var, TL_stars.SavedStarGift savedStarGift, int i10) {
        this.f51251a = i10;
        this.f51252b = o2Var;
        this.f51253c = savedStarGift;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f51251a;
        TL_stars.SavedStarGift savedStarGift = this.f51253c;
        o2 o2Var = this.f51252b;
        switch (i10) {
            case 0:
                o2Var.f51435a.f51514e.b((String) obj, new g2(o2Var, savedStarGift, 1));
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                rs0 rs0Var = o2Var.f51435a;
                d5 d5Var = rs0Var.f51514e;
                int i11 = tL_starGiftCollection.collection_id;
                d5Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                d5Var.a(i11, arrayList);
                rs0Var.f(true);
                n91 n91Var = rs0Var.f51516n;
                int i12 = tL_starGiftCollection.collection_id;
                n91Var.d(i12, rs0Var.f51514e.f(i12) + 1);
                org.telegram.ui.ActionBar.n2 n2Var = rs0Var.f51511a;
                if (n2Var instanceof ProfileActivity) {
                    ((ProfileActivity) n2Var).G4(true);
                }
                rs0Var.n();
                ad.a0(n2Var).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, yh.s3.E1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                return;
        }
    }
}
