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
public final class z50 extends bd {
    public float A0;
    public boolean B0;
    public tc f43643z0;

    public z50(long j10) {
        super(j10);
        this.d = true;
    }

    public static void e1(z50 z50Var, int i10, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (canApplyBoost != null && z50Var.getParentActivity() != null) {
            y50 y50Var = new y50(z50Var, z50Var, z50Var.getParentActivity(), i10, z50Var.currentAccount, z50Var.resourceProvider);
            y50Var.H1(canApplyBoost);
            y50Var.G1(z50Var.f35577c, true);
            y50Var.I1(z50Var.f35573a);
            y50Var.show();
            return;
        }
        z50Var.B0 = false;
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
        return ChatObject.isForum(getMessagesController().getChat(Long.valueOf(-this.f35573a)));
    }

    @Override
    public final void T0(int i10) {
        if (this.f35577c != null && !this.B0) {
            this.B0 = true;
            MessagesController.getInstance(this.currentAccount).getBoostsController().userCanBoostChannel(this.f35573a, this.f35577c, new ei.e4(this, i10, 5));
        }
    }

    @Override
    public final void X0(boolean z10) {
        int i10;
        super.X0(z10);
        tc tcVar = this.f43643z0;
        if (tcVar != null) {
            TextView textView = tcVar.d;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.f35577c;
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
        org.telegram.ui.Components.zq zqVar = new org.telegram.ui.Components.zq(new ColorDrawable(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20990d6, this.resourceProvider)), org.telegram.ui.ActionBar.h6.W0(getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.f20952b7), 0, 0);
        zqVar.f33024w = true;
        this.O.setBackground(zqVar);
        tc tcVar = this.f43643z0;
        if (tcVar != null && !z10) {
            tcVar.f41636a.b(this.currentAccount, this.f35596s, false);
            this.f43643z0.f41637b.b(this.f35596s, false);
            this.f43643z0.d();
        }
    }

    @Override
    public final void c1() {
        nc ncVar;
        nc ncVar2;
        this.Z = 0;
        boolean z10 = true;
        int i10 = 1 + 1;
        this.f35574a0 = 1;
        this.f35576b0 = i10;
        int i11 = i10 + 2;
        this.R = i11;
        this.f35578c0 = i10 + 1;
        if (this.f35601w == 0 && this.f35596s < 0) {
            int i12 = this.f35580e0;
            this.f35580e0 = -1;
            if (i12 >= 0 && (ncVar2 = this.N) != null) {
                ncVar2.u(i12);
                this.N.m(this.f35578c0);
            }
        } else {
            if (this.f35580e0 < 0) {
                z10 = false;
            }
            this.R = i10 + 3;
            this.f35580e0 = i11;
            if (!z10 && (ncVar = this.N) != null) {
                ncVar.o(i11);
                this.N.m(this.f35578c0);
                this.M.u0(0);
            }
        }
        int i13 = this.R;
        this.f35579d0 = i13;
        this.f35584h0 = i13 + 1;
        this.f35585i0 = i13 + 2;
        this.f35582f0 = i13 + 3;
        this.R = i13 + 5;
        this.f35583g0 = i13 + 4;
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-this.f35573a);
        if (chatFull != null && chatFull.can_set_stickers) {
            int i14 = this.R;
            this.f35586j0 = i14;
            this.R = i14 + 2;
            this.f35587k0 = i14 + 1;
        } else {
            this.f35586j0 = -1;
            this.f35587k0 = -1;
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
        createView.getViewTreeObserver().addOnGlobalLayoutListener(new x50(this, (FrameLayout) createView));
        return createView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        super.didReceivedNotification(i10, i11, objArr);
        if (i10 == NotificationCenter.chatInfoDidLoad && ((TLRPC.ChatFull) objArr[0]).f20277id == (-this.f35573a)) {
            b1();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        tc tcVar = this.f43643z0;
        if (tcVar != null) {
            tcVar.a();
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
        g10 g10Var = new g10(this, getParentActivity(), this.resourceProvider, 1);
        this.M = g10Var;
        g10Var.setOnScrollListener(new k3(this, 12));
        this.M.setSections(true);
    }

    @Override
    public final int z0() {
        return getMessagesController().groupCustomWallpaperLevelMin;
    }
}
