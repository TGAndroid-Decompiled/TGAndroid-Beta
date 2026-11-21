package x2;

import a8.la;
import android.net.Uri;
import java.util.Map;
public final class t implements j2.h {
    public final j2.h f60262a;
    public final int f60263b;
    public final t0 f60264c;
    public final byte[] d;
    public int f60265e;

    public t(j2.h hVar, int i7, t0 t0Var) {
        boolean z10;
        if (i7 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        la.f(z10);
        this.f60262a = hVar;
        this.f60263b = i7;
        this.f60264c = t0Var;
        this.d = new byte[1];
        this.f60265e = i7;
    }

    @Override
    public final void addTransferListener(j2.c0 c0Var) {
        c0Var.getClass();
        this.f60262a.addTransferListener(c0Var);
    }

    @Override
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f60262a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f60262a.getUri();
    }

    @Override
    public final long open(j2.m mVar) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final int read(byte[] bArr, int i7, int i10) {
        long max;
        int i11 = this.f60265e;
        j2.h hVar = this.f60262a;
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
                        t0 t0Var = this.f60264c;
                        if (!t0Var.f60275x) {
                            max = t0Var.f60272r;
                        } else {
                            max = Math.max(t0Var.f60276y.v(true), t0Var.f60272r);
                        }
                        long j3 = max;
                        int a10 = xVar.a();
                        f3.i0 i0Var = t0Var.f60274w;
                        i0Var.getClass();
                        i0Var.b(a10, xVar);
                        i0Var.c(j3, 1, a10, 0, null);
                        t0Var.f60275x = true;
                    }
                }
                this.f60265e = this.f60263b;
            }
            return -1;
        }
        int read2 = hVar.read(bArr, i7, Math.min(this.f60265e, i10));
        if (read2 != -1) {
            this.f60265e -= read2;
        }
        return read2;
    }
}
