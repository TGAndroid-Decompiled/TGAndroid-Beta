package xh;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.sg;
import org.telegram.ui.tn;
public final class j0 implements sg {
    public final TL_stars.TL_starGiftUnique f51543a;
    public final l0 f51544b;

    public j0(l0 l0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.f51544b = l0Var;
        this.f51543a = tL_starGiftUnique;
    }

    @Override
    public final void C1(CharSequence charSequence) {
        a(charSequence);
    }

    @Override
    public final boolean D1() {
        return false;
    }

    @Override
    public final boolean H0() {
        return true;
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers J() {
        return null;
    }

    public final void a(CharSequence charSequence) {
        int i10;
        int i11;
        boolean z10;
        l0 l0Var = this.f51544b;
        r6 r6Var = l0Var.f51566w;
        z4 z4Var = l0Var.f51559b;
        i10 = ((org.telegram.ui.ActionBar.e3) l0Var).currentAccount;
        z4Var.a(this.f51543a, UserConfig.getInstance(i10).getClientUserId(), l0Var.f51563n.getTextWithEntities(), LocaleController.getString(R.string.GiftMessageSendNow), true);
        int codePointCount = Character.codePointCount(charSequence, 0, charSequence.length());
        l0Var.F = codePointCount;
        int i12 = l0Var.E;
        if (i12 > 0 && (i11 = i12 - codePointCount) <= 15) {
            if (i11 < -9999) {
                i11 = -9999;
            }
            String formatNumber = LocaleController.formatNumber(i11, ',');
            if (r6Var.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            r6Var.c(formatNumber, z10, true);
            if (r6Var.getVisibility() != 0) {
                r6Var.setVisibility(0);
                r6Var.setAlpha(0.0f);
                r6Var.setScaleX(0.5f);
                r6Var.setScaleY(0.5f);
            }
            r6Var.animate().setListener(null).cancel();
            r6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            if (i11 < 0) {
                r6Var.setTextColor(l0Var.getThemedColor(h6.f20781p7));
                return;
            } else {
                r6Var.setTextColor(l0Var.getThemedColor(h6.f20946y6));
                return;
            }
        }
        r6Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new org.telegram.ui.Wallet.z4(this, 17));
    }

    @Override
    public final int h1() {
        return 0;
    }

    @Override
    public final TL_stories.StoryItem j1() {
        return null;
    }

    @Override
    public final boolean l1(long j3) {
        return false;
    }

    @Override
    public final boolean m() {
        return false;
    }

    @Override
    public final boolean o1() {
        return false;
    }

    @Override
    public final void r1(CharSequence charSequence, boolean z10, boolean z11) {
        a(charSequence);
    }

    @Override
    public final tn t0() {
        return null;
    }

    @Override
    public final boolean u1() {
        return false;
    }

    @Override
    public final int v() {
        return 0;
    }

    @Override
    public final TLRPC.Peer x() {
        return null;
    }

    @Override
    public final void D2() {
    }

    @Override
    public final void G() {
    }

    @Override
    public final void G1() {
    }

    @Override
    public final void H2() {
    }

    @Override
    public final void L1() {
    }

    @Override
    public final void M0() {
    }

    @Override
    public final void O0() {
    }

    @Override
    public final void X() {
    }

    @Override
    public final void Y0() {
    }

    @Override
    public final void h() {
    }

    @Override
    public final void j2() {
    }

    @Override
    public final void l() {
    }

    @Override
    public final void o2() {
    }

    @Override
    public final void p0() {
    }

    @Override
    public final void t1() {
    }

    @Override
    public final void u2() {
    }

    @Override
    public final void w1() {
    }

    @Override
    public final void x1() {
    }

    @Override
    public final void y() {
    }

    @Override
    public final void y0() {
    }

    @Override
    public final void y1() {
    }

    @Override
    public final void C(boolean z10) {
    }

    @Override
    public final void Z(boolean z10) {
    }

    @Override
    public final void g1(int i10) {
    }

    @Override
    public final void l2(int i10) {
    }

    @Override
    public final void p2(boolean z10) {
    }

    @Override
    public final void z(float f7) {
    }

    @Override
    public final void J0(int i10, int i11) {
    }

    @Override
    public final void K(float f7, int i10) {
    }

    @Override
    public final void z1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override
    public final void H(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
    }

    @Override
    public final void q2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
    }
}
