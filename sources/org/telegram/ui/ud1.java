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
public final class ud1 extends Dialog {
    public final tg.b B;
    public final og.a C;
    public MessageObject D;
    public boolean E;
    public sd1 F;
    public sv0 G;
    public org.telegram.ui.Cells.t1 H;
    public float I;
    public float J;
    public boolean K;
    public int L;
    public org.telegram.ui.Components.rk0 M;
    public ViewGroup N;
    public float O;
    public ViewGroup P;
    public float Q;
    public float R;
    public float S;
    public boolean T;
    public float U;
    public float V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public um Z;
    public final org.telegram.ui.ActionBar.g6 f41898a;
    public ValueAnimator f41899a0;
    public final rd1 f41900b;
    public ValueAnimator f41901b0;
    public final rd1 f41902c;
    public final rd1 d;
    public final ek f41903e;
    public final TextView f41904f;
    public final org.telegram.ui.Components.wb0 h;
    public i0.b f41905n;
    public Bitmap f41906r;
    public BitmapShader f41907s;
    public Paint v;
    public Matrix f41908w;
    public float f41909x;
    public float f41910y;

    public ud1(Activity activity, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity, R.style.TransparentDialog);
        this.f41905n = i0.b.f7756e;
        this.I = 0.0f;
        this.J = 0.0f;
        this.O = -1.0f;
        this.Q = -1.0f;
        this.X = false;
        this.f41898a = g6Var;
        rd1 rd1Var = new rd1(this, activity, 0);
        this.f41900b = rd1Var;
        rd1Var.setOnClickListener(new k31(this, 7));
        tg.b bVar = new tg.b();
        this.B = bVar;
        og.a aVar = new og.a(bVar);
        this.C = aVar;
        aVar.d = new vg.i(rd1Var);
        aVar.f16754e = rd1Var;
        rd1 rd1Var2 = new rd1(this, activity, 1);
        this.f41902c = rd1Var2;
        rd1Var2.setClipToPadding(false);
        rd1Var.addView(rd1Var2, k7.c6.e(-1, -1, 119));
        ek ekVar = new ek(this, activity, 5);
        this.f41903e = ekVar;
        ekVar.setAdapter(new hg.u(this, activity, 4));
        rd1Var2.addView(ekVar, k7.c6.e(-1, -1, 119));
        rd1 rd1Var3 = new rd1(this, activity, 2);
        this.d = rd1Var3;
        rd1Var2.addView(rd1Var3, k7.c6.e(-1, -1, 119));
        org.telegram.ui.Components.wb0 wb0Var = new org.telegram.ui.Components.wb0(activity, g6Var);
        this.h = wb0Var;
        wb0Var.a(0, LocaleController.getString(R.string.TodoMenuTabTask));
        wb0Var.a(1, LocaleController.getString(R.string.TodoMenuTabList));
        rd1Var2.addView(wb0Var, k7.c6.e(-1, 66, 80));
        wb0Var.setOnTabClick(new w3(ekVar, 22));
        qg.b c3 = aVar.c(wb0Var, null, false);
        c3.n(sg.b.j(g6Var));
        c3.h.f44839e = true;
        c3.o(AndroidUtilities.dp(8.0f));
        c3.p(AndroidUtilities.dp(16.0f));
        wb0Var.setBackground(c3);
        TextView textView = new TextView(activity);
        this.f41904f = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(wb0Var.getColor());
        org.telegram.messenger.y3.r(R.string.TodoMenuHint, textView, 17);
        rd1Var2.addView(textView, k7.c6.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        qv0 qv0Var = new qv0(this, 6);
        WeakHashMap weakHashMap = r0.j0.f46438a;
        r0.b0.j(rd1Var, qv0Var);
    }

    public final void b(boolean z4, org.telegram.ui.Components.rv0 rv0Var) {
        float f10;
        long j10;
        ValueAnimator valueAnimator = this.f41899a0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f41901b0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f11 = this.f41909x;
        float f12 = 0.0f;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f41899a0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final ud1 f39084b;

            {
                this.f39084b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        ud1 ud1Var = this.f39084b;
                        ud1Var.f41909x = floatValue;
                        ud1Var.f41900b.invalidate();
                        ud1Var.f41902c.invalidate();
                        ud1Var.e();
                        return;
                    default:
                        ud1 ud1Var2 = this.f39084b;
                        ud1Var2.getClass();
                        ud1Var2.f41910y = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f41899a0.addListener(new androidx.fragment.app.g(this, z4, rv0Var, 12));
        if (!z4) {
            j10 = 330;
        } else {
            j10 = 520;
        }
        ValueAnimator valueAnimator3 = this.f41899a0;
        org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
        valueAnimator3.setInterpolator(prVar);
        this.f41899a0.setDuration(j10);
        this.f41899a0.start();
        float f13 = this.f41910y;
        if (z4) {
            f12 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f13, f12);
        this.f41901b0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final ud1 f39084b;

            {
                this.f39084b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        ud1 ud1Var = this.f39084b;
                        ud1Var.f41909x = floatValue;
                        ud1Var.f41900b.invalidate();
                        ud1Var.f41902c.invalidate();
                        ud1Var.e();
                        return;
                    default:
                        ud1 ud1Var2 = this.f39084b;
                        ud1Var2.getClass();
                        ud1Var2.f41910y = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f41901b0.addListener(new qd1(0, this, z4));
        this.f41901b0.setDuration(((float) j10) * 1.5f);
        this.f41901b0.setInterpolator(prVar);
        this.f41901b0.start();
    }

    public final void c(boolean z4) {
        boolean z10;
        org.telegram.ui.Cells.t1 t1Var;
        org.telegram.ui.Components.rk0 rk0Var;
        if (z4 && (rk0Var = this.M) != null && rk0Var.getReactionsWindow() != null && !this.M.getReactionsWindow().f16047q) {
            this.M.e();
        } else if (this.X) {
        } else {
            this.X = true;
            this.T = false;
            ek ekVar = this.f41903e;
            ekVar.l();
            if (ekVar.getCurrentPosition() == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z4 && z10) {
                org.telegram.ui.Cells.t1 t1Var2 = this.H;
                if (t1Var2 != null) {
                    t1Var2.setVisibility(4);
                    this.H.invalidate();
                }
            } else if (!z4 && (t1Var = this.H) != null) {
                t1Var.setVisibility(0);
                org.telegram.ui.Cells.t1 t1Var3 = this.H;
                t1Var3.H7 = -1;
                t1Var3.invalidate();
            }
            this.Y = !z4;
            d();
            b(false, new org.telegram.ui.Components.rv0(9, this, z10));
            this.f41900b.invalidate();
        }
    }

    public final void d() {
        int i10;
        ViewGroup viewGroup;
        if (!this.T) {
            rd1 rd1Var = this.f41900b;
            if (rd1Var.getWidth() > 0) {
                org.telegram.ui.Cells.t1 t1Var = this.H;
                if (t1Var != null) {
                    int[] iArr = new int[2];
                    t1Var.getLocationOnScreen(iArr);
                    int i11 = iArr[0];
                    i0.b bVar = this.f41905n;
                    this.R = i11 - bVar.f7757a;
                    float f10 = iArr[1] - bVar.f7758b;
                    this.S = f10;
                    if (!this.W) {
                        this.W = true;
                        this.U = f10;
                        if (this.P != null) {
                            float height = f10 + this.H.getHeight() + this.P.getHeight();
                            int height2 = rd1Var.getHeight();
                            i0.b bVar2 = this.f41905n;
                            if (height > ((height2 - bVar2.f7758b) - bVar2.d) - AndroidUtilities.dp(66.0f)) {
                                int height3 = rd1Var.getHeight();
                                i0.b bVar3 = this.f41905n;
                                this.U = ((((height3 - bVar3.f7758b) - bVar3.d) - AndroidUtilities.dp(66.0f)) - this.H.getHeight()) - this.P.getHeight();
                            }
                        }
                        int O2 = this.F.O2(this.L);
                        this.F.H2(O2);
                        float G2 = this.F.G2(O2);
                        float f11 = this.S;
                        this.V = f11;
                        float f12 = (int) G2;
                        int height4 = rd1Var.getHeight();
                        i0.b bVar4 = this.f41905n;
                        int dp = ((height4 - bVar4.f7758b) - bVar4.d) - AndroidUtilities.dp(78.0f);
                        TextView textView = this.f41904f;
                        if (f11 + f12 > dp - textView.getHeight()) {
                            int height5 = rd1Var.getHeight();
                            i0.b bVar5 = this.f41905n;
                            this.V = ((((height5 - bVar5.f7758b) - bVar5.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i10;
                        }
                        if (this.N != null) {
                            float height6 = this.V + f12 + viewGroup.getHeight();
                            int height7 = rd1Var.getHeight();
                            i0.b bVar6 = this.f41905n;
                            if (height6 > (((height7 - bVar6.f7758b) - bVar6.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) {
                                int height8 = rd1Var.getHeight();
                                i0.b bVar7 = this.f41905n;
                                this.V = (((((height8 - bVar7.f7758b) - bVar7.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i10) - this.N.getHeight();
                            }
                        }
                    }
                    e();
                } else {
                    this.S = 0.0f;
                    this.R = 0.0f;
                }
                this.T = true;
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
        ek ekVar = this.f41903e;
        float positionAnimated = ekVar.getPositionAnimated();
        int i11 = 0;
        float lerp = AndroidUtilities.lerp(0, -ekVar.getWidth(), positionAnimated);
        float lerp2 = AndroidUtilities.lerp(ekVar.getWidth(), 0, positionAnimated);
        if (this.T) {
            ViewGroup viewGroup = this.P;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                float f14 = this.S;
                this.U = f14;
                float height = f14 + this.H.getHeight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                rd1 rd1Var = this.f41900b;
                int height2 = rd1Var.getHeight();
                i0.b bVar = this.f41905n;
                if (height > ((height2 - bVar.f7758b) - bVar.d) - AndroidUtilities.dp(66.0f)) {
                    int height3 = rd1Var.getHeight();
                    i0.b bVar2 = this.f41905n;
                    this.U = ((((height3 - bVar2.f7758b) - bVar2.d) - AndroidUtilities.dp(66.0f)) - this.H.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        sv0 sv0Var = this.G;
        float f15 = this.R;
        if (this.Y) {
            f10 = 1.0f;
        } else {
            f10 = this.f41909x;
        }
        sv0Var.setTranslationX(AndroidUtilities.lerp(f15, 0.0f, f10) + lerp2);
        sv0 sv0Var2 = this.G;
        float f16 = this.S;
        float f17 = this.U;
        if (this.Y) {
            f11 = 1.0f;
        } else {
            f11 = this.f41909x;
        }
        sv0Var2.setTranslationY(AndroidUtilities.lerp(f16, f17, f11));
        ViewGroup viewGroup2 = this.P;
        rd1 rd1Var2 = this.d;
        if (viewGroup2 != null) {
            if (this.E) {
                viewGroup2.setTranslationX(((this.G.getPollButtonsLeft() + ((lerp2 + 0.0f) + this.G.getLeft())) - AndroidUtilities.dp(8.0f)) - this.P.getLeft());
            } else {
                float f18 = lerp2 + 0.0f;
                if (this.G.z3()) {
                    i10 = AndroidUtilities.dp(48.0f);
                } else {
                    i10 = 0;
                }
                viewGroup2.setTranslationX(((f18 + i10) + this.G.getLeft()) - this.P.getLeft());
            }
            this.Q = rd1Var2.getMeasuredWidth() - (this.P.getX() - lerp2);
            this.P.setTranslationY(((this.G.getY() + this.G.getHeight()) - this.P.getTop()) - rd1Var2.getTop());
            this.P.setAlpha(this.f41909x);
            float lerp3 = AndroidUtilities.lerp(0.75f, 1.0f, this.f41909x);
            this.P.setScaleX(lerp3);
            this.P.setScaleY(lerp3);
        }
        sd1 sd1Var = this.F;
        float f19 = this.R;
        if (this.Y) {
            f12 = 1.0f;
        } else {
            f12 = this.f41909x;
        }
        sd1Var.setTranslationX(AndroidUtilities.lerp(f19, 0.0f, f12) + lerp);
        sd1 sd1Var2 = this.F;
        float f20 = this.S;
        float f21 = this.V;
        if (this.Y) {
            f13 = 1.0f;
        } else {
            f13 = this.f41909x;
        }
        sd1Var2.setTranslationY(AndroidUtilities.lerp(f20, f21, f13));
        if (this.N != null) {
            int O2 = this.F.O2(this.L);
            this.F.H2(O2);
            float G2 = this.F.G2(O2);
            if (this.E) {
                this.N.setTranslationX(((this.F.getPollButtonsLeft() + ((lerp + 0.0f) + this.F.getLeft())) - AndroidUtilities.dp(8.0f)) - this.N.getLeft());
            } else {
                ViewGroup viewGroup3 = this.N;
                float f22 = lerp + 0.0f;
                if (this.F.z3()) {
                    i11 = AndroidUtilities.dp(48.0f);
                }
                viewGroup3.setTranslationX(((f22 + i11) + this.F.getLeft()) - this.N.getLeft());
            }
            this.O = rd1Var2.getMeasuredWidth() - (this.N.getX() - lerp2);
            this.N.setTranslationY(((this.F.getY() + ((int) G2)) - this.N.getTop()) - rd1Var2.getTop());
            this.N.setAlpha(this.f41909x);
            float lerp4 = AndroidUtilities.lerp(0.75f, 1.0f, this.f41909x);
            this.N.setScaleX(lerp4);
            this.N.setScaleY(lerp4);
        }
        if (this.Y) {
            this.G.setAlpha(this.f41909x);
            this.F.setAlpha(this.f41909x);
        }
        if (this.M != null) {
            float max = lerp2 + Math.max(0.0f, ((this.G.getBoundsLeft() + this.G.getBoundsRight()) / 2.0f) - (this.M.getWidth() * 0.8f));
            this.M.setTranslationX(max);
            this.M.setTranslationY(Math.max(0.0f, ((this.G.getY() - this.M.getHeight()) + AndroidUtilities.dp(22.0f)) - rd1Var2.getTop()));
            this.M.setAlpha(this.f41909x);
            View windowView = this.M.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.f41909x);
            }
        }
        TextView textView = this.f41904f;
        textView.setTranslationX(lerp);
        textView.setAlpha(this.f41909x);
        org.telegram.ui.Components.wb0 wb0Var = this.h;
        wb0Var.setSelectedTab(positionAnimated);
        wb0Var.setAlpha(this.f41909x);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        rd1 rd1Var = this.f41900b;
        setContentView(rd1Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 48;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        AndroidUtilities.applyEdgeToEdgeLayoutParams(attributes);
        window.setAttributes(attributes);
        rd1Var.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(rd1Var, !org.telegram.ui.ActionBar.k6.I.q());
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        super.show();
        org.telegram.ui.Components.jm0.d(new d5(this, 28));
        this.K = true;
        b(true, null);
    }
}
