package org.telegram.ui.web;

import ai.ge;
import ai.ic;
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
import org.telegram.messenger.wh;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.g5;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.j3;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Wallet.t3;
import org.telegram.ui.ff0;
import org.telegram.ui.l4;
import org.telegram.ui.n40;
import org.telegram.ui.o3;
import org.telegram.ui.u10;
import org.telegram.ui.x3;
import w7.z5;
public abstract class t1 extends FrameLayout {
    public boolean A0;
    public final TextPaint E;
    public int F;
    public float G;
    public final ai.r H;
    public final ai.r I;
    public final ImageView J;
    public final org.telegram.ui.Cells.z K;
    public final ImageView L;
    public final org.telegram.ui.ActionBar.g2 M;
    public final org.telegram.ui.Cells.z N;
    public final ImageView O;
    public final r1 P;
    public final org.telegram.ui.Cells.z Q;
    public final ImageView R;
    public final org.telegram.ui.Cells.z S;
    public boolean T;
    public float U;
    public final ai.t V;
    public boolean W;
    public final RectF f42737a;
    public float f42738a0;
    public final s1[] f42739b;
    public final ai.t f42740b0;
    public float f42741c;
    public int f42742c0;
    public final float[] d;
    public final g90 f42743d0;
    public final boolean[] e;
    public boolean f42744e0;
    public final Paint[] f42745f;
    public Utilities.Callback f42746f0;
    public int f42747g0;
    public final Paint[] h;
    public int f42748h0;
    public int f42749i0;
    public int f42750j0;
    public ValueAnimator f42751k0;
    public int f42752l0;
    public int m0;
    public final Paint[] f42753n;
    public int f42754n0;
    public boolean f42755o0;
    public boolean f42756p0;
    public boolean f42757q0;
    public final Paint f42758r;
    public final u10 f42759r0;
    public final Paint f42760s;
    public boolean f42761s0;
    public ValueAnimator f42762t0;
    public boolean f42763u0;
    public final Paint v;
    public j3 f42764v0;
    public int f42765w;
    public ValueAnimator f42766w0;
    public int f42767x;
    public float f42768x0;
    public int f42769y;
    public long f42770y0;
    public final o1 f42771z0;

    public t1(Context context) {
        super(context);
        this.f42737a = new RectF();
        this.f42739b = new s1[2];
        this.f42741c = 0.0f;
        this.d = new float[2];
        this.e = new boolean[3];
        this.f42745f = new Paint[2];
        this.h = new Paint[2];
        this.f42753n = new Paint[2];
        this.f42758r = new Paint(1);
        this.f42760s = new Paint(1);
        this.v = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.E = textPaint;
        this.F = AndroidUtilities.dp(56.0f);
        this.G = 1.0f;
        this.U = 0.0f;
        this.f42738a0 = 0.0f;
        this.f42747g0 = -1;
        this.f42759r0 = new u10();
        final org.telegram.ui.n0 n0Var = (org.telegram.ui.n0) this;
        this.f42771z0 = new o1(n0Var, 0);
        this.A0 = false;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(18.33f));
        for (int i10 = 0; i10 < 2; i10++) {
            this.f42745f[i10] = new Paint(1);
            this.h[i10] = new Paint(1);
            this.f42753n[i10] = new Paint(1);
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
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
        this.M = g2Var;
        g2Var.f20864k = 200.0f;
        g2Var.c(1.0f, false);
        imageView.setImageDrawable(g2Var);
        org.telegram.ui.Cells.z g02 = h6.g0(1090519039, 1, -1);
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
        r1 r1Var = new r1(n0Var);
        this.P = r1Var;
        imageView2.setImageDrawable(r1Var);
        r1Var.f();
        org.telegram.ui.Cells.z g03 = h6.g0(1090519039, 1, -1);
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
                        org.telegram.ui.n0 n0Var2 = n0Var;
                        if (n0Var2.getParent() instanceof ViewGroup) {
                            ic icVar = new ic(n0Var2, 3);
                            Utilities.Callback callback2 = null;
                            i80 F = i80.F((ViewGroup) n0Var2.getParent(), null, n0Var2.R);
                            F.f27134s = 0;
                            F.S(n0Var2.m0, n0Var2.f42754n0);
                            F.a0(0.0f, -AndroidUtilities.dp(52.0f));
                            F.S = 200;
                            int v = h6.v(n0Var2.f42752l0, h6.m1(0.1f, n0Var2.m0));
                            F.f27123l0 = Integer.valueOf(v);
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
                            if (AndroidUtilities.computePerceivedBrightness(n0Var2.f42752l0) > 0.721f) {
                                F.P(-1);
                                F.T(-986896);
                            } else {
                                F.P(-14737633);
                                F.T(-15592942);
                            }
                            int i13 = n0Var2.f42747g0;
                            if (i13 == 0) {
                                F.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) icVar.run(3), false);
                                F.c(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) icVar.run(1), false);
                                F.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) icVar.run(2), !n0Var2.f42757q0);
                                F.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) icVar.run(4), false);
                            } else if (i13 == 1) {
                                if (!n0Var2.f42756p0) {
                                    F.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) icVar.run(3), false);
                                    F.k();
                                }
                                if (n0Var2.f42755o0) {
                                    F.c(R.drawable.msg_arrow_forward, LocaleController.getString(R.string.WebForward), (Runnable) icVar.run(9), false);
                                }
                                f2 instantViewLoader = n0Var2.getInstantViewLoader();
                                if (instantViewLoader != null && (((!instantViewLoader.f42594g || !instantViewLoader.f42595i) && instantViewLoader.h == null && instantViewLoader.f42596j == null && !instantViewLoader.f42592c) || instantViewLoader.b() != null)) {
                                    F.c(R.drawable.menu_instant_view, LocaleController.getString(R.string.OpenLocalInstantView), (Runnable) icVar.run(10), false);
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
                                    t3 t3Var = new t3(25, y3, instantViewLoader);
                                    instantViewLoader.f42599m.add(t3Var);
                                    F.f27129p = new t3(29, instantViewLoader, t3Var);
                                }
                                F.c(R.drawable.msg_reset, LocaleController.getString(R.string.Refresh), (Runnable) icVar.run(5), false);
                                F.c(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) icVar.run(1), false);
                                F.c(R.drawable.msg_saved, LocaleController.getString(R.string.WebBookmark), (Runnable) icVar.run(6), false);
                                F.c(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) icVar.run(2), false);
                                F.k();
                                if (!c1.a(callback4).isEmpty()) {
                                    F.c(R.drawable.menu_views_recent, LocaleController.getString(R.string.WebHistory), (Runnable) icVar.run(8), false);
                                }
                                F.c(R.drawable.menu_browser_bookmarks, LocaleController.getString(R.string.WebBookmarks), (Runnable) icVar.run(7), false);
                                F.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) icVar.run(4), false);
                            }
                            F.f27129p = new ff0(n0Var2);
                            F.Z();
                            return;
                        }
                        return;
                    default:
                        n0Var.V.setText("");
                        return;
                }
            }
        });
        org.telegram.ui.Cells.z g04 = h6.g0(1090519039, 1, -1);
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
                                AndroidUtilities.hideKeyboard(n0Var.V);
                                return false;
                            }
                            return false;
                        }
                        return false;
                    default:
                        if (i11 == 2) {
                            org.telegram.ui.n0 n0Var2 = n0Var;
                            j3 j3Var = n0Var2.f42764v0;
                            if (j3Var != null) {
                                j3Var.run(n0Var2.f42740b0.getText().toString());
                            }
                            n0Var2.k(false);
                        }
                        return false;
                }
            }
        });
        tVar.addTextChangedListener(new ai.u(n0Var, 19));
        frameLayout.addView(tVar, z5.e(-1, -1, 119));
        ai.t tVar2 = new ai.t(context, 5);
        this.f42740b0 = tVar2;
        tVar2.setVisibility(8);
        tVar2.setAlpha(0.0f);
        tVar2.setTextSize(1, 15.66f);
        tVar2.setSingleLine(true);
        this.f42742c0 = SharedConfig.searchEngineType;
        tVar2.setHint(LocaleController.formatString(R.string.AddressPlaceholder, m1.a().f42675a));
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
                                AndroidUtilities.hideKeyboard(n0Var.V);
                                return false;
                            }
                            return false;
                        }
                        return false;
                    default:
                        if (i11 == 2) {
                            org.telegram.ui.n0 n0Var2 = n0Var;
                            j3 j3Var = n0Var2.f42764v0;
                            if (j3Var != null) {
                                j3Var.run(n0Var2.f42740b0.getText().toString());
                            }
                            n0Var2.k(false);
                        }
                        return false;
                }
            }
        });
        frameLayout2.addView(tVar2, z5.a(-1.0f, 48.0f, 0.0f, 12.0f, 0.0f, -1, 119));
        ImageView imageView4 = new ImageView(context);
        this.J = imageView4;
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(R.drawable.ic_close_white);
        org.telegram.ui.Cells.z g05 = h6.g0(1090519039, 1, -1);
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
                        org.telegram.ui.n0 n0Var2 = n0Var;
                        if (n0Var2.getParent() instanceof ViewGroup) {
                            ic icVar = new ic(n0Var2, 3);
                            Utilities.Callback callback2 = null;
                            i80 F = i80.F((ViewGroup) n0Var2.getParent(), null, n0Var2.R);
                            F.f27134s = 0;
                            F.S(n0Var2.m0, n0Var2.f42754n0);
                            F.a0(0.0f, -AndroidUtilities.dp(52.0f));
                            F.S = 200;
                            int v = h6.v(n0Var2.f42752l0, h6.m1(0.1f, n0Var2.m0));
                            F.f27123l0 = Integer.valueOf(v);
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
                            if (AndroidUtilities.computePerceivedBrightness(n0Var2.f42752l0) > 0.721f) {
                                F.P(-1);
                                F.T(-986896);
                            } else {
                                F.P(-14737633);
                                F.T(-15592942);
                            }
                            int i13 = n0Var2.f42747g0;
                            if (i13 == 0) {
                                F.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) icVar.run(3), false);
                                F.c(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) icVar.run(1), false);
                                F.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) icVar.run(2), !n0Var2.f42757q0);
                                F.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) icVar.run(4), false);
                            } else if (i13 == 1) {
                                if (!n0Var2.f42756p0) {
                                    F.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) icVar.run(3), false);
                                    F.k();
                                }
                                if (n0Var2.f42755o0) {
                                    F.c(R.drawable.msg_arrow_forward, LocaleController.getString(R.string.WebForward), (Runnable) icVar.run(9), false);
                                }
                                f2 instantViewLoader = n0Var2.getInstantViewLoader();
                                if (instantViewLoader != null && (((!instantViewLoader.f42594g || !instantViewLoader.f42595i) && instantViewLoader.h == null && instantViewLoader.f42596j == null && !instantViewLoader.f42592c) || instantViewLoader.b() != null)) {
                                    F.c(R.drawable.menu_instant_view, LocaleController.getString(R.string.OpenLocalInstantView), (Runnable) icVar.run(10), false);
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
                                    t3 t3Var = new t3(25, y3, instantViewLoader);
                                    instantViewLoader.f42599m.add(t3Var);
                                    F.f27129p = new t3(29, instantViewLoader, t3Var);
                                }
                                F.c(R.drawable.msg_reset, LocaleController.getString(R.string.Refresh), (Runnable) icVar.run(5), false);
                                F.c(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) icVar.run(1), false);
                                F.c(R.drawable.msg_saved, LocaleController.getString(R.string.WebBookmark), (Runnable) icVar.run(6), false);
                                F.c(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) icVar.run(2), false);
                                F.k();
                                if (!c1.a(callback4).isEmpty()) {
                                    F.c(R.drawable.menu_views_recent, LocaleController.getString(R.string.WebHistory), (Runnable) icVar.run(8), false);
                                }
                                F.c(R.drawable.menu_browser_bookmarks, LocaleController.getString(R.string.WebBookmarks), (Runnable) icVar.run(7), false);
                                F.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) icVar.run(4), false);
                            }
                            F.f27129p = new ff0(n0Var2);
                            F.Z();
                            return;
                        }
                        return;
                    default:
                        n0Var.V.setText("");
                        return;
                }
            }
        });
        addView(imageView4, z5.e(54, 56, 85));
        g90 g90Var = new g90(context);
        this.f42743d0 = g90Var;
        g90Var.setPivotX(0.0f);
        g90Var.setPivotY(AndroidUtilities.dp(2.0f));
        addView(g90Var, z5.e(-1, 2, 87));
        setWillNotDraw(false);
        this.f42739b[0] = new s1(n0Var);
        this.f42739b[1] = new s1(n0Var);
        int i11 = h6.Pk;
        d(h6.x0(null, i11, false), false);
        setMenuColors(h6.x0(null, i11, false));
    }

    public final void a(Canvas canvas, float f7, float f10, boolean z10) {
        float f11;
        float max = Math.max(AndroidUtilities.dp(0.66f), 1);
        float f12 = f7 - max;
        float width = getWidth() * this.f42741c;
        RectF rectF = this.f42737a;
        rectF.set(0.0f, 0.0f, getWidth(), f7);
        Paint[] paintArr = this.f42745f;
        int alpha = paintArr[1].getAlpha();
        paintArr[1].setAlpha((int) (alpha * 1.0f));
        canvas.drawRect(rectF, paintArr[1]);
        paintArr[1].setAlpha(alpha);
        int i10 = (this.f42741c > 0.0f ? 1 : (this.f42741c == 0.0f ? 0 : -1));
        float[] fArr = this.d;
        Paint[] paintArr2 = this.f42753n;
        Paint[] paintArr3 = this.h;
        if (i10 > 0) {
            rectF.set(0.0f, 0.0f, fArr[1] * getWidth(), f7);
            int alpha2 = paintArr3[1].getAlpha();
            f11 = 1.0f;
            paintArr3[1].setAlpha((int) ((1.0f - this.f42738a0) * (1.0f - this.U) * alpha2 * 1.0f));
            canvas.drawRect(rectF, paintArr3[1]);
            paintArr3[1].setAlpha(alpha2);
            if (z10) {
                rectF.set(0.0f, f12, width, f12 + max);
                int alpha3 = paintArr2[1].getAlpha();
                paintArr2[1].setAlpha((int) ((1.0f - this.f42738a0) * alpha3 * 1.0f * f10));
                canvas.drawRect(rectF, paintArr2[1]);
                paintArr2[1].setAlpha(alpha3);
            }
        } else {
            f11 = 1.0f;
        }
        float f13 = this.f42741c;
        if (f13 < f11) {
            int m12 = h6.m1((f11 - f13) * f11, 1610612736);
            Paint paint = this.f42758r;
            paint.setColor(m12);
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
        paintArr3[0].setAlpha((int) ((f11 - this.f42738a0) * (f11 - this.U) * (f11 - Utilities.clamp01(this.f42741c * 4.0f)) * alpha5 * f11));
        canvas.drawRect(rectF, paintArr3[0]);
        paintArr3[0].setAlpha(alpha5);
        if (z10) {
            rectF.set(width, f12, getWidth() + width, max + f12);
            int alpha6 = paintArr2[0].getAlpha();
            paintArr2[0].setAlpha((int) ((f11 - this.f42738a0) * alpha6 * f11 * f10));
            canvas.drawRect(rectF, paintArr2[0]);
            paintArr2[0].setAlpha(alpha6);
        }
    }

    public final void b(int i10, int i11) {
        float f7;
        boolean[] zArr = this.e;
        boolean z10 = zArr[i10];
        Paint[] paintArr = this.f42745f;
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
        int f10 = i0.b.f(f7, -16777216, -1);
        this.h[i10].setColor(h6.v(i11, h6.m1(AndroidUtilities.lerp(0.07f, 0.2f, f7), f10)));
        this.f42753n[i10].setColor(h6.v(i11, h6.m1(AndroidUtilities.lerp(0.14f, 0.24f, f7), f10)));
        s1[] s1VarArr = this.f42739b;
        s1VarArr[i10].f42727a.u(f10);
        s1VarArr[i10].d = h6.v(i11, h6.m1(0.6f, f10));
        s1 s1Var = s1VarArr[i10];
        s1Var.f42728b.u(i0.b.f(s1VarArr[i10].f42729c.f26093c, s1Var.d, h6.x0(null, h6.f21224q7, false)));
        invalidate();
    }

    public final void c(final int i10, float f7, boolean z10) {
        final float f10;
        boolean[] zArr = this.e;
        if (zArr[2] && this.f42749i0 == i10) {
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
            int f12 = i0.b.f(f7, -16777216, -1);
            this.f42765w = f12;
            h6.m1(0.55f, f12);
            this.f42749i0 = i10;
            this.f42767x = i0.b.f(f7, -1, -16777216);
            int f13 = i0.b.f(1.0f - f7, -1, -16777216);
            this.f42769y = f13;
            int i11 = this.f42767x;
            l4 l4Var = ((org.telegram.ui.n0) this).B0;
            k kVar = l4Var.f38768i0;
            if (kVar != null) {
                kVar.c(i11, f13);
            }
            this.f42760s.setColor(this.f42767x);
            this.v.setColor(h6.v(this.f42767x, h6.m1(AndroidUtilities.lerp(0.07f, 0.2f, f7), this.f42765w)));
            int m12 = h6.m1(0.6f, this.f42769y);
            ai.t tVar = this.f42740b0;
            tVar.setHintTextColor(m12);
            tVar.setTextColor(this.f42769y);
            tVar.setCursorColor(this.f42769y);
            tVar.setHandlesColor(this.f42769y);
            this.f42743d0.setProgressColor(h6.x0(null, h6.Rk, false));
            int f14 = i0.b.f(this.f42738a0, this.f42765w, this.f42769y);
            org.telegram.ui.ActionBar.g2 g2Var = this.M;
            g2Var.a(f14);
            g2Var.b(i0.b.f(this.f42738a0, this.f42765w, this.f42769y));
            int i12 = this.f42765w;
            r1 r1Var = this.P;
            r1Var.f22697c.setColor(i12);
            r1Var.invalidateSelf();
            int i13 = this.f42765w;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            this.R.setColorFilter(new PorterDuffColorFilter(i13, mode));
            this.O.setColorFilter(new PorterDuffColorFilter(this.f42765w, mode));
            this.J.setColorFilter(new PorterDuffColorFilter(this.f42765w, mode));
            int v = h6.v(i10, h6.m1(0.22f, this.f42765w));
            this.f42750j0 = v;
            h6.C1(this.N, v, true);
            h6.C1(this.Q, this.f42750j0, true);
            h6.C1(this.S, this.f42750j0, true);
            h6.C1(this.K, this.f42750j0, true);
            int m13 = h6.m1(0.6f, this.f42765w);
            ai.t tVar2 = this.V;
            tVar2.setHintTextColor(m13);
            tVar2.setTextColor(this.f42765w);
            tVar2.setCursorColor(this.f42765w);
            tVar2.setHandlesColor(this.f42765w);
            x3 x3Var = l4Var.K;
            if (x3Var != null) {
                x3Var.i();
            }
            invalidate();
            return;
        }
        ValueAnimator valueAnimator = this.f42751k0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i14 = this.f42749i0;
        this.f42748h0 = i14;
        if (AndroidUtilities.computePerceivedBrightness(i14) <= 0.721f) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        if (AndroidUtilities.computePerceivedBrightness(i10) > 0.721f) {
            f11 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f42751k0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                t1 t1Var = t1.this;
                t1Var.getClass();
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                t1Var.c(i0.b.f(floatValue, t1Var.f42748h0, i10), AndroidUtilities.lerp(f10, f11, floatValue), false);
            }
        });
        this.f42751k0.addListener(new ge(this, i10, f11, 2));
        this.f42751k0.start();
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
        if (this.f42744e0) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        a(canvas, i10 + this.F, 1.0f, this.f42761s0);
        float right = this.H.getRight();
        float left = this.I.getLeft();
        boolean z10 = this.f42744e0;
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
        int i14 = (this.f42741c > 1.0f ? 1 : (this.f42741c == 1.0f ? 0 : -1));
        s1[] s1VarArr = this.f42739b;
        if (i14 < 0) {
            canvas.save();
            float width = (getWidth() * this.f42741c) - (Utilities.clamp01(this.f42741c * 2.0f) * AndroidUtilities.dp(30.0f));
            canvas.translate(right + width, f7);
            AndroidUtilities.lerp(1.0f, 0.5f, this.f42741c);
            s1VarArr[0].a(canvas, (left - right) - width, f10 - f7, (1.0f - this.U) * (1.0f - this.f42741c));
            canvas.restore();
        }
        if (this.f42741c > 0.0f) {
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getWidth() * this.f42741c, getHeight());
            canvas.translate(right, f7);
            canvas.translate((1.0f - this.f42741c) * AndroidUtilities.dp(-12.0f), 0.0f);
            float lerp = AndroidUtilities.lerp(1.0f, 0.5f, 1.0f - this.f42741c);
            float f11 = f10 - f7;
            canvas.scale(lerp, lerp, 0.0f, f11 / 2.0f);
            s1VarArr[1].a(canvas, left - right, f11, (1.0f - this.f42738a0) * (1.0f - this.U) * this.f42741c);
            canvas.restore();
        }
        int i15 = (this.f42738a0 > 0.0f ? 1 : (this.f42738a0 == 0.0f ? 0 : -1));
        RectF rectF = this.f42737a;
        if (i15 > 0) {
            Paint paint = this.f42760s;
            int alpha = paint.getAlpha();
            paint.setAlpha((int) (alpha * this.f42738a0));
            float width2 = getWidth();
            if (this.f42744e0) {
                i13 = AndroidUtilities.statusBarHeight;
            }
            canvas.drawRect(0.0f, 0.0f, width2, i13 + this.F, paint);
            paint.setAlpha(alpha);
            float f12 = (f7 + f10) / 2.0f;
            float dp = AndroidUtilities.dp(42.0f) / 2.0f;
            rectF.set(AndroidUtilities.dp(6.0f), f12 - dp, AndroidUtilities.lerp(left, getWidth() - AndroidUtilities.dp(6.0f), this.f42738a0), f12 + dp);
            Paint paint2 = this.v;
            int alpha2 = paint2.getAlpha();
            paint2.setAlpha((int) (alpha2 * this.f42738a0));
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
        x0 webView;
        int action = motionEvent.getAction();
        o1 o1Var = this.f42771z0;
        if (action == 0) {
            this.A0 = false;
            AndroidUtilities.cancelRunOnUIThread(o1Var);
            if (motionEvent.getX() > this.H.getRight() && motionEvent.getX() < this.I.getLeft() && !this.T && !this.W) {
                this.f42768x0 = motionEvent.getX();
                motionEvent.getY();
                this.f42770y0 = System.currentTimeMillis();
                AndroidUtilities.runOnUIThread(o1Var, ViewConfiguration.getLongPressTimeout() * 0.8f);
            }
        } else if (motionEvent.getAction() == 2 && ((float) (System.currentTimeMillis() - this.f42770y0)) > ViewConfiguration.getLongPressTimeout() * 0.8f) {
            AndroidUtilities.cancelRunOnUIThread(o1Var);
            this.A0 = true;
            o3 o3Var = ((org.telegram.ui.n0) this).B0.f38779u0[0];
            float clamp01 = Utilities.clamp01(o3Var.getProgress() + ((motionEvent.getX() - this.f42768x0) / (getWidth() * 0.8f)));
            if (!o3Var.c() && o3Var.f() && (webView = o3Var.f39635f.getWebView()) != null) {
                webView.setScrollProgress(clamp01);
                o3Var.K.f0();
            }
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(o1Var);
            this.f42770y0 = 0L;
        }
        this.f42768x0 = motionEvent.getX();
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(int i10, boolean z10) {
        float f7;
        s1 s1Var = this.f42739b[i10];
        if (s1Var.e != z10) {
            s1Var.e = z10;
            f6 f6Var = s1Var.f42729c;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            f6Var.d(f7, true);
            invalidate();
        }
    }

    public final void f(int i10, String str) {
        s1[] s1VarArr = this.f42739b;
        CharSequence charSequence = s1VarArr[i10].f42728b.f29198i;
        if (charSequence != null && TextUtils.equals(charSequence.toString(), str)) {
            return;
        }
        s1VarArr[i10].f42728b.t(Emoji.replaceEmoji(str, s1VarArr[i10].f42728b.f29190a.getFontMetricsInt(), false), false, true);
    }

    public final void g(int i10, String str, boolean z10) {
        s1[] s1VarArr = this.f42739b;
        CharSequence charSequence = s1VarArr[i10].f42727a.f29198i;
        if (charSequence != null && TextUtils.equals(charSequence.toString(), str)) {
            return;
        }
        s1VarArr[i10].f42727a.t(Emoji.replaceEmoji(str, s1VarArr[i10].f42727a.f29190a.getFontMetricsInt(), false), z10, true);
    }

    public int getBackgroundColor() {
        return this.f42749i0;
    }

    public f2 getInstantViewLoader() {
        return null;
    }

    public int getTextColor() {
        return this.f42765w;
    }

    public String getTitle() {
        CharSequence charSequence = this.f42739b[0].f42727a.f29198i;
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
        ValueAnimator valueAnimator = this.f42762t0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.T = z10;
        ai.t tVar = this.V;
        boolean z11 = false;
        tVar.setVisibility(0);
        float f10 = 0.0f;
        if (!this.f42763u0 && !z10) {
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
        this.f42762t0 = ofFloat;
        ofFloat.addUpdateListener(new i6(this, 14));
        this.f42762t0.addListener(new n40(13, this, z10));
        this.f42762t0.setInterpolator(bs.h);
        this.f42762t0.setDuration(320L);
        this.f42762t0.start();
        boolean z12 = !z10;
        AndroidUtilities.updateViewShow(this.O, z12, true, true);
        AndroidUtilities.updateViewShow(this.R, z12, true, true);
        if (tVar.length() > 0 && this.T) {
            z11 = true;
        }
        AndroidUtilities.updateViewShow(this.J, z11, true, true);
    }

    public final void i() {
        s1[] s1VarArr = this.f42739b;
        s1 s1Var = s1VarArr[0];
        s1VarArr[0] = s1VarArr[1];
        s1VarArr[1] = s1Var;
        float[] fArr = this.d;
        float f7 = fArr[0];
        fArr[0] = fArr[1];
        fArr[1] = f7;
        Paint[] paintArr = this.f42745f;
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
        if (this.f42744e0) {
            i12 = AndroidUtilities.statusBarHeight;
        } else {
            i12 = 0;
        }
        super.onMeasure(i10, wh.D(56.0f, i12, 1073741824));
    }

    public void setBackButton(boolean z10) {
        float f7;
        this.f42763u0 = z10;
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
        this.f42763u0 = z10;
    }

    public void setHasForward(boolean z10) {
        this.f42755o0 = z10;
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
            this.f42743d0.setTranslationY(this.F - AndroidUtilities.dp(56.0f));
            invalidate();
        }
    }

    public void setIsLocal(boolean z10) {
        this.f42757q0 = z10;
    }

    public void setIsTonsite(boolean z10) {
        this.f42756p0 = z10;
    }

    public void setMenuColors(int i10) {
        int i11;
        boolean z10 = false;
        if (g5.s(g5.r(i10))[0] < 0.5d) {
            z10 = true;
        }
        int i12 = -1;
        if (z10) {
            i11 = -16777216;
        } else {
            i11 = -1;
        }
        this.f42752l0 = i11;
        if (!z10) {
            i12 = -16777216;
        }
        this.m0 = i12;
        this.f42754n0 = h6.m1(0.6f, i12);
    }

    public void setMenuListener(Utilities.Callback<Integer> callback) {
        this.f42746f0 = callback;
    }

    public void setMenuType(int i10) {
        if (this.f42747g0 != i10) {
            this.f42747g0 = i10;
        }
    }

    public void setProgress(float f7) {
        this.d[0] = f7;
        invalidate();
    }

    public void setTransitionProgress(float f7) {
        this.f42741c = f7;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return true;
    }

    public void setIsLoaded(boolean z10) {
    }
}
