package qi;

import com.google.android.gms.internal.play_billing.s0;
public final class l {
    public final ji.k f56203a;
    public final long f56204b;

    public l(n nVar, ji.k kVar) {
        long length;
        long j3;
        this.f56203a = kVar;
        long length2 = ((nVar.f56206b.length() + nVar.f56205a.length()) * 2) + 128;
        s0 s0Var = (s0) kVar.f17942b;
        if (s0Var == null) {
            j3 = 1024;
        } else {
            long length3 = (((int[]) s0Var.f7120c).length * 4) + 64;
            if (((int[]) s0Var.f7119b) == null) {
                length = 0;
            } else {
                length = ((int[]) s0Var.f7119b).length * 4;
            }
            j3 = length + length3;
        }
        this.f56204b = length2 + j3;
    }
}
