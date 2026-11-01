package ph;

import android.view.View;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.sf;
import org.telegram.ui.kn;
import org.telegram.ui.ms0;
public final class i0 implements sf {
    public final TL_stars.TL_starGiftUnique f45122a;
    public final k0 f45123b;

    public i0(k0 k0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.f45123b = k0Var;
        this.f45122a = tL_starGiftUnique;
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers F() {
        return null;
    }

    @Override
    public final int H0() {
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
        boolean z10;
        k0 k0Var = this.f45123b;
        f6 f6Var = k0Var.f45164s1;
        k0Var.f45155i1.a(this.f45122a, e20.i(k0Var.f21584a).e(), k0Var.f45160o1.getTextWithEntities(), dd.L0(2131749754, null), true);
        int codePointCount = Character.codePointCount(charSequence, 0, charSequence.length());
        k0Var.f45168w1 = codePointCount;
        int i11 = k0Var.f45167v1;
        if (i11 > 0 && (i10 = i11 - codePointCount) <= 15) {
            if (i10 < -9999) {
                i10 = -9999;
            }
            String E = dd.E(i10, ',');
            if (f6Var.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            f6Var.c(E, z10, true);
            if (f6Var.getVisibility() != 0) {
                f6Var.setVisibility(0);
                f6Var.setAlpha(0.0f);
                f6Var.setScaleX(0.5f);
                f6Var.setScaleY(0.5f);
            }
            f6Var.animate().setListener(null).cancel();
            f6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            if (i10 < 0) {
                a7.Z(f6Var, t6.f21154p7, k0Var.I0);
                return;
            } else {
                a7.Z(f6Var, t6.f21312y6, k0Var.I0);
                return;
            }
        }
        f6Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new ms0(this, 25));
    }

    @Override
    public final kn b0() {
        return null;
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
    public final boolean k0() {
        return true;
    }

    @Override
    public final boolean m() {
        return false;
    }

    @Override
    public final int r() {
        return 0;
    }

    @Override
    public final TLRPC.Peer u() {
        return null;
    }

    @Override
    public final void B(boolean z10) {
    }

    @Override
    public final void G0(int i10) {
    }

    @Override
    public final void Q1(int i10) {
    }

    @Override
    public final void U1(boolean z10) {
    }

    @Override
    public final void V(boolean z10) {
    }

    @Override
    public final void y(float f7) {
    }

    @Override
    public final void C() {
    }

    @Override
    public final void D() {
    }

    @Override
    public final void N() {
    }

    @Override
    public final void O1() {
    }

    @Override
    public final void T1() {
    }

    @Override
    public final void X() {
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
    public final void b1() {
    }

    @Override
    public final void d1() {
    }

    @Override
    public final void d2() {
    }

    @Override
    public final void e() {
    }

    @Override
    public final void h2() {
    }

    @Override
    public final void i1() {
    }

    @Override
    public final void j0() {
    }

    @Override
    public final void k() {
    }

    @Override
    public final void n0() {
    }

    @Override
    public final void o1() {
    }

    @Override
    public final void q0() {
    }

    @Override
    public final void v0() {
    }

    @Override
    public final void w() {
    }

    @Override
    public final void I(float f7, int i10) {
    }

    @Override
    public final void e1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override
    public final void E(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
    }

    @Override
    public final void V1(int i10, int i11, int i12, long j10, long j11, boolean z10) {
    }
}
