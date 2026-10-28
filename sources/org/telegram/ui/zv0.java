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
public final class zv0 extends Dialog {
    public float E;
    public final hh.b F;
    public final ch.b G;
    public MessageObject H;
    public boolean I;
    public xv0 J;
    public yv0 K;
    public org.telegram.ui.Cells.s1 L;
    public float M;
    public float N;
    public boolean O;
    public byte[] P;
    public org.telegram.ui.Components.gl0 Q;
    public ViewGroup R;
    public float S;
    public ViewGroup T;
    public float U;
    public boolean V;
    public float W;
    public float X;
    public boolean Y;
    public float Z;
    public final Context f46375a;
    public float f46376a0;
    public final org.telegram.ui.ActionBar.u6 f46377b;
    public boolean f46378b0;
    public final vv0 f46379c;
    public boolean f46380c0;
    public final vv0 d;
    public boolean f46381d0;
    public final vv0 e;
    public sm f46382e0;
    public final fi.h1 f46383f;
    public ValueAnimator f46384f0;
    public ValueAnimator f46385g0;
    public final TextView h;
    public final org.telegram.ui.Components.mc0 f46386n;
    public i0.b f46387r;
    public Bitmap f46388s;
    public BitmapShader v;
    public Paint f46389w;
    public Matrix f46390x;
    public float f46391y;

    public zv0(Activity activity, org.telegram.ui.ActionBar.u6 u6Var) {
        super(activity, R.style.TransparentDialog);
        this.f46387r = i0.b.e;
        this.M = 0.0f;
        this.N = 0.0f;
        this.S = -1.0f;
        this.U = -1.0f;
        this.f46380c0 = false;
        this.f46375a = activity;
        this.f46377b = u6Var;
        vv0 vv0Var = new vv0(this, activity, 0);
        this.f46379c = vv0Var;
        vv0Var.setOnClickListener(new z50(this, 24));
        hh.b bVar = new hh.b();
        this.F = bVar;
        ch.b bVar2 = new ch.b(bVar);
        this.G = bVar2;
        bVar2.f6301f = new jh.k(vv0Var);
        bVar2.f6302g = vv0Var;
        vv0 vv0Var2 = new vv0(this, activity, 1);
        this.d = vv0Var2;
        vv0Var2.setClipToPadding(false);
        vv0Var.addView(vv0Var2, org.telegram.ui.Components.kb1.i(-1, -1, 119));
        fi.h1 h1Var = new fi.h1(this, activity, 6);
        this.f46383f = h1Var;
        h1Var.setAdapter(new bi.e5(this, activity, 2));
        vv0Var2.addView(h1Var, org.telegram.ui.Components.kb1.i(-1, -1, 119));
        vv0 vv0Var3 = new vv0(this, activity, 2);
        this.e = vv0Var3;
        vv0Var2.addView(vv0Var3, org.telegram.ui.Components.kb1.i(-1, -1, 119));
        org.telegram.ui.Components.mc0 mc0Var = new org.telegram.ui.Components.mc0(activity, u6Var);
        this.f46386n = mc0Var;
        mc0Var.a(0, LocaleController.getString(R.string.PollMenuTabOption));
        mc0Var.a(1, LocaleController.getString(R.string.PollMenuTabPoll));
        vv0Var2.addView(mc0Var, org.telegram.ui.Components.kb1.i(-1, 66, 80));
        mc0Var.setOnTabClick(new t3(h1Var, 18));
        eh.d c10 = bVar2.c(mc0Var, null, false);
        c10.v(gh.c.k(u6Var));
        c10.f9965x.e = true;
        c10.w(AndroidUtilities.dp(8.0f));
        c10.x(AndroidUtilities.dp(16.0f));
        mc0Var.setBackground(c10);
        TextView textView = new TextView(activity);
        this.h = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(mc0Var.getColor());
        org.telegram.messenger.wh.k(R.string.PollMenuHint, textView, 17);
        vv0Var2.addView(textView, org.telegram.ui.Components.kb1.h(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        wv0 wv0Var = new wv0(this, 0);
        WeakHashMap weakHashMap = r0.i0.f47143a;
        r0.a0.i(vv0Var, wv0Var);
    }

    public final void b(boolean z10, pv0 pv0Var) {
        float f7;
        long j10;
        ValueAnimator valueAnimator = this.f46384f0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f46385g0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f10 = this.f46391y;
        float f11 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f46384f0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final zv0 f42799b;

            {
                this.f42799b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        zv0 zv0Var = this.f42799b;
                        zv0Var.f46391y = floatValue;
                        zv0Var.f46379c.invalidate();
                        zv0Var.d.invalidate();
                        xv0 xv0Var = zv0Var.J;
                        if (xv0Var != null) {
                            xv0Var.invalidate();
                        }
                        zv0Var.e();
                        return;
                    default:
                        zv0 zv0Var2 = this.f42799b;
                        zv0Var2.getClass();
                        zv0Var2.E = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f46384f0.addListener(new ai.l0(this, z10, pv0Var, 12));
        if (!z10) {
            j10 = 330;
        } else {
            j10 = 520;
        }
        ValueAnimator valueAnimator3 = this.f46384f0;
        org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.h;
        valueAnimator3.setInterpolator(dsVar);
        this.f46384f0.setDuration(j10);
        this.f46384f0.start();
        float f12 = this.E;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, f11);
        this.f46385g0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final zv0 f42799b;

            {
                this.f42799b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        zv0 zv0Var = this.f42799b;
                        zv0Var.f46391y = floatValue;
                        zv0Var.f46379c.invalidate();
                        zv0Var.d.invalidate();
                        xv0 xv0Var = zv0Var.J;
                        if (xv0Var != null) {
                            xv0Var.invalidate();
                        }
                        zv0Var.e();
                        return;
                    default:
                        zv0 zv0Var2 = this.f42799b;
                        zv0Var2.getClass();
                        zv0Var2.E = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f46385g0.addListener(new s40(5, this, z10));
        this.f46385g0.setDuration(((float) j10) * 1.5f);
        this.f46385g0.setInterpolator(dsVar);
        this.f46385g0.start();
    }

    public final void c(boolean z10) {
        boolean z11;
        org.telegram.ui.Cells.s1 s1Var;
        org.telegram.ui.Components.gl0 gl0Var;
        if (z10 && (gl0Var = this.Q) != null && gl0Var.getReactionsWindow() != null && !this.Q.getReactionsWindow().f4060q) {
            this.Q.e();
        } else if (this.f46380c0) {
        } else {
            this.f46380c0 = true;
            this.Y = false;
            fi.h1 h1Var = this.f46383f;
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
            this.f46381d0 = !z10;
            d();
            b(false, new pv0(this, z11));
            this.f46379c.invalidate();
        }
    }

    public final void d() {
        int i10;
        ViewGroup viewGroup;
        if (!this.Y) {
            vv0 vv0Var = this.f46379c;
            if (vv0Var.getWidth() > 0) {
                org.telegram.ui.Cells.s1 s1Var = this.L;
                if (s1Var != null) {
                    int[] iArr = new int[2];
                    s1Var.getLocationOnScreen(iArr);
                    int i11 = iArr[0];
                    i0.b bVar = this.f46387r;
                    this.W = i11 - bVar.f13449a;
                    float f7 = iArr[1] - bVar.f13450b;
                    this.X = f7;
                    if (!this.f46378b0) {
                        this.f46378b0 = true;
                        this.Z = f7;
                        if (this.T != null) {
                            float height = f7 + this.L.getHeight() + this.T.getHeight();
                            int height2 = vv0Var.getHeight();
                            i0.b bVar2 = this.f46387r;
                            if (height > ((height2 - bVar2.f13450b) - bVar2.d) - AndroidUtilities.dp(66.0f)) {
                                int height3 = vv0Var.getHeight();
                                i0.b bVar3 = this.f46387r;
                                this.Z = ((((height3 - bVar3.f13450b) - bVar3.d) - AndroidUtilities.dp(66.0f)) - this.L.getHeight()) - this.T.getHeight();
                            }
                        }
                        int I2 = this.J.I2(this.P);
                        this.J.H2(I2);
                        float G2 = this.J.G2(I2);
                        float f10 = this.X;
                        this.f46376a0 = f10;
                        float f11 = (int) G2;
                        int height4 = vv0Var.getHeight();
                        i0.b bVar4 = this.f46387r;
                        int dp = ((height4 - bVar4.f13450b) - bVar4.d) - AndroidUtilities.dp(78.0f);
                        TextView textView = this.h;
                        if (f10 + f11 > dp - textView.getHeight()) {
                            int height5 = vv0Var.getHeight();
                            i0.b bVar5 = this.f46387r;
                            this.f46376a0 = ((((height5 - bVar5.f13450b) - bVar5.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i10;
                        }
                        if (this.R != null) {
                            float height6 = this.f46376a0 + f11 + viewGroup.getHeight();
                            int height7 = vv0Var.getHeight();
                            i0.b bVar6 = this.f46387r;
                            if (height6 > (((height7 - bVar6.f13450b) - bVar6.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) {
                                int height8 = vv0Var.getHeight();
                                i0.b bVar7 = this.f46387r;
                                this.f46376a0 = (((((height8 - bVar7.f13450b) - bVar7.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i10) - this.R.getHeight();
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
        fi.h1 h1Var = this.f46383f;
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
                vv0 vv0Var = this.f46379c;
                int height2 = vv0Var.getHeight();
                i0.b bVar = this.f46387r;
                if (height > ((height2 - bVar.f13450b) - bVar.d) - AndroidUtilities.dp(66.0f)) {
                    int height3 = vv0Var.getHeight();
                    i0.b bVar2 = this.f46387r;
                    this.Z = ((((height3 - bVar2.f13450b) - bVar2.d) - AndroidUtilities.dp(66.0f)) - this.L.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        yv0 yv0Var = this.K;
        float f14 = this.W;
        if (this.f46381d0) {
            f7 = 1.0f;
        } else {
            f7 = this.f46391y;
        }
        yv0Var.setTranslationX(AndroidUtilities.lerp(f14, 0.0f, f7) + lerp2);
        yv0 yv0Var2 = this.K;
        float f15 = this.X;
        float f16 = this.Z;
        if (this.f46381d0) {
            f10 = 1.0f;
        } else {
            f10 = this.f46391y;
        }
        yv0Var2.setTranslationY(AndroidUtilities.lerp(f15, f16, f10));
        ViewGroup viewGroup2 = this.T;
        vv0 vv0Var2 = this.e;
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
            this.U = vv0Var2.getMeasuredWidth() - (this.T.getX() - lerp2);
            this.T.setTranslationY(((this.K.getY() + this.K.getHeight()) - this.T.getTop()) - vv0Var2.getTop());
            this.T.setAlpha(this.f46391y);
            float lerp3 = AndroidUtilities.lerp(0.75f, 1.0f, this.f46391y);
            this.T.setScaleX(lerp3);
            this.T.setScaleY(lerp3);
        }
        xv0 xv0Var = this.J;
        float f18 = this.W;
        if (this.f46381d0) {
            f11 = 1.0f;
        } else {
            f11 = this.f46391y;
        }
        xv0Var.setTranslationX(AndroidUtilities.lerp(f18, 0.0f, f11) + lerp);
        xv0 xv0Var2 = this.J;
        float f19 = this.X;
        float f20 = this.f46376a0;
        if (this.f46381d0) {
            f12 = 1.0f;
        } else {
            f12 = this.f46391y;
        }
        xv0Var2.setTranslationY(AndroidUtilities.lerp(f19, f20, f12));
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
            this.S = vv0Var2.getMeasuredWidth() - (this.R.getX() - lerp2);
            this.R.setTranslationY(((this.J.getY() + ((int) G2)) - this.R.getTop()) - vv0Var2.getTop());
            this.R.setAlpha(this.f46391y);
            float lerp4 = AndroidUtilities.lerp(0.75f, 1.0f, this.f46391y);
            this.R.setScaleX(lerp4);
            this.R.setScaleY(lerp4);
        }
        if (this.f46381d0) {
            this.K.setAlpha(this.f46391y);
            this.J.setAlpha(this.f46391y);
        }
        if (this.Q != null) {
            float max = lerp2 + Math.max(0.0f, ((this.K.getBoundsLeft() + this.K.getBoundsRight()) / 2.0f) - (this.Q.getWidth() * 0.8f));
            this.Q.setTranslationX(max);
            this.Q.setTranslationY(Math.max(0.0f, ((this.K.getY() - this.Q.getHeight()) + AndroidUtilities.dp(22.0f)) - vv0Var2.getTop()));
            this.Q.setAlpha(this.f46391y);
            View windowView = this.Q.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.f46391y);
            }
        }
        TextView textView = this.h;
        textView.setTranslationX(lerp);
        textView.setAlpha(this.f46391y);
        org.telegram.ui.Components.mc0 mc0Var = this.f46386n;
        mc0Var.setSelectedTab(positionAnimated);
        mc0Var.setAlpha(this.f46391y);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        vv0 vv0Var = this.f46379c;
        setContentView(vv0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 48;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        AndroidUtilities.applyEdgeToEdgeLayoutParams(attributes);
        window.setAttributes(attributes);
        vv0Var.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(vv0Var, !org.telegram.ui.ActionBar.y6.I.q());
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        super.show();
        org.telegram.ui.Components.in0.d(new e5(this, 15));
        this.O = true;
        b(true, null);
    }
}
