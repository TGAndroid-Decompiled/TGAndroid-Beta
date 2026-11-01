package org.telegram.ui.web;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import jg.z2;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a30;
import org.telegram.messenger.dd;
import org.telegram.messenger.k6;
import org.telegram.messenger.r20;
import org.telegram.messenger.uz;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ha0;
import org.telegram.ui.Components.qz;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.z60;
import org.telegram.ui.Wallet.a6;
import org.telegram.ui.Wallet.m2;
import org.telegram.ui.h4;
import org.telegram.ui.l3;
import org.telegram.ui.u3;
import org.telegram.ui.zd;
import w7.b6;
import w7.m6;
public abstract class l1 extends FrameLayout {
    public boolean A0;
    public int D;
    public final TextPaint E;
    public int F;
    public float G;
    public final z2 H;
    public final z2 I;
    public final ImageView J;
    public final org.telegram.ui.Cells.y K;
    public final ImageView L;
    public final org.telegram.ui.ActionBar.c2 M;
    public final org.telegram.ui.Cells.y N;
    public final ImageView O;
    public final a6 P;
    public final org.telegram.ui.Cells.y Q;
    public final ImageView R;
    public final org.telegram.ui.Cells.y S;
    public boolean T;
    public float U;
    public final zd V;
    public boolean W;
    public final RectF f42894a;
    public float f42895a0;
    public final bg.h[] f42896b;
    public final zd f42897b0;
    public float f42898c;
    public int f42899c0;
    public final float[] d;
    public final a80 f42900d0;
    public final boolean[] e;
    public boolean f42901e0;
    public final Paint[] f42902f;
    public r20 f42903f0;
    public int f42904g0;
    public final Paint[] h;
    public int f42905h0;
    public int f42906i0;
    public int f42907j0;
    public ValueAnimator f42908k0;
    public int f42909l0;
    public int m0;
    public final Paint[] f42910n;
    public int f42911n0;
    public boolean f42912o0;
    public boolean f42913p0;
    public boolean f42914q0;
    public final Paint f42915r;
    public final li.k f42916r0;
    public final Paint f42917s;
    public boolean f42918s0;
    public ValueAnimator f42919t0;
    public boolean f42920u0;
    public ag.e0 f42921v0;
    public final Paint f42922w;
    public ValueAnimator f42923w0;
    public int f42924x;
    public float f42925x0;
    public int f42926y;
    public long f42927y0;
    public final i1 f42928z0;

    public l1(Context context) {
        super(context);
        this.f42894a = new RectF();
        this.f42896b = new bg.h[2];
        this.f42898c = 0.0f;
        this.d = new float[2];
        this.e = new boolean[3];
        this.f42902f = new Paint[2];
        this.h = new Paint[2];
        this.f42910n = new Paint[2];
        this.f42915r = new Paint(1);
        this.f42917s = new Paint(1);
        this.f42922w = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.E = textPaint;
        this.F = org.telegram.messenger.i0.L(56.0f);
        this.G = 1.0f;
        this.U = 0.0f;
        this.f42895a0 = 0.0f;
        this.f42904g0 = -1;
        this.f42916r0 = new li.k(23);
        final org.telegram.ui.m0 m0Var = (org.telegram.ui.m0) this;
        this.f42928z0 = new i1(m0Var, 0);
        this.A0 = false;
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        textPaint.setTextSize(org.telegram.messenger.i0.L(18.33f));
        for (int i10 = 0; i10 < 2; i10++) {
            this.f42902f[i10] = new Paint(1);
            this.h[i10] = new Paint(1);
            this.f42910n[i10] = new Paint(1);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, b6.e(-1, 56, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        addView(frameLayout2, b6.e(-1, 56, 87));
        z2 z2Var = new z2(context, 10);
        this.H = z2Var;
        z2Var.setOrientation(0);
        addView(z2Var, b6.e(-2, 56, 83));
        ImageView imageView = new ImageView(context);
        this.L = imageView;
        imageView.setContentDescription(dd.L0(2131754878, null));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(false);
        this.M = c2Var;
        c2Var.f20203k = 200.0f;
        c2Var.c(false, 1.0f);
        imageView.setImageDrawable(c2Var);
        org.telegram.ui.Cells.y h02 = t6.h0(1090519039, 1, -1);
        this.N = h02;
        imageView.setBackground(h02);
        z2Var.addView(imageView, b6.o(54, 56));
        z2 z2Var2 = new z2(context, 11);
        this.I = z2Var2;
        z2Var2.setOrientation(0);
        addView(z2Var2, b6.e(-2, 56, 85));
        ImageView imageView2 = new ImageView(context);
        this.O = imageView2;
        imageView2.setScaleType(scaleType);
        a6 a6Var = new a6(m0Var);
        this.P = a6Var;
        imageView2.setImageDrawable(a6Var);
        a6Var.c();
        org.telegram.ui.Cells.y h03 = t6.h0(1090519039, 1, -1);
        this.Q = h03;
        imageView2.setBackground(h03);
        z2Var2.addView(imageView2, b6.o(54, 56));
        ImageView imageView3 = new ImageView(context);
        this.R = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(2131231245);
        imageView3.setColorFilter(new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_IN));
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                boolean z10;
                float f7;
                View childAt;
                int i11;
                int i12 = r2;
                org.telegram.ui.m0 m0Var2 = m0Var;
                switch (i12) {
                    case 0:
                        int i13 = 1;
                        if (m0Var2.getParent() instanceof ViewGroup) {
                            jg.v vVar = new jg.v(m0Var2, 2);
                            z60 F = z60.F((ViewGroup) m0Var2.getParent(), null, m0Var2.R);
                            F.f33044s = 0;
                            F.S(m0Var2.m0, m0Var2.f42911n0);
                            F.a0(0.0f, -org.telegram.messenger.i0.L(52.0f));
                            F.S = 200;
                            int w9 = t6.w(m0Var2.f42909l0, t6.r1(0.1f, m0Var2.m0));
                            F.f33033l0 = Integer.valueOf(w9);
                            int i14 = 0;
                            while (i14 < F.A.getChildCount()) {
                                if (i14 == F.A.getChildCount() - i13) {
                                    childAt = F.D;
                                } else {
                                    childAt = F.A.getChildAt(i14);
                                }
                                if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                                    int i15 = 0;
                                    while (i15 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
                                        View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i15);
                                        int i16 = i13;
                                        if (childAt2 instanceof org.telegram.ui.ActionBar.b1) {
                                            ((org.telegram.ui.ActionBar.b1) childAt2).setSelectorColor(w9);
                                        }
                                        i15++;
                                        i13 = i16;
                                    }
                                    i11 = i13;
                                } else {
                                    i11 = i13;
                                    if (childAt instanceof org.telegram.ui.ActionBar.b1) {
                                        ((org.telegram.ui.ActionBar.b1) childAt).setSelectorColor(w9);
                                    }
                                }
                                i14++;
                                i13 = i11;
                            }
                            int i17 = i13;
                            if (org.telegram.messenger.i0.B(m0Var2.f42909l0) > 0.721f) {
                                F.P(-1);
                                F.T(-986896);
                            } else {
                                F.P(-14737633);
                                F.T(-15592942);
                            }
                            int i18 = m0Var2.f42904g0;
                            if (i18 == 0) {
                                F.c(2131232264, dd.L0(2131747812, null), (Runnable) vVar.a(3), false);
                                F.c(2131232353, dd.L0(2131745853, null), (Runnable) vVar.a(1), false);
                                F.l(2131232362, dd.L0(2131745477, null), (Runnable) vVar.a(2), !m0Var2.f42914q0);
                                F.c(2131232360, dd.L0(2131745512, null), (Runnable) vVar.a(4), false);
                            } else if (i18 == i17) {
                                if (!m0Var2.f42913p0) {
                                    F.c(2131232264, dd.L0(2131747812, null), (Runnable) vVar.a(3), false);
                                    F.k();
                                }
                                if (m0Var2.f42912o0) {
                                    F.c(2131232057, dd.L0(2131742947, null), (Runnable) vVar.a(9), false);
                                }
                                w1 instantViewLoader = m0Var2.getInstantViewLoader();
                                if (instantViewLoader != null && (((!instantViewLoader.f43033g || !instantViewLoader.f43034i) && instantViewLoader.h == null && instantViewLoader.f43035j == null && !instantViewLoader.f43031c) || instantViewLoader.b() != null)) {
                                    F.c(2131231833, dd.L0(2131747804, null), (Runnable) vVar.a(10), false);
                                    org.telegram.ui.ActionBar.b1 y3 = F.y();
                                    if (instantViewLoader.b() != null) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    y3.setEnabled(z10);
                                    if (y3.isEnabled()) {
                                        f7 = 1.0f;
                                    } else {
                                        f7 = 0.5f;
                                    }
                                    y3.setAlpha(f7);
                                    m2 m2Var = new m2(27, y3, instantViewLoader);
                                    instantViewLoader.f43038m.add(m2Var);
                                    F.f33039p = new v1(1, instantViewLoader, m2Var);
                                }
                                F.c(2131232340, dd.L0(2131746355, null), (Runnable) vVar.a(5), false);
                                F.c(2131232353, dd.L0(2131745853, null), (Runnable) vVar.a(1), false);
                                F.c(2131232350, dd.L0(2131742968, null), (Runnable) vVar.a(6), false);
                                F.c(2131232362, dd.L0(2131745477, null), (Runnable) vVar.a(2), false);
                                F.k();
                                if (!m6.a(null).isEmpty()) {
                                    F.c(2131231918, dd.L0(2131742946, null), (Runnable) vVar.a(8), false);
                                }
                                F.c(2131231768, dd.L0(2131742965, null), (Runnable) vVar.a(7), false);
                                F.c(2131232360, dd.L0(2131745512, null), (Runnable) vVar.a(4), false);
                            }
                            F.f33039p = new org.telegram.ui.Components.voip.n0(m0Var2, 26);
                            F.Z();
                            return;
                        }
                        return;
                    default:
                        m0Var2.V.setText("");
                        return;
                }
            }
        });
        org.telegram.ui.Cells.y h04 = t6.h0(1090519039, 1, -1);
        this.S = h04;
        imageView3.setBackground(h04);
        imageView3.setContentDescription(dd.L0(2131754839, "AccDescrMoreOptions"));
        z2Var2.addView(imageView3, b6.o(54, 56));
        zd zdVar = new zd(context, 2);
        this.V = zdVar;
        zdVar.setVisibility(8);
        zdVar.setAlpha(0.0f);
        zdVar.setTextSize(1, 18.0f);
        zdVar.setSingleLine(true);
        zdVar.setHint(dd.L0(2131745853, null));
        zdVar.setBackgroundResource(0);
        zdVar.setCursorWidth(1.5f);
        zdVar.setGravity(112);
        zdVar.setClipToPadding(true);
        zdVar.setPadding(org.telegram.messenger.i0.L(58.0f), 0, org.telegram.messenger.i0.L(112.0f), 0);
        zdVar.setTranslationY(-org.telegram.messenger.i0.L(0.66f));
        zdVar.setInputType(zdVar.getInputType() | 524288);
        zdVar.setImeOptions(33554435);
        zdVar.setTextIsSelectable(false);
        zdVar.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (keyEvent != null) {
                            if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                                org.telegram.messenger.i0.v1(m0Var.V);
                                return false;
                            }
                            return false;
                        }
                        return false;
                    default:
                        if (i11 == 2) {
                            org.telegram.ui.m0 m0Var2 = m0Var;
                            ag.e0 e0Var = m0Var2.f42921v0;
                            if (e0Var != null) {
                                e0Var.a(m0Var2.f42897b0.getText().toString());
                            }
                            m0Var2.k(false);
                        }
                        return false;
                }
            }
        });
        zdVar.addTextChangedListener(new ag.a1(m0Var, 26));
        frameLayout.addView(zdVar, b6.e(-1, -1, 119));
        zd zdVar2 = new zd(context, 3);
        this.f42897b0 = zdVar2;
        zdVar2.setVisibility(8);
        zdVar2.setAlpha(0.0f);
        zdVar2.setTextSize(1, 15.66f);
        zdVar2.setSingleLine(true);
        this.f42899c0 = uz.f18541p0;
        zdVar2.setHint(dd.a0(null, null, 2131754351, g1.a().f42847a));
        zdVar2.setBackgroundResource(0);
        zdVar2.setCursorWidth(1.5f);
        zdVar2.setGravity(112);
        zdVar2.setInputType(zdVar2.getInputType() | 524288);
        zdVar2.setImeOptions(33554434);
        zdVar2.setTextIsSelectable(false);
        zdVar2.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (keyEvent != null) {
                            if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                                org.telegram.messenger.i0.v1(m0Var.V);
                                return false;
                            }
                            return false;
                        }
                        return false;
                    default:
                        if (i11 == 2) {
                            org.telegram.ui.m0 m0Var2 = m0Var;
                            ag.e0 e0Var = m0Var2.f42921v0;
                            if (e0Var != null) {
                                e0Var.a(m0Var2.f42897b0.getText().toString());
                            }
                            m0Var2.k(false);
                        }
                        return false;
                }
            }
        });
        frameLayout2.addView(zdVar2, b6.d(-1, -1.0f, 119, 48.0f, 0.0f, 12.0f, 0.0f));
        ImageView imageView4 = new ImageView(context);
        this.J = imageView4;
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(2131231270);
        org.telegram.ui.Cells.y h05 = t6.h0(1090519039, 1, -1);
        this.K = h05;
        imageView4.setBackground(h05);
        imageView4.setVisibility(8);
        imageView4.setAlpha(0.0f);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                boolean z10;
                float f7;
                View childAt;
                int i11;
                int i12 = r2;
                org.telegram.ui.m0 m0Var2 = m0Var;
                switch (i12) {
                    case 0:
                        int i13 = 1;
                        if (m0Var2.getParent() instanceof ViewGroup) {
                            jg.v vVar = new jg.v(m0Var2, 2);
                            z60 F = z60.F((ViewGroup) m0Var2.getParent(), null, m0Var2.R);
                            F.f33044s = 0;
                            F.S(m0Var2.m0, m0Var2.f42911n0);
                            F.a0(0.0f, -org.telegram.messenger.i0.L(52.0f));
                            F.S = 200;
                            int w9 = t6.w(m0Var2.f42909l0, t6.r1(0.1f, m0Var2.m0));
                            F.f33033l0 = Integer.valueOf(w9);
                            int i14 = 0;
                            while (i14 < F.A.getChildCount()) {
                                if (i14 == F.A.getChildCount() - i13) {
                                    childAt = F.D;
                                } else {
                                    childAt = F.A.getChildAt(i14);
                                }
                                if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                                    int i15 = 0;
                                    while (i15 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
                                        View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i15);
                                        int i16 = i13;
                                        if (childAt2 instanceof org.telegram.ui.ActionBar.b1) {
                                            ((org.telegram.ui.ActionBar.b1) childAt2).setSelectorColor(w9);
                                        }
                                        i15++;
                                        i13 = i16;
                                    }
                                    i11 = i13;
                                } else {
                                    i11 = i13;
                                    if (childAt instanceof org.telegram.ui.ActionBar.b1) {
                                        ((org.telegram.ui.ActionBar.b1) childAt).setSelectorColor(w9);
                                    }
                                }
                                i14++;
                                i13 = i11;
                            }
                            int i17 = i13;
                            if (org.telegram.messenger.i0.B(m0Var2.f42909l0) > 0.721f) {
                                F.P(-1);
                                F.T(-986896);
                            } else {
                                F.P(-14737633);
                                F.T(-15592942);
                            }
                            int i18 = m0Var2.f42904g0;
                            if (i18 == 0) {
                                F.c(2131232264, dd.L0(2131747812, null), (Runnable) vVar.a(3), false);
                                F.c(2131232353, dd.L0(2131745853, null), (Runnable) vVar.a(1), false);
                                F.l(2131232362, dd.L0(2131745477, null), (Runnable) vVar.a(2), !m0Var2.f42914q0);
                                F.c(2131232360, dd.L0(2131745512, null), (Runnable) vVar.a(4), false);
                            } else if (i18 == i17) {
                                if (!m0Var2.f42913p0) {
                                    F.c(2131232264, dd.L0(2131747812, null), (Runnable) vVar.a(3), false);
                                    F.k();
                                }
                                if (m0Var2.f42912o0) {
                                    F.c(2131232057, dd.L0(2131742947, null), (Runnable) vVar.a(9), false);
                                }
                                w1 instantViewLoader = m0Var2.getInstantViewLoader();
                                if (instantViewLoader != null && (((!instantViewLoader.f43033g || !instantViewLoader.f43034i) && instantViewLoader.h == null && instantViewLoader.f43035j == null && !instantViewLoader.f43031c) || instantViewLoader.b() != null)) {
                                    F.c(2131231833, dd.L0(2131747804, null), (Runnable) vVar.a(10), false);
                                    org.telegram.ui.ActionBar.b1 y3 = F.y();
                                    if (instantViewLoader.b() != null) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    y3.setEnabled(z10);
                                    if (y3.isEnabled()) {
                                        f7 = 1.0f;
                                    } else {
                                        f7 = 0.5f;
                                    }
                                    y3.setAlpha(f7);
                                    m2 m2Var = new m2(27, y3, instantViewLoader);
                                    instantViewLoader.f43038m.add(m2Var);
                                    F.f33039p = new v1(1, instantViewLoader, m2Var);
                                }
                                F.c(2131232340, dd.L0(2131746355, null), (Runnable) vVar.a(5), false);
                                F.c(2131232353, dd.L0(2131745853, null), (Runnable) vVar.a(1), false);
                                F.c(2131232350, dd.L0(2131742968, null), (Runnable) vVar.a(6), false);
                                F.c(2131232362, dd.L0(2131745477, null), (Runnable) vVar.a(2), false);
                                F.k();
                                if (!m6.a(null).isEmpty()) {
                                    F.c(2131231918, dd.L0(2131742946, null), (Runnable) vVar.a(8), false);
                                }
                                F.c(2131231768, dd.L0(2131742965, null), (Runnable) vVar.a(7), false);
                                F.c(2131232360, dd.L0(2131745512, null), (Runnable) vVar.a(4), false);
                            }
                            F.f33039p = new org.telegram.ui.Components.voip.n0(m0Var2, 26);
                            F.Z();
                            return;
                        }
                        return;
                    default:
                        m0Var2.V.setText("");
                        return;
                }
            }
        });
        addView(imageView4, b6.e(54, 56, 85));
        a80 a80Var = new a80(context);
        this.f42900d0 = a80Var;
        a80Var.setPivotX(0.0f);
        a80Var.setPivotY(org.telegram.messenger.i0.L(2.0f));
        addView(a80Var, b6.e(-1, 2, 87));
        setWillNotDraw(false);
        this.f42896b[0] = new bg.h(m0Var);
        this.f42896b[1] = new bg.h(m0Var);
        int i11 = t6.Dl;
        d(t6.v0(i11), false);
        setMenuColors(t6.v0(i11));
    }

    public final void a(Canvas canvas, float f7, float f10, boolean z10) {
        float f11;
        float max = Math.max(org.telegram.messenger.i0.L(0.66f), 1);
        float f12 = f7 - max;
        float width = getWidth() * this.f42898c;
        RectF rectF = this.f42894a;
        rectF.set(0.0f, 0.0f, getWidth(), f7);
        Paint[] paintArr = this.f42902f;
        int alpha = paintArr[1].getAlpha();
        paintArr[1].setAlpha((int) (alpha * 1.0f));
        canvas.drawRect(rectF, paintArr[1]);
        paintArr[1].setAlpha(alpha);
        int i10 = (this.f42898c > 0.0f ? 1 : (this.f42898c == 0.0f ? 0 : -1));
        float[] fArr = this.d;
        Paint[] paintArr2 = this.f42910n;
        Paint[] paintArr3 = this.h;
        if (i10 > 0) {
            rectF.set(0.0f, 0.0f, fArr[1] * getWidth(), f7);
            int alpha2 = paintArr3[1].getAlpha();
            f11 = 1.0f;
            paintArr3[1].setAlpha((int) ((1.0f - this.f42895a0) * (1.0f - this.U) * alpha2 * 1.0f));
            canvas.drawRect(rectF, paintArr3[1]);
            paintArr3[1].setAlpha(alpha2);
            if (z10) {
                rectF.set(0.0f, f12, width, f12 + max);
                int alpha3 = paintArr2[1].getAlpha();
                paintArr2[1].setAlpha((int) ((1.0f - this.f42895a0) * alpha3 * 1.0f * f10));
                canvas.drawRect(rectF, paintArr2[1]);
                paintArr2[1].setAlpha(alpha3);
            }
        } else {
            f11 = 1.0f;
        }
        float f13 = this.f42898c;
        if (f13 < f11) {
            int r12 = t6.r1((f11 - f13) * f11, 1610612736);
            Paint paint = this.f42915r;
            paint.setColor(r12);
            rectF.set(0.0f, 0.0f, width, f7);
            canvas.drawRect(rectF, paint);
            rectF.set(width, 0.0f, getWidth(), f7);
            int alpha4 = paintArr[0].getAlpha();
            paintArr[0].setAlpha((int) (alpha4 * f11));
            canvas.drawRect(rectF, paintArr[0]);
            paintArr[0].setAlpha(alpha4);
        }
        rectF.set(width, 0.0f, (fArr[0] * getWidth()) + width, f7);
        int alpha5 = paintArr3[0].getAlpha();
        paintArr3[0].setAlpha((int) ((f11 - this.f42895a0) * (f11 - this.U) * (f11 - Utilities.l(this.f42898c * 4.0f)) * alpha5 * f11));
        canvas.drawRect(rectF, paintArr3[0]);
        paintArr3[0].setAlpha(alpha5);
        if (z10) {
            rectF.set(width, f12, getWidth() + width, max + f12);
            int alpha6 = paintArr2[0].getAlpha();
            paintArr2[0].setAlpha((int) ((f11 - this.f42895a0) * alpha6 * f11 * f10));
            canvas.drawRect(rectF, paintArr2[0]);
            paintArr2[0].setAlpha(alpha6);
        }
    }

    public final void b(int i10, int i11) {
        float f7;
        boolean[] zArr = this.e;
        boolean z10 = zArr[i10];
        Paint[] paintArr = this.f42902f;
        if (z10 && paintArr[i10].getColor() == i11) {
            return;
        }
        zArr[i10] = true;
        paintArr[i10].setColor(i11);
        if (org.telegram.messenger.i0.B(i11) <= 0.721f) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        int f10 = i0.b.f(f7, -16777216, -1);
        this.h[i10].setColor(t6.w(i11, t6.r1(org.telegram.messenger.i0.T1(0.07f, 0.2f, f7), f10)));
        this.f42910n[i10].setColor(t6.w(i11, t6.r1(org.telegram.messenger.i0.T1(0.14f, 0.24f, f7), f10)));
        bg.h[] hVarArr = this.f42896b;
        ((e6) hVarArr[i10].d).u(f10);
        hVarArr[i10].f2684a = t6.w(i11, t6.r1(0.6f, f10));
        bg.h hVar = hVarArr[i10];
        ((e6) hVar.e).u(i0.b.f(((t5) hVarArr[i10].f2687f).f30530c, hVar.f2684a, t6.x0(null, t6.f21171q7, false)));
        invalidate();
    }

    public final void c(final int i10, float f7, boolean z10) {
        final float f10;
        boolean[] zArr = this.e;
        if (zArr[2] && this.f42906i0 == i10) {
            return;
        }
        final float f11 = 1.0f;
        if (!z10) {
            zArr[2] = true;
            if (f7 < 0.0f) {
                if (org.telegram.messenger.i0.B(i10) <= 0.721f) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
            }
            int f12 = i0.b.f(f7, -16777216, -1);
            this.f42924x = f12;
            t6.r1(0.55f, f12);
            this.f42906i0 = i10;
            this.f42926y = i0.b.f(f7, -1, -16777216);
            int f13 = i0.b.f(1.0f - f7, -1, -16777216);
            this.D = f13;
            int i11 = this.f42926y;
            h4 h4Var = ((org.telegram.ui.m0) this).B0;
            j jVar = h4Var.f37680i0;
            if (jVar != null) {
                jVar.c(i11, f13);
            }
            this.f42917s.setColor(this.f42926y);
            this.f42922w.setColor(t6.w(this.f42926y, t6.r1(org.telegram.messenger.i0.T1(0.07f, 0.2f, f7), this.f42924x)));
            int r12 = t6.r1(0.6f, this.D);
            zd zdVar = this.f42897b0;
            zdVar.setHintTextColor(r12);
            zdVar.setTextColor(this.D);
            zdVar.setCursorColor(this.D);
            zdVar.setHandlesColor(this.D);
            this.f42900d0.setProgressColor(t6.v0(t6.Fl));
            int f14 = i0.b.f(this.f42895a0, this.f42924x, this.D);
            org.telegram.ui.ActionBar.c2 c2Var = this.M;
            c2Var.a(f14);
            c2Var.b(i0.b.f(this.f42895a0, this.f42924x, this.D));
            int i12 = this.f42924x;
            a6 a6Var = this.P;
            a6Var.f34190c.setColor(i12);
            a6Var.invalidateSelf();
            int i13 = this.f42924x;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            this.R.setColorFilter(new PorterDuffColorFilter(i13, mode));
            this.O.setColorFilter(new PorterDuffColorFilter(this.f42924x, mode));
            this.J.setColorFilter(new PorterDuffColorFilter(this.f42924x, mode));
            int w9 = t6.w(i10, t6.r1(0.22f, this.f42924x));
            this.f42907j0 = w9;
            t6.H1(this.N, w9, true);
            t6.H1(this.Q, this.f42907j0, true);
            t6.H1(this.S, this.f42907j0, true);
            t6.H1(this.K, this.f42907j0, true);
            int r13 = t6.r1(0.6f, this.f42924x);
            zd zdVar2 = this.V;
            zdVar2.setHintTextColor(r13);
            zdVar2.setTextColor(this.f42924x);
            zdVar2.setCursorColor(this.f42924x);
            zdVar2.setHandlesColor(this.f42924x);
            u3 u3Var = h4Var.K;
            if (u3Var != null) {
                u3Var.u();
            }
            invalidate();
            return;
        }
        ValueAnimator valueAnimator = this.f42908k0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i14 = this.f42906i0;
        this.f42905h0 = i14;
        if (org.telegram.messenger.i0.B(i14) <= 0.721f) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        if (org.telegram.messenger.i0.B(i10) > 0.721f) {
            f11 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f42908k0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                l1 l1Var = l1.this;
                l1Var.getClass();
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                l1Var.c(i0.b.f(floatValue, l1Var.f42905h0, i10), org.telegram.messenger.i0.T1(f10, f11, floatValue), false);
            }
        });
        this.f42908k0.addListener(new qz(this, i10, f11, 1));
        this.f42908k0.start();
    }

    public final void d(int i10, boolean z10) {
        c(i10, -1.0f, z10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        if (this.f42901e0) {
            i10 = org.telegram.messenger.i0.f16166m;
        } else {
            i10 = 0;
        }
        a(canvas, i10 + this.F, 1.0f, this.f42918s0);
        float right = this.H.getRight();
        float left = this.I.getLeft();
        boolean z10 = this.f42901e0;
        if (z10) {
            i11 = org.telegram.messenger.i0.f16166m;
        } else {
            i11 = 0;
        }
        float f7 = i11;
        if (z10) {
            i12 = org.telegram.messenger.i0.f16166m;
        } else {
            i12 = 0;
        }
        float f10 = i12 + this.F;
        int i14 = (this.f42898c > 1.0f ? 1 : (this.f42898c == 1.0f ? 0 : -1));
        bg.h[] hVarArr = this.f42896b;
        if (i14 < 0) {
            canvas.save();
            float width = (getWidth() * this.f42898c) - (Utilities.l(this.f42898c * 2.0f) * org.telegram.messenger.i0.L(30.0f));
            canvas.translate(right + width, f7);
            hVarArr[0].c(canvas, (left - right) - width, f10 - f7, (1.0f - this.U) * (1.0f - this.f42898c));
            canvas.restore();
        }
        if (this.f42898c > 0.0f) {
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getWidth() * this.f42898c, getHeight());
            canvas.translate(right, f7);
            canvas.translate((1.0f - this.f42898c) * org.telegram.messenger.i0.L(-12.0f), 0.0f);
            float T1 = org.telegram.messenger.i0.T1(1.0f, 0.5f, 1.0f - this.f42898c);
            float f11 = f10 - f7;
            canvas.scale(T1, T1, 0.0f, f11 / 2.0f);
            hVarArr[1].c(canvas, left - right, f11, (1.0f - this.f42895a0) * (1.0f - this.U) * this.f42898c);
            canvas.restore();
        }
        int i15 = (this.f42895a0 > 0.0f ? 1 : (this.f42895a0 == 0.0f ? 0 : -1));
        RectF rectF = this.f42894a;
        if (i15 > 0) {
            Paint paint = this.f42917s;
            int alpha = paint.getAlpha();
            paint.setAlpha((int) (alpha * this.f42895a0));
            float width2 = getWidth();
            if (this.f42901e0) {
                i13 = org.telegram.messenger.i0.f16166m;
            }
            canvas.drawRect(0.0f, 0.0f, width2, i13 + this.F, paint);
            paint.setAlpha(alpha);
            float f12 = (f7 + f10) / 2.0f;
            float L = org.telegram.messenger.i0.L(42.0f) / 2.0f;
            rectF.set(org.telegram.messenger.i0.L(6.0f), f12 - L, org.telegram.messenger.i0.T1(left, getWidth() - org.telegram.messenger.i0.L(6.0f), this.f42895a0), f12 + L);
            Paint paint2 = this.f42922w;
            int alpha2 = paint2.getAlpha();
            paint2.setAlpha((int) (alpha2 * this.f42895a0));
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(50.0f), org.telegram.messenger.i0.L(50.0f), paint2);
            paint2.setAlpha(alpha2);
        }
        rectF.set(0.0f, f7, getWidth(), f10);
        canvas.save();
        canvas.clipRect(rectF);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        v0 webView;
        int action = motionEvent.getAction();
        i1 i1Var = this.f42928z0;
        if (action == 0) {
            this.A0 = false;
            org.telegram.messenger.i0.r(i1Var);
            if (motionEvent.getX() > this.H.getRight() && motionEvent.getX() < this.I.getLeft() && !this.T && !this.W) {
                this.f42925x0 = motionEvent.getX();
                motionEvent.getY();
                this.f42927y0 = System.currentTimeMillis();
                org.telegram.messenger.i0.h3(i1Var, ViewConfiguration.getLongPressTimeout() * 0.8f);
            }
        } else if (motionEvent.getAction() == 2 && ((float) (System.currentTimeMillis() - this.f42927y0)) > ViewConfiguration.getLongPressTimeout() * 0.8f) {
            org.telegram.messenger.i0.r(i1Var);
            this.A0 = true;
            l3 l3Var = ((org.telegram.ui.m0) this).B0.f37691u0[0];
            float l4 = Utilities.l(l3Var.getProgress() + ((motionEvent.getX() - this.f42925x0) / (getWidth() * 0.8f)));
            if (!l3Var.c() && l3Var.f() && (webView = l3Var.f39063f.getWebView()) != null) {
                webView.setScrollProgress(l4);
                l3Var.L.d0();
            }
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            org.telegram.messenger.i0.r(i1Var);
            this.f42927y0 = 0L;
        }
        this.f42925x0 = motionEvent.getX();
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(int i10, boolean z10) {
        float f7;
        bg.h hVar = this.f42896b[i10];
        if (hVar.f2686c != z10) {
            hVar.f2686c = z10;
            t5 t5Var = (t5) hVar.f2687f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            t5Var.e(true, f7);
            invalidate();
        }
    }

    public final void f(int i10, String str) {
        bg.h[] hVarArr = this.f42896b;
        CharSequence charSequence = ((e6) hVarArr[i10].e).f25749i;
        if (charSequence != null && TextUtils.equals(charSequence.toString(), str)) {
            return;
        }
        ((e6) hVarArr[i10].e).t(k6.m(str, ((e6) hVarArr[i10].e).f25742a.getFontMetricsInt(), false, null, 0), false, true);
    }

    public final void g(int i10, String str, boolean z10) {
        bg.h[] hVarArr = this.f42896b;
        CharSequence charSequence = ((e6) hVarArr[i10].d).f25749i;
        if (charSequence != null && TextUtils.equals(charSequence.toString(), str)) {
            return;
        }
        ((e6) hVarArr[i10].d).t(k6.m(str, ((e6) hVarArr[i10].d).f25742a.getFontMetricsInt(), false, null, 0), z10, true);
    }

    public int getBackgroundColor() {
        return this.f42906i0;
    }

    public w1 getInstantViewLoader() {
        return null;
    }

    public int getTextColor() {
        return this.f42924x;
    }

    public String getTitle() {
        CharSequence charSequence = ((e6) this.f42896b[0].d).f25749i;
        if (charSequence == null) {
            return "";
        }
        return charSequence.toString();
    }

    public final void h(boolean z10) {
        float f7;
        if (this.T == z10) {
            return;
        }
        ValueAnimator valueAnimator = this.f42919t0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.T = z10;
        zd zdVar = this.V;
        boolean z11 = false;
        zdVar.setVisibility(0);
        float f10 = 0.0f;
        if (!this.f42920u0 && !z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.M.c(true, f7);
        float f11 = this.U;
        if (z10) {
            f10 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f42919t0 = ofFloat;
        ofFloat.addUpdateListener(new bg.k(this, 26));
        this.f42919t0.addListener(new ha0(28, this, z10));
        this.f42919t0.setInterpolator(gr.h);
        this.f42919t0.setDuration(320L);
        this.f42919t0.start();
        boolean z12 = !z10;
        org.telegram.messenger.i0.U3(this.O, z12, true);
        org.telegram.messenger.i0.U3(this.R, z12, true);
        if (zdVar.length() > 0 && this.T) {
            z11 = true;
        }
        org.telegram.messenger.i0.U3(this.J, z11, true);
    }

    public final void i() {
        bg.h[] hVarArr = this.f42896b;
        bg.h hVar = hVarArr[0];
        hVarArr[0] = hVarArr[1];
        hVarArr[1] = hVar;
        float[] fArr = this.d;
        float f7 = fArr[0];
        fArr[0] = fArr[1];
        fArr[1] = f7;
        Paint[] paintArr = this.f42902f;
        int color = paintArr[0].getColor();
        b(0, paintArr[1].getColor());
        b(1, color);
        invalidate();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        if (this.f42901e0) {
            i12 = org.telegram.messenger.i0.f16166m;
        } else {
            i12 = 0;
        }
        super.onMeasure(i10, a30.B(56.0f, i12, 1073741824));
    }

    public void setBackButton(boolean z10) {
        float f7;
        this.f42920u0 = z10;
        if (!this.T && !this.W) {
            if (z10) {
                f7 = 0.0f;
            } else {
                f7 = 1.0f;
            }
            this.M.c(true, f7);
        }
    }

    public void setBackButtonCached(boolean z10) {
        this.f42920u0 = z10;
    }

    public void setHasForward(boolean z10) {
        this.f42912o0 = z10;
    }

    public void setHeight(int i10) {
        if (this.F != i10) {
            this.F = i10;
            float pow = (float) Math.pow(i10 / org.telegram.messenger.i0.L(56.0f), 0.5d);
            this.G = pow;
            z2 z2Var = this.H;
            z2Var.setScaleX(pow);
            z2Var.setScaleY(this.G);
            z2Var.setTranslationX((1.0f - this.G) * org.telegram.messenger.i0.L(42.0f));
            z2Var.setTranslationY((1.0f - this.G) * org.telegram.messenger.i0.L(-12.0f));
            float f7 = this.G;
            z2 z2Var2 = this.I;
            z2Var2.setScaleX(f7);
            z2Var2.setScaleY(this.G);
            z2Var2.setTranslationX((1.0f - this.G) * (-org.telegram.messenger.i0.L(42.0f)));
            z2Var2.setTranslationY((1.0f - this.G) * org.telegram.messenger.i0.L(-12.0f));
            this.f42900d0.setTranslationY(this.F - org.telegram.messenger.i0.L(56.0f));
            invalidate();
        }
    }

    public void setIsLocal(boolean z10) {
        this.f42914q0 = z10;
    }

    public void setIsTonsite(boolean z10) {
        this.f42913p0 = z10;
    }

    public void setMenuColors(int i10) {
        int i11;
        boolean z10 = false;
        if (d5.f(d5.e(i10))[0] < 0.5d) {
            z10 = true;
        }
        int i12 = -1;
        if (z10) {
            i11 = -16777216;
        } else {
            i11 = -1;
        }
        this.f42909l0 = i11;
        if (!z10) {
            i12 = -16777216;
        }
        this.m0 = i12;
        this.f42911n0 = t6.r1(0.6f, i12);
    }

    public void setMenuListener(r20 r20Var) {
        this.f42903f0 = r20Var;
    }

    public void setMenuType(int i10) {
        if (this.f42904g0 != i10) {
            this.f42904g0 = i10;
        }
    }

    public void setProgress(float f7) {
        this.d[0] = f7;
        invalidate();
    }

    public void setTransitionProgress(float f7) {
        this.f42898c = f7;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return true;
    }

    public void setIsLoaded(boolean z10) {
    }
}
