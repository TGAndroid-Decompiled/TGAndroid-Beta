package yh;

import org.telegram.messenger.AndroidUtilities;
public final class z2 implements Runnable {
    public final int f53689a;
    public final f3 f53690b;

    public z2(f3 f3Var, int i10) {
        this.f53689a = i10;
        this.f53690b = f3Var;
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
        switch (this.f53689a) {
            case 0:
                this.f53690b.b();
                return;
            case 1:
                f3 f3Var = this.f53690b;
                p3 p3Var = f3Var.f52723a;
                if (!f3Var.f52741u) {
                    f3Var.v = false;
                    if (f3Var.f52735o) {
                        f3Var.f52741u = true;
                        long currentTimeMillis = System.currentTimeMillis();
                        float min = Math.min(((float) (currentTimeMillis - f3Var.f52733m)) / 1000.0f, 0.25f);
                        float f7 = f3Var.f52734n + min;
                        f3Var.f52734n = f7;
                        b3 b3Var = f3Var.f52730j;
                        if (f7 > AndroidUtilities.lerp(0.1f, 1.0f, f3Var.f52740t)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        float f10 = b3Var.f(min, z10);
                        b3 b3Var2 = f3Var.f52731k;
                        if (f3Var.f52734n > AndroidUtilities.lerp(0.1f, 1.0f, f3Var.f52740t)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        float f11 = b3Var2.f(min, z11);
                        float f12 = f3Var.f52729i.f(min, f3Var.f52730j.b(0.5f));
                        b3 b3Var3 = f3Var.h;
                        if (f3Var.f52730j.b(0.5f) && f3Var.f52729i.b(0.5f)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        float f13 = b3Var3.f(min, z12);
                        f3Var.f52733m = currentTimeMillis;
                        if (f3Var.f52730j.c() && f3Var.f52729i.c() && f3Var.h.c() && !f3Var.f52736p) {
                            f3Var.f52736p = true;
                            AndroidUtilities.runOnUIThread(new z2(f3Var, 2));
                        }
                        if (f3Var.f52730j.c() && f3Var.f52729i.c() && f3Var.h.b(0.25f) && !f3Var.f52737q) {
                            f3Var.f52737q = true;
                            AndroidUtilities.runOnUIThread(new z2(f3Var, 3));
                        }
                        k3 k3Var = f3Var.f52724b;
                        if (k3Var != null) {
                            b3 b3Var4 = f3Var.h;
                            a3 a3Var = b3Var4.f52510b;
                            float f14 = b3Var4.f52512e - f13;
                            float f15 = f14 - 1.0f;
                            a3 a3Var2 = b3Var4.f52515i;
                            if (a3Var == a3Var2) {
                                z22 = true;
                            } else {
                                z22 = false;
                            }
                            a3 a3Var3 = b3Var4.f52511c;
                            if (a3Var3 == a3Var2) {
                                z23 = true;
                            } else {
                                z23 = false;
                            }
                            a3 a3Var4 = b3Var4.d;
                            float f16 = f14 + 1.0f;
                            if (a3Var4 == a3Var2) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            k3Var.a(a3Var, f15, z22, a3Var3, f14, z23, a3Var4, f16, z24);
                        }
                        k3 k3Var2 = f3Var.f52725c;
                        if (k3Var2 != null) {
                            b3 b3Var5 = f3Var.f52729i;
                            a3 a3Var5 = b3Var5.f52510b;
                            float f17 = b3Var5.f52512e - f12;
                            float f18 = f17 - 1.0f;
                            a3 a3Var6 = b3Var5.f52515i;
                            if (a3Var5 == a3Var6) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            a3 a3Var7 = b3Var5.f52511c;
                            if (a3Var7 == a3Var6) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                            a3 a3Var8 = b3Var5.d;
                            float f19 = f17 + 1.0f;
                            if (a3Var8 == a3Var6) {
                                z21 = true;
                            } else {
                                z21 = false;
                            }
                            k3Var2.a(a3Var5, f18, z19, a3Var7, f17, z20, a3Var8, f19, z21);
                        }
                        k3 k3Var3 = f3Var.d;
                        if (k3Var3 != null) {
                            b3 b3Var6 = f3Var.f52731k;
                            a3 a3Var9 = b3Var6.f52510b;
                            float f20 = b3Var6.f52512e - f11;
                            float f21 = f20 - 1.0f;
                            a3 a3Var10 = b3Var6.f52515i;
                            if (a3Var9 == a3Var10) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            a3 a3Var11 = b3Var6.f52511c;
                            if (a3Var11 == a3Var10) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            a3 a3Var12 = b3Var6.d;
                            float f22 = f20 + 1.0f;
                            if (a3Var12 == a3Var10) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            k3Var3.a(a3Var9, f21, z16, a3Var11, f20, z17, a3Var12, f22, z18);
                        }
                        p3Var.g(0, ((e3) f3Var.f52729i.f52511c).f52660c, true);
                        i3 i3Var = p3Var.f53240c;
                        b3 b3Var7 = f3Var.h;
                        a3 a3Var13 = b3Var7.f52510b;
                        d3 d3Var = (d3) a3Var13;
                        float f23 = b3Var7.f52512e - f13;
                        float f24 = f23 - 1.0f;
                        a3 a3Var14 = b3Var7.f52515i;
                        if (a3Var13 == a3Var14) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        a3 a3Var15 = b3Var7.f52511c;
                        d3 d3Var2 = (d3) a3Var15;
                        if (a3Var15 == a3Var14) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        a3 a3Var16 = b3Var7.d;
                        d3 d3Var3 = (d3) a3Var16;
                        float f25 = f23 + 1.0f;
                        if (a3Var16 == a3Var14) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        b3 b3Var8 = f3Var.f52730j;
                        float f26 = b3Var8.f52512e - f10;
                        i3Var.f52908a = d3Var;
                        i3Var.f52909b = d3Var2;
                        i3Var.f52910c = d3Var3;
                        i3Var.d = f24;
                        i3Var.f52911e = f23;
                        i3Var.f52912f = f25;
                        i3Var.h = z13;
                        i3Var.f52913n = z14;
                        i3Var.f52914r = z15;
                        i3Var.f52915s = (c3) b3Var8.f52510b;
                        i3Var.v = (c3) b3Var8.f52511c;
                        i3Var.f52916w = (c3) b3Var8.d;
                        i3Var.f52917x = f26 - 1.0f;
                        i3Var.f52918y = f26;
                        i3Var.E = f26 + 1.0f;
                        i3Var.invalidate();
                        f3Var.f52741u = false;
                        f3Var.b();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                f3 f3Var2 = this.f53690b;
                f3Var2.f52735o = false;
                f3Var2.f52723a.f53240c.c();
                a1 a1Var = f3Var2.f52738r;
                if (a1Var != null) {
                    a1Var.run();
                    return;
                }
                return;
            default:
                a1 a1Var2 = this.f53690b.f52739s;
                if (a1Var2 != null) {
                    a1Var2.run();
                    return;
                }
                return;
        }
    }
}
