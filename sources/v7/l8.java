package v7;
public abstract class l8 {
    public static int a(a4.g gVar, int i10, int i11, int i12) {
        boolean z10;
        if (Math.max(Math.max(i10, i11), i12) <= 31) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        int i13 = (1 << i10) - 1;
        int i14 = (1 << i11) - 1;
        m7.a(m7.a(i13, i14), 1 << i12);
        if (gVar.b() >= i10) {
            int g10 = gVar.g(i10);
            if (g10 == i13) {
                if (gVar.b() >= i11) {
                    int g11 = gVar.g(i11);
                    g10 += g11;
                    if (g11 == i14) {
                        if (gVar.b() < i12) {
                            return -1;
                        }
                        return gVar.g(i12) + g10;
                    }
                } else {
                    return -1;
                }
            }
            return g10;
        }
        return -1;
    }

    public static void b(a4.g gVar) {
        gVar.o(3);
        gVar.o(8);
        boolean f7 = gVar.f();
        boolean f10 = gVar.f();
        if (f7) {
            gVar.o(5);
        }
        if (f10) {
            gVar.o(6);
        }
    }

    public static void c(a4.g gVar) {
        int i10;
        int g10;
        int g11 = gVar.g(2);
        int i11 = 6;
        if (g11 == 0) {
            gVar.o(6);
            return;
        }
        int i12 = 5;
        int a2 = a(gVar, 5, 8, 16) + 1;
        if (g11 == 1) {
            gVar.o(a2 * 7);
        } else if (g11 == 2) {
            boolean f7 = gVar.f();
            if (f7) {
                i10 = 1;
            } else {
                i10 = 5;
            }
            if (f7) {
                i12 = 7;
            }
            if (f7) {
                i11 = 8;
            }
            int i13 = 0;
            while (i13 < a2) {
                if (gVar.f()) {
                    gVar.o(7);
                    g10 = 0;
                } else {
                    if (gVar.g(2) == 3 && gVar.g(i12) * i10 != 0) {
                        gVar.n();
                    }
                    g10 = gVar.g(i11) * i10;
                    if (g10 != 0 && g10 != 180) {
                        gVar.n();
                    }
                    gVar.n();
                }
                if (g10 != 0 && g10 != 180 && gVar.f()) {
                    i13++;
                }
                i13++;
            }
        }
    }
}
