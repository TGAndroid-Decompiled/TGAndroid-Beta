package yh;

import org.telegram.messenger.AndroidUtilities;
public final class f3 implements Runnable {
    public final int f47090a;
    public final l3 f47091b;

    public f3(l3 l3Var, int i10) {
        this.f47090a = i10;
        this.f47091b = l3Var;
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
        switch (this.f47090a) {
            case 0:
                this.f47091b.b();
                return;
            case 1:
                l3 l3Var = this.f47091b;
                w3 w3Var = l3Var.f47341a;
                if (!l3Var.f47358u) {
                    l3Var.v = false;
                    if (l3Var.f47352o) {
                        l3Var.f47358u = true;
                        long currentTimeMillis = System.currentTimeMillis();
                        float min = Math.min(((float) (currentTimeMillis - l3Var.f47350m)) / 1000.0f, 0.25f);
                        float f7 = l3Var.f47351n + min;
                        l3Var.f47351n = f7;
                        h3 h3Var = l3Var.f47347j;
                        if (f7 > AndroidUtilities.lerp(0.1f, 1.0f, l3Var.f47357t)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        float f10 = h3Var.f(min, z10);
                        h3 h3Var2 = l3Var.f47348k;
                        if (l3Var.f47351n > AndroidUtilities.lerp(0.1f, 1.0f, l3Var.f47357t)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        float f11 = h3Var2.f(min, z11);
                        float f12 = l3Var.f47346i.f(min, l3Var.f47347j.b(0.5f));
                        h3 h3Var3 = l3Var.h;
                        if (l3Var.f47347j.b(0.5f) && l3Var.f47346i.b(0.5f)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        float f13 = h3Var3.f(min, z12);
                        l3Var.f47350m = currentTimeMillis;
                        if (l3Var.f47347j.c() && l3Var.f47346i.c() && l3Var.h.c() && !l3Var.f47353p) {
                            l3Var.f47353p = true;
                            AndroidUtilities.runOnUIThread(new f3(l3Var, 2));
                        }
                        if (l3Var.f47347j.c() && l3Var.f47346i.c() && l3Var.h.b(0.25f) && !l3Var.f47354q) {
                            l3Var.f47354q = true;
                            AndroidUtilities.runOnUIThread(new f3(l3Var, 3));
                        }
                        q3 q3Var = l3Var.f47342b;
                        if (q3Var != null) {
                            h3 h3Var4 = l3Var.h;
                            g3 g3Var = h3Var4.f47182b;
                            float f14 = h3Var4.e - f13;
                            float f15 = f14 - 1.0f;
                            g3 g3Var2 = h3Var4.f47186i;
                            if (g3Var == g3Var2) {
                                z22 = true;
                            } else {
                                z22 = false;
                            }
                            g3 g3Var3 = h3Var4.f47183c;
                            if (g3Var3 == g3Var2) {
                                z23 = true;
                            } else {
                                z23 = false;
                            }
                            g3 g3Var4 = h3Var4.d;
                            float f16 = f14 + 1.0f;
                            if (g3Var4 == g3Var2) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            q3Var.a(g3Var, f15, z22, g3Var3, f14, z23, g3Var4, f16, z24);
                        }
                        q3 q3Var2 = l3Var.f47343c;
                        if (q3Var2 != null) {
                            h3 h3Var5 = l3Var.f47346i;
                            g3 g3Var5 = h3Var5.f47182b;
                            float f17 = h3Var5.e - f12;
                            float f18 = f17 - 1.0f;
                            g3 g3Var6 = h3Var5.f47186i;
                            if (g3Var5 == g3Var6) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            g3 g3Var7 = h3Var5.f47183c;
                            if (g3Var7 == g3Var6) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                            g3 g3Var8 = h3Var5.d;
                            float f19 = f17 + 1.0f;
                            if (g3Var8 == g3Var6) {
                                z21 = true;
                            } else {
                                z21 = false;
                            }
                            q3Var2.a(g3Var5, f18, z19, g3Var7, f17, z20, g3Var8, f19, z21);
                        }
                        q3 q3Var3 = l3Var.d;
                        if (q3Var3 != null) {
                            h3 h3Var6 = l3Var.f47348k;
                            g3 g3Var9 = h3Var6.f47182b;
                            float f20 = h3Var6.e - f11;
                            float f21 = f20 - 1.0f;
                            g3 g3Var10 = h3Var6.f47186i;
                            if (g3Var9 == g3Var10) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            g3 g3Var11 = h3Var6.f47183c;
                            if (g3Var11 == g3Var10) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            g3 g3Var12 = h3Var6.d;
                            float f22 = f20 + 1.0f;
                            if (g3Var12 == g3Var10) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            q3Var3.a(g3Var9, f21, z16, g3Var11, f20, z17, g3Var12, f22, z18);
                        }
                        w3Var.g(0, ((k3) l3Var.f47346i.f47183c).f47312c, true);
                        o3 o3Var = w3Var.f47874c;
                        h3 h3Var7 = l3Var.h;
                        g3 g3Var13 = h3Var7.f47182b;
                        j3 j3Var = (j3) g3Var13;
                        float f23 = h3Var7.e - f13;
                        float f24 = f23 - 1.0f;
                        g3 g3Var14 = h3Var7.f47186i;
                        if (g3Var13 == g3Var14) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        g3 g3Var15 = h3Var7.f47183c;
                        j3 j3Var2 = (j3) g3Var15;
                        if (g3Var15 == g3Var14) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        g3 g3Var16 = h3Var7.d;
                        j3 j3Var3 = (j3) g3Var16;
                        float f25 = f23 + 1.0f;
                        if (g3Var16 == g3Var14) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        h3 h3Var8 = l3Var.f47347j;
                        float f26 = h3Var8.e - f10;
                        o3Var.f47521a = j3Var;
                        o3Var.f47522b = j3Var2;
                        o3Var.f47523c = j3Var3;
                        o3Var.d = f24;
                        o3Var.e = f23;
                        o3Var.f47524f = f25;
                        o3Var.h = z13;
                        o3Var.f47525n = z14;
                        o3Var.f47526r = z15;
                        o3Var.f47527s = (i3) h3Var8.f47182b;
                        o3Var.v = (i3) h3Var8.f47183c;
                        o3Var.f47528w = (i3) h3Var8.d;
                        o3Var.f47529x = f26 - 1.0f;
                        o3Var.f47530y = f26;
                        o3Var.E = f26 + 1.0f;
                        o3Var.invalidate();
                        l3Var.f47358u = false;
                        l3Var.b();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                l3 l3Var2 = this.f47091b;
                l3Var2.f47352o = false;
                l3Var2.f47341a.f47874c.c();
                b1 b1Var = l3Var2.f47355r;
                if (b1Var != null) {
                    b1Var.run();
                    return;
                }
                return;
            default:
                b1 b1Var2 = this.f47091b.f47356s;
                if (b1Var2 != null) {
                    b1Var2.run();
                    return;
                }
                return;
        }
    }
}
