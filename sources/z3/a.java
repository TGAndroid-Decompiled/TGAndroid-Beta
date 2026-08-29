package z3;

import a4.k;
import f5.d0;
import j3.s0;
import j3.t0;
import j3.t1;
import o3.m;
import o3.w;
public final class a implements b {
    public static final int[] f50558m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    public static final int[] f50559n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    public final m f50560a;
    public final w f50561b;
    public final k f50562c;
    public final int d;
    public final byte[] f50563e;
    public final f5.w f50564f;
    public final int f50565g;
    public final t0 h;
    public int f50566i;
    public long f50567j;
    public int f50568k;
    public long f50569l;

    public a(m mVar, w wVar, k kVar) {
        this.f50560a = mVar;
        this.f50561b = wVar;
        this.f50562c = kVar;
        int i10 = kVar.f96b;
        int max = Math.max(1, i10 / 10);
        this.f50565g = max;
        f5.w wVar2 = new f5.w((byte[]) kVar.f98e);
        wVar2.k();
        int k9 = wVar2.k();
        this.d = k9;
        int i11 = kVar.f95a;
        int i12 = kVar.f97c;
        int i13 = (((i12 - (i11 * 4)) * 8) / (kVar.d * i11)) + 1;
        if (k9 == i13) {
            int f9 = d0.f(max, k9);
            this.f50563e = new byte[f9 * i12];
            this.f50564f = new f5.w(k9 * 2 * i11 * f9);
            int i14 = ((i12 * i10) * 8) / k9;
            s0 s0Var = new s0();
            s0Var.f10742o = "audio/raw";
            s0Var.f10734f = i14;
            s0Var.f10735g = i14;
            s0Var.f10743p = max * 2 * i11;
            s0Var.B = i11;
            s0Var.C = i10;
            s0Var.D = 2;
            this.h = new t0(s0Var);
            return;
        }
        throw t1.a("Expected frames per block: " + i13 + "; got: " + k9, null);
    }

    @Override
    public final void a(long j10) {
        this.f50566i = 0;
        this.f50567j = j10;
        this.f50568k = 0;
        this.f50569l = 0L;
    }

    @Override
    public final boolean b(o3.l r25, long r26) {
        throw new UnsupportedOperationException("Method not decompiled: z3.a.b(o3.l, long):boolean");
    }

    @Override
    public final void c(int i10, long j10) {
        this.f50560a.D1(new d(this.f50562c, this.d, i10, j10));
        this.f50561b.b(this.h);
    }

    public final void d(int i10) {
        long j10 = this.f50567j;
        long j11 = this.f50569l;
        k kVar = this.f50562c;
        long O = j10 + d0.O(j11, 1000000L, kVar.f96b);
        int i11 = i10 * 2 * kVar.f95a;
        this.f50561b.c(O, 1, i11, this.f50568k - i11, null);
        this.f50569l += i10;
        this.f50568k -= i11;
    }
}
