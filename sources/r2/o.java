package r2;

import com.google.android.gms.internal.vision.e2;
import e2.s0;
import e2.u;
import f3.h0;
import f3.i0;
import h2.x;
import j$.util.Objects;
import java.io.EOFException;
import java.util.Arrays;
public final class o implements i0 {
    public static final u f55829f;
    public static final u f55830g;
    public final i0 f55831a;
    public final u f55832b;
    public u f55833c;
    public byte[] d;
    public int f55834e;

    static {
        e2.t tVar = new e2.t();
        tVar.f10399r = s0.n("application/id3");
        f55829f = new u(tVar);
        e2.t tVar2 = new e2.t();
        tVar2.f10399r = s0.n("application/x-emsg");
        f55830g = new u(tVar2);
    }

    public o(i0 i0Var, int i7) {
        this.f55831a = i0Var;
        if (i7 != 1) {
            if (i7 == 3) {
                this.f55832b = f55830g;
            } else {
                throw new IllegalArgumentException(i5.c.i(i7, "Unknown metadataType: "));
            }
        } else {
            this.f55832b = f55829f;
        }
        this.d = new byte[0];
        this.f55834e = 0;
    }

    @Override
    public final void a(x xVar, int i7, int i10) {
        int i11 = this.f55834e + i7;
        byte[] bArr = this.d;
        if (bArr.length < i11) {
            this.d = Arrays.copyOf(bArr, (i11 / 2) + i11);
        }
        xVar.k(this.f55834e, i7, this.d);
        this.f55834e += i7;
    }

    @Override
    public final void b(int i7, x xVar) {
        e2.a(this, xVar, i7);
    }

    @Override
    public final void c(long j3, int i7, int i10, int i11, h0 h0Var) {
        this.f55833c.getClass();
        int i12 = this.f55834e - i11;
        x xVar = new x(Arrays.copyOfRange(this.d, i12 - i10, i12));
        byte[] bArr = this.d;
        System.arraycopy(bArr, i12, bArr, 0, i11);
        this.f55834e = i11;
        String str = this.f55833c.f10451s;
        u uVar = this.f55832b;
        String str2 = uVar.f10451s;
        String str3 = uVar.f10451s;
        if (!Objects.equals(str, str2)) {
            if ("application/x-emsg".equals(this.f55833c.f10451s)) {
                q3.a c10 = p3.b.c(xVar);
                u a10 = c10.a();
                if (a10 != null && Objects.equals(str3, a10.f10451s)) {
                    byte[] c11 = c10.c();
                    c11.getClass();
                    xVar = new x(c11);
                } else {
                    u a11 = c10.a();
                    h2.a.l("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str3 + " but actual wrapped format: " + a11);
                    return;
                }
            } else {
                h2.a.l("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f55833c.f10451s);
                return;
            }
        }
        int a12 = xVar.a();
        i0 i0Var = this.f55831a;
        i0Var.b(a12, xVar);
        i0Var.c(j3, i7, a12, 0, h0Var);
    }

    @Override
    public final int e(e2.n nVar, int i7, boolean z10) {
        return f(nVar, i7, z10);
    }

    @Override
    public final int f(e2.n nVar, int i7, boolean z10) {
        int i10 = this.f55834e + i7;
        byte[] bArr = this.d;
        if (bArr.length < i10) {
            this.d = Arrays.copyOf(bArr, (i10 / 2) + i10);
        }
        int read = nVar.read(this.d, this.f55834e, i7);
        if (read == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        this.f55834e += read;
        return read;
    }

    @Override
    public final void g(u uVar) {
        this.f55833c = uVar;
        this.f55831a.g(this.f55832b);
    }

    @Override
    public final void d(long j3) {
    }
}
