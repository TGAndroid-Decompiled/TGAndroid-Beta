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
public final class ro0 implements org.telegram.ui.ActionBar.o0, org.telegram.ui.Components.h51, org.telegram.ui.Components.t51, org.telegram.ui.Components.ed0, ti.m {
    public final PhotoViewer f49543a;

    public ro0(PhotoViewer photoViewer) {
        this.f49543a = photoViewer;
    }

    @Override
    public void C(SurfaceTexture surfaceTexture) {
        PhotoViewer photoViewer = this.f49543a;
        photoViewer.R8 = false;
        try {
            vq0 vq0Var = photoViewer.f41400g0;
            if (vq0Var != null && vq0Var.getParent() == null) {
                ((WindowManager) photoViewer.D.getSystemService("window")).addView(photoViewer.f41400g0, photoViewer.f41372d0);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (photoViewer.D2) {
            org.telegram.ui.Components.s51 s51Var = photoViewer.F2;
            if (s51Var != null) {
                s51Var.A0(null);
                photoViewer.F2.z0(photoViewer.C2);
            }
            surfaceTexture.release();
            return;
        }
        TextureView textureView = photoViewer.B2;
        if (textureView != null && photoViewer.f41561y2 != null) {
            textureView.setSurfaceTexture(surfaceTexture);
            org.telegram.messenger.g0.E2(photoViewer.B2);
            photoViewer.f41561y2.addView(photoViewer.B2, 0, c8.ha.e(-1, -1, 17));
        }
    }

    @Override
    public View D() {
        if (k()) {
            return this.f49543a.f41391f0.getWebView();
        }
        return null;
    }

    @Override
    public boolean E() {
        vq0 vq0Var;
        PhotoViewer photoViewer = PhotoViewer.f41340e9;
        PhotoViewer photoViewer2 = this.f49543a;
        if (photoViewer == photoViewer2 && photoViewer2.f41380e && !photoViewer2.I3 && !photoViewer2.R8 && (vq0Var = photoViewer2.f41400g0) != null && vq0Var.getParent() != null) {
            PhotoViewer photoViewer3 = this.f49543a;
            if (!photoViewer3.A3 && photoViewer3.f41453m4 == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void F() {
        this.f49543a.f41357b4.cancelRewind();
    }

    @Override
    public int I() {
        boolean k10 = k();
        PhotoViewer photoViewer = this.f49543a;
        if (k10) {
            return photoViewer.f41391f0.getEmbedWidth();
        }
        org.telegram.ui.Components.fe0 fe0Var = photoViewer.f41561y2;
        if (fe0Var != null && fe0Var.getAspectRatio() > 0.0f) {
            return Math.round(photoViewer.f41561y2.getAspectRatio() * 1000.0f);
        }
        return photoViewer.U;
    }

    @Override
    public void J(float f10) {
        this.f49543a.f41357b4.setX(f10);
    }

    @Override
    public boolean K() {
        PhotoViewer photoViewer = this.f49543a;
        if (photoViewer.f41496r2 && h() && !photoViewer.f41508s4) {
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
        org.telegram.ui.Components.s51 s51Var;
        if (!k() && (s51Var = this.f49543a.F2) != null) {
            return s51Var.d;
        }
        return null;
    }

    @Override
    public boolean P() {
        return false;
    }

    @Override
    public void Q() {
        this.f49543a.O8 = null;
        PhotoViewer photoViewer = PhotoViewer.f41341f9;
        PhotoViewer photoViewer2 = this.f49543a;
        if (photoViewer == photoViewer2) {
            photoViewer2.J0();
            MediaController.B().F0();
            return;
        }
        PhotoViewer photoViewer3 = PhotoViewer.f41340e9;
        PhotoViewer photoViewer4 = this.f49543a;
        if (photoViewer3 == photoViewer4) {
            if (photoViewer4.R8) {
                photoViewer4.R8 = false;
                try {
                    vq0 vq0Var = photoViewer4.f41400g0;
                    if (vq0Var != null && vq0Var.getParent() == null) {
                        PhotoViewer photoViewer5 = this.f49543a;
                        ((WindowManager) this.f49543a.D.getSystemService("window")).addView(photoViewer5.f41400g0, photoViewer5.f41372d0);
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
            this.f49543a.z0(false, false);
        }
    }

    @Override
    public boolean R(boolean z9, float f10, org.telegram.ui.Components.qm0 qm0Var) {
        boolean k10 = k();
        PhotoViewer photoViewer = this.f49543a;
        if (k10) {
            photoViewer.f41357b4.startRewind(photoViewer.f41391f0, z9, f10, photoViewer.f41513t1, qm0Var);
            return true;
        }
        org.telegram.ui.Components.s51 s51Var = photoViewer.F2;
        if (s51Var == null) {
            return false;
        }
        photoViewer.f41357b4.startRewind(s51Var, z9, f10, photoViewer.f41513t1, qm0Var);
        return true;
    }

    @Override
    public void T() {
        View view;
        PhotoViewer photoViewer = this.f49543a;
        if (photoViewer.I3) {
            if (PhotoViewer.f41340e9 != null) {
                PhotoViewer.f41340e9.z0(false, true);
            }
            cq0 cq0Var = photoViewer.f41391f0;
            if (cq0Var != null && cq0Var.f31791f != null) {
                if (org.telegram.messenger.t0.f25563x) {
                    try {
                        cq0Var.getContext().startService(new Intent(org.telegram.messenger.t0.f25555b, BringAppForegroundService.class));
                    } catch (Throwable th2) {
                        org.telegram.messenger.a8.g(th2, true);
                    }
                }
                cq0Var.h.setVisibility(0);
                ViewGroup viewGroup = (ViewGroup) cq0Var.f31791f.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(cq0Var.f31791f);
                }
                cq0Var.addView(cq0Var.f31791f, 0, c8.ha.e(-1, -1, 51));
                ti.o oVar = cq0Var.f31788b.O8;
                if (oVar != null) {
                    oVar.a(new di.e(22));
                }
            }
            PhotoViewer.f41340e9 = PhotoViewer.f41341f9;
            PhotoViewer.f41341f9 = null;
            if (photoViewer.f41391f0 == null) {
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
            if (photoViewer.f41391f0 == null && view != null) {
                org.telegram.messenger.g0.E2(view);
                view.setVisibility(4);
                photoViewer.f41561y2.addView(view);
            }
            if (org.telegram.messenger.t0.f25563x) {
                try {
                    photoViewer.D.startService(new Intent(org.telegram.messenger.t0.f25555b, BringAppForegroundService.class));
                } catch (Throwable th3) {
                    org.telegram.messenger.a8.g(th3, true);
                }
            }
            if (photoViewer.f41391f0 == null) {
                if (view != null) {
                    photoViewer.A3 = true;
                    org.telegram.ui.Components.ki0 s12 = photoViewer.s1(false);
                    float f10 = s12.f35324c / photoViewer.f41542w3.getLayoutParams().width;
                    photoViewer.f41542w3.setScaleX(f10);
                    photoViewer.f41542w3.setScaleY(f10);
                    photoViewer.f41542w3.setTranslationX(s12.f35322a);
                    photoViewer.f41542w3.setTranslationY(s12.f35323b);
                    view.setScaleX(f10);
                    view.setScaleY(f10);
                    view.setTranslationX(s12.f35322a - photoViewer.f41561y2.getX());
                    view.setTranslationY(s12.f35323b - photoViewer.f41561y2.getY());
                    oq0 oq0Var = photoViewer.E2;
                    if (oq0Var != null) {
                        oq0Var.setScaleX(f10);
                        photoViewer.E2.setScaleY(f10);
                        photoViewer.E2.setTranslationX(view.getTranslationX());
                        photoViewer.E2.setTranslationY(view.getTranslationY());
                    }
                    photoViewer.W = 0.0f;
                    fp0 fp0Var = new fp0(photoViewer, f10, 1);
                    view.setOutlineProvider(fp0Var);
                    view.setClipToOutline(true);
                    photoViewer.f41542w3.setOutlineProvider(fp0Var);
                    photoViewer.f41542w3.setClipToOutline(true);
                    oq0 oq0Var2 = photoViewer.E2;
                    if (oq0Var2 != null) {
                        oq0Var2.setOutlineProvider(fp0Var);
                        photoViewer.E2.setClipToOutline(true);
                    }
                }
            } else {
                photoViewer.f41447l6 = 0.0f;
            }
            try {
                photoViewer.f41380e = true;
                photoViewer.f41390f = true;
                ((WindowManager) photoViewer.D.getSystemService("window")).addView(photoViewer.f41400g0, photoViewer.f41372d0);
                Activity activity = photoViewer.D;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).Z0.add(photoViewer.f41505s1);
                }
                wq0 wq0Var = photoViewer.f41368c5;
                if (wq0Var != null && !wq0Var.f51494s) {
                    wq0Var.f51478a.O0(false, false);
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
                photoViewer.f41381e0.invalidate();
                photoViewer.f41523u3 = 4;
                return;
            }
            photoViewer.f41523u3 = 4;
        }
    }

    @Override
    public int U() {
        boolean k10 = k();
        PhotoViewer photoViewer = this.f49543a;
        if (k10) {
            return photoViewer.f41391f0.getEmbedHeight();
        }
        org.telegram.ui.Components.fe0 fe0Var = photoViewer.f41561y2;
        if (fe0Var != null && fe0Var.getAspectRatio() > 0.0f) {
            return 1000;
        }
        return photoViewer.V;
    }

    @Override
    public float V() {
        boolean k10 = k();
        PhotoViewer photoViewer = this.f49543a;
        if (k10) {
            return photoViewer.f41391f0.getBufferedPosition();
        }
        org.telegram.ui.Components.s51 s51Var = photoViewer.F2;
        if (s51Var != null && s51Var.U() > 0) {
            return Math.max(photoViewer.Q8, ((float) photoViewer.F2.K()) / ((float) photoViewer.F2.U()));
        }
        return photoViewer.Q8;
    }

    @Override
    public void a(float f10) {
        cq0 cq0Var;
        PhotoViewer photoViewer = this.f49543a;
        if (photoViewer.F2 == null && ((cq0Var = photoViewer.f41391f0) == null || !cq0Var.f31797y)) {
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
        photoViewer.f41515t3 = false;
    }

    @Override
    public void b() {
        boolean k10 = k();
        PhotoViewer photoViewer = this.f49543a;
        if (k10) {
            photoViewer.f41391f0.f();
            return;
        }
        org.telegram.ui.Components.s51 s51Var = photoViewer.F2;
        if (s51Var != null) {
            s51Var.g0();
        }
    }

    @Override
    public void c(long j3) {
        boolean k10 = k();
        PhotoViewer photoViewer = this.f49543a;
        if (k10) {
            photoViewer.f41391f0.i(j3);
            return;
        }
        org.telegram.ui.Components.s51 s51Var = photoViewer.F2;
        if (s51Var != null) {
            s51Var.p0(j3);
        }
    }

    @Override
    public void c0(Canvas canvas, int i7, int i10) {
        this.f49543a.f41347a4.draw(canvas, i7, i10);
    }

    @Override
    public void d(float f10) {
        jp0 jp0Var;
        jp0 jp0Var2;
        PhotoViewer photoViewer = this.f49543a;
        cq0 cq0Var = photoViewer.f41391f0;
        if (cq0Var != null && cq0Var.f31797y && (jp0Var2 = photoViewer.f41497r3) != null) {
            int i7 = photoViewer.f41478p3.h - org.telegram.ui.Components.u51.S;
            jp0Var2.N = cq0Var;
            if (jp0Var2.W != 0) {
                jp0Var2.W = 0L;
                jp0Var2.f40543f0 = null;
                jp0Var2.f40541e0 = null;
                jp0Var2.f40539d0 = null;
                jp0Var2.b(-1);
            }
            if (i7 != 0) {
                jp0Var2.f40546r = i7;
                int i10 = ((int) (i7 * f10)) / 5;
                if (jp0Var2.f40545n != i10) {
                    jp0Var2.f40545n = i10;
                }
            }
            String g02 = org.telegram.messenger.g0.g0((int) ((cq0Var.getVideoDuration() * f10) / 1000), false, false);
            jp0Var2.D = g02;
            jp0Var2.E = (int) Math.ceil(jp0Var2.F.measureText(g02));
            jp0Var2.invalidate();
            if (jp0Var2.f40542f != null) {
                Utilities.f21333e.a(jp0Var2.f40542f);
            }
            double videoDuration = (f10 * cq0Var.getVideoDuration()) / 1000.0d;
            jp0Var2.O = videoDuration;
            String c10 = cq0Var.c((int) videoDuration);
            if (c10 != null) {
                jp0Var2.Q.o0(c10, null, null, null, 0L);
            }
        } else if (photoViewer.F2 != null && (jp0Var = photoViewer.f41497r3) != null) {
            jp0Var.e(photoViewer.S4, f10, photoViewer.f41478p3.h - org.telegram.ui.Components.u51.S);
        }
        this.f49543a.Y2(true);
        PhotoViewer.P(this.f49543a);
    }

    @Override
    public boolean e0() {
        if (k() && !this.f49543a.f41391f0.f31797y) {
            return false;
        }
        return true;
    }

    @Override
    public void f() {
        boolean k10 = k();
        PhotoViewer photoViewer = this.f49543a;
        if (k10) {
            photoViewer.f41391f0.g();
            return;
        }
        org.telegram.ui.Components.s51 s51Var = photoViewer.F2;
        if (s51Var != null) {
            s51Var.h0();
        }
    }

    @Override
    public void g(ti.q qVar) {
        PhotoViewer photoViewer = this.f49543a;
        photoViewer.R8 = true;
        if (photoViewer.D2) {
            org.telegram.ui.Components.s51 s51Var = photoViewer.F2;
            if (s51Var != null) {
                s51Var.z0(null);
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
            vq0 vq0Var = photoViewer.f41400g0;
            if (vq0Var != null && vq0Var.getParent() != null) {
                ((WindowManager) photoViewer.D.getSystemService("window")).removeViewImmediate(photoViewer.f41400g0);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public long getDuration() {
        boolean k10 = k();
        PhotoViewer photoViewer = this.f49543a;
        if (k10) {
            return photoViewer.f41391f0.getVideoDuration();
        }
        org.telegram.ui.Components.s51 s51Var = photoViewer.F2;
        if (s51Var != null) {
            return s51Var.U();
        }
        return 0L;
    }

    @Override
    public boolean h() {
        boolean k10 = k();
        PhotoViewer photoViewer = this.f49543a;
        if (k10) {
            return photoViewer.f41391f0.G;
        }
        org.telegram.ui.Components.s51 s51Var = photoViewer.F2;
        if (s51Var != null && s51Var.d0()) {
            return true;
        }
        return false;
    }

    @Override
    public void i() {
        PhotoViewer photoViewer = this.f49543a;
        if (photoViewer.f41436k3 && photoViewer.O3) {
            photoViewer.p2();
        }
    }

    @Override
    public void invalidate() {
        this.f49543a.f41381e0.invalidate();
    }

    @Override
    public int j() {
        return 0;
    }

    public boolean k() {
        PhotoViewer photoViewer = this.f49543a;
        if (photoViewer.f41508s4 && photoViewer.f41391f0 != null) {
            return true;
        }
        return false;
    }

    @Override
    public long l() {
        boolean k10 = k();
        PhotoViewer photoViewer = this.f49543a;
        if (k10) {
            return photoViewer.f41391f0.getCurrentPosition();
        }
        org.telegram.ui.Components.s51 s51Var = photoViewer.F2;
        if (s51Var != null) {
            return s51Var.S();
        }
        return 0L;
    }

    public void m(boolean z9) {
        float f10;
        boolean z10 = !z9;
        PhotoViewer photoViewer = this.f49543a;
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
            animate.alpha(f10).setInterpolator(org.telegram.ui.Components.xq.f40329f).setDuration(150L).withEndAction(new org.telegram.ui.Components.tp0(10, photoViewer, z10));
        }
    }

    @Override
    public void n() {
        PhotoViewer photoViewer = this.f49543a;
        if (photoViewer.f41436k3 && photoViewer.O3) {
            org.telegram.messenger.g0.r(photoViewer.f41551x2);
        }
    }

    public void o() {
        PhotoViewer photoViewer = this.f49543a;
        org.telegram.ui.Components.s51 s51Var = photoViewer.F2;
        if (s51Var == null) {
            return;
        }
        s51Var.p0(((float) s51Var.U()) * photoViewer.f41537v8);
        photoViewer.F2.g0();
        photoViewer.R7.setProgress(photoViewer.f41537v8);
        photoViewer.n0();
        ef0 ef0Var = new ef0(this, 22);
        photoViewer.H2 = ef0Var;
        org.telegram.messenger.g0.i3(ef0Var, 860L);
    }

    @Override
    public boolean r() {
        if (k()) {
            cq0 cq0Var = this.f49543a.f41391f0;
            if (cq0Var.f31797y && "inapp".equals(org.telegram.messenger.qp.s1(cq0Var.f31787a).A3)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public boolean u() {
        return this.f49543a.f41357b4.rewinding;
    }

    @Override
    public void v(Rect rect) {
        pq0 pq0Var;
        PhotoViewer photoViewer = this.f49543a;
        RectF rectF = photoViewer.S8;
        if (photoViewer.T8 && (pq0Var = photoViewer.f41381e0) != null && pq0Var.isAttachedToWindow()) {
            int[] iArr = new int[2];
            photoViewer.f41381e0.getLocationOnScreen(iArr);
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
