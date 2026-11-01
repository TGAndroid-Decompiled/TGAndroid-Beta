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
public final class v91 extends Dialog {
    public float D;
    public final hi.b E;
    public final tg.b F;
    public org.telegram.messenger.kj G;
    public boolean H;
    public t91 I;
    public it0 J;
    public org.telegram.ui.Cells.q1 K;
    public float L;
    public float M;
    public boolean N;
    public int O;
    public org.telegram.ui.Components.nj0 P;
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
    public final org.telegram.ui.ActionBar.p6 f42448a;
    public boolean f42449a0;
    public final s91 f42450b;
    public boolean f42451b0;
    public final s91 f42452c;
    public pm f42453c0;
    public final s91 d;
    public ValueAnimator f42454d0;
    public final hk e;
    public ValueAnimator f42455e0;
    public final TextView f42456f;
    public final org.telegram.ui.Components.ya0 h;
    public i0.c f42457n;
    public Bitmap f42458r;
    public BitmapShader f42459s;
    public Paint f42460w;
    public Matrix f42461x;
    public float f42462y;

    public v91(Activity activity, org.telegram.ui.ActionBar.p6 p6Var) {
        super(activity, 2131755352);
        this.f42457n = i0.c.e;
        this.L = 0.0f;
        this.M = 0.0f;
        this.R = -1.0f;
        this.T = -1.0f;
        this.f42449a0 = false;
        this.f42448a = p6Var;
        s91 s91Var = new s91(this, activity, 0);
        this.f42450b = s91Var;
        s91Var.setOnClickListener(new zz0(this, 8));
        hi.b bVar = new hi.b();
        this.E = bVar;
        tg.b bVar2 = new tg.b(bVar, bVar, bVar);
        this.F = bVar2;
        bVar2.h = new zg.h(s91Var);
        bVar2.f48713i = s91Var;
        s91 s91Var2 = new s91(this, activity, 1);
        this.f42452c = s91Var2;
        s91Var2.setClipToPadding(false);
        s91Var.addView(s91Var2, w7.b6.e(-1, -1, 119));
        hk hkVar = new hk(this, activity, 4);
        this.e = hkVar;
        hkVar.setAdapter(new mg.s(this, activity, 5));
        s91Var2.addView(hkVar, w7.b6.e(-1, -1, 119));
        s91 s91Var3 = new s91(this, activity, 2);
        this.d = s91Var3;
        s91Var2.addView(s91Var3, w7.b6.e(-1, -1, 119));
        org.telegram.ui.Components.ya0 ya0Var = new org.telegram.ui.Components.ya0(activity, p6Var);
        this.h = ya0Var;
        ya0Var.a(0, org.telegram.messenger.dd.L0(2131744094, null));
        ya0Var.a(1, org.telegram.messenger.dd.L0(2131744095, null));
        s91Var2.addView(ya0Var, w7.b6.e(-1, 66, 80));
        ya0Var.setOnTabClick(new s3(hkVar, 24));
        vg.f c10 = bVar2.c(ya0Var, null, false);
        c10.o(w7.b9.k(p6Var));
        c10.P.e = true;
        c10.p(org.telegram.messenger.i0.L(8.0f));
        c10.q(org.telegram.messenger.i0.L(16.0f));
        ya0Var.setBackground(c10);
        TextView textView = new TextView(activity);
        this.f42456f = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(ya0Var.getColor());
        textView.setText(org.telegram.messenger.dd.L0(2131744096, null));
        textView.setGravity(17);
        s91Var2.addView(textView, w7.b6.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        gt0 gt0Var = new gt0(this, 5);
        WeakHashMap weakHashMap = r0.h0.f46134a;
        r0.z.i(s91Var, gt0Var);
    }

    public final void b(boolean z10, xv0 xv0Var) {
        float f7;
        long j10;
        ValueAnimator valueAnimator = this.f42454d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f42455e0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f10 = this.f42462y;
        float f11 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f42454d0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final v91 f40735b;

            {
                this.f40735b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        v91 v91Var = this.f40735b;
                        v91Var.f42462y = floatValue;
                        v91Var.f42450b.invalidate();
                        v91Var.f42452c.invalidate();
                        v91Var.e();
                        return;
                    default:
                        v91 v91Var2 = this.f40735b;
                        v91Var2.getClass();
                        v91Var2.D = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f42454d0.addListener(new androidx.fragment.app.g(this, z10, xv0Var, 11));
        if (!z10) {
            j10 = 330;
        } else {
            j10 = 520;
        }
        ValueAnimator valueAnimator3 = this.f42454d0;
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        valueAnimator3.setInterpolator(grVar);
        this.f42454d0.setDuration(j10);
        this.f42454d0.start();
        float f12 = this.D;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, f11);
        this.f42455e0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final v91 f40735b;

            {
                this.f40735b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (r2) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        v91 v91Var = this.f40735b;
                        v91Var.f42462y = floatValue;
                        v91Var.f42450b.invalidate();
                        v91Var.f42452c.invalidate();
                        v91Var.e();
                        return;
                    default:
                        v91 v91Var2 = this.f40735b;
                        v91Var2.getClass();
                        v91Var2.D = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        return;
                }
            }
        });
        this.f42455e0.addListener(new org.telegram.ui.Components.ha0(26, this, z10));
        this.f42455e0.setDuration(((float) j10) * 1.5f);
        this.f42455e0.setInterpolator(grVar);
        this.f42455e0.start();
    }

    public final void c(boolean z10) {
        boolean z11;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.ui.Components.nj0 nj0Var;
        if (z10 && (nj0Var = this.P) != null && nj0Var.getReactionsWindow() != null && !this.P.getReactionsWindow().f48299q) {
            this.P.e();
        } else if (this.f42449a0) {
        } else {
            this.f42449a0 = true;
            this.W = false;
            hk hkVar = this.e;
            hkVar.l();
            if (hkVar.getCurrentPosition() == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 && z11) {
                org.telegram.ui.Cells.q1 q1Var2 = this.K;
                if (q1Var2 != null) {
                    q1Var2.setVisibility(4);
                    this.K.invalidate();
                }
            } else if (!z10 && (q1Var = this.K) != null) {
                q1Var.setVisibility(0);
                org.telegram.ui.Cells.q1 q1Var3 = this.K;
                q1Var3.f22491a6 = -1;
                q1Var3.invalidate();
            }
            this.f42451b0 = !z10;
            d();
            b(false, new xv0(3, this, z11));
            this.f42450b.invalidate();
        }
    }

    public final void d() {
        int i10;
        ViewGroup viewGroup;
        if (!this.W) {
            s91 s91Var = this.f42450b;
            if (s91Var.getWidth() > 0) {
                org.telegram.ui.Cells.q1 q1Var = this.K;
                if (q1Var != null) {
                    int[] iArr = new int[2];
                    q1Var.getLocationOnScreen(iArr);
                    int i11 = iArr[0];
                    i0.c cVar = this.f42457n;
                    this.U = i11 - cVar.f7766a;
                    float f7 = iArr[1] - cVar.f7767b;
                    this.V = f7;
                    if (!this.Z) {
                        this.Z = true;
                        this.X = f7;
                        if (this.S != null) {
                            float height = f7 + this.K.getHeight() + this.S.getHeight();
                            int height2 = s91Var.getHeight();
                            i0.c cVar2 = this.f42457n;
                            if (height > ((height2 - cVar2.f7767b) - cVar2.d) - org.telegram.messenger.i0.L(66.0f)) {
                                int height3 = s91Var.getHeight();
                                i0.c cVar3 = this.f42457n;
                                this.X = ((((height3 - cVar3.f7767b) - cVar3.d) - org.telegram.messenger.i0.L(66.0f)) - this.K.getHeight()) - this.S.getHeight();
                            }
                        }
                        int Z1 = this.I.Z1(this.O);
                        this.I.S1(Z1);
                        float R1 = this.I.R1(Z1);
                        float f10 = this.V;
                        this.Y = f10;
                        float f11 = (int) R1;
                        int height4 = s91Var.getHeight();
                        i0.c cVar4 = this.f42457n;
                        int L = ((height4 - cVar4.f7767b) - cVar4.d) - org.telegram.messenger.i0.L(78.0f);
                        TextView textView = this.f42456f;
                        if (f10 + f11 > L - textView.getHeight()) {
                            int height5 = s91Var.getHeight();
                            i0.c cVar5 = this.f42457n;
                            this.Y = ((((height5 - cVar5.f7767b) - cVar5.d) - org.telegram.messenger.i0.L(78.0f)) - textView.getHeight()) - i10;
                        }
                        if (this.Q != null) {
                            float height6 = this.Y + f11 + viewGroup.getHeight();
                            int height7 = s91Var.getHeight();
                            i0.c cVar6 = this.f42457n;
                            if (height6 > (((height7 - cVar6.f7767b) - cVar6.d) - org.telegram.messenger.i0.L(78.0f)) - textView.getHeight()) {
                                int height8 = s91Var.getHeight();
                                i0.c cVar7 = this.f42457n;
                                this.Y = (((((height8 - cVar7.f7767b) - cVar7.d) - org.telegram.messenger.i0.L(78.0f)) - textView.getHeight()) - i10) - this.Q.getHeight();
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
        hk hkVar = this.e;
        float positionAnimated = hkVar.getPositionAnimated();
        int i11 = 0;
        float W1 = org.telegram.messenger.i0.W1(positionAnimated, 0, -hkVar.getWidth());
        float W12 = org.telegram.messenger.i0.W1(positionAnimated, hkVar.getWidth(), 0);
        if (this.W) {
            ViewGroup viewGroup = this.S;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                float f13 = this.V;
                this.X = f13;
                float height = f13 + this.K.getHeight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                s91 s91Var = this.f42450b;
                int height2 = s91Var.getHeight();
                i0.c cVar = this.f42457n;
                if (height > ((height2 - cVar.f7767b) - cVar.d) - org.telegram.messenger.i0.L(66.0f)) {
                    int height3 = s91Var.getHeight();
                    i0.c cVar2 = this.f42457n;
                    this.X = ((((height3 - cVar2.f7767b) - cVar2.d) - org.telegram.messenger.i0.L(66.0f)) - this.K.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        it0 it0Var = this.J;
        float f14 = this.U;
        if (this.f42451b0) {
            f7 = 1.0f;
        } else {
            f7 = this.f42462y;
        }
        it0Var.setTranslationX(org.telegram.messenger.i0.T1(f14, 0.0f, f7) + W12);
        it0 it0Var2 = this.J;
        float f15 = this.V;
        float f16 = this.X;
        if (this.f42451b0) {
            f10 = 1.0f;
        } else {
            f10 = this.f42462y;
        }
        it0Var2.setTranslationY(org.telegram.messenger.i0.T1(f15, f16, f10));
        ViewGroup viewGroup2 = this.S;
        s91 s91Var2 = this.d;
        if (viewGroup2 != null) {
            if (this.H) {
                viewGroup2.setTranslationX(((this.J.getPollButtonsLeft() + ((W12 + 0.0f) + this.J.getLeft())) - org.telegram.messenger.i0.L(8.0f)) - this.S.getLeft());
            } else {
                float f17 = W12 + 0.0f;
                if (this.J.V2()) {
                    i10 = org.telegram.messenger.i0.L(48.0f);
                } else {
                    i10 = 0;
                }
                viewGroup2.setTranslationX(((f17 + i10) + this.J.getLeft()) - this.S.getLeft());
            }
            this.T = s91Var2.getMeasuredWidth() - (this.S.getX() - W12);
            this.S.setTranslationY(((this.J.getY() + this.J.getHeight()) - this.S.getTop()) - s91Var2.getTop());
            this.S.setAlpha(this.f42462y);
            float T1 = org.telegram.messenger.i0.T1(0.75f, 1.0f, this.f42462y);
            this.S.setScaleX(T1);
            this.S.setScaleY(T1);
        }
        t91 t91Var = this.I;
        float f18 = this.U;
        if (this.f42451b0) {
            f11 = 1.0f;
        } else {
            f11 = this.f42462y;
        }
        t91Var.setTranslationX(org.telegram.messenger.i0.T1(f18, 0.0f, f11) + W1);
        t91 t91Var2 = this.I;
        float f19 = this.V;
        float f20 = this.Y;
        if (this.f42451b0) {
            f12 = 1.0f;
        } else {
            f12 = this.f42462y;
        }
        t91Var2.setTranslationY(org.telegram.messenger.i0.T1(f19, f20, f12));
        if (this.Q != null) {
            int Z1 = this.I.Z1(this.O);
            this.I.S1(Z1);
            float R1 = this.I.R1(Z1);
            if (this.H) {
                this.Q.setTranslationX(((this.I.getPollButtonsLeft() + ((W1 + 0.0f) + this.I.getLeft())) - org.telegram.messenger.i0.L(8.0f)) - this.Q.getLeft());
            } else {
                ViewGroup viewGroup3 = this.Q;
                float f21 = W1 + 0.0f;
                if (this.I.V2()) {
                    i11 = org.telegram.messenger.i0.L(48.0f);
                }
                viewGroup3.setTranslationX(((f21 + i11) + this.I.getLeft()) - this.Q.getLeft());
            }
            this.R = s91Var2.getMeasuredWidth() - (this.Q.getX() - W12);
            this.Q.setTranslationY(((this.I.getY() + ((int) R1)) - this.Q.getTop()) - s91Var2.getTop());
            this.Q.setAlpha(this.f42462y);
            float T12 = org.telegram.messenger.i0.T1(0.75f, 1.0f, this.f42462y);
            this.Q.setScaleX(T12);
            this.Q.setScaleY(T12);
        }
        if (this.f42451b0) {
            this.J.setAlpha(this.f42462y);
            this.I.setAlpha(this.f42462y);
        }
        if (this.P != null) {
            float max = W12 + Math.max(0.0f, ((this.J.getBoundsLeft() + this.J.getBoundsRight()) / 2.0f) - (this.P.getWidth() * 0.8f));
            this.P.setTranslationX(max);
            this.P.setTranslationY(Math.max(0.0f, ((this.J.getY() - this.P.getHeight()) + org.telegram.messenger.i0.L(22.0f)) - s91Var2.getTop()));
            this.P.setAlpha(this.f42462y);
            View windowView = this.P.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.f42462y);
            }
        }
        TextView textView = this.f42456f;
        textView.setTranslationX(W1);
        textView.setAlpha(this.f42462y);
        org.telegram.ui.Components.ya0 ya0Var = this.h;
        ya0Var.setSelectedTab(positionAnimated);
        ya0Var.setAlpha(this.f42462y);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(2131755178);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        s91 s91Var = this.f42450b;
        setContentView(s91Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 48;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        org.telegram.messenger.i0.m(attributes);
        window.setAttributes(attributes);
        s91Var.setSystemUiVisibility(1284);
        org.telegram.messenger.i0.n3(s91Var, !org.telegram.ui.ActionBar.t6.I.q());
    }

    @Override
    public final void show() {
        if (!org.telegram.messenger.i0.M1(getContext())) {
            return;
        }
        super.show();
        org.telegram.ui.Components.ol0.d(new z4(this, 28));
        this.N = true;
        b(true, null);
    }
}
