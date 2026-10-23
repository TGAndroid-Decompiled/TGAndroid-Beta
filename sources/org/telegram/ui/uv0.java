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
public final class uv0 extends Dialog {
    public float E;
    public final gh.b F;
    public final bh.b G;
    public MessageObject H;
    public boolean I;
    public sv0 J;
    public tv0 K;
    public org.telegram.ui.Cells.t1 L;
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
    public final Context f42514a;
    public float f42515a0;
    public final org.telegram.ui.ActionBar.g6 f42516b;
    public boolean f42517b0;
    public final qv0 f42518c;
    public boolean f42519c0;
    public final qv0 d;
    public boolean f42520d0;
    public final qv0 e;
    public om f42521e0;
    public final ei.h1 f42522f;
    public ValueAnimator f42523f0;
    public ValueAnimator f42524g0;
    public final TextView h;
    public final org.telegram.ui.Components.pc0 f42525n;
    public i0.b f42526r;
    public Bitmap f42527s;
    public BitmapShader v;
    public Paint f42528w;
    public Matrix f42529x;
    public float f42530y;

    public uv0(Activity activity, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity, R.style.TransparentDialog);
        this.f42526r = i0.b.e;
        this.M = 0.0f;
        this.N = 0.0f;
        this.S = -1.0f;
        this.U = -1.0f;
        this.f42519c0 = false;
        this.f42514a = activity;
        this.f42516b = g6Var;
        qv0 qv0Var = new qv0(this, activity, 0);
        this.f42518c = qv0Var;
        qv0Var.setOnClickListener(new w50(this, 22));
        gh.b bVar = new gh.b();
        this.F = bVar;
        bh.b bVar2 = new bh.b(bVar);
        this.G = bVar2;
        bVar2.f4365f = new ih.k(qv0Var);
        bVar2.f4366g = qv0Var;
        qv0 qv0Var2 = new qv0(this, activity, 1);
        this.d = qv0Var2;
        qv0Var2.setClipToPadding(false);
        qv0Var.addView(qv0Var2, w7.z5.e(-1, -1, 119));
        ei.h1 h1Var = new ei.h1(this, activity, 5);
        this.f42522f = h1Var;
        h1Var.setAdapter(new ai.j5(this, activity, 1));
        qv0Var2.addView(h1Var, w7.z5.e(-1, -1, 119));
        qv0 qv0Var3 = new qv0(this, activity, 2);
        this.e = qv0Var3;
        qv0Var2.addView(qv0Var3, w7.z5.e(-1, -1, 119));
        org.telegram.ui.Components.pc0 pc0Var = new org.telegram.ui.Components.pc0(activity, g6Var);
        this.f42525n = pc0Var;
        pc0Var.a(0, LocaleController.getString(R.string.PollMenuTabOption));
        pc0Var.a(1, LocaleController.getString(R.string.PollMenuTabPoll));
        qv0Var2.addView(pc0Var, w7.z5.e(-1, 66, 80));
        pc0Var.setOnTabClick(new u3(h1Var, 17));
        dh.d c10 = bVar2.c(pc0Var, null, false);
        c10.o(fh.c.k(g6Var));
        c10.v.e = true;
        c10.p(AndroidUtilities.dp(8.0f));
        c10.q(AndroidUtilities.dp(16.0f));
        pc0Var.setBackground(c10);
        TextView textView = new TextView(activity);
        this.h = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(pc0Var.getColor());
        org.telegram.messenger.sl.m(R.string.PollMenuHint, textView, 17);
        qv0Var2.addView(textView, w7.z5.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        rv0 rv0Var = new rv0(this, 0);
        WeakHashMap weakHashMap = r0.i0.f45242a;
        r0.a0.i(qv0Var, rv0Var);
    }

    public final void b(boolean z10, jv0 jv0Var) {
        float f7;
        long j10;
        ValueAnimator valueAnimator = this.f42523f0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f42524g0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f10 = this.f42530y;
        float f11 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f42523f0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final uv0 f39079b;

            {
                this.f39079b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        uv0 uv0Var = this.f39079b;
                        uv0Var.f42530y = floatValue;
                        uv0Var.f42518c.invalidate();
                        uv0Var.d.invalidate();
                        sv0 sv0Var = uv0Var.J;
                        if (sv0Var != null) {
                            sv0Var.invalidate();
                        }
                        uv0Var.e();
                        return;
                    default:
                        uv0 uv0Var2 = this.f39079b;
                        uv0Var2.getClass();
                        uv0Var2.E = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f42523f0.addListener(new ah.q0(this, z10, jv0Var, 10));
        if (!z10) {
            j10 = 330;
        } else {
            j10 = 520;
        }
        ValueAnimator valueAnimator3 = this.f42523f0;
        org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.h;
        valueAnimator3.setInterpolator(bsVar);
        this.f42523f0.setDuration(j10);
        this.f42523f0.start();
        float f12 = this.E;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, f11);
        this.f42524g0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final uv0 f39079b;

            {
                this.f39079b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        uv0 uv0Var = this.f39079b;
                        uv0Var.f42530y = floatValue;
                        uv0Var.f42518c.invalidate();
                        uv0Var.d.invalidate();
                        sv0 sv0Var = uv0Var.J;
                        if (sv0Var != null) {
                            sv0Var.invalidate();
                        }
                        uv0Var.e();
                        return;
                    default:
                        uv0 uv0Var2 = this.f39079b;
                        uv0Var2.getClass();
                        uv0Var2.E = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f42524g0.addListener(new o40(5, this, z10));
        this.f42524g0.setDuration(((float) j10) * 1.5f);
        this.f42524g0.setInterpolator(bsVar);
        this.f42524g0.start();
    }

    public final void c(boolean z10) {
        boolean z11;
        org.telegram.ui.Cells.t1 t1Var;
        org.telegram.ui.Components.gl0 gl0Var;
        if (z10 && (gl0Var = this.Q) != null && gl0Var.getReactionsWindow() != null && !this.Q.getReactionsWindow().f882q) {
            this.Q.e();
        } else if (this.f42519c0) {
        } else {
            this.f42519c0 = true;
            this.Y = false;
            ei.h1 h1Var = this.f42522f;
            h1Var.l();
            if (h1Var.getCurrentPosition() == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 && z11) {
                org.telegram.ui.Cells.t1 t1Var2 = this.L;
                if (t1Var2 != null) {
                    t1Var2.setVisibility(4);
                    this.L.invalidate();
                }
            } else if (!z10 && (t1Var = this.L) != null) {
                t1Var.setVisibility(0);
                org.telegram.ui.Cells.t1 t1Var3 = this.L;
                t1Var3.L7 = null;
                t1Var3.invalidate();
            }
            this.f42520d0 = !z10;
            d();
            b(false, new jv0(this, z11));
            this.f42518c.invalidate();
        }
    }

    public final void d() {
        int i10;
        ViewGroup viewGroup;
        if (!this.Y) {
            qv0 qv0Var = this.f42518c;
            if (qv0Var.getWidth() > 0) {
                org.telegram.ui.Cells.t1 t1Var = this.L;
                if (t1Var != null) {
                    int[] iArr = new int[2];
                    t1Var.getLocationOnScreen(iArr);
                    int i11 = iArr[0];
                    i0.b bVar = this.f42526r;
                    this.W = i11 - bVar.f12315a;
                    float f7 = iArr[1] - bVar.f12316b;
                    this.X = f7;
                    if (!this.f42517b0) {
                        this.f42517b0 = true;
                        this.Z = f7;
                        if (this.T != null) {
                            float height = f7 + this.L.getHeight() + this.T.getHeight();
                            int height2 = qv0Var.getHeight();
                            i0.b bVar2 = this.f42526r;
                            if (height > ((height2 - bVar2.f12316b) - bVar2.d) - AndroidUtilities.dp(66.0f)) {
                                int height3 = qv0Var.getHeight();
                                i0.b bVar3 = this.f42526r;
                                this.Z = ((((height3 - bVar3.f12316b) - bVar3.d) - AndroidUtilities.dp(66.0f)) - this.L.getHeight()) - this.T.getHeight();
                            }
                        }
                        int H2 = this.J.H2(this.P);
                        this.J.G2(H2);
                        float F2 = this.J.F2(H2);
                        float f10 = this.X;
                        this.f42515a0 = f10;
                        float f11 = (int) F2;
                        int height4 = qv0Var.getHeight();
                        i0.b bVar4 = this.f42526r;
                        int dp = ((height4 - bVar4.f12316b) - bVar4.d) - AndroidUtilities.dp(78.0f);
                        TextView textView = this.h;
                        if (f10 + f11 > dp - textView.getHeight()) {
                            int height5 = qv0Var.getHeight();
                            i0.b bVar5 = this.f42526r;
                            this.f42515a0 = ((((height5 - bVar5.f12316b) - bVar5.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i10;
                        }
                        if (this.R != null) {
                            float height6 = this.f42515a0 + f11 + viewGroup.getHeight();
                            int height7 = qv0Var.getHeight();
                            i0.b bVar6 = this.f42526r;
                            if (height6 > (((height7 - bVar6.f12316b) - bVar6.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) {
                                int height8 = qv0Var.getHeight();
                                i0.b bVar7 = this.f42526r;
                                this.f42515a0 = (((((height8 - bVar7.f12316b) - bVar7.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i10) - this.R.getHeight();
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
        ei.h1 h1Var = this.f42522f;
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
                qv0 qv0Var = this.f42518c;
                int height2 = qv0Var.getHeight();
                i0.b bVar = this.f42526r;
                if (height > ((height2 - bVar.f12316b) - bVar.d) - AndroidUtilities.dp(66.0f)) {
                    int height3 = qv0Var.getHeight();
                    i0.b bVar2 = this.f42526r;
                    this.Z = ((((height3 - bVar2.f12316b) - bVar2.d) - AndroidUtilities.dp(66.0f)) - this.L.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        tv0 tv0Var = this.K;
        float f14 = this.W;
        if (this.f42520d0) {
            f7 = 1.0f;
        } else {
            f7 = this.f42530y;
        }
        tv0Var.setTranslationX(AndroidUtilities.lerp(f14, 0.0f, f7) + lerp2);
        tv0 tv0Var2 = this.K;
        float f15 = this.X;
        float f16 = this.Z;
        if (this.f42520d0) {
            f10 = 1.0f;
        } else {
            f10 = this.f42530y;
        }
        tv0Var2.setTranslationY(AndroidUtilities.lerp(f15, f16, f10));
        ViewGroup viewGroup2 = this.T;
        qv0 qv0Var2 = this.e;
        if (viewGroup2 != null) {
            if (this.I) {
                viewGroup2.setTranslationX(((this.K.getPollButtonsLeft() + ((lerp2 + 0.0f) + this.K.getLeft())) - AndroidUtilities.dp(8.0f)) - this.T.getLeft());
            } else {
                float f17 = lerp2 + 0.0f;
                if (this.K.y3()) {
                    i10 = AndroidUtilities.dp(48.0f);
                } else {
                    i10 = 0;
                }
                viewGroup2.setTranslationX(((f17 + i10) + this.K.getLeft()) - this.T.getLeft());
            }
            this.U = qv0Var2.getMeasuredWidth() - (this.T.getX() - lerp2);
            this.T.setTranslationY(((this.K.getY() + this.K.getHeight()) - this.T.getTop()) - qv0Var2.getTop());
            this.T.setAlpha(this.f42530y);
            float lerp3 = AndroidUtilities.lerp(0.75f, 1.0f, this.f42530y);
            this.T.setScaleX(lerp3);
            this.T.setScaleY(lerp3);
        }
        sv0 sv0Var = this.J;
        float f18 = this.W;
        if (this.f42520d0) {
            f11 = 1.0f;
        } else {
            f11 = this.f42530y;
        }
        sv0Var.setTranslationX(AndroidUtilities.lerp(f18, 0.0f, f11) + lerp);
        sv0 sv0Var2 = this.J;
        float f19 = this.X;
        float f20 = this.f42515a0;
        if (this.f42520d0) {
            f12 = 1.0f;
        } else {
            f12 = this.f42530y;
        }
        sv0Var2.setTranslationY(AndroidUtilities.lerp(f19, f20, f12));
        if (this.R != null) {
            int H2 = this.J.H2(this.P);
            this.J.G2(H2);
            float F2 = this.J.F2(H2);
            if (this.I) {
                this.R.setTranslationX(((this.J.getPollButtonsLeft() + ((lerp + 0.0f) + this.J.getLeft())) - AndroidUtilities.dp(8.0f)) - this.R.getLeft());
            } else {
                ViewGroup viewGroup3 = this.R;
                float f21 = lerp + 0.0f;
                if (this.J.y3()) {
                    i11 = AndroidUtilities.dp(48.0f);
                }
                viewGroup3.setTranslationX(((f21 + i11) + this.J.getLeft()) - this.R.getLeft());
            }
            this.S = qv0Var2.getMeasuredWidth() - (this.R.getX() - lerp2);
            this.R.setTranslationY(((this.J.getY() + ((int) F2)) - this.R.getTop()) - qv0Var2.getTop());
            this.R.setAlpha(this.f42530y);
            float lerp4 = AndroidUtilities.lerp(0.75f, 1.0f, this.f42530y);
            this.R.setScaleX(lerp4);
            this.R.setScaleY(lerp4);
        }
        if (this.f42520d0) {
            this.K.setAlpha(this.f42530y);
            this.J.setAlpha(this.f42530y);
        }
        if (this.Q != null) {
            float max = lerp2 + Math.max(0.0f, ((this.K.getBoundsLeft() + this.K.getBoundsRight()) / 2.0f) - (this.Q.getWidth() * 0.8f));
            this.Q.setTranslationX(max);
            this.Q.setTranslationY(Math.max(0.0f, ((this.K.getY() - this.Q.getHeight()) + AndroidUtilities.dp(22.0f)) - qv0Var2.getTop()));
            this.Q.setAlpha(this.f42530y);
            View windowView = this.Q.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.f42530y);
            }
        }
        TextView textView = this.h;
        textView.setTranslationX(lerp);
        textView.setAlpha(this.f42530y);
        org.telegram.ui.Components.pc0 pc0Var = this.f42525n;
        pc0Var.setSelectedTab(positionAnimated);
        pc0Var.setAlpha(this.f42530y);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        qv0 qv0Var = this.f42518c;
        setContentView(qv0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 48;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        AndroidUtilities.applyEdgeToEdgeLayoutParams(attributes);
        window.setAttributes(attributes);
        qv0Var.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(qv0Var, !org.telegram.ui.ActionBar.k6.I.q());
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        super.show();
        org.telegram.ui.Components.cn0.d(new f5(this, 15));
        this.O = true;
        b(true, null);
    }
}
