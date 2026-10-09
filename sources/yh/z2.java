package yh;

import org.telegram.messenger.AndroidUtilities;
public final class z2 implements Runnable {
    public final int f53458a;
    public final f3 f53459b;

    public z2(f3 f3Var, int i10) {
        this.f53458a = i10;
        this.f53459b = f3Var;
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
        switch (this.f53458a) {
            case 0:
                this.f53459b.b();
                return;
            case 1:
                f3 f3Var = this.f53459b;
                p3 p3Var = f3Var.f52497a;
                if (!f3Var.f52515u) {
                    f3Var.v = false;
                    if (f3Var.f52509o) {
                        f3Var.f52515u = true;
                        long currentTimeMillis = System.currentTimeMillis();
                        float min = Math.min(((float) (currentTimeMillis - f3Var.f52507m)) / 1000.0f, 0.25f);
                        float f7 = f3Var.f52508n + min;
                        f3Var.f52508n = f7;
                        b3 b3Var = f3Var.f52504j;
                        if (f7 > AndroidUtilities.lerp(0.1f, 1.0f, f3Var.f52514t)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        float f10 = b3Var.f(min, z10);
                        b3 b3Var2 = f3Var.f52505k;
                        if (f3Var.f52508n > AndroidUtilities.lerp(0.1f, 1.0f, f3Var.f52514t)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        float f11 = b3Var2.f(min, z11);
                        float f12 = f3Var.f52503i.f(min, f3Var.f52504j.b(0.5f));
                        b3 b3Var3 = f3Var.h;
                        if (f3Var.f52504j.b(0.5f) && f3Var.f52503i.b(0.5f)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        float f13 = b3Var3.f(min, z12);
                        f3Var.f52507m = currentTimeMillis;
                        if (f3Var.f52504j.c() && f3Var.f52503i.c() && f3Var.h.c() && !f3Var.f52510p) {
                            f3Var.f52510p = true;
                            AndroidUtilities.runOnUIThread(new z2(f3Var, 2));
                        }
                        if (f3Var.f52504j.c() && f3Var.f52503i.c() && f3Var.h.b(0.25f) && !f3Var.f52511q) {
                            f3Var.f52511q = true;
                            AndroidUtilities.runOnUIThread(new z2(f3Var, 3));
                        }
                        k3 k3Var = f3Var.f52498b;
                        if (k3Var != null) {
                            b3 b3Var4 = f3Var.h;
                            a3 a3Var = b3Var4.f52280b;
                            float f14 = b3Var4.f52282e - f13;
                            float f15 = f14 - 1.0f;
                            a3 a3Var2 = b3Var4.f52285i;
                            if (a3Var == a3Var2) {
                                z22 = true;
                            } else {
                                z22 = false;
                            }
                            a3 a3Var3 = b3Var4.f52281c;
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
                        k3 k3Var2 = f3Var.f52499c;
                        if (k3Var2 != null) {
                            b3 b3Var5 = f3Var.f52503i;
                            a3 a3Var5 = b3Var5.f52280b;
                            float f17 = b3Var5.f52282e - f12;
                            float f18 = f17 - 1.0f;
                            a3 a3Var6 = b3Var5.f52285i;
                            if (a3Var5 == a3Var6) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            a3 a3Var7 = b3Var5.f52281c;
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
                            b3 b3Var6 = f3Var.f52505k;
                            a3 a3Var9 = b3Var6.f52280b;
                            float f20 = b3Var6.f52282e - f11;
                            float f21 = f20 - 1.0f;
                            a3 a3Var10 = b3Var6.f52285i;
                            if (a3Var9 == a3Var10) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            a3 a3Var11 = b3Var6.f52281c;
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
                        p3Var.g(0, ((e3) f3Var.f52503i.f52281c).f52428c, true);
                        i3 i3Var = p3Var.f53002c;
                        b3 b3Var7 = f3Var.h;
                        a3 a3Var13 = b3Var7.f52280b;
                        d3 d3Var = (d3) a3Var13;
                        float f23 = b3Var7.f52282e - f13;
                        float f24 = f23 - 1.0f;
                        a3 a3Var14 = b3Var7.f52285i;
                        if (a3Var13 == a3Var14) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        a3 a3Var15 = b3Var7.f52281c;
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
                        b3 b3Var8 = f3Var.f52504j;
                        float f26 = b3Var8.f52282e - f10;
                        i3Var.f52669a = d3Var;
                        i3Var.f52670b = d3Var2;
                        i3Var.f52671c = d3Var3;
                        i3Var.d = f24;
                        i3Var.f52672e = f23;
                        i3Var.f52673f = f25;
                        i3Var.h = z13;
                        i3Var.f52674n = z14;
                        i3Var.f52675r = z15;
                        i3Var.f52676s = (c3) b3Var8.f52280b;
                        i3Var.v = (c3) b3Var8.f52281c;
                        i3Var.f52677w = (c3) b3Var8.d;
                        i3Var.f52678x = f26 - 1.0f;
                        i3Var.f52679y = f26;
                        i3Var.E = f26 + 1.0f;
                        i3Var.invalidate();
                        f3Var.f52515u = false;
                        f3Var.b();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                f3 f3Var2 = this.f53459b;
                f3Var2.f52509o = false;
                f3Var2.f52497a.f53002c.c();
                a1 a1Var = f3Var2.f52512r;
                if (a1Var != null) {
                    a1Var.run();
                    return;
                }
                return;
            default:
                a1 a1Var2 = this.f53459b.f52513s;
                if (a1Var2 != null) {
                    a1Var2.run();
                    return;
                }
                return;
        }
    }
}
