package xh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.iq0;
public final class u extends org.telegram.ui.ActionBar.j {
    public final TL_stars.StarGift f46157a;
    public final Context f46158b;
    public final f6 f46159c;

    public u(Context context, TL_stars.StarGift starGift, f6 f6Var) {
        this.f46157a = starGift;
        this.f46158b = context;
        this.f46159c = f6Var;
    }

    @Override
    public final void b(int i10) {
        Context context = this.f46158b;
        TL_stars.StarGift starGift = this.f46157a;
        if (i10 != 3 && i10 != 2) {
            if (i10 == 4) {
                v.U(context, starGift, this.f46159c);
                return;
            }
            return;
        }
        String str = MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/auction/" + starGift.auction_slug;
        if (i10 == 3) {
            AndroidUtilities.addToClipboard(str);
        } else {
            iq0.N0(context, null, str, false, str).show();
        }
    }
}
