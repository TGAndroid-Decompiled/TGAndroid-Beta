package qi;

import com.google.android.gms.internal.play_billing.s0;
public final class l {
    public final ji.l f56234a;
    public final long f56235b;

    public l(n nVar, ji.l lVar) {
        long length;
        long j3;
        this.f56234a = lVar;
        long length2 = ((nVar.f56237b.length() + nVar.f56236a.length()) * 2) + 128;
        s0 s0Var = (s0) lVar.f17976b;
        if (s0Var == null) {
            j3 = 1024;
        } else {
            long length3 = (((int[]) s0Var.f7154c).length * 4) + 64;
            if (((int[]) s0Var.f7153b) == null) {
                length = 0;
            } else {
                length = ((int[]) s0Var.f7153b).length * 4;
            }
            j3 = length + length3;
        }
        this.f56235b = length2 + j3;
    }
}
