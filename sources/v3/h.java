package v3;

import d5.z;
import h3.s0;
import h3.t0;
import h7.t;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.i6;

public final class h extends i {

    public static final byte[] f48764o = {79, 112, 117, 115, 72, 101, 97, 100};

    public static final byte[] f48765p = {79, 112, 117, 115, 84, 97, 103, 115};

    public boolean f48766n;

    public static boolean e(z zVar, byte[] bArr) {
        if (zVar.a() < bArr.length) {
            return false;
        }
        int i10 = zVar.f4859b;
        byte[] bArr2 = new byte[bArr.length];
        zVar.c(0, bArr.length, bArr2);
        zVar.C(i10);
        return Arrays.equals(bArr2, bArr);
    }

    @Override
    public final long b(z zVar) {
        byte[] bArr = zVar.f4858a;
        return (((long) this.f48773i) * j3.b.e(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override
    public final boolean c(z zVar, long j10, i6 i6Var) {
        if (e(zVar, f48764o)) {
            byte[] bArrCopyOf = Arrays.copyOf(zVar.f4858a, zVar.f4860c);
            int i10 = bArrCopyOf[9] & 255;
            ArrayList arrayListA = j3.b.a(bArrCopyOf);
            if (((t0) i6Var.f38984b) == null) {
                s0 s0Var = new s0();
                s0Var.f8135o = "audio/opus";
                s0Var.B = i10;
                s0Var.C = 48000;
                s0Var.f8137q = arrayListA;
                i6Var.f38984b = new t0(s0Var);
                return true;
            }
        } else {
            if (!e(zVar, f48765p)) {
                d5.a.j((t0) i6Var.f38984b);
                return false;
            }
            d5.a.j((t0) i6Var.f38984b);
            if (!this.f48766n) {
                this.f48766n = true;
                zVar.D(8);
                z3.c cVarA = t.a(p8.z.v(t.b(zVar, false, false).f17646a));
                if (cVarA != null) {
                    s0 s0VarA = ((t0) i6Var.f38984b).a();
                    s0VarA.f8129i = cVarA.a(((t0) i6Var.f38984b).f8191s);
                    i6Var.f38984b = new t0(s0VarA);
                    return true;
                }
            }
        }
        return true;
    }

    @Override
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f48766n = false;
        }
    }
}
