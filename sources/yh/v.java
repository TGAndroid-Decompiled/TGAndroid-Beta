package yh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.dr0;
public final class v extends org.telegram.ui.ActionBar.j {
    public final TL_stars.StarGift f50559a;
    public final Context f50560b;
    public final d6 f50561c;

    public v(Context context, TL_stars.StarGift starGift, d6 d6Var) {
        this.f50559a = starGift;
        this.f50560b = context;
        this.f50561c = d6Var;
    }

    @Override
    public final void b(int i10) {
        Context context = this.f50560b;
        TL_stars.StarGift starGift = this.f50559a;
        if (i10 != 3 && i10 != 2) {
            if (i10 == 4) {
                w.V(context, starGift, this.f50561c);
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
