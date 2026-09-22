package x3;

import b2.p0;
import b2.r;
import b2.r0;
import b2.s;
import e2.v;
import e9.i0;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.Cells.f3;
public final class h extends i {
    public static final byte[] f45560o = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] f45561p = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean f45562n;

    public static boolean e(v vVar, byte[] bArr) {
        if (vVar.a() < bArr.length) {
            return false;
        }
        int i10 = vVar.f7934b;
        byte[] bArr2 = new byte[bArr.length];
        vVar.h(0, bArr.length, bArr2);
        vVar.J(i10);
        return Arrays.equals(bArr2, bArr);
    }

    @Override
    public final long b(v vVar) {
        byte[] bArr = vVar.f7933a;
        byte b10 = 0;
        byte b11 = bArr[0];
        if (bArr.length > 1) {
            b10 = bArr[1];
        }
        return (this.f45568i * c3.b.k(b11, b10)) / 1000000;
    }

    @Override
    public final boolean c(v vVar, long j3, f3 f3Var) {
        if (e(vVar, f45560o)) {
            byte[] copyOf = Arrays.copyOf(vVar.f7933a, vVar.f7935c);
            int i10 = copyOf[9] & 255;
            ArrayList a2 = c3.b.a(copyOf);
            if (((s) f3Var.f20284b) == null) {
                r rVar = new r();
                rVar.f3251p = r0.n("audio/ogg");
                rVar.f3252q = r0.n("audio/opus");
                rVar.I = i10;
                rVar.J = 48000;
                rVar.f3255t = a2;
                f3Var.f20284b = new s(rVar);
                return true;
            }
        } else if (e(vVar, f45561p)) {
            e2.d.h((s) f3Var.f20284b);
            if (!this.f45562n) {
                this.f45562n = true;
                vVar.K(8);
                p0 r10 = c3.b.r(i0.w(c3.b.v(vVar, false, false).f3779a));
                if (r10 != null) {
                    r a10 = ((s) f3Var.f20284b).a();
                    a10.f3246k = r10.b(((s) f3Var.f20284b).f3302l);
                    f3Var.f20284b = new s(a10);
                    return true;
                }
            }
        } else {
            e2.d.h((s) f3Var.f20284b);
            return false;
        }
        return true;
    }

    @Override
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f45562n = false;
        }
    }
}
