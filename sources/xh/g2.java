package xh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.p91;
import org.telegram.ui.Components.ts0;
import org.telegram.ui.ProfileActivity;
import yh.d5;
public final class g2 implements Utilities.Callback {
    public final int f51338a;
    public final o2 f51339b;
    public final TL_stars.SavedStarGift f51340c;

    public g2(o2 o2Var, TL_stars.SavedStarGift savedStarGift, int i10) {
        this.f51338a = i10;
        this.f51339b = o2Var;
        this.f51340c = savedStarGift;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f51338a;
        TL_stars.SavedStarGift savedStarGift = this.f51340c;
        o2 o2Var = this.f51339b;
        switch (i10) {
            case 0:
                o2Var.f51522a.f51601e.b((String) obj, new g2(o2Var, savedStarGift, 1));
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                ts0 ts0Var = o2Var.f51522a;
                d5 d5Var = ts0Var.f51601e;
                int i11 = tL_starGiftCollection.collection_id;
                d5Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                d5Var.a(i11, arrayList);
                ts0Var.f(true);
                p91 p91Var = ts0Var.f51603n;
                int i12 = tL_starGiftCollection.collection_id;
                p91Var.d(i12, ts0Var.f51601e.f(i12) + 1);
                org.telegram.ui.ActionBar.m2 m2Var = ts0Var.f51598a;
                if (m2Var instanceof ProfileActivity) {
                    ((ProfileActivity) m2Var).G4(true);
                }
                ts0Var.n();
                ad.a0(m2Var).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, yh.s3.E1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                return;
        }
    }
}
