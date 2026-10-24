package org.telegram.ui.web;

import ai.ie;
import ai.kc;
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
import ei.i6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.tl;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.zr;
import org.telegram.ui.Wallet.y3;
import org.telegram.ui.hf0;
import org.telegram.ui.k4;
import org.telegram.ui.n3;
import org.telegram.ui.o40;
import org.telegram.ui.w10;
import org.telegram.ui.w3;
import w7.z5;
public abstract class u1 extends FrameLayout {
    public boolean A0;
    public final TextPaint E;
    public int F;
    public float G;
    public final ai.r H;
    public final ai.r I;
    public final ImageView J;
    public final org.telegram.ui.Cells.y K;
    public final ImageView L;
    public final org.telegram.ui.ActionBar.h2 M;
    public final org.telegram.ui.Cells.y N;
    public final ImageView O;
    public final s1 P;
    public final org.telegram.ui.Cells.y Q;
    public final ImageView R;
    public final org.telegram.ui.Cells.y S;
    public boolean T;
    public float U;
    public final ai.t V;
    public boolean W;
    public final RectF f43257a;
    public float f43258a0;
    public final t1[] f43259b;
    public final ai.t f43260b0;
    public float f43261c;
    public int f43262c0;
    public final float[] d;
    public final f90 f43263d0;
    public final boolean[] e;
    public boolean f43264e0;
    public final Paint[] f43265f;
    public Utilities.Callback f43266f0;
    public int f43267g0;
    public final Paint[] h;
    public int f43268h0;
    public int f43269i0;
    public int f43270j0;
    public ValueAnimator f43271k0;
    public int f43272l0;
    public int m0;
    public final Paint[] f43273n;
    public int f43274n0;
    public boolean f43275o0;
    public boolean f43276p0;
    public boolean f43277q0;
    public final Paint f43278r;
    public final w10 f43279r0;
    public final Paint f43280s;
    public boolean f43281s0;
    public ValueAnimator f43282t0;
    public boolean f43283u0;
    public final Paint v;
    public m3 f43284v0;
    public int f43285w;
    public ValueAnimator f43286w0;
    public int f43287x;
    public float f43288x0;
    public int f43289y;
    public long f43290y0;
    public final p1 f43291z0;

    public u1(Context context) {
        super(context);
        this.f43257a = new RectF();
        this.f43259b = new t1[2];
        this.f43261c = 0.0f;
        this.d = new float[2];
        this.e = new boolean[3];
        this.f43265f = new Paint[2];
        this.h = new Paint[2];
        this.f43273n = new Paint[2];
        this.f43278r = new Paint(1);
        this.f43280s = new Paint(1);
        this.v = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.E = textPaint;
        this.F = AndroidUtilities.dp(56.0f);
        this.G = 1.0f;
        this.U = 0.0f;
        this.f43258a0 = 0.0f;
        this.f43267g0 = -1;
        this.f43279r0 = new w10();
        final org.telegram.ui.m0 m0Var = (org.telegram.ui.m0) this;
        this.f43291z0 = new p1(m0Var, 0);
        this.A0 = false;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(18.33f));
        for (int i10 = 0; i10 < 2; i10++) {
            this.f43265f[i10] = new Paint(1);
            this.h[i10] = new Paint(1);
            this.f43273n[i10] = new Paint(1);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, z5.e(-1, 56, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        addView(frameLayout2, z5.e(-1, 56, 87));
        ai.r rVar = new ai.r(context, 9);
        this.H = rVar;
        rVar.setOrientation(0);
        addView(rVar, z5.e(-2, 56, 83));
        ImageView imageView = new ImageView(context);
        this.L = imageView;
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(false);
        this.M = h2Var;
        h2Var.f20939k = 200.0f;
        h2Var.c(1.0f, false);
        imageView.setImageDrawable(h2Var);
        org.telegram.ui.Cells.y g02 = k6.g0(1090519039, 1, -1);
        this.N = g02;
        imageView.setBackground(g02);
        rVar.addView(imageView, z5.n(54, 56));
        ai.r rVar2 = new ai.r(context, 10);
        this.I = rVar2;
        rVar2.setOrientation(0);
        addView(rVar2, z5.e(-2, 56, 85));
        ImageView imageView2 = new ImageView(context);
        this.O = imageView2;
        imageView2.setScaleType(scaleType);
        s1 s1Var = new s1(m0Var);
        this.P = s1Var;
        imageView2.setImageDrawable(s1Var);
        s1Var.f();
        org.telegram.ui.Cells.y g03 = k6.g0(1090519039, 1, -1);
        this.Q = g03;
        imageView2.setBackground(g03);
        rVar2.addView(imageView2, z5.n(54, 56));
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
                        org.telegram.ui.m0 m0Var2 = m0Var;
                        if (m0Var2.getParent() instanceof ViewGroup) {
                            kc kcVar = new kc(m0Var2, 3);
                            Utilities.Callback callback2 = null;
                            h80 F = h80.F((ViewGroup) m0Var2.getParent(), null, m0Var2.R);
                            F.f26929s = 0;
                            F.S(m0Var2.m0, m0Var2.f43274n0);
                            F.a0(0.0f, -AndroidUtilities.dp(52.0f));
                            F.S = 200;
                            int v = k6.v(m0Var2.f43272l0, k6.o1(0.1f, m0Var2.m0));
                            F.f26918l0 = Integer.valueOf(v);
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
                                        if (childAt2 instanceof org.telegram.ui.ActionBar.e1) {
                                            ((org.telegram.ui.ActionBar.e1) childAt2).setSelectorColor(v);
                                        }
                                        i12++;
                                        callback2 = callback3;
                                    }
                                    callback = callback2;
                                } else {
                                    callback = callback2;
                                    if (childAt instanceof org.telegram.ui.ActionBar.e1) {
                                        ((org.telegram.ui.ActionBar.e1) childAt).setSelectorColor(v);
                                    }
                                }
                                i11++;
                                callback2 = callback;
                            }
                            Utilities.Callback callback4 = callback2;
                            if (AndroidUtilities.computePerceivedBrightness(m0Var2.f43272l0) > 0.721f) {
                                F.P(-1);
                                F.T(-986896);
                            } else {
                                F.P(-14737633);
                                F.T(-15592942);
                            }
                            int i13 = m0Var2.f43267g0;
                            if (i13 == 0) {
                                F.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) kcVar.run(3), false);
                                F.c(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) kcVar.run(1), false);
                                F.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) kcVar.run(2), !m0Var2.f43277q0);
                                F.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) kcVar.run(4), false);
                            } else if (i13 == 1) {
                                if (!m0Var2.f43276p0) {
                                    F.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) kcVar.run(3), false);
                                    F.k();
                                }
                                if (m0Var2.f43275o0) {
                                    F.c(R.drawable.msg_arrow_forward, LocaleController.getString(R.string.WebForward), (Runnable) kcVar.run(9), false);
                                }
                                g2 instantViewLoader = m0Var2.getInstantViewLoader();
                                if (instantViewLoader != null && (((!instantViewLoader.f43114g || !instantViewLoader.f43115i) && instantViewLoader.h == null && instantViewLoader.f43116j == null && !instantViewLoader.f43112c) || instantViewLoader.b() != null)) {
                                    F.c(R.drawable.menu_instant_view, LocaleController.getString(R.string.OpenLocalInstantView), (Runnable) kcVar.run(10), false);
                                    org.telegram.ui.ActionBar.e1 y3 = F.y();
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
                                    y3 y3Var = new y3(25, y3, instantViewLoader);
                                    instantViewLoader.f43119m.add(y3Var);
                                    F.f26924p = new y3(29, instantViewLoader, y3Var);
                                }
                                F.c(R.drawable.msg_reset, LocaleController.getString(R.string.Refresh), (Runnable) kcVar.run(5), false);
                                F.c(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) kcVar.run(1), false);
                                F.c(R.drawable.msg_saved, LocaleController.getString(R.string.WebBookmark), (Runnable) kcVar.run(6), false);
                                F.c(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) kcVar.run(2), false);
                                F.k();
                                if (!d1.a(callback4).isEmpty()) {
                                    F.c(R.drawable.menu_views_recent, LocaleController.getString(R.string.WebHistory), (Runnable) kcVar.run(8), false);
                                }
                                F.c(R.drawable.menu_browser_bookmarks, LocaleController.getString(R.string.WebBookmarks), (Runnable) kcVar.run(7), false);
                                F.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) kcVar.run(4), false);
                            }
                            F.f26924p = new hf0(m0Var2);
                            F.Z();
                            return;
                        }
                        return;
                    default:
                        m0Var.V.setText("");
                        return;
                }
            }
        });
        org.telegram.ui.Cells.y g04 = k6.g0(1090519039, 1, -1);
        this.S = g04;
        imageView3.setBackground(g04);
        imageView3.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
        rVar2.addView(imageView3, z5.n(54, 56));
        ai.t tVar = new ai.t(context, 4);
        this.V = tVar;
        tVar.setVisibility(8);
        tVar.setAlpha(0.0f);
        tVar.setTextSize(1, 18.0f);
        tVar.setSingleLine(true);
        tVar.setHint(LocaleController.getString(R.string.Search));
        tVar.setBackgroundResource(0);
        tVar.setCursorWidth(1.5f);
        tVar.setGravity(112);
        tVar.setClipToPadding(true);
        tVar.setPadding(AndroidUtilities.dp(58.0f), 0, AndroidUtilities.dp(112.0f), 0);
        tVar.setTranslationY(-AndroidUtilities.dp(0.66f));
        tVar.setInputType(tVar.getInputType() | 524288);
        tVar.setImeOptions(33554435);
        tVar.setTextIsSelectable(false);
        tVar.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (keyEvent != null) {
                            if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                                AndroidUtilities.hideKeyboard(m0Var.V);
                                return false;
                            }
                            return false;
                        }
                        return false;
                    default:
                        if (i11 == 2) {
                            org.telegram.ui.m0 m0Var2 = m0Var;
                            m3 m3Var = m0Var2.f43284v0;
                            if (m3Var != null) {
                                m3Var.run(m0Var2.f43260b0.getText().toString());
                            }
                            m0Var2.k(false);
                        }
                        return false;
                }
            }
        });
        tVar.addTextChangedListener(new ai.u(m0Var, 19));
        frameLayout.addView(tVar, z5.e(-1, -1, 119));
        ai.t tVar2 = new ai.t(context, 5);
        this.f43260b0 = tVar2;
        tVar2.setVisibility(8);
        tVar2.setAlpha(0.0f);
        tVar2.setTextSize(1, 15.66f);
        tVar2.setSingleLine(true);
        this.f43262c0 = SharedConfig.searchEngineType;
        tVar2.setHint(LocaleController.formatString(R.string.AddressPlaceholder, n1.a().f43195a));
        tVar2.setBackgroundResource(0);
        tVar2.setCursorWidth(1.5f);
        tVar2.setGravity(112);
        tVar2.setInputType(tVar2.getInputType() | 524288);
        tVar2.setImeOptions(33554434);
        tVar2.setTextIsSelectable(false);
        tVar2.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (keyEvent != null) {
                            if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                                AndroidUtilities.hideKeyboard(m0Var.V);
                                return false;
                            }
                            return false;
                        }
                        return false;
                    default:
                        if (i11 == 2) {
                            org.telegram.ui.m0 m0Var2 = m0Var;
                            m3 m3Var = m0Var2.f43284v0;
                            if (m3Var != null) {
                                m3Var.run(m0Var2.f43260b0.getText().toString());
                            }
                            m0Var2.k(false);
                        }
                        return false;
                }
            }
        });
        frameLayout2.addView(tVar2, z5.d(-1, -1.0f, 119, 48.0f, 0.0f, 12.0f, 0.0f));
        ImageView imageView4 = new ImageView(context);
        this.J = imageView4;
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(R.drawable.ic_close_white);
        org.telegram.ui.Cells.y g05 = k6.g0(1090519039, 1, -1);
        this.K = g05;
        imageView4.setBackground(g05);
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
                        org.telegram.ui.m0 m0Var2 = m0Var;
                        if (m0Var2.getParent() instanceof ViewGroup) {
                            kc kcVar = new kc(m0Var2, 3);
                            Utilities.Callback callback2 = null;
                            h80 F = h80.F((ViewGroup) m0Var2.getParent(), null, m0Var2.R);
                            F.f26929s = 0;
                            F.S(m0Var2.m0, m0Var2.f43274n0);
                            F.a0(0.0f, -AndroidUtilities.dp(52.0f));
                            F.S = 200;
                            int v = k6.v(m0Var2.f43272l0, k6.o1(0.1f, m0Var2.m0));
                            F.f26918l0 = Integer.valueOf(v);
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
                                        if (childAt2 instanceof org.telegram.ui.ActionBar.e1) {
                                            ((org.telegram.ui.ActionBar.e1) childAt2).setSelectorColor(v);
                                        }
                                        i12++;
                                        callback2 = callback3;
                                    }
                                    callback = callback2;
                                } else {
                                    callback = callback2;
                                    if (childAt instanceof org.telegram.ui.ActionBar.e1) {
                                        ((org.telegram.ui.ActionBar.e1) childAt).setSelectorColor(v);
                                    }
                                }
                                i11++;
                                callback2 = callback;
                            }
                            Utilities.Callback callback4 = callback2;
                            if (AndroidUtilities.computePerceivedBrightness(m0Var2.f43272l0) > 0.721f) {
                                F.P(-1);
                                F.T(-986896);
                            } else {
                                F.P(-14737633);
                                F.T(-15592942);
                            }
                            int i13 = m0Var2.f43267g0;
                            if (i13 == 0) {
                                F.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) kcVar.run(3), false);
                                F.c(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) kcVar.run(1), false);
                                F.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) kcVar.run(2), !m0Var2.f43277q0);
                                F.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) kcVar.run(4), false);
                            } else if (i13 == 1) {
                                if (!m0Var2.f43276p0) {
                                    F.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) kcVar.run(3), false);
                                    F.k();
                                }
                                if (m0Var2.f43275o0) {
                                    F.c(R.drawable.msg_arrow_forward, LocaleController.getString(R.string.WebForward), (Runnable) kcVar.run(9), false);
                                }
                                g2 instantViewLoader = m0Var2.getInstantViewLoader();
                                if (instantViewLoader != null && (((!instantViewLoader.f43114g || !instantViewLoader.f43115i) && instantViewLoader.h == null && instantViewLoader.f43116j == null && !instantViewLoader.f43112c) || instantViewLoader.b() != null)) {
                                    F.c(R.drawable.menu_instant_view, LocaleController.getString(R.string.OpenLocalInstantView), (Runnable) kcVar.run(10), false);
                                    org.telegram.ui.ActionBar.e1 y3 = F.y();
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
                                    y3 y3Var = new y3(25, y3, instantViewLoader);
                                    instantViewLoader.f43119m.add(y3Var);
                                    F.f26924p = new y3(29, instantViewLoader, y3Var);
                                }
                                F.c(R.drawable.msg_reset, LocaleController.getString(R.string.Refresh), (Runnable) kcVar.run(5), false);
                                F.c(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) kcVar.run(1), false);
                                F.c(R.drawable.msg_saved, LocaleController.getString(R.string.WebBookmark), (Runnable) kcVar.run(6), false);
                                F.c(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) kcVar.run(2), false);
                                F.k();
                                if (!d1.a(callback4).isEmpty()) {
                                    F.c(R.drawable.menu_views_recent, LocaleController.getString(R.string.WebHistory), (Runnable) kcVar.run(8), false);
                                }
                                F.c(R.drawable.menu_browser_bookmarks, LocaleController.getString(R.string.WebBookmarks), (Runnable) kcVar.run(7), false);
                                F.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) kcVar.run(4), false);
                            }
                            F.f26924p = new hf0(m0Var2);
                            F.Z();
                            return;
                        }
                        return;
                    default:
                        m0Var.V.setText("");
                        return;
                }
            }
        });
        addView(imageView4, z5.e(54, 56, 85));
        f90 f90Var = new f90(context);
        this.f43263d0 = f90Var;
        f90Var.setPivotX(0.0f);
        f90Var.setPivotY(AndroidUtilities.dp(2.0f));
        addView(f90Var, z5.e(-1, 2, 87));
        setWillNotDraw(false);
        this.f43259b[0] = new t1(m0Var);
        this.f43259b[1] = new t1(m0Var);
        int i11 = k6.Pk;
        d(k6.x0(null, i11, false), false);
        setMenuColors(k6.x0(null, i11, false));
    }

    public final void a(Canvas canvas, float f7, float f10, boolean z10) {
        float f11;
        float max = Math.max(AndroidUtilities.dp(0.66f), 1);
        float f12 = f7 - max;
        float width = getWidth() * this.f43261c;
        RectF rectF = this.f43257a;
        rectF.set(0.0f, 0.0f, getWidth(), f7);
        Paint[] paintArr = this.f43265f;
        int alpha = paintArr[1].getAlpha();
        paintArr[1].setAlpha((int) (alpha * 1.0f));
        canvas.drawRect(rectF, paintArr[1]);
        paintArr[1].setAlpha(alpha);
        int i10 = (this.f43261c > 0.0f ? 1 : (this.f43261c == 0.0f ? 0 : -1));
        float[] fArr = this.d;
        Paint[] paintArr2 = this.f43273n;
        Paint[] paintArr3 = this.h;
        if (i10 > 0) {
            rectF.set(0.0f, 0.0f, fArr[1] * getWidth(), f7);
            int alpha2 = paintArr3[1].getAlpha();
            f11 = 1.0f;
            paintArr3[1].setAlpha((int) ((1.0f - this.f43258a0) * (1.0f - this.U) * alpha2 * 1.0f));
            canvas.drawRect(rectF, paintArr3[1]);
            paintArr3[1].setAlpha(alpha2);
            if (z10) {
                rectF.set(0.0f, f12, width, f12 + max);
                int alpha3 = paintArr2[1].getAlpha();
                paintArr2[1].setAlpha((int) ((1.0f - this.f43258a0) * alpha3 * 1.0f * f10));
                canvas.drawRect(rectF, paintArr2[1]);
                paintArr2[1].setAlpha(alpha3);
            }
        } else {
            f11 = 1.0f;
        }
        float f13 = this.f43261c;
        if (f13 < f11) {
            int o12 = k6.o1((f11 - f13) * f11, 1610612736);
            Paint paint = this.f43278r;
            paint.setColor(o12);
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
        paintArr3[0].setAlpha((int) ((f11 - this.f43258a0) * (f11 - this.U) * (f11 - Utilities.clamp01(this.f43261c * 4.0f)) * alpha5 * f11));
        canvas.drawRect(rectF, paintArr3[0]);
        paintArr3[0].setAlpha(alpha5);
        if (z10) {
            rectF.set(width, f12, getWidth() + width, max + f12);
            int alpha6 = paintArr2[0].getAlpha();
            paintArr2[0].setAlpha((int) ((f11 - this.f43258a0) * alpha6 * f11 * f10));
            canvas.drawRect(rectF, paintArr2[0]);
            paintArr2[0].setAlpha(alpha6);
        }
    }

    public final void b(int i10, int i11) {
        float f7;
        boolean[] zArr = this.e;
        boolean z10 = zArr[i10];
        Paint[] paintArr = this.f43265f;
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
        int f10 = i0.a.f(f7, -16777216, -1);
        this.h[i10].setColor(k6.v(i11, k6.o1(AndroidUtilities.lerp(0.07f, 0.2f, f7), f10)));
        this.f43273n[i10].setColor(k6.v(i11, k6.o1(AndroidUtilities.lerp(0.14f, 0.24f, f7), f10)));
        t1[] t1VarArr = this.f43259b;
        t1VarArr[i10].f43247a.u(f10);
        t1VarArr[i10].d = k6.v(i11, k6.o1(0.6f, f10));
        t1 t1Var = t1VarArr[i10];
        t1Var.f43248b.u(i0.a.f(t1VarArr[i10].f43249c.f25568c, t1Var.d, k6.x0(null, k6.f21422q7, false)));
        invalidate();
    }

    public final void c(final int i10, float f7, boolean z10) {
        final float f10;
        boolean[] zArr = this.e;
        if (zArr[2] && this.f43269i0 == i10) {
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
            int f12 = i0.a.f(f7, -16777216, -1);
            this.f43285w = f12;
            k6.o1(0.55f, f12);
            this.f43269i0 = i10;
            this.f43287x = i0.a.f(f7, -1, -16777216);
            int f13 = i0.a.f(1.0f - f7, -1, -16777216);
            this.f43289y = f13;
            int i11 = this.f43287x;
            k4 k4Var = ((org.telegram.ui.m0) this).B0;
            l lVar = k4Var.f38763i0;
            if (lVar != null) {
                lVar.c(i11, f13);
            }
            this.f43280s.setColor(this.f43287x);
            this.v.setColor(k6.v(this.f43287x, k6.o1(AndroidUtilities.lerp(0.07f, 0.2f, f7), this.f43285w)));
            int o12 = k6.o1(0.6f, this.f43289y);
            ai.t tVar = this.f43260b0;
            tVar.setHintTextColor(o12);
            tVar.setTextColor(this.f43289y);
            tVar.setCursorColor(this.f43289y);
            tVar.setHandlesColor(this.f43289y);
            this.f43263d0.setProgressColor(k6.x0(null, k6.Rk, false));
            int f14 = i0.a.f(this.f43258a0, this.f43285w, this.f43289y);
            org.telegram.ui.ActionBar.h2 h2Var = this.M;
            h2Var.a(f14);
            h2Var.b(i0.a.f(this.f43258a0, this.f43285w, this.f43289y));
            int i12 = this.f43285w;
            s1 s1Var = this.P;
            s1Var.f22769c.setColor(i12);
            s1Var.invalidateSelf();
            int i13 = this.f43285w;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            this.R.setColorFilter(new PorterDuffColorFilter(i13, mode));
            this.O.setColorFilter(new PorterDuffColorFilter(this.f43285w, mode));
            this.J.setColorFilter(new PorterDuffColorFilter(this.f43285w, mode));
            int v = k6.v(i10, k6.o1(0.22f, this.f43285w));
            this.f43270j0 = v;
            k6.E1(this.N, v, true);
            k6.E1(this.Q, this.f43270j0, true);
            k6.E1(this.S, this.f43270j0, true);
            k6.E1(this.K, this.f43270j0, true);
            int o13 = k6.o1(0.6f, this.f43285w);
            ai.t tVar2 = this.V;
            tVar2.setHintTextColor(o13);
            tVar2.setTextColor(this.f43285w);
            tVar2.setCursorColor(this.f43285w);
            tVar2.setHandlesColor(this.f43285w);
            w3 w3Var = k4Var.K;
            if (w3Var != null) {
                w3Var.i();
            }
            invalidate();
            return;
        }
        ValueAnimator valueAnimator = this.f43271k0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i14 = this.f43269i0;
        this.f43268h0 = i14;
        if (AndroidUtilities.computePerceivedBrightness(i14) <= 0.721f) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        if (AndroidUtilities.computePerceivedBrightness(i10) > 0.721f) {
            f11 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f43271k0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                u1 u1Var = u1.this;
                u1Var.getClass();
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                u1Var.c(i0.a.f(floatValue, u1Var.f43268h0, i10), AndroidUtilities.lerp(f10, f11, floatValue), false);
            }
        });
        this.f43271k0.addListener(new ie(this, i10, f11, 2));
        this.f43271k0.start();
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
        if (this.f43264e0) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        a(canvas, i10 + this.F, 1.0f, this.f43281s0);
        float right = this.H.getRight();
        float left = this.I.getLeft();
        boolean z10 = this.f43264e0;
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
        int i14 = (this.f43261c > 1.0f ? 1 : (this.f43261c == 1.0f ? 0 : -1));
        t1[] t1VarArr = this.f43259b;
        if (i14 < 0) {
            canvas.save();
            float width = (getWidth() * this.f43261c) - (Utilities.clamp01(this.f43261c * 2.0f) * AndroidUtilities.dp(30.0f));
            canvas.translate(right + width, f7);
            AndroidUtilities.lerp(1.0f, 0.5f, this.f43261c);
            t1VarArr[0].a(canvas, (left - right) - width, f10 - f7, (1.0f - this.U) * (1.0f - this.f43261c));
            canvas.restore();
        }
        if (this.f43261c > 0.0f) {
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getWidth() * this.f43261c, getHeight());
            canvas.translate(right, f7);
            canvas.translate((1.0f - this.f43261c) * AndroidUtilities.dp(-12.0f), 0.0f);
            float lerp = AndroidUtilities.lerp(1.0f, 0.5f, 1.0f - this.f43261c);
            float f11 = f10 - f7;
            canvas.scale(lerp, lerp, 0.0f, f11 / 2.0f);
            t1VarArr[1].a(canvas, left - right, f11, (1.0f - this.f43258a0) * (1.0f - this.U) * this.f43261c);
            canvas.restore();
        }
        int i15 = (this.f43258a0 > 0.0f ? 1 : (this.f43258a0 == 0.0f ? 0 : -1));
        RectF rectF = this.f43257a;
        if (i15 > 0) {
            Paint paint = this.f43280s;
            int alpha = paint.getAlpha();
            paint.setAlpha((int) (alpha * this.f43258a0));
            float width2 = getWidth();
            if (this.f43264e0) {
                i13 = AndroidUtilities.statusBarHeight;
            }
            canvas.drawRect(0.0f, 0.0f, width2, i13 + this.F, paint);
            paint.setAlpha(alpha);
            float f12 = (f7 + f10) / 2.0f;
            float dp = AndroidUtilities.dp(42.0f) / 2.0f;
            rectF.set(AndroidUtilities.dp(6.0f), f12 - dp, AndroidUtilities.lerp(left, getWidth() - AndroidUtilities.dp(6.0f), this.f43258a0), f12 + dp);
            Paint paint2 = this.v;
            int alpha2 = paint2.getAlpha();
            paint2.setAlpha((int) (alpha2 * this.f43258a0));
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
        y0 webView;
        int action = motionEvent.getAction();
        p1 p1Var = this.f43291z0;
        if (action == 0) {
            this.A0 = false;
            AndroidUtilities.cancelRunOnUIThread(p1Var);
            if (motionEvent.getX() > this.H.getRight() && motionEvent.getX() < this.I.getLeft() && !this.T && !this.W) {
                this.f43288x0 = motionEvent.getX();
                motionEvent.getY();
                this.f43290y0 = System.currentTimeMillis();
                AndroidUtilities.runOnUIThread(p1Var, ViewConfiguration.getLongPressTimeout() * 0.8f);
            }
        } else if (motionEvent.getAction() == 2 && ((float) (System.currentTimeMillis() - this.f43290y0)) > ViewConfiguration.getLongPressTimeout() * 0.8f) {
            AndroidUtilities.cancelRunOnUIThread(p1Var);
            this.A0 = true;
            n3 n3Var = ((org.telegram.ui.m0) this).B0.f38774u0[0];
            float clamp01 = Utilities.clamp01(n3Var.getProgress() + ((motionEvent.getX() - this.f43288x0) / (getWidth() * 0.8f)));
            if (!n3Var.c() && n3Var.f() && (webView = n3Var.f39704f.getWebView()) != null) {
                webView.setScrollProgress(clamp01);
                n3Var.L.f0();
            }
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(p1Var);
            this.f43290y0 = 0L;
        }
        this.f43288x0 = motionEvent.getX();
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(int i10, boolean z10) {
        float f7;
        t1 t1Var = this.f43259b[i10];
        if (t1Var.e != z10) {
            t1Var.e = z10;
            d6 d6Var = t1Var.f43249c;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            d6Var.d(f7, true);
            invalidate();
        }
    }

    public final void f(int i10, String str) {
        t1[] t1VarArr = this.f43259b;
        CharSequence charSequence = t1VarArr[i10].f43248b.f28802i;
        if (charSequence != null && TextUtils.equals(charSequence.toString(), str)) {
            return;
        }
        t1VarArr[i10].f43248b.t(Emoji.replaceEmoji(str, t1VarArr[i10].f43248b.f28795a.getFontMetricsInt(), false), false, true);
    }

    public final void g(int i10, String str, boolean z10) {
        t1[] t1VarArr = this.f43259b;
        CharSequence charSequence = t1VarArr[i10].f43247a.f28802i;
        if (charSequence != null && TextUtils.equals(charSequence.toString(), str)) {
            return;
        }
        t1VarArr[i10].f43247a.t(Emoji.replaceEmoji(str, t1VarArr[i10].f43247a.f28795a.getFontMetricsInt(), false), z10, true);
    }

    public int getBackgroundColor() {
        return this.f43269i0;
    }

    public g2 getInstantViewLoader() {
        return null;
    }

    public int getTextColor() {
        return this.f43285w;
    }

    public String getTitle() {
        CharSequence charSequence = this.f43259b[0].f43247a.f28802i;
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
        ValueAnimator valueAnimator = this.f43282t0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.T = z10;
        ai.t tVar = this.V;
        boolean z11 = false;
        tVar.setVisibility(0);
        float f10 = 0.0f;
        if (!this.f43283u0 && !z10) {
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
        this.f43282t0 = ofFloat;
        ofFloat.addUpdateListener(new i6(this, 14));
        this.f43282t0.addListener(new o40(13, this, z10));
        this.f43282t0.setInterpolator(zr.h);
        this.f43282t0.setDuration(320L);
        this.f43282t0.start();
        boolean z12 = !z10;
        AndroidUtilities.updateViewShow(this.O, z12, true, true);
        AndroidUtilities.updateViewShow(this.R, z12, true, true);
        if (tVar.length() > 0 && this.T) {
            z11 = true;
        }
        AndroidUtilities.updateViewShow(this.J, z11, true, true);
    }

    public final void i() {
        t1[] t1VarArr = this.f43259b;
        t1 t1Var = t1VarArr[0];
        t1VarArr[0] = t1VarArr[1];
        t1VarArr[1] = t1Var;
        float[] fArr = this.d;
        float f7 = fArr[0];
        fArr[0] = fArr[1];
        fArr[1] = f7;
        Paint[] paintArr = this.f43265f;
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
        if (this.f43264e0) {
            i12 = AndroidUtilities.statusBarHeight;
        } else {
            i12 = 0;
        }
        super.onMeasure(i10, tl.C(56.0f, i12, 1073741824));
    }

    public void setBackButton(boolean z10) {
        float f7;
        this.f43283u0 = z10;
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
        this.f43283u0 = z10;
    }

    public void setHasForward(boolean z10) {
        this.f43275o0 = z10;
    }

    public void setHeight(int i10) {
        if (this.F != i10) {
            this.F = i10;
            float pow = (float) Math.pow(i10 / AndroidUtilities.dp(56.0f), 0.5d);
            this.G = pow;
            ai.r rVar = this.H;
            rVar.setScaleX(pow);
            rVar.setScaleY(this.G);
            rVar.setTranslationX((1.0f - this.G) * AndroidUtilities.dp(42.0f));
            rVar.setTranslationY((1.0f - this.G) * AndroidUtilities.dp(-12.0f));
            float f7 = this.G;
            ai.r rVar2 = this.I;
            rVar2.setScaleX(f7);
            rVar2.setScaleY(this.G);
            rVar2.setTranslationX((1.0f - this.G) * (-AndroidUtilities.dp(42.0f)));
            rVar2.setTranslationY((1.0f - this.G) * AndroidUtilities.dp(-12.0f));
            this.f43263d0.setTranslationY(this.F - AndroidUtilities.dp(56.0f));
            invalidate();
        }
    }

    public void setIsLocal(boolean z10) {
        this.f43277q0 = z10;
    }

    public void setIsTonsite(boolean z10) {
        this.f43276p0 = z10;
    }

    public void setMenuColors(int i10) {
        int i11;
        boolean z10 = false;
        if (k5.s(k5.r(i10))[0] < 0.5d) {
            z10 = true;
        }
        int i12 = -1;
        if (z10) {
            i11 = -16777216;
        } else {
            i11 = -1;
        }
        this.f43272l0 = i11;
        if (!z10) {
            i12 = -16777216;
        }
        this.m0 = i12;
        this.f43274n0 = k6.o1(0.6f, i12);
    }

    public void setMenuListener(Utilities.Callback<Integer> callback) {
        this.f43266f0 = callback;
    }

    public void setMenuType(int i10) {
        if (this.f43267g0 != i10) {
            this.f43267g0 = i10;
        }
    }

    public void setProgress(float f7) {
        this.d[0] = f7;
        invalidate();
    }

    public void setTransitionProgress(float f7) {
        this.f43261c = f7;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return true;
    }

    public void setIsLoaded(boolean z10) {
    }
}
