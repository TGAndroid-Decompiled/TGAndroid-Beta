package x3;

import b2.p0;
import b2.r;
import b2.r0;
import b2.s;
import e2.v;
import e9.i0;
import java.util.ArrayList;
import java.util.Arrays;
import n6.k;
public final class h extends i {
    public static final byte[] f50661o = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] f50662p = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean f50663n;

    public static boolean e(v vVar, byte[] bArr) {
        if (vVar.a() < bArr.length) {
            return false;
        }
        int i10 = vVar.f8584b;
        byte[] bArr2 = new byte[bArr.length];
        vVar.h(0, bArr.length, bArr2);
        vVar.J(i10);
        return Arrays.equals(bArr2, bArr);
    }

    @Override
    public final long b(v vVar) {
        byte[] bArr = vVar.f8583a;
        byte b10 = 0;
        byte b11 = bArr[0];
        if (bArr.length > 1) {
            b10 = bArr[1];
        }
        return (this.f50670i * c3.b.k(b11, b10)) / 1000000;
    }

    @Override
    public final boolean c(v vVar, long j3, k kVar) {
        if (e(vVar, f50661o)) {
            byte[] copyOf = Arrays.copyOf(vVar.f8583a, vVar.f8585c);
            int i10 = copyOf[9] & 255;
            ArrayList a2 = c3.b.a(copyOf);
            if (((s) kVar.f16729b) == null) {
                r rVar = new r();
                rVar.f3584p = r0.n("audio/ogg");
                rVar.f3585q = r0.n("audio/opus");
                rVar.I = i10;
                rVar.J = 48000;
                rVar.f3588t = a2;
                kVar.f16729b = new s(rVar);
                return true;
            }
        } else if (e(vVar, f50662p)) {
            e2.d.h((s) kVar.f16729b);
            if (!this.f50663n) {
                this.f50663n = true;
                vVar.K(8);
                p0 r10 = c3.b.r(i0.w((String[]) c3.b.v(vVar, false, false).f297b));
                if (r10 != null) {
                    r a10 = ((s) kVar.f16729b).a();
                    a10.f3579k = r10.b(((s) kVar.f16729b).f3637l);
                    kVar.f16729b = new s(a10);
                    return true;
                }
            }
        } else {
            e2.d.h((s) kVar.f16729b);
            return false;
        }
        return true;
    }

    @Override
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f50663n = false;
        }
    }
}
