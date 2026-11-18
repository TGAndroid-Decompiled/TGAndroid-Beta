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
public final class so0 implements org.telegram.ui.ActionBar.o0, org.telegram.ui.Components.w51, org.telegram.ui.Components.g61, org.telegram.ui.Components.pd0, wi.l {
    public final PhotoViewer f52040a;

    public so0(PhotoViewer photoViewer) {
        this.f52040a = photoViewer;
    }

    @Override
    public void D(SurfaceTexture surfaceTexture) {
        PhotoViewer photoViewer = this.f52040a;
        photoViewer.S8 = false;
        try {
            vq0 vq0Var = photoViewer.f43226h0;
            if (vq0Var != null && vq0Var.getParent() == null) {
                ((WindowManager) photoViewer.E.getSystemService("window")).addView(photoViewer.f43226h0, photoViewer.f43198e0);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (photoViewer.E2) {
            org.telegram.ui.Components.f61 f61Var = photoViewer.G2;
            if (f61Var != null) {
                f61Var.A0(null);
                photoViewer.G2.z0(photoViewer.D2);
            }
            surfaceTexture.release();
            return;
        }
        TextureView textureView = photoViewer.C2;
        if (textureView != null && photoViewer.f43387z2 != null) {
            textureView.setSurfaceTexture(surfaceTexture);
            org.telegram.messenger.g0.E2(photoViewer.C2);
            photoViewer.f43387z2.addView(photoViewer.C2, 0, c8.ma.e(-1, -1, 17));
        }
    }

    @Override
    public View E() {
        if (m()) {
            return this.f52040a.f43217g0.getWebView();
        }
        return null;
    }

    @Override
    public boolean G() {
        vq0 vq0Var;
        PhotoViewer photoViewer = PhotoViewer.f43157f9;
        PhotoViewer photoViewer2 = this.f52040a;
        if (photoViewer == photoViewer2 && photoViewer2.f43197e && !photoViewer2.J3 && !photoViewer2.S8 && (vq0Var = photoViewer2.f43226h0) != null && vq0Var.getParent() != null) {
            PhotoViewer photoViewer3 = this.f52040a;
            if (!photoViewer3.B3 && photoViewer3.f43279n4 == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void H() {
        this.f52040a.f43184c4.cancelRewind();
    }

    @Override
    public int J() {
        boolean m10 = m();
        PhotoViewer photoViewer = this.f52040a;
        if (m10) {
            return photoViewer.f43217g0.getEmbedWidth();
        }
        org.telegram.ui.Components.se0 se0Var = photoViewer.f43387z2;
        if (se0Var != null && se0Var.getAspectRatio() > 0.0f) {
            return Math.round(photoViewer.f43387z2.getAspectRatio() * 1000.0f);
        }
        return photoViewer.V;
    }

    @Override
    public void L(float f10) {
        this.f52040a.f43184c4.setX(f10);
    }

    @Override
    public boolean N() {
        PhotoViewer photoViewer = this.f52040a;
        if (photoViewer.f43323s2 && h() && !photoViewer.f43333t4) {
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
        org.telegram.ui.Components.f61 f61Var;
        if (!m() && (f61Var = this.f52040a.G2) != null) {
            return f61Var.d;
        }
        return null;
    }

    @Override
    public boolean S() {
        return false;
    }

    @Override
    public void U() {
        this.f52040a.P8 = null;
        PhotoViewer photoViewer = PhotoViewer.f43158g9;
        PhotoViewer photoViewer2 = this.f52040a;
        if (photoViewer == photoViewer2) {
            photoViewer2.J0();
            MediaController.B().F0();
            return;
        }
        PhotoViewer photoViewer3 = PhotoViewer.f43157f9;
        PhotoViewer photoViewer4 = this.f52040a;
        if (photoViewer3 == photoViewer4) {
            if (photoViewer4.S8) {
                photoViewer4.S8 = false;
                try {
                    vq0 vq0Var = photoViewer4.f43226h0;
                    if (vq0Var != null && vq0Var.getParent() == null) {
                        PhotoViewer photoViewer5 = this.f52040a;
                        ((WindowManager) this.f52040a.E.getSystemService("window")).addView(photoViewer5.f43226h0, photoViewer5.f43198e0);
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
            this.f52040a.z0(false, false);
        }
    }

    @Override
    public boolean V(boolean z10, float f10, org.telegram.ui.Components.cn0 cn0Var) {
        boolean m10 = m();
        PhotoViewer photoViewer = this.f52040a;
        if (m10) {
            photoViewer.f43184c4.startRewind(photoViewer.f43217g0, z10, f10, photoViewer.f43338u1, cn0Var);
            return true;
        }
        org.telegram.ui.Components.f61 f61Var = photoViewer.G2;
        if (f61Var == null) {
            return false;
        }
        photoViewer.f43184c4.startRewind(f61Var, z10, f10, photoViewer.f43338u1, cn0Var);
        return true;
    }

    @Override
    public void Z() {
        View view;
        PhotoViewer photoViewer = this.f52040a;
        if (photoViewer.J3) {
            if (PhotoViewer.f43157f9 != null) {
                PhotoViewer.f43157f9.z0(false, true);
            }
            dq0 dq0Var = photoViewer.f43217g0;
            if (dq0Var != null && dq0Var.f36747f != null) {
                if (org.telegram.messenger.t0.f26923x) {
                    try {
                        dq0Var.getContext().startService(new Intent(org.telegram.messenger.t0.f26915b, BringAppForegroundService.class));
                    } catch (Throwable th2) {
                        org.telegram.messenger.a8.g(th2, true);
                    }
                }
                dq0Var.h.setVisibility(0);
                ViewGroup viewGroup = (ViewGroup) dq0Var.f36747f.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(dq0Var.f36747f);
                }
                dq0Var.addView(dq0Var.f36747f, 0, c8.ma.e(-1, -1, 51));
                wi.n nVar = dq0Var.f36744b.P8;
                if (nVar != null) {
                    nVar.a(new fi.e(22));
                }
            }
            PhotoViewer.f43157f9 = PhotoViewer.f43158g9;
            PhotoViewer.f43158g9 = null;
            if (photoViewer.f43217g0 == null) {
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
            if (photoViewer.f43217g0 == null && view != null) {
                org.telegram.messenger.g0.E2(view);
                view.setVisibility(4);
                photoViewer.f43387z2.addView(view);
            }
            if (org.telegram.messenger.t0.f26923x) {
                try {
                    photoViewer.E.startService(new Intent(org.telegram.messenger.t0.f26915b, BringAppForegroundService.class));
                } catch (Throwable th3) {
                    org.telegram.messenger.a8.g(th3, true);
                }
            }
            if (photoViewer.f43217g0 == null) {
                if (view != null) {
                    photoViewer.B3 = true;
                    org.telegram.ui.Components.yi0 s12 = photoViewer.s1(false);
                    float f10 = s12.f42505c / photoViewer.f43369x3.getLayoutParams().width;
                    photoViewer.f43369x3.setScaleX(f10);
                    photoViewer.f43369x3.setScaleY(f10);
                    photoViewer.f43369x3.setTranslationX(s12.f42503a);
                    photoViewer.f43369x3.setTranslationY(s12.f42504b);
                    view.setScaleX(f10);
                    view.setScaleY(f10);
                    view.setTranslationX(s12.f42503a - photoViewer.f43387z2.getX());
                    view.setTranslationY(s12.f42504b - photoViewer.f43387z2.getY());
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
                    photoViewer.f43369x3.setOutlineProvider(gp0Var);
                    photoViewer.f43369x3.setClipToOutline(true);
                    pq0 pq0Var2 = photoViewer.F2;
                    if (pq0Var2 != null) {
                        pq0Var2.setOutlineProvider(gp0Var);
                        photoViewer.F2.setClipToOutline(true);
                    }
                }
            } else {
                photoViewer.f43272m6 = 0.0f;
            }
            try {
                photoViewer.f43197e = true;
                photoViewer.f43207f = true;
                ((WindowManager) photoViewer.E.getSystemService("window")).addView(photoViewer.f43226h0, photoViewer.f43198e0);
                Activity activity = photoViewer.E;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).f43068a1.add(photoViewer.f43330t1);
                }
                wq0 wq0Var = photoViewer.f43193d5;
                if (wq0Var != null && !wq0Var.f53512s) {
                    wq0Var.f53496a.O0(false, false);
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
                photoViewer.f43208f0.invalidate();
                photoViewer.f43349v3 = 4;
                return;
            }
            photoViewer.f43349v3 = 4;
        }
    }

    @Override
    public void a(float f10) {
        dq0 dq0Var;
        PhotoViewer photoViewer = this.f52040a;
        if (photoViewer.G2 == null && ((dq0Var = photoViewer.f43217g0) == null || !dq0Var.f36753y)) {
            return;
        }
        if (!photoViewer.B8 && photoViewer.R7.getVisibility() == 0) {
            f10 = ((photoViewer.S7.getRightProgress() - photoViewer.S7.getLeftProgress()) * f10) + photoViewer.S7.getLeftProgress();
        }
        long x12 = photoViewer.x1();
        if (x12 == -9223372036854775807L) {
            photoViewer.f43163a3 = f10;
        } else {
            photoViewer.r2((int) (f10 * ((float) x12)));
        }
        photoViewer.Z2(false);
        photoViewer.f43340u3 = false;
    }

    @Override
    public int a0() {
        boolean m10 = m();
        PhotoViewer photoViewer = this.f52040a;
        if (m10) {
            return photoViewer.f43217g0.getEmbedHeight();
        }
        org.telegram.ui.Components.se0 se0Var = photoViewer.f43387z2;
        if (se0Var != null && se0Var.getAspectRatio() > 0.0f) {
            return 1000;
        }
        return photoViewer.W;
    }

    @Override
    public void b() {
        boolean m10 = m();
        PhotoViewer photoViewer = this.f52040a;
        if (m10) {
            photoViewer.f43217g0.f();
            return;
        }
        org.telegram.ui.Components.f61 f61Var = photoViewer.G2;
        if (f61Var != null) {
            f61Var.g0();
        }
    }

    @Override
    public float b0() {
        boolean m10 = m();
        PhotoViewer photoViewer = this.f52040a;
        if (m10) {
            return photoViewer.f43217g0.getBufferedPosition();
        }
        org.telegram.ui.Components.f61 f61Var = photoViewer.G2;
        if (f61Var != null && f61Var.U() > 0) {
            return Math.max(photoViewer.R8, ((float) photoViewer.G2.K()) / ((float) photoViewer.G2.U()));
        }
        return photoViewer.R8;
    }

    @Override
    public void c(long j3) {
        boolean m10 = m();
        PhotoViewer photoViewer = this.f52040a;
        if (m10) {
            photoViewer.f43217g0.i(j3);
            return;
        }
        org.telegram.ui.Components.f61 f61Var = photoViewer.G2;
        if (f61Var != null) {
            f61Var.p0(j3);
        }
    }

    @Override
    public int e() {
        return 0;
    }

    @Override
    public void f() {
        boolean m10 = m();
        PhotoViewer photoViewer = this.f52040a;
        if (m10) {
            photoViewer.f43217g0.g();
            return;
        }
        org.telegram.ui.Components.f61 f61Var = photoViewer.G2;
        if (f61Var != null) {
            f61Var.h0();
        }
    }

    @Override
    public void g(float f10) {
        kp0 kp0Var;
        kp0 kp0Var2;
        PhotoViewer photoViewer = this.f52040a;
        dq0 dq0Var = photoViewer.f43217g0;
        if (dq0Var != null && dq0Var.f36753y && (kp0Var2 = photoViewer.f43324s3) != null) {
            int i7 = photoViewer.f43304q3.h - org.telegram.ui.Components.h61.S;
            kp0Var2.O = dq0Var;
            if (kp0Var2.f37041a0 != 0) {
                kp0Var2.f37041a0 = 0L;
                kp0Var2.f37051g0 = null;
                kp0Var2.f37050f0 = null;
                kp0Var2.f37048e0 = null;
                kp0Var2.b(-1);
            }
            if (i7 != 0) {
                kp0Var2.f37054r = i7;
                int i10 = ((int) (i7 * f10)) / 5;
                if (kp0Var2.f37053n != i10) {
                    kp0Var2.f37053n = i10;
                }
            }
            String g02 = org.telegram.messenger.g0.g0((int) ((dq0Var.getVideoDuration() * f10) / 1000), false, false);
            kp0Var2.E = g02;
            kp0Var2.F = (int) Math.ceil(kp0Var2.G.measureText(g02));
            kp0Var2.invalidate();
            if (kp0Var2.f37049f != null) {
                Utilities.f22782e.a(kp0Var2.f37049f);
            }
            double videoDuration = (f10 * dq0Var.getVideoDuration()) / 1000.0d;
            kp0Var2.P = videoDuration;
            String c10 = dq0Var.c((int) videoDuration);
            if (c10 != null) {
                kp0Var2.R.o0(c10, null, null, null, 0L);
            }
        } else if (photoViewer.G2 != null && (kp0Var = photoViewer.f43324s3) != null) {
            kp0Var.e(photoViewer.T4, f10, photoViewer.f43304q3.h - org.telegram.ui.Components.h61.S);
        }
        this.f52040a.Z2(true);
        PhotoViewer.Q(this.f52040a);
    }

    @Override
    public long getDuration() {
        boolean m10 = m();
        PhotoViewer photoViewer = this.f52040a;
        if (m10) {
            return photoViewer.f43217g0.getVideoDuration();
        }
        org.telegram.ui.Components.f61 f61Var = photoViewer.G2;
        if (f61Var != null) {
            return f61Var.U();
        }
        return 0L;
    }

    @Override
    public boolean h() {
        boolean m10 = m();
        PhotoViewer photoViewer = this.f52040a;
        if (m10) {
            return photoViewer.f43217g0.H;
        }
        org.telegram.ui.Components.f61 f61Var = photoViewer.G2;
        if (f61Var != null && f61Var.d0()) {
            return true;
        }
        return false;
    }

    @Override
    public void i(wi.o oVar) {
        PhotoViewer photoViewer = this.f52040a;
        photoViewer.S8 = true;
        if (photoViewer.E2) {
            org.telegram.ui.Components.f61 f61Var = photoViewer.G2;
            if (f61Var != null) {
                f61Var.z0(null);
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
            vq0 vq0Var = photoViewer.f43226h0;
            if (vq0Var != null && vq0Var.getParent() != null) {
                ((WindowManager) photoViewer.E.getSystemService("window")).removeViewImmediate(photoViewer.f43226h0);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public void invalidate() {
        this.f52040a.f43208f0.invalidate();
    }

    @Override
    public void j() {
        PhotoViewer photoViewer = this.f52040a;
        if (photoViewer.f43261l3 && photoViewer.P3) {
            photoViewer.q2();
        }
    }

    @Override
    public void j0(Canvas canvas, int i7, int i10) {
        this.f52040a.f43174b4.draw(canvas, i7, i10);
    }

    @Override
    public void k() {
        PhotoViewer photoViewer = this.f52040a;
        if (photoViewer.f43261l3 && photoViewer.P3) {
            org.telegram.messenger.g0.r(photoViewer.f43378y2);
        }
    }

    @Override
    public long l() {
        boolean m10 = m();
        PhotoViewer photoViewer = this.f52040a;
        if (m10) {
            return photoViewer.f43217g0.getCurrentPosition();
        }
        org.telegram.ui.Components.f61 f61Var = photoViewer.G2;
        if (f61Var != null) {
            return f61Var.S();
        }
        return 0L;
    }

    public boolean m() {
        PhotoViewer photoViewer = this.f52040a;
        if (photoViewer.f43333t4 && photoViewer.f43217g0 != null) {
            return true;
        }
        return false;
    }

    public void n(boolean z10) {
        float f10;
        boolean z11 = !z10;
        PhotoViewer photoViewer = this.f52040a;
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
            animate.alpha(f10).setInterpolator(org.telegram.ui.Components.lr.f37208f).setDuration(150L).withEndAction(new org.telegram.ui.Components.pp0(11, photoViewer, z11));
        }
    }

    public void o() {
        PhotoViewer photoViewer = this.f52040a;
        org.telegram.ui.Components.f61 f61Var = photoViewer.G2;
        if (f61Var == null) {
            return;
        }
        f61Var.p0(((float) f61Var.U()) * photoViewer.f43364w8);
        photoViewer.G2.g0();
        photoViewer.S7.setProgress(photoViewer.f43364w8);
        photoViewer.n0();
        hf0 hf0Var = new hf0(this, 22);
        photoViewer.I2 = hf0Var;
        org.telegram.messenger.g0.h3(hf0Var, 860L);
    }

    @Override
    public boolean o0() {
        if (m() && !this.f52040a.f43217g0.f36753y) {
            return false;
        }
        return true;
    }

    @Override
    public boolean p() {
        if (m()) {
            dq0 dq0Var = this.f52040a.f43217g0;
            if (dq0Var.f36753y && "inapp".equals(org.telegram.messenger.mp.u1(dq0Var.f36743a).D3)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public boolean s() {
        return this.f52040a.f43184c4.rewinding;
    }

    @Override
    public void u(Rect rect) {
        qq0 qq0Var;
        PhotoViewer photoViewer = this.f52040a;
        RectF rectF = photoViewer.T8;
        if (photoViewer.U8 && (qq0Var = photoViewer.f43208f0) != null && qq0Var.isAttachedToWindow()) {
            int[] iArr = new int[2];
            photoViewer.f43208f0.getLocationOnScreen(iArr);
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
