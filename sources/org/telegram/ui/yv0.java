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
public final class yv0 extends Dialog {
    public float B;
    public final sg.b C;
    public final ng.a D;
    public MessageObject E;
    public boolean F;
    public wv0 G;
    public xv0 H;
    public org.telegram.ui.Cells.s1 I;
    public float J;
    public float K;
    public boolean L;
    public byte[] M;
    public org.telegram.ui.Components.pk0 N;
    public ViewGroup O;
    public float P;
    public ViewGroup Q;
    public float R;
    public boolean S;
    public float T;
    public float U;
    public boolean V;
    public float W;
    public float X;
    public boolean Y;
    public boolean Z;
    public final Context f40332a;
    public boolean f40333a0;
    public final org.telegram.ui.ActionBar.f6 f40334b;
    public wm f40335b0;
    public final uv0 f40336c;
    public ValueAnimator f40337c0;
    public final uv0 d;
    public ValueAnimator f40338d0;
    public final uv0 e;
    public final gk f40339f;
    public final TextView h;
    public final org.telegram.ui.Components.vb0 f40340n;
    public i0.b f40341r;
    public Bitmap f40342s;
    public BitmapShader v;
    public Paint f40343w;
    public Matrix f40344x;
    public float f40345y;

    public yv0(Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, R.style.TransparentDialog);
        this.f40341r = i0.b.e;
        this.J = 0.0f;
        this.K = 0.0f;
        this.P = -1.0f;
        this.R = -1.0f;
        this.Z = false;
        this.f40332a = activity;
        this.f40334b = f6Var;
        uv0 uv0Var = new uv0(this, activity, 0);
        this.f40336c = uv0Var;
        uv0Var.setOnClickListener(new g60(this, 22));
        sg.b bVar = new sg.b();
        this.C = bVar;
        ng.a aVar = new ng.a(bVar);
        this.D = aVar;
        aVar.d = new ug.i(uv0Var);
        aVar.e = uv0Var;
        uv0 uv0Var2 = new uv0(this, activity, 1);
        this.d = uv0Var2;
        uv0Var2.setClipToPadding(false);
        uv0Var.addView(uv0Var2, k7.b6.e(-1, -1, 119));
        gk gkVar = new gk(this, activity, 2);
        this.f40339f = gkVar;
        gkVar.setAdapter(new gg.u(this, activity, 2));
        uv0Var2.addView(gkVar, k7.b6.e(-1, -1, 119));
        uv0 uv0Var3 = new uv0(this, activity, 2);
        this.e = uv0Var3;
        uv0Var2.addView(uv0Var3, k7.b6.e(-1, -1, 119));
        org.telegram.ui.Components.vb0 vb0Var = new org.telegram.ui.Components.vb0(activity, f6Var);
        this.f40340n = vb0Var;
        vb0Var.a(0, LocaleController.getString(R.string.PollMenuTabOption));
        vb0Var.a(1, LocaleController.getString(R.string.PollMenuTabPoll));
        uv0Var2.addView(vb0Var, k7.b6.e(-1, 66, 80));
        vb0Var.setOnTabClick(new y3(gkVar, 14));
        pg.b c3 = aVar.c(vb0Var, null, false);
        c3.n(rg.b.k(f6Var));
        c3.h.e = true;
        c3.o(AndroidUtilities.dp(8.0f));
        c3.p(AndroidUtilities.dp(16.0f));
        vb0Var.setBackground(c3);
        TextView textView = new TextView(activity);
        this.h = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(vb0Var.getColor());
        org.telegram.messenger.y3.r(R.string.PollMenuHint, textView, 17);
        uv0Var2.addView(textView, k7.b6.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        vv0 vv0Var = new vv0(this, 0);
        WeakHashMap weakHashMap = r0.j0.f43142a;
        r0.b0.j(uv0Var, vv0Var);
    }

    public final void b(boolean z4, nv0 nv0Var) {
        float f10;
        long j10;
        ValueAnimator valueAnimator = this.f40337c0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f40338d0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f11 = this.f40345y;
        float f12 = 0.0f;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f40337c0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final yv0 f37237b;

            {
                this.f37237b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        yv0 yv0Var = this.f37237b;
                        yv0Var.f40345y = floatValue;
                        yv0Var.f40336c.invalidate();
                        yv0Var.d.invalidate();
                        wv0 wv0Var = yv0Var.G;
                        if (wv0Var != null) {
                            wv0Var.invalidate();
                        }
                        yv0Var.e();
                        return;
                    default:
                        yv0 yv0Var2 = this.f37237b;
                        yv0Var2.getClass();
                        yv0Var2.B = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f40337c0.addListener(new androidx.fragment.app.g(this, z4, nv0Var, 10));
        if (!z4) {
            j10 = 330;
        } else {
            j10 = 520;
        }
        ValueAnimator valueAnimator3 = this.f40337c0;
        org.telegram.ui.Components.mr mrVar = org.telegram.ui.Components.mr.h;
        valueAnimator3.setInterpolator(mrVar);
        this.f40337c0.setDuration(j10);
        this.f40337c0.start();
        float f13 = this.B;
        if (z4) {
            f12 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f13, f12);
        this.f40338d0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final yv0 f37237b;

            {
                this.f37237b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        yv0 yv0Var = this.f37237b;
                        yv0Var.f40345y = floatValue;
                        yv0Var.f40336c.invalidate();
                        yv0Var.d.invalidate();
                        wv0 wv0Var = yv0Var.G;
                        if (wv0Var != null) {
                            wv0Var.invalidate();
                        }
                        yv0Var.e();
                        return;
                    default:
                        yv0 yv0Var2 = this.f37237b;
                        yv0Var2.getClass();
                        yv0Var2.B = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f40338d0.addListener(new org.telegram.ui.Components.m00(26, this, z4));
        this.f40338d0.setDuration(((float) j10) * 1.5f);
        this.f40338d0.setInterpolator(mrVar);
        this.f40338d0.start();
    }

    public final void c(boolean z4) {
        boolean z10;
        org.telegram.ui.Cells.s1 s1Var;
        org.telegram.ui.Components.pk0 pk0Var;
        if (z4 && (pk0Var = this.N) != null && pk0Var.getReactionsWindow() != null && !this.N.getReactionsWindow().f13973q) {
            this.N.e();
        } else if (this.Z) {
        } else {
            this.Z = true;
            this.V = false;
            gk gkVar = this.f40339f;
            gkVar.l();
            if (gkVar.getCurrentPosition() == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z4 && z10) {
                org.telegram.ui.Cells.s1 s1Var2 = this.I;
                if (s1Var2 != null) {
                    s1Var2.setVisibility(4);
                    this.I.invalidate();
                }
            } else if (!z4 && (s1Var = this.I) != null) {
                s1Var.setVisibility(0);
                org.telegram.ui.Cells.s1 s1Var3 = this.I;
                s1Var3.I7 = null;
                s1Var3.invalidate();
            }
            this.f40333a0 = !z4;
            d();
            b(false, new nv0(this, z10));
            this.f40336c.invalidate();
        }
    }

    public final void d() {
        int i10;
        ViewGroup viewGroup;
        if (!this.V) {
            uv0 uv0Var = this.f40336c;
            if (uv0Var.getWidth() > 0) {
                org.telegram.ui.Cells.s1 s1Var = this.I;
                if (s1Var != null) {
                    int[] iArr = new int[2];
                    s1Var.getLocationOnScreen(iArr);
                    int i11 = iArr[0];
                    i0.b bVar = this.f40341r;
                    this.T = i11 - bVar.f7196a;
                    float f10 = iArr[1] - bVar.f7197b;
                    this.U = f10;
                    if (!this.Y) {
                        this.Y = true;
                        this.W = f10;
                        if (this.Q != null) {
                            float height = f10 + this.I.getHeight() + this.Q.getHeight();
                            int height2 = uv0Var.getHeight();
                            i0.b bVar2 = this.f40341r;
                            if (height > ((height2 - bVar2.f7197b) - bVar2.d) - AndroidUtilities.dp(66.0f)) {
                                int height3 = uv0Var.getHeight();
                                i0.b bVar3 = this.f40341r;
                                this.W = ((((height3 - bVar3.f7197b) - bVar3.d) - AndroidUtilities.dp(66.0f)) - this.I.getHeight()) - this.Q.getHeight();
                            }
                        }
                        int I2 = this.G.I2(this.M);
                        this.G.H2(I2);
                        float G2 = this.G.G2(I2);
                        float f11 = this.U;
                        this.X = f11;
                        float f12 = (int) G2;
                        int height4 = uv0Var.getHeight();
                        i0.b bVar4 = this.f40341r;
                        int dp = ((height4 - bVar4.f7197b) - bVar4.d) - AndroidUtilities.dp(78.0f);
                        TextView textView = this.h;
                        if (f11 + f12 > dp - textView.getHeight()) {
                            int height5 = uv0Var.getHeight();
                            i0.b bVar5 = this.f40341r;
                            this.X = ((((height5 - bVar5.f7197b) - bVar5.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i10;
                        }
                        if (this.O != null) {
                            float height6 = this.X + f12 + viewGroup.getHeight();
                            int height7 = uv0Var.getHeight();
                            i0.b bVar6 = this.f40341r;
                            if (height6 > (((height7 - bVar6.f7197b) - bVar6.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) {
                                int height8 = uv0Var.getHeight();
                                i0.b bVar7 = this.f40341r;
                                this.X = (((((height8 - bVar7.f7197b) - bVar7.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i10) - this.O.getHeight();
                            }
                        }
                    }
                    e();
                } else {
                    this.U = 0.0f;
                    this.T = 0.0f;
                }
                this.V = true;
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
        int i10;
        gk gkVar = this.f40339f;
        float positionAnimated = gkVar.getPositionAnimated();
        int i11 = 0;
        float lerp = AndroidUtilities.lerp(0, -gkVar.getWidth(), positionAnimated);
        float lerp2 = AndroidUtilities.lerp(gkVar.getWidth(), 0, positionAnimated);
        if (this.V) {
            ViewGroup viewGroup = this.Q;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                float f14 = this.U;
                this.W = f14;
                float height = f14 + this.I.getHeight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                uv0 uv0Var = this.f40336c;
                int height2 = uv0Var.getHeight();
                i0.b bVar = this.f40341r;
                if (height > ((height2 - bVar.f7197b) - bVar.d) - AndroidUtilities.dp(66.0f)) {
                    int height3 = uv0Var.getHeight();
                    i0.b bVar2 = this.f40341r;
                    this.W = ((((height3 - bVar2.f7197b) - bVar2.d) - AndroidUtilities.dp(66.0f)) - this.I.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        xv0 xv0Var = this.H;
        float f15 = this.T;
        if (this.f40333a0) {
            f10 = 1.0f;
        } else {
            f10 = this.f40345y;
        }
        xv0Var.setTranslationX(AndroidUtilities.lerp(f15, 0.0f, f10) + lerp2);
        xv0 xv0Var2 = this.H;
        float f16 = this.U;
        float f17 = this.W;
        if (this.f40333a0) {
            f11 = 1.0f;
        } else {
            f11 = this.f40345y;
        }
        xv0Var2.setTranslationY(AndroidUtilities.lerp(f16, f17, f11));
        ViewGroup viewGroup2 = this.Q;
        uv0 uv0Var2 = this.e;
        if (viewGroup2 != null) {
            if (this.F) {
                viewGroup2.setTranslationX(((this.H.getPollButtonsLeft() + ((lerp2 + 0.0f) + this.H.getLeft())) - AndroidUtilities.dp(8.0f)) - this.Q.getLeft());
            } else {
                float f18 = lerp2 + 0.0f;
                if (this.H.z3()) {
                    i10 = AndroidUtilities.dp(48.0f);
                } else {
                    i10 = 0;
                }
                viewGroup2.setTranslationX(((f18 + i10) + this.H.getLeft()) - this.Q.getLeft());
            }
            this.R = uv0Var2.getMeasuredWidth() - (this.Q.getX() - lerp2);
            this.Q.setTranslationY(((this.H.getY() + this.H.getHeight()) - this.Q.getTop()) - uv0Var2.getTop());
            this.Q.setAlpha(this.f40345y);
            float lerp3 = AndroidUtilities.lerp(0.75f, 1.0f, this.f40345y);
            this.Q.setScaleX(lerp3);
            this.Q.setScaleY(lerp3);
        }
        wv0 wv0Var = this.G;
        float f19 = this.T;
        if (this.f40333a0) {
            f12 = 1.0f;
        } else {
            f12 = this.f40345y;
        }
        wv0Var.setTranslationX(AndroidUtilities.lerp(f19, 0.0f, f12) + lerp);
        wv0 wv0Var2 = this.G;
        float f20 = this.U;
        float f21 = this.X;
        if (this.f40333a0) {
            f13 = 1.0f;
        } else {
            f13 = this.f40345y;
        }
        wv0Var2.setTranslationY(AndroidUtilities.lerp(f20, f21, f13));
        if (this.O != null) {
            int I2 = this.G.I2(this.M);
            this.G.H2(I2);
            float G2 = this.G.G2(I2);
            if (this.F) {
                this.O.setTranslationX(((this.G.getPollButtonsLeft() + ((lerp + 0.0f) + this.G.getLeft())) - AndroidUtilities.dp(8.0f)) - this.O.getLeft());
            } else {
                ViewGroup viewGroup3 = this.O;
                float f22 = lerp + 0.0f;
                if (this.G.z3()) {
                    i11 = AndroidUtilities.dp(48.0f);
                }
                viewGroup3.setTranslationX(((f22 + i11) + this.G.getLeft()) - this.O.getLeft());
            }
            this.P = uv0Var2.getMeasuredWidth() - (this.O.getX() - lerp2);
            this.O.setTranslationY(((this.G.getY() + ((int) G2)) - this.O.getTop()) - uv0Var2.getTop());
            this.O.setAlpha(this.f40345y);
            float lerp4 = AndroidUtilities.lerp(0.75f, 1.0f, this.f40345y);
            this.O.setScaleX(lerp4);
            this.O.setScaleY(lerp4);
        }
        if (this.f40333a0) {
            this.H.setAlpha(this.f40345y);
            this.G.setAlpha(this.f40345y);
        }
        if (this.N != null) {
            float max = lerp2 + Math.max(0.0f, ((this.H.getBoundsLeft() + this.H.getBoundsRight()) / 2.0f) - (this.N.getWidth() * 0.8f));
            this.N.setTranslationX(max);
            this.N.setTranslationY(Math.max(0.0f, ((this.H.getY() - this.N.getHeight()) + AndroidUtilities.dp(22.0f)) - uv0Var2.getTop()));
            this.N.setAlpha(this.f40345y);
            View windowView = this.N.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.f40345y);
            }
        }
        TextView textView = this.h;
        textView.setTranslationX(lerp);
        textView.setAlpha(this.f40345y);
        org.telegram.ui.Components.vb0 vb0Var = this.f40340n;
        vb0Var.setSelectedTab(positionAnimated);
        vb0Var.setAlpha(this.f40345y);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        uv0 uv0Var = this.f40336c;
        setContentView(uv0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 48;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        AndroidUtilities.applyEdgeToEdgeLayoutParams(attributes);
        window.setAttributes(attributes);
        uv0Var.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(uv0Var, !org.telegram.ui.ActionBar.j6.I.q());
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        super.show();
        org.telegram.ui.Components.hm0.d(new f5(this, 15));
        this.L = true;
        b(true, null);
    }
}
