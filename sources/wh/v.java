package wh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.sq0;
public final class v extends org.telegram.ui.ActionBar.k {
    public final TL_stars.StarGift f44386a;
    public final Context f44387b;
    public final f6 f44388c;

    public v(Context context, TL_stars.StarGift starGift, f6 f6Var) {
        this.f44386a = starGift;
        this.f44387b = context;
        this.f44388c = f6Var;
    }

    @Override
    public final void b(int i10) {
        Context context = this.f44387b;
        TL_stars.StarGift starGift = this.f44386a;
        if (i10 != 3 && i10 != 2) {
            if (i10 == 4) {
                w.U(context, starGift, this.f44388c);
                return;
            }
            return;
        }
        String str = MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/auction/" + starGift.auction_slug;
        if (i10 == 3) {
            AndroidUtilities.addToClipboard(str);
        } else {
            sq0.N0(context, null, str, false, str).show();
        }
    }
}
