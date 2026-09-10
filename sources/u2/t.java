package u2;

import android.net.Uri;
import java.util.Map;
public final class t implements g2.h {
    public final g2.h f42443a;
    public final int f42444b;
    public final t0 f42445c;
    public final byte[] d;
    public int e;

    public t(g2.h hVar, int i10, t0 t0Var) {
        boolean z10;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        this.f42443a = hVar;
        this.f42444b = i10;
        this.f42445c = t0Var;
        this.d = new byte[1];
        this.e = i10;
    }

    @Override
    public final void addTransferListener(g2.c0 c0Var) {
        c0Var.getClass();
        this.f42443a.addTransferListener(c0Var);
    }

    @Override
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f42443a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f42443a.getUri();
    }

    @Override
    public final long open(g2.m mVar) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        long max;
        int i12 = this.e;
        g2.h hVar = this.f42443a;
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
                        t0 t0Var = this.f42445c;
                        if (!t0Var.f42453w) {
                            max = t0Var.f42451r;
                        } else {
                            max = Math.max(t0Var.f42454x.t(true), t0Var.f42451r);
                        }
                        long j3 = max;
                        int a2 = vVar.a();
                        c3.h0 h0Var = t0Var.v;
                        h0Var.getClass();
                        h0Var.d(a2, vVar);
                        h0Var.c(j3, 1, a2, 0, null);
                        t0Var.f42453w = true;
                    }
                }
                this.e = this.f42444b;
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
