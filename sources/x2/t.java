package x2;

import a8.la;
import android.net.Uri;
import java.util.Map;
public final class t implements j2.h {
    public final j2.h f60221a;
    public final int f60222b;
    public final t0 f60223c;
    public final byte[] d;
    public int f60224e;

    public t(j2.h hVar, int i7, t0 t0Var) {
        boolean z10;
        if (i7 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        la.f(z10);
        this.f60221a = hVar;
        this.f60222b = i7;
        this.f60223c = t0Var;
        this.d = new byte[1];
        this.f60224e = i7;
    }

    @Override
    public final void addTransferListener(j2.c0 c0Var) {
        c0Var.getClass();
        this.f60221a.addTransferListener(c0Var);
    }

    @Override
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f60221a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f60221a.getUri();
    }

    @Override
    public final long open(j2.m mVar) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final int read(byte[] bArr, int i7, int i10) {
        long max;
        int i11 = this.f60224e;
        j2.h hVar = this.f60221a;
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
                        t0 t0Var = this.f60223c;
                        if (!t0Var.f60234x) {
                            max = t0Var.f60231r;
                        } else {
                            max = Math.max(t0Var.f60235y.v(true), t0Var.f60231r);
                        }
                        long j3 = max;
                        int a10 = xVar.a();
                        f3.i0 i0Var = t0Var.f60233w;
                        i0Var.getClass();
                        i0Var.b(a10, xVar);
                        i0Var.c(j3, 1, a10, 0, null);
                        t0Var.f60234x = true;
                    }
                }
                this.f60224e = this.f60222b;
            }
            return -1;
        }
        int read2 = hVar.read(bArr, i7, Math.min(this.f60224e, i10));
        if (read2 != -1) {
            this.f60224e -= read2;
        }
        return read2;
    }
}
