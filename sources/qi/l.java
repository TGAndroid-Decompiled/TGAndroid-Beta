package qi;

import com.google.android.gms.internal.play_billing.s0;
public final class l {
    public final ji.l f56238a;
    public final long f56239b;

    public l(n nVar, ji.l lVar) {
        long length;
        long j3;
        this.f56238a = lVar;
        long length2 = ((nVar.f56241b.length() + nVar.f56240a.length()) * 2) + 128;
        s0 s0Var = (s0) lVar.f17979b;
        if (s0Var == null) {
            j3 = 1024;
        } else {
            long length3 = (((int[]) s0Var.f7157c).length * 4) + 64;
            if (((int[]) s0Var.f7156b) == null) {
                length = 0;
            } else {
                length = ((int[]) s0Var.f7156b).length * 4;
            }
            j3 = length + length3;
        }
        this.f56239b = length2 + j3;
    }
}
