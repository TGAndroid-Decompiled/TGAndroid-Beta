package r2;

import e2.s0;
import e2.t;
import e2.u;
import f3.i0;
import f3.j0;
import h2.x;
import j$.util.Objects;
import java.io.EOFException;
import java.util.Arrays;
public final class n implements j0 {
    public static final u f54359f;
    public static final u f54360g;
    public final j0 f54361a;
    public final u f54362b;
    public u f54363c;
    public byte[] d;
    public int f54364e;

    static {
        t tVar = new t();
        tVar.f10563r = s0.n("application/id3");
        f54359f = new u(tVar);
        t tVar2 = new t();
        tVar2.f10563r = s0.n("application/x-emsg");
        f54360g = new u(tVar2);
    }

    public n(j0 j0Var, int i7) {
        this.f54361a = j0Var;
        if (i7 != 1) {
            if (i7 == 3) {
                this.f54362b = f54360g;
            } else {
                throw new IllegalArgumentException(jg.g.j(i7, "Unknown metadataType: "));
            }
        } else {
            this.f54362b = f54359f;
        }
        this.d = new byte[0];
        this.f54364e = 0;
    }

    @Override
    public final void a(x xVar, int i7, int i10) {
        int i11 = this.f54364e + i7;
        byte[] bArr = this.d;
        if (bArr.length < i11) {
            this.d = Arrays.copyOf(bArr, (i11 / 2) + i11);
        }
        xVar.k(this.f54364e, i7, this.d);
        this.f54364e += i7;
    }

    @Override
    public final void b(int i7, x xVar) {
        com.google.android.recaptcha.internal.a.a(this, xVar, i7);
    }

    @Override
    public final void c(long j3, int i7, int i10, int i11, i0 i0Var) {
        this.f54363c.getClass();
        int i12 = this.f54364e - i11;
        x xVar = new x(Arrays.copyOfRange(this.d, i12 - i10, i12));
        byte[] bArr = this.d;
        System.arraycopy(bArr, i12, bArr, 0, i11);
        this.f54364e = i11;
        String str = this.f54363c.f10615s;
        u uVar = this.f54362b;
        String str2 = uVar.f10615s;
        String str3 = uVar.f10615s;
        if (!Objects.equals(str, str2)) {
            if ("application/x-emsg".equals(this.f54363c.f10615s)) {
                q3.a c10 = p3.b.c(xVar);
                u a10 = c10.a();
                if (a10 != null && Objects.equals(str3, a10.f10615s)) {
                    byte[] c11 = c10.c();
                    c11.getClass();
                    xVar = new x(c11);
                } else {
                    u a11 = c10.a();
                    h2.a.l("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str3 + " but actual wrapped format: " + a11);
                    return;
                }
            } else {
                h2.a.l("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f54363c.f10615s);
                return;
            }
        }
        int a12 = xVar.a();
        j0 j0Var = this.f54361a;
        j0Var.b(a12, xVar);
        j0Var.c(j3, i7, a12, 0, i0Var);
    }

    @Override
    public final int e(e2.n nVar, int i7, boolean z9) {
        return f(nVar, i7, z9);
    }

    @Override
    public final int f(e2.n nVar, int i7, boolean z9) {
        int i10 = this.f54364e + i7;
        byte[] bArr = this.d;
        if (bArr.length < i10) {
            this.d = Arrays.copyOf(bArr, (i10 / 2) + i10);
        }
        int read = nVar.read(this.d, this.f54364e, i7);
        if (read == -1) {
            if (z9) {
                return -1;
            }
            throw new EOFException();
        }
        this.f54364e += read;
        return read;
    }

    @Override
    public final void g(u uVar) {
        this.f54363c = uVar;
        this.f54361a.g(this.f54362b);
    }

    @Override
    public final void d(long j3) {
    }
}
