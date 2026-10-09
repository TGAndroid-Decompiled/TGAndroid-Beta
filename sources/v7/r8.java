package v7;
public abstract class r8 {
    public static int a(a4.g gVar, int i10, int i11, int i12) {
        boolean z10;
        if (Math.max(Math.max(i10, i11), i12) <= 31) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        int i13 = (1 << i10) - 1;
        int i14 = (1 << i11) - 1;
        m7.a(m7.a(i13, i14), 1 << i12);
        if (gVar.b() >= i10) {
            int i15 = gVar.i(i10);
            if (i15 == i13) {
                if (gVar.b() >= i11) {
                    int i16 = gVar.i(i11);
                    i15 += i16;
                    if (i16 == i14) {
                        if (gVar.b() < i12) {
                            return -1;
                        }
                        return gVar.i(i12) + i15;
                    }
                } else {
                    return -1;
                }
            }
            return i15;
        }
        return -1;
    }

    public static void b(a4.g gVar) {
        gVar.t(3);
        gVar.t(8);
        boolean h = gVar.h();
        boolean h10 = gVar.h();
        if (h) {
            gVar.t(5);
        }
        if (h10) {
            gVar.t(6);
        }
    }

    public static void c(a4.g gVar) {
        int i10;
        int i11;
        int i12 = gVar.i(2);
        int i13 = 6;
        if (i12 == 0) {
            gVar.t(6);
            return;
        }
        int i14 = 5;
        int a2 = a(gVar, 5, 8, 16) + 1;
        if (i12 == 1) {
            gVar.t(a2 * 7);
        } else if (i12 == 2) {
            boolean h = gVar.h();
            if (h) {
                i10 = 1;
            } else {
                i10 = 5;
            }
            if (h) {
                i14 = 7;
            }
            if (h) {
                i13 = 8;
            }
            int i15 = 0;
            while (i15 < a2) {
                if (gVar.h()) {
                    gVar.t(7);
                    i11 = 0;
                } else {
                    if (gVar.i(2) == 3 && gVar.i(i14) * i10 != 0) {
                        gVar.s();
                    }
                    i11 = gVar.i(i13) * i10;
                    if (i11 != 0 && i11 != 180) {
                        gVar.s();
                    }
                    gVar.s();
                }
                if (i11 != 0 && i11 != 180 && gVar.h()) {
                    i15++;
                }
                i15++;
            }
        }
    }
}
