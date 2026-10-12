package yh;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.s6;
import org.telegram.ui.fi1;
import org.telegram.ui.un;
public final class i0 implements pg {
    public final TL_stars.TL_starGiftUnique f48917a;
    public final k0 f48918b;

    public i0(k0 k0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.f48918b = k0Var;
        this.f48917a = tL_starGiftUnique;
    }

    @Override
    public final boolean B0() {
        return true;
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers K() {
        return null;
    }

    @Override
    public final int Y0() {
        return 0;
    }

    public final void a(CharSequence charSequence) {
        int i10;
        int i11;
        boolean z10;
        k0 k0Var = this.f48918b;
        s6 s6Var = k0Var.f48933w;
        y4 y4Var = k0Var.f48927b;
        i10 = ((org.telegram.ui.ActionBar.e3) k0Var).currentAccount;
        y4Var.a(this.f48917a, UserConfig.getInstance(i10).getClientUserId(), k0Var.f48930n.getTextWithEntities(), LocaleController.getString(R.string.GiftMessageSendNow), true);
        int codePointCount = Character.codePointCount(charSequence, 0, charSequence.length());
        k0Var.F = codePointCount;
        int i12 = k0Var.E;
        if (i12 > 0 && (i11 = i12 - codePointCount) <= 15) {
            if (i11 < -9999) {
                i11 = -9999;
            }
            String formatNumber = LocaleController.formatNumber(i11, ',');
            if (s6Var.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            s6Var.c(formatNumber, z10, true);
            if (s6Var.getVisibility() != 0) {
                s6Var.setVisibility(0);
                s6Var.setAlpha(0.0f);
                s6Var.setScaleX(0.5f);
                s6Var.setScaleY(0.5f);
            }
            s6Var.animate().setListener(null).cancel();
            s6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            if (i11 < 0) {
                s6Var.setTextColor(k0Var.getThemedColor(g6.f20122p7));
                return;
            } else {
                s6Var.setTextColor(k0Var.getThemedColor(g6.f20288y6));
                return;
            }
        }
        s6Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new fi1(this, 20));
    }

    @Override
    public final TL_stories.StoryItem a1() {
        return null;
    }

    @Override
    public final boolean b1(long j10) {
        return false;
    }

    @Override
    public final boolean e1() {
        return false;
    }

    @Override
    public final void g1(CharSequence charSequence, boolean z10, boolean z11) {
        a(charSequence);
    }

    @Override
    public final boolean j1() {
        return false;
    }

    @Override
    public final boolean l() {
        return false;
    }

    @Override
    public final un p0() {
        return null;
    }

    @Override
    public final int q() {
        return 0;
    }

    @Override
    public final void q1(CharSequence charSequence) {
        a(charSequence);
    }

    @Override
    public final boolean r1() {
        return false;
    }

    @Override
    public final TLRPC.Peer x() {
        return null;
    }

    @Override
    public final void F0() {
    }

    @Override
    public final void G() {
    }

    @Override
    public final void H0() {
    }

    @Override
    public final void Q0() {
    }

    @Override
    public final void T1() {
    }

    @Override
    public final void X() {
    }

    @Override
    public final void Y1() {
    }

    @Override
    public final void e2() {
    }

    @Override
    public final void h() {
    }

    @Override
    public final void i1() {
    }

    @Override
    public final void k() {
    }

    @Override
    public final void l1() {
    }

    @Override
    public final void m0() {
    }

    @Override
    public final void m1() {
    }

    @Override
    public final void m2() {
    }

    @Override
    public final void n1() {
    }

    @Override
    public final void q2() {
    }

    @Override
    public final void t0() {
    }

    @Override
    public final void u1() {
    }

    @Override
    public final void y() {
    }

    @Override
    public final void y1() {
    }

    @Override
    public final void C(boolean z10) {
    }

    @Override
    public final void V1(int i10) {
    }

    @Override
    public final void X0(int i10) {
    }

    @Override
    public final void Z1(boolean z10) {
    }

    @Override
    public final void a0(boolean z10) {
    }

    @Override
    public final void z(float f7) {
    }

    @Override
    public final void D0(int i10, int i11) {
    }

    @Override
    public final void U(float f7, int i10) {
    }

    @Override
    public final void o1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override
    public final void J(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
    }

    @Override
    public final void a2(int i10, int i11, int i12, long j10, long j11, boolean z10) {
    }
}
