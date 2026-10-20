package u2;

import android.net.Uri;
import java.util.Map;
import v7.u6;
public final class t implements g2.h {
    public final g2.h f47433a;
    public final int f47434b;
    public final u0 f47435c;
    public final byte[] d;
    public int e;

    public t(g2.h hVar, int i10, u0 u0Var) {
        boolean z10;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        this.f47433a = hVar;
        this.f47434b = i10;
        this.f47435c = u0Var;
        this.d = new byte[1];
        this.e = i10;
    }

    @Override
    public final void addTransferListener(g2.c0 c0Var) {
        c0Var.getClass();
        this.f47433a.addTransferListener(c0Var);
    }

    @Override
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f47433a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f47433a.getUri();
    }

    @Override
    public final long open(g2.m mVar) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        long max;
        int i12 = this.e;
        g2.h hVar = this.f47433a;
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
                        u0 u0Var = this.f47435c;
                        if (!u0Var.f47452w) {
                            max = u0Var.f47450r;
                        } else {
                            max = Math.max(u0Var.f47453x.m(true), u0Var.f47450r);
                        }
                        long j10 = max;
                        int a2 = xVar.a();
                        c3.j0 j0Var = u0Var.v;
                        j0Var.getClass();
                        j0Var.d(a2, xVar);
                        j0Var.c(j10, 1, a2, 0, null);
                        u0Var.f47452w = true;
                    }
                }
                this.e = this.f47434b;
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
