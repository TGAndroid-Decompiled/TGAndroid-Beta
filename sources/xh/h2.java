package xh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.bs0;
import org.telegram.ui.Components.x81;
import org.telegram.ui.Components.xc;
import org.telegram.ui.ProfileActivity;
import yh.j5;
public final class h2 implements Utilities.Callback {
    public final int f46229a;
    public final p2 f46230b;
    public final TL_stars.SavedStarGift f46231c;

    public h2(p2 p2Var, TL_stars.SavedStarGift savedStarGift, int i10) {
        this.f46229a = i10;
        this.f46230b = p2Var;
        this.f46231c = savedStarGift;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f46229a;
        TL_stars.SavedStarGift savedStarGift = this.f46231c;
        p2 p2Var = this.f46230b;
        switch (i10) {
            case 0:
                p2Var.f46405a.e.b((String) obj, new h2(p2Var, savedStarGift, 1));
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                bs0 bs0Var = p2Var.f46405a;
                j5 j5Var = bs0Var.e;
                int i11 = tL_starGiftCollection.collection_id;
                j5Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                j5Var.a(i11, arrayList);
                bs0Var.f(true);
                x81 x81Var = bs0Var.f46473n;
                int i12 = tL_starGiftCollection.collection_id;
                x81Var.d(i12, bs0Var.e.f(i12) + 1);
                org.telegram.ui.ActionBar.o2 o2Var = bs0Var.f46469a;
                if (o2Var instanceof ProfileActivity) {
                    ((ProfileActivity) o2Var).G4(true);
                }
                bs0Var.n();
                xc.a0(o2Var).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, yh.x3.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                return;
        }
    }
}
