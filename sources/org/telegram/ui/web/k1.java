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
import bi.fc;
import bi.yd;
import c8.ha;
import c8.xa;
import fi.v3;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.c20;
import org.telegram.messenger.i6;
import org.telegram.messenger.id;
import org.telegram.messenger.iz;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.v4;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.h70;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.v5;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Wallet.oa;
import org.telegram.ui.Wallet.y5;
import org.telegram.ui.c50;
import org.telegram.ui.g4;
import org.telegram.ui.k3;
import org.telegram.ui.q61;
import org.telegram.ui.t3;
public abstract class k1 extends FrameLayout {
    public boolean A0;
    public int D;
    public final TextPaint E;
    public int F;
    public float G;
    public final bi.t H;
    public final bi.t I;
    public final ImageView J;
    public final org.telegram.ui.Cells.y K;
    public final ImageView L;
    public final org.telegram.ui.ActionBar.y1 M;
    public final org.telegram.ui.Cells.y N;
    public final ImageView O;
    public final y5 P;
    public final org.telegram.ui.Cells.y Q;
    public final ImageView R;
    public final org.telegram.ui.Cells.y S;
    public boolean T;
    public float U;
    public final bi.v V;
    public boolean W;
    public final RectF f51121a;
    public float f51122a0;
    public final lg.f[] f51123b;
    public final bi.v f51124b0;
    public float f51125c;
    public int f51126c0;
    public final float[] d;
    public final h70 f51127d0;
    public final boolean[] f51128e;
    public boolean f51129e0;
    public final Paint[] f51130f;
    public c20 f51131f0;
    public int f51132g0;
    public final Paint[] h;
    public int f51133h0;
    public int f51134i0;
    public int f51135j0;
    public ValueAnimator f51136k0;
    public int f51137l0;
    public int m0;
    public final Paint[] f51138n;
    public int f51139n0;
    public boolean f51140o0;
    public boolean f51141p0;
    public boolean f51142q0;
    public final Paint f51143r;
    public final h6.m f51144r0;
    public final Paint f51145s;
    public boolean f51146s0;
    public ValueAnimator f51147t0;
    public boolean f51148u0;
    public org.telegram.messenger.voip.k f51149v0;
    public final Paint f51150w;
    public ValueAnimator f51151w0;
    public int f51152x;
    public float f51153x0;
    public int f51154y;
    public long f51155y0;
    public final h1 f51156z0;

    public k1(Context context) {
        super(context);
        this.f51121a = new RectF();
        this.f51123b = new lg.f[2];
        this.f51125c = 0.0f;
        this.d = new float[2];
        this.f51128e = new boolean[3];
        this.f51130f = new Paint[2];
        this.h = new Paint[2];
        this.f51138n = new Paint[2];
        this.f51143r = new Paint(1);
        this.f51145s = new Paint(1);
        this.f51150w = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.E = textPaint;
        this.F = org.telegram.messenger.g0.L(56.0f);
        this.G = 1.0f;
        this.U = 0.0f;
        this.f51122a0 = 0.0f;
        this.f51132g0 = -1;
        this.f51144r0 = new h6.m(28);
        final org.telegram.ui.l0 l0Var = (org.telegram.ui.l0) this;
        this.f51156z0 = new h1(l0Var, 0);
        this.A0 = false;
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(18.33f));
        for (int i7 = 0; i7 < 2; i7++) {
            this.f51130f[i7] = new Paint(1);
            this.h[i7] = new Paint(1);
            this.f51138n[i7] = new Paint(1);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, ha.e(-1, 56, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        addView(frameLayout2, ha.e(-1, 56, 87));
        bi.t tVar = new bi.t(context, 10);
        this.H = tVar;
        tVar.setOrientation(0);
        addView(tVar, ha.e(-2, 56, 83));
        ImageView imageView = new ImageView(context);
        this.L = imageView;
        imageView.setContentDescription(id.M0(2131754878, null));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.ActionBar.y1 y1Var = new org.telegram.ui.ActionBar.y1(false);
        this.M = y1Var;
        y1Var.f28787k = 200.0f;
        y1Var.c(false, 1.0f);
        imageView.setImageDrawable(y1Var);
        org.telegram.ui.Cells.y h02 = m6.h0(1090519039, 1, -1);
        this.N = h02;
        imageView.setBackground(h02);
        tVar.addView(imageView, ha.o(54, 56));
        bi.t tVar2 = new bi.t(context, 11);
        this.I = tVar2;
        tVar2.setOrientation(0);
        addView(tVar2, ha.e(-2, 56, 85));
        ImageView imageView2 = new ImageView(context);
        this.O = imageView2;
        imageView2.setScaleType(scaleType);
        y5 y5Var = new y5(l0Var);
        this.P = y5Var;
        imageView2.setImageDrawable(y5Var);
        y5Var.c();
        org.telegram.ui.Cells.y h03 = m6.h0(1090519039, 1, -1);
        this.Q = h03;
        imageView2.setBackground(h03);
        tVar2.addView(imageView2, ha.o(54, 56));
        ImageView imageView3 = new ImageView(context);
        this.R = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(2131231244);
        imageView3.setColorFilter(new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_IN));
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                boolean z9;
                float f10;
                View childAt;
                int i10;
                int i11 = r2;
                org.telegram.ui.l0 l0Var2 = l0Var;
                switch (i11) {
                    case 0:
                        int i12 = 1;
                        if (l0Var2.getParent() instanceof ViewGroup) {
                            fc fcVar = new fc(l0Var2, 3);
                            k60 F = k60.F((ViewGroup) l0Var2.getParent(), null, l0Var2.R);
                            F.f35219s = 0;
                            F.S(l0Var2.m0, l0Var2.f51139n0);
                            F.a0(0.0f, -org.telegram.messenger.g0.L(52.0f));
                            F.S = 200;
                            int w10 = m6.w(l0Var2.f51137l0, m6.r1(0.1f, l0Var2.m0));
                            F.f35208l0 = Integer.valueOf(w10);
                            int i13 = 0;
                            while (i13 < F.A.getChildCount()) {
                                if (i13 == F.A.getChildCount() - i12) {
                                    childAt = F.D;
                                } else {
                                    childAt = F.A.getChildAt(i13);
                                }
                                if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                                    int i14 = 0;
                                    while (i14 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
                                        View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i14);
                                        int i15 = i12;
                                        if (childAt2 instanceof org.telegram.ui.ActionBar.z0) {
                                            ((org.telegram.ui.ActionBar.z0) childAt2).setSelectorColor(w10);
                                        }
                                        i14++;
                                        i12 = i15;
                                    }
                                    i10 = i12;
                                } else {
                                    i10 = i12;
                                    if (childAt instanceof org.telegram.ui.ActionBar.z0) {
                                        ((org.telegram.ui.ActionBar.z0) childAt).setSelectorColor(w10);
                                    }
                                }
                                i13++;
                                i12 = i10;
                            }
                            int i16 = i12;
                            if (org.telegram.messenger.g0.B(l0Var2.f51137l0) > 0.721f) {
                                F.P(-1);
                                F.T(-986896);
                            } else {
                                F.P(-14737633);
                                F.T(-15592942);
                            }
                            int i17 = l0Var2.f51132g0;
                            if (i17 == 0) {
                                F.c(2131232265, id.M0(2131747796, null), (Runnable) fcVar.a(3), false);
                                F.c(2131232354, id.M0(2131745836, null), (Runnable) fcVar.a(1), false);
                                F.l(2131232363, id.M0(2131745459, null), (Runnable) fcVar.a(2), !l0Var2.f51142q0);
                                F.c(2131232361, id.M0(2131745495, null), (Runnable) fcVar.a(4), false);
                            } else if (i17 == i16) {
                                if (!l0Var2.f51141p0) {
                                    F.c(2131232265, id.M0(2131747796, null), (Runnable) fcVar.a(3), false);
                                    F.k();
                                }
                                if (l0Var2.f51140o0) {
                                    F.c(2131232058, id.M0(2131742921, null), (Runnable) fcVar.a(9), false);
                                }
                                u1 instantViewLoader = l0Var2.getInstantViewLoader();
                                if (instantViewLoader != null && (((!instantViewLoader.f51264g || !instantViewLoader.f51265i) && instantViewLoader.h == null && instantViewLoader.f51266j == null && !instantViewLoader.f51261c) || instantViewLoader.b() != null)) {
                                    F.c(2131231834, id.M0(2131747788, null), (Runnable) fcVar.a(10), false);
                                    org.telegram.ui.ActionBar.z0 y10 = F.y();
                                    if (instantViewLoader.b() != null) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    y10.setEnabled(z9);
                                    if (y10.isEnabled()) {
                                        f10 = 1.0f;
                                    } else {
                                        f10 = 0.5f;
                                    }
                                    y10.setAlpha(f10);
                                    s sVar = new s(4, y10, instantViewLoader);
                                    instantViewLoader.f51269m.add(sVar);
                                    F.f35214p = new s(8, instantViewLoader, sVar);
                                }
                                F.c(2131232341, id.M0(2131746340, null), (Runnable) fcVar.a(5), false);
                                F.c(2131232354, id.M0(2131745836, null), (Runnable) fcVar.a(1), false);
                                F.c(2131232351, id.M0(2131742942, null), (Runnable) fcVar.a(6), false);
                                F.c(2131232363, id.M0(2131745459, null), (Runnable) fcVar.a(2), false);
                                F.k();
                                if (!xa.a(null).isEmpty()) {
                                    F.c(2131231919, id.M0(2131742920, null), (Runnable) fcVar.a(8), false);
                                }
                                F.c(2131231769, id.M0(2131742939, null), (Runnable) fcVar.a(7), false);
                                F.c(2131232361, id.M0(2131745495, null), (Runnable) fcVar.a(4), false);
                            }
                            F.f35214p = new q61(l0Var2);
                            F.Z();
                            return;
                        }
                        return;
                    default:
                        l0Var2.V.setText("");
                        return;
                }
            }
        });
        org.telegram.ui.Cells.y h04 = m6.h0(1090519039, 1, -1);
        this.S = h04;
        imageView3.setBackground(h04);
        imageView3.setContentDescription(id.M0(2131754839, "AccDescrMoreOptions"));
        tVar2.addView(imageView3, ha.o(54, 56));
        bi.v vVar = new bi.v(context, 5);
        this.V = vVar;
        vVar.setVisibility(8);
        vVar.setAlpha(0.0f);
        vVar.setTextSize(1, 18.0f);
        vVar.setSingleLine(true);
        vVar.setHint(id.M0(2131745836, null));
        vVar.setBackgroundResource(0);
        vVar.setCursorWidth(1.5f);
        vVar.setGravity(112);
        vVar.setClipToPadding(true);
        vVar.setPadding(org.telegram.messenger.g0.L(58.0f), 0, org.telegram.messenger.g0.L(112.0f), 0);
        vVar.setTranslationY(-org.telegram.messenger.g0.L(0.66f));
        vVar.setInputType(vVar.getInputType() | 524288);
        vVar.setImeOptions(33554435);
        vVar.setTextIsSelectable(false);
        vVar.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (keyEvent != null) {
                            if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                                org.telegram.messenger.g0.v1(l0Var.V);
                                return false;
                            }
                            return false;
                        }
                        return false;
                    default:
                        if (i10 == 2) {
                            org.telegram.ui.l0 l0Var2 = l0Var;
                            org.telegram.messenger.voip.k kVar = l0Var2.f51149v0;
                            if (kVar != null) {
                                kVar.a(l0Var2.f51124b0.getText().toString());
                            }
                            l0Var2.k(false);
                        }
                        return false;
                }
            }
        });
        vVar.addTextChangedListener(new oa(l0Var, 1));
        frameLayout.addView(vVar, ha.e(-1, -1, 119));
        bi.v vVar2 = new bi.v(context, 6);
        this.f51124b0 = vVar2;
        vVar2.setVisibility(8);
        vVar2.setAlpha(0.0f);
        vVar2.setTextSize(1, 15.66f);
        vVar2.setSingleLine(true);
        this.f51126c0 = iz.f23430p0;
        vVar2.setHint(id.a0(null, null, 2131754351, f1.a().f51064a));
        vVar2.setBackgroundResource(0);
        vVar2.setCursorWidth(1.5f);
        vVar2.setGravity(112);
        vVar2.setInputType(vVar2.getInputType() | 524288);
        vVar2.setImeOptions(33554434);
        vVar2.setTextIsSelectable(false);
        vVar2.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (keyEvent != null) {
                            if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                                org.telegram.messenger.g0.v1(l0Var.V);
                                return false;
                            }
                            return false;
                        }
                        return false;
                    default:
                        if (i10 == 2) {
                            org.telegram.ui.l0 l0Var2 = l0Var;
                            org.telegram.messenger.voip.k kVar = l0Var2.f51149v0;
                            if (kVar != null) {
                                kVar.a(l0Var2.f51124b0.getText().toString());
                            }
                            l0Var2.k(false);
                        }
                        return false;
                }
            }
        });
        frameLayout2.addView(vVar2, ha.d(-1, -1.0f, 119, 48.0f, 0.0f, 12.0f, 0.0f));
        ImageView imageView4 = new ImageView(context);
        this.J = imageView4;
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(2131231269);
        org.telegram.ui.Cells.y h05 = m6.h0(1090519039, 1, -1);
        this.K = h05;
        imageView4.setBackground(h05);
        imageView4.setVisibility(8);
        imageView4.setAlpha(0.0f);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                boolean z9;
                float f10;
                View childAt;
                int i10;
                int i11 = r2;
                org.telegram.ui.l0 l0Var2 = l0Var;
                switch (i11) {
                    case 0:
                        int i12 = 1;
                        if (l0Var2.getParent() instanceof ViewGroup) {
                            fc fcVar = new fc(l0Var2, 3);
                            k60 F = k60.F((ViewGroup) l0Var2.getParent(), null, l0Var2.R);
                            F.f35219s = 0;
                            F.S(l0Var2.m0, l0Var2.f51139n0);
                            F.a0(0.0f, -org.telegram.messenger.g0.L(52.0f));
                            F.S = 200;
                            int w10 = m6.w(l0Var2.f51137l0, m6.r1(0.1f, l0Var2.m0));
                            F.f35208l0 = Integer.valueOf(w10);
                            int i13 = 0;
                            while (i13 < F.A.getChildCount()) {
                                if (i13 == F.A.getChildCount() - i12) {
                                    childAt = F.D;
                                } else {
                                    childAt = F.A.getChildAt(i13);
                                }
                                if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                                    int i14 = 0;
                                    while (i14 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
                                        View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i14);
                                        int i15 = i12;
                                        if (childAt2 instanceof org.telegram.ui.ActionBar.z0) {
                                            ((org.telegram.ui.ActionBar.z0) childAt2).setSelectorColor(w10);
                                        }
                                        i14++;
                                        i12 = i15;
                                    }
                                    i10 = i12;
                                } else {
                                    i10 = i12;
                                    if (childAt instanceof org.telegram.ui.ActionBar.z0) {
                                        ((org.telegram.ui.ActionBar.z0) childAt).setSelectorColor(w10);
                                    }
                                }
                                i13++;
                                i12 = i10;
                            }
                            int i16 = i12;
                            if (org.telegram.messenger.g0.B(l0Var2.f51137l0) > 0.721f) {
                                F.P(-1);
                                F.T(-986896);
                            } else {
                                F.P(-14737633);
                                F.T(-15592942);
                            }
                            int i17 = l0Var2.f51132g0;
                            if (i17 == 0) {
                                F.c(2131232265, id.M0(2131747796, null), (Runnable) fcVar.a(3), false);
                                F.c(2131232354, id.M0(2131745836, null), (Runnable) fcVar.a(1), false);
                                F.l(2131232363, id.M0(2131745459, null), (Runnable) fcVar.a(2), !l0Var2.f51142q0);
                                F.c(2131232361, id.M0(2131745495, null), (Runnable) fcVar.a(4), false);
                            } else if (i17 == i16) {
                                if (!l0Var2.f51141p0) {
                                    F.c(2131232265, id.M0(2131747796, null), (Runnable) fcVar.a(3), false);
                                    F.k();
                                }
                                if (l0Var2.f51140o0) {
                                    F.c(2131232058, id.M0(2131742921, null), (Runnable) fcVar.a(9), false);
                                }
                                u1 instantViewLoader = l0Var2.getInstantViewLoader();
                                if (instantViewLoader != null && (((!instantViewLoader.f51264g || !instantViewLoader.f51265i) && instantViewLoader.h == null && instantViewLoader.f51266j == null && !instantViewLoader.f51261c) || instantViewLoader.b() != null)) {
                                    F.c(2131231834, id.M0(2131747788, null), (Runnable) fcVar.a(10), false);
                                    org.telegram.ui.ActionBar.z0 y10 = F.y();
                                    if (instantViewLoader.b() != null) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    y10.setEnabled(z9);
                                    if (y10.isEnabled()) {
                                        f10 = 1.0f;
                                    } else {
                                        f10 = 0.5f;
                                    }
                                    y10.setAlpha(f10);
                                    s sVar = new s(4, y10, instantViewLoader);
                                    instantViewLoader.f51269m.add(sVar);
                                    F.f35214p = new s(8, instantViewLoader, sVar);
                                }
                                F.c(2131232341, id.M0(2131746340, null), (Runnable) fcVar.a(5), false);
                                F.c(2131232354, id.M0(2131745836, null), (Runnable) fcVar.a(1), false);
                                F.c(2131232351, id.M0(2131742942, null), (Runnable) fcVar.a(6), false);
                                F.c(2131232363, id.M0(2131745459, null), (Runnable) fcVar.a(2), false);
                                F.k();
                                if (!xa.a(null).isEmpty()) {
                                    F.c(2131231919, id.M0(2131742920, null), (Runnable) fcVar.a(8), false);
                                }
                                F.c(2131231769, id.M0(2131742939, null), (Runnable) fcVar.a(7), false);
                                F.c(2131232361, id.M0(2131745495, null), (Runnable) fcVar.a(4), false);
                            }
                            F.f35214p = new q61(l0Var2);
                            F.Z();
                            return;
                        }
                        return;
                    default:
                        l0Var2.V.setText("");
                        return;
                }
            }
        });
        addView(imageView4, ha.e(54, 56, 85));
        h70 h70Var = new h70(context);
        this.f51127d0 = h70Var;
        h70Var.setPivotX(0.0f);
        h70Var.setPivotY(org.telegram.messenger.g0.L(2.0f));
        addView(h70Var, ha.e(-1, 2, 87));
        setWillNotDraw(false);
        this.f51123b[0] = new lg.f(l0Var);
        this.f51123b[1] = new lg.f(l0Var);
        int i10 = m6.Dl;
        d(m6.v0(i10), false);
        setMenuColors(m6.v0(i10));
    }

    public final void a(Canvas canvas, float f10, float f11, boolean z9) {
        float f12;
        float max = Math.max(org.telegram.messenger.g0.L(0.66f), 1);
        float f13 = f10 - max;
        float width = getWidth() * this.f51125c;
        RectF rectF = this.f51121a;
        rectF.set(0.0f, 0.0f, getWidth(), f10);
        Paint[] paintArr = this.f51130f;
        int alpha = paintArr[1].getAlpha();
        paintArr[1].setAlpha((int) (alpha * 1.0f));
        canvas.drawRect(rectF, paintArr[1]);
        paintArr[1].setAlpha(alpha);
        int i7 = (this.f51125c > 0.0f ? 1 : (this.f51125c == 0.0f ? 0 : -1));
        float[] fArr = this.d;
        Paint[] paintArr2 = this.f51138n;
        Paint[] paintArr3 = this.h;
        if (i7 > 0) {
            rectF.set(0.0f, 0.0f, fArr[1] * getWidth(), f10);
            int alpha2 = paintArr3[1].getAlpha();
            f12 = 1.0f;
            paintArr3[1].setAlpha((int) ((1.0f - this.f51122a0) * (1.0f - this.U) * alpha2 * 1.0f));
            canvas.drawRect(rectF, paintArr3[1]);
            paintArr3[1].setAlpha(alpha2);
            if (z9) {
                rectF.set(0.0f, f13, width, f13 + max);
                int alpha3 = paintArr2[1].getAlpha();
                paintArr2[1].setAlpha((int) ((1.0f - this.f51122a0) * alpha3 * 1.0f * f11));
                canvas.drawRect(rectF, paintArr2[1]);
                paintArr2[1].setAlpha(alpha3);
            }
        } else {
            f12 = 1.0f;
        }
        float f14 = this.f51125c;
        if (f14 < f12) {
            int r12 = m6.r1((f12 - f14) * f12, 1610612736);
            Paint paint = this.f51143r;
            paint.setColor(r12);
            rectF.set(0.0f, 0.0f, width, f10);
            canvas.drawRect(rectF, paint);
            rectF.set(width, 0.0f, getWidth(), f10);
            int alpha4 = paintArr[0].getAlpha();
            paintArr[0].setAlpha((int) (alpha4 * f12));
            canvas.drawRect(rectF, paintArr[0]);
            paintArr[0].setAlpha(alpha4);
        }
        rectF.set(width, 0.0f, (fArr[0] * getWidth()) + width, f10);
        int alpha5 = paintArr3[0].getAlpha();
        paintArr3[0].setAlpha((int) ((f12 - this.f51122a0) * (f12 - this.U) * (f12 - Utilities.l(this.f51125c * 4.0f)) * alpha5 * f12));
        canvas.drawRect(rectF, paintArr3[0]);
        paintArr3[0].setAlpha(alpha5);
        if (z9) {
            rectF.set(width, f13, getWidth() + width, max + f13);
            int alpha6 = paintArr2[0].getAlpha();
            paintArr2[0].setAlpha((int) ((f12 - this.f51122a0) * alpha6 * f12 * f11));
            canvas.drawRect(rectF, paintArr2[0]);
            paintArr2[0].setAlpha(alpha6);
        }
    }

    public final void b(int i7, int i10) {
        float f10;
        boolean[] zArr = this.f51128e;
        boolean z9 = zArr[i7];
        Paint[] paintArr = this.f51130f;
        if (z9 && paintArr[i7].getColor() == i10) {
            return;
        }
        zArr[i7] = true;
        paintArr[i7].setColor(i10);
        if (org.telegram.messenger.g0.B(i10) <= 0.721f) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        int f11 = i0.a.f(f10, -16777216, -1);
        this.h[i7].setColor(m6.w(i10, m6.r1(org.telegram.messenger.g0.T1(0.07f, 0.2f, f10), f11)));
        this.f51138n[i7].setColor(m6.w(i10, m6.r1(org.telegram.messenger.g0.T1(0.14f, 0.24f, f10), f11)));
        lg.f[] fVarArr = this.f51123b;
        ((h6) fVarArr[i7].d).u(f11);
        fVarArr[i7].f18269a = m6.w(i10, m6.r1(0.6f, f11));
        lg.f fVar = fVarArr[i7];
        ((h6) fVar.f18272e).u(i0.a.f(((v5) fVarArr[i7].f18273f).f38854c, fVar.f18269a, m6.x0(null, m6.f28131q7, false)));
        invalidate();
    }

    public final void c(final int i7, float f10, boolean z9) {
        final float f11;
        boolean[] zArr = this.f51128e;
        if (zArr[2] && this.f51134i0 == i7) {
            return;
        }
        final float f12 = 1.0f;
        if (!z9) {
            zArr[2] = true;
            if (f10 < 0.0f) {
                if (org.telegram.messenger.g0.B(i7) <= 0.721f) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
            }
            int f13 = i0.a.f(f10, -16777216, -1);
            this.f51152x = f13;
            m6.r1(0.55f, f13);
            this.f51134i0 = i7;
            this.f51154y = i0.a.f(f10, -1, -16777216);
            int f14 = i0.a.f(1.0f - f10, -1, -16777216);
            this.D = f14;
            int i10 = this.f51154y;
            g4 g4Var = ((org.telegram.ui.l0) this).B0;
            j jVar = g4Var.f45960i0;
            if (jVar != null) {
                jVar.c(i10, f14);
            }
            this.f51145s.setColor(this.f51154y);
            this.f51150w.setColor(m6.w(this.f51154y, m6.r1(org.telegram.messenger.g0.T1(0.07f, 0.2f, f10), this.f51152x)));
            int r12 = m6.r1(0.6f, this.D);
            bi.v vVar = this.f51124b0;
            vVar.setHintTextColor(r12);
            vVar.setTextColor(this.D);
            vVar.setCursorColor(this.D);
            vVar.setHandlesColor(this.D);
            this.f51127d0.setProgressColor(m6.v0(m6.Fl));
            int f15 = i0.a.f(this.f51122a0, this.f51152x, this.D);
            org.telegram.ui.ActionBar.y1 y1Var = this.M;
            y1Var.a(f15);
            y1Var.b(i0.a.f(this.f51122a0, this.f51152x, this.D));
            int i11 = this.f51152x;
            y5 y5Var = this.P;
            y5Var.f43383c.setColor(i11);
            y5Var.invalidateSelf();
            int i12 = this.f51152x;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            this.R.setColorFilter(new PorterDuffColorFilter(i12, mode));
            this.O.setColorFilter(new PorterDuffColorFilter(this.f51152x, mode));
            this.J.setColorFilter(new PorterDuffColorFilter(this.f51152x, mode));
            int w10 = m6.w(i7, m6.r1(0.22f, this.f51152x));
            this.f51135j0 = w10;
            m6.H1(this.N, w10, true);
            m6.H1(this.Q, this.f51135j0, true);
            m6.H1(this.S, this.f51135j0, true);
            m6.H1(this.K, this.f51135j0, true);
            int r13 = m6.r1(0.6f, this.f51152x);
            bi.v vVar2 = this.V;
            vVar2.setHintTextColor(r13);
            vVar2.setTextColor(this.f51152x);
            vVar2.setCursorColor(this.f51152x);
            vVar2.setHandlesColor(this.f51152x);
            t3 t3Var = g4Var.K;
            if (t3Var != null) {
                t3Var.u();
            }
            invalidate();
            return;
        }
        ValueAnimator valueAnimator = this.f51136k0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i13 = this.f51134i0;
        this.f51133h0 = i13;
        if (org.telegram.messenger.g0.B(i13) <= 0.721f) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        if (org.telegram.messenger.g0.B(i7) > 0.721f) {
            f12 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f51136k0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                k1 k1Var = k1.this;
                k1Var.getClass();
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                k1Var.c(i0.a.f(floatValue, k1Var.f51133h0, i7), org.telegram.messenger.g0.T1(f11, f12, floatValue), false);
            }
        });
        this.f51136k0.addListener(new yd(this, i7, f12, 2));
        this.f51136k0.start();
    }

    public final void d(int i7, boolean z9) {
        c(i7, -1.0f, z9);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i7;
        int i10;
        int i11;
        int i12 = 0;
        if (this.f51129e0) {
            i7 = org.telegram.messenger.g0.f22561m;
        } else {
            i7 = 0;
        }
        a(canvas, i7 + this.F, 1.0f, this.f51146s0);
        float right = this.H.getRight();
        float left = this.I.getLeft();
        boolean z9 = this.f51129e0;
        if (z9) {
            i10 = org.telegram.messenger.g0.f22561m;
        } else {
            i10 = 0;
        }
        float f10 = i10;
        if (z9) {
            i11 = org.telegram.messenger.g0.f22561m;
        } else {
            i11 = 0;
        }
        float f11 = i11 + this.F;
        int i13 = (this.f51125c > 1.0f ? 1 : (this.f51125c == 1.0f ? 0 : -1));
        lg.f[] fVarArr = this.f51123b;
        if (i13 < 0) {
            canvas.save();
            float width = (getWidth() * this.f51125c) - (Utilities.l(this.f51125c * 2.0f) * org.telegram.messenger.g0.L(30.0f));
            canvas.translate(right + width, f10);
            fVarArr[0].c(canvas, (left - right) - width, f11 - f10, (1.0f - this.U) * (1.0f - this.f51125c));
            canvas.restore();
        }
        if (this.f51125c > 0.0f) {
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getWidth() * this.f51125c, getHeight());
            canvas.translate(right, f10);
            canvas.translate((1.0f - this.f51125c) * org.telegram.messenger.g0.L(-12.0f), 0.0f);
            float T1 = org.telegram.messenger.g0.T1(1.0f, 0.5f, 1.0f - this.f51125c);
            float f12 = f11 - f10;
            canvas.scale(T1, T1, 0.0f, f12 / 2.0f);
            fVarArr[1].c(canvas, left - right, f12, (1.0f - this.f51122a0) * (1.0f - this.U) * this.f51125c);
            canvas.restore();
        }
        int i14 = (this.f51122a0 > 0.0f ? 1 : (this.f51122a0 == 0.0f ? 0 : -1));
        RectF rectF = this.f51121a;
        if (i14 > 0) {
            Paint paint = this.f51145s;
            int alpha = paint.getAlpha();
            paint.setAlpha((int) (alpha * this.f51122a0));
            float width2 = getWidth();
            if (this.f51129e0) {
                i12 = org.telegram.messenger.g0.f22561m;
            }
            canvas.drawRect(0.0f, 0.0f, width2, i12 + this.F, paint);
            paint.setAlpha(alpha);
            float f13 = (f10 + f11) / 2.0f;
            float L = org.telegram.messenger.g0.L(42.0f) / 2.0f;
            rectF.set(org.telegram.messenger.g0.L(6.0f), f13 - L, org.telegram.messenger.g0.T1(left, getWidth() - org.telegram.messenger.g0.L(6.0f), this.f51122a0), f13 + L);
            Paint paint2 = this.f51150w;
            int alpha2 = paint2.getAlpha();
            paint2.setAlpha((int) (alpha2 * this.f51122a0));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), paint2);
            paint2.setAlpha(alpha2);
        }
        rectF.set(0.0f, f10, getWidth(), f11);
        canvas.save();
        canvas.clipRect(rectF);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        u0 webView;
        int action = motionEvent.getAction();
        h1 h1Var = this.f51156z0;
        if (action == 0) {
            this.A0 = false;
            org.telegram.messenger.g0.r(h1Var);
            if (motionEvent.getX() > this.H.getRight() && motionEvent.getX() < this.I.getLeft() && !this.T && !this.W) {
                this.f51153x0 = motionEvent.getX();
                motionEvent.getY();
                this.f51155y0 = System.currentTimeMillis();
                org.telegram.messenger.g0.i3(h1Var, ViewConfiguration.getLongPressTimeout() * 0.8f);
            }
        } else if (motionEvent.getAction() == 2 && ((float) (System.currentTimeMillis() - this.f51155y0)) > ViewConfiguration.getLongPressTimeout() * 0.8f) {
            org.telegram.messenger.g0.r(h1Var);
            this.A0 = true;
            k3 k3Var = ((org.telegram.ui.l0) this).B0.f45971u0[0];
            float l10 = Utilities.l(k3Var.getProgress() + ((motionEvent.getX() - this.f51153x0) / (getWidth() * 0.8f)));
            if (!k3Var.c() && k3Var.f() && (webView = k3Var.f47145f.getWebView()) != null) {
                webView.setScrollProgress(l10);
                k3Var.L.d0();
            }
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            org.telegram.messenger.g0.r(h1Var);
            this.f51155y0 = 0L;
        }
        this.f51153x0 = motionEvent.getX();
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(int i7, boolean z9) {
        float f10;
        lg.f fVar = this.f51123b[i7];
        if (fVar.f18271c != z9) {
            fVar.f18271c = z9;
            v5 v5Var = (v5) fVar.f18273f;
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            v5Var.e(true, f10);
            invalidate();
        }
    }

    public final void f(int i7, String str) {
        lg.f[] fVarArr = this.f51123b;
        CharSequence charSequence = ((h6) fVarArr[i7].f18272e).f34193i;
        if (charSequence != null && TextUtils.equals(charSequence.toString(), str)) {
            return;
        }
        ((h6) fVarArr[i7].f18272e).t(i6.m(str, ((h6) fVarArr[i7].f18272e).f34185a.getFontMetricsInt(), false, null, 0), false, true);
    }

    public final void g(int i7, String str, boolean z9) {
        lg.f[] fVarArr = this.f51123b;
        CharSequence charSequence = ((h6) fVarArr[i7].d).f34193i;
        if (charSequence != null && TextUtils.equals(charSequence.toString(), str)) {
            return;
        }
        ((h6) fVarArr[i7].d).t(i6.m(str, ((h6) fVarArr[i7].d).f34185a.getFontMetricsInt(), false, null, 0), z9, true);
    }

    public int getBackgroundColor() {
        return this.f51134i0;
    }

    public u1 getInstantViewLoader() {
        return null;
    }

    public int getTextColor() {
        return this.f51152x;
    }

    public String getTitle() {
        CharSequence charSequence = ((h6) this.f51123b[0].d).f34193i;
        if (charSequence == null) {
            return "";
        }
        return charSequence.toString();
    }

    public final void h(boolean z9) {
        float f10;
        if (this.T == z9) {
            return;
        }
        ValueAnimator valueAnimator = this.f51147t0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.T = z9;
        bi.v vVar = this.V;
        boolean z10 = false;
        vVar.setVisibility(0);
        float f11 = 0.0f;
        if (!this.f51148u0 && !z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.M.c(true, f10);
        float f12 = this.U;
        if (z9) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
        this.f51147t0 = ofFloat;
        ofFloat.addUpdateListener(new v3(this, 22));
        this.f51147t0.addListener(new c50(12, this, z9));
        this.f51147t0.setInterpolator(wq.h);
        this.f51147t0.setDuration(320L);
        this.f51147t0.start();
        boolean z11 = !z9;
        org.telegram.messenger.g0.V3(this.O, z11, true);
        org.telegram.messenger.g0.V3(this.R, z11, true);
        if (vVar.length() > 0 && this.T) {
            z10 = true;
        }
        org.telegram.messenger.g0.V3(this.J, z10, true);
    }

    public final void i() {
        lg.f[] fVarArr = this.f51123b;
        lg.f fVar = fVarArr[0];
        fVarArr[0] = fVarArr[1];
        fVarArr[1] = fVar;
        float[] fArr = this.d;
        float f10 = fArr[0];
        fArr[0] = fArr[1];
        fArr[1] = f10;
        Paint[] paintArr = this.f51130f;
        int color = paintArr[0].getColor();
        b(0, paintArr[1].getColor());
        b(1, color);
        invalidate();
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
    }

    @Override
    public void onMeasure(int i7, int i10) {
        int i11;
        if (this.f51129e0) {
            i11 = org.telegram.messenger.g0.f22561m;
        } else {
            i11 = 0;
        }
        super.onMeasure(i7, org.telegram.messenger.camera.q.B(56.0f, i11, 1073741824));
    }

    public void setBackButton(boolean z9) {
        float f10;
        this.f51148u0 = z9;
        if (!this.T && !this.W) {
            if (z9) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            this.M.c(true, f10);
        }
    }

    public void setBackButtonCached(boolean z9) {
        this.f51148u0 = z9;
    }

    public void setHasForward(boolean z9) {
        this.f51140o0 = z9;
    }

    public void setHeight(int i7) {
        if (this.F != i7) {
            this.F = i7;
            float pow = (float) Math.pow(i7 / org.telegram.messenger.g0.L(56.0f), 0.5d);
            this.G = pow;
            bi.t tVar = this.H;
            tVar.setScaleX(pow);
            tVar.setScaleY(this.G);
            tVar.setTranslationX((1.0f - this.G) * org.telegram.messenger.g0.L(42.0f));
            tVar.setTranslationY((1.0f - this.G) * org.telegram.messenger.g0.L(-12.0f));
            float f10 = this.G;
            bi.t tVar2 = this.I;
            tVar2.setScaleX(f10);
            tVar2.setScaleY(this.G);
            tVar2.setTranslationX((1.0f - this.G) * (-org.telegram.messenger.g0.L(42.0f)));
            tVar2.setTranslationY((1.0f - this.G) * org.telegram.messenger.g0.L(-12.0f));
            this.f51127d0.setTranslationY(this.F - org.telegram.messenger.g0.L(56.0f));
            invalidate();
        }
    }

    public void setIsLocal(boolean z9) {
        this.f51142q0 = z9;
    }

    public void setIsTonsite(boolean z9) {
        this.f51141p0 = z9;
    }

    public void setMenuColors(int i7) {
        int i10;
        boolean z9 = false;
        if (v4.f(v4.e(i7))[0] < 0.5d) {
            z9 = true;
        }
        int i11 = -1;
        if (z9) {
            i10 = -16777216;
        } else {
            i10 = -1;
        }
        this.f51137l0 = i10;
        if (!z9) {
            i11 = -16777216;
        }
        this.m0 = i11;
        this.f51139n0 = m6.r1(0.6f, i11);
    }

    public void setMenuListener(c20 c20Var) {
        this.f51131f0 = c20Var;
    }

    public void setMenuType(int i7) {
        if (this.f51132g0 != i7) {
            this.f51132g0 = i7;
        }
    }

    public void setProgress(float f10) {
        this.d[0] = f10;
        invalidate();
    }

    public void setTransitionProgress(float f10) {
        this.f51125c = f10;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return true;
    }

    public void setIsLoaded(boolean z9) {
    }
}
