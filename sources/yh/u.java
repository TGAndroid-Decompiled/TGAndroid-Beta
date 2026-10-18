package yh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.dr0;
public final class u extends org.telegram.ui.ActionBar.j {
    public final TL_stars.StarGift f50524a;
    public final Context f50525b;
    public final d6 f50526c;

    public u(Context context, TL_stars.StarGift starGift, d6 d6Var) {
        this.f50524a = starGift;
        this.f50525b = context;
        this.f50526c = d6Var;
    }

    @Override
    public final void b(int i10) {
        Context context = this.f50525b;
        TL_stars.StarGift starGift = this.f50524a;
        if (i10 != 3 && i10 != 2) {
            if (i10 == 4) {
                v.V(context, starGift, this.f50526c);
                return;
            }
            return;
        }
        String str = MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/auction/" + starGift.auction_slug;
        if (i10 == 3) {
            AndroidUtilities.addToClipboard(str);
        } else {
            dr0.O0(context, null, str, false, str).show();
        }
    }
}
