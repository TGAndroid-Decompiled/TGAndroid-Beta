package u2;

import android.net.Uri;
import java.util.Map;
public final class s implements g2.h {
    public final g2.h f46798a;
    public final int f46799b;
    public final r0 f46800c;
    public final byte[] d;
    public int f46801e;

    public s(g2.h hVar, int i10, r0 r0Var) {
        boolean z10;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        this.f46798a = hVar;
        this.f46799b = i10;
        this.f46800c = r0Var;
        this.d = new byte[1];
        this.f46801e = i10;
    }

    @Override
    public final void addTransferListener(g2.c0 c0Var) {
        c0Var.getClass();
        this.f46798a.addTransferListener(c0Var);
    }

    @Override
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f46798a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f46798a.getUri();
    }

    @Override
    public final long open(g2.m mVar) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        long max;
        int i12 = this.f46801e;
        g2.h hVar = this.f46798a;
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
                        r0 r0Var = this.f46800c;
                        if (!r0Var.f46796w) {
                            max = r0Var.f46794r;
                        } else {
                            max = Math.max(r0Var.f46797x.m(true), r0Var.f46794r);
                        }
                        long j3 = max;
                        int a2 = vVar.a();
                        c3.h0 h0Var = r0Var.v;
                        h0Var.getClass();
                        h0Var.d(a2, vVar);
                        h0Var.c(j3, 1, a2, 0, null);
                        r0Var.f46796w = true;
                    }
                }
                this.f46801e = this.f46799b;
            }
            return -1;
        }
        int read2 = hVar.read(bArr, i10, Math.min(this.f46801e, i11));
        if (read2 != -1) {
            this.f46801e -= read2;
        }
        return read2;
    }
}
