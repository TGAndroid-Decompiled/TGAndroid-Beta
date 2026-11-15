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
public final class xr0 extends Dialog {
    public float E;
    public float F;
    public final ui.b G;
    public final dh.c H;
    public org.telegram.messenger.gj I;
    public boolean J;
    public vr0 K;
    public wr0 L;
    public org.telegram.ui.Cells.q1 M;
    public float N;
    public float O;
    public boolean P;
    public byte[] Q;
    public org.telegram.ui.Components.mi0 R;
    public ViewGroup S;
    public float T;
    public ViewGroup U;
    public float V;
    public boolean W;
    public float X;
    public float Y;
    public boolean Z;
    public final Context f53288a;
    public float f53289a0;
    public final org.telegram.ui.ActionBar.e6 f53290b;
    public float f53291b0;
    public final tr0 f53292c;
    public boolean f53293c0;
    public final tr0 d;
    public boolean f53294d0;
    public final tr0 f53295e;
    public boolean f53296e0;
    public final hi.i1 f53297f;
    public tl f53298f0;
    public ValueAnimator f53299g0;
    public final TextView h;
    public ValueAnimator f53300h0;
    public final org.telegram.ui.Components.ha0 f53301n;
    public i0.c f53302r;
    public Bitmap f53303s;
    public BitmapShader f53304w;
    public Paint f53305x;
    public Matrix f53306y;

    public xr0(Activity activity, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity, 2131755352);
        this.f53302r = i0.c.f15573e;
        this.N = 0.0f;
        this.O = 0.0f;
        this.T = -1.0f;
        this.V = -1.0f;
        this.f53294d0 = false;
        this.f53288a = activity;
        this.f53290b = e6Var;
        tr0 tr0Var = new tr0(this, activity, 0);
        this.f53292c = tr0Var;
        tr0Var.setOnClickListener(new g40(this, 23));
        ui.b bVar = new ui.b();
        this.G = bVar;
        dh.c cVar = new dh.c(bVar, bVar, bVar);
        this.H = cVar;
        cVar.h = new jh.k(tr0Var);
        cVar.f8095i = tr0Var;
        tr0 tr0Var2 = new tr0(this, activity, 1);
        this.d = tr0Var2;
        tr0Var2.setClipToPadding(false);
        tr0Var.addView(tr0Var2, c8.ja.e(-1, -1, 119));
        hi.i1 i1Var = new hi.i1(5, activity, this);
        this.f53297f = i1Var;
        i1Var.setAdapter(new di.f4(4, activity, this));
        tr0Var2.addView(i1Var, c8.ja.e(-1, -1, 119));
        tr0 tr0Var3 = new tr0(this, activity, 2);
        this.f53295e = tr0Var3;
        tr0Var2.addView(tr0Var3, c8.ja.e(-1, -1, 119));
        org.telegram.ui.Components.ha0 ha0Var = new org.telegram.ui.Components.ha0(activity, e6Var);
        this.f53301n = ha0Var;
        ha0Var.a(0, org.telegram.messenger.hd.M0(2131747168, null));
        ha0Var.a(1, org.telegram.messenger.hd.M0(2131747167, null));
        tr0Var2.addView(ha0Var, c8.ja.e(-1, 66, 80));
        ha0Var.setOnTabClick(new r3(i1Var, 19));
        fh.g c10 = cVar.c(ha0Var, null, false);
        c10.p(c8.g0.k(e6Var));
        c10.R.f11322e = true;
        c10.q(org.telegram.messenger.g0.L(8.0f));
        c10.r(org.telegram.messenger.g0.L(16.0f));
        ha0Var.setBackground(c10);
        TextView textView = new TextView(activity);
        this.h = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(ha0Var.getColor());
        textView.setText(org.telegram.messenger.hd.M0(2131747169, null));
        textView.setGravity(17);
        tr0Var2.addView(textView, c8.ja.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        ur0 ur0Var = new ur0(this, 0);
        WeakHashMap weakHashMap = r0.i0.f55671a;
        r0.a0.i(tr0Var, ur0Var);
    }

    public final void b(boolean z10, or0 or0Var) {
        float f10;
        long j3;
        ValueAnimator valueAnimator = this.f53299g0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f53300h0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f11 = this.E;
        float f12 = 0.0f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f53299g0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final xr0 f50357b;

            {
                this.f50357b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        xr0 xr0Var = this.f50357b;
                        xr0Var.E = floatValue;
                        xr0Var.f53292c.invalidate();
                        xr0Var.d.invalidate();
                        vr0 vr0Var = xr0Var.K;
                        if (vr0Var != null) {
                            vr0Var.invalidate();
                        }
                        xr0Var.e();
                        return;
                    default:
                        xr0 xr0Var2 = this.f50357b;
                        xr0Var2.getClass();
                        xr0Var2.F = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f53299g0.addListener(new androidx.fragment.app.g(this, z10, or0Var, 12));
        if (!z10) {
            j3 = 330;
        } else {
            j3 = 520;
        }
        ValueAnimator valueAnimator3 = this.f53299g0;
        org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
        valueAnimator3.setInterpolator(erVar);
        this.f53299g0.setDuration(j3);
        this.f53299g0.start();
        float f13 = this.F;
        if (z10) {
            f12 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f13, f12);
        this.f53300h0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final xr0 f50357b;

            {
                this.f50357b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        xr0 xr0Var = this.f50357b;
                        xr0Var.E = floatValue;
                        xr0Var.f53292c.invalidate();
                        xr0Var.d.invalidate();
                        vr0 vr0Var = xr0Var.K;
                        if (vr0Var != null) {
                            vr0Var.invalidate();
                        }
                        xr0Var.e();
                        return;
                    default:
                        xr0 xr0Var2 = this.f50357b;
                        xr0Var2.getClass();
                        xr0Var2.F = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f53300h0.addListener(new z20(5, this, z10));
        this.f53300h0.setDuration(((float) j3) * 1.5f);
        this.f53300h0.setInterpolator(erVar);
        this.f53300h0.start();
    }

    public final void c(boolean z10) {
        boolean z11;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.ui.Components.mi0 mi0Var;
        if (z10 && (mi0Var = this.R) != null && mi0Var.getReactionsWindow() != null && !this.R.getReactionsWindow().f5022q) {
            this.R.e();
        } else if (this.f53294d0) {
        } else {
            this.f53294d0 = true;
            this.Z = false;
            hi.i1 i1Var = this.f53297f;
            i1Var.g();
            if (i1Var.getCurrentPosition() == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 && z11) {
                org.telegram.ui.Cells.q1 q1Var2 = this.M;
                if (q1Var2 != null) {
                    q1Var2.setVisibility(4);
                    this.M.invalidate();
                }
            } else if (!z10 && (q1Var = this.M) != null) {
                q1Var.setVisibility(0);
                org.telegram.ui.Cells.q1 q1Var3 = this.M;
                q1Var3.f30948d6 = null;
                q1Var3.invalidate();
            }
            this.f53296e0 = !z10;
            d();
            b(false, new or0(this, z11));
            this.f53292c.invalidate();
        }
    }

    public final void d() {
        int i7;
        ViewGroup viewGroup;
        if (!this.Z) {
            tr0 tr0Var = this.f53292c;
            if (tr0Var.getWidth() > 0) {
                org.telegram.ui.Cells.q1 q1Var = this.M;
                if (q1Var != null) {
                    int[] iArr = new int[2];
                    q1Var.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    i0.c cVar = this.f53302r;
                    this.X = i10 - cVar.f15574a;
                    float f10 = iArr[1] - cVar.f15575b;
                    this.Y = f10;
                    if (!this.f53293c0) {
                        this.f53293c0 = true;
                        this.f53289a0 = f10;
                        if (this.U != null) {
                            float height = f10 + this.M.getHeight() + this.U.getHeight();
                            int height2 = tr0Var.getHeight();
                            i0.c cVar2 = this.f53302r;
                            if (height > ((height2 - cVar2.f15575b) - cVar2.d) - org.telegram.messenger.g0.L(66.0f)) {
                                int height3 = tr0Var.getHeight();
                                i0.c cVar3 = this.f53302r;
                                this.f53289a0 = ((((height3 - cVar3.f15575b) - cVar3.d) - org.telegram.messenger.g0.L(66.0f)) - this.M.getHeight()) - this.U.getHeight();
                            }
                        }
                        int W1 = this.K.W1(this.Q);
                        this.K.V1(W1);
                        float U1 = this.K.U1(W1);
                        float f11 = this.Y;
                        this.f53291b0 = f11;
                        float f12 = (int) U1;
                        int height4 = tr0Var.getHeight();
                        i0.c cVar4 = this.f53302r;
                        int L = ((height4 - cVar4.f15575b) - cVar4.d) - org.telegram.messenger.g0.L(78.0f);
                        TextView textView = this.h;
                        if (f11 + f12 > L - textView.getHeight()) {
                            int height5 = tr0Var.getHeight();
                            i0.c cVar5 = this.f53302r;
                            this.f53291b0 = ((((height5 - cVar5.f15575b) - cVar5.d) - org.telegram.messenger.g0.L(78.0f)) - textView.getHeight()) - i7;
                        }
                        if (this.S != null) {
                            float height6 = this.f53291b0 + f12 + viewGroup.getHeight();
                            int height7 = tr0Var.getHeight();
                            i0.c cVar6 = this.f53302r;
                            if (height6 > (((height7 - cVar6.f15575b) - cVar6.d) - org.telegram.messenger.g0.L(78.0f)) - textView.getHeight()) {
                                int height8 = tr0Var.getHeight();
                                i0.c cVar7 = this.f53302r;
                                this.f53291b0 = (((((height8 - cVar7.f15575b) - cVar7.d) - org.telegram.messenger.g0.L(78.0f)) - textView.getHeight()) - i7) - this.S.getHeight();
                            }
                        }
                    }
                    e();
                } else {
                    this.Y = 0.0f;
                    this.X = 0.0f;
                }
                this.Z = true;
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
        hi.i1 i1Var = this.f53297f;
        float positionAnimated = i1Var.getPositionAnimated();
        int i10 = 0;
        float W1 = org.telegram.messenger.g0.W1(positionAnimated, 0, -i1Var.getWidth());
        float W12 = org.telegram.messenger.g0.W1(positionAnimated, i1Var.getWidth(), 0);
        if (this.Z) {
            ViewGroup viewGroup = this.U;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                float f14 = this.Y;
                this.f53289a0 = f14;
                float height = f14 + this.M.getHeight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                tr0 tr0Var = this.f53292c;
                int height2 = tr0Var.getHeight();
                i0.c cVar = this.f53302r;
                if (height > ((height2 - cVar.f15575b) - cVar.d) - org.telegram.messenger.g0.L(66.0f)) {
                    int height3 = tr0Var.getHeight();
                    i0.c cVar2 = this.f53302r;
                    this.f53289a0 = ((((height3 - cVar2.f15575b) - cVar2.d) - org.telegram.messenger.g0.L(66.0f)) - this.M.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        wr0 wr0Var = this.L;
        float f15 = this.X;
        if (this.f53296e0) {
            f10 = 1.0f;
        } else {
            f10 = this.E;
        }
        wr0Var.setTranslationX(org.telegram.messenger.g0.T1(f15, 0.0f, f10) + W12);
        wr0 wr0Var2 = this.L;
        float f16 = this.Y;
        float f17 = this.f53289a0;
        if (this.f53296e0) {
            f11 = 1.0f;
        } else {
            f11 = this.E;
        }
        wr0Var2.setTranslationY(org.telegram.messenger.g0.T1(f16, f17, f11));
        ViewGroup viewGroup2 = this.U;
        tr0 tr0Var2 = this.f53295e;
        if (viewGroup2 != null) {
            if (this.J) {
                viewGroup2.setTranslationX(((this.L.getPollButtonsLeft() + ((W12 + 0.0f) + this.L.getLeft())) - org.telegram.messenger.g0.L(8.0f)) - this.U.getLeft());
            } else {
                float f18 = W12 + 0.0f;
                if (this.L.Z2()) {
                    i7 = org.telegram.messenger.g0.L(48.0f);
                } else {
                    i7 = 0;
                }
                viewGroup2.setTranslationX(((f18 + i7) + this.L.getLeft()) - this.U.getLeft());
            }
            this.V = tr0Var2.getMeasuredWidth() - (this.U.getX() - W12);
            this.U.setTranslationY(((this.L.getY() + this.L.getHeight()) - this.U.getTop()) - tr0Var2.getTop());
            this.U.setAlpha(this.E);
            float T1 = org.telegram.messenger.g0.T1(0.75f, 1.0f, this.E);
            this.U.setScaleX(T1);
            this.U.setScaleY(T1);
        }
        vr0 vr0Var = this.K;
        float f19 = this.X;
        if (this.f53296e0) {
            f12 = 1.0f;
        } else {
            f12 = this.E;
        }
        vr0Var.setTranslationX(org.telegram.messenger.g0.T1(f19, 0.0f, f12) + W1);
        vr0 vr0Var2 = this.K;
        float f20 = this.Y;
        float f21 = this.f53291b0;
        if (this.f53296e0) {
            f13 = 1.0f;
        } else {
            f13 = this.E;
        }
        vr0Var2.setTranslationY(org.telegram.messenger.g0.T1(f20, f21, f13));
        if (this.S != null) {
            int W13 = this.K.W1(this.Q);
            this.K.V1(W13);
            float U1 = this.K.U1(W13);
            if (this.J) {
                this.S.setTranslationX(((this.K.getPollButtonsLeft() + ((W1 + 0.0f) + this.K.getLeft())) - org.telegram.messenger.g0.L(8.0f)) - this.S.getLeft());
            } else {
                ViewGroup viewGroup3 = this.S;
                float f22 = W1 + 0.0f;
                if (this.K.Z2()) {
                    i10 = org.telegram.messenger.g0.L(48.0f);
                }
                viewGroup3.setTranslationX(((f22 + i10) + this.K.getLeft()) - this.S.getLeft());
            }
            this.T = tr0Var2.getMeasuredWidth() - (this.S.getX() - W12);
            this.S.setTranslationY(((this.K.getY() + ((int) U1)) - this.S.getTop()) - tr0Var2.getTop());
            this.S.setAlpha(this.E);
            float T12 = org.telegram.messenger.g0.T1(0.75f, 1.0f, this.E);
            this.S.setScaleX(T12);
            this.S.setScaleY(T12);
        }
        if (this.f53296e0) {
            this.L.setAlpha(this.E);
            this.K.setAlpha(this.E);
        }
        if (this.R != null) {
            float max = W12 + Math.max(0.0f, ((this.L.getBoundsLeft() + this.L.getBoundsRight()) / 2.0f) - (this.R.getWidth() * 0.8f));
            this.R.setTranslationX(max);
            this.R.setTranslationY(Math.max(0.0f, ((this.L.getY() - this.R.getHeight()) + org.telegram.messenger.g0.L(22.0f)) - tr0Var2.getTop()));
            this.R.setAlpha(this.E);
            View windowView = this.R.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.E);
            }
        }
        TextView textView = this.h;
        textView.setTranslationX(W1);
        textView.setAlpha(this.E);
        org.telegram.ui.Components.ha0 ha0Var = this.f53301n;
        ha0Var.setSelectedTab(positionAnimated);
        ha0Var.setAlpha(this.E);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(2131755178);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        tr0 tr0Var = this.f53292c;
        setContentView(tr0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 48;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        org.telegram.messenger.g0.m(attributes);
        window.setAttributes(attributes);
        tr0Var.setSystemUiVisibility(1284);
        org.telegram.messenger.g0.o3(tr0Var, !org.telegram.ui.ActionBar.j6.I.q());
    }

    @Override
    public final void show() {
        if (!org.telegram.messenger.g0.M1(getContext())) {
            return;
        }
        super.show();
        org.telegram.ui.Components.ok0.d(new a5(this, 16));
        this.P = true;
        b(true, null);
    }
}
