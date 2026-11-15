package qi;

import com.google.android.gms.internal.play_billing.s0;
public final class l {
    public final ji.j f55619a;
    public final long f55620b;

    public l(n nVar, ji.j jVar) {
        long length;
        long j3;
        this.f55619a = jVar;
        long length2 = ((nVar.f55622b.length() + nVar.f55621a.length()) * 2) + 128;
        s0 s0Var = (s0) jVar.f17555b;
        if (s0Var == null) {
            j3 = 1024;
        } else {
            long length3 = (((int[]) s0Var.f6845c).length * 4) + 64;
            if (((int[]) s0Var.f6844b) == null) {
                length = 0;
            } else {
                length = ((int[]) s0Var.f6844b).length * 4;
            }
            j3 = length + length3;
        }
        this.f55620b = length2 + j3;
    }
}
