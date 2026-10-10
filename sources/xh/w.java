package xh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.nr0;
public final class w extends org.telegram.ui.ActionBar.j {
    public final TL_stars.StarGift f51615a;
    public final Context f51616b;
    public final e6 f51617c;

    public w(Context context, TL_stars.StarGift starGift, e6 e6Var) {
        this.f51615a = starGift;
        this.f51616b = context;
        this.f51617c = e6Var;
    }

    @Override
    public final void b(int i10) {
        Context context = this.f51616b;
        TL_stars.StarGift starGift = this.f51615a;
        if (i10 != 3 && i10 != 2) {
            if (i10 == 4) {
                x.V(context, starGift, this.f51617c);
                return;
            }
            return;
        }
        String str = MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/auction/" + starGift.auction_slug;
        if (i10 == 3) {
            AndroidUtilities.addToClipboard(str);
        } else {
            nr0.O0(context, null, str, false, str).show();
        }
    }
}
