package w2;

import android.net.Uri;
import b8.zb;
import java.util.Map;
public final class t implements i2.h {
    public final i2.h f57214a;
    public final int f57215b;
    public final t0 f57216c;
    public final byte[] d;
    public int f57217e;

    public t(i2.h hVar, int i3, t0 t0Var) {
        boolean z10;
        if (i3 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.f(z10);
        this.f57214a = hVar;
        this.f57215b = i3;
        this.f57216c = t0Var;
        this.d = new byte[1];
        this.f57217e = i3;
    }

    @Override
    public final void addTransferListener(i2.d0 d0Var) {
        d0Var.getClass();
        this.f57214a.addTransferListener(d0Var);
    }

    @Override
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f57214a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f57214a.getUri();
    }

    @Override
    public final long open(i2.n nVar) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final int read(byte[] bArr, int i3, int i10) {
        long max;
        int i11 = this.f57217e;
        i2.h hVar = this.f57214a;
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
                        g2.y yVar = new g2.y(bArr3, i13);
                        t0 t0Var = this.f57216c;
                        if (!t0Var.f57227x) {
                            max = t0Var.f57224r;
                        } else {
                            max = Math.max(t0Var.f57228y.u(true), t0Var.f57224r);
                        }
                        long j10 = max;
                        int a10 = yVar.a();
                        e3.i0 i0Var = t0Var.f57226w;
                        i0Var.getClass();
                        i0Var.e(a10, yVar);
                        i0Var.d(j10, 1, a10, 0, null);
                        t0Var.f57227x = true;
                    }
                }
                this.f57217e = this.f57215b;
            }
            return -1;
        }
        int read2 = hVar.read(bArr, i3, Math.min(this.f57217e, i10));
        if (read2 != -1) {
            this.f57217e -= read2;
        }
        return read2;
    }
}
