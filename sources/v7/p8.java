package v7;
public abstract class p8 {
    public static int a(a4.h hVar, int i10, int i11, int i12) {
        boolean z10;
        if (Math.max(Math.max(i10, i11), i12) <= 31) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        int i13 = (1 << i10) - 1;
        int i14 = (1 << i11) - 1;
        o7.a(o7.a(i13, i14), 1 << i12);
        if (hVar.b() >= i10) {
            int i15 = hVar.i(i10);
            if (i15 == i13) {
                if (hVar.b() >= i11) {
                    int i16 = hVar.i(i11);
                    i15 += i16;
                    if (i16 == i14) {
                        if (hVar.b() < i12) {
                            return -1;
                        }
                        return hVar.i(i12) + i15;
                    }
                } else {
                    return -1;
                }
            }
            return i15;
        }
        return -1;
    }

    public static void b(a4.h hVar) {
        hVar.t(3);
        hVar.t(8);
        boolean h = hVar.h();
        boolean h10 = hVar.h();
        if (h) {
            hVar.t(5);
        }
        if (h10) {
            hVar.t(6);
        }
    }

    public static void c(a4.h hVar) {
        int i10;
        int i11;
        int i12 = hVar.i(2);
        int i13 = 6;
        if (i12 == 0) {
            hVar.t(6);
            return;
        }
        int i14 = 5;
        int a2 = a(hVar, 5, 8, 16) + 1;
        if (i12 == 1) {
            hVar.t(a2 * 7);
        } else if (i12 == 2) {
            boolean h = hVar.h();
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
                if (hVar.h()) {
                    hVar.t(7);
                    i11 = 0;
                } else {
                    if (hVar.i(2) == 3 && hVar.i(i14) * i10 != 0) {
                        hVar.s();
                    }
                    i11 = hVar.i(i13) * i10;
                    if (i11 != 0 && i11 != 180) {
                        hVar.s();
                    }
                    hVar.s();
                }
                if (i11 != 0 && i11 != 180 && hVar.h()) {
                    i15++;
                }
                i15++;
            }
        }
    }
}
