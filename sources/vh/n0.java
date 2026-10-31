package vh;

import android.app.Activity;
import android.net.Uri;
import android.os.Build;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.ui.Components.kp;
public final class n0 extends ImageView {
    public int f51489a;
    public FrameLayout f51490b;
    public boolean f51491c;
    public boolean d;
    public boolean e;
    public kp f51492f;
    public z6 h;
    public m0 f51493n;
    public n5 f51494r;
    public k0 f51495s;
    public Uri f51496w;
    public boolean f51497x;
    public boolean f51498y;

    public static void a(n0 n0Var) {
        z6 z6Var = n0Var.h;
        int i10 = Build.VERSION.SDK_INT;
        if ((i10 <= 28 || org.telegram.messenger.v2.f18449b) && n0Var.getContext().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            Activity W = org.telegram.messenger.i0.W(n0Var.getContext());
            if (W != null) {
                W.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 113);
            }
        } else if (!n0Var.f51491c && n0Var.f51494r != null) {
            if (n0Var.f51496w != null) {
                if (i10 >= 30) {
                    n0Var.getContext().getContentResolver().delete(n0Var.f51496w, null);
                    n0Var.f51496w = null;
                } else if (i10 < 29) {
                    try {
                        new File(n0Var.f51496w.toString()).delete();
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                    }
                    n0Var.f51496w = null;
                }
            }
            n0Var.f51491c = true;
            m0 m0Var = n0Var.f51493n;
            if (m0Var != null) {
                m0Var.a();
                n0Var.f51493n = null;
            }
            k0 k0Var = n0Var.f51495s;
            if (k0Var != null) {
                k0Var.a(true);
                n0Var.f51495s = null;
            }
            if (z6Var != null) {
                n0Var.e = true;
                z6Var.a(new h0(n0Var, 0));
            }
            n0Var.d();
            if (z6Var == null) {
                n0Var.b();
            }
        }
    }

    public final void b() {
        n5 n5Var;
        if (this.e && (n5Var = this.f51494r) != null) {
            this.e = false;
            if (n5Var.E()) {
                this.d = true;
                m0 m0Var = new m0(getContext());
                this.f51493n = m0Var;
                m0Var.setOnCancelListener(new h0(this, 1));
                this.f51490b.addView(this.f51493n);
                File s02 = org.telegram.messenger.i0.s0(false);
                this.f51495s = new k0(this.f51489a, this.f51494r, s02, new i0(this, s02, 0), new j0(this, 0), new h0(this, 2));
            } else {
                this.d = false;
                File q02 = org.telegram.messenger.i0.q0("png", false);
                if (q02 == null) {
                    this.f51493n.b(2131624011, 3500, cd.M0("UnknownError"));
                    this.f51491c = false;
                    d();
                    return;
                }
                Utilities.f14523i.c(new i0(this, q02, 1));
            }
            d();
        }
    }

    public final void c(String str) {
        m0 m0Var = this.f51493n;
        if (m0Var != null) {
            m0Var.a();
            this.f51493n = null;
        }
        m0 m0Var2 = new m0(getContext());
        this.f51493n = m0Var2;
        m0Var2.b(2131624011, 3500, str);
        this.f51490b.addView(this.f51493n);
    }

    public final void d() {
        boolean z10;
        boolean z11;
        float f7;
        boolean z12;
        boolean z13 = this.f51497x;
        boolean z14 = this.f51491c;
        boolean z15 = false;
        if (z14 && !this.d) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z13 != z10) {
            if (z14 && !this.d) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f51497x = z12;
            if (z12) {
                org.telegram.messenger.i0.R3(this, this.f51492f);
            } else {
                org.telegram.messenger.i0.Q3(this, 2131231737);
            }
        }
        boolean z16 = this.f51498y;
        if (this.f51491c && this.d) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z16 != z11) {
            clearAnimation();
            ViewPropertyAnimator animate = animate();
            if (this.f51491c && this.d) {
                z15 = true;
            }
            this.f51498y = z15;
            if (z15) {
                f7 = 0.4f;
            } else {
                f7 = 1.0f;
            }
            animate.alpha(f7).start();
        }
    }

    public void setEntry(n5 n5Var) {
        this.f51496w = null;
        this.f51494r = n5Var;
        k0 k0Var = this.f51495s;
        if (k0Var != null) {
            k0Var.a(true);
            this.f51495s = null;
        }
        m0 m0Var = this.f51493n;
        if (m0Var != null) {
            m0Var.a();
            this.f51493n = null;
        }
        if (n5Var == null) {
            this.f51491c = false;
            d();
        }
    }
}
