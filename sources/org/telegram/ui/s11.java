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
public final class s11 extends FrameLayout {
    public final Matrix E;
    public final Paint F;
    public int G;
    public int H;
    public final org.telegram.ui.Components.q5 I;
    public final org.telegram.ui.Components.g6 J;
    public boolean K;
    public boolean L;
    public final Rect M;
    public final ProfileActivity N;
    public int f39921a;
    public final Paint f39922b;
    public boolean f39923c;
    public final org.telegram.ui.Components.g6 d;
    public int e;
    public int f39924f;
    public final org.telegram.ui.Components.j5 h;
    public final org.telegram.ui.Components.j5 f39925n;
    public int f39926r;
    public int f39927s;
    public int v;
    public float f39928w;
    public float f39929x;
    public RadialGradient f39930y;

    public s11(ProfileActivity profileActivity, Context context) {
        super(context);
        this.N = profileActivity;
        this.f39922b = new Paint();
        org.telegram.ui.Components.es esVar = org.telegram.ui.Components.es.h;
        this.d = new org.telegram.ui.Components.g6(this, 350L, esVar);
        this.h = new org.telegram.ui.Components.j5(this, 350L, esVar);
        this.f39925n = new org.telegram.ui.Components.j5(this, 350L, esVar);
        this.E = new Matrix();
        this.F = new Paint(1);
        this.I = new org.telegram.ui.Components.q5(AndroidUtilities.dp(20.0f), 13, this, false);
        this.J = new org.telegram.ui.Components.g6(this, 0L, 440L, esVar);
        new org.telegram.ui.Components.g6(this, 0L, 440L, esVar);
        this.M = new Rect();
        setWillNotDraw(false);
    }

    public final void a(MessagesController.PeerColor peerColor, boolean z10) {
        ProfileActivity profileActivity = this.N;
        if (peerColor != null) {
            this.f39923c = true;
            this.e = peerColor.getBgColor1(org.telegram.ui.ActionBar.g6.I.q());
            int bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.g6.I.q());
            this.f39924f = bgColor2;
            profileActivity.f32545c1 = i0.a.d(0.25f, this.e, bgColor2);
            int i10 = peerColor.patternColor;
            if (i10 != 0) {
                this.G = i10;
                this.H = org.telegram.ui.ActionBar.g6.m1(0.45f, i10);
            } else {
                this.G = gq0.w0(this.e);
                this.H = org.telegram.ui.ActionBar.g6.m1(0.15f, gq0.w0(this.e));
            }
        } else {
            profileActivity.f32545c1 = this.f39921a;
            this.f39923c = false;
            int i11 = org.telegram.ui.ActionBar.g6.f20180s8;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.w0(i11, profileActivity.f32703z0)) > 0.8f) {
                this.G = -1;
                this.H = -1;
            } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.w0(i11, profileActivity.f32703z0)) < 0.2f) {
                this.G = org.telegram.ui.ActionBar.g6.m1(0.5f, org.telegram.ui.ActionBar.g6.b(0.02f, 0.25f, org.telegram.ui.ActionBar.g6.w0(i11, profileActivity.f32703z0)));
                this.H = org.telegram.ui.ActionBar.g6.m1(0.35f, org.telegram.ui.ActionBar.g6.b(0.02f, 0.25f, org.telegram.ui.ActionBar.g6.w0(i11, profileActivity.f32703z0)));
            } else {
                this.G = gq0.w0(org.telegram.ui.ActionBar.g6.w0(i11, profileActivity.f32703z0));
                this.H = org.telegram.ui.ActionBar.g6.m1(0.15f, gq0.w0(org.telegram.ui.ActionBar.g6.w0(i11, profileActivity.f32703z0)));
            }
        }
        if (!z10) {
            this.h.a(this.e, true);
            this.f39925n.a(this.f39924f, true);
        }
        invalidate();
    }

    public final void b(long j10, boolean z10) {
        org.telegram.ui.Components.q5 q5Var = this.I;
        boolean z11 = true;
        q5Var.j(j10, true);
        q5Var.k(Integer.valueOf(this.G));
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
        org.telegram.ui.Components.ch chVar;
        org.telegram.ui.ActionBar.k actionBar;
        org.telegram.ui.ActionBar.y yVar;
        org.telegram.ui.ActionBar.k kVar4;
        float f11;
        org.telegram.ui.ActionBar.k kVar5;
        bi.b4 b4Var;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        ProfileActivity profileActivity = this.N;
        kVar = ((org.telegram.ui.ActionBar.m2) profileActivity).actionBar;
        if (kVar.getOccupyStatusBar()) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        float f12 = currentActionBarHeight + i10 + profileActivity.Q1 + profileActivity.T1;
        int i12 = (int) ((1.0f - profileActivity.E5) * f12);
        Paint paint3 = this.f39922b;
        if (i12 != 0) {
            paint3.setColor(this.f39921a);
            int a2 = this.h.a(this.e, false);
            int a10 = this.f39925n.a(this.f39924f, false);
            org.telegram.ui.Components.ei0 ei0Var = profileActivity.f32529a0;
            if (ei0Var != null) {
                int i13 = this.H;
                boolean z10 = this.f39923c;
                if (ei0Var.S == null || ei0Var.Q != i13 || ei0Var.R != z10) {
                    ei0Var.Q = i13;
                    ei0Var.R = z10;
                    ei0Var.g();
                }
            }
            int width = getWidth() / 2;
            RadialGradient radialGradient = this.f39930y;
            Paint paint4 = this.F;
            if (radialGradient == null || this.f39926r != a2 || this.f39927s != a10 || this.v != width) {
                this.f39928w = AndroidUtilities.dp(96.0f) * 2;
                kVar2 = ((org.telegram.ui.ActionBar.m2) profileActivity).actionBar;
                if (kVar2.getOccupyStatusBar()) {
                    i11 = AndroidUtilities.statusBarHeight;
                } else {
                    i11 = 0;
                }
                kVar3 = ((org.telegram.ui.ActionBar.m2) profileActivity).actionBar;
                this.f39929x = kVar3.getTranslationY() + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i11) - (AndroidUtilities.density * 21.0f));
                this.v = width;
                float f13 = this.f39929x;
                float f14 = this.f39928w;
                this.f39927s = a10;
                this.f39926r = a2;
                RadialGradient radialGradient2 = new RadialGradient(width, (f14 / 2.0f) + f13, f14, new int[]{a10, a2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.f39930y = radialGradient2;
                radialGradient2.setLocalMatrix(this.E);
                paint4.setShader(this.f39930y);
            }
            if (profileActivity.J1 == 0) {
                f7 = 1.0f;
            } else {
                f7 = profileActivity.S1;
            }
            float e = this.d.e(this.f39923c) * f7;
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
                org.telegram.ui.Components.q5 q5Var = this.I;
                boolean z12 = true;
                if (!z11) {
                    if (q5Var != null) {
                        Drawable drawable = q5Var.f28516f[0];
                        if ((drawable instanceof org.telegram.ui.Components.s5) && (b4Var = ((org.telegram.ui.Components.s5) drawable).f29031k) != null && b4Var.hasImageLoaded()) {
                            this.L = true;
                        }
                    }
                    z12 = false;
                }
                float e7 = this.J.e(z12);
                if ((!profileActivity.G1 || profileActivity.J1 != 2) && e7 > 0.0f && profileActivity.Y != null) {
                    canvas2.save();
                    canvas2.clipRect(0, 0, getMeasuredWidth(), i12);
                    kVar4 = ((org.telegram.ui.ActionBar.m2) profileActivity).actionBar;
                    if (kVar4.getOccupyStatusBar()) {
                        f11 = AndroidUtilities.statusBarHeight;
                    } else {
                        f11 = 0.0f;
                    }
                    kVar5 = ((org.telegram.ui.ActionBar.m2) profileActivity).actionBar;
                    float z13 = com.google.android.gms.internal.play_billing.k3.z(kVar5.getHeight(), f11, 2.0f, profileActivity.U3() + f11);
                    int measuredWidth = getMeasuredWidth();
                    float y3 = profileActivity.y3();
                    l0 l0Var = profileActivity.Y;
                    float[][] fArr = zh.i0.f50651a;
                    RectF rectF = AndroidUtilities.rectTmp;
                    f10 = 1.0f;
                    rectF.set(l0Var.getX(), l0Var.getY(), (l0Var.getScaleX() * l0Var.getWidth()) + l0Var.getX(), (l0Var.getScaleY() * l0Var.getHeight()) + l0Var.getY());
                    zh.i0.c(canvas2, q5Var, measuredWidth, z13, y3, rectF, 1.0f);
                    canvas2.restore();
                    chVar = profileActivity.f32578g5;
                    if (chVar != null && (yVar = (actionBar = ((org.telegram.ui.ActionBar.m2) chVar).getActionBar()).E) != null) {
                        int save = canvas2.save();
                        canvas2.translate(yVar.getX() + actionBar.getX(), yVar.getY() + actionBar.getY());
                        canvas2.saveLayerAlpha(0.0f, 0.0f, yVar.getMeasuredWidth(), yVar.getMeasuredHeight(), (int) ((f10 - profileActivity.S1) * 255.0f), 31);
                        yVar.draw(canvas2);
                        canvas2.restoreToCount(save);
                    }
                }
            }
            f10 = 1.0f;
            chVar = profileActivity.f32578g5;
            if (chVar != null) {
                int save2 = canvas2.save();
                canvas2.translate(yVar.getX() + actionBar.getX(), yVar.getY() + actionBar.getY());
                canvas2.saveLayerAlpha(0.0f, 0.0f, yVar.getMeasuredWidth(), yVar.getMeasuredHeight(), (int) ((f10 - profileActivity.S1) * 255.0f), 31);
                yVar.draw(canvas2);
                canvas2.restoreToCount(save2);
            }
        } else {
            canvas2 = canvas;
            paint = paint3;
        }
        if (i12 != f12 && !profileActivity.G1) {
            paint.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19901d6, profileActivity.f32703z0));
            this.M.set(0, i12, getMeasuredWidth(), (int) f12);
            profileActivity.f32617m5.J(canvas2, getY(), this.M, paint, true);
        }
    }

    @Override
    public final void setBackgroundColor(int i10) {
        if (i10 != this.f39921a) {
            this.f39921a = i10;
            this.f39922b.setColor(i10);
            invalidate();
            if (!this.f39923c) {
                this.N.f32545c1 = this.f39921a;
            }
        }
    }
}
