package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.BringAppForegroundService;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
public final class qo0 implements org.telegram.ui.ActionBar.o0, org.telegram.ui.Components.d51, org.telegram.ui.Components.p51, org.telegram.ui.Components.ed0, ti.m {
    public final PhotoViewer f49259a;

    public qo0(PhotoViewer photoViewer) {
        this.f49259a = photoViewer;
    }

    @Override
    public void C(SurfaceTexture surfaceTexture) {
        PhotoViewer photoViewer = this.f49259a;
        photoViewer.R8 = false;
        try {
            uq0 uq0Var = photoViewer.f41375g0;
            if (uq0Var != null && uq0Var.getParent() == null) {
                ((WindowManager) photoViewer.D.getSystemService("window")).addView(photoViewer.f41375g0, photoViewer.f41347d0);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (photoViewer.D2) {
            org.telegram.ui.Components.n51 n51Var = photoViewer.F2;
            if (n51Var != null) {
                n51Var.A0(null);
                photoViewer.F2.z0(photoViewer.C2);
            }
            surfaceTexture.release();
            return;
        }
        TextureView textureView = photoViewer.B2;
        if (textureView != null && photoViewer.f41536y2 != null) {
            textureView.setSurfaceTexture(surfaceTexture);
            org.telegram.messenger.g0.E2(photoViewer.B2);
            photoViewer.f41536y2.addView(photoViewer.B2, 0, c8.ha.e(-1, -1, 17));
        }
    }

    @Override
    public View D() {
        if (k()) {
            return this.f49259a.f41366f0.getWebView();
        }
        return null;
    }

    @Override
    public boolean E() {
        uq0 uq0Var;
        PhotoViewer photoViewer = PhotoViewer.f41315e9;
        PhotoViewer photoViewer2 = this.f49259a;
        if (photoViewer == photoViewer2 && photoViewer2.f41355e && !photoViewer2.I3 && !photoViewer2.R8 && (uq0Var = photoViewer2.f41375g0) != null && uq0Var.getParent() != null) {
            PhotoViewer photoViewer3 = this.f49259a;
            if (!photoViewer3.A3 && photoViewer3.f41428m4 == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void F() {
        this.f49259a.f41332b4.cancelRewind();
    }

    @Override
    public int I() {
        boolean k10 = k();
        PhotoViewer photoViewer = this.f49259a;
        if (k10) {
            return photoViewer.f41366f0.getEmbedWidth();
        }
        org.telegram.ui.Components.fe0 fe0Var = photoViewer.f41536y2;
        if (fe0Var != null && fe0Var.getAspectRatio() > 0.0f) {
            return Math.round(photoViewer.f41536y2.getAspectRatio() * 1000.0f);
        }
        return photoViewer.U;
    }

    @Override
    public void J(float f10) {
        this.f49259a.f41332b4.setX(f10);
    }

    @Override
    public boolean K() {
        PhotoViewer photoViewer = this.f49259a;
        if (photoViewer.f41471r2 && h() && !photoViewer.f41483s4) {
            return true;
        }
        return false;
    }

    @Override
    public boolean L() {
        return false;
    }

    @Override
    public e2.c1 M() {
        org.telegram.ui.Components.n51 n51Var;
        if (!k() && (n51Var = this.f49259a.F2) != null) {
            return n51Var.d;
        }
        return null;
    }

    @Override
    public boolean P() {
        return false;
    }

    @Override
    public void Q() {
        this.f49259a.O8 = null;
        PhotoViewer photoViewer = PhotoViewer.f41316f9;
        PhotoViewer photoViewer2 = this.f49259a;
        if (photoViewer == photoViewer2) {
            photoViewer2.J0();
            MediaController.B().F0();
            return;
        }
        PhotoViewer photoViewer3 = PhotoViewer.f41315e9;
        PhotoViewer photoViewer4 = this.f49259a;
        if (photoViewer3 == photoViewer4) {
            if (photoViewer4.R8) {
                photoViewer4.R8 = false;
                try {
                    uq0 uq0Var = photoViewer4.f41375g0;
                    if (uq0Var != null && uq0Var.getParent() == null) {
                        PhotoViewer photoViewer5 = this.f49259a;
                        ((WindowManager) this.f49259a.D.getSystemService("window")).addView(photoViewer5.f41375g0, photoViewer5.f41347d0);
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
            this.f49259a.z0(false, false);
        }
    }

    @Override
    public boolean R(boolean z9, float f10, org.telegram.ui.Components.qm0 qm0Var) {
        boolean k10 = k();
        PhotoViewer photoViewer = this.f49259a;
        if (k10) {
            photoViewer.f41332b4.startRewind(photoViewer.f41366f0, z9, f10, photoViewer.f41488t1, qm0Var);
            return true;
        }
        org.telegram.ui.Components.n51 n51Var = photoViewer.F2;
        if (n51Var == null) {
            return false;
        }
        photoViewer.f41332b4.startRewind(n51Var, z9, f10, photoViewer.f41488t1, qm0Var);
        return true;
    }

    @Override
    public void T() {
        View view;
        PhotoViewer photoViewer = this.f49259a;
        if (photoViewer.I3) {
            if (PhotoViewer.f41315e9 != null) {
                PhotoViewer.f41315e9.z0(false, true);
            }
            bq0 bq0Var = photoViewer.f41366f0;
            if (bq0Var != null && bq0Var.f31779f != null) {
                if (org.telegram.messenger.t0.f25563x) {
                    try {
                        bq0Var.getContext().startService(new Intent(org.telegram.messenger.t0.f25555b, BringAppForegroundService.class));
                    } catch (Throwable th2) {
                        org.telegram.messenger.a8.g(th2, true);
                    }
                }
                bq0Var.h.setVisibility(0);
                ViewGroup viewGroup = (ViewGroup) bq0Var.f31779f.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(bq0Var.f31779f);
                }
                bq0Var.addView(bq0Var.f31779f, 0, c8.ha.e(-1, -1, 51));
                ti.o oVar = bq0Var.f31776b.O8;
                if (oVar != null) {
                    oVar.a(new di.e(21));
                }
            }
            PhotoViewer.f41315e9 = PhotoViewer.f41316f9;
            PhotoViewer.f41316f9 = null;
            if (photoViewer.f41366f0 == null) {
                photoViewer.K3 = true;
                Bitmap bitmap = photoViewer.B3;
                if (bitmap != null) {
                    bitmap.recycle();
                    photoViewer.B3 = null;
                }
                photoViewer.E3 = true;
            }
            photoViewer.I3 = false;
            if (photoViewer.D2) {
                view = photoViewer.C2;
            } else {
                view = photoViewer.B2;
            }
            if (photoViewer.f41366f0 == null && view != null) {
                org.telegram.messenger.g0.E2(view);
                view.setVisibility(4);
                photoViewer.f41536y2.addView(view);
            }
            if (org.telegram.messenger.t0.f25563x) {
                try {
                    photoViewer.D.startService(new Intent(org.telegram.messenger.t0.f25555b, BringAppForegroundService.class));
                } catch (Throwable th3) {
                    org.telegram.messenger.a8.g(th3, true);
                }
            }
            if (photoViewer.f41366f0 == null) {
                if (view != null) {
                    photoViewer.A3 = true;
                    org.telegram.ui.Components.ki0 s12 = photoViewer.s1(false);
                    float f10 = s12.f35321c / photoViewer.f41517w3.getLayoutParams().width;
                    photoViewer.f41517w3.setScaleX(f10);
                    photoViewer.f41517w3.setScaleY(f10);
                    photoViewer.f41517w3.setTranslationX(s12.f35319a);
                    photoViewer.f41517w3.setTranslationY(s12.f35320b);
                    view.setScaleX(f10);
                    view.setScaleY(f10);
                    view.setTranslationX(s12.f35319a - photoViewer.f41536y2.getX());
                    view.setTranslationY(s12.f35320b - photoViewer.f41536y2.getY());
                    nq0 nq0Var = photoViewer.E2;
                    if (nq0Var != null) {
                        nq0Var.setScaleX(f10);
                        photoViewer.E2.setScaleY(f10);
                        photoViewer.E2.setTranslationX(view.getTranslationX());
                        photoViewer.E2.setTranslationY(view.getTranslationY());
                    }
                    photoViewer.W = 0.0f;
                    ep0 ep0Var = new ep0(photoViewer, f10, 1);
                    view.setOutlineProvider(ep0Var);
                    view.setClipToOutline(true);
                    photoViewer.f41517w3.setOutlineProvider(ep0Var);
                    photoViewer.f41517w3.setClipToOutline(true);
                    nq0 nq0Var2 = photoViewer.E2;
                    if (nq0Var2 != null) {
                        nq0Var2.setOutlineProvider(ep0Var);
                        photoViewer.E2.setClipToOutline(true);
                    }
                }
            } else {
                photoViewer.f41422l6 = 0.0f;
            }
            try {
                photoViewer.f41355e = true;
                photoViewer.f41365f = true;
                ((WindowManager) photoViewer.D.getSystemService("window")).addView(photoViewer.f41375g0, photoViewer.f41347d0);
                Activity activity = photoViewer.D;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).Z0.add(photoViewer.f41480s1);
                }
                vq0 vq0Var = photoViewer.f41343c5;
                if (vq0Var != null && !vq0Var.f50806s) {
                    vq0Var.f50790a.O0(false, false);
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            if (photoViewer.D2) {
                l2.i0 i0Var = photoViewer.F2.d;
                if (i0Var != null) {
                    i0Var.z1(null);
                }
                photoViewer.F2.z0(photoViewer.C2);
                photoViewer.C2.setVisibility(4);
                photoViewer.F3 = 2;
                photoViewer.E3 = false;
                photoViewer.f41356e0.invalidate();
                photoViewer.f41498u3 = 4;
                return;
            }
            photoViewer.f41498u3 = 4;
        }
    }

    @Override
    public int U() {
        boolean k10 = k();
        PhotoViewer photoViewer = this.f49259a;
        if (k10) {
            return photoViewer.f41366f0.getEmbedHeight();
        }
        org.telegram.ui.Components.fe0 fe0Var = photoViewer.f41536y2;
        if (fe0Var != null && fe0Var.getAspectRatio() > 0.0f) {
            return 1000;
        }
        return photoViewer.V;
    }

    @Override
    public float V() {
        boolean k10 = k();
        PhotoViewer photoViewer = this.f49259a;
        if (k10) {
            return photoViewer.f41366f0.getBufferedPosition();
        }
        org.telegram.ui.Components.n51 n51Var = photoViewer.F2;
        if (n51Var != null && n51Var.U() > 0) {
            return Math.max(photoViewer.Q8, ((float) photoViewer.F2.K()) / ((float) photoViewer.F2.U()));
        }
        return photoViewer.Q8;
    }

    @Override
    public void a(float f10) {
        bq0 bq0Var;
        PhotoViewer photoViewer = this.f49259a;
        if (photoViewer.F2 == null && ((bq0Var = photoViewer.f41366f0) == null || !bq0Var.f31785y)) {
            return;
        }
        if (!photoViewer.A8 && photoViewer.Q7.getVisibility() == 0) {
            f10 = ((photoViewer.R7.getRightProgress() - photoViewer.R7.getLeftProgress()) * f10) + photoViewer.R7.getLeftProgress();
        }
        long x12 = photoViewer.x1();
        if (x12 == -9223372036854775807L) {
            photoViewer.Z2 = f10;
        } else {
            photoViewer.q2((int) (f10 * ((float) x12)));
        }
        photoViewer.Y2(false);
        photoViewer.f41490t3 = false;
    }

    @Override
    public void b() {
        boolean k10 = k();
        PhotoViewer photoViewer = this.f49259a;
        if (k10) {
            photoViewer.f41366f0.f();
            return;
        }
        org.telegram.ui.Components.n51 n51Var = photoViewer.F2;
        if (n51Var != null) {
            n51Var.g0();
        }
    }

    @Override
    public void c(long j3) {
        boolean k10 = k();
        PhotoViewer photoViewer = this.f49259a;
        if (k10) {
            photoViewer.f41366f0.i(j3);
            return;
        }
        org.telegram.ui.Components.n51 n51Var = photoViewer.F2;
        if (n51Var != null) {
            n51Var.p0(j3);
        }
    }

    @Override
    public void c0(Canvas canvas, int i7, int i10) {
        this.f49259a.f41322a4.draw(canvas, i7, i10);
    }

    @Override
    public void d(float f10) {
        ip0 ip0Var;
        ip0 ip0Var2;
        PhotoViewer photoViewer = this.f49259a;
        bq0 bq0Var = photoViewer.f41366f0;
        if (bq0Var != null && bq0Var.f31785y && (ip0Var2 = photoViewer.f41472r3) != null) {
            int i7 = photoViewer.f41453p3.h - org.telegram.ui.Components.q51.S;
            ip0Var2.N = bq0Var;
            if (ip0Var2.W != 0) {
                ip0Var2.W = 0L;
                ip0Var2.f38539f0 = null;
                ip0Var2.f38537e0 = null;
                ip0Var2.f38535d0 = null;
                ip0Var2.b(-1);
            }
            if (i7 != 0) {
                ip0Var2.f38542r = i7;
                int i10 = ((int) (i7 * f10)) / 5;
                if (ip0Var2.f38541n != i10) {
                    ip0Var2.f38541n = i10;
                }
            }
            String g02 = org.telegram.messenger.g0.g0((int) ((bq0Var.getVideoDuration() * f10) / 1000), false, false);
            ip0Var2.D = g02;
            ip0Var2.E = (int) Math.ceil(ip0Var2.F.measureText(g02));
            ip0Var2.invalidate();
            if (ip0Var2.f38538f != null) {
                Utilities.f21333e.a(ip0Var2.f38538f);
            }
            double videoDuration = (f10 * bq0Var.getVideoDuration()) / 1000.0d;
            ip0Var2.O = videoDuration;
            String c10 = bq0Var.c((int) videoDuration);
            if (c10 != null) {
                ip0Var2.Q.o0(c10, null, null, null, 0L);
            }
        } else if (photoViewer.F2 != null && (ip0Var = photoViewer.f41472r3) != null) {
            ip0Var.e(photoViewer.S4, f10, photoViewer.f41453p3.h - org.telegram.ui.Components.q51.S);
        }
        this.f49259a.Y2(true);
        PhotoViewer.P(this.f49259a);
    }

    @Override
    public boolean e0() {
        if (k() && !this.f49259a.f41366f0.f31785y) {
            return false;
        }
        return true;
    }

    @Override
    public void f() {
        boolean k10 = k();
        PhotoViewer photoViewer = this.f49259a;
        if (k10) {
            photoViewer.f41366f0.g();
            return;
        }
        org.telegram.ui.Components.n51 n51Var = photoViewer.F2;
        if (n51Var != null) {
            n51Var.h0();
        }
    }

    @Override
    public void g(ti.q qVar) {
        PhotoViewer photoViewer = this.f49259a;
        photoViewer.R8 = true;
        if (photoViewer.D2) {
            org.telegram.ui.Components.n51 n51Var = photoViewer.F2;
            if (n51Var != null) {
                n51Var.z0(null);
                photoViewer.F2.A0(null);
                photoViewer.F2.A0(qVar);
            }
        } else {
            TextureView textureView = photoViewer.B2;
            if (textureView != null) {
                photoViewer.P8 = qVar;
                org.telegram.messenger.g0.E2(textureView);
                photoViewer.P8 = null;
            }
        }
        try {
            uq0 uq0Var = photoViewer.f41375g0;
            if (uq0Var != null && uq0Var.getParent() != null) {
                ((WindowManager) photoViewer.D.getSystemService("window")).removeViewImmediate(photoViewer.f41375g0);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public long getDuration() {
        boolean k10 = k();
        PhotoViewer photoViewer = this.f49259a;
        if (k10) {
            return photoViewer.f41366f0.getVideoDuration();
        }
        org.telegram.ui.Components.n51 n51Var = photoViewer.F2;
        if (n51Var != null) {
            return n51Var.U();
        }
        return 0L;
    }

    @Override
    public boolean h() {
        boolean k10 = k();
        PhotoViewer photoViewer = this.f49259a;
        if (k10) {
            return photoViewer.f41366f0.G;
        }
        org.telegram.ui.Components.n51 n51Var = photoViewer.F2;
        if (n51Var != null && n51Var.d0()) {
            return true;
        }
        return false;
    }

    @Override
    public void i() {
        PhotoViewer photoViewer = this.f49259a;
        if (photoViewer.f41411k3 && photoViewer.O3) {
            photoViewer.p2();
        }
    }

    @Override
    public void invalidate() {
        this.f49259a.f41356e0.invalidate();
    }

    @Override
    public int j() {
        return 0;
    }

    public boolean k() {
        PhotoViewer photoViewer = this.f49259a;
        if (photoViewer.f41483s4 && photoViewer.f41366f0 != null) {
            return true;
        }
        return false;
    }

    @Override
    public long l() {
        boolean k10 = k();
        PhotoViewer photoViewer = this.f49259a;
        if (k10) {
            return photoViewer.f41366f0.getCurrentPosition();
        }
        org.telegram.ui.Components.n51 n51Var = photoViewer.F2;
        if (n51Var != null) {
            return n51Var.S();
        }
        return 0L;
    }

    public void m(boolean z9) {
        float f10;
        boolean z10 = !z9;
        PhotoViewer photoViewer = this.f49259a;
        if (photoViewer.V0.isClickable() != z10) {
            photoViewer.V0.setClickable(z10);
            photoViewer.V0.setVisibility(0);
            photoViewer.V0.clearAnimation();
            ViewPropertyAnimator animate = photoViewer.V0.animate();
            if (!z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animate.alpha(f10).setInterpolator(org.telegram.ui.Components.xq.f40310f).setDuration(150L).withEndAction(new org.telegram.ui.Components.tp0(10, photoViewer, z10));
        }
    }

    @Override
    public void n() {
        PhotoViewer photoViewer = this.f49259a;
        if (photoViewer.f41411k3 && photoViewer.O3) {
            org.telegram.messenger.g0.r(photoViewer.f41526x2);
        }
    }

    public void o() {
        PhotoViewer photoViewer = this.f49259a;
        org.telegram.ui.Components.n51 n51Var = photoViewer.F2;
        if (n51Var == null) {
            return;
        }
        n51Var.p0(((float) n51Var.U()) * photoViewer.f41512v8);
        photoViewer.F2.g0();
        photoViewer.R7.setProgress(photoViewer.f41512v8);
        photoViewer.n0();
        ef0 ef0Var = new ef0(this, 22);
        photoViewer.H2 = ef0Var;
        org.telegram.messenger.g0.i3(ef0Var, 860L);
    }

    @Override
    public boolean r() {
        if (k()) {
            bq0 bq0Var = this.f49259a.f41366f0;
            if (bq0Var.f31785y && "inapp".equals(org.telegram.messenger.qp.s1(bq0Var.f31775a).A3)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public boolean u() {
        return this.f49259a.f41332b4.rewinding;
    }

    @Override
    public void v(Rect rect) {
        oq0 oq0Var;
        PhotoViewer photoViewer = this.f49259a;
        RectF rectF = photoViewer.S8;
        if (photoViewer.T8 && (oq0Var = photoViewer.f41356e0) != null && oq0Var.isAttachedToWindow()) {
            int[] iArr = new int[2];
            photoViewer.f41356e0.getLocationOnScreen(iArr);
            rect.set(Math.round(rectF.left + iArr[0]), Math.round(rectF.top + iArr[1]), Math.round(rectF.right + iArr[0]), Math.round(rectF.bottom + iArr[1]));
            return;
        }
        rect.setEmpty();
    }

    @Override
    public View x(LaunchActivity launchActivity) {
        return null;
    }

    @Override
    public void B(View view) {
    }

    @Override
    public void S(View view) {
    }

    @Override
    public void e(View view) {
    }

    @Override
    public void f0(int i7) {
    }

    @Override
    public void y(View view) {
    }

    @Override
    public void Z(int i7, ArrayList arrayList) {
    }
}
