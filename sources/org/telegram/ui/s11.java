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
    public final org.telegram.ui.Components.n5 I;
    public final org.telegram.ui.Components.d6 J;
    public boolean K;
    public boolean L;
    public final Rect M;
    public final ProfileActivity N;
    public int f36511a;
    public final Paint f36512b;
    public boolean f36513c;
    public final org.telegram.ui.Components.d6 d;
    public int e;
    public int f36514f;
    public final org.telegram.ui.Components.g5 h;
    public final org.telegram.ui.Components.g5 f36515n;
    public int f36516r;
    public int f36517s;
    public int v;
    public float f36518w;
    public float f36519x;
    public RadialGradient f36520y;

    public s11(ProfileActivity profileActivity, Context context) {
        super(context);
        this.N = profileActivity;
        this.f36512b = new Paint();
        org.telegram.ui.Components.wr wrVar = org.telegram.ui.Components.wr.h;
        this.d = new org.telegram.ui.Components.d6(this, 350L, wrVar);
        this.h = new org.telegram.ui.Components.g5(this, 350L, wrVar);
        this.f36515n = new org.telegram.ui.Components.g5(this, 350L, wrVar);
        this.E = new Matrix();
        this.F = new Paint(1);
        this.I = new org.telegram.ui.Components.n5(AndroidUtilities.dp(20.0f), 13, this, false);
        this.J = new org.telegram.ui.Components.d6(this, 0L, 440L, wrVar);
        new org.telegram.ui.Components.d6(this, 0L, 440L, wrVar);
        this.M = new Rect();
        setWillNotDraw(false);
    }

    public final void a(MessagesController.PeerColor peerColor, boolean z10) {
        ProfileActivity profileActivity = this.N;
        if (peerColor != null) {
            this.f36513c = true;
            this.e = peerColor.getBgColor1(org.telegram.ui.ActionBar.j6.I.q());
            int bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.j6.I.q());
            this.f36514f = bgColor2;
            profileActivity.f30367c1 = i0.a.d(0.25f, this.e, bgColor2);
            int i10 = peerColor.patternColor;
            if (i10 != 0) {
                this.G = i10;
                this.H = org.telegram.ui.ActionBar.j6.l1(0.45f, i10);
            } else {
                this.G = bq0.w0(this.e);
                this.H = org.telegram.ui.ActionBar.j6.l1(0.15f, bq0.w0(this.e));
            }
        } else {
            profileActivity.f30367c1 = this.f36511a;
            this.f36513c = false;
            int i11 = org.telegram.ui.ActionBar.j6.f18201s8;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v0(i11, profileActivity.f30524z0)) > 0.8f) {
                this.G = -1;
                this.H = -1;
            } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v0(i11, profileActivity.f30524z0)) < 0.2f) {
                this.G = org.telegram.ui.ActionBar.j6.l1(0.5f, org.telegram.ui.ActionBar.j6.b(0.02f, 0.25f, org.telegram.ui.ActionBar.j6.v0(i11, profileActivity.f30524z0)));
                this.H = org.telegram.ui.ActionBar.j6.l1(0.35f, org.telegram.ui.ActionBar.j6.b(0.02f, 0.25f, org.telegram.ui.ActionBar.j6.v0(i11, profileActivity.f30524z0)));
            } else {
                this.G = bq0.w0(org.telegram.ui.ActionBar.j6.v0(i11, profileActivity.f30524z0));
                this.H = org.telegram.ui.ActionBar.j6.l1(0.15f, bq0.w0(org.telegram.ui.ActionBar.j6.v0(i11, profileActivity.f30524z0)));
            }
        }
        if (!z10) {
            this.h.a(this.e, true);
            this.f36515n.a(this.f36514f, true);
        }
        invalidate();
    }

    public final void b(long j3, boolean z10) {
        org.telegram.ui.Components.n5 n5Var = this.I;
        boolean z11 = true;
        n5Var.j(j3, true);
        n5Var.k(Integer.valueOf(this.G));
        if (!this.K && (j3 == 0 || j3 == -1)) {
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
        org.telegram.ui.ActionBar.l lVar;
        int i10;
        Canvas canvas2;
        Paint paint;
        org.telegram.ui.ActionBar.l lVar2;
        int i11;
        org.telegram.ui.ActionBar.l lVar3;
        float f7;
        Paint paint2;
        float f10;
        org.telegram.ui.Components.eh ehVar;
        org.telegram.ui.ActionBar.l actionBar;
        org.telegram.ui.ActionBar.z zVar;
        org.telegram.ui.ActionBar.l lVar4;
        float f11;
        org.telegram.ui.ActionBar.l lVar5;
        gg.h1 h1Var;
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        ProfileActivity profileActivity = this.N;
        lVar = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
        if (lVar.getOccupyStatusBar()) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        float f12 = currentActionBarHeight + i10 + profileActivity.Q1 + profileActivity.T1;
        int i12 = (int) ((1.0f - profileActivity.E5) * f12);
        Paint paint3 = this.f36512b;
        if (i12 != 0) {
            paint3.setColor(this.f36511a);
            int a2 = this.h.a(this.e, false);
            int a10 = this.f36515n.a(this.f36514f, false);
            org.telegram.ui.Components.nh0 nh0Var = profileActivity.f30351a0;
            if (nh0Var != null) {
                int i13 = this.H;
                boolean z10 = this.f36513c;
                if (nh0Var.S == null || nh0Var.Q != i13 || nh0Var.R != z10) {
                    nh0Var.Q = i13;
                    nh0Var.R = z10;
                    nh0Var.g();
                }
            }
            int width = getWidth() / 2;
            RadialGradient radialGradient = this.f36520y;
            Paint paint4 = this.F;
            if (radialGradient == null || this.f36516r != a2 || this.f36517s != a10 || this.v != width) {
                this.f36518w = AndroidUtilities.dp(96.0f) * 2;
                lVar2 = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
                if (lVar2.getOccupyStatusBar()) {
                    i11 = AndroidUtilities.statusBarHeight;
                } else {
                    i11 = 0;
                }
                lVar3 = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
                this.f36519x = lVar3.getTranslationY() + ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i11) - (AndroidUtilities.density * 21.0f));
                this.v = width;
                float f13 = this.f36519x;
                float f14 = this.f36518w;
                this.f36517s = a10;
                this.f36516r = a2;
                RadialGradient radialGradient2 = new RadialGradient(width, (f14 / 2.0f) + f13, f14, new int[]{a10, a2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.f36520y = radialGradient2;
                radialGradient2.setLocalMatrix(this.E);
                paint4.setShader(this.f36520y);
            }
            if (profileActivity.J1 == 0) {
                f7 = 1.0f;
            } else {
                f7 = profileActivity.S1;
            }
            float e = this.d.e(this.f36513c) * f7;
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
                        Drawable drawable = n5Var.f25412f[0];
                        if ((drawable instanceof org.telegram.ui.Components.p5) && (h1Var = ((org.telegram.ui.Components.p5) drawable).f26033k) != null && h1Var.hasImageLoaded()) {
                            this.L = true;
                        }
                    }
                    z12 = false;
                }
                float e7 = this.J.e(z12);
                if ((!profileActivity.G1 || profileActivity.J1 != 2) && e7 > 0.0f && profileActivity.Y != null) {
                    canvas2.save();
                    canvas2.clipRect(0, 0, getMeasuredWidth(), i12);
                    lVar4 = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
                    if (lVar4.getOccupyStatusBar()) {
                        f11 = AndroidUtilities.statusBarHeight;
                    } else {
                        f11 = 0.0f;
                    }
                    lVar5 = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
                    float A = com.google.android.gms.internal.vision.e2.A(lVar5.getHeight(), f11, 2.0f, profileActivity.U3() + f11);
                    int measuredWidth = getMeasuredWidth();
                    float y3 = profileActivity.y3();
                    k0 k0Var = profileActivity.Y;
                    float[][] fArr = xh.j0.f45560a;
                    RectF rectF = AndroidUtilities.rectTmp;
                    f10 = 1.0f;
                    rectF.set(k0Var.getX(), k0Var.getY(), (k0Var.getScaleX() * k0Var.getWidth()) + k0Var.getX(), (k0Var.getScaleY() * k0Var.getHeight()) + k0Var.getY());
                    xh.j0.c(canvas2, n5Var, measuredWidth, A, y3, rectF, 1.0f);
                    canvas2.restore();
                    ehVar = profileActivity.f30400g5;
                    if (ehVar != null && (zVar = (actionBar = ((org.telegram.ui.ActionBar.p2) ehVar).getActionBar()).E) != null) {
                        int save = canvas2.save();
                        canvas2.translate(zVar.getX() + actionBar.getX(), zVar.getY() + actionBar.getY());
                        canvas2.saveLayerAlpha(0.0f, 0.0f, zVar.getMeasuredWidth(), zVar.getMeasuredHeight(), (int) ((f10 - profileActivity.S1) * 255.0f), 31);
                        zVar.draw(canvas2);
                        canvas2.restoreToCount(save);
                    }
                }
            }
            f10 = 1.0f;
            ehVar = profileActivity.f30400g5;
            if (ehVar != null) {
                int save2 = canvas2.save();
                canvas2.translate(zVar.getX() + actionBar.getX(), zVar.getY() + actionBar.getY());
                canvas2.saveLayerAlpha(0.0f, 0.0f, zVar.getMeasuredWidth(), zVar.getMeasuredHeight(), (int) ((f10 - profileActivity.S1) * 255.0f), 31);
                zVar.draw(canvas2);
                canvas2.restoreToCount(save2);
            }
        } else {
            canvas2 = canvas;
            paint = paint3;
        }
        if (i12 != f12 && !profileActivity.G1) {
            paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17928d6, profileActivity.f30524z0));
            this.M.set(0, i12, getMeasuredWidth(), (int) f12);
            profileActivity.f30438m5.J(canvas2, getY(), this.M, paint, true);
        }
    }

    @Override
    public final void setBackgroundColor(int i10) {
        if (i10 != this.f36511a) {
            this.f36511a = i10;
            this.f36512b.setColor(i10);
            invalidate();
            if (!this.f36513c) {
                this.N.f30367c1 = this.f36511a;
            }
        }
    }
}
