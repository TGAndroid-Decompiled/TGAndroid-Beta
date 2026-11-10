package zh;

import android.view.View;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.vf;
import org.telegram.ui.sm;
import org.telegram.ui.u81;
public final class f0 implements vf {
    public final TL_stars.TL_starGiftUnique f60321a;
    public final h0 f60322b;

    public f0(h0 h0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.f60322b = h0Var;
        this.f60321a = tL_starGiftUnique;
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers I() {
        return null;
    }

    @Override
    public final int S0() {
        return 0;
    }

    @Override
    public final TL_stories.StoryItem T0() {
        return null;
    }

    @Override
    public final boolean V0(long j3) {
        return false;
    }

    @Override
    public final boolean X0() {
        return false;
    }

    @Override
    public final void a1(CharSequence charSequence, boolean z9, boolean z10) {
        d(charSequence);
    }

    @Override
    public final boolean c() {
        return false;
    }

    public final void d(CharSequence charSequence) {
        int i7;
        boolean z9;
        h0 h0Var = this.f60322b;
        i6 i6Var = h0Var.f60369v1;
        h0Var.l1.a(this.f60321a, p10.i(h0Var.f28669a).e(), h0Var.f60365r1.getTextWithEntities(), id.M0(2131749745, null), true);
        int codePointCount = Character.codePointCount(charSequence, 0, charSequence.length());
        h0Var.f60373z1 = codePointCount;
        int i10 = h0Var.f60372y1;
        if (i10 > 0 && (i7 = i10 - codePointCount) <= 15) {
            if (i7 < -9999) {
                i7 = -9999;
            }
            String E = id.E(i7, ',');
            if (i6Var.getVisibility() == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            i6Var.c(E, z9, true);
            if (i6Var.getVisibility() != 0) {
                i6Var.setVisibility(0);
                i6Var.setAlpha(0.0f);
                i6Var.setScaleX(0.5f);
                i6Var.setScaleY(0.5f);
            }
            i6Var.animate().setListener(null).cancel();
            i6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            if (i7 < 0) {
                t6.Y(i6Var, m6.f28111p7, h0Var.I0);
                return;
            } else {
                t6.Y(i6Var, m6.f28282y6, h0Var.I0);
                return;
            }
        }
        i6Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new u81(this, 25));
    }

    @Override
    public final boolean d1() {
        return false;
    }

    @Override
    public final void k1(CharSequence charSequence) {
        d(charSequence);
    }

    @Override
    public final int l() {
        return 0;
    }

    @Override
    public final boolean l1() {
        return false;
    }

    @Override
    public final sm o0() {
        return null;
    }

    @Override
    public final TLRPC.Peer s() {
        return null;
    }

    @Override
    public final boolean v0() {
        return true;
    }

    @Override
    public final void B(boolean z9) {
    }

    @Override
    public final void R0(int i7) {
    }

    @Override
    public final void V1(int i7) {
    }

    @Override
    public final void Y(boolean z9) {
    }

    @Override
    public final void Y1(boolean z9) {
    }

    @Override
    public final void w(float f10) {
    }

    @Override
    public final void C0() {
    }

    @Override
    public final void D() {
    }

    @Override
    public final void E() {
    }

    @Override
    public final void I0() {
    }

    @Override
    public final void T1() {
    }

    @Override
    public final void W() {
    }

    @Override
    public final void X1() {
    }

    @Override
    public final void a() {
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c1() {
    }

    @Override
    public final void d2() {
    }

    @Override
    public final void e1() {
    }

    @Override
    public final void f1() {
    }

    @Override
    public final void h1() {
    }

    @Override
    public final void h2() {
    }

    @Override
    public final void j0() {
    }

    @Override
    public final void l2() {
    }

    @Override
    public final void m1() {
    }

    @Override
    public final void r0() {
    }

    @Override
    public final void t() {
    }

    @Override
    public final void t1() {
    }

    @Override
    public final void w0() {
    }

    @Override
    public final void M(float f10, int i7) {
    }

    @Override
    public final void i1(View view, CharSequence charSequence, boolean z9) {
    }

    @Override
    public final void F(CharSequence charSequence, boolean z9, int i7, int i10, long j3) {
    }

    @Override
    public final void Z1(int i7, int i10, int i11, long j3, long j10, boolean z9) {
    }
}
