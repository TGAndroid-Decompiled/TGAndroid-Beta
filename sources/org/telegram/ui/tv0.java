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
public final class tv0 extends Dialog {
    public float B;
    public final tg.b C;
    public final og.a D;
    public MessageObject E;
    public boolean F;
    public rv0 G;
    public sv0 H;
    public org.telegram.ui.Cells.t1 I;
    public float J;
    public float K;
    public boolean L;
    public byte[] M;
    public org.telegram.ui.Components.rk0 N;
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
    public final Context f41713a;
    public boolean f41714a0;
    public final org.telegram.ui.ActionBar.g6 f41715b;
    public um f41716b0;
    public final pv0 f41717c;
    public ValueAnimator f41718c0;
    public final pv0 d;
    public ValueAnimator f41719d0;
    public final pv0 f41720e;
    public final ek f41721f;
    public final TextView h;
    public final org.telegram.ui.Components.wb0 f41722n;
    public i0.b f41723r;
    public Bitmap f41724s;
    public BitmapShader v;
    public Paint f41725w;
    public Matrix f41726x;
    public float f41727y;

    public tv0(Activity activity, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity, R.style.TransparentDialog);
        this.f41723r = i0.b.f7756e;
        this.J = 0.0f;
        this.K = 0.0f;
        this.P = -1.0f;
        this.R = -1.0f;
        this.Z = false;
        this.f41713a = activity;
        this.f41715b = g6Var;
        pv0 pv0Var = new pv0(this, activity, 0);
        this.f41717c = pv0Var;
        pv0Var.setOnClickListener(new f60(this, 23));
        tg.b bVar = new tg.b();
        this.C = bVar;
        og.a aVar = new og.a(bVar);
        this.D = aVar;
        aVar.d = new vg.i(pv0Var);
        aVar.f16754e = pv0Var;
        pv0 pv0Var2 = new pv0(this, activity, 1);
        this.d = pv0Var2;
        pv0Var2.setClipToPadding(false);
        pv0Var.addView(pv0Var2, k7.c6.e(-1, -1, 119));
        ek ekVar = new ek(this, activity, 2);
        this.f41721f = ekVar;
        ekVar.setAdapter(new hg.u(this, activity, 2));
        pv0Var2.addView(ekVar, k7.c6.e(-1, -1, 119));
        pv0 pv0Var3 = new pv0(this, activity, 2);
        this.f41720e = pv0Var3;
        pv0Var2.addView(pv0Var3, k7.c6.e(-1, -1, 119));
        org.telegram.ui.Components.wb0 wb0Var = new org.telegram.ui.Components.wb0(activity, g6Var);
        this.f41722n = wb0Var;
        wb0Var.a(0, LocaleController.getString(R.string.PollMenuTabOption));
        wb0Var.a(1, LocaleController.getString(R.string.PollMenuTabPoll));
        pv0Var2.addView(wb0Var, k7.c6.e(-1, 66, 80));
        wb0Var.setOnTabClick(new w3(ekVar, 14));
        qg.b c3 = aVar.c(wb0Var, null, false);
        c3.n(sg.b.j(g6Var));
        c3.h.f44839e = true;
        c3.o(AndroidUtilities.dp(8.0f));
        c3.p(AndroidUtilities.dp(16.0f));
        wb0Var.setBackground(c3);
        TextView textView = new TextView(activity);
        this.h = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(wb0Var.getColor());
        org.telegram.messenger.y3.r(R.string.PollMenuHint, textView, 17);
        pv0Var2.addView(textView, k7.c6.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        qv0 qv0Var = new qv0(this, 0);
        WeakHashMap weakHashMap = r0.j0.f46438a;
        r0.b0.j(pv0Var, qv0Var);
    }

    public final void b(boolean z4, iv0 iv0Var) {
        float f10;
        long j10;
        ValueAnimator valueAnimator = this.f41718c0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f41719d0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f11 = this.f41727y;
        float f12 = 0.0f;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f41718c0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final tv0 f38524b;

            {
                this.f38524b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        tv0 tv0Var = this.f38524b;
                        tv0Var.f41727y = floatValue;
                        tv0Var.f41717c.invalidate();
                        tv0Var.d.invalidate();
                        rv0 rv0Var = tv0Var.G;
                        if (rv0Var != null) {
                            rv0Var.invalidate();
                        }
                        tv0Var.e();
                        return;
                    default:
                        tv0 tv0Var2 = this.f38524b;
                        tv0Var2.getClass();
                        tv0Var2.B = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f41718c0.addListener(new androidx.fragment.app.g(this, z4, iv0Var, 10));
        if (!z4) {
            j10 = 330;
        } else {
            j10 = 520;
        }
        ValueAnimator valueAnimator3 = this.f41718c0;
        org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
        valueAnimator3.setInterpolator(prVar);
        this.f41718c0.setDuration(j10);
        this.f41718c0.start();
        float f13 = this.B;
        if (z4) {
            f12 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f13, f12);
        this.f41719d0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final tv0 f38524b;

            {
                this.f38524b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        tv0 tv0Var = this.f38524b;
                        tv0Var.f41727y = floatValue;
                        tv0Var.f41717c.invalidate();
                        tv0Var.d.invalidate();
                        rv0 rv0Var = tv0Var.G;
                        if (rv0Var != null) {
                            rv0Var.invalidate();
                        }
                        tv0Var.e();
                        return;
                    default:
                        tv0 tv0Var2 = this.f38524b;
                        tv0Var2.getClass();
                        tv0Var2.B = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f41719d0.addListener(new org.telegram.ui.Components.x20(24, this, z4));
        this.f41719d0.setDuration(((float) j10) * 1.5f);
        this.f41719d0.setInterpolator(prVar);
        this.f41719d0.start();
    }

    public final void c(boolean z4) {
        boolean z10;
        org.telegram.ui.Cells.t1 t1Var;
        org.telegram.ui.Components.rk0 rk0Var;
        if (z4 && (rk0Var = this.N) != null && rk0Var.getReactionsWindow() != null && !this.N.getReactionsWindow().f16047q) {
            this.N.e();
        } else if (this.Z) {
        } else {
            this.Z = true;
            this.V = false;
            ek ekVar = this.f41721f;
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
            this.f41714a0 = !z4;
            d();
            b(false, new iv0(this, z10));
            this.f41717c.invalidate();
        }
    }

    public final void d() {
        int i10;
        ViewGroup viewGroup;
        if (!this.V) {
            pv0 pv0Var = this.f41717c;
            if (pv0Var.getWidth() > 0) {
                org.telegram.ui.Cells.t1 t1Var = this.I;
                if (t1Var != null) {
                    int[] iArr = new int[2];
                    t1Var.getLocationOnScreen(iArr);
                    int i11 = iArr[0];
                    i0.b bVar = this.f41723r;
                    this.T = i11 - bVar.f7757a;
                    float f10 = iArr[1] - bVar.f7758b;
                    this.U = f10;
                    if (!this.Y) {
                        this.Y = true;
                        this.W = f10;
                        if (this.Q != null) {
                            float height = f10 + this.I.getHeight() + this.Q.getHeight();
                            int height2 = pv0Var.getHeight();
                            i0.b bVar2 = this.f41723r;
                            if (height > ((height2 - bVar2.f7758b) - bVar2.d) - AndroidUtilities.dp(66.0f)) {
                                int height3 = pv0Var.getHeight();
                                i0.b bVar3 = this.f41723r;
                                this.W = ((((height3 - bVar3.f7758b) - bVar3.d) - AndroidUtilities.dp(66.0f)) - this.I.getHeight()) - this.Q.getHeight();
                            }
                        }
                        int I2 = this.G.I2(this.M);
                        this.G.H2(I2);
                        float G2 = this.G.G2(I2);
                        float f11 = this.U;
                        this.X = f11;
                        float f12 = (int) G2;
                        int height4 = pv0Var.getHeight();
                        i0.b bVar4 = this.f41723r;
                        int dp = ((height4 - bVar4.f7758b) - bVar4.d) - AndroidUtilities.dp(78.0f);
                        TextView textView = this.h;
                        if (f11 + f12 > dp - textView.getHeight()) {
                            int height5 = pv0Var.getHeight();
                            i0.b bVar5 = this.f41723r;
                            this.X = ((((height5 - bVar5.f7758b) - bVar5.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i10;
                        }
                        if (this.O != null) {
                            float height6 = this.X + f12 + viewGroup.getHeight();
                            int height7 = pv0Var.getHeight();
                            i0.b bVar6 = this.f41723r;
                            if (height6 > (((height7 - bVar6.f7758b) - bVar6.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) {
                                int height8 = pv0Var.getHeight();
                                i0.b bVar7 = this.f41723r;
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
        ek ekVar = this.f41721f;
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
                pv0 pv0Var = this.f41717c;
                int height2 = pv0Var.getHeight();
                i0.b bVar = this.f41723r;
                if (height > ((height2 - bVar.f7758b) - bVar.d) - AndroidUtilities.dp(66.0f)) {
                    int height3 = pv0Var.getHeight();
                    i0.b bVar2 = this.f41723r;
                    this.W = ((((height3 - bVar2.f7758b) - bVar2.d) - AndroidUtilities.dp(66.0f)) - this.I.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        sv0 sv0Var = this.H;
        float f15 = this.T;
        if (this.f41714a0) {
            f10 = 1.0f;
        } else {
            f10 = this.f41727y;
        }
        sv0Var.setTranslationX(AndroidUtilities.lerp(f15, 0.0f, f10) + lerp2);
        sv0 sv0Var2 = this.H;
        float f16 = this.U;
        float f17 = this.W;
        if (this.f41714a0) {
            f11 = 1.0f;
        } else {
            f11 = this.f41727y;
        }
        sv0Var2.setTranslationY(AndroidUtilities.lerp(f16, f17, f11));
        ViewGroup viewGroup2 = this.Q;
        pv0 pv0Var2 = this.f41720e;
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
            this.R = pv0Var2.getMeasuredWidth() - (this.Q.getX() - lerp2);
            this.Q.setTranslationY(((this.H.getY() + this.H.getHeight()) - this.Q.getTop()) - pv0Var2.getTop());
            this.Q.setAlpha(this.f41727y);
            float lerp3 = AndroidUtilities.lerp(0.75f, 1.0f, this.f41727y);
            this.Q.setScaleX(lerp3);
            this.Q.setScaleY(lerp3);
        }
        rv0 rv0Var = this.G;
        float f19 = this.T;
        if (this.f41714a0) {
            f12 = 1.0f;
        } else {
            f12 = this.f41727y;
        }
        rv0Var.setTranslationX(AndroidUtilities.lerp(f19, 0.0f, f12) + lerp);
        rv0 rv0Var2 = this.G;
        float f20 = this.U;
        float f21 = this.X;
        if (this.f41714a0) {
            f13 = 1.0f;
        } else {
            f13 = this.f41727y;
        }
        rv0Var2.setTranslationY(AndroidUtilities.lerp(f20, f21, f13));
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
            this.P = pv0Var2.getMeasuredWidth() - (this.O.getX() - lerp2);
            this.O.setTranslationY(((this.G.getY() + ((int) G2)) - this.O.getTop()) - pv0Var2.getTop());
            this.O.setAlpha(this.f41727y);
            float lerp4 = AndroidUtilities.lerp(0.75f, 1.0f, this.f41727y);
            this.O.setScaleX(lerp4);
            this.O.setScaleY(lerp4);
        }
        if (this.f41714a0) {
            this.H.setAlpha(this.f41727y);
            this.G.setAlpha(this.f41727y);
        }
        if (this.N != null) {
            float max = lerp2 + Math.max(0.0f, ((this.H.getBoundsLeft() + this.H.getBoundsRight()) / 2.0f) - (this.N.getWidth() * 0.8f));
            this.N.setTranslationX(max);
            this.N.setTranslationY(Math.max(0.0f, ((this.H.getY() - this.N.getHeight()) + AndroidUtilities.dp(22.0f)) - pv0Var2.getTop()));
            this.N.setAlpha(this.f41727y);
            View windowView = this.N.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.f41727y);
            }
        }
        TextView textView = this.h;
        textView.setTranslationX(lerp);
        textView.setAlpha(this.f41727y);
        org.telegram.ui.Components.wb0 wb0Var = this.f41722n;
        wb0Var.setSelectedTab(positionAnimated);
        wb0Var.setAlpha(this.f41727y);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        pv0 pv0Var = this.f41717c;
        setContentView(pv0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 48;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        AndroidUtilities.applyEdgeToEdgeLayoutParams(attributes);
        window.setAttributes(attributes);
        pv0Var.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(pv0Var, !org.telegram.ui.ActionBar.k6.I.q());
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        super.show();
        org.telegram.ui.Components.jm0.d(new d5(this, 15));
        this.L = true;
        b(true, null);
    }
}
