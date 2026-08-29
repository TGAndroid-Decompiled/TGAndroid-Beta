package x3;

import f5.w;
import i7.w5;
import j3.s0;
import j3.t0;
import java.util.ArrayList;
import java.util.Arrays;
import q8.z;
import v5.n;
public final class h extends i {
    public static final byte[] f50075o = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] f50076p = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean f50077n;

    public static boolean e(w wVar, byte[] bArr) {
        if (wVar.a() < bArr.length) {
            return false;
        }
        int i10 = wVar.f6641b;
        byte[] bArr2 = new byte[bArr.length];
        wVar.c(0, bArr.length, bArr2);
        wVar.C(i10);
        return Arrays.equals(bArr2, bArr);
    }

    @Override
    public final long b(w wVar) {
        byte[] bArr = wVar.f6640a;
        byte b10 = 0;
        byte b11 = bArr[0];
        if (bArr.length > 1) {
            b10 = bArr[1];
        }
        return (this.f50084i * l3.b.e(b11, b10)) / 1000000;
    }

    @Override
    public final boolean c(w wVar, long j10, n nVar) {
        if (e(wVar, f50075o)) {
            byte[] copyOf = Arrays.copyOf(wVar.f6640a, wVar.f6642c);
            int i10 = copyOf[9] & 255;
            ArrayList a2 = l3.b.a(copyOf);
            if (((t0) nVar.f49431b) == null) {
                s0 s0Var = new s0();
                s0Var.f10742o = "audio/opus";
                s0Var.B = i10;
                s0Var.C = 48000;
                s0Var.f10744q = a2;
                nVar.f49431b = new t0(s0Var);
                return true;
            }
        } else if (e(wVar, f50076p)) {
            f5.a.j((t0) nVar.f49431b);
            if (!this.f50077n) {
                this.f50077n = true;
                wVar.D(8);
                b4.c a10 = w5.a(z.v(w5.b(wVar, false, false).f19129a));
                if (a10 != null) {
                    s0 a11 = ((t0) nVar.f49431b).a();
                    a11.f10736i = a10.a(((t0) nVar.f49431b).f10804s);
                    nVar.f49431b = new t0(a11);
                    return true;
                }
            }
        } else {
            f5.a.j((t0) nVar.f49431b);
            return false;
        }
        return true;
    }

    @Override
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f50077n = false;
        }
    }
}
