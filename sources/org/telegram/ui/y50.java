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
public final class y50 extends xc {
    public pc f44727v0;
    public float f44728w0;
    public boolean f44729x0;

    public y50(long j10) {
        super(j10);
        this.d = true;
    }

    public static void e1(y50 y50Var, int i9, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (canApplyBoost != null && y50Var.getParentActivity() != null) {
            x50 x50Var = new x50(y50Var, y50Var, y50Var.getParentActivity(), i9, y50Var.currentAccount, y50Var.resourceProvider);
            x50Var.G1(canApplyBoost);
            x50Var.F1(y50Var.f44464c, true);
            x50Var.H1(y50Var.f44460a);
            x50Var.show();
            return;
        }
        y50Var.f44729x0 = false;
    }

    @Override
    public final int A0() {
        return R.string.GroupEmojiPack;
    }

    @Override
    public final int D0() {
        return R.string.GroupEmojiStatusInfo;
    }

    @Override
    public final int E0() {
        return getMessagesController().groupEmojiStatusLevelMin;
    }

    @Override
    public final int F0() {
        return R.string.GroupEmojiStatus;
    }

    @Override
    public final int G0() {
        return getMessagesController().groupEmojiStickersLevelMin;
    }

    @Override
    public final int H0() {
        return 4;
    }

    @Override
    public final int I0() {
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
        return ChatObject.isForum(getMessagesController().getChat(Long.valueOf(-this.f44460a)));
    }

    @Override
    public final void T0(int i9) {
        if (this.f44464c != null && !this.f44729x0) {
            this.f44729x0 = true;
            MessagesController.getInstance(this.currentAccount).getBoostsController().userCanBoostChannel(this.f44460a, this.f44464c, new kh.e4(this, i9, 1));
        }
    }

    @Override
    public final void X0(boolean z10) {
        int i9;
        super.X0(z10);
        pc pcVar = this.f44727v0;
        if (pcVar != null) {
            TextView textView = pcVar.d;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.f44464c;
            if (tL_premium_boostsStatus != null) {
                i9 = tL_premium_boostsStatus.boosts;
            } else {
                i9 = 0;
            }
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGroupBoostCount", i9, new Object[0])));
        }
    }

    @Override
    public final void Z0(boolean z10) {
        super.Z0(z10);
        this.actionBar.setBackgroundColor(0);
        org.telegram.ui.Components.fq fqVar = new org.telegram.ui.Components.fq(new ColorDrawable(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23001d6, this.resourceProvider)), org.telegram.ui.ActionBar.f6.V0(getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.f6.f22966b7), 0, 0);
        fqVar.f28550w = true;
        this.K.setBackground(fqVar);
        pc pcVar = this.f44727v0;
        if (pcVar != null && !z10) {
            pcVar.f41436a.b(this.currentAccount, this.f44484s, false);
            this.f44727v0.f41437b.b(this.f44484s, false);
            this.f44727v0.d();
        }
    }

    @Override
    public final void c1() {
        ic icVar;
        ic icVar2;
        this.V = 0;
        boolean z10 = true;
        int i9 = 1 + 1;
        this.W = 1;
        this.X = i9;
        int i10 = i9 + 2;
        this.N = i10;
        this.Y = i9 + 1;
        if (this.f44488w == 0 && this.f44484s < 0) {
            int i11 = this.f44461a0;
            this.f44461a0 = -1;
            if (i11 >= 0 && (icVar2 = this.J) != null) {
                icVar2.u(i11);
                this.J.m(this.Y);
            }
        } else {
            if (this.f44461a0 < 0) {
                z10 = false;
            }
            this.N = i9 + 3;
            this.f44461a0 = i10;
            if (!z10 && (icVar = this.J) != null) {
                icVar.o(i10);
                this.J.m(this.Y);
                this.I.u0(0);
            }
        }
        int i12 = this.N;
        this.Z = i12;
        this.f44466d0 = i12 + 1;
        this.f44468e0 = i12 + 2;
        this.f44463b0 = i12 + 3;
        this.N = i12 + 5;
        this.f44465c0 = i12 + 4;
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-this.f44460a);
        if (chatFull != null && chatFull.can_set_stickers) {
            int i13 = this.N;
            this.f44470f0 = i13;
            this.N = i13 + 2;
            this.f44471g0 = i13 + 1;
        } else {
            this.f44470f0 = -1;
            this.f44471g0 = -1;
        }
        int i14 = this.N;
        this.O = i14;
        this.S = i14 + 1;
        this.T = i14 + 2;
        this.N = i14 + 4;
        this.U = i14 + 3;
    }

    @Override
    public final View createView(Context context) {
        View createView = super.createView(context);
        Z0(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setTitle("");
        ((ViewGroup) createView).addView(this.actionBar);
        createView.getViewTreeObserver().addOnGlobalLayoutListener(new v50(this, (FrameLayout) createView));
        return createView;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        super.didReceivedNotification(i9, i10, objArr);
        if (i9 == NotificationCenter.chatInfoDidLoad && ((TLRPC.ChatFull) objArr[0]).f22381id == (-this.f44460a)) {
            b1();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        pc pcVar = this.f44727v0;
        if (pcVar != null) {
            pcVar.a();
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
    public final void w0() {
        w50 w50Var = new w50(this, getParentActivity(), this.resourceProvider, 0);
        this.I = w50Var;
        w50Var.setOnScrollListener(new l3(this, 12));
        this.I.setSections(true);
    }

    @Override
    public final int y0() {
        return getMessagesController().groupCustomWallpaperLevelMin;
    }

    @Override
    public final int z0() {
        return R.string.GroupEmojiPackInfo;
    }
}
