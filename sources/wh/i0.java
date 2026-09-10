package wh;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.qg;
import org.telegram.ui.mv0;
import org.telegram.ui.tn;
public final class i0 implements qg {
    public final TL_stars.TL_starGiftUnique f44146a;
    public final k0 f44147b;

    public i0(k0 k0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.f44147b = k0Var;
        this.f44146a = tL_starGiftUnique;
    }

    @Override
    public final boolean D0() {
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
        k0 k0Var = this.f44147b;
        o6 o6Var = k0Var.f44168w;
        z4 z4Var = k0Var.f44162b;
        i10 = ((org.telegram.ui.ActionBar.h3) k0Var).currentAccount;
        z4Var.a(this.f44146a, UserConfig.getInstance(i10).getClientUserId(), k0Var.f44165n.getTextWithEntities(), LocaleController.getString(R.string.GiftMessageSendNow), true);
        int codePointCount = Character.codePointCount(charSequence, 0, charSequence.length());
        k0Var.F = codePointCount;
        int i12 = k0Var.E;
        if (i12 > 0 && (i11 = i12 - codePointCount) <= 15) {
            if (i11 < -9999) {
                i11 = -9999;
            }
            String formatNumber = LocaleController.formatNumber(i11, ',');
            if (o6Var.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            o6Var.c(formatNumber, z10, true);
            if (o6Var.getVisibility() != 0) {
                o6Var.setVisibility(0);
                o6Var.setAlpha(0.0f);
                o6Var.setScaleX(0.5f);
                o6Var.setScaleY(0.5f);
            }
            o6Var.animate().setListener(null).cancel();
            o6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            if (i11 < 0) {
                o6Var.setTextColor(k0Var.getThemedColor(j6.f18144p7));
                return;
            } else {
                o6Var.setTextColor(k0Var.getThemedColor(j6.f18306y6));
                return;
            }
        }
        o6Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new mv0(this, 27));
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
    public final boolean e1(long j3) {
        return false;
    }

    @Override
    public final boolean h1() {
        return false;
    }

    @Override
    public final void k1(CharSequence charSequence, boolean z10, boolean z11) {
        a(charSequence);
    }

    @Override
    public final boolean l() {
        return false;
    }

    @Override
    public final boolean n1() {
        return false;
    }

    @Override
    public final tn p0() {
        return null;
    }

    @Override
    public final int u() {
        return 0;
    }

    @Override
    public final void u1(CharSequence charSequence) {
        a(charSequence);
    }

    @Override
    public final boolean v1() {
        return false;
    }

    @Override
    public final TLRPC.Peer w() {
        return null;
    }

    @Override
    public final void D1() {
    }

    @Override
    public final void G() {
    }

    @Override
    public final void H0() {
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
    public final void b2() {
    }

    @Override
    public final void g2() {
    }

    @Override
    public final void h() {
    }

    @Override
    public final void k() {
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
    public final void p1() {
    }

    @Override
    public final void q1() {
    }

    @Override
    public final void r1() {
    }

    @Override
    public final void t0() {
    }

    @Override
    public final void u2() {
    }

    @Override
    public final void x() {
    }

    @Override
    public final void y1() {
    }

    @Override
    public final void y2() {
    }

    @Override
    public final void B(boolean z10) {
    }

    @Override
    public final void Z(boolean z10) {
    }

    @Override
    public final void a1(int i10) {
    }

    @Override
    public final void d2(int i10) {
    }

    @Override
    public final void h2(boolean z10) {
    }

    @Override
    public final void y(float f7) {
    }

    @Override
    public final void F0(int i10, int i11) {
    }

    @Override
    public final void T(float f7, int i10) {
    }

    @Override
    public final void s1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override
    public final void I(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
    }

    @Override
    public final void i2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
    }
}
