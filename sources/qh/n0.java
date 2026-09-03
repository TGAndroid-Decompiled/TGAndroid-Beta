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
    public int f45782a;
    public FrameLayout f45783b;
    public boolean f45784c;
    public boolean d;
    public boolean f45785e;
    public tp f45786f;
    public g8 h;
    public m0 f45787n;
    public r6 f45788r;
    public k0 f45789s;
    public Uri v;
    public boolean f45790w;
    public boolean f45791x;

    public static void a(n0 n0Var) {
        g8 g8Var = n0Var.h;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23 && ((i10 <= 28 || BuildVars.NO_SCOPED_STORAGE) && n0Var.getContext().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
            Activity findActivity = AndroidUtilities.findActivity(n0Var.getContext());
            if (findActivity != null) {
                findActivity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 113);
            }
        } else if (!n0Var.f45784c && n0Var.f45788r != null) {
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
            n0Var.f45784c = true;
            m0 m0Var = n0Var.f45787n;
            if (m0Var != null) {
                m0Var.a();
                n0Var.f45787n = null;
            }
            k0 k0Var = n0Var.f45789s;
            if (k0Var != null) {
                k0Var.a(true);
                n0Var.f45789s = null;
            }
            if (g8Var != null) {
                n0Var.f45785e = true;
                g8Var.run(new h0(n0Var, 0));
            }
            n0Var.d();
            if (g8Var == null) {
                n0Var.b();
            }
        }
    }

    public final void b() {
        r6 r6Var;
        if (this.f45785e && (r6Var = this.f45788r) != null) {
            this.f45785e = false;
            if (r6Var.E()) {
                this.d = true;
                m0 m0Var = new m0(getContext());
                this.f45787n = m0Var;
                m0Var.setOnCancelListener(new h0(this, 1));
                this.f45783b.addView(this.f45787n);
                File generateVideoPath = AndroidUtilities.generateVideoPath();
                this.f45789s = new k0(this.f45782a, this.f45788r, generateVideoPath, new i0(this, generateVideoPath, 0), new j0(this, 0), new h0(this, 2));
            } else {
                this.d = false;
                File generatePicturePath = AndroidUtilities.generatePicturePath(false, "png");
                if (generatePicturePath == null) {
                    this.f45787n.b(R.raw.error, 3500, LocaleController.getString("UnknownError"));
                    this.f45784c = false;
                    d();
                    return;
                }
                Utilities.themeQueue.postRunnable(new i0(this, generatePicturePath, 1));
            }
            d();
        }
    }

    public final void c(int i10, String str) {
        m0 m0Var = this.f45787n;
        if (m0Var != null) {
            m0Var.a();
            this.f45787n = null;
        }
        m0 m0Var2 = new m0(getContext());
        this.f45787n = m0Var2;
        m0Var2.b(i10, 3500, str);
        this.f45783b.addView(this.f45787n);
    }

    public final void d() {
        boolean z4;
        boolean z10;
        float f10;
        boolean z11;
        boolean z12 = this.f45790w;
        boolean z13 = this.f45784c;
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
            this.f45790w = z11;
            if (z11) {
                AndroidUtilities.updateImageViewImageAnimated(this, this.f45786f);
            } else {
                AndroidUtilities.updateImageViewImageAnimated(this, R.drawable.media_download);
            }
        }
        boolean z15 = this.f45791x;
        if (this.f45784c && this.d) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z15 != z10) {
            clearAnimation();
            ViewPropertyAnimator animate = animate();
            if (this.f45784c && this.d) {
                z14 = true;
            }
            this.f45791x = z14;
            if (z14) {
                f10 = 0.4f;
            } else {
                f10 = 1.0f;
            }
            animate.alpha(f10).start();
        }
    }

    public void setEntry(r6 r6Var) {
        this.v = null;
        this.f45788r = r6Var;
        k0 k0Var = this.f45789s;
        if (k0Var != null) {
            k0Var.a(true);
            this.f45789s = null;
        }
        m0 m0Var = this.f45787n;
        if (m0Var != null) {
            m0Var.a();
            this.f45787n = null;
        }
        if (r6Var == null) {
            this.f45784c = false;
            d();
        }
    }
}
