package wh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.u81;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.wr0;
import org.telegram.ui.ProfileActivity;
import xh.l5;
public final class e2 implements Utilities.Callback {
    public final int f44080a;
    public final m2 f44081b;
    public final TL_stars.SavedStarGift f44082c;

    public e2(m2 m2Var, TL_stars.SavedStarGift savedStarGift, int i10) {
        this.f44080a = i10;
        this.f44081b = m2Var;
        this.f44082c = savedStarGift;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f44080a;
        TL_stars.SavedStarGift savedStarGift = this.f44082c;
        m2 m2Var = this.f44081b;
        switch (i10) {
            case 0:
                m2Var.f44246a.e.b((String) obj, new e2(m2Var, savedStarGift, 1));
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                wr0 wr0Var = m2Var.f44246a;
                l5 l5Var = wr0Var.e;
                int i11 = tL_starGiftCollection.collection_id;
                l5Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                l5Var.a(i11, arrayList);
                wr0Var.f(true);
                u81 u81Var = wr0Var.f44321n;
                int i12 = tL_starGiftCollection.collection_id;
                u81Var.d(i12, wr0Var.e.f(i12) + 1);
                org.telegram.ui.ActionBar.p2 p2Var = wr0Var.f44317a;
                if (p2Var instanceof ProfileActivity) {
                    ((ProfileActivity) p2Var).G4(true);
                }
                wr0Var.n();
                wc.a0(p2Var).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, xh.x3.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                return;
        }
    }
}
