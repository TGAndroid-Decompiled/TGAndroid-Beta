package zh;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.s6;
import org.telegram.ui.fc1;
import org.telegram.ui.kn;
public final class g0 implements og {
    public final TL_stars.TL_starGiftUnique f52978a;
    public final i0 f52979b;

    public g0(i0 i0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.f52979b = i0Var;
        this.f52978a = tL_starGiftUnique;
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers B() {
        return null;
    }

    @Override
    public final int N0() {
        return 0;
    }

    @Override
    public final TL_stories.StoryItem P0() {
        return null;
    }

    @Override
    public final boolean R0(long j10) {
        return false;
    }

    @Override
    public final boolean T0() {
        return false;
    }

    @Override
    public final void V0(CharSequence charSequence, boolean z10, boolean z11) {
        a(charSequence);
    }

    @Override
    public final boolean Y0() {
        return false;
    }

    public final void a(CharSequence charSequence) {
        int i10;
        int i11;
        boolean z10;
        u6 u6Var;
        u6 u6Var2;
        i0 i0Var = this.f52979b;
        s6 s6Var = i0Var.f53043w;
        z4 z4Var = i0Var.f53037b;
        i10 = ((org.telegram.ui.ActionBar.k3) i0Var).currentAccount;
        z4Var.a(this.f52978a, UserConfig.getInstance(i10).getClientUserId(), i0Var.f53040n.getTextWithEntities(), LocaleController.getString(R.string.GiftMessageSendNow), true);
        int codePointCount = Character.codePointCount(charSequence, 0, charSequence.length());
        i0Var.F = codePointCount;
        int i12 = i0Var.E;
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
                int i13 = y6.f23581p7;
                u6Var2 = ((org.telegram.ui.ActionBar.k3) i0Var).resourcesProvider;
                f7.Z(s6Var, i13, u6Var2);
                return;
            }
            int i14 = y6.f23748y6;
            u6Var = ((org.telegram.ui.ActionBar.k3) i0Var).resourcesProvider;
            f7.Z(s6Var, i14, u6Var);
            return;
        }
        s6Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new fc1(this, 25));
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final int g() {
        return 0;
    }

    @Override
    public final void g1(CharSequence charSequence) {
        a(charSequence);
    }

    @Override
    public final boolean h1() {
        return false;
    }

    @Override
    public final kn i0() {
        return null;
    }

    @Override
    public final TLRPC.Peer k() {
        return null;
    }

    @Override
    public final boolean p0() {
        return true;
    }

    @Override
    public final void L1(int i10) {
    }

    @Override
    public final void M0(int i10) {
    }

    @Override
    public final void O1(boolean z10) {
    }

    @Override
    public final void R(boolean z10) {
    }

    @Override
    public final void t(float f7) {
    }

    @Override
    public final void w(boolean z10) {
    }

    @Override
    public final void H() {
    }

    @Override
    public final void H0() {
    }

    @Override
    public final void J1() {
    }

    @Override
    public final void N1() {
    }

    @Override
    public final void T1() {
    }

    @Override
    public final void U() {
    }

    @Override
    public final void X0() {
    }

    @Override
    public final void Y1() {
    }

    @Override
    public final void a1() {
    }

    @Override
    public final void b() {
    }

    @Override
    public final void b1() {
    }

    @Override
    public final void c1() {
    }

    @Override
    public final void c2() {
    }

    @Override
    public final void e() {
    }

    @Override
    public final void j1() {
    }

    @Override
    public final void l0() {
    }

    @Override
    public final void o() {
    }

    @Override
    public final void o1() {
    }

    @Override
    public final void x0() {
    }

    @Override
    public final void z() {
    }

    @Override
    public final void z0() {
    }

    @Override
    public final void G(float f7, int i10) {
    }

    @Override
    public final void v0(int i10, int i11) {
    }

    @Override
    public final void e1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override
    public final void A(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
    }

    @Override
    public final void P1(int i10, int i11, int i12, long j10, long j11, boolean z10) {
    }
}
