package x3;

import b2.p0;
import b2.r;
import b2.r0;
import b2.s;
import e2.v;
import e9.i0;
import java.util.ArrayList;
import java.util.Arrays;
import n7.z0;
public final class h extends i {
    public static final byte[] f48827o = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] f48828p = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean f48829n;

    public static boolean e(v vVar, byte[] bArr) {
        if (vVar.a() < bArr.length) {
            return false;
        }
        int i10 = vVar.f8818b;
        byte[] bArr2 = new byte[bArr.length];
        vVar.h(0, bArr.length, bArr2);
        vVar.J(i10);
        return Arrays.equals(bArr2, bArr);
    }

    @Override
    public final long b(v vVar) {
        byte[] bArr = vVar.f8817a;
        byte b10 = 0;
        byte b11 = bArr[0];
        if (bArr.length > 1) {
            b10 = bArr[1];
        }
        return (this.f48836i * c3.b.k(b11, b10)) / 1000000;
    }

    @Override
    public final boolean c(v vVar, long j3, z0 z0Var) {
        if (e(vVar, f48827o)) {
            byte[] copyOf = Arrays.copyOf(vVar.f8817a, vVar.f8819c);
            int i10 = copyOf[9] & 255;
            ArrayList a2 = c3.b.a(copyOf);
            if (((s) z0Var.f16730b) == null) {
                r rVar = new r();
                rVar.f2338p = r0.n("audio/ogg");
                rVar.f2339q = r0.n("audio/opus");
                rVar.I = i10;
                rVar.J = 48000;
                rVar.f2342t = a2;
                z0Var.f16730b = new s(rVar);
                return true;
            }
        } else if (e(vVar, f48828p)) {
            e2.d.h((s) z0Var.f16730b);
            if (!this.f48829n) {
                this.f48829n = true;
                vVar.K(8);
                p0 r10 = c3.b.r(i0.w(c3.b.v(vVar, false, false).f4302a));
                if (r10 != null) {
                    r a10 = ((s) z0Var.f16730b).a();
                    a10.f2333k = r10.b(((s) z0Var.f16730b).f2391l);
                    z0Var.f16730b = new s(a10);
                    return true;
                }
            }
        } else {
            e2.d.h((s) z0Var.f16730b);
            return false;
        }
        return true;
    }

    @Override
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f48829n = false;
        }
    }
}
