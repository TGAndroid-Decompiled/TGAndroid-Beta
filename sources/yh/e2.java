package yh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.yc;
import org.telegram.ui.ProfileActivity;
import zh.i5;
public final class e2 implements Utilities.Callback {
    public final int f50290a;
    public final m2 f50291b;
    public final TL_stars.SavedStarGift f50292c;

    public e2(m2 m2Var, TL_stars.SavedStarGift savedStarGift, int i10) {
        this.f50290a = i10;
        this.f50291b = m2Var;
        this.f50292c = savedStarGift;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f50290a;
        TL_stars.SavedStarGift savedStarGift = this.f50292c;
        m2 m2Var = this.f50291b;
        switch (i10) {
            case 0:
                m2Var.f50469a.f50548e.b((String) obj, new e2(m2Var, savedStarGift, 1));
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                nr0 nr0Var = m2Var.f50469a;
                i5 i5Var = nr0Var.f50548e;
                int i11 = tL_starGiftCollection.collection_id;
                i5Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                i5Var.a(i11, arrayList);
                nr0Var.f(true);
                h81 h81Var = nr0Var.f50550n;
                int i12 = tL_starGiftCollection.collection_id;
                h81Var.d(i12, nr0Var.f50548e.f(i12) + 1);
                org.telegram.ui.ActionBar.n2 n2Var = nr0Var.f50545a;
                if (n2Var instanceof ProfileActivity) {
                    ((ProfileActivity) n2Var).G4(true);
                }
                nr0Var.n();
                yc.a0(n2Var).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, zh.w3.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                return;
        }
    }
}
