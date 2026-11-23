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
public final class so0 implements org.telegram.ui.ActionBar.n0, org.telegram.ui.Components.z51, org.telegram.ui.Components.j61, org.telegram.ui.Components.qd0, wi.l {
    public final PhotoViewer f52091a;

    public so0(PhotoViewer photoViewer) {
        this.f52091a = photoViewer;
    }

    @Override
    public void D(SurfaceTexture surfaceTexture) {
        PhotoViewer photoViewer = this.f52091a;
        photoViewer.S8 = false;
        try {
            vq0 vq0Var = photoViewer.f43271h0;
            if (vq0Var != null && vq0Var.getParent() == null) {
                ((WindowManager) photoViewer.E.getSystemService("window")).addView(photoViewer.f43271h0, photoViewer.f43243e0);
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
        if (textureView != null && photoViewer.f43432z2 != null) {
            textureView.setSurfaceTexture(surfaceTexture);
            org.telegram.messenger.g0.E2(photoViewer.C2);
            photoViewer.f43432z2.addView(photoViewer.C2, 0, c8.ma.e(-1, -1, 17));
        }
    }

    @Override
    public View E() {
        if (m()) {
            return this.f52091a.f43262g0.getWebView();
        }
        return null;
    }

    @Override
    public boolean G() {
        vq0 vq0Var;
        PhotoViewer photoViewer = PhotoViewer.f43202f9;
        PhotoViewer photoViewer2 = this.f52091a;
        if (photoViewer == photoViewer2 && photoViewer2.f43242e && !photoViewer2.J3 && !photoViewer2.S8 && (vq0Var = photoViewer2.f43271h0) != null && vq0Var.getParent() != null) {
            PhotoViewer photoViewer3 = this.f52091a;
            if (!photoViewer3.B3 && photoViewer3.f43324n4 == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void H() {
        this.f52091a.f43229c4.cancelRewind();
    }

    @Override
    public int J() {
        boolean m10 = m();
        PhotoViewer photoViewer = this.f52091a;
        if (m10) {
            return photoViewer.f43262g0.getEmbedWidth();
        }
        org.telegram.ui.Components.ue0 ue0Var = photoViewer.f43432z2;
        if (ue0Var != null && ue0Var.getAspectRatio() > 0.0f) {
            return Math.round(photoViewer.f43432z2.getAspectRatio() * 1000.0f);
        }
        return photoViewer.V;
    }

    @Override
    public void L(float f10) {
        this.f52091a.f43229c4.setX(f10);
    }

    @Override
    public boolean N() {
        PhotoViewer photoViewer = this.f52091a;
        if (photoViewer.f43368s2 && h() && !photoViewer.f43378t4) {
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
        if (!m() && (i61Var = this.f52091a.G2) != null) {
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
        this.f52091a.P8 = null;
        PhotoViewer photoViewer = PhotoViewer.f43203g9;
        PhotoViewer photoViewer2 = this.f52091a;
        if (photoViewer == photoViewer2) {
            photoViewer2.J0();
            MediaController.B().F0();
            return;
        }
        PhotoViewer photoViewer3 = PhotoViewer.f43202f9;
        PhotoViewer photoViewer4 = this.f52091a;
        if (photoViewer3 == photoViewer4) {
            if (photoViewer4.S8) {
                photoViewer4.S8 = false;
                try {
                    vq0 vq0Var = photoViewer4.f43271h0;
                    if (vq0Var != null && vq0Var.getParent() == null) {
                        PhotoViewer photoViewer5 = this.f52091a;
                        ((WindowManager) this.f52091a.E.getSystemService("window")).addView(photoViewer5.f43271h0, photoViewer5.f43243e0);
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
            this.f52091a.z0(false, false);
        }
    }

    @Override
    public boolean V(boolean z10, float f10, org.telegram.ui.Components.fn0 fn0Var) {
        boolean m10 = m();
        PhotoViewer photoViewer = this.f52091a;
        if (m10) {
            photoViewer.f43229c4.startRewind(photoViewer.f43262g0, z10, f10, photoViewer.f43383u1, fn0Var);
            return true;
        }
        org.telegram.ui.Components.i61 i61Var = photoViewer.G2;
        if (i61Var == null) {
            return false;
        }
        photoViewer.f43229c4.startRewind(i61Var, z10, f10, photoViewer.f43383u1, fn0Var);
        return true;
    }

    @Override
    public void Z() {
        View view;
        PhotoViewer photoViewer = this.f52091a;
        if (photoViewer.J3) {
            if (PhotoViewer.f43202f9 != null) {
                PhotoViewer.f43202f9.z0(false, true);
            }
            dq0 dq0Var = photoViewer.f43262g0;
            if (dq0Var != null && dq0Var.f37171f != null) {
                if (org.telegram.messenger.t0.f26939x) {
                    try {
                        dq0Var.getContext().startService(new Intent(org.telegram.messenger.t0.f26931b, BringAppForegroundService.class));
                    } catch (Throwable th2) {
                        org.telegram.messenger.a8.g(th2, true);
                    }
                }
                dq0Var.h.setVisibility(0);
                ViewGroup viewGroup = (ViewGroup) dq0Var.f37171f.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(dq0Var.f37171f);
                }
                dq0Var.addView(dq0Var.f37171f, 0, c8.ma.e(-1, -1, 51));
                wi.n nVar = dq0Var.f37168b.P8;
                if (nVar != null) {
                    nVar.a(new fi.e(22));
                }
            }
            PhotoViewer.f43202f9 = PhotoViewer.f43203g9;
            PhotoViewer.f43203g9 = null;
            if (photoViewer.f43262g0 == null) {
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
            if (photoViewer.f43262g0 == null && view != null) {
                org.telegram.messenger.g0.E2(view);
                view.setVisibility(4);
                photoViewer.f43432z2.addView(view);
            }
            if (org.telegram.messenger.t0.f26939x) {
                try {
                    photoViewer.E.startService(new Intent(org.telegram.messenger.t0.f26931b, BringAppForegroundService.class));
                } catch (Throwable th3) {
                    org.telegram.messenger.a8.g(th3, true);
                }
            }
            if (photoViewer.f43262g0 == null) {
                if (view != null) {
                    photoViewer.B3 = true;
                    org.telegram.ui.Components.aj0 s12 = photoViewer.s1(false);
                    float f10 = s12.f33537c / photoViewer.f43414x3.getLayoutParams().width;
                    photoViewer.f43414x3.setScaleX(f10);
                    photoViewer.f43414x3.setScaleY(f10);
                    photoViewer.f43414x3.setTranslationX(s12.f33535a);
                    photoViewer.f43414x3.setTranslationY(s12.f33536b);
                    view.setScaleX(f10);
                    view.setScaleY(f10);
                    view.setTranslationX(s12.f33535a - photoViewer.f43432z2.getX());
                    view.setTranslationY(s12.f33536b - photoViewer.f43432z2.getY());
                    pq0 pq0Var = photoViewer.F2;
                    if (pq0Var != null) {
                        pq0Var.setScaleX(f10);
                        photoViewer.F2.setScaleY(f10);
                        photoViewer.F2.setTranslationX(view.getTranslationX());
                        photoViewer.F2.setTranslationY(view.getTranslationY());
                    }
                    photoViewer.X = 0.0f;
                    gp0 gp0Var = new gp0(photoViewer, f10, 1);
                    view.setOutlineProvider(gp0Var);
                    view.setClipToOutline(true);
                    photoViewer.f43414x3.setOutlineProvider(gp0Var);
                    photoViewer.f43414x3.setClipToOutline(true);
                    pq0 pq0Var2 = photoViewer.F2;
                    if (pq0Var2 != null) {
                        pq0Var2.setOutlineProvider(gp0Var);
                        photoViewer.F2.setClipToOutline(true);
                    }
                }
            } else {
                photoViewer.f43317m6 = 0.0f;
            }
            try {
                photoViewer.f43242e = true;
                photoViewer.f43252f = true;
                ((WindowManager) photoViewer.E.getSystemService("window")).addView(photoViewer.f43271h0, photoViewer.f43243e0);
                Activity activity = photoViewer.E;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).f43113a1.add(photoViewer.f43375t1);
                }
                wq0 wq0Var = photoViewer.f43238d5;
                if (wq0Var != null && !wq0Var.f53513s) {
                    wq0Var.f53497a.O0(false, false);
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
                photoViewer.f43253f0.invalidate();
                photoViewer.f43394v3 = 4;
                return;
            }
            photoViewer.f43394v3 = 4;
        }
    }

    @Override
    public void a(float f10) {
        dq0 dq0Var;
        PhotoViewer photoViewer = this.f52091a;
        if (photoViewer.G2 == null && ((dq0Var = photoViewer.f43262g0) == null || !dq0Var.f37177y)) {
            return;
        }
        if (!photoViewer.B8 && photoViewer.R7.getVisibility() == 0) {
            f10 = ((photoViewer.S7.getRightProgress() - photoViewer.S7.getLeftProgress()) * f10) + photoViewer.S7.getLeftProgress();
        }
        long x12 = photoViewer.x1();
        if (x12 == -9223372036854775807L) {
            photoViewer.f43208a3 = f10;
        } else {
            photoViewer.r2((int) (f10 * ((float) x12)));
        }
        photoViewer.Z2(false);
        photoViewer.f43385u3 = false;
    }

    @Override
    public int a0() {
        boolean m10 = m();
        PhotoViewer photoViewer = this.f52091a;
        if (m10) {
            return photoViewer.f43262g0.getEmbedHeight();
        }
        org.telegram.ui.Components.ue0 ue0Var = photoViewer.f43432z2;
        if (ue0Var != null && ue0Var.getAspectRatio() > 0.0f) {
            return 1000;
        }
        return photoViewer.W;
    }

    @Override
    public void b() {
        boolean m10 = m();
        PhotoViewer photoViewer = this.f52091a;
        if (m10) {
            photoViewer.f43262g0.f();
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
        PhotoViewer photoViewer = this.f52091a;
        if (m10) {
            return photoViewer.f43262g0.getBufferedPosition();
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
        PhotoViewer photoViewer = this.f52091a;
        if (m10) {
            photoViewer.f43262g0.i(j3);
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
        PhotoViewer photoViewer = this.f52091a;
        if (m10) {
            photoViewer.f43262g0.g();
            return;
        }
        org.telegram.ui.Components.i61 i61Var = photoViewer.G2;
        if (i61Var != null) {
            i61Var.h0();
        }
    }

    @Override
    public void g(float f10) {
        kp0 kp0Var;
        kp0 kp0Var2;
        PhotoViewer photoViewer = this.f52091a;
        dq0 dq0Var = photoViewer.f43262g0;
        if (dq0Var != null && dq0Var.f37177y && (kp0Var2 = photoViewer.f43369s3) != null) {
            int i7 = photoViewer.f43349q3.h - org.telegram.ui.Components.k61.S;
            kp0Var2.O = dq0Var;
            if (kp0Var2.f38123a0 != 0) {
                kp0Var2.f38123a0 = 0L;
                kp0Var2.f38133g0 = null;
                kp0Var2.f38132f0 = null;
                kp0Var2.f38130e0 = null;
                kp0Var2.b(-1);
            }
            if (i7 != 0) {
                kp0Var2.f38136r = i7;
                int i10 = ((int) (i7 * f10)) / 5;
                if (kp0Var2.f38135n != i10) {
                    kp0Var2.f38135n = i10;
                }
            }
            String g02 = org.telegram.messenger.g0.g0((int) ((dq0Var.getVideoDuration() * f10) / 1000), false, false);
            kp0Var2.E = g02;
            kp0Var2.F = (int) Math.ceil(kp0Var2.G.measureText(g02));
            kp0Var2.invalidate();
            if (kp0Var2.f38131f != null) {
                Utilities.f22810e.a(kp0Var2.f38131f);
            }
            double videoDuration = (f10 * dq0Var.getVideoDuration()) / 1000.0d;
            kp0Var2.P = videoDuration;
            String c10 = dq0Var.c((int) videoDuration);
            if (c10 != null) {
                kp0Var2.R.o0(c10, null, null, null, 0L);
            }
        } else if (photoViewer.G2 != null && (kp0Var = photoViewer.f43369s3) != null) {
            kp0Var.e(photoViewer.T4, f10, photoViewer.f43349q3.h - org.telegram.ui.Components.k61.S);
        }
        this.f52091a.Z2(true);
        PhotoViewer.Q(this.f52091a);
    }

    @Override
    public long getDuration() {
        boolean m10 = m();
        PhotoViewer photoViewer = this.f52091a;
        if (m10) {
            return photoViewer.f43262g0.getVideoDuration();
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
        PhotoViewer photoViewer = this.f52091a;
        if (m10) {
            return photoViewer.f43262g0.H;
        }
        org.telegram.ui.Components.i61 i61Var = photoViewer.G2;
        if (i61Var != null && i61Var.d0()) {
            return true;
        }
        return false;
    }

    @Override
    public void i(wi.o oVar) {
        PhotoViewer photoViewer = this.f52091a;
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
            vq0 vq0Var = photoViewer.f43271h0;
            if (vq0Var != null && vq0Var.getParent() != null) {
                ((WindowManager) photoViewer.E.getSystemService("window")).removeViewImmediate(photoViewer.f43271h0);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public void invalidate() {
        this.f52091a.f43253f0.invalidate();
    }

    @Override
    public void j() {
        PhotoViewer photoViewer = this.f52091a;
        if (photoViewer.f43306l3 && photoViewer.P3) {
            photoViewer.q2();
        }
    }

    @Override
    public void j0(Canvas canvas, int i7, int i10) {
        this.f52091a.f43219b4.draw(canvas, i7, i10);
    }

    @Override
    public void k() {
        PhotoViewer photoViewer = this.f52091a;
        if (photoViewer.f43306l3 && photoViewer.P3) {
            org.telegram.messenger.g0.r(photoViewer.f43423y2);
        }
    }

    @Override
    public long l() {
        boolean m10 = m();
        PhotoViewer photoViewer = this.f52091a;
        if (m10) {
            return photoViewer.f43262g0.getCurrentPosition();
        }
        org.telegram.ui.Components.i61 i61Var = photoViewer.G2;
        if (i61Var != null) {
            return i61Var.S();
        }
        return 0L;
    }

    public boolean m() {
        PhotoViewer photoViewer = this.f52091a;
        if (photoViewer.f43378t4 && photoViewer.f43262g0 != null) {
            return true;
        }
        return false;
    }

    public void n(boolean z10) {
        float f10;
        boolean z11 = !z10;
        PhotoViewer photoViewer = this.f52091a;
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
            animate.alpha(f10).setInterpolator(org.telegram.ui.Components.nr.f37960f).setDuration(150L).withEndAction(new org.telegram.ui.Components.rp0(11, photoViewer, z11));
        }
    }

    public void o() {
        PhotoViewer photoViewer = this.f52091a;
        org.telegram.ui.Components.i61 i61Var = photoViewer.G2;
        if (i61Var == null) {
            return;
        }
        i61Var.p0(((float) i61Var.U()) * photoViewer.f43409w8);
        photoViewer.G2.g0();
        photoViewer.S7.setProgress(photoViewer.f43409w8);
        photoViewer.n0();
        hf0 hf0Var = new hf0(this, 22);
        photoViewer.I2 = hf0Var;
        org.telegram.messenger.g0.h3(hf0Var, 860L);
    }

    @Override
    public boolean o0() {
        if (m() && !this.f52091a.f43262g0.f37177y) {
            return false;
        }
        return true;
    }

    @Override
    public boolean p() {
        if (m()) {
            dq0 dq0Var = this.f52091a.f43262g0;
            if (dq0Var.f37177y && "inapp".equals(org.telegram.messenger.np.u1(dq0Var.f37167a).D3)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public boolean s() {
        return this.f52091a.f43229c4.rewinding;
    }

    @Override
    public void u(Rect rect) {
        qq0 qq0Var;
        PhotoViewer photoViewer = this.f52091a;
        RectF rectF = photoViewer.T8;
        if (photoViewer.U8 && (qq0Var = photoViewer.f43253f0) != null && qq0Var.isAttachedToWindow()) {
            int[] iArr = new int[2];
            photoViewer.f43253f0.getLocationOnScreen(iArr);
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
