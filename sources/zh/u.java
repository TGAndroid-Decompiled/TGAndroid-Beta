package zh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.mr0;
public final class u extends org.telegram.ui.ActionBar.j {
    public final TL_stars.StarGift f53258a;
    public final Context f53259b;
    public final u6 f53260c;

    public u(Context context, TL_stars.StarGift starGift, u6 u6Var) {
        this.f53258a = starGift;
        this.f53259b = context;
        this.f53260c = u6Var;
    }

    @Override
    public final void b(int i10) {
        Context context = this.f53259b;
        TL_stars.StarGift starGift = this.f53258a;
        if (i10 != 3 && i10 != 2) {
            if (i10 == 4) {
                v.U(context, starGift, this.f53260c);
                return;
            }
            return;
        }
        String str = MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/auction/" + starGift.auction_slug;
        if (i10 == 3) {
            AndroidUtilities.addToClipboard(str);
        } else {
            mr0.P0(context, null, str, false, str).show();
        }
    }
}
