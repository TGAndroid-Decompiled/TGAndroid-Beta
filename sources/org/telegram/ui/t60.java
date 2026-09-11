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
public final class t60 extends bd {
    public float A0;
    public boolean B0;
    public uc f40634z0;

    public t60(long j3) {
        super(j3);
        this.d = true;
    }

    public static void e1(t60 t60Var, int i10, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (canApplyBoost != null && t60Var.getParentActivity() != null) {
            s60 s60Var = new s60(t60Var, t60Var, t60Var.getParentActivity(), i10, t60Var.currentAccount, t60Var.resourceProvider);
            s60Var.G1(canApplyBoost);
            s60Var.F1(t60Var.f34738c, true);
            s60Var.H1(t60Var.f34734a);
            s60Var.show();
            return;
        }
        t60Var.B0 = false;
    }

    public static org.telegram.ui.ActionBar.k g1(t60 t60Var) {
        return t60Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k h1(t60 t60Var) {
        return t60Var.actionBar;
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
        return ChatObject.isForum(getMessagesController().getChat(Long.valueOf(-this.f34734a)));
    }

    @Override
    public final void T0(int i10) {
        if (this.f34738c != null && !this.B0) {
            this.B0 = true;
            MessagesController.getInstance(this.currentAccount).getBoostsController().userCanBoostChannel(this.f34734a, this.f34738c, new di.m4(this, i10, 2));
        }
    }

    @Override
    public final void X0(boolean z10) {
        int i10;
        super.X0(z10);
        uc ucVar = this.f40634z0;
        if (ucVar != null) {
            TextView textView = ucVar.d;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.f34738c;
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
        org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(new ColorDrawable(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20663d6, this.resourceProvider)), org.telegram.ui.ActionBar.j6.V0(getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f20627b7), 0, 0);
        oqVar.f29167w = true;
        this.O.setBackground(oqVar);
        uc ucVar = this.f40634z0;
        if (ucVar != null && !z10) {
            ucVar.f41058a.b(this.currentAccount, this.f34758s, false);
            this.f40634z0.f41059b.b(this.f34758s, false);
            this.f40634z0.d();
        }
    }

    @Override
    public final void c1() {
        oc ocVar;
        oc ocVar2;
        this.Z = 0;
        boolean z10 = true;
        int i10 = 1 + 1;
        this.f34735a0 = 1;
        this.f34737b0 = i10;
        int i11 = i10 + 2;
        this.R = i11;
        this.f34739c0 = i10 + 1;
        if (this.f34763w == 0 && this.f34758s < 0) {
            int i12 = this.f34742e0;
            this.f34742e0 = -1;
            if (i12 >= 0 && (ocVar2 = this.N) != null) {
                ocVar2.u(i12);
                this.N.m(this.f34739c0);
            }
        } else {
            if (this.f34742e0 < 0) {
                z10 = false;
            }
            this.R = i10 + 3;
            this.f34742e0 = i11;
            if (!z10 && (ocVar = this.N) != null) {
                ocVar.o(i11);
                this.N.m(this.f34739c0);
                this.M.u0(0);
            }
        }
        int i13 = this.R;
        this.f34740d0 = i13;
        this.f34746h0 = i13 + 1;
        this.f34747i0 = i13 + 2;
        this.f34744f0 = i13 + 3;
        this.R = i13 + 5;
        this.f34745g0 = i13 + 4;
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-this.f34734a);
        if (chatFull != null && chatFull.can_set_stickers) {
            int i14 = this.R;
            this.f34748j0 = i14;
            this.R = i14 + 2;
            this.f34749k0 = i14 + 1;
        } else {
            this.f34748j0 = -1;
            this.f34749k0 = -1;
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
        if (i10 == NotificationCenter.chatInfoDidLoad && ((TLRPC.ChatFull) objArr[0]).f19870id == (-this.f34734a)) {
            b1();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        uc ucVar = this.f40634z0;
        if (ucVar != null) {
            ucVar.a();
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
        r60 r60Var = new r60(this, getParentActivity(), this.resourceProvider, 0);
        this.M = r60Var;
        r60Var.setOnScrollListener(new i3(this, 12));
        this.M.setSections(true);
    }

    @Override
    public final int z0() {
        return getMessagesController().groupCustomWallpaperLevelMin;
    }
}
