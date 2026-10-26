package zh;

import bi.h7;
import bi.q9;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.t91;
import org.telegram.ui.Components.vs0;
import org.telegram.ui.Components.wc;
import org.telegram.ui.ProfileActivity;
public final class e2 implements Utilities.Callback {
    public final int f52964a;
    public final m2 f52965b;
    public final TL_stars.SavedStarGift f52966c;

    public e2(m2 m2Var, TL_stars.SavedStarGift savedStarGift, int i10) {
        this.f52964a = i10;
        this.f52965b = m2Var;
        this.f52966c = savedStarGift;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f52964a;
        TL_stars.SavedStarGift savedStarGift = this.f52966c;
        m2 m2Var = this.f52965b;
        switch (i10) {
            case 0:
                m2Var.f53143a.e.b((String) obj, new e2(m2Var, savedStarGift, 1));
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                vs0 vs0Var = m2Var.f53143a;
                q9 q9Var = vs0Var.e;
                int i11 = tL_starGiftCollection.collection_id;
                q9Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                q9Var.a(i11, arrayList);
                vs0Var.f(true);
                t91 t91Var = vs0Var.f53234n;
                int i12 = tL_starGiftCollection.collection_id;
                t91Var.d(i12, vs0Var.e.f(i12) + 1);
                org.telegram.ui.ActionBar.r2 r2Var = vs0Var.f53230a;
                if (r2Var instanceof ProfileActivity) {
                    ((ProfileActivity) r2Var).O4(true);
                }
                vs0Var.o();
                wc.b0(r2Var).S(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, h7.X1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                return;
        }
    }
}
