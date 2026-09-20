package xh;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.o6;
import org.telegram.ui.pn;
public final class h0 implements ng {
    public final TL_stars.TL_starGiftUnique f46180a;
    public final j0 f46181b;

    public h0(j0 j0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.f46181b = j0Var;
        this.f46180a = tL_starGiftUnique;
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
        j0 j0Var = this.f46181b;
        o6 o6Var = j0Var.f46219w;
        a5 a5Var = j0Var.f46213b;
        i10 = ((org.telegram.ui.ActionBar.f3) j0Var).currentAccount;
        a5Var.a(this.f46180a, UserConfig.getInstance(i10).getClientUserId(), j0Var.f46216n.getTextWithEntities(), LocaleController.getString(R.string.GiftMessageSendNow), true);
        int codePointCount = Character.codePointCount(charSequence, 0, charSequence.length());
        j0Var.F = codePointCount;
        int i12 = j0Var.E;
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
                o6Var.setTextColor(j0Var.getThemedColor(j6.f19315p7));
                return;
            } else {
                o6Var.setTextColor(j0Var.getThemedColor(j6.f19477y6));
                return;
            }
        }
        o6Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new pg.d0(this, 9));
    }

    @Override
    public final int c1() {
        return 0;
    }

    @Override
    public final TL_stories.StoryItem e1() {
        return null;
    }

    @Override
    public final boolean g1(long j3) {
        return false;
    }

    @Override
    public final boolean j1() {
        return false;
    }

    @Override
    public final boolean m() {
        return false;
    }

    @Override
    public final void m1(CharSequence charSequence, boolean z10, boolean z11) {
        a(charSequence);
    }

    @Override
    public final boolean p1() {
        return false;
    }

    @Override
    public final int q() {
        return 0;
    }

    @Override
    public final pn q0() {
        return null;
    }

    @Override
    public final TLRPC.Peer v() {
        return null;
    }

    @Override
    public final void w1(CharSequence charSequence) {
        a(charSequence);
    }

    @Override
    public final boolean x1() {
        return false;
    }

    @Override
    public final void A1() {
    }

    @Override
    public final void A2() {
    }

    @Override
    public final void D() {
    }

    @Override
    public final void F1() {
    }

    @Override
    public final void H0() {
    }

    @Override
    public final void K0() {
    }

    @Override
    public final void U0() {
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
    public final void n0() {
    }

    @Override
    public final void o1() {
    }

    @Override
    public final void o2() {
    }

    @Override
    public final void r1() {
    }

    @Override
    public final void s1() {
    }

    @Override
    public final void t0() {
    }

    @Override
    public final void t1() {
    }

    @Override
    public final void w2() {
    }

    @Override
    public final void x() {
    }

    @Override
    public final void B(boolean z10) {
    }

    @Override
    public final void X(boolean z10) {
    }

    @Override
    public final void b1(int i10) {
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
    public final void F0(int i10, int i11) {
    }

    @Override
    public final void K(float f7, int i10) {
    }

    @Override
    public final void u1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override
    public final void H(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
    }

    @Override
    public final void k2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
    }
}
