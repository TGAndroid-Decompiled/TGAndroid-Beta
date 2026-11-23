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
public final class to0 implements org.telegram.ui.ActionBar.n0, org.telegram.ui.Components.z51, org.telegram.ui.Components.j61, org.telegram.ui.Components.qd0, wi.l {
    public final PhotoViewer f52312a;

    public to0(PhotoViewer photoViewer) {
        this.f52312a = photoViewer;
    }

    @Override
    public void D(SurfaceTexture surfaceTexture) {
        PhotoViewer photoViewer = this.f52312a;
        photoViewer.S8 = false;
        try {
            wq0 wq0Var = photoViewer.f43236h0;
            if (wq0Var != null && wq0Var.getParent() == null) {
                ((WindowManager) photoViewer.E.getSystemService("window")).addView(photoViewer.f43236h0, photoViewer.f43208e0);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (photoViewer.E2) {
            org.telegram.ui.Components.i61 i61Var = photoViewer.G2;
            if (i61Var != null) {
                i61Var.A0(null);
                photoViewer.G2.z0(photoViewer.D2);
            }
            surfaceTexture.release();
            return;
        }
        TextureView textureView = photoViewer.C2;
        if (textureView != null && photoViewer.f43397z2 != null) {
            textureView.setSurfaceTexture(surfaceTexture);
            org.telegram.messenger.g0.E2(photoViewer.C2);
            photoViewer.f43397z2.addView(photoViewer.C2, 0, c8.na.e(-1, -1, 17));
        }
    }

    @Override
    public View E() {
        if (m()) {
            return this.f52312a.f43227g0.getWebView();
        }
        return null;
    }

    @Override
    public boolean G() {
        wq0 wq0Var;
        PhotoViewer photoViewer = PhotoViewer.f43167f9;
        PhotoViewer photoViewer2 = this.f52312a;
        if (photoViewer == photoViewer2 && photoViewer2.f43207e && !photoViewer2.J3 && !photoViewer2.S8 && (wq0Var = photoViewer2.f43236h0) != null && wq0Var.getParent() != null) {
            PhotoViewer photoViewer3 = this.f52312a;
            if (!photoViewer3.B3 && photoViewer3.f43289n4 == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void H() {
        this.f52312a.f43194c4.cancelRewind();
    }

    @Override
    public int J() {
        boolean m10 = m();
        PhotoViewer photoViewer = this.f52312a;
        if (m10) {
            return photoViewer.f43227g0.getEmbedWidth();
        }
        org.telegram.ui.Components.ue0 ue0Var = photoViewer.f43397z2;
        if (ue0Var != null && ue0Var.getAspectRatio() > 0.0f) {
            return Math.round(photoViewer.f43397z2.getAspectRatio() * 1000.0f);
        }
        return photoViewer.V;
    }

    @Override
    public void L(float f10) {
        this.f52312a.f43194c4.setX(f10);
    }

    @Override
    public boolean N() {
        PhotoViewer photoViewer = this.f52312a;
        if (photoViewer.f43333s2 && h() && !photoViewer.f43343t4) {
            return true;
        }
        return false;
    }

    @Override
    public boolean O() {
        return false;
    }

    @Override
    public e2.c1 Q() {
        org.telegram.ui.Components.i61 i61Var;
        if (!m() && (i61Var = this.f52312a.G2) != null) {
            return i61Var.d;
        }
        return null;
    }

    @Override
    public boolean S() {
        return false;
    }

    @Override
    public void U() {
        this.f52312a.P8 = null;
        PhotoViewer photoViewer = PhotoViewer.f43168g9;
        PhotoViewer photoViewer2 = this.f52312a;
        if (photoViewer == photoViewer2) {
            photoViewer2.J0();
            MediaController.B().F0();
            return;
        }
        PhotoViewer photoViewer3 = PhotoViewer.f43167f9;
        PhotoViewer photoViewer4 = this.f52312a;
        if (photoViewer3 == photoViewer4) {
            if (photoViewer4.S8) {
                photoViewer4.S8 = false;
                try {
                    wq0 wq0Var = photoViewer4.f43236h0;
                    if (wq0Var != null && wq0Var.getParent() == null) {
                        PhotoViewer photoViewer5 = this.f52312a;
                        ((WindowManager) this.f52312a.E.getSystemService("window")).addView(photoViewer5.f43236h0, photoViewer5.f43208e0);
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
            this.f52312a.z0(false, false);
        }
    }

    @Override
    public boolean V(boolean z10, float f10, org.telegram.ui.Components.en0 en0Var) {
        boolean m10 = m();
        PhotoViewer photoViewer = this.f52312a;
        if (m10) {
            photoViewer.f43194c4.startRewind(photoViewer.f43227g0, z10, f10, photoViewer.f43348u1, en0Var);
            return true;
        }
        org.telegram.ui.Components.i61 i61Var = photoViewer.G2;
        if (i61Var == null) {
            return false;
        }
        photoViewer.f43194c4.startRewind(i61Var, z10, f10, photoViewer.f43348u1, en0Var);
        return true;
    }

    @Override
    public void Z() {
        View view;
        PhotoViewer photoViewer = this.f52312a;
        if (photoViewer.J3) {
            if (PhotoViewer.f43167f9 != null) {
                PhotoViewer.f43167f9.z0(false, true);
            }
            eq0 eq0Var = photoViewer.f43227g0;
            if (eq0Var != null && eq0Var.f37128f != null) {
                if (org.telegram.messenger.t0.f26903x) {
                    try {
                        eq0Var.getContext().startService(new Intent(org.telegram.messenger.t0.f26895b, BringAppForegroundService.class));
                    } catch (Throwable th2) {
                        org.telegram.messenger.a8.g(th2, true);
                    }
                }
                eq0Var.h.setVisibility(0);
                ViewGroup viewGroup = (ViewGroup) eq0Var.f37128f.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(eq0Var.f37128f);
                }
                eq0Var.addView(eq0Var.f37128f, 0, c8.na.e(-1, -1, 51));
                wi.n nVar = eq0Var.f37125b.P8;
                if (nVar != null) {
                    nVar.a(new fi.e(22));
                }
            }
            PhotoViewer.f43167f9 = PhotoViewer.f43168g9;
            PhotoViewer.f43168g9 = null;
            if (photoViewer.f43227g0 == null) {
                photoViewer.L3 = true;
                Bitmap bitmap = photoViewer.C3;
                if (bitmap != null) {
                    bitmap.recycle();
                    photoViewer.C3 = null;
                }
                photoViewer.F3 = true;
            }
            photoViewer.J3 = false;
            if (photoViewer.E2) {
                view = photoViewer.D2;
            } else {
                view = photoViewer.C2;
            }
            if (photoViewer.f43227g0 == null && view != null) {
                org.telegram.messenger.g0.E2(view);
                view.setVisibility(4);
                photoViewer.f43397z2.addView(view);
            }
            if (org.telegram.messenger.t0.f26903x) {
                try {
                    photoViewer.E.startService(new Intent(org.telegram.messenger.t0.f26895b, BringAppForegroundService.class));
                } catch (Throwable th3) {
                    org.telegram.messenger.a8.g(th3, true);
                }
            }
            if (photoViewer.f43227g0 == null) {
                if (view != null) {
                    photoViewer.B3 = true;
                    org.telegram.ui.Components.aj0 s12 = photoViewer.s1(false);
                    float f10 = s12.f33498c / photoViewer.f43379x3.getLayoutParams().width;
                    photoViewer.f43379x3.setScaleX(f10);
                    photoViewer.f43379x3.setScaleY(f10);
                    photoViewer.f43379x3.setTranslationX(s12.f33496a);
                    photoViewer.f43379x3.setTranslationY(s12.f33497b);
                    view.setScaleX(f10);
                    view.setScaleY(f10);
                    view.setTranslationX(s12.f33496a - photoViewer.f43397z2.getX());
                    view.setTranslationY(s12.f33497b - photoViewer.f43397z2.getY());
                    qq0 qq0Var = photoViewer.F2;
                    if (qq0Var != null) {
                        qq0Var.setScaleX(f10);
                        photoViewer.F2.setScaleY(f10);
                        photoViewer.F2.setTranslationX(view.getTranslationX());
                        photoViewer.F2.setTranslationY(view.getTranslationY());
                    }
                    photoViewer.X = 0.0f;
                    hp0 hp0Var = new hp0(photoViewer, f10, 1);
                    view.setOutlineProvider(hp0Var);
                    view.setClipToOutline(true);
                    photoViewer.f43379x3.setOutlineProvider(hp0Var);
                    photoViewer.f43379x3.setClipToOutline(true);
                    qq0 qq0Var2 = photoViewer.F2;
                    if (qq0Var2 != null) {
                        qq0Var2.setOutlineProvider(hp0Var);
                        photoViewer.F2.setClipToOutline(true);
                    }
                }
            } else {
                photoViewer.f43282m6 = 0.0f;
            }
            try {
                photoViewer.f43207e = true;
                photoViewer.f43217f = true;
                ((WindowManager) photoViewer.E.getSystemService("window")).addView(photoViewer.f43236h0, photoViewer.f43208e0);
                Activity activity = photoViewer.E;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).f43078a1.add(photoViewer.f43340t1);
                }
                xq0 xq0Var = photoViewer.f43203d5;
                if (xq0Var != null && !xq0Var.f53914s) {
                    xq0Var.f53898a.O0(false, false);
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            if (photoViewer.E2) {
                l2.f0 f0Var = photoViewer.G2.d;
                if (f0Var != null) {
                    f0Var.z1(null);
                }
                photoViewer.G2.z0(photoViewer.D2);
                photoViewer.D2.setVisibility(4);
                photoViewer.G3 = 2;
                photoViewer.F3 = false;
                photoViewer.f43218f0.invalidate();
                photoViewer.f43359v3 = 4;
                return;
            }
            photoViewer.f43359v3 = 4;
        }
    }

    @Override
    public void a(float f10) {
        eq0 eq0Var;
        PhotoViewer photoViewer = this.f52312a;
        if (photoViewer.G2 == null && ((eq0Var = photoViewer.f43227g0) == null || !eq0Var.f37134y)) {
            return;
        }
        if (!photoViewer.B8 && photoViewer.R7.getVisibility() == 0) {
            f10 = ((photoViewer.S7.getRightProgress() - photoViewer.S7.getLeftProgress()) * f10) + photoViewer.S7.getLeftProgress();
        }
        long x12 = photoViewer.x1();
        if (x12 == -9223372036854775807L) {
            photoViewer.f43173a3 = f10;
        } else {
            photoViewer.r2((int) (f10 * ((float) x12)));
        }
        photoViewer.Z2(false);
        photoViewer.f43350u3 = false;
    }

    @Override
    public int a0() {
        boolean m10 = m();
        PhotoViewer photoViewer = this.f52312a;
        if (m10) {
            return photoViewer.f43227g0.getEmbedHeight();
        }
        org.telegram.ui.Components.ue0 ue0Var = photoViewer.f43397z2;
        if (ue0Var != null && ue0Var.getAspectRatio() > 0.0f) {
            return 1000;
        }
        return photoViewer.W;
    }

    @Override
    public void b() {
        boolean m10 = m();
        PhotoViewer photoViewer = this.f52312a;
        if (m10) {
            photoViewer.f43227g0.f();
            return;
        }
        org.telegram.ui.Components.i61 i61Var = photoViewer.G2;
        if (i61Var != null) {
            i61Var.g0();
        }
    }

    @Override
    public float b0() {
        boolean m10 = m();
        PhotoViewer photoViewer = this.f52312a;
        if (m10) {
            return photoViewer.f43227g0.getBufferedPosition();
        }
        org.telegram.ui.Components.i61 i61Var = photoViewer.G2;
        if (i61Var != null && i61Var.U() > 0) {
            return Math.max(photoViewer.R8, ((float) photoViewer.G2.K()) / ((float) photoViewer.G2.U()));
        }
        return photoViewer.R8;
    }

    @Override
    public void c(long j3) {
        boolean m10 = m();
        PhotoViewer photoViewer = this.f52312a;
        if (m10) {
            photoViewer.f43227g0.i(j3);
            return;
        }
        org.telegram.ui.Components.i61 i61Var = photoViewer.G2;
        if (i61Var != null) {
            i61Var.p0(j3);
        }
    }

    @Override
    public int e() {
        return 0;
    }

    @Override
    public void f() {
        boolean m10 = m();
        PhotoViewer photoViewer = this.f52312a;
        if (m10) {
            photoViewer.f43227g0.g();
            return;
        }
        org.telegram.ui.Components.i61 i61Var = photoViewer.G2;
        if (i61Var != null) {
            i61Var.h0();
        }
    }

    @Override
    public void g(float f10) {
        lp0 lp0Var;
        lp0 lp0Var2;
        PhotoViewer photoViewer = this.f52312a;
        eq0 eq0Var = photoViewer.f43227g0;
        if (eq0Var != null && eq0Var.f37134y && (lp0Var2 = photoViewer.f43334s3) != null) {
            int i7 = photoViewer.f43314q3.h - org.telegram.ui.Components.k61.S;
            lp0Var2.O = eq0Var;
            if (lp0Var2.f38090a0 != 0) {
                lp0Var2.f38090a0 = 0L;
                lp0Var2.f38100g0 = null;
                lp0Var2.f38099f0 = null;
                lp0Var2.f38097e0 = null;
                lp0Var2.b(-1);
            }
            if (i7 != 0) {
                lp0Var2.f38103r = i7;
                int i10 = ((int) (i7 * f10)) / 5;
                if (lp0Var2.f38102n != i10) {
                    lp0Var2.f38102n = i10;
                }
            }
            String g02 = org.telegram.messenger.g0.g0((int) ((eq0Var.getVideoDuration() * f10) / 1000), false, false);
            lp0Var2.E = g02;
            lp0Var2.F = (int) Math.ceil(lp0Var2.G.measureText(g02));
            lp0Var2.invalidate();
            if (lp0Var2.f38098f != null) {
                Utilities.f22774e.a(lp0Var2.f38098f);
            }
            double videoDuration = (f10 * eq0Var.getVideoDuration()) / 1000.0d;
            lp0Var2.P = videoDuration;
            String c10 = eq0Var.c((int) videoDuration);
            if (c10 != null) {
                lp0Var2.R.o0(c10, null, null, null, 0L);
            }
        } else if (photoViewer.G2 != null && (lp0Var = photoViewer.f43334s3) != null) {
            lp0Var.e(photoViewer.T4, f10, photoViewer.f43314q3.h - org.telegram.ui.Components.k61.S);
        }
        this.f52312a.Z2(true);
        PhotoViewer.Q(this.f52312a);
    }

    @Override
    public long getDuration() {
        boolean m10 = m();
        PhotoViewer photoViewer = this.f52312a;
        if (m10) {
            return photoViewer.f43227g0.getVideoDuration();
        }
        org.telegram.ui.Components.i61 i61Var = photoViewer.G2;
        if (i61Var != null) {
            return i61Var.U();
        }
        return 0L;
    }

    @Override
    public boolean h() {
        boolean m10 = m();
        PhotoViewer photoViewer = this.f52312a;
        if (m10) {
            return photoViewer.f43227g0.H;
        }
        org.telegram.ui.Components.i61 i61Var = photoViewer.G2;
        if (i61Var != null && i61Var.d0()) {
            return true;
        }
        return false;
    }

    @Override
    public void i(wi.o oVar) {
        PhotoViewer photoViewer = this.f52312a;
        photoViewer.S8 = true;
        if (photoViewer.E2) {
            org.telegram.ui.Components.i61 i61Var = photoViewer.G2;
            if (i61Var != null) {
                i61Var.z0(null);
                photoViewer.G2.A0(null);
                photoViewer.G2.A0(oVar);
            }
        } else {
            TextureView textureView = photoViewer.C2;
            if (textureView != null) {
                photoViewer.Q8 = oVar;
                org.telegram.messenger.g0.E2(textureView);
                photoViewer.Q8 = null;
            }
        }
        try {
            wq0 wq0Var = photoViewer.f43236h0;
            if (wq0Var != null && wq0Var.getParent() != null) {
                ((WindowManager) photoViewer.E.getSystemService("window")).removeViewImmediate(photoViewer.f43236h0);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public void invalidate() {
        this.f52312a.f43218f0.invalidate();
    }

    @Override
    public void j() {
        PhotoViewer photoViewer = this.f52312a;
        if (photoViewer.f43271l3 && photoViewer.P3) {
            photoViewer.q2();
        }
    }

    @Override
    public void j0(Canvas canvas, int i7, int i10) {
        this.f52312a.f43184b4.draw(canvas, i7, i10);
    }

    @Override
    public void k() {
        PhotoViewer photoViewer = this.f52312a;
        if (photoViewer.f43271l3 && photoViewer.P3) {
            org.telegram.messenger.g0.r(photoViewer.f43388y2);
        }
    }

    @Override
    public long l() {
        boolean m10 = m();
        PhotoViewer photoViewer = this.f52312a;
        if (m10) {
            return photoViewer.f43227g0.getCurrentPosition();
        }
        org.telegram.ui.Components.i61 i61Var = photoViewer.G2;
        if (i61Var != null) {
            return i61Var.S();
        }
        return 0L;
    }

    public boolean m() {
        PhotoViewer photoViewer = this.f52312a;
        if (photoViewer.f43343t4 && photoViewer.f43227g0 != null) {
            return true;
        }
        return false;
    }

    public void n(boolean z10) {
        float f10;
        boolean z11 = !z10;
        PhotoViewer photoViewer = this.f52312a;
        if (photoViewer.W0.isClickable() != z11) {
            photoViewer.W0.setClickable(z11);
            photoViewer.W0.setVisibility(0);
            photoViewer.W0.clearAnimation();
            ViewPropertyAnimator animate = photoViewer.W0.animate();
            if (!z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animate.alpha(f10).setInterpolator(org.telegram.ui.Components.nr.f37917f).setDuration(150L).withEndAction(new org.telegram.ui.Components.rp0(11, photoViewer, z11));
        }
    }

    public void o() {
        PhotoViewer photoViewer = this.f52312a;
        org.telegram.ui.Components.i61 i61Var = photoViewer.G2;
        if (i61Var == null) {
            return;
        }
        i61Var.p0(((float) i61Var.U()) * photoViewer.f43374w8);
        photoViewer.G2.g0();
        photoViewer.S7.setProgress(photoViewer.f43374w8);
        photoViewer.n0();
        hf0 hf0Var = new hf0(this, 22);
        photoViewer.I2 = hf0Var;
        org.telegram.messenger.g0.h3(hf0Var, 860L);
    }

    @Override
    public boolean o0() {
        if (m() && !this.f52312a.f43227g0.f37134y) {
            return false;
        }
        return true;
    }

    @Override
    public boolean p() {
        if (m()) {
            eq0 eq0Var = this.f52312a.f43227g0;
            if (eq0Var.f37134y && "inapp".equals(org.telegram.messenger.np.u1(eq0Var.f37124a).D3)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public boolean s() {
        return this.f52312a.f43194c4.rewinding;
    }

    @Override
    public void u(Rect rect) {
        rq0 rq0Var;
        PhotoViewer photoViewer = this.f52312a;
        RectF rectF = photoViewer.T8;
        if (photoViewer.U8 && (rq0Var = photoViewer.f43218f0) != null && rq0Var.isAttachedToWindow()) {
            int[] iArr = new int[2];
            photoViewer.f43218f0.getLocationOnScreen(iArr);
            rect.set(Math.round(rectF.left + iArr[0]), Math.round(rectF.top + iArr[1]), Math.round(rectF.right + iArr[0]), Math.round(rectF.bottom + iArr[1]));
            return;
        }
        rect.setEmpty();
    }

    @Override
    public View v(LaunchActivity launchActivity) {
        return null;
    }

    @Override
    public void B(View view) {
    }

    @Override
    public void X(View view) {
    }

    @Override
    public void d(View view) {
    }

    @Override
    public void p0(int i7) {
    }

    @Override
    public void w(View view) {
    }

    @Override
    public void h0(int i7, ArrayList arrayList) {
    }
}
