package u2;

import android.net.Uri;
import java.util.Map;
import v7.u6;
public final class u implements g2.h {
    public final g2.h f47891a;
    public final int f47892b;
    public final v0 f47893c;
    public final byte[] d;
    public int e;

    public u(g2.h hVar, int i10, v0 v0Var) {
        boolean z10;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        this.f47891a = hVar;
        this.f47892b = i10;
        this.f47893c = v0Var;
        this.d = new byte[1];
        this.e = i10;
    }

    @Override
    public final void addTransferListener(g2.c0 c0Var) {
        c0Var.getClass();
        this.f47891a.addTransferListener(c0Var);
    }

    @Override
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f47891a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f47891a.getUri();
    }

    @Override
    public final long open(g2.m mVar) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        long max;
        int i12 = this.e;
        g2.h hVar = this.f47891a;
        if (i12 == 0) {
            byte[] bArr2 = this.d;
            int i13 = 0;
            if (hVar.read(bArr2, 0, 1) != -1) {
                int i14 = (bArr2[0] & 255) << 4;
                if (i14 != 0) {
                    byte[] bArr3 = new byte[i14];
                    int i15 = i14;
                    while (i15 > 0) {
                        int read = hVar.read(bArr3, i13, i15);
                        if (read != -1) {
                            i13 += read;
                            i15 -= read;
                        }
                    }
                    while (i14 > 0 && bArr3[i14 - 1] == 0) {
                        i14--;
                    }
                    if (i14 > 0) {
                        e2.x xVar = new e2.x(bArr3, i14);
                        v0 v0Var = this.f47893c;
                        if (!v0Var.f47910w) {
                            max = v0Var.f47908r;
                        } else {
                            max = Math.max(v0Var.f47911x.m(true), v0Var.f47908r);
                        }
                        long j10 = max;
                        int a2 = xVar.a();
                        c3.l0 l0Var = v0Var.v;
                        l0Var.getClass();
                        l0Var.d(a2, xVar);
                        l0Var.c(j10, 1, a2, 0, null);
                        v0Var.f47910w = true;
                    }
                }
                this.e = this.f47892b;
            }
            return -1;
        }
        int read2 = hVar.read(bArr, i10, Math.min(this.e, i11));
        if (read2 != -1) {
            this.e -= read2;
        }
        return read2;
    }
}
