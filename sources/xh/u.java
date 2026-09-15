package xh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.hq0;
public final class u extends org.telegram.ui.ActionBar.j {
    public final TL_stars.StarGift f46134a;
    public final Context f46135b;
    public final e6 f46136c;

    public u(Context context, TL_stars.StarGift starGift, e6 e6Var) {
        this.f46134a = starGift;
        this.f46135b = context;
        this.f46136c = e6Var;
    }

    @Override
    public final void b(int i10) {
        Context context = this.f46135b;
        TL_stars.StarGift starGift = this.f46134a;
        if (i10 != 3 && i10 != 2) {
            if (i10 == 4) {
                v.U(context, starGift, this.f46136c);
                return;
            }
            return;
        }
        String str = MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/auction/" + starGift.auction_slug;
        if (i10 == 3) {
            AndroidUtilities.addToClipboard(str);
        } else {
            hq0.N0(context, null, str, false, str).show();
        }
    }
}
