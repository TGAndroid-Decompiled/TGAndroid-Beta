package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class s01 extends FrameLayout {
    public final Matrix E;
    public final Paint F;
    public int G;
    public int H;
    public final org.telegram.ui.Components.n5 I;
    public final org.telegram.ui.Components.d6 J;
    public boolean K;
    public boolean L;
    public final Rect M;
    public final ProfileActivity N;
    public int f41273a;
    public final Paint f41274b;
    public boolean f41275c;
    public final org.telegram.ui.Components.d6 d;
    public int e;
    public int f41276f;
    public final org.telegram.ui.Components.g5 h;
    public final org.telegram.ui.Components.g5 f41277n;
    public int f41278r;
    public int f41279s;
    public int v;
    public float f41280w;
    public float f41281x;
    public RadialGradient f41282y;

    public s01(ProfileActivity profileActivity, Context context) {
        super(context);
        this.N = profileActivity;
        this.f41274b = new Paint();
        org.telegram.ui.Components.zr zrVar = org.telegram.ui.Components.zr.h;
        this.d = new org.telegram.ui.Components.d6(this, 350L, zrVar);
        this.h = new org.telegram.ui.Components.g5(this, 350L, zrVar);
        this.f41277n = new org.telegram.ui.Components.g5(this, 350L, zrVar);
        this.E = new Matrix();
        this.F = new Paint(1);
        this.I = new org.telegram.ui.Components.n5(AndroidUtilities.dp(20.0f), 13, this, false);
        this.J = new org.telegram.ui.Components.d6(this, 0L, 440L, zrVar);
        new org.telegram.ui.Components.d6(this, 0L, 440L, zrVar);
        this.M = new Rect();
        setWillNotDraw(false);
    }

    public final void a(MessagesController.PeerColor peerColor, boolean z10) {
        ProfileActivity profileActivity = this.N;
        if (peerColor != null) {
            this.f41275c = true;
            this.e = peerColor.getBgColor1(org.telegram.ui.ActionBar.k6.I.q());
            int bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.k6.I.q());
            this.f41276f = bgColor2;
            profileActivity.f33908d1 = i0.a.f(0.25f, this.e, bgColor2);
            int i10 = peerColor.patternColor;
            if (i10 != 0) {
                this.G = i10;
                this.H = org.telegram.ui.ActionBar.k6.o1(0.45f, i10);
            } else {
                this.G = kp0.w0(this.e);
                this.H = org.telegram.ui.ActionBar.k6.o1(0.15f, kp0.w0(this.e));
            }
        } else {
            profileActivity.f33908d1 = this.f41273a;
            this.f41275c = false;
            int i11 = org.telegram.ui.ActionBar.k6.f21463s8;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.w0(i11, profileActivity.A0)) > 0.8f) {
                this.G = -1;
                this.H = -1;
            } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.w0(i11, profileActivity.A0)) < 0.2f) {
                this.G = org.telegram.ui.ActionBar.k6.o1(0.5f, org.telegram.ui.ActionBar.k6.b(0.02f, 0.25f, org.telegram.ui.ActionBar.k6.w0(i11, profileActivity.A0)));
                this.H = org.telegram.ui.ActionBar.k6.o1(0.35f, org.telegram.ui.ActionBar.k6.b(0.02f, 0.25f, org.telegram.ui.ActionBar.k6.w0(i11, profileActivity.A0)));
            } else {
                this.G = kp0.w0(org.telegram.ui.ActionBar.k6.w0(i11, profileActivity.A0));
                this.H = org.telegram.ui.ActionBar.k6.o1(0.15f, kp0.w0(org.telegram.ui.ActionBar.k6.w0(i11, profileActivity.A0)));
            }
        }
        if (!z10) {
            this.h.a(this.e, true);
            this.f41277n.a(this.f41276f, true);
        }
        invalidate();
    }

    public final void b(long j10, boolean z10) {
        org.telegram.ui.Components.n5 n5Var = this.I;
        boolean z11 = true;
        n5Var.j(j10, true);
        n5Var.k(Integer.valueOf(this.G));
        if (!this.K && (j10 == 0 || j10 == -1)) {
            z11 = false;
        }
        this.K = z11;
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
        int i10;
        Canvas canvas2;
        Paint paint;
        org.telegram.ui.ActionBar.k kVar2;
        int i11;
        org.telegram.ui.ActionBar.k kVar3;
        float f7;
        Paint paint2;
        float f10;
        org.telegram.ui.Components.zg zgVar;
        org.telegram.ui.ActionBar.k actionBar;
        org.telegram.ui.ActionBar.y yVar;
        org.telegram.ui.ActionBar.k kVar4;
        float f11;
        org.telegram.ui.ActionBar.k kVar5;
        ci.f3 f3Var;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        ProfileActivity profileActivity = this.N;
        kVar = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
        if (kVar.getOccupyStatusBar()) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        float f12 = currentActionBarHeight + i10 + profileActivity.R1 + profileActivity.U1;
        int i12 = (int) ((1.0f - profileActivity.G5) * f12);
        Paint paint3 = this.f41274b;
        if (i12 != 0) {
            paint3.setColor(this.f41273a);
            int a2 = this.h.a(this.e, false);
            int a10 = this.f41277n.a(this.f41276f, false);
            org.telegram.ui.Components.bi0 bi0Var = profileActivity.f33885a0;
            if (bi0Var != null) {
                int i13 = this.H;
                boolean z10 = this.f41275c;
                if (bi0Var.S == null || bi0Var.Q != i13 || bi0Var.R != z10) {
                    bi0Var.Q = i13;
                    bi0Var.R = z10;
                    bi0Var.g();
                }
            }
            org.telegram.ui.Components.ui0 ui0Var = profileActivity.f33900c0;
            if (ui0Var != null) {
                ui0Var.f(this.H, this.f41275c);
            }
            int width = getWidth() / 2;
            RadialGradient radialGradient = this.f41282y;
            Paint paint4 = this.F;
            if (radialGradient == null || this.f41278r != a2 || this.f41279s != a10 || this.v != width) {
                this.f41280w = AndroidUtilities.dp(96.0f) * 2;
                kVar2 = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
                if (kVar2.getOccupyStatusBar()) {
                    i11 = AndroidUtilities.statusBarHeight;
                } else {
                    i11 = 0;
                }
                kVar3 = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
                this.f41281x = kVar3.getTranslationY() + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i11) - (AndroidUtilities.density * 21.0f));
                this.v = width;
                float f13 = this.f41281x;
                float f14 = this.f41280w;
                this.f41279s = a10;
                this.f41278r = a2;
                RadialGradient radialGradient2 = new RadialGradient(width, (f14 / 2.0f) + f13, f14, new int[]{a10, a2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.f41282y = radialGradient2;
                radialGradient2.setLocalMatrix(this.E);
                paint4.setShader(this.f41282y);
            }
            if (profileActivity.K1 == 0) {
                f7 = 1.0f;
            } else {
                f7 = profileActivity.T1;
            }
            float e = this.d.e(this.f41275c) * f7;
            if (e < 1.0f) {
                paint2 = paint3;
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), i12, paint2);
            } else {
                paint2 = paint3;
            }
            if (e > 0.0f) {
                paint4.setAlpha((int) (e * 255.0f));
                paint = paint2;
                canvas2 = canvas;
                canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), i12, paint4);
            } else {
                canvas2 = canvas;
                paint = paint2;
            }
            if (this.K) {
                boolean z11 = this.L;
                org.telegram.ui.Components.n5 n5Var = this.I;
                boolean z12 = true;
                if (!z11) {
                    if (n5Var != null) {
                        Drawable drawable = n5Var.f28782f[0];
                        if ((drawable instanceof org.telegram.ui.Components.p5) && (f3Var = ((org.telegram.ui.Components.p5) drawable).f29484k) != null && f3Var.hasImageLoaded()) {
                            this.L = true;
                        }
                    }
                    z12 = false;
                }
                float e7 = this.J.e(z12);
                if ((!profileActivity.H1 || profileActivity.K1 != 2) && e7 > 0.0f && profileActivity.Y != null) {
                    canvas2.save();
                    canvas2.clipRect(0, 0, getMeasuredWidth(), i12);
                    kVar4 = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
                    if (kVar4.getOccupyStatusBar()) {
                        f11 = AndroidUtilities.statusBarHeight;
                    } else {
                        f11 = 0.0f;
                    }
                    kVar5 = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
                    float z13 = com.google.android.gms.internal.play_billing.k3.z(kVar5.getHeight(), f11, 2.0f, profileActivity.W3() + f11);
                    int measuredWidth = getMeasuredWidth();
                    float A3 = profileActivity.A3();
                    l0 l0Var = profileActivity.Y;
                    float[][] fArr = ai.m1.f1798a;
                    RectF rectF = AndroidUtilities.rectTmp;
                    f10 = 1.0f;
                    rectF.set(l0Var.getX(), l0Var.getY(), (l0Var.getScaleX() * l0Var.getWidth()) + l0Var.getX(), (l0Var.getScaleY() * l0Var.getHeight()) + l0Var.getY());
                    ai.m1.c(canvas2, n5Var, measuredWidth, z13, A3, rectF, 1.0f);
                    canvas2.restore();
                    zgVar = profileActivity.f33948i5;
                    if (zgVar != null && (yVar = (actionBar = ((org.telegram.ui.ActionBar.o2) zgVar).getActionBar()).E) != null) {
                        int save = canvas2.save();
                        canvas2.translate(yVar.getX() + actionBar.getX(), yVar.getY() + actionBar.getY());
                        canvas2.saveLayerAlpha(0.0f, 0.0f, yVar.getMeasuredWidth(), yVar.getMeasuredHeight(), (int) ((f10 - profileActivity.T1) * 255.0f), 31);
                        yVar.draw(canvas2);
                        canvas2.restoreToCount(save);
                    }
                }
            }
            f10 = 1.0f;
            zgVar = profileActivity.f33948i5;
            if (zgVar != null) {
                int save2 = canvas2.save();
                canvas2.translate(yVar.getX() + actionBar.getX(), yVar.getY() + actionBar.getY());
                canvas2.saveLayerAlpha(0.0f, 0.0f, yVar.getMeasuredWidth(), yVar.getMeasuredHeight(), (int) ((f10 - profileActivity.T1) * 255.0f), 31);
                yVar.draw(canvas2);
                canvas2.restoreToCount(save2);
            }
        } else {
            canvas2 = canvas;
            paint = paint3;
        }
        if (i12 != f12 && !profileActivity.H1) {
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21184d6, profileActivity.A0));
            this.M.set(0, i12, getMeasuredWidth(), (int) f12);
            profileActivity.f33988o5.I(canvas2, getY(), this.M, paint, true);
        }
    }

    @Override
    public final void setBackgroundColor(int i10) {
        if (i10 != this.f41273a) {
            this.f41273a = i10;
            this.f41274b.setColor(i10);
            invalidate();
            if (!this.f41275c) {
                this.N.f33908d1 = this.f41273a;
            }
        }
    }
}
