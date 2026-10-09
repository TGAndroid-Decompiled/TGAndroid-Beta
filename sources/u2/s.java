package u2;

import android.net.Uri;
import java.util.Map;
public final class s implements g2.h {
    public final g2.h f48700a;
    public final int f48701b;
    public final r0 f48702c;
    public final byte[] d;
    public int f48703e;

    public s(g2.h hVar, int i10, r0 r0Var) {
        boolean z10;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        this.f48700a = hVar;
        this.f48701b = i10;
        this.f48702c = r0Var;
        this.d = new byte[1];
        this.f48703e = i10;
    }

    @Override
    public final void addTransferListener(g2.c0 c0Var) {
        c0Var.getClass();
        this.f48700a.addTransferListener(c0Var);
    }

    @Override
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f48700a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f48700a.getUri();
    }

    @Override
    public final long open(g2.m mVar) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        long max;
        int i12 = this.f48703e;
        g2.h hVar = this.f48700a;
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
                        r0 r0Var = this.f48702c;
                        if (!r0Var.f48698w) {
                            max = r0Var.f48696r;
                        } else {
                            max = Math.max(r0Var.f48699x.j(true), r0Var.f48696r);
                        }
                        long j3 = max;
                        int a2 = vVar.a();
                        c3.h0 h0Var = r0Var.v;
                        h0Var.getClass();
                        h0Var.d(a2, vVar);
                        h0Var.c(j3, 1, a2, 0, null);
                        r0Var.f48698w = true;
                    }
                }
                this.f48703e = this.f48701b;
            }
            return -1;
        }
        int read2 = hVar.read(bArr, i10, Math.min(this.f48703e, i11));
        if (read2 != -1) {
            this.f48703e -= read2;
        }
        return read2;
    }
}
