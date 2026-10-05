package xh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.g91;
import org.telegram.ui.Components.gs0;
import org.telegram.ui.Components.yc;
import org.telegram.ui.ProfileActivity;
import yh.k5;
public final class g2 implements Utilities.Callback {
    public final int f49975a;
    public final o2 f49976b;
    public final TL_stars.SavedStarGift f49977c;

    public g2(o2 o2Var, TL_stars.SavedStarGift savedStarGift, int i10) {
        this.f49975a = i10;
        this.f49976b = o2Var;
        this.f49977c = savedStarGift;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f49975a;
        TL_stars.SavedStarGift savedStarGift = this.f49977c;
        o2 o2Var = this.f49976b;
        switch (i10) {
            case 0:
                o2Var.f50159a.f50235e.b((String) obj, new g2(o2Var, savedStarGift, 1));
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                gs0 gs0Var = o2Var.f50159a;
                k5 k5Var = gs0Var.f50235e;
                int i11 = tL_starGiftCollection.collection_id;
                k5Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                k5Var.a(i11, arrayList);
                gs0Var.f(true);
                g91 g91Var = gs0Var.f50237n;
                int i12 = tL_starGiftCollection.collection_id;
                g91Var.d(i12, gs0Var.f50235e.f(i12) + 1);
                org.telegram.ui.ActionBar.n2 n2Var = gs0Var.f50232a;
                if (n2Var instanceof ProfileActivity) {
                    ((ProfileActivity) n2Var).G4(true);
                }
                gs0Var.n();
                yc.a0(n2Var).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, yh.y3.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                return;
        }
    }
}
