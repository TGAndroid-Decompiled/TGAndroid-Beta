package yh;

import ai.k7;
import ai.v9;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b91;
import org.telegram.ui.Components.is0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.ProfileActivity;
public final class e2 implements Utilities.Callback {
    public final int f50249a;
    public final m2 f50250b;
    public final TL_stars.SavedStarGift f50251c;

    public e2(m2 m2Var, TL_stars.SavedStarGift savedStarGift, int i10) {
        this.f50249a = i10;
        this.f50250b = m2Var;
        this.f50251c = savedStarGift;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f50249a;
        TL_stars.SavedStarGift savedStarGift = this.f50251c;
        m2 m2Var = this.f50250b;
        switch (i10) {
            case 0:
                m2Var.f50394a.e.b((String) obj, new e2(m2Var, savedStarGift, 1));
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                is0 is0Var = m2Var.f50394a;
                v9 v9Var = is0Var.e;
                int i11 = tL_starGiftCollection.collection_id;
                v9Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                v9Var.a(i11, arrayList);
                is0Var.f(true);
                b91 b91Var = is0Var.f50496n;
                int i12 = tL_starGiftCollection.collection_id;
                b91Var.d(i12, is0Var.e.f(i12) + 1);
                org.telegram.ui.ActionBar.n2 n2Var = is0Var.f50492a;
                if (n2Var instanceof ProfileActivity) {
                    ((ProfileActivity) n2Var).G4(true);
                }
                is0Var.n();
                xc.a0(n2Var).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, k7.Q1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                return;
        }
    }
}
