package org.telegram.ui.web;

import ai.h3;
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
import ci.x7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bi;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.g5;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.p90;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.y00;
import org.telegram.ui.f70;
import org.telegram.ui.i4;
import org.telegram.ui.ii1;
import org.telegram.ui.j20;
import org.telegram.ui.m3;
import org.telegram.ui.t21;
import org.telegram.ui.v3;
import org.telegram.ui.yd;
import w7.x5;
public abstract class u1 extends FrameLayout {
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
    public final s1 P;
    public final org.telegram.ui.Cells.z Q;
    public final ImageView R;
    public final org.telegram.ui.Cells.z S;
    public boolean T;
    public float U;
    public final fi.o V;
    public boolean W;
    public final RectF f43520a;
    public float f43521a0;
    public final t1[] f43522b;
    public final fi.o f43523b0;
    public float f43524c;
    public int f43525c0;
    public final float[] d;
    public final p90 f43526d0;
    public final boolean[] f43527e;
    public boolean f43528e0;
    public final Paint[] f43529f;
    public Utilities.Callback f43530f0;
    public int f43531g0;
    public final Paint[] h;
    public int f43532h0;
    public int f43533i0;
    public int f43534j0;
    public ValueAnimator f43535k0;
    public int f43536l0;
    public int m0;
    public final Paint[] f43537n;
    public int f43538n0;
    public boolean f43539o0;
    public boolean f43540p0;
    public boolean f43541q0;
    public final Paint f43542r;
    public final j20 f43543r0;
    public final Paint f43544s;
    public boolean f43545s0;
    public ValueAnimator f43546t0;
    public boolean f43547u0;
    public final Paint v;
    public h3 f43548v0;
    public int f43549w;
    public ValueAnimator f43550w0;
    public int f43551x;
    public float f43552x0;
    public int f43553y;
    public long f43554y0;
    public final p1 f43555z0;

    public u1(Context context) {
        super(context);
        this.f43520a = new RectF();
        this.f43522b = new t1[2];
        this.f43524c = 0.0f;
        this.d = new float[2];
        this.f43527e = new boolean[3];
        this.f43529f = new Paint[2];
        this.h = new Paint[2];
        this.f43537n = new Paint[2];
        this.f43542r = new Paint(1);
        this.f43544s = new Paint(1);
        this.v = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.E = textPaint;
        this.F = AndroidUtilities.dp(56.0f);
        this.G = 1.0f;
        this.U = 0.0f;
        this.f43521a0 = 0.0f;
        this.f43531g0 = -1;
        this.f43543r0 = new j20();
        final org.telegram.ui.l0 l0Var = (org.telegram.ui.l0) this;
        this.f43555z0 = new p1(l0Var, 0);
        this.A0 = false;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(18.33f));
        for (int i10 = 0; i10 < 2; i10++) {
            this.f43529f[i10] = new Paint(1);
            this.h[i10] = new Paint(1);
            this.f43537n[i10] = new Paint(1);
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
        g2Var.f20644k = 200.0f;
        g2Var.c(1.0f, false);
        imageView.setImageDrawable(g2Var);
        org.telegram.ui.Cells.z g02 = i6.g0(1090519039, 1, -1);
        this.N = g02;
        imageView.setBackground(g02);
        ydVar.addView(imageView, x5.n(54, 56));
        yd ydVar2 = new yd(context, 7);
        this.I = ydVar2;
        ydVar2.setOrientation(0);
        addView(ydVar2, x5.e(-2, 56, 85));
        ImageView imageView2 = new ImageView(context);
        this.O = imageView2;
        imageView2.setScaleType(scaleType);
        s1 s1Var = new s1(l0Var);
        this.P = s1Var;
        imageView2.setImageDrawable(s1Var);
        s1Var.f();
        org.telegram.ui.Cells.z g03 = i6.g0(1090519039, 1, -1);
        this.Q = g03;
        imageView2.setBackground(g03);
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
                        org.telegram.ui.l0 l0Var2 = l0Var;
                        if (l0Var2.getParent() instanceof ViewGroup) {
                            x7 x7Var = new x7(l0Var2, 2);
                            Utilities.Callback callback2 = null;
                            q80 F = q80.F((ViewGroup) l0Var2.getParent(), null, l0Var2.R);
                            F.f30120s = 0;
                            F.S(l0Var2.m0, l0Var2.f43538n0);
                            F.a0(0.0f, -AndroidUtilities.dp(52.0f));
                            F.S = 200;
                            int v = i6.v(l0Var2.f43536l0, i6.m1(0.1f, l0Var2.m0));
                            F.f30109l0 = Integer.valueOf(v);
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
                            if (AndroidUtilities.computePerceivedBrightness(l0Var2.f43536l0) > 0.721f) {
                                F.P(-1);
                                F.T(-986896);
                            } else {
                                F.P(-14737633);
                                F.T(-15592942);
                            }
                            int i13 = l0Var2.f43531g0;
                            if (i13 == 0) {
                                F.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) x7Var.run(3), false);
                                F.c(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) x7Var.run(1), false);
                                F.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) x7Var.run(2), !l0Var2.f43541q0);
                                F.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) x7Var.run(4), false);
                            } else if (i13 == 1) {
                                if (!l0Var2.f43540p0) {
                                    F.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) x7Var.run(3), false);
                                    F.k();
                                }
                                if (l0Var2.f43539o0) {
                                    F.c(R.drawable.msg_arrow_forward, LocaleController.getString(R.string.WebForward), (Runnable) x7Var.run(9), false);
                                }
                                g2 instantViewLoader = l0Var2.getInstantViewLoader();
                                if (instantViewLoader != null && (((!instantViewLoader.f43361g || !instantViewLoader.f43362i) && instantViewLoader.h == null && instantViewLoader.f43363j == null && !instantViewLoader.f43358c) || instantViewLoader.b() != null)) {
                                    F.c(R.drawable.menu_instant_view, LocaleController.getString(R.string.OpenLocalInstantView), (Runnable) x7Var.run(10), false);
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
                                    ii1 ii1Var = new ii1(28, y3, instantViewLoader);
                                    instantViewLoader.f43366m.add(ii1Var);
                                    F.f30115p = new w1(2, instantViewLoader, ii1Var);
                                }
                                F.c(R.drawable.msg_reset, LocaleController.getString(R.string.Refresh), (Runnable) x7Var.run(5), false);
                                F.c(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) x7Var.run(1), false);
                                F.c(R.drawable.msg_saved, LocaleController.getString(R.string.WebBookmark), (Runnable) x7Var.run(6), false);
                                F.c(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) x7Var.run(2), false);
                                F.k();
                                if (!d1.a(callback4).isEmpty()) {
                                    F.c(R.drawable.menu_views_recent, LocaleController.getString(R.string.WebHistory), (Runnable) x7Var.run(8), false);
                                }
                                F.c(R.drawable.menu_browser_bookmarks, LocaleController.getString(R.string.WebBookmarks), (Runnable) x7Var.run(7), false);
                                F.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) x7Var.run(4), false);
                            }
                            F.f30115p = new t21(l0Var2);
                            F.Z();
                            return;
                        }
                        return;
                    default:
                        l0Var.V.setText("");
                        return;
                }
            }
        });
        org.telegram.ui.Cells.z g04 = i6.g0(1090519039, 1, -1);
        this.S = g04;
        imageView3.setBackground(g04);
        imageView3.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
        ydVar2.addView(imageView3, x5.n(54, 56));
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
                                AndroidUtilities.hideKeyboard(l0Var.V);
                                return false;
                            }
                            return false;
                        }
                        return false;
                    default:
                        if (i11 == 2) {
                            org.telegram.ui.l0 l0Var2 = l0Var;
                            h3 h3Var = l0Var2.f43548v0;
                            if (h3Var != null) {
                                h3Var.run(l0Var2.f43523b0.getText().toString());
                            }
                            l0Var2.k(false);
                        }
                        return false;
                }
            }
        });
        oVar.addTextChangedListener(new ci.h2(l0Var, 18));
        frameLayout.addView(oVar, x5.e(-1, -1, 119));
        fi.o oVar2 = new fi.o(context, 4);
        this.f43523b0 = oVar2;
        oVar2.setVisibility(8);
        oVar2.setAlpha(0.0f);
        oVar2.setTextSize(1, 15.66f);
        oVar2.setSingleLine(true);
        this.f43525c0 = SharedConfig.searchEngineType;
        oVar2.setHint(LocaleController.formatString(R.string.AddressPlaceholder, n1.a().f43452a));
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
                                AndroidUtilities.hideKeyboard(l0Var.V);
                                return false;
                            }
                            return false;
                        }
                        return false;
                    default:
                        if (i11 == 2) {
                            org.telegram.ui.l0 l0Var2 = l0Var;
                            h3 h3Var = l0Var2.f43548v0;
                            if (h3Var != null) {
                                h3Var.run(l0Var2.f43523b0.getText().toString());
                            }
                            l0Var2.k(false);
                        }
                        return false;
                }
            }
        });
        frameLayout2.addView(oVar2, x5.a(-1.0f, 48.0f, 0.0f, 12.0f, 0.0f, -1, 119));
        ImageView imageView4 = new ImageView(context);
        this.J = imageView4;
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(R.drawable.ic_close_white);
        org.telegram.ui.Cells.z g05 = i6.g0(1090519039, 1, -1);
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
                        org.telegram.ui.l0 l0Var2 = l0Var;
                        if (l0Var2.getParent() instanceof ViewGroup) {
                            x7 x7Var = new x7(l0Var2, 2);
                            Utilities.Callback callback2 = null;
                            q80 F = q80.F((ViewGroup) l0Var2.getParent(), null, l0Var2.R);
                            F.f30120s = 0;
                            F.S(l0Var2.m0, l0Var2.f43538n0);
                            F.a0(0.0f, -AndroidUtilities.dp(52.0f));
                            F.S = 200;
                            int v = i6.v(l0Var2.f43536l0, i6.m1(0.1f, l0Var2.m0));
                            F.f30109l0 = Integer.valueOf(v);
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
                            if (AndroidUtilities.computePerceivedBrightness(l0Var2.f43536l0) > 0.721f) {
                                F.P(-1);
                                F.T(-986896);
                            } else {
                                F.P(-14737633);
                                F.T(-15592942);
                            }
                            int i13 = l0Var2.f43531g0;
                            if (i13 == 0) {
                                F.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) x7Var.run(3), false);
                                F.c(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) x7Var.run(1), false);
                                F.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) x7Var.run(2), !l0Var2.f43541q0);
                                F.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) x7Var.run(4), false);
                            } else if (i13 == 1) {
                                if (!l0Var2.f43540p0) {
                                    F.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) x7Var.run(3), false);
                                    F.k();
                                }
                                if (l0Var2.f43539o0) {
                                    F.c(R.drawable.msg_arrow_forward, LocaleController.getString(R.string.WebForward), (Runnable) x7Var.run(9), false);
                                }
                                g2 instantViewLoader = l0Var2.getInstantViewLoader();
                                if (instantViewLoader != null && (((!instantViewLoader.f43361g || !instantViewLoader.f43362i) && instantViewLoader.h == null && instantViewLoader.f43363j == null && !instantViewLoader.f43358c) || instantViewLoader.b() != null)) {
                                    F.c(R.drawable.menu_instant_view, LocaleController.getString(R.string.OpenLocalInstantView), (Runnable) x7Var.run(10), false);
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
                                    ii1 ii1Var = new ii1(28, y3, instantViewLoader);
                                    instantViewLoader.f43366m.add(ii1Var);
                                    F.f30115p = new w1(2, instantViewLoader, ii1Var);
                                }
                                F.c(R.drawable.msg_reset, LocaleController.getString(R.string.Refresh), (Runnable) x7Var.run(5), false);
                                F.c(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) x7Var.run(1), false);
                                F.c(R.drawable.msg_saved, LocaleController.getString(R.string.WebBookmark), (Runnable) x7Var.run(6), false);
                                F.c(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) x7Var.run(2), false);
                                F.k();
                                if (!d1.a(callback4).isEmpty()) {
                                    F.c(R.drawable.menu_views_recent, LocaleController.getString(R.string.WebHistory), (Runnable) x7Var.run(8), false);
                                }
                                F.c(R.drawable.menu_browser_bookmarks, LocaleController.getString(R.string.WebBookmarks), (Runnable) x7Var.run(7), false);
                                F.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) x7Var.run(4), false);
                            }
                            F.f30115p = new t21(l0Var2);
                            F.Z();
                            return;
                        }
                        return;
                    default:
                        l0Var.V.setText("");
                        return;
                }
            }
        });
        addView(imageView4, x5.e(54, 56, 85));
        p90 p90Var = new p90(context);
        this.f43526d0 = p90Var;
        p90Var.setPivotX(0.0f);
        p90Var.setPivotY(AndroidUtilities.dp(2.0f));
        addView(p90Var, x5.e(-1, 2, 87));
        setWillNotDraw(false);
        this.f43522b[0] = new t1(l0Var);
        this.f43522b[1] = new t1(l0Var);
        int i11 = i6.Pk;
        d(i6.x0(null, i11, false), false);
        setMenuColors(i6.x0(null, i11, false));
    }

    public final void a(Canvas canvas, float f7, float f10, boolean z10) {
        float f11;
        float max = Math.max(AndroidUtilities.dp(0.66f), 1);
        float f12 = f7 - max;
        float width = getWidth() * this.f43524c;
        RectF rectF = this.f43520a;
        rectF.set(0.0f, 0.0f, getWidth(), f7);
        Paint[] paintArr = this.f43529f;
        int alpha = paintArr[1].getAlpha();
        paintArr[1].setAlpha((int) (alpha * 1.0f));
        canvas.drawRect(rectF, paintArr[1]);
        paintArr[1].setAlpha(alpha);
        int i10 = (this.f43524c > 0.0f ? 1 : (this.f43524c == 0.0f ? 0 : -1));
        float[] fArr = this.d;
        Paint[] paintArr2 = this.f43537n;
        Paint[] paintArr3 = this.h;
        if (i10 > 0) {
            rectF.set(0.0f, 0.0f, fArr[1] * getWidth(), f7);
            int alpha2 = paintArr3[1].getAlpha();
            f11 = 1.0f;
            paintArr3[1].setAlpha((int) ((1.0f - this.f43521a0) * (1.0f - this.U) * alpha2 * 1.0f));
            canvas.drawRect(rectF, paintArr3[1]);
            paintArr3[1].setAlpha(alpha2);
            if (z10) {
                rectF.set(0.0f, f12, width, f12 + max);
                int alpha3 = paintArr2[1].getAlpha();
                paintArr2[1].setAlpha((int) ((1.0f - this.f43521a0) * alpha3 * 1.0f * f10));
                canvas.drawRect(rectF, paintArr2[1]);
                paintArr2[1].setAlpha(alpha3);
            }
        } else {
            f11 = 1.0f;
        }
        float f13 = this.f43524c;
        if (f13 < f11) {
            int m12 = i6.m1((f11 - f13) * f11, 1610612736);
            Paint paint = this.f43542r;
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
        paintArr3[0].setAlpha((int) ((f11 - this.f43521a0) * (f11 - this.U) * (f11 - Utilities.clamp01(this.f43524c * 4.0f)) * alpha5 * f11));
        canvas.drawRect(rectF, paintArr3[0]);
        paintArr3[0].setAlpha(alpha5);
        if (z10) {
            rectF.set(width, f12, getWidth() + width, max + f12);
            int alpha6 = paintArr2[0].getAlpha();
            paintArr2[0].setAlpha((int) ((f11 - this.f43521a0) * alpha6 * f11 * f10));
            canvas.drawRect(rectF, paintArr2[0]);
            paintArr2[0].setAlpha(alpha6);
        }
    }

    public final void b(int i10, int i11) {
        float f7;
        boolean[] zArr = this.f43527e;
        boolean z10 = zArr[i10];
        Paint[] paintArr = this.f43529f;
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
        this.h[i10].setColor(i6.v(i11, i6.m1(AndroidUtilities.lerp(0.07f, 0.2f, f7), d)));
        this.f43537n[i10].setColor(i6.v(i11, i6.m1(AndroidUtilities.lerp(0.14f, 0.24f, f7), d)));
        t1[] t1VarArr = this.f43522b;
        t1VarArr[i10].f43509a.u(d);
        t1VarArr[i10].d = i6.v(i11, i6.m1(0.6f, d));
        t1 t1Var = t1VarArr[i10];
        t1Var.f43510b.u(i0.a.d(t1VarArr[i10].f43511c.f26616c, t1Var.d, i6.x0(null, i6.f21041q7, false)));
        invalidate();
    }

    public final void c(final int i10, float f7, boolean z10) {
        final float f10;
        boolean[] zArr = this.f43527e;
        if (zArr[2] && this.f43533i0 == i10) {
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
            this.f43549w = d;
            i6.m1(0.55f, d);
            this.f43533i0 = i10;
            this.f43551x = i0.a.d(f7, -1, -16777216);
            int d10 = i0.a.d(1.0f - f7, -1, -16777216);
            this.f43553y = d10;
            int i11 = this.f43551x;
            i4 i4Var = ((org.telegram.ui.l0) this).B0;
            k kVar = i4Var.f38548i0;
            if (kVar != null) {
                kVar.c(i11, d10);
            }
            this.f43544s.setColor(this.f43551x);
            this.v.setColor(i6.v(this.f43551x, i6.m1(AndroidUtilities.lerp(0.07f, 0.2f, f7), this.f43549w)));
            int m12 = i6.m1(0.6f, this.f43553y);
            fi.o oVar = this.f43523b0;
            oVar.setHintTextColor(m12);
            oVar.setTextColor(this.f43553y);
            oVar.setCursorColor(this.f43553y);
            oVar.setHandlesColor(this.f43553y);
            this.f43526d0.setProgressColor(i6.x0(null, i6.Rk, false));
            int d11 = i0.a.d(this.f43521a0, this.f43549w, this.f43553y);
            org.telegram.ui.ActionBar.g2 g2Var = this.M;
            g2Var.a(d11);
            g2Var.b(i0.a.d(this.f43521a0, this.f43549w, this.f43553y));
            int i12 = this.f43549w;
            s1 s1Var = this.P;
            s1Var.f22591c.setColor(i12);
            s1Var.invalidateSelf();
            int i13 = this.f43549w;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            this.R.setColorFilter(new PorterDuffColorFilter(i13, mode));
            this.O.setColorFilter(new PorterDuffColorFilter(this.f43549w, mode));
            this.J.setColorFilter(new PorterDuffColorFilter(this.f43549w, mode));
            int v = i6.v(i10, i6.m1(0.22f, this.f43549w));
            this.f43534j0 = v;
            i6.C1(this.N, v, true);
            i6.C1(this.Q, this.f43534j0, true);
            i6.C1(this.S, this.f43534j0, true);
            i6.C1(this.K, this.f43534j0, true);
            int m13 = i6.m1(0.6f, this.f43549w);
            fi.o oVar2 = this.V;
            oVar2.setHintTextColor(m13);
            oVar2.setTextColor(this.f43549w);
            oVar2.setCursorColor(this.f43549w);
            oVar2.setHandlesColor(this.f43549w);
            v3 v3Var = i4Var.K;
            if (v3Var != null) {
                v3Var.i();
            }
            invalidate();
            return;
        }
        ValueAnimator valueAnimator = this.f43535k0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i14 = this.f43533i0;
        this.f43532h0 = i14;
        if (AndroidUtilities.computePerceivedBrightness(i14) <= 0.721f) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        if (AndroidUtilities.computePerceivedBrightness(i10) > 0.721f) {
            f11 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f43535k0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                u1 u1Var = u1.this;
                u1Var.getClass();
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                u1Var.c(i0.a.d(floatValue, u1Var.f43532h0, i10), AndroidUtilities.lerp(f10, f11, floatValue), false);
            }
        });
        this.f43535k0.addListener(new y00(this, i10, f11, 1));
        this.f43535k0.start();
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
        if (this.f43528e0) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        a(canvas, i10 + this.F, 1.0f, this.f43545s0);
        float right = this.H.getRight();
        float left = this.I.getLeft();
        boolean z10 = this.f43528e0;
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
        int i14 = (this.f43524c > 1.0f ? 1 : (this.f43524c == 1.0f ? 0 : -1));
        t1[] t1VarArr = this.f43522b;
        if (i14 < 0) {
            canvas.save();
            float width = (getWidth() * this.f43524c) - (Utilities.clamp01(this.f43524c * 2.0f) * AndroidUtilities.dp(30.0f));
            canvas.translate(right + width, f7);
            AndroidUtilities.lerp(1.0f, 0.5f, this.f43524c);
            t1VarArr[0].a(canvas, (left - right) - width, f10 - f7, (1.0f - this.U) * (1.0f - this.f43524c));
            canvas.restore();
        }
        if (this.f43524c > 0.0f) {
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getWidth() * this.f43524c, getHeight());
            canvas.translate(right, f7);
            canvas.translate((1.0f - this.f43524c) * AndroidUtilities.dp(-12.0f), 0.0f);
            float lerp = AndroidUtilities.lerp(1.0f, 0.5f, 1.0f - this.f43524c);
            float f11 = f10 - f7;
            canvas.scale(lerp, lerp, 0.0f, f11 / 2.0f);
            t1VarArr[1].a(canvas, left - right, f11, (1.0f - this.f43521a0) * (1.0f - this.U) * this.f43524c);
            canvas.restore();
        }
        int i15 = (this.f43521a0 > 0.0f ? 1 : (this.f43521a0 == 0.0f ? 0 : -1));
        RectF rectF = this.f43520a;
        if (i15 > 0) {
            Paint paint = this.f43544s;
            int alpha = paint.getAlpha();
            paint.setAlpha((int) (alpha * this.f43521a0));
            float width2 = getWidth();
            if (this.f43528e0) {
                i13 = AndroidUtilities.statusBarHeight;
            }
            canvas.drawRect(0.0f, 0.0f, width2, i13 + this.F, paint);
            paint.setAlpha(alpha);
            float f12 = (f7 + f10) / 2.0f;
            float dp = AndroidUtilities.dp(42.0f) / 2.0f;
            rectF.set(AndroidUtilities.dp(6.0f), f12 - dp, AndroidUtilities.lerp(left, getWidth() - AndroidUtilities.dp(6.0f), this.f43521a0), f12 + dp);
            Paint paint2 = this.v;
            int alpha2 = paint2.getAlpha();
            paint2.setAlpha((int) (alpha2 * this.f43521a0));
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
        p1 p1Var = this.f43555z0;
        if (action == 0) {
            this.A0 = false;
            AndroidUtilities.cancelRunOnUIThread(p1Var);
            if (motionEvent.getX() > this.H.getRight() && motionEvent.getX() < this.I.getLeft() && !this.T && !this.W) {
                this.f43552x0 = motionEvent.getX();
                motionEvent.getY();
                this.f43554y0 = System.currentTimeMillis();
                AndroidUtilities.runOnUIThread(p1Var, ViewConfiguration.getLongPressTimeout() * 0.8f);
            }
        } else if (motionEvent.getAction() == 2 && ((float) (System.currentTimeMillis() - this.f43554y0)) > ViewConfiguration.getLongPressTimeout() * 0.8f) {
            AndroidUtilities.cancelRunOnUIThread(p1Var);
            this.A0 = true;
            m3 m3Var = ((org.telegram.ui.l0) this).B0.f38559u0[0];
            float clamp01 = Utilities.clamp01(m3Var.getProgress() + ((motionEvent.getX() - this.f43552x0) / (getWidth() * 0.8f)));
            if (!m3Var.c() && m3Var.f() && (webView = m3Var.f39799f.getWebView()) != null) {
                webView.setScrollProgress(clamp01);
                m3Var.K.f0();
            }
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(p1Var);
            this.f43554y0 = 0L;
        }
        this.f43552x0 = motionEvent.getX();
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(int i10, boolean z10) {
        float f7;
        t1 t1Var = this.f43522b[i10];
        if (t1Var.f43512e != z10) {
            t1Var.f43512e = z10;
            g6 g6Var = t1Var.f43511c;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            g6Var.d(f7, true);
            invalidate();
        }
    }

    public final void f(int i10, String str) {
        t1[] t1VarArr = this.f43522b;
        CharSequence charSequence = t1VarArr[i10].f43510b.f30037i;
        if (charSequence != null && TextUtils.equals(charSequence.toString(), str)) {
            return;
        }
        t1VarArr[i10].f43510b.t(Emoji.replaceEmoji(str, t1VarArr[i10].f43510b.f30029a.getFontMetricsInt(), false), false, true);
    }

    public final void g(int i10, String str, boolean z10) {
        t1[] t1VarArr = this.f43522b;
        CharSequence charSequence = t1VarArr[i10].f43509a.f30037i;
        if (charSequence != null && TextUtils.equals(charSequence.toString(), str)) {
            return;
        }
        t1VarArr[i10].f43509a.t(Emoji.replaceEmoji(str, t1VarArr[i10].f43509a.f30029a.getFontMetricsInt(), false), z10, true);
    }

    public int getBackgroundColor() {
        return this.f43533i0;
    }

    public g2 getInstantViewLoader() {
        return null;
    }

    public int getTextColor() {
        return this.f43549w;
    }

    public String getTitle() {
        CharSequence charSequence = this.f43522b[0].f43509a.f30037i;
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
        ValueAnimator valueAnimator = this.f43546t0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.T = z10;
        fi.o oVar = this.V;
        boolean z11 = false;
        oVar.setVisibility(0);
        float f10 = 0.0f;
        if (!this.f43547u0 && !z10) {
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
        this.f43546t0 = ofFloat;
        ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.r0(this, 6));
        this.f43546t0.addListener(new f70(12, this, z10));
        this.f43546t0.setInterpolator(is.h);
        this.f43546t0.setDuration(320L);
        this.f43546t0.start();
        boolean z12 = !z10;
        AndroidUtilities.updateViewShow(this.O, z12, true, true);
        AndroidUtilities.updateViewShow(this.R, z12, true, true);
        if (oVar.length() > 0 && this.T) {
            z11 = true;
        }
        AndroidUtilities.updateViewShow(this.J, z11, true, true);
    }

    public final void i() {
        t1[] t1VarArr = this.f43522b;
        t1 t1Var = t1VarArr[0];
        t1VarArr[0] = t1VarArr[1];
        t1VarArr[1] = t1Var;
        float[] fArr = this.d;
        float f7 = fArr[0];
        fArr[0] = fArr[1];
        fArr[1] = f7;
        Paint[] paintArr = this.f43529f;
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
        if (this.f43528e0) {
            i12 = AndroidUtilities.statusBarHeight;
        } else {
            i12 = 0;
        }
        super.onMeasure(i10, bi.C(56.0f, i12, 1073741824));
    }

    public void setBackButton(boolean z10) {
        float f7;
        this.f43547u0 = z10;
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
        this.f43547u0 = z10;
    }

    public void setHasForward(boolean z10) {
        this.f43539o0 = z10;
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
            this.f43526d0.setTranslationY(this.F - AndroidUtilities.dp(56.0f));
            invalidate();
        }
    }

    public void setIsLocal(boolean z10) {
        this.f43541q0 = z10;
    }

    public void setIsTonsite(boolean z10) {
        this.f43540p0 = z10;
    }

    public void setMenuColors(int i10) {
        double atan2;
        int i11;
        boolean z10 = false;
        double[] j3 = g5.j(g5.f20653a, g5.j(g5.f20655c, new double[]{Color.red(i10) / 255.0d, Color.green(i10) / 255.0d, Color.blue(i10) / 255.0d}));
        for (int i12 = 0; i12 < 3; i12++) {
            j3[i12] = Math.cbrt(j3[i12]);
        }
        double[] j10 = g5.j(g5.f20654b, j3);
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
        this.f43536l0 = i11;
        if (!z10) {
            i13 = -16777216;
        }
        this.m0 = i13;
        this.f43538n0 = i6.m1(0.6f, i13);
    }

    public void setMenuListener(Utilities.Callback<Integer> callback) {
        this.f43530f0 = callback;
    }

    public void setMenuType(int i10) {
        if (this.f43531g0 != i10) {
            this.f43531g0 = i10;
        }
    }

    public void setProgress(float f7) {
        this.d[0] = f7;
        invalidate();
    }

    public void setTransitionProgress(float f7) {
        this.f43524c = f7;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return true;
    }

    public void setIsLoaded(boolean z10) {
    }
}
