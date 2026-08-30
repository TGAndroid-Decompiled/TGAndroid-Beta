package ph;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.camera.CameraController;
public final class a9 implements r5 {
    public final da f41281a;

    public a9(da daVar) {
        this.f41281a = daVar;
    }

    public final void a() {
        da daVar = this.f41281a;
        ArrayList<u6> content = daVar.f41547x0.getContent();
        int i10 = 0;
        if (content.size() == 1) {
            daVar.H1 = content.get(0);
        } else {
            daVar.H1 = u6.a(daVar.f41547x0.getLayout(), daVar.f41547x0.getContent());
        }
        u6 u6Var = daVar.H1;
        if (u6Var != null && u6Var.K) {
            i10 = 1;
        }
        daVar.L1 = i10;
        x8 x8Var = daVar.N0;
        if (x8Var != null) {
            x8Var.a(i10);
        }
        g8.a(daVar.f41479c, daVar.H1);
        daVar.K(1, true);
    }

    public final void b() {
        ArrayList arrayList;
        da daVar = this.f41281a;
        i9 i9Var = daVar.f41551y0;
        if (i9Var != null && !daVar.P1 && !daVar.M1 && i9Var.isInited()) {
            da daVar2 = this.f41281a;
            if (daVar2.f41480c0 == 0) {
                f3 f3Var = daVar2.f41503j1;
                if (f3Var != null) {
                    f3Var.e(true);
                }
                if (this.f41281a.q0() && (arrayList = this.f41281a.f41528r2) != null && !arrayList.isEmpty()) {
                    da daVar3 = this.f41281a;
                    ApplicationLoader.applicationContext.getSharedPreferences("camera", 0).edit().putString("flashMode", (String) daVar3.f41528r2.get(daVar3.f41524q2)).commit();
                }
                this.f41281a.f41551y0.switchCamera();
                da.a0(this.f41281a.f41551y0.isFrontface());
                if (this.f41281a.q0()) {
                    this.f41281a.f41529s.c(null);
                } else {
                    this.f41281a.f41529s.d();
                }
            }
        }
    }

    public final void c() {
        i9 i9Var;
        da daVar = this.f41281a;
        if (!daVar.M1 && !daVar.P1 && daVar.f41480c0 == 0 && (i9Var = daVar.f41551y0) != null && i9Var.isInited()) {
            daVar.T0.e(true);
            File file = daVar.D1;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                daVar.D1 = null;
            }
            p5 p5Var = daVar.f41554z0;
            if (p5Var != null) {
                p5Var.c(true);
            }
            daVar.D1 = u6.w(daVar.f41479c, "jpg");
            daVar.M1 = true;
            daVar.p();
            daVar.Z1 = false;
            if (daVar.f41551y0.isFrontface() && daVar.f41524q2 == 1) {
                da.a(daVar);
            }
            if (daVar.q0()) {
                d2 d2Var = daVar.f41529s;
                org.telegram.ui.web.y0 y0Var = new org.telegram.ui.web.y0(this, 12);
                d2Var.h(d2Var.f41433p);
                d2Var.e(1.0f, 320L, new z1(d2Var, y0Var, 0));
                return;
            }
            g(null);
        }
    }

    public final void d(boolean z4) {
        long j10;
        da daVar = this.f41281a;
        if (!daVar.O1 && daVar.N1) {
            daVar.O1 = true;
            y8 y8Var = new y8(this, 0);
            if (z4) {
                j10 = 0;
            } else {
                j10 = 400;
            }
            AndroidUtilities.runOnUIThread(y8Var, j10);
        }
    }

    public final void e(Runnable runnable, boolean z4) {
        i9 i9Var;
        da daVar = this.f41281a;
        if (!daVar.N1 && !daVar.O1 && !daVar.P1 && daVar.f41480c0 == 0 && (i9Var = daVar.f41551y0) != null && i9Var.getCameraSession() != null) {
            f3 f3Var = daVar.f41500i1;
            if (f3Var != null) {
                f3Var.e(true);
            }
            f3 f3Var2 = daVar.f41503j1;
            if (f3Var2 != null) {
                f3Var2.e(true);
            }
            daVar.T0.e(true);
            daVar.N1 = true;
            p5 p5Var = daVar.f41554z0;
            if (p5Var != null) {
                p5Var.c(true);
            }
            File file = daVar.D1;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                daVar.D1 = null;
            }
            daVar.D1 = u6.x(daVar.f41479c, true);
            daVar.p();
            daVar.Z1 = false;
            if (daVar.f41551y0.isFrontface() && daVar.f41524q2 == 1) {
                da.a(daVar);
            }
            if (daVar.q0()) {
                daVar.f41529s.c(new z8(this, z4, runnable));
            } else {
                f(runnable, z4);
            }
        }
    }

    public final void f(Runnable runnable, boolean z4) {
        boolean z10;
        da daVar = this.f41281a;
        if (daVar.f41551y0 != null) {
            CameraController.getInstance().recordVideo(daVar.f41551y0.getCameraSessionObject(), daVar.D1, false, new lh.m5(this, 28), new z8(this, runnable, z4), daVar.f41551y0, true);
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
                t5 t5Var = daVar.L0;
                if (daVar.L1 != 1) {
                    z11 = false;
                }
                t5Var.f42346k0 = -1.0f;
                t5Var.f42347l0 = z11;
                t5Var.invalidate();
            }
        }
    }

    public final void g(org.telegram.messenger.Utilities.Callback r9) {
        throw new UnsupportedOperationException("Method not decompiled: ph.a9.g(org.telegram.messenger.Utilities$Callback):void");
    }
}
