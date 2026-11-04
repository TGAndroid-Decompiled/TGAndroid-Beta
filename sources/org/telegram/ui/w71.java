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
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class w71 extends Dialog {
    public float E;
    public final si.b F;
    public final eh.c G;
    public org.telegram.messenger.zi H;
    public boolean I;
    public u71 J;
    public or0 K;
    public org.telegram.ui.Cells.q1 L;
    public float M;
    public float N;
    public boolean O;
    public int P;
    public org.telegram.ui.Components.li0 Q;
    public ViewGroup R;
    public float S;
    public ViewGroup T;
    public float U;
    public float V;
    public float W;
    public boolean X;
    public float Y;
    public float Z;
    public final org.telegram.ui.ActionBar.e6 f50731a;
    public boolean f50732a0;
    public final t71 f50733b;
    public boolean f50734b0;
    public final t71 f50735c;
    public boolean f50736c0;
    public final t71 d;
    public pl f50737d0;
    public final gi.g1 f50738e;
    public ValueAnimator f50739e0;
    public final TextView f50740f;
    public ValueAnimator f50741f0;
    public final org.telegram.ui.Components.ba0 h;
    public i0.b f50742n;
    public Bitmap f50743r;
    public BitmapShader f50744s;
    public Paint f50745w;
    public Matrix f50746x;
    public float f50747y;

    public w71(Activity activity, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity, 2131755352);
        this.f50742n = i0.b.f14494e;
        this.M = 0.0f;
        this.N = 0.0f;
        this.S = -1.0f;
        this.U = -1.0f;
        this.f50734b0 = false;
        this.f50731a = e6Var;
        t71 t71Var = new t71(this, activity, 0);
        this.f50733b = t71Var;
        t71Var.setOnClickListener(new cy0(this, 8));
        si.b bVar = new si.b();
        this.F = bVar;
        eh.c cVar = new eh.c(bVar, bVar, bVar);
        this.G = cVar;
        cVar.h = new kh.k(t71Var);
        cVar.f9986i = t71Var;
        t71 t71Var2 = new t71(this, activity, 1);
        this.f50735c = t71Var2;
        t71Var2.setClipToPadding(false);
        t71Var.addView(t71Var2, b8.mf.e(-1, -1, 119));
        gi.g1 g1Var = new gi.g1(7, activity, this);
        this.f50738e = g1Var;
        g1Var.setAdapter(new ci.o4(6, activity, this));
        t71Var2.addView(g1Var, b8.mf.e(-1, -1, 119));
        t71 t71Var3 = new t71(this, activity, 2);
        this.d = t71Var3;
        t71Var2.addView(t71Var3, b8.mf.e(-1, -1, 119));
        org.telegram.ui.Components.ba0 ba0Var = new org.telegram.ui.Components.ba0(activity, e6Var);
        this.h = ba0Var;
        ba0Var.a(0, org.telegram.messenger.bd.M0(2131744079, null));
        ba0Var.a(1, org.telegram.messenger.bd.M0(2131744080, null));
        t71Var2.addView(ba0Var, b8.mf.e(-1, 66, 80));
        ba0Var.setOnTabClick(new s3(g1Var, 24));
        gh.g c2 = cVar.c(ba0Var, null, false);
        c2.p(b8.cd.k(e6Var));
        c2.R.f12302e = true;
        c2.q(org.telegram.messenger.g0.L(8.0f));
        c2.r(org.telegram.messenger.g0.L(16.0f));
        ba0Var.setBackground(c2);
        TextView textView = new TextView(activity);
        this.f50740f = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(ba0Var.getColor());
        textView.setText(org.telegram.messenger.bd.M0(2131744081, null));
        textView.setGravity(17);
        t71Var2.addView(textView, b8.mf.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        mr0 mr0Var = new mr0(this, 5);
        WeakHashMap weakHashMap = r0.i0.f54015a;
        r0.a0.i(t71Var, mr0Var);
    }

    public final void b(boolean z10, org.telegram.ui.Components.up0 up0Var) {
        float f10;
        long j10;
        ValueAnimator valueAnimator = this.f50739e0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f50741f0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f11 = this.f50747y;
        float f12 = 0.0f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f50739e0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final w71 f49126b;

            {
                this.f49126b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        w71 w71Var = this.f49126b;
                        w71Var.f50747y = floatValue;
                        w71Var.f50733b.invalidate();
                        w71Var.f50735c.invalidate();
                        w71Var.e();
                        return;
                    default:
                        w71 w71Var2 = this.f49126b;
                        w71Var2.getClass();
                        w71Var2.E = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f50739e0.addListener(new androidx.fragment.app.g(this, z10, up0Var, 14));
        if (!z10) {
            j10 = 330;
        } else {
            j10 = 520;
        }
        ValueAnimator valueAnimator3 = this.f50739e0;
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        valueAnimator3.setInterpolator(xqVar);
        this.f50739e0.setDuration(j10);
        this.f50739e0.start();
        float f13 = this.E;
        if (z10) {
            f12 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f13, f12);
        this.f50741f0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final w71 f49126b;

            {
                this.f49126b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        w71 w71Var = this.f49126b;
                        w71Var.f50747y = floatValue;
                        w71Var.f50733b.invalidate();
                        w71Var.f50735c.invalidate();
                        w71Var.e();
                        return;
                    default:
                        w71 w71Var2 = this.f49126b;
                        w71Var2.getClass();
                        w71Var2.E = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f50741f0.addListener(new u40(10, this, z10));
        this.f50741f0.setDuration(((float) j10) * 1.5f);
        this.f50741f0.setInterpolator(xqVar);
        this.f50741f0.start();
    }

    public final void c(boolean z10) {
        boolean z11;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.ui.Components.li0 li0Var;
        if (z10 && (li0Var = this.Q) != null && li0Var.getReactionsWindow() != null && !this.Q.getReactionsWindow().f8945q) {
            this.Q.e();
        } else if (this.f50734b0) {
        } else {
            this.f50734b0 = true;
            this.X = false;
            gi.g1 g1Var = this.f50738e;
            g1Var.g();
            if (g1Var.getCurrentPosition() == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 && z11) {
                org.telegram.ui.Cells.q1 q1Var2 = this.L;
                if (q1Var2 != null) {
                    q1Var2.setVisibility(4);
                    this.L.invalidate();
                }
            } else if (!z10 && (q1Var = this.L) != null) {
                q1Var.setVisibility(0);
                org.telegram.ui.Cells.q1 q1Var3 = this.L;
                q1Var3.f29860b6 = -1;
                q1Var3.invalidate();
            }
            this.f50736c0 = !z10;
            d();
            b(false, new org.telegram.ui.Components.up0(14, this, z11));
            this.f50733b.invalidate();
        }
    }

    public final void d() {
        int i3;
        ViewGroup viewGroup;
        if (!this.X) {
            t71 t71Var = this.f50733b;
            if (t71Var.getWidth() > 0) {
                org.telegram.ui.Cells.q1 q1Var = this.L;
                if (q1Var != null) {
                    int[] iArr = new int[2];
                    q1Var.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    i0.b bVar = this.f50742n;
                    this.V = i10 - bVar.f14495a;
                    float f10 = iArr[1] - bVar.f14496b;
                    this.W = f10;
                    if (!this.f50732a0) {
                        this.f50732a0 = true;
                        this.Y = f10;
                        if (this.T != null) {
                            float height = f10 + this.L.getHeight() + this.T.getHeight();
                            int height2 = t71Var.getHeight();
                            i0.b bVar2 = this.f50742n;
                            if (height > ((height2 - bVar2.f14496b) - bVar2.d) - org.telegram.messenger.g0.L(66.0f)) {
                                int height3 = t71Var.getHeight();
                                i0.b bVar3 = this.f50742n;
                                this.Y = ((((height3 - bVar3.f14496b) - bVar3.d) - org.telegram.messenger.g0.L(66.0f)) - this.L.getHeight()) - this.T.getHeight();
                            }
                        }
                        int b22 = this.J.b2(this.P);
                        this.J.U1(b22);
                        float T1 = this.J.T1(b22);
                        float f11 = this.W;
                        this.Z = f11;
                        float f12 = (int) T1;
                        int height4 = t71Var.getHeight();
                        i0.b bVar4 = this.f50742n;
                        int L = ((height4 - bVar4.f14496b) - bVar4.d) - org.telegram.messenger.g0.L(78.0f);
                        TextView textView = this.f50740f;
                        if (f11 + f12 > L - textView.getHeight()) {
                            int height5 = t71Var.getHeight();
                            i0.b bVar5 = this.f50742n;
                            this.Z = ((((height5 - bVar5.f14496b) - bVar5.d) - org.telegram.messenger.g0.L(78.0f)) - textView.getHeight()) - i3;
                        }
                        if (this.R != null) {
                            float height6 = this.Z + f12 + viewGroup.getHeight();
                            int height7 = t71Var.getHeight();
                            i0.b bVar6 = this.f50742n;
                            if (height6 > (((height7 - bVar6.f14496b) - bVar6.d) - org.telegram.messenger.g0.L(78.0f)) - textView.getHeight()) {
                                int height8 = t71Var.getHeight();
                                i0.b bVar7 = this.f50742n;
                                this.Z = (((((height8 - bVar7.f14496b) - bVar7.d) - org.telegram.messenger.g0.L(78.0f)) - textView.getHeight()) - i3) - this.R.getHeight();
                            }
                        }
                    }
                    e();
                } else {
                    this.W = 0.0f;
                    this.V = 0.0f;
                }
                this.X = true;
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
        int i3;
        gi.g1 g1Var = this.f50738e;
        float positionAnimated = g1Var.getPositionAnimated();
        int i10 = 0;
        float W1 = org.telegram.messenger.g0.W1(positionAnimated, 0, -g1Var.getWidth());
        float W12 = org.telegram.messenger.g0.W1(positionAnimated, g1Var.getWidth(), 0);
        if (this.X) {
            ViewGroup viewGroup = this.T;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                float f14 = this.W;
                this.Y = f14;
                float height = f14 + this.L.getHeight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                t71 t71Var = this.f50733b;
                int height2 = t71Var.getHeight();
                i0.b bVar = this.f50742n;
                if (height > ((height2 - bVar.f14496b) - bVar.d) - org.telegram.messenger.g0.L(66.0f)) {
                    int height3 = t71Var.getHeight();
                    i0.b bVar2 = this.f50742n;
                    this.Y = ((((height3 - bVar2.f14496b) - bVar2.d) - org.telegram.messenger.g0.L(66.0f)) - this.L.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        or0 or0Var = this.K;
        float f15 = this.V;
        if (this.f50736c0) {
            f10 = 1.0f;
        } else {
            f10 = this.f50747y;
        }
        or0Var.setTranslationX(org.telegram.messenger.g0.T1(f15, 0.0f, f10) + W12);
        or0 or0Var2 = this.K;
        float f16 = this.W;
        float f17 = this.Y;
        if (this.f50736c0) {
            f11 = 1.0f;
        } else {
            f11 = this.f50747y;
        }
        or0Var2.setTranslationY(org.telegram.messenger.g0.T1(f16, f17, f11));
        ViewGroup viewGroup2 = this.T;
        t71 t71Var2 = this.d;
        if (viewGroup2 != null) {
            if (this.I) {
                viewGroup2.setTranslationX(((this.K.getPollButtonsLeft() + ((W12 + 0.0f) + this.K.getLeft())) - org.telegram.messenger.g0.L(8.0f)) - this.T.getLeft());
            } else {
                float f18 = W12 + 0.0f;
                if (this.K.X2()) {
                    i3 = org.telegram.messenger.g0.L(48.0f);
                } else {
                    i3 = 0;
                }
                viewGroup2.setTranslationX(((f18 + i3) + this.K.getLeft()) - this.T.getLeft());
            }
            this.U = t71Var2.getMeasuredWidth() - (this.T.getX() - W12);
            this.T.setTranslationY(((this.K.getY() + this.K.getHeight()) - this.T.getTop()) - t71Var2.getTop());
            this.T.setAlpha(this.f50747y);
            float T1 = org.telegram.messenger.g0.T1(0.75f, 1.0f, this.f50747y);
            this.T.setScaleX(T1);
            this.T.setScaleY(T1);
        }
        u71 u71Var = this.J;
        float f19 = this.V;
        if (this.f50736c0) {
            f12 = 1.0f;
        } else {
            f12 = this.f50747y;
        }
        u71Var.setTranslationX(org.telegram.messenger.g0.T1(f19, 0.0f, f12) + W1);
        u71 u71Var2 = this.J;
        float f20 = this.W;
        float f21 = this.Z;
        if (this.f50736c0) {
            f13 = 1.0f;
        } else {
            f13 = this.f50747y;
        }
        u71Var2.setTranslationY(org.telegram.messenger.g0.T1(f20, f21, f13));
        if (this.R != null) {
            int b22 = this.J.b2(this.P);
            this.J.U1(b22);
            float T12 = this.J.T1(b22);
            if (this.I) {
                this.R.setTranslationX(((this.J.getPollButtonsLeft() + ((W1 + 0.0f) + this.J.getLeft())) - org.telegram.messenger.g0.L(8.0f)) - this.R.getLeft());
            } else {
                ViewGroup viewGroup3 = this.R;
                float f22 = W1 + 0.0f;
                if (this.J.X2()) {
                    i10 = org.telegram.messenger.g0.L(48.0f);
                }
                viewGroup3.setTranslationX(((f22 + i10) + this.J.getLeft()) - this.R.getLeft());
            }
            this.S = t71Var2.getMeasuredWidth() - (this.R.getX() - W12);
            this.R.setTranslationY(((this.J.getY() + ((int) T12)) - this.R.getTop()) - t71Var2.getTop());
            this.R.setAlpha(this.f50747y);
            float T13 = org.telegram.messenger.g0.T1(0.75f, 1.0f, this.f50747y);
            this.R.setScaleX(T13);
            this.R.setScaleY(T13);
        }
        if (this.f50736c0) {
            this.K.setAlpha(this.f50747y);
            this.J.setAlpha(this.f50747y);
        }
        if (this.Q != null) {
            float max = W12 + Math.max(0.0f, ((this.K.getBoundsLeft() + this.K.getBoundsRight()) / 2.0f) - (this.Q.getWidth() * 0.8f));
            this.Q.setTranslationX(max);
            this.Q.setTranslationY(Math.max(0.0f, ((this.K.getY() - this.Q.getHeight()) + org.telegram.messenger.g0.L(22.0f)) - t71Var2.getTop()));
            this.Q.setAlpha(this.f50747y);
            View windowView = this.Q.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.f50747y);
            }
        }
        TextView textView = this.f50740f;
        textView.setTranslationX(W1);
        textView.setAlpha(this.f50747y);
        org.telegram.ui.Components.ba0 ba0Var = this.h;
        ba0Var.setSelectedTab(positionAnimated);
        ba0Var.setAlpha(this.f50747y);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(2131755178);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        t71 t71Var = this.f50733b;
        setContentView(t71Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 48;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        org.telegram.messenger.g0.m(attributes);
        window.setAttributes(attributes);
        t71Var.setSystemUiVisibility(1284);
        org.telegram.messenger.g0.o3(t71Var, !org.telegram.ui.ActionBar.k6.I.q());
    }

    @Override
    public final void show() {
        if (!org.telegram.messenger.g0.M1(getContext())) {
            return;
        }
        super.show();
        org.telegram.ui.Components.nk0.d(new c5(this, 28));
        this.O = true;
        b(true, null);
    }
}
