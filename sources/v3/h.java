package v3;

import d5.y;
import g7.t;
import h3.s0;
import h3.t0;
import java.util.ArrayList;
import java.util.Arrays;
import o8.z;
import org.telegram.ui.Cells.e3;
public final class h extends i {
    public static final byte[] f48337o = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] f48338p = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean f48339n;

    public static boolean e(y yVar, byte[] bArr) {
        if (yVar.a() < bArr.length) {
            return false;
        }
        int i9 = yVar.f4411b;
        byte[] bArr2 = new byte[bArr.length];
        yVar.c(0, bArr.length, bArr2);
        yVar.C(i9);
        return Arrays.equals(bArr2, bArr);
    }

    @Override
    public final long b(y yVar) {
        byte[] bArr = yVar.f4410a;
        byte b10 = 0;
        byte b11 = bArr[0];
        if (bArr.length > 1) {
            b10 = bArr[1];
        }
        return (this.f48346i * j3.b.e(b11, b10)) / 1000000;
    }

    @Override
    public final boolean c(y yVar, long j10, e3 e3Var) {
        if (e(yVar, f48337o)) {
            byte[] copyOf = Arrays.copyOf(yVar.f4410a, yVar.f4412c);
            int i9 = copyOf[9] & 255;
            ArrayList a2 = j3.b.a(copyOf);
            if (((t0) e3Var.f24286b) == null) {
                s0 s0Var = new s0();
                s0Var.f9705o = "audio/opus";
                s0Var.B = i9;
                s0Var.C = 48000;
                s0Var.f9707q = a2;
                e3Var.f24286b = new t0(s0Var);
                return true;
            }
        } else if (e(yVar, f48338p)) {
            d5.a.j((t0) e3Var.f24286b);
            if (!this.f48339n) {
                this.f48339n = true;
                yVar.D(8);
                z3.c a3 = t.a(z.v(t.b(yVar, false, false).f17270a));
                if (a3 != null) {
                    s0 a10 = ((t0) e3Var.f24286b).a();
                    a10.f9699i = a3.a(((t0) e3Var.f24286b).f9767s);
                    e3Var.f24286b = new t0(a10);
                    return true;
                }
            }
        } else {
            d5.a.j((t0) e3Var.f24286b);
            return false;
        }
        return true;
    }

    @Override
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f48339n = false;
        }
    }
}
