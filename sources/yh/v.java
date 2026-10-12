package yh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.jr0;
public final class v extends org.telegram.ui.ActionBar.j {
    public final TL_stars.StarGift f49156a;
    public final Context f49157b;
    public final c6 f49158c;

    public v(Context context, TL_stars.StarGift starGift, c6 c6Var) {
        this.f49156a = starGift;
        this.f49157b = context;
        this.f49158c = c6Var;
    }

    @Override
    public final void b(int i10) {
        Context context = this.f49157b;
        TL_stars.StarGift starGift = this.f49156a;
        if (i10 != 3 && i10 != 2) {
            if (i10 == 4) {
                w.V(context, starGift, this.f49158c);
                return;
            }
            return;
        }
        String str = MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/auction/" + starGift.auction_slug;
        if (i10 == 3) {
            AndroidUtilities.addToClipboard(str);
        } else {
            jr0.O0(context, null, str, false, str).show();
        }
    }
}
