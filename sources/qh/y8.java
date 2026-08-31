package qh;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.camera.CameraController;
public final class y8 implements p5 {
    public final ca f46362a;

    public y8(ca caVar) {
        this.f46362a = caVar;
    }

    public final void a() {
        ca caVar = this.f46362a;
        ArrayList<s6> content = caVar.f45150x0.getContent();
        int i10 = 0;
        if (content.size() == 1) {
            caVar.H1 = content.get(0);
        } else {
            caVar.H1 = s6.a(caVar.f45150x0.getLayout(), caVar.f45150x0.getContent());
        }
        s6 s6Var = caVar.H1;
        if (s6Var != null && s6Var.K) {
            i10 = 1;
        }
        caVar.L1 = i10;
        v8 v8Var = caVar.N0;
        if (v8Var != null) {
            v8Var.a(i10);
        }
        f8.a(caVar.f45081c, caVar.H1);
        caVar.K(1, true);
    }

    public final void b() {
        ArrayList arrayList;
        ca caVar = this.f46362a;
        g9 g9Var = caVar.f45154y0;
        if (g9Var != null && !caVar.P1 && !caVar.M1 && g9Var.isInited()) {
            ca caVar2 = this.f46362a;
            if (caVar2.f45082c0 == 0) {
                f3 f3Var = caVar2.f45106j1;
                if (f3Var != null) {
                    f3Var.e(true);
                }
                if (this.f46362a.q0() && (arrayList = this.f46362a.f45131r2) != null && !arrayList.isEmpty()) {
                    ca caVar3 = this.f46362a;
                    ApplicationLoader.applicationContext.getSharedPreferences("camera", 0).edit().putString("flashMode", (String) caVar3.f45131r2.get(caVar3.f45127q2)).commit();
                }
                this.f46362a.f45154y0.switchCamera();
                ca.a0(this.f46362a.f45154y0.isFrontface());
                if (this.f46362a.q0()) {
                    this.f46362a.f45132s.c(null);
                } else {
                    this.f46362a.f45132s.d();
                }
            }
        }
    }

    public final void c() {
        g9 g9Var;
        ca caVar = this.f46362a;
        if (!caVar.M1 && !caVar.P1 && caVar.f45082c0 == 0 && (g9Var = caVar.f45154y0) != null && g9Var.isInited()) {
            caVar.T0.e(true);
            File file = caVar.D1;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                caVar.D1 = null;
            }
            n5 n5Var = caVar.f45157z0;
            if (n5Var != null) {
                n5Var.c(true);
            }
            caVar.D1 = s6.w(caVar.f45081c, "jpg");
            caVar.M1 = true;
            caVar.p();
            caVar.Z1 = false;
            if (caVar.f45154y0.isFrontface() && caVar.f45127q2 == 1) {
                ca.a(caVar);
            }
            if (caVar.q0()) {
                d2 d2Var = caVar.f45132s;
                org.telegram.ui.web.d1 d1Var = new org.telegram.ui.web.d1(this, 12);
                d2Var.h(d2Var.f45194p);
                d2Var.e(1.0f, 320L, new z1(d2Var, d1Var, 0));
                return;
            }
            g(null);
        }
    }

    public final void d(boolean z4) {
        long j10;
        ca caVar = this.f46362a;
        if (!caVar.O1 && caVar.N1) {
            caVar.O1 = true;
            w8 w8Var = new w8(this, 0);
            if (z4) {
                j10 = 0;
            } else {
                j10 = 400;
            }
            AndroidUtilities.runOnUIThread(w8Var, j10);
        }
    }

    public final void e(Runnable runnable, boolean z4) {
        g9 g9Var;
        ca caVar = this.f46362a;
        if (!caVar.N1 && !caVar.O1 && !caVar.P1 && caVar.f45082c0 == 0 && (g9Var = caVar.f45154y0) != null && g9Var.getCameraSession() != null) {
            f3 f3Var = caVar.f45103i1;
            if (f3Var != null) {
                f3Var.e(true);
            }
            f3 f3Var2 = caVar.f45106j1;
            if (f3Var2 != null) {
                f3Var2.e(true);
            }
            caVar.T0.e(true);
            caVar.N1 = true;
            n5 n5Var = caVar.f45157z0;
            if (n5Var != null) {
                n5Var.c(true);
            }
            File file = caVar.D1;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                caVar.D1 = null;
            }
            caVar.D1 = s6.x(caVar.f45081c, true);
            caVar.p();
            caVar.Z1 = false;
            if (caVar.f45154y0.isFrontface() && caVar.f45127q2 == 1) {
                ca.a(caVar);
            }
            if (caVar.q0()) {
                caVar.f45132s.c(new x8(this, z4, runnable));
            } else {
                f(runnable, z4);
            }
        }
    }

    public final void f(Runnable runnable, boolean z4) {
        boolean z10;
        ca caVar = this.f46362a;
        if (caVar.f45154y0 != null) {
            CameraController.getInstance().recordVideo(caVar.f45154y0.getCameraSessionObject(), caVar.D1, false, new mh.m5(this, 29), new x8(this, runnable, z4), caVar.f45154y0, true);
            boolean z11 = true;
            if (caVar.L1 != 1) {
                caVar.L1 = 1;
                caVar.F0.a(false, true);
                if (caVar.L1 == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                caVar.i0(z10, true);
                caVar.N0.a(caVar.L1);
                r5 r5Var = caVar.L0;
                if (caVar.L1 != 1) {
                    z11 = false;
                }
                r5Var.f45961k0 = -1.0f;
                r5Var.f45962l0 = z11;
                r5Var.invalidate();
            }
        }
    }

    public final void g(org.telegram.messenger.Utilities.Callback r9) {
        throw new UnsupportedOperationException("Method not decompiled: qh.y8.g(org.telegram.messenger.Utilities$Callback):void");
    }
}
