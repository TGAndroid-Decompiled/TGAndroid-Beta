package org.telegram.ui.web;

import ai.g3;
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
import ci.y7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.qk;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.g5;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.j00;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.z80;
import org.telegram.ui.f70;
import org.telegram.ui.fb1;
import org.telegram.ui.j20;
import org.telegram.ui.j4;
import org.telegram.ui.n21;
import org.telegram.ui.n3;
import org.telegram.ui.w3;
import org.telegram.ui.zd;
import w7.y5;
public abstract class v1 extends FrameLayout {
    public boolean A0;
    public final TextPaint E;
    public int F;
    public float G;
    public final zd H;
    public final zd I;
    public final ImageView J;
    public final org.telegram.ui.Cells.z K;
    public final ImageView L;
    public final org.telegram.ui.ActionBar.h2 M;
    public final org.telegram.ui.Cells.z N;
    public final ImageView O;
    public final t1 P;
    public final org.telegram.ui.Cells.z Q;
    public final ImageView R;
    public final org.telegram.ui.Cells.z S;
    public boolean T;
    public float U;
    public final fi.o V;
    public boolean W;
    public final RectF f39181a;
    public float f39182a0;
    public final u1[] f39183b;
    public final fi.o f39184b0;
    public float f39185c;
    public int f39186c0;
    public final float[] d;
    public final z80 f39187d0;
    public final boolean[] e;
    public boolean f39188e0;
    public final Paint[] f39189f;
    public Utilities.Callback f39190f0;
    public int f39191g0;
    public final Paint[] h;
    public int f39192h0;
    public int f39193i0;
    public int f39194j0;
    public ValueAnimator f39195k0;
    public int f39196l0;
    public int m0;
    public final Paint[] f39197n;
    public int f39198n0;
    public boolean f39199o0;
    public boolean f39200p0;
    public boolean f39201q0;
    public final Paint f39202r;
    public final j20 f39203r0;
    public final Paint f39204s;
    public boolean f39205s0;
    public ValueAnimator f39206t0;
    public boolean f39207u0;
    public final Paint v;
    public g3 f39208v0;
    public int f39209w;
    public ValueAnimator f39210w0;
    public int f39211x;
    public float f39212x0;
    public int f39213y;
    public long f39214y0;
    public final q1 f39215z0;

    public v1(Context context) {
        super(context);
        this.f39181a = new RectF();
        this.f39183b = new u1[2];
        this.f39185c = 0.0f;
        this.d = new float[2];
        this.e = new boolean[3];
        this.f39189f = new Paint[2];
        this.h = new Paint[2];
        this.f39197n = new Paint[2];
        this.f39202r = new Paint(1);
        this.f39204s = new Paint(1);
        this.v = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.E = textPaint;
        this.F = AndroidUtilities.dp(56.0f);
        this.G = 1.0f;
        this.U = 0.0f;
        this.f39182a0 = 0.0f;
        this.f39191g0 = -1;
        this.f39203r0 = new j20();
        final org.telegram.ui.m0 m0Var = (org.telegram.ui.m0) this;
        this.f39215z0 = new q1(m0Var, 0);
        this.A0 = false;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(18.33f));
        for (int i10 = 0; i10 < 2; i10++) {
            this.f39189f[i10] = new Paint(1);
            this.h[i10] = new Paint(1);
            this.f39197n[i10] = new Paint(1);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, y5.e(-1, 56, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        addView(frameLayout2, y5.e(-1, 56, 87));
        zd zdVar = new zd(context, 6);
        this.H = zdVar;
        zdVar.setOrientation(0);
        addView(zdVar, y5.e(-2, 56, 83));
        ImageView imageView = new ImageView(context);
        this.L = imageView;
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(false);
        this.M = h2Var;
        h2Var.f18941k = 200.0f;
        h2Var.c(1.0f, false);
        imageView.setImageDrawable(h2Var);
        org.telegram.ui.Cells.z f02 = i6.f0(1090519039, 1, -1);
        this.N = f02;
        imageView.setBackground(f02);
        zdVar.addView(imageView, y5.n(54, 56));
        zd zdVar2 = new zd(context, 7);
        this.I = zdVar2;
        zdVar2.setOrientation(0);
        addView(zdVar2, y5.e(-2, 56, 85));
        ImageView imageView2 = new ImageView(context);
        this.O = imageView2;
        imageView2.setScaleType(scaleType);
        t1 t1Var = new t1(m0Var);
        this.P = t1Var;
        imageView2.setImageDrawable(t1Var);
        t1Var.f();
        org.telegram.ui.Cells.z f03 = i6.f0(1090519039, 1, -1);
        this.Q = f03;
        imageView2.setBackground(f03);
        zdVar2.addView(imageView2, y5.n(54, 56));
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
                            y7 y7Var = new y7(m0Var2, 2);
                            Utilities.Callback callback2 = null;
                            a80 F = a80.F((ViewGroup) m0Var2.getParent(), null, m0Var2.R);
                            F.f22606s = 0;
                            F.S(m0Var2.m0, m0Var2.f39198n0);
                            F.a0(0.0f, -AndroidUtilities.dp(52.0f));
                            F.S = 200;
                            int v = i6.v(m0Var2.f39196l0, i6.l1(0.1f, m0Var2.m0));
                            F.f22595l0 = Integer.valueOf(v);
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
                                        if (childAt2 instanceof org.telegram.ui.ActionBar.g1) {
                                            ((org.telegram.ui.ActionBar.g1) childAt2).setSelectorColor(v);
                                        }
                                        i12++;
                                        callback2 = callback3;
                                    }
                                    callback = callback2;
                                } else {
                                    callback = callback2;
                                    if (childAt instanceof org.telegram.ui.ActionBar.g1) {
                                        ((org.telegram.ui.ActionBar.g1) childAt).setSelectorColor(v);
                                    }
                                }
                                i11++;
                                callback2 = callback;
                            }
                            Utilities.Callback callback4 = callback2;
                            if (AndroidUtilities.computePerceivedBrightness(m0Var2.f39196l0) > 0.721f) {
                                F.P(-1);
                                F.T(-986896);
                            } else {
                                F.P(-14737633);
                                F.T(-15592942);
                            }
                            int i13 = m0Var2.f39191g0;
                            if (i13 == 0) {
                                F.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) y7Var.run(3), false);
                                F.c(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) y7Var.run(1), false);
                                F.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) y7Var.run(2), !m0Var2.f39201q0);
                                F.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) y7Var.run(4), false);
                            } else if (i13 == 1) {
                                if (!m0Var2.f39200p0) {
                                    F.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) y7Var.run(3), false);
                                    F.k();
                                }
                                if (m0Var2.f39199o0) {
                                    F.c(R.drawable.msg_arrow_forward, LocaleController.getString(R.string.WebForward), (Runnable) y7Var.run(9), false);
                                }
                                h2 instantViewLoader = m0Var2.getInstantViewLoader();
                                if (instantViewLoader != null && (((!instantViewLoader.f39039g || !instantViewLoader.f39040i) && instantViewLoader.h == null && instantViewLoader.f39041j == null && !instantViewLoader.f39037c) || instantViewLoader.b() != null)) {
                                    F.c(R.drawable.menu_instant_view, LocaleController.getString(R.string.OpenLocalInstantView), (Runnable) y7Var.run(10), false);
                                    org.telegram.ui.ActionBar.g1 y3 = F.y();
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
                                    fb1 fb1Var = new fb1(26, y3, instantViewLoader);
                                    instantViewLoader.f39044m.add(fb1Var);
                                    F.f22601p = new g2(0, instantViewLoader, fb1Var);
                                }
                                F.c(R.drawable.msg_reset, LocaleController.getString(R.string.Refresh), (Runnable) y7Var.run(5), false);
                                F.c(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) y7Var.run(1), false);
                                F.c(R.drawable.msg_saved, LocaleController.getString(R.string.WebBookmark), (Runnable) y7Var.run(6), false);
                                F.c(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) y7Var.run(2), false);
                                F.k();
                                if (!e1.a(callback4).isEmpty()) {
                                    F.c(R.drawable.menu_views_recent, LocaleController.getString(R.string.WebHistory), (Runnable) y7Var.run(8), false);
                                }
                                F.c(R.drawable.menu_browser_bookmarks, LocaleController.getString(R.string.WebBookmarks), (Runnable) y7Var.run(7), false);
                                F.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) y7Var.run(4), false);
                            }
                            F.f22601p = new n21(m0Var2);
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
        org.telegram.ui.Cells.z f04 = i6.f0(1090519039, 1, -1);
        this.S = f04;
        imageView3.setBackground(f04);
        imageView3.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
        zdVar2.addView(imageView3, y5.n(54, 56));
        fi.o oVar = new fi.o(context, 3);
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
                                AndroidUtilities.hideKeyboard(m0Var.V);
                                return false;
                            }
                            return false;
                        }
                        return false;
                    default:
                        if (i11 == 2) {
                            org.telegram.ui.m0 m0Var2 = m0Var;
                            g3 g3Var = m0Var2.f39208v0;
                            if (g3Var != null) {
                                g3Var.run(m0Var2.f39184b0.getText().toString());
                            }
                            m0Var2.k(false);
                        }
                        return false;
                }
            }
        });
        oVar.addTextChangedListener(new ci.i2(m0Var, 15));
        frameLayout.addView(oVar, y5.e(-1, -1, 119));
        fi.o oVar2 = new fi.o(context, 4);
        this.f39184b0 = oVar2;
        oVar2.setVisibility(8);
        oVar2.setAlpha(0.0f);
        oVar2.setTextSize(1, 15.66f);
        oVar2.setSingleLine(true);
        this.f39186c0 = SharedConfig.searchEngineType;
        oVar2.setHint(LocaleController.formatString(R.string.AddressPlaceholder, o1.a().f39121a));
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
                                AndroidUtilities.hideKeyboard(m0Var.V);
                                return false;
                            }
                            return false;
                        }
                        return false;
                    default:
                        if (i11 == 2) {
                            org.telegram.ui.m0 m0Var2 = m0Var;
                            g3 g3Var = m0Var2.f39208v0;
                            if (g3Var != null) {
                                g3Var.run(m0Var2.f39184b0.getText().toString());
                            }
                            m0Var2.k(false);
                        }
                        return false;
                }
            }
        });
        frameLayout2.addView(oVar2, y5.d(-1, -1.0f, 119, 48.0f, 0.0f, 12.0f, 0.0f));
        ImageView imageView4 = new ImageView(context);
        this.J = imageView4;
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(R.drawable.ic_close_white);
        org.telegram.ui.Cells.z f05 = i6.f0(1090519039, 1, -1);
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
                        org.telegram.ui.m0 m0Var2 = m0Var;
                        if (m0Var2.getParent() instanceof ViewGroup) {
                            y7 y7Var = new y7(m0Var2, 2);
                            Utilities.Callback callback2 = null;
                            a80 F = a80.F((ViewGroup) m0Var2.getParent(), null, m0Var2.R);
                            F.f22606s = 0;
                            F.S(m0Var2.m0, m0Var2.f39198n0);
                            F.a0(0.0f, -AndroidUtilities.dp(52.0f));
                            F.S = 200;
                            int v = i6.v(m0Var2.f39196l0, i6.l1(0.1f, m0Var2.m0));
                            F.f22595l0 = Integer.valueOf(v);
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
                                        if (childAt2 instanceof org.telegram.ui.ActionBar.g1) {
                                            ((org.telegram.ui.ActionBar.g1) childAt2).setSelectorColor(v);
                                        }
                                        i12++;
                                        callback2 = callback3;
                                    }
                                    callback = callback2;
                                } else {
                                    callback = callback2;
                                    if (childAt instanceof org.telegram.ui.ActionBar.g1) {
                                        ((org.telegram.ui.ActionBar.g1) childAt).setSelectorColor(v);
                                    }
                                }
                                i11++;
                                callback2 = callback;
                            }
                            Utilities.Callback callback4 = callback2;
                            if (AndroidUtilities.computePerceivedBrightness(m0Var2.f39196l0) > 0.721f) {
                                F.P(-1);
                                F.T(-986896);
                            } else {
                                F.P(-14737633);
                                F.T(-15592942);
                            }
                            int i13 = m0Var2.f39191g0;
                            if (i13 == 0) {
                                F.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) y7Var.run(3), false);
                                F.c(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) y7Var.run(1), false);
                                F.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) y7Var.run(2), !m0Var2.f39201q0);
                                F.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) y7Var.run(4), false);
                            } else if (i13 == 1) {
                                if (!m0Var2.f39200p0) {
                                    F.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) y7Var.run(3), false);
                                    F.k();
                                }
                                if (m0Var2.f39199o0) {
                                    F.c(R.drawable.msg_arrow_forward, LocaleController.getString(R.string.WebForward), (Runnable) y7Var.run(9), false);
                                }
                                h2 instantViewLoader = m0Var2.getInstantViewLoader();
                                if (instantViewLoader != null && (((!instantViewLoader.f39039g || !instantViewLoader.f39040i) && instantViewLoader.h == null && instantViewLoader.f39041j == null && !instantViewLoader.f39037c) || instantViewLoader.b() != null)) {
                                    F.c(R.drawable.menu_instant_view, LocaleController.getString(R.string.OpenLocalInstantView), (Runnable) y7Var.run(10), false);
                                    org.telegram.ui.ActionBar.g1 y3 = F.y();
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
                                    fb1 fb1Var = new fb1(26, y3, instantViewLoader);
                                    instantViewLoader.f39044m.add(fb1Var);
                                    F.f22601p = new g2(0, instantViewLoader, fb1Var);
                                }
                                F.c(R.drawable.msg_reset, LocaleController.getString(R.string.Refresh), (Runnable) y7Var.run(5), false);
                                F.c(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) y7Var.run(1), false);
                                F.c(R.drawable.msg_saved, LocaleController.getString(R.string.WebBookmark), (Runnable) y7Var.run(6), false);
                                F.c(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) y7Var.run(2), false);
                                F.k();
                                if (!e1.a(callback4).isEmpty()) {
                                    F.c(R.drawable.menu_views_recent, LocaleController.getString(R.string.WebHistory), (Runnable) y7Var.run(8), false);
                                }
                                F.c(R.drawable.menu_browser_bookmarks, LocaleController.getString(R.string.WebBookmarks), (Runnable) y7Var.run(7), false);
                                F.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) y7Var.run(4), false);
                            }
                            F.f22601p = new n21(m0Var2);
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
        addView(imageView4, y5.e(54, 56, 85));
        z80 z80Var = new z80(context);
        this.f39187d0 = z80Var;
        z80Var.setPivotX(0.0f);
        z80Var.setPivotY(AndroidUtilities.dp(2.0f));
        addView(z80Var, y5.e(-1, 2, 87));
        setWillNotDraw(false);
        this.f39183b[0] = new u1(m0Var);
        this.f39183b[1] = new u1(m0Var);
        int i11 = i6.Pk;
        d(i6.w0(null, i11, false), false);
        setMenuColors(i6.w0(null, i11, false));
    }

    public final void a(Canvas canvas, float f7, float f10, boolean z10) {
        float f11;
        float max = Math.max(AndroidUtilities.dp(0.66f), 1);
        float f12 = f7 - max;
        float width = getWidth() * this.f39185c;
        RectF rectF = this.f39181a;
        rectF.set(0.0f, 0.0f, getWidth(), f7);
        Paint[] paintArr = this.f39189f;
        int alpha = paintArr[1].getAlpha();
        paintArr[1].setAlpha((int) (alpha * 1.0f));
        canvas.drawRect(rectF, paintArr[1]);
        paintArr[1].setAlpha(alpha);
        float f13 = this.f39185c;
        float[] fArr = this.d;
        Paint[] paintArr2 = this.f39197n;
        Paint[] paintArr3 = this.h;
        if (f13 > 0.0f) {
            rectF.set(0.0f, 0.0f, fArr[1] * getWidth(), f7);
            int alpha2 = paintArr3[1].getAlpha();
            f11 = 1.0f;
            paintArr3[1].setAlpha((int) ((1.0f - this.f39182a0) * (1.0f - this.U) * alpha2 * 1.0f));
            canvas.drawRect(rectF, paintArr3[1]);
            paintArr3[1].setAlpha(alpha2);
            if (z10) {
                rectF.set(0.0f, f12, width, f12 + max);
                int alpha3 = paintArr2[1].getAlpha();
                paintArr2[1].setAlpha((int) ((1.0f - this.f39182a0) * alpha3 * 1.0f * f10));
                canvas.drawRect(rectF, paintArr2[1]);
                paintArr2[1].setAlpha(alpha3);
            }
        } else {
            f11 = 1.0f;
        }
        float f14 = this.f39185c;
        if (f14 < f11) {
            int l1 = i6.l1((f11 - f14) * f11, 1610612736);
            Paint paint = this.f39202r;
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
        paintArr3[0].setAlpha((int) ((f11 - this.f39182a0) * (f11 - this.U) * (f11 - Utilities.clamp01(this.f39185c * 4.0f)) * alpha5 * f11));
        canvas.drawRect(rectF, paintArr3[0]);
        paintArr3[0].setAlpha(alpha5);
        if (z10) {
            rectF.set(width, f12, getWidth() + width, max + f12);
            int alpha6 = paintArr2[0].getAlpha();
            paintArr2[0].setAlpha((int) ((f11 - this.f39182a0) * alpha6 * f11 * f10));
            canvas.drawRect(rectF, paintArr2[0]);
            paintArr2[0].setAlpha(alpha6);
        }
    }

    public final void b(int i10, int i11) {
        float f7;
        boolean[] zArr = this.e;
        boolean z10 = zArr[i10];
        Paint[] paintArr = this.f39189f;
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
        this.h[i10].setColor(i6.v(i11, i6.l1(AndroidUtilities.lerp(0.07f, 0.2f, f7), d)));
        this.f39197n[i10].setColor(i6.v(i11, i6.l1(AndroidUtilities.lerp(0.14f, 0.24f, f7), d)));
        u1[] u1VarArr = this.f39183b;
        u1VarArr[i10].f39170a.r(d);
        u1VarArr[i10].d = i6.v(i11, i6.l1(0.6f, d));
        u1 u1Var = u1VarArr[i10];
        u1Var.f39171b.r(i0.a.d(u1VarArr[i10].f39172c.f23890c, u1Var.d, i6.w0(null, i6.f19297q7, false)));
        invalidate();
    }

    public final void c(final int i10, float f7, boolean z10) {
        final float f10;
        boolean[] zArr = this.e;
        if (zArr[2] && this.f39193i0 == i10) {
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
            this.f39209w = d;
            i6.l1(0.55f, d);
            this.f39193i0 = i10;
            this.f39211x = i0.a.d(f7, -1, -16777216);
            int d10 = i0.a.d(1.0f - f7, -1, -16777216);
            this.f39213y = d10;
            int i11 = this.f39211x;
            j4 j4Var = ((org.telegram.ui.m0) this).B0;
            k kVar = j4Var.f34616i0;
            if (kVar != null) {
                kVar.c(i11, d10);
            }
            this.f39204s.setColor(this.f39211x);
            this.v.setColor(i6.v(this.f39211x, i6.l1(AndroidUtilities.lerp(0.07f, 0.2f, f7), this.f39209w)));
            int l1 = i6.l1(0.6f, this.f39213y);
            fi.o oVar = this.f39184b0;
            oVar.setHintTextColor(l1);
            oVar.setTextColor(this.f39213y);
            oVar.setCursorColor(this.f39213y);
            oVar.setHandlesColor(this.f39213y);
            this.f39187d0.setProgressColor(i6.w0(null, i6.Rk, false));
            int d11 = i0.a.d(this.f39182a0, this.f39209w, this.f39213y);
            org.telegram.ui.ActionBar.h2 h2Var = this.M;
            h2Var.a(d11);
            h2Var.b(i0.a.d(this.f39182a0, this.f39209w, this.f39213y));
            int i12 = this.f39209w;
            t1 t1Var = this.P;
            t1Var.f20759c.setColor(i12);
            t1Var.invalidateSelf();
            int i13 = this.f39209w;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            this.R.setColorFilter(new PorterDuffColorFilter(i13, mode));
            this.O.setColorFilter(new PorterDuffColorFilter(this.f39209w, mode));
            this.J.setColorFilter(new PorterDuffColorFilter(this.f39209w, mode));
            int v = i6.v(i10, i6.l1(0.22f, this.f39209w));
            this.f39194j0 = v;
            i6.B1(this.N, v, true);
            i6.B1(this.Q, this.f39194j0, true);
            i6.B1(this.S, this.f39194j0, true);
            i6.B1(this.K, this.f39194j0, true);
            int l12 = i6.l1(0.6f, this.f39209w);
            fi.o oVar2 = this.V;
            oVar2.setHintTextColor(l12);
            oVar2.setTextColor(this.f39209w);
            oVar2.setCursorColor(this.f39209w);
            oVar2.setHandlesColor(this.f39209w);
            w3 w3Var = j4Var.K;
            if (w3Var != null) {
                w3Var.i();
            }
            invalidate();
            return;
        }
        ValueAnimator valueAnimator = this.f39195k0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i14 = this.f39193i0;
        this.f39192h0 = i14;
        if (AndroidUtilities.computePerceivedBrightness(i14) <= 0.721f) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        if (AndroidUtilities.computePerceivedBrightness(i10) > 0.721f) {
            f11 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f39195k0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                v1 v1Var = v1.this;
                v1Var.getClass();
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                v1Var.c(i0.a.d(floatValue, v1Var.f39192h0, i10), AndroidUtilities.lerp(f10, f11, floatValue), false);
            }
        });
        this.f39195k0.addListener(new j00(this, i10, f11, 1));
        this.f39195k0.start();
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
        if (this.f39188e0) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        a(canvas, i10 + this.F, 1.0f, this.f39205s0);
        float right = this.H.getRight();
        float left = this.I.getLeft();
        boolean z10 = this.f39188e0;
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
        float f11 = this.f39185c;
        u1[] u1VarArr = this.f39183b;
        if (f11 < 1.0f) {
            canvas.save();
            float width = (getWidth() * this.f39185c) - (Utilities.clamp01(this.f39185c * 2.0f) * AndroidUtilities.dp(30.0f));
            canvas.translate(right + width, f7);
            AndroidUtilities.lerp(1.0f, 0.5f, this.f39185c);
            u1VarArr[0].a(canvas, (left - right) - width, f10 - f7, (1.0f - this.U) * (1.0f - this.f39185c));
            canvas.restore();
        }
        if (this.f39185c > 0.0f) {
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getWidth() * this.f39185c, getHeight());
            canvas.translate(right, f7);
            canvas.translate((1.0f - this.f39185c) * AndroidUtilities.dp(-12.0f), 0.0f);
            float lerp = AndroidUtilities.lerp(1.0f, 0.5f, 1.0f - this.f39185c);
            float f12 = f10 - f7;
            canvas.scale(lerp, lerp, 0.0f, f12 / 2.0f);
            u1VarArr[1].a(canvas, left - right, f12, (1.0f - this.f39182a0) * (1.0f - this.U) * this.f39185c);
            canvas.restore();
        }
        float f13 = this.f39182a0;
        RectF rectF = this.f39181a;
        if (f13 > 0.0f) {
            Paint paint = this.f39204s;
            int alpha = paint.getAlpha();
            paint.setAlpha((int) (alpha * this.f39182a0));
            float width2 = getWidth();
            if (this.f39188e0) {
                i13 = AndroidUtilities.statusBarHeight;
            }
            canvas.drawRect(0.0f, 0.0f, width2, i13 + this.F, paint);
            paint.setAlpha(alpha);
            float f14 = (f7 + f10) / 2.0f;
            float dp = AndroidUtilities.dp(42.0f) / 2.0f;
            rectF.set(AndroidUtilities.dp(6.0f), f14 - dp, AndroidUtilities.lerp(left, getWidth() - AndroidUtilities.dp(6.0f), this.f39182a0), f14 + dp);
            Paint paint2 = this.v;
            int alpha2 = paint2.getAlpha();
            paint2.setAlpha((int) (alpha2 * this.f39182a0));
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
        q1 q1Var = this.f39215z0;
        if (action == 0) {
            this.A0 = false;
            AndroidUtilities.cancelRunOnUIThread(q1Var);
            if (motionEvent.getX() > this.H.getRight() && motionEvent.getX() < this.I.getLeft() && !this.T && !this.W) {
                this.f39212x0 = motionEvent.getX();
                motionEvent.getY();
                this.f39214y0 = System.currentTimeMillis();
                AndroidUtilities.runOnUIThread(q1Var, ViewConfiguration.getLongPressTimeout() * 0.8f);
            }
        } else if (motionEvent.getAction() == 2 && ((float) (System.currentTimeMillis() - this.f39214y0)) > ViewConfiguration.getLongPressTimeout() * 0.8f) {
            AndroidUtilities.cancelRunOnUIThread(q1Var);
            this.A0 = true;
            n3 n3Var = ((org.telegram.ui.m0) this).B0.f34627u0[0];
            float clamp01 = Utilities.clamp01(n3Var.getProgress() + ((motionEvent.getX() - this.f39212x0) / (getWidth() * 0.8f)));
            if (!n3Var.c() && n3Var.f() && (webView = n3Var.f35797f.getWebView()) != null) {
                webView.setScrollProgress(clamp01);
                n3Var.K.f0();
            }
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(q1Var);
            this.f39214y0 = 0L;
        }
        this.f39212x0 = motionEvent.getX();
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(int i10, boolean z10) {
        float f7;
        u1 u1Var = this.f39183b[i10];
        if (u1Var.e != z10) {
            u1Var.e = z10;
            e6 e6Var = u1Var.f39172c;
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
        u1[] u1VarArr = this.f39183b;
        CharSequence charSequence = u1VarArr[i10].f39171b.f26986g;
        if (charSequence != null && TextUtils.equals(charSequence.toString(), str)) {
            return;
        }
        u1VarArr[i10].f39171b.q(Emoji.replaceEmoji(str, u1VarArr[i10].f39171b.f26982a.getFontMetricsInt(), false), false, true);
    }

    public final void g(int i10, String str, boolean z10) {
        u1[] u1VarArr = this.f39183b;
        CharSequence charSequence = u1VarArr[i10].f39170a.f26986g;
        if (charSequence != null && TextUtils.equals(charSequence.toString(), str)) {
            return;
        }
        u1VarArr[i10].f39170a.q(Emoji.replaceEmoji(str, u1VarArr[i10].f39170a.f26982a.getFontMetricsInt(), false), z10, true);
    }

    public int getBackgroundColor() {
        return this.f39193i0;
    }

    public h2 getInstantViewLoader() {
        return null;
    }

    public int getTextColor() {
        return this.f39209w;
    }

    public String getTitle() {
        CharSequence charSequence = this.f39183b[0].f39170a.f26986g;
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
        ValueAnimator valueAnimator = this.f39206t0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.T = z10;
        fi.o oVar = this.V;
        boolean z11 = false;
        oVar.setVisibility(0);
        float f10 = 0.0f;
        if (!this.f39207u0 && !z10) {
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
        this.f39206t0 = ofFloat;
        ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.r0(this, 6));
        this.f39206t0.addListener(new f70(12, this, z10));
        this.f39206t0.setInterpolator(sr.h);
        this.f39206t0.setDuration(320L);
        this.f39206t0.start();
        boolean z12 = !z10;
        AndroidUtilities.updateViewShow(this.O, z12, true, true);
        AndroidUtilities.updateViewShow(this.R, z12, true, true);
        if (oVar.length() > 0 && this.T) {
            z11 = true;
        }
        AndroidUtilities.updateViewShow(this.J, z11, true, true);
    }

    public final void i() {
        u1[] u1VarArr = this.f39183b;
        u1 u1Var = u1VarArr[0];
        u1VarArr[0] = u1VarArr[1];
        u1VarArr[1] = u1Var;
        float[] fArr = this.d;
        float f7 = fArr[0];
        fArr[0] = fArr[1];
        fArr[1] = f7;
        Paint[] paintArr = this.f39189f;
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
        if (this.f39188e0) {
            i12 = AndroidUtilities.statusBarHeight;
        } else {
            i12 = 0;
        }
        super.onMeasure(i10, qk.C(56.0f, i12, 1073741824));
    }

    public void setBackButton(boolean z10) {
        float f7;
        this.f39207u0 = z10;
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
        this.f39207u0 = z10;
    }

    public void setHasForward(boolean z10) {
        this.f39199o0 = z10;
    }

    public void setHeight(int i10) {
        if (this.F != i10) {
            this.F = i10;
            float pow = (float) Math.pow(i10 / AndroidUtilities.dp(56.0f), 0.5d);
            this.G = pow;
            zd zdVar = this.H;
            zdVar.setScaleX(pow);
            zdVar.setScaleY(this.G);
            zdVar.setTranslationX((1.0f - this.G) * AndroidUtilities.dp(42.0f));
            zdVar.setTranslationY((1.0f - this.G) * AndroidUtilities.dp(-12.0f));
            float f7 = this.G;
            zd zdVar2 = this.I;
            zdVar2.setScaleX(f7);
            zdVar2.setScaleY(this.G);
            zdVar2.setTranslationX((1.0f - this.G) * (-AndroidUtilities.dp(42.0f)));
            zdVar2.setTranslationY((1.0f - this.G) * AndroidUtilities.dp(-12.0f));
            this.f39187d0.setTranslationY(this.F - AndroidUtilities.dp(56.0f));
            invalidate();
        }
    }

    public void setIsLocal(boolean z10) {
        this.f39201q0 = z10;
    }

    public void setIsTonsite(boolean z10) {
        this.f39200p0 = z10;
    }

    public void setMenuColors(int i10) {
        double atan2;
        int i11;
        boolean z10 = false;
        double[] j3 = g5.j(g5.f18903a, g5.j(g5.f18905c, new double[]{Color.red(i10) / 255.0d, Color.green(i10) / 255.0d, Color.blue(i10) / 255.0d}));
        for (int i12 = 0; i12 < 3; i12++) {
            j3[i12] = Math.cbrt(j3[i12]);
        }
        double[] j10 = g5.j(g5.f18904b, j3);
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
        this.f39196l0 = i11;
        if (!z10) {
            i13 = -16777216;
        }
        this.m0 = i13;
        this.f39198n0 = i6.l1(0.6f, i13);
    }

    public void setMenuListener(Utilities.Callback<Integer> callback) {
        this.f39190f0 = callback;
    }

    public void setMenuType(int i10) {
        if (this.f39191g0 != i10) {
            this.f39191g0 = i10;
        }
    }

    public void setProgress(float f7) {
        this.d[0] = f7;
        invalidate();
    }

    public void setTransitionProgress(float f7) {
        this.f39185c = f7;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return true;
    }

    public void setIsLoaded(boolean z10) {
    }
}
