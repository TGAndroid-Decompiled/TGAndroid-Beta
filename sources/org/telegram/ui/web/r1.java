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
import h7.z5;
import hh.fb;
import lh.m2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.rl;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.z70;
import org.telegram.ui.m4;
import org.telegram.ui.n40;
import org.telegram.ui.q3;
import org.telegram.ui.tq0;
import org.telegram.ui.v10;
import org.telegram.ui.z3;
import org.telegram.ui.zh1;

public abstract class r1 extends FrameLayout {
    public final TextPaint A;
    public int B;
    public float C;
    public final hh.m D;
    public final hh.m E;
    public final ImageView F;
    public final org.telegram.ui.Cells.z G;
    public final ImageView H;
    public final org.telegram.ui.ActionBar.g2 I;
    public final org.telegram.ui.Cells.z J;
    public final ImageView K;
    public final p1 L;
    public final org.telegram.ui.Cells.z M;
    public final ImageView N;
    public final org.telegram.ui.Cells.z O;
    public boolean P;
    public float Q;
    public final hh.o R;
    public boolean S;
    public float T;
    public final hh.o U;
    public int V;
    public final z70 W;

    public final RectF f43957a;

    public boolean f43958a0;

    public final q1[] f43959b;

    public Utilities.Callback f43960b0;

    public float f43961c;

    public int f43962c0;
    public final float[] d;

    public int f43963d0;

    public final boolean[] f43964e;

    public int f43965e0;

    public final Paint[] f43966f;

    public int f43967f0;

    public ValueAnimator f43968g0;
    public final Paint[] h;

    public int f43969h0;

    public int f43970i0;

    public int f43971j0;

    public boolean f43972k0;

    public boolean f43973l0;
    public boolean m0;

    public final Paint[] f43974n;

    public final v10 f43975n0;

    public boolean f43976o0;

    public ValueAnimator f43977p0;

    public boolean f43978q0;

    public final Paint f43979r;

    public gh.d1 f43980r0;

    public final Paint f43981s;

    public ValueAnimator f43982s0;

    public float f43983t0;

    public long f43984u0;
    public final Paint v;

    public final m1 f43985v0;

    public int f43986w;

    public boolean f43987w0;

    public int f43988x;

    public int f43989y;

    public r1(Context context) {
        super(context);
        this.f43957a = new RectF();
        this.f43959b = new q1[2];
        this.f43961c = 0.0f;
        this.d = new float[2];
        this.f43964e = new boolean[3];
        this.f43966f = new Paint[2];
        this.h = new Paint[2];
        this.f43974n = new Paint[2];
        final int i10 = 1;
        this.f43979r = new Paint(1);
        this.f43981s = new Paint(1);
        this.v = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.A = textPaint;
        this.B = AndroidUtilities.dp(56.0f);
        this.C = 1.0f;
        this.Q = 0.0f;
        this.T = 0.0f;
        this.f43962c0 = -1;
        this.f43975n0 = new v10();
        final org.telegram.ui.o0 o0Var = (org.telegram.ui.o0) this;
        final int i11 = 0;
        this.f43985v0 = new m1(o0Var, i11);
        this.f43987w0 = false;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(18.33f));
        for (int i12 = 0; i12 < 2; i12++) {
            this.f43966f[i12] = new Paint(1);
            this.h[i12] = new Paint(1);
            this.f43974n[i12] = new Paint(1);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, z5.e(-1, 56, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        addView(frameLayout2, z5.e(-1, 56, 87));
        hh.m mVar = new hh.m(context, 8);
        this.D = mVar;
        mVar.setOrientation(0);
        addView(mVar, z5.e(-2, 56, 83));
        ImageView imageView = new ImageView(context);
        this.H = imageView;
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
        this.I = g2Var;
        g2Var.f22973k = 200.0f;
        g2Var.c(1.0f, false);
        imageView.setImageDrawable(g2Var);
        org.telegram.ui.Cells.z zVarF0 = g6.f0(1090519039, 1, -1);
        this.J = zVarF0;
        imageView.setBackground(zVarF0);
        mVar.addView(imageView, z5.n(54, 56));
        hh.m mVar2 = new hh.m(context, 9);
        this.E = mVar2;
        mVar2.setOrientation(0);
        addView(mVar2, z5.e(-2, 56, 85));
        ImageView imageView2 = new ImageView(context);
        this.K = imageView2;
        imageView2.setScaleType(scaleType);
        p1 p1Var = new p1(o0Var);
        this.L = p1Var;
        imageView2.setImageDrawable(p1Var);
        p1Var.f();
        org.telegram.ui.Cells.z zVarF1 = g6.f0(1090519039, 1, -1);
        this.M = zVarF1;
        imageView2.setBackground(zVarF1);
        mVar2.addView(imageView2, z5.n(54, 56));
        ImageView imageView3 = new ImageView(context);
        this.N = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.ic_ab_other);
        imageView3.setColorFilter(new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_IN));
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                Utilities.Callback callback;
                switch (i11) {
                    case 0:
                        org.telegram.ui.o0 o0Var2 = o0Var;
                        if (o0Var2.getParent() instanceof ViewGroup) {
                            eg.o oVar = new eg.o(o0Var2, 4);
                            Utilities.Callback callback2 = null;
                            b70 b70VarF = b70.F((ViewGroup) o0Var2.getParent(), null, o0Var2.N);
                            b70VarF.f26992s = 0;
                            b70VarF.S(o0Var2.f43970i0, o0Var2.f43971j0);
                            b70VarF.a0(0.0f, -AndroidUtilities.dp(52.0f));
                            b70VarF.S = 200;
                            int iV = g6.v(o0Var2.f43969h0, g6.l1(0.1f, o0Var2.f43970i0));
                            b70VarF.f26981l0 = Integer.valueOf(iV);
                            int i13 = 0;
                            while (i13 < b70VarF.A.getChildCount()) {
                                View childAt = i13 == b70VarF.A.getChildCount() - 1 ? b70VarF.D : b70VarF.A.getChildAt(i13);
                                if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                                    int i14 = 0;
                                    while (i14 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
                                        View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.H.getChildAt(i14);
                                        Utilities.Callback callback3 = callback2;
                                        if (childAt2 instanceof org.telegram.ui.ActionBar.f1) {
                                            ((org.telegram.ui.ActionBar.f1) childAt2).setSelectorColor(iV);
                                        }
                                        i14++;
                                        callback2 = callback3;
                                    }
                                    callback = callback2;
                                } else {
                                    callback = callback2;
                                    if (childAt instanceof org.telegram.ui.ActionBar.f1) {
                                        ((org.telegram.ui.ActionBar.f1) childAt).setSelectorColor(iV);
                                    }
                                }
                                i13++;
                                callback2 = callback;
                            }
                            Utilities.Callback callback4 = callback2;
                            if (AndroidUtilities.computePerceivedBrightness(o0Var2.f43969h0) > 0.721f) {
                                b70VarF.P(-1);
                                b70VarF.T(-986896);
                            } else {
                                b70VarF.P(-14737633);
                                b70VarF.T(-15592942);
                            }
                            int i15 = o0Var2.f43962c0;
                            if (i15 == 0) {
                                b70VarF.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) oVar.run(3), false);
                                b70VarF.c(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) oVar.run(1), false);
                                b70VarF.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) oVar.run(2), !o0Var2.m0);
                                b70VarF.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) oVar.run(4), false);
                            } else if (i15 == 1) {
                                if (!o0Var2.f43973l0) {
                                    b70VarF.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) oVar.run(3), false);
                                    b70VarF.k();
                                }
                                if (o0Var2.f43972k0) {
                                    b70VarF.c(R.drawable.msg_arrow_forward, LocaleController.getString(R.string.WebForward), (Runnable) oVar.run(9), false);
                                }
                                c2 instantViewLoader = o0Var2.getInstantViewLoader();
                                if (instantViewLoader != null && (((!instantViewLoader.f43799g || !instantViewLoader.f43800i) && instantViewLoader.h == null && instantViewLoader.f43801j == null && !instantViewLoader.f43796c) || instantViewLoader.b() != null)) {
                                    b70VarF.c(R.drawable.menu_instant_view, LocaleController.getString(R.string.OpenLocalInstantView), (Runnable) oVar.run(10), false);
                                    org.telegram.ui.ActionBar.f1 f1VarY = b70VarF.y();
                                    f1VarY.setEnabled(instantViewLoader.b() != null);
                                    f1VarY.setAlpha(f1VarY.isEnabled() ? 1.0f : 0.5f);
                                    zh1 zh1Var = new zh1(6, f1VarY, instantViewLoader);
                                    instantViewLoader.f43804m.add(zh1Var);
                                    b70VarF.f26987p = new zh1(10, instantViewLoader, zh1Var);
                                }
                                b70VarF.c(R.drawable.msg_reset, LocaleController.getString(R.string.Refresh), (Runnable) oVar.run(5), false);
                                b70VarF.c(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) oVar.run(1), false);
                                b70VarF.c(R.drawable.msg_saved, LocaleController.getString(R.string.WebBookmark), (Runnable) oVar.run(6), false);
                                b70VarF.c(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) oVar.run(2), false);
                                b70VarF.k();
                                if (!b1.a(callback4).isEmpty()) {
                                    b70VarF.c(R.drawable.menu_views_recent, LocaleController.getString(R.string.WebHistory), (Runnable) oVar.run(8), false);
                                }
                                b70VarF.c(R.drawable.menu_browser_bookmarks, LocaleController.getString(R.string.WebBookmarks), (Runnable) oVar.run(7), false);
                                b70VarF.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) oVar.run(4), false);
                            }
                            b70VarF.f26987p = new tq0(o0Var2, 11);
                            b70VarF.Z();
                            break;
                        }
                        break;
                    default:
                        o0Var.R.setText("");
                        break;
                }
            }
        });
        org.telegram.ui.Cells.z zVarF2 = g6.f0(1090519039, 1, -1);
        this.O = zVarF2;
        imageView3.setBackground(zVarF2);
        imageView3.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
        mVar2.addView(imageView3, z5.n(54, 56));
        hh.o oVar = new hh.o(context, 4);
        this.R = oVar;
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
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                switch (i11) {
                    case 0:
                        if (keyEvent != null) {
                            if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                                AndroidUtilities.hideKeyboard(o0Var.R);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i13 == 2) {
                            org.telegram.ui.o0 o0Var2 = o0Var;
                            gh.d1 d1Var = o0Var2.f43980r0;
                            if (d1Var != null) {
                                d1Var.run(o0Var2.U.getText().toString());
                            }
                            o0Var2.k(false);
                        }
                        break;
                }
                return false;
            }
        });
        oVar.addTextChangedListener(new ch.e(o0Var, 16));
        frameLayout.addView(oVar, z5.e(-1, -1, 119));
        hh.o oVar2 = new hh.o(context, 5);
        this.U = oVar2;
        oVar2.setVisibility(8);
        oVar2.setAlpha(0.0f);
        oVar2.setTextSize(1, 15.66f);
        oVar2.setSingleLine(true);
        this.V = SharedConfig.searchEngineType;
        oVar2.setHint(LocaleController.formatString(R.string.AddressPlaceholder, k1.a().f43889a));
        oVar2.setBackgroundResource(0);
        oVar2.setCursorWidth(1.5f);
        oVar2.setGravity(112);
        oVar2.setInputType(oVar2.getInputType() | 524288);
        oVar2.setImeOptions(33554434);
        oVar2.setTextIsSelectable(false);
        oVar2.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                switch (i10) {
                    case 0:
                        if (keyEvent != null) {
                            if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                                AndroidUtilities.hideKeyboard(o0Var.R);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i13 == 2) {
                            org.telegram.ui.o0 o0Var2 = o0Var;
                            gh.d1 d1Var = o0Var2.f43980r0;
                            if (d1Var != null) {
                                d1Var.run(o0Var2.U.getText().toString());
                            }
                            o0Var2.k(false);
                        }
                        break;
                }
                return false;
            }
        });
        frameLayout2.addView(oVar2, z5.d(-1, -1.0f, 119, 48.0f, 0.0f, 12.0f, 0.0f));
        ImageView imageView4 = new ImageView(context);
        this.F = imageView4;
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(R.drawable.ic_close_white);
        org.telegram.ui.Cells.z zVarF3 = g6.f0(1090519039, 1, -1);
        this.G = zVarF3;
        imageView4.setBackground(zVarF3);
        imageView4.setVisibility(8);
        imageView4.setAlpha(0.0f);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                Utilities.Callback callback;
                switch (i10) {
                    case 0:
                        org.telegram.ui.o0 o0Var2 = o0Var;
                        if (o0Var2.getParent() instanceof ViewGroup) {
                            eg.o oVar3 = new eg.o(o0Var2, 4);
                            Utilities.Callback callback2 = null;
                            b70 b70VarF = b70.F((ViewGroup) o0Var2.getParent(), null, o0Var2.N);
                            b70VarF.f26992s = 0;
                            b70VarF.S(o0Var2.f43970i0, o0Var2.f43971j0);
                            b70VarF.a0(0.0f, -AndroidUtilities.dp(52.0f));
                            b70VarF.S = 200;
                            int iV = g6.v(o0Var2.f43969h0, g6.l1(0.1f, o0Var2.f43970i0));
                            b70VarF.f26981l0 = Integer.valueOf(iV);
                            int i13 = 0;
                            while (i13 < b70VarF.A.getChildCount()) {
                                View childAt = i13 == b70VarF.A.getChildCount() - 1 ? b70VarF.D : b70VarF.A.getChildAt(i13);
                                if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                                    int i14 = 0;
                                    while (i14 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
                                        View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.H.getChildAt(i14);
                                        Utilities.Callback callback3 = callback2;
                                        if (childAt2 instanceof org.telegram.ui.ActionBar.f1) {
                                            ((org.telegram.ui.ActionBar.f1) childAt2).setSelectorColor(iV);
                                        }
                                        i14++;
                                        callback2 = callback3;
                                    }
                                    callback = callback2;
                                } else {
                                    callback = callback2;
                                    if (childAt instanceof org.telegram.ui.ActionBar.f1) {
                                        ((org.telegram.ui.ActionBar.f1) childAt).setSelectorColor(iV);
                                    }
                                }
                                i13++;
                                callback2 = callback;
                            }
                            Utilities.Callback callback4 = callback2;
                            if (AndroidUtilities.computePerceivedBrightness(o0Var2.f43969h0) > 0.721f) {
                                b70VarF.P(-1);
                                b70VarF.T(-986896);
                            } else {
                                b70VarF.P(-14737633);
                                b70VarF.T(-15592942);
                            }
                            int i15 = o0Var2.f43962c0;
                            if (i15 == 0) {
                                b70VarF.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) oVar3.run(3), false);
                                b70VarF.c(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) oVar3.run(1), false);
                                b70VarF.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) oVar3.run(2), !o0Var2.m0);
                                b70VarF.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) oVar3.run(4), false);
                            } else if (i15 == 1) {
                                if (!o0Var2.f43973l0) {
                                    b70VarF.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) oVar3.run(3), false);
                                    b70VarF.k();
                                }
                                if (o0Var2.f43972k0) {
                                    b70VarF.c(R.drawable.msg_arrow_forward, LocaleController.getString(R.string.WebForward), (Runnable) oVar3.run(9), false);
                                }
                                c2 instantViewLoader = o0Var2.getInstantViewLoader();
                                if (instantViewLoader != null && (((!instantViewLoader.f43799g || !instantViewLoader.f43800i) && instantViewLoader.h == null && instantViewLoader.f43801j == null && !instantViewLoader.f43796c) || instantViewLoader.b() != null)) {
                                    b70VarF.c(R.drawable.menu_instant_view, LocaleController.getString(R.string.OpenLocalInstantView), (Runnable) oVar3.run(10), false);
                                    org.telegram.ui.ActionBar.f1 f1VarY = b70VarF.y();
                                    f1VarY.setEnabled(instantViewLoader.b() != null);
                                    f1VarY.setAlpha(f1VarY.isEnabled() ? 1.0f : 0.5f);
                                    zh1 zh1Var = new zh1(6, f1VarY, instantViewLoader);
                                    instantViewLoader.f43804m.add(zh1Var);
                                    b70VarF.f26987p = new zh1(10, instantViewLoader, zh1Var);
                                }
                                b70VarF.c(R.drawable.msg_reset, LocaleController.getString(R.string.Refresh), (Runnable) oVar3.run(5), false);
                                b70VarF.c(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) oVar3.run(1), false);
                                b70VarF.c(R.drawable.msg_saved, LocaleController.getString(R.string.WebBookmark), (Runnable) oVar3.run(6), false);
                                b70VarF.c(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) oVar3.run(2), false);
                                b70VarF.k();
                                if (!b1.a(callback4).isEmpty()) {
                                    b70VarF.c(R.drawable.menu_views_recent, LocaleController.getString(R.string.WebHistory), (Runnable) oVar3.run(8), false);
                                }
                                b70VarF.c(R.drawable.menu_browser_bookmarks, LocaleController.getString(R.string.WebBookmarks), (Runnable) oVar3.run(7), false);
                                b70VarF.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) oVar3.run(4), false);
                            }
                            b70VarF.f26987p = new tq0(o0Var2, 11);
                            b70VarF.Z();
                            break;
                        }
                        break;
                    default:
                        o0Var.R.setText("");
                        break;
                }
            }
        });
        addView(imageView4, z5.e(54, 56, 85));
        z70 z70Var = new z70(context);
        this.W = z70Var;
        z70Var.setPivotX(0.0f);
        z70Var.setPivotY(AndroidUtilities.dp(2.0f));
        addView(z70Var, z5.e(-1, 2, 87));
        setWillNotDraw(false);
        this.f43959b[0] = new q1(o0Var);
        this.f43959b[1] = new q1(o0Var);
        int i13 = g6.Pk;
        d(g6.w0(null, i13, false), false);
        setMenuColors(g6.w0(null, i13, false));
    }

    public final void a(Canvas canvas, float f10, float f11, boolean z10) {
        float f12;
        float fMax = Math.max(AndroidUtilities.dp(0.66f), 1);
        float f13 = f10 - fMax;
        float width = getWidth() * this.f43961c;
        float width2 = getWidth();
        RectF rectF = this.f43957a;
        rectF.set(0.0f, 0.0f, width2, f10);
        Paint[] paintArr = this.f43966f;
        int alpha = paintArr[1].getAlpha();
        paintArr[1].setAlpha((int) (alpha * 1.0f));
        canvas.drawRect(rectF, paintArr[1]);
        paintArr[1].setAlpha(alpha);
        float f14 = this.f43961c;
        float[] fArr = this.d;
        Paint[] paintArr2 = this.f43974n;
        Paint[] paintArr3 = this.h;
        if (f14 > 0.0f) {
            rectF.set(0.0f, 0.0f, fArr[1] * getWidth(), f10);
            int alpha2 = paintArr3[1].getAlpha();
            f12 = 1.0f;
            paintArr3[1].setAlpha((int) ((1.0f - this.T) * (1.0f - this.Q) * alpha2 * 1.0f));
            canvas.drawRect(rectF, paintArr3[1]);
            paintArr3[1].setAlpha(alpha2);
            if (z10) {
                rectF.set(0.0f, f13, width, f13 + fMax);
                int alpha3 = paintArr2[1].getAlpha();
                paintArr2[1].setAlpha((int) ((1.0f - this.T) * alpha3 * 1.0f * f11));
                canvas.drawRect(rectF, paintArr2[1]);
                paintArr2[1].setAlpha(alpha3);
            }
        } else {
            f12 = 1.0f;
        }
        float f15 = this.f43961c;
        if (f15 < f12) {
            int iL1 = g6.l1((f12 - f15) * f12, 1610612736);
            Paint paint = this.f43979r;
            paint.setColor(iL1);
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
        paintArr3[0].setAlpha((int) ((f12 - this.T) * (f12 - this.Q) * (f12 - Utilities.clamp01(this.f43961c * 4.0f)) * alpha5 * f12));
        canvas.drawRect(rectF, paintArr3[0]);
        paintArr3[0].setAlpha(alpha5);
        if (z10) {
            rectF.set(width, f13, getWidth() + width, fMax + f13);
            int alpha6 = paintArr2[0].getAlpha();
            paintArr2[0].setAlpha((int) ((f12 - this.T) * alpha6 * f12 * f11));
            canvas.drawRect(rectF, paintArr2[0]);
            paintArr2[0].setAlpha(alpha6);
        }
    }

    public final void b(int i10, int i11) {
        boolean[] zArr = this.f43964e;
        boolean z10 = zArr[i10];
        Paint[] paintArr = this.f43966f;
        if (z10 && paintArr[i10].getColor() == i11) {
            return;
        }
        zArr[i10] = true;
        paintArr[i10].setColor(i11);
        float f10 = AndroidUtilities.computePerceivedBrightness(i11) <= 0.721f ? 1.0f : 0.0f;
        int iD = i0.b.d(f10, -16777216, -1);
        this.h[i10].setColor(g6.v(i11, g6.l1(AndroidUtilities.lerp(0.07f, 0.2f, f10), iD)));
        this.f43974n[i10].setColor(g6.v(i11, g6.l1(AndroidUtilities.lerp(0.14f, 0.24f, f10), iD)));
        q1[] q1VarArr = this.f43959b;
        q1VarArr[i10].f43946a.r(iD);
        q1VarArr[i10].d = g6.v(i11, g6.l1(0.6f, iD));
        q1 q1Var = q1VarArr[i10];
        q1Var.f43947b.r(i0.b.d(q1VarArr[i10].f43948c.f34812c, q1Var.d, g6.w0(null, g6.f23284q7, false)));
        invalidate();
    }

    public final void c(final int i10, float f10, boolean z10) {
        boolean[] zArr = this.f43964e;
        if (zArr[2] && this.f43965e0 == i10) {
            return;
        }
        if (z10) {
            ValueAnimator valueAnimator = this.f43968g0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i11 = this.f43965e0;
            this.f43963d0 = i11;
            final float f11 = AndroidUtilities.computePerceivedBrightness(i11) <= 0.721f ? 1.0f : 0.0f;
            final float f12 = AndroidUtilities.computePerceivedBrightness(i10) > 0.721f ? 0.0f : 1.0f;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f43968g0 = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    r1 r1Var = this.f43907a;
                    r1Var.getClass();
                    float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    r1Var.c(i0.b.d(fFloatValue, r1Var.f43963d0, i10), AndroidUtilities.lerp(f11, f12, fFloatValue), false);
                }
            });
            this.f43968g0.addListener(new fb(this, i10, f12, 2));
            this.f43968g0.start();
            return;
        }
        zArr[2] = true;
        if (f10 < 0.0f) {
            f10 = AndroidUtilities.computePerceivedBrightness(i10) <= 0.721f ? 1.0f : 0.0f;
        }
        int iD = i0.b.d(f10, -16777216, -1);
        this.f43986w = iD;
        g6.l1(0.55f, iD);
        this.f43965e0 = i10;
        this.f43988x = i0.b.d(f10, -1, -16777216);
        int iD2 = i0.b.d(1.0f - f10, -1, -16777216);
        this.f43989y = iD2;
        int i12 = this.f43988x;
        m4 m4Var = ((org.telegram.ui.o0) this).f40965x0;
        l lVar = m4Var.f40336e0;
        if (lVar != null) {
            lVar.c(i12, iD2);
        }
        this.f43981s.setColor(this.f43988x);
        this.v.setColor(g6.v(this.f43988x, g6.l1(AndroidUtilities.lerp(0.07f, 0.2f, f10), this.f43986w)));
        int iL1 = g6.l1(0.6f, this.f43989y);
        hh.o oVar = this.U;
        oVar.setHintTextColor(iL1);
        oVar.setTextColor(this.f43989y);
        oVar.setCursorColor(this.f43989y);
        oVar.setHandlesColor(this.f43989y);
        this.W.setProgressColor(g6.w0(null, g6.Rk, false));
        int iD3 = i0.b.d(this.T, this.f43986w, this.f43989y);
        org.telegram.ui.ActionBar.g2 g2Var = this.I;
        g2Var.a(iD3);
        g2Var.b(i0.b.d(this.T, this.f43986w, this.f43989y));
        int i13 = this.f43986w;
        p1 p1Var = this.L;
        p1Var.f24652c.setColor(i13);
        p1Var.invalidateSelf();
        int i14 = this.f43986w;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.N.setColorFilter(new PorterDuffColorFilter(i14, mode));
        this.K.setColorFilter(new PorterDuffColorFilter(this.f43986w, mode));
        this.F.setColorFilter(new PorterDuffColorFilter(this.f43986w, mode));
        int iV = g6.v(i10, g6.l1(0.22f, this.f43986w));
        this.f43967f0 = iV;
        g6.B1(this.J, iV, true);
        g6.B1(this.M, this.f43967f0, true);
        g6.B1(this.O, this.f43967f0, true);
        g6.B1(this.G, this.f43967f0, true);
        int iL2 = g6.l1(0.6f, this.f43986w);
        hh.o oVar2 = this.R;
        oVar2.setHintTextColor(iL2);
        oVar2.setTextColor(this.f43986w);
        oVar2.setCursorColor(this.f43986w);
        oVar2.setHandlesColor(this.f43986w);
        z3 z3Var = m4Var.G;
        if (z3Var != null) {
            z3Var.i();
        }
        invalidate();
    }

    public final void d(int i10, boolean z10) {
        c(i10, -1.0f, z10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        a(canvas, (this.f43958a0 ? AndroidUtilities.statusBarHeight : 0) + this.B, 1.0f, this.f43976o0);
        float right = this.D.getRight();
        float left = this.E.getLeft();
        boolean z10 = this.f43958a0;
        float f10 = z10 ? AndroidUtilities.statusBarHeight : 0;
        float f11 = (z10 ? AndroidUtilities.statusBarHeight : 0) + this.B;
        float f12 = this.f43961c;
        q1[] q1VarArr = this.f43959b;
        if (f12 < 1.0f) {
            canvas.save();
            float width = (getWidth() * this.f43961c) - (Utilities.clamp01(this.f43961c * 2.0f) * AndroidUtilities.dp(30.0f));
            canvas.translate(right + width, f10);
            AndroidUtilities.lerp(1.0f, 0.5f, this.f43961c);
            q1VarArr[0].a(canvas, (left - right) - width, f11 - f10, (1.0f - this.Q) * (1.0f - this.f43961c));
            canvas.restore();
        }
        if (this.f43961c > 0.0f) {
            float width2 = getWidth() * this.f43961c;
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, width2, getHeight());
            canvas.translate(right, f10);
            canvas.translate((1.0f - this.f43961c) * AndroidUtilities.dp(-12.0f), 0.0f);
            float fLerp = AndroidUtilities.lerp(1.0f, 0.5f, 1.0f - this.f43961c);
            float f13 = f11 - f10;
            canvas.scale(fLerp, fLerp, 0.0f, f13 / 2.0f);
            q1VarArr[1].a(canvas, left - right, f13, (1.0f - this.T) * (1.0f - this.Q) * this.f43961c);
            canvas.restore();
        }
        float f14 = this.T;
        RectF rectF = this.f43957a;
        if (f14 > 0.0f) {
            Paint paint = this.f43981s;
            int alpha = paint.getAlpha();
            paint.setAlpha((int) (alpha * this.T));
            canvas.drawRect(0.0f, 0.0f, getWidth(), (this.f43958a0 ? AndroidUtilities.statusBarHeight : 0) + this.B, paint);
            paint.setAlpha(alpha);
            float f15 = (f10 + f11) / 2.0f;
            float fDp = AndroidUtilities.dp(42.0f) / 2.0f;
            rectF.set(AndroidUtilities.dp(6.0f), f15 - fDp, AndroidUtilities.lerp(left, getWidth() - AndroidUtilities.dp(6.0f), this.T), f15 + fDp);
            Paint paint2 = this.v;
            int alpha2 = paint2.getAlpha();
            paint2.setAlpha((int) (alpha2 * this.T));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), paint2);
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
        w0 webView;
        int action = motionEvent.getAction();
        m1 m1Var = this.f43985v0;
        if (action == 0) {
            this.f43987w0 = false;
            AndroidUtilities.cancelRunOnUIThread(m1Var);
            if (motionEvent.getX() > this.D.getRight() && motionEvent.getX() < this.E.getLeft() && !this.P && !this.S) {
                this.f43983t0 = motionEvent.getX();
                motionEvent.getY();
                this.f43984u0 = System.currentTimeMillis();
                AndroidUtilities.runOnUIThread(m1Var, (long) (ViewConfiguration.getLongPressTimeout() * 0.8f));
            }
        } else if (motionEvent.getAction() == 2 && System.currentTimeMillis() - this.f43984u0 > ViewConfiguration.getLongPressTimeout() * 0.8f) {
            AndroidUtilities.cancelRunOnUIThread(m1Var);
            this.f43987w0 = true;
            float x8 = (motionEvent.getX() - this.f43983t0) / (getWidth() * 0.8f);
            q3 q3Var = ((org.telegram.ui.o0) this).f40965x0.f40347q0[0];
            float fClamp01 = Utilities.clamp01(q3Var.getProgress() + x8);
            if (!q3Var.c() && q3Var.f() && (webView = q3Var.f41499f.getWebView()) != null) {
                webView.setScrollProgress(fClamp01);
                q3Var.G.f0();
            }
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(m1Var);
            this.f43984u0 = 0L;
        }
        this.f43983t0 = motionEvent.getX();
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(int i10, boolean z10) {
        q1 q1Var = this.f43959b[i10];
        if (q1Var.f43949e != z10) {
            q1Var.f43949e = z10;
            q1Var.f43948c.d(z10 ? 1.0f : 0.0f, true);
            invalidate();
        }
    }

    public final void f(int i10, String str) {
        q1[] q1VarArr = this.f43959b;
        CharSequence charSequence = q1VarArr[i10].f43947b.f29243g;
        if (charSequence == null || !TextUtils.equals(charSequence.toString(), str)) {
            q1VarArr[i10].f43947b.q(Emoji.replaceEmoji(str, q1VarArr[i10].f43947b.f29238a.getFontMetricsInt(), false), false, true);
        }
    }

    public final void g(int i10, String str, boolean z10) {
        q1[] q1VarArr = this.f43959b;
        CharSequence charSequence = q1VarArr[i10].f43946a.f29243g;
        if (charSequence == null || !TextUtils.equals(charSequence.toString(), str)) {
            q1VarArr[i10].f43946a.q(Emoji.replaceEmoji(str, q1VarArr[i10].f43946a.f29238a.getFontMetricsInt(), false), z10, true);
        }
    }

    public int getBackgroundColor() {
        return this.f43965e0;
    }

    public c2 getInstantViewLoader() {
        return null;
    }

    public int getTextColor() {
        return this.f43986w;
    }

    public String getTitle() {
        CharSequence charSequence = this.f43959b[0].f43946a.f29243g;
        return charSequence == null ? "" : charSequence.toString();
    }

    public final void h(boolean z10) {
        if (this.P == z10) {
            return;
        }
        ValueAnimator valueAnimator = this.f43977p0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.P = z10;
        hh.o oVar = this.R;
        boolean z11 = false;
        oVar.setVisibility(0);
        this.I.c((this.f43978q0 || z10) ? 0.0f : 1.0f, true);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.Q, z10 ? 1.0f : 0.0f);
        this.f43977p0 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new m2(this, 16));
        this.f43977p0.addListener(new n40(13, this, z10));
        this.f43977p0.setInterpolator(er.h);
        this.f43977p0.setDuration(320L);
        this.f43977p0.start();
        boolean z12 = !z10;
        AndroidUtilities.updateViewShow(this.K, z12, true, true);
        AndroidUtilities.updateViewShow(this.N, z12, true, true);
        if (oVar.length() > 0 && this.P) {
            z11 = true;
        }
        AndroidUtilities.updateViewShow(this.F, z11, true, true);
    }

    public final void i() {
        q1[] q1VarArr = this.f43959b;
        q1 q1Var = q1VarArr[0];
        q1VarArr[0] = q1VarArr[1];
        q1VarArr[1] = q1Var;
        float[] fArr = this.d;
        float f10 = fArr[0];
        fArr[0] = fArr[1];
        fArr[1] = f10;
        Paint[] paintArr = this.f43966f;
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
        super.onMeasure(i10, rl.B(56.0f, this.f43958a0 ? AndroidUtilities.statusBarHeight : 0, 1073741824));
    }

    public void setBackButton(boolean z10) {
        this.f43978q0 = z10;
        if (this.P || this.S) {
            return;
        }
        this.I.c(z10 ? 0.0f : 1.0f, true);
    }

    public void setBackButtonCached(boolean z10) {
        this.f43978q0 = z10;
    }

    public void setHasForward(boolean z10) {
        this.f43972k0 = z10;
    }

    public void setHeight(int i10) {
        if (this.B != i10) {
            this.B = i10;
            float fPow = (float) Math.pow(i10 / AndroidUtilities.dp(56.0f), 0.5d);
            this.C = fPow;
            hh.m mVar = this.D;
            mVar.setScaleX(fPow);
            mVar.setScaleY(this.C);
            mVar.setTranslationX((1.0f - this.C) * AndroidUtilities.dp(42.0f));
            mVar.setTranslationY((1.0f - this.C) * AndroidUtilities.dp(-12.0f));
            float f10 = this.C;
            hh.m mVar2 = this.E;
            mVar2.setScaleX(f10);
            mVar2.setScaleY(this.C);
            mVar2.setTranslationX((1.0f - this.C) * (-AndroidUtilities.dp(42.0f)));
            mVar2.setTranslationY((1.0f - this.C) * AndroidUtilities.dp(-12.0f));
            this.W.setTranslationY(this.B - AndroidUtilities.dp(56.0f));
            invalidate();
        }
    }

    public void setIsLocal(boolean z10) {
        this.m0 = z10;
    }

    public void setIsTonsite(boolean z10) {
        this.f43973l0 = z10;
    }

    public void setMenuColors(int i10) {
        double[] dArrJ = e5.j(e5.f22879a, e5.j(e5.f22881c, new double[]{((double) Color.red(i10)) / 255.0d, ((double) Color.green(i10)) / 255.0d, ((double) Color.blue(i10)) / 255.0d}));
        for (int i11 = 0; i11 < 3; i11++) {
            dArrJ[i11] = Math.cbrt(dArrJ[i11]);
        }
        double[] dArrJ2 = e5.j(e5.f22880b, dArrJ);
        double d = dArrJ2[0];
        double d10 = dArrJ2[1];
        double d11 = dArrJ2[2];
        boolean z10 = new double[]{d, Math.sqrt(Math.pow(d11, 2.0d) + Math.pow(d10, 2.0d)), ((Math.abs(d10) > 2.0E-4d ? 1 : (Math.abs(d10) == 2.0E-4d ? 0 : -1)) >= 0 || (Math.abs(d11) > 2.0E-4d ? 1 : (Math.abs(d11) == 2.0E-4d ? 0 : -1)) >= 0) ? ((((Math.atan2(d11, d10) * 180.0d) / 3.141592653589793d) % 360.0d) + 360.0d) % 360.0d : Double.NaN}[0] < 0.5d;
        this.f43969h0 = z10 ? -16777216 : -1;
        int i12 = z10 ? -1 : -16777216;
        this.f43970i0 = i12;
        this.f43971j0 = g6.l1(0.6f, i12);
    }

    public void setMenuListener(Utilities.Callback<Integer> callback) {
        this.f43960b0 = callback;
    }

    public void setMenuType(int i10) {
        if (this.f43962c0 != i10) {
            this.f43962c0 = i10;
        }
    }

    public void setProgress(float f10) {
        this.d[0] = f10;
        invalidate();
    }

    public void setTransitionProgress(float f10) {
        this.f43961c = f10;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return true;
    }

    public void setIsLoaded(boolean z10) {
    }
}
