package xh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.mr0;
public final class w extends org.telegram.ui.ActionBar.j {
    public final TL_stars.StarGift f51569a;
    public final Context f51570b;
    public final e6 f51571c;

    public w(Context context, TL_stars.StarGift starGift, e6 e6Var) {
        this.f51569a = starGift;
        this.f51570b = context;
        this.f51571c = e6Var;
    }

    @Override
    public final void b(int i10) {
        Context context = this.f51570b;
        TL_stars.StarGift starGift = this.f51569a;
        if (i10 != 3 && i10 != 2) {
            if (i10 == 4) {
                x.V(context, starGift, this.f51571c);
                return;
            }
            return;
        }
        String str = MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/auction/" + starGift.auction_slug;
        if (i10 == 3) {
            AndroidUtilities.addToClipboard(str);
        } else {
            mr0.O0(context, null, str, false, str).show();
        }
    }
}
