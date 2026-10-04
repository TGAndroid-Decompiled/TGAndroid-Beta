package u2;

import android.net.Uri;
import java.util.Map;
public final class s implements g2.h {
    public final g2.h f47379a;
    public final int f47380b;
    public final s0 f47381c;
    public final byte[] d;
    public int f47382e;

    public s(g2.h hVar, int i10, s0 s0Var) {
        boolean z10;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        this.f47379a = hVar;
        this.f47380b = i10;
        this.f47381c = s0Var;
        this.d = new byte[1];
        this.f47382e = i10;
    }

    @Override
    public final void addTransferListener(g2.c0 c0Var) {
        c0Var.getClass();
        this.f47379a.addTransferListener(c0Var);
    }

    @Override
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f47379a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f47379a.getUri();
    }

    @Override
    public final long open(g2.m mVar) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        long max;
        int i12 = this.f47382e;
        g2.h hVar = this.f47379a;
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
                        e2.v vVar = new e2.v(bArr3, i14);
                        s0 s0Var = this.f47381c;
                        if (!s0Var.f47391w) {
                            max = s0Var.f47389r;
                        } else {
                            max = Math.max(s0Var.f47392x.j(true), s0Var.f47389r);
                        }
                        long j3 = max;
                        int a2 = vVar.a();
                        c3.h0 h0Var = s0Var.v;
                        h0Var.getClass();
                        h0Var.d(a2, vVar);
                        h0Var.c(j3, 1, a2, 0, null);
                        s0Var.f47391w = true;
                    }
                }
                this.f47382e = this.f47380b;
            }
            return -1;
        }
        int read2 = hVar.read(bArr, i10, Math.min(this.f47382e, i11));
        if (read2 != -1) {
            this.f47382e -= read2;
        }
        return read2;
    }
}
