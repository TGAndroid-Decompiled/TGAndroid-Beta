package x2;

import a8.ia;
import android.net.Uri;
import java.util.Map;
public final class t implements j2.h {
    public final j2.h f58371a;
    public final int f58372b;
    public final t0 f58373c;
    public final byte[] d;
    public int f58374e;

    public t(j2.h hVar, int i7, t0 t0Var) {
        boolean z9;
        if (i7 > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.f(z9);
        this.f58371a = hVar;
        this.f58372b = i7;
        this.f58373c = t0Var;
        this.d = new byte[1];
        this.f58374e = i7;
    }

    @Override
    public final void addTransferListener(j2.d0 d0Var) {
        d0Var.getClass();
        this.f58371a.addTransferListener(d0Var);
    }

    @Override
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f58371a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f58371a.getUri();
    }

    @Override
    public final long open(j2.m mVar) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final int read(byte[] bArr, int i7, int i10) {
        long max;
        int i11 = this.f58374e;
        j2.h hVar = this.f58371a;
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
                        t0 t0Var = this.f58373c;
                        if (!t0Var.f58384x) {
                            max = t0Var.f58381r;
                        } else {
                            max = Math.max(t0Var.f58385y.s(true), t0Var.f58381r);
                        }
                        long j3 = max;
                        int a10 = xVar.a();
                        f3.j0 j0Var = t0Var.f58383w;
                        j0Var.getClass();
                        j0Var.b(a10, xVar);
                        j0Var.c(j3, 1, a10, 0, null);
                        t0Var.f58384x = true;
                    }
                }
                this.f58374e = this.f58372b;
            }
            return -1;
        }
        int read2 = hVar.read(bArr, i7, Math.min(this.f58374e, i10));
        if (read2 != -1) {
            this.f58374e -= read2;
        }
        return read2;
    }
}
