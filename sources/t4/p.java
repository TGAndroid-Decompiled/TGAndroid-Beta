package t4;

import h5.d0;
import h5.w;
import j3.m0;
import j3.n0;
import java.io.EOFException;
import java.util.Arrays;
import org.telegram.ui.yh;
public final class p implements r3.v {
    public static final n0 f47974f;
    public static final n0 f47975g;
    public final r3.v f47976a;
    public final n0 f47977b;
    public n0 f47978c;
    public byte[] d;
    public int f47979e;

    static {
        m0 m0Var = new m0();
        m0Var.f9265o = "application/id3";
        f47974f = new n0(m0Var);
        m0 m0Var2 = new m0();
        m0Var2.f9265o = "application/x-emsg";
        f47975g = new n0(m0Var2);
    }

    public p(r3.v vVar, int i10) {
        this.f47976a = vVar;
        if (i10 != 1) {
            if (i10 == 3) {
                this.f47977b = f47975g;
            } else {
                throw new IllegalArgumentException(l.d.j(i10, "Unknown metadataType: "));
            }
        } else {
            this.f47977b = f47974f;
        }
        this.d = new byte[0];
        this.f47979e = 0;
    }

    @Override
    public final void a(int i10, w wVar) {
        int i11 = this.f47979e + i10;
        byte[] bArr = this.d;
        if (bArr.length < i11) {
            this.d = Arrays.copyOf(bArr, (i11 / 2) + i11);
        }
        wVar.e(this.f47979e, i10, this.d);
        this.f47979e += i10;
    }

    @Override
    public final void b(n0 n0Var) {
        this.f47978c = n0Var;
        this.f47976a.b(this.f47977b);
    }

    @Override
    public final void c(long j10, int i10, int i11, int i12, r3.u uVar) {
        this.f47978c.getClass();
        int i13 = this.f47979e - i12;
        w wVar = new w(Arrays.copyOfRange(this.d, i13 - i11, i13));
        byte[] bArr = this.d;
        System.arraycopy(bArr, i13, bArr, 0, i12);
        this.f47979e = i12;
        String str = this.f47978c.C;
        n0 n0Var = this.f47977b;
        String str2 = n0Var.C;
        String str3 = n0Var.C;
        if (!d0.a(str, str2)) {
            if ("application/x-emsg".equals(this.f47978c.C)) {
                g4.a c3 = f4.b.c(wVar);
                n0 b10 = c3.b();
                if (b10 != null && d0.a(str3, b10.C)) {
                    byte[] d = c3.d();
                    d.getClass();
                    wVar = new w(d);
                } else {
                    n0 b11 = c3.b();
                    h5.a.K("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str3 + " but actual wrapped format: " + b11);
                    return;
                }
            } else {
                h5.a.K("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f47978c.C);
                return;
            }
        }
        int a2 = wVar.a();
        r3.v vVar = this.f47976a;
        vVar.d(a2, wVar);
        vVar.c(j10, i10, a2, i12, uVar);
    }

    @Override
    public final void d(int i10, w wVar) {
        yh.a(this, wVar, i10);
    }

    @Override
    public final int e(g5.j jVar, int i10, boolean z4) {
        int i11 = this.f47979e + i10;
        byte[] bArr = this.d;
        if (bArr.length < i11) {
            this.d = Arrays.copyOf(bArr, (i11 / 2) + i11);
        }
        int read = jVar.read(this.d, this.f47979e, i10);
        if (read == -1) {
            if (z4) {
                return -1;
            }
            throw new EOFException();
        }
        this.f47979e += read;
        return read;
    }
}
