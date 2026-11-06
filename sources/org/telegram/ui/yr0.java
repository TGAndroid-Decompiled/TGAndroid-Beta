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
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class yr0 extends Dialog {
    public float D;
    public float E;
    public final ri.b F;
    public final dh.c G;
    public org.telegram.messenger.ij H;
    public boolean I;
    public wr0 J;
    public xr0 K;
    public org.telegram.ui.Cells.q1 L;
    public float M;
    public float N;
    public boolean O;
    public byte[] P;
    public org.telegram.ui.Components.ii0 Q;
    public ViewGroup R;
    public float S;
    public ViewGroup T;
    public float U;
    public boolean V;
    public float W;
    public float X;
    public boolean Y;
    public float Z;
    public final Context f52297a;
    public float f52298a0;
    public final org.telegram.ui.ActionBar.f6 f52299b;
    public boolean f52300b0;
    public final ur0 f52301c;
    public boolean f52302c0;
    public final ur0 d;
    public boolean f52303d0;
    public final ur0 f52304e;
    public tl f52305e0;
    public final fi.g1 f52306f;
    public ValueAnimator f52307f0;
    public ValueAnimator f52308g0;
    public final TextView h;
    public final org.telegram.ui.Components.ga0 f52309n;
    public i0.b f52310r;
    public Bitmap f52311s;
    public BitmapShader f52312w;
    public Paint f52313x;
    public Matrix f52314y;

    public yr0(Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, 2131755352);
        this.f52310r = i0.b.f15116e;
        this.M = 0.0f;
        this.N = 0.0f;
        this.S = -1.0f;
        this.U = -1.0f;
        this.f52302c0 = false;
        this.f52297a = activity;
        this.f52299b = f6Var;
        ur0 ur0Var = new ur0(this, activity, 0);
        this.f52301c = ur0Var;
        ur0Var.setOnClickListener(new g40(this, 23));
        ri.b bVar = new ri.b();
        this.F = bVar;
        dh.c cVar = new dh.c(bVar, bVar, bVar);
        this.G = cVar;
        cVar.h = new jh.k(ur0Var);
        cVar.f8708i = ur0Var;
        ur0 ur0Var2 = new ur0(this, activity, 1);
        this.d = ur0Var2;
        ur0Var2.setClipToPadding(false);
        ur0Var.addView(ur0Var2, c8.ha.e(-1, -1, 119));
        fi.g1 g1Var = new fi.g1(5, activity, this);
        this.f52306f = g1Var;
        g1Var.setAdapter(new bi.g5(4, activity, this));
        ur0Var2.addView(g1Var, c8.ha.e(-1, -1, 119));
        ur0 ur0Var3 = new ur0(this, activity, 2);
        this.f52304e = ur0Var3;
        ur0Var2.addView(ur0Var3, c8.ha.e(-1, -1, 119));
        org.telegram.ui.Components.ga0 ga0Var = new org.telegram.ui.Components.ga0(activity, f6Var);
        this.f52309n = ga0Var;
        ga0Var.a(0, org.telegram.messenger.hd.M0(2131747167, null));
        ga0Var.a(1, org.telegram.messenger.hd.M0(2131747166, null));
        ur0Var2.addView(ga0Var, c8.ha.e(-1, 66, 80));
        ga0Var.setOnTabClick(new r3(g1Var, 19));
        fh.g c10 = cVar.c(ga0Var, null, false);
        c10.p(c8.g0.k(f6Var));
        c10.Q.f11508e = true;
        c10.q(org.telegram.messenger.g0.L(8.0f));
        c10.r(org.telegram.messenger.g0.L(16.0f));
        ga0Var.setBackground(c10);
        TextView textView = new TextView(activity);
        this.h = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(ga0Var.getColor());
        textView.setText(org.telegram.messenger.hd.M0(2131747168, null));
        textView.setGravity(17);
        ur0Var2.addView(textView, c8.ha.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        vr0 vr0Var = new vr0(this, 0);
        WeakHashMap weakHashMap = r0.i0.f54073a;
        r0.a0.i(ur0Var, vr0Var);
    }

    public final void b(boolean z9, pr0 pr0Var) {
        float f10;
        long j3;
        ValueAnimator valueAnimator = this.f52307f0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f52308g0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f11 = this.D;
        float f12 = 0.0f;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f52307f0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final yr0 f49282b;

            {
                this.f49282b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        yr0 yr0Var = this.f49282b;
                        yr0Var.D = floatValue;
                        yr0Var.f52301c.invalidate();
                        yr0Var.d.invalidate();
                        wr0 wr0Var = yr0Var.J;
                        if (wr0Var != null) {
                            wr0Var.invalidate();
                        }
                        yr0Var.e();
                        return;
                    default:
                        yr0 yr0Var2 = this.f49282b;
                        yr0Var2.getClass();
                        yr0Var2.E = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f52307f0.addListener(new ai.g0(this, z9, pr0Var, 12));
        if (!z9) {
            j3 = 330;
        } else {
            j3 = 520;
        }
        ValueAnimator valueAnimator3 = this.f52307f0;
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        valueAnimator3.setInterpolator(xqVar);
        this.f52307f0.setDuration(j3);
        this.f52307f0.start();
        float f13 = this.E;
        if (z9) {
            f12 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f13, f12);
        this.f52308g0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final yr0 f49282b;

            {
                this.f49282b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        yr0 yr0Var = this.f49282b;
                        yr0Var.D = floatValue;
                        yr0Var.f52301c.invalidate();
                        yr0Var.d.invalidate();
                        wr0 wr0Var = yr0Var.J;
                        if (wr0Var != null) {
                            wr0Var.invalidate();
                        }
                        yr0Var.e();
                        return;
                    default:
                        yr0 yr0Var2 = this.f49282b;
                        yr0Var2.getClass();
                        yr0Var2.E = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f52308g0.addListener(new z40(4, this, z9));
        this.f52308g0.setDuration(((float) j3) * 1.5f);
        this.f52308g0.setInterpolator(xqVar);
        this.f52308g0.start();
    }

    public final void c(boolean z9) {
        boolean z10;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.ui.Components.ii0 ii0Var;
        if (z9 && (ii0Var = this.Q) != null && ii0Var.getReactionsWindow() != null && !this.Q.getReactionsWindow().f6197q) {
            this.Q.e();
        } else if (this.f52302c0) {
        } else {
            this.f52302c0 = true;
            this.Y = false;
            fi.g1 g1Var = this.f52306f;
            g1Var.l();
            if (g1Var.getCurrentPosition() == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z9 && z10) {
                org.telegram.ui.Cells.q1 q1Var2 = this.L;
                if (q1Var2 != null) {
                    q1Var2.setVisibility(4);
                    this.L.invalidate();
                }
            } else if (!z9 && (q1Var = this.L) != null) {
                q1Var.setVisibility(0);
                org.telegram.ui.Cells.q1 q1Var3 = this.L;
                q1Var3.f29798c6 = null;
                q1Var3.invalidate();
            }
            this.f52303d0 = !z9;
            d();
            b(false, new pr0(this, z10));
            this.f52301c.invalidate();
        }
    }

    public final void d() {
        int i7;
        ViewGroup viewGroup;
        if (!this.Y) {
            ur0 ur0Var = this.f52301c;
            if (ur0Var.getWidth() > 0) {
                org.telegram.ui.Cells.q1 q1Var = this.L;
                if (q1Var != null) {
                    int[] iArr = new int[2];
                    q1Var.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    i0.b bVar = this.f52310r;
                    this.W = i10 - bVar.f15117a;
                    float f10 = iArr[1] - bVar.f15118b;
                    this.X = f10;
                    if (!this.f52300b0) {
                        this.f52300b0 = true;
                        this.Z = f10;
                        if (this.T != null) {
                            float height = f10 + this.L.getHeight() + this.T.getHeight();
                            int height2 = ur0Var.getHeight();
                            i0.b bVar2 = this.f52310r;
                            if (height > ((height2 - bVar2.f15118b) - bVar2.d) - org.telegram.messenger.g0.L(66.0f)) {
                                int height3 = ur0Var.getHeight();
                                i0.b bVar3 = this.f52310r;
                                this.Z = ((((height3 - bVar3.f15118b) - bVar3.d) - org.telegram.messenger.g0.L(66.0f)) - this.L.getHeight()) - this.T.getHeight();
                            }
                        }
                        int V1 = this.J.V1(this.P);
                        this.J.U1(V1);
                        float T1 = this.J.T1(V1);
                        float f11 = this.X;
                        this.f52298a0 = f11;
                        float f12 = (int) T1;
                        int height4 = ur0Var.getHeight();
                        i0.b bVar4 = this.f52310r;
                        int L = ((height4 - bVar4.f15118b) - bVar4.d) - org.telegram.messenger.g0.L(78.0f);
                        TextView textView = this.h;
                        if (f11 + f12 > L - textView.getHeight()) {
                            int height5 = ur0Var.getHeight();
                            i0.b bVar5 = this.f52310r;
                            this.f52298a0 = ((((height5 - bVar5.f15118b) - bVar5.d) - org.telegram.messenger.g0.L(78.0f)) - textView.getHeight()) - i7;
                        }
                        if (this.R != null) {
                            float height6 = this.f52298a0 + f12 + viewGroup.getHeight();
                            int height7 = ur0Var.getHeight();
                            i0.b bVar6 = this.f52310r;
                            if (height6 > (((height7 - bVar6.f15118b) - bVar6.d) - org.telegram.messenger.g0.L(78.0f)) - textView.getHeight()) {
                                int height8 = ur0Var.getHeight();
                                i0.b bVar7 = this.f52310r;
                                this.f52298a0 = (((((height8 - bVar7.f15118b) - bVar7.d) - org.telegram.messenger.g0.L(78.0f)) - textView.getHeight()) - i7) - this.R.getHeight();
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
        float f10;
        float f11;
        float f12;
        float f13;
        int i7;
        fi.g1 g1Var = this.f52306f;
        float positionAnimated = g1Var.getPositionAnimated();
        int i10 = 0;
        float W1 = org.telegram.messenger.g0.W1(positionAnimated, 0, -g1Var.getWidth());
        float W12 = org.telegram.messenger.g0.W1(positionAnimated, g1Var.getWidth(), 0);
        if (this.Y) {
            ViewGroup viewGroup = this.T;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                float f14 = this.X;
                this.Z = f14;
                float height = f14 + this.L.getHeight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                ur0 ur0Var = this.f52301c;
                int height2 = ur0Var.getHeight();
                i0.b bVar = this.f52310r;
                if (height > ((height2 - bVar.f15118b) - bVar.d) - org.telegram.messenger.g0.L(66.0f)) {
                    int height3 = ur0Var.getHeight();
                    i0.b bVar2 = this.f52310r;
                    this.Z = ((((height3 - bVar2.f15118b) - bVar2.d) - org.telegram.messenger.g0.L(66.0f)) - this.L.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        xr0 xr0Var = this.K;
        float f15 = this.W;
        if (this.f52303d0) {
            f10 = 1.0f;
        } else {
            f10 = this.D;
        }
        xr0Var.setTranslationX(org.telegram.messenger.g0.T1(f15, 0.0f, f10) + W12);
        xr0 xr0Var2 = this.K;
        float f16 = this.X;
        float f17 = this.Z;
        if (this.f52303d0) {
            f11 = 1.0f;
        } else {
            f11 = this.D;
        }
        xr0Var2.setTranslationY(org.telegram.messenger.g0.T1(f16, f17, f11));
        ViewGroup viewGroup2 = this.T;
        ur0 ur0Var2 = this.f52304e;
        if (viewGroup2 != null) {
            if (this.I) {
                viewGroup2.setTranslationX(((this.K.getPollButtonsLeft() + ((W12 + 0.0f) + this.K.getLeft())) - org.telegram.messenger.g0.L(8.0f)) - this.T.getLeft());
            } else {
                float f18 = W12 + 0.0f;
                if (this.K.Y2()) {
                    i7 = org.telegram.messenger.g0.L(48.0f);
                } else {
                    i7 = 0;
                }
                viewGroup2.setTranslationX(((f18 + i7) + this.K.getLeft()) - this.T.getLeft());
            }
            this.U = ur0Var2.getMeasuredWidth() - (this.T.getX() - W12);
            this.T.setTranslationY(((this.K.getY() + this.K.getHeight()) - this.T.getTop()) - ur0Var2.getTop());
            this.T.setAlpha(this.D);
            float T1 = org.telegram.messenger.g0.T1(0.75f, 1.0f, this.D);
            this.T.setScaleX(T1);
            this.T.setScaleY(T1);
        }
        wr0 wr0Var = this.J;
        float f19 = this.W;
        if (this.f52303d0) {
            f12 = 1.0f;
        } else {
            f12 = this.D;
        }
        wr0Var.setTranslationX(org.telegram.messenger.g0.T1(f19, 0.0f, f12) + W1);
        wr0 wr0Var2 = this.J;
        float f20 = this.X;
        float f21 = this.f52298a0;
        if (this.f52303d0) {
            f13 = 1.0f;
        } else {
            f13 = this.D;
        }
        wr0Var2.setTranslationY(org.telegram.messenger.g0.T1(f20, f21, f13));
        if (this.R != null) {
            int V1 = this.J.V1(this.P);
            this.J.U1(V1);
            float T12 = this.J.T1(V1);
            if (this.I) {
                this.R.setTranslationX(((this.J.getPollButtonsLeft() + ((W1 + 0.0f) + this.J.getLeft())) - org.telegram.messenger.g0.L(8.0f)) - this.R.getLeft());
            } else {
                ViewGroup viewGroup3 = this.R;
                float f22 = W1 + 0.0f;
                if (this.J.Y2()) {
                    i10 = org.telegram.messenger.g0.L(48.0f);
                }
                viewGroup3.setTranslationX(((f22 + i10) + this.J.getLeft()) - this.R.getLeft());
            }
            this.S = ur0Var2.getMeasuredWidth() - (this.R.getX() - W12);
            this.R.setTranslationY(((this.J.getY() + ((int) T12)) - this.R.getTop()) - ur0Var2.getTop());
            this.R.setAlpha(this.D);
            float T13 = org.telegram.messenger.g0.T1(0.75f, 1.0f, this.D);
            this.R.setScaleX(T13);
            this.R.setScaleY(T13);
        }
        if (this.f52303d0) {
            this.K.setAlpha(this.D);
            this.J.setAlpha(this.D);
        }
        if (this.Q != null) {
            float max = W12 + Math.max(0.0f, ((this.K.getBoundsLeft() + this.K.getBoundsRight()) / 2.0f) - (this.Q.getWidth() * 0.8f));
            this.Q.setTranslationX(max);
            this.Q.setTranslationY(Math.max(0.0f, ((this.K.getY() - this.Q.getHeight()) + org.telegram.messenger.g0.L(22.0f)) - ur0Var2.getTop()));
            this.Q.setAlpha(this.D);
            View windowView = this.Q.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.D);
            }
        }
        TextView textView = this.h;
        textView.setTranslationX(W1);
        textView.setAlpha(this.D);
        org.telegram.ui.Components.ga0 ga0Var = this.f52309n;
        ga0Var.setSelectedTab(positionAnimated);
        ga0Var.setAlpha(this.D);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(2131755178);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ur0 ur0Var = this.f52301c;
        setContentView(ur0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 48;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        org.telegram.messenger.g0.m(attributes);
        window.setAttributes(attributes);
        ur0Var.setSystemUiVisibility(1284);
        org.telegram.messenger.g0.o3(ur0Var, !org.telegram.ui.ActionBar.k6.I.q());
    }

    @Override
    public final void show() {
        if (!org.telegram.messenger.g0.M1(getContext())) {
            return;
        }
        super.show();
        org.telegram.ui.Components.jk0.d(new a5(this, 16));
        this.O = true;
        b(true, null);
    }
}
