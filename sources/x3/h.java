package x3;

import b2.p0;
import b2.r;
import b2.r0;
import b2.s;
import e2.v;
import e9.i0;
import java.util.ArrayList;
import java.util.Arrays;
import n6.t;
public final class h extends i {
    public static final byte[] f50571o = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] f50572p = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean f50573n;

    public static boolean e(v vVar, byte[] bArr) {
        if (vVar.a() < bArr.length) {
            return false;
        }
        int i10 = vVar.f8585b;
        byte[] bArr2 = new byte[bArr.length];
        vVar.h(0, bArr.length, bArr2);
        vVar.J(i10);
        return Arrays.equals(bArr2, bArr);
    }

    @Override
    public final long b(v vVar) {
        byte[] bArr = vVar.f8584a;
        byte b10 = 0;
        byte b11 = bArr[0];
        if (bArr.length > 1) {
            b10 = bArr[1];
        }
        return (this.f50580i * c3.b.k(b11, b10)) / 1000000;
    }

    @Override
    public final boolean c(v vVar, long j3, t tVar) {
        if (e(vVar, f50571o)) {
            byte[] copyOf = Arrays.copyOf(vVar.f8584a, vVar.f8586c);
            int i10 = copyOf[9] & 255;
            ArrayList a2 = c3.b.a(copyOf);
            if (((s) tVar.f16717b) == null) {
                r rVar = new r();
                rVar.f3584p = r0.n("audio/ogg");
                rVar.f3585q = r0.n("audio/opus");
                rVar.I = i10;
                rVar.J = 48000;
                rVar.f3588t = a2;
                tVar.f16717b = new s(rVar);
                return true;
            }
        } else if (e(vVar, f50572p)) {
            e2.d.h((s) tVar.f16717b);
            if (!this.f50573n) {
                this.f50573n = true;
                vVar.K(8);
                p0 r10 = c3.b.r(i0.w((String[]) c3.b.v(vVar, false, false).f297b));
                if (r10 != null) {
                    r a10 = ((s) tVar.f16717b).a();
                    a10.f3579k = r10.b(((s) tVar.f16717b).f3637l);
                    tVar.f16717b = new s(a10);
                    return true;
                }
            }
        } else {
            e2.d.h((s) tVar.f16717b);
            return false;
        }
        return true;
    }

    @Override
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f50573n = false;
        }
    }
}
