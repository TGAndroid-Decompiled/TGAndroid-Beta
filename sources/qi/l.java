package qi;

import com.google.android.gms.internal.play_billing.s0;
public final class l {
    public final j6.k f56316a;
    public final long f56317b;

    public l(n nVar, j6.k kVar) {
        long length;
        long j3;
        this.f56316a = kVar;
        long length2 = ((nVar.f56319b.length() + nVar.f56318a.length()) * 2) + 128;
        s0 s0Var = (s0) kVar.f17343b;
        if (s0Var == null) {
            j3 = 1024;
        } else {
            long length3 = (((int[]) s0Var.f7119c).length * 4) + 64;
            if (((int[]) s0Var.f7118b) == null) {
                length = 0;
            } else {
                length = ((int[]) s0Var.f7118b).length * 4;
            }
            j3 = length + length3;
        }
        this.f56317b = length2 + j3;
    }
}
