package xh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.t91;
import org.telegram.ui.Components.xs0;
import org.telegram.ui.Components.zc;
import org.telegram.ui.ProfileActivity;
import yh.d5;
public final class f2 implements Utilities.Callback {
    public final int f51464a;
    public final n2 f51465b;
    public final TL_stars.SavedStarGift f51466c;

    public f2(n2 n2Var, TL_stars.SavedStarGift savedStarGift, int i10) {
        this.f51464a = i10;
        this.f51465b = n2Var;
        this.f51466c = savedStarGift;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f51464a;
        TL_stars.SavedStarGift savedStarGift = this.f51466c;
        n2 n2Var = this.f51465b;
        switch (i10) {
            case 0:
                n2Var.f51622a.f51724e.b((String) obj, new f2(n2Var, savedStarGift, 1));
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                xs0 xs0Var = n2Var.f51622a;
                d5 d5Var = xs0Var.f51724e;
                int i11 = tL_starGiftCollection.collection_id;
                d5Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                d5Var.a(i11, arrayList);
                xs0Var.f(true);
                t91 t91Var = xs0Var.f51726n;
                int i12 = tL_starGiftCollection.collection_id;
                t91Var.d(i12, xs0Var.f51724e.f(i12) + 1);
                org.telegram.ui.ActionBar.m2 m2Var = xs0Var.f51721a;
                if (m2Var instanceof ProfileActivity) {
                    ((ProfileActivity) m2Var).G4(true);
                }
                xs0Var.n();
                zc.a0(m2Var).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, yh.s3.E1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                return;
        }
    }
}
