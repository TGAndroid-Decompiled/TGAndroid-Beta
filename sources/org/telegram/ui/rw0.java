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
public final class rw0 extends Dialog {
    public float E;
    public final gh.b F;
    public final bh.b G;
    public MessageObject H;
    public boolean I;
    public pw0 J;
    public qw0 K;
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
    public final Context f39598a;
    public float f39599a0;
    public final org.telegram.ui.ActionBar.c6 f39600b;
    public boolean f39601b0;
    public final mw0 f39602c;
    public boolean f39603c0;
    public final mw0 d;
    public boolean f39604d0;
    public final mw0 e;
    public bn f39605e0;
    public final di.h1 f39606f;
    public ValueAnimator f39607f0;
    public ValueAnimator f39608g0;
    public final TextView h;
    public final org.telegram.ui.Components.tc0 f39609n;
    public i0.b f39610r;
    public Bitmap f39611s;
    public BitmapShader v;
    public Paint f39612w;
    public Matrix f39613x;
    public float f39614y;

    public rw0(Activity activity, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity, R.style.TransparentDialog);
        this.f39610r = i0.b.e;
        this.M = 0.0f;
        this.N = 0.0f;
        this.S = -1.0f;
        this.U = -1.0f;
        this.f39603c0 = false;
        this.f39598a = activity;
        this.f39600b = c6Var;
        mw0 mw0Var = new mw0(this, activity, 0);
        this.f39602c = mw0Var;
        mw0Var.setOnClickListener(new t60(this, 21));
        gh.b bVar = new gh.b();
        this.F = bVar;
        bh.b bVar2 = new bh.b(bVar);
        this.G = bVar2;
        bVar2.f2749f = new ih.j(mw0Var);
        bVar2.f2750g = mw0Var;
        mw0 mw0Var2 = new mw0(this, activity, 1);
        this.d = mw0Var2;
        mw0Var2.setClipToPadding(false);
        mw0Var.addView(mw0Var2, w7.z5.e(-1, -1, 119));
        di.h1 h1Var = new di.h1(this, activity, 5);
        this.f39606f = h1Var;
        h1Var.setAdapter(new nw0(this, activity, 0));
        mw0Var2.addView(h1Var, w7.z5.e(-1, -1, 119));
        mw0 mw0Var3 = new mw0(this, activity, 2);
        this.e = mw0Var3;
        mw0Var2.addView(mw0Var3, w7.z5.e(-1, -1, 119));
        org.telegram.ui.Components.tc0 tc0Var = new org.telegram.ui.Components.tc0(activity, c6Var);
        this.f39609n = tc0Var;
        tc0Var.a(0, LocaleController.getString(R.string.PollMenuTabOption));
        tc0Var.a(1, LocaleController.getString(R.string.PollMenuTabPoll));
        mw0Var2.addView(tc0Var, w7.z5.e(-1, 66, 80));
        tc0Var.setOnTabClick(new v3(h1Var, 17));
        dh.d c10 = bVar2.c(tc0Var, null, false);
        c10.o(fh.b.k(c6Var));
        c10.f6561j.e = true;
        c10.p(AndroidUtilities.dp(8.0f));
        c10.q(AndroidUtilities.dp(16.0f));
        tc0Var.setBackground(c10);
        TextView textView = new TextView(activity);
        this.h = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(tc0Var.getColor());
        org.telegram.messenger.sk.m(R.string.PollMenuHint, textView, 17);
        mw0Var2.addView(textView, w7.z5.a(-2.0f, 0.0f, 0.0f, 0.0f, 66.0f, -1, 80));
        ow0 ow0Var = new ow0(this, 0);
        WeakHashMap weakHashMap = r0.i0.f43485a;
        r0.a0.i(mw0Var, ow0Var);
    }

    public final void b(boolean z10, gw0 gw0Var) {
        float f7;
        long j10;
        ValueAnimator valueAnimator = this.f39607f0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f39608g0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f10 = this.f39614y;
        float f11 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f39607f0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final rw0 f36662b;

            {
                this.f36662b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        rw0 rw0Var = this.f36662b;
                        rw0Var.f39614y = floatValue;
                        rw0Var.f39602c.invalidate();
                        rw0Var.d.invalidate();
                        pw0 pw0Var = rw0Var.J;
                        if (pw0Var != null) {
                            pw0Var.invalidate();
                        }
                        rw0Var.e();
                        return;
                    default:
                        rw0 rw0Var2 = this.f36662b;
                        rw0Var2.getClass();
                        rw0Var2.E = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f39607f0.addListener(new ah.q0(this, z10, gw0Var, 10));
        if (!z10) {
            j10 = 330;
        } else {
            j10 = 520;
        }
        ValueAnimator valueAnimator3 = this.f39607f0;
        org.telegram.ui.Components.es esVar = org.telegram.ui.Components.es.h;
        valueAnimator3.setInterpolator(esVar);
        this.f39607f0.setDuration(j10);
        this.f39607f0.start();
        float f12 = this.E;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, f11);
        this.f39608g0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final rw0 f36662b;

            {
                this.f36662b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        rw0 rw0Var = this.f36662b;
                        rw0Var.f39614y = floatValue;
                        rw0Var.f39602c.invalidate();
                        rw0Var.d.invalidate();
                        pw0 pw0Var = rw0Var.J;
                        if (pw0Var != null) {
                            pw0Var.invalidate();
                        }
                        rw0Var.e();
                        return;
                    default:
                        rw0 rw0Var2 = this.f36662b;
                        rw0Var2.getClass();
                        rw0Var2.E = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f39608g0.addListener(new i50(5, this, z10));
        this.f39608g0.setDuration(((float) j10) * 1.5f);
        this.f39608g0.setInterpolator(esVar);
        this.f39608g0.start();
    }

    public final void c(boolean z10) {
        boolean z11;
        org.telegram.ui.Cells.u1 u1Var;
        org.telegram.ui.Components.gl0 gl0Var;
        if (z10 && (gl0Var = this.Q) != null && gl0Var.getReactionsWindow() != null && !this.Q.getReactionsWindow().f881q) {
            this.Q.e();
        } else if (this.f39603c0) {
        } else {
            this.f39603c0 = true;
            this.Y = false;
            di.h1 h1Var = this.f39606f;
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
            this.f39604d0 = !z10;
            d();
            b(false, new gw0(this, z11));
            this.f39602c.invalidate();
        }
    }

    public final void d() {
        int i10;
        ViewGroup viewGroup;
        if (!this.Y) {
            mw0 mw0Var = this.f39602c;
            if (mw0Var.getWidth() > 0) {
                org.telegram.ui.Cells.u1 u1Var = this.L;
                if (u1Var != null) {
                    int[] iArr = new int[2];
                    u1Var.getLocationOnScreen(iArr);
                    int i11 = iArr[0];
                    i0.b bVar = this.f39610r;
                    this.W = i11 - bVar.f10892a;
                    float f7 = iArr[1] - bVar.f10893b;
                    this.X = f7;
                    if (!this.f39601b0) {
                        this.f39601b0 = true;
                        this.Z = f7;
                        if (this.T != null) {
                            float height = f7 + this.L.getHeight() + this.T.getHeight();
                            int height2 = mw0Var.getHeight();
                            i0.b bVar2 = this.f39610r;
                            if (height > ((height2 - bVar2.f10893b) - bVar2.d) - AndroidUtilities.dp(66.0f)) {
                                int height3 = mw0Var.getHeight();
                                i0.b bVar3 = this.f39610r;
                                this.Z = ((((height3 - bVar3.f10893b) - bVar3.d) - AndroidUtilities.dp(66.0f)) - this.L.getHeight()) - this.T.getHeight();
                            }
                        }
                        int I2 = this.J.I2(this.P);
                        this.J.H2(I2);
                        float G2 = this.J.G2(I2);
                        float f10 = this.X;
                        this.f39599a0 = f10;
                        float f11 = (int) G2;
                        int height4 = mw0Var.getHeight();
                        i0.b bVar4 = this.f39610r;
                        int dp = ((height4 - bVar4.f10893b) - bVar4.d) - AndroidUtilities.dp(78.0f);
                        TextView textView = this.h;
                        if (f10 + f11 > dp - textView.getHeight()) {
                            int height5 = mw0Var.getHeight();
                            i0.b bVar5 = this.f39610r;
                            this.f39599a0 = ((((height5 - bVar5.f10893b) - bVar5.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i10;
                        }
                        if (this.R != null) {
                            float height6 = this.f39599a0 + f11 + viewGroup.getHeight();
                            int height7 = mw0Var.getHeight();
                            i0.b bVar6 = this.f39610r;
                            if (height6 > (((height7 - bVar6.f10893b) - bVar6.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) {
                                int height8 = mw0Var.getHeight();
                                i0.b bVar7 = this.f39610r;
                                this.f39599a0 = (((((height8 - bVar7.f10893b) - bVar7.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i10) - this.R.getHeight();
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
        di.h1 h1Var = this.f39606f;
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
                mw0 mw0Var = this.f39602c;
                int height2 = mw0Var.getHeight();
                i0.b bVar = this.f39610r;
                if (height > ((height2 - bVar.f10893b) - bVar.d) - AndroidUtilities.dp(66.0f)) {
                    int height3 = mw0Var.getHeight();
                    i0.b bVar2 = this.f39610r;
                    this.Z = ((((height3 - bVar2.f10893b) - bVar2.d) - AndroidUtilities.dp(66.0f)) - this.L.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        qw0 qw0Var = this.K;
        float f14 = this.W;
        if (this.f39604d0) {
            f7 = 1.0f;
        } else {
            f7 = this.f39614y;
        }
        qw0Var.setTranslationX(AndroidUtilities.lerp(f14, 0.0f, f7) + lerp2);
        qw0 qw0Var2 = this.K;
        float f15 = this.X;
        float f16 = this.Z;
        if (this.f39604d0) {
            f10 = 1.0f;
        } else {
            f10 = this.f39614y;
        }
        qw0Var2.setTranslationY(AndroidUtilities.lerp(f15, f16, f10));
        ViewGroup viewGroup2 = this.T;
        mw0 mw0Var2 = this.e;
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
            this.U = mw0Var2.getMeasuredWidth() - (this.T.getX() - lerp2);
            this.T.setTranslationY(((this.K.getY() + this.K.getHeight()) - this.T.getTop()) - mw0Var2.getTop());
            this.T.setAlpha(this.f39614y);
            float lerp3 = AndroidUtilities.lerp(0.75f, 1.0f, this.f39614y);
            this.T.setScaleX(lerp3);
            this.T.setScaleY(lerp3);
        }
        pw0 pw0Var = this.J;
        float f18 = this.W;
        if (this.f39604d0) {
            f11 = 1.0f;
        } else {
            f11 = this.f39614y;
        }
        pw0Var.setTranslationX(AndroidUtilities.lerp(f18, 0.0f, f11) + lerp);
        pw0 pw0Var2 = this.J;
        float f19 = this.X;
        float f20 = this.f39599a0;
        if (this.f39604d0) {
            f12 = 1.0f;
        } else {
            f12 = this.f39614y;
        }
        pw0Var2.setTranslationY(AndroidUtilities.lerp(f19, f20, f12));
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
            this.S = mw0Var2.getMeasuredWidth() - (this.R.getX() - lerp2);
            this.R.setTranslationY(((this.J.getY() + ((int) G2)) - this.R.getTop()) - mw0Var2.getTop());
            this.R.setAlpha(this.f39614y);
            float lerp4 = AndroidUtilities.lerp(0.75f, 1.0f, this.f39614y);
            this.R.setScaleX(lerp4);
            this.R.setScaleY(lerp4);
        }
        if (this.f39604d0) {
            this.K.setAlpha(this.f39614y);
            this.J.setAlpha(this.f39614y);
        }
        if (this.Q != null) {
            float max = lerp2 + Math.max(0.0f, ((this.K.getBoundsLeft() + this.K.getBoundsRight()) / 2.0f) - (this.Q.getWidth() * 0.8f));
            this.Q.setTranslationX(max);
            this.Q.setTranslationY(Math.max(0.0f, ((this.K.getY() - this.Q.getHeight()) + AndroidUtilities.dp(22.0f)) - mw0Var2.getTop()));
            this.Q.setAlpha(this.f39614y);
            View windowView = this.Q.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.f39614y);
            }
        }
        TextView textView = this.h;
        textView.setTranslationX(lerp);
        textView.setAlpha(this.f39614y);
        org.telegram.ui.Components.tc0 tc0Var = this.f39609n;
        tc0Var.setSelectedTab(positionAnimated);
        tc0Var.setAlpha(this.f39614y);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        mw0 mw0Var = this.f39602c;
        setContentView(mw0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 48;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        AndroidUtilities.applyEdgeToEdgeLayoutParams(attributes);
        window.setAttributes(attributes);
        mw0Var.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(mw0Var, !org.telegram.ui.ActionBar.g6.I.q());
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
