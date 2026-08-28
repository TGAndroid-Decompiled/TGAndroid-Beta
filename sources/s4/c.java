package s4;

import d5.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import r4.k;
public final class c extends i {
    public final int h;
    public final int f47374i;
    public final int f47375j;
    public List f47379n;
    public List f47380o;
    public int f47381p;
    public int f47382q;
    public boolean f47383r;
    public boolean f47384s;
    public byte f47385t;
    public byte f47386u;
    public boolean f47387w;
    public long f47388x;
    public static final int[] f47371y = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] f47372z = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    public static final int[] C = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    public static final int[] D = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    public static final int[] E = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    public final y f47373g = new y();
    public final ArrayList f47377l = new ArrayList();
    public b f47378m = new b(0, 4);
    public int v = 0;
    public final long f47376k = 16000000;

    public c(String str, int i9) {
        int i10;
        if ("application/x-mp4-cea-608".equals(str)) {
            i10 = 2;
        } else {
            i10 = 3;
        }
        this.h = i10;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 != 4) {
                        d5.a.K("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
                        this.f47375j = 0;
                        this.f47374i = 0;
                    } else {
                        this.f47375j = 1;
                        this.f47374i = 1;
                    }
                } else {
                    this.f47375j = 0;
                    this.f47374i = 1;
                }
            } else {
                this.f47375j = 1;
                this.f47374i = 0;
            }
        } else {
            this.f47375j = 0;
            this.f47374i = 0;
        }
        h(0);
        g();
        this.f47387w = true;
        this.f47388x = -9223372036854775807L;
    }

    @Override
    public final j b() {
        List list = this.f47379n;
        this.f47380o = list;
        list.getClass();
        return new j(0, list);
    }

    @Override
    public final void c(s4.g r15) {
        throw new UnsupportedOperationException("Method not decompiled: s4.c.c(s4.g):void");
    }

    @Override
    public final k dequeueOutputBuffer() {
        k kVar;
        k dequeueOutputBuffer = super.dequeueOutputBuffer();
        if (dequeueOutputBuffer != null) {
            return dequeueOutputBuffer;
        }
        long j10 = this.f47376k;
        if (j10 != -9223372036854775807L) {
            long j11 = this.f47388x;
            if (j11 != -9223372036854775807L && this.f47429e - j11 >= j10 && (kVar = (k) this.f47427b.pollFirst()) != null) {
                this.f47379n = Collections.EMPTY_LIST;
                this.f47388x = -9223372036854775807L;
                kVar.a(this.f47429e, b(), Long.MAX_VALUE);
                return kVar;
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean e() {
        if (this.f47379n != this.f47380o) {
            return true;
        }
        return false;
    }

    public final ArrayList f() {
        ArrayList arrayList = this.f47377l;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int i9 = 2;
        for (int i10 = 0; i10 < size; i10++) {
            r4.b c10 = ((b) arrayList.get(i10)).c(Integer.MIN_VALUE);
            arrayList2.add(c10);
            if (c10 != null) {
                i9 = Math.min(i9, c10.f47051r);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            r4.b bVar = (r4.b) arrayList2.get(i11);
            if (bVar != null) {
                if (bVar.f47051r != i9) {
                    bVar = ((b) arrayList.get(i11)).c(i9);
                    bVar.getClass();
                }
                arrayList3.add(bVar);
            }
        }
        return arrayList3;
    }

    @Override
    public final void flush() {
        super.flush();
        this.f47379n = null;
        this.f47380o = null;
        h(0);
        this.f47382q = 4;
        this.f47378m.h = 4;
        g();
        this.f47383r = false;
        this.f47384s = false;
        this.f47385t = (byte) 0;
        this.f47386u = (byte) 0;
        this.v = 0;
        this.f47387w = true;
        this.f47388x = -9223372036854775807L;
    }

    public final void g() {
        b bVar = this.f47378m;
        bVar.f47370g = this.f47381p;
        bVar.f47365a.clear();
        bVar.f47366b.clear();
        bVar.f47367c.setLength(0);
        bVar.d = 15;
        bVar.f47368e = 0;
        bVar.f47369f = 0;
        ArrayList arrayList = this.f47377l;
        arrayList.clear();
        arrayList.add(this.f47378m);
    }

    @Override
    public final String getName() {
        return "Cea608Decoder";
    }

    public final void h(int i9) {
        int i10 = this.f47381p;
        if (i10 != i9) {
            this.f47381p = i9;
            if (i9 == 3) {
                int i11 = 0;
                while (true) {
                    ArrayList arrayList = this.f47377l;
                    if (i11 < arrayList.size()) {
                        ((b) arrayList.get(i11)).f47370g = i9;
                        i11++;
                    } else {
                        return;
                    }
                }
            } else {
                g();
                if (i10 != 3 && i9 != 1 && i9 != 0) {
                    return;
                }
                this.f47379n = Collections.EMPTY_LIST;
            }
        }
    }

    @Override
    public final void release() {
    }
}
