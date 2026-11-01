package vh;

import android.app.Activity;
import android.os.Build;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.camera.CameraController;
public final class o7 implements q4 {
    public final o8 f51618a;

    public o7(o8 o8Var) {
        this.f51618a = o8Var;
    }

    public final void a() {
        o8 o8Var = this.f51618a;
        ArrayList<n5> content = o8Var.A0.getContent();
        int i10 = 0;
        if (content.size() == 1) {
            o8Var.K1 = content.get(0);
        } else {
            o8Var.K1 = n5.a(o8Var.A0.getLayout(), o8Var.A0.getContent());
        }
        n5 n5Var = o8Var.K1;
        if (n5Var != null && n5Var.K) {
            i10 = 1;
        }
        o8Var.O1 = i10;
        l7 l7Var = o8Var.Q0;
        if (l7Var != null) {
            l7Var.a(i10);
        }
        x6.a(o8Var.f51626c, o8Var.K1);
        o8Var.J(1, true);
    }

    public final void b() {
        ArrayList arrayList;
        o8 o8Var = this.f51618a;
        t7 t7Var = o8Var.B0;
        if (t7Var != null && !o8Var.S1 && !o8Var.P1 && t7Var.isInited()) {
            o8 o8Var2 = this.f51618a;
            if (o8Var2.f51637f0 == 0) {
                p2 p2Var = o8Var2.f51657m1;
                if (p2Var != null) {
                    p2Var.e(true);
                }
                if (this.f51618a.p0() && (arrayList = this.f51618a.f51685u2) != null && !arrayList.isEmpty()) {
                    o8 o8Var3 = this.f51618a;
                    org.telegram.messenger.w0.f18945b.getSharedPreferences("camera", 0).edit().putString("flashMode", (String) o8Var3.f51685u2.get(o8Var3.f51682t2)).commit();
                }
                this.f51618a.B0.switchCamera();
                o8.Z(this.f51618a.B0.isFrontface());
                if (this.f51618a.p0()) {
                    this.f51618a.f51676s.c(null);
                } else {
                    this.f51618a.f51676s.d();
                }
            }
        }
    }

    public final void c() {
        boolean z10;
        o8 o8Var = this.f51618a;
        if (o8Var.f51637f0 == 0 && !o8Var.P1 && !o8Var.Q1) {
            Activity activity = o8Var.f51622b;
            if (activity != null) {
                boolean z11 = false;
                if (Build.VERSION.SDK_INT >= 33) {
                    if (activity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 || activity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                        z11 = true;
                    }
                    if (z11) {
                        activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 114);
                    }
                } else {
                    if (activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                        z11 = true;
                    }
                    if (z11) {
                        activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 114);
                    }
                }
                z10 = !z11;
            } else {
                z10 = true;
            }
            if (z10) {
                o8Var.e(true);
            }
        }
    }

    public final void d() {
        t7 t7Var;
        o8 o8Var = this.f51618a;
        if (!o8Var.P1 && !o8Var.S1 && o8Var.f51637f0 == 0 && (t7Var = o8Var.B0) != null && t7Var.isInited()) {
            o8Var.W0.e(true);
            File file = o8Var.G1;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                o8Var.G1 = null;
            }
            o4 o4Var = o8Var.C0;
            if (o4Var != null) {
                o4Var.c(true);
            }
            o8Var.G1 = n5.w(o8Var.f51626c, "jpg");
            o8Var.P1 = true;
            o8Var.o();
            o8Var.f51629c2 = false;
            if (o8Var.B0.isFrontface() && o8Var.f51682t2 == 1) {
                o8.a(o8Var);
            }
            if (o8Var.p0()) {
                z1 z1Var = o8Var.f51676s;
                m6 m6Var = new m6(this, 1);
                z1Var.h(z1Var.f52256p);
                z1Var.e(1.0f, 320L, new v1(z1Var, m6Var, 0));
                return;
            }
            h(null);
        }
    }

    public final void e(boolean z10) {
        long j10;
        o8 o8Var = this.f51618a;
        if (!o8Var.R1 && o8Var.Q1) {
            o8Var.R1 = true;
            m7 m7Var = new m7(this, 0);
            if (z10) {
                j10 = 0;
            } else {
                j10 = 400;
            }
            org.telegram.messenger.i0.h3(m7Var, j10);
        }
    }

    public final void f(Runnable runnable, boolean z10) {
        t7 t7Var;
        o8 o8Var = this.f51618a;
        if (!o8Var.Q1 && !o8Var.R1 && !o8Var.S1 && o8Var.f51637f0 == 0 && (t7Var = o8Var.B0) != null && t7Var.getCameraSession() != null) {
            p2 p2Var = o8Var.l1;
            if (p2Var != null) {
                p2Var.e(true);
            }
            p2 p2Var2 = o8Var.f51657m1;
            if (p2Var2 != null) {
                p2Var2.e(true);
            }
            o8Var.W0.e(true);
            o8Var.Q1 = true;
            o4 o4Var = o8Var.C0;
            if (o4Var != null) {
                o4Var.c(true);
            }
            File file = o8Var.G1;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                o8Var.G1 = null;
            }
            o8Var.G1 = n5.x(o8Var.f51626c, true);
            o8Var.o();
            o8Var.f51629c2 = false;
            if (o8Var.B0.isFrontface() && o8Var.f51682t2 == 1) {
                o8.a(o8Var);
            }
            if (o8Var.p0()) {
                o8Var.f51676s.c(new n7(this, z10, runnable));
            } else {
                g(runnable, z10);
            }
        }
    }

    public final void g(Runnable runnable, boolean z10) {
        boolean z11;
        o8 o8Var = this.f51618a;
        if (o8Var.B0 != null) {
            CameraController.getInstance().recordVideo(o8Var.B0.getCameraSessionObject(), o8Var.G1, false, new rh.d0(this, 29), new n7(this, runnable, z10), o8Var.B0, true);
            boolean z12 = true;
            if (o8Var.O1 != 1) {
                o8Var.O1 = 1;
                o8Var.I0.a(false, true);
                if (o8Var.O1 == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                o8Var.h0(z11, true);
                o8Var.Q0.a(o8Var.O1);
                r4 r4Var = o8Var.O0;
                if (o8Var.O1 != 1) {
                    z12 = false;
                }
                r4Var.f51852n0 = -1.0f;
                r4Var.f51853o0 = z12;
                r4Var.invalidate();
            }
        }
    }

    public final void h(org.telegram.messenger.r20 r9) {
        throw new UnsupportedOperationException("Method not decompiled: vh.o7.h(org.telegram.messenger.r20):void");
    }
}
