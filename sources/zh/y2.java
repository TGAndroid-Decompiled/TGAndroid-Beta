package zh;

import org.telegram.messenger.AndroidUtilities;
public final class y2 implements Runnable {
    public final int f51320a;
    public final e3 f51321b;

    public y2(e3 e3Var, int i10) {
        this.f51320a = i10;
        this.f51321b = e3Var;
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
        switch (this.f51320a) {
            case 0:
                this.f51321b.b();
                return;
            case 1:
                e3 e3Var = this.f51321b;
                o3 o3Var = e3Var.f50420a;
                if (!e3Var.f50437u) {
                    e3Var.v = false;
                    if (e3Var.f50431o) {
                        e3Var.f50437u = true;
                        long currentTimeMillis = System.currentTimeMillis();
                        float min = Math.min(((float) (currentTimeMillis - e3Var.f50429m)) / 1000.0f, 0.25f);
                        float f7 = e3Var.f50430n + min;
                        e3Var.f50430n = f7;
                        a3 a3Var = e3Var.f50426j;
                        if (f7 > AndroidUtilities.lerp(0.1f, 1.0f, e3Var.f50436t)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        float f10 = a3Var.f(min, z10);
                        a3 a3Var2 = e3Var.f50427k;
                        if (e3Var.f50430n > AndroidUtilities.lerp(0.1f, 1.0f, e3Var.f50436t)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        float f11 = a3Var2.f(min, z11);
                        float f12 = e3Var.f50425i.f(min, e3Var.f50426j.b(0.5f));
                        a3 a3Var3 = e3Var.h;
                        if (e3Var.f50426j.b(0.5f) && e3Var.f50425i.b(0.5f)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        float f13 = a3Var3.f(min, z12);
                        e3Var.f50429m = currentTimeMillis;
                        if (e3Var.f50426j.c() && e3Var.f50425i.c() && e3Var.h.c() && !e3Var.f50432p) {
                            e3Var.f50432p = true;
                            AndroidUtilities.runOnUIThread(new y2(e3Var, 2));
                        }
                        if (e3Var.f50426j.c() && e3Var.f50425i.c() && e3Var.h.b(0.25f) && !e3Var.f50433q) {
                            e3Var.f50433q = true;
                            AndroidUtilities.runOnUIThread(new y2(e3Var, 3));
                        }
                        j3 j3Var = e3Var.f50421b;
                        if (j3Var != null) {
                            a3 a3Var4 = e3Var.h;
                            z2 z2Var = a3Var4.f50258b;
                            float f14 = a3Var4.e - f13;
                            float f15 = f14 - 1.0f;
                            z2 z2Var2 = a3Var4.f50262i;
                            if (z2Var == z2Var2) {
                                z22 = true;
                            } else {
                                z22 = false;
                            }
                            z2 z2Var3 = a3Var4.f50259c;
                            if (z2Var3 == z2Var2) {
                                z23 = true;
                            } else {
                                z23 = false;
                            }
                            z2 z2Var4 = a3Var4.d;
                            float f16 = f14 + 1.0f;
                            if (z2Var4 == z2Var2) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            j3Var.a(z2Var, f15, z22, z2Var3, f14, z23, z2Var4, f16, z24);
                        }
                        j3 j3Var2 = e3Var.f50422c;
                        if (j3Var2 != null) {
                            a3 a3Var5 = e3Var.f50425i;
                            z2 z2Var5 = a3Var5.f50258b;
                            float f17 = a3Var5.e - f12;
                            float f18 = f17 - 1.0f;
                            z2 z2Var6 = a3Var5.f50262i;
                            if (z2Var5 == z2Var6) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            z2 z2Var7 = a3Var5.f50259c;
                            if (z2Var7 == z2Var6) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                            z2 z2Var8 = a3Var5.d;
                            float f19 = f17 + 1.0f;
                            if (z2Var8 == z2Var6) {
                                z21 = true;
                            } else {
                                z21 = false;
                            }
                            j3Var2.a(z2Var5, f18, z19, z2Var7, f17, z20, z2Var8, f19, z21);
                        }
                        j3 j3Var3 = e3Var.d;
                        if (j3Var3 != null) {
                            a3 a3Var6 = e3Var.f50427k;
                            z2 z2Var9 = a3Var6.f50258b;
                            float f20 = a3Var6.e - f11;
                            float f21 = f20 - 1.0f;
                            z2 z2Var10 = a3Var6.f50262i;
                            if (z2Var9 == z2Var10) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            z2 z2Var11 = a3Var6.f50259c;
                            if (z2Var11 == z2Var10) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            z2 z2Var12 = a3Var6.d;
                            float f22 = f20 + 1.0f;
                            if (z2Var12 == z2Var10) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            j3Var3.a(z2Var9, f21, z16, z2Var11, f20, z17, z2Var12, f22, z18);
                        }
                        o3Var.g(0, ((d3) e3Var.f50425i.f50259c).f50376c, true);
                        h3 h3Var = o3Var.f50910c;
                        a3 a3Var7 = e3Var.h;
                        z2 z2Var13 = a3Var7.f50258b;
                        c3 c3Var = (c3) z2Var13;
                        float f23 = a3Var7.e - f13;
                        float f24 = f23 - 1.0f;
                        z2 z2Var14 = a3Var7.f50262i;
                        if (z2Var13 == z2Var14) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z2 z2Var15 = a3Var7.f50259c;
                        c3 c3Var2 = (c3) z2Var15;
                        if (z2Var15 == z2Var14) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z2 z2Var16 = a3Var7.d;
                        c3 c3Var3 = (c3) z2Var16;
                        float f25 = f23 + 1.0f;
                        if (z2Var16 == z2Var14) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        a3 a3Var8 = e3Var.f50426j;
                        float f26 = a3Var8.e - f10;
                        h3Var.f50612a = c3Var;
                        h3Var.f50613b = c3Var2;
                        h3Var.f50614c = c3Var3;
                        h3Var.d = f24;
                        h3Var.e = f23;
                        h3Var.f50615f = f25;
                        h3Var.h = z13;
                        h3Var.f50616n = z14;
                        h3Var.f50617r = z15;
                        h3Var.f50618s = (b3) a3Var8.f50258b;
                        h3Var.v = (b3) a3Var8.f50259c;
                        h3Var.f50619w = (b3) a3Var8.d;
                        h3Var.f50620x = f26 - 1.0f;
                        h3Var.f50621y = f26;
                        h3Var.E = f26 + 1.0f;
                        h3Var.invalidate();
                        e3Var.f50437u = false;
                        e3Var.b();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                e3 e3Var2 = this.f51321b;
                e3Var2.f50431o = false;
                e3Var2.f50420a.f50910c.c();
                a1 a1Var = e3Var2.f50434r;
                if (a1Var != null) {
                    a1Var.run();
                    return;
                }
                return;
            default:
                a1 a1Var2 = this.f51321b.f50435s;
                if (a1Var2 != null) {
                    a1Var2.run();
                    return;
                }
                return;
        }
    }
}
