package x3;

import c2.b1;
import d5.f0;
import d5.y;
import h3.s0;
import h3.t0;
import h3.t1;
import m3.m;
import m3.w;
public final class a implements b {
    public static final int[] f48858m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    public static final int[] f48859n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    public final m f48860a;
    public final w f48861b;
    public final b1 f48862c;
    public final int d;
    public final byte[] f48863e;
    public final y f48864f;
    public final int f48865g;
    public final t0 h;
    public int f48866i;
    public long f48867j;
    public int f48868k;
    public long f48869l;

    public a(m mVar, w wVar, b1 b1Var) {
        this.f48860a = mVar;
        this.f48861b = wVar;
        this.f48862c = b1Var;
        int i9 = b1Var.f2120b;
        int max = Math.max(1, i9 / 10);
        this.f48865g = max;
        y yVar = new y((byte[]) b1Var.f2122e);
        yVar.k();
        int k10 = yVar.k();
        this.d = k10;
        int i10 = b1Var.f2119a;
        int i11 = b1Var.f2121c;
        int i12 = (((i11 - (i10 * 4)) * 8) / (b1Var.d * i10)) + 1;
        if (k10 == i12) {
            int f10 = f0.f(max, k10);
            this.f48863e = new byte[f10 * i11];
            this.f48864f = new y(k10 * 2 * i10 * f10);
            int i13 = ((i11 * i9) * 8) / k10;
            s0 s0Var = new s0();
            s0Var.f9705o = "audio/raw";
            s0Var.f9697f = i13;
            s0Var.f9698g = i13;
            s0Var.f9706p = max * 2 * i10;
            s0Var.B = i10;
            s0Var.C = i9;
            s0Var.D = 2;
            this.h = new t0(s0Var);
            return;
        }
        throw t1.a("Expected frames per block: " + i12 + "; got: " + k10, null);
    }

    @Override
    public final boolean a(m3.l r25, long r26) {
        throw new UnsupportedOperationException("Method not decompiled: x3.a.a(m3.l, long):boolean");
    }

    @Override
    public final void b(long j10) {
        this.f48866i = 0;
        this.f48867j = j10;
        this.f48868k = 0;
        this.f48869l = 0L;
    }

    @Override
    public final void c(int i9, long j10) {
        this.f48860a.y(new d(this.f48862c, this.d, i9, j10));
        this.f48861b.c(this.h);
    }

    public final void d(int i9) {
        long j10 = this.f48867j;
        long j11 = this.f48869l;
        b1 b1Var = this.f48862c;
        long O = j10 + f0.O(j11, 1000000L, b1Var.f2120b);
        int i10 = i9 * 2 * b1Var.f2119a;
        this.f48861b.e(O, 1, i10, this.f48868k - i10, null);
        this.f48869l += i9;
        this.f48868k -= i10;
    }
}
