package x2;

import a8.ma;
import android.net.Uri;
import java.util.Map;
public final class t implements j2.h {
    public final j2.h f60231a;
    public final int f60232b;
    public final t0 f60233c;
    public final byte[] d;
    public int f60234e;

    public t(j2.h hVar, int i7, t0 t0Var) {
        boolean z10;
        if (i7 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ma.f(z10);
        this.f60231a = hVar;
        this.f60232b = i7;
        this.f60233c = t0Var;
        this.d = new byte[1];
        this.f60234e = i7;
    }

    @Override
    public final void addTransferListener(j2.c0 c0Var) {
        c0Var.getClass();
        this.f60231a.addTransferListener(c0Var);
    }

    @Override
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f60231a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f60231a.getUri();
    }

    @Override
    public final long open(j2.m mVar) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final int read(byte[] bArr, int i7, int i10) {
        long max;
        int i11 = this.f60234e;
        j2.h hVar = this.f60231a;
        if (i11 == 0) {
            byte[] bArr2 = this.d;
            int i12 = 0;
            if (hVar.read(bArr2, 0, 1) != -1) {
                int i13 = (bArr2[0] & 255) << 4;
                if (i13 != 0) {
                    byte[] bArr3 = new byte[i13];
                    int i14 = i13;
                    while (i14 > 0) {
                        int read = hVar.read(bArr3, i12, i14);
                        if (read != -1) {
                            i12 += read;
                            i14 -= read;
                        }
                    }
                    while (i13 > 0 && bArr3[i13 - 1] == 0) {
                        i13--;
                    }
                    if (i13 > 0) {
                        h2.x xVar = new h2.x(bArr3, i13);
                        t0 t0Var = this.f60233c;
                        if (!t0Var.f60244x) {
                            max = t0Var.f60241r;
                        } else {
                            max = Math.max(t0Var.f60245y.v(true), t0Var.f60241r);
                        }
                        long j3 = max;
                        int a10 = xVar.a();
                        f3.i0 i0Var = t0Var.f60243w;
                        i0Var.getClass();
                        i0Var.b(a10, xVar);
                        i0Var.c(j3, 1, a10, 0, null);
                        t0Var.f60244x = true;
                    }
                }
                this.f60234e = this.f60232b;
            }
            return -1;
        }
        int read2 = hVar.read(bArr, i7, Math.min(this.f60234e, i10));
        if (read2 != -1) {
            this.f60234e -= read2;
        }
        return read2;
    }
}
