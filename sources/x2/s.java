package x2;

import a8.ia;
import android.net.Uri;
import java.util.Map;
public final class s implements j2.h {
    public final j2.h f58467a;
    public final int f58468b;
    public final s0 f58469c;
    public final byte[] d;
    public int f58470e;

    public s(j2.h hVar, int i7, s0 s0Var) {
        boolean z9;
        if (i7 > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.f(z9);
        this.f58467a = hVar;
        this.f58468b = i7;
        this.f58469c = s0Var;
        this.d = new byte[1];
        this.f58470e = i7;
    }

    @Override
    public final void addTransferListener(j2.d0 d0Var) {
        d0Var.getClass();
        this.f58467a.addTransferListener(d0Var);
    }

    @Override
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f58467a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f58467a.getUri();
    }

    @Override
    public final long open(j2.m mVar) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final int read(byte[] bArr, int i7, int i10) {
        long max;
        int i11 = this.f58470e;
        j2.h hVar = this.f58467a;
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
                        s0 s0Var = this.f58469c;
                        if (!s0Var.f58480x) {
                            max = s0Var.f58477r;
                        } else {
                            max = Math.max(s0Var.f58481y.s(true), s0Var.f58477r);
                        }
                        long j3 = max;
                        int a10 = xVar.a();
                        f3.j0 j0Var = s0Var.f58479w;
                        j0Var.getClass();
                        j0Var.b(a10, xVar);
                        j0Var.c(j3, 1, a10, 0, null);
                        s0Var.f58480x = true;
                    }
                }
                this.f58470e = this.f58468b;
            }
            return -1;
        }
        int read2 = hVar.read(bArr, i7, Math.min(this.f58470e, i10));
        if (read2 != -1) {
            this.f58470e -= read2;
        }
        return read2;
    }
}
