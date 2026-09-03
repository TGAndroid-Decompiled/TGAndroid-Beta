package ph;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.camera.CameraController;
public final class a9 implements q5 {
    public final da f41310a;

    public a9(da daVar) {
        this.f41310a = daVar;
    }

    public final void a() {
        da daVar = this.f41310a;
        ArrayList<t6> content = daVar.f41585x0.getContent();
        int i10 = 0;
        if (content.size() == 1) {
            daVar.H1 = content.get(0);
        } else {
            daVar.H1 = t6.a(daVar.f41585x0.getLayout(), daVar.f41585x0.getContent());
        }
        t6 t6Var = daVar.H1;
        if (t6Var != null && t6Var.K) {
            i10 = 1;
        }
        daVar.L1 = i10;
        w8 w8Var = daVar.N0;
        if (w8Var != null) {
            w8Var.a(i10);
        }
        f8.a(daVar.f41517c, daVar.H1);
        daVar.K(1, true);
    }

    public final void b() {
        ArrayList arrayList;
        da daVar = this.f41310a;
        i9 i9Var = daVar.f41589y0;
        if (i9Var != null && !daVar.P1 && !daVar.M1 && i9Var.isInited()) {
            da daVar2 = this.f41310a;
            if (daVar2.f41518c0 == 0) {
                f3 f3Var = daVar2.f41541j1;
                if (f3Var != null) {
                    f3Var.e(true);
                }
                if (this.f41310a.q0() && (arrayList = this.f41310a.f41566r2) != null && !arrayList.isEmpty()) {
                    da daVar3 = this.f41310a;
                    ApplicationLoader.applicationContext.getSharedPreferences("camera", 0).edit().putString("flashMode", (String) daVar3.f41566r2.get(daVar3.f41562q2)).commit();
                }
                this.f41310a.f41589y0.switchCamera();
                da.a0(this.f41310a.f41589y0.isFrontface());
                if (this.f41310a.q0()) {
                    this.f41310a.f41567s.c(null);
                } else {
                    this.f41310a.f41567s.d();
                }
            }
        }
    }

    public final void c() {
        i9 i9Var;
        da daVar = this.f41310a;
        if (!daVar.M1 && !daVar.P1 && daVar.f41518c0 == 0 && (i9Var = daVar.f41589y0) != null && i9Var.isInited()) {
            daVar.T0.e(true);
            File file = daVar.D1;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                daVar.D1 = null;
            }
            o5 o5Var = daVar.f41592z0;
            if (o5Var != null) {
                o5Var.c(true);
            }
            daVar.D1 = t6.w(daVar.f41517c, "jpg");
            daVar.M1 = true;
            daVar.p();
            daVar.Z1 = false;
            if (daVar.f41589y0.isFrontface() && daVar.f41562q2 == 1) {
                da.a(daVar);
            }
            if (daVar.q0()) {
                d2 d2Var = daVar.f41567s;
                org.telegram.ui.web.a1 a1Var = new org.telegram.ui.web.a1(this, 12);
                d2Var.h(d2Var.f41483p);
                d2Var.e(1.0f, 320L, new z1(d2Var, a1Var, 0));
                return;
            }
            g(null);
        }
    }

    public final void d(boolean z4) {
        long j10;
        da daVar = this.f41310a;
        if (!daVar.O1 && daVar.N1) {
            daVar.O1 = true;
            x8 x8Var = new x8(this, 0);
            if (z4) {
                j10 = 0;
            } else {
                j10 = 400;
            }
            AndroidUtilities.runOnUIThread(x8Var, j10);
        }
    }

    public final void e(Runnable runnable, boolean z4) {
        i9 i9Var;
        da daVar = this.f41310a;
        if (!daVar.N1 && !daVar.O1 && !daVar.P1 && daVar.f41518c0 == 0 && (i9Var = daVar.f41589y0) != null && i9Var.getCameraSession() != null) {
            f3 f3Var = daVar.f41538i1;
            if (f3Var != null) {
                f3Var.e(true);
            }
            f3 f3Var2 = daVar.f41541j1;
            if (f3Var2 != null) {
                f3Var2.e(true);
            }
            daVar.T0.e(true);
            daVar.N1 = true;
            o5 o5Var = daVar.f41592z0;
            if (o5Var != null) {
                o5Var.c(true);
            }
            File file = daVar.D1;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                daVar.D1 = null;
            }
            daVar.D1 = t6.x(daVar.f41517c, true);
            daVar.p();
            daVar.Z1 = false;
            if (daVar.f41589y0.isFrontface() && daVar.f41562q2 == 1) {
                da.a(daVar);
            }
            if (daVar.q0()) {
                daVar.f41567s.c(new y8(this, z4, runnable));
            } else {
                f(runnable, z4);
            }
        }
    }

    public final void f(Runnable runnable, boolean z4) {
        boolean z10;
        da daVar = this.f41310a;
        if (daVar.f41589y0 != null) {
            CameraController.getInstance().recordVideo(daVar.f41589y0.getCameraSessionObject(), daVar.D1, false, new z8(this, 0), new y8(this, runnable, z4), daVar.f41589y0, true);
            boolean z11 = true;
            if (daVar.L1 != 1) {
                daVar.L1 = 1;
                daVar.F0.a(false, true);
                if (daVar.L1 == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                daVar.i0(z10, true);
                daVar.N0.a(daVar.L1);
                s5 s5Var = daVar.L0;
                if (daVar.L1 != 1) {
                    z11 = false;
                }
                s5Var.f42352k0 = -1.0f;
                s5Var.f42353l0 = z11;
                s5Var.invalidate();
            }
        }
    }

    public final void g(org.telegram.messenger.Utilities.Callback r9) {
        throw new UnsupportedOperationException("Method not decompiled: ph.a9.g(org.telegram.messenger.Utilities$Callback):void");
    }
}
