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
import bi.v2;
import di.w7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.sk;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.t00;
import org.telegram.ui.b31;
import org.telegram.ui.ee;
import org.telegram.ui.i50;
import org.telegram.ui.k4;
import org.telegram.ui.o3;
import org.telegram.ui.p20;
import org.telegram.ui.x3;
import w7.z5;
public abstract class v1 extends FrameLayout {
    public boolean A0;
    public final TextPaint E;
    public int F;
    public float G;
    public final ee H;
    public final ee I;
    public final ImageView J;
    public final org.telegram.ui.Cells.z K;
    public final ImageView L;
    public final org.telegram.ui.ActionBar.f2 M;
    public final org.telegram.ui.Cells.z N;
    public final ImageView O;
    public final t1 P;
    public final org.telegram.ui.Cells.z Q;
    public final ImageView R;
    public final org.telegram.ui.Cells.z S;
    public boolean T;
    public float U;
    public final gi.o V;
    public boolean W;
    public final RectF f41201a;
    public float f41202a0;
    public final u1[] f41203b;
    public final gi.o f41204b0;
    public float f41205c;
    public int f41206c0;
    public final float[] d;
    public final n90 f41207d0;
    public final boolean[] e;
    public boolean f41208e0;
    public final Paint[] f41209f;
    public Utilities.Callback f41210f0;
    public int f41211g0;
    public final Paint[] h;
    public int f41212h0;
    public int f41213i0;
    public int f41214j0;
    public ValueAnimator f41215k0;
    public int f41216l0;
    public int m0;
    public final Paint[] f41217n;
    public int f41218n0;
    public boolean f41219o0;
    public boolean f41220p0;
    public boolean f41221q0;
    public final Paint f41222r;
    public final p20 f41223r0;
    public final Paint f41224s;
    public boolean f41225s0;
    public ValueAnimator f41226t0;
    public boolean f41227u0;
    public final Paint v;
    public v2 f41228v0;
    public int f41229w;
    public ValueAnimator f41230w0;
    public int f41231x;
    public float f41232x0;
    public int f41233y;
    public long f41234y0;
    public final q1 f41235z0;

    public v1(Context context) {
        super(context);
        this.f41201a = new RectF();
        this.f41203b = new u1[2];
        this.f41205c = 0.0f;
        this.d = new float[2];
        this.e = new boolean[3];
        this.f41209f = new Paint[2];
        this.h = new Paint[2];
        this.f41217n = new Paint[2];
        this.f41222r = new Paint(1);
        this.f41224s = new Paint(1);
        this.v = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.E = textPaint;
        this.F = AndroidUtilities.dp(56.0f);
        this.G = 1.0f;
        this.U = 0.0f;
        this.f41202a0 = 0.0f;
        this.f41211g0 = -1;
        this.f41223r0 = new p20();
        final org.telegram.ui.m0 m0Var = (org.telegram.ui.m0) this;
        this.f41235z0 = new q1(m0Var, 0);
        this.A0 = false;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(18.33f));
        for (int i10 = 0; i10 < 2; i10++) {
            this.f41209f[i10] = new Paint(1);
            this.h[i10] = new Paint(1);
            this.f41217n[i10] = new Paint(1);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, z5.e(-1, 56, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        addView(frameLayout2, z5.e(-1, 56, 87));
        ee eeVar = new ee(context, 6);
        this.H = eeVar;
        eeVar.setOrientation(0);
        addView(eeVar, z5.e(-2, 56, 83));
        ImageView imageView = new ImageView(context);
        this.L = imageView;
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2(false);
        this.M = f2Var;
        f2Var.f19481k = 200.0f;
        f2Var.c(1.0f, false);
        imageView.setImageDrawable(f2Var);
        org.telegram.ui.Cells.z g02 = g6.g0(1090519039, 1, -1);
        this.N = g02;
        imageView.setBackground(g02);
        eeVar.addView(imageView, z5.n(54, 56));
        ee eeVar2 = new ee(context, 7);
        this.I = eeVar2;
        eeVar2.setOrientation(0);
        addView(eeVar2, z5.e(-2, 56, 85));
        ImageView imageView2 = new ImageView(context);
        this.O = imageView2;
        imageView2.setScaleType(scaleType);
        t1 t1Var = new t1(m0Var);
        this.P = t1Var;
        imageView2.setImageDrawable(t1Var);
        t1Var.f();
        org.telegram.ui.Cells.z g03 = g6.g0(1090519039, 1, -1);
        this.Q = g03;
        imageView2.setBackground(g03);
        eeVar2.addView(imageView2, z5.n(54, 56));
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
                            w7 w7Var = new w7(m0Var2, 2);
                            Utilities.Callback callback2 = null;
                            l80 F = l80.F((ViewGroup) m0Var2.getParent(), null, m0Var2.R);
                            F.f26668s = 0;
                            F.S(m0Var2.m0, m0Var2.f41218n0);
                            F.a0(0.0f, -AndroidUtilities.dp(52.0f));
                            F.S = 200;
                            int v = g6.v(m0Var2.f41216l0, g6.m1(0.1f, m0Var2.m0));
                            F.f26657l0 = Integer.valueOf(v);
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
                            if (AndroidUtilities.computePerceivedBrightness(m0Var2.f41216l0) > 0.721f) {
                                F.P(-1);
                                F.T(-986896);
                            } else {
                                F.P(-14737633);
                                F.T(-15592942);
                            }
                            int i13 = m0Var2.f41211g0;
                            if (i13 == 0) {
                                F.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) w7Var.run(3), false);
                                F.c(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) w7Var.run(1), false);
                                F.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) w7Var.run(2), !m0Var2.f41221q0);
                                F.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) w7Var.run(4), false);
                            } else if (i13 == 1) {
                                if (!m0Var2.f41220p0) {
                                    F.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) w7Var.run(3), false);
                                    F.k();
                                }
                                if (m0Var2.f41219o0) {
                                    F.c(R.drawable.msg_arrow_forward, LocaleController.getString(R.string.WebForward), (Runnable) w7Var.run(9), false);
                                }
                                g2 instantViewLoader = m0Var2.getInstantViewLoader();
                                if (instantViewLoader != null && (((!instantViewLoader.f41046g || !instantViewLoader.f41047i) && instantViewLoader.h == null && instantViewLoader.f41048j == null && !instantViewLoader.f41044c) || instantViewLoader.b() != null)) {
                                    F.c(R.drawable.menu_instant_view, LocaleController.getString(R.string.OpenLocalInstantView), (Runnable) w7Var.run(10), false);
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
                                    v vVar = new v(4, y3, instantViewLoader);
                                    instantViewLoader.f41051m.add(vVar);
                                    F.f26663p = new v(8, instantViewLoader, vVar);
                                }
                                F.c(R.drawable.msg_reset, LocaleController.getString(R.string.Refresh), (Runnable) w7Var.run(5), false);
                                F.c(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) w7Var.run(1), false);
                                F.c(R.drawable.msg_saved, LocaleController.getString(R.string.WebBookmark), (Runnable) w7Var.run(6), false);
                                F.c(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) w7Var.run(2), false);
                                F.k();
                                if (!e1.a(callback4).isEmpty()) {
                                    F.c(R.drawable.menu_views_recent, LocaleController.getString(R.string.WebHistory), (Runnable) w7Var.run(8), false);
                                }
                                F.c(R.drawable.menu_browser_bookmarks, LocaleController.getString(R.string.WebBookmarks), (Runnable) w7Var.run(7), false);
                                F.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) w7Var.run(4), false);
                            }
                            F.f26663p = new b31(m0Var2);
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
        org.telegram.ui.Cells.z g04 = g6.g0(1090519039, 1, -1);
        this.S = g04;
        imageView3.setBackground(g04);
        imageView3.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
        eeVar2.addView(imageView3, z5.n(54, 56));
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
                                AndroidUtilities.hideKeyboard(m0Var.V);
                                return false;
                            }
                            return false;
                        }
                        return false;
                    default:
                        if (i11 == 2) {
                            org.telegram.ui.m0 m0Var2 = m0Var;
                            v2 v2Var = m0Var2.f41228v0;
                            if (v2Var != null) {
                                v2Var.run(m0Var2.f41204b0.getText().toString());
                            }
                            m0Var2.k(false);
                        }
                        return false;
                }
            }
        });
        oVar.addTextChangedListener(new di.h2(m0Var, 18));
        frameLayout.addView(oVar, z5.e(-1, -1, 119));
        gi.o oVar2 = new gi.o(context, 4);
        this.f41204b0 = oVar2;
        oVar2.setVisibility(8);
        oVar2.setAlpha(0.0f);
        oVar2.setTextSize(1, 15.66f);
        oVar2.setSingleLine(true);
        this.f41206c0 = SharedConfig.searchEngineType;
        oVar2.setHint(LocaleController.formatString(R.string.AddressPlaceholder, o1.a().f41144a));
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
                            v2 v2Var = m0Var2.f41228v0;
                            if (v2Var != null) {
                                v2Var.run(m0Var2.f41204b0.getText().toString());
                            }
                            m0Var2.k(false);
                        }
                        return false;
                }
            }
        });
        frameLayout2.addView(oVar2, z5.a(-1.0f, 48.0f, 0.0f, 12.0f, 0.0f, -1, 119));
        ImageView imageView4 = new ImageView(context);
        this.J = imageView4;
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(R.drawable.ic_close_white);
        org.telegram.ui.Cells.z g05 = g6.g0(1090519039, 1, -1);
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
                            w7 w7Var = new w7(m0Var2, 2);
                            Utilities.Callback callback2 = null;
                            l80 F = l80.F((ViewGroup) m0Var2.getParent(), null, m0Var2.R);
                            F.f26668s = 0;
                            F.S(m0Var2.m0, m0Var2.f41218n0);
                            F.a0(0.0f, -AndroidUtilities.dp(52.0f));
                            F.S = 200;
                            int v = g6.v(m0Var2.f41216l0, g6.m1(0.1f, m0Var2.m0));
                            F.f26657l0 = Integer.valueOf(v);
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
                            if (AndroidUtilities.computePerceivedBrightness(m0Var2.f41216l0) > 0.721f) {
                                F.P(-1);
                                F.T(-986896);
                            } else {
                                F.P(-14737633);
                                F.T(-15592942);
                            }
                            int i13 = m0Var2.f41211g0;
                            if (i13 == 0) {
                                F.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) w7Var.run(3), false);
                                F.c(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) w7Var.run(1), false);
                                F.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) w7Var.run(2), !m0Var2.f41221q0);
                                F.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) w7Var.run(4), false);
                            } else if (i13 == 1) {
                                if (!m0Var2.f41220p0) {
                                    F.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) w7Var.run(3), false);
                                    F.k();
                                }
                                if (m0Var2.f41219o0) {
                                    F.c(R.drawable.msg_arrow_forward, LocaleController.getString(R.string.WebForward), (Runnable) w7Var.run(9), false);
                                }
                                g2 instantViewLoader = m0Var2.getInstantViewLoader();
                                if (instantViewLoader != null && (((!instantViewLoader.f41046g || !instantViewLoader.f41047i) && instantViewLoader.h == null && instantViewLoader.f41048j == null && !instantViewLoader.f41044c) || instantViewLoader.b() != null)) {
                                    F.c(R.drawable.menu_instant_view, LocaleController.getString(R.string.OpenLocalInstantView), (Runnable) w7Var.run(10), false);
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
                                    v vVar = new v(4, y3, instantViewLoader);
                                    instantViewLoader.f41051m.add(vVar);
                                    F.f26663p = new v(8, instantViewLoader, vVar);
                                }
                                F.c(R.drawable.msg_reset, LocaleController.getString(R.string.Refresh), (Runnable) w7Var.run(5), false);
                                F.c(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) w7Var.run(1), false);
                                F.c(R.drawable.msg_saved, LocaleController.getString(R.string.WebBookmark), (Runnable) w7Var.run(6), false);
                                F.c(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) w7Var.run(2), false);
                                F.k();
                                if (!e1.a(callback4).isEmpty()) {
                                    F.c(R.drawable.menu_views_recent, LocaleController.getString(R.string.WebHistory), (Runnable) w7Var.run(8), false);
                                }
                                F.c(R.drawable.menu_browser_bookmarks, LocaleController.getString(R.string.WebBookmarks), (Runnable) w7Var.run(7), false);
                                F.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) w7Var.run(4), false);
                            }
                            F.f26663p = new b31(m0Var2);
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
        n90 n90Var = new n90(context);
        this.f41207d0 = n90Var;
        n90Var.setPivotX(0.0f);
        n90Var.setPivotY(AndroidUtilities.dp(2.0f));
        addView(n90Var, z5.e(-1, 2, 87));
        setWillNotDraw(false);
        this.f41203b[0] = new u1(m0Var);
        this.f41203b[1] = new u1(m0Var);
        int i11 = g6.Pk;
        d(g6.x0(null, i11, false), false);
        setMenuColors(g6.x0(null, i11, false));
    }

    public final void a(Canvas canvas, float f7, float f10, boolean z10) {
        float f11;
        float max = Math.max(AndroidUtilities.dp(0.66f), 1);
        float f12 = f7 - max;
        float width = getWidth() * this.f41205c;
        RectF rectF = this.f41201a;
        rectF.set(0.0f, 0.0f, getWidth(), f7);
        Paint[] paintArr = this.f41209f;
        int alpha = paintArr[1].getAlpha();
        paintArr[1].setAlpha((int) (alpha * 1.0f));
        canvas.drawRect(rectF, paintArr[1]);
        paintArr[1].setAlpha(alpha);
        int i10 = (this.f41205c > 0.0f ? 1 : (this.f41205c == 0.0f ? 0 : -1));
        float[] fArr = this.d;
        Paint[] paintArr2 = this.f41217n;
        Paint[] paintArr3 = this.h;
        if (i10 > 0) {
            rectF.set(0.0f, 0.0f, fArr[1] * getWidth(), f7);
            int alpha2 = paintArr3[1].getAlpha();
            f11 = 1.0f;
            paintArr3[1].setAlpha((int) ((1.0f - this.f41202a0) * (1.0f - this.U) * alpha2 * 1.0f));
            canvas.drawRect(rectF, paintArr3[1]);
            paintArr3[1].setAlpha(alpha2);
            if (z10) {
                rectF.set(0.0f, f12, width, f12 + max);
                int alpha3 = paintArr2[1].getAlpha();
                paintArr2[1].setAlpha((int) ((1.0f - this.f41202a0) * alpha3 * 1.0f * f10));
                canvas.drawRect(rectF, paintArr2[1]);
                paintArr2[1].setAlpha(alpha3);
            }
        } else {
            f11 = 1.0f;
        }
        float f13 = this.f41205c;
        if (f13 < f11) {
            int m12 = g6.m1((f11 - f13) * f11, 1610612736);
            Paint paint = this.f41222r;
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
        paintArr3[0].setAlpha((int) ((f11 - this.f41202a0) * (f11 - this.U) * (f11 - Utilities.clamp01(this.f41205c * 4.0f)) * alpha5 * f11));
        canvas.drawRect(rectF, paintArr3[0]);
        paintArr3[0].setAlpha(alpha5);
        if (z10) {
            rectF.set(width, f12, getWidth() + width, max + f12);
            int alpha6 = paintArr2[0].getAlpha();
            paintArr2[0].setAlpha((int) ((f11 - this.f41202a0) * alpha6 * f11 * f10));
            canvas.drawRect(rectF, paintArr2[0]);
            paintArr2[0].setAlpha(alpha6);
        }
    }

    public final void b(int i10, int i11) {
        float f7;
        boolean[] zArr = this.e;
        boolean z10 = zArr[i10];
        Paint[] paintArr = this.f41209f;
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
        this.h[i10].setColor(g6.v(i11, g6.m1(AndroidUtilities.lerp(0.07f, 0.2f, f7), d)));
        this.f41217n[i10].setColor(g6.v(i11, g6.m1(AndroidUtilities.lerp(0.14f, 0.24f, f7), d)));
        u1[] u1VarArr = this.f41203b;
        u1VarArr[i10].f41191a.u(d);
        u1VarArr[i10].d = g6.v(i11, g6.m1(0.6f, d));
        u1 u1Var = u1VarArr[i10];
        u1Var.f41192b.u(i0.a.d(u1VarArr[i10].f41193c.f24885c, u1Var.d, g6.x0(null, g6.f19839q7, false)));
        invalidate();
    }

    public final void c(final int i10, float f7, boolean z10) {
        final float f10;
        boolean[] zArr = this.e;
        if (zArr[2] && this.f41213i0 == i10) {
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
            this.f41229w = d;
            g6.m1(0.55f, d);
            this.f41213i0 = i10;
            this.f41231x = i0.a.d(f7, -1, -16777216);
            int d10 = i0.a.d(1.0f - f7, -1, -16777216);
            this.f41233y = d10;
            int i11 = this.f41231x;
            k4 k4Var = ((org.telegram.ui.m0) this).B0;
            k kVar = k4Var.f37267i0;
            if (kVar != null) {
                kVar.c(i11, d10);
            }
            this.f41224s.setColor(this.f41231x);
            this.v.setColor(g6.v(this.f41231x, g6.m1(AndroidUtilities.lerp(0.07f, 0.2f, f7), this.f41229w)));
            int m12 = g6.m1(0.6f, this.f41233y);
            gi.o oVar = this.f41204b0;
            oVar.setHintTextColor(m12);
            oVar.setTextColor(this.f41233y);
            oVar.setCursorColor(this.f41233y);
            oVar.setHandlesColor(this.f41233y);
            this.f41207d0.setProgressColor(g6.x0(null, g6.Rk, false));
            int d11 = i0.a.d(this.f41202a0, this.f41229w, this.f41233y);
            org.telegram.ui.ActionBar.f2 f2Var = this.M;
            f2Var.a(d11);
            f2Var.b(i0.a.d(this.f41202a0, this.f41229w, this.f41233y));
            int i12 = this.f41229w;
            t1 t1Var = this.P;
            t1Var.f21334c.setColor(i12);
            t1Var.invalidateSelf();
            int i13 = this.f41229w;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            this.R.setColorFilter(new PorterDuffColorFilter(i13, mode));
            this.O.setColorFilter(new PorterDuffColorFilter(this.f41229w, mode));
            this.J.setColorFilter(new PorterDuffColorFilter(this.f41229w, mode));
            int v = g6.v(i10, g6.m1(0.22f, this.f41229w));
            this.f41214j0 = v;
            g6.C1(this.N, v, true);
            g6.C1(this.Q, this.f41214j0, true);
            g6.C1(this.S, this.f41214j0, true);
            g6.C1(this.K, this.f41214j0, true);
            int m13 = g6.m1(0.6f, this.f41229w);
            gi.o oVar2 = this.V;
            oVar2.setHintTextColor(m13);
            oVar2.setTextColor(this.f41229w);
            oVar2.setCursorColor(this.f41229w);
            oVar2.setHandlesColor(this.f41229w);
            x3 x3Var = k4Var.K;
            if (x3Var != null) {
                x3Var.i();
            }
            invalidate();
            return;
        }
        ValueAnimator valueAnimator = this.f41215k0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i14 = this.f41213i0;
        this.f41212h0 = i14;
        if (AndroidUtilities.computePerceivedBrightness(i14) <= 0.721f) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        if (AndroidUtilities.computePerceivedBrightness(i10) > 0.721f) {
            f11 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f41215k0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                v1 v1Var = v1.this;
                v1Var.getClass();
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                v1Var.c(i0.a.d(floatValue, v1Var.f41212h0, i10), AndroidUtilities.lerp(f10, f11, floatValue), false);
            }
        });
        this.f41215k0.addListener(new t00(this, i10, f11, 1));
        this.f41215k0.start();
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
        if (this.f41208e0) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        a(canvas, i10 + this.F, 1.0f, this.f41225s0);
        float right = this.H.getRight();
        float left = this.I.getLeft();
        boolean z10 = this.f41208e0;
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
        int i14 = (this.f41205c > 1.0f ? 1 : (this.f41205c == 1.0f ? 0 : -1));
        u1[] u1VarArr = this.f41203b;
        if (i14 < 0) {
            canvas.save();
            float width = (getWidth() * this.f41205c) - (Utilities.clamp01(this.f41205c * 2.0f) * AndroidUtilities.dp(30.0f));
            canvas.translate(right + width, f7);
            AndroidUtilities.lerp(1.0f, 0.5f, this.f41205c);
            u1VarArr[0].a(canvas, (left - right) - width, f10 - f7, (1.0f - this.U) * (1.0f - this.f41205c));
            canvas.restore();
        }
        if (this.f41205c > 0.0f) {
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getWidth() * this.f41205c, getHeight());
            canvas.translate(right, f7);
            canvas.translate((1.0f - this.f41205c) * AndroidUtilities.dp(-12.0f), 0.0f);
            float lerp = AndroidUtilities.lerp(1.0f, 0.5f, 1.0f - this.f41205c);
            float f11 = f10 - f7;
            canvas.scale(lerp, lerp, 0.0f, f11 / 2.0f);
            u1VarArr[1].a(canvas, left - right, f11, (1.0f - this.f41202a0) * (1.0f - this.U) * this.f41205c);
            canvas.restore();
        }
        int i15 = (this.f41202a0 > 0.0f ? 1 : (this.f41202a0 == 0.0f ? 0 : -1));
        RectF rectF = this.f41201a;
        if (i15 > 0) {
            Paint paint = this.f41224s;
            int alpha = paint.getAlpha();
            paint.setAlpha((int) (alpha * this.f41202a0));
            float width2 = getWidth();
            if (this.f41208e0) {
                i13 = AndroidUtilities.statusBarHeight;
            }
            canvas.drawRect(0.0f, 0.0f, width2, i13 + this.F, paint);
            paint.setAlpha(alpha);
            float f12 = (f7 + f10) / 2.0f;
            float dp = AndroidUtilities.dp(42.0f) / 2.0f;
            rectF.set(AndroidUtilities.dp(6.0f), f12 - dp, AndroidUtilities.lerp(left, getWidth() - AndroidUtilities.dp(6.0f), this.f41202a0), f12 + dp);
            Paint paint2 = this.v;
            int alpha2 = paint2.getAlpha();
            paint2.setAlpha((int) (alpha2 * this.f41202a0));
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
        q1 q1Var = this.f41235z0;
        if (action == 0) {
            this.A0 = false;
            AndroidUtilities.cancelRunOnUIThread(q1Var);
            if (motionEvent.getX() > this.H.getRight() && motionEvent.getX() < this.I.getLeft() && !this.T && !this.W) {
                this.f41232x0 = motionEvent.getX();
                motionEvent.getY();
                this.f41234y0 = System.currentTimeMillis();
                AndroidUtilities.runOnUIThread(q1Var, ViewConfiguration.getLongPressTimeout() * 0.8f);
            }
        } else if (motionEvent.getAction() == 2 && ((float) (System.currentTimeMillis() - this.f41234y0)) > ViewConfiguration.getLongPressTimeout() * 0.8f) {
            AndroidUtilities.cancelRunOnUIThread(q1Var);
            this.A0 = true;
            o3 o3Var = ((org.telegram.ui.m0) this).B0.f37278u0[0];
            float clamp01 = Utilities.clamp01(o3Var.getProgress() + ((motionEvent.getX() - this.f41232x0) / (getWidth() * 0.8f)));
            if (!o3Var.c() && o3Var.f() && (webView = o3Var.f38531f.getWebView()) != null) {
                webView.setScrollProgress(clamp01);
                o3Var.K.f0();
            }
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(q1Var);
            this.f41234y0 = 0L;
        }
        this.f41232x0 = motionEvent.getX();
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(int i10, boolean z10) {
        float f7;
        u1 u1Var = this.f41203b[i10];
        if (u1Var.e != z10) {
            u1Var.e = z10;
            org.telegram.ui.Components.g6 g6Var = u1Var.f41193c;
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
        u1[] u1VarArr = this.f41203b;
        CharSequence charSequence = u1VarArr[i10].f41192b.f28440i;
        if (charSequence != null && TextUtils.equals(charSequence.toString(), str)) {
            return;
        }
        u1VarArr[i10].f41192b.t(Emoji.replaceEmoji(str, u1VarArr[i10].f41192b.f28433a.getFontMetricsInt(), false), false, true);
    }

    public final void g(int i10, String str, boolean z10) {
        u1[] u1VarArr = this.f41203b;
        CharSequence charSequence = u1VarArr[i10].f41191a.f28440i;
        if (charSequence != null && TextUtils.equals(charSequence.toString(), str)) {
            return;
        }
        u1VarArr[i10].f41191a.t(Emoji.replaceEmoji(str, u1VarArr[i10].f41191a.f28433a.getFontMetricsInt(), false), z10, true);
    }

    public int getBackgroundColor() {
        return this.f41213i0;
    }

    public g2 getInstantViewLoader() {
        return null;
    }

    public int getTextColor() {
        return this.f41229w;
    }

    public String getTitle() {
        CharSequence charSequence = this.f41203b[0].f41191a.f28440i;
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
        ValueAnimator valueAnimator = this.f41226t0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.T = z10;
        gi.o oVar = this.V;
        boolean z11 = false;
        oVar.setVisibility(0);
        float f10 = 0.0f;
        if (!this.f41227u0 && !z10) {
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
        this.f41226t0 = ofFloat;
        ofFloat.addUpdateListener(new ki.a(this, 7));
        this.f41226t0.addListener(new i50(13, this, z10));
        this.f41226t0.setInterpolator(es.h);
        this.f41226t0.setDuration(320L);
        this.f41226t0.start();
        boolean z12 = !z10;
        AndroidUtilities.updateViewShow(this.O, z12, true, true);
        AndroidUtilities.updateViewShow(this.R, z12, true, true);
        if (oVar.length() > 0 && this.T) {
            z11 = true;
        }
        AndroidUtilities.updateViewShow(this.J, z11, true, true);
    }

    public final void i() {
        u1[] u1VarArr = this.f41203b;
        u1 u1Var = u1VarArr[0];
        u1VarArr[0] = u1VarArr[1];
        u1VarArr[1] = u1Var;
        float[] fArr = this.d;
        float f7 = fArr[0];
        fArr[0] = fArr[1];
        fArr[1] = f7;
        Paint[] paintArr = this.f41209f;
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
        if (this.f41208e0) {
            i12 = AndroidUtilities.statusBarHeight;
        } else {
            i12 = 0;
        }
        super.onMeasure(i10, sk.C(56.0f, i12, 1073741824));
    }

    public void setBackButton(boolean z10) {
        float f7;
        this.f41227u0 = z10;
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
        this.f41227u0 = z10;
    }

    public void setHasForward(boolean z10) {
        this.f41219o0 = z10;
    }

    public void setHeight(int i10) {
        if (this.F != i10) {
            this.F = i10;
            float pow = (float) Math.pow(i10 / AndroidUtilities.dp(56.0f), 0.5d);
            this.G = pow;
            ee eeVar = this.H;
            eeVar.setScaleX(pow);
            eeVar.setScaleY(this.G);
            eeVar.setTranslationX((1.0f - this.G) * AndroidUtilities.dp(42.0f));
            eeVar.setTranslationY((1.0f - this.G) * AndroidUtilities.dp(-12.0f));
            float f7 = this.G;
            ee eeVar2 = this.I;
            eeVar2.setScaleX(f7);
            eeVar2.setScaleY(this.G);
            eeVar2.setTranslationX((1.0f - this.G) * (-AndroidUtilities.dp(42.0f)));
            eeVar2.setTranslationY((1.0f - this.G) * AndroidUtilities.dp(-12.0f));
            this.f41207d0.setTranslationY(this.F - AndroidUtilities.dp(56.0f));
            invalidate();
        }
    }

    public void setIsLocal(boolean z10) {
        this.f41221q0 = z10;
    }

    public void setIsTonsite(boolean z10) {
        this.f41220p0 = z10;
    }

    public void setMenuColors(int i10) {
        double atan2;
        int i11;
        boolean z10 = false;
        double[] j10 = e5.j(e5.f19442a, e5.j(e5.f19444c, new double[]{Color.red(i10) / 255.0d, Color.green(i10) / 255.0d, Color.blue(i10) / 255.0d}));
        for (int i12 = 0; i12 < 3; i12++) {
            j10[i12] = Math.cbrt(j10[i12]);
        }
        double[] j11 = e5.j(e5.f19443b, j10);
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
        this.f41216l0 = i11;
        if (!z10) {
            i13 = -16777216;
        }
        this.m0 = i13;
        this.f41218n0 = g6.m1(0.6f, i13);
    }

    public void setMenuListener(Utilities.Callback<Integer> callback) {
        this.f41210f0 = callback;
    }

    public void setMenuType(int i10) {
        if (this.f41211g0 != i10) {
            this.f41211g0 = i10;
        }
    }

    public void setProgress(float f7) {
        this.d[0] = f7;
        invalidate();
    }

    public void setTransitionProgress(float f7) {
        this.f41205c = f7;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return true;
    }

    public void setIsLoaded(boolean z10) {
    }
}
