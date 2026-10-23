package yh;

import ai.l7;
import ai.v9;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.k91;
import org.telegram.ui.Components.ns0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.ProfileActivity;
public final class d2 implements Utilities.Callback {
    public final int f50666a;
    public final l2 f50667b;
    public final TL_stars.SavedStarGift f50668c;

    public d2(l2 l2Var, TL_stars.SavedStarGift savedStarGift, int i10) {
        this.f50666a = i10;
        this.f50667b = l2Var;
        this.f50668c = savedStarGift;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f50666a;
        TL_stars.SavedStarGift savedStarGift = this.f50668c;
        l2 l2Var = this.f50667b;
        switch (i10) {
            case 0:
                l2Var.f50825a.e.b((String) obj, new d2(l2Var, savedStarGift, 1));
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                ns0 ns0Var = l2Var.f50825a;
                v9 v9Var = ns0Var.e;
                int i11 = tL_starGiftCollection.collection_id;
                v9Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                v9Var.a(i11, arrayList);
                ns0Var.f(true);
                k91 k91Var = ns0Var.f50928n;
                int i12 = tL_starGiftCollection.collection_id;
                k91Var.d(i12, ns0Var.e.f(i12) + 1);
                org.telegram.ui.ActionBar.o2 o2Var = ns0Var.f50924a;
                if (o2Var instanceof ProfileActivity) {
                    ((ProfileActivity) o2Var).I4(true);
                }
                ns0Var.n();
                xc.a0(o2Var).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, l7.X1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                return;
        }
    }
}
