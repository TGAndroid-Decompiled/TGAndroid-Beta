package r2;

import e2.s0;
import e2.u;
import f3.i0;
import f3.j0;
import h2.x;
import j$.util.Objects;
import java.io.EOFException;
import java.util.Arrays;
public final class o implements j0 {
    public static final u f54255f;
    public static final u f54256g;
    public final j0 f54257a;
    public final u f54258b;
    public u f54259c;
    public byte[] d;
    public int f54260e;

    static {
        e2.t tVar = new e2.t();
        tVar.f10563r = s0.n("application/id3");
        f54255f = new u(tVar);
        e2.t tVar2 = new e2.t();
        tVar2.f10563r = s0.n("application/x-emsg");
        f54256g = new u(tVar2);
    }

    public o(j0 j0Var, int i7) {
        this.f54257a = j0Var;
        if (i7 != 1) {
            if (i7 == 3) {
                this.f54258b = f54256g;
            } else {
                throw new IllegalArgumentException(jg.g.j(i7, "Unknown metadataType: "));
            }
        } else {
            this.f54258b = f54255f;
        }
        this.d = new byte[0];
        this.f54260e = 0;
    }

    @Override
    public final void a(x xVar, int i7, int i10) {
        int i11 = this.f54260e + i7;
        byte[] bArr = this.d;
        if (bArr.length < i11) {
            this.d = Arrays.copyOf(bArr, (i11 / 2) + i11);
        }
        xVar.k(this.f54260e, i7, this.d);
        this.f54260e += i7;
    }

    @Override
    public final void b(int i7, x xVar) {
        com.google.android.recaptcha.internal.a.a(this, xVar, i7);
    }

    @Override
    public final void c(long j3, int i7, int i10, int i11, i0 i0Var) {
        this.f54259c.getClass();
        int i12 = this.f54260e - i11;
        x xVar = new x(Arrays.copyOfRange(this.d, i12 - i10, i12));
        byte[] bArr = this.d;
        System.arraycopy(bArr, i12, bArr, 0, i11);
        this.f54260e = i11;
        String str = this.f54259c.f10615s;
        u uVar = this.f54258b;
        String str2 = uVar.f10615s;
        String str3 = uVar.f10615s;
        if (!Objects.equals(str, str2)) {
            if ("application/x-emsg".equals(this.f54259c.f10615s)) {
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
                h2.a.l("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f54259c.f10615s);
                return;
            }
        }
        int a12 = xVar.a();
        j0 j0Var = this.f54257a;
        j0Var.b(a12, xVar);
        j0Var.c(j3, i7, a12, 0, i0Var);
    }

    @Override
    public final int e(e2.n nVar, int i7, boolean z9) {
        return f(nVar, i7, z9);
    }

    @Override
    public final int f(e2.n nVar, int i7, boolean z9) {
        int i10 = this.f54260e + i7;
        byte[] bArr = this.d;
        if (bArr.length < i10) {
            this.d = Arrays.copyOf(bArr, (i10 / 2) + i10);
        }
        int read = nVar.read(this.d, this.f54260e, i7);
        if (read == -1) {
            if (z9) {
                return -1;
            }
            throw new EOFException();
        }
        this.f54260e += read;
        return read;
    }

    @Override
    public final void g(u uVar) {
        this.f54259c = uVar;
        this.f54257a.g(this.f54258b);
    }

    @Override
    public final void d(long j3) {
    }
}
