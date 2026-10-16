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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.p7;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import w7.z5;
public final class d extends db {
    public static final int f48807a0 = 0;
    public final List X;
    public final GiftAuctionController.Auction Y;
    public a71 Z;

    public d(Context context, c6 c6Var, GiftAuctionController.Auction auction, List list) {
        super(context, null, false, false, 2, c6Var);
        this.Y = auction;
        this.X = list;
        this.v = 0.2f;
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        this.e.setTitle(B());
        fixNavigationBar();
        this.d.setPadding(this.backgroundPaddingLeft, AndroidUtilities.dp(9.0f), this.backgroundPaddingLeft, AndroidUtilities.dp(64.0f));
        this.d.setOnItemClickListener(new p7(3));
        this.d.setOverScrollMode(2);
        di.d dVar = new di.d(context, c6Var, true);
        dVar.setOnClickListener(new ji.o4(this, 16));
        dVar.g(LocaleController.getString(R.string.OK), false, true);
        FrameLayout.LayoutParams a2 = z5.a(48.0f, 16.0f, 16.0f, 16.0f, 16.0f, -1, 80);
        int i10 = a2.leftMargin;
        int i11 = this.backgroundPaddingLeft;
        a2.leftMargin = i10 + i11;
        a2.rightMargin += i11;
        this.containerView.addView(dVar, a2);
        this.Z.N(false);
    }

    public static void Q(d dVar, TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift) {
        long peerDialogId = DialogObject.getPeerDialogId(tL_StarGiftAuctionAcquiredGift.peer);
        dVar.dismiss();
        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
        if (U != null && !UserObject.isService(peerDialogId)) {
            Bundle bundle = new Bundle();
            if (peerDialogId > 0) {
                bundle.putLong("user_id", peerDialogId);
                if (peerDialogId == UserConfig.getInstance(dVar.currentAccount).getClientUserId()) {
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
    public final CharSequence B() {
        List list = this.X;
        if (list == null) {
            return null;
        }
        return LocaleController.formatPluralString("Gift2AuctionsAcquiredGifts", list.size(), new Object[0]);
    }

    @Override
    public final lm0 x(mm0 mm0Var) {
        a71 a71Var = new a71(this.d, getContext(), this.currentAccount, 0, true, new ii.a(this, 11), this.resourcesProvider);
        this.Z = a71Var;
        a71Var.f23145r = false;
        return a71Var;
    }
}
