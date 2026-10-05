package xh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.br0;
public final class u extends org.telegram.ui.ActionBar.j {
    public final TL_stars.StarGift f50252a;
    public final Context f50253b;
    public final d6 f50254c;

    public u(Context context, TL_stars.StarGift starGift, d6 d6Var) {
        this.f50252a = starGift;
        this.f50253b = context;
        this.f50254c = d6Var;
    }

    @Override
    public final void b(int i10) {
        Context context = this.f50253b;
        TL_stars.StarGift starGift = this.f50252a;
        if (i10 != 3 && i10 != 2) {
            if (i10 == 4) {
                v.S(context, starGift, this.f50254c);
                return;
            }
            return;
        }
        String str = MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/auction/" + starGift.auction_slug;
        if (i10 == 3) {
            AndroidUtilities.addToClipboard(str);
        } else {
            br0.K0(context, null, str, false, str).show();
        }
    }
}
