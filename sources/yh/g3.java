package yh;

import org.telegram.messenger.AndroidUtilities;
public final class g3 implements Runnable {
    public final int f47238a;
    public final m3 f47239b;

    public g3(m3 m3Var, int i10) {
        this.f47238a = i10;
        this.f47239b = m3Var;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        switch (this.f47238a) {
            case 0:
                this.f47239b.b();
                return;
            case 1:
                m3 m3Var = this.f47239b;
                x3 x3Var = m3Var.f47460a;
                if (!m3Var.f47477u) {
                    m3Var.v = false;
                    if (m3Var.f47471o) {
                        m3Var.f47477u = true;
                        long currentTimeMillis = System.currentTimeMillis();
                        float min = Math.min(((float) (currentTimeMillis - m3Var.f47469m)) / 1000.0f, 0.25f);
                        float f7 = m3Var.f47470n + min;
                        m3Var.f47470n = f7;
                        i3 i3Var = m3Var.f47466j;
                        if (f7 > AndroidUtilities.lerp(0.1f, 1.0f, m3Var.f47476t)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        float f10 = i3Var.f(min, z10);
                        i3 i3Var2 = m3Var.f47467k;
                        if (m3Var.f47470n > AndroidUtilities.lerp(0.1f, 1.0f, m3Var.f47476t)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        float f11 = i3Var2.f(min, z11);
                        float f12 = m3Var.f47465i.f(min, m3Var.f47466j.b(0.5f));
                        i3 i3Var3 = m3Var.h;
                        if (m3Var.f47466j.b(0.5f) && m3Var.f47465i.b(0.5f)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        float f13 = i3Var3.f(min, z12);
                        m3Var.f47469m = currentTimeMillis;
                        if (m3Var.f47466j.c() && m3Var.f47465i.c() && m3Var.h.c() && !m3Var.f47472p) {
                            m3Var.f47472p = true;
                            AndroidUtilities.runOnUIThread(new g3(m3Var, 2));
                        }
                        if (m3Var.f47466j.c() && m3Var.f47465i.c() && m3Var.h.b(0.25f) && !m3Var.f47473q) {
                            m3Var.f47473q = true;
                            AndroidUtilities.runOnUIThread(new g3(m3Var, 3));
                        }
                        r3 r3Var = m3Var.f47461b;
                        if (r3Var != null) {
                            i3 i3Var4 = m3Var.h;
                            h3 h3Var = i3Var4.f47306b;
                            float f14 = i3Var4.e - f13;
                            float f15 = f14 - 1.0f;
                            h3 h3Var2 = i3Var4.f47310i;
                            if (h3Var == h3Var2) {
                                z22 = true;
                            } else {
                                z22 = false;
                            }
                            h3 h3Var3 = i3Var4.f47307c;
                            if (h3Var3 == h3Var2) {
                                z23 = true;
                            } else {
                                z23 = false;
                            }
                            h3 h3Var4 = i3Var4.d;
                            float f16 = f14 + 1.0f;
                            if (h3Var4 == h3Var2) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            r3Var.a(h3Var, f15, z22, h3Var3, f14, z23, h3Var4, f16, z24);
                        }
                        r3 r3Var2 = m3Var.f47462c;
                        if (r3Var2 != null) {
                            i3 i3Var5 = m3Var.f47465i;
                            h3 h3Var5 = i3Var5.f47306b;
                            float f17 = i3Var5.e - f12;
                            float f18 = f17 - 1.0f;
                            h3 h3Var6 = i3Var5.f47310i;
                            if (h3Var5 == h3Var6) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            h3 h3Var7 = i3Var5.f47307c;
                            if (h3Var7 == h3Var6) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                            h3 h3Var8 = i3Var5.d;
                            float f19 = f17 + 1.0f;
                            if (h3Var8 == h3Var6) {
                                z21 = true;
                            } else {
                                z21 = false;
                            }
                            r3Var2.a(h3Var5, f18, z19, h3Var7, f17, z20, h3Var8, f19, z21);
                        }
                        r3 r3Var3 = m3Var.d;
                        if (r3Var3 != null) {
                            i3 i3Var6 = m3Var.f47467k;
                            h3 h3Var9 = i3Var6.f47306b;
                            float f20 = i3Var6.e - f11;
                            float f21 = f20 - 1.0f;
                            h3 h3Var10 = i3Var6.f47310i;
                            if (h3Var9 == h3Var10) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            h3 h3Var11 = i3Var6.f47307c;
                            if (h3Var11 == h3Var10) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            h3 h3Var12 = i3Var6.d;
                            float f22 = f20 + 1.0f;
                            if (h3Var12 == h3Var10) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            r3Var3.a(h3Var9, f21, z16, h3Var11, f20, z17, h3Var12, f22, z18);
                        }
                        x3Var.g(0, ((l3) m3Var.f47465i.f47307c).f47430c, true);
                        p3 p3Var = x3Var.f47990c;
                        i3 i3Var7 = m3Var.h;
                        h3 h3Var13 = i3Var7.f47306b;
                        k3 k3Var = (k3) h3Var13;
                        float f23 = i3Var7.e - f13;
                        float f24 = f23 - 1.0f;
                        h3 h3Var14 = i3Var7.f47310i;
                        if (h3Var13 == h3Var14) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        h3 h3Var15 = i3Var7.f47307c;
                        k3 k3Var2 = (k3) h3Var15;
                        if (h3Var15 == h3Var14) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        h3 h3Var16 = i3Var7.d;
                        k3 k3Var3 = (k3) h3Var16;
                        float f25 = f23 + 1.0f;
                        if (h3Var16 == h3Var14) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        i3 i3Var8 = m3Var.f47466j;
                        float f26 = i3Var8.e - f10;
                        p3Var.f47635a = k3Var;
                        p3Var.f47636b = k3Var2;
                        p3Var.f47637c = k3Var3;
                        p3Var.d = f24;
                        p3Var.e = f23;
                        p3Var.f47638f = f25;
                        p3Var.h = z13;
                        p3Var.f47639n = z14;
                        p3Var.f47640r = z15;
                        p3Var.f47641s = (j3) i3Var8.f47306b;
                        p3Var.v = (j3) i3Var8.f47307c;
                        p3Var.f47642w = (j3) i3Var8.d;
                        p3Var.f47643x = f26 - 1.0f;
                        p3Var.f47644y = f26;
                        p3Var.E = f26 + 1.0f;
                        p3Var.invalidate();
                        m3Var.f47477u = false;
                        m3Var.b();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                m3 m3Var2 = this.f47239b;
                m3Var2.f47471o = false;
                m3Var2.f47460a.f47990c.c();
                b1 b1Var = m3Var2.f47474r;
                if (b1Var != null) {
                    b1Var.run();
                    return;
                }
                return;
            default:
                b1 b1Var2 = this.f47239b.f47475s;
                if (b1Var2 != null) {
                    b1Var2.run();
                    return;
                }
                return;
        }
    }
}
