package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class x01 extends FrameLayout {
    public final Matrix E;
    public final Paint F;
    public int G;
    public int H;
    public final org.telegram.ui.Components.r5 I;
    public final org.telegram.ui.Components.h6 J;
    public boolean K;
    public boolean L;
    public final ProfileActivity M;
    public int f45603a;
    public final Paint f45604b;
    public boolean f45605c;
    public final org.telegram.ui.Components.h6 d;
    public int e;
    public int f45606f;
    public final org.telegram.ui.Components.j5 h;
    public final org.telegram.ui.Components.j5 f45607n;
    public int f45608r;
    public int f45609s;
    public int v;
    public float f45610w;
    public float f45611x;
    public RadialGradient f45612y;

    public x01(ProfileActivity profileActivity, Context context) {
        super(context);
        this.M = profileActivity;
        this.f45604b = new Paint();
        org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.h;
        this.d = new org.telegram.ui.Components.h6(this, 350L, dsVar);
        this.h = new org.telegram.ui.Components.j5(this, 350L, dsVar);
        this.f45607n = new org.telegram.ui.Components.j5(this, 350L, dsVar);
        this.E = new Matrix();
        this.F = new Paint(1);
        this.I = new org.telegram.ui.Components.r5(AndroidUtilities.dp(20.0f), 13, this, false);
        this.J = new org.telegram.ui.Components.h6(this, 0L, 440L, dsVar);
        new org.telegram.ui.Components.h6(this, 0L, 440L, dsVar);
        setWillNotDraw(false);
    }

    public final void a(MessagesController.PeerColor peerColor, boolean z10) {
        ProfileActivity profileActivity = this.M;
        if (peerColor != null) {
            this.f45605c = true;
            this.e = peerColor.getBgColor1(org.telegram.ui.ActionBar.y6.I.q());
            int bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.y6.I.q());
            this.f45606f = bgColor2;
            profileActivity.f35962c1 = i0.a.f(0.25f, this.e, bgColor2);
            int i10 = peerColor.patternColor;
            if (i10 != 0) {
                this.G = i10;
                this.H = org.telegram.ui.ActionBar.y6.o1(0.45f, i10);
            } else {
                this.G = rp0.x0(this.e);
                this.H = org.telegram.ui.ActionBar.y6.o1(0.15f, rp0.x0(this.e));
            }
        } else {
            profileActivity.f35962c1 = this.f45603a;
            this.f45605c = false;
            int i11 = org.telegram.ui.ActionBar.y6.f23634s8;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.y6.w0(i11, profileActivity.f36123z0)) > 0.8f) {
                this.G = -1;
                this.H = -1;
            } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.y6.w0(i11, profileActivity.f36123z0)) < 0.2f) {
                this.G = org.telegram.ui.ActionBar.y6.o1(0.5f, org.telegram.ui.ActionBar.y6.b(0.02f, 0.25f, org.telegram.ui.ActionBar.y6.w0(i11, profileActivity.f36123z0)));
                this.H = org.telegram.ui.ActionBar.y6.o1(0.35f, org.telegram.ui.ActionBar.y6.b(0.02f, 0.25f, org.telegram.ui.ActionBar.y6.w0(i11, profileActivity.f36123z0)));
            } else {
                this.G = rp0.x0(org.telegram.ui.ActionBar.y6.w0(i11, profileActivity.f36123z0));
                this.H = org.telegram.ui.ActionBar.y6.o1(0.15f, rp0.x0(org.telegram.ui.ActionBar.y6.w0(i11, profileActivity.f36123z0)));
            }
        }
        if (!z10) {
            this.h.a(this.e, true);
            this.f45607n.a(this.f45606f, true);
        }
        invalidate();
    }

    public final void b(long j10, boolean z10) {
        org.telegram.ui.Components.r5 r5Var = this.I;
        boolean z11 = true;
        r5Var.j(j10, true);
        r5Var.k(Integer.valueOf(this.G));
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
        org.telegram.ui.ActionBar.k kVar2;
        int i11;
        org.telegram.ui.ActionBar.k kVar3;
        float f7;
        Canvas canvas2;
        org.telegram.ui.ActionBar.k actionBar;
        org.telegram.ui.ActionBar.z zVar;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        di.f3 f3Var;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        ProfileActivity profileActivity = this.M;
        kVar = ((org.telegram.ui.ActionBar.r2) profileActivity).actionBar;
        if (kVar.getOccupyStatusBar()) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        int i12 = (int) ((1.0f - profileActivity.K5) * (currentActionBarHeight + i10 + profileActivity.Q1 + profileActivity.T1));
        if (i12 != 0) {
            int i13 = this.f45603a;
            Paint paint = this.f45604b;
            paint.setColor(i13);
            int a2 = this.h.a(this.e, false);
            int a10 = this.f45607n.a(this.f45606f, false);
            org.telegram.ui.Components.bi0 bi0Var = profileActivity.Z;
            if (bi0Var != null) {
                int i14 = this.H;
                boolean z10 = this.f45605c;
                if (bi0Var.S == null || bi0Var.Q != i14 || bi0Var.R != z10) {
                    bi0Var.Q = i14;
                    bi0Var.R = z10;
                    bi0Var.g();
                }
            }
            org.telegram.ui.Components.ui0 ui0Var = profileActivity.f35953b0;
            if (ui0Var != null) {
                ui0Var.f(this.H, this.f45605c);
            }
            int width = getWidth() / 2;
            RadialGradient radialGradient = this.f45612y;
            Paint paint2 = this.F;
            if (radialGradient == null || this.f45608r != a2 || this.f45609s != a10 || this.v != width) {
                this.f45610w = AndroidUtilities.dp(96.0f) * 2;
                kVar2 = ((org.telegram.ui.ActionBar.r2) profileActivity).actionBar;
                if (kVar2.getOccupyStatusBar()) {
                    i11 = AndroidUtilities.statusBarHeight;
                } else {
                    i11 = 0;
                }
                kVar3 = ((org.telegram.ui.ActionBar.r2) profileActivity).actionBar;
                this.f45611x = kVar3.getTranslationY() + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i11) - (AndroidUtilities.density * 21.0f));
                this.v = width;
                float f10 = width;
                float f11 = this.f45611x;
                float f12 = this.f45610w;
                this.f45609s = a10;
                this.f45608r = a2;
                RadialGradient radialGradient2 = new RadialGradient(f10, (f12 / 2.0f) + f11, f12, new int[]{a10, a2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.f45612y = radialGradient2;
                radialGradient2.setLocalMatrix(this.E);
                paint2.setShader(this.f45612y);
            }
            if (profileActivity.J1 == 0) {
                f7 = 1.0f;
            } else {
                f7 = profileActivity.S1;
            }
            float e = this.d.e(this.f45605c) * f7;
            if (e < 1.0f) {
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), i12, paint);
            }
            float f13 = 0.0f;
            if (e > 0.0f) {
                paint2.setAlpha((int) (e * 255.0f));
                canvas2 = canvas;
                canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), i12, paint2);
            } else {
                canvas2 = canvas;
            }
            if (this.K) {
                boolean z11 = this.L;
                org.telegram.ui.Components.r5 r5Var = this.I;
                boolean z12 = true;
                if (!z11) {
                    if (r5Var != null) {
                        Drawable drawable = r5Var.f32094f[0];
                        if ((drawable instanceof org.telegram.ui.Components.t5) && (f3Var = ((org.telegram.ui.Components.t5) drawable).f32849k) != null && f3Var.hasImageLoaded()) {
                            this.L = true;
                        }
                    }
                    z12 = false;
                }
                float e10 = this.J.e(z12);
                if ((!profileActivity.G1 || profileActivity.J1 != 2) && e10 > 0.0f && profileActivity.X != null) {
                    canvas2.save();
                    canvas2.clipRect(0, 0, getMeasuredWidth(), i12);
                    kVar4 = ((org.telegram.ui.ActionBar.r2) profileActivity).actionBar;
                    if (kVar4.getOccupyStatusBar()) {
                        f13 = AndroidUtilities.statusBarHeight;
                    }
                    kVar5 = ((org.telegram.ui.ActionBar.r2) profileActivity).actionBar;
                    float B = c3.h0.B(kVar5.getHeight(), f13, 2.0f, profileActivity.d4() + f13);
                    int measuredWidth = getMeasuredWidth();
                    float G3 = profileActivity.G3();
                    k0 k0Var = profileActivity.X;
                    float[][] fArr = bi.l1.f5005a;
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(k0Var.getX(), k0Var.getY(), (k0Var.getScaleX() * k0Var.getWidth()) + k0Var.getX(), (k0Var.getScaleY() * k0Var.getHeight()) + k0Var.getY());
                    bi.l1.c(canvas2, r5Var, measuredWidth, B, G3, rectF, 1.0f);
                    canvas2.restore();
                }
            }
            org.telegram.ui.Components.bh bhVar = profileActivity.f36034m5;
            if (bhVar != null && (zVar = (actionBar = ((org.telegram.ui.ActionBar.r2) bhVar).getActionBar()).E) != null) {
                int save = canvas2.save();
                canvas2.translate(zVar.getX() + actionBar.getX(), zVar.getY() + actionBar.getY());
                canvas2.saveLayerAlpha(0.0f, 0.0f, zVar.getMeasuredWidth(), zVar.getMeasuredHeight(), (int) ((1.0f - profileActivity.S1) * 255.0f), 31);
                zVar.draw(canvas2);
                canvas2.restoreToCount(save);
            }
        }
    }

    @Override
    public final void setBackgroundColor(int i10) {
        if (i10 != this.f45603a) {
            this.f45603a = i10;
            this.f45604b.setColor(i10);
            invalidate();
            if (!this.f45605c) {
                this.M.f35962c1 = this.f45603a;
            }
        }
    }
}
