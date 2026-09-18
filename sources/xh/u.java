package xh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.iq0;
public final class u extends org.telegram.ui.ActionBar.j {
    public final TL_stars.StarGift f46162a;
    public final Context f46163b;
    public final f6 f46164c;

    public u(Context context, TL_stars.StarGift starGift, f6 f6Var) {
        this.f46162a = starGift;
        this.f46163b = context;
        this.f46164c = f6Var;
    }

    @Override
    public final void b(int i10) {
        Context context = this.f46163b;
        TL_stars.StarGift starGift = this.f46162a;
        if (i10 != 3 && i10 != 2) {
            if (i10 == 4) {
                v.U(context, starGift, this.f46164c);
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
