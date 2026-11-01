package th;

import j$.util.Objects;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.at;
import org.telegram.messenger.voip.NativeInstance;
public final class n0 implements Runnable {
    public final int f49260a;
    public final s0 f49261b;

    public n0(s0 s0Var, int i10) {
        this.f49260a = i10;
        this.f49261b = s0Var;
    }

    @Override
    public final void run() {
        switch (this.f49260a) {
            case 0:
                this.f49261b.p();
                return;
            case 1:
                this.f49261b.q();
                return;
            case 2:
                this.f49261b.t(true);
                return;
            case 3:
                s0 s0Var = this.f49261b;
                at.f(s0Var.e).k(176, Long.valueOf(s0Var.f49440w.f19804id));
                s0Var.u(true);
                return;
            case 4:
                this.f49261b.w();
                return;
            case 5:
                this.f49261b.t(true);
                return;
            case 6:
                s0 s0Var2 = this.f49261b;
                if (s0Var2.E != null) {
                    org.telegram.messenger.r5 r5Var = Utilities.e;
                    NativeInstance nativeInstance = s0Var2.E;
                    Objects.requireNonNull(nativeInstance);
                    r5Var.c(new org.telegram.messenger.voip.v0(nativeInstance, 3));
                    s0Var2.M.clear();
                    s0Var2.E = null;
                }
                s0Var2.k();
                return;
            case 7:
                this.f49261b.t(true);
                return;
            case 8:
                this.f49261b.t(true);
                return;
            case 9:
                s0 s0Var3 = this.f49261b;
                if (s0Var3.E != null) {
                    org.telegram.messenger.r5 r5Var2 = Utilities.e;
                    NativeInstance nativeInstance2 = s0Var3.E;
                    Objects.requireNonNull(nativeInstance2);
                    r5Var2.c(new org.telegram.messenger.voip.v0(nativeInstance2, 3));
                    s0Var3.M.clear();
                    s0Var3.E = null;
                }
                s0Var3.k();
                return;
            case 10:
                this.f49261b.p();
                return;
            case 11:
                this.f49261b.q();
                return;
            default:
                s0 s0Var4 = this.f49261b;
                if (!s0Var4.f49437n) {
                    w7.c6.b(new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, new ph.h1(s0Var4, 14));
                    return;
                }
                return;
        }
    }
}
