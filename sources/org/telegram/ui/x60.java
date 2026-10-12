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
public final class x60 extends hd {
    public float A0;
    public boolean B0;
    public ad f41762z0;

    public x60(long j10) {
        super(j10);
        this.d = true;
    }

    public static void e1(x60 x60Var, int i10, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (canApplyBoost != null && x60Var.getParentActivity() != null) {
            w60 w60Var = new w60(x60Var, x60Var, x60Var.getParentActivity(), i10, x60Var.currentAccount, x60Var.resourceProvider);
            w60Var.H1(canApplyBoost);
            w60Var.G1(x60Var.f36728c, true);
            w60Var.I1(x60Var.f36724a);
            w60Var.show();
            return;
        }
        x60Var.B0 = false;
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
        return ChatObject.isForum(getMessagesController().getChat(Long.valueOf(-this.f36724a)));
    }

    @Override
    public final void T0(int i10) {
        if (this.f36728c != null && !this.B0) {
            this.B0 = true;
            MessagesController.getInstance(this.currentAccount).getBoostsController().userCanBoostChannel(this.f36724a, this.f36728c, new di.k4(this, i10, 5));
        }
    }

    @Override
    public final void X0(boolean z10) {
        int i10;
        super.X0(z10);
        ad adVar = this.f41762z0;
        if (adVar != null) {
            TextView textView = adVar.d;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.f36728c;
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
        org.telegram.ui.Components.cr crVar = new org.telegram.ui.Components.cr(new ColorDrawable(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19901d6, this.resourceProvider)), org.telegram.ui.ActionBar.g6.W0(getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f19863b7), 0, 0);
        crVar.f24198w = true;
        this.O.setBackground(crVar);
        ad adVar = this.f41762z0;
        if (adVar != null && !z10) {
            adVar.f34181a.b(this.currentAccount, this.f36747s, false);
            this.f41762z0.f34182b.b(this.f36747s, false);
            this.f41762z0.d();
        }
    }

    @Override
    public final void c1() {
        tc tcVar;
        tc tcVar2;
        this.Z = 0;
        boolean z10 = true;
        int i10 = 1 + 1;
        this.f36725a0 = 1;
        this.f36727b0 = i10;
        int i11 = i10 + 2;
        this.R = i11;
        this.f36729c0 = i10 + 1;
        if (this.f36752w == 0 && this.f36747s < 0) {
            int i12 = this.f36731e0;
            this.f36731e0 = -1;
            if (i12 >= 0 && (tcVar2 = this.N) != null) {
                tcVar2.u(i12);
                this.N.m(this.f36729c0);
            }
        } else {
            if (this.f36731e0 < 0) {
                z10 = false;
            }
            this.R = i10 + 3;
            this.f36731e0 = i11;
            if (!z10 && (tcVar = this.N) != null) {
                tcVar.o(i11);
                this.N.m(this.f36729c0);
                this.M.u0(0);
            }
        }
        int i13 = this.R;
        this.f36730d0 = i13;
        this.f36735h0 = i13 + 1;
        this.f36736i0 = i13 + 2;
        this.f36733f0 = i13 + 3;
        this.R = i13 + 5;
        this.f36734g0 = i13 + 4;
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-this.f36724a);
        if (chatFull != null && chatFull.can_set_stickers) {
            int i14 = this.R;
            this.f36737j0 = i14;
            this.R = i14 + 2;
            this.f36738k0 = i14 + 1;
        } else {
            this.f36737j0 = -1;
            this.f36738k0 = -1;
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
        createView.getViewTreeObserver().addOnGlobalLayoutListener(new u60(this, (FrameLayout) createView));
        return createView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        super.didReceivedNotification(i10, i11, objArr);
        if (i10 == NotificationCenter.chatInfoDidLoad && ((TLRPC.ChatFull) objArr[0]).f19217id == (-this.f36724a)) {
            b1();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ad adVar = this.f41762z0;
        if (adVar != null) {
            adVar.a();
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
        v60 v60Var = new v60(this, getParentActivity(), this.resourceProvider, 0);
        this.M = v60Var;
        v60Var.setOnScrollListener(new k3(this, 12));
        this.M.setSections(true);
    }

    @Override
    public final int z0() {
        return getMessagesController().groupCustomWallpaperLevelMin;
    }
}
