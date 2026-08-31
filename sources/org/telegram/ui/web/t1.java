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
import eg.s3;
import k7.c6;
import mh.ab;
import oh.f5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.z5;
import org.telegram.ui.h20;
import org.telegram.ui.l4;
import org.telegram.ui.mg1;
import org.telegram.ui.p3;
import org.telegram.ui.qd1;
import org.telegram.ui.sj0;
import org.telegram.ui.y3;
public abstract class t1 extends FrameLayout {
    public final TextPaint B;
    public int C;
    public float D;
    public final s3 E;
    public final s3 F;
    public final ImageView G;
    public final org.telegram.ui.Cells.z H;
    public final ImageView I;
    public final org.telegram.ui.ActionBar.i2 J;
    public final org.telegram.ui.Cells.z K;
    public final ImageView L;
    public final r1 M;
    public final org.telegram.ui.Cells.z N;
    public final ImageView O;
    public final org.telegram.ui.Cells.z P;
    public boolean Q;
    public float R;
    public final mh.m S;
    public boolean T;
    public float U;
    public final mh.m V;
    public int W;
    public final RectF f42699a;
    public final p80 f42700a0;
    public final s1[] f42701b;
    public boolean f42702b0;
    public float f42703c;
    public Utilities.Callback f42704c0;
    public final float[] d;
    public int f42705d0;
    public final boolean[] f42706e;
    public int f42707e0;
    public final Paint[] f42708f;
    public int f42709f0;
    public int f42710g0;
    public final Paint[] h;
    public ValueAnimator f42711h0;
    public int f42712i0;
    public int f42713j0;
    public int f42714k0;
    public boolean f42715l0;
    public boolean m0;
    public final Paint[] f42716n;
    public boolean f42717n0;
    public final h20 f42718o0;
    public boolean f42719p0;
    public ValueAnimator f42720q0;
    public final Paint f42721r;
    public boolean f42722r0;
    public final Paint f42723s;
    public lh.a1 f42724s0;
    public ValueAnimator f42725t0;
    public float f42726u0;
    public final Paint v;
    public long f42727v0;
    public int f42728w;
    public final o1 f42729w0;
    public int f42730x;
    public boolean f42731x0;
    public int f42732y;

    public t1(Context context) {
        super(context);
        this.f42699a = new RectF();
        this.f42701b = new s1[2];
        this.f42703c = 0.0f;
        this.d = new float[2];
        this.f42706e = new boolean[3];
        this.f42708f = new Paint[2];
        this.h = new Paint[2];
        this.f42716n = new Paint[2];
        this.f42721r = new Paint(1);
        this.f42723s = new Paint(1);
        this.v = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.B = textPaint;
        this.C = AndroidUtilities.dp(56.0f);
        this.D = 1.0f;
        this.R = 0.0f;
        this.U = 0.0f;
        this.f42705d0 = -1;
        this.f42718o0 = new h20();
        final org.telegram.ui.m0 m0Var = (org.telegram.ui.m0) this;
        this.f42729w0 = new o1(m0Var, 0);
        this.f42731x0 = false;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(18.33f));
        for (int i10 = 0; i10 < 2; i10++) {
            this.f42708f[i10] = new Paint(1);
            this.h[i10] = new Paint(1);
            this.f42716n[i10] = new Paint(1);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, c6.e(-1, 56, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        addView(frameLayout2, c6.e(-1, 56, 87));
        s3 s3Var = new s3(context, 9);
        this.E = s3Var;
        s3Var.setOrientation(0);
        addView(s3Var, c6.e(-2, 56, 83));
        ImageView imageView = new ImageView(context);
        this.I = imageView;
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2(false);
        this.J = i2Var;
        i2Var.f21458k = 200.0f;
        i2Var.c(1.0f, false);
        imageView.setImageDrawable(i2Var);
        org.telegram.ui.Cells.z f02 = k6.f0(1090519039, 1, -1);
        this.K = f02;
        imageView.setBackground(f02);
        s3Var.addView(imageView, c6.n(54, 56));
        s3 s3Var2 = new s3(context, 10);
        this.F = s3Var2;
        s3Var2.setOrientation(0);
        addView(s3Var2, c6.e(-2, 56, 85));
        ImageView imageView2 = new ImageView(context);
        this.L = imageView2;
        imageView2.setScaleType(scaleType);
        r1 r1Var = new r1(m0Var);
        this.M = r1Var;
        imageView2.setImageDrawable(r1Var);
        r1Var.f();
        org.telegram.ui.Cells.z f03 = k6.f0(1090519039, 1, -1);
        this.N = f03;
        imageView2.setBackground(f03);
        s3Var2.addView(imageView2, c6.n(54, 56));
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
                        org.telegram.ui.m0 m0Var2 = m0Var;
                        if (m0Var2.getParent() instanceof ViewGroup) {
                            eg.y yVar = new eg.y(m0Var2, 3);
                            Utilities.Callback callback2 = null;
                            q70 F = q70.F((ViewGroup) m0Var2.getParent(), null, m0Var2.O);
                            F.f30329s = 0;
                            F.S(m0Var2.f42713j0, m0Var2.f42714k0);
                            F.a0(0.0f, -AndroidUtilities.dp(52.0f));
                            F.S = 200;
                            int v = k6.v(m0Var2.f42712i0, k6.l1(0.1f, m0Var2.f42713j0));
                            F.f30318l0 = Integer.valueOf(v);
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
                            if (AndroidUtilities.computePerceivedBrightness(m0Var2.f42712i0) > 0.721f) {
                                F.P(-1);
                                F.T(-986896);
                            } else {
                                F.P(-14737633);
                                F.T(-15592942);
                            }
                            int i13 = m0Var2.f42705d0;
                            if (i13 == 0) {
                                F.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) yVar.run(3), false);
                                F.c(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) yVar.run(1), false);
                                F.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) yVar.run(2), !m0Var2.f42717n0);
                                F.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) yVar.run(4), false);
                            } else if (i13 == 1) {
                                if (!m0Var2.m0) {
                                    F.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) yVar.run(3), false);
                                    F.k();
                                }
                                if (m0Var2.f42715l0) {
                                    F.c(R.drawable.msg_arrow_forward, LocaleController.getString(R.string.WebForward), (Runnable) yVar.run(9), false);
                                }
                                f2 instantViewLoader = m0Var2.getInstantViewLoader();
                                if (instantViewLoader != null && (((!instantViewLoader.f42546g || !instantViewLoader.f42547i) && instantViewLoader.h == null && instantViewLoader.f42548j == null && !instantViewLoader.f42543c) || instantViewLoader.b() != null)) {
                                    F.c(R.drawable.menu_instant_view, LocaleController.getString(R.string.OpenLocalInstantView), (Runnable) yVar.run(10), false);
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
                                    mg1 mg1Var = new mg1(11, y10, instantViewLoader);
                                    instantViewLoader.f42551m.add(mg1Var);
                                    F.f30324p = new mg1(15, instantViewLoader, mg1Var);
                                }
                                F.c(R.drawable.msg_reset, LocaleController.getString(R.string.Refresh), (Runnable) yVar.run(5), false);
                                F.c(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) yVar.run(1), false);
                                F.c(R.drawable.msg_saved, LocaleController.getString(R.string.WebBookmark), (Runnable) yVar.run(6), false);
                                F.c(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) yVar.run(2), false);
                                F.k();
                                if (!c1.a(callback4).isEmpty()) {
                                    F.c(R.drawable.menu_views_recent, LocaleController.getString(R.string.WebHistory), (Runnable) yVar.run(8), false);
                                }
                                F.c(R.drawable.menu_browser_bookmarks, LocaleController.getString(R.string.WebBookmarks), (Runnable) yVar.run(7), false);
                                F.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) yVar.run(4), false);
                            }
                            F.f30324p = new sj0(m0Var2, 12);
                            F.Z();
                            return;
                        }
                        return;
                    default:
                        m0Var.S.setText("");
                        return;
                }
            }
        });
        org.telegram.ui.Cells.z f04 = k6.f0(1090519039, 1, -1);
        this.P = f04;
        imageView3.setBackground(f04);
        imageView3.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
        s3Var2.addView(imageView3, c6.n(54, 56));
        mh.m mVar = new mh.m(context, 3);
        this.S = mVar;
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
                                AndroidUtilities.hideKeyboard(m0Var.S);
                                return false;
                            }
                            return false;
                        }
                        return false;
                    default:
                        if (i11 == 2) {
                            org.telegram.ui.m0 m0Var2 = m0Var;
                            lh.a1 a1Var = m0Var2.f42724s0;
                            if (a1Var != null) {
                                a1Var.run(m0Var2.V.getText().toString());
                            }
                            m0Var2.k(false);
                        }
                        return false;
                }
            }
        });
        mVar.addTextChangedListener(new eh.c(m0Var, 15));
        frameLayout.addView(mVar, c6.e(-1, -1, 119));
        mh.m mVar2 = new mh.m(context, 4);
        this.V = mVar2;
        mVar2.setVisibility(8);
        mVar2.setAlpha(0.0f);
        mVar2.setTextSize(1, 15.66f);
        mVar2.setSingleLine(true);
        this.W = SharedConfig.searchEngineType;
        mVar2.setHint(LocaleController.formatString(R.string.AddressPlaceholder, m1.a().f42638a));
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
                                AndroidUtilities.hideKeyboard(m0Var.S);
                                return false;
                            }
                            return false;
                        }
                        return false;
                    default:
                        if (i11 == 2) {
                            org.telegram.ui.m0 m0Var2 = m0Var;
                            lh.a1 a1Var = m0Var2.f42724s0;
                            if (a1Var != null) {
                                a1Var.run(m0Var2.V.getText().toString());
                            }
                            m0Var2.k(false);
                        }
                        return false;
                }
            }
        });
        frameLayout2.addView(mVar2, c6.d(-1, -1.0f, 119, 48.0f, 0.0f, 12.0f, 0.0f));
        ImageView imageView4 = new ImageView(context);
        this.G = imageView4;
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(R.drawable.ic_close_white);
        org.telegram.ui.Cells.z f05 = k6.f0(1090519039, 1, -1);
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
                        org.telegram.ui.m0 m0Var2 = m0Var;
                        if (m0Var2.getParent() instanceof ViewGroup) {
                            eg.y yVar = new eg.y(m0Var2, 3);
                            Utilities.Callback callback2 = null;
                            q70 F = q70.F((ViewGroup) m0Var2.getParent(), null, m0Var2.O);
                            F.f30329s = 0;
                            F.S(m0Var2.f42713j0, m0Var2.f42714k0);
                            F.a0(0.0f, -AndroidUtilities.dp(52.0f));
                            F.S = 200;
                            int v = k6.v(m0Var2.f42712i0, k6.l1(0.1f, m0Var2.f42713j0));
                            F.f30318l0 = Integer.valueOf(v);
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
                            if (AndroidUtilities.computePerceivedBrightness(m0Var2.f42712i0) > 0.721f) {
                                F.P(-1);
                                F.T(-986896);
                            } else {
                                F.P(-14737633);
                                F.T(-15592942);
                            }
                            int i13 = m0Var2.f42705d0;
                            if (i13 == 0) {
                                F.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) yVar.run(3), false);
                                F.c(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) yVar.run(1), false);
                                F.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) yVar.run(2), !m0Var2.f42717n0);
                                F.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) yVar.run(4), false);
                            } else if (i13 == 1) {
                                if (!m0Var2.m0) {
                                    F.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) yVar.run(3), false);
                                    F.k();
                                }
                                if (m0Var2.f42715l0) {
                                    F.c(R.drawable.msg_arrow_forward, LocaleController.getString(R.string.WebForward), (Runnable) yVar.run(9), false);
                                }
                                f2 instantViewLoader = m0Var2.getInstantViewLoader();
                                if (instantViewLoader != null && (((!instantViewLoader.f42546g || !instantViewLoader.f42547i) && instantViewLoader.h == null && instantViewLoader.f42548j == null && !instantViewLoader.f42543c) || instantViewLoader.b() != null)) {
                                    F.c(R.drawable.menu_instant_view, LocaleController.getString(R.string.OpenLocalInstantView), (Runnable) yVar.run(10), false);
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
                                    mg1 mg1Var = new mg1(11, y10, instantViewLoader);
                                    instantViewLoader.f42551m.add(mg1Var);
                                    F.f30324p = new mg1(15, instantViewLoader, mg1Var);
                                }
                                F.c(R.drawable.msg_reset, LocaleController.getString(R.string.Refresh), (Runnable) yVar.run(5), false);
                                F.c(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) yVar.run(1), false);
                                F.c(R.drawable.msg_saved, LocaleController.getString(R.string.WebBookmark), (Runnable) yVar.run(6), false);
                                F.c(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) yVar.run(2), false);
                                F.k();
                                if (!c1.a(callback4).isEmpty()) {
                                    F.c(R.drawable.menu_views_recent, LocaleController.getString(R.string.WebHistory), (Runnable) yVar.run(8), false);
                                }
                                F.c(R.drawable.menu_browser_bookmarks, LocaleController.getString(R.string.WebBookmarks), (Runnable) yVar.run(7), false);
                                F.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) yVar.run(4), false);
                            }
                            F.f30324p = new sj0(m0Var2, 12);
                            F.Z();
                            return;
                        }
                        return;
                    default:
                        m0Var.S.setText("");
                        return;
                }
            }
        });
        addView(imageView4, c6.e(54, 56, 85));
        p80 p80Var = new p80(context);
        this.f42700a0 = p80Var;
        p80Var.setPivotX(0.0f);
        p80Var.setPivotY(AndroidUtilities.dp(2.0f));
        addView(p80Var, c6.e(-1, 2, 87));
        setWillNotDraw(false);
        this.f42701b[0] = new s1(m0Var);
        this.f42701b[1] = new s1(m0Var);
        int i11 = k6.Pk;
        d(k6.w0(null, i11, false), false);
        setMenuColors(k6.w0(null, i11, false));
    }

    public final void a(Canvas canvas, float f10, float f11, boolean z4) {
        float f12;
        float max = Math.max(AndroidUtilities.dp(0.66f), 1);
        float f13 = f10 - max;
        float width = getWidth() * this.f42703c;
        RectF rectF = this.f42699a;
        rectF.set(0.0f, 0.0f, getWidth(), f10);
        Paint[] paintArr = this.f42708f;
        int alpha = paintArr[1].getAlpha();
        paintArr[1].setAlpha((int) (alpha * 1.0f));
        canvas.drawRect(rectF, paintArr[1]);
        paintArr[1].setAlpha(alpha);
        float f14 = this.f42703c;
        float[] fArr = this.d;
        Paint[] paintArr2 = this.f42716n;
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
        float f15 = this.f42703c;
        if (f15 < f12) {
            int l1 = k6.l1((f12 - f15) * f12, 1610612736);
            Paint paint = this.f42721r;
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
        paintArr3[0].setAlpha((int) ((f12 - this.U) * (f12 - this.R) * (f12 - Utilities.clamp01(this.f42703c * 4.0f)) * alpha5 * f12));
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
        boolean[] zArr = this.f42706e;
        boolean z4 = zArr[i10];
        Paint[] paintArr = this.f42708f;
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
        this.h[i10].setColor(k6.v(i11, k6.l1(AndroidUtilities.lerp(0.07f, 0.2f, f10), d)));
        this.f42716n[i10].setColor(k6.v(i11, k6.l1(AndroidUtilities.lerp(0.14f, 0.24f, f10), d)));
        s1[] s1VarArr = this.f42701b;
        s1VarArr[i10].f42688a.r(d);
        s1VarArr[i10].d = k6.v(i11, k6.l1(0.6f, d));
        s1 s1Var = s1VarArr[i10];
        s1Var.f42689b.r(i0.a.d(s1VarArr[i10].f42690c.f33725c, s1Var.d, k6.w0(null, k6.f21895q7, false)));
        invalidate();
    }

    public final void c(final int i10, float f10, boolean z4) {
        final float f11;
        boolean[] zArr = this.f42706e;
        if (zArr[2] && this.f42709f0 == i10) {
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
            this.f42728w = d;
            k6.l1(0.55f, d);
            this.f42709f0 = i10;
            this.f42730x = i0.a.d(f10, -1, -16777216);
            int d10 = i0.a.d(1.0f - f10, -1, -16777216);
            this.f42732y = d10;
            int i11 = this.f42730x;
            l4 l4Var = ((org.telegram.ui.m0) this).f38927y0;
            k kVar = l4Var.f38608f0;
            if (kVar != null) {
                kVar.c(i11, d10);
            }
            this.f42723s.setColor(this.f42730x);
            this.v.setColor(k6.v(this.f42730x, k6.l1(AndroidUtilities.lerp(0.07f, 0.2f, f10), this.f42728w)));
            int l1 = k6.l1(0.6f, this.f42732y);
            mh.m mVar = this.V;
            mVar.setHintTextColor(l1);
            mVar.setTextColor(this.f42732y);
            mVar.setCursorColor(this.f42732y);
            mVar.setHandlesColor(this.f42732y);
            this.f42700a0.setProgressColor(k6.w0(null, k6.Rk, false));
            int d11 = i0.a.d(this.U, this.f42728w, this.f42732y);
            org.telegram.ui.ActionBar.i2 i2Var = this.J;
            i2Var.a(d11);
            i2Var.b(i0.a.d(this.U, this.f42728w, this.f42732y));
            int i12 = this.f42728w;
            r1 r1Var = this.M;
            r1Var.f23204c.setColor(i12);
            r1Var.invalidateSelf();
            int i13 = this.f42728w;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            this.O.setColorFilter(new PorterDuffColorFilter(i13, mode));
            this.L.setColorFilter(new PorterDuffColorFilter(this.f42728w, mode));
            this.G.setColorFilter(new PorterDuffColorFilter(this.f42728w, mode));
            int v = k6.v(i10, k6.l1(0.22f, this.f42728w));
            this.f42710g0 = v;
            k6.B1(this.K, v, true);
            k6.B1(this.N, this.f42710g0, true);
            k6.B1(this.P, this.f42710g0, true);
            k6.B1(this.H, this.f42710g0, true);
            int l12 = k6.l1(0.6f, this.f42728w);
            mh.m mVar2 = this.S;
            mVar2.setHintTextColor(l12);
            mVar2.setTextColor(this.f42728w);
            mVar2.setCursorColor(this.f42728w);
            mVar2.setHandlesColor(this.f42728w);
            y3 y3Var = l4Var.H;
            if (y3Var != null) {
                y3Var.i();
            }
            invalidate();
            return;
        }
        ValueAnimator valueAnimator = this.f42711h0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i14 = this.f42709f0;
        this.f42707e0 = i14;
        if (AndroidUtilities.computePerceivedBrightness(i14) <= 0.721f) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        if (AndroidUtilities.computePerceivedBrightness(i10) > 0.721f) {
            f12 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f42711h0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                t1 t1Var = t1.this;
                t1Var.getClass();
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                t1Var.c(i0.a.d(floatValue, t1Var.f42707e0, i10), AndroidUtilities.lerp(f11, f12, floatValue), false);
            }
        });
        this.f42711h0.addListener(new ab(this, i10, f12, 2));
        this.f42711h0.start();
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
        if (this.f42702b0) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        a(canvas, i10 + this.C, 1.0f, this.f42719p0);
        float right = this.E.getRight();
        float left = this.F.getLeft();
        boolean z4 = this.f42702b0;
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
        float f12 = this.f42703c;
        s1[] s1VarArr = this.f42701b;
        if (f12 < 1.0f) {
            canvas.save();
            float width = (getWidth() * this.f42703c) - (Utilities.clamp01(this.f42703c * 2.0f) * AndroidUtilities.dp(30.0f));
            canvas.translate(right + width, f10);
            AndroidUtilities.lerp(1.0f, 0.5f, this.f42703c);
            s1VarArr[0].a(canvas, (left - right) - width, f11 - f10, (1.0f - this.R) * (1.0f - this.f42703c));
            canvas.restore();
        }
        if (this.f42703c > 0.0f) {
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getWidth() * this.f42703c, getHeight());
            canvas.translate(right, f10);
            canvas.translate((1.0f - this.f42703c) * AndroidUtilities.dp(-12.0f), 0.0f);
            float lerp = AndroidUtilities.lerp(1.0f, 0.5f, 1.0f - this.f42703c);
            float f13 = f11 - f10;
            canvas.scale(lerp, lerp, 0.0f, f13 / 2.0f);
            s1VarArr[1].a(canvas, left - right, f13, (1.0f - this.U) * (1.0f - this.R) * this.f42703c);
            canvas.restore();
        }
        float f14 = this.U;
        RectF rectF = this.f42699a;
        if (f14 > 0.0f) {
            Paint paint = this.f42723s;
            int alpha = paint.getAlpha();
            paint.setAlpha((int) (alpha * this.U));
            float width2 = getWidth();
            if (this.f42702b0) {
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
        x0 webView;
        int action = motionEvent.getAction();
        o1 o1Var = this.f42729w0;
        if (action == 0) {
            this.f42731x0 = false;
            AndroidUtilities.cancelRunOnUIThread(o1Var);
            if (motionEvent.getX() > this.E.getRight() && motionEvent.getX() < this.F.getLeft() && !this.Q && !this.T) {
                this.f42726u0 = motionEvent.getX();
                motionEvent.getY();
                this.f42727v0 = System.currentTimeMillis();
                AndroidUtilities.runOnUIThread(o1Var, ViewConfiguration.getLongPressTimeout() * 0.8f);
            }
        } else if (motionEvent.getAction() == 2 && ((float) (System.currentTimeMillis() - this.f42727v0)) > ViewConfiguration.getLongPressTimeout() * 0.8f) {
            AndroidUtilities.cancelRunOnUIThread(o1Var);
            this.f42731x0 = true;
            p3 p3Var = ((org.telegram.ui.m0) this).f38927y0.f38619r0[0];
            float clamp01 = Utilities.clamp01(p3Var.getProgress() + ((motionEvent.getX() - this.f42726u0) / (getWidth() * 0.8f)));
            if (!p3Var.c() && p3Var.f() && (webView = p3Var.f39907f.getWebView()) != null) {
                webView.setScrollProgress(clamp01);
                p3Var.H.f0();
            }
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(o1Var);
            this.f42727v0 = 0L;
        }
        this.f42726u0 = motionEvent.getX();
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(int i10, boolean z4) {
        float f10;
        s1 s1Var = this.f42701b[i10];
        if (s1Var.f42691e != z4) {
            s1Var.f42691e = z4;
            z5 z5Var = s1Var.f42690c;
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
        s1[] s1VarArr = this.f42701b;
        CharSequence charSequence = s1VarArr[i10].f42689b.f28033g;
        if (charSequence != null && TextUtils.equals(charSequence.toString(), str)) {
            return;
        }
        s1VarArr[i10].f42689b.q(Emoji.replaceEmoji(str, s1VarArr[i10].f42689b.f28028a.getFontMetricsInt(), false), false, true);
    }

    public final void g(int i10, String str, boolean z4) {
        s1[] s1VarArr = this.f42701b;
        CharSequence charSequence = s1VarArr[i10].f42688a.f28033g;
        if (charSequence != null && TextUtils.equals(charSequence.toString(), str)) {
            return;
        }
        s1VarArr[i10].f42688a.q(Emoji.replaceEmoji(str, s1VarArr[i10].f42688a.f28028a.getFontMetricsInt(), false), z4, true);
    }

    public int getBackgroundColor() {
        return this.f42709f0;
    }

    public f2 getInstantViewLoader() {
        return null;
    }

    public int getTextColor() {
        return this.f42728w;
    }

    public String getTitle() {
        CharSequence charSequence = this.f42701b[0].f42688a.f28033g;
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
        ValueAnimator valueAnimator = this.f42720q0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.Q = z4;
        mh.m mVar = this.S;
        boolean z10 = false;
        mVar.setVisibility(0);
        float f11 = 0.0f;
        if (!this.f42722r0 && !z4) {
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
        this.f42720q0 = ofFloat;
        ofFloat.addUpdateListener(new f5(this, 9));
        this.f42720q0.addListener(new qd1(2, this, z4));
        this.f42720q0.setInterpolator(pr.h);
        this.f42720q0.setDuration(320L);
        this.f42720q0.start();
        boolean z11 = !z4;
        AndroidUtilities.updateViewShow(this.L, z11, true, true);
        AndroidUtilities.updateViewShow(this.O, z11, true, true);
        if (mVar.length() > 0 && this.Q) {
            z10 = true;
        }
        AndroidUtilities.updateViewShow(this.G, z10, true, true);
    }

    public final void i() {
        s1[] s1VarArr = this.f42701b;
        s1 s1Var = s1VarArr[0];
        s1VarArr[0] = s1VarArr[1];
        s1VarArr[1] = s1Var;
        float[] fArr = this.d;
        float f10 = fArr[0];
        fArr[0] = fArr[1];
        fArr[1] = f10;
        Paint[] paintArr = this.f42708f;
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
        if (this.f42702b0) {
            i12 = AndroidUtilities.statusBarHeight;
        } else {
            i12 = 0;
        }
        super.onMeasure(i10, org.telegram.ui.b.B(56.0f, i12, 1073741824));
    }

    public void setBackButton(boolean z4) {
        float f10;
        this.f42722r0 = z4;
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
        this.f42722r0 = z4;
    }

    public void setHasForward(boolean z4) {
        this.f42715l0 = z4;
    }

    public void setHeight(int i10) {
        if (this.C != i10) {
            this.C = i10;
            float pow = (float) Math.pow(i10 / AndroidUtilities.dp(56.0f), 0.5d);
            this.D = pow;
            s3 s3Var = this.E;
            s3Var.setScaleX(pow);
            s3Var.setScaleY(this.D);
            s3Var.setTranslationX((1.0f - this.D) * AndroidUtilities.dp(42.0f));
            s3Var.setTranslationY((1.0f - this.D) * AndroidUtilities.dp(-12.0f));
            float f10 = this.D;
            s3 s3Var2 = this.F;
            s3Var2.setScaleX(f10);
            s3Var2.setScaleY(this.D);
            s3Var2.setTranslationX((1.0f - this.D) * (-AndroidUtilities.dp(42.0f)));
            s3Var2.setTranslationY((1.0f - this.D) * AndroidUtilities.dp(-12.0f));
            this.f42700a0.setTranslationY(this.C - AndroidUtilities.dp(56.0f));
            invalidate();
        }
    }

    public void setIsLocal(boolean z4) {
        this.f42717n0 = z4;
    }

    public void setIsTonsite(boolean z4) {
        this.m0 = z4;
    }

    public void setMenuColors(int i10) {
        double atan2;
        int i11;
        boolean z4 = false;
        double[] j10 = i5.j(i5.f21463a, i5.j(i5.f21465c, new double[]{Color.red(i10) / 255.0d, Color.green(i10) / 255.0d, Color.blue(i10) / 255.0d}));
        for (int i12 = 0; i12 < 3; i12++) {
            j10[i12] = Math.cbrt(j10[i12]);
        }
        double[] j11 = i5.j(i5.f21464b, j10);
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
        this.f42712i0 = i11;
        if (!z4) {
            i13 = -16777216;
        }
        this.f42713j0 = i13;
        this.f42714k0 = k6.l1(0.6f, i13);
    }

    public void setMenuListener(Utilities.Callback<Integer> callback) {
        this.f42704c0 = callback;
    }

    public void setMenuType(int i10) {
        if (this.f42705d0 != i10) {
            this.f42705d0 = i10;
        }
    }

    public void setProgress(float f10) {
        this.d[0] = f10;
        invalidate();
    }

    public void setTransitionProgress(float f10) {
        this.f42703c = f10;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return true;
    }

    public void setIsLoaded(boolean z4) {
    }
}
