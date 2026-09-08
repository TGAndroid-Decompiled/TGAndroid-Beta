package yh;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.q6;
import org.telegram.ui.oj1;
import org.telegram.ui.sn;
public final class h0 implements og {
    public final TL_stars.TL_starGiftUnique f50332a;
    public final j0 f50333b;

    public h0(j0 j0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.f50333b = j0Var;
        this.f50332a = tL_starGiftUnique;
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers H() {
        return null;
    }

    @Override
    public final int W0() {
        return 0;
    }

    @Override
    public final TL_stories.StoryItem Y0() {
        return null;
    }

    public final void a(CharSequence charSequence) {
        int i10;
        int i11;
        boolean z10;
        j0 j0Var = this.f50333b;
        q6 q6Var = j0Var.f50373w;
        y4 y4Var = j0Var.f50366b;
        i10 = ((org.telegram.ui.ActionBar.f3) j0Var).currentAccount;
        y4Var.a(this.f50332a, UserConfig.getInstance(i10).getClientUserId(), j0Var.f50370n.getTextWithEntities(), LocaleController.getString(R.string.GiftMessageSendNow), true);
        int codePointCount = Character.codePointCount(charSequence, 0, charSequence.length());
        j0Var.F = codePointCount;
        int i12 = j0Var.E;
        if (i12 > 0 && (i11 = i12 - codePointCount) <= 15) {
            if (i11 < -9999) {
                i11 = -9999;
            }
            String formatNumber = LocaleController.formatNumber(i11, ',');
            if (q6Var.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            q6Var.c(formatNumber, z10, true);
            if (q6Var.getVisibility() != 0) {
                q6Var.setVisibility(0);
                q6Var.setAlpha(0.0f);
                q6Var.setScaleX(0.5f);
                q6Var.setScaleY(0.5f);
            }
            q6Var.animate().setListener(null).cancel();
            q6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            if (i11 < 0) {
                q6Var.setTextColor(j0Var.getThemedColor(j6.f20907p7));
                return;
            } else {
                q6Var.setTextColor(j0Var.getThemedColor(j6.f21069y6));
                return;
            }
        }
        q6Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new oj1(this, 11));
    }

    @Override
    public final boolean a1(long j3) {
        return false;
    }

    @Override
    public final boolean d1() {
        return false;
    }

    @Override
    public final void f1(CharSequence charSequence, boolean z10, boolean z11) {
        a(charSequence);
    }

    @Override
    public final boolean i1() {
        return false;
    }

    @Override
    public final boolean l() {
        return false;
    }

    @Override
    public final sn o0() {
        return null;
    }

    @Override
    public final int p() {
        return 0;
    }

    @Override
    public final void p1(CharSequence charSequence) {
        a(charSequence);
    }

    @Override
    public final TLRPC.Peer q() {
        return null;
    }

    @Override
    public final boolean q1() {
        return false;
    }

    @Override
    public final boolean z0() {
        return true;
    }

    @Override
    public final void C() {
    }

    @Override
    public final void D0() {
    }

    @Override
    public final void G0() {
    }

    @Override
    public final void P0() {
    }

    @Override
    public final void U() {
    }

    @Override
    public final void V1() {
    }

    @Override
    public final void a2() {
    }

    @Override
    public final void g2() {
    }

    @Override
    public final void h() {
    }

    @Override
    public final void h1() {
    }

    @Override
    public final void k() {
    }

    @Override
    public final void k1() {
    }

    @Override
    public final void l0() {
    }

    @Override
    public final void l1() {
    }

    @Override
    public final void m1() {
    }

    @Override
    public final void n2() {
    }

    @Override
    public final void r0() {
    }

    @Override
    public final void r2() {
    }

    @Override
    public final void t1() {
    }

    @Override
    public final void v() {
    }

    @Override
    public final void x1() {
    }

    @Override
    public final void V0(int i10) {
    }

    @Override
    public final void W(boolean z10) {
    }

    @Override
    public final void X1(int i10) {
    }

    @Override
    public final void b2(boolean z10) {
    }

    @Override
    public final void x(float f7) {
    }

    @Override
    public final void z(boolean z10) {
    }

    @Override
    public final void B0(int i10, int i11) {
    }

    @Override
    public final void J(float f7, int i10) {
    }

    @Override
    public final void n1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override
    public final void G(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
    }

    @Override
    public final void c2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
    }
}
