package rh;
public final class h3 implements Runnable {
    public final int f46998a;
    public final n3 f46999b;

    public h3(n3 n3Var, int i10) {
        this.f46998a = i10;
        this.f46999b = n3Var;
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
        switch (this.f46998a) {
            case 0:
                this.f46999b.b();
                return;
            case 1:
                n3 n3Var = this.f46999b;
                y3 y3Var = n3Var.f47233a;
                if (!n3Var.f47250u) {
                    n3Var.v = false;
                    if (n3Var.f47244o) {
                        n3Var.f47250u = true;
                        long currentTimeMillis = System.currentTimeMillis();
                        float min = Math.min(((float) (currentTimeMillis - n3Var.f47242m)) / 1000.0f, 0.25f);
                        float f7 = n3Var.f47243n + min;
                        n3Var.f47243n = f7;
                        j3 j3Var = n3Var.f47239j;
                        if (f7 > org.telegram.messenger.i0.T1(0.1f, 1.0f, n3Var.f47249t)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        float f10 = j3Var.f(z10, min);
                        j3 j3Var2 = n3Var.f47240k;
                        if (n3Var.f47243n > org.telegram.messenger.i0.T1(0.1f, 1.0f, n3Var.f47249t)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        float f11 = j3Var2.f(z11, min);
                        float f12 = n3Var.f47238i.f(n3Var.f47239j.b(0.5f), min);
                        j3 j3Var3 = n3Var.h;
                        if (n3Var.f47239j.b(0.5f) && n3Var.f47238i.b(0.5f)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        float f13 = j3Var3.f(z12, min);
                        n3Var.f47242m = currentTimeMillis;
                        if (n3Var.f47239j.c() && n3Var.f47238i.c() && n3Var.h.c() && !n3Var.f47245p) {
                            n3Var.f47245p = true;
                            org.telegram.messenger.i0.g3(new h3(n3Var, 2));
                        }
                        if (n3Var.f47239j.c() && n3Var.f47238i.c() && n3Var.h.b(0.25f) && !n3Var.f47246q) {
                            n3Var.f47246q = true;
                            org.telegram.messenger.i0.g3(new h3(n3Var, 3));
                        }
                        s3 s3Var = n3Var.f47234b;
                        if (s3Var != null) {
                            j3 j3Var4 = n3Var.h;
                            i3 i3Var = j3Var4.f47115b;
                            float f14 = j3Var4.e - f13;
                            float f15 = f14 - 1.0f;
                            i3 i3Var2 = j3Var4.f47119i;
                            if (i3Var == i3Var2) {
                                z22 = true;
                            } else {
                                z22 = false;
                            }
                            i3 i3Var3 = j3Var4.f47116c;
                            if (i3Var3 == i3Var2) {
                                z23 = true;
                            } else {
                                z23 = false;
                            }
                            i3 i3Var4 = j3Var4.d;
                            float f16 = f14 + 1.0f;
                            if (i3Var4 == i3Var2) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            s3Var.a(i3Var, f15, z22, i3Var3, f14, z23, i3Var4, f16, z24);
                        }
                        s3 s3Var2 = n3Var.f47235c;
                        if (s3Var2 != null) {
                            j3 j3Var5 = n3Var.f47238i;
                            i3 i3Var5 = j3Var5.f47115b;
                            float f17 = j3Var5.e - f12;
                            float f18 = f17 - 1.0f;
                            i3 i3Var6 = j3Var5.f47119i;
                            if (i3Var5 == i3Var6) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            i3 i3Var7 = j3Var5.f47116c;
                            if (i3Var7 == i3Var6) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                            i3 i3Var8 = j3Var5.d;
                            float f19 = f17 + 1.0f;
                            if (i3Var8 == i3Var6) {
                                z21 = true;
                            } else {
                                z21 = false;
                            }
                            s3Var2.a(i3Var5, f18, z19, i3Var7, f17, z20, i3Var8, f19, z21);
                        }
                        s3 s3Var3 = n3Var.d;
                        if (s3Var3 != null) {
                            j3 j3Var6 = n3Var.f47240k;
                            i3 i3Var9 = j3Var6.f47115b;
                            float f20 = j3Var6.e - f11;
                            float f21 = f20 - 1.0f;
                            i3 i3Var10 = j3Var6.f47119i;
                            if (i3Var9 == i3Var10) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            i3 i3Var11 = j3Var6.f47116c;
                            if (i3Var11 == i3Var10) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            i3 i3Var12 = j3Var6.d;
                            float f22 = f20 + 1.0f;
                            if (i3Var12 == i3Var10) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            s3Var3.a(i3Var9, f21, z16, i3Var11, f20, z17, i3Var12, f22, z18);
                        }
                        y3Var.g(0, ((m3) n3Var.f47238i.f47116c).f47199c, true);
                        q3 q3Var = y3Var.f47720c;
                        j3 j3Var7 = n3Var.h;
                        i3 i3Var13 = j3Var7.f47115b;
                        l3 l3Var = (l3) i3Var13;
                        float f23 = j3Var7.e - f13;
                        float f24 = f23 - 1.0f;
                        i3 i3Var14 = j3Var7.f47119i;
                        if (i3Var13 == i3Var14) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        i3 i3Var15 = j3Var7.f47116c;
                        l3 l3Var2 = (l3) i3Var15;
                        if (i3Var15 == i3Var14) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        i3 i3Var16 = j3Var7.d;
                        l3 l3Var3 = (l3) i3Var16;
                        float f25 = f23 + 1.0f;
                        if (i3Var16 == i3Var14) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        j3 j3Var8 = n3Var.f47239j;
                        float f26 = j3Var8.e - f10;
                        q3Var.f47350a = l3Var;
                        q3Var.f47351b = l3Var2;
                        q3Var.f47352c = l3Var3;
                        q3Var.d = f24;
                        q3Var.e = f23;
                        q3Var.f47353f = f25;
                        q3Var.h = z13;
                        q3Var.f47354n = z14;
                        q3Var.f47355r = z15;
                        q3Var.f47356s = (k3) j3Var8.f47115b;
                        q3Var.f47357w = (k3) j3Var8.f47116c;
                        q3Var.f47358x = (k3) j3Var8.d;
                        q3Var.f47359y = f26 - 1.0f;
                        q3Var.D = f26;
                        q3Var.E = f26 + 1.0f;
                        q3Var.invalidate();
                        n3Var.f47250u = false;
                        n3Var.b();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                n3 n3Var2 = this.f46999b;
                n3Var2.f47244o = false;
                n3Var2.f47233a.f47720c.c();
                w0 w0Var = n3Var2.f47247r;
                if (w0Var != null) {
                    w0Var.run();
                    return;
                }
                return;
            default:
                w0 w0Var2 = this.f46999b.f47248s;
                if (w0Var2 != null) {
                    w0Var2.run();
                    return;
                }
                return;
        }
    }
}
