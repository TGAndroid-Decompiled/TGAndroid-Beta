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
public final class zw0 extends FrameLayout {
    public RadialGradient E;
    public final Matrix F;
    public final Paint G;
    public int H;
    public int I;
    public final org.telegram.ui.Components.n5 J;
    public final org.telegram.ui.Components.d6 K;
    public boolean L;
    public boolean M;
    public final Paint N;
    public final RectF O;
    public boolean P;
    public final ProfileActivity Q;
    public int f54646a;
    public final Paint f54647b;
    public boolean f54648c;
    public final org.telegram.ui.Components.d6 d;
    public int f54649e;
    public int f54650f;
    public final org.telegram.ui.Components.g5 h;
    public final org.telegram.ui.Components.g5 f54651n;
    public int f54652r;
    public int f54653s;
    public int f54654w;
    public float f54655x;
    public float f54656y;

    public zw0(ProfileActivity profileActivity, Context context) {
        super(context);
        this.Q = profileActivity;
        this.f54647b = new Paint();
        org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.h;
        this.d = new org.telegram.ui.Components.d6(this, 350L, nrVar);
        this.h = new org.telegram.ui.Components.g5(this, 350L, nrVar);
        this.f54651n = new org.telegram.ui.Components.g5(this, 350L, nrVar);
        this.F = new Matrix();
        this.G = new Paint(1);
        this.J = new org.telegram.ui.Components.n5(org.telegram.messenger.g0.L(20.0f), 13, this, false);
        this.K = new org.telegram.ui.Components.d6(this, 0L, 440L, nrVar);
        new org.telegram.ui.Components.d6(this, 0L, 440L, nrVar);
        this.N = new Paint();
        this.O = new RectF();
        setWillNotDraw(false);
    }

    public final void a(org.telegram.messenger.bp bpVar, boolean z10) {
        ProfileActivity profileActivity = this.Q;
        if (bpVar != null) {
            this.f54648c = true;
            this.f54649e = bpVar.c(org.telegram.ui.ActionBar.m6.I.q());
            int d = bpVar.d(org.telegram.ui.ActionBar.m6.I.q());
            this.f54650f = d;
            profileActivity.f43567c1 = i0.a.f(0.25f, this.f54649e, d);
            int i7 = bpVar.f23139a;
            if (i7 != 0) {
                this.H = i7;
                this.I = org.telegram.ui.ActionBar.m6.r1(0.45f, i7);
            } else {
                this.H = lm0.B0(this.f54649e);
                this.I = org.telegram.ui.ActionBar.m6.r1(0.15f, lm0.B0(this.f54649e));
            }
        } else {
            profileActivity.f43567c1 = this.f54646a;
            this.f54648c = false;
            int i10 = org.telegram.ui.ActionBar.m6.f29658s8;
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(i10, profileActivity.A0)) > 0.8f) {
                this.H = -1;
                this.I = -1;
            } else if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(i10, profileActivity.A0)) < 0.2f) {
                this.H = org.telegram.ui.ActionBar.m6.r1(0.5f, org.telegram.ui.ActionBar.m6.b(0.02f, 0.25f, org.telegram.ui.ActionBar.m6.w0(i10, profileActivity.A0)));
                this.I = org.telegram.ui.ActionBar.m6.r1(0.35f, org.telegram.ui.ActionBar.m6.b(0.02f, 0.25f, org.telegram.ui.ActionBar.m6.w0(i10, profileActivity.A0)));
            } else {
                this.H = lm0.B0(org.telegram.ui.ActionBar.m6.w0(i10, profileActivity.A0));
                this.I = org.telegram.ui.ActionBar.m6.r1(0.15f, lm0.B0(org.telegram.ui.ActionBar.m6.w0(i10, profileActivity.A0)));
            }
        }
        if (!z10) {
            this.h.a(this.f54649e, true);
            this.f54651n.a(this.f54650f, true);
        }
        invalidate();
    }

    public final void b(long j3, boolean z10) {
        org.telegram.ui.Components.n5 n5Var = this.J;
        boolean z11 = true;
        n5Var.j(j3, true);
        n5Var.k(Integer.valueOf(this.H));
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
        vv0 vv0Var;
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
            i7 = org.telegram.messenger.g0.f24140m;
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
            int i12 = this.f54646a;
            Paint paint = this.f54647b;
            paint.setColor(i12);
            int a10 = this.h.a(this.f54649e, false);
            int a11 = this.f54651n.a(this.f54650f, false);
            org.telegram.ui.Components.tf0 tf0Var = profileActivity.f43550a0;
            if (tf0Var != null) {
                int i13 = this.I;
                boolean z13 = this.f54648c;
                f11 = 1.0f;
                if (tf0Var.Q == null || tf0Var.O != i13 || tf0Var.P != z13) {
                    tf0Var.O = i13;
                    tf0Var.P = z13;
                    tf0Var.g();
                }
            } else {
                f11 = 1.0f;
            }
            org.telegram.ui.Components.og0 og0Var = profileActivity.f43566c0;
            if (og0Var != null) {
                og0Var.d(this.I, this.f54648c);
            }
            org.telegram.ui.Components.xf0 xf0Var = profileActivity.O5;
            if (xf0Var != null) {
                int i14 = this.I;
                boolean z14 = this.f54648c;
                if (xf0Var.f42085i != i14 || xf0Var.f42086j != z14) {
                    xf0Var.f42085i = i14;
                    xf0Var.f42086j = z14;
                    xf0Var.a();
                }
            }
            int width = getWidth() / 2;
            RadialGradient radialGradient = this.E;
            f10 = 0.0f;
            Paint paint2 = this.G;
            if (radialGradient != null && this.f54652r == a10 && this.f54653s == a11 && this.f54654w == width) {
                f12 = 2.0f;
            } else {
                this.f54655x = org.telegram.messenger.g0.L(96.0f) * 2;
                kVar2 = ((org.telegram.ui.ActionBar.g2) profileActivity).actionBar;
                if (kVar2.getOccupyStatusBar()) {
                    i10 = org.telegram.messenger.g0.f24140m;
                } else {
                    i10 = 0;
                }
                kVar3 = ((org.telegram.ui.ActionBar.g2) profileActivity).actionBar;
                this.f54656y = kVar3.getTranslationY() + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10) - (org.telegram.messenger.g0.f24145p * 21.0f));
                this.f54654w = width;
                float f18 = this.f54656y;
                f12 = 2.0f;
                float f19 = this.f54655x;
                this.f54653s = a11;
                this.f54652r = a10;
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
            float d = this.d.d(this.f54648c) * f13;
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
                org.telegram.ui.Components.n5 n5Var = this.J;
                if (!z15) {
                    if (n5Var != null) {
                        Drawable drawable = n5Var.f37773f[0];
                        if ((drawable instanceof org.telegram.ui.Components.p5) && (s2Var = ((org.telegram.ui.Components.p5) drawable).f38501k) != null && s2Var.J()) {
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
                        f16 = org.telegram.messenger.g0.f24140m;
                    } else {
                        f16 = 0.0f;
                    }
                    kVar5 = ((org.telegram.ui.ActionBar.g2) profileActivity).actionBar;
                    float A = com.google.android.gms.internal.vision.e2.A(kVar5.getHeight(), f16, f15, profileActivity.k4() + f16);
                    int measuredWidth = getMeasuredWidth();
                    float L3 = profileActivity.L3();
                    k0 k0Var = profileActivity.Y;
                    float[][] fArr = di.v0.f9926a;
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(k0Var.getX(), k0Var.getY(), (k0Var.getScaleX() * k0Var.getWidth()) + k0Var.getX(), (k0Var.getScaleY() * k0Var.getHeight()) + k0Var.getY());
                    canvas2 = canvas;
                    di.v0.c(canvas2, n5Var, measuredWidth, A, L3, rectF, 1.0f);
                    canvas2.restore();
                }
            }
            org.telegram.ui.Components.bh bhVar = profileActivity.f43639m5;
            if (bhVar != null) {
                org.telegram.ui.ActionBar.k actionBar = ((org.telegram.ui.ActionBar.g2) bhVar).getActionBar();
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
            if (f20 < f17 && (vv0Var = profileActivity.O) != null && vv0Var.isAttachedToWindow()) {
                float y10 = (profileActivity.O.getY() + profileActivity.f43549a.getY()) - profileActivity.f43556a6;
                if (y10 > f20) {
                    int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29321a7, profileActivity.A0);
                    Paint paint3 = this.N;
                    paint3.setColor(w02);
                    canvas2.drawRect(0.0f, f20, getMeasuredWidth(), Math.min(f17, y10), paint3);
                }
            }
        }
    }

    @Override
    public final void setBackgroundColor(int i7) {
        if (i7 != this.f54646a) {
            this.f54646a = i7;
            this.f54647b.setColor(i7);
            invalidate();
            if (!this.f54648c) {
                this.Q.f43567c1 = this.f54646a;
            }
        }
    }
}
