package u2;

import android.net.Uri;
import java.util.Map;
import v7.t6;
public final class t implements g2.h {
    public final g2.h f50014a;
    public final int f50015b;
    public final t0 f50016c;
    public final byte[] d;
    public int e;

    public t(g2.h hVar, int i10, t0 t0Var) {
        boolean z10;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        t6.f(z10);
        this.f50014a = hVar;
        this.f50015b = i10;
        this.f50016c = t0Var;
        this.d = new byte[1];
        this.e = i10;
    }

    @Override
    public final void addTransferListener(g2.d0 d0Var) {
        d0Var.getClass();
        this.f50014a.addTransferListener(d0Var);
    }

    @Override
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f50014a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f50014a.getUri();
    }

    @Override
    public final long open(g2.n nVar) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        long max;
        int i12 = this.e;
        g2.h hVar = this.f50014a;
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
                        t0 t0Var = this.f50016c;
                        if (!t0Var.f50025x) {
                            max = t0Var.f50022r;
                        } else {
                            max = Math.max(t0Var.f50026y.r(true), t0Var.f50022r);
                        }
                        long j10 = max;
                        int a2 = xVar.a();
                        c3.k0 k0Var = t0Var.f50024w;
                        k0Var.getClass();
                        k0Var.d(a2, xVar);
                        k0Var.c(j10, 1, a2, 0, null);
                        t0Var.f50025x = true;
                    }
                }
                this.e = this.f50015b;
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
