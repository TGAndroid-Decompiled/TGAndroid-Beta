package xh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.g81;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.ProfileActivity;
import yh.k5;
public final class g2 implements Utilities.Callback {
    public final int f45826a;
    public final o2 f45827b;
    public final TL_stars.SavedStarGift f45828c;

    public g2(o2 o2Var, TL_stars.SavedStarGift savedStarGift, int i10) {
        this.f45826a = i10;
        this.f45827b = o2Var;
        this.f45828c = savedStarGift;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f45826a;
        TL_stars.SavedStarGift savedStarGift = this.f45828c;
        o2 o2Var = this.f45827b;
        switch (i10) {
            case 0:
                o2Var.f45999a.e.b((String) obj, new g2(o2Var, savedStarGift, 1));
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                nr0 nr0Var = o2Var.f45999a;
                k5 k5Var = nr0Var.e;
                int i11 = tL_starGiftCollection.collection_id;
                k5Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                k5Var.a(i11, arrayList);
                nr0Var.f(true);
                g81 g81Var = nr0Var.f46072n;
                int i12 = tL_starGiftCollection.collection_id;
                g81Var.d(i12, nr0Var.e.f(i12) + 1);
                org.telegram.ui.ActionBar.n2 n2Var = nr0Var.f46068a;
                if (n2Var instanceof ProfileActivity) {
                    ((ProfileActivity) n2Var).G4(true);
                }
                nr0Var.n();
                xc.a0(n2Var).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, yh.y3.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                return;
        }
    }
}
