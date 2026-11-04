package q2;

import d2.u;
import d2.u0;
import d2.v;
import e3.h0;
import e3.i0;
import g2.y;
import j$.util.Objects;
import java.io.EOFException;
import java.util.Arrays;
import k2.p1;
public final class o implements i0 {
    public static final v f53734f;
    public static final v f53735g;
    public final i0 f53736a;
    public final v f53737b;
    public v f53738c;
    public byte[] d;
    public int f53739e;

    static {
        u uVar = new u();
        uVar.f8431r = u0.n("application/id3");
        f53734f = new v(uVar);
        u uVar2 = new u();
        uVar2.f8431r = u0.n("application/x-emsg");
        f53735g = new v(uVar2);
    }

    public o(i0 i0Var, int i3) {
        this.f53736a = i0Var;
        if (i3 != 1) {
            if (i3 == 3) {
                this.f53737b = f53735g;
            } else {
                throw new IllegalArgumentException(p1.i(i3, "Unknown metadataType: "));
            }
        } else {
            this.f53737b = f53734f;
        }
        this.d = new byte[0];
        this.f53739e = 0;
    }

    @Override
    public final int a(d2.o oVar, int i3, boolean z10) {
        return c(oVar, i3, z10);
    }

    @Override
    public final int c(d2.o oVar, int i3, boolean z10) {
        int i10 = this.f53739e + i3;
        byte[] bArr = this.d;
        if (bArr.length < i10) {
            this.d = Arrays.copyOf(bArr, (i10 / 2) + i10);
        }
        int read = oVar.read(this.d, this.f53739e, i3);
        if (read == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        this.f53739e += read;
        return read;
    }

    @Override
    public final void d(long j10, int i3, int i10, int i11, h0 h0Var) {
        this.f53738c.getClass();
        int i12 = this.f53739e - i11;
        y yVar = new y(Arrays.copyOfRange(this.d, i12 - i10, i12));
        byte[] bArr = this.d;
        System.arraycopy(bArr, i12, bArr, 0, i11);
        this.f53739e = i11;
        String str = this.f53738c.f8489s;
        v vVar = this.f53737b;
        String str2 = vVar.f8489s;
        String str3 = vVar.f8489s;
        if (!Objects.equals(str, str2)) {
            if ("application/x-emsg".equals(this.f53738c.f8489s)) {
                p3.a c2 = o3.b.c(yVar);
                v b10 = c2.b();
                if (b10 != null && Objects.equals(str3, b10.f8489s)) {
                    byte[] c10 = c2.c();
                    c10.getClass();
                    yVar = new y(c10);
                } else {
                    v b11 = c2.b();
                    g2.a.l("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str3 + " but actual wrapped format: " + b11);
                    return;
                }
            } else {
                g2.a.l("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f53738c.f8489s);
                return;
            }
        }
        int a10 = yVar.a();
        i0 i0Var = this.f53736a;
        i0Var.e(a10, yVar);
        i0Var.d(j10, i3, a10, 0, h0Var);
    }

    @Override
    public final void e(int i3, y yVar) {
        com.google.android.recaptcha.internal.a.a(this, yVar, i3);
    }

    @Override
    public final void f(y yVar, int i3, int i10) {
        int i11 = this.f53739e + i3;
        byte[] bArr = this.d;
        if (bArr.length < i11) {
            this.d = Arrays.copyOf(bArr, (i11 / 2) + i11);
        }
        yVar.k(this.f53739e, i3, this.d);
        this.f53739e += i3;
    }

    @Override
    public final void g(v vVar) {
        this.f53738c = vVar;
        this.f53736a.g(this.f53737b);
    }

    @Override
    public final void b(long j10) {
    }
}
