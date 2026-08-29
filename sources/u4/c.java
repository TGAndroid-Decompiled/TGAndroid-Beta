package u4;

import f5.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import t4.k;
public final class c extends i {
    public final int h;
    public final int f49038i;
    public final int f49039j;
    public List f49043n;
    public List f49044o;
    public int f49045p;
    public int f49046q;
    public boolean f49047r;
    public boolean f49048s;
    public byte f49049t;
    public byte f49050u;
    public boolean f49051w;
    public long f49052x;
    public static final int[] f49035y = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] f49036z = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    public static final int[] C = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    public static final int[] D = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    public static final int[] E = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    public final w f49037g = new w();
    public final ArrayList f49041l = new ArrayList();
    public b f49042m = new b(0, 4);
    public int v = 0;
    public final long f49040k = 16000000;

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
                        f5.a.K("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
                        this.f49039j = 0;
                        this.f49038i = 0;
                    } else {
                        this.f49039j = 1;
                        this.f49038i = 1;
                    }
                } else {
                    this.f49039j = 0;
                    this.f49038i = 1;
                }
            } else {
                this.f49039j = 1;
                this.f49038i = 0;
            }
        } else {
            this.f49039j = 0;
            this.f49038i = 0;
        }
        h(0);
        g();
        this.f49051w = true;
        this.f49052x = -9223372036854775807L;
    }

    @Override
    public final j b() {
        List list = this.f49043n;
        this.f49044o = list;
        list.getClass();
        return new j(0, list);
    }

    @Override
    public final void c(u4.g r15) {
        throw new UnsupportedOperationException("Method not decompiled: u4.c.c(u4.g):void");
    }

    @Override
    public final k dequeueOutputBuffer() {
        k kVar;
        k dequeueOutputBuffer = super.dequeueOutputBuffer();
        if (dequeueOutputBuffer != null) {
            return dequeueOutputBuffer;
        }
        long j10 = this.f49040k;
        if (j10 != -9223372036854775807L) {
            long j11 = this.f49052x;
            if (j11 != -9223372036854775807L && this.f49093e - j11 >= j10 && (kVar = (k) this.f49091b.pollFirst()) != null) {
                this.f49043n = Collections.EMPTY_LIST;
                this.f49052x = -9223372036854775807L;
                kVar.a(this.f49093e, b(), Long.MAX_VALUE);
                return kVar;
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean e() {
        if (this.f49043n != this.f49044o) {
            return true;
        }
        return false;
    }

    public final ArrayList f() {
        ArrayList arrayList = this.f49041l;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int i10 = 2;
        for (int i11 = 0; i11 < size; i11++) {
            t4.b c3 = ((b) arrayList.get(i11)).c(Integer.MIN_VALUE);
            arrayList2.add(c3);
            if (c3 != null) {
                i10 = Math.min(i10, c3.f48134r);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            t4.b bVar = (t4.b) arrayList2.get(i12);
            if (bVar != null) {
                if (bVar.f48134r != i10) {
                    bVar = ((b) arrayList.get(i12)).c(i10);
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
        this.f49043n = null;
        this.f49044o = null;
        h(0);
        this.f49046q = 4;
        this.f49042m.h = 4;
        g();
        this.f49047r = false;
        this.f49048s = false;
        this.f49049t = (byte) 0;
        this.f49050u = (byte) 0;
        this.v = 0;
        this.f49051w = true;
        this.f49052x = -9223372036854775807L;
    }

    public final void g() {
        b bVar = this.f49042m;
        bVar.f49034g = this.f49045p;
        bVar.f49029a.clear();
        bVar.f49030b.clear();
        bVar.f49031c.setLength(0);
        bVar.d = 15;
        bVar.f49032e = 0;
        bVar.f49033f = 0;
        ArrayList arrayList = this.f49041l;
        arrayList.clear();
        arrayList.add(this.f49042m);
    }

    @Override
    public final String getName() {
        return "Cea608Decoder";
    }

    public final void h(int i10) {
        int i11 = this.f49045p;
        if (i11 != i10) {
            this.f49045p = i10;
            if (i10 == 3) {
                int i12 = 0;
                while (true) {
                    ArrayList arrayList = this.f49041l;
                    if (i12 < arrayList.size()) {
                        ((b) arrayList.get(i12)).f49034g = i10;
                        i12++;
                    } else {
                        return;
                    }
                }
            } else {
                g();
                if (i11 != 3 && i10 != 1 && i10 != 0) {
                    return;
                }
                this.f49043n = Collections.EMPTY_LIST;
            }
        }
    }

    @Override
    public final void release() {
    }
}
