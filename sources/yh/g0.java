package yh;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.q6;
import org.telegram.ui.gn;
import org.telegram.ui.tf1;
public final class g0 implements og {
    public final TL_stars.TL_starGiftUnique f50247a;
    public final i0 f50248b;

    public g0(i0 i0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.f50248b = i0Var;
        this.f50247a = tL_starGiftUnique;
    }

    @Override
    public final boolean B0() {
        return true;
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers O() {
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
        i0 i0Var = this.f50248b;
        q6 q6Var = i0Var.f50294w;
        y4 y4Var = i0Var.f50288b;
        i10 = ((org.telegram.ui.ActionBar.f3) i0Var).currentAccount;
        y4Var.a(this.f50247a, UserConfig.getInstance(i10).getClientUserId(), i0Var.f50291n.getTextWithEntities(), LocaleController.getString(R.string.GiftMessageSendNow), true);
        int codePointCount = Character.codePointCount(charSequence, 0, charSequence.length());
        i0Var.F = codePointCount;
        int i12 = i0Var.E;
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
                q6Var.setTextColor(i0Var.getThemedColor(h6.f21208p7));
                return;
            } else {
                q6Var.setTextColor(i0Var.getThemedColor(h6.f21375y6));
                return;
            }
        }
        q6Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new tf1(this, 22));
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
    public final boolean o() {
        return false;
    }

    @Override
    public final gn p0() {
        return null;
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
    public final int u() {
        return 0;
    }

    @Override
    public final TLRPC.Peer x() {
        return null;
    }

    @Override
    public final void C(boolean z10) {
    }

    @Override
    public final void F0() {
    }

    @Override
    public final void H() {
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
    public final void V1(int i10) {
    }

    @Override
    public final void X0(int i10) {
    }

    @Override
    public final void Y() {
    }

    @Override
    public final void Y1() {
    }

    @Override
    public final void Z1(boolean z10) {
    }

    @Override
    public final void a0(boolean z10) {
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
    public final void L(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
    }

    @Override
    public final void a2(int i10, int i11, int i12, long j10, long j11, boolean z10) {
    }
}
