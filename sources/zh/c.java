package zh;

import android.content.Context;
import android.os.Bundle;
import android.widget.FrameLayout;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.p7;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class c extends bb {
    public static final int f52912a0 = 0;
    public final List X;
    public final GiftAuctionController.Auction Y;
    public j71 Z;

    public c(Context context, u6 u6Var, GiftAuctionController.Auction auction, List list) {
        super(context, null, false, false, 2, u6Var);
        this.Y = auction;
        this.X = list;
        this.v = 0.2f;
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        this.e.setTitle(y());
        fixNavigationBar();
        this.d.setPadding(this.backgroundPaddingLeft, AndroidUtilities.dp(9.0f), this.backgroundPaddingLeft, AndroidUtilities.dp(64.0f));
        this.d.setOnItemClickListener(new p7(3));
        this.d.setOverScrollMode(2);
        fi.d dVar = new fi.d(context, u6Var, true);
        dVar.setOnClickListener(new ig.d0(this, 27));
        dVar.i(LocaleController.getString(R.string.OK), false, true);
        FrameLayout.LayoutParams h = gb1.h(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i10 = h.leftMargin;
        int i11 = this.backgroundPaddingLeft;
        h.leftMargin = i10 + i11;
        h.rightMargin += i11;
        this.containerView.addView(dVar, h);
        this.Z.O(false);
    }

    public static void P(c cVar, TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift) {
        long peerDialogId = DialogObject.getPeerDialogId(tL_StarGiftAuctionAcquiredGift.peer);
        cVar.dismiss();
        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
        if (U != null && !UserObject.isService(peerDialogId)) {
            Bundle bundle = new Bundle();
            if (peerDialogId > 0) {
                bundle.putLong("user_id", peerDialogId);
                if (peerDialogId == UserConfig.getInstance(cVar.currentAccount).getClientUserId()) {
                    bundle.putBoolean("my_profile", true);
                }
            } else {
                bundle.putLong("chat_id", -peerDialogId);
            }
            bundle.putBoolean("open_gifts", true);
            U.presentFragment(new ProfileActivity(bundle, null));
        }
    }

    @Override
    public final lm0 v(mm0 mm0Var) {
        j71 j71Var = new j71(this.d, getContext(), this.currentAccount, 0, true, new hi.e2(this, 25), this.resourcesProvider);
        this.Z = j71Var;
        j71Var.f29507r = false;
        return j71Var;
    }

    @Override
    public final CharSequence y() {
        List list = this.X;
        if (list == null) {
            return null;
        }
        return LocaleController.formatPluralString("Gift2AuctionsAcquiredGifts", list.size(), new Object[0]);
    }
}
