package r2;

import com.google.android.gms.internal.vision.e2;
import e2.s0;
import e2.t;
import e2.u;
import f3.h0;
import f3.i0;
import h2.x;
import j$.util.Objects;
import java.io.EOFException;
import java.util.Arrays;
public final class n implements i0 {
    public static final u f56448f;
    public static final u f56449g;
    public final i0 f56450a;
    public final u f56451b;
    public u f56452c;
    public byte[] d;
    public int f56453e;

    static {
        t tVar = new t();
        tVar.f10746r = s0.n("application/id3");
        f56448f = new u(tVar);
        t tVar2 = new t();
        tVar2.f10746r = s0.n("application/x-emsg");
        f56449g = new u(tVar2);
    }

    public n(i0 i0Var, int i7) {
        this.f56450a = i0Var;
        if (i7 != 1) {
            if (i7 == 3) {
                this.f56451b = f56449g;
            } else {
                throw new IllegalArgumentException(i5.c.i(i7, "Unknown metadataType: "));
            }
        } else {
            this.f56451b = f56448f;
        }
        this.d = new byte[0];
        this.f56453e = 0;
    }

    @Override
    public final void a(x xVar, int i7, int i10) {
        int i11 = this.f56453e + i7;
        byte[] bArr = this.d;
        if (bArr.length < i11) {
            this.d = Arrays.copyOf(bArr, (i11 / 2) + i11);
        }
        xVar.k(this.f56453e, i7, this.d);
        this.f56453e += i7;
    }

    @Override
    public final void b(int i7, x xVar) {
        e2.a(this, xVar, i7);
    }

    @Override
    public final void c(long j3, int i7, int i10, int i11, h0 h0Var) {
        this.f56452c.getClass();
        int i12 = this.f56453e - i11;
        x xVar = new x(Arrays.copyOfRange(this.d, i12 - i10, i12));
        byte[] bArr = this.d;
        System.arraycopy(bArr, i12, bArr, 0, i11);
        this.f56453e = i11;
        String str = this.f56452c.f10798s;
        u uVar = this.f56451b;
        String str2 = uVar.f10798s;
        String str3 = uVar.f10798s;
        if (!Objects.equals(str, str2)) {
            if ("application/x-emsg".equals(this.f56452c.f10798s)) {
                q3.a c10 = p3.b.c(xVar);
                u a10 = c10.a();
                if (a10 != null && Objects.equals(str3, a10.f10798s)) {
                    byte[] c11 = c10.c();
                    c11.getClass();
                    xVar = new x(c11);
                } else {
                    u a11 = c10.a();
                    h2.a.l("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str3 + " but actual wrapped format: " + a11);
                    return;
                }
            } else {
                h2.a.l("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f56452c.f10798s);
                return;
            }
        }
        int a12 = xVar.a();
        i0 i0Var = this.f56450a;
        i0Var.b(a12, xVar);
        i0Var.c(j3, i7, a12, 0, h0Var);
    }

    @Override
    public final int e(e2.n nVar, int i7, boolean z10) {
        return f(nVar, i7, z10);
    }

    @Override
    public final int f(e2.n nVar, int i7, boolean z10) {
        int i10 = this.f56453e + i7;
        byte[] bArr = this.d;
        if (bArr.length < i10) {
            this.d = Arrays.copyOf(bArr, (i10 / 2) + i10);
        }
        int read = nVar.read(this.d, this.f56453e, i7);
        if (read == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        this.f56453e += read;
        return read;
    }

    @Override
    public final void g(u uVar) {
        this.f56452c = uVar;
        this.f56450a.g(this.f56451b);
    }

    @Override
    public final void d(long j3) {
    }
}
