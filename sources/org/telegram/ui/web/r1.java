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
import bg.y3;
import i7.f6;
import jh.za;
import lh.d5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.jr;
import org.telegram.ui.ef0;
import org.telegram.ui.m4;
import org.telegram.ui.p60;
import org.telegram.ui.q3;
import org.telegram.ui.u10;
import org.telegram.ui.z3;
public abstract class r1 extends FrameLayout {
    public final TextPaint A;
    public int B;
    public float C;
    public final y3 D;
    public final y3 E;
    public final ImageView F;
    public final org.telegram.ui.Cells.z G;
    public final ImageView H;
    public final org.telegram.ui.ActionBar.h2 I;
    public final org.telegram.ui.Cells.z J;
    public final ImageView K;
    public final p1 L;
    public final org.telegram.ui.Cells.z M;
    public final ImageView N;
    public final org.telegram.ui.Cells.z O;
    public boolean P;
    public float Q;
    public final jh.m R;
    public boolean S;
    public float T;
    public final jh.m U;
    public int V;
    public final i80 W;
    public final RectF f44160a;
    public boolean f44161a0;
    public final q1[] f44162b;
    public Utilities.Callback f44163b0;
    public float f44164c;
    public int f44165c0;
    public final float[] d;
    public int f44166d0;
    public final boolean[] f44167e;
    public int f44168e0;
    public final Paint[] f44169f;
    public int f44170f0;
    public ValueAnimator f44171g0;
    public final Paint[] h;
    public int f44172h0;
    public int f44173i0;
    public int f44174j0;
    public boolean f44175k0;
    public boolean f44176l0;
    public boolean m0;
    public final Paint[] f44177n;
    public final u10 f44178n0;
    public boolean f44179o0;
    public ValueAnimator f44180p0;
    public boolean f44181q0;
    public final Paint f44182r;
    public ih.b1 f44183r0;
    public final Paint f44184s;
    public ValueAnimator f44185s0;
    public float f44186t0;
    public long f44187u0;
    public final Paint v;
    public final m1 f44188v0;
    public int f44189w;
    public boolean f44190w0;
    public int f44191x;
    public int f44192y;

    public r1(Context context) {
        super(context);
        this.f44160a = new RectF();
        this.f44162b = new q1[2];
        this.f44164c = 0.0f;
        this.d = new float[2];
        this.f44167e = new boolean[3];
        this.f44169f = new Paint[2];
        this.h = new Paint[2];
        this.f44177n = new Paint[2];
        this.f44182r = new Paint(1);
        this.f44184s = new Paint(1);
        this.v = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.A = textPaint;
        this.B = AndroidUtilities.dp(56.0f);
        this.C = 1.0f;
        this.Q = 0.0f;
        this.T = 0.0f;
        this.f44165c0 = -1;
        this.f44178n0 = new u10();
        final org.telegram.ui.o0 o0Var = (org.telegram.ui.o0) this;
        this.f44188v0 = new m1(o0Var, 0);
        this.f44190w0 = false;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(18.33f));
        for (int i10 = 0; i10 < 2; i10++) {
            this.f44169f[i10] = new Paint(1);
            this.h[i10] = new Paint(1);
            this.f44177n[i10] = new Paint(1);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, f6.e(-1, 56, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        addView(frameLayout2, f6.e(-1, 56, 87));
        y3 y3Var = new y3(context, 9);
        this.D = y3Var;
        y3Var.setOrientation(0);
        addView(y3Var, f6.e(-2, 56, 83));
        ImageView imageView = new ImageView(context);
        this.H = imageView;
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(false);
        this.I = h2Var;
        h2Var.f23476k = 200.0f;
        h2Var.c(1.0f, false);
        imageView.setImageDrawable(h2Var);
        org.telegram.ui.Cells.z f02 = g6.f0(1090519039, 1, -1);
        this.J = f02;
        imageView.setBackground(f02);
        y3Var.addView(imageView, f6.n(54, 56));
        y3 y3Var2 = new y3(context, 10);
        this.E = y3Var2;
        y3Var2.setOrientation(0);
        addView(y3Var2, f6.e(-2, 56, 85));
        ImageView imageView2 = new ImageView(context);
        this.K = imageView2;
        imageView2.setScaleType(scaleType);
        p1 p1Var = new p1(o0Var);
        this.L = p1Var;
        imageView2.setImageDrawable(p1Var);
        p1Var.f();
        org.telegram.ui.Cells.z f03 = g6.f0(1090519039, 1, -1);
        this.M = f03;
        imageView2.setBackground(f03);
        y3Var2.addView(imageView2, f6.n(54, 56));
        ImageView imageView3 = new ImageView(context);
        this.N = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.ic_ab_other);
        imageView3.setColorFilter(new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_IN));
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                float f9;
                View childAt;
                Utilities.Callback callback;
                switch (r2) {
                    case 0:
                        boolean z10 = true;
                        org.telegram.ui.o0 o0Var2 = o0Var;
                        if (o0Var2.getParent() instanceof ViewGroup) {
                            bg.b0 b0Var = new bg.b0(o0Var2, 5);
                            Utilities.Callback callback2 = null;
                            j70 F = j70.F((ViewGroup) o0Var2.getParent(), null, o0Var2.N);
                            F.f29600s = 0;
                            F.S(o0Var2.f44173i0, o0Var2.f44174j0);
                            F.a0(0.0f, -AndroidUtilities.dp(52.0f));
                            F.S = 200;
                            int v = g6.v(o0Var2.f44172h0, g6.l1(0.1f, o0Var2.f44173i0));
                            F.f29589l0 = Integer.valueOf(v);
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
                                        View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.H.getChildAt(i12);
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
                            if (AndroidUtilities.computePerceivedBrightness(o0Var2.f44172h0) > 0.721f) {
                                F.P(-1);
                                F.T(-986896);
                            } else {
                                F.P(-14737633);
                                F.T(-15592942);
                            }
                            int i13 = o0Var2.f44165c0;
                            if (i13 == 0) {
                                F.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) b0Var.run(3), false);
                                F.c(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) b0Var.run(1), false);
                                F.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) b0Var.run(2), !o0Var2.m0);
                                F.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) b0Var.run(4), false);
                            } else if (i13 == 1) {
                                if (!o0Var2.f44176l0) {
                                    F.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) b0Var.run(3), false);
                                    F.k();
                                }
                                if (o0Var2.f44175k0) {
                                    F.c(R.drawable.msg_arrow_forward, LocaleController.getString(R.string.WebForward), (Runnable) b0Var.run(9), false);
                                }
                                d2 instantViewLoader = o0Var2.getInstantViewLoader();
                                if (instantViewLoader != null && (((!instantViewLoader.f44010g || !instantViewLoader.f44011i) && instantViewLoader.h == null && instantViewLoader.f44012j == null && !instantViewLoader.f44007c) || instantViewLoader.b() != null)) {
                                    F.c(R.drawable.menu_instant_view, LocaleController.getString(R.string.OpenLocalInstantView), (Runnable) b0Var.run(10), false);
                                    org.telegram.ui.ActionBar.g1 y8 = F.y();
                                    if (instantViewLoader.b() == null) {
                                        z10 = false;
                                    }
                                    y8.setEnabled(z10);
                                    if (y8.isEnabled()) {
                                        f9 = 1.0f;
                                    } else {
                                        f9 = 0.5f;
                                    }
                                    y8.setAlpha(f9);
                                    y yVar = new y(3, y8, instantViewLoader);
                                    instantViewLoader.f44015m.add(yVar);
                                    F.f29595p = new y(7, instantViewLoader, yVar);
                                }
                                F.c(R.drawable.msg_reset, LocaleController.getString(R.string.Refresh), (Runnable) b0Var.run(5), false);
                                F.c(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) b0Var.run(1), false);
                                F.c(R.drawable.msg_saved, LocaleController.getString(R.string.WebBookmark), (Runnable) b0Var.run(6), false);
                                F.c(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) b0Var.run(2), false);
                                F.k();
                                if (!b1.a(callback4).isEmpty()) {
                                    F.c(R.drawable.menu_views_recent, LocaleController.getString(R.string.WebHistory), (Runnable) b0Var.run(8), false);
                                }
                                F.c(R.drawable.menu_browser_bookmarks, LocaleController.getString(R.string.WebBookmarks), (Runnable) b0Var.run(7), false);
                                F.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) b0Var.run(4), false);
                            }
                            F.f29595p = new ef0(o0Var2, 14);
                            F.Z();
                            return;
                        }
                        return;
                    default:
                        o0Var.R.setText("");
                        return;
                }
            }
        });
        org.telegram.ui.Cells.z f04 = g6.f0(1090519039, 1, -1);
        this.O = f04;
        imageView3.setBackground(f04);
        imageView3.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
        y3Var2.addView(imageView3, f6.n(54, 56));
        jh.m mVar = new jh.m(context, 3);
        this.R = mVar;
        mVar.setVisibility(8);
        mVar.setAlpha(0.0f);
        mVar.setTextSize(1, 18.0f);
        mVar.setSingleLine(true);
        mVar.setHint(LocaleController.getString(R.string.Search));
        mVar.setBackgroundResource(0);
        mVar.setCursorWidth(1.5f);
        mVar.setGravity(112);
        mVar.setClipToPadding(true);
        mVar.setPadding(AndroidUtilities.dp(58.0f), 0, AndroidUtilities.dp(112.0f), 0);
        mVar.setTranslationY(-AndroidUtilities.dp(0.66f));
        mVar.setInputType(mVar.getInputType() | 524288);
        mVar.setImeOptions(33554435);
        mVar.setTextIsSelectable(false);
        mVar.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (keyEvent != null) {
                            if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                                AndroidUtilities.hideKeyboard(o0Var.R);
                                return false;
                            }
                            return false;
                        }
                        return false;
                    default:
                        if (i11 == 2) {
                            org.telegram.ui.o0 o0Var2 = o0Var;
                            ih.b1 b1Var = o0Var2.f44183r0;
                            if (b1Var != null) {
                                b1Var.run(o0Var2.U.getText().toString());
                            }
                            o0Var2.k(false);
                        }
                        return false;
                }
            }
        });
        mVar.addTextChangedListener(new bh.c(o0Var, 16));
        frameLayout.addView(mVar, f6.e(-1, -1, 119));
        jh.m mVar2 = new jh.m(context, 4);
        this.U = mVar2;
        mVar2.setVisibility(8);
        mVar2.setAlpha(0.0f);
        mVar2.setTextSize(1, 15.66f);
        mVar2.setSingleLine(true);
        this.V = SharedConfig.searchEngineType;
        mVar2.setHint(LocaleController.formatString(R.string.AddressPlaceholder, k1.a().f44088a));
        mVar2.setBackgroundResource(0);
        mVar2.setCursorWidth(1.5f);
        mVar2.setGravity(112);
        mVar2.setInputType(mVar2.getInputType() | 524288);
        mVar2.setImeOptions(33554434);
        mVar2.setTextIsSelectable(false);
        mVar2.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (keyEvent != null) {
                            if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                                AndroidUtilities.hideKeyboard(o0Var.R);
                                return false;
                            }
                            return false;
                        }
                        return false;
                    default:
                        if (i11 == 2) {
                            org.telegram.ui.o0 o0Var2 = o0Var;
                            ih.b1 b1Var = o0Var2.f44183r0;
                            if (b1Var != null) {
                                b1Var.run(o0Var2.U.getText().toString());
                            }
                            o0Var2.k(false);
                        }
                        return false;
                }
            }
        });
        frameLayout2.addView(mVar2, f6.d(-1, -1.0f, 119, 48.0f, 0.0f, 12.0f, 0.0f));
        ImageView imageView4 = new ImageView(context);
        this.F = imageView4;
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(R.drawable.ic_close_white);
        org.telegram.ui.Cells.z f05 = g6.f0(1090519039, 1, -1);
        this.G = f05;
        imageView4.setBackground(f05);
        imageView4.setVisibility(8);
        imageView4.setAlpha(0.0f);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                float f9;
                View childAt;
                Utilities.Callback callback;
                switch (r2) {
                    case 0:
                        boolean z10 = true;
                        org.telegram.ui.o0 o0Var2 = o0Var;
                        if (o0Var2.getParent() instanceof ViewGroup) {
                            bg.b0 b0Var = new bg.b0(o0Var2, 5);
                            Utilities.Callback callback2 = null;
                            j70 F = j70.F((ViewGroup) o0Var2.getParent(), null, o0Var2.N);
                            F.f29600s = 0;
                            F.S(o0Var2.f44173i0, o0Var2.f44174j0);
                            F.a0(0.0f, -AndroidUtilities.dp(52.0f));
                            F.S = 200;
                            int v = g6.v(o0Var2.f44172h0, g6.l1(0.1f, o0Var2.f44173i0));
                            F.f29589l0 = Integer.valueOf(v);
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
                                        View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.H.getChildAt(i12);
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
                            if (AndroidUtilities.computePerceivedBrightness(o0Var2.f44172h0) > 0.721f) {
                                F.P(-1);
                                F.T(-986896);
                            } else {
                                F.P(-14737633);
                                F.T(-15592942);
                            }
                            int i13 = o0Var2.f44165c0;
                            if (i13 == 0) {
                                F.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) b0Var.run(3), false);
                                F.c(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) b0Var.run(1), false);
                                F.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) b0Var.run(2), !o0Var2.m0);
                                F.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) b0Var.run(4), false);
                            } else if (i13 == 1) {
                                if (!o0Var2.f44176l0) {
                                    F.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) b0Var.run(3), false);
                                    F.k();
                                }
                                if (o0Var2.f44175k0) {
                                    F.c(R.drawable.msg_arrow_forward, LocaleController.getString(R.string.WebForward), (Runnable) b0Var.run(9), false);
                                }
                                d2 instantViewLoader = o0Var2.getInstantViewLoader();
                                if (instantViewLoader != null && (((!instantViewLoader.f44010g || !instantViewLoader.f44011i) && instantViewLoader.h == null && instantViewLoader.f44012j == null && !instantViewLoader.f44007c) || instantViewLoader.b() != null)) {
                                    F.c(R.drawable.menu_instant_view, LocaleController.getString(R.string.OpenLocalInstantView), (Runnable) b0Var.run(10), false);
                                    org.telegram.ui.ActionBar.g1 y8 = F.y();
                                    if (instantViewLoader.b() == null) {
                                        z10 = false;
                                    }
                                    y8.setEnabled(z10);
                                    if (y8.isEnabled()) {
                                        f9 = 1.0f;
                                    } else {
                                        f9 = 0.5f;
                                    }
                                    y8.setAlpha(f9);
                                    y yVar = new y(3, y8, instantViewLoader);
                                    instantViewLoader.f44015m.add(yVar);
                                    F.f29595p = new y(7, instantViewLoader, yVar);
                                }
                                F.c(R.drawable.msg_reset, LocaleController.getString(R.string.Refresh), (Runnable) b0Var.run(5), false);
                                F.c(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) b0Var.run(1), false);
                                F.c(R.drawable.msg_saved, LocaleController.getString(R.string.WebBookmark), (Runnable) b0Var.run(6), false);
                                F.c(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) b0Var.run(2), false);
                                F.k();
                                if (!b1.a(callback4).isEmpty()) {
                                    F.c(R.drawable.menu_views_recent, LocaleController.getString(R.string.WebHistory), (Runnable) b0Var.run(8), false);
                                }
                                F.c(R.drawable.menu_browser_bookmarks, LocaleController.getString(R.string.WebBookmarks), (Runnable) b0Var.run(7), false);
                                F.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) b0Var.run(4), false);
                            }
                            F.f29595p = new ef0(o0Var2, 14);
                            F.Z();
                            return;
                        }
                        return;
                    default:
                        o0Var.R.setText("");
                        return;
                }
            }
        });
        addView(imageView4, f6.e(54, 56, 85));
        i80 i80Var = new i80(context);
        this.W = i80Var;
        i80Var.setPivotX(0.0f);
        i80Var.setPivotY(AndroidUtilities.dp(2.0f));
        addView(i80Var, f6.e(-1, 2, 87));
        setWillNotDraw(false);
        this.f44162b[0] = new q1(o0Var);
        this.f44162b[1] = new q1(o0Var);
        int i11 = g6.Pk;
        d(g6.w0(null, i11, false), false);
        setMenuColors(g6.w0(null, i11, false));
    }

    public final void a(Canvas canvas, float f9, float f10, boolean z10) {
        float f11;
        float max = Math.max(AndroidUtilities.dp(0.66f), 1);
        float f12 = f9 - max;
        float width = getWidth() * this.f44164c;
        RectF rectF = this.f44160a;
        rectF.set(0.0f, 0.0f, getWidth(), f9);
        Paint[] paintArr = this.f44169f;
        int alpha = paintArr[1].getAlpha();
        paintArr[1].setAlpha((int) (alpha * 1.0f));
        canvas.drawRect(rectF, paintArr[1]);
        paintArr[1].setAlpha(alpha);
        float f13 = this.f44164c;
        float[] fArr = this.d;
        Paint[] paintArr2 = this.f44177n;
        Paint[] paintArr3 = this.h;
        if (f13 > 0.0f) {
            rectF.set(0.0f, 0.0f, fArr[1] * getWidth(), f9);
            int alpha2 = paintArr3[1].getAlpha();
            f11 = 1.0f;
            paintArr3[1].setAlpha((int) ((1.0f - this.T) * (1.0f - this.Q) * alpha2 * 1.0f));
            canvas.drawRect(rectF, paintArr3[1]);
            paintArr3[1].setAlpha(alpha2);
            if (z10) {
                rectF.set(0.0f, f12, width, f12 + max);
                int alpha3 = paintArr2[1].getAlpha();
                paintArr2[1].setAlpha((int) ((1.0f - this.T) * alpha3 * 1.0f * f10));
                canvas.drawRect(rectF, paintArr2[1]);
                paintArr2[1].setAlpha(alpha3);
            }
        } else {
            f11 = 1.0f;
        }
        float f14 = this.f44164c;
        if (f14 < f11) {
            int l1 = g6.l1((f11 - f14) * f11, 1610612736);
            Paint paint = this.f44182r;
            paint.setColor(l1);
            rectF.set(0.0f, 0.0f, width, f9);
            canvas.drawRect(rectF, paint);
            rectF.set(width, 0.0f, getWidth(), f9);
            int alpha4 = paintArr[0].getAlpha();
            paintArr[0].setAlpha((int) (alpha4 * f11));
            canvas.drawRect(rectF, paintArr[0]);
            paintArr[0].setAlpha(alpha4);
        }
        rectF.set(width, 0.0f, (fArr[0] * getWidth()) + width, f9);
        int alpha5 = paintArr3[0].getAlpha();
        paintArr3[0].setAlpha((int) ((f11 - this.T) * (f11 - this.Q) * (f11 - Utilities.clamp01(this.f44164c * 4.0f)) * alpha5 * f11));
        canvas.drawRect(rectF, paintArr3[0]);
        paintArr3[0].setAlpha(alpha5);
        if (z10) {
            rectF.set(width, f12, getWidth() + width, max + f12);
            int alpha6 = paintArr2[0].getAlpha();
            paintArr2[0].setAlpha((int) ((f11 - this.T) * alpha6 * f11 * f10));
            canvas.drawRect(rectF, paintArr2[0]);
            paintArr2[0].setAlpha(alpha6);
        }
    }

    public final void b(int i10, int i11) {
        float f9;
        boolean[] zArr = this.f44167e;
        boolean z10 = zArr[i10];
        Paint[] paintArr = this.f44169f;
        if (z10 && paintArr[i10].getColor() == i11) {
            return;
        }
        zArr[i10] = true;
        paintArr[i10].setColor(i11);
        if (AndroidUtilities.computePerceivedBrightness(i11) <= 0.721f) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        int d = i0.a.d(f9, -16777216, -1);
        this.h[i10].setColor(g6.v(i11, g6.l1(AndroidUtilities.lerp(0.07f, 0.2f, f9), d)));
        this.f44177n[i10].setColor(g6.v(i11, g6.l1(AndroidUtilities.lerp(0.14f, 0.24f, f9), d)));
        q1[] q1VarArr = this.f44162b;
        q1VarArr[i10].f44149a.r(d);
        q1VarArr[i10].d = g6.v(i11, g6.l1(0.6f, d));
        q1 q1Var = q1VarArr[i10];
        q1Var.f44150b.r(i0.a.d(q1VarArr[i10].f44151c.f27666c, q1Var.d, g6.w0(null, g6.f23295q7, false)));
        invalidate();
    }

    public final void c(final int i10, float f9, boolean z10) {
        final float f10;
        boolean[] zArr = this.f44167e;
        if (zArr[2] && this.f44168e0 == i10) {
            return;
        }
        final float f11 = 1.0f;
        if (!z10) {
            zArr[2] = true;
            if (f9 < 0.0f) {
                if (AndroidUtilities.computePerceivedBrightness(i10) <= 0.721f) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.0f;
                }
            }
            int d = i0.a.d(f9, -16777216, -1);
            this.f44189w = d;
            g6.l1(0.55f, d);
            this.f44168e0 = i10;
            this.f44191x = i0.a.d(f9, -1, -16777216);
            int d10 = i0.a.d(1.0f - f9, -1, -16777216);
            this.f44192y = d10;
            int i11 = this.f44191x;
            m4 m4Var = ((org.telegram.ui.o0) this).f40944x0;
            l lVar = m4Var.f40393e0;
            if (lVar != null) {
                lVar.c(i11, d10);
            }
            this.f44184s.setColor(this.f44191x);
            this.v.setColor(g6.v(this.f44191x, g6.l1(AndroidUtilities.lerp(0.07f, 0.2f, f9), this.f44189w)));
            int l1 = g6.l1(0.6f, this.f44192y);
            jh.m mVar = this.U;
            mVar.setHintTextColor(l1);
            mVar.setTextColor(this.f44192y);
            mVar.setCursorColor(this.f44192y);
            mVar.setHandlesColor(this.f44192y);
            this.W.setProgressColor(g6.w0(null, g6.Rk, false));
            int d11 = i0.a.d(this.T, this.f44189w, this.f44192y);
            org.telegram.ui.ActionBar.h2 h2Var = this.I;
            h2Var.a(d11);
            h2Var.b(i0.a.d(this.T, this.f44189w, this.f44192y));
            int i12 = this.f44189w;
            p1 p1Var = this.L;
            p1Var.f24670c.setColor(i12);
            p1Var.invalidateSelf();
            int i13 = this.f44189w;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            this.N.setColorFilter(new PorterDuffColorFilter(i13, mode));
            this.K.setColorFilter(new PorterDuffColorFilter(this.f44189w, mode));
            this.F.setColorFilter(new PorterDuffColorFilter(this.f44189w, mode));
            int v = g6.v(i10, g6.l1(0.22f, this.f44189w));
            this.f44170f0 = v;
            g6.B1(this.J, v, true);
            g6.B1(this.M, this.f44170f0, true);
            g6.B1(this.O, this.f44170f0, true);
            g6.B1(this.G, this.f44170f0, true);
            int l12 = g6.l1(0.6f, this.f44189w);
            jh.m mVar2 = this.R;
            mVar2.setHintTextColor(l12);
            mVar2.setTextColor(this.f44189w);
            mVar2.setCursorColor(this.f44189w);
            mVar2.setHandlesColor(this.f44189w);
            z3 z3Var = m4Var.G;
            if (z3Var != null) {
                z3Var.i();
            }
            invalidate();
            return;
        }
        ValueAnimator valueAnimator = this.f44171g0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i14 = this.f44168e0;
        this.f44166d0 = i14;
        if (AndroidUtilities.computePerceivedBrightness(i14) <= 0.721f) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        if (AndroidUtilities.computePerceivedBrightness(i10) > 0.721f) {
            f11 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f44171g0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                r1 r1Var = r1.this;
                r1Var.getClass();
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                r1Var.c(i0.a.d(floatValue, r1Var.f44166d0, i10), AndroidUtilities.lerp(f10, f11, floatValue), false);
            }
        });
        this.f44171g0.addListener(new za(this, i10, f11, 2));
        this.f44171g0.start();
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
        if (this.f44161a0) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        a(canvas, i10 + this.B, 1.0f, this.f44179o0);
        float right = this.D.getRight();
        float left = this.E.getLeft();
        boolean z10 = this.f44161a0;
        if (z10) {
            i11 = AndroidUtilities.statusBarHeight;
        } else {
            i11 = 0;
        }
        float f9 = i11;
        if (z10) {
            i12 = AndroidUtilities.statusBarHeight;
        } else {
            i12 = 0;
        }
        float f10 = i12 + this.B;
        float f11 = this.f44164c;
        q1[] q1VarArr = this.f44162b;
        if (f11 < 1.0f) {
            canvas.save();
            float width = (getWidth() * this.f44164c) - (Utilities.clamp01(this.f44164c * 2.0f) * AndroidUtilities.dp(30.0f));
            canvas.translate(right + width, f9);
            AndroidUtilities.lerp(1.0f, 0.5f, this.f44164c);
            q1VarArr[0].a(canvas, (left - right) - width, f10 - f9, (1.0f - this.Q) * (1.0f - this.f44164c));
            canvas.restore();
        }
        if (this.f44164c > 0.0f) {
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getWidth() * this.f44164c, getHeight());
            canvas.translate(right, f9);
            canvas.translate((1.0f - this.f44164c) * AndroidUtilities.dp(-12.0f), 0.0f);
            float lerp = AndroidUtilities.lerp(1.0f, 0.5f, 1.0f - this.f44164c);
            float f12 = f10 - f9;
            canvas.scale(lerp, lerp, 0.0f, f12 / 2.0f);
            q1VarArr[1].a(canvas, left - right, f12, (1.0f - this.T) * (1.0f - this.Q) * this.f44164c);
            canvas.restore();
        }
        float f13 = this.T;
        RectF rectF = this.f44160a;
        if (f13 > 0.0f) {
            Paint paint = this.f44184s;
            int alpha = paint.getAlpha();
            paint.setAlpha((int) (alpha * this.T));
            float width2 = getWidth();
            if (this.f44161a0) {
                i13 = AndroidUtilities.statusBarHeight;
            }
            canvas.drawRect(0.0f, 0.0f, width2, i13 + this.B, paint);
            paint.setAlpha(alpha);
            float f14 = (f9 + f10) / 2.0f;
            float dp = AndroidUtilities.dp(42.0f) / 2.0f;
            rectF.set(AndroidUtilities.dp(6.0f), f14 - dp, AndroidUtilities.lerp(left, getWidth() - AndroidUtilities.dp(6.0f), this.T), f14 + dp);
            Paint paint2 = this.v;
            int alpha2 = paint2.getAlpha();
            paint2.setAlpha((int) (alpha2 * this.T));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), paint2);
            paint2.setAlpha(alpha2);
        }
        rectF.set(0.0f, f9, getWidth(), f10);
        canvas.save();
        canvas.clipRect(rectF);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        w0 webView;
        int action = motionEvent.getAction();
        m1 m1Var = this.f44188v0;
        if (action == 0) {
            this.f44190w0 = false;
            AndroidUtilities.cancelRunOnUIThread(m1Var);
            if (motionEvent.getX() > this.D.getRight() && motionEvent.getX() < this.E.getLeft() && !this.P && !this.S) {
                this.f44186t0 = motionEvent.getX();
                motionEvent.getY();
                this.f44187u0 = System.currentTimeMillis();
                AndroidUtilities.runOnUIThread(m1Var, ViewConfiguration.getLongPressTimeout() * 0.8f);
            }
        } else if (motionEvent.getAction() == 2 && ((float) (System.currentTimeMillis() - this.f44187u0)) > ViewConfiguration.getLongPressTimeout() * 0.8f) {
            AndroidUtilities.cancelRunOnUIThread(m1Var);
            this.f44190w0 = true;
            q3 q3Var = ((org.telegram.ui.o0) this).f40944x0.f40404q0[0];
            float clamp01 = Utilities.clamp01(q3Var.getProgress() + ((motionEvent.getX() - this.f44186t0) / (getWidth() * 0.8f)));
            if (!q3Var.c() && q3Var.f() && (webView = q3Var.f41516f.getWebView()) != null) {
                webView.setScrollProgress(clamp01);
                q3Var.G.f0();
            }
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(m1Var);
            this.f44187u0 = 0L;
        }
        this.f44186t0 = motionEvent.getX();
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(int i10, boolean z10) {
        float f9;
        q1 q1Var = this.f44162b[i10];
        if (q1Var.f44152e != z10) {
            q1Var.f44152e = z10;
            d6 d6Var = q1Var.f44151c;
            if (z10) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            d6Var.d(f9, true);
            invalidate();
        }
    }

    public final void f(int i10, String str) {
        q1[] q1VarArr = this.f44162b;
        CharSequence charSequence = q1VarArr[i10].f44150b.f30866g;
        if (charSequence != null && TextUtils.equals(charSequence.toString(), str)) {
            return;
        }
        q1VarArr[i10].f44150b.q(Emoji.replaceEmoji(str, q1VarArr[i10].f44150b.f30861a.getFontMetricsInt(), false), false, true);
    }

    public final void g(int i10, String str, boolean z10) {
        q1[] q1VarArr = this.f44162b;
        CharSequence charSequence = q1VarArr[i10].f44149a.f30866g;
        if (charSequence != null && TextUtils.equals(charSequence.toString(), str)) {
            return;
        }
        q1VarArr[i10].f44149a.q(Emoji.replaceEmoji(str, q1VarArr[i10].f44149a.f30861a.getFontMetricsInt(), false), z10, true);
    }

    public int getBackgroundColor() {
        return this.f44168e0;
    }

    public d2 getInstantViewLoader() {
        return null;
    }

    public int getTextColor() {
        return this.f44189w;
    }

    public String getTitle() {
        CharSequence charSequence = this.f44162b[0].f44149a.f30866g;
        if (charSequence == null) {
            return "";
        }
        return charSequence.toString();
    }

    public final void h(boolean z10) {
        float f9;
        if (this.P == z10) {
            return;
        }
        ValueAnimator valueAnimator = this.f44180p0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.P = z10;
        jh.m mVar = this.R;
        boolean z11 = false;
        mVar.setVisibility(0);
        float f10 = 0.0f;
        if (!this.f44181q0 && !z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        this.I.c(f9, true);
        float f11 = this.Q;
        if (z10) {
            f10 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f44180p0 = ofFloat;
        ofFloat.addUpdateListener(new d5(this, 22));
        this.f44180p0.addListener(new p60(12, this, z10));
        this.f44180p0.setInterpolator(jr.h);
        this.f44180p0.setDuration(320L);
        this.f44180p0.start();
        boolean z12 = !z10;
        AndroidUtilities.updateViewShow(this.K, z12, true, true);
        AndroidUtilities.updateViewShow(this.N, z12, true, true);
        if (mVar.length() > 0 && this.P) {
            z11 = true;
        }
        AndroidUtilities.updateViewShow(this.F, z11, true, true);
    }

    public final void i() {
        q1[] q1VarArr = this.f44162b;
        q1 q1Var = q1VarArr[0];
        q1VarArr[0] = q1VarArr[1];
        q1VarArr[1] = q1Var;
        float[] fArr = this.d;
        float f9 = fArr[0];
        fArr[0] = fArr[1];
        fArr[1] = f9;
        Paint[] paintArr = this.f44169f;
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
        if (this.f44161a0) {
            i12 = AndroidUtilities.statusBarHeight;
        } else {
            i12 = 0;
        }
        super.onMeasure(i10, org.telegram.ui.b.B(56.0f, i12, 1073741824));
    }

    public void setBackButton(boolean z10) {
        float f9;
        this.f44181q0 = z10;
        if (!this.P && !this.S) {
            if (z10) {
                f9 = 0.0f;
            } else {
                f9 = 1.0f;
            }
            this.I.c(f9, true);
        }
    }

    public void setBackButtonCached(boolean z10) {
        this.f44181q0 = z10;
    }

    public void setHasForward(boolean z10) {
        this.f44175k0 = z10;
    }

    public void setHeight(int i10) {
        if (this.B != i10) {
            this.B = i10;
            float pow = (float) Math.pow(i10 / AndroidUtilities.dp(56.0f), 0.5d);
            this.C = pow;
            y3 y3Var = this.D;
            y3Var.setScaleX(pow);
            y3Var.setScaleY(this.C);
            y3Var.setTranslationX((1.0f - this.C) * AndroidUtilities.dp(42.0f));
            y3Var.setTranslationY((1.0f - this.C) * AndroidUtilities.dp(-12.0f));
            float f9 = this.C;
            y3 y3Var2 = this.E;
            y3Var2.setScaleX(f9);
            y3Var2.setScaleY(this.C);
            y3Var2.setTranslationX((1.0f - this.C) * (-AndroidUtilities.dp(42.0f)));
            y3Var2.setTranslationY((1.0f - this.C) * AndroidUtilities.dp(-12.0f));
            this.W.setTranslationY(this.B - AndroidUtilities.dp(56.0f));
            invalidate();
        }
    }

    public void setIsLocal(boolean z10) {
        this.m0 = z10;
    }

    public void setIsTonsite(boolean z10) {
        this.f44176l0 = z10;
    }

    public void setMenuColors(int i10) {
        double atan2;
        int i11;
        boolean z10 = false;
        double[] j10 = e5.j(e5.f22898a, e5.j(e5.f22900c, new double[]{Color.red(i10) / 255.0d, Color.green(i10) / 255.0d, Color.blue(i10) / 255.0d}));
        for (int i12 = 0; i12 < 3; i12++) {
            j10[i12] = Math.cbrt(j10[i12]);
        }
        double[] j11 = e5.j(e5.f22899b, j10);
        double d = j11[0];
        double d10 = j11[1];
        double d11 = j11[2];
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
        this.f44172h0 = i11;
        if (!z10) {
            i13 = -16777216;
        }
        this.f44173i0 = i13;
        this.f44174j0 = g6.l1(0.6f, i13);
    }

    public void setMenuListener(Utilities.Callback<Integer> callback) {
        this.f44163b0 = callback;
    }

    public void setMenuType(int i10) {
        if (this.f44165c0 != i10) {
            this.f44165c0 = i10;
        }
    }

    public void setProgress(float f9) {
        this.d[0] = f9;
        invalidate();
    }

    public void setTransitionProgress(float f9) {
        this.f44164c = f9;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return true;
    }

    public void setIsLoaded(boolean z10) {
    }
}
