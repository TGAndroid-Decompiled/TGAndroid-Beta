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
public final class u60 extends cd {
    public float A0;
    public boolean B0;
    public vc f37950z0;

    public u60(long j3) {
        super(j3);
        this.d = true;
    }

    public static void e1(u60 u60Var, int i10, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (canApplyBoost != null && u60Var.getParentActivity() != null) {
            t60 t60Var = new t60(u60Var, u60Var, u60Var.getParentActivity(), i10, u60Var.currentAccount, u60Var.resourceProvider);
            t60Var.G1(canApplyBoost);
            t60Var.F1(u60Var.f32732c, true);
            t60Var.H1(u60Var.f32728a);
            t60Var.show();
            return;
        }
        u60Var.B0 = false;
    }

    public static org.telegram.ui.ActionBar.k g1(u60 u60Var) {
        return u60Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k h1(u60 u60Var) {
        return u60Var.actionBar;
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
        return ChatObject.isForum(getMessagesController().getChat(Long.valueOf(-this.f32728a)));
    }

    @Override
    public final void T0(int i10) {
        if (this.f32732c != null && !this.B0) {
            this.B0 = true;
            MessagesController.getInstance(this.currentAccount).getBoostsController().userCanBoostChannel(this.f32728a, this.f32732c, new ci.m4(this, i10, 2));
        }
    }

    @Override
    public final void X0(boolean z10) {
        int i10;
        super.X0(z10);
        vc vcVar = this.f37950z0;
        if (vcVar != null) {
            TextView textView = vcVar.d;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.f32732c;
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
        org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(new ColorDrawable(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18863d6, this.resourceProvider)), org.telegram.ui.ActionBar.j6.V0(getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f18827b7), 0, 0);
        pqVar.f27116w = true;
        this.O.setBackground(pqVar);
        vc vcVar = this.f37950z0;
        if (vcVar != null && !z10) {
            vcVar.f38387a.b(this.currentAccount, this.f32751s, false);
            this.f37950z0.f38388b.b(this.f32751s, false);
            this.f37950z0.e();
        }
    }

    @Override
    public final void c1() {
        pc pcVar;
        pc pcVar2;
        this.Z = 0;
        boolean z10 = true;
        int i10 = 1 + 1;
        this.f32729a0 = 1;
        this.f32731b0 = i10;
        int i11 = i10 + 2;
        this.R = i11;
        this.f32733c0 = i10 + 1;
        if (this.f32756w == 0 && this.f32751s < 0) {
            int i12 = this.f32735e0;
            this.f32735e0 = -1;
            if (i12 >= 0 && (pcVar2 = this.N) != null) {
                pcVar2.u(i12);
                this.N.m(this.f32733c0);
            }
        } else {
            if (this.f32735e0 < 0) {
                z10 = false;
            }
            this.R = i10 + 3;
            this.f32735e0 = i11;
            if (!z10 && (pcVar = this.N) != null) {
                pcVar.o(i11);
                this.N.m(this.f32733c0);
                this.M.v0(0);
            }
        }
        int i13 = this.R;
        this.f32734d0 = i13;
        this.f32739h0 = i13 + 1;
        this.f32740i0 = i13 + 2;
        this.f32737f0 = i13 + 3;
        this.R = i13 + 5;
        this.f32738g0 = i13 + 4;
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-this.f32728a);
        if (chatFull != null && chatFull.can_set_stickers) {
            int i14 = this.R;
            this.f32741j0 = i14;
            this.R = i14 + 2;
            this.f32742k0 = i14 + 1;
        } else {
            this.f32741j0 = -1;
            this.f32742k0 = -1;
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
        createView.getViewTreeObserver().addOnGlobalLayoutListener(new r60(this, (FrameLayout) createView));
        return createView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        super.didReceivedNotification(i10, i11, objArr);
        if (i10 == NotificationCenter.chatInfoDidLoad && ((TLRPC.ChatFull) objArr[0]).f18122id == (-this.f32728a)) {
            b1();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        vc vcVar = this.f37950z0;
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
        s60 s60Var = new s60(this, getParentActivity(), this.resourceProvider, 0);
        this.M = s60Var;
        s60Var.setOnScrollListener(new h3(this, 12));
        this.M.setSections(true);
    }

    @Override
    public final int z0() {
        return getMessagesController().groupCustomWallpaperLevelMin;
    }
}
