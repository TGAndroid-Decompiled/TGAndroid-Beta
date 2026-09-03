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
    public final tg.b C;
    public final og.a D;
    public MessageObject E;
    public boolean F;
    public wv0 G;
    public xv0 H;
    public org.telegram.ui.Cells.t1 I;
    public float J;
    public float K;
    public boolean L;
    public byte[] M;
    public org.telegram.ui.Components.qk0 N;
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
    public final Context f43706a;
    public boolean f43707a0;
    public final org.telegram.ui.ActionBar.g6 f43708b;
    public um f43709b0;
    public final uv0 f43710c;
    public ValueAnimator f43711c0;
    public final uv0 d;
    public ValueAnimator f43712d0;
    public final uv0 f43713e;
    public final ek f43714f;
    public final TextView h;
    public final org.telegram.ui.Components.wb0 f43715n;
    public i0.b f43716r;
    public Bitmap f43717s;
    public BitmapShader v;
    public Paint f43718w;
    public Matrix f43719x;
    public float f43720y;

    public yv0(Activity activity, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity, R.style.TransparentDialog);
        this.f43716r = i0.b.f7756e;
        this.J = 0.0f;
        this.K = 0.0f;
        this.P = -1.0f;
        this.R = -1.0f;
        this.Z = false;
        this.f43706a = activity;
        this.f43708b = g6Var;
        uv0 uv0Var = new uv0(this, activity, 0);
        this.f43710c = uv0Var;
        uv0Var.setOnClickListener(new f60(this, 22));
        tg.b bVar = new tg.b();
        this.C = bVar;
        og.a aVar = new og.a(bVar);
        this.D = aVar;
        aVar.d = new vg.i(uv0Var);
        aVar.f16756e = uv0Var;
        uv0 uv0Var2 = new uv0(this, activity, 1);
        this.d = uv0Var2;
        uv0Var2.setClipToPadding(false);
        uv0Var.addView(uv0Var2, k7.c6.e(-1, -1, 119));
        ek ekVar = new ek(this, activity, 2);
        this.f43714f = ekVar;
        ekVar.setAdapter(new hg.u(this, activity, 2));
        uv0Var2.addView(ekVar, k7.c6.e(-1, -1, 119));
        uv0 uv0Var3 = new uv0(this, activity, 2);
        this.f43713e = uv0Var3;
        uv0Var2.addView(uv0Var3, k7.c6.e(-1, -1, 119));
        org.telegram.ui.Components.wb0 wb0Var = new org.telegram.ui.Components.wb0(activity, g6Var);
        this.f43715n = wb0Var;
        wb0Var.a(0, LocaleController.getString(R.string.PollMenuTabOption));
        wb0Var.a(1, LocaleController.getString(R.string.PollMenuTabPoll));
        uv0Var2.addView(wb0Var, k7.c6.e(-1, 66, 80));
        wb0Var.setOnTabClick(new w3(ekVar, 14));
        qg.b c3 = aVar.c(wb0Var, null, false);
        c3.n(sg.b.k(g6Var));
        c3.h.f44870e = true;
        c3.o(AndroidUtilities.dp(8.0f));
        c3.p(AndroidUtilities.dp(16.0f));
        wb0Var.setBackground(c3);
        TextView textView = new TextView(activity);
        this.h = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(wb0Var.getColor());
        org.telegram.messenger.y3.r(R.string.PollMenuHint, textView, 17);
        uv0Var2.addView(textView, k7.c6.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        vv0 vv0Var = new vv0(this, 0);
        WeakHashMap weakHashMap = r0.j0.f46469a;
        r0.b0.j(uv0Var, vv0Var);
    }

    public final void b(boolean z4, nv0 nv0Var) {
        float f10;
        long j10;
        ValueAnimator valueAnimator = this.f43711c0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f43712d0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f11 = this.f43720y;
        float f12 = 0.0f;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f43711c0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final yv0 f40136b;

            {
                this.f40136b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        yv0 yv0Var = this.f40136b;
                        yv0Var.f43720y = floatValue;
                        yv0Var.f43710c.invalidate();
                        yv0Var.d.invalidate();
                        wv0 wv0Var = yv0Var.G;
                        if (wv0Var != null) {
                            wv0Var.invalidate();
                        }
                        yv0Var.e();
                        return;
                    default:
                        yv0 yv0Var2 = this.f40136b;
                        yv0Var2.getClass();
                        yv0Var2.B = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f43711c0.addListener(new androidx.fragment.app.g(this, z4, nv0Var, 10));
        if (!z4) {
            j10 = 330;
        } else {
            j10 = 520;
        }
        ValueAnimator valueAnimator3 = this.f43711c0;
        org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
        valueAnimator3.setInterpolator(prVar);
        this.f43711c0.setDuration(j10);
        this.f43711c0.start();
        float f13 = this.B;
        if (z4) {
            f12 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f13, f12);
        this.f43712d0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final yv0 f40136b;

            {
                this.f40136b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        yv0 yv0Var = this.f40136b;
                        yv0Var.f43720y = floatValue;
                        yv0Var.f43710c.invalidate();
                        yv0Var.d.invalidate();
                        wv0 wv0Var = yv0Var.G;
                        if (wv0Var != null) {
                            wv0Var.invalidate();
                        }
                        yv0Var.e();
                        return;
                    default:
                        yv0 yv0Var2 = this.f40136b;
                        yv0Var2.getClass();
                        yv0Var2.B = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f43712d0.addListener(new org.telegram.ui.Components.x20(24, this, z4));
        this.f43712d0.setDuration(((float) j10) * 1.5f);
        this.f43712d0.setInterpolator(prVar);
        this.f43712d0.start();
    }

    public final void c(boolean z4) {
        boolean z10;
        org.telegram.ui.Cells.t1 t1Var;
        org.telegram.ui.Components.qk0 qk0Var;
        if (z4 && (qk0Var = this.N) != null && qk0Var.getReactionsWindow() != null && !this.N.getReactionsWindow().f16049q) {
            this.N.e();
        } else if (this.Z) {
        } else {
            this.Z = true;
            this.V = false;
            ek ekVar = this.f43714f;
            ekVar.l();
            if (ekVar.getCurrentPosition() == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z4 && z10) {
                org.telegram.ui.Cells.t1 t1Var2 = this.I;
                if (t1Var2 != null) {
                    t1Var2.setVisibility(4);
                    this.I.invalidate();
                }
            } else if (!z4 && (t1Var = this.I) != null) {
                t1Var.setVisibility(0);
                org.telegram.ui.Cells.t1 t1Var3 = this.I;
                t1Var3.I7 = null;
                t1Var3.invalidate();
            }
            this.f43707a0 = !z4;
            d();
            b(false, new nv0(this, z10));
            this.f43710c.invalidate();
        }
    }

    public final void d() {
        int i10;
        ViewGroup viewGroup;
        if (!this.V) {
            uv0 uv0Var = this.f43710c;
            if (uv0Var.getWidth() > 0) {
                org.telegram.ui.Cells.t1 t1Var = this.I;
                if (t1Var != null) {
                    int[] iArr = new int[2];
                    t1Var.getLocationOnScreen(iArr);
                    int i11 = iArr[0];
                    i0.b bVar = this.f43716r;
                    this.T = i11 - bVar.f7757a;
                    float f10 = iArr[1] - bVar.f7758b;
                    this.U = f10;
                    if (!this.Y) {
                        this.Y = true;
                        this.W = f10;
                        if (this.Q != null) {
                            float height = f10 + this.I.getHeight() + this.Q.getHeight();
                            int height2 = uv0Var.getHeight();
                            i0.b bVar2 = this.f43716r;
                            if (height > ((height2 - bVar2.f7758b) - bVar2.d) - AndroidUtilities.dp(66.0f)) {
                                int height3 = uv0Var.getHeight();
                                i0.b bVar3 = this.f43716r;
                                this.W = ((((height3 - bVar3.f7758b) - bVar3.d) - AndroidUtilities.dp(66.0f)) - this.I.getHeight()) - this.Q.getHeight();
                            }
                        }
                        int I2 = this.G.I2(this.M);
                        this.G.H2(I2);
                        float G2 = this.G.G2(I2);
                        float f11 = this.U;
                        this.X = f11;
                        float f12 = (int) G2;
                        int height4 = uv0Var.getHeight();
                        i0.b bVar4 = this.f43716r;
                        int dp = ((height4 - bVar4.f7758b) - bVar4.d) - AndroidUtilities.dp(78.0f);
                        TextView textView = this.h;
                        if (f11 + f12 > dp - textView.getHeight()) {
                            int height5 = uv0Var.getHeight();
                            i0.b bVar5 = this.f43716r;
                            this.X = ((((height5 - bVar5.f7758b) - bVar5.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i10;
                        }
                        if (this.O != null) {
                            float height6 = this.X + f12 + viewGroup.getHeight();
                            int height7 = uv0Var.getHeight();
                            i0.b bVar6 = this.f43716r;
                            if (height6 > (((height7 - bVar6.f7758b) - bVar6.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) {
                                int height8 = uv0Var.getHeight();
                                i0.b bVar7 = this.f43716r;
                                this.X = (((((height8 - bVar7.f7758b) - bVar7.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i10) - this.O.getHeight();
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
        ek ekVar = this.f43714f;
        float positionAnimated = ekVar.getPositionAnimated();
        int i11 = 0;
        float lerp = AndroidUtilities.lerp(0, -ekVar.getWidth(), positionAnimated);
        float lerp2 = AndroidUtilities.lerp(ekVar.getWidth(), 0, positionAnimated);
        if (this.V) {
            ViewGroup viewGroup = this.Q;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                float f14 = this.U;
                this.W = f14;
                float height = f14 + this.I.getHeight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                uv0 uv0Var = this.f43710c;
                int height2 = uv0Var.getHeight();
                i0.b bVar = this.f43716r;
                if (height > ((height2 - bVar.f7758b) - bVar.d) - AndroidUtilities.dp(66.0f)) {
                    int height3 = uv0Var.getHeight();
                    i0.b bVar2 = this.f43716r;
                    this.W = ((((height3 - bVar2.f7758b) - bVar2.d) - AndroidUtilities.dp(66.0f)) - this.I.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        xv0 xv0Var = this.H;
        float f15 = this.T;
        if (this.f43707a0) {
            f10 = 1.0f;
        } else {
            f10 = this.f43720y;
        }
        xv0Var.setTranslationX(AndroidUtilities.lerp(f15, 0.0f, f10) + lerp2);
        xv0 xv0Var2 = this.H;
        float f16 = this.U;
        float f17 = this.W;
        if (this.f43707a0) {
            f11 = 1.0f;
        } else {
            f11 = this.f43720y;
        }
        xv0Var2.setTranslationY(AndroidUtilities.lerp(f16, f17, f11));
        ViewGroup viewGroup2 = this.Q;
        uv0 uv0Var2 = this.f43713e;
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
            this.Q.setAlpha(this.f43720y);
            float lerp3 = AndroidUtilities.lerp(0.75f, 1.0f, this.f43720y);
            this.Q.setScaleX(lerp3);
            this.Q.setScaleY(lerp3);
        }
        wv0 wv0Var = this.G;
        float f19 = this.T;
        if (this.f43707a0) {
            f12 = 1.0f;
        } else {
            f12 = this.f43720y;
        }
        wv0Var.setTranslationX(AndroidUtilities.lerp(f19, 0.0f, f12) + lerp);
        wv0 wv0Var2 = this.G;
        float f20 = this.U;
        float f21 = this.X;
        if (this.f43707a0) {
            f13 = 1.0f;
        } else {
            f13 = this.f43720y;
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
            this.O.setAlpha(this.f43720y);
            float lerp4 = AndroidUtilities.lerp(0.75f, 1.0f, this.f43720y);
            this.O.setScaleX(lerp4);
            this.O.setScaleY(lerp4);
        }
        if (this.f43707a0) {
            this.H.setAlpha(this.f43720y);
            this.G.setAlpha(this.f43720y);
        }
        if (this.N != null) {
            float max = lerp2 + Math.max(0.0f, ((this.H.getBoundsLeft() + this.H.getBoundsRight()) / 2.0f) - (this.N.getWidth() * 0.8f));
            this.N.setTranslationX(max);
            this.N.setTranslationY(Math.max(0.0f, ((this.H.getY() - this.N.getHeight()) + AndroidUtilities.dp(22.0f)) - uv0Var2.getTop()));
            this.N.setAlpha(this.f43720y);
            View windowView = this.N.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.f43720y);
            }
        }
        TextView textView = this.h;
        textView.setTranslationX(lerp);
        textView.setAlpha(this.f43720y);
        org.telegram.ui.Components.wb0 wb0Var = this.f43715n;
        wb0Var.setSelectedTab(positionAnimated);
        wb0Var.setAlpha(this.f43720y);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        uv0 uv0Var = this.f43710c;
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
        AndroidUtilities.setLightNavigationBar(uv0Var, !org.telegram.ui.ActionBar.k6.I.q());
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        super.show();
        org.telegram.ui.Components.im0.d(new d5(this, 15));
        this.L = true;
        b(true, null);
    }
}
