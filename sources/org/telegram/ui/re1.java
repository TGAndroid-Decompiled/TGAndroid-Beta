package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
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
public final class re1 extends Dialog {
    public final gh.b E;
    public final bh.b F;
    public MessageObject G;
    public boolean H;
    public pe1 I;
    public qw0 J;
    public org.telegram.ui.Cells.u1 K;
    public float L;
    public float M;
    public boolean N;
    public int O;
    public org.telegram.ui.Components.gl0 P;
    public ViewGroup Q;
    public float R;
    public ViewGroup S;
    public float T;
    public float U;
    public float V;
    public boolean W;
    public float X;
    public float Y;
    public boolean Z;
    public final org.telegram.ui.ActionBar.c6 f39487a;
    public boolean f39488a0;
    public final oe1 f39489b;
    public boolean f39490b0;
    public final oe1 f39491c;
    public bn f39492c0;
    public final oe1 d;
    public ValueAnimator f39493d0;
    public final di.h1 e;
    public ValueAnimator f39494e0;
    public final TextView f39495f;
    public final org.telegram.ui.Components.tc0 h;
    public i0.b f39496n;
    public Bitmap f39497r;
    public BitmapShader f39498s;
    public Paint v;
    public Matrix f39499w;
    public float f39500x;
    public float f39501y;

    public re1(Activity activity, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity, R.style.TransparentDialog);
        this.f39496n = i0.b.e;
        this.L = 0.0f;
        this.M = 0.0f;
        this.R = -1.0f;
        this.T = -1.0f;
        this.f39488a0 = false;
        this.f39487a = c6Var;
        oe1 oe1Var = new oe1(this, activity, 0);
        this.f39489b = oe1Var;
        oe1Var.setOnClickListener(new v41(this, 5));
        gh.b bVar = new gh.b();
        this.E = bVar;
        bh.b bVar2 = new bh.b(bVar);
        this.F = bVar2;
        bVar2.f2749f = new ih.j(oe1Var);
        bVar2.f2750g = oe1Var;
        oe1 oe1Var2 = new oe1(this, activity, 1);
        this.f39491c = oe1Var2;
        oe1Var2.setClipToPadding(false);
        oe1Var.addView(oe1Var2, w7.z5.e(-1, -1, 119));
        di.h1 h1Var = new di.h1(this, activity, 8);
        this.e = h1Var;
        h1Var.setAdapter(new nw0(this, activity, 2));
        oe1Var2.addView(h1Var, w7.z5.e(-1, -1, 119));
        oe1 oe1Var3 = new oe1(this, activity, 2);
        this.d = oe1Var3;
        oe1Var2.addView(oe1Var3, w7.z5.e(-1, -1, 119));
        org.telegram.ui.Components.tc0 tc0Var = new org.telegram.ui.Components.tc0(activity, c6Var);
        this.h = tc0Var;
        tc0Var.a(0, LocaleController.getString(R.string.TodoMenuTabTask));
        tc0Var.a(1, LocaleController.getString(R.string.TodoMenuTabList));
        oe1Var2.addView(tc0Var, w7.z5.e(-1, 66, 80));
        tc0Var.setOnTabClick(new v3(h1Var, 25));
        dh.d c10 = bVar2.c(tc0Var, null, false);
        c10.o(fh.b.k(c6Var));
        c10.f6561j.e = true;
        c10.p(AndroidUtilities.dp(8.0f));
        c10.q(AndroidUtilities.dp(16.0f));
        tc0Var.setBackground(c10);
        TextView textView = new TextView(activity);
        this.f39495f = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(tc0Var.getColor());
        org.telegram.messenger.sk.m(R.string.TodoMenuHint, textView, 17);
        oe1Var2.addView(textView, w7.z5.a(-2.0f, 0.0f, 0.0f, 0.0f, 66.0f, -1, 80));
        ow0 ow0Var = new ow0(this, 6);
        WeakHashMap weakHashMap = r0.i0.f43485a;
        r0.a0.i(oe1Var, ow0Var);
    }

    public final void b(boolean z10, org.telegram.ui.Components.zr0 zr0Var) {
        float f7;
        long j10;
        ValueAnimator valueAnimator = this.f39493d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f39494e0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f10 = this.f39500x;
        float f11 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f39493d0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final re1 f37364b;

            {
                this.f37364b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        re1 re1Var = this.f37364b;
                        re1Var.f39500x = floatValue;
                        re1Var.f39489b.invalidate();
                        re1Var.f39491c.invalidate();
                        re1Var.e();
                        return;
                    default:
                        re1 re1Var2 = this.f37364b;
                        re1Var2.getClass();
                        re1Var2.f39501y = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f39493d0.addListener(new ah.q0(this, z10, zr0Var, 12));
        if (!z10) {
            j10 = 330;
        } else {
            j10 = 520;
        }
        ValueAnimator valueAnimator3 = this.f39493d0;
        org.telegram.ui.Components.es esVar = org.telegram.ui.Components.es.h;
        valueAnimator3.setInterpolator(esVar);
        this.f39493d0.setDuration(j10);
        this.f39493d0.start();
        float f12 = this.f39501y;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, f11);
        this.f39494e0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final re1 f37364b;

            {
                this.f37364b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        re1 re1Var = this.f37364b;
                        re1Var.f39500x = floatValue;
                        re1Var.f39489b.invalidate();
                        re1Var.f39491c.invalidate();
                        re1Var.e();
                        return;
                    default:
                        re1 re1Var2 = this.f37364b;
                        re1Var2.getClass();
                        re1Var2.f39501y = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f39494e0.addListener(new i50(11, this, z10));
        this.f39494e0.setDuration(((float) j10) * 1.5f);
        this.f39494e0.setInterpolator(esVar);
        this.f39494e0.start();
    }

    public final void c(boolean z10) {
        boolean z11;
        org.telegram.ui.Cells.u1 u1Var;
        org.telegram.ui.Components.gl0 gl0Var;
        if (z10 && (gl0Var = this.P) != null && gl0Var.getReactionsWindow() != null && !this.P.getReactionsWindow().f881q) {
            this.P.e();
        } else if (this.f39488a0) {
        } else {
            this.f39488a0 = true;
            this.W = false;
            di.h1 h1Var = this.e;
            h1Var.l();
            if (h1Var.getCurrentPosition() == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 && z11) {
                org.telegram.ui.Cells.u1 u1Var2 = this.K;
                if (u1Var2 != null) {
                    u1Var2.setVisibility(4);
                    this.K.invalidate();
                }
            } else if (!z10 && (u1Var = this.K) != null) {
                u1Var.setVisibility(0);
                org.telegram.ui.Cells.u1 u1Var3 = this.K;
                u1Var3.K7 = -1;
                u1Var3.invalidate();
            }
            this.f39490b0 = !z10;
            d();
            b(false, new org.telegram.ui.Components.zr0(14, this, z11));
            this.f39489b.invalidate();
        }
    }

    public final void d() {
        int i10;
        ViewGroup viewGroup;
        if (!this.W) {
            oe1 oe1Var = this.f39489b;
            if (oe1Var.getWidth() > 0) {
                org.telegram.ui.Cells.u1 u1Var = this.K;
                if (u1Var != null) {
                    int[] iArr = new int[2];
                    u1Var.getLocationOnScreen(iArr);
                    int i11 = iArr[0];
                    i0.b bVar = this.f39496n;
                    this.U = i11 - bVar.f10892a;
                    float f7 = iArr[1] - bVar.f10893b;
                    this.V = f7;
                    if (!this.Z) {
                        this.Z = true;
                        this.X = f7;
                        if (this.S != null) {
                            float height = f7 + this.K.getHeight() + this.S.getHeight();
                            int height2 = oe1Var.getHeight();
                            i0.b bVar2 = this.f39496n;
                            if (height > ((height2 - bVar2.f10893b) - bVar2.d) - AndroidUtilities.dp(66.0f)) {
                                int height3 = oe1Var.getHeight();
                                i0.b bVar3 = this.f39496n;
                                this.X = ((((height3 - bVar3.f10893b) - bVar3.d) - AndroidUtilities.dp(66.0f)) - this.K.getHeight()) - this.S.getHeight();
                            }
                        }
                        int O2 = this.I.O2(this.O);
                        this.I.H2(O2);
                        float G2 = this.I.G2(O2);
                        float f10 = this.V;
                        this.Y = f10;
                        float f11 = (int) G2;
                        int height4 = oe1Var.getHeight();
                        i0.b bVar4 = this.f39496n;
                        int dp = ((height4 - bVar4.f10893b) - bVar4.d) - AndroidUtilities.dp(78.0f);
                        TextView textView = this.f39495f;
                        if (f10 + f11 > dp - textView.getHeight()) {
                            int height5 = oe1Var.getHeight();
                            i0.b bVar5 = this.f39496n;
                            this.Y = ((((height5 - bVar5.f10893b) - bVar5.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i10;
                        }
                        if (this.Q != null) {
                            float height6 = this.Y + f11 + viewGroup.getHeight();
                            int height7 = oe1Var.getHeight();
                            i0.b bVar6 = this.f39496n;
                            if (height6 > (((height7 - bVar6.f10893b) - bVar6.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) {
                                int height8 = oe1Var.getHeight();
                                i0.b bVar7 = this.f39496n;
                                this.Y = (((((height8 - bVar7.f10893b) - bVar7.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i10) - this.Q.getHeight();
                            }
                        }
                    }
                    e();
                } else {
                    this.V = 0.0f;
                    this.U = 0.0f;
                }
                this.W = true;
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
        di.h1 h1Var = this.e;
        float positionAnimated = h1Var.getPositionAnimated();
        int i11 = 0;
        float lerp = AndroidUtilities.lerp(0, -h1Var.getWidth(), positionAnimated);
        float lerp2 = AndroidUtilities.lerp(h1Var.getWidth(), 0, positionAnimated);
        if (this.W) {
            ViewGroup viewGroup = this.S;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                float f13 = this.V;
                this.X = f13;
                float height = f13 + this.K.getHeight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                oe1 oe1Var = this.f39489b;
                int height2 = oe1Var.getHeight();
                i0.b bVar = this.f39496n;
                if (height > ((height2 - bVar.f10893b) - bVar.d) - AndroidUtilities.dp(66.0f)) {
                    int height3 = oe1Var.getHeight();
                    i0.b bVar2 = this.f39496n;
                    this.X = ((((height3 - bVar2.f10893b) - bVar2.d) - AndroidUtilities.dp(66.0f)) - this.K.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        qw0 qw0Var = this.J;
        float f14 = this.U;
        if (this.f39490b0) {
            f7 = 1.0f;
        } else {
            f7 = this.f39500x;
        }
        qw0Var.setTranslationX(AndroidUtilities.lerp(f14, 0.0f, f7) + lerp2);
        qw0 qw0Var2 = this.J;
        float f15 = this.V;
        float f16 = this.X;
        if (this.f39490b0) {
            f10 = 1.0f;
        } else {
            f10 = this.f39500x;
        }
        qw0Var2.setTranslationY(AndroidUtilities.lerp(f15, f16, f10));
        ViewGroup viewGroup2 = this.S;
        oe1 oe1Var2 = this.d;
        if (viewGroup2 != null) {
            if (this.H) {
                viewGroup2.setTranslationX(((this.J.getPollButtonsLeft() + ((lerp2 + 0.0f) + this.J.getLeft())) - AndroidUtilities.dp(8.0f)) - this.S.getLeft());
            } else {
                float f17 = lerp2 + 0.0f;
                if (this.J.z3()) {
                    i10 = AndroidUtilities.dp(48.0f);
                } else {
                    i10 = 0;
                }
                viewGroup2.setTranslationX(((f17 + i10) + this.J.getLeft()) - this.S.getLeft());
            }
            this.T = oe1Var2.getMeasuredWidth() - (this.S.getX() - lerp2);
            this.S.setTranslationY(((this.J.getY() + this.J.getHeight()) - this.S.getTop()) - oe1Var2.getTop());
            this.S.setAlpha(this.f39500x);
            float lerp3 = AndroidUtilities.lerp(0.75f, 1.0f, this.f39500x);
            this.S.setScaleX(lerp3);
            this.S.setScaleY(lerp3);
        }
        pe1 pe1Var = this.I;
        float f18 = this.U;
        if (this.f39490b0) {
            f11 = 1.0f;
        } else {
            f11 = this.f39500x;
        }
        pe1Var.setTranslationX(AndroidUtilities.lerp(f18, 0.0f, f11) + lerp);
        pe1 pe1Var2 = this.I;
        float f19 = this.V;
        float f20 = this.Y;
        if (this.f39490b0) {
            f12 = 1.0f;
        } else {
            f12 = this.f39500x;
        }
        pe1Var2.setTranslationY(AndroidUtilities.lerp(f19, f20, f12));
        if (this.Q != null) {
            int O2 = this.I.O2(this.O);
            this.I.H2(O2);
            float G2 = this.I.G2(O2);
            if (this.H) {
                this.Q.setTranslationX(((this.I.getPollButtonsLeft() + ((lerp + 0.0f) + this.I.getLeft())) - AndroidUtilities.dp(8.0f)) - this.Q.getLeft());
            } else {
                ViewGroup viewGroup3 = this.Q;
                float f21 = lerp + 0.0f;
                if (this.I.z3()) {
                    i11 = AndroidUtilities.dp(48.0f);
                }
                viewGroup3.setTranslationX(((f21 + i11) + this.I.getLeft()) - this.Q.getLeft());
            }
            this.R = oe1Var2.getMeasuredWidth() - (this.Q.getX() - lerp2);
            this.Q.setTranslationY(((this.I.getY() + ((int) G2)) - this.Q.getTop()) - oe1Var2.getTop());
            this.Q.setAlpha(this.f39500x);
            float lerp4 = AndroidUtilities.lerp(0.75f, 1.0f, this.f39500x);
            this.Q.setScaleX(lerp4);
            this.Q.setScaleY(lerp4);
        }
        if (this.f39490b0) {
            this.J.setAlpha(this.f39500x);
            this.I.setAlpha(this.f39500x);
        }
        if (this.P != null) {
            float max = lerp2 + Math.max(0.0f, ((this.J.getBoundsLeft() + this.J.getBoundsRight()) / 2.0f) - (this.P.getWidth() * 0.8f));
            this.P.setTranslationX(max);
            this.P.setTranslationY(Math.max(0.0f, ((this.J.getY() - this.P.getHeight()) + AndroidUtilities.dp(22.0f)) - oe1Var2.getTop()));
            this.P.setAlpha(this.f39500x);
            View windowView = this.P.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.f39500x);
            }
        }
        TextView textView = this.f39495f;
        textView.setTranslationX(lerp);
        textView.setAlpha(this.f39500x);
        org.telegram.ui.Components.tc0 tc0Var = this.h;
        tc0Var.setSelectedTab(positionAnimated);
        tc0Var.setAlpha(this.f39500x);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        oe1 oe1Var = this.f39489b;
        setContentView(oe1Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 48;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        AndroidUtilities.applyEdgeToEdgeLayoutParams(attributes);
        window.setAttributes(attributes);
        oe1Var.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(oe1Var, !org.telegram.ui.ActionBar.g6.I.q());
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        super.show();
        org.telegram.ui.Components.cn0.d(new f5(this, 28));
        this.N = true;
        b(true, null);
    }
}
