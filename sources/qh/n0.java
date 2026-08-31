package qh;

import android.app.Activity;
import android.net.Uri;
import android.os.Build;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.tp;
public final class n0 extends ImageView {
    public int f45745a;
    public FrameLayout f45746b;
    public boolean f45747c;
    public boolean d;
    public boolean f45748e;
    public tp f45749f;
    public h8 h;
    public m0 f45750n;
    public s6 f45751r;
    public k0 f45752s;
    public Uri v;
    public boolean f45753w;
    public boolean f45754x;

    public static void a(n0 n0Var) {
        h8 h8Var = n0Var.h;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23 && ((i10 <= 28 || BuildVars.NO_SCOPED_STORAGE) && n0Var.getContext().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
            Activity findActivity = AndroidUtilities.findActivity(n0Var.getContext());
            if (findActivity != null) {
                findActivity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 113);
            }
        } else if (!n0Var.f45747c && n0Var.f45751r != null) {
            if (n0Var.v != null) {
                if (i10 >= 30) {
                    n0Var.getContext().getContentResolver().delete(n0Var.v, null);
                    n0Var.v = null;
                } else if (i10 < 29) {
                    try {
                        new File(n0Var.v.toString()).delete();
                    } catch (Exception e6) {
                        FileLog.e(e6);
                    }
                    n0Var.v = null;
                }
            }
            n0Var.f45747c = true;
            m0 m0Var = n0Var.f45750n;
            if (m0Var != null) {
                m0Var.a();
                n0Var.f45750n = null;
            }
            k0 k0Var = n0Var.f45752s;
            if (k0Var != null) {
                k0Var.a(true);
                n0Var.f45752s = null;
            }
            if (h8Var != null) {
                n0Var.f45748e = true;
                h8Var.run(new h0(n0Var, 0));
            }
            n0Var.d();
            if (h8Var == null) {
                n0Var.b();
            }
        }
    }

    public final void b() {
        s6 s6Var;
        if (this.f45748e && (s6Var = this.f45751r) != null) {
            this.f45748e = false;
            if (s6Var.E()) {
                this.d = true;
                m0 m0Var = new m0(getContext());
                this.f45750n = m0Var;
                m0Var.setOnCancelListener(new h0(this, 1));
                this.f45746b.addView(this.f45750n);
                File generateVideoPath = AndroidUtilities.generateVideoPath();
                this.f45752s = new k0(this.f45745a, this.f45751r, generateVideoPath, new i0(this, generateVideoPath, 0), new j0(this, 0), new h0(this, 2));
            } else {
                this.d = false;
                File generatePicturePath = AndroidUtilities.generatePicturePath(false, "png");
                if (generatePicturePath == null) {
                    this.f45750n.b(R.raw.error, 3500, LocaleController.getString("UnknownError"));
                    this.f45747c = false;
                    d();
                    return;
                }
                Utilities.themeQueue.postRunnable(new i0(this, generatePicturePath, 1));
            }
            d();
        }
    }

    public final void c(int i10, String str) {
        m0 m0Var = this.f45750n;
        if (m0Var != null) {
            m0Var.a();
            this.f45750n = null;
        }
        m0 m0Var2 = new m0(getContext());
        this.f45750n = m0Var2;
        m0Var2.b(i10, 3500, str);
        this.f45746b.addView(this.f45750n);
    }

    public final void d() {
        boolean z4;
        boolean z10;
        float f10;
        boolean z11;
        boolean z12 = this.f45753w;
        boolean z13 = this.f45747c;
        boolean z14 = false;
        if (z13 && !this.d) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z12 != z4) {
            if (z13 && !this.d) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f45753w = z11;
            if (z11) {
                AndroidUtilities.updateImageViewImageAnimated(this, this.f45749f);
            } else {
                AndroidUtilities.updateImageViewImageAnimated(this, R.drawable.media_download);
            }
        }
        boolean z15 = this.f45754x;
        if (this.f45747c && this.d) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z15 != z10) {
            clearAnimation();
            ViewPropertyAnimator animate = animate();
            if (this.f45747c && this.d) {
                z14 = true;
            }
            this.f45754x = z14;
            if (z14) {
                f10 = 0.4f;
            } else {
                f10 = 1.0f;
            }
            animate.alpha(f10).start();
        }
    }

    public void setEntry(s6 s6Var) {
        this.v = null;
        this.f45751r = s6Var;
        k0 k0Var = this.f45752s;
        if (k0Var != null) {
            k0Var.a(true);
            this.f45752s = null;
        }
        m0 m0Var = this.f45750n;
        if (m0Var != null) {
            m0Var.a();
            this.f45750n = null;
        }
        if (s6Var == null) {
            this.f45747c = false;
            d();
        }
    }
}
