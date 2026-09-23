package u2;

import android.net.Uri;
import java.util.Map;
public final class s implements g2.h {
    public final g2.h f43407a;
    public final int f43408b;
    public final q0 f43409c;
    public final byte[] d;
    public int e;

    public s(g2.h hVar, int i10, q0 q0Var) {
        boolean z10;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        this.f43407a = hVar;
        this.f43408b = i10;
        this.f43409c = q0Var;
        this.d = new byte[1];
        this.e = i10;
    }

    @Override
    public final void addTransferListener(g2.c0 c0Var) {
        c0Var.getClass();
        this.f43407a.addTransferListener(c0Var);
    }

    @Override
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f43407a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f43407a.getUri();
    }

    @Override
    public final long open(g2.m mVar) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        long max;
        int i12 = this.e;
        g2.h hVar = this.f43407a;
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
                        q0 q0Var = this.f43409c;
                        if (!q0Var.f43403w) {
                            max = q0Var.f43401r;
                        } else {
                            max = Math.max(q0Var.f43404x.j(true), q0Var.f43401r);
                        }
                        long j3 = max;
                        int a2 = vVar.a();
                        c3.h0 h0Var = q0Var.v;
                        h0Var.getClass();
                        h0Var.d(a2, vVar);
                        h0Var.c(j3, 1, a2, 0, null);
                        q0Var.f43403w = true;
                    }
                }
                this.e = this.f43408b;
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
