package yh;

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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.n7;
import org.telegram.ui.Components.t61;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import w7.z5;
public final class c extends bb {
    public static final int f50176a0 = 0;
    public final List X;
    public final GiftAuctionController.Auction Y;
    public t61 Z;

    public c(Context context, d6 d6Var, GiftAuctionController.Auction auction, List list) {
        super(context, null, false, false, 2, d6Var);
        this.Y = auction;
        this.X = list;
        this.v = 0.2f;
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        this.e.setTitle(A());
        fixNavigationBar();
        this.d.setPadding(this.backgroundPaddingLeft, AndroidUtilities.dp(9.0f), this.backgroundPaddingLeft, AndroidUtilities.dp(64.0f));
        this.d.setOnItemClickListener(new n7(3));
        this.d.setOverScrollMode(2);
        ei.d dVar = new ei.d(context, d6Var, true);
        dVar.setOnClickListener(new hg.r0(this, 26));
        dVar.g(LocaleController.getString(R.string.OK), false, true);
        FrameLayout.LayoutParams d = z5.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i10 = d.leftMargin;
        int i11 = this.backgroundPaddingLeft;
        d.leftMargin = i10 + i11;
        d.rightMargin += i11;
        this.containerView.addView(dVar, d);
        this.Z.N(false);
    }

    public static void Q(c cVar, TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift) {
        long peerDialogId = DialogObject.getPeerDialogId(tL_StarGiftAuctionAcquiredGift.peer);
        cVar.dismiss();
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
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
    public final CharSequence A() {
        List list = this.X;
        if (list == null) {
            return null;
        }
        return LocaleController.formatPluralString("Gift2AuctionsAcquiredGifts", list.size(), new Object[0]);
    }

    @Override
    public final hm0 x(im0 im0Var) {
        t61 t61Var = new t61(this.d, getContext(), this.currentAccount, 0, true, new hg.o(this, 22), this.resourcesProvider);
        this.Z = t61Var;
        t61Var.f30436r = false;
        return t61Var;
    }
}
