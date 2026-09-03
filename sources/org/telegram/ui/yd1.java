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
public final class yd1 extends Dialog {
    public final sg.b B;
    public final ng.a C;
    public MessageObject D;
    public boolean E;
    public wd1 F;
    public xv0 G;
    public org.telegram.ui.Cells.s1 H;
    public float I;
    public float J;
    public boolean K;
    public int L;
    public org.telegram.ui.Components.pk0 M;
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
    public wm Z;
    public final org.telegram.ui.ActionBar.f6 f40235a;
    public ValueAnimator f40236a0;
    public final vd1 f40237b;
    public ValueAnimator f40238b0;
    public final vd1 f40239c;
    public final vd1 d;
    public final gk e;
    public final TextView f40240f;
    public final org.telegram.ui.Components.vb0 h;
    public i0.b f40241n;
    public Bitmap f40242r;
    public BitmapShader f40243s;
    public Paint v;
    public Matrix f40244w;
    public float f40245x;
    public float f40246y;

    public yd1(Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, R.style.TransparentDialog);
        this.f40241n = i0.b.e;
        this.I = 0.0f;
        this.J = 0.0f;
        this.O = -1.0f;
        this.Q = -1.0f;
        this.X = false;
        this.f40235a = f6Var;
        vd1 vd1Var = new vd1(this, activity, 0);
        this.f40237b = vd1Var;
        vd1Var.setOnClickListener(new v31(this, 6));
        sg.b bVar = new sg.b();
        this.B = bVar;
        ng.a aVar = new ng.a(bVar);
        this.C = aVar;
        aVar.d = new ug.i(vd1Var);
        aVar.e = vd1Var;
        vd1 vd1Var2 = new vd1(this, activity, 1);
        this.f40239c = vd1Var2;
        vd1Var2.setClipToPadding(false);
        vd1Var.addView(vd1Var2, k7.b6.e(-1, -1, 119));
        gk gkVar = new gk(this, activity, 5);
        this.e = gkVar;
        gkVar.setAdapter(new gg.u(this, activity, 4));
        vd1Var2.addView(gkVar, k7.b6.e(-1, -1, 119));
        vd1 vd1Var3 = new vd1(this, activity, 2);
        this.d = vd1Var3;
        vd1Var2.addView(vd1Var3, k7.b6.e(-1, -1, 119));
        org.telegram.ui.Components.vb0 vb0Var = new org.telegram.ui.Components.vb0(activity, f6Var);
        this.h = vb0Var;
        vb0Var.a(0, LocaleController.getString(R.string.TodoMenuTabTask));
        vb0Var.a(1, LocaleController.getString(R.string.TodoMenuTabList));
        vd1Var2.addView(vb0Var, k7.b6.e(-1, 66, 80));
        vb0Var.setOnTabClick(new y3(gkVar, 22));
        pg.b c3 = aVar.c(vb0Var, null, false);
        c3.n(rg.b.k(f6Var));
        c3.h.e = true;
        c3.o(AndroidUtilities.dp(8.0f));
        c3.p(AndroidUtilities.dp(16.0f));
        vb0Var.setBackground(c3);
        TextView textView = new TextView(activity);
        this.f40240f = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(vb0Var.getColor());
        org.telegram.messenger.y3.r(R.string.TodoMenuHint, textView, 17);
        vd1Var2.addView(textView, k7.b6.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        vv0 vv0Var = new vv0(this, 6);
        WeakHashMap weakHashMap = r0.j0.f43142a;
        r0.b0.j(vd1Var, vv0Var);
    }

    public final void b(boolean z4, org.telegram.ui.Components.kv0 kv0Var) {
        float f10;
        long j10;
        ValueAnimator valueAnimator = this.f40236a0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f40238b0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f11 = this.f40245x;
        float f12 = 0.0f;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f40236a0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final yd1 f37806b;

            {
                this.f37806b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        yd1 yd1Var = this.f37806b;
                        yd1Var.f40245x = floatValue;
                        yd1Var.f40237b.invalidate();
                        yd1Var.f40239c.invalidate();
                        yd1Var.e();
                        return;
                    default:
                        yd1 yd1Var2 = this.f37806b;
                        yd1Var2.getClass();
                        yd1Var2.f40246y = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f40236a0.addListener(new androidx.fragment.app.g(this, z4, kv0Var, 12));
        if (!z4) {
            j10 = 330;
        } else {
            j10 = 520;
        }
        ValueAnimator valueAnimator3 = this.f40236a0;
        org.telegram.ui.Components.mr mrVar = org.telegram.ui.Components.mr.h;
        valueAnimator3.setInterpolator(mrVar);
        this.f40236a0.setDuration(j10);
        this.f40236a0.start();
        float f13 = this.f40246y;
        if (z4) {
            f12 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f13, f12);
        this.f40238b0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final yd1 f37806b;

            {
                this.f37806b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        yd1 yd1Var = this.f37806b;
                        yd1Var.f40245x = floatValue;
                        yd1Var.f40237b.invalidate();
                        yd1Var.f40239c.invalidate();
                        yd1Var.e();
                        return;
                    default:
                        yd1 yd1Var2 = this.f37806b;
                        yd1Var2.getClass();
                        yd1Var2.f40246y = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f40238b0.addListener(new s61(2, this, z4));
        this.f40238b0.setDuration(((float) j10) * 1.5f);
        this.f40238b0.setInterpolator(mrVar);
        this.f40238b0.start();
    }

    public final void c(boolean z4) {
        boolean z10;
        org.telegram.ui.Cells.s1 s1Var;
        org.telegram.ui.Components.pk0 pk0Var;
        if (z4 && (pk0Var = this.M) != null && pk0Var.getReactionsWindow() != null && !this.M.getReactionsWindow().f13973q) {
            this.M.e();
        } else if (this.X) {
        } else {
            this.X = true;
            this.T = false;
            gk gkVar = this.e;
            gkVar.l();
            if (gkVar.getCurrentPosition() == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z4 && z10) {
                org.telegram.ui.Cells.s1 s1Var2 = this.H;
                if (s1Var2 != null) {
                    s1Var2.setVisibility(4);
                    this.H.invalidate();
                }
            } else if (!z4 && (s1Var = this.H) != null) {
                s1Var.setVisibility(0);
                org.telegram.ui.Cells.s1 s1Var3 = this.H;
                s1Var3.H7 = -1;
                s1Var3.invalidate();
            }
            this.Y = !z4;
            d();
            b(false, new org.telegram.ui.Components.kv0(10, this, z10));
            this.f40237b.invalidate();
        }
    }

    public final void d() {
        int i10;
        ViewGroup viewGroup;
        if (!this.T) {
            vd1 vd1Var = this.f40237b;
            if (vd1Var.getWidth() > 0) {
                org.telegram.ui.Cells.s1 s1Var = this.H;
                if (s1Var != null) {
                    int[] iArr = new int[2];
                    s1Var.getLocationOnScreen(iArr);
                    int i11 = iArr[0];
                    i0.b bVar = this.f40241n;
                    this.R = i11 - bVar.f7196a;
                    float f10 = iArr[1] - bVar.f7197b;
                    this.S = f10;
                    if (!this.W) {
                        this.W = true;
                        this.U = f10;
                        if (this.P != null) {
                            float height = f10 + this.H.getHeight() + this.P.getHeight();
                            int height2 = vd1Var.getHeight();
                            i0.b bVar2 = this.f40241n;
                            if (height > ((height2 - bVar2.f7197b) - bVar2.d) - AndroidUtilities.dp(66.0f)) {
                                int height3 = vd1Var.getHeight();
                                i0.b bVar3 = this.f40241n;
                                this.U = ((((height3 - bVar3.f7197b) - bVar3.d) - AndroidUtilities.dp(66.0f)) - this.H.getHeight()) - this.P.getHeight();
                            }
                        }
                        int O2 = this.F.O2(this.L);
                        this.F.H2(O2);
                        float G2 = this.F.G2(O2);
                        float f11 = this.S;
                        this.V = f11;
                        float f12 = (int) G2;
                        int height4 = vd1Var.getHeight();
                        i0.b bVar4 = this.f40241n;
                        int dp = ((height4 - bVar4.f7197b) - bVar4.d) - AndroidUtilities.dp(78.0f);
                        TextView textView = this.f40240f;
                        if (f11 + f12 > dp - textView.getHeight()) {
                            int height5 = vd1Var.getHeight();
                            i0.b bVar5 = this.f40241n;
                            this.V = ((((height5 - bVar5.f7197b) - bVar5.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i10;
                        }
                        if (this.N != null) {
                            float height6 = this.V + f12 + viewGroup.getHeight();
                            int height7 = vd1Var.getHeight();
                            i0.b bVar6 = this.f40241n;
                            if (height6 > (((height7 - bVar6.f7197b) - bVar6.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) {
                                int height8 = vd1Var.getHeight();
                                i0.b bVar7 = this.f40241n;
                                this.V = (((((height8 - bVar7.f7197b) - bVar7.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - i10) - this.N.getHeight();
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
        gk gkVar = this.e;
        float positionAnimated = gkVar.getPositionAnimated();
        int i11 = 0;
        float lerp = AndroidUtilities.lerp(0, -gkVar.getWidth(), positionAnimated);
        float lerp2 = AndroidUtilities.lerp(gkVar.getWidth(), 0, positionAnimated);
        if (this.T) {
            ViewGroup viewGroup = this.P;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                float f14 = this.S;
                this.U = f14;
                float height = f14 + this.H.getHeight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                vd1 vd1Var = this.f40237b;
                int height2 = vd1Var.getHeight();
                i0.b bVar = this.f40241n;
                if (height > ((height2 - bVar.f7197b) - bVar.d) - AndroidUtilities.dp(66.0f)) {
                    int height3 = vd1Var.getHeight();
                    i0.b bVar2 = this.f40241n;
                    this.U = ((((height3 - bVar2.f7197b) - bVar2.d) - AndroidUtilities.dp(66.0f)) - this.H.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        xv0 xv0Var = this.G;
        float f15 = this.R;
        if (this.Y) {
            f10 = 1.0f;
        } else {
            f10 = this.f40245x;
        }
        xv0Var.setTranslationX(AndroidUtilities.lerp(f15, 0.0f, f10) + lerp2);
        xv0 xv0Var2 = this.G;
        float f16 = this.S;
        float f17 = this.U;
        if (this.Y) {
            f11 = 1.0f;
        } else {
            f11 = this.f40245x;
        }
        xv0Var2.setTranslationY(AndroidUtilities.lerp(f16, f17, f11));
        ViewGroup viewGroup2 = this.P;
        vd1 vd1Var2 = this.d;
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
            this.Q = vd1Var2.getMeasuredWidth() - (this.P.getX() - lerp2);
            this.P.setTranslationY(((this.G.getY() + this.G.getHeight()) - this.P.getTop()) - vd1Var2.getTop());
            this.P.setAlpha(this.f40245x);
            float lerp3 = AndroidUtilities.lerp(0.75f, 1.0f, this.f40245x);
            this.P.setScaleX(lerp3);
            this.P.setScaleY(lerp3);
        }
        wd1 wd1Var = this.F;
        float f19 = this.R;
        if (this.Y) {
            f12 = 1.0f;
        } else {
            f12 = this.f40245x;
        }
        wd1Var.setTranslationX(AndroidUtilities.lerp(f19, 0.0f, f12) + lerp);
        wd1 wd1Var2 = this.F;
        float f20 = this.S;
        float f21 = this.V;
        if (this.Y) {
            f13 = 1.0f;
        } else {
            f13 = this.f40245x;
        }
        wd1Var2.setTranslationY(AndroidUtilities.lerp(f20, f21, f13));
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
            this.O = vd1Var2.getMeasuredWidth() - (this.N.getX() - lerp2);
            this.N.setTranslationY(((this.F.getY() + ((int) G2)) - this.N.getTop()) - vd1Var2.getTop());
            this.N.setAlpha(this.f40245x);
            float lerp4 = AndroidUtilities.lerp(0.75f, 1.0f, this.f40245x);
            this.N.setScaleX(lerp4);
            this.N.setScaleY(lerp4);
        }
        if (this.Y) {
            this.G.setAlpha(this.f40245x);
            this.F.setAlpha(this.f40245x);
        }
        if (this.M != null) {
            float max = lerp2 + Math.max(0.0f, ((this.G.getBoundsLeft() + this.G.getBoundsRight()) / 2.0f) - (this.M.getWidth() * 0.8f));
            this.M.setTranslationX(max);
            this.M.setTranslationY(Math.max(0.0f, ((this.G.getY() - this.M.getHeight()) + AndroidUtilities.dp(22.0f)) - vd1Var2.getTop()));
            this.M.setAlpha(this.f40245x);
            View windowView = this.M.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.f40245x);
            }
        }
        TextView textView = this.f40240f;
        textView.setTranslationX(lerp);
        textView.setAlpha(this.f40245x);
        org.telegram.ui.Components.vb0 vb0Var = this.h;
        vb0Var.setSelectedTab(positionAnimated);
        vb0Var.setAlpha(this.f40245x);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        vd1 vd1Var = this.f40237b;
        setContentView(vd1Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 48;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        AndroidUtilities.applyEdgeToEdgeLayoutParams(attributes);
        window.setAttributes(attributes);
        vd1Var.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(vd1Var, !org.telegram.ui.ActionBar.j6.I.q());
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        super.show();
        org.telegram.ui.Components.hm0.d(new f5(this, 28));
        this.K = true;
        b(true, null);
    }
}
