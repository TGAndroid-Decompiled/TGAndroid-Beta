package th;

import j$.util.Objects;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.zs;
public final class n0 implements Runnable {
    public final int f49246a;
    public final s0 f49247b;

    public n0(s0 s0Var, int i10) {
        this.f49246a = i10;
        this.f49247b = s0Var;
    }

    @Override
    public final void run() {
        switch (this.f49246a) {
            case 0:
                this.f49247b.p();
                return;
            case 1:
                this.f49247b.q();
                return;
            case 2:
                this.f49247b.t(true);
                return;
            case 3:
                s0 s0Var = this.f49247b;
                zs.f(s0Var.e).k(176, Long.valueOf(s0Var.f49426w.f19803id));
                s0Var.u(true);
                return;
            case 4:
                this.f49247b.w();
                return;
            case 5:
                this.f49247b.t(true);
                return;
            case 6:
                s0 s0Var2 = this.f49247b;
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
                this.f49247b.t(true);
                return;
            case 8:
                this.f49247b.t(true);
                return;
            case 9:
                s0 s0Var3 = this.f49247b;
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
                this.f49247b.p();
                return;
            case 11:
                this.f49247b.q();
                return;
            default:
                s0 s0Var4 = this.f49247b;
                if (!s0Var4.f49423n) {
                    w7.c6.b(new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, new ph.h1(s0Var4, 14));
                    return;
                }
                return;
        }
    }
}
