package zh;

import android.view.View;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.wf;
import org.telegram.ui.sm;
import org.telegram.ui.t81;
public final class f0 implements wf {
    public final TL_stars.TL_starGiftUnique f60319a;
    public final h0 f60320b;

    public f0(h0 h0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.f60320b = h0Var;
        this.f60319a = tL_starGiftUnique;
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
        h0 h0Var = this.f60320b;
        j6 j6Var = h0Var.f60364s1;
        h0Var.f60356i1.a(this.f60319a, p10.i(h0Var.f28621a).e(), h0Var.f60360o1.getTextWithEntities(), id.M0(2131749745, null), true);
        int codePointCount = Character.codePointCount(charSequence, 0, charSequence.length());
        h0Var.f60368w1 = codePointCount;
        int i10 = h0Var.f60367v1;
        if (i10 > 0 && (i7 = i10 - codePointCount) <= 15) {
            if (i7 < -9999) {
                i7 = -9999;
            }
            String E = id.E(i7, ',');
            if (j6Var.getVisibility() == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            j6Var.c(E, z9, true);
            if (j6Var.getVisibility() != 0) {
                j6Var.setVisibility(0);
                j6Var.setAlpha(0.0f);
                j6Var.setScaleX(0.5f);
                j6Var.setScaleY(0.5f);
            }
            j6Var.animate().setListener(null).cancel();
            j6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            if (i7 < 0) {
                s6.Y(j6Var, l6.f28086p7, h0Var.I0);
                return;
            } else {
                s6.Y(j6Var, l6.f28257y6, h0Var.I0);
                return;
            }
        }
        j6Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new t81(this, 25));
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
