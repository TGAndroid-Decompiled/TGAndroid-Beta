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
import bi.c9;
import bi.u2;
import bi.y2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.em;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.o00;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.w80;
import org.telegram.ui.Components.wr;
import org.telegram.ui.iw0;
import org.telegram.ui.j4;
import org.telegram.ui.m20;
import org.telegram.ui.n3;
import org.telegram.ui.r91;
import org.telegram.ui.w3;
import org.telegram.ui.zd;
import w7.a6;
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
    public final org.telegram.ui.ActionBar.i2 M;
    public final org.telegram.ui.Cells.z N;
    public final ImageView O;
    public final t1 P;
    public final org.telegram.ui.Cells.z Q;
    public final ImageView R;
    public final org.telegram.ui.Cells.z S;
    public boolean T;
    public float U;
    public final ei.o V;
    public boolean W;
    public final RectF f38100a;
    public float f38101a0;
    public final u1[] f38102b;
    public final ei.o f38103b0;
    public float f38104c;
    public int f38105c0;
    public final float[] d;
    public final w80 f38106d0;
    public final boolean[] e;
    public boolean f38107e0;
    public final Paint[] f38108f;
    public Utilities.Callback f38109f0;
    public int f38110g0;
    public final Paint[] h;
    public int f38111h0;
    public int f38112i0;
    public int f38113j0;
    public ValueAnimator f38114k0;
    public int f38115l0;
    public int m0;
    public final Paint[] f38116n;
    public int f38117n0;
    public boolean f38118o0;
    public boolean f38119p0;
    public boolean f38120q0;
    public final Paint f38121r;
    public final m20 f38122r0;
    public final Paint f38123s;
    public boolean f38124s0;
    public ValueAnimator f38125t0;
    public boolean f38126u0;
    public final Paint v;
    public y2 f38127v0;
    public int f38128w;
    public ValueAnimator f38129w0;
    public int f38130x;
    public float f38131x0;
    public int f38132y;
    public long f38133y0;
    public final q1 f38134z0;

    public v1(Context context) {
        super(context);
        this.f38100a = new RectF();
        this.f38102b = new u1[2];
        this.f38104c = 0.0f;
        this.d = new float[2];
        this.e = new boolean[3];
        this.f38108f = new Paint[2];
        this.h = new Paint[2];
        this.f38116n = new Paint[2];
        this.f38121r = new Paint(1);
        this.f38123s = new Paint(1);
        this.v = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.E = textPaint;
        this.F = AndroidUtilities.dp(56.0f);
        this.G = 1.0f;
        this.U = 0.0f;
        this.f38101a0 = 0.0f;
        this.f38110g0 = -1;
        this.f38122r0 = new m20();
        final org.telegram.ui.l0 l0Var = (org.telegram.ui.l0) this;
        this.f38134z0 = new q1(l0Var, 0);
        this.A0 = false;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(18.33f));
        for (int i10 = 0; i10 < 2; i10++) {
            this.f38108f[i10] = new Paint(1);
            this.h[i10] = new Paint(1);
            this.f38116n[i10] = new Paint(1);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, a6.e(-1, 56, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        addView(frameLayout2, a6.e(-1, 56, 87));
        zd zdVar = new zd(context, 6);
        this.H = zdVar;
        zdVar.setOrientation(0);
        addView(zdVar, a6.e(-2, 56, 83));
        ImageView imageView = new ImageView(context);
        this.L = imageView;
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2(false);
        this.M = i2Var;
        i2Var.f17826k = 200.0f;
        i2Var.c(1.0f, false);
        imageView.setImageDrawable(i2Var);
        org.telegram.ui.Cells.z f02 = j6.f0(1090519039, 1, -1);
        this.N = f02;
        imageView.setBackground(f02);
        zdVar.addView(imageView, a6.n(54, 56));
        zd zdVar2 = new zd(context, 7);
        this.I = zdVar2;
        zdVar2.setOrientation(0);
        addView(zdVar2, a6.e(-2, 56, 85));
        ImageView imageView2 = new ImageView(context);
        this.O = imageView2;
        imageView2.setScaleType(scaleType);
        t1 t1Var = new t1(l0Var);
        this.P = t1Var;
        imageView2.setImageDrawable(t1Var);
        t1Var.f();
        org.telegram.ui.Cells.z f03 = j6.f0(1090519039, 1, -1);
        this.Q = f03;
        imageView2.setBackground(f03);
        zdVar2.addView(imageView2, a6.n(54, 56));
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
                            c9 c9Var = new c9(l0Var2, 2);
                            Utilities.Callback callback2 = null;
                            w70 F = w70.F((ViewGroup) l0Var2.getParent(), null, l0Var2.R);
                            F.f28701s = 0;
                            F.S(l0Var2.m0, l0Var2.f38117n0);
                            F.a0(0.0f, -AndroidUtilities.dp(52.0f));
                            F.S = 200;
                            int v = j6.v(l0Var2.f38115l0, j6.l1(0.1f, l0Var2.m0));
                            F.f28690l0 = Integer.valueOf(v);
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
                            if (AndroidUtilities.computePerceivedBrightness(l0Var2.f38115l0) > 0.721f) {
                                F.P(-1);
                                F.T(-986896);
                            } else {
                                F.P(-14737633);
                                F.T(-15592942);
                            }
                            int i13 = l0Var2.f38110g0;
                            if (i13 == 0) {
                                F.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) c9Var.run(3), false);
                                F.c(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) c9Var.run(1), false);
                                F.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) c9Var.run(2), !l0Var2.f38120q0);
                                F.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) c9Var.run(4), false);
                            } else if (i13 == 1) {
                                if (!l0Var2.f38119p0) {
                                    F.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) c9Var.run(3), false);
                                    F.k();
                                }
                                if (l0Var2.f38118o0) {
                                    F.c(R.drawable.msg_arrow_forward, LocaleController.getString(R.string.WebForward), (Runnable) c9Var.run(9), false);
                                }
                                i2 instantViewLoader = l0Var2.getInstantViewLoader();
                                if (instantViewLoader != null && (((!instantViewLoader.f37966g || !instantViewLoader.f37967i) && instantViewLoader.h == null && instantViewLoader.f37968j == null && !instantViewLoader.f37964c) || instantViewLoader.b() != null)) {
                                    F.c(R.drawable.menu_instant_view, LocaleController.getString(R.string.OpenLocalInstantView), (Runnable) c9Var.run(10), false);
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
                                    r91 r91Var = new r91(28, y3, instantViewLoader);
                                    instantViewLoader.f37971m.add(r91Var);
                                    F.f28696p = new x1(2, instantViewLoader, r91Var);
                                }
                                F.c(R.drawable.msg_reset, LocaleController.getString(R.string.Refresh), (Runnable) c9Var.run(5), false);
                                F.c(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) c9Var.run(1), false);
                                F.c(R.drawable.msg_saved, LocaleController.getString(R.string.WebBookmark), (Runnable) c9Var.run(6), false);
                                F.c(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) c9Var.run(2), false);
                                F.k();
                                if (!f1.a(callback4).isEmpty()) {
                                    F.c(R.drawable.menu_views_recent, LocaleController.getString(R.string.WebHistory), (Runnable) c9Var.run(8), false);
                                }
                                F.c(R.drawable.menu_browser_bookmarks, LocaleController.getString(R.string.WebBookmarks), (Runnable) c9Var.run(7), false);
                                F.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) c9Var.run(4), false);
                            }
                            F.f28696p = new d1(l0Var2, 2);
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
        org.telegram.ui.Cells.z f04 = j6.f0(1090519039, 1, -1);
        this.S = f04;
        imageView3.setBackground(f04);
        imageView3.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
        zdVar2.addView(imageView3, a6.n(54, 56));
        ei.o oVar = new ei.o(context, 3);
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
                            y2 y2Var = l0Var2.f38127v0;
                            if (y2Var != null) {
                                y2Var.run(l0Var2.f38103b0.getText().toString());
                            }
                            l0Var2.k(false);
                        }
                        return false;
                }
            }
        });
        oVar.addTextChangedListener(new u2(l0Var, 15));
        frameLayout.addView(oVar, a6.e(-1, -1, 119));
        ei.o oVar2 = new ei.o(context, 4);
        this.f38103b0 = oVar2;
        oVar2.setVisibility(8);
        oVar2.setAlpha(0.0f);
        oVar2.setTextSize(1, 15.66f);
        oVar2.setSingleLine(true);
        this.f38105c0 = SharedConfig.searchEngineType;
        oVar2.setHint(LocaleController.formatString(R.string.AddressPlaceholder, o1.a().f38031a));
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
                            y2 y2Var = l0Var2.f38127v0;
                            if (y2Var != null) {
                                y2Var.run(l0Var2.f38103b0.getText().toString());
                            }
                            l0Var2.k(false);
                        }
                        return false;
                }
            }
        });
        frameLayout2.addView(oVar2, a6.d(-1, -1.0f, 119, 48.0f, 0.0f, 12.0f, 0.0f));
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
                        org.telegram.ui.l0 l0Var2 = l0Var;
                        if (l0Var2.getParent() instanceof ViewGroup) {
                            c9 c9Var = new c9(l0Var2, 2);
                            Utilities.Callback callback2 = null;
                            w70 F = w70.F((ViewGroup) l0Var2.getParent(), null, l0Var2.R);
                            F.f28701s = 0;
                            F.S(l0Var2.m0, l0Var2.f38117n0);
                            F.a0(0.0f, -AndroidUtilities.dp(52.0f));
                            F.S = 200;
                            int v = j6.v(l0Var2.f38115l0, j6.l1(0.1f, l0Var2.m0));
                            F.f28690l0 = Integer.valueOf(v);
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
                            if (AndroidUtilities.computePerceivedBrightness(l0Var2.f38115l0) > 0.721f) {
                                F.P(-1);
                                F.T(-986896);
                            } else {
                                F.P(-14737633);
                                F.T(-15592942);
                            }
                            int i13 = l0Var2.f38110g0;
                            if (i13 == 0) {
                                F.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) c9Var.run(3), false);
                                F.c(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) c9Var.run(1), false);
                                F.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) c9Var.run(2), !l0Var2.f38120q0);
                                F.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) c9Var.run(4), false);
                            } else if (i13 == 1) {
                                if (!l0Var2.f38119p0) {
                                    F.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) c9Var.run(3), false);
                                    F.k();
                                }
                                if (l0Var2.f38118o0) {
                                    F.c(R.drawable.msg_arrow_forward, LocaleController.getString(R.string.WebForward), (Runnable) c9Var.run(9), false);
                                }
                                i2 instantViewLoader = l0Var2.getInstantViewLoader();
                                if (instantViewLoader != null && (((!instantViewLoader.f37966g || !instantViewLoader.f37967i) && instantViewLoader.h == null && instantViewLoader.f37968j == null && !instantViewLoader.f37964c) || instantViewLoader.b() != null)) {
                                    F.c(R.drawable.menu_instant_view, LocaleController.getString(R.string.OpenLocalInstantView), (Runnable) c9Var.run(10), false);
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
                                    r91 r91Var = new r91(28, y3, instantViewLoader);
                                    instantViewLoader.f37971m.add(r91Var);
                                    F.f28696p = new x1(2, instantViewLoader, r91Var);
                                }
                                F.c(R.drawable.msg_reset, LocaleController.getString(R.string.Refresh), (Runnable) c9Var.run(5), false);
                                F.c(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) c9Var.run(1), false);
                                F.c(R.drawable.msg_saved, LocaleController.getString(R.string.WebBookmark), (Runnable) c9Var.run(6), false);
                                F.c(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) c9Var.run(2), false);
                                F.k();
                                if (!f1.a(callback4).isEmpty()) {
                                    F.c(R.drawable.menu_views_recent, LocaleController.getString(R.string.WebHistory), (Runnable) c9Var.run(8), false);
                                }
                                F.c(R.drawable.menu_browser_bookmarks, LocaleController.getString(R.string.WebBookmarks), (Runnable) c9Var.run(7), false);
                                F.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) c9Var.run(4), false);
                            }
                            F.f28696p = new d1(l0Var2, 2);
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
        addView(imageView4, a6.e(54, 56, 85));
        w80 w80Var = new w80(context);
        this.f38106d0 = w80Var;
        w80Var.setPivotX(0.0f);
        w80Var.setPivotY(AndroidUtilities.dp(2.0f));
        addView(w80Var, a6.e(-1, 2, 87));
        setWillNotDraw(false);
        this.f38102b[0] = new u1(l0Var);
        this.f38102b[1] = new u1(l0Var);
        int i11 = j6.Pk;
        d(j6.w0(null, i11, false), false);
        setMenuColors(j6.w0(null, i11, false));
    }

    public final void a(Canvas canvas, float f7, float f10, boolean z10) {
        float f11;
        float max = Math.max(AndroidUtilities.dp(0.66f), 1);
        float f12 = f7 - max;
        float width = getWidth() * this.f38104c;
        RectF rectF = this.f38100a;
        rectF.set(0.0f, 0.0f, getWidth(), f7);
        Paint[] paintArr = this.f38108f;
        int alpha = paintArr[1].getAlpha();
        paintArr[1].setAlpha((int) (alpha * 1.0f));
        canvas.drawRect(rectF, paintArr[1]);
        paintArr[1].setAlpha(alpha);
        float f13 = this.f38104c;
        float[] fArr = this.d;
        Paint[] paintArr2 = this.f38116n;
        Paint[] paintArr3 = this.h;
        if (f13 > 0.0f) {
            rectF.set(0.0f, 0.0f, fArr[1] * getWidth(), f7);
            int alpha2 = paintArr3[1].getAlpha();
            f11 = 1.0f;
            paintArr3[1].setAlpha((int) ((1.0f - this.f38101a0) * (1.0f - this.U) * alpha2 * 1.0f));
            canvas.drawRect(rectF, paintArr3[1]);
            paintArr3[1].setAlpha(alpha2);
            if (z10) {
                rectF.set(0.0f, f12, width, f12 + max);
                int alpha3 = paintArr2[1].getAlpha();
                paintArr2[1].setAlpha((int) ((1.0f - this.f38101a0) * alpha3 * 1.0f * f10));
                canvas.drawRect(rectF, paintArr2[1]);
                paintArr2[1].setAlpha(alpha3);
            }
        } else {
            f11 = 1.0f;
        }
        float f14 = this.f38104c;
        if (f14 < f11) {
            int l1 = j6.l1((f11 - f14) * f11, 1610612736);
            Paint paint = this.f38121r;
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
        paintArr3[0].setAlpha((int) ((f11 - this.f38101a0) * (f11 - this.U) * (f11 - Utilities.clamp01(this.f38104c * 4.0f)) * alpha5 * f11));
        canvas.drawRect(rectF, paintArr3[0]);
        paintArr3[0].setAlpha(alpha5);
        if (z10) {
            rectF.set(width, f12, getWidth() + width, max + f12);
            int alpha6 = paintArr2[0].getAlpha();
            paintArr2[0].setAlpha((int) ((f11 - this.f38101a0) * alpha6 * f11 * f10));
            canvas.drawRect(rectF, paintArr2[0]);
            paintArr2[0].setAlpha(alpha6);
        }
    }

    public final void b(int i10, int i11) {
        float f7;
        boolean[] zArr = this.e;
        boolean z10 = zArr[i10];
        Paint[] paintArr = this.f38108f;
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
        this.f38116n[i10].setColor(j6.v(i11, j6.l1(AndroidUtilities.lerp(0.14f, 0.24f, f7), d)));
        u1[] u1VarArr = this.f38102b;
        u1VarArr[i10].f38089a.r(d);
        u1VarArr[i10].d = j6.v(i11, j6.l1(0.6f, d));
        u1 u1Var = u1VarArr[i10];
        u1Var.f38090b.r(i0.a.d(u1VarArr[i10].f38091c.f22295c, u1Var.d, j6.w0(null, j6.f18162q7, false)));
        invalidate();
    }

    public final void c(final int i10, float f7, boolean z10) {
        final float f10;
        boolean[] zArr = this.e;
        if (zArr[2] && this.f38112i0 == i10) {
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
            this.f38128w = d;
            j6.l1(0.55f, d);
            this.f38112i0 = i10;
            this.f38130x = i0.a.d(f7, -1, -16777216);
            int d10 = i0.a.d(1.0f - f7, -1, -16777216);
            this.f38132y = d10;
            int i11 = this.f38130x;
            j4 j4Var = ((org.telegram.ui.l0) this).B0;
            l lVar = j4Var.f33909i0;
            if (lVar != null) {
                lVar.c(i11, d10);
            }
            this.f38123s.setColor(this.f38130x);
            this.v.setColor(j6.v(this.f38130x, j6.l1(AndroidUtilities.lerp(0.07f, 0.2f, f7), this.f38128w)));
            int l1 = j6.l1(0.6f, this.f38132y);
            ei.o oVar = this.f38103b0;
            oVar.setHintTextColor(l1);
            oVar.setTextColor(this.f38132y);
            oVar.setCursorColor(this.f38132y);
            oVar.setHandlesColor(this.f38132y);
            this.f38106d0.setProgressColor(j6.w0(null, j6.Rk, false));
            int d11 = i0.a.d(this.f38101a0, this.f38128w, this.f38132y);
            org.telegram.ui.ActionBar.i2 i2Var = this.M;
            i2Var.a(d11);
            i2Var.b(i0.a.d(this.f38101a0, this.f38128w, this.f38132y));
            int i12 = this.f38128w;
            t1 t1Var = this.P;
            t1Var.f19557c.setColor(i12);
            t1Var.invalidateSelf();
            int i13 = this.f38128w;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            this.R.setColorFilter(new PorterDuffColorFilter(i13, mode));
            this.O.setColorFilter(new PorterDuffColorFilter(this.f38128w, mode));
            this.J.setColorFilter(new PorterDuffColorFilter(this.f38128w, mode));
            int v = j6.v(i10, j6.l1(0.22f, this.f38128w));
            this.f38113j0 = v;
            j6.B1(this.N, v, true);
            j6.B1(this.Q, this.f38113j0, true);
            j6.B1(this.S, this.f38113j0, true);
            j6.B1(this.K, this.f38113j0, true);
            int l12 = j6.l1(0.6f, this.f38128w);
            ei.o oVar2 = this.V;
            oVar2.setHintTextColor(l12);
            oVar2.setTextColor(this.f38128w);
            oVar2.setCursorColor(this.f38128w);
            oVar2.setHandlesColor(this.f38128w);
            w3 w3Var = j4Var.K;
            if (w3Var != null) {
                w3Var.i();
            }
            invalidate();
            return;
        }
        ValueAnimator valueAnimator = this.f38114k0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i14 = this.f38112i0;
        this.f38111h0 = i14;
        if (AndroidUtilities.computePerceivedBrightness(i14) <= 0.721f) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        if (AndroidUtilities.computePerceivedBrightness(i10) > 0.721f) {
            f11 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f38114k0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                v1 v1Var = v1.this;
                v1Var.getClass();
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                v1Var.c(i0.a.d(floatValue, v1Var.f38111h0, i10), AndroidUtilities.lerp(f10, f11, floatValue), false);
            }
        });
        this.f38114k0.addListener(new o00(this, i10, f11, 1));
        this.f38114k0.start();
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
        if (this.f38107e0) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        a(canvas, i10 + this.F, 1.0f, this.f38124s0);
        float right = this.H.getRight();
        float left = this.I.getLeft();
        boolean z10 = this.f38107e0;
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
        float f11 = this.f38104c;
        u1[] u1VarArr = this.f38102b;
        if (f11 < 1.0f) {
            canvas.save();
            float width = (getWidth() * this.f38104c) - (Utilities.clamp01(this.f38104c * 2.0f) * AndroidUtilities.dp(30.0f));
            canvas.translate(right + width, f7);
            AndroidUtilities.lerp(1.0f, 0.5f, this.f38104c);
            u1VarArr[0].a(canvas, (left - right) - width, f10 - f7, (1.0f - this.U) * (1.0f - this.f38104c));
            canvas.restore();
        }
        if (this.f38104c > 0.0f) {
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getWidth() * this.f38104c, getHeight());
            canvas.translate(right, f7);
            canvas.translate((1.0f - this.f38104c) * AndroidUtilities.dp(-12.0f), 0.0f);
            float lerp = AndroidUtilities.lerp(1.0f, 0.5f, 1.0f - this.f38104c);
            float f12 = f10 - f7;
            canvas.scale(lerp, lerp, 0.0f, f12 / 2.0f);
            u1VarArr[1].a(canvas, left - right, f12, (1.0f - this.f38101a0) * (1.0f - this.U) * this.f38104c);
            canvas.restore();
        }
        float f13 = this.f38101a0;
        RectF rectF = this.f38100a;
        if (f13 > 0.0f) {
            Paint paint = this.f38123s;
            int alpha = paint.getAlpha();
            paint.setAlpha((int) (alpha * this.f38101a0));
            float width2 = getWidth();
            if (this.f38107e0) {
                i13 = AndroidUtilities.statusBarHeight;
            }
            canvas.drawRect(0.0f, 0.0f, width2, i13 + this.F, paint);
            paint.setAlpha(alpha);
            float f14 = (f7 + f10) / 2.0f;
            float dp = AndroidUtilities.dp(42.0f) / 2.0f;
            rectF.set(AndroidUtilities.dp(6.0f), f14 - dp, AndroidUtilities.lerp(left, getWidth() - AndroidUtilities.dp(6.0f), this.f38101a0), f14 + dp);
            Paint paint2 = this.v;
            int alpha2 = paint2.getAlpha();
            paint2.setAlpha((int) (alpha2 * this.f38101a0));
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
        q1 q1Var = this.f38134z0;
        if (action == 0) {
            this.A0 = false;
            AndroidUtilities.cancelRunOnUIThread(q1Var);
            if (motionEvent.getX() > this.H.getRight() && motionEvent.getX() < this.I.getLeft() && !this.T && !this.W) {
                this.f38131x0 = motionEvent.getX();
                motionEvent.getY();
                this.f38133y0 = System.currentTimeMillis();
                AndroidUtilities.runOnUIThread(q1Var, ViewConfiguration.getLongPressTimeout() * 0.8f);
            }
        } else if (motionEvent.getAction() == 2 && ((float) (System.currentTimeMillis() - this.f38133y0)) > ViewConfiguration.getLongPressTimeout() * 0.8f) {
            AndroidUtilities.cancelRunOnUIThread(q1Var);
            this.A0 = true;
            n3 n3Var = ((org.telegram.ui.l0) this).B0.f33920u0[0];
            float clamp01 = Utilities.clamp01(n3Var.getProgress() + ((motionEvent.getX() - this.f38131x0) / (getWidth() * 0.8f)));
            if (!n3Var.c() && n3Var.f() && (webView = n3Var.f35104f.getWebView()) != null) {
                webView.setScrollProgress(clamp01);
                n3Var.K.f0();
            }
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(q1Var);
            this.f38133y0 = 0L;
        }
        this.f38131x0 = motionEvent.getX();
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(int i10, boolean z10) {
        float f7;
        u1 u1Var = this.f38102b[i10];
        if (u1Var.e != z10) {
            u1Var.e = z10;
            d6 d6Var = u1Var.f38091c;
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
        u1[] u1VarArr = this.f38102b;
        CharSequence charSequence = u1VarArr[i10].f38090b.f25428g;
        if (charSequence != null && TextUtils.equals(charSequence.toString(), str)) {
            return;
        }
        u1VarArr[i10].f38090b.q(Emoji.replaceEmoji(str, u1VarArr[i10].f38090b.f25424a.getFontMetricsInt(), false), false, true);
    }

    public final void g(int i10, String str, boolean z10) {
        u1[] u1VarArr = this.f38102b;
        CharSequence charSequence = u1VarArr[i10].f38089a.f25428g;
        if (charSequence != null && TextUtils.equals(charSequence.toString(), str)) {
            return;
        }
        u1VarArr[i10].f38089a.q(Emoji.replaceEmoji(str, u1VarArr[i10].f38089a.f25424a.getFontMetricsInt(), false), z10, true);
    }

    public int getBackgroundColor() {
        return this.f38112i0;
    }

    public i2 getInstantViewLoader() {
        return null;
    }

    public int getTextColor() {
        return this.f38128w;
    }

    public String getTitle() {
        CharSequence charSequence = this.f38102b[0].f38089a.f25428g;
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
        ValueAnimator valueAnimator = this.f38125t0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.T = z10;
        ei.o oVar = this.V;
        boolean z11 = false;
        oVar.setVisibility(0);
        float f10 = 0.0f;
        if (!this.f38126u0 && !z10) {
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
        this.f38125t0 = ofFloat;
        ofFloat.addUpdateListener(new ai.a(this, 22));
        this.f38125t0.addListener(new iw0(8, this, z10));
        this.f38125t0.setInterpolator(wr.h);
        this.f38125t0.setDuration(320L);
        this.f38125t0.start();
        boolean z12 = !z10;
        AndroidUtilities.updateViewShow(this.O, z12, true, true);
        AndroidUtilities.updateViewShow(this.R, z12, true, true);
        if (oVar.length() > 0 && this.T) {
            z11 = true;
        }
        AndroidUtilities.updateViewShow(this.J, z11, true, true);
    }

    public final void i() {
        u1[] u1VarArr = this.f38102b;
        u1 u1Var = u1VarArr[0];
        u1VarArr[0] = u1VarArr[1];
        u1VarArr[1] = u1Var;
        float[] fArr = this.d;
        float f7 = fArr[0];
        fArr[0] = fArr[1];
        fArr[1] = f7;
        Paint[] paintArr = this.f38108f;
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
        if (this.f38107e0) {
            i12 = AndroidUtilities.statusBarHeight;
        } else {
            i12 = 0;
        }
        super.onMeasure(i10, em.C(56.0f, i12, 1073741824));
    }

    public void setBackButton(boolean z10) {
        float f7;
        this.f38126u0 = z10;
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
        this.f38126u0 = z10;
    }

    public void setHasForward(boolean z10) {
        this.f38118o0 = z10;
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
            this.f38106d0.setTranslationY(this.F - AndroidUtilities.dp(56.0f));
            invalidate();
        }
    }

    public void setIsLocal(boolean z10) {
        this.f38120q0 = z10;
    }

    public void setIsTonsite(boolean z10) {
        this.f38119p0 = z10;
    }

    public void setMenuColors(int i10) {
        double atan2;
        int i11;
        boolean z10 = false;
        double[] j3 = i5.j(i5.f17831a, i5.j(i5.f17833c, new double[]{Color.red(i10) / 255.0d, Color.green(i10) / 255.0d, Color.blue(i10) / 255.0d}));
        for (int i12 = 0; i12 < 3; i12++) {
            j3[i12] = Math.cbrt(j3[i12]);
        }
        double[] j10 = i5.j(i5.f17832b, j3);
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
        this.f38115l0 = i11;
        if (!z10) {
            i13 = -16777216;
        }
        this.m0 = i13;
        this.f38117n0 = j6.l1(0.6f, i13);
    }

    public void setMenuListener(Utilities.Callback<Integer> callback) {
        this.f38109f0 = callback;
    }

    public void setMenuType(int i10) {
        if (this.f38110g0 != i10) {
            this.f38110g0 = i10;
        }
    }

    public void setProgress(float f7) {
        this.d[0] = f7;
        invalidate();
    }

    public void setTransitionProgress(float f7) {
        this.f38104c = f7;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return true;
    }

    public void setIsLoaded(boolean z10) {
    }
}
