package w3;

import android.util.SparseArray;
public final class x implements m3.k {
    public boolean f48724e;
    public boolean f48725f;
    public boolean f48726g;
    public long h;
    public p3.a f48727i;
    public m3.m f48728j;
    public boolean f48729k;
    public final d5.e0 f48721a = new d5.e0(0);
    public final d5.y f48723c = new d5.y(4096);
    public final SparseArray f48722b = new SparseArray();
    public final v d = new v(0);

    @Override
    public final int b(m3.l r28, m3.n r29) {
        throw new UnsupportedOperationException("Method not decompiled: w3.x.b(m3.l, m3.n):int");
    }

    @Override
    public final void c(m3.m mVar) {
        this.f48728j = mVar;
    }

    @Override
    public final boolean f(m3.l lVar) {
        byte[] bArr = new byte[14];
        m3.h hVar = (m3.h) lVar;
        hVar.g(bArr, 0, 14, false);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            hVar.a(bArr[13] & 7, false);
            hVar.g(bArr, 0, 3, false);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void g(long j10, long j11) {
        boolean z10;
        d5.e0 e0Var = this.f48721a;
        boolean z11 = true;
        if (e0Var.d() == -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            long c10 = e0Var.c();
            z10 = (c10 == -9223372036854775807L || c10 == 0 || c10 == j11) ? false : false;
        }
        if (z10) {
            e0Var.e(j11);
        }
        p3.a aVar = this.f48727i;
        if (aVar != null) {
            aVar.d(j11);
        }
        int i9 = 0;
        while (true) {
            SparseArray sparseArray = this.f48722b;
            if (i9 < sparseArray.size()) {
                w wVar = (w) sparseArray.valueAt(i9);
                wVar.f48719f = false;
                wVar.f48715a.h();
                i9++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void release() {
    }
}
