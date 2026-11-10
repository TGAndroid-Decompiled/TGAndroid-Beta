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
public final class uo0 implements org.telegram.ui.ActionBar.o0, org.telegram.ui.Components.j51, org.telegram.ui.Components.u51, org.telegram.ui.Components.ed0, ti.m {
    public final PhotoViewer f50538a;

    public uo0(PhotoViewer photoViewer) {
        this.f50538a = photoViewer;
    }

    @Override
    public void C(SurfaceTexture surfaceTexture) {
        PhotoViewer photoViewer = this.f50538a;
        photoViewer.R8 = false;
        try {
            yq0 yq0Var = photoViewer.f41401g0;
            if (yq0Var != null && yq0Var.getParent() == null) {
                ((WindowManager) photoViewer.D.getSystemService("window")).addView(photoViewer.f41401g0, photoViewer.f41373d0);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (photoViewer.D2) {
            org.telegram.ui.Components.t51 t51Var = photoViewer.F2;
            if (t51Var != null) {
                t51Var.A0(null);
                photoViewer.F2.z0(photoViewer.C2);
            }
            surfaceTexture.release();
            return;
        }
        TextureView textureView = photoViewer.B2;
        if (textureView != null && photoViewer.f41562y2 != null) {
            textureView.setSurfaceTexture(surfaceTexture);
            org.telegram.messenger.g0.E2(photoViewer.B2);
            photoViewer.f41562y2.addView(photoViewer.B2, 0, c8.ha.e(-1, -1, 17));
        }
    }

    @Override
    public View D() {
        if (k()) {
            return this.f50538a.f41392f0.getWebView();
        }
        return null;
    }

    @Override
    public boolean E() {
        yq0 yq0Var;
        PhotoViewer photoViewer = PhotoViewer.f41341e9;
        PhotoViewer photoViewer2 = this.f50538a;
        if (photoViewer == photoViewer2 && photoViewer2.f41381e && !photoViewer2.I3 && !photoViewer2.R8 && (yq0Var = photoViewer2.f41401g0) != null && yq0Var.getParent() != null) {
            PhotoViewer photoViewer3 = this.f50538a;
            if (!photoViewer3.A3 && photoViewer3.f41454m4 == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void F() {
        this.f50538a.f41358b4.cancelRewind();
    }

    @Override
    public int I() {
        boolean k10 = k();
        PhotoViewer photoViewer = this.f50538a;
        if (k10) {
            return photoViewer.f41392f0.getEmbedWidth();
        }
        org.telegram.ui.Components.fe0 fe0Var = photoViewer.f41562y2;
        if (fe0Var != null && fe0Var.getAspectRatio() > 0.0f) {
            return Math.round(photoViewer.f41562y2.getAspectRatio() * 1000.0f);
        }
        return photoViewer.U;
    }

    @Override
    public void J(float f10) {
        this.f50538a.f41358b4.setX(f10);
    }

    @Override
    public boolean K() {
        PhotoViewer photoViewer = this.f50538a;
        if (photoViewer.f41497r2 && h() && !photoViewer.f41509s4) {
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
        org.telegram.ui.Components.t51 t51Var;
        if (!k() && (t51Var = this.f50538a.F2) != null) {
            return t51Var.d;
        }
        return null;
    }

    @Override
    public boolean P() {
        return false;
    }

    @Override
    public void Q() {
        this.f50538a.O8 = null;
        PhotoViewer photoViewer = PhotoViewer.f41342f9;
        PhotoViewer photoViewer2 = this.f50538a;
        if (photoViewer == photoViewer2) {
            photoViewer2.J0();
            MediaController.B().F0();
            return;
        }
        PhotoViewer photoViewer3 = PhotoViewer.f41341e9;
        PhotoViewer photoViewer4 = this.f50538a;
        if (photoViewer3 == photoViewer4) {
            if (photoViewer4.R8) {
                photoViewer4.R8 = false;
                try {
                    yq0 yq0Var = photoViewer4.f41401g0;
                    if (yq0Var != null && yq0Var.getParent() == null) {
                        PhotoViewer photoViewer5 = this.f50538a;
                        ((WindowManager) this.f50538a.D.getSystemService("window")).addView(photoViewer5.f41401g0, photoViewer5.f41373d0);
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
            this.f50538a.z0(false, false);
        }
    }

    @Override
    public boolean R(boolean z9, float f10, org.telegram.ui.Components.qm0 qm0Var) {
        boolean k10 = k();
        PhotoViewer photoViewer = this.f50538a;
        if (k10) {
            photoViewer.f41358b4.startRewind(photoViewer.f41392f0, z9, f10, photoViewer.f41514t1, qm0Var);
            return true;
        }
        org.telegram.ui.Components.t51 t51Var = photoViewer.F2;
        if (t51Var == null) {
            return false;
        }
        photoViewer.f41358b4.startRewind(t51Var, z9, f10, photoViewer.f41514t1, qm0Var);
        return true;
    }

    @Override
    public void T() {
        View view;
        PhotoViewer photoViewer = this.f50538a;
        if (photoViewer.I3) {
            if (PhotoViewer.f41341e9 != null) {
                PhotoViewer.f41341e9.z0(false, true);
            }
            fq0 fq0Var = photoViewer.f41392f0;
            if (fq0Var != null && fq0Var.f31845f != null) {
                if (org.telegram.messenger.t0.f25578x) {
                    try {
                        fq0Var.getContext().startService(new Intent(org.telegram.messenger.t0.f25570b, BringAppForegroundService.class));
                    } catch (Throwable th2) {
                        org.telegram.messenger.a8.g(th2, true);
                    }
                }
                fq0Var.h.setVisibility(0);
                ViewGroup viewGroup = (ViewGroup) fq0Var.f31845f.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(fq0Var.f31845f);
                }
                fq0Var.addView(fq0Var.f31845f, 0, c8.ha.e(-1, -1, 51));
                ti.o oVar = fq0Var.f31842b.O8;
                if (oVar != null) {
                    oVar.a(new di.e(21));
                }
            }
            PhotoViewer.f41341e9 = PhotoViewer.f41342f9;
            PhotoViewer.f41342f9 = null;
            if (photoViewer.f41392f0 == null) {
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
            if (photoViewer.f41392f0 == null && view != null) {
                org.telegram.messenger.g0.E2(view);
                view.setVisibility(4);
                photoViewer.f41562y2.addView(view);
            }
            if (org.telegram.messenger.t0.f25578x) {
                try {
                    photoViewer.D.startService(new Intent(org.telegram.messenger.t0.f25570b, BringAppForegroundService.class));
                } catch (Throwable th3) {
                    org.telegram.messenger.a8.g(th3, true);
                }
            }
            if (photoViewer.f41392f0 == null) {
                if (view != null) {
                    photoViewer.A3 = true;
                    org.telegram.ui.Components.ki0 s12 = photoViewer.s1(false);
                    float f10 = s12.f35355c / photoViewer.f41543w3.getLayoutParams().width;
                    photoViewer.f41543w3.setScaleX(f10);
                    photoViewer.f41543w3.setScaleY(f10);
                    photoViewer.f41543w3.setTranslationX(s12.f35353a);
                    photoViewer.f41543w3.setTranslationY(s12.f35354b);
                    view.setScaleX(f10);
                    view.setScaleY(f10);
                    view.setTranslationX(s12.f35353a - photoViewer.f41562y2.getX());
                    view.setTranslationY(s12.f35354b - photoViewer.f41562y2.getY());
                    rq0 rq0Var = photoViewer.E2;
                    if (rq0Var != null) {
                        rq0Var.setScaleX(f10);
                        photoViewer.E2.setScaleY(f10);
                        photoViewer.E2.setTranslationX(view.getTranslationX());
                        photoViewer.E2.setTranslationY(view.getTranslationY());
                    }
                    photoViewer.W = 0.0f;
                    ip0 ip0Var = new ip0(photoViewer, f10, 1);
                    view.setOutlineProvider(ip0Var);
                    view.setClipToOutline(true);
                    photoViewer.f41543w3.setOutlineProvider(ip0Var);
                    photoViewer.f41543w3.setClipToOutline(true);
                    rq0 rq0Var2 = photoViewer.E2;
                    if (rq0Var2 != null) {
                        rq0Var2.setOutlineProvider(ip0Var);
                        photoViewer.E2.setClipToOutline(true);
                    }
                }
            } else {
                photoViewer.f41448l6 = 0.0f;
            }
            try {
                photoViewer.f41381e = true;
                photoViewer.f41391f = true;
                ((WindowManager) photoViewer.D.getSystemService("window")).addView(photoViewer.f41401g0, photoViewer.f41373d0);
                Activity activity = photoViewer.D;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).Z0.add(photoViewer.f41506s1);
                }
                zq0 zq0Var = photoViewer.f41369c5;
                if (zq0Var != null && !zq0Var.f52519s) {
                    zq0Var.f52503a.O0(false, false);
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
                photoViewer.f41382e0.invalidate();
                photoViewer.f41524u3 = 4;
                return;
            }
            photoViewer.f41524u3 = 4;
        }
    }

    @Override
    public int U() {
        boolean k10 = k();
        PhotoViewer photoViewer = this.f50538a;
        if (k10) {
            return photoViewer.f41392f0.getEmbedHeight();
        }
        org.telegram.ui.Components.fe0 fe0Var = photoViewer.f41562y2;
        if (fe0Var != null && fe0Var.getAspectRatio() > 0.0f) {
            return 1000;
        }
        return photoViewer.V;
    }

    @Override
    public float V() {
        boolean k10 = k();
        PhotoViewer photoViewer = this.f50538a;
        if (k10) {
            return photoViewer.f41392f0.getBufferedPosition();
        }
        org.telegram.ui.Components.t51 t51Var = photoViewer.F2;
        if (t51Var != null && t51Var.U() > 0) {
            return Math.max(photoViewer.Q8, ((float) photoViewer.F2.K()) / ((float) photoViewer.F2.U()));
        }
        return photoViewer.Q8;
    }

    @Override
    public void a(float f10) {
        fq0 fq0Var;
        PhotoViewer photoViewer = this.f50538a;
        if (photoViewer.F2 == null && ((fq0Var = photoViewer.f41392f0) == null || !fq0Var.f31851y)) {
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
        photoViewer.f41516t3 = false;
    }

    @Override
    public void b() {
        boolean k10 = k();
        PhotoViewer photoViewer = this.f50538a;
        if (k10) {
            photoViewer.f41392f0.f();
            return;
        }
        org.telegram.ui.Components.t51 t51Var = photoViewer.F2;
        if (t51Var != null) {
            t51Var.g0();
        }
    }

    @Override
    public void c(long j3) {
        boolean k10 = k();
        PhotoViewer photoViewer = this.f50538a;
        if (k10) {
            photoViewer.f41392f0.i(j3);
            return;
        }
        org.telegram.ui.Components.t51 t51Var = photoViewer.F2;
        if (t51Var != null) {
            t51Var.p0(j3);
        }
    }

    @Override
    public void c0(Canvas canvas, int i7, int i10) {
        this.f50538a.f41348a4.draw(canvas, i7, i10);
    }

    @Override
    public void d(float f10) {
        mp0 mp0Var;
        mp0 mp0Var2;
        PhotoViewer photoViewer = this.f50538a;
        fq0 fq0Var = photoViewer.f41392f0;
        if (fq0Var != null && fq0Var.f31851y && (mp0Var2 = photoViewer.f41498r3) != null) {
            int i7 = photoViewer.f41479p3.h - org.telegram.ui.Components.v51.S;
            mp0Var2.N = fq0Var;
            if (mp0Var2.W != 0) {
                mp0Var2.W = 0L;
                mp0Var2.f40875f0 = null;
                mp0Var2.f40873e0 = null;
                mp0Var2.f40871d0 = null;
                mp0Var2.b(-1);
            }
            if (i7 != 0) {
                mp0Var2.f40878r = i7;
                int i10 = ((int) (i7 * f10)) / 5;
                if (mp0Var2.f40877n != i10) {
                    mp0Var2.f40877n = i10;
                }
            }
            String g02 = org.telegram.messenger.g0.g0((int) ((fq0Var.getVideoDuration() * f10) / 1000), false, false);
            mp0Var2.D = g02;
            mp0Var2.E = (int) Math.ceil(mp0Var2.F.measureText(g02));
            mp0Var2.invalidate();
            if (mp0Var2.f40874f != null) {
                Utilities.f21341e.a(mp0Var2.f40874f);
            }
            double videoDuration = (f10 * fq0Var.getVideoDuration()) / 1000.0d;
            mp0Var2.O = videoDuration;
            String c10 = fq0Var.c((int) videoDuration);
            if (c10 != null) {
                mp0Var2.Q.o0(c10, null, null, null, 0L);
            }
        } else if (photoViewer.F2 != null && (mp0Var = photoViewer.f41498r3) != null) {
            mp0Var.e(photoViewer.S4, f10, photoViewer.f41479p3.h - org.telegram.ui.Components.v51.S);
        }
        this.f50538a.Y2(true);
        PhotoViewer.P(this.f50538a);
    }

    @Override
    public boolean e0() {
        if (k() && !this.f50538a.f41392f0.f31851y) {
            return false;
        }
        return true;
    }

    @Override
    public void f() {
        boolean k10 = k();
        PhotoViewer photoViewer = this.f50538a;
        if (k10) {
            photoViewer.f41392f0.g();
            return;
        }
        org.telegram.ui.Components.t51 t51Var = photoViewer.F2;
        if (t51Var != null) {
            t51Var.h0();
        }
    }

    @Override
    public void g(ti.p pVar) {
        PhotoViewer photoViewer = this.f50538a;
        photoViewer.R8 = true;
        if (photoViewer.D2) {
            org.telegram.ui.Components.t51 t51Var = photoViewer.F2;
            if (t51Var != null) {
                t51Var.z0(null);
                photoViewer.F2.A0(null);
                photoViewer.F2.A0(pVar);
            }
        } else {
            TextureView textureView = photoViewer.B2;
            if (textureView != null) {
                photoViewer.P8 = pVar;
                org.telegram.messenger.g0.E2(textureView);
                photoViewer.P8 = null;
            }
        }
        try {
            yq0 yq0Var = photoViewer.f41401g0;
            if (yq0Var != null && yq0Var.getParent() != null) {
                ((WindowManager) photoViewer.D.getSystemService("window")).removeViewImmediate(photoViewer.f41401g0);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public long getDuration() {
        boolean k10 = k();
        PhotoViewer photoViewer = this.f50538a;
        if (k10) {
            return photoViewer.f41392f0.getVideoDuration();
        }
        org.telegram.ui.Components.t51 t51Var = photoViewer.F2;
        if (t51Var != null) {
            return t51Var.U();
        }
        return 0L;
    }

    @Override
    public boolean h() {
        boolean k10 = k();
        PhotoViewer photoViewer = this.f50538a;
        if (k10) {
            return photoViewer.f41392f0.G;
        }
        org.telegram.ui.Components.t51 t51Var = photoViewer.F2;
        if (t51Var != null && t51Var.d0()) {
            return true;
        }
        return false;
    }

    @Override
    public void i() {
        PhotoViewer photoViewer = this.f50538a;
        if (photoViewer.f41437k3 && photoViewer.O3) {
            photoViewer.p2();
        }
    }

    @Override
    public void invalidate() {
        this.f50538a.f41382e0.invalidate();
    }

    @Override
    public int j() {
        return 0;
    }

    public boolean k() {
        PhotoViewer photoViewer = this.f50538a;
        if (photoViewer.f41509s4 && photoViewer.f41392f0 != null) {
            return true;
        }
        return false;
    }

    @Override
    public long l() {
        boolean k10 = k();
        PhotoViewer photoViewer = this.f50538a;
        if (k10) {
            return photoViewer.f41392f0.getCurrentPosition();
        }
        org.telegram.ui.Components.t51 t51Var = photoViewer.F2;
        if (t51Var != null) {
            return t51Var.S();
        }
        return 0L;
    }

    public void m(boolean z9) {
        float f10;
        boolean z10 = !z9;
        PhotoViewer photoViewer = this.f50538a;
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
            animate.alpha(f10).setInterpolator(org.telegram.ui.Components.wq.f40046f).setDuration(150L).withEndAction(new org.telegram.ui.Components.tp0(10, photoViewer, z10));
        }
    }

    @Override
    public void n() {
        PhotoViewer photoViewer = this.f50538a;
        if (photoViewer.f41437k3 && photoViewer.O3) {
            org.telegram.messenger.g0.r(photoViewer.f41552x2);
        }
    }

    public void o() {
        PhotoViewer photoViewer = this.f50538a;
        org.telegram.ui.Components.t51 t51Var = photoViewer.F2;
        if (t51Var == null) {
            return;
        }
        t51Var.p0(((float) t51Var.U()) * photoViewer.f41538v8);
        photoViewer.F2.g0();
        photoViewer.R7.setProgress(photoViewer.f41538v8);
        photoViewer.n0();
        hf0 hf0Var = new hf0(this, 22);
        photoViewer.H2 = hf0Var;
        org.telegram.messenger.g0.i3(hf0Var, 860L);
    }

    @Override
    public boolean r() {
        if (k()) {
            fq0 fq0Var = this.f50538a.f41392f0;
            if (fq0Var.f31851y && "inapp".equals(org.telegram.messenger.qp.s1(fq0Var.f31841a).A3)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public boolean u() {
        return this.f50538a.f41358b4.rewinding;
    }

    @Override
    public void v(Rect rect) {
        sq0 sq0Var;
        PhotoViewer photoViewer = this.f50538a;
        RectF rectF = photoViewer.S8;
        if (photoViewer.T8 && (sq0Var = photoViewer.f41382e0) != null && sq0Var.isAttachedToWindow()) {
            int[] iArr = new int[2];
            photoViewer.f41382e0.getLocationOnScreen(iArr);
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
