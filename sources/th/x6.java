package th;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.uz;
import org.telegram.ui.Components.gi0;
public final class x6 extends AnimatorListenerAdapter {
    public final int f49667a;
    public final o7 f49668b;

    public x6(o7 o7Var, int i10) {
        this.f49667a = i10;
        this.f49668b = o7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        z2 H;
        gi0 gi0Var;
        switch (this.f49667a) {
            case 0:
                super.onAnimationEnd(animator);
                o7 o7Var = this.f49668b;
                l7 l7Var = o7Var.f49345s0;
                d7 d7Var = o7Var.f49353w;
                if (d7Var != null) {
                    d7Var.a(true);
                }
                o7Var.B();
                o7Var.J0.e();
                i5 i5Var = o7Var.f49350u1;
                if (i5Var != null) {
                    i5Var.b();
                    org.telegram.messenger.i0.E2(o7Var.f49350u1);
                    o7Var.f49350u1 = null;
                }
                ImageReceiver imageReceiver = l7Var.f49198b;
                if (imageReceiver != null) {
                    imageReceiver.O0(true, true);
                    l7Var.f49198b = null;
                }
                ImageReceiver imageReceiver2 = l7Var.f49199c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(1.0f);
                    l7Var.f49199c.O0(true, true);
                }
                if (l7Var.d != null && (H = o7Var.H()) != null && (gi0Var = H.X0.d) != null) {
                    gi0 gi0Var2 = l7Var.d;
                    gi0Var2.getClass();
                    gi0Var2.f26443c = gi0Var.f26443c;
                    gi0Var2.f26444f = gi0Var.f26444f;
                    gi0Var2.f26442b = gi0Var.f26442b;
                    gi0Var2.f26441a = System.currentTimeMillis();
                    gi0Var2.c();
                }
                k2.t0 t0Var = o7Var.G0;
                if (t0Var != null) {
                    t0Var.b();
                }
                SurfaceView surfaceView = o7Var.C0;
                if (surfaceView != null) {
                    surfaceView.setVisibility(4);
                }
                o7Var.W();
                try {
                    org.telegram.messenger.i0.g3(new sg.v(this, 22));
                } catch (Exception unused) {
                }
                o7Var.m0 = false;
                o7Var.d = false;
                i2 i2Var = o7Var.f49336o1;
                if (i2Var != null) {
                    i2Var.run();
                    o7Var.f49336o1 = null;
                    return;
                }
                return;
            case 1:
                o7 o7Var2 = this.f49668b;
                z2 z2Var = null;
                o7Var2.H = null;
                o7Var2.Z = 0.0f;
                o7Var2.f49313d0 = 0.0f;
                e7 e7Var = o7Var2.f49333n0;
                if (e7Var != null) {
                    z2Var = e7Var.getCurrentPeerView();
                }
                if (z2Var != null) {
                    z2Var.invalidate();
                    return;
                }
                return;
            default:
                o7 o7Var3 = this.f49668b;
                l7 l7Var2 = o7Var3.f49345s0;
                o7Var3.U = 1.0f;
                o7Var3.B();
                o7.f49301x1 = false;
                d7 d7Var2 = o7Var3.f49353w;
                if (d7Var2 != null) {
                    d7Var2.a(true);
                }
                c7 c7Var = o7Var3.f49344s;
                if (c7Var != null) {
                    c7Var.invalidate();
                }
                ImageReceiver imageReceiver3 = l7Var2.f49198b;
                if (imageReceiver3 != null && !o7Var3.d) {
                    imageReceiver3.O0(true, true);
                    l7Var2.f49198b = null;
                }
                ImageReceiver imageReceiver4 = l7Var2.f49199c;
                if (imageReceiver4 != null && !o7Var3.d) {
                    imageReceiver4.setAlpha(1.0f);
                    l7Var2.f49199c.O0(true, true);
                    l7Var2.f49199c = null;
                }
                z2 H2 = o7Var3.H();
                if (H2 != null) {
                    H2.d1(false);
                }
                s0 s0Var = o7Var3.A0;
                if (s0Var != null) {
                    s0Var.v((1.0f - o7Var3.V) * o7Var3.U);
                }
                if (o7Var3.f49355w1) {
                    o7Var3.f49355w1 = false;
                    o7Var3.C();
                    org.telegram.messenger.i0.h3(new i2(o7Var3, 1), 30L);
                } else if (!uz.U) {
                    if (o7Var3.f49350u1 == null && o7Var3.f49353w != null) {
                        i5 i5Var2 = new i5(o7Var3.f49353w.getContext(), o7Var3.f49344s);
                        o7Var3.f49350u1 = i5Var2;
                        i5Var2.setAlpha(0.0f);
                        o7Var3.f49353w.addView(o7Var3.f49350u1);
                    }
                    i5 i5Var3 = o7Var3.f49350u1;
                    if (i5Var3 != null) {
                        i5Var3.setOnClickListener(new rh.s(this, 15));
                        o7Var3.f49350u1.animate().alpha(1.0f).setDuration(150L).setListener(new h7(this, 1)).start();
                    }
                    uz.G(true);
                }
                o7Var3.d0();
                o7Var3.J0.e();
                return;
        }
    }
}
