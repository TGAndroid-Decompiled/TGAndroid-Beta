package yh;

import ai.l7;
import ai.v9;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.c91;
import org.telegram.ui.Components.js0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.ProfileActivity;
public final class d2 implements Utilities.Callback {
    public final int f50214a;
    public final l2 f50215b;
    public final TL_stars.SavedStarGift f50216c;

    public d2(l2 l2Var, TL_stars.SavedStarGift savedStarGift, int i10) {
        this.f50214a = i10;
        this.f50215b = l2Var;
        this.f50216c = savedStarGift;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f50214a;
        TL_stars.SavedStarGift savedStarGift = this.f50216c;
        l2 l2Var = this.f50215b;
        switch (i10) {
            case 0:
                l2Var.f50360a.e.b((String) obj, new d2(l2Var, savedStarGift, 1));
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                js0 js0Var = l2Var.f50360a;
                v9 v9Var = js0Var.e;
                int i11 = tL_starGiftCollection.collection_id;
                v9Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                v9Var.a(i11, arrayList);
                js0Var.f(true);
                c91 c91Var = js0Var.f50462n;
                int i12 = tL_starGiftCollection.collection_id;
                c91Var.d(i12, js0Var.e.f(i12) + 1);
                org.telegram.ui.ActionBar.n2 n2Var = js0Var.f50458a;
                if (n2Var instanceof ProfileActivity) {
                    ((ProfileActivity) n2Var).G4(true);
                }
                js0Var.n();
                xc.a0(n2Var).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, l7.Y1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                return;
        }
    }
}
