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
    public RadialGradient D;
    public final Matrix E;
    public final Paint F;
    public int G;
    public int H;
    public final org.telegram.ui.Components.g5 I;
    public final org.telegram.ui.Components.w5 J;
    public boolean K;
    public boolean L;
    public final Paint M;
    public final RectF N;
    public boolean O;
    public final ProfileActivity P;
    public int f52688a;
    public final Paint f52689b;
    public boolean f52690c;
    public final org.telegram.ui.Components.w5 d;
    public int f52691e;
    public int f52692f;
    public final org.telegram.ui.Components.z4 h;
    public final org.telegram.ui.Components.z4 f52693n;
    public int f52694r;
    public int f52695s;
    public int f52696w;
    public float f52697x;
    public float f52698y;

    public zw0(ProfileActivity profileActivity, Context context) {
        super(context);
        this.P = profileActivity;
        this.f52689b = new Paint();
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        this.d = new org.telegram.ui.Components.w5(this, 350L, xqVar);
        this.h = new org.telegram.ui.Components.z4(this, 350L, xqVar);
        this.f52693n = new org.telegram.ui.Components.z4(this, 350L, xqVar);
        this.E = new Matrix();
        this.F = new Paint(1);
        this.I = new org.telegram.ui.Components.g5(org.telegram.messenger.g0.L(20.0f), 13, this, false);
        this.J = new org.telegram.ui.Components.w5(this, 0L, 440L, xqVar);
        new org.telegram.ui.Components.w5(this, 0L, 440L, xqVar);
        this.M = new Paint();
        this.N = new RectF();
        setWillNotDraw(false);
    }

    public final void a(org.telegram.messenger.fp fpVar, boolean z9) {
        ProfileActivity profileActivity = this.P;
        if (fpVar != null) {
            this.f52690c = true;
            this.f52691e = fpVar.c(org.telegram.ui.ActionBar.l6.I.q());
            int d = fpVar.d(org.telegram.ui.ActionBar.l6.I.q());
            this.f52692f = d;
            profileActivity.f41708b1 = i0.a.f(0.25f, this.f52691e, d);
            int i7 = fpVar.f22449a;
            if (i7 != 0) {
                this.G = i7;
                this.H = org.telegram.ui.ActionBar.l6.r1(0.45f, i7);
            } else {
                this.G = jm0.B0(this.f52691e);
                this.H = org.telegram.ui.ActionBar.l6.r1(0.15f, jm0.B0(this.f52691e));
            }
        } else {
            profileActivity.f41708b1 = this.f52688a;
            this.f52690c = false;
            int i10 = org.telegram.ui.ActionBar.l6.f28145s8;
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.l6.w0(i10, profileActivity.f41876z0)) > 0.8f) {
                this.G = -1;
                this.H = -1;
            } else if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.l6.w0(i10, profileActivity.f41876z0)) < 0.2f) {
                this.G = org.telegram.ui.ActionBar.l6.r1(0.5f, org.telegram.ui.ActionBar.l6.b(0.02f, 0.25f, org.telegram.ui.ActionBar.l6.w0(i10, profileActivity.f41876z0)));
                this.H = org.telegram.ui.ActionBar.l6.r1(0.35f, org.telegram.ui.ActionBar.l6.b(0.02f, 0.25f, org.telegram.ui.ActionBar.l6.w0(i10, profileActivity.f41876z0)));
            } else {
                this.G = jm0.B0(org.telegram.ui.ActionBar.l6.w0(i10, profileActivity.f41876z0));
                this.H = org.telegram.ui.ActionBar.l6.r1(0.15f, jm0.B0(org.telegram.ui.ActionBar.l6.w0(i10, profileActivity.f41876z0)));
            }
        }
        if (!z9) {
            this.h.a(this.f52691e, true);
            this.f52693n.a(this.f52692f, true);
        }
        invalidate();
    }

    public final void b(long j3, boolean z9) {
        org.telegram.ui.Components.g5 g5Var = this.I;
        boolean z10 = true;
        g5Var.j(j3, true);
        g5Var.k(Integer.valueOf(this.G));
        if (!this.K && (j3 == 0 || j3 == -1)) {
            z10 = false;
        }
        this.K = z10;
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.I.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.I.b();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        int i7;
        boolean z9;
        Canvas canvas2;
        float f10;
        xv0 xv0Var;
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
        di.z2 z2Var;
        oi.q qVar;
        boolean z10 = this.O;
        ProfileActivity profileActivity = this.P;
        if (!z10) {
            qVar = ((org.telegram.ui.ActionBar.f2) profileActivity).glassEngine;
            qVar.g();
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        kVar = ((org.telegram.ui.ActionBar.f2) profileActivity).actionBar;
        if (kVar.getOccupyStatusBar()) {
            i7 = org.telegram.messenger.g0.f22557m;
        } else {
            i7 = 0;
        }
        float f17 = currentActionBarHeight + i7 + profileActivity.P1 + profileActivity.S1;
        int i11 = (int) ((1.0f - profileActivity.S5) * f17);
        boolean z11 = true;
        if (profileActivity.C5 > 0.0f && i11 != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), i11, (int) ((1.0f - profileActivity.C5) * 255.0f));
        }
        if (i11 != 0) {
            int i12 = this.f52688a;
            Paint paint = this.f52689b;
            paint.setColor(i12);
            int a10 = this.h.a(this.f52691e, false);
            int a11 = this.f52693n.a(this.f52692f, false);
            org.telegram.ui.Components.ff0 ff0Var = profileActivity.Z;
            if (ff0Var != null) {
                int i13 = this.H;
                boolean z12 = this.f52690c;
                f11 = 1.0f;
                if (ff0Var.P == null || ff0Var.N != i13 || ff0Var.O != z12) {
                    ff0Var.N = i13;
                    ff0Var.O = z12;
                    ff0Var.g();
                }
            } else {
                f11 = 1.0f;
            }
            org.telegram.ui.Components.ag0 ag0Var = profileActivity.f41707b0;
            if (ag0Var != null) {
                ag0Var.d(this.H, this.f52690c);
            }
            org.telegram.ui.Components.jf0 jf0Var = profileActivity.K5;
            if (jf0Var != null) {
                int i14 = this.H;
                boolean z13 = this.f52690c;
                if (jf0Var.f35002i != i14 || jf0Var.f35003j != z13) {
                    jf0Var.f35002i = i14;
                    jf0Var.f35003j = z13;
                    jf0Var.a();
                }
            }
            int width = getWidth() / 2;
            RadialGradient radialGradient = this.D;
            f10 = 0.0f;
            Paint paint2 = this.F;
            if (radialGradient != null && this.f52694r == a10 && this.f52695s == a11 && this.f52696w == width) {
                f12 = 2.0f;
            } else {
                this.f52697x = org.telegram.messenger.g0.L(96.0f) * 2;
                kVar2 = ((org.telegram.ui.ActionBar.f2) profileActivity).actionBar;
                if (kVar2.getOccupyStatusBar()) {
                    i10 = org.telegram.messenger.g0.f22557m;
                } else {
                    i10 = 0;
                }
                kVar3 = ((org.telegram.ui.ActionBar.f2) profileActivity).actionBar;
                this.f52698y = kVar3.getTranslationY() + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10) - (org.telegram.messenger.g0.f22562p * 21.0f));
                this.f52696w = width;
                float f18 = this.f52698y;
                f12 = 2.0f;
                float f19 = this.f52697x;
                this.f52695s = a11;
                this.f52694r = a10;
                RadialGradient radialGradient2 = new RadialGradient(width, (f19 / 2.0f) + f18, f19, new int[]{a11, a10}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.D = radialGradient2;
                radialGradient2.setLocalMatrix(this.E);
                paint2.setShader(this.D);
            }
            if (profileActivity.I1 == 0) {
                f13 = f11;
            } else {
                f13 = profileActivity.R1;
            }
            float d = this.d.d(this.f52690c) * f13;
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
            if (this.K && !this.O) {
                boolean z14 = this.L;
                org.telegram.ui.Components.g5 g5Var = this.I;
                if (!z14) {
                    if (g5Var != null) {
                        Drawable drawable = g5Var.f33866f[0];
                        if ((drawable instanceof org.telegram.ui.Components.i5) && (z2Var = ((org.telegram.ui.Components.i5) drawable).f34568k) != null && z2Var.J()) {
                            this.L = true;
                        }
                    }
                    z11 = false;
                }
                float d2 = this.J.d(z11);
                if ((!profileActivity.F1 || profileActivity.I1 != 2) && d2 > 0.0f && profileActivity.X != null) {
                    canvas2.save();
                    canvas2.clipRect(0, 0, getMeasuredWidth(), i11);
                    kVar4 = ((org.telegram.ui.ActionBar.f2) profileActivity).actionBar;
                    if (kVar4.getOccupyStatusBar()) {
                        f16 = org.telegram.messenger.g0.f22557m;
                    } else {
                        f16 = 0.0f;
                    }
                    kVar5 = ((org.telegram.ui.ActionBar.f2) profileActivity).actionBar;
                    float A = com.google.android.recaptcha.internal.a.A(kVar5.getHeight(), f16, f15, profileActivity.k4() + f16);
                    int measuredWidth = getMeasuredWidth();
                    float L3 = profileActivity.L3();
                    k0 k0Var = profileActivity.X;
                    float[][] fArr = bi.i1.f4026a;
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(k0Var.getX(), k0Var.getY(), (k0Var.getScaleX() * k0Var.getWidth()) + k0Var.getX(), (k0Var.getScaleY() * k0Var.getHeight()) + k0Var.getY());
                    canvas2 = canvas;
                    bi.i1.c(canvas2, g5Var, measuredWidth, A, L3, rectF, 1.0f);
                    canvas2.restore();
                }
            }
            org.telegram.ui.Components.kg kgVar = profileActivity.f41763i5;
            if (kgVar != null) {
                org.telegram.ui.ActionBar.k actionBar = ((org.telegram.ui.ActionBar.f2) kgVar).getActionBar();
                org.telegram.ui.ActionBar.y yVar = actionBar.E;
                View view = (View) actionBar.getParent();
                if (yVar != null && view != null) {
                    RectF rectF2 = this.N;
                    if (jh.k.c(yVar, view, rectF2)) {
                        int save = canvas2.save();
                        canvas2.translate(rectF2.left, rectF2.top);
                        canvas2.saveLayerAlpha(0.0f, 0.0f, yVar.getMeasuredWidth(), yVar.getMeasuredHeight(), (int) ((f11 - profileActivity.R1) * f14), 31);
                        yVar.draw(canvas2);
                        canvas2.restoreToCount(save);
                    }
                }
            }
        } else {
            canvas2 = canvas;
            f10 = 0.0f;
        }
        if (z9) {
            canvas2.restore();
        }
        if (profileActivity.S5 > f10) {
            float f20 = i11;
            if (f20 < f17 && (xv0Var = profileActivity.N) != null && xv0Var.isAttachedToWindow()) {
                float y10 = (profileActivity.N.getY() + profileActivity.f41698a.getY()) - profileActivity.W5;
                if (y10 > f20) {
                    int w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27809a7, profileActivity.f41876z0);
                    Paint paint3 = this.M;
                    paint3.setColor(w02);
                    canvas2.drawRect(0.0f, f20, getMeasuredWidth(), Math.min(f17, y10), paint3);
                }
            }
        }
    }

    @Override
    public final void setBackgroundColor(int i7) {
        if (i7 != this.f52688a) {
            this.f52688a = i7;
            this.f52689b.setColor(i7);
            invalidate();
            if (!this.f52690c) {
                this.P.f41708b1 = this.f52688a;
            }
        }
    }
}
