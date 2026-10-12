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
public final class se1 extends Dialog {
    public final gh.b E;
    public final bh.b F;
    public MessageObject G;
    public boolean H;
    public qe1 I;
    public rw0 J;
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
    public final org.telegram.ui.ActionBar.c6 f40108a;
    public boolean f40109a0;
    public final pe1 f40110b;
    public boolean f40111b0;
    public final pe1 f40112c;
    public bn f40113c0;
    public final pe1 d;
    public ValueAnimator f40114d0;
    public final di.h1 e;
    public ValueAnimator f40115e0;
    public final TextView f40116f;
    public final org.telegram.ui.Components.tc0 h;
    public i0.b f40117n;
    public Bitmap f40118r;
    public BitmapShader f40119s;
    public Paint v;
    public Matrix f40120w;
    public float f40121x;
    public float f40122y;

    public se1(Activity activity, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity, R.style.TransparentDialog);
        this.f40117n = i0.b.e;
        this.L = 0.0f;
        this.M = 0.0f;
        this.R = -1.0f;
        this.T = -1.0f;
        this.f40109a0 = false;
        this.f40108a = c6Var;
        pe1 pe1Var = new pe1(this, activity, 0);
        this.f40110b = pe1Var;
        pe1Var.setOnClickListener(new v41(this, 5));
        gh.b bVar = new gh.b();
        this.E = bVar;
        bh.b bVar2 = new bh.b(bVar);
        this.F = bVar2;
        bVar2.f2745f = new ih.j(pe1Var);
        bVar2.f2746g = pe1Var;
        pe1 pe1Var2 = new pe1(this, activity, 1);
        this.f40112c = pe1Var2;
        pe1Var2.setClipToPadding(false);
        pe1Var.addView(pe1Var2, w7.a6.e(-1, -1, 119));
        di.h1 h1Var = new di.h1(this, activity, 8);
        this.e = h1Var;
        h1Var.setAdapter(new ow0(this, activity, 2));
        pe1Var2.addView(h1Var, w7.a6.e(-1, -1, 119));
        pe1 pe1Var3 = new pe1(this, activity, 2);
        this.d = pe1Var3;
        pe1Var2.addView(pe1Var3, w7.a6.e(-1, -1, 119));
        org.telegram.ui.Components.tc0 tc0Var = new org.telegram.ui.Components.tc0(activity, c6Var);
        this.h = tc0Var;
        tc0Var.a(0, LocaleController.getString(R.string.TodoMenuTabTask));
        tc0Var.a(1, LocaleController.getString(R.string.TodoMenuTabList));
        pe1Var2.addView(tc0Var, w7.a6.e(-1, 66, 80));
        tc0Var.setOnTabClick(new v3(h1Var, 25));
        dh.d c10 = bVar2.c(tc0Var, null, false);
        c10.o(fh.b.k(c6Var));
        c10.f6558j.e = true;
        c10.p(AndroidUtilities.dp(8.0f));
        c10.q(AndroidUtilities.dp(16.0f));
        tc0Var.setBackground(c10);
        TextView textView = new TextView(activity);
        this.f40116f = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(tc0Var.getColor());
        org.telegram.messenger.yh.l(R.string.TodoMenuHint, textView, 17);
        pe1Var2.addView(textView, w7.a6.a(-2.0f, 0.0f, 0.0f, 0.0f, 66.0f, -1, 80));
        pw0 pw0Var = new pw0(this, 6);
        WeakHashMap weakHashMap = r0.j0.f43732a;
        r0.b0.i(pe1Var, pw0Var);
    }

    public final void b(boolean z10, org.telegram.ui.Components.sn0 sn0Var) {
        float f7;
        long j10;
        ValueAnimator valueAnimator = this.f40114d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f40115e0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f10 = this.f40121x;
        float f11 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f40114d0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final se1 f37941b;

            {
                this.f37941b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        se1 se1Var = this.f37941b;
                        se1Var.f40121x = floatValue;
                        se1Var.f40110b.invalidate();
                        se1Var.f40112c.invalidate();
                        se1Var.e();
                        return;
                    default:
                        se1 se1Var2 = this.f37941b;
                        se1Var2.getClass();
                        se1Var2.f40122y = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f40114d0.addListener(new ah.q0(this, z10, sn0Var, 12));
        if (!z10) {
            j10 = 330;
        } else {
            j10 = 520;
        }
        ValueAnimator valueAnimator3 = this.f40114d0;
        org.telegram.ui.Components.es esVar = org.telegram.ui.Components.es.h;
        valueAnimator3.setInterpolator(esVar);
        this.f40114d0.setDuration(j10);
        this.f40114d0.start();
        float f12 = this.f40122y;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, f11);
        this.f40115e0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final se1 f37941b;

            {
                this.f37941b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        se1 se1Var = this.f37941b;
                        se1Var.f40121x = floatValue;
                        se1Var.f40110b.invalidate();
                        se1Var.f40112c.invalidate();
                        se1Var.e();
                        return;
                    default:
                        se1 se1Var2 = this.f37941b;
                        se1Var2.getClass();
                        se1Var2.f40122y = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f40115e0.addListener(new i50(11, this, z10));
        this.f40115e0.setDuration(((float) j10) * 1.5f);
        this.f40115e0.setInterpolator(esVar);
        this.f40115e0.start();
    }

    public final void c(boolean z10) {
        boolean z11;
        org.telegram.ui.Cells.u1 u1Var;
        org.telegram.ui.Components.gl0 gl0Var;
        if (z10 && (gl0Var = this.P) != null && gl0Var.getReactionsWindow() != null && !this.P.getReactionsWindow().f877q) {
            this.P.e();
        } else if (this.f40109a0) {
        } else {
            this.f40109a0 = true;
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
            this.f40111b0 = !z10;
            d();
            b(false, new org.telegram.ui.Components.sn0(14, this, z11));
            this.f40110b.invalidate();
        }
    }

    public final void d() {
        int i10;
        ViewGroup viewGroup;
        if (!this.W) {
            pe1 pe1Var = this.f40110b;
            if (pe1Var.getWidth() > 0) {
                org.telegram.ui.Cells.u1 u1Var = this.K;
                if (u1Var != null) {
                    int[] iArr = new int[2];
                    u1Var.getLocationOnScreen(iArr);
                    int i11 = iArr[0];
                    i0.b bVar = this.f40117n;
                    this.U = i11 - bVar.f10888a;
                    float f7 = iArr[1] - bVar.f10889b;
                    this.V = f7;
                    if (!this.Z) {
                        this.Z = true;
                        this.X = f7;
                        if (this.S != null) {
                            float height = f7 + this.K.getHeight() + this.S.getHeight();
                            int height2 = pe1Var.getHeight();
                            i0.b bVar2 = this.f40117n;
                            if (height > ((height2 - bVar2.f10889b) - bVar2.d) - AndroidUtilities.dp(66.0f)) {
                                int height3 = pe1Var.getHeight();
                                i0.b bVar3 = this.f40117n;
                                this.X = ((((height3 - bVar3.f10889b) - bVar3.d) - AndroidUtilities.dp(66.0f)) - this.K.getHeight()) - this.S.getHeight();
                            }
                        }
                        int O2 = this.I.O2(this.O);
                        this.I.H2(O2);
                        float G2 = this.I.G2(O2);
                        float f10 = this.V;
                        this.Y = f10;
                        float f11 = (int) G2;
                        int height4 = pe1Var.getHeight();
                        i0.b bVar4 = this.f40117n;
                        int dp = ((height4 - bVar4.f10889b) - bVar4.d) - AndroidUtilities.dp(78.0f);
                        TextView textView = this.f40116f;
                        if (f10 + f11 > dp - textView.getHeight()) {
                            int height5 = pe1Var.getHeight();
                            i0.b bVar5 = this.f40117n;
                            this.Y = ((((height5 - bVar5.f10889b) - bVar5.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i10;
                        }
                        if (this.Q != null) {
                            float height6 = this.Y + f11 + viewGroup.getHeight();
                            int height7 = pe1Var.getHeight();
                            i0.b bVar6 = this.f40117n;
                            if (height6 > (((height7 - bVar6.f10889b) - bVar6.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) {
                                int height8 = pe1Var.getHeight();
                                i0.b bVar7 = this.f40117n;
                                this.Y = (((((height8 - bVar7.f10889b) - bVar7.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i10) - this.Q.getHeight();
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
                pe1 pe1Var = this.f40110b;
                int height2 = pe1Var.getHeight();
                i0.b bVar = this.f40117n;
                if (height > ((height2 - bVar.f10889b) - bVar.d) - AndroidUtilities.dp(66.0f)) {
                    int height3 = pe1Var.getHeight();
                    i0.b bVar2 = this.f40117n;
                    this.X = ((((height3 - bVar2.f10889b) - bVar2.d) - AndroidUtilities.dp(66.0f)) - this.K.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        rw0 rw0Var = this.J;
        float f14 = this.U;
        if (this.f40111b0) {
            f7 = 1.0f;
        } else {
            f7 = this.f40121x;
        }
        rw0Var.setTranslationX(AndroidUtilities.lerp(f14, 0.0f, f7) + lerp2);
        rw0 rw0Var2 = this.J;
        float f15 = this.V;
        float f16 = this.X;
        if (this.f40111b0) {
            f10 = 1.0f;
        } else {
            f10 = this.f40121x;
        }
        rw0Var2.setTranslationY(AndroidUtilities.lerp(f15, f16, f10));
        ViewGroup viewGroup2 = this.S;
        pe1 pe1Var2 = this.d;
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
            this.T = pe1Var2.getMeasuredWidth() - (this.S.getX() - lerp2);
            this.S.setTranslationY(((this.J.getY() + this.J.getHeight()) - this.S.getTop()) - pe1Var2.getTop());
            this.S.setAlpha(this.f40121x);
            float lerp3 = AndroidUtilities.lerp(0.75f, 1.0f, this.f40121x);
            this.S.setScaleX(lerp3);
            this.S.setScaleY(lerp3);
        }
        qe1 qe1Var = this.I;
        float f18 = this.U;
        if (this.f40111b0) {
            f11 = 1.0f;
        } else {
            f11 = this.f40121x;
        }
        qe1Var.setTranslationX(AndroidUtilities.lerp(f18, 0.0f, f11) + lerp);
        qe1 qe1Var2 = this.I;
        float f19 = this.V;
        float f20 = this.Y;
        if (this.f40111b0) {
            f12 = 1.0f;
        } else {
            f12 = this.f40121x;
        }
        qe1Var2.setTranslationY(AndroidUtilities.lerp(f19, f20, f12));
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
            this.R = pe1Var2.getMeasuredWidth() - (this.Q.getX() - lerp2);
            this.Q.setTranslationY(((this.I.getY() + ((int) G2)) - this.Q.getTop()) - pe1Var2.getTop());
            this.Q.setAlpha(this.f40121x);
            float lerp4 = AndroidUtilities.lerp(0.75f, 1.0f, this.f40121x);
            this.Q.setScaleX(lerp4);
            this.Q.setScaleY(lerp4);
        }
        if (this.f40111b0) {
            this.J.setAlpha(this.f40121x);
            this.I.setAlpha(this.f40121x);
        }
        if (this.P != null) {
            float max = lerp2 + Math.max(0.0f, ((this.J.getBoundsLeft() + this.J.getBoundsRight()) / 2.0f) - (this.P.getWidth() * 0.8f));
            this.P.setTranslationX(max);
            this.P.setTranslationY(Math.max(0.0f, ((this.J.getY() - this.P.getHeight()) + AndroidUtilities.dp(22.0f)) - pe1Var2.getTop()));
            this.P.setAlpha(this.f40121x);
            View windowView = this.P.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.f40121x);
            }
        }
        TextView textView = this.f40116f;
        textView.setTranslationX(lerp);
        textView.setAlpha(this.f40121x);
        org.telegram.ui.Components.tc0 tc0Var = this.h;
        tc0Var.setSelectedTab(positionAnimated);
        tc0Var.setAlpha(this.f40121x);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        pe1 pe1Var = this.f40110b;
        setContentView(pe1Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 48;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        AndroidUtilities.applyEdgeToEdgeLayoutParams(attributes);
        window.setAttributes(attributes);
        pe1Var.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(pe1Var, !org.telegram.ui.ActionBar.g6.I.q());
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
