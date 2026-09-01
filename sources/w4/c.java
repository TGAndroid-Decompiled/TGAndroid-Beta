package w4;

import h5.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import oh.h4;
import v4.k;
public final class c extends i {
    public final int h;
    public final int f49363i;
    public final int f49364j;
    public List f49368n;
    public List f49369o;
    public int f49370p;
    public int f49371q;
    public boolean f49372r;
    public boolean f49373s;
    public byte f49374t;
    public byte f49375u;
    public boolean f49376w;
    public long f49377x;
    public static final int[] f49360y = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] f49361z = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    public static final int[] C = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    public static final int[] D = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    public static final int[] E = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    public final w f49362g = new w();
    public final ArrayList f49366l = new ArrayList();
    public b f49367m = new b(0, 4);
    public int v = 0;
    public final long f49365k = 16000000;

    public c(String str, int i10) {
        int i11;
        if ("application/x-mp4-cea-608".equals(str)) {
            i11 = 2;
        } else {
            i11 = 3;
        }
        this.h = i11;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        h5.a.K("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
                        this.f49364j = 0;
                        this.f49363i = 0;
                    } else {
                        this.f49364j = 1;
                        this.f49363i = 1;
                    }
                } else {
                    this.f49364j = 0;
                    this.f49363i = 1;
                }
            } else {
                this.f49364j = 1;
                this.f49363i = 0;
            }
        } else {
            this.f49364j = 0;
            this.f49363i = 0;
        }
        k(0);
        j();
        this.f49376w = true;
        this.f49377x = -9223372036854775807L;
    }

    @Override
    public final h4 e() {
        List list = this.f49368n;
        this.f49369o = list;
        list.getClass();
        return new h4(list, 24);
    }

    @Override
    public final void f(w4.g r15) {
        throw new UnsupportedOperationException("Method not decompiled: w4.c.f(w4.g):void");
    }

    @Override
    public final void flush() {
        super.flush();
        this.f49368n = null;
        this.f49369o = null;
        k(0);
        this.f49371q = 4;
        this.f49367m.h = 4;
        j();
        this.f49372r = false;
        this.f49373s = false;
        this.f49374t = (byte) 0;
        this.f49375u = (byte) 0;
        this.v = 0;
        this.f49376w = true;
        this.f49377x = -9223372036854775807L;
    }

    @Override
    public final k b() {
        k kVar;
        k b10 = super.b();
        if (b10 != null) {
            return b10;
        }
        long j10 = this.f49365k;
        if (j10 != -9223372036854775807L) {
            long j11 = this.f49377x;
            if (j11 != -9223372036854775807L && this.f49416e - j11 >= j10 && (kVar = (k) this.f49414b.pollFirst()) != null) {
                this.f49368n = Collections.EMPTY_LIST;
                this.f49377x = -9223372036854775807L;
                kVar.j(this.f49416e, e(), Long.MAX_VALUE);
                return kVar;
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean h() {
        if (this.f49368n != this.f49369o) {
            return true;
        }
        return false;
    }

    public final ArrayList i() {
        ArrayList arrayList = this.f49366l;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int i10 = 2;
        for (int i11 = 0; i11 < size; i11++) {
            v4.b c3 = ((b) arrayList.get(i11)).c(Integer.MIN_VALUE);
            arrayList2.add(c3);
            if (c3 != null) {
                i10 = Math.min(i10, c3.f48898r);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            v4.b bVar = (v4.b) arrayList2.get(i12);
            if (bVar != null) {
                if (bVar.f48898r != i10) {
                    bVar = ((b) arrayList.get(i12)).c(i10);
                    bVar.getClass();
                }
                arrayList3.add(bVar);
            }
        }
        return arrayList3;
    }

    public final void j() {
        b bVar = this.f49367m;
        bVar.f49359g = this.f49370p;
        bVar.f49354a.clear();
        bVar.f49355b.clear();
        bVar.f49356c.setLength(0);
        bVar.d = 15;
        bVar.f49357e = 0;
        bVar.f49358f = 0;
        ArrayList arrayList = this.f49366l;
        arrayList.clear();
        arrayList.add(this.f49367m);
    }

    public final void k(int i10) {
        int i11 = this.f49370p;
        if (i11 != i10) {
            this.f49370p = i10;
            if (i10 == 3) {
                int i12 = 0;
                while (true) {
                    ArrayList arrayList = this.f49366l;
                    if (i12 < arrayList.size()) {
                        ((b) arrayList.get(i12)).f49359g = i10;
                        i12++;
                    } else {
                        return;
                    }
                }
            } else {
                j();
                if (i11 != 3 && i10 != 1 && i10 != 0) {
                    return;
                }
                this.f49368n = Collections.EMPTY_LIST;
            }
        }
    }

    @Override
    public final void release() {
    }
}
