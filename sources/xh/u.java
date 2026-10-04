package xh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.zq0;
public final class u extends org.telegram.ui.ActionBar.j {
    public final TL_stars.StarGift f50245a;
    public final Context f50246b;
    public final d6 f50247c;

    public u(Context context, TL_stars.StarGift starGift, d6 d6Var) {
        this.f50245a = starGift;
        this.f50246b = context;
        this.f50247c = d6Var;
    }

    @Override
    public final void b(int i10) {
        Context context = this.f50246b;
        TL_stars.StarGift starGift = this.f50245a;
        if (i10 != 3 && i10 != 2) {
            if (i10 == 4) {
                v.S(context, starGift, this.f50247c);
                return;
            }
            return;
        }
        String str = MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/auction/" + starGift.auction_slug;
        if (i10 == 3) {
            AndroidUtilities.addToClipboard(str);
        } else {
            zq0.K0(context, null, str, false, str).show();
        }
    }
}
