package qi;

import com.google.android.gms.internal.play_billing.s0;
public final class l {
    public final ji.j f56193a;
    public final long f56194b;

    public l(n nVar, ji.j jVar) {
        long length;
        long j3;
        this.f56193a = jVar;
        long length2 = ((nVar.f56196b.length() + nVar.f56195a.length()) * 2) + 128;
        s0 s0Var = (s0) jVar.f17948b;
        if (s0Var == null) {
            j3 = 1024;
        } else {
            long length3 = (((int[]) s0Var.f7128c).length * 4) + 64;
            if (((int[]) s0Var.f7127b) == null) {
                length = 0;
            } else {
                length = ((int[]) s0Var.f7127b).length * 4;
            }
            j3 = length + length3;
        }
        this.f56194b = length2 + j3;
    }
}
