package yh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.k91;
import org.telegram.ui.Components.ns0;
import org.telegram.ui.Components.zc;
import org.telegram.ui.ProfileActivity;
import zh.e5;
public final class e2 implements Utilities.Callback {
    public final int f48845a;
    public final m2 f48846b;
    public final TL_stars.SavedStarGift f48847c;

    public e2(m2 m2Var, TL_stars.SavedStarGift savedStarGift, int i10) {
        this.f48845a = i10;
        this.f48846b = m2Var;
        this.f48847c = savedStarGift;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f48845a;
        TL_stars.SavedStarGift savedStarGift = this.f48847c;
        m2 m2Var = this.f48846b;
        switch (i10) {
            case 0:
                m2Var.f48993a.e.b((String) obj, new e2(m2Var, savedStarGift, 1));
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                ns0 ns0Var = m2Var.f48993a;
                e5 e5Var = ns0Var.e;
                int i11 = tL_starGiftCollection.collection_id;
                e5Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                e5Var.a(i11, arrayList);
                ns0Var.f(true);
                k91 k91Var = ns0Var.f49092n;
                int i12 = tL_starGiftCollection.collection_id;
                k91Var.d(i12, ns0Var.e.f(i12) + 1);
                org.telegram.ui.ActionBar.m2 m2Var2 = ns0Var.f49088a;
                if (m2Var2 instanceof ProfileActivity) {
                    ((ProfileActivity) m2Var2).G4(true);
                }
                ns0Var.n();
                zc.a0(m2Var2).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, zh.r3.E1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                return;
        }
    }
}
