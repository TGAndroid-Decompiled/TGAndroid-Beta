package yh;

import org.telegram.messenger.AndroidUtilities;
public final class e3 implements Runnable {
    public final int f47369a;
    public final k3 f47370b;

    public e3(k3 k3Var, int i10) {
        this.f47369a = i10;
        this.f47370b = k3Var;
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
        switch (this.f47369a) {
            case 0:
                this.f47370b.b();
                return;
            case 1:
                k3 k3Var = this.f47370b;
                v3 v3Var = k3Var.f47625a;
                if (!k3Var.f47642u) {
                    k3Var.v = false;
                    if (k3Var.f47636o) {
                        k3Var.f47642u = true;
                        long currentTimeMillis = System.currentTimeMillis();
                        float min = Math.min(((float) (currentTimeMillis - k3Var.f47634m)) / 1000.0f, 0.25f);
                        float f7 = k3Var.f47635n + min;
                        k3Var.f47635n = f7;
                        g3 g3Var = k3Var.f47631j;
                        if (f7 > AndroidUtilities.lerp(0.1f, 1.0f, k3Var.f47641t)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        float f10 = g3Var.f(min, z10);
                        g3 g3Var2 = k3Var.f47632k;
                        if (k3Var.f47635n > AndroidUtilities.lerp(0.1f, 1.0f, k3Var.f47641t)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        float f11 = g3Var2.f(min, z11);
                        float f12 = k3Var.f47630i.f(min, k3Var.f47631j.b(0.5f));
                        g3 g3Var3 = k3Var.h;
                        if (k3Var.f47631j.b(0.5f) && k3Var.f47630i.b(0.5f)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        float f13 = g3Var3.f(min, z12);
                        k3Var.f47634m = currentTimeMillis;
                        if (k3Var.f47631j.c() && k3Var.f47630i.c() && k3Var.h.c() && !k3Var.f47637p) {
                            k3Var.f47637p = true;
                            AndroidUtilities.runOnUIThread(new e3(k3Var, 2));
                        }
                        if (k3Var.f47631j.c() && k3Var.f47630i.c() && k3Var.h.b(0.25f) && !k3Var.f47638q) {
                            k3Var.f47638q = true;
                            AndroidUtilities.runOnUIThread(new e3(k3Var, 3));
                        }
                        p3 p3Var = k3Var.f47626b;
                        if (p3Var != null) {
                            g3 g3Var4 = k3Var.h;
                            f3 f3Var = g3Var4.f47470b;
                            float f14 = g3Var4.e - f13;
                            float f15 = f14 - 1.0f;
                            f3 f3Var2 = g3Var4.f47474i;
                            if (f3Var == f3Var2) {
                                z22 = true;
                            } else {
                                z22 = false;
                            }
                            f3 f3Var3 = g3Var4.f47471c;
                            if (f3Var3 == f3Var2) {
                                z23 = true;
                            } else {
                                z23 = false;
                            }
                            f3 f3Var4 = g3Var4.d;
                            float f16 = f14 + 1.0f;
                            if (f3Var4 == f3Var2) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            p3Var.a(f3Var, f15, z22, f3Var3, f14, z23, f3Var4, f16, z24);
                        }
                        p3 p3Var2 = k3Var.f47627c;
                        if (p3Var2 != null) {
                            g3 g3Var5 = k3Var.f47630i;
                            f3 f3Var5 = g3Var5.f47470b;
                            float f17 = g3Var5.e - f12;
                            float f18 = f17 - 1.0f;
                            f3 f3Var6 = g3Var5.f47474i;
                            if (f3Var5 == f3Var6) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            f3 f3Var7 = g3Var5.f47471c;
                            if (f3Var7 == f3Var6) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                            f3 f3Var8 = g3Var5.d;
                            float f19 = f17 + 1.0f;
                            if (f3Var8 == f3Var6) {
                                z21 = true;
                            } else {
                                z21 = false;
                            }
                            p3Var2.a(f3Var5, f18, z19, f3Var7, f17, z20, f3Var8, f19, z21);
                        }
                        p3 p3Var3 = k3Var.d;
                        if (p3Var3 != null) {
                            g3 g3Var6 = k3Var.f47632k;
                            f3 f3Var9 = g3Var6.f47470b;
                            float f20 = g3Var6.e - f11;
                            float f21 = f20 - 1.0f;
                            f3 f3Var10 = g3Var6.f47474i;
                            if (f3Var9 == f3Var10) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            f3 f3Var11 = g3Var6.f47471c;
                            if (f3Var11 == f3Var10) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            f3 f3Var12 = g3Var6.d;
                            float f22 = f20 + 1.0f;
                            if (f3Var12 == f3Var10) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            p3Var3.a(f3Var9, f21, z16, f3Var11, f20, z17, f3Var12, f22, z18);
                        }
                        v3Var.g(0, ((j3) k3Var.f47630i.f47471c).f47598c, true);
                        n3 n3Var = v3Var.f48155c;
                        g3 g3Var7 = k3Var.h;
                        f3 f3Var13 = g3Var7.f47470b;
                        i3 i3Var = (i3) f3Var13;
                        float f23 = g3Var7.e - f13;
                        float f24 = f23 - 1.0f;
                        f3 f3Var14 = g3Var7.f47474i;
                        if (f3Var13 == f3Var14) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        f3 f3Var15 = g3Var7.f47471c;
                        i3 i3Var2 = (i3) f3Var15;
                        if (f3Var15 == f3Var14) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        f3 f3Var16 = g3Var7.d;
                        i3 i3Var3 = (i3) f3Var16;
                        float f25 = f23 + 1.0f;
                        if (f3Var16 == f3Var14) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        g3 g3Var8 = k3Var.f47631j;
                        float f26 = g3Var8.e - f10;
                        n3Var.f47796a = i3Var;
                        n3Var.f47797b = i3Var2;
                        n3Var.f47798c = i3Var3;
                        n3Var.d = f24;
                        n3Var.e = f23;
                        n3Var.f47799f = f25;
                        n3Var.h = z13;
                        n3Var.f47800n = z14;
                        n3Var.f47801r = z15;
                        n3Var.f47802s = (h3) g3Var8.f47470b;
                        n3Var.v = (h3) g3Var8.f47471c;
                        n3Var.f47803w = (h3) g3Var8.d;
                        n3Var.f47804x = f26 - 1.0f;
                        n3Var.f47805y = f26;
                        n3Var.E = f26 + 1.0f;
                        n3Var.invalidate();
                        k3Var.f47642u = false;
                        k3Var.b();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                k3 k3Var2 = this.f47370b;
                k3Var2.f47636o = false;
                k3Var2.f47625a.f48155c.c();
                b1 b1Var = k3Var2.f47639r;
                if (b1Var != null) {
                    b1Var.run();
                    return;
                }
                return;
            default:
                b1 b1Var2 = this.f47370b.f47640s;
                if (b1Var2 != null) {
                    b1Var2.run();
                    return;
                }
                return;
        }
    }
}
