package ph;

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
import org.telegram.ui.Components.rp;
public final class n0 extends ImageView {
    public int f41987a;
    public FrameLayout f41988b;
    public boolean f41989c;
    public boolean d;
    public boolean e;
    public rp f41990f;
    public i8 h;
    public m0 f41991n;
    public u6 f41992r;
    public k0 f41993s;
    public Uri v;
    public boolean f41994w;
    public boolean f41995x;

    public static void a(n0 n0Var) {
        i8 i8Var = n0Var.h;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23 && ((i10 <= 28 || BuildVars.NO_SCOPED_STORAGE) && n0Var.getContext().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
            Activity findActivity = AndroidUtilities.findActivity(n0Var.getContext());
            if (findActivity != null) {
                findActivity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 113);
            }
        } else if (!n0Var.f41989c && n0Var.f41992r != null) {
            if (n0Var.v != null) {
                if (i10 >= 30) {
                    n0Var.getContext().getContentResolver().delete(n0Var.v, null);
                    n0Var.v = null;
                } else if (i10 < 29) {
                    try {
                        new File(n0Var.v.toString()).delete();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    n0Var.v = null;
                }
            }
            n0Var.f41989c = true;
            m0 m0Var = n0Var.f41991n;
            if (m0Var != null) {
                m0Var.a();
                n0Var.f41991n = null;
            }
            k0 k0Var = n0Var.f41993s;
            if (k0Var != null) {
                k0Var.a(true);
                n0Var.f41993s = null;
            }
            if (i8Var != null) {
                n0Var.e = true;
                i8Var.run(new h0(n0Var, 0));
            }
            n0Var.d();
            if (i8Var == null) {
                n0Var.b();
            }
        }
    }

    public final void b() {
        u6 u6Var;
        if (this.e && (u6Var = this.f41992r) != null) {
            this.e = false;
            if (u6Var.E()) {
                this.d = true;
                m0 m0Var = new m0(getContext());
                this.f41991n = m0Var;
                m0Var.setOnCancelListener(new h0(this, 1));
                this.f41988b.addView(this.f41991n);
                File generateVideoPath = AndroidUtilities.generateVideoPath();
                this.f41993s = new k0(this.f41987a, this.f41992r, generateVideoPath, new i0(this, generateVideoPath, 0), new j0(this, 0), new h0(this, 2));
            } else {
                this.d = false;
                File generatePicturePath = AndroidUtilities.generatePicturePath(false, "png");
                if (generatePicturePath == null) {
                    this.f41991n.b(R.raw.error, 3500, LocaleController.getString("UnknownError"));
                    this.f41989c = false;
                    d();
                    return;
                }
                Utilities.themeQueue.postRunnable(new i0(this, generatePicturePath, 1));
            }
            d();
        }
    }

    public final void c(int i10, String str) {
        m0 m0Var = this.f41991n;
        if (m0Var != null) {
            m0Var.a();
            this.f41991n = null;
        }
        m0 m0Var2 = new m0(getContext());
        this.f41991n = m0Var2;
        m0Var2.b(i10, 3500, str);
        this.f41988b.addView(this.f41991n);
    }

    public final void d() {
        boolean z4;
        boolean z10;
        float f10;
        boolean z11;
        boolean z12 = this.f41994w;
        boolean z13 = this.f41989c;
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
            this.f41994w = z11;
            if (z11) {
                AndroidUtilities.updateImageViewImageAnimated(this, this.f41990f);
            } else {
                AndroidUtilities.updateImageViewImageAnimated(this, R.drawable.media_download);
            }
        }
        boolean z15 = this.f41995x;
        if (this.f41989c && this.d) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z15 != z10) {
            clearAnimation();
            ViewPropertyAnimator animate = animate();
            if (this.f41989c && this.d) {
                z14 = true;
            }
            this.f41995x = z14;
            if (z14) {
                f10 = 0.4f;
            } else {
                f10 = 1.0f;
            }
            animate.alpha(f10).start();
        }
    }

    public void setEntry(u6 u6Var) {
        this.v = null;
        this.f41992r = u6Var;
        k0 k0Var = this.f41993s;
        if (k0Var != null) {
            k0Var.a(true);
            this.f41993s = null;
        }
        m0 m0Var = this.f41991n;
        if (m0Var != null) {
            m0Var.a();
            this.f41991n = null;
        }
        if (u6Var == null) {
            this.f41989c = false;
            d();
        }
    }
}
