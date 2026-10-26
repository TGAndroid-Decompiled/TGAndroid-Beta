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
public final class xv0 extends Dialog {
    public float E;
    public final hh.b F;
    public final ch.b G;
    public MessageObject H;
    public boolean I;
    public vv0 J;
    public wv0 K;
    public org.telegram.ui.Cells.s1 L;
    public float M;
    public float N;
    public boolean O;
    public byte[] P;
    public org.telegram.ui.Components.fl0 Q;
    public ViewGroup R;
    public float S;
    public ViewGroup T;
    public float U;
    public boolean V;
    public float W;
    public float X;
    public boolean Y;
    public float Z;
    public final Context f45871a;
    public float f45872a0;
    public final org.telegram.ui.ActionBar.u6 f45873b;
    public boolean f45874b0;
    public final tv0 f45875c;
    public boolean f45876c0;
    public final tv0 d;
    public boolean f45877d0;
    public final tv0 e;
    public qm f45878e0;
    public final fi.h1 f45879f;
    public ValueAnimator f45880f0;
    public ValueAnimator f45881g0;
    public final TextView h;
    public final org.telegram.ui.Components.lc0 f45882n;
    public i0.b f45883r;
    public Bitmap f45884s;
    public BitmapShader v;
    public Paint f45885w;
    public Matrix f45886x;
    public float f45887y;

    public xv0(Activity activity, org.telegram.ui.ActionBar.u6 u6Var) {
        super(activity, R.style.TransparentDialog);
        this.f45883r = i0.b.e;
        this.M = 0.0f;
        this.N = 0.0f;
        this.S = -1.0f;
        this.U = -1.0f;
        this.f45876c0 = false;
        this.f45871a = activity;
        this.f45873b = u6Var;
        tv0 tv0Var = new tv0(this, activity, 0);
        this.f45875c = tv0Var;
        tv0Var.setOnClickListener(new x50(this, 24));
        hh.b bVar = new hh.b();
        this.F = bVar;
        ch.b bVar2 = new ch.b(bVar);
        this.G = bVar2;
        bVar2.f6301f = new jh.k(tv0Var);
        bVar2.f6302g = tv0Var;
        tv0 tv0Var2 = new tv0(this, activity, 1);
        this.d = tv0Var2;
        tv0Var2.setClipToPadding(false);
        tv0Var.addView(tv0Var2, org.telegram.ui.Components.gb1.i(-1, -1, 119));
        fi.h1 h1Var = new fi.h1(this, activity, 6);
        this.f45879f = h1Var;
        h1Var.setAdapter(new bi.e5(this, activity, 2));
        tv0Var2.addView(h1Var, org.telegram.ui.Components.gb1.i(-1, -1, 119));
        tv0 tv0Var3 = new tv0(this, activity, 2);
        this.e = tv0Var3;
        tv0Var2.addView(tv0Var3, org.telegram.ui.Components.gb1.i(-1, -1, 119));
        org.telegram.ui.Components.lc0 lc0Var = new org.telegram.ui.Components.lc0(activity, u6Var);
        this.f45882n = lc0Var;
        lc0Var.a(0, LocaleController.getString(R.string.PollMenuTabOption));
        lc0Var.a(1, LocaleController.getString(R.string.PollMenuTabPoll));
        tv0Var2.addView(lc0Var, org.telegram.ui.Components.gb1.i(-1, 66, 80));
        lc0Var.setOnTabClick(new t3(h1Var, 18));
        eh.d c10 = bVar2.c(lc0Var, null, false);
        c10.v(gh.c.k(u6Var));
        c10.f9966x.e = true;
        c10.w(AndroidUtilities.dp(8.0f));
        c10.x(AndroidUtilities.dp(16.0f));
        lc0Var.setBackground(c10);
        TextView textView = new TextView(activity);
        this.h = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(lc0Var.getColor());
        org.telegram.messenger.vh.k(R.string.PollMenuHint, textView, 17);
        tv0Var2.addView(textView, org.telegram.ui.Components.gb1.h(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        uv0 uv0Var = new uv0(this, 0);
        WeakHashMap weakHashMap = r0.i0.f47108a;
        r0.a0.i(tv0Var, uv0Var);
    }

    public final void b(boolean z10, nv0 nv0Var) {
        float f7;
        long j10;
        ValueAnimator valueAnimator = this.f45880f0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f45881g0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f10 = this.f45887y;
        float f11 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f45880f0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final xv0 f42298b;

            {
                this.f42298b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        xv0 xv0Var = this.f42298b;
                        xv0Var.f45887y = floatValue;
                        xv0Var.f45875c.invalidate();
                        xv0Var.d.invalidate();
                        vv0 vv0Var = xv0Var.J;
                        if (vv0Var != null) {
                            vv0Var.invalidate();
                        }
                        xv0Var.e();
                        return;
                    default:
                        xv0 xv0Var2 = this.f42298b;
                        xv0Var2.getClass();
                        xv0Var2.E = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f45880f0.addListener(new ai.l0(this, z10, nv0Var, 12));
        if (!z10) {
            j10 = 330;
        } else {
            j10 = 520;
        }
        ValueAnimator valueAnimator3 = this.f45880f0;
        org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.h;
        valueAnimator3.setInterpolator(dsVar);
        this.f45880f0.setDuration(j10);
        this.f45880f0.start();
        float f12 = this.E;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, f11);
        this.f45881g0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final xv0 f42298b;

            {
                this.f42298b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        xv0 xv0Var = this.f42298b;
                        xv0Var.f45887y = floatValue;
                        xv0Var.f45875c.invalidate();
                        xv0Var.d.invalidate();
                        vv0 vv0Var = xv0Var.J;
                        if (vv0Var != null) {
                            vv0Var.invalidate();
                        }
                        xv0Var.e();
                        return;
                    default:
                        xv0 xv0Var2 = this.f42298b;
                        xv0Var2.getClass();
                        xv0Var2.E = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f45881g0.addListener(new q40(5, this, z10));
        this.f45881g0.setDuration(((float) j10) * 1.5f);
        this.f45881g0.setInterpolator(dsVar);
        this.f45881g0.start();
    }

    public final void c(boolean z10) {
        boolean z11;
        org.telegram.ui.Cells.s1 s1Var;
        org.telegram.ui.Components.fl0 fl0Var;
        if (z10 && (fl0Var = this.Q) != null && fl0Var.getReactionsWindow() != null && !this.Q.getReactionsWindow().f4060q) {
            this.Q.e();
        } else if (this.f45876c0) {
        } else {
            this.f45876c0 = true;
            this.Y = false;
            fi.h1 h1Var = this.f45879f;
            h1Var.l();
            if (h1Var.getCurrentPosition() == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 && z11) {
                org.telegram.ui.Cells.s1 s1Var2 = this.L;
                if (s1Var2 != null) {
                    s1Var2.setVisibility(4);
                    this.L.invalidate();
                }
            } else if (!z10 && (s1Var = this.L) != null) {
                s1Var.setVisibility(0);
                org.telegram.ui.Cells.s1 s1Var3 = this.L;
                s1Var3.L7 = null;
                s1Var3.invalidate();
            }
            this.f45877d0 = !z10;
            d();
            b(false, new nv0(this, z11));
            this.f45875c.invalidate();
        }
    }

    public final void d() {
        int i10;
        ViewGroup viewGroup;
        if (!this.Y) {
            tv0 tv0Var = this.f45875c;
            if (tv0Var.getWidth() > 0) {
                org.telegram.ui.Cells.s1 s1Var = this.L;
                if (s1Var != null) {
                    int[] iArr = new int[2];
                    s1Var.getLocationOnScreen(iArr);
                    int i11 = iArr[0];
                    i0.b bVar = this.f45883r;
                    this.W = i11 - bVar.f13450a;
                    float f7 = iArr[1] - bVar.f13451b;
                    this.X = f7;
                    if (!this.f45874b0) {
                        this.f45874b0 = true;
                        this.Z = f7;
                        if (this.T != null) {
                            float height = f7 + this.L.getHeight() + this.T.getHeight();
                            int height2 = tv0Var.getHeight();
                            i0.b bVar2 = this.f45883r;
                            if (height > ((height2 - bVar2.f13451b) - bVar2.d) - AndroidUtilities.dp(66.0f)) {
                                int height3 = tv0Var.getHeight();
                                i0.b bVar3 = this.f45883r;
                                this.Z = ((((height3 - bVar3.f13451b) - bVar3.d) - AndroidUtilities.dp(66.0f)) - this.L.getHeight()) - this.T.getHeight();
                            }
                        }
                        int I2 = this.J.I2(this.P);
                        this.J.H2(I2);
                        float G2 = this.J.G2(I2);
                        float f10 = this.X;
                        this.f45872a0 = f10;
                        float f11 = (int) G2;
                        int height4 = tv0Var.getHeight();
                        i0.b bVar4 = this.f45883r;
                        int dp = ((height4 - bVar4.f13451b) - bVar4.d) - AndroidUtilities.dp(78.0f);
                        TextView textView = this.h;
                        if (f10 + f11 > dp - textView.getHeight()) {
                            int height5 = tv0Var.getHeight();
                            i0.b bVar5 = this.f45883r;
                            this.f45872a0 = ((((height5 - bVar5.f13451b) - bVar5.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i10;
                        }
                        if (this.R != null) {
                            float height6 = this.f45872a0 + f11 + viewGroup.getHeight();
                            int height7 = tv0Var.getHeight();
                            i0.b bVar6 = this.f45883r;
                            if (height6 > (((height7 - bVar6.f13451b) - bVar6.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) {
                                int height8 = tv0Var.getHeight();
                                i0.b bVar7 = this.f45883r;
                                this.f45872a0 = (((((height8 - bVar7.f13451b) - bVar7.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i10) - this.R.getHeight();
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
        fi.h1 h1Var = this.f45879f;
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
                tv0 tv0Var = this.f45875c;
                int height2 = tv0Var.getHeight();
                i0.b bVar = this.f45883r;
                if (height > ((height2 - bVar.f13451b) - bVar.d) - AndroidUtilities.dp(66.0f)) {
                    int height3 = tv0Var.getHeight();
                    i0.b bVar2 = this.f45883r;
                    this.Z = ((((height3 - bVar2.f13451b) - bVar2.d) - AndroidUtilities.dp(66.0f)) - this.L.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        wv0 wv0Var = this.K;
        float f14 = this.W;
        if (this.f45877d0) {
            f7 = 1.0f;
        } else {
            f7 = this.f45887y;
        }
        wv0Var.setTranslationX(AndroidUtilities.lerp(f14, 0.0f, f7) + lerp2);
        wv0 wv0Var2 = this.K;
        float f15 = this.X;
        float f16 = this.Z;
        if (this.f45877d0) {
            f10 = 1.0f;
        } else {
            f10 = this.f45887y;
        }
        wv0Var2.setTranslationY(AndroidUtilities.lerp(f15, f16, f10));
        ViewGroup viewGroup2 = this.T;
        tv0 tv0Var2 = this.e;
        if (viewGroup2 != null) {
            if (this.I) {
                viewGroup2.setTranslationX(((this.K.getPollButtonsLeft() + ((lerp2 + 0.0f) + this.K.getLeft())) - AndroidUtilities.dp(8.0f)) - this.T.getLeft());
            } else {
                float f17 = lerp2 + 0.0f;
                if (this.K.B3()) {
                    i10 = AndroidUtilities.dp(48.0f);
                } else {
                    i10 = 0;
                }
                viewGroup2.setTranslationX(((f17 + i10) + this.K.getLeft()) - this.T.getLeft());
            }
            this.U = tv0Var2.getMeasuredWidth() - (this.T.getX() - lerp2);
            this.T.setTranslationY(((this.K.getY() + this.K.getHeight()) - this.T.getTop()) - tv0Var2.getTop());
            this.T.setAlpha(this.f45887y);
            float lerp3 = AndroidUtilities.lerp(0.75f, 1.0f, this.f45887y);
            this.T.setScaleX(lerp3);
            this.T.setScaleY(lerp3);
        }
        vv0 vv0Var = this.J;
        float f18 = this.W;
        if (this.f45877d0) {
            f11 = 1.0f;
        } else {
            f11 = this.f45887y;
        }
        vv0Var.setTranslationX(AndroidUtilities.lerp(f18, 0.0f, f11) + lerp);
        vv0 vv0Var2 = this.J;
        float f19 = this.X;
        float f20 = this.f45872a0;
        if (this.f45877d0) {
            f12 = 1.0f;
        } else {
            f12 = this.f45887y;
        }
        vv0Var2.setTranslationY(AndroidUtilities.lerp(f19, f20, f12));
        if (this.R != null) {
            int I2 = this.J.I2(this.P);
            this.J.H2(I2);
            float G2 = this.J.G2(I2);
            if (this.I) {
                this.R.setTranslationX(((this.J.getPollButtonsLeft() + ((lerp + 0.0f) + this.J.getLeft())) - AndroidUtilities.dp(8.0f)) - this.R.getLeft());
            } else {
                ViewGroup viewGroup3 = this.R;
                float f21 = lerp + 0.0f;
                if (this.J.B3()) {
                    i11 = AndroidUtilities.dp(48.0f);
                }
                viewGroup3.setTranslationX(((f21 + i11) + this.J.getLeft()) - this.R.getLeft());
            }
            this.S = tv0Var2.getMeasuredWidth() - (this.R.getX() - lerp2);
            this.R.setTranslationY(((this.J.getY() + ((int) G2)) - this.R.getTop()) - tv0Var2.getTop());
            this.R.setAlpha(this.f45887y);
            float lerp4 = AndroidUtilities.lerp(0.75f, 1.0f, this.f45887y);
            this.R.setScaleX(lerp4);
            this.R.setScaleY(lerp4);
        }
        if (this.f45877d0) {
            this.K.setAlpha(this.f45887y);
            this.J.setAlpha(this.f45887y);
        }
        if (this.Q != null) {
            float max = lerp2 + Math.max(0.0f, ((this.K.getBoundsLeft() + this.K.getBoundsRight()) / 2.0f) - (this.Q.getWidth() * 0.8f));
            this.Q.setTranslationX(max);
            this.Q.setTranslationY(Math.max(0.0f, ((this.K.getY() - this.Q.getHeight()) + AndroidUtilities.dp(22.0f)) - tv0Var2.getTop()));
            this.Q.setAlpha(this.f45887y);
            View windowView = this.Q.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.f45887y);
            }
        }
        TextView textView = this.h;
        textView.setTranslationX(lerp);
        textView.setAlpha(this.f45887y);
        org.telegram.ui.Components.lc0 lc0Var = this.f45882n;
        lc0Var.setSelectedTab(positionAnimated);
        lc0Var.setAlpha(this.f45887y);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        tv0 tv0Var = this.f45875c;
        setContentView(tv0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 48;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        AndroidUtilities.applyEdgeToEdgeLayoutParams(attributes);
        window.setAttributes(attributes);
        tv0Var.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(tv0Var, !org.telegram.ui.ActionBar.y6.I.q());
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        super.show();
        org.telegram.ui.Components.hn0.d(new e5(this, 15));
        this.O = true;
        b(true, null);
    }
}
