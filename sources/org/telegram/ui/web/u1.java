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
import dg.u3;
import k7.b6;
import lh.ab;
import nh.e5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.o80;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.z5;
import org.telegram.ui.a4;
import org.telegram.ui.i20;
import org.telegram.ui.j21;
import org.telegram.ui.n4;
import org.telegram.ui.r3;
import org.telegram.ui.s61;
import org.telegram.ui.sg1;
public abstract class u1 extends FrameLayout {
    public final TextPaint B;
    public int C;
    public float D;
    public final u3 E;
    public final u3 F;
    public final ImageView G;
    public final org.telegram.ui.Cells.z H;
    public final ImageView I;
    public final org.telegram.ui.ActionBar.i2 J;
    public final org.telegram.ui.Cells.z K;
    public final ImageView L;
    public final s1 M;
    public final org.telegram.ui.Cells.z N;
    public final ImageView O;
    public final org.telegram.ui.Cells.z P;
    public boolean Q;
    public float R;
    public final lh.n S;
    public boolean T;
    public float U;
    public final lh.n V;
    public int W;
    public final RectF f39593a;
    public final o80 f39594a0;
    public final t1[] f39595b;
    public boolean f39596b0;
    public float f39597c;
    public Utilities.Callback f39598c0;
    public final float[] d;
    public int f39599d0;
    public final boolean[] e;
    public int f39600e0;
    public final Paint[] f39601f;
    public int f39602f0;
    public int f39603g0;
    public final Paint[] h;
    public ValueAnimator f39604h0;
    public int f39605i0;
    public int f39606j0;
    public int f39607k0;
    public boolean f39608l0;
    public boolean m0;
    public final Paint[] f39609n;
    public boolean f39610n0;
    public final i20 f39611o0;
    public boolean f39612p0;
    public ValueAnimator f39613q0;
    public final Paint f39614r;
    public boolean f39615r0;
    public final Paint f39616s;
    public kh.a1 f39617s0;
    public ValueAnimator f39618t0;
    public float f39619u0;
    public final Paint v;
    public long f39620v0;
    public int f39621w;
    public final p1 f39622w0;
    public int f39623x;
    public boolean f39624x0;
    public int f39625y;

    public u1(Context context) {
        super(context);
        this.f39593a = new RectF();
        this.f39595b = new t1[2];
        this.f39597c = 0.0f;
        this.d = new float[2];
        this.e = new boolean[3];
        this.f39601f = new Paint[2];
        this.h = new Paint[2];
        this.f39609n = new Paint[2];
        this.f39614r = new Paint(1);
        this.f39616s = new Paint(1);
        this.v = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.B = textPaint;
        this.C = AndroidUtilities.dp(56.0f);
        this.D = 1.0f;
        this.R = 0.0f;
        this.U = 0.0f;
        this.f39599d0 = -1;
        this.f39611o0 = new i20();
        final org.telegram.ui.o0 o0Var = (org.telegram.ui.o0) this;
        this.f39622w0 = new p1(o0Var, 0);
        this.f39624x0 = false;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(18.33f));
        for (int i10 = 0; i10 < 2; i10++) {
            this.f39601f[i10] = new Paint(1);
            this.h[i10] = new Paint(1);
            this.f39609n[i10] = new Paint(1);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, b6.e(-1, 56, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        addView(frameLayout2, b6.e(-1, 56, 87));
        u3 u3Var = new u3(context, 9);
        this.E = u3Var;
        u3Var.setOrientation(0);
        addView(u3Var, b6.e(-2, 56, 83));
        ImageView imageView = new ImageView(context);
        this.I = imageView;
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2(false);
        this.J = i2Var;
        i2Var.f19770k = 200.0f;
        i2Var.c(1.0f, false);
        imageView.setImageDrawable(i2Var);
        org.telegram.ui.Cells.z f02 = j6.f0(1090519039, 1, -1);
        this.K = f02;
        imageView.setBackground(f02);
        u3Var.addView(imageView, b6.n(54, 56));
        u3 u3Var2 = new u3(context, 10);
        this.F = u3Var2;
        u3Var2.setOrientation(0);
        addView(u3Var2, b6.e(-2, 56, 85));
        ImageView imageView2 = new ImageView(context);
        this.L = imageView2;
        imageView2.setScaleType(scaleType);
        s1 s1Var = new s1(o0Var);
        this.M = s1Var;
        imageView2.setImageDrawable(s1Var);
        s1Var.f();
        org.telegram.ui.Cells.z f03 = j6.f0(1090519039, 1, -1);
        this.N = f03;
        imageView2.setBackground(f03);
        u3Var2.addView(imageView2, b6.n(54, 56));
        ImageView imageView3 = new ImageView(context);
        this.O = imageView3;
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
                        boolean z4 = true;
                        org.telegram.ui.o0 o0Var2 = o0Var;
                        if (o0Var2.getParent() instanceof ViewGroup) {
                            dg.a0 a0Var = new dg.a0(o0Var2, 3);
                            Utilities.Callback callback2 = null;
                            p70 F = p70.F((ViewGroup) o0Var2.getParent(), null, o0Var2.O);
                            F.f27777s = 0;
                            F.S(o0Var2.f39606j0, o0Var2.f39607k0);
                            F.a0(0.0f, -AndroidUtilities.dp(52.0f));
                            F.S = 200;
                            int v = j6.v(o0Var2.f39605i0, j6.l1(0.1f, o0Var2.f39606j0));
                            F.f27766l0 = Integer.valueOf(v);
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
                                        View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.I.getChildAt(i12);
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
                            if (AndroidUtilities.computePerceivedBrightness(o0Var2.f39605i0) > 0.721f) {
                                F.P(-1);
                                F.T(-986896);
                            } else {
                                F.P(-14737633);
                                F.T(-15592942);
                            }
                            int i13 = o0Var2.f39599d0;
                            if (i13 == 0) {
                                F.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) a0Var.run(3), false);
                                F.c(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) a0Var.run(1), false);
                                F.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) a0Var.run(2), !o0Var2.f39610n0);
                                F.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) a0Var.run(4), false);
                            } else if (i13 == 1) {
                                if (!o0Var2.m0) {
                                    F.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) a0Var.run(3), false);
                                    F.k();
                                }
                                if (o0Var2.f39608l0) {
                                    F.c(R.drawable.msg_arrow_forward, LocaleController.getString(R.string.WebForward), (Runnable) a0Var.run(9), false);
                                }
                                f2 instantViewLoader = o0Var2.getInstantViewLoader();
                                if (instantViewLoader != null && (((!instantViewLoader.f39442g || !instantViewLoader.f39443i) && instantViewLoader.h == null && instantViewLoader.f39444j == null && !instantViewLoader.f39440c) || instantViewLoader.b() != null)) {
                                    F.c(R.drawable.menu_instant_view, LocaleController.getString(R.string.OpenLocalInstantView), (Runnable) a0Var.run(10), false);
                                    org.telegram.ui.ActionBar.g1 y10 = F.y();
                                    if (instantViewLoader.b() == null) {
                                        z4 = false;
                                    }
                                    y10.setEnabled(z4);
                                    if (y10.isEnabled()) {
                                        f10 = 1.0f;
                                    } else {
                                        f10 = 0.5f;
                                    }
                                    y10.setAlpha(f10);
                                    sg1 sg1Var = new sg1(12, y10, instantViewLoader);
                                    instantViewLoader.f39447m.add(sg1Var);
                                    F.f27772p = new sg1(16, instantViewLoader, sg1Var);
                                }
                                F.c(R.drawable.msg_reset, LocaleController.getString(R.string.Refresh), (Runnable) a0Var.run(5), false);
                                F.c(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) a0Var.run(1), false);
                                F.c(R.drawable.msg_saved, LocaleController.getString(R.string.WebBookmark), (Runnable) a0Var.run(6), false);
                                F.c(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) a0Var.run(2), false);
                                F.k();
                                if (!e1.a(callback4).isEmpty()) {
                                    F.c(R.drawable.menu_views_recent, LocaleController.getString(R.string.WebHistory), (Runnable) a0Var.run(8), false);
                                }
                                F.c(R.drawable.menu_browser_bookmarks, LocaleController.getString(R.string.WebBookmarks), (Runnable) a0Var.run(7), false);
                                F.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) a0Var.run(4), false);
                            }
                            F.f27772p = new j21(o0Var2, 10);
                            F.Z();
                            return;
                        }
                        return;
                    default:
                        o0Var.S.setText("");
                        return;
                }
            }
        });
        org.telegram.ui.Cells.z f04 = j6.f0(1090519039, 1, -1);
        this.P = f04;
        imageView3.setBackground(f04);
        imageView3.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
        u3Var2.addView(imageView3, b6.n(54, 56));
        lh.n nVar = new lh.n(context, 3);
        this.S = nVar;
        nVar.setVisibility(8);
        nVar.setAlpha(0.0f);
        nVar.setTextSize(1, 18.0f);
        nVar.setSingleLine(true);
        nVar.setHint(LocaleController.getString(R.string.Search));
        nVar.setBackgroundResource(0);
        nVar.setCursorWidth(1.5f);
        nVar.setGravity(112);
        nVar.setClipToPadding(true);
        nVar.setPadding(AndroidUtilities.dp(58.0f), 0, AndroidUtilities.dp(112.0f), 0);
        nVar.setTranslationY(-AndroidUtilities.dp(0.66f));
        nVar.setInputType(nVar.getInputType() | 524288);
        nVar.setImeOptions(33554435);
        nVar.setTextIsSelectable(false);
        nVar.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (keyEvent != null) {
                            if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                                AndroidUtilities.hideKeyboard(o0Var.S);
                                return false;
                            }
                            return false;
                        }
                        return false;
                    default:
                        if (i11 == 2) {
                            org.telegram.ui.o0 o0Var2 = o0Var;
                            kh.a1 a1Var = o0Var2.f39617s0;
                            if (a1Var != null) {
                                a1Var.run(o0Var2.V.getText().toString());
                            }
                            o0Var2.k(false);
                        }
                        return false;
                }
            }
        });
        nVar.addTextChangedListener(new dh.c(o0Var, 15));
        frameLayout.addView(nVar, b6.e(-1, -1, 119));
        lh.n nVar2 = new lh.n(context, 4);
        this.V = nVar2;
        nVar2.setVisibility(8);
        nVar2.setAlpha(0.0f);
        nVar2.setTextSize(1, 15.66f);
        nVar2.setSingleLine(true);
        this.W = SharedConfig.searchEngineType;
        nVar2.setHint(LocaleController.formatString(R.string.AddressPlaceholder, n1.a().f39536a));
        nVar2.setBackgroundResource(0);
        nVar2.setCursorWidth(1.5f);
        nVar2.setGravity(112);
        nVar2.setInputType(nVar2.getInputType() | 524288);
        nVar2.setImeOptions(33554434);
        nVar2.setTextIsSelectable(false);
        nVar2.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (keyEvent != null) {
                            if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                                AndroidUtilities.hideKeyboard(o0Var.S);
                                return false;
                            }
                            return false;
                        }
                        return false;
                    default:
                        if (i11 == 2) {
                            org.telegram.ui.o0 o0Var2 = o0Var;
                            kh.a1 a1Var = o0Var2.f39617s0;
                            if (a1Var != null) {
                                a1Var.run(o0Var2.V.getText().toString());
                            }
                            o0Var2.k(false);
                        }
                        return false;
                }
            }
        });
        frameLayout2.addView(nVar2, b6.d(-1, -1.0f, 119, 48.0f, 0.0f, 12.0f, 0.0f));
        ImageView imageView4 = new ImageView(context);
        this.G = imageView4;
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(R.drawable.ic_close_white);
        org.telegram.ui.Cells.z f05 = j6.f0(1090519039, 1, -1);
        this.H = f05;
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
                        boolean z4 = true;
                        org.telegram.ui.o0 o0Var2 = o0Var;
                        if (o0Var2.getParent() instanceof ViewGroup) {
                            dg.a0 a0Var = new dg.a0(o0Var2, 3);
                            Utilities.Callback callback2 = null;
                            p70 F = p70.F((ViewGroup) o0Var2.getParent(), null, o0Var2.O);
                            F.f27777s = 0;
                            F.S(o0Var2.f39606j0, o0Var2.f39607k0);
                            F.a0(0.0f, -AndroidUtilities.dp(52.0f));
                            F.S = 200;
                            int v = j6.v(o0Var2.f39605i0, j6.l1(0.1f, o0Var2.f39606j0));
                            F.f27766l0 = Integer.valueOf(v);
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
                                        View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.I.getChildAt(i12);
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
                            if (AndroidUtilities.computePerceivedBrightness(o0Var2.f39605i0) > 0.721f) {
                                F.P(-1);
                                F.T(-986896);
                            } else {
                                F.P(-14737633);
                                F.T(-15592942);
                            }
                            int i13 = o0Var2.f39599d0;
                            if (i13 == 0) {
                                F.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) a0Var.run(3), false);
                                F.c(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) a0Var.run(1), false);
                                F.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) a0Var.run(2), !o0Var2.f39610n0);
                                F.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) a0Var.run(4), false);
                            } else if (i13 == 1) {
                                if (!o0Var2.m0) {
                                    F.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) a0Var.run(3), false);
                                    F.k();
                                }
                                if (o0Var2.f39608l0) {
                                    F.c(R.drawable.msg_arrow_forward, LocaleController.getString(R.string.WebForward), (Runnable) a0Var.run(9), false);
                                }
                                f2 instantViewLoader = o0Var2.getInstantViewLoader();
                                if (instantViewLoader != null && (((!instantViewLoader.f39442g || !instantViewLoader.f39443i) && instantViewLoader.h == null && instantViewLoader.f39444j == null && !instantViewLoader.f39440c) || instantViewLoader.b() != null)) {
                                    F.c(R.drawable.menu_instant_view, LocaleController.getString(R.string.OpenLocalInstantView), (Runnable) a0Var.run(10), false);
                                    org.telegram.ui.ActionBar.g1 y10 = F.y();
                                    if (instantViewLoader.b() == null) {
                                        z4 = false;
                                    }
                                    y10.setEnabled(z4);
                                    if (y10.isEnabled()) {
                                        f10 = 1.0f;
                                    } else {
                                        f10 = 0.5f;
                                    }
                                    y10.setAlpha(f10);
                                    sg1 sg1Var = new sg1(12, y10, instantViewLoader);
                                    instantViewLoader.f39447m.add(sg1Var);
                                    F.f27772p = new sg1(16, instantViewLoader, sg1Var);
                                }
                                F.c(R.drawable.msg_reset, LocaleController.getString(R.string.Refresh), (Runnable) a0Var.run(5), false);
                                F.c(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) a0Var.run(1), false);
                                F.c(R.drawable.msg_saved, LocaleController.getString(R.string.WebBookmark), (Runnable) a0Var.run(6), false);
                                F.c(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) a0Var.run(2), false);
                                F.k();
                                if (!e1.a(callback4).isEmpty()) {
                                    F.c(R.drawable.menu_views_recent, LocaleController.getString(R.string.WebHistory), (Runnable) a0Var.run(8), false);
                                }
                                F.c(R.drawable.menu_browser_bookmarks, LocaleController.getString(R.string.WebBookmarks), (Runnable) a0Var.run(7), false);
                                F.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) a0Var.run(4), false);
                            }
                            F.f27772p = new j21(o0Var2, 10);
                            F.Z();
                            return;
                        }
                        return;
                    default:
                        o0Var.S.setText("");
                        return;
                }
            }
        });
        addView(imageView4, b6.e(54, 56, 85));
        o80 o80Var = new o80(context);
        this.f39594a0 = o80Var;
        o80Var.setPivotX(0.0f);
        o80Var.setPivotY(AndroidUtilities.dp(2.0f));
        addView(o80Var, b6.e(-1, 2, 87));
        setWillNotDraw(false);
        this.f39595b[0] = new t1(o0Var);
        this.f39595b[1] = new t1(o0Var);
        int i11 = j6.Pk;
        d(j6.w0(null, i11, false), false);
        setMenuColors(j6.w0(null, i11, false));
    }

    public final void a(Canvas canvas, float f10, float f11, boolean z4) {
        float f12;
        float max = Math.max(AndroidUtilities.dp(0.66f), 1);
        float f13 = f10 - max;
        float width = getWidth() * this.f39597c;
        RectF rectF = this.f39593a;
        rectF.set(0.0f, 0.0f, getWidth(), f10);
        Paint[] paintArr = this.f39601f;
        int alpha = paintArr[1].getAlpha();
        paintArr[1].setAlpha((int) (alpha * 1.0f));
        canvas.drawRect(rectF, paintArr[1]);
        paintArr[1].setAlpha(alpha);
        float f14 = this.f39597c;
        float[] fArr = this.d;
        Paint[] paintArr2 = this.f39609n;
        Paint[] paintArr3 = this.h;
        if (f14 > 0.0f) {
            rectF.set(0.0f, 0.0f, fArr[1] * getWidth(), f10);
            int alpha2 = paintArr3[1].getAlpha();
            f12 = 1.0f;
            paintArr3[1].setAlpha((int) ((1.0f - this.U) * (1.0f - this.R) * alpha2 * 1.0f));
            canvas.drawRect(rectF, paintArr3[1]);
            paintArr3[1].setAlpha(alpha2);
            if (z4) {
                rectF.set(0.0f, f13, width, f13 + max);
                int alpha3 = paintArr2[1].getAlpha();
                paintArr2[1].setAlpha((int) ((1.0f - this.U) * alpha3 * 1.0f * f11));
                canvas.drawRect(rectF, paintArr2[1]);
                paintArr2[1].setAlpha(alpha3);
            }
        } else {
            f12 = 1.0f;
        }
        float f15 = this.f39597c;
        if (f15 < f12) {
            int l1 = j6.l1((f12 - f15) * f12, 1610612736);
            Paint paint = this.f39614r;
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
        paintArr3[0].setAlpha((int) ((f12 - this.U) * (f12 - this.R) * (f12 - Utilities.clamp01(this.f39597c * 4.0f)) * alpha5 * f12));
        canvas.drawRect(rectF, paintArr3[0]);
        paintArr3[0].setAlpha(alpha5);
        if (z4) {
            rectF.set(width, f13, getWidth() + width, max + f13);
            int alpha6 = paintArr2[0].getAlpha();
            paintArr2[0].setAlpha((int) ((f12 - this.U) * alpha6 * f12 * f11));
            canvas.drawRect(rectF, paintArr2[0]);
            paintArr2[0].setAlpha(alpha6);
        }
    }

    public final void b(int i10, int i11) {
        float f10;
        boolean[] zArr = this.e;
        boolean z4 = zArr[i10];
        Paint[] paintArr = this.f39601f;
        if (z4 && paintArr[i10].getColor() == i11) {
            return;
        }
        zArr[i10] = true;
        paintArr[i10].setColor(i11);
        if (AndroidUtilities.computePerceivedBrightness(i11) <= 0.721f) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        int d = i0.a.d(f10, -16777216, -1);
        this.h[i10].setColor(j6.v(i11, j6.l1(AndroidUtilities.lerp(0.07f, 0.2f, f10), d)));
        this.f39609n[i10].setColor(j6.v(i11, j6.l1(AndroidUtilities.lerp(0.14f, 0.24f, f10), d)));
        t1[] t1VarArr = this.f39595b;
        t1VarArr[i10].f39583a.r(d);
        t1VarArr[i10].d = j6.v(i11, j6.l1(0.6f, d));
        t1 t1Var = t1VarArr[i10];
        t1Var.f39584b.r(i0.a.d(t1VarArr[i10].f39585c.f31253c, t1Var.d, j6.w0(null, j6.f20116q7, false)));
        invalidate();
    }

    public final void c(final int i10, float f10, boolean z4) {
        final float f11;
        boolean[] zArr = this.e;
        if (zArr[2] && this.f39602f0 == i10) {
            return;
        }
        final float f12 = 1.0f;
        if (!z4) {
            zArr[2] = true;
            if (f10 < 0.0f) {
                if (AndroidUtilities.computePerceivedBrightness(i10) <= 0.721f) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
            }
            int d = i0.a.d(f10, -16777216, -1);
            this.f39621w = d;
            j6.l1(0.55f, d);
            this.f39602f0 = i10;
            this.f39623x = i0.a.d(f10, -1, -16777216);
            int d10 = i0.a.d(1.0f - f10, -1, -16777216);
            this.f39625y = d10;
            int i11 = this.f39623x;
            n4 n4Var = ((org.telegram.ui.o0) this).f36611y0;
            k kVar = n4Var.f36364f0;
            if (kVar != null) {
                kVar.c(i11, d10);
            }
            this.f39616s.setColor(this.f39623x);
            this.v.setColor(j6.v(this.f39623x, j6.l1(AndroidUtilities.lerp(0.07f, 0.2f, f10), this.f39621w)));
            int l1 = j6.l1(0.6f, this.f39625y);
            lh.n nVar = this.V;
            nVar.setHintTextColor(l1);
            nVar.setTextColor(this.f39625y);
            nVar.setCursorColor(this.f39625y);
            nVar.setHandlesColor(this.f39625y);
            this.f39594a0.setProgressColor(j6.w0(null, j6.Rk, false));
            int d11 = i0.a.d(this.U, this.f39621w, this.f39625y);
            org.telegram.ui.ActionBar.i2 i2Var = this.J;
            i2Var.a(d11);
            i2Var.b(i0.a.d(this.U, this.f39621w, this.f39625y));
            int i12 = this.f39621w;
            s1 s1Var = this.M;
            s1Var.f21347c.setColor(i12);
            s1Var.invalidateSelf();
            int i13 = this.f39621w;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            this.O.setColorFilter(new PorterDuffColorFilter(i13, mode));
            this.L.setColorFilter(new PorterDuffColorFilter(this.f39621w, mode));
            this.G.setColorFilter(new PorterDuffColorFilter(this.f39621w, mode));
            int v = j6.v(i10, j6.l1(0.22f, this.f39621w));
            this.f39603g0 = v;
            j6.B1(this.K, v, true);
            j6.B1(this.N, this.f39603g0, true);
            j6.B1(this.P, this.f39603g0, true);
            j6.B1(this.H, this.f39603g0, true);
            int l12 = j6.l1(0.6f, this.f39621w);
            lh.n nVar2 = this.S;
            nVar2.setHintTextColor(l12);
            nVar2.setTextColor(this.f39621w);
            nVar2.setCursorColor(this.f39621w);
            nVar2.setHandlesColor(this.f39621w);
            a4 a4Var = n4Var.H;
            if (a4Var != null) {
                a4Var.i();
            }
            invalidate();
            return;
        }
        ValueAnimator valueAnimator = this.f39604h0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i14 = this.f39602f0;
        this.f39600e0 = i14;
        if (AndroidUtilities.computePerceivedBrightness(i14) <= 0.721f) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        if (AndroidUtilities.computePerceivedBrightness(i10) > 0.721f) {
            f12 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f39604h0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                u1 u1Var = u1.this;
                u1Var.getClass();
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                u1Var.c(i0.a.d(floatValue, u1Var.f39600e0, i10), AndroidUtilities.lerp(f11, f12, floatValue), false);
            }
        });
        this.f39604h0.addListener(new ab(this, i10, f12, 2));
        this.f39604h0.start();
    }

    public final void d(int i10, boolean z4) {
        c(i10, -1.0f, z4);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        if (this.f39596b0) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        a(canvas, i10 + this.C, 1.0f, this.f39612p0);
        float right = this.E.getRight();
        float left = this.F.getLeft();
        boolean z4 = this.f39596b0;
        if (z4) {
            i11 = AndroidUtilities.statusBarHeight;
        } else {
            i11 = 0;
        }
        float f10 = i11;
        if (z4) {
            i12 = AndroidUtilities.statusBarHeight;
        } else {
            i12 = 0;
        }
        float f11 = i12 + this.C;
        float f12 = this.f39597c;
        t1[] t1VarArr = this.f39595b;
        if (f12 < 1.0f) {
            canvas.save();
            float width = (getWidth() * this.f39597c) - (Utilities.clamp01(this.f39597c * 2.0f) * AndroidUtilities.dp(30.0f));
            canvas.translate(right + width, f10);
            AndroidUtilities.lerp(1.0f, 0.5f, this.f39597c);
            t1VarArr[0].a(canvas, (left - right) - width, f11 - f10, (1.0f - this.R) * (1.0f - this.f39597c));
            canvas.restore();
        }
        if (this.f39597c > 0.0f) {
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getWidth() * this.f39597c, getHeight());
            canvas.translate(right, f10);
            canvas.translate((1.0f - this.f39597c) * AndroidUtilities.dp(-12.0f), 0.0f);
            float lerp = AndroidUtilities.lerp(1.0f, 0.5f, 1.0f - this.f39597c);
            float f13 = f11 - f10;
            canvas.scale(lerp, lerp, 0.0f, f13 / 2.0f);
            t1VarArr[1].a(canvas, left - right, f13, (1.0f - this.U) * (1.0f - this.R) * this.f39597c);
            canvas.restore();
        }
        float f14 = this.U;
        RectF rectF = this.f39593a;
        if (f14 > 0.0f) {
            Paint paint = this.f39616s;
            int alpha = paint.getAlpha();
            paint.setAlpha((int) (alpha * this.U));
            float width2 = getWidth();
            if (this.f39596b0) {
                i13 = AndroidUtilities.statusBarHeight;
            }
            canvas.drawRect(0.0f, 0.0f, width2, i13 + this.C, paint);
            paint.setAlpha(alpha);
            float f15 = (f10 + f11) / 2.0f;
            float dp = AndroidUtilities.dp(42.0f) / 2.0f;
            rectF.set(AndroidUtilities.dp(6.0f), f15 - dp, AndroidUtilities.lerp(left, getWidth() - AndroidUtilities.dp(6.0f), this.U), f15 + dp);
            Paint paint2 = this.v;
            int alpha2 = paint2.getAlpha();
            paint2.setAlpha((int) (alpha2 * this.U));
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
        y0 webView;
        int action = motionEvent.getAction();
        p1 p1Var = this.f39622w0;
        if (action == 0) {
            this.f39624x0 = false;
            AndroidUtilities.cancelRunOnUIThread(p1Var);
            if (motionEvent.getX() > this.E.getRight() && motionEvent.getX() < this.F.getLeft() && !this.Q && !this.T) {
                this.f39619u0 = motionEvent.getX();
                motionEvent.getY();
                this.f39620v0 = System.currentTimeMillis();
                AndroidUtilities.runOnUIThread(p1Var, ViewConfiguration.getLongPressTimeout() * 0.8f);
            }
        } else if (motionEvent.getAction() == 2 && ((float) (System.currentTimeMillis() - this.f39620v0)) > ViewConfiguration.getLongPressTimeout() * 0.8f) {
            AndroidUtilities.cancelRunOnUIThread(p1Var);
            this.f39624x0 = true;
            r3 r3Var = ((org.telegram.ui.o0) this).f36611y0.f36375r0[0];
            float clamp01 = Utilities.clamp01(r3Var.getProgress() + ((motionEvent.getX() - this.f39619u0) / (getWidth() * 0.8f)));
            if (!r3Var.c() && r3Var.f() && (webView = r3Var.f37686f.getWebView()) != null) {
                webView.setScrollProgress(clamp01);
                r3Var.H.f0();
            }
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(p1Var);
            this.f39620v0 = 0L;
        }
        this.f39619u0 = motionEvent.getX();
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(int i10, boolean z4) {
        float f10;
        t1 t1Var = this.f39595b[i10];
        if (t1Var.e != z4) {
            t1Var.e = z4;
            z5 z5Var = t1Var.f39585c;
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            z5Var.d(f10, true);
            invalidate();
        }
    }

    public final void f(int i10, String str) {
        t1[] t1VarArr = this.f39595b;
        CharSequence charSequence = t1VarArr[i10].f39584b.f25850g;
        if (charSequence != null && TextUtils.equals(charSequence.toString(), str)) {
            return;
        }
        t1VarArr[i10].f39584b.q(Emoji.replaceEmoji(str, t1VarArr[i10].f39584b.f25846a.getFontMetricsInt(), false), false, true);
    }

    public final void g(int i10, String str, boolean z4) {
        t1[] t1VarArr = this.f39595b;
        CharSequence charSequence = t1VarArr[i10].f39583a.f25850g;
        if (charSequence != null && TextUtils.equals(charSequence.toString(), str)) {
            return;
        }
        t1VarArr[i10].f39583a.q(Emoji.replaceEmoji(str, t1VarArr[i10].f39583a.f25846a.getFontMetricsInt(), false), z4, true);
    }

    public int getBackgroundColor() {
        return this.f39602f0;
    }

    public f2 getInstantViewLoader() {
        return null;
    }

    public int getTextColor() {
        return this.f39621w;
    }

    public String getTitle() {
        CharSequence charSequence = this.f39595b[0].f39583a.f25850g;
        if (charSequence == null) {
            return "";
        }
        return charSequence.toString();
    }

    public final void h(boolean z4) {
        float f10;
        if (this.Q == z4) {
            return;
        }
        ValueAnimator valueAnimator = this.f39613q0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.Q = z4;
        lh.n nVar = this.S;
        boolean z10 = false;
        nVar.setVisibility(0);
        float f11 = 0.0f;
        if (!this.f39615r0 && !z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.J.c(f10, true);
        float f12 = this.R;
        if (z4) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
        this.f39613q0 = ofFloat;
        ofFloat.addUpdateListener(new e5(this, 10));
        this.f39613q0.addListener(new s61(4, this, z4));
        this.f39613q0.setInterpolator(mr.h);
        this.f39613q0.setDuration(320L);
        this.f39613q0.start();
        boolean z11 = !z4;
        AndroidUtilities.updateViewShow(this.L, z11, true, true);
        AndroidUtilities.updateViewShow(this.O, z11, true, true);
        if (nVar.length() > 0 && this.Q) {
            z10 = true;
        }
        AndroidUtilities.updateViewShow(this.G, z10, true, true);
    }

    public final void i() {
        t1[] t1VarArr = this.f39595b;
        t1 t1Var = t1VarArr[0];
        t1VarArr[0] = t1VarArr[1];
        t1VarArr[1] = t1Var;
        float[] fArr = this.d;
        float f10 = fArr[0];
        fArr[0] = fArr[1];
        fArr[1] = f10;
        Paint[] paintArr = this.f39601f;
        int color = paintArr[0].getColor();
        b(0, paintArr[1].getColor());
        b(1, color);
        invalidate();
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        if (this.f39596b0) {
            i12 = AndroidUtilities.statusBarHeight;
        } else {
            i12 = 0;
        }
        super.onMeasure(i10, org.telegram.ui.b.B(56.0f, i12, 1073741824));
    }

    public void setBackButton(boolean z4) {
        float f10;
        this.f39615r0 = z4;
        if (!this.Q && !this.T) {
            if (z4) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            this.J.c(f10, true);
        }
    }

    public void setBackButtonCached(boolean z4) {
        this.f39615r0 = z4;
    }

    public void setHasForward(boolean z4) {
        this.f39608l0 = z4;
    }

    public void setHeight(int i10) {
        if (this.C != i10) {
            this.C = i10;
            float pow = (float) Math.pow(i10 / AndroidUtilities.dp(56.0f), 0.5d);
            this.D = pow;
            u3 u3Var = this.E;
            u3Var.setScaleX(pow);
            u3Var.setScaleY(this.D);
            u3Var.setTranslationX((1.0f - this.D) * AndroidUtilities.dp(42.0f));
            u3Var.setTranslationY((1.0f - this.D) * AndroidUtilities.dp(-12.0f));
            float f10 = this.D;
            u3 u3Var2 = this.F;
            u3Var2.setScaleX(f10);
            u3Var2.setScaleY(this.D);
            u3Var2.setTranslationX((1.0f - this.D) * (-AndroidUtilities.dp(42.0f)));
            u3Var2.setTranslationY((1.0f - this.D) * AndroidUtilities.dp(-12.0f));
            this.f39594a0.setTranslationY(this.C - AndroidUtilities.dp(56.0f));
            invalidate();
        }
    }

    public void setIsLocal(boolean z4) {
        this.f39610n0 = z4;
    }

    public void setIsTonsite(boolean z4) {
        this.m0 = z4;
    }

    public void setMenuColors(int i10) {
        double atan2;
        int i11;
        boolean z4 = false;
        double[] j10 = h5.j(h5.f19733a, h5.j(h5.f19735c, new double[]{Color.red(i10) / 255.0d, Color.green(i10) / 255.0d, Color.blue(i10) / 255.0d}));
        for (int i12 = 0; i12 < 3; i12++) {
            j10[i12] = Math.cbrt(j10[i12]);
        }
        double[] j11 = h5.j(h5.f19734b, j10);
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
            z4 = true;
        }
        int i13 = -1;
        if (z4) {
            i11 = -16777216;
        } else {
            i11 = -1;
        }
        this.f39605i0 = i11;
        if (!z4) {
            i13 = -16777216;
        }
        this.f39606j0 = i13;
        this.f39607k0 = j6.l1(0.6f, i13);
    }

    public void setMenuListener(Utilities.Callback<Integer> callback) {
        this.f39598c0 = callback;
    }

    public void setMenuType(int i10) {
        if (this.f39599d0 != i10) {
            this.f39599d0 = i10;
        }
    }

    public void setProgress(float f10) {
        this.d[0] = f10;
        invalidate();
    }

    public void setTransitionProgress(float f10) {
        this.f39597c = f10;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return true;
    }

    public void setIsLoaded(boolean z4) {
    }
}
