package t4;

import h5.d0;
import h5.w;
import j3.m0;
import j3.n0;
import java.io.EOFException;
import java.util.Arrays;
import org.telegram.ui.yh;
public final class p implements r3.v {
    public static final n0 f47938f;
    public static final n0 f47939g;
    public final r3.v f47940a;
    public final n0 f47941b;
    public n0 f47942c;
    public byte[] d;
    public int f47943e;

    static {
        m0 m0Var = new m0();
        m0Var.f9265o = "application/id3";
        f47938f = new n0(m0Var);
        m0 m0Var2 = new m0();
        m0Var2.f9265o = "application/x-emsg";
        f47939g = new n0(m0Var2);
    }

    public p(r3.v vVar, int i10) {
        this.f47940a = vVar;
        if (i10 != 1) {
            if (i10 == 3) {
                this.f47941b = f47939g;
            } else {
                throw new IllegalArgumentException(l.d.j(i10, "Unknown metadataType: "));
            }
        } else {
            this.f47941b = f47938f;
        }
        this.d = new byte[0];
        this.f47943e = 0;
    }

    @Override
    public final void a(int i10, w wVar) {
        int i11 = this.f47943e + i10;
        byte[] bArr = this.d;
        if (bArr.length < i11) {
            this.d = Arrays.copyOf(bArr, (i11 / 2) + i11);
        }
        wVar.e(this.f47943e, i10, this.d);
        this.f47943e += i10;
    }

    @Override
    public final void b(n0 n0Var) {
        this.f47942c = n0Var;
        this.f47940a.b(this.f47941b);
    }

    @Override
    public final void c(long j10, int i10, int i11, int i12, r3.u uVar) {
        this.f47942c.getClass();
        int i13 = this.f47943e - i12;
        w wVar = new w(Arrays.copyOfRange(this.d, i13 - i11, i13));
        byte[] bArr = this.d;
        System.arraycopy(bArr, i13, bArr, 0, i12);
        this.f47943e = i12;
        String str = this.f47942c.C;
        n0 n0Var = this.f47941b;
        String str2 = n0Var.C;
        String str3 = n0Var.C;
        if (!d0.a(str, str2)) {
            if ("application/x-emsg".equals(this.f47942c.C)) {
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
                h5.a.K("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f47942c.C);
                return;
            }
        }
        int a2 = wVar.a();
        r3.v vVar = this.f47940a;
        vVar.d(a2, wVar);
        vVar.c(j10, i10, a2, i12, uVar);
    }

    @Override
    public final void d(int i10, w wVar) {
        yh.a(this, wVar, i10);
    }

    @Override
    public final int e(g5.j jVar, int i10, boolean z4) {
        int i11 = this.f47943e + i10;
        byte[] bArr = this.d;
        if (bArr.length < i11) {
            this.d = Arrays.copyOf(bArr, (i11 / 2) + i11);
        }
        int read = jVar.read(this.d, this.f47943e, i10);
        if (read == -1) {
            if (z4) {
                return -1;
            }
            throw new EOFException();
        }
        this.f47943e += read;
        return read;
    }
}
