package xh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.vc;
import org.telegram.ui.ProfileActivity;
import yh.m5;
public final class f2 implements Utilities.Callback {
    public final int f45887a;
    public final n2 f45888b;
    public final TL_stars.SavedStarGift f45889c;

    public f2(n2 n2Var, TL_stars.SavedStarGift savedStarGift, int i10) {
        this.f45887a = i10;
        this.f45888b = n2Var;
        this.f45889c = savedStarGift;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f45887a;
        TL_stars.SavedStarGift savedStarGift = this.f45889c;
        n2 n2Var = this.f45888b;
        switch (i10) {
            case 0:
                n2Var.f46057a.e.b((String) obj, new f2(n2Var, savedStarGift, 1));
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                or0 or0Var = n2Var.f46057a;
                m5 m5Var = or0Var.e;
                int i11 = tL_starGiftCollection.collection_id;
                m5Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                m5Var.a(i11, arrayList);
                or0Var.f(true);
                i81 i81Var = or0Var.f46132n;
                int i12 = tL_starGiftCollection.collection_id;
                i81Var.d(i12, or0Var.e.f(i12) + 1);
                org.telegram.ui.ActionBar.o2 o2Var = or0Var.f46128a;
                if (o2Var instanceof ProfileActivity) {
                    ((ProfileActivity) o2Var).G4(true);
                }
                or0Var.n();
                vc.a0(o2Var).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, yh.a4.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                return;
        }
    }
}
