package yh;

import ai.l7;
import ai.v9;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.d91;
import org.telegram.ui.Components.ks0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.ProfileActivity;
public final class d2 implements Utilities.Callback {
    public final int f50219a;
    public final l2 f50220b;
    public final TL_stars.SavedStarGift f50221c;

    public d2(l2 l2Var, TL_stars.SavedStarGift savedStarGift, int i10) {
        this.f50219a = i10;
        this.f50220b = l2Var;
        this.f50221c = savedStarGift;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f50219a;
        TL_stars.SavedStarGift savedStarGift = this.f50221c;
        l2 l2Var = this.f50220b;
        switch (i10) {
            case 0:
                l2Var.f50365a.e.b((String) obj, new d2(l2Var, savedStarGift, 1));
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                ks0 ks0Var = l2Var.f50365a;
                v9 v9Var = ks0Var.e;
                int i11 = tL_starGiftCollection.collection_id;
                v9Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                v9Var.a(i11, arrayList);
                ks0Var.f(true);
                d91 d91Var = ks0Var.f50467n;
                int i12 = tL_starGiftCollection.collection_id;
                d91Var.d(i12, ks0Var.e.f(i12) + 1);
                org.telegram.ui.ActionBar.n2 n2Var = ks0Var.f50463a;
                if (n2Var instanceof ProfileActivity) {
                    ((ProfileActivity) n2Var).G4(true);
                }
                ks0Var.n();
                xc.a0(n2Var).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, l7.Y1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                return;
        }
    }
}
