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
public final class r60 extends cd {
    public float A0;
    public boolean B0;
    public vc f39926z0;

    public r60(long j3) {
        super(j3);
        this.d = true;
    }

    public static void e1(r60 r60Var, int i10, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (canApplyBoost != null && r60Var.getParentActivity() != null) {
            q60 q60Var = new q60(r60Var, r60Var, r60Var.getParentActivity(), i10, r60Var.currentAccount, r60Var.resourceProvider);
            q60Var.G1(canApplyBoost);
            q60Var.F1(r60Var.f35413c, true);
            q60Var.H1(r60Var.f35409a);
            q60Var.show();
            return;
        }
        r60Var.B0 = false;
    }

    public static org.telegram.ui.ActionBar.k g1(r60 r60Var) {
        return r60Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k h1(r60 r60Var) {
        return r60Var.actionBar;
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
        return ChatObject.isForum(getMessagesController().getChat(Long.valueOf(-this.f35409a)));
    }

    @Override
    public final void T0(int i10) {
        if (this.f35413c != null && !this.B0) {
            this.B0 = true;
            MessagesController.getInstance(this.currentAccount).getBoostsController().userCanBoostChannel(this.f35409a, this.f35413c, new ci.l4(this, i10, 5));
        }
    }

    @Override
    public final void X0(boolean z10) {
        int i10;
        super.X0(z10);
        vc vcVar = this.f39926z0;
        if (vcVar != null) {
            TextView textView = vcVar.d;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.f35413c;
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
        org.telegram.ui.Components.sq sqVar = new org.telegram.ui.Components.sq(new ColorDrawable(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20818d6, this.resourceProvider)), org.telegram.ui.ActionBar.i6.V0(getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.i6.f20782b7), 0, 0);
        sqVar.f30857w = true;
        this.O.setBackground(sqVar);
        vc vcVar = this.f39926z0;
        if (vcVar != null && !z10) {
            vcVar.f41693a.b(this.currentAccount, this.f35433s, false);
            this.f39926z0.f41694b.b(this.f35433s, false);
            this.f39926z0.e();
        }
    }

    @Override
    public final void c1() {
        oc ocVar;
        oc ocVar2;
        this.Z = 0;
        boolean z10 = true;
        int i10 = 1 + 1;
        this.f35410a0 = 1;
        this.f35412b0 = i10;
        int i11 = i10 + 2;
        this.R = i11;
        this.f35414c0 = i10 + 1;
        if (this.f35438w == 0 && this.f35433s < 0) {
            int i12 = this.f35417e0;
            this.f35417e0 = -1;
            if (i12 >= 0 && (ocVar2 = this.N) != null) {
                ocVar2.u(i12);
                this.N.m(this.f35414c0);
            }
        } else {
            if (this.f35417e0 < 0) {
                z10 = false;
            }
            this.R = i10 + 3;
            this.f35417e0 = i11;
            if (!z10 && (ocVar = this.N) != null) {
                ocVar.o(i11);
                this.N.m(this.f35414c0);
                this.M.v0(0);
            }
        }
        int i13 = this.R;
        this.f35415d0 = i13;
        this.f35421h0 = i13 + 1;
        this.f35422i0 = i13 + 2;
        this.f35419f0 = i13 + 3;
        this.R = i13 + 5;
        this.f35420g0 = i13 + 4;
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-this.f35409a);
        if (chatFull != null && chatFull.can_set_stickers) {
            int i14 = this.R;
            this.f35423j0 = i14;
            this.R = i14 + 2;
            this.f35424k0 = i14 + 1;
        } else {
            this.f35423j0 = -1;
            this.f35424k0 = -1;
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
        createView.getViewTreeObserver().addOnGlobalLayoutListener(new o60(this, (FrameLayout) createView));
        return createView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        super.didReceivedNotification(i10, i11, objArr);
        if (i10 == NotificationCenter.chatInfoDidLoad && ((TLRPC.ChatFull) objArr[0]).f20039id == (-this.f35409a)) {
            b1();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        vc vcVar = this.f39926z0;
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
        p60 p60Var = new p60(this, getParentActivity(), this.resourceProvider, 0);
        this.M = p60Var;
        p60Var.setOnScrollListener(new i3(this, 13));
        this.M.setSections(true);
    }

    @Override
    public final int z0() {
        return getMessagesController().groupCustomWallpaperLevelMin;
    }
}
