package xh;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.mg;
import org.telegram.ui.Components.n6;
import org.telegram.ui.rn;
public final class h0 implements mg {
    public final TL_stars.TL_starGiftUnique f45912a;
    public final j0 f45913b;

    public h0(j0 j0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.f45913b = j0Var;
        this.f45912a = tL_starGiftUnique;
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
        j0 j0Var = this.f45913b;
        n6 n6Var = j0Var.f45961w;
        z4 z4Var = j0Var.f45955b;
        i10 = ((org.telegram.ui.ActionBar.g3) j0Var).currentAccount;
        z4Var.a(this.f45912a, UserConfig.getInstance(i10).getClientUserId(), j0Var.f45958n.getTextWithEntities(), LocaleController.getString(R.string.GiftMessageSendNow), true);
        int codePointCount = Character.codePointCount(charSequence, 0, charSequence.length());
        j0Var.F = codePointCount;
        int i12 = j0Var.E;
        if (i12 > 0 && (i11 = i12 - codePointCount) <= 15) {
            if (i11 < -9999) {
                i11 = -9999;
            }
            String formatNumber = LocaleController.formatNumber(i11, ',');
            if (n6Var.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            n6Var.c(formatNumber, z10, true);
            if (n6Var.getVisibility() != 0) {
                n6Var.setVisibility(0);
                n6Var.setAlpha(0.0f);
                n6Var.setScaleX(0.5f);
                n6Var.setScaleY(0.5f);
            }
            n6Var.animate().setListener(null).cancel();
            n6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            if (i11 < 0) {
                n6Var.setTextColor(j0Var.getThemedColor(j6.f19082p7));
                return;
            } else {
                n6Var.setTextColor(j0Var.getThemedColor(j6.f19244y6));
                return;
            }
        }
        n6Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new qg.n0(this, 8));
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
    public final rn p0() {
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
