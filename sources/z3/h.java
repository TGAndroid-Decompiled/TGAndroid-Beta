package z3;

import d2.s0;
import d2.u;
import d2.u0;
import d2.v;
import g2.y;
import g9.i0;
import h2.o;
import java.util.ArrayList;
import java.util.Arrays;
public final class h extends i {
    public static final byte[] f59676o = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] f59677p = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean f59678n;

    public static boolean e(y yVar, byte[] bArr) {
        if (yVar.a() < bArr.length) {
            return false;
        }
        int i3 = yVar.f11924b;
        byte[] bArr2 = new byte[bArr.length];
        yVar.k(0, bArr.length, bArr2);
        yVar.N(i3);
        return Arrays.equals(bArr2, bArr);
    }

    @Override
    public final long b(y yVar) {
        byte[] bArr = yVar.f11923a;
        byte b10 = 0;
        byte b11 = bArr[0];
        if (bArr.length > 1) {
            b10 = bArr[1];
        }
        return (this.f59685i * o.e(b11, b10)) / 1000000;
    }

    @Override
    public final boolean c(y yVar, long j10, ua.b bVar) {
        if (e(yVar, f59676o)) {
            byte[] copyOf = Arrays.copyOf(yVar.f11923a, yVar.f11925c);
            int i3 = copyOf[9] & 255;
            ArrayList a10 = o.a(copyOf);
            if (((v) bVar.f55783b) == null) {
                u uVar = new u();
                uVar.f8430q = u0.n("audio/ogg");
                uVar.f8431r = u0.n("audio/opus");
                uVar.J = i3;
                uVar.K = 48000;
                uVar.f8434u = a10;
                bVar.f55783b = new v(uVar);
                return true;
            }
        } else if (e(yVar, f59677p)) {
            ((v) bVar.f55783b).getClass();
            if (!this.f59678n) {
                this.f59678n = true;
                yVar.O(8);
                s0 r5 = e3.b.r(i0.r(e3.b.u(yVar, false, false).f9491a));
                if (r5 != null) {
                    u a11 = ((v) bVar.f55783b).a();
                    a11.f8424k = r5.b(((v) bVar.f55783b).f8482l);
                    bVar.f55783b = new v(a11);
                    return true;
                }
            }
        } else {
            ((v) bVar.f55783b).getClass();
            return false;
        }
        return true;
    }

    @Override
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f59678n = false;
        }
    }
}
