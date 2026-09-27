package yh;

import org.telegram.messenger.AndroidUtilities;
public final class d3 implements Runnable {
    public final int f47339a;
    public final j3 f47340b;

    public d3(j3 j3Var, int i10) {
        this.f47339a = i10;
        this.f47340b = j3Var;
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
        switch (this.f47339a) {
            case 0:
                this.f47340b.b();
                return;
            case 1:
                j3 j3Var = this.f47340b;
                u3 u3Var = j3Var.f47600a;
                if (!j3Var.f47617u) {
                    j3Var.v = false;
                    if (j3Var.f47611o) {
                        j3Var.f47617u = true;
                        long currentTimeMillis = System.currentTimeMillis();
                        float min = Math.min(((float) (currentTimeMillis - j3Var.f47609m)) / 1000.0f, 0.25f);
                        float f7 = j3Var.f47610n + min;
                        j3Var.f47610n = f7;
                        f3 f3Var = j3Var.f47606j;
                        if (f7 > AndroidUtilities.lerp(0.1f, 1.0f, j3Var.f47616t)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        float f10 = f3Var.f(min, z10);
                        f3 f3Var2 = j3Var.f47607k;
                        if (j3Var.f47610n > AndroidUtilities.lerp(0.1f, 1.0f, j3Var.f47616t)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        float f11 = f3Var2.f(min, z11);
                        float f12 = j3Var.f47605i.f(min, j3Var.f47606j.b(0.5f));
                        f3 f3Var3 = j3Var.h;
                        if (j3Var.f47606j.b(0.5f) && j3Var.f47605i.b(0.5f)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        float f13 = f3Var3.f(min, z12);
                        j3Var.f47609m = currentTimeMillis;
                        if (j3Var.f47606j.c() && j3Var.f47605i.c() && j3Var.h.c() && !j3Var.f47612p) {
                            j3Var.f47612p = true;
                            AndroidUtilities.runOnUIThread(new d3(j3Var, 2));
                        }
                        if (j3Var.f47606j.c() && j3Var.f47605i.c() && j3Var.h.b(0.25f) && !j3Var.f47613q) {
                            j3Var.f47613q = true;
                            AndroidUtilities.runOnUIThread(new d3(j3Var, 3));
                        }
                        o3 o3Var = j3Var.f47601b;
                        if (o3Var != null) {
                            f3 f3Var4 = j3Var.h;
                            e3 e3Var = f3Var4.f47415b;
                            float f14 = f3Var4.e - f13;
                            float f15 = f14 - 1.0f;
                            e3 e3Var2 = f3Var4.f47419i;
                            if (e3Var == e3Var2) {
                                z22 = true;
                            } else {
                                z22 = false;
                            }
                            e3 e3Var3 = f3Var4.f47416c;
                            if (e3Var3 == e3Var2) {
                                z23 = true;
                            } else {
                                z23 = false;
                            }
                            e3 e3Var4 = f3Var4.d;
                            float f16 = f14 + 1.0f;
                            if (e3Var4 == e3Var2) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            o3Var.a(e3Var, f15, z22, e3Var3, f14, z23, e3Var4, f16, z24);
                        }
                        o3 o3Var2 = j3Var.f47602c;
                        if (o3Var2 != null) {
                            f3 f3Var5 = j3Var.f47605i;
                            e3 e3Var5 = f3Var5.f47415b;
                            float f17 = f3Var5.e - f12;
                            float f18 = f17 - 1.0f;
                            e3 e3Var6 = f3Var5.f47419i;
                            if (e3Var5 == e3Var6) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            e3 e3Var7 = f3Var5.f47416c;
                            if (e3Var7 == e3Var6) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                            e3 e3Var8 = f3Var5.d;
                            float f19 = f17 + 1.0f;
                            if (e3Var8 == e3Var6) {
                                z21 = true;
                            } else {
                                z21 = false;
                            }
                            o3Var2.a(e3Var5, f18, z19, e3Var7, f17, z20, e3Var8, f19, z21);
                        }
                        o3 o3Var3 = j3Var.d;
                        if (o3Var3 != null) {
                            f3 f3Var6 = j3Var.f47607k;
                            e3 e3Var9 = f3Var6.f47415b;
                            float f20 = f3Var6.e - f11;
                            float f21 = f20 - 1.0f;
                            e3 e3Var10 = f3Var6.f47419i;
                            if (e3Var9 == e3Var10) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            e3 e3Var11 = f3Var6.f47416c;
                            if (e3Var11 == e3Var10) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            e3 e3Var12 = f3Var6.d;
                            float f22 = f20 + 1.0f;
                            if (e3Var12 == e3Var10) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            o3Var3.a(e3Var9, f21, z16, e3Var11, f20, z17, e3Var12, f22, z18);
                        }
                        u3Var.g(0, ((i3) j3Var.f47605i.f47416c).f47572c, true);
                        m3 m3Var = u3Var.f48133c;
                        f3 f3Var7 = j3Var.h;
                        e3 e3Var13 = f3Var7.f47415b;
                        h3 h3Var = (h3) e3Var13;
                        float f23 = f3Var7.e - f13;
                        float f24 = f23 - 1.0f;
                        e3 e3Var14 = f3Var7.f47419i;
                        if (e3Var13 == e3Var14) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        e3 e3Var15 = f3Var7.f47416c;
                        h3 h3Var2 = (h3) e3Var15;
                        if (e3Var15 == e3Var14) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        e3 e3Var16 = f3Var7.d;
                        h3 h3Var3 = (h3) e3Var16;
                        float f25 = f23 + 1.0f;
                        if (e3Var16 == e3Var14) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        f3 f3Var8 = j3Var.f47606j;
                        float f26 = f3Var8.e - f10;
                        m3Var.f47776a = h3Var;
                        m3Var.f47777b = h3Var2;
                        m3Var.f47778c = h3Var3;
                        m3Var.d = f24;
                        m3Var.e = f23;
                        m3Var.f47779f = f25;
                        m3Var.h = z13;
                        m3Var.f47780n = z14;
                        m3Var.f47781r = z15;
                        m3Var.f47782s = (g3) f3Var8.f47415b;
                        m3Var.v = (g3) f3Var8.f47416c;
                        m3Var.f47783w = (g3) f3Var8.d;
                        m3Var.f47784x = f26 - 1.0f;
                        m3Var.f47785y = f26;
                        m3Var.E = f26 + 1.0f;
                        m3Var.invalidate();
                        j3Var.f47617u = false;
                        j3Var.b();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                j3 j3Var2 = this.f47340b;
                j3Var2.f47611o = false;
                j3Var2.f47600a.f48133c.c();
                b1 b1Var = j3Var2.f47614r;
                if (b1Var != null) {
                    b1Var.run();
                    return;
                }
                return;
            default:
                b1 b1Var2 = this.f47340b.f47615s;
                if (b1Var2 != null) {
                    b1Var2.run();
                    return;
                }
                return;
        }
    }
}
