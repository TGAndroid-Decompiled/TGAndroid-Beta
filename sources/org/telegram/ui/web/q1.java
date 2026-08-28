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
import g7.e6;
import gh.fb;
import kh.g4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ll;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.v70;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.y5;
import org.telegram.ui.ai1;
import org.telegram.ui.l4;
import org.telegram.ui.lj0;
import org.telegram.ui.n60;
import org.telegram.ui.p3;
import org.telegram.ui.s10;
import org.telegram.ui.y3;
public abstract class q1 extends FrameLayout {
    public final TextPaint A;
    public int B;
    public float C;
    public final gh.m D;
    public final gh.m E;
    public final ImageView F;
    public final org.telegram.ui.Cells.z G;
    public final ImageView H;
    public final org.telegram.ui.ActionBar.h2 I;
    public final org.telegram.ui.Cells.z J;
    public final ImageView K;
    public final o1 L;
    public final org.telegram.ui.Cells.z M;
    public final ImageView N;
    public final org.telegram.ui.Cells.z O;
    public boolean P;
    public float Q;
    public final gh.o R;
    public boolean S;
    public float T;
    public final gh.o U;
    public int V;
    public final v70 W;
    public final RectF f43970a;
    public boolean f43971a0;
    public final p1[] f43972b;
    public Utilities.Callback f43973b0;
    public float f43974c;
    public int f43975c0;
    public final float[] d;
    public int f43976d0;
    public final boolean[] f43977e;
    public int f43978e0;
    public final Paint[] f43979f;
    public int f43980f0;
    public ValueAnimator f43981g0;
    public final Paint[] h;
    public int f43982h0;
    public int f43983i0;
    public int f43984j0;
    public boolean f43985k0;
    public boolean f43986l0;
    public boolean m0;
    public final Paint[] f43987n;
    public final s10 f43988n0;
    public boolean f43989o0;
    public ValueAnimator f43990p0;
    public boolean f43991q0;
    public final Paint f43992r;
    public fh.f1 f43993r0;
    public final Paint f43994s;
    public ValueAnimator f43995s0;
    public float f43996t0;
    public long f43997u0;
    public final Paint v;
    public final l1 f43998v0;
    public int f43999w;
    public boolean f44000w0;
    public int f44001x;
    public int f44002y;

    public q1(Context context) {
        super(context);
        this.f43970a = new RectF();
        this.f43972b = new p1[2];
        this.f43974c = 0.0f;
        this.d = new float[2];
        this.f43977e = new boolean[3];
        this.f43979f = new Paint[2];
        this.h = new Paint[2];
        this.f43987n = new Paint[2];
        this.f43992r = new Paint(1);
        this.f43994s = new Paint(1);
        this.v = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.A = textPaint;
        this.B = AndroidUtilities.dp(56.0f);
        this.C = 1.0f;
        this.Q = 0.0f;
        this.T = 0.0f;
        this.f43975c0 = -1;
        this.f43988n0 = new s10();
        final org.telegram.ui.n0 n0Var = (org.telegram.ui.n0) this;
        this.f43998v0 = new l1(n0Var, 0);
        this.f44000w0 = false;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(18.33f));
        for (int i9 = 0; i9 < 2; i9++) {
            this.f43979f[i9] = new Paint(1);
            this.h[i9] = new Paint(1);
            this.f43987n[i9] = new Paint(1);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, e6.e(-1, 56, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        addView(frameLayout2, e6.e(-1, 56, 87));
        gh.m mVar = new gh.m(context, 8);
        this.D = mVar;
        mVar.setOrientation(0);
        addView(mVar, e6.e(-2, 56, 83));
        ImageView imageView = new ImageView(context);
        this.H = imageView;
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(false);
        this.I = h2Var;
        h2Var.f23455k = 200.0f;
        h2Var.c(1.0f, false);
        imageView.setImageDrawable(h2Var);
        org.telegram.ui.Cells.z f02 = f6.f0(1090519039, 1, -1);
        this.J = f02;
        imageView.setBackground(f02);
        mVar.addView(imageView, e6.n(54, 56));
        gh.m mVar2 = new gh.m(context, 9);
        this.E = mVar2;
        mVar2.setOrientation(0);
        addView(mVar2, e6.e(-2, 56, 85));
        ImageView imageView2 = new ImageView(context);
        this.K = imageView2;
        imageView2.setScaleType(scaleType);
        o1 o1Var = new o1(n0Var);
        this.L = o1Var;
        imageView2.setImageDrawable(o1Var);
        o1Var.f();
        org.telegram.ui.Cells.z f03 = f6.f0(1090519039, 1, -1);
        this.M = f03;
        imageView2.setBackground(f03);
        mVar2.addView(imageView2, e6.n(54, 56));
        ImageView imageView3 = new ImageView(context);
        this.N = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.ic_ab_other);
        imageView3.setColorFilter(new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_IN));
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                float f10;
                View childAt;
                Utilities.Callback callback;
                switch (r2) {
                    case 0:
                        boolean z10 = true;
                        org.telegram.ui.n0 n0Var2 = n0Var;
                        if (n0Var2.getParent() instanceof ViewGroup) {
                            dg.o oVar = new dg.o(n0Var2, 4);
                            Utilities.Callback callback2 = null;
                            x60 F = x60.F((ViewGroup) n0Var2.getParent(), null, n0Var2.N);
                            F.f34580s = 0;
                            F.S(n0Var2.f43983i0, n0Var2.f43984j0);
                            F.a0(0.0f, -AndroidUtilities.dp(52.0f));
                            F.S = 200;
                            int v = f6.v(n0Var2.f43982h0, f6.l1(0.1f, n0Var2.f43983i0));
                            F.f34569l0 = Integer.valueOf(v);
                            int i10 = 0;
                            while (i10 < F.A.getChildCount()) {
                                if (i10 == F.A.getChildCount() - 1) {
                                    childAt = F.D;
                                } else {
                                    childAt = F.A.getChildAt(i10);
                                }
                                if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                                    int i11 = 0;
                                    while (i11 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
                                        View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.H.getChildAt(i11);
                                        Utilities.Callback callback3 = callback2;
                                        if (childAt2 instanceof org.telegram.ui.ActionBar.g1) {
                                            ((org.telegram.ui.ActionBar.g1) childAt2).setSelectorColor(v);
                                        }
                                        i11++;
                                        callback2 = callback3;
                                    }
                                    callback = callback2;
                                } else {
                                    callback = callback2;
                                    if (childAt instanceof org.telegram.ui.ActionBar.g1) {
                                        ((org.telegram.ui.ActionBar.g1) childAt).setSelectorColor(v);
                                    }
                                }
                                i10++;
                                callback2 = callback;
                            }
                            Utilities.Callback callback4 = callback2;
                            if (AndroidUtilities.computePerceivedBrightness(n0Var2.f43982h0) > 0.721f) {
                                F.P(-1);
                                F.T(-986896);
                            } else {
                                F.P(-14737633);
                                F.T(-15592942);
                            }
                            int i12 = n0Var2.f43975c0;
                            if (i12 == 0) {
                                F.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) oVar.run(3), false);
                                F.c(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) oVar.run(1), false);
                                F.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) oVar.run(2), !n0Var2.m0);
                                F.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) oVar.run(4), false);
                            } else if (i12 == 1) {
                                if (!n0Var2.f43986l0) {
                                    F.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) oVar.run(3), false);
                                    F.k();
                                }
                                if (n0Var2.f43985k0) {
                                    F.c(R.drawable.msg_arrow_forward, LocaleController.getString(R.string.WebForward), (Runnable) oVar.run(9), false);
                                }
                                b2 instantViewLoader = n0Var2.getInstantViewLoader();
                                if (instantViewLoader != null && (((!instantViewLoader.f43812g || !instantViewLoader.f43813i) && instantViewLoader.h == null && instantViewLoader.f43814j == null && !instantViewLoader.f43809c) || instantViewLoader.b() != null)) {
                                    F.c(R.drawable.menu_instant_view, LocaleController.getString(R.string.OpenLocalInstantView), (Runnable) oVar.run(10), false);
                                    org.telegram.ui.ActionBar.g1 y10 = F.y();
                                    if (instantViewLoader.b() == null) {
                                        z10 = false;
                                    }
                                    y10.setEnabled(z10);
                                    if (y10.isEnabled()) {
                                        f10 = 1.0f;
                                    } else {
                                        f10 = 0.5f;
                                    }
                                    y10.setAlpha(f10);
                                    ai1 ai1Var = new ai1(6, y10, instantViewLoader);
                                    instantViewLoader.f43817m.add(ai1Var);
                                    F.f34575p = new ai1(10, instantViewLoader, ai1Var);
                                }
                                F.c(R.drawable.msg_reset, LocaleController.getString(R.string.Refresh), (Runnable) oVar.run(5), false);
                                F.c(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) oVar.run(1), false);
                                F.c(R.drawable.msg_saved, LocaleController.getString(R.string.WebBookmark), (Runnable) oVar.run(6), false);
                                F.c(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) oVar.run(2), false);
                                F.k();
                                if (!a1.a(callback4).isEmpty()) {
                                    F.c(R.drawable.menu_views_recent, LocaleController.getString(R.string.WebHistory), (Runnable) oVar.run(8), false);
                                }
                                F.c(R.drawable.menu_browser_bookmarks, LocaleController.getString(R.string.WebBookmarks), (Runnable) oVar.run(7), false);
                                F.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) oVar.run(4), false);
                            }
                            F.f34575p = new lj0(n0Var2);
                            F.Z();
                            return;
                        }
                        return;
                    default:
                        n0Var.R.setText("");
                        return;
                }
            }
        });
        org.telegram.ui.Cells.z f04 = f6.f0(1090519039, 1, -1);
        this.O = f04;
        imageView3.setBackground(f04);
        imageView3.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
        mVar2.addView(imageView3, e6.n(54, 56));
        gh.o oVar = new gh.o(context, 4);
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
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (keyEvent != null) {
                            if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                                AndroidUtilities.hideKeyboard(n0Var.R);
                                return false;
                            }
                            return false;
                        }
                        return false;
                    default:
                        if (i10 == 2) {
                            org.telegram.ui.n0 n0Var2 = n0Var;
                            fh.f1 f1Var = n0Var2.f43993r0;
                            if (f1Var != null) {
                                f1Var.run(n0Var2.U.getText().toString());
                            }
                            n0Var2.k(false);
                        }
                        return false;
                }
            }
        });
        oVar.addTextChangedListener(new bh.f(n0Var, 16));
        frameLayout.addView(oVar, e6.e(-1, -1, 119));
        gh.o oVar2 = new gh.o(context, 5);
        this.U = oVar2;
        oVar2.setVisibility(8);
        oVar2.setAlpha(0.0f);
        oVar2.setTextSize(1, 15.66f);
        oVar2.setSingleLine(true);
        this.V = SharedConfig.searchEngineType;
        oVar2.setHint(LocaleController.formatString(R.string.AddressPlaceholder, j1.a().f43902a));
        oVar2.setBackgroundResource(0);
        oVar2.setCursorWidth(1.5f);
        oVar2.setGravity(112);
        oVar2.setInputType(oVar2.getInputType() | 524288);
        oVar2.setImeOptions(33554434);
        oVar2.setTextIsSelectable(false);
        oVar2.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (keyEvent != null) {
                            if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                                AndroidUtilities.hideKeyboard(n0Var.R);
                                return false;
                            }
                            return false;
                        }
                        return false;
                    default:
                        if (i10 == 2) {
                            org.telegram.ui.n0 n0Var2 = n0Var;
                            fh.f1 f1Var = n0Var2.f43993r0;
                            if (f1Var != null) {
                                f1Var.run(n0Var2.U.getText().toString());
                            }
                            n0Var2.k(false);
                        }
                        return false;
                }
            }
        });
        frameLayout2.addView(oVar2, e6.d(-1, -1.0f, 119, 48.0f, 0.0f, 12.0f, 0.0f));
        ImageView imageView4 = new ImageView(context);
        this.F = imageView4;
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(R.drawable.ic_close_white);
        org.telegram.ui.Cells.z f05 = f6.f0(1090519039, 1, -1);
        this.G = f05;
        imageView4.setBackground(f05);
        imageView4.setVisibility(8);
        imageView4.setAlpha(0.0f);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                float f10;
                View childAt;
                Utilities.Callback callback;
                switch (r2) {
                    case 0:
                        boolean z10 = true;
                        org.telegram.ui.n0 n0Var2 = n0Var;
                        if (n0Var2.getParent() instanceof ViewGroup) {
                            dg.o oVar3 = new dg.o(n0Var2, 4);
                            Utilities.Callback callback2 = null;
                            x60 F = x60.F((ViewGroup) n0Var2.getParent(), null, n0Var2.N);
                            F.f34580s = 0;
                            F.S(n0Var2.f43983i0, n0Var2.f43984j0);
                            F.a0(0.0f, -AndroidUtilities.dp(52.0f));
                            F.S = 200;
                            int v = f6.v(n0Var2.f43982h0, f6.l1(0.1f, n0Var2.f43983i0));
                            F.f34569l0 = Integer.valueOf(v);
                            int i10 = 0;
                            while (i10 < F.A.getChildCount()) {
                                if (i10 == F.A.getChildCount() - 1) {
                                    childAt = F.D;
                                } else {
                                    childAt = F.A.getChildAt(i10);
                                }
                                if (childAt instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) childAt;
                                    int i11 = 0;
                                    while (i11 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
                                        View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.H.getChildAt(i11);
                                        Utilities.Callback callback3 = callback2;
                                        if (childAt2 instanceof org.telegram.ui.ActionBar.g1) {
                                            ((org.telegram.ui.ActionBar.g1) childAt2).setSelectorColor(v);
                                        }
                                        i11++;
                                        callback2 = callback3;
                                    }
                                    callback = callback2;
                                } else {
                                    callback = callback2;
                                    if (childAt instanceof org.telegram.ui.ActionBar.g1) {
                                        ((org.telegram.ui.ActionBar.g1) childAt).setSelectorColor(v);
                                    }
                                }
                                i10++;
                                callback2 = callback;
                            }
                            Utilities.Callback callback4 = callback2;
                            if (AndroidUtilities.computePerceivedBrightness(n0Var2.f43982h0) > 0.721f) {
                                F.P(-1);
                                F.T(-986896);
                            } else {
                                F.P(-14737633);
                                F.T(-15592942);
                            }
                            int i12 = n0Var2.f43975c0;
                            if (i12 == 0) {
                                F.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) oVar3.run(3), false);
                                F.c(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) oVar3.run(1), false);
                                F.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) oVar3.run(2), !n0Var2.m0);
                                F.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) oVar3.run(4), false);
                            } else if (i12 == 1) {
                                if (!n0Var2.f43986l0) {
                                    F.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) oVar3.run(3), false);
                                    F.k();
                                }
                                if (n0Var2.f43985k0) {
                                    F.c(R.drawable.msg_arrow_forward, LocaleController.getString(R.string.WebForward), (Runnable) oVar3.run(9), false);
                                }
                                b2 instantViewLoader = n0Var2.getInstantViewLoader();
                                if (instantViewLoader != null && (((!instantViewLoader.f43812g || !instantViewLoader.f43813i) && instantViewLoader.h == null && instantViewLoader.f43814j == null && !instantViewLoader.f43809c) || instantViewLoader.b() != null)) {
                                    F.c(R.drawable.menu_instant_view, LocaleController.getString(R.string.OpenLocalInstantView), (Runnable) oVar3.run(10), false);
                                    org.telegram.ui.ActionBar.g1 y10 = F.y();
                                    if (instantViewLoader.b() == null) {
                                        z10 = false;
                                    }
                                    y10.setEnabled(z10);
                                    if (y10.isEnabled()) {
                                        f10 = 1.0f;
                                    } else {
                                        f10 = 0.5f;
                                    }
                                    y10.setAlpha(f10);
                                    ai1 ai1Var = new ai1(6, y10, instantViewLoader);
                                    instantViewLoader.f43817m.add(ai1Var);
                                    F.f34575p = new ai1(10, instantViewLoader, ai1Var);
                                }
                                F.c(R.drawable.msg_reset, LocaleController.getString(R.string.Refresh), (Runnable) oVar3.run(5), false);
                                F.c(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) oVar3.run(1), false);
                                F.c(R.drawable.msg_saved, LocaleController.getString(R.string.WebBookmark), (Runnable) oVar3.run(6), false);
                                F.c(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) oVar3.run(2), false);
                                F.k();
                                if (!a1.a(callback4).isEmpty()) {
                                    F.c(R.drawable.menu_views_recent, LocaleController.getString(R.string.WebHistory), (Runnable) oVar3.run(8), false);
                                }
                                F.c(R.drawable.menu_browser_bookmarks, LocaleController.getString(R.string.WebBookmarks), (Runnable) oVar3.run(7), false);
                                F.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) oVar3.run(4), false);
                            }
                            F.f34575p = new lj0(n0Var2);
                            F.Z();
                            return;
                        }
                        return;
                    default:
                        n0Var.R.setText("");
                        return;
                }
            }
        });
        addView(imageView4, e6.e(54, 56, 85));
        v70 v70Var = new v70(context);
        this.W = v70Var;
        v70Var.setPivotX(0.0f);
        v70Var.setPivotY(AndroidUtilities.dp(2.0f));
        addView(v70Var, e6.e(-1, 2, 87));
        setWillNotDraw(false);
        this.f43972b[0] = new p1(n0Var);
        this.f43972b[1] = new p1(n0Var);
        int i10 = f6.Pk;
        d(f6.w0(null, i10, false), false);
        setMenuColors(f6.w0(null, i10, false));
    }

    public final void a(Canvas canvas, float f10, float f11, boolean z10) {
        float f12;
        float max = Math.max(AndroidUtilities.dp(0.66f), 1);
        float f13 = f10 - max;
        float width = getWidth() * this.f43974c;
        RectF rectF = this.f43970a;
        rectF.set(0.0f, 0.0f, getWidth(), f10);
        Paint[] paintArr = this.f43979f;
        int alpha = paintArr[1].getAlpha();
        paintArr[1].setAlpha((int) (alpha * 1.0f));
        canvas.drawRect(rectF, paintArr[1]);
        paintArr[1].setAlpha(alpha);
        float f14 = this.f43974c;
        float[] fArr = this.d;
        Paint[] paintArr2 = this.f43987n;
        Paint[] paintArr3 = this.h;
        if (f14 > 0.0f) {
            rectF.set(0.0f, 0.0f, fArr[1] * getWidth(), f10);
            int alpha2 = paintArr3[1].getAlpha();
            f12 = 1.0f;
            paintArr3[1].setAlpha((int) ((1.0f - this.T) * (1.0f - this.Q) * alpha2 * 1.0f));
            canvas.drawRect(rectF, paintArr3[1]);
            paintArr3[1].setAlpha(alpha2);
            if (z10) {
                rectF.set(0.0f, f13, width, f13 + max);
                int alpha3 = paintArr2[1].getAlpha();
                paintArr2[1].setAlpha((int) ((1.0f - this.T) * alpha3 * 1.0f * f11));
                canvas.drawRect(rectF, paintArr2[1]);
                paintArr2[1].setAlpha(alpha3);
            }
        } else {
            f12 = 1.0f;
        }
        float f15 = this.f43974c;
        if (f15 < f12) {
            int l1 = f6.l1((f12 - f15) * f12, 1610612736);
            Paint paint = this.f43992r;
            paint.setColor(l1);
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
        paintArr3[0].setAlpha((int) ((f12 - this.T) * (f12 - this.Q) * (f12 - Utilities.clamp01(this.f43974c * 4.0f)) * alpha5 * f12));
        canvas.drawRect(rectF, paintArr3[0]);
        paintArr3[0].setAlpha(alpha5);
        if (z10) {
            rectF.set(width, f13, getWidth() + width, max + f13);
            int alpha6 = paintArr2[0].getAlpha();
            paintArr2[0].setAlpha((int) ((f12 - this.T) * alpha6 * f12 * f11));
            canvas.drawRect(rectF, paintArr2[0]);
            paintArr2[0].setAlpha(alpha6);
        }
    }

    public final void b(int i9, int i10) {
        float f10;
        boolean[] zArr = this.f43977e;
        boolean z10 = zArr[i9];
        Paint[] paintArr = this.f43979f;
        if (z10 && paintArr[i9].getColor() == i10) {
            return;
        }
        zArr[i9] = true;
        paintArr[i9].setColor(i10);
        if (AndroidUtilities.computePerceivedBrightness(i10) <= 0.721f) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        int d = i0.a.d(f10, -16777216, -1);
        this.h[i9].setColor(f6.v(i10, f6.l1(AndroidUtilities.lerp(0.07f, 0.2f, f10), d)));
        this.f43987n[i9].setColor(f6.v(i10, f6.l1(AndroidUtilities.lerp(0.14f, 0.24f, f10), d)));
        p1[] p1VarArr = this.f43972b;
        p1VarArr[i9].f43959a.r(d);
        p1VarArr[i9].d = f6.v(i10, f6.l1(0.6f, d));
        p1 p1Var = p1VarArr[i9];
        p1Var.f43960b.r(i0.a.d(p1VarArr[i9].f43961c.f34854c, p1Var.d, f6.w0(null, f6.f23230q7, false)));
        invalidate();
    }

    public final void c(final int i9, float f10, boolean z10) {
        final float f11;
        boolean[] zArr = this.f43977e;
        if (zArr[2] && this.f43978e0 == i9) {
            return;
        }
        final float f12 = 1.0f;
        if (!z10) {
            zArr[2] = true;
            if (f10 < 0.0f) {
                if (AndroidUtilities.computePerceivedBrightness(i9) <= 0.721f) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
            }
            int d = i0.a.d(f10, -16777216, -1);
            this.f43999w = d;
            f6.l1(0.55f, d);
            this.f43978e0 = i9;
            this.f44001x = i0.a.d(f10, -1, -16777216);
            int d9 = i0.a.d(1.0f - f10, -1, -16777216);
            this.f44002y = d9;
            int i10 = this.f44001x;
            l4 l4Var = ((org.telegram.ui.n0) this).f40563x0;
            k kVar = l4Var.f40015e0;
            if (kVar != null) {
                kVar.c(i10, d9);
            }
            this.f43994s.setColor(this.f44001x);
            this.v.setColor(f6.v(this.f44001x, f6.l1(AndroidUtilities.lerp(0.07f, 0.2f, f10), this.f43999w)));
            int l1 = f6.l1(0.6f, this.f44002y);
            gh.o oVar = this.U;
            oVar.setHintTextColor(l1);
            oVar.setTextColor(this.f44002y);
            oVar.setCursorColor(this.f44002y);
            oVar.setHandlesColor(this.f44002y);
            this.W.setProgressColor(f6.w0(null, f6.Rk, false));
            int d10 = i0.a.d(this.T, this.f43999w, this.f44002y);
            org.telegram.ui.ActionBar.h2 h2Var = this.I;
            h2Var.a(d10);
            h2Var.b(i0.a.d(this.T, this.f43999w, this.f44002y));
            int i11 = this.f43999w;
            o1 o1Var = this.L;
            o1Var.f24745c.setColor(i11);
            o1Var.invalidateSelf();
            int i12 = this.f43999w;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            this.N.setColorFilter(new PorterDuffColorFilter(i12, mode));
            this.K.setColorFilter(new PorterDuffColorFilter(this.f43999w, mode));
            this.F.setColorFilter(new PorterDuffColorFilter(this.f43999w, mode));
            int v = f6.v(i9, f6.l1(0.22f, this.f43999w));
            this.f43980f0 = v;
            f6.B1(this.J, v, true);
            f6.B1(this.M, this.f43980f0, true);
            f6.B1(this.O, this.f43980f0, true);
            f6.B1(this.G, this.f43980f0, true);
            int l12 = f6.l1(0.6f, this.f43999w);
            gh.o oVar2 = this.R;
            oVar2.setHintTextColor(l12);
            oVar2.setTextColor(this.f43999w);
            oVar2.setCursorColor(this.f43999w);
            oVar2.setHandlesColor(this.f43999w);
            y3 y3Var = l4Var.G;
            if (y3Var != null) {
                y3Var.i();
            }
            invalidate();
            return;
        }
        ValueAnimator valueAnimator = this.f43981g0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i13 = this.f43978e0;
        this.f43976d0 = i13;
        if (AndroidUtilities.computePerceivedBrightness(i13) <= 0.721f) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        if (AndroidUtilities.computePerceivedBrightness(i9) > 0.721f) {
            f12 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f43981g0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                q1 q1Var = q1.this;
                q1Var.getClass();
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                q1Var.c(i0.a.d(floatValue, q1Var.f43976d0, i9), AndroidUtilities.lerp(f11, f12, floatValue), false);
            }
        });
        this.f43981g0.addListener(new fb(this, i9, f12, 2));
        this.f43981g0.start();
    }

    public final void d(int i9, boolean z10) {
        c(i9, -1.0f, z10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i9;
        int i10;
        int i11;
        int i12 = 0;
        if (this.f43971a0) {
            i9 = AndroidUtilities.statusBarHeight;
        } else {
            i9 = 0;
        }
        a(canvas, i9 + this.B, 1.0f, this.f43989o0);
        float right = this.D.getRight();
        float left = this.E.getLeft();
        boolean z10 = this.f43971a0;
        if (z10) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        float f10 = i10;
        if (z10) {
            i11 = AndroidUtilities.statusBarHeight;
        } else {
            i11 = 0;
        }
        float f11 = i11 + this.B;
        float f12 = this.f43974c;
        p1[] p1VarArr = this.f43972b;
        if (f12 < 1.0f) {
            canvas.save();
            float width = (getWidth() * this.f43974c) - (Utilities.clamp01(this.f43974c * 2.0f) * AndroidUtilities.dp(30.0f));
            canvas.translate(right + width, f10);
            AndroidUtilities.lerp(1.0f, 0.5f, this.f43974c);
            p1VarArr[0].a(canvas, (left - right) - width, f11 - f10, (1.0f - this.Q) * (1.0f - this.f43974c));
            canvas.restore();
        }
        if (this.f43974c > 0.0f) {
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getWidth() * this.f43974c, getHeight());
            canvas.translate(right, f10);
            canvas.translate((1.0f - this.f43974c) * AndroidUtilities.dp(-12.0f), 0.0f);
            float lerp = AndroidUtilities.lerp(1.0f, 0.5f, 1.0f - this.f43974c);
            float f13 = f11 - f10;
            canvas.scale(lerp, lerp, 0.0f, f13 / 2.0f);
            p1VarArr[1].a(canvas, left - right, f13, (1.0f - this.T) * (1.0f - this.Q) * this.f43974c);
            canvas.restore();
        }
        float f14 = this.T;
        RectF rectF = this.f43970a;
        if (f14 > 0.0f) {
            Paint paint = this.f43994s;
            int alpha = paint.getAlpha();
            paint.setAlpha((int) (alpha * this.T));
            float width2 = getWidth();
            if (this.f43971a0) {
                i12 = AndroidUtilities.statusBarHeight;
            }
            canvas.drawRect(0.0f, 0.0f, width2, i12 + this.B, paint);
            paint.setAlpha(alpha);
            float f15 = (f10 + f11) / 2.0f;
            float dp = AndroidUtilities.dp(42.0f) / 2.0f;
            rectF.set(AndroidUtilities.dp(6.0f), f15 - dp, AndroidUtilities.lerp(left, getWidth() - AndroidUtilities.dp(6.0f), this.T), f15 + dp);
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
        v0 webView;
        int action = motionEvent.getAction();
        l1 l1Var = this.f43998v0;
        if (action == 0) {
            this.f44000w0 = false;
            AndroidUtilities.cancelRunOnUIThread(l1Var);
            if (motionEvent.getX() > this.D.getRight() && motionEvent.getX() < this.E.getLeft() && !this.P && !this.S) {
                this.f43996t0 = motionEvent.getX();
                motionEvent.getY();
                this.f43997u0 = System.currentTimeMillis();
                AndroidUtilities.runOnUIThread(l1Var, ViewConfiguration.getLongPressTimeout() * 0.8f);
            }
        } else if (motionEvent.getAction() == 2 && ((float) (System.currentTimeMillis() - this.f43997u0)) > ViewConfiguration.getLongPressTimeout() * 0.8f) {
            AndroidUtilities.cancelRunOnUIThread(l1Var);
            this.f44000w0 = true;
            p3 p3Var = ((org.telegram.ui.n0) this).f40563x0.f40026q0[0];
            float clamp01 = Utilities.clamp01(p3Var.getProgress() + ((motionEvent.getX() - this.f43996t0) / (getWidth() * 0.8f)));
            if (!p3Var.c() && p3Var.f() && (webView = p3Var.f41323f.getWebView()) != null) {
                webView.setScrollProgress(clamp01);
                p3Var.G.f0();
            }
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(l1Var);
            this.f43997u0 = 0L;
        }
        this.f43996t0 = motionEvent.getX();
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(int i9, boolean z10) {
        float f10;
        p1 p1Var = this.f43972b[i9];
        if (p1Var.f43962e != z10) {
            p1Var.f43962e = z10;
            y5 y5Var = p1Var.f43961c;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            y5Var.d(f10, true);
            invalidate();
        }
    }

    public final void f(int i9, String str) {
        p1[] p1VarArr = this.f43972b;
        CharSequence charSequence = p1VarArr[i9].f43960b.f29337g;
        if (charSequence != null && TextUtils.equals(charSequence.toString(), str)) {
            return;
        }
        p1VarArr[i9].f43960b.q(Emoji.replaceEmoji(str, p1VarArr[i9].f43960b.f29332a.getFontMetricsInt(), false), false, true);
    }

    public final void g(int i9, String str, boolean z10) {
        p1[] p1VarArr = this.f43972b;
        CharSequence charSequence = p1VarArr[i9].f43959a.f29337g;
        if (charSequence != null && TextUtils.equals(charSequence.toString(), str)) {
            return;
        }
        p1VarArr[i9].f43959a.q(Emoji.replaceEmoji(str, p1VarArr[i9].f43959a.f29332a.getFontMetricsInt(), false), z10, true);
    }

    public int getBackgroundColor() {
        return this.f43978e0;
    }

    public b2 getInstantViewLoader() {
        return null;
    }

    public int getTextColor() {
        return this.f43999w;
    }

    public String getTitle() {
        CharSequence charSequence = this.f43972b[0].f43959a.f29337g;
        if (charSequence == null) {
            return "";
        }
        return charSequence.toString();
    }

    public final void h(boolean z10) {
        float f10;
        if (this.P == z10) {
            return;
        }
        ValueAnimator valueAnimator = this.f43990p0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.P = z10;
        gh.o oVar = this.R;
        boolean z11 = false;
        oVar.setVisibility(0);
        float f11 = 0.0f;
        if (!this.f43991q0 && !z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.I.c(f10, true);
        float f12 = this.Q;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
        this.f43990p0 = ofFloat;
        ofFloat.addUpdateListener(new g4(this, 13));
        this.f43990p0.addListener(new n60(12, this, z10));
        this.f43990p0.setInterpolator(gr.h);
        this.f43990p0.setDuration(320L);
        this.f43990p0.start();
        boolean z12 = !z10;
        AndroidUtilities.updateViewShow(this.K, z12, true, true);
        AndroidUtilities.updateViewShow(this.N, z12, true, true);
        if (oVar.length() > 0 && this.P) {
            z11 = true;
        }
        AndroidUtilities.updateViewShow(this.F, z11, true, true);
    }

    public final void i() {
        p1[] p1VarArr = this.f43972b;
        p1 p1Var = p1VarArr[0];
        p1VarArr[0] = p1VarArr[1];
        p1VarArr[1] = p1Var;
        float[] fArr = this.d;
        float f10 = fArr[0];
        fArr[0] = fArr[1];
        fArr[1] = f10;
        Paint[] paintArr = this.f43979f;
        int color = paintArr[0].getColor();
        b(0, paintArr[1].getColor());
        b(1, color);
        invalidate();
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
    }

    @Override
    public void onMeasure(int i9, int i10) {
        int i11;
        if (this.f43971a0) {
            i11 = AndroidUtilities.statusBarHeight;
        } else {
            i11 = 0;
        }
        super.onMeasure(i9, ll.C(56.0f, i11, 1073741824));
    }

    public void setBackButton(boolean z10) {
        float f10;
        this.f43991q0 = z10;
        if (!this.P && !this.S) {
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            this.I.c(f10, true);
        }
    }

    public void setBackButtonCached(boolean z10) {
        this.f43991q0 = z10;
    }

    public void setHasForward(boolean z10) {
        this.f43985k0 = z10;
    }

    public void setHeight(int i9) {
        if (this.B != i9) {
            this.B = i9;
            float pow = (float) Math.pow(i9 / AndroidUtilities.dp(56.0f), 0.5d);
            this.C = pow;
            gh.m mVar = this.D;
            mVar.setScaleX(pow);
            mVar.setScaleY(this.C);
            mVar.setTranslationX((1.0f - this.C) * AndroidUtilities.dp(42.0f));
            mVar.setTranslationY((1.0f - this.C) * AndroidUtilities.dp(-12.0f));
            float f10 = this.C;
            gh.m mVar2 = this.E;
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
        this.f43986l0 = z10;
    }

    public void setMenuColors(int i9) {
        double atan2;
        int i10;
        boolean z10 = false;
        double[] j10 = e5.j(e5.f22902a, e5.j(e5.f22904c, new double[]{Color.red(i9) / 255.0d, Color.green(i9) / 255.0d, Color.blue(i9) / 255.0d}));
        for (int i11 = 0; i11 < 3; i11++) {
            j10[i11] = Math.cbrt(j10[i11]);
        }
        double[] j11 = e5.j(e5.f22903b, j10);
        double d = j11[0];
        double d9 = j11[1];
        double d10 = j11[2];
        double sqrt = Math.sqrt(Math.pow(d10, 2.0d) + Math.pow(d9, 2.0d));
        if (Math.abs(d9) < 2.0E-4d && Math.abs(d10) < 2.0E-4d) {
            atan2 = Double.NaN;
        } else {
            atan2 = ((((Math.atan2(d10, d9) * 180.0d) / 3.141592653589793d) % 360.0d) + 360.0d) % 360.0d;
        }
        if (new double[]{d, sqrt, atan2}[0] < 0.5d) {
            z10 = true;
        }
        int i12 = -1;
        if (z10) {
            i10 = -16777216;
        } else {
            i10 = -1;
        }
        this.f43982h0 = i10;
        if (!z10) {
            i12 = -16777216;
        }
        this.f43983i0 = i12;
        this.f43984j0 = f6.l1(0.6f, i12);
    }

    public void setMenuListener(Utilities.Callback<Integer> callback) {
        this.f43973b0 = callback;
    }

    public void setMenuType(int i9) {
        if (this.f43975c0 != i9) {
            this.f43975c0 = i9;
        }
    }

    public void setProgress(float f10) {
        this.d[0] = f10;
        invalidate();
    }

    public void setTransitionProgress(float f10) {
        this.f43974c = f10;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return true;
    }

    public void setIsLoaded(boolean z10) {
    }
}
