package xh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.vc;
import org.telegram.ui.ProfileActivity;
import yh.m5;
public final class f2 implements Utilities.Callback {
    public final int f45864a;
    public final n2 f45865b;
    public final TL_stars.SavedStarGift f45866c;

    public f2(n2 n2Var, TL_stars.SavedStarGift savedStarGift, int i10) {
        this.f45864a = i10;
        this.f45865b = n2Var;
        this.f45866c = savedStarGift;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f45864a;
        TL_stars.SavedStarGift savedStarGift = this.f45866c;
        n2 n2Var = this.f45865b;
        switch (i10) {
            case 0:
                n2Var.f46034a.e.b((String) obj, new f2(n2Var, savedStarGift, 1));
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                nr0 nr0Var = n2Var.f46034a;
                m5 m5Var = nr0Var.e;
                int i11 = tL_starGiftCollection.collection_id;
                m5Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                m5Var.a(i11, arrayList);
                nr0Var.f(true);
                h81 h81Var = nr0Var.f46109n;
                int i12 = tL_starGiftCollection.collection_id;
                h81Var.d(i12, nr0Var.e.f(i12) + 1);
                org.telegram.ui.ActionBar.n2 n2Var2 = nr0Var.f46105a;
                if (n2Var2 instanceof ProfileActivity) {
                    ((ProfileActivity) n2Var2).G4(true);
                }
                nr0Var.n();
                vc.a0(n2Var2).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, yh.a4.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                return;
        }
    }
}
