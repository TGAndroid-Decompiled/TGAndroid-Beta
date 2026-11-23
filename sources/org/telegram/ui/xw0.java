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
public final class xw0 extends FrameLayout {
    public RadialGradient E;
    public final Matrix F;
    public final Paint G;
    public int H;
    public int I;
    public final org.telegram.ui.Components.m5 J;
    public final org.telegram.ui.Components.c6 K;
    public boolean L;
    public boolean M;
    public final Paint N;
    public final RectF O;
    public boolean P;
    public final ProfileActivity Q;
    public int f54105a;
    public final Paint f54106b;
    public boolean f54107c;
    public final org.telegram.ui.Components.c6 d;
    public int f54108e;
    public int f54109f;
    public final org.telegram.ui.Components.f5 h;
    public final org.telegram.ui.Components.f5 f54110n;
    public int f54111r;
    public int f54112s;
    public int f54113w;
    public float f54114x;
    public float f54115y;

    public xw0(ProfileActivity profileActivity, Context context) {
        super(context);
        this.Q = profileActivity;
        this.f54106b = new Paint();
        org.telegram.ui.Components.kr krVar = org.telegram.ui.Components.kr.h;
        this.d = new org.telegram.ui.Components.c6(this, 350L, krVar);
        this.h = new org.telegram.ui.Components.f5(this, 350L, krVar);
        this.f54110n = new org.telegram.ui.Components.f5(this, 350L, krVar);
        this.F = new Matrix();
        this.G = new Paint(1);
        this.J = new org.telegram.ui.Components.m5(org.telegram.messenger.g0.L(20.0f), 13, this, false);
        this.K = new org.telegram.ui.Components.c6(this, 0L, 440L, krVar);
        new org.telegram.ui.Components.c6(this, 0L, 440L, krVar);
        this.N = new Paint();
        this.O = new RectF();
        setWillNotDraw(false);
    }

    public final void a(org.telegram.messenger.bp bpVar, boolean z10) {
        ProfileActivity profileActivity = this.Q;
        if (bpVar != null) {
            this.f54107c = true;
            this.f54108e = bpVar.c(org.telegram.ui.ActionBar.n6.I.q());
            int d = bpVar.d(org.telegram.ui.ActionBar.n6.I.q());
            this.f54109f = d;
            profileActivity.f43652c1 = i0.a.f(0.25f, this.f54108e, d);
            int i7 = bpVar.f23236a;
            if (i7 != 0) {
                this.H = i7;
                this.I = org.telegram.ui.ActionBar.n6.r1(0.45f, i7);
            } else {
                this.H = jm0.B0(this.f54108e);
                this.I = org.telegram.ui.ActionBar.n6.r1(0.15f, jm0.B0(this.f54108e));
            }
        } else {
            profileActivity.f43652c1 = this.f54105a;
            this.f54107c = false;
            int i10 = org.telegram.ui.ActionBar.n6.f29731s8;
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.w0(i10, profileActivity.A0)) > 0.8f) {
                this.H = -1;
                this.I = -1;
            } else if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.w0(i10, profileActivity.A0)) < 0.2f) {
                this.H = org.telegram.ui.ActionBar.n6.r1(0.5f, org.telegram.ui.ActionBar.n6.b(0.02f, 0.25f, org.telegram.ui.ActionBar.n6.w0(i10, profileActivity.A0)));
                this.I = org.telegram.ui.ActionBar.n6.r1(0.35f, org.telegram.ui.ActionBar.n6.b(0.02f, 0.25f, org.telegram.ui.ActionBar.n6.w0(i10, profileActivity.A0)));
            } else {
                this.H = jm0.B0(org.telegram.ui.ActionBar.n6.w0(i10, profileActivity.A0));
                this.I = org.telegram.ui.ActionBar.n6.r1(0.15f, jm0.B0(org.telegram.ui.ActionBar.n6.w0(i10, profileActivity.A0)));
            }
        }
        if (!z10) {
            this.h.a(this.f54108e, true);
            this.f54110n.a(this.f54109f, true);
        }
        invalidate();
    }

    public final void b(long j3, boolean z10) {
        org.telegram.ui.Components.m5 m5Var = this.J;
        boolean z11 = true;
        m5Var.j(j3, true);
        m5Var.k(Integer.valueOf(this.H));
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
        fi.s2 s2Var;
        ri.q qVar;
        boolean z11 = this.P;
        ProfileActivity profileActivity = this.Q;
        if (!z11) {
            qVar = ((org.telegram.ui.ActionBar.g2) profileActivity).glassEngine;
            qVar.g();
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        kVar = ((org.telegram.ui.ActionBar.g2) profileActivity).actionBar;
        if (kVar.getOccupyStatusBar()) {
            i7 = org.telegram.messenger.g0.f24220m;
        } else {
            i7 = 0;
        }
        float f17 = currentActionBarHeight + i7 + profileActivity.Q1 + profileActivity.U1;
        int i11 = (int) ((1.0f - profileActivity.W5) * f17);
        boolean z12 = true;
        if (profileActivity.G5 > 0.0f && i11 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), i11, (int) ((1.0f - profileActivity.G5) * 255.0f));
        }
        if (i11 != 0) {
            int i12 = this.f54105a;
            Paint paint = this.f54106b;
            paint.setColor(i12);
            int a10 = this.h.a(this.f54108e, false);
            int a11 = this.f54110n.a(this.f54109f, false);
            org.telegram.ui.Components.sf0 sf0Var = profileActivity.f43635a0;
            if (sf0Var != null) {
                int i13 = this.I;
                boolean z13 = this.f54107c;
                f11 = 1.0f;
                if (sf0Var.Q == null || sf0Var.O != i13 || sf0Var.P != z13) {
                    sf0Var.O = i13;
                    sf0Var.P = z13;
                    sf0Var.g();
                }
            } else {
                f11 = 1.0f;
            }
            org.telegram.ui.Components.ng0 ng0Var = profileActivity.f43651c0;
            if (ng0Var != null) {
                ng0Var.d(this.I, this.f54107c);
            }
            org.telegram.ui.Components.wf0 wf0Var = profileActivity.O5;
            if (wf0Var != null) {
                int i14 = this.I;
                boolean z14 = this.f54107c;
                if (wf0Var.f41639i != i14 || wf0Var.f41640j != z14) {
                    wf0Var.f41639i = i14;
                    wf0Var.f41640j = z14;
                    wf0Var.a();
                }
            }
            int width = getWidth() / 2;
            RadialGradient radialGradient = this.E;
            f10 = 0.0f;
            Paint paint2 = this.G;
            if (radialGradient != null && this.f54111r == a10 && this.f54112s == a11 && this.f54113w == width) {
                f12 = 2.0f;
            } else {
                this.f54114x = org.telegram.messenger.g0.L(96.0f) * 2;
                kVar2 = ((org.telegram.ui.ActionBar.g2) profileActivity).actionBar;
                if (kVar2.getOccupyStatusBar()) {
                    i10 = org.telegram.messenger.g0.f24220m;
                } else {
                    i10 = 0;
                }
                kVar3 = ((org.telegram.ui.ActionBar.g2) profileActivity).actionBar;
                this.f54115y = kVar3.getTranslationY() + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10) - (org.telegram.messenger.g0.f24225p * 21.0f));
                this.f54113w = width;
                float f18 = this.f54115y;
                f12 = 2.0f;
                float f19 = this.f54114x;
                this.f54112s = a11;
                this.f54111r = a10;
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
            float d = this.d.d(this.f54107c) * f13;
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
                org.telegram.ui.Components.m5 m5Var = this.J;
                if (!z15) {
                    if (m5Var != null) {
                        Drawable drawable = m5Var.f37376f[0];
                        if ((drawable instanceof org.telegram.ui.Components.o5) && (s2Var = ((org.telegram.ui.Components.o5) drawable).f38028k) != null && s2Var.K()) {
                            this.M = true;
                        }
                    }
                    z12 = false;
                }
                float d2 = this.K.d(z12);
                if ((!profileActivity.G1 || profileActivity.J1 != 2) && d2 > 0.0f && profileActivity.Y != null) {
                    canvas2.save();
                    canvas2.clipRect(0, 0, getMeasuredWidth(), i11);
                    kVar4 = ((org.telegram.ui.ActionBar.g2) profileActivity).actionBar;
                    if (kVar4.getOccupyStatusBar()) {
                        f16 = org.telegram.messenger.g0.f24220m;
                    } else {
                        f16 = 0.0f;
                    }
                    kVar5 = ((org.telegram.ui.ActionBar.g2) profileActivity).actionBar;
                    float A = com.google.android.gms.internal.vision.e2.A(kVar5.getHeight(), f16, f15, profileActivity.k4() + f16);
                    int measuredWidth = getMeasuredWidth();
                    float L3 = profileActivity.L3();
                    k0 k0Var = profileActivity.Y;
                    float[][] fArr = di.v0.f9890a;
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(k0Var.getX(), k0Var.getY(), (k0Var.getScaleX() * k0Var.getWidth()) + k0Var.getX(), (k0Var.getScaleY() * k0Var.getHeight()) + k0Var.getY());
                    canvas2 = canvas;
                    di.v0.c(canvas2, m5Var, measuredWidth, A, L3, rectF, 1.0f);
                    canvas2.restore();
                }
            }
            org.telegram.ui.Components.ah ahVar = profileActivity.f43724m5;
            if (ahVar != null) {
                org.telegram.ui.ActionBar.k actionBar = ((org.telegram.ui.ActionBar.g2) ahVar).getActionBar();
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
        if (profileActivity.W5 > f10) {
            float f20 = i11;
            if (f20 < f17 && (uv0Var = profileActivity.O) != null && uv0Var.isAttachedToWindow()) {
                float y10 = (profileActivity.O.getY() + profileActivity.f43634a.getY()) - profileActivity.f43641a6;
                if (y10 > f20) {
                    int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29394a7, profileActivity.A0);
                    Paint paint3 = this.N;
                    paint3.setColor(w02);
                    canvas2.drawRect(0.0f, f20, getMeasuredWidth(), Math.min(f17, y10), paint3);
                }
            }
        }
    }

    @Override
    public final void setBackgroundColor(int i7) {
        if (i7 != this.f54105a) {
            this.f54105a = i7;
            this.f54106b.setColor(i7);
            invalidate();
            if (!this.f54107c) {
                this.Q.f43652c1 = this.f54105a;
            }
        }
    }
}
