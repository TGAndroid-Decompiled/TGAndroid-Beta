package xh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.o91;
import org.telegram.ui.Components.ss0;
import org.telegram.ui.ProfileActivity;
import yh.d5;
public final class g2 implements Utilities.Callback {
    public final int f51295a;
    public final o2 f51296b;
    public final TL_stars.SavedStarGift f51297c;

    public g2(o2 o2Var, TL_stars.SavedStarGift savedStarGift, int i10) {
        this.f51295a = i10;
        this.f51296b = o2Var;
        this.f51297c = savedStarGift;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f51295a;
        TL_stars.SavedStarGift savedStarGift = this.f51297c;
        o2 o2Var = this.f51296b;
        switch (i10) {
            case 0:
                o2Var.f51479a.f51558e.b((String) obj, new g2(o2Var, savedStarGift, 1));
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                ss0 ss0Var = o2Var.f51479a;
                d5 d5Var = ss0Var.f51558e;
                int i11 = tL_starGiftCollection.collection_id;
                d5Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                d5Var.a(i11, arrayList);
                ss0Var.f(true);
                o91 o91Var = ss0Var.f51560n;
                int i12 = tL_starGiftCollection.collection_id;
                o91Var.d(i12, ss0Var.f51558e.f(i12) + 1);
                org.telegram.ui.ActionBar.n2 n2Var = ss0Var.f51555a;
                if (n2Var instanceof ProfileActivity) {
                    ((ProfileActivity) n2Var).G4(true);
                }
                ss0Var.n();
                ad.a0(n2Var).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, yh.s3.E1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                return;
        }
    }
}
