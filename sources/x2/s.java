package x2;

import a8.ja;
import android.net.Uri;
import java.util.Map;
public final class s implements j2.h {
    public final j2.h f59648a;
    public final int f59649b;
    public final s0 f59650c;
    public final byte[] d;
    public int f59651e;

    public s(j2.h hVar, int i7, s0 s0Var) {
        boolean z10;
        if (i7 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ja.f(z10);
        this.f59648a = hVar;
        this.f59649b = i7;
        this.f59650c = s0Var;
        this.d = new byte[1];
        this.f59651e = i7;
    }

    @Override
    public final void addTransferListener(j2.c0 c0Var) {
        c0Var.getClass();
        this.f59648a.addTransferListener(c0Var);
    }

    @Override
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f59648a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f59648a.getUri();
    }

    @Override
    public final long open(j2.m mVar) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final int read(byte[] bArr, int i7, int i10) {
        long max;
        int i11 = this.f59651e;
        j2.h hVar = this.f59648a;
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
                        s0 s0Var = this.f59650c;
                        if (!s0Var.f59661x) {
                            max = s0Var.f59658r;
                        } else {
                            max = Math.max(s0Var.f59662y.v(true), s0Var.f59658r);
                        }
                        long j3 = max;
                        int a10 = xVar.a();
                        f3.i0 i0Var = s0Var.f59660w;
                        i0Var.getClass();
                        i0Var.b(a10, xVar);
                        i0Var.c(j3, 1, a10, 0, null);
                        s0Var.f59661x = true;
                    }
                }
                this.f59651e = this.f59649b;
            }
            return -1;
        }
        int read2 = hVar.read(bArr, i7, Math.min(this.f59651e, i10));
        if (read2 != -1) {
            this.f59651e -= read2;
        }
        return read2;
    }
}
