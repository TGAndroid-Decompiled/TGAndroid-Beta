package zh;

import bi.h7;
import bi.q9;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.u91;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.ws0;
import org.telegram.ui.ProfileActivity;
public final class e2 implements Utilities.Callback {
    public final int f53022a;
    public final m2 f53023b;
    public final TL_stars.SavedStarGift f53024c;

    public e2(m2 m2Var, TL_stars.SavedStarGift savedStarGift, int i10) {
        this.f53022a = i10;
        this.f53023b = m2Var;
        this.f53024c = savedStarGift;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f53022a;
        TL_stars.SavedStarGift savedStarGift = this.f53024c;
        m2 m2Var = this.f53023b;
        switch (i10) {
            case 0:
                m2Var.f53201a.e.b((String) obj, new e2(m2Var, savedStarGift, 1));
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                ws0 ws0Var = m2Var.f53201a;
                q9 q9Var = ws0Var.e;
                int i11 = tL_starGiftCollection.collection_id;
                q9Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                q9Var.a(i11, arrayList);
                ws0Var.f(true);
                u91 u91Var = ws0Var.f53292n;
                int i12 = tL_starGiftCollection.collection_id;
                u91Var.d(i12, ws0Var.e.f(i12) + 1);
                org.telegram.ui.ActionBar.r2 r2Var = ws0Var.f53288a;
                if (r2Var instanceof ProfileActivity) {
                    ((ProfileActivity) r2Var).O4(true);
                }
                ws0Var.o();
                wc.b0(r2Var).S(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, h7.X1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                return;
        }
    }
}
