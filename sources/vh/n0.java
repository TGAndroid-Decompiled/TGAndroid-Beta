package vh;

import android.app.Activity;
import android.net.Uri;
import android.os.Build;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.dd;
import org.telegram.ui.Components.kp;
public final class n0 extends ImageView {
    public int f51504a;
    public FrameLayout f51505b;
    public boolean f51506c;
    public boolean d;
    public boolean e;
    public kp f51507f;
    public z6 h;
    public m0 f51508n;
    public n5 f51509r;
    public k0 f51510s;
    public Uri f51511w;
    public boolean f51512x;
    public boolean f51513y;

    public static void a(n0 n0Var) {
        z6 z6Var = n0Var.h;
        int i10 = Build.VERSION.SDK_INT;
        if ((i10 <= 28 || org.telegram.messenger.v2.f18579b) && n0Var.getContext().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            Activity W = org.telegram.messenger.i0.W(n0Var.getContext());
            if (W != null) {
                W.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 113);
            }
        } else if (!n0Var.f51506c && n0Var.f51509r != null) {
            if (n0Var.f51511w != null) {
                if (i10 >= 30) {
                    n0Var.getContext().getContentResolver().delete(n0Var.f51511w, null);
                    n0Var.f51511w = null;
                } else if (i10 < 29) {
                    try {
                        new File(n0Var.f51511w.toString()).delete();
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                    }
                    n0Var.f51511w = null;
                }
            }
            n0Var.f51506c = true;
            m0 m0Var = n0Var.f51508n;
            if (m0Var != null) {
                m0Var.a();
                n0Var.f51508n = null;
            }
            k0 k0Var = n0Var.f51510s;
            if (k0Var != null) {
                k0Var.a(true);
                n0Var.f51510s = null;
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
        if (this.e && (n5Var = this.f51509r) != null) {
            this.e = false;
            if (n5Var.E()) {
                this.d = true;
                m0 m0Var = new m0(getContext());
                this.f51508n = m0Var;
                m0Var.setOnCancelListener(new h0(this, 1));
                this.f51505b.addView(this.f51508n);
                File s02 = org.telegram.messenger.i0.s0(false);
                this.f51510s = new k0(this.f51504a, this.f51509r, s02, new i0(this, s02, 0), new j0(this, 0), new h0(this, 2));
            } else {
                this.d = false;
                File q02 = org.telegram.messenger.i0.q0("png", false);
                if (q02 == null) {
                    this.f51508n.b(2131624011, 3500, dd.M0("UnknownError"));
                    this.f51506c = false;
                    d();
                    return;
                }
                Utilities.f14524i.c(new i0(this, q02, 1));
            }
            d();
        }
    }

    public final void c(String str) {
        m0 m0Var = this.f51508n;
        if (m0Var != null) {
            m0Var.a();
            this.f51508n = null;
        }
        m0 m0Var2 = new m0(getContext());
        this.f51508n = m0Var2;
        m0Var2.b(2131624011, 3500, str);
        this.f51505b.addView(this.f51508n);
    }

    public final void d() {
        boolean z10;
        boolean z11;
        float f7;
        boolean z12;
        boolean z13 = this.f51512x;
        boolean z14 = this.f51506c;
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
            this.f51512x = z12;
            if (z12) {
                org.telegram.messenger.i0.R3(this, this.f51507f);
            } else {
                org.telegram.messenger.i0.Q3(this, 2131231737);
            }
        }
        boolean z16 = this.f51513y;
        if (this.f51506c && this.d) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z16 != z11) {
            clearAnimation();
            ViewPropertyAnimator animate = animate();
            if (this.f51506c && this.d) {
                z15 = true;
            }
            this.f51513y = z15;
            if (z15) {
                f7 = 0.4f;
            } else {
                f7 = 1.0f;
            }
            animate.alpha(f7).start();
        }
    }

    public void setEntry(n5 n5Var) {
        this.f51511w = null;
        this.f51509r = n5Var;
        k0 k0Var = this.f51510s;
        if (k0Var != null) {
            k0Var.a(true);
            this.f51510s = null;
        }
        m0 m0Var = this.f51508n;
        if (m0Var != null) {
            m0Var.a();
            this.f51508n = null;
        }
        if (n5Var == null) {
            this.f51506c = false;
            d();
        }
    }
}
