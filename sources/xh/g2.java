package xh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.w81;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.yr0;
import org.telegram.ui.ProfileActivity;
import yh.k5;
public final class g2 implements Utilities.Callback {
    public final int f46174a;
    public final o2 f46175b;
    public final TL_stars.SavedStarGift f46176c;

    public g2(o2 o2Var, TL_stars.SavedStarGift savedStarGift, int i10) {
        this.f46174a = i10;
        this.f46175b = o2Var;
        this.f46176c = savedStarGift;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f46174a;
        TL_stars.SavedStarGift savedStarGift = this.f46176c;
        o2 o2Var = this.f46175b;
        switch (i10) {
            case 0:
                o2Var.f46347a.e.b((String) obj, new g2(o2Var, savedStarGift, 1));
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                yr0 yr0Var = o2Var.f46347a;
                k5 k5Var = yr0Var.e;
                int i11 = tL_starGiftCollection.collection_id;
                k5Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                k5Var.a(i11, arrayList);
                yr0Var.f(true);
                w81 w81Var = yr0Var.f46420n;
                int i12 = tL_starGiftCollection.collection_id;
                w81Var.d(i12, yr0Var.e.f(i12) + 1);
                org.telegram.ui.ActionBar.n2 n2Var = yr0Var.f46416a;
                if (n2Var instanceof ProfileActivity) {
                    ((ProfileActivity) n2Var).G4(true);
                }
                yr0Var.n();
                xc.a0(n2Var).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, yh.y3.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                return;
        }
    }
}
