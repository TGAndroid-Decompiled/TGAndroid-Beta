package qh;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.camera.CameraController;
public final class x8 implements o5 {
    public final ba f46318a;

    public x8(ba baVar) {
        this.f46318a = baVar;
    }

    public final void a() {
        ba baVar = this.f46318a;
        ArrayList<r6> content = baVar.f45116x0.getContent();
        int i10 = 0;
        if (content.size() == 1) {
            baVar.H1 = content.get(0);
        } else {
            baVar.H1 = r6.a(baVar.f45116x0.getLayout(), baVar.f45116x0.getContent());
        }
        r6 r6Var = baVar.H1;
        if (r6Var != null && r6Var.K) {
            i10 = 1;
        }
        baVar.L1 = i10;
        u8 u8Var = baVar.N0;
        if (u8Var != null) {
            u8Var.a(i10);
        }
        e8.a(baVar.f45047c, baVar.H1);
        baVar.K(1, true);
    }

    public final void b() {
        ArrayList arrayList;
        ba baVar = this.f46318a;
        f9 f9Var = baVar.f45120y0;
        if (f9Var != null && !baVar.P1 && !baVar.M1 && f9Var.isInited()) {
            ba baVar2 = this.f46318a;
            if (baVar2.f45048c0 == 0) {
                e3 e3Var = baVar2.f45072j1;
                if (e3Var != null) {
                    e3Var.e(true);
                }
                if (this.f46318a.q0() && (arrayList = this.f46318a.f45097r2) != null && !arrayList.isEmpty()) {
                    ba baVar3 = this.f46318a;
                    ApplicationLoader.applicationContext.getSharedPreferences("camera", 0).edit().putString("flashMode", (String) baVar3.f45097r2.get(baVar3.f45093q2)).commit();
                }
                this.f46318a.f45120y0.switchCamera();
                ba.a0(this.f46318a.f45120y0.isFrontface());
                if (this.f46318a.q0()) {
                    this.f46318a.f45098s.c(null);
                } else {
                    this.f46318a.f45098s.d();
                }
            }
        }
    }

    public final void c() {
        f9 f9Var;
        ba baVar = this.f46318a;
        if (!baVar.M1 && !baVar.P1 && baVar.f45048c0 == 0 && (f9Var = baVar.f45120y0) != null && f9Var.isInited()) {
            baVar.T0.e(true);
            File file = baVar.D1;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                baVar.D1 = null;
            }
            m5 m5Var = baVar.f45123z0;
            if (m5Var != null) {
                m5Var.c(true);
            }
            baVar.D1 = r6.w(baVar.f45047c, "jpg");
            baVar.M1 = true;
            baVar.p();
            baVar.Z1 = false;
            if (baVar.f45120y0.isFrontface() && baVar.f45093q2 == 1) {
                ba.a(baVar);
            }
            if (baVar.q0()) {
                c2 c2Var = baVar.f45098s;
                org.telegram.ui.web.d1 d1Var = new org.telegram.ui.web.d1(this, 12);
                c2Var.h(c2Var.f45160p);
                c2Var.e(1.0f, 320L, new y1(c2Var, d1Var, 0));
                return;
            }
            g(null);
        }
    }

    public final void d(boolean z4) {
        long j10;
        ba baVar = this.f46318a;
        if (!baVar.O1 && baVar.N1) {
            baVar.O1 = true;
            v8 v8Var = new v8(this, 0);
            if (z4) {
                j10 = 0;
            } else {
                j10 = 400;
            }
            AndroidUtilities.runOnUIThread(v8Var, j10);
        }
    }

    public final void e(Runnable runnable, boolean z4) {
        f9 f9Var;
        ba baVar = this.f46318a;
        if (!baVar.N1 && !baVar.O1 && !baVar.P1 && baVar.f45048c0 == 0 && (f9Var = baVar.f45120y0) != null && f9Var.getCameraSession() != null) {
            e3 e3Var = baVar.f45069i1;
            if (e3Var != null) {
                e3Var.e(true);
            }
            e3 e3Var2 = baVar.f45072j1;
            if (e3Var2 != null) {
                e3Var2.e(true);
            }
            baVar.T0.e(true);
            baVar.N1 = true;
            m5 m5Var = baVar.f45123z0;
            if (m5Var != null) {
                m5Var.c(true);
            }
            File file = baVar.D1;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                baVar.D1 = null;
            }
            baVar.D1 = r6.x(baVar.f45047c, true);
            baVar.p();
            baVar.Z1 = false;
            if (baVar.f45120y0.isFrontface() && baVar.f45093q2 == 1) {
                ba.a(baVar);
            }
            if (baVar.q0()) {
                baVar.f45098s.c(new w8(this, z4, runnable));
            } else {
                f(runnable, z4);
            }
        }
    }

    public final void f(Runnable runnable, boolean z4) {
        boolean z10;
        ba baVar = this.f46318a;
        if (baVar.f45120y0 != null) {
            CameraController.getInstance().recordVideo(baVar.f45120y0.getCameraSessionObject(), baVar.D1, false, new mh.m5(this, 29), new w8(this, runnable, z4), baVar.f45120y0, true);
            boolean z11 = true;
            if (baVar.L1 != 1) {
                baVar.L1 = 1;
                baVar.F0.a(false, true);
                if (baVar.L1 == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                baVar.i0(z10, true);
                baVar.N0.a(baVar.L1);
                q5 q5Var = baVar.L0;
                if (baVar.L1 != 1) {
                    z11 = false;
                }
                q5Var.f45940k0 = -1.0f;
                q5Var.f45941l0 = z11;
                q5Var.invalidate();
            }
        }
    }

    public final void g(org.telegram.messenger.Utilities.Callback r9) {
        throw new UnsupportedOperationException("Method not decompiled: qh.x8.g(org.telegram.messenger.Utilities$Callback):void");
    }
}
