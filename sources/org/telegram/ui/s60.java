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
public final class s60 extends cd {
    public float A0;
    public boolean B0;
    public vc f36561z0;

    public s60(long j3) {
        super(j3);
        this.d = true;
    }

    public static void e1(s60 s60Var, int i10, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (canApplyBoost != null && s60Var.getParentActivity() != null) {
            r60 r60Var = new r60(s60Var, s60Var, s60Var.getParentActivity(), i10, s60Var.currentAccount, s60Var.resourceProvider);
            r60Var.G1(canApplyBoost);
            r60Var.F1(s60Var.f31612c, true);
            r60Var.H1(s60Var.f31608a);
            r60Var.show();
            return;
        }
        s60Var.B0 = false;
    }

    public static org.telegram.ui.ActionBar.l g1(s60 s60Var) {
        return s60Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.l h1(s60 s60Var) {
        return s60Var.actionBar;
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
        return ChatObject.isForum(getMessagesController().getChat(Long.valueOf(-this.f31608a)));
    }

    @Override
    public final void T0(int i10) {
        if (this.f31612c != null && !this.B0) {
            this.B0 = true;
            MessagesController.getInstance(this.currentAccount).getBoostsController().userCanBoostChannel(this.f31608a, this.f31612c, new bi.g5(this, i10, 2));
        }
    }

    @Override
    public final void X0(boolean z10) {
        int i10;
        super.X0(z10);
        vc vcVar = this.f36561z0;
        if (vcVar != null) {
            TextView textView = vcVar.d;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.f31612c;
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
        org.telegram.ui.Components.vq vqVar = new org.telegram.ui.Components.vq(new ColorDrawable(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17928d6, this.resourceProvider)), org.telegram.ui.ActionBar.j6.V0(getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f17892b7), 0, 0);
        vqVar.f28580w = true;
        this.O.setBackground(vqVar);
        vc vcVar = this.f36561z0;
        if (vcVar != null && !z10) {
            vcVar.f37531a.b(this.currentAccount, this.f31631s, false);
            this.f36561z0.f37532b.b(this.f31631s, false);
            this.f36561z0.e();
        }
    }

    @Override
    public final void c1() {
        pc pcVar;
        pc pcVar2;
        this.Z = 0;
        boolean z10 = true;
        int i10 = 1 + 1;
        this.f31609a0 = 1;
        this.f31611b0 = i10;
        int i11 = i10 + 2;
        this.R = i11;
        this.f31613c0 = i10 + 1;
        if (this.f31636w == 0 && this.f31631s < 0) {
            int i12 = this.f31615e0;
            this.f31615e0 = -1;
            if (i12 >= 0 && (pcVar2 = this.N) != null) {
                pcVar2.u(i12);
                this.N.m(this.f31613c0);
            }
        } else {
            if (this.f31615e0 < 0) {
                z10 = false;
            }
            this.R = i10 + 3;
            this.f31615e0 = i11;
            if (!z10 && (pcVar = this.N) != null) {
                pcVar.o(i11);
                this.N.m(this.f31613c0);
                this.M.u0(0);
            }
        }
        int i13 = this.R;
        this.f31614d0 = i13;
        this.f31619h0 = i13 + 1;
        this.f31620i0 = i13 + 2;
        this.f31617f0 = i13 + 3;
        this.R = i13 + 5;
        this.f31618g0 = i13 + 4;
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-this.f31608a);
        if (chatFull != null && chatFull.can_set_stickers) {
            int i14 = this.R;
            this.f31621j0 = i14;
            this.R = i14 + 2;
            this.f31622k0 = i14 + 1;
        } else {
            this.f31621j0 = -1;
            this.f31622k0 = -1;
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
        createView.getViewTreeObserver().addOnGlobalLayoutListener(new q60(this, (FrameLayout) createView));
        return createView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        super.didReceivedNotification(i10, i11, objArr);
        if (i10 == NotificationCenter.chatInfoDidLoad && ((TLRPC.ChatFull) objArr[0]).f17196id == (-this.f31608a)) {
            b1();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        vc vcVar = this.f36561z0;
        if (vcVar != null) {
            vcVar.a();
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
        bi.y1 y1Var = new bi.y1(this, getParentActivity(), this.resourceProvider, 29);
        this.M = y1Var;
        y1Var.setOnScrollListener(new j3(this, 12));
        this.M.setSections(true);
    }

    @Override
    public final int z0() {
        return getMessagesController().groupCustomWallpaperLevelMin;
    }
}
