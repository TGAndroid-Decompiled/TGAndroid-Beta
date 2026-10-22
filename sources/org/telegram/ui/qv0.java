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
public final class qv0 extends Dialog {
    public float E;
    public final gh.b F;
    public final bh.b G;
    public MessageObject H;
    public boolean I;
    public ov0 J;
    public pv0 K;
    public org.telegram.ui.Cells.u1 L;
    public float M;
    public float N;
    public boolean O;
    public byte[] P;
    public org.telegram.ui.Components.dl0 Q;
    public ViewGroup R;
    public float S;
    public ViewGroup T;
    public float U;
    public boolean V;
    public float W;
    public float X;
    public boolean Y;
    public float Z;
    public final Context f40982a;
    public float f40983a0;
    public final org.telegram.ui.ActionBar.d6 f40984b;
    public boolean f40985b0;
    public final nv0 f40986c;
    public boolean f40987c0;
    public final nv0 d;
    public boolean f40988d0;
    public final nv0 e;
    public nm f40989e0;
    public final ei.h1 f40990f;
    public ValueAnimator f40991f0;
    public ValueAnimator f40992g0;
    public final TextView h;
    public final org.telegram.ui.Components.mc0 f40993n;
    public i0.b f40994r;
    public Bitmap f40995s;
    public BitmapShader v;
    public Paint f40996w;
    public Matrix f40997x;
    public float f40998y;

    public qv0(Activity activity, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity, R.style.TransparentDialog);
        this.f40994r = i0.b.e;
        this.M = 0.0f;
        this.N = 0.0f;
        this.S = -1.0f;
        this.U = -1.0f;
        this.f40987c0 = false;
        this.f40982a = activity;
        this.f40984b = d6Var;
        nv0 nv0Var = new nv0(this, activity, 0);
        this.f40986c = nv0Var;
        nv0Var.setOnClickListener(new s50(this, 22));
        gh.b bVar = new gh.b();
        this.F = bVar;
        bh.b bVar2 = new bh.b(bVar);
        this.G = bVar2;
        bVar2.f4358f = new ih.j(nv0Var);
        bVar2.f4359g = nv0Var;
        nv0 nv0Var2 = new nv0(this, activity, 1);
        this.d = nv0Var2;
        nv0Var2.setClipToPadding(false);
        nv0Var.addView(nv0Var2, w7.z5.e(-1, -1, 119));
        ei.h1 h1Var = new ei.h1(this, activity, 5);
        this.f40990f = h1Var;
        h1Var.setAdapter(new ai.j5(this, activity, 1));
        nv0Var2.addView(h1Var, w7.z5.e(-1, -1, 119));
        nv0 nv0Var3 = new nv0(this, activity, 2);
        this.e = nv0Var3;
        nv0Var2.addView(nv0Var3, w7.z5.e(-1, -1, 119));
        org.telegram.ui.Components.mc0 mc0Var = new org.telegram.ui.Components.mc0(activity, d6Var);
        this.f40993n = mc0Var;
        mc0Var.a(0, LocaleController.getString(R.string.PollMenuTabOption));
        mc0Var.a(1, LocaleController.getString(R.string.PollMenuTabPoll));
        nv0Var2.addView(mc0Var, w7.z5.e(-1, 66, 80));
        mc0Var.setOnTabClick(new v3(h1Var, 17));
        dh.d c10 = bVar2.c(mc0Var, null, false);
        c10.o(fh.c.k(d6Var));
        c10.f8014j.e = true;
        c10.p(AndroidUtilities.dp(8.0f));
        c10.q(AndroidUtilities.dp(16.0f));
        mc0Var.setBackground(c10);
        TextView textView = new TextView(activity);
        this.h = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(mc0Var.getColor());
        org.telegram.messenger.ok.m(R.string.PollMenuHint, textView, 17);
        nv0Var2.addView(textView, w7.z5.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        ko0 ko0Var = new ko0(this, 1);
        WeakHashMap weakHashMap = r0.i0.f44829a;
        r0.a0.i(nv0Var, ko0Var);
    }

    public final void b(boolean z10, gv0 gv0Var) {
        float f7;
        long j10;
        ValueAnimator valueAnimator = this.f40991f0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f40992g0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f10 = this.f40998y;
        float f11 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f40991f0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final qv0 f37809b;

            {
                this.f37809b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        qv0 qv0Var = this.f37809b;
                        qv0Var.f40998y = floatValue;
                        qv0Var.f40986c.invalidate();
                        qv0Var.d.invalidate();
                        ov0 ov0Var = qv0Var.J;
                        if (ov0Var != null) {
                            ov0Var.invalidate();
                        }
                        qv0Var.e();
                        return;
                    default:
                        qv0 qv0Var2 = this.f37809b;
                        qv0Var2.getClass();
                        qv0Var2.E = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f40991f0.addListener(new ah.q0(this, z10, gv0Var, 10));
        if (!z10) {
            j10 = 330;
        } else {
            j10 = 520;
        }
        ValueAnimator valueAnimator3 = this.f40991f0;
        org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.h;
        valueAnimator3.setInterpolator(bsVar);
        this.f40991f0.setDuration(j10);
        this.f40991f0.start();
        float f12 = this.E;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, f11);
        this.f40992g0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final qv0 f37809b;

            {
                this.f37809b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        qv0 qv0Var = this.f37809b;
                        qv0Var.f40998y = floatValue;
                        qv0Var.f40986c.invalidate();
                        qv0Var.d.invalidate();
                        ov0 ov0Var = qv0Var.J;
                        if (ov0Var != null) {
                            ov0Var.invalidate();
                        }
                        qv0Var.e();
                        return;
                    default:
                        qv0 qv0Var2 = this.f37809b;
                        qv0Var2.getClass();
                        qv0Var2.E = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f40992g0.addListener(new l40(5, this, z10));
        this.f40992g0.setDuration(((float) j10) * 1.5f);
        this.f40992g0.setInterpolator(bsVar);
        this.f40992g0.start();
    }

    public final void c(boolean z10) {
        boolean z11;
        org.telegram.ui.Cells.u1 u1Var;
        org.telegram.ui.Components.dl0 dl0Var;
        if (z10 && (dl0Var = this.Q) != null && dl0Var.getReactionsWindow() != null && !this.Q.getReactionsWindow().f881q) {
            this.Q.e();
        } else if (this.f40987c0) {
        } else {
            this.f40987c0 = true;
            this.Y = false;
            ei.h1 h1Var = this.f40990f;
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
            this.f40988d0 = !z10;
            d();
            b(false, new gv0(this, z11));
            this.f40986c.invalidate();
        }
    }

    public final void d() {
        int i10;
        ViewGroup viewGroup;
        if (!this.Y) {
            nv0 nv0Var = this.f40986c;
            if (nv0Var.getWidth() > 0) {
                org.telegram.ui.Cells.u1 u1Var = this.L;
                if (u1Var != null) {
                    int[] iArr = new int[2];
                    u1Var.getLocationOnScreen(iArr);
                    int i11 = iArr[0];
                    i0.b bVar = this.f40994r;
                    this.W = i11 - bVar.f12283a;
                    float f7 = iArr[1] - bVar.f12284b;
                    this.X = f7;
                    if (!this.f40985b0) {
                        this.f40985b0 = true;
                        this.Z = f7;
                        if (this.T != null) {
                            float height = f7 + this.L.getHeight() + this.T.getHeight();
                            int height2 = nv0Var.getHeight();
                            i0.b bVar2 = this.f40994r;
                            if (height > ((height2 - bVar2.f12284b) - bVar2.d) - AndroidUtilities.dp(66.0f)) {
                                int height3 = nv0Var.getHeight();
                                i0.b bVar3 = this.f40994r;
                                this.Z = ((((height3 - bVar3.f12284b) - bVar3.d) - AndroidUtilities.dp(66.0f)) - this.L.getHeight()) - this.T.getHeight();
                            }
                        }
                        int I2 = this.J.I2(this.P);
                        this.J.H2(I2);
                        float G2 = this.J.G2(I2);
                        float f10 = this.X;
                        this.f40983a0 = f10;
                        float f11 = (int) G2;
                        int height4 = nv0Var.getHeight();
                        i0.b bVar4 = this.f40994r;
                        int dp = ((height4 - bVar4.f12284b) - bVar4.d) - AndroidUtilities.dp(78.0f);
                        TextView textView = this.h;
                        if (f10 + f11 > dp - textView.getHeight()) {
                            int height5 = nv0Var.getHeight();
                            i0.b bVar5 = this.f40994r;
                            this.f40983a0 = ((((height5 - bVar5.f12284b) - bVar5.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i10;
                        }
                        if (this.R != null) {
                            float height6 = this.f40983a0 + f11 + viewGroup.getHeight();
                            int height7 = nv0Var.getHeight();
                            i0.b bVar6 = this.f40994r;
                            if (height6 > (((height7 - bVar6.f12284b) - bVar6.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) {
                                int height8 = nv0Var.getHeight();
                                i0.b bVar7 = this.f40994r;
                                this.f40983a0 = (((((height8 - bVar7.f12284b) - bVar7.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i10) - this.R.getHeight();
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
        ei.h1 h1Var = this.f40990f;
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
                nv0 nv0Var = this.f40986c;
                int height2 = nv0Var.getHeight();
                i0.b bVar = this.f40994r;
                if (height > ((height2 - bVar.f12284b) - bVar.d) - AndroidUtilities.dp(66.0f)) {
                    int height3 = nv0Var.getHeight();
                    i0.b bVar2 = this.f40994r;
                    this.Z = ((((height3 - bVar2.f12284b) - bVar2.d) - AndroidUtilities.dp(66.0f)) - this.L.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        pv0 pv0Var = this.K;
        float f14 = this.W;
        if (this.f40988d0) {
            f7 = 1.0f;
        } else {
            f7 = this.f40998y;
        }
        pv0Var.setTranslationX(AndroidUtilities.lerp(f14, 0.0f, f7) + lerp2);
        pv0 pv0Var2 = this.K;
        float f15 = this.X;
        float f16 = this.Z;
        if (this.f40988d0) {
            f10 = 1.0f;
        } else {
            f10 = this.f40998y;
        }
        pv0Var2.setTranslationY(AndroidUtilities.lerp(f15, f16, f10));
        ViewGroup viewGroup2 = this.T;
        nv0 nv0Var2 = this.e;
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
            this.U = nv0Var2.getMeasuredWidth() - (this.T.getX() - lerp2);
            this.T.setTranslationY(((this.K.getY() + this.K.getHeight()) - this.T.getTop()) - nv0Var2.getTop());
            this.T.setAlpha(this.f40998y);
            float lerp3 = AndroidUtilities.lerp(0.75f, 1.0f, this.f40998y);
            this.T.setScaleX(lerp3);
            this.T.setScaleY(lerp3);
        }
        ov0 ov0Var = this.J;
        float f18 = this.W;
        if (this.f40988d0) {
            f11 = 1.0f;
        } else {
            f11 = this.f40998y;
        }
        ov0Var.setTranslationX(AndroidUtilities.lerp(f18, 0.0f, f11) + lerp);
        ov0 ov0Var2 = this.J;
        float f19 = this.X;
        float f20 = this.f40983a0;
        if (this.f40988d0) {
            f12 = 1.0f;
        } else {
            f12 = this.f40998y;
        }
        ov0Var2.setTranslationY(AndroidUtilities.lerp(f19, f20, f12));
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
            this.S = nv0Var2.getMeasuredWidth() - (this.R.getX() - lerp2);
            this.R.setTranslationY(((this.J.getY() + ((int) G2)) - this.R.getTop()) - nv0Var2.getTop());
            this.R.setAlpha(this.f40998y);
            float lerp4 = AndroidUtilities.lerp(0.75f, 1.0f, this.f40998y);
            this.R.setScaleX(lerp4);
            this.R.setScaleY(lerp4);
        }
        if (this.f40988d0) {
            this.K.setAlpha(this.f40998y);
            this.J.setAlpha(this.f40998y);
        }
        if (this.Q != null) {
            float max = lerp2 + Math.max(0.0f, ((this.K.getBoundsLeft() + this.K.getBoundsRight()) / 2.0f) - (this.Q.getWidth() * 0.8f));
            this.Q.setTranslationX(max);
            this.Q.setTranslationY(Math.max(0.0f, ((this.K.getY() - this.Q.getHeight()) + AndroidUtilities.dp(22.0f)) - nv0Var2.getTop()));
            this.Q.setAlpha(this.f40998y);
            View windowView = this.Q.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.f40998y);
            }
        }
        TextView textView = this.h;
        textView.setTranslationX(lerp);
        textView.setAlpha(this.f40998y);
        org.telegram.ui.Components.mc0 mc0Var = this.f40993n;
        mc0Var.setSelectedTab(positionAnimated);
        mc0Var.setAlpha(this.f40998y);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        nv0 nv0Var = this.f40986c;
        setContentView(nv0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 48;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        AndroidUtilities.applyEdgeToEdgeLayoutParams(attributes);
        window.setAttributes(attributes);
        nv0Var.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(nv0Var, !org.telegram.ui.ActionBar.h6.I.q());
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        super.show();
        org.telegram.ui.Components.zm0.d(new g5(this, 15));
        this.O = true;
        b(true, null);
    }
}
