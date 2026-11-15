package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
public final class vw0 extends FrameLayout {
    public RadialGradient E;
    public final Matrix F;
    public final Paint G;
    public int H;
    public int I;
    public final org.telegram.ui.Components.e5 J;
    public final org.telegram.ui.Components.u5 K;
    public boolean L;
    public boolean M;
    public final Paint N;
    public final RectF O;
    public boolean P;
    public final ProfileActivity Q;
    public int f52313a;
    public final Paint f52314b;
    public boolean f52315c;
    public final org.telegram.ui.Components.u5 d;
    public int f52316e;
    public int f52317f;
    public final org.telegram.ui.Components.x4 h;
    public final org.telegram.ui.Components.x4 f52318n;
    public int f52319r;
    public int f52320s;
    public int f52321w;
    public float f52322x;
    public float f52323y;

    public vw0(ProfileActivity profileActivity, Context context) {
        super(context);
        this.Q = profileActivity;
        this.f52314b = new Paint();
        org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
        this.d = new org.telegram.ui.Components.u5(this, 350L, erVar);
        this.h = new org.telegram.ui.Components.x4(this, 350L, erVar);
        this.f52318n = new org.telegram.ui.Components.x4(this, 350L, erVar);
        this.F = new Matrix();
        this.G = new Paint(1);
        this.J = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(20.0f), 13, this, false);
        this.K = new org.telegram.ui.Components.u5(this, 0L, 440L, erVar);
        new org.telegram.ui.Components.u5(this, 0L, 440L, erVar);
        this.N = new Paint();
        this.O = new RectF();
        setWillNotDraw(false);
    }

    public final void a(org.telegram.messenger.cp cpVar, boolean z10) {
        ProfileActivity profileActivity = this.Q;
        if (cpVar != null) {
            this.f52315c = true;
            this.f52316e = cpVar.c(org.telegram.ui.ActionBar.j6.I.q());
            int d = cpVar.d(org.telegram.ui.ActionBar.j6.I.q());
            this.f52317f = d;
            profileActivity.f43080c1 = i0.a.f(0.25f, this.f52316e, d);
            int i7 = cpVar.f22917a;
            if (i7 != 0) {
                this.H = i7;
                this.I = org.telegram.ui.ActionBar.j6.r1(0.45f, i7);
            } else {
                this.H = jm0.B0(this.f52316e);
                this.I = org.telegram.ui.ActionBar.j6.r1(0.15f, jm0.B0(this.f52316e));
            }
        } else {
            profileActivity.f43080c1 = this.f52313a;
            this.f52315c = false;
            int i10 = org.telegram.ui.ActionBar.j6.f29129s8;
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.w0(i10, profileActivity.A0)) > 0.8f) {
                this.H = -1;
                this.I = -1;
            } else if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.w0(i10, profileActivity.A0)) < 0.2f) {
                this.H = org.telegram.ui.ActionBar.j6.r1(0.5f, org.telegram.ui.ActionBar.j6.b(0.02f, 0.25f, org.telegram.ui.ActionBar.j6.w0(i10, profileActivity.A0)));
                this.I = org.telegram.ui.ActionBar.j6.r1(0.35f, org.telegram.ui.ActionBar.j6.b(0.02f, 0.25f, org.telegram.ui.ActionBar.j6.w0(i10, profileActivity.A0)));
            } else {
                this.H = jm0.B0(org.telegram.ui.ActionBar.j6.w0(i10, profileActivity.A0));
                this.I = org.telegram.ui.ActionBar.j6.r1(0.15f, jm0.B0(org.telegram.ui.ActionBar.j6.w0(i10, profileActivity.A0)));
            }
        }
        if (!z10) {
            this.h.a(this.f52316e, true);
            this.f52318n.a(this.f52317f, true);
        }
        invalidate();
    }

    public final void b(long j3, boolean z10) {
        org.telegram.ui.Components.e5 e5Var = this.J;
        boolean z11 = true;
        e5Var.j(j3, true);
        e5Var.k(Integer.valueOf(this.H));
        if (!this.L && (j3 == 0 || j3 == -1)) {
            z11 = false;
        }
        this.L = z11;
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.J.b();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        int i7;
        boolean z10;
        Canvas canvas2;
        float f10;
        uv0 uv0Var;
        float f11;
        org.telegram.ui.ActionBar.k kVar2;
        int i10;
        org.telegram.ui.ActionBar.k kVar3;
        float f12;
        float f13;
        float f14;
        float f15;
        org.telegram.ui.ActionBar.k kVar4;
        float f16;
        org.telegram.ui.ActionBar.k kVar5;
        fi.u2 u2Var;
        ri.q qVar;
        boolean z11 = this.P;
        ProfileActivity profileActivity = this.Q;
        if (!z11) {
            qVar = ((org.telegram.ui.ActionBar.e2) profileActivity).glassEngine;
            qVar.g();
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        kVar = ((org.telegram.ui.ActionBar.e2) profileActivity).actionBar;
        if (kVar.getOccupyStatusBar()) {
            i7 = org.telegram.messenger.g0.f23605m;
        } else {
            i7 = 0;
        }
        float f17 = currentActionBarHeight + i7 + profileActivity.Q1 + profileActivity.U1;
        int i11 = (int) ((1.0f - profileActivity.U5) * f17);
        boolean z12 = true;
        if (profileActivity.E5 > 0.0f && i11 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), i11, (int) ((1.0f - profileActivity.E5) * 255.0f));
        }
        if (i11 != 0) {
            int i12 = this.f52313a;
            Paint paint = this.f52314b;
            paint.setColor(i12);
            int a10 = this.h.a(this.f52316e, false);
            int a11 = this.f52318n.a(this.f52317f, false);
            org.telegram.ui.Components.hf0 hf0Var = profileActivity.f43063a0;
            if (hf0Var != null) {
                int i13 = this.I;
                boolean z13 = this.f52315c;
                f11 = 1.0f;
                if (hf0Var.Q == null || hf0Var.O != i13 || hf0Var.P != z13) {
                    hf0Var.O = i13;
                    hf0Var.P = z13;
                    hf0Var.g();
                }
            } else {
                f11 = 1.0f;
            }
            org.telegram.ui.Components.cg0 cg0Var = profileActivity.f43079c0;
            if (cg0Var != null) {
                cg0Var.d(this.I, this.f52315c);
            }
            org.telegram.ui.Components.lf0 lf0Var = profileActivity.M5;
            if (lf0Var != null) {
                int i14 = this.I;
                boolean z14 = this.f52315c;
                if (lf0Var.f36775i != i14 || lf0Var.f36776j != z14) {
                    lf0Var.f36775i = i14;
                    lf0Var.f36776j = z14;
                    lf0Var.a();
                }
            }
            int width = getWidth() / 2;
            RadialGradient radialGradient = this.E;
            f10 = 0.0f;
            Paint paint2 = this.G;
            if (radialGradient != null && this.f52319r == a10 && this.f52320s == a11 && this.f52321w == width) {
                f12 = 2.0f;
            } else {
                this.f52322x = org.telegram.messenger.g0.L(96.0f) * 2;
                kVar2 = ((org.telegram.ui.ActionBar.e2) profileActivity).actionBar;
                if (kVar2.getOccupyStatusBar()) {
                    i10 = org.telegram.messenger.g0.f23605m;
                } else {
                    i10 = 0;
                }
                kVar3 = ((org.telegram.ui.ActionBar.e2) profileActivity).actionBar;
                this.f52323y = kVar3.getTranslationY() + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10) - (org.telegram.messenger.g0.f23610p * 21.0f));
                this.f52321w = width;
                float f18 = this.f52323y;
                f12 = 2.0f;
                float f19 = this.f52322x;
                this.f52320s = a11;
                this.f52319r = a10;
                RadialGradient radialGradient2 = new RadialGradient(width, (f19 / 2.0f) + f18, f19, new int[]{a11, a10}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.E = radialGradient2;
                radialGradient2.setLocalMatrix(this.F);
                paint2.setShader(this.E);
            }
            if (profileActivity.J1 == 0) {
                f13 = f11;
            } else {
                f13 = profileActivity.T1;
            }
            float d = this.d.d(this.f52315c) * f13;
            if (d < f11) {
                f14 = 255.0f;
                f15 = f12;
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), i11, paint);
            } else {
                f14 = 255.0f;
                f15 = f12;
            }
            if (d > 0.0f) {
                paint2.setAlpha((int) (d * f14));
                canvas2 = canvas;
                canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), i11, paint2);
            } else {
                canvas2 = canvas;
            }
            if (this.L && !this.P) {
                boolean z15 = this.M;
                org.telegram.ui.Components.e5 e5Var = this.J;
                if (!z15) {
                    if (e5Var != null) {
                        Drawable drawable = e5Var.f34181f[0];
                        if ((drawable instanceof org.telegram.ui.Components.g5) && (u2Var = ((org.telegram.ui.Components.g5) drawable).f34813k) != null && u2Var.J()) {
                            this.M = true;
                        }
                    }
                    z12 = false;
                }
                float d2 = this.K.d(z12);
                if ((!profileActivity.G1 || profileActivity.J1 != 2) && d2 > 0.0f && profileActivity.Y != null) {
                    canvas2.save();
                    canvas2.clipRect(0, 0, getMeasuredWidth(), i11);
                    kVar4 = ((org.telegram.ui.ActionBar.e2) profileActivity).actionBar;
                    if (kVar4.getOccupyStatusBar()) {
                        f16 = org.telegram.messenger.g0.f23605m;
                    } else {
                        f16 = 0.0f;
                    }
                    kVar5 = ((org.telegram.ui.ActionBar.e2) profileActivity).actionBar;
                    float A = com.google.android.gms.internal.vision.e2.A(kVar5.getHeight(), f16, f15, profileActivity.j4() + f16);
                    int measuredWidth = getMeasuredWidth();
                    float K3 = profileActivity.K3();
                    k0 k0Var = profileActivity.Y;
                    float[][] fArr = di.w0.f9628a;
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(k0Var.getX(), k0Var.getY(), (k0Var.getScaleX() * k0Var.getWidth()) + k0Var.getX(), (k0Var.getScaleY() * k0Var.getHeight()) + k0Var.getY());
                    canvas2 = canvas;
                    di.w0.c(canvas2, e5Var, measuredWidth, A, K3, rectF, 1.0f);
                    canvas2.restore();
                }
            }
            org.telegram.ui.Components.qg qgVar = profileActivity.f43140k5;
            if (qgVar != null) {
                org.telegram.ui.ActionBar.k actionBar = ((org.telegram.ui.ActionBar.e2) qgVar).getActionBar();
                org.telegram.ui.ActionBar.y yVar = actionBar.F;
                View view = (View) actionBar.getParent();
                if (yVar != null && view != null) {
                    RectF rectF2 = this.O;
                    if (jh.k.c(yVar, view, rectF2)) {
                        int save = canvas2.save();
                        canvas2.translate(rectF2.left, rectF2.top);
                        canvas2.saveLayerAlpha(0.0f, 0.0f, yVar.getMeasuredWidth(), yVar.getMeasuredHeight(), (int) ((f11 - profileActivity.T1) * f14), 31);
                        yVar.draw(canvas2);
                        canvas2.restoreToCount(save);
                    }
                }
            }
        } else {
            canvas2 = canvas;
            f10 = 0.0f;
        }
        if (z10) {
            canvas2.restore();
        }
        if (profileActivity.U5 > f10) {
            float f20 = i11;
            if (f20 < f17 && (uv0Var = profileActivity.O) != null && uv0Var.isAttachedToWindow()) {
                float y10 = (profileActivity.O.getY() + profileActivity.f43062a.getY()) - profileActivity.Y5;
                if (y10 > f20) {
                    int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28792a7, profileActivity.A0);
                    Paint paint3 = this.N;
                    paint3.setColor(w02);
                    canvas2.drawRect(0.0f, f20, getMeasuredWidth(), Math.min(f17, y10), paint3);
                }
            }
        }
    }

    @Override
    public final void setBackgroundColor(int i7) {
        if (i7 != this.f52313a) {
            this.f52313a = i7;
            this.f52314b.setColor(i7);
            invalidate();
            if (!this.f52315c) {
                this.Q.f43080c1 = this.f52313a;
            }
        }
    }
}
