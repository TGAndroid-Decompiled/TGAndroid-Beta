package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class sw0 extends Dialog {
    public float E;
    public final gh.b F;
    public final bh.b G;
    public MessageObject H;
    public boolean I;
    public qw0 J;
    public rw0 K;
    public org.telegram.ui.Cells.u1 L;
    public float M;
    public float N;
    public boolean O;
    public byte[] P;
    public org.telegram.ui.Components.gl0 Q;
    public ViewGroup R;
    public float S;
    public ViewGroup T;
    public float U;
    public boolean V;
    public float W;
    public float X;
    public boolean Y;
    public float Z;
    public final Context f40228a;
    public float f40229a0;
    public final org.telegram.ui.ActionBar.c6 f40230b;
    public boolean f40231b0;
    public final nw0 f40232c;
    public boolean f40233c0;
    public final nw0 d;
    public boolean f40234d0;
    public final nw0 e;
    public bn f40235e0;
    public final di.h1 f40236f;
    public ValueAnimator f40237f0;
    public ValueAnimator f40238g0;
    public final TextView h;
    public final org.telegram.ui.Components.tc0 f40239n;
    public i0.b f40240r;
    public Bitmap f40241s;
    public BitmapShader v;
    public Paint f40242w;
    public Matrix f40243x;
    public float f40244y;

    public sw0(Activity activity, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity, R.style.TransparentDialog);
        this.f40240r = i0.b.e;
        this.M = 0.0f;
        this.N = 0.0f;
        this.S = -1.0f;
        this.U = -1.0f;
        this.f40233c0 = false;
        this.f40228a = activity;
        this.f40230b = c6Var;
        nw0 nw0Var = new nw0(this, activity, 0);
        this.f40232c = nw0Var;
        nw0Var.setOnClickListener(new t60(this, 21));
        gh.b bVar = new gh.b();
        this.F = bVar;
        bh.b bVar2 = new bh.b(bVar);
        this.G = bVar2;
        bVar2.f2745f = new ih.j(nw0Var);
        bVar2.f2746g = nw0Var;
        nw0 nw0Var2 = new nw0(this, activity, 1);
        this.d = nw0Var2;
        nw0Var2.setClipToPadding(false);
        nw0Var.addView(nw0Var2, w7.a6.e(-1, -1, 119));
        di.h1 h1Var = new di.h1(this, activity, 5);
        this.f40236f = h1Var;
        h1Var.setAdapter(new ow0(this, activity, 0));
        nw0Var2.addView(h1Var, w7.a6.e(-1, -1, 119));
        nw0 nw0Var3 = new nw0(this, activity, 2);
        this.e = nw0Var3;
        nw0Var2.addView(nw0Var3, w7.a6.e(-1, -1, 119));
        org.telegram.ui.Components.tc0 tc0Var = new org.telegram.ui.Components.tc0(activity, c6Var);
        this.f40239n = tc0Var;
        tc0Var.a(0, LocaleController.getString(R.string.PollMenuTabOption));
        tc0Var.a(1, LocaleController.getString(R.string.PollMenuTabPoll));
        nw0Var2.addView(tc0Var, w7.a6.e(-1, 66, 80));
        tc0Var.setOnTabClick(new v3(h1Var, 17));
        dh.d c10 = bVar2.c(tc0Var, null, false);
        c10.o(fh.b.k(c6Var));
        c10.f6558j.e = true;
        c10.p(AndroidUtilities.dp(8.0f));
        c10.q(AndroidUtilities.dp(16.0f));
        tc0Var.setBackground(c10);
        TextView textView = new TextView(activity);
        this.h = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(tc0Var.getColor());
        org.telegram.messenger.yh.l(R.string.PollMenuHint, textView, 17);
        nw0Var2.addView(textView, w7.a6.a(-2.0f, 0.0f, 0.0f, 0.0f, 66.0f, -1, 80));
        pw0 pw0Var = new pw0(this, 0);
        WeakHashMap weakHashMap = r0.j0.f43732a;
        r0.b0.i(nw0Var, pw0Var);
    }

    public final void b(boolean z10, hw0 hw0Var) {
        float f7;
        long j10;
        ValueAnimator valueAnimator = this.f40237f0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f40238g0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f10 = this.f40244y;
        float f11 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f40237f0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final sw0 f37211b;

            {
                this.f37211b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        sw0 sw0Var = this.f37211b;
                        sw0Var.f40244y = floatValue;
                        sw0Var.f40232c.invalidate();
                        sw0Var.d.invalidate();
                        qw0 qw0Var = sw0Var.J;
                        if (qw0Var != null) {
                            qw0Var.invalidate();
                        }
                        sw0Var.e();
                        return;
                    default:
                        sw0 sw0Var2 = this.f37211b;
                        sw0Var2.getClass();
                        sw0Var2.E = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f40237f0.addListener(new ah.q0(this, z10, hw0Var, 10));
        if (!z10) {
            j10 = 330;
        } else {
            j10 = 520;
        }
        ValueAnimator valueAnimator3 = this.f40237f0;
        org.telegram.ui.Components.es esVar = org.telegram.ui.Components.es.h;
        valueAnimator3.setInterpolator(esVar);
        this.f40237f0.setDuration(j10);
        this.f40237f0.start();
        float f12 = this.E;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, f11);
        this.f40238g0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final sw0 f37211b;

            {
                this.f37211b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        sw0 sw0Var = this.f37211b;
                        sw0Var.f40244y = floatValue;
                        sw0Var.f40232c.invalidate();
                        sw0Var.d.invalidate();
                        qw0 qw0Var = sw0Var.J;
                        if (qw0Var != null) {
                            qw0Var.invalidate();
                        }
                        sw0Var.e();
                        return;
                    default:
                        sw0 sw0Var2 = this.f37211b;
                        sw0Var2.getClass();
                        sw0Var2.E = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f40238g0.addListener(new i50(5, this, z10));
        this.f40238g0.setDuration(((float) j10) * 1.5f);
        this.f40238g0.setInterpolator(esVar);
        this.f40238g0.start();
    }

    public final void c(boolean z10) {
        boolean z11;
        org.telegram.ui.Cells.u1 u1Var;
        org.telegram.ui.Components.gl0 gl0Var;
        if (z10 && (gl0Var = this.Q) != null && gl0Var.getReactionsWindow() != null && !this.Q.getReactionsWindow().f877q) {
            this.Q.e();
        } else if (this.f40233c0) {
        } else {
            this.f40233c0 = true;
            this.Y = false;
            di.h1 h1Var = this.f40236f;
            h1Var.l();
            if (h1Var.getCurrentPosition() == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 && z11) {
                org.telegram.ui.Cells.u1 u1Var2 = this.L;
                if (u1Var2 != null) {
                    u1Var2.setVisibility(4);
                    this.L.invalidate();
                }
            } else if (!z10 && (u1Var = this.L) != null) {
                u1Var.setVisibility(0);
                org.telegram.ui.Cells.u1 u1Var3 = this.L;
                u1Var3.L7 = null;
                u1Var3.invalidate();
            }
            this.f40234d0 = !z10;
            d();
            b(false, new hw0(this, z11));
            this.f40232c.invalidate();
        }
    }

    public final void d() {
        int i10;
        ViewGroup viewGroup;
        if (!this.Y) {
            nw0 nw0Var = this.f40232c;
            if (nw0Var.getWidth() > 0) {
                org.telegram.ui.Cells.u1 u1Var = this.L;
                if (u1Var != null) {
                    int[] iArr = new int[2];
                    u1Var.getLocationOnScreen(iArr);
                    int i11 = iArr[0];
                    i0.b bVar = this.f40240r;
                    this.W = i11 - bVar.f10888a;
                    float f7 = iArr[1] - bVar.f10889b;
                    this.X = f7;
                    if (!this.f40231b0) {
                        this.f40231b0 = true;
                        this.Z = f7;
                        if (this.T != null) {
                            float height = f7 + this.L.getHeight() + this.T.getHeight();
                            int height2 = nw0Var.getHeight();
                            i0.b bVar2 = this.f40240r;
                            if (height > ((height2 - bVar2.f10889b) - bVar2.d) - AndroidUtilities.dp(66.0f)) {
                                int height3 = nw0Var.getHeight();
                                i0.b bVar3 = this.f40240r;
                                this.Z = ((((height3 - bVar3.f10889b) - bVar3.d) - AndroidUtilities.dp(66.0f)) - this.L.getHeight()) - this.T.getHeight();
                            }
                        }
                        int I2 = this.J.I2(this.P);
                        this.J.H2(I2);
                        float G2 = this.J.G2(I2);
                        float f10 = this.X;
                        this.f40229a0 = f10;
                        float f11 = (int) G2;
                        int height4 = nw0Var.getHeight();
                        i0.b bVar4 = this.f40240r;
                        int dp = ((height4 - bVar4.f10889b) - bVar4.d) - AndroidUtilities.dp(78.0f);
                        TextView textView = this.h;
                        if (f10 + f11 > dp - textView.getHeight()) {
                            int height5 = nw0Var.getHeight();
                            i0.b bVar5 = this.f40240r;
                            this.f40229a0 = ((((height5 - bVar5.f10889b) - bVar5.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i10;
                        }
                        if (this.R != null) {
                            float height6 = this.f40229a0 + f11 + viewGroup.getHeight();
                            int height7 = nw0Var.getHeight();
                            i0.b bVar6 = this.f40240r;
                            if (height6 > (((height7 - bVar6.f10889b) - bVar6.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) {
                                int height8 = nw0Var.getHeight();
                                i0.b bVar7 = this.f40240r;
                                this.f40229a0 = (((((height8 - bVar7.f10889b) - bVar7.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i10) - this.R.getHeight();
                            }
                        }
                    }
                    e();
                } else {
                    this.X = 0.0f;
                    this.W = 0.0f;
                }
                this.Y = true;
            }
        }
    }

    @Override
    public final void dismiss() {
        c(true);
    }

    public final void e() {
        float f7;
        float f10;
        float f11;
        float f12;
        int i10;
        di.h1 h1Var = this.f40236f;
        float positionAnimated = h1Var.getPositionAnimated();
        int i11 = 0;
        float lerp = AndroidUtilities.lerp(0, -h1Var.getWidth(), positionAnimated);
        float lerp2 = AndroidUtilities.lerp(h1Var.getWidth(), 0, positionAnimated);
        if (this.Y) {
            ViewGroup viewGroup = this.T;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                float f13 = this.X;
                this.Z = f13;
                float height = f13 + this.L.getHeight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                nw0 nw0Var = this.f40232c;
                int height2 = nw0Var.getHeight();
                i0.b bVar = this.f40240r;
                if (height > ((height2 - bVar.f10889b) - bVar.d) - AndroidUtilities.dp(66.0f)) {
                    int height3 = nw0Var.getHeight();
                    i0.b bVar2 = this.f40240r;
                    this.Z = ((((height3 - bVar2.f10889b) - bVar2.d) - AndroidUtilities.dp(66.0f)) - this.L.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        rw0 rw0Var = this.K;
        float f14 = this.W;
        if (this.f40234d0) {
            f7 = 1.0f;
        } else {
            f7 = this.f40244y;
        }
        rw0Var.setTranslationX(AndroidUtilities.lerp(f14, 0.0f, f7) + lerp2);
        rw0 rw0Var2 = this.K;
        float f15 = this.X;
        float f16 = this.Z;
        if (this.f40234d0) {
            f10 = 1.0f;
        } else {
            f10 = this.f40244y;
        }
        rw0Var2.setTranslationY(AndroidUtilities.lerp(f15, f16, f10));
        ViewGroup viewGroup2 = this.T;
        nw0 nw0Var2 = this.e;
        if (viewGroup2 != null) {
            if (this.I) {
                viewGroup2.setTranslationX(((this.K.getPollButtonsLeft() + ((lerp2 + 0.0f) + this.K.getLeft())) - AndroidUtilities.dp(8.0f)) - this.T.getLeft());
            } else {
                float f17 = lerp2 + 0.0f;
                if (this.K.z3()) {
                    i10 = AndroidUtilities.dp(48.0f);
                } else {
                    i10 = 0;
                }
                viewGroup2.setTranslationX(((f17 + i10) + this.K.getLeft()) - this.T.getLeft());
            }
            this.U = nw0Var2.getMeasuredWidth() - (this.T.getX() - lerp2);
            this.T.setTranslationY(((this.K.getY() + this.K.getHeight()) - this.T.getTop()) - nw0Var2.getTop());
            this.T.setAlpha(this.f40244y);
            float lerp3 = AndroidUtilities.lerp(0.75f, 1.0f, this.f40244y);
            this.T.setScaleX(lerp3);
            this.T.setScaleY(lerp3);
        }
        qw0 qw0Var = this.J;
        float f18 = this.W;
        if (this.f40234d0) {
            f11 = 1.0f;
        } else {
            f11 = this.f40244y;
        }
        qw0Var.setTranslationX(AndroidUtilities.lerp(f18, 0.0f, f11) + lerp);
        qw0 qw0Var2 = this.J;
        float f19 = this.X;
        float f20 = this.f40229a0;
        if (this.f40234d0) {
            f12 = 1.0f;
        } else {
            f12 = this.f40244y;
        }
        qw0Var2.setTranslationY(AndroidUtilities.lerp(f19, f20, f12));
        if (this.R != null) {
            int I2 = this.J.I2(this.P);
            this.J.H2(I2);
            float G2 = this.J.G2(I2);
            if (this.I) {
                this.R.setTranslationX(((this.J.getPollButtonsLeft() + ((lerp + 0.0f) + this.J.getLeft())) - AndroidUtilities.dp(8.0f)) - this.R.getLeft());
            } else {
                ViewGroup viewGroup3 = this.R;
                float f21 = lerp + 0.0f;
                if (this.J.z3()) {
                    i11 = AndroidUtilities.dp(48.0f);
                }
                viewGroup3.setTranslationX(((f21 + i11) + this.J.getLeft()) - this.R.getLeft());
            }
            this.S = nw0Var2.getMeasuredWidth() - (this.R.getX() - lerp2);
            this.R.setTranslationY(((this.J.getY() + ((int) G2)) - this.R.getTop()) - nw0Var2.getTop());
            this.R.setAlpha(this.f40244y);
            float lerp4 = AndroidUtilities.lerp(0.75f, 1.0f, this.f40244y);
            this.R.setScaleX(lerp4);
            this.R.setScaleY(lerp4);
        }
        if (this.f40234d0) {
            this.K.setAlpha(this.f40244y);
            this.J.setAlpha(this.f40244y);
        }
        if (this.Q != null) {
            float max = lerp2 + Math.max(0.0f, ((this.K.getBoundsLeft() + this.K.getBoundsRight()) / 2.0f) - (this.Q.getWidth() * 0.8f));
            this.Q.setTranslationX(max);
            this.Q.setTranslationY(Math.max(0.0f, ((this.K.getY() - this.Q.getHeight()) + AndroidUtilities.dp(22.0f)) - nw0Var2.getTop()));
            this.Q.setAlpha(this.f40244y);
            View windowView = this.Q.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.f40244y);
            }
        }
        TextView textView = this.h;
        textView.setTranslationX(lerp);
        textView.setAlpha(this.f40244y);
        org.telegram.ui.Components.tc0 tc0Var = this.f40239n;
        tc0Var.setSelectedTab(positionAnimated);
        tc0Var.setAlpha(this.f40244y);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        nw0 nw0Var = this.f40232c;
        setContentView(nw0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 48;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        AndroidUtilities.applyEdgeToEdgeLayoutParams(attributes);
        window.setAttributes(attributes);
        nw0Var.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(nw0Var, !org.telegram.ui.ActionBar.g6.I.q());
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        super.show();
        org.telegram.ui.Components.cn0.d(new f5(this, 15));
        this.O = true;
        b(true, null);
    }
}
