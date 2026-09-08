package org.telegram.ui.web;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
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
import di.a8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.wl;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.g5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.pr;
import org.telegram.ui.e50;
import org.telegram.ui.i4;
import org.telegram.ui.l20;
import org.telegram.ui.m3;
import org.telegram.ui.q31;
import org.telegram.ui.v3;
import org.telegram.ui.yd;
import w7.x5;
public abstract class w1 extends FrameLayout {
    public boolean A0;
    public final TextPaint E;
    public int F;
    public float G;
    public final yd H;
    public final yd I;
    public final ImageView J;
    public final org.telegram.ui.Cells.z K;
    public final ImageView L;
    public final org.telegram.ui.ActionBar.g2 M;
    public final org.telegram.ui.Cells.z N;
    public final ImageView O;
    public final u1 P;
    public final org.telegram.ui.Cells.z Q;
    public final ImageView R;
    public final org.telegram.ui.Cells.z S;
    public boolean T;
    public float U;
    public final gi.o V;
    public boolean W;
    public final RectF f42301a;
    public float f42302a0;
    public final v1[] f42303b;
    public final gi.o f42304b0;
    public float f42305c;
    public int f42306c0;
    public final float[] d;
    public final m80 f42307d0;
    public final boolean[] f42308e;
    public boolean f42309e0;
    public final Paint[] f42310f;
    public Utilities.Callback f42311f0;
    public int f42312g0;
    public final Paint[] h;
    public int f42313h0;
    public int f42314i0;
    public int f42315j0;
    public ValueAnimator f42316k0;
    public int f42317l0;
    public int m0;
    public final Paint[] f42318n;
    public int f42319n0;
    public boolean f42320o0;
    public boolean f42321p0;
    public boolean f42322q0;
    public final Paint f42323r;
    public final l20 f42324r0;
    public final Paint f42325s;
    public boolean f42326s0;
    public ValueAnimator f42327t0;
    public boolean f42328u0;
    public final Paint v;
    public di.m2 f42329v0;
    public int f42330w;
    public ValueAnimator f42331w0;
    public int f42332x;
    public float f42333x0;
    public int f42334y;
    public long f42335y0;
    public final r1 f42336z0;

    public w1(Context context) {
        super(context);
        this.f42301a = new RectF();
        this.f42303b = new v1[2];
        this.f42305c = 0.0f;
        this.d = new float[2];
        this.f42308e = new boolean[3];
        this.f42310f = new Paint[2];
        this.h = new Paint[2];
        this.f42318n = new Paint[2];
        this.f42323r = new Paint(1);
        this.f42325s = new Paint(1);
        this.v = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.E = textPaint;
        this.F = AndroidUtilities.dp(56.0f);
        this.G = 1.0f;
        this.U = 0.0f;
        this.f42302a0 = 0.0f;
        this.f42312g0 = -1;
        this.f42324r0 = new l20();
        final org.telegram.ui.k0 k0Var = (org.telegram.ui.k0) this;
        this.f42336z0 = new r1(k0Var, 0);
        this.A0 = false;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(18.33f));
        for (int i10 = 0; i10 < 2; i10++) {
            this.f42310f[i10] = new Paint(1);
            this.h[i10] = new Paint(1);
            this.f42318n[i10] = new Paint(1);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, x5.e(-1, 56, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        addView(frameLayout2, x5.e(-1, 56, 87));
        yd ydVar = new yd(context, 6);
        this.H = ydVar;
        ydVar.setOrientation(0);
        addView(ydVar, x5.e(-2, 56, 83));
        ImageView imageView = new ImageView(context);
        this.L = imageView;
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
        this.M = g2Var;
        g2Var.f20489k = 200.0f;
        g2Var.c(1.0f, false);
        imageView.setImageDrawable(g2Var);
        org.telegram.ui.Cells.z f02 = j6.f0(1090519039, 1, -1);
        this.N = f02;
        imageView.setBackground(f02);
        ydVar.addView(imageView, x5.n(54, 56));
        yd ydVar2 = new yd(context, 7);
        this.I = ydVar2;
        ydVar2.setOrientation(0);
        addView(ydVar2, x5.e(-2, 56, 85));
        ImageView imageView2 = new ImageView(context);
        this.O = imageView2;
        imageView2.setScaleType(scaleType);
        u1 u1Var = new u1(k0Var);
        this.P = u1Var;
        imageView2.setImageDrawable(u1Var);
        u1Var.f();
        org.telegram.ui.Cells.z f03 = j6.f0(1090519039, 1, -1);
        this.Q = f03;
        imageView2.setBackground(f03);
        ydVar2.addView(imageView2, x5.n(54, 56));
        ImageView imageView3 = new ImageView(context);
        this.R = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.ic_ab_other);
        imageView3.setColorFilter(new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_IN));
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                float f7;
                View childAt;
                Utilities.Callback callback;
                switch (r2) {
                    case 0:
                        boolean z10 = true;
                        org.telegram.ui.k0 k0Var2 = k0Var;
                        if (k0Var2.getParent() instanceof ViewGroup) {
                            a8 a8Var = new a8(k0Var2, 2);
                            Utilities.Callback callback2 = null;
                            n70 F = n70.F((ViewGroup) k0Var2.getParent(), null, k0Var2.R);
                            F.f28687s = 0;
                            F.S(k0Var2.m0, k0Var2.f42319n0);
                            F.a0(0.0f, -AndroidUtilities.dp(52.0f));
                            F.S = 200;
                            int v = j6.v(k0Var2.f42317l0, j6.l1(0.1f, k0Var2.m0));
                            F.f28676l0 = Integer.valueOf(v);
                            int i11 = 0;
                            while (i11 < F.A.getChildCount()) {
                                if (i11 == F.A.getChildCount() - 1) {
                                    childAt = F.D;
                                } else {
                                    childAt = F.A.getChildAt(i11);
                                }
                                if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                                    int i12 = 0;
                                    while (i12 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
                                        View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i12);
                                        Utilities.Callback callback3 = callback2;
                                        if (childAt2 instanceof org.telegram.ui.ActionBar.f1) {
                                            ((org.telegram.ui.ActionBar.f1) childAt2).setSelectorColor(v);
                                        }
                                        i12++;
                                        callback2 = callback3;
                                    }
                                    callback = callback2;
                                } else {
                                    callback = callback2;
                                    if (childAt instanceof org.telegram.ui.ActionBar.f1) {
                                        ((org.telegram.ui.ActionBar.f1) childAt).setSelectorColor(v);
                                    }
                                }
                                i11++;
                                callback2 = callback;
                            }
                            Utilities.Callback callback4 = callback2;
                            if (AndroidUtilities.computePerceivedBrightness(k0Var2.f42317l0) > 0.721f) {
                                F.P(-1);
                                F.T(-986896);
                            } else {
                                F.P(-14737633);
                                F.T(-15592942);
                            }
                            int i13 = k0Var2.f42312g0;
                            if (i13 == 0) {
                                F.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) a8Var.run(3), false);
                                F.c(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) a8Var.run(1), false);
                                F.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) a8Var.run(2), !k0Var2.f42322q0);
                                F.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) a8Var.run(4), false);
                            } else if (i13 == 1) {
                                if (!k0Var2.f42321p0) {
                                    F.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) a8Var.run(3), false);
                                    F.k();
                                }
                                if (k0Var2.f42320o0) {
                                    F.c(R.drawable.msg_arrow_forward, LocaleController.getString(R.string.WebForward), (Runnable) a8Var.run(9), false);
                                }
                                h2 instantViewLoader = k0Var2.getInstantViewLoader();
                                if (instantViewLoader != null && (((!instantViewLoader.f42134g || !instantViewLoader.f42135i) && instantViewLoader.h == null && instantViewLoader.f42136j == null && !instantViewLoader.f42131c) || instantViewLoader.b() != null)) {
                                    F.c(R.drawable.menu_instant_view, LocaleController.getString(R.string.OpenLocalInstantView), (Runnable) a8Var.run(10), false);
                                    org.telegram.ui.ActionBar.f1 y3 = F.y();
                                    if (instantViewLoader.b() == null) {
                                        z10 = false;
                                    }
                                    y3.setEnabled(z10);
                                    if (y3.isEnabled()) {
                                        f7 = 1.0f;
                                    } else {
                                        f7 = 0.5f;
                                    }
                                    y3.setAlpha(f7);
                                    g1 g1Var = new g1(1, y3, instantViewLoader);
                                    instantViewLoader.f42139m.add(g1Var);
                                    F.f28682p = new g1(5, instantViewLoader, g1Var);
                                }
                                F.c(R.drawable.msg_reset, LocaleController.getString(R.string.Refresh), (Runnable) a8Var.run(5), false);
                                F.c(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) a8Var.run(1), false);
                                F.c(R.drawable.msg_saved, LocaleController.getString(R.string.WebBookmark), (Runnable) a8Var.run(6), false);
                                F.c(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) a8Var.run(2), false);
                                F.k();
                                if (!f1.a(callback4).isEmpty()) {
                                    F.c(R.drawable.menu_views_recent, LocaleController.getString(R.string.WebHistory), (Runnable) a8Var.run(8), false);
                                }
                                F.c(R.drawable.menu_browser_bookmarks, LocaleController.getString(R.string.WebBookmarks), (Runnable) a8Var.run(7), false);
                                F.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) a8Var.run(4), false);
                            }
                            F.f28682p = new q31(k0Var2);
                            F.Z();
                            return;
                        }
                        return;
                    default:
                        k0Var.V.setText("");
                        return;
                }
            }
        });
        org.telegram.ui.Cells.z f04 = j6.f0(1090519039, 1, -1);
        this.S = f04;
        imageView3.setBackground(f04);
        imageView3.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
        ydVar2.addView(imageView3, x5.n(54, 56));
        gi.o oVar = new gi.o(context, 3);
        this.V = oVar;
        oVar.setVisibility(8);
        oVar.setAlpha(0.0f);
        oVar.setTextSize(1, 18.0f);
        oVar.setSingleLine(true);
        oVar.setHint(LocaleController.getString(R.string.Search));
        oVar.setBackgroundResource(0);
        oVar.setCursorWidth(1.5f);
        oVar.setGravity(112);
        oVar.setClipToPadding(true);
        oVar.setPadding(AndroidUtilities.dp(58.0f), 0, AndroidUtilities.dp(112.0f), 0);
        oVar.setTranslationY(-AndroidUtilities.dp(0.66f));
        oVar.setInputType(oVar.getInputType() | 524288);
        oVar.setImeOptions(33554435);
        oVar.setTextIsSelectable(false);
        oVar.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (keyEvent != null) {
                            if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                                AndroidUtilities.hideKeyboard(k0Var.V);
                                return false;
                            }
                            return false;
                        }
                        return false;
                    default:
                        if (i11 == 2) {
                            org.telegram.ui.k0 k0Var2 = k0Var;
                            di.m2 m2Var = k0Var2.f42329v0;
                            if (m2Var != null) {
                                m2Var.run(k0Var2.f42304b0.getText().toString());
                            }
                            k0Var2.k(false);
                        }
                        return false;
                }
            }
        });
        oVar.addTextChangedListener(new di.i2(k0Var, 15));
        frameLayout.addView(oVar, x5.e(-1, -1, 119));
        gi.o oVar2 = new gi.o(context, 4);
        this.f42304b0 = oVar2;
        oVar2.setVisibility(8);
        oVar2.setAlpha(0.0f);
        oVar2.setTextSize(1, 15.66f);
        oVar2.setSingleLine(true);
        this.f42306c0 = SharedConfig.searchEngineType;
        oVar2.setHint(LocaleController.formatString(R.string.AddressPlaceholder, p1.a().f42235a));
        oVar2.setBackgroundResource(0);
        oVar2.setCursorWidth(1.5f);
        oVar2.setGravity(112);
        oVar2.setInputType(oVar2.getInputType() | 524288);
        oVar2.setImeOptions(33554434);
        oVar2.setTextIsSelectable(false);
        oVar2.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (keyEvent != null) {
                            if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                                AndroidUtilities.hideKeyboard(k0Var.V);
                                return false;
                            }
                            return false;
                        }
                        return false;
                    default:
                        if (i11 == 2) {
                            org.telegram.ui.k0 k0Var2 = k0Var;
                            di.m2 m2Var = k0Var2.f42329v0;
                            if (m2Var != null) {
                                m2Var.run(k0Var2.f42304b0.getText().toString());
                            }
                            k0Var2.k(false);
                        }
                        return false;
                }
            }
        });
        frameLayout2.addView(oVar2, x5.d(-1, -1.0f, 119, 48.0f, 0.0f, 12.0f, 0.0f));
        ImageView imageView4 = new ImageView(context);
        this.J = imageView4;
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(R.drawable.ic_close_white);
        org.telegram.ui.Cells.z f05 = j6.f0(1090519039, 1, -1);
        this.K = f05;
        imageView4.setBackground(f05);
        imageView4.setVisibility(8);
        imageView4.setAlpha(0.0f);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                float f7;
                View childAt;
                Utilities.Callback callback;
                switch (r2) {
                    case 0:
                        boolean z10 = true;
                        org.telegram.ui.k0 k0Var2 = k0Var;
                        if (k0Var2.getParent() instanceof ViewGroup) {
                            a8 a8Var = new a8(k0Var2, 2);
                            Utilities.Callback callback2 = null;
                            n70 F = n70.F((ViewGroup) k0Var2.getParent(), null, k0Var2.R);
                            F.f28687s = 0;
                            F.S(k0Var2.m0, k0Var2.f42319n0);
                            F.a0(0.0f, -AndroidUtilities.dp(52.0f));
                            F.S = 200;
                            int v = j6.v(k0Var2.f42317l0, j6.l1(0.1f, k0Var2.m0));
                            F.f28676l0 = Integer.valueOf(v);
                            int i11 = 0;
                            while (i11 < F.A.getChildCount()) {
                                if (i11 == F.A.getChildCount() - 1) {
                                    childAt = F.D;
                                } else {
                                    childAt = F.A.getChildAt(i11);
                                }
                                if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                                    int i12 = 0;
                                    while (i12 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
                                        View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i12);
                                        Utilities.Callback callback3 = callback2;
                                        if (childAt2 instanceof org.telegram.ui.ActionBar.f1) {
                                            ((org.telegram.ui.ActionBar.f1) childAt2).setSelectorColor(v);
                                        }
                                        i12++;
                                        callback2 = callback3;
                                    }
                                    callback = callback2;
                                } else {
                                    callback = callback2;
                                    if (childAt instanceof org.telegram.ui.ActionBar.f1) {
                                        ((org.telegram.ui.ActionBar.f1) childAt).setSelectorColor(v);
                                    }
                                }
                                i11++;
                                callback2 = callback;
                            }
                            Utilities.Callback callback4 = callback2;
                            if (AndroidUtilities.computePerceivedBrightness(k0Var2.f42317l0) > 0.721f) {
                                F.P(-1);
                                F.T(-986896);
                            } else {
                                F.P(-14737633);
                                F.T(-15592942);
                            }
                            int i13 = k0Var2.f42312g0;
                            if (i13 == 0) {
                                F.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) a8Var.run(3), false);
                                F.c(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) a8Var.run(1), false);
                                F.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) a8Var.run(2), !k0Var2.f42322q0);
                                F.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) a8Var.run(4), false);
                            } else if (i13 == 1) {
                                if (!k0Var2.f42321p0) {
                                    F.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) a8Var.run(3), false);
                                    F.k();
                                }
                                if (k0Var2.f42320o0) {
                                    F.c(R.drawable.msg_arrow_forward, LocaleController.getString(R.string.WebForward), (Runnable) a8Var.run(9), false);
                                }
                                h2 instantViewLoader = k0Var2.getInstantViewLoader();
                                if (instantViewLoader != null && (((!instantViewLoader.f42134g || !instantViewLoader.f42135i) && instantViewLoader.h == null && instantViewLoader.f42136j == null && !instantViewLoader.f42131c) || instantViewLoader.b() != null)) {
                                    F.c(R.drawable.menu_instant_view, LocaleController.getString(R.string.OpenLocalInstantView), (Runnable) a8Var.run(10), false);
                                    org.telegram.ui.ActionBar.f1 y3 = F.y();
                                    if (instantViewLoader.b() == null) {
                                        z10 = false;
                                    }
                                    y3.setEnabled(z10);
                                    if (y3.isEnabled()) {
                                        f7 = 1.0f;
                                    } else {
                                        f7 = 0.5f;
                                    }
                                    y3.setAlpha(f7);
                                    g1 g1Var = new g1(1, y3, instantViewLoader);
                                    instantViewLoader.f42139m.add(g1Var);
                                    F.f28682p = new g1(5, instantViewLoader, g1Var);
                                }
                                F.c(R.drawable.msg_reset, LocaleController.getString(R.string.Refresh), (Runnable) a8Var.run(5), false);
                                F.c(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) a8Var.run(1), false);
                                F.c(R.drawable.msg_saved, LocaleController.getString(R.string.WebBookmark), (Runnable) a8Var.run(6), false);
                                F.c(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) a8Var.run(2), false);
                                F.k();
                                if (!f1.a(callback4).isEmpty()) {
                                    F.c(R.drawable.menu_views_recent, LocaleController.getString(R.string.WebHistory), (Runnable) a8Var.run(8), false);
                                }
                                F.c(R.drawable.menu_browser_bookmarks, LocaleController.getString(R.string.WebBookmarks), (Runnable) a8Var.run(7), false);
                                F.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) a8Var.run(4), false);
                            }
                            F.f28682p = new q31(k0Var2);
                            F.Z();
                            return;
                        }
                        return;
                    default:
                        k0Var.V.setText("");
                        return;
                }
            }
        });
        addView(imageView4, x5.e(54, 56, 85));
        m80 m80Var = new m80(context);
        this.f42307d0 = m80Var;
        m80Var.setPivotX(0.0f);
        m80Var.setPivotY(AndroidUtilities.dp(2.0f));
        addView(m80Var, x5.e(-1, 2, 87));
        setWillNotDraw(false);
        this.f42303b[0] = new v1(k0Var);
        this.f42303b[1] = new v1(k0Var);
        int i11 = j6.Pk;
        d(j6.w0(null, i11, false), false);
        setMenuColors(j6.w0(null, i11, false));
    }

    public final void a(Canvas canvas, float f7, float f10, boolean z10) {
        float f11;
        float max = Math.max(AndroidUtilities.dp(0.66f), 1);
        float f12 = f7 - max;
        float width = getWidth() * this.f42305c;
        RectF rectF = this.f42301a;
        rectF.set(0.0f, 0.0f, getWidth(), f7);
        Paint[] paintArr = this.f42310f;
        int alpha = paintArr[1].getAlpha();
        paintArr[1].setAlpha((int) (alpha * 1.0f));
        canvas.drawRect(rectF, paintArr[1]);
        paintArr[1].setAlpha(alpha);
        float f13 = this.f42305c;
        float[] fArr = this.d;
        Paint[] paintArr2 = this.f42318n;
        Paint[] paintArr3 = this.h;
        if (f13 > 0.0f) {
            rectF.set(0.0f, 0.0f, fArr[1] * getWidth(), f7);
            int alpha2 = paintArr3[1].getAlpha();
            f11 = 1.0f;
            paintArr3[1].setAlpha((int) ((1.0f - this.f42302a0) * (1.0f - this.U) * alpha2 * 1.0f));
            canvas.drawRect(rectF, paintArr3[1]);
            paintArr3[1].setAlpha(alpha2);
            if (z10) {
                rectF.set(0.0f, f12, width, f12 + max);
                int alpha3 = paintArr2[1].getAlpha();
                paintArr2[1].setAlpha((int) ((1.0f - this.f42302a0) * alpha3 * 1.0f * f10));
                canvas.drawRect(rectF, paintArr2[1]);
                paintArr2[1].setAlpha(alpha3);
            }
        } else {
            f11 = 1.0f;
        }
        float f14 = this.f42305c;
        if (f14 < f11) {
            int l1 = j6.l1((f11 - f14) * f11, 1610612736);
            Paint paint = this.f42323r;
            paint.setColor(l1);
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
        paintArr3[0].setAlpha((int) ((f11 - this.f42302a0) * (f11 - this.U) * (f11 - Utilities.clamp01(this.f42305c * 4.0f)) * alpha5 * f11));
        canvas.drawRect(rectF, paintArr3[0]);
        paintArr3[0].setAlpha(alpha5);
        if (z10) {
            rectF.set(width, f12, getWidth() + width, max + f12);
            int alpha6 = paintArr2[0].getAlpha();
            paintArr2[0].setAlpha((int) ((f11 - this.f42302a0) * alpha6 * f11 * f10));
            canvas.drawRect(rectF, paintArr2[0]);
            paintArr2[0].setAlpha(alpha6);
        }
    }

    public final void b(int i10, int i11) {
        float f7;
        boolean[] zArr = this.f42308e;
        boolean z10 = zArr[i10];
        Paint[] paintArr = this.f42310f;
        if (z10 && paintArr[i10].getColor() == i11) {
            return;
        }
        zArr[i10] = true;
        paintArr[i10].setColor(i11);
        if (AndroidUtilities.computePerceivedBrightness(i11) <= 0.721f) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        int d = i0.a.d(f7, -16777216, -1);
        this.h[i10].setColor(j6.v(i11, j6.l1(AndroidUtilities.lerp(0.07f, 0.2f, f7), d)));
        this.f42318n[i10].setColor(j6.v(i11, j6.l1(AndroidUtilities.lerp(0.14f, 0.24f, f7), d)));
        v1[] v1VarArr = this.f42303b;
        v1VarArr[i10].f42288a.r(d);
        v1VarArr[i10].d = j6.v(i11, j6.l1(0.6f, d));
        v1 v1Var = v1VarArr[i10];
        v1Var.f42289b.r(i0.a.d(v1VarArr[i10].f42290c.f25592c, v1Var.d, j6.w0(null, j6.f20925q7, false)));
        invalidate();
    }

    public final void c(final int i10, float f7, boolean z10) {
        final float f10;
        boolean[] zArr = this.f42308e;
        if (zArr[2] && this.f42314i0 == i10) {
            return;
        }
        final float f11 = 1.0f;
        if (!z10) {
            zArr[2] = true;
            if (f7 < 0.0f) {
                if (AndroidUtilities.computePerceivedBrightness(i10) <= 0.721f) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
            }
            int d = i0.a.d(f7, -16777216, -1);
            this.f42330w = d;
            j6.l1(0.55f, d);
            this.f42314i0 = i10;
            this.f42332x = i0.a.d(f7, -1, -16777216);
            int d10 = i0.a.d(1.0f - f7, -1, -16777216);
            this.f42334y = d10;
            int i11 = this.f42332x;
            i4 i4Var = ((org.telegram.ui.k0) this).B0;
            l lVar = i4Var.f37248i0;
            if (lVar != null) {
                lVar.c(i11, d10);
            }
            this.f42325s.setColor(this.f42332x);
            this.v.setColor(j6.v(this.f42332x, j6.l1(AndroidUtilities.lerp(0.07f, 0.2f, f7), this.f42330w)));
            int l1 = j6.l1(0.6f, this.f42334y);
            gi.o oVar = this.f42304b0;
            oVar.setHintTextColor(l1);
            oVar.setTextColor(this.f42334y);
            oVar.setCursorColor(this.f42334y);
            oVar.setHandlesColor(this.f42334y);
            this.f42307d0.setProgressColor(j6.w0(null, j6.Rk, false));
            int d11 = i0.a.d(this.f42302a0, this.f42330w, this.f42334y);
            org.telegram.ui.ActionBar.g2 g2Var = this.M;
            g2Var.a(d11);
            g2Var.b(i0.a.d(this.f42302a0, this.f42330w, this.f42334y));
            int i12 = this.f42330w;
            u1 u1Var = this.P;
            u1Var.f22357c.setColor(i12);
            u1Var.invalidateSelf();
            int i13 = this.f42330w;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            this.R.setColorFilter(new PorterDuffColorFilter(i13, mode));
            this.O.setColorFilter(new PorterDuffColorFilter(this.f42330w, mode));
            this.J.setColorFilter(new PorterDuffColorFilter(this.f42330w, mode));
            int v = j6.v(i10, j6.l1(0.22f, this.f42330w));
            this.f42315j0 = v;
            j6.B1(this.N, v, true);
            j6.B1(this.Q, this.f42315j0, true);
            j6.B1(this.S, this.f42315j0, true);
            j6.B1(this.K, this.f42315j0, true);
            int l12 = j6.l1(0.6f, this.f42330w);
            gi.o oVar2 = this.V;
            oVar2.setHintTextColor(l12);
            oVar2.setTextColor(this.f42330w);
            oVar2.setCursorColor(this.f42330w);
            oVar2.setHandlesColor(this.f42330w);
            v3 v3Var = i4Var.K;
            if (v3Var != null) {
                v3Var.i();
            }
            invalidate();
            return;
        }
        ValueAnimator valueAnimator = this.f42316k0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i14 = this.f42314i0;
        this.f42313h0 = i14;
        if (AndroidUtilities.computePerceivedBrightness(i14) <= 0.721f) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        if (AndroidUtilities.computePerceivedBrightness(i10) > 0.721f) {
            f11 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f42316k0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                w1 w1Var = w1.this;
                w1Var.getClass();
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                w1Var.c(i0.a.d(floatValue, w1Var.f42313h0, i10), AndroidUtilities.lerp(f10, f11, floatValue), false);
            }
        });
        this.f42316k0.addListener(new h00(this, i10, f11, 1));
        this.f42316k0.start();
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
        if (this.f42309e0) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        a(canvas, i10 + this.F, 1.0f, this.f42326s0);
        float right = this.H.getRight();
        float left = this.I.getLeft();
        boolean z10 = this.f42309e0;
        if (z10) {
            i11 = AndroidUtilities.statusBarHeight;
        } else {
            i11 = 0;
        }
        float f7 = i11;
        if (z10) {
            i12 = AndroidUtilities.statusBarHeight;
        } else {
            i12 = 0;
        }
        float f10 = i12 + this.F;
        float f11 = this.f42305c;
        v1[] v1VarArr = this.f42303b;
        if (f11 < 1.0f) {
            canvas.save();
            float width = (getWidth() * this.f42305c) - (Utilities.clamp01(this.f42305c * 2.0f) * AndroidUtilities.dp(30.0f));
            canvas.translate(right + width, f7);
            AndroidUtilities.lerp(1.0f, 0.5f, this.f42305c);
            v1VarArr[0].a(canvas, (left - right) - width, f10 - f7, (1.0f - this.U) * (1.0f - this.f42305c));
            canvas.restore();
        }
        if (this.f42305c > 0.0f) {
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getWidth() * this.f42305c, getHeight());
            canvas.translate(right, f7);
            canvas.translate((1.0f - this.f42305c) * AndroidUtilities.dp(-12.0f), 0.0f);
            float lerp = AndroidUtilities.lerp(1.0f, 0.5f, 1.0f - this.f42305c);
            float f12 = f10 - f7;
            canvas.scale(lerp, lerp, 0.0f, f12 / 2.0f);
            v1VarArr[1].a(canvas, left - right, f12, (1.0f - this.f42302a0) * (1.0f - this.U) * this.f42305c);
            canvas.restore();
        }
        float f13 = this.f42302a0;
        RectF rectF = this.f42301a;
        if (f13 > 0.0f) {
            Paint paint = this.f42325s;
            int alpha = paint.getAlpha();
            paint.setAlpha((int) (alpha * this.f42302a0));
            float width2 = getWidth();
            if (this.f42309e0) {
                i13 = AndroidUtilities.statusBarHeight;
            }
            canvas.drawRect(0.0f, 0.0f, width2, i13 + this.F, paint);
            paint.setAlpha(alpha);
            float f14 = (f7 + f10) / 2.0f;
            float dp = AndroidUtilities.dp(42.0f) / 2.0f;
            rectF.set(AndroidUtilities.dp(6.0f), f14 - dp, AndroidUtilities.lerp(left, getWidth() - AndroidUtilities.dp(6.0f), this.f42302a0), f14 + dp);
            Paint paint2 = this.v;
            int alpha2 = paint2.getAlpha();
            paint2.setAlpha((int) (alpha2 * this.f42302a0));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), paint2);
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
        z0 webView;
        int action = motionEvent.getAction();
        r1 r1Var = this.f42336z0;
        if (action == 0) {
            this.A0 = false;
            AndroidUtilities.cancelRunOnUIThread(r1Var);
            if (motionEvent.getX() > this.H.getRight() && motionEvent.getX() < this.I.getLeft() && !this.T && !this.W) {
                this.f42333x0 = motionEvent.getX();
                motionEvent.getY();
                this.f42335y0 = System.currentTimeMillis();
                AndroidUtilities.runOnUIThread(r1Var, ViewConfiguration.getLongPressTimeout() * 0.8f);
            }
        } else if (motionEvent.getAction() == 2 && ((float) (System.currentTimeMillis() - this.f42335y0)) > ViewConfiguration.getLongPressTimeout() * 0.8f) {
            AndroidUtilities.cancelRunOnUIThread(r1Var);
            this.A0 = true;
            m3 m3Var = ((org.telegram.ui.k0) this).B0.f37259u0[0];
            float clamp01 = Utilities.clamp01(m3Var.getProgress() + ((motionEvent.getX() - this.f42333x0) / (getWidth() * 0.8f)));
            if (!m3Var.c() && m3Var.f() && (webView = m3Var.f38581f.getWebView()) != null) {
                webView.setScrollProgress(clamp01);
                m3Var.K.f0();
            }
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(r1Var);
            this.f42335y0 = 0L;
        }
        this.f42333x0 = motionEvent.getX();
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(int i10, boolean z10) {
        float f7;
        v1 v1Var = this.f42303b[i10];
        if (v1Var.f42291e != z10) {
            v1Var.f42291e = z10;
            e6 e6Var = v1Var.f42290c;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            e6Var.d(f7, true);
            invalidate();
        }
    }

    public final void f(int i10, String str) {
        v1[] v1VarArr = this.f42303b;
        CharSequence charSequence = v1VarArr[i10].f42289b.f29316g;
        if (charSequence != null && TextUtils.equals(charSequence.toString(), str)) {
            return;
        }
        v1VarArr[i10].f42289b.q(Emoji.replaceEmoji(str, v1VarArr[i10].f42289b.f29311a.getFontMetricsInt(), false), false, true);
    }

    public final void g(int i10, String str, boolean z10) {
        v1[] v1VarArr = this.f42303b;
        CharSequence charSequence = v1VarArr[i10].f42288a.f29316g;
        if (charSequence != null && TextUtils.equals(charSequence.toString(), str)) {
            return;
        }
        v1VarArr[i10].f42288a.q(Emoji.replaceEmoji(str, v1VarArr[i10].f42288a.f29311a.getFontMetricsInt(), false), z10, true);
    }

    public int getBackgroundColor() {
        return this.f42314i0;
    }

    public h2 getInstantViewLoader() {
        return null;
    }

    public int getTextColor() {
        return this.f42330w;
    }

    public String getTitle() {
        CharSequence charSequence = this.f42303b[0].f42288a.f29316g;
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
        ValueAnimator valueAnimator = this.f42327t0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.T = z10;
        gi.o oVar = this.V;
        boolean z11 = false;
        oVar.setVisibility(0);
        float f10 = 0.0f;
        if (!this.f42328u0 && !z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.M.c(f7, true);
        float f11 = this.U;
        if (z10) {
            f10 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f42327t0 = ofFloat;
        ofFloat.addUpdateListener(new ki.a(this, 7));
        this.f42327t0.addListener(new e50(13, this, z10));
        this.f42327t0.setInterpolator(pr.h);
        this.f42327t0.setDuration(320L);
        this.f42327t0.start();
        boolean z12 = !z10;
        AndroidUtilities.updateViewShow(this.O, z12, true, true);
        AndroidUtilities.updateViewShow(this.R, z12, true, true);
        if (oVar.length() > 0 && this.T) {
            z11 = true;
        }
        AndroidUtilities.updateViewShow(this.J, z11, true, true);
    }

    public final void i() {
        v1[] v1VarArr = this.f42303b;
        v1 v1Var = v1VarArr[0];
        v1VarArr[0] = v1VarArr[1];
        v1VarArr[1] = v1Var;
        float[] fArr = this.d;
        float f7 = fArr[0];
        fArr[0] = fArr[1];
        fArr[1] = f7;
        Paint[] paintArr = this.f42310f;
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
        if (this.f42309e0) {
            i12 = AndroidUtilities.statusBarHeight;
        } else {
            i12 = 0;
        }
        super.onMeasure(i10, wl.C(56.0f, i12, 1073741824));
    }

    public void setBackButton(boolean z10) {
        float f7;
        this.f42328u0 = z10;
        if (!this.T && !this.W) {
            if (z10) {
                f7 = 0.0f;
            } else {
                f7 = 1.0f;
            }
            this.M.c(f7, true);
        }
    }

    public void setBackButtonCached(boolean z10) {
        this.f42328u0 = z10;
    }

    public void setHasForward(boolean z10) {
        this.f42320o0 = z10;
    }

    public void setHeight(int i10) {
        if (this.F != i10) {
            this.F = i10;
            float pow = (float) Math.pow(i10 / AndroidUtilities.dp(56.0f), 0.5d);
            this.G = pow;
            yd ydVar = this.H;
            ydVar.setScaleX(pow);
            ydVar.setScaleY(this.G);
            ydVar.setTranslationX((1.0f - this.G) * AndroidUtilities.dp(42.0f));
            ydVar.setTranslationY((1.0f - this.G) * AndroidUtilities.dp(-12.0f));
            float f7 = this.G;
            yd ydVar2 = this.I;
            ydVar2.setScaleX(f7);
            ydVar2.setScaleY(this.G);
            ydVar2.setTranslationX((1.0f - this.G) * (-AndroidUtilities.dp(42.0f)));
            ydVar2.setTranslationY((1.0f - this.G) * AndroidUtilities.dp(-12.0f));
            this.f42307d0.setTranslationY(this.F - AndroidUtilities.dp(56.0f));
            invalidate();
        }
    }

    public void setIsLocal(boolean z10) {
        this.f42322q0 = z10;
    }

    public void setIsTonsite(boolean z10) {
        this.f42321p0 = z10;
    }

    public void setMenuColors(int i10) {
        double atan2;
        int i11;
        boolean z10 = false;
        double[] j3 = g5.j(g5.f20494a, g5.j(g5.f20496c, new double[]{Color.red(i10) / 255.0d, Color.green(i10) / 255.0d, Color.blue(i10) / 255.0d}));
        for (int i12 = 0; i12 < 3; i12++) {
            j3[i12] = Math.cbrt(j3[i12]);
        }
        double[] j10 = g5.j(g5.f20495b, j3);
        double d = j10[0];
        double d10 = j10[1];
        double d11 = j10[2];
        double sqrt = Math.sqrt(Math.pow(d11, 2.0d) + Math.pow(d10, 2.0d));
        if (Math.abs(d10) < 2.0E-4d && Math.abs(d11) < 2.0E-4d) {
            atan2 = Double.NaN;
        } else {
            atan2 = ((((Math.atan2(d11, d10) * 180.0d) / 3.141592653589793d) % 360.0d) + 360.0d) % 360.0d;
        }
        if (new double[]{d, sqrt, atan2}[0] < 0.5d) {
            z10 = true;
        }
        int i13 = -1;
        if (z10) {
            i11 = -16777216;
        } else {
            i11 = -1;
        }
        this.f42317l0 = i11;
        if (!z10) {
            i13 = -16777216;
        }
        this.m0 = i13;
        this.f42319n0 = j6.l1(0.6f, i13);
    }

    public void setMenuListener(Utilities.Callback<Integer> callback) {
        this.f42311f0 = callback;
    }

    public void setMenuType(int i10) {
        if (this.f42312g0 != i10) {
            this.f42312g0 = i10;
        }
    }

    public void setProgress(float f7) {
        this.d[0] = f7;
        invalidate();
    }

    public void setTransitionProgress(float f7) {
        this.f42305c = f7;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return true;
    }

    public void setIsLoaded(boolean z10) {
    }
}
