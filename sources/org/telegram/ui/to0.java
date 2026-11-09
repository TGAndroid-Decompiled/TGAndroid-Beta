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
public final class to0 implements org.telegram.ui.ActionBar.o0, org.telegram.ui.Components.j51, org.telegram.ui.Components.v51, org.telegram.ui.Components.fd0, ti.m {
    public final PhotoViewer f50211a;

    public to0(PhotoViewer photoViewer) {
        this.f50211a = photoViewer;
    }

    @Override
    public void C(SurfaceTexture surfaceTexture) {
        PhotoViewer photoViewer = this.f50211a;
        photoViewer.R8 = false;
        try {
            xq0 xq0Var = photoViewer.f41410g0;
            if (xq0Var != null && xq0Var.getParent() == null) {
                ((WindowManager) photoViewer.D.getSystemService("window")).addView(photoViewer.f41410g0, photoViewer.f41382d0);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (photoViewer.D2) {
            org.telegram.ui.Components.u51 u51Var = photoViewer.F2;
            if (u51Var != null) {
                u51Var.A0(null);
                photoViewer.F2.z0(photoViewer.C2);
            }
            surfaceTexture.release();
            return;
        }
        TextureView textureView = photoViewer.B2;
        if (textureView != null && photoViewer.f41571y2 != null) {
            textureView.setSurfaceTexture(surfaceTexture);
            org.telegram.messenger.g0.E2(photoViewer.B2);
            photoViewer.f41571y2.addView(photoViewer.B2, 0, c8.ha.e(-1, -1, 17));
        }
    }

    @Override
    public View D() {
        if (k()) {
            return this.f50211a.f41401f0.getWebView();
        }
        return null;
    }

    @Override
    public boolean E() {
        xq0 xq0Var;
        PhotoViewer photoViewer = PhotoViewer.f41350e9;
        PhotoViewer photoViewer2 = this.f50211a;
        if (photoViewer == photoViewer2 && photoViewer2.f41390e && !photoViewer2.I3 && !photoViewer2.R8 && (xq0Var = photoViewer2.f41410g0) != null && xq0Var.getParent() != null) {
            PhotoViewer photoViewer3 = this.f50211a;
            if (!photoViewer3.A3 && photoViewer3.f41463m4 == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void F() {
        this.f50211a.f41367b4.cancelRewind();
    }

    @Override
    public int I() {
        boolean k10 = k();
        PhotoViewer photoViewer = this.f50211a;
        if (k10) {
            return photoViewer.f41401f0.getEmbedWidth();
        }
        org.telegram.ui.Components.ge0 ge0Var = photoViewer.f41571y2;
        if (ge0Var != null && ge0Var.getAspectRatio() > 0.0f) {
            return Math.round(photoViewer.f41571y2.getAspectRatio() * 1000.0f);
        }
        return photoViewer.U;
    }

    @Override
    public void J(float f10) {
        this.f50211a.f41367b4.setX(f10);
    }

    @Override
    public boolean K() {
        PhotoViewer photoViewer = this.f50211a;
        if (photoViewer.f41506r2 && h() && !photoViewer.f41518s4) {
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
        org.telegram.ui.Components.u51 u51Var;
        if (!k() && (u51Var = this.f50211a.F2) != null) {
            return u51Var.d;
        }
        return null;
    }

    @Override
    public boolean P() {
        return false;
    }

    @Override
    public void Q() {
        this.f50211a.O8 = null;
        PhotoViewer photoViewer = PhotoViewer.f41351f9;
        PhotoViewer photoViewer2 = this.f50211a;
        if (photoViewer == photoViewer2) {
            photoViewer2.J0();
            MediaController.B().F0();
            return;
        }
        PhotoViewer photoViewer3 = PhotoViewer.f41350e9;
        PhotoViewer photoViewer4 = this.f50211a;
        if (photoViewer3 == photoViewer4) {
            if (photoViewer4.R8) {
                photoViewer4.R8 = false;
                try {
                    xq0 xq0Var = photoViewer4.f41410g0;
                    if (xq0Var != null && xq0Var.getParent() == null) {
                        PhotoViewer photoViewer5 = this.f50211a;
                        ((WindowManager) this.f50211a.D.getSystemService("window")).addView(photoViewer5.f41410g0, photoViewer5.f41382d0);
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
            this.f50211a.z0(false, false);
        }
    }

    @Override
    public boolean R(boolean z9, float f10, org.telegram.ui.Components.rm0 rm0Var) {
        boolean k10 = k();
        PhotoViewer photoViewer = this.f50211a;
        if (k10) {
            photoViewer.f41367b4.startRewind(photoViewer.f41401f0, z9, f10, photoViewer.f41523t1, rm0Var);
            return true;
        }
        org.telegram.ui.Components.u51 u51Var = photoViewer.F2;
        if (u51Var == null) {
            return false;
        }
        photoViewer.f41367b4.startRewind(u51Var, z9, f10, photoViewer.f41523t1, rm0Var);
        return true;
    }

    @Override
    public void T() {
        View view;
        PhotoViewer photoViewer = this.f50211a;
        if (photoViewer.I3) {
            if (PhotoViewer.f41350e9 != null) {
                PhotoViewer.f41350e9.z0(false, true);
            }
            eq0 eq0Var = photoViewer.f41401f0;
            if (eq0Var != null && eq0Var.f32242f != null) {
                if (org.telegram.messenger.t0.f25574x) {
                    try {
                        eq0Var.getContext().startService(new Intent(org.telegram.messenger.t0.f25566b, BringAppForegroundService.class));
                    } catch (Throwable th2) {
                        org.telegram.messenger.a8.g(th2, true);
                    }
                }
                eq0Var.h.setVisibility(0);
                ViewGroup viewGroup = (ViewGroup) eq0Var.f32242f.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(eq0Var.f32242f);
                }
                eq0Var.addView(eq0Var.f32242f, 0, c8.ha.e(-1, -1, 51));
                ti.o oVar = eq0Var.f32239b.O8;
                if (oVar != null) {
                    oVar.a(new di.e(21));
                }
            }
            PhotoViewer.f41350e9 = PhotoViewer.f41351f9;
            PhotoViewer.f41351f9 = null;
            if (photoViewer.f41401f0 == null) {
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
            if (photoViewer.f41401f0 == null && view != null) {
                org.telegram.messenger.g0.E2(view);
                view.setVisibility(4);
                photoViewer.f41571y2.addView(view);
            }
            if (org.telegram.messenger.t0.f25574x) {
                try {
                    photoViewer.D.startService(new Intent(org.telegram.messenger.t0.f25566b, BringAppForegroundService.class));
                } catch (Throwable th3) {
                    org.telegram.messenger.a8.g(th3, true);
                }
            }
            if (photoViewer.f41401f0 == null) {
                if (view != null) {
                    photoViewer.A3 = true;
                    org.telegram.ui.Components.li0 s12 = photoViewer.s1(false);
                    float f10 = s12.f35753c / photoViewer.f41552w3.getLayoutParams().width;
                    photoViewer.f41552w3.setScaleX(f10);
                    photoViewer.f41552w3.setScaleY(f10);
                    photoViewer.f41552w3.setTranslationX(s12.f35751a);
                    photoViewer.f41552w3.setTranslationY(s12.f35752b);
                    view.setScaleX(f10);
                    view.setScaleY(f10);
                    view.setTranslationX(s12.f35751a - photoViewer.f41571y2.getX());
                    view.setTranslationY(s12.f35752b - photoViewer.f41571y2.getY());
                    qq0 qq0Var = photoViewer.E2;
                    if (qq0Var != null) {
                        qq0Var.setScaleX(f10);
                        photoViewer.E2.setScaleY(f10);
                        photoViewer.E2.setTranslationX(view.getTranslationX());
                        photoViewer.E2.setTranslationY(view.getTranslationY());
                    }
                    photoViewer.W = 0.0f;
                    hp0 hp0Var = new hp0(photoViewer, f10, 1);
                    view.setOutlineProvider(hp0Var);
                    view.setClipToOutline(true);
                    photoViewer.f41552w3.setOutlineProvider(hp0Var);
                    photoViewer.f41552w3.setClipToOutline(true);
                    qq0 qq0Var2 = photoViewer.E2;
                    if (qq0Var2 != null) {
                        qq0Var2.setOutlineProvider(hp0Var);
                        photoViewer.E2.setClipToOutline(true);
                    }
                }
            } else {
                photoViewer.f41457l6 = 0.0f;
            }
            try {
                photoViewer.f41390e = true;
                photoViewer.f41400f = true;
                ((WindowManager) photoViewer.D.getSystemService("window")).addView(photoViewer.f41410g0, photoViewer.f41382d0);
                Activity activity = photoViewer.D;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).Z0.add(photoViewer.f41515s1);
                }
                yq0 yq0Var = photoViewer.f41378c5;
                if (yq0Var != null && !yq0Var.f52175s) {
                    yq0Var.f52159a.O0(false, false);
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
                photoViewer.f41391e0.invalidate();
                photoViewer.f41533u3 = 4;
                return;
            }
            photoViewer.f41533u3 = 4;
        }
    }

    @Override
    public int U() {
        boolean k10 = k();
        PhotoViewer photoViewer = this.f50211a;
        if (k10) {
            return photoViewer.f41401f0.getEmbedHeight();
        }
        org.telegram.ui.Components.ge0 ge0Var = photoViewer.f41571y2;
        if (ge0Var != null && ge0Var.getAspectRatio() > 0.0f) {
            return 1000;
        }
        return photoViewer.V;
    }

    @Override
    public float V() {
        boolean k10 = k();
        PhotoViewer photoViewer = this.f50211a;
        if (k10) {
            return photoViewer.f41401f0.getBufferedPosition();
        }
        org.telegram.ui.Components.u51 u51Var = photoViewer.F2;
        if (u51Var != null && u51Var.U() > 0) {
            return Math.max(photoViewer.Q8, ((float) photoViewer.F2.K()) / ((float) photoViewer.F2.U()));
        }
        return photoViewer.Q8;
    }

    @Override
    public void a(float f10) {
        eq0 eq0Var;
        PhotoViewer photoViewer = this.f50211a;
        if (photoViewer.F2 == null && ((eq0Var = photoViewer.f41401f0) == null || !eq0Var.f32248y)) {
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
        photoViewer.f41525t3 = false;
    }

    @Override
    public void b() {
        boolean k10 = k();
        PhotoViewer photoViewer = this.f50211a;
        if (k10) {
            photoViewer.f41401f0.f();
            return;
        }
        org.telegram.ui.Components.u51 u51Var = photoViewer.F2;
        if (u51Var != null) {
            u51Var.g0();
        }
    }

    @Override
    public void c(long j3) {
        boolean k10 = k();
        PhotoViewer photoViewer = this.f50211a;
        if (k10) {
            photoViewer.f41401f0.i(j3);
            return;
        }
        org.telegram.ui.Components.u51 u51Var = photoViewer.F2;
        if (u51Var != null) {
            u51Var.p0(j3);
        }
    }

    @Override
    public void c0(Canvas canvas, int i7, int i10) {
        this.f50211a.f41357a4.draw(canvas, i7, i10);
    }

    @Override
    public void d(float f10) {
        lp0 lp0Var;
        lp0 lp0Var2;
        PhotoViewer photoViewer = this.f50211a;
        eq0 eq0Var = photoViewer.f41401f0;
        if (eq0Var != null && eq0Var.f32248y && (lp0Var2 = photoViewer.f41507r3) != null) {
            int i7 = photoViewer.f41488p3.h - org.telegram.ui.Components.w51.S;
            lp0Var2.N = eq0Var;
            if (lp0Var2.W != 0) {
                lp0Var2.W = 0L;
                lp0Var2.f31733f0 = null;
                lp0Var2.f31731e0 = null;
                lp0Var2.f31729d0 = null;
                lp0Var2.b(-1);
            }
            if (i7 != 0) {
                lp0Var2.f31736r = i7;
                int i10 = ((int) (i7 * f10)) / 5;
                if (lp0Var2.f31735n != i10) {
                    lp0Var2.f31735n = i10;
                }
            }
            String g02 = org.telegram.messenger.g0.g0((int) ((eq0Var.getVideoDuration() * f10) / 1000), false, false);
            lp0Var2.D = g02;
            lp0Var2.E = (int) Math.ceil(lp0Var2.F.measureText(g02));
            lp0Var2.invalidate();
            if (lp0Var2.f31732f != null) {
                Utilities.f21336e.a(lp0Var2.f31732f);
            }
            double videoDuration = (f10 * eq0Var.getVideoDuration()) / 1000.0d;
            lp0Var2.O = videoDuration;
            String c10 = eq0Var.c((int) videoDuration);
            if (c10 != null) {
                lp0Var2.Q.o0(c10, null, null, null, 0L);
            }
        } else if (photoViewer.F2 != null && (lp0Var = photoViewer.f41507r3) != null) {
            lp0Var.e(photoViewer.S4, f10, photoViewer.f41488p3.h - org.telegram.ui.Components.w51.S);
        }
        this.f50211a.Y2(true);
        PhotoViewer.P(this.f50211a);
    }

    @Override
    public boolean e0() {
        if (k() && !this.f50211a.f41401f0.f32248y) {
            return false;
        }
        return true;
    }

    @Override
    public void f() {
        boolean k10 = k();
        PhotoViewer photoViewer = this.f50211a;
        if (k10) {
            photoViewer.f41401f0.g();
            return;
        }
        org.telegram.ui.Components.u51 u51Var = photoViewer.F2;
        if (u51Var != null) {
            u51Var.h0();
        }
    }

    @Override
    public void g(ti.p pVar) {
        PhotoViewer photoViewer = this.f50211a;
        photoViewer.R8 = true;
        if (photoViewer.D2) {
            org.telegram.ui.Components.u51 u51Var = photoViewer.F2;
            if (u51Var != null) {
                u51Var.z0(null);
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
            xq0 xq0Var = photoViewer.f41410g0;
            if (xq0Var != null && xq0Var.getParent() != null) {
                ((WindowManager) photoViewer.D.getSystemService("window")).removeViewImmediate(photoViewer.f41410g0);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public long getDuration() {
        boolean k10 = k();
        PhotoViewer photoViewer = this.f50211a;
        if (k10) {
            return photoViewer.f41401f0.getVideoDuration();
        }
        org.telegram.ui.Components.u51 u51Var = photoViewer.F2;
        if (u51Var != null) {
            return u51Var.U();
        }
        return 0L;
    }

    @Override
    public boolean h() {
        boolean k10 = k();
        PhotoViewer photoViewer = this.f50211a;
        if (k10) {
            return photoViewer.f41401f0.G;
        }
        org.telegram.ui.Components.u51 u51Var = photoViewer.F2;
        if (u51Var != null && u51Var.d0()) {
            return true;
        }
        return false;
    }

    @Override
    public void i() {
        PhotoViewer photoViewer = this.f50211a;
        if (photoViewer.f41446k3 && photoViewer.O3) {
            photoViewer.p2();
        }
    }

    @Override
    public void invalidate() {
        this.f50211a.f41391e0.invalidate();
    }

    @Override
    public int j() {
        return 0;
    }

    public boolean k() {
        PhotoViewer photoViewer = this.f50211a;
        if (photoViewer.f41518s4 && photoViewer.f41401f0 != null) {
            return true;
        }
        return false;
    }

    @Override
    public long l() {
        boolean k10 = k();
        PhotoViewer photoViewer = this.f50211a;
        if (k10) {
            return photoViewer.f41401f0.getCurrentPosition();
        }
        org.telegram.ui.Components.u51 u51Var = photoViewer.F2;
        if (u51Var != null) {
            return u51Var.S();
        }
        return 0L;
    }

    public void m(boolean z9) {
        float f10;
        boolean z10 = !z9;
        PhotoViewer photoViewer = this.f50211a;
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
            animate.alpha(f10).setInterpolator(org.telegram.ui.Components.xq.f40458f).setDuration(150L).withEndAction(new org.telegram.ui.Components.up0(10, photoViewer, z10));
        }
    }

    @Override
    public void n() {
        PhotoViewer photoViewer = this.f50211a;
        if (photoViewer.f41446k3 && photoViewer.O3) {
            org.telegram.messenger.g0.r(photoViewer.f41561x2);
        }
    }

    public void o() {
        PhotoViewer photoViewer = this.f50211a;
        org.telegram.ui.Components.u51 u51Var = photoViewer.F2;
        if (u51Var == null) {
            return;
        }
        u51Var.p0(((float) u51Var.U()) * photoViewer.f41547v8);
        photoViewer.F2.g0();
        photoViewer.R7.setProgress(photoViewer.f41547v8);
        photoViewer.n0();
        gf0 gf0Var = new gf0(this, 22);
        photoViewer.H2 = gf0Var;
        org.telegram.messenger.g0.i3(gf0Var, 860L);
    }

    @Override
    public boolean r() {
        if (k()) {
            eq0 eq0Var = this.f50211a.f41401f0;
            if (eq0Var.f32248y && "inapp".equals(org.telegram.messenger.qp.s1(eq0Var.f32238a).A3)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public boolean u() {
        return this.f50211a.f41367b4.rewinding;
    }

    @Override
    public void v(Rect rect) {
        rq0 rq0Var;
        PhotoViewer photoViewer = this.f50211a;
        RectF rectF = photoViewer.S8;
        if (photoViewer.T8 && (rq0Var = photoViewer.f41391e0) != null && rq0Var.isAttachedToWindow()) {
            int[] iArr = new int[2];
            photoViewer.f41391e0.getLocationOnScreen(iArr);
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
