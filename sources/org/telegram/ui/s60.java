package org.telegram.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class s60 extends fd {
    public float A0;
    public boolean B0;
    public yc f41819z0;

    public s60(long j3) {
        super(j3);
        this.d = true;
    }

    public static void e1(s60 s60Var, int i10, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (canApplyBoost != null && s60Var.getParentActivity() != null) {
            r60 r60Var = new r60(s60Var, s60Var, s60Var.getParentActivity(), i10, s60Var.currentAccount, s60Var.resourceProvider);
            r60Var.H1(canApplyBoost);
            r60Var.G1(s60Var.f37724c, true);
            r60Var.I1(s60Var.f37720a);
            r60Var.show();
            return;
        }
        s60Var.B0 = false;
    }

    @Override
    public final int A0() {
        return R.string.GroupEmojiPackInfo;
    }

    @Override
    public final int B0() {
        return R.string.GroupEmojiPack;
    }

    @Override
    public final int E0() {
        return R.string.GroupEmojiStatusInfo;
    }

    @Override
    public final int F0() {
        return getMessagesController().groupEmojiStatusLevelMin;
    }

    @Override
    public final int G0() {
        return R.string.GroupEmojiStatus;
    }

    @Override
    public final int H0() {
        return getMessagesController().groupEmojiStickersLevelMin;
    }

    @Override
    public final int I0() {
        return 4;
    }

    @Override
    public final int J0() {
        return getMessagesController().groupProfileBgIconLevelMin;
    }

    @Override
    public final int K0() {
        return R.string.GroupProfileInfo;
    }

    @Override
    public final int L0() {
        return R.string.GroupStickerPackInfo;
    }

    @Override
    public final int M0() {
        return R.string.GroupStickerPack;
    }

    @Override
    public final int N0() {
        return R.string.GroupWallpaper2Info;
    }

    @Override
    public final int O0() {
        return getMessagesController().groupWallpaperLevelMin;
    }

    @Override
    public final int P0() {
        return R.string.GroupWallpaper;
    }

    @Override
    public final boolean R0() {
        return ChatObject.isForum(getMessagesController().getChat(Long.valueOf(-this.f37720a)));
    }

    @Override
    public final void T0(int i10) {
        if (this.f37724c != null && !this.B0) {
            this.B0 = true;
            MessagesController.getInstance(this.currentAccount).getBoostsController().userCanBoostChannel(this.f37720a, this.f37724c, new ci.k4(this, i10, 5));
        }
    }

    @Override
    public final void X0(boolean z10) {
        int i10;
        super.X0(z10);
        yc ycVar = this.f41819z0;
        if (ycVar != null) {
            TextView textView = ycVar.d;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.f37724c;
            if (tL_premium_boostsStatus != null) {
                i10 = tL_premium_boostsStatus.boosts;
            } else {
                i10 = 0;
            }
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGroupBoostCount", i10, new Object[0])));
        }
    }

    @Override
    public final void Z0(boolean z10) {
        super.Z0(z10);
        this.actionBar.setBackgroundColor(0);
        org.telegram.ui.Components.hr hrVar = new org.telegram.ui.Components.hr(new ColorDrawable(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20559d6, this.resourceProvider)), org.telegram.ui.ActionBar.h6.W0(getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.f20523b7), 0, 0);
        hrVar.f26897w = true;
        this.O.setBackground(hrVar);
        yc ycVar = this.f41819z0;
        if (ycVar != null && !z10) {
            ycVar.f44444a.b(this.currentAccount, this.f37744s, false);
            this.f41819z0.f44445b.b(this.f37744s, false);
            this.f41819z0.e();
        }
    }

    @Override
    public final void c1() {
        rc rcVar;
        rc rcVar2;
        this.Z = 0;
        boolean z10 = true;
        int i10 = 1 + 1;
        this.f37721a0 = 1;
        this.f37723b0 = i10;
        int i11 = i10 + 2;
        this.R = i11;
        this.f37725c0 = i10 + 1;
        if (this.f37749w == 0 && this.f37744s < 0) {
            int i12 = this.f37728e0;
            this.f37728e0 = -1;
            if (i12 >= 0 && (rcVar2 = this.N) != null) {
                rcVar2.u(i12);
                this.N.m(this.f37725c0);
            }
        } else {
            if (this.f37728e0 < 0) {
                z10 = false;
            }
            this.R = i10 + 3;
            this.f37728e0 = i11;
            if (!z10 && (rcVar = this.N) != null) {
                rcVar.o(i11);
                this.N.m(this.f37725c0);
                this.M.u0(0);
            }
        }
        int i13 = this.R;
        this.f37726d0 = i13;
        this.f37732h0 = i13 + 1;
        this.f37733i0 = i13 + 2;
        this.f37730f0 = i13 + 3;
        this.R = i13 + 5;
        this.f37731g0 = i13 + 4;
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-this.f37720a);
        if (chatFull != null && chatFull.can_set_stickers) {
            int i14 = this.R;
            this.f37734j0 = i14;
            this.R = i14 + 2;
            this.f37735k0 = i14 + 1;
        } else {
            this.f37734j0 = -1;
            this.f37735k0 = -1;
        }
        int i15 = this.R;
        this.S = i15;
        this.W = i15 + 1;
        this.X = i15 + 2;
        this.R = i15 + 4;
        this.Y = i15 + 3;
    }

    @Override
    public final View createView(Context context) {
        View createView = super.createView(context);
        Z0(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setTitle("");
        ((ViewGroup) createView).addView(this.actionBar);
        createView.getViewTreeObserver().addOnGlobalLayoutListener(new p60(this, (FrameLayout) createView));
        return createView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        super.didReceivedNotification(i10, i11, objArr);
        if (i10 == NotificationCenter.chatInfoDidLoad && ((TLRPC.ChatFull) objArr[0]).f19803id == (-this.f37720a)) {
            b1();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        yc ycVar = this.f41819z0;
        if (ycVar != null) {
            ycVar.a();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatInfoDidLoad);
    }

    @Override
    public final void x0() {
        q60 q60Var = new q60(this, getParentActivity(), this.resourceProvider, 0);
        this.M = q60Var;
        q60Var.setOnScrollListener(new i3(this, 12));
        this.M.setSections(true);
    }

    @Override
    public final int z0() {
        return getMessagesController().groupCustomWallpaperLevelMin;
    }
}
