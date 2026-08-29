package y3;

import android.util.SparseArray;
public final class x implements o3.k {
    public boolean f50457e;
    public boolean f50458f;
    public boolean f50459g;
    public long h;
    public r3.a f50460i;
    public o3.m f50461j;
    public boolean f50462k;
    public final f5.c0 f50454a = new f5.c0(0);
    public final f5.w f50456c = new f5.w(4096);
    public final SparseArray f50455b = new SparseArray();
    public final v d = new v(0);

    @Override
    public final int d(o3.l r28, o3.n r29) {
        throw new UnsupportedOperationException("Method not decompiled: y3.x.d(o3.l, o3.n):int");
    }

    @Override
    public final boolean e(o3.l lVar) {
        byte[] bArr = new byte[14];
        o3.h hVar = (o3.h) lVar;
        hVar.f(bArr, 0, 14, false);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            hVar.b(bArr[13] & 7, false);
            hVar.f(bArr, 0, 3, false);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void f(long j10, long j11) {
        boolean z10;
        f5.c0 c0Var = this.f50454a;
        boolean z11 = true;
        if (c0Var.d() == -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            long c3 = c0Var.c();
            z10 = (c3 == -9223372036854775807L || c3 == 0 || c3 == j11) ? false : false;
        }
        if (z10) {
            c0Var.e(j11);
        }
        r3.a aVar = this.f50460i;
        if (aVar != null) {
            aVar.d(j11);
        }
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f50455b;
            if (i10 < sparseArray.size()) {
                w wVar = (w) sparseArray.valueAt(i10);
                wVar.f50452f = false;
                wVar.f50448a.a();
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void i(o3.m mVar) {
        this.f50461j = mVar;
    }

    @Override
    public final void release() {
    }
}
