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
import yh.e5;
public final class f2 implements Utilities.Callback {
    public final int f51472a;
    public final n2 f51473b;
    public final TL_stars.SavedStarGift f51474c;

    public f2(n2 n2Var, TL_stars.SavedStarGift savedStarGift, int i10) {
        this.f51472a = i10;
        this.f51473b = n2Var;
        this.f51474c = savedStarGift;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f51472a;
        TL_stars.SavedStarGift savedStarGift = this.f51474c;
        n2 n2Var = this.f51473b;
        switch (i10) {
            case 0:
                n2Var.f51630a.f51732e.b((String) obj, new f2(n2Var, savedStarGift, 1));
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                xs0 xs0Var = n2Var.f51630a;
                e5 e5Var = xs0Var.f51732e;
                int i11 = tL_starGiftCollection.collection_id;
                e5Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                e5Var.a(i11, arrayList);
                xs0Var.f(true);
                t91 t91Var = xs0Var.f51734n;
                int i12 = tL_starGiftCollection.collection_id;
                t91Var.d(i12, xs0Var.f51732e.f(i12) + 1);
                org.telegram.ui.ActionBar.m2 m2Var = xs0Var.f51729a;
                if (m2Var instanceof ProfileActivity) {
                    ((ProfileActivity) m2Var).G4(true);
                }
                xs0Var.n();
                zc.a0(m2Var).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, yh.s3.E1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                return;
        }
    }
}
