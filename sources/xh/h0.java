package xh;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.p6;
import org.telegram.ui.mn;
public final class h0 implements og {
    public final TL_stars.TL_starGiftUnique f46146a;
    public final j0 f46147b;

    public h0(j0 j0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.f46147b = j0Var;
        this.f46146a = tL_starGiftUnique;
    }

    @Override
    public final boolean C0() {
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
        j0 j0Var = this.f46147b;
        p6 p6Var = j0Var.f46185w;
        a5 a5Var = j0Var.f46179b;
        i10 = ((org.telegram.ui.ActionBar.e3) j0Var).currentAccount;
        a5Var.a(this.f46146a, UserConfig.getInstance(i10).getClientUserId(), j0Var.f46182n.getTextWithEntities(), LocaleController.getString(R.string.GiftMessageSendNow), true);
        int codePointCount = Character.codePointCount(charSequence, 0, charSequence.length());
        j0Var.F = codePointCount;
        int i12 = j0Var.E;
        if (i12 > 0 && (i11 = i12 - codePointCount) <= 15) {
            if (i11 < -9999) {
                i11 = -9999;
            }
            String formatNumber = LocaleController.formatNumber(i11, ',');
            if (p6Var.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            p6Var.c(formatNumber, z10, true);
            if (p6Var.getVisibility() != 0) {
                p6Var.setVisibility(0);
                p6Var.setAlpha(0.0f);
                p6Var.setScaleX(0.5f);
                p6Var.setScaleY(0.5f);
            }
            p6Var.animate().setListener(null).cancel();
            p6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            if (i11 < 0) {
                p6Var.setTextColor(j0Var.getThemedColor(h6.f19265p7));
                return;
            } else {
                p6Var.setTextColor(j0Var.getThemedColor(h6.f19428y6));
                return;
            }
        }
        p6Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new pg.d0(this, 9));
    }

    @Override
    public final int b1() {
        return 0;
    }

    @Override
    public final TL_stories.StoryItem d1() {
        return null;
    }

    @Override
    public final boolean f1(long j3) {
        return false;
    }

    @Override
    public final boolean i1() {
        return false;
    }

    @Override
    public final void l1(CharSequence charSequence, boolean z10, boolean z11) {
        a(charSequence);
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
    public final mn p0() {
        return null;
    }

    @Override
    public final int q() {
        return 0;
    }

    @Override
    public final TLRPC.Peer v() {
        return null;
    }

    @Override
    public final void v1(CharSequence charSequence) {
        a(charSequence);
    }

    @Override
    public final boolean w1() {
        return false;
    }

    @Override
    public final void A2() {
    }

    @Override
    public final void D() {
    }

    @Override
    public final void E1() {
    }

    @Override
    public final void G0() {
    }

    @Override
    public final void J0() {
    }

    @Override
    public final void T0() {
    }

    @Override
    public final void W() {
    }

    @Override
    public final void d2() {
    }

    @Override
    public final void g() {
    }

    @Override
    public final void i2() {
    }

    @Override
    public final void l() {
    }

    @Override
    public final void m0() {
    }

    @Override
    public final void n1() {
    }

    @Override
    public final void o2() {
    }

    @Override
    public final void q1() {
    }

    @Override
    public final void r1() {
    }

    @Override
    public final void s0() {
    }

    @Override
    public final void s1() {
    }

    @Override
    public final void w2() {
    }

    @Override
    public final void x() {
    }

    @Override
    public final void z1() {
    }

    @Override
    public final void B(boolean z10) {
    }

    @Override
    public final void X(boolean z10) {
    }

    @Override
    public final void a1(int i10) {
    }

    @Override
    public final void f2(int i10) {
    }

    @Override
    public final void j2(boolean z10) {
    }

    @Override
    public final void y(float f7) {
    }

    @Override
    public final void E0(int i10, int i11) {
    }

    @Override
    public final void K(float f7, int i10) {
    }

    @Override
    public final void t1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override
    public final void H(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
    }

    @Override
    public final void k2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
    }
}
