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
public final class zd1 extends Dialog {
    public final tg.b B;
    public final og.a C;
    public MessageObject D;
    public boolean E;
    public xd1 F;
    public xv0 G;
    public org.telegram.ui.Cells.t1 H;
    public float I;
    public float J;
    public boolean K;
    public int L;
    public org.telegram.ui.Components.qk0 M;
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
    public final org.telegram.ui.ActionBar.g6 f43923a;
    public ValueAnimator f43924a0;
    public final wd1 f43925b;
    public ValueAnimator f43926b0;
    public final wd1 f43927c;
    public final wd1 d;
    public final ek f43928e;
    public final TextView f43929f;
    public final org.telegram.ui.Components.wb0 h;
    public i0.b f43930n;
    public Bitmap f43931r;
    public BitmapShader f43932s;
    public Paint v;
    public Matrix f43933w;
    public float f43934x;
    public float f43935y;

    public zd1(Activity activity, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity, R.style.TransparentDialog);
        this.f43930n = i0.b.f7756e;
        this.I = 0.0f;
        this.J = 0.0f;
        this.O = -1.0f;
        this.Q = -1.0f;
        this.X = false;
        this.f43923a = g6Var;
        wd1 wd1Var = new wd1(this, activity, 0);
        this.f43925b = wd1Var;
        wd1Var.setOnClickListener(new v31(this, 6));
        tg.b bVar = new tg.b();
        this.B = bVar;
        og.a aVar = new og.a(bVar);
        this.C = aVar;
        aVar.d = new vg.i(wd1Var);
        aVar.f16756e = wd1Var;
        wd1 wd1Var2 = new wd1(this, activity, 1);
        this.f43927c = wd1Var2;
        wd1Var2.setClipToPadding(false);
        wd1Var.addView(wd1Var2, k7.c6.e(-1, -1, 119));
        ek ekVar = new ek(this, activity, 5);
        this.f43928e = ekVar;
        ekVar.setAdapter(new hg.u(this, activity, 4));
        wd1Var2.addView(ekVar, k7.c6.e(-1, -1, 119));
        wd1 wd1Var3 = new wd1(this, activity, 2);
        this.d = wd1Var3;
        wd1Var2.addView(wd1Var3, k7.c6.e(-1, -1, 119));
        org.telegram.ui.Components.wb0 wb0Var = new org.telegram.ui.Components.wb0(activity, g6Var);
        this.h = wb0Var;
        wb0Var.a(0, LocaleController.getString(R.string.TodoMenuTabTask));
        wb0Var.a(1, LocaleController.getString(R.string.TodoMenuTabList));
        wd1Var2.addView(wb0Var, k7.c6.e(-1, 66, 80));
        wb0Var.setOnTabClick(new w3(ekVar, 22));
        qg.b c3 = aVar.c(wb0Var, null, false);
        c3.n(sg.b.k(g6Var));
        c3.h.f44870e = true;
        c3.o(AndroidUtilities.dp(8.0f));
        c3.p(AndroidUtilities.dp(16.0f));
        wb0Var.setBackground(c3);
        TextView textView = new TextView(activity);
        this.f43929f = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(wb0Var.getColor());
        org.telegram.messenger.y3.r(R.string.TodoMenuHint, textView, 17);
        wd1Var2.addView(textView, k7.c6.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        vv0 vv0Var = new vv0(this, 6);
        WeakHashMap weakHashMap = r0.j0.f46469a;
        r0.b0.j(wd1Var, vv0Var);
    }

    public final void b(boolean z4, org.telegram.ui.Components.qv0 qv0Var) {
        float f10;
        long j10;
        ValueAnimator valueAnimator = this.f43924a0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f43926b0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f11 = this.f43934x;
        float f12 = 0.0f;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f43924a0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final zd1 f40825b;

            {
                this.f40825b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        zd1 zd1Var = this.f40825b;
                        zd1Var.f43934x = floatValue;
                        zd1Var.f43925b.invalidate();
                        zd1Var.f43927c.invalidate();
                        zd1Var.e();
                        return;
                    default:
                        zd1 zd1Var2 = this.f40825b;
                        zd1Var2.getClass();
                        zd1Var2.f43935y = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f43924a0.addListener(new androidx.fragment.app.g(this, z4, qv0Var, 12));
        if (!z4) {
            j10 = 330;
        } else {
            j10 = 520;
        }
        ValueAnimator valueAnimator3 = this.f43924a0;
        org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
        valueAnimator3.setInterpolator(prVar);
        this.f43924a0.setDuration(j10);
        this.f43924a0.start();
        float f13 = this.f43935y;
        if (z4) {
            f12 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f13, f12);
        this.f43926b0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final zd1 f40825b;

            {
                this.f40825b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        zd1 zd1Var = this.f40825b;
                        zd1Var.f43934x = floatValue;
                        zd1Var.f43925b.invalidate();
                        zd1Var.f43927c.invalidate();
                        zd1Var.e();
                        return;
                    default:
                        zd1 zd1Var2 = this.f40825b;
                        zd1Var2.getClass();
                        zd1Var2.f43935y = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f43926b0.addListener(new vd1(0, this, z4));
        this.f43926b0.setDuration(((float) j10) * 1.5f);
        this.f43926b0.setInterpolator(prVar);
        this.f43926b0.start();
    }

    public final void c(boolean z4) {
        boolean z10;
        org.telegram.ui.Cells.t1 t1Var;
        org.telegram.ui.Components.qk0 qk0Var;
        if (z4 && (qk0Var = this.M) != null && qk0Var.getReactionsWindow() != null && !this.M.getReactionsWindow().f16049q) {
            this.M.e();
        } else if (this.X) {
        } else {
            this.X = true;
            this.T = false;
            ek ekVar = this.f43928e;
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
            b(false, new org.telegram.ui.Components.qv0(9, this, z10));
            this.f43925b.invalidate();
        }
    }

    public final void d() {
        int i10;
        ViewGroup viewGroup;
        if (!this.T) {
            wd1 wd1Var = this.f43925b;
            if (wd1Var.getWidth() > 0) {
                org.telegram.ui.Cells.t1 t1Var = this.H;
                if (t1Var != null) {
                    int[] iArr = new int[2];
                    t1Var.getLocationOnScreen(iArr);
                    int i11 = iArr[0];
                    i0.b bVar = this.f43930n;
                    this.R = i11 - bVar.f7757a;
                    float f10 = iArr[1] - bVar.f7758b;
                    this.S = f10;
                    if (!this.W) {
                        this.W = true;
                        this.U = f10;
                        if (this.P != null) {
                            float height = f10 + this.H.getHeight() + this.P.getHeight();
                            int height2 = wd1Var.getHeight();
                            i0.b bVar2 = this.f43930n;
                            if (height > ((height2 - bVar2.f7758b) - bVar2.d) - AndroidUtilities.dp(66.0f)) {
                                int height3 = wd1Var.getHeight();
                                i0.b bVar3 = this.f43930n;
                                this.U = ((((height3 - bVar3.f7758b) - bVar3.d) - AndroidUtilities.dp(66.0f)) - this.H.getHeight()) - this.P.getHeight();
                            }
                        }
                        int O2 = this.F.O2(this.L);
                        this.F.H2(O2);
                        float G2 = this.F.G2(O2);
                        float f11 = this.S;
                        this.V = f11;
                        float f12 = (int) G2;
                        int height4 = wd1Var.getHeight();
                        i0.b bVar4 = this.f43930n;
                        int dp = ((height4 - bVar4.f7758b) - bVar4.d) - AndroidUtilities.dp(78.0f);
                        TextView textView = this.f43929f;
                        if (f11 + f12 > dp - textView.getHeight()) {
                            int height5 = wd1Var.getHeight();
                            i0.b bVar5 = this.f43930n;
                            this.V = ((((height5 - bVar5.f7758b) - bVar5.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i10;
                        }
                        if (this.N != null) {
                            float height6 = this.V + f12 + viewGroup.getHeight();
                            int height7 = wd1Var.getHeight();
                            i0.b bVar6 = this.f43930n;
                            if (height6 > (((height7 - bVar6.f7758b) - bVar6.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) {
                                int height8 = wd1Var.getHeight();
                                i0.b bVar7 = this.f43930n;
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
        ek ekVar = this.f43928e;
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
                wd1 wd1Var = this.f43925b;
                int height2 = wd1Var.getHeight();
                i0.b bVar = this.f43930n;
                if (height > ((height2 - bVar.f7758b) - bVar.d) - AndroidUtilities.dp(66.0f)) {
                    int height3 = wd1Var.getHeight();
                    i0.b bVar2 = this.f43930n;
                    this.U = ((((height3 - bVar2.f7758b) - bVar2.d) - AndroidUtilities.dp(66.0f)) - this.H.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        xv0 xv0Var = this.G;
        float f15 = this.R;
        if (this.Y) {
            f10 = 1.0f;
        } else {
            f10 = this.f43934x;
        }
        xv0Var.setTranslationX(AndroidUtilities.lerp(f15, 0.0f, f10) + lerp2);
        xv0 xv0Var2 = this.G;
        float f16 = this.S;
        float f17 = this.U;
        if (this.Y) {
            f11 = 1.0f;
        } else {
            f11 = this.f43934x;
        }
        xv0Var2.setTranslationY(AndroidUtilities.lerp(f16, f17, f11));
        ViewGroup viewGroup2 = this.P;
        wd1 wd1Var2 = this.d;
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
            this.Q = wd1Var2.getMeasuredWidth() - (this.P.getX() - lerp2);
            this.P.setTranslationY(((this.G.getY() + this.G.getHeight()) - this.P.getTop()) - wd1Var2.getTop());
            this.P.setAlpha(this.f43934x);
            float lerp3 = AndroidUtilities.lerp(0.75f, 1.0f, this.f43934x);
            this.P.setScaleX(lerp3);
            this.P.setScaleY(lerp3);
        }
        xd1 xd1Var = this.F;
        float f19 = this.R;
        if (this.Y) {
            f12 = 1.0f;
        } else {
            f12 = this.f43934x;
        }
        xd1Var.setTranslationX(AndroidUtilities.lerp(f19, 0.0f, f12) + lerp);
        xd1 xd1Var2 = this.F;
        float f20 = this.S;
        float f21 = this.V;
        if (this.Y) {
            f13 = 1.0f;
        } else {
            f13 = this.f43934x;
        }
        xd1Var2.setTranslationY(AndroidUtilities.lerp(f20, f21, f13));
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
            this.O = wd1Var2.getMeasuredWidth() - (this.N.getX() - lerp2);
            this.N.setTranslationY(((this.F.getY() + ((int) G2)) - this.N.getTop()) - wd1Var2.getTop());
            this.N.setAlpha(this.f43934x);
            float lerp4 = AndroidUtilities.lerp(0.75f, 1.0f, this.f43934x);
            this.N.setScaleX(lerp4);
            this.N.setScaleY(lerp4);
        }
        if (this.Y) {
            this.G.setAlpha(this.f43934x);
            this.F.setAlpha(this.f43934x);
        }
        if (this.M != null) {
            float max = lerp2 + Math.max(0.0f, ((this.G.getBoundsLeft() + this.G.getBoundsRight()) / 2.0f) - (this.M.getWidth() * 0.8f));
            this.M.setTranslationX(max);
            this.M.setTranslationY(Math.max(0.0f, ((this.G.getY() - this.M.getHeight()) + AndroidUtilities.dp(22.0f)) - wd1Var2.getTop()));
            this.M.setAlpha(this.f43934x);
            View windowView = this.M.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.f43934x);
            }
        }
        TextView textView = this.f43929f;
        textView.setTranslationX(lerp);
        textView.setAlpha(this.f43934x);
        org.telegram.ui.Components.wb0 wb0Var = this.h;
        wb0Var.setSelectedTab(positionAnimated);
        wb0Var.setAlpha(this.f43934x);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        wd1 wd1Var = this.f43925b;
        setContentView(wd1Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 48;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        AndroidUtilities.applyEdgeToEdgeLayoutParams(attributes);
        window.setAttributes(attributes);
        wd1Var.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(wd1Var, !org.telegram.ui.ActionBar.k6.I.q());
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        super.show();
        org.telegram.ui.Components.im0.d(new d5(this, 28));
        this.K = true;
        b(true, null);
    }
}
