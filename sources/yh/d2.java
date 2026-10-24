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
import org.telegram.ui.Components.ms0;
import org.telegram.ui.Components.vc;
import org.telegram.ui.ProfileActivity;
public final class d2 implements Utilities.Callback {
    public final int f50665a;
    public final l2 f50666b;
    public final TL_stars.SavedStarGift f50667c;

    public d2(l2 l2Var, TL_stars.SavedStarGift savedStarGift, int i10) {
        this.f50665a = i10;
        this.f50666b = l2Var;
        this.f50667c = savedStarGift;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f50665a;
        TL_stars.SavedStarGift savedStarGift = this.f50667c;
        l2 l2Var = this.f50666b;
        switch (i10) {
            case 0:
                l2Var.f50824a.e.b((String) obj, new d2(l2Var, savedStarGift, 1));
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                ms0 ms0Var = l2Var.f50824a;
                v9 v9Var = ms0Var.e;
                int i11 = tL_starGiftCollection.collection_id;
                v9Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                v9Var.a(i11, arrayList);
                ms0Var.f(true);
                k91 k91Var = ms0Var.f50927n;
                int i12 = tL_starGiftCollection.collection_id;
                k91Var.d(i12, ms0Var.e.f(i12) + 1);
                org.telegram.ui.ActionBar.o2 o2Var = ms0Var.f50923a;
                if (o2Var instanceof ProfileActivity) {
                    ((ProfileActivity) o2Var).I4(true);
                }
                ms0Var.n();
                vc.a0(o2Var).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, l7.X1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                return;
        }
    }
}
