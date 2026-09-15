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
import ci.a8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.wl;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.g5;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.qr;
import org.telegram.ui.h4;
import org.telegram.ui.h70;
import org.telegram.ui.l20;
import org.telegram.ui.l3;
import org.telegram.ui.n91;
import org.telegram.ui.nb1;
import org.telegram.ui.u3;
import org.telegram.ui.xd;
import w7.x5;
public abstract class v1 extends FrameLayout {
    public boolean A0;
    public final TextPaint E;
    public int F;
    public float G;
    public final xd H;
    public final xd I;
    public final ImageView J;
    public final org.telegram.ui.Cells.z K;
    public final ImageView L;
    public final org.telegram.ui.ActionBar.g2 M;
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
    public final RectF f39106a;
    public float f39107a0;
    public final u1[] f39108b;
    public final fi.o f39109b0;
    public float f39110c;
    public int f39111c0;
    public final float[] d;
    public final m80 f39112d0;
    public final boolean[] e;
    public boolean f39113e0;
    public final Paint[] f39114f;
    public Utilities.Callback f39115f0;
    public int f39116g0;
    public final Paint[] h;
    public int f39117h0;
    public int f39118i0;
    public int f39119j0;
    public ValueAnimator f39120k0;
    public int f39121l0;
    public int m0;
    public final Paint[] f39122n;
    public int f39123n0;
    public boolean f39124o0;
    public boolean f39125p0;
    public boolean f39126q0;
    public final Paint f39127r;
    public final l20 f39128r0;
    public final Paint f39129s;
    public boolean f39130s0;
    public ValueAnimator f39131t0;
    public boolean f39132u0;
    public final Paint v;
    public ci.m2 f39133v0;
    public int f39134w;
    public ValueAnimator f39135w0;
    public int f39136x;
    public float f39137x0;
    public int f39138y;
    public long f39139y0;
    public final q1 f39140z0;

    public v1(Context context) {
        super(context);
        this.f39106a = new RectF();
        this.f39108b = new u1[2];
        this.f39110c = 0.0f;
        this.d = new float[2];
        this.e = new boolean[3];
        this.f39114f = new Paint[2];
        this.h = new Paint[2];
        this.f39122n = new Paint[2];
        this.f39127r = new Paint(1);
        this.f39129s = new Paint(1);
        this.v = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.E = textPaint;
        this.F = AndroidUtilities.dp(56.0f);
        this.G = 1.0f;
        this.U = 0.0f;
        this.f39107a0 = 0.0f;
        this.f39116g0 = -1;
        this.f39128r0 = new l20();
        final org.telegram.ui.k0 k0Var = (org.telegram.ui.k0) this;
        this.f39140z0 = new q1(k0Var, 0);
        this.A0 = false;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(18.33f));
        for (int i10 = 0; i10 < 2; i10++) {
            this.f39114f[i10] = new Paint(1);
            this.h[i10] = new Paint(1);
            this.f39122n[i10] = new Paint(1);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, x5.e(-1, 56, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        addView(frameLayout2, x5.e(-1, 56, 87));
        xd xdVar = new xd(context, 6);
        this.H = xdVar;
        xdVar.setOrientation(0);
        addView(xdVar, x5.e(-2, 56, 83));
        ImageView imageView = new ImageView(context);
        this.L = imageView;
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
        this.M = g2Var;
        g2Var.f18684k = 200.0f;
        g2Var.c(1.0f, false);
        imageView.setImageDrawable(g2Var);
        org.telegram.ui.Cells.z f02 = i6.f0(1090519039, 1, -1);
        this.N = f02;
        imageView.setBackground(f02);
        xdVar.addView(imageView, x5.n(54, 56));
        xd xdVar2 = new xd(context, 7);
        this.I = xdVar2;
        xdVar2.setOrientation(0);
        addView(xdVar2, x5.e(-2, 56, 85));
        ImageView imageView2 = new ImageView(context);
        this.O = imageView2;
        imageView2.setScaleType(scaleType);
        t1 t1Var = new t1(k0Var);
        this.P = t1Var;
        imageView2.setImageDrawable(t1Var);
        t1Var.f();
        org.telegram.ui.Cells.z f03 = i6.f0(1090519039, 1, -1);
        this.Q = f03;
        imageView2.setBackground(f03);
        xdVar2.addView(imageView2, x5.n(54, 56));
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
                        org.telegram.ui.k0 k0Var2 = k0Var;
                        if (k0Var2.getParent() instanceof ViewGroup) {
                            a8 a8Var = new a8(k0Var2, 2);
                            Utilities.Callback callback2 = null;
                            n70 F = n70.F((ViewGroup) k0Var2.getParent(), null, k0Var2.R);
                            F.f26368s = 0;
                            F.S(k0Var2.m0, k0Var2.f39123n0);
                            F.a0(0.0f, -AndroidUtilities.dp(52.0f));
                            F.S = 200;
                            int v = i6.v(k0Var2.f39121l0, i6.l1(0.1f, k0Var2.m0));
                            F.f26357l0 = Integer.valueOf(v);
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
                            if (AndroidUtilities.computePerceivedBrightness(k0Var2.f39121l0) > 0.721f) {
                                F.P(-1);
                                F.T(-986896);
                            } else {
                                F.P(-14737633);
                                F.T(-15592942);
                            }
                            int i13 = k0Var2.f39116g0;
                            if (i13 == 0) {
                                F.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) a8Var.run(3), false);
                                F.c(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) a8Var.run(1), false);
                                F.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) a8Var.run(2), !k0Var2.f39126q0);
                                F.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) a8Var.run(4), false);
                            } else if (i13 == 1) {
                                if (!k0Var2.f39125p0) {
                                    F.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) a8Var.run(3), false);
                                    F.k();
                                }
                                if (k0Var2.f39124o0) {
                                    F.c(R.drawable.msg_arrow_forward, LocaleController.getString(R.string.WebForward), (Runnable) a8Var.run(9), false);
                                }
                                g2 instantViewLoader = k0Var2.getInstantViewLoader();
                                if (instantViewLoader != null && (((!instantViewLoader.f38953g || !instantViewLoader.f38954i) && instantViewLoader.h == null && instantViewLoader.f38955j == null && !instantViewLoader.f38951c) || instantViewLoader.b() != null)) {
                                    F.c(R.drawable.menu_instant_view, LocaleController.getString(R.string.OpenLocalInstantView), (Runnable) a8Var.run(10), false);
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
                                    nb1 nb1Var = new nb1(25, y3, instantViewLoader);
                                    instantViewLoader.f38958m.add(nb1Var);
                                    F.f26363p = new nb1(29, instantViewLoader, nb1Var);
                                }
                                F.c(R.drawable.msg_reset, LocaleController.getString(R.string.Refresh), (Runnable) a8Var.run(5), false);
                                F.c(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) a8Var.run(1), false);
                                F.c(R.drawable.msg_saved, LocaleController.getString(R.string.WebBookmark), (Runnable) a8Var.run(6), false);
                                F.c(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) a8Var.run(2), false);
                                F.k();
                                if (!f1.a(callback4).isEmpty()) {
                                    F.c(R.drawable.menu_views_recent, LocaleController.getString(R.string.WebHistory), (Runnable) a8Var.run(8), false);
                                }
                                F.c(R.drawable.menu_browser_bookmarks, LocaleController.getString(R.string.WebBookmarks), (Runnable) a8Var.run(7), false);
                                F.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) a8Var.run(4), false);
                            }
                            F.f26363p = new n91(k0Var2);
                            F.Z();
                            return;
                        }
                        return;
                    default:
                        k0Var.V.setText("");
                        return;
                }
            }
        });
        org.telegram.ui.Cells.z f04 = i6.f0(1090519039, 1, -1);
        this.S = f04;
        imageView3.setBackground(f04);
        imageView3.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
        xdVar2.addView(imageView3, x5.n(54, 56));
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
                                AndroidUtilities.hideKeyboard(k0Var.V);
                                return false;
                            }
                            return false;
                        }
                        return false;
                    default:
                        if (i11 == 2) {
                            org.telegram.ui.k0 k0Var2 = k0Var;
                            ci.m2 m2Var = k0Var2.f39133v0;
                            if (m2Var != null) {
                                m2Var.run(k0Var2.f39109b0.getText().toString());
                            }
                            k0Var2.k(false);
                        }
                        return false;
                }
            }
        });
        oVar.addTextChangedListener(new ci.i2(k0Var, 15));
        frameLayout.addView(oVar, x5.e(-1, -1, 119));
        fi.o oVar2 = new fi.o(context, 4);
        this.f39109b0 = oVar2;
        oVar2.setVisibility(8);
        oVar2.setAlpha(0.0f);
        oVar2.setTextSize(1, 15.66f);
        oVar2.setSingleLine(true);
        this.f39111c0 = SharedConfig.searchEngineType;
        oVar2.setHint(LocaleController.formatString(R.string.AddressPlaceholder, o1.a().f39046a));
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
                                AndroidUtilities.hideKeyboard(k0Var.V);
                                return false;
                            }
                            return false;
                        }
                        return false;
                    default:
                        if (i11 == 2) {
                            org.telegram.ui.k0 k0Var2 = k0Var;
                            ci.m2 m2Var = k0Var2.f39133v0;
                            if (m2Var != null) {
                                m2Var.run(k0Var2.f39109b0.getText().toString());
                            }
                            k0Var2.k(false);
                        }
                        return false;
                }
            }
        });
        frameLayout2.addView(oVar2, x5.d(-1, -1.0f, 119, 48.0f, 0.0f, 12.0f, 0.0f));
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
                        org.telegram.ui.k0 k0Var2 = k0Var;
                        if (k0Var2.getParent() instanceof ViewGroup) {
                            a8 a8Var = new a8(k0Var2, 2);
                            Utilities.Callback callback2 = null;
                            n70 F = n70.F((ViewGroup) k0Var2.getParent(), null, k0Var2.R);
                            F.f26368s = 0;
                            F.S(k0Var2.m0, k0Var2.f39123n0);
                            F.a0(0.0f, -AndroidUtilities.dp(52.0f));
                            F.S = 200;
                            int v = i6.v(k0Var2.f39121l0, i6.l1(0.1f, k0Var2.m0));
                            F.f26357l0 = Integer.valueOf(v);
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
                            if (AndroidUtilities.computePerceivedBrightness(k0Var2.f39121l0) > 0.721f) {
                                F.P(-1);
                                F.T(-986896);
                            } else {
                                F.P(-14737633);
                                F.T(-15592942);
                            }
                            int i13 = k0Var2.f39116g0;
                            if (i13 == 0) {
                                F.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) a8Var.run(3), false);
                                F.c(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) a8Var.run(1), false);
                                F.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) a8Var.run(2), !k0Var2.f39126q0);
                                F.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) a8Var.run(4), false);
                            } else if (i13 == 1) {
                                if (!k0Var2.f39125p0) {
                                    F.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) a8Var.run(3), false);
                                    F.k();
                                }
                                if (k0Var2.f39124o0) {
                                    F.c(R.drawable.msg_arrow_forward, LocaleController.getString(R.string.WebForward), (Runnable) a8Var.run(9), false);
                                }
                                g2 instantViewLoader = k0Var2.getInstantViewLoader();
                                if (instantViewLoader != null && (((!instantViewLoader.f38953g || !instantViewLoader.f38954i) && instantViewLoader.h == null && instantViewLoader.f38955j == null && !instantViewLoader.f38951c) || instantViewLoader.b() != null)) {
                                    F.c(R.drawable.menu_instant_view, LocaleController.getString(R.string.OpenLocalInstantView), (Runnable) a8Var.run(10), false);
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
                                    nb1 nb1Var = new nb1(25, y3, instantViewLoader);
                                    instantViewLoader.f38958m.add(nb1Var);
                                    F.f26363p = new nb1(29, instantViewLoader, nb1Var);
                                }
                                F.c(R.drawable.msg_reset, LocaleController.getString(R.string.Refresh), (Runnable) a8Var.run(5), false);
                                F.c(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) a8Var.run(1), false);
                                F.c(R.drawable.msg_saved, LocaleController.getString(R.string.WebBookmark), (Runnable) a8Var.run(6), false);
                                F.c(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) a8Var.run(2), false);
                                F.k();
                                if (!f1.a(callback4).isEmpty()) {
                                    F.c(R.drawable.menu_views_recent, LocaleController.getString(R.string.WebHistory), (Runnable) a8Var.run(8), false);
                                }
                                F.c(R.drawable.menu_browser_bookmarks, LocaleController.getString(R.string.WebBookmarks), (Runnable) a8Var.run(7), false);
                                F.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) a8Var.run(4), false);
                            }
                            F.f26363p = new n91(k0Var2);
                            F.Z();
                            return;
                        }
                        return;
                    default:
                        k0Var.V.setText("");
                        return;
                }
            }
        });
        addView(imageView4, x5.e(54, 56, 85));
        m80 m80Var = new m80(context);
        this.f39112d0 = m80Var;
        m80Var.setPivotX(0.0f);
        m80Var.setPivotY(AndroidUtilities.dp(2.0f));
        addView(m80Var, x5.e(-1, 2, 87));
        setWillNotDraw(false);
        this.f39108b[0] = new u1(k0Var);
        this.f39108b[1] = new u1(k0Var);
        int i11 = i6.Pk;
        d(i6.w0(null, i11, false), false);
        setMenuColors(i6.w0(null, i11, false));
    }

    public final void a(Canvas canvas, float f7, float f10, boolean z10) {
        float f11;
        float max = Math.max(AndroidUtilities.dp(0.66f), 1);
        float f12 = f7 - max;
        float width = getWidth() * this.f39110c;
        RectF rectF = this.f39106a;
        rectF.set(0.0f, 0.0f, getWidth(), f7);
        Paint[] paintArr = this.f39114f;
        int alpha = paintArr[1].getAlpha();
        paintArr[1].setAlpha((int) (alpha * 1.0f));
        canvas.drawRect(rectF, paintArr[1]);
        paintArr[1].setAlpha(alpha);
        float f13 = this.f39110c;
        float[] fArr = this.d;
        Paint[] paintArr2 = this.f39122n;
        Paint[] paintArr3 = this.h;
        if (f13 > 0.0f) {
            rectF.set(0.0f, 0.0f, fArr[1] * getWidth(), f7);
            int alpha2 = paintArr3[1].getAlpha();
            f11 = 1.0f;
            paintArr3[1].setAlpha((int) ((1.0f - this.f39107a0) * (1.0f - this.U) * alpha2 * 1.0f));
            canvas.drawRect(rectF, paintArr3[1]);
            paintArr3[1].setAlpha(alpha2);
            if (z10) {
                rectF.set(0.0f, f12, width, f12 + max);
                int alpha3 = paintArr2[1].getAlpha();
                paintArr2[1].setAlpha((int) ((1.0f - this.f39107a0) * alpha3 * 1.0f * f10));
                canvas.drawRect(rectF, paintArr2[1]);
                paintArr2[1].setAlpha(alpha3);
            }
        } else {
            f11 = 1.0f;
        }
        float f14 = this.f39110c;
        if (f14 < f11) {
            int l1 = i6.l1((f11 - f14) * f11, 1610612736);
            Paint paint = this.f39127r;
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
        paintArr3[0].setAlpha((int) ((f11 - this.f39107a0) * (f11 - this.U) * (f11 - Utilities.clamp01(this.f39110c * 4.0f)) * alpha5 * f11));
        canvas.drawRect(rectF, paintArr3[0]);
        paintArr3[0].setAlpha(alpha5);
        if (z10) {
            rectF.set(width, f12, getWidth() + width, max + f12);
            int alpha6 = paintArr2[0].getAlpha();
            paintArr2[0].setAlpha((int) ((f11 - this.f39107a0) * alpha6 * f11 * f10));
            canvas.drawRect(rectF, paintArr2[0]);
            paintArr2[0].setAlpha(alpha6);
        }
    }

    public final void b(int i10, int i11) {
        float f7;
        boolean[] zArr = this.e;
        boolean z10 = zArr[i10];
        Paint[] paintArr = this.f39114f;
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
        this.f39122n[i10].setColor(i6.v(i11, i6.l1(AndroidUtilities.lerp(0.14f, 0.24f, f7), d)));
        u1[] u1VarArr = this.f39108b;
        u1VarArr[i10].f39096a.r(d);
        u1VarArr[i10].d = i6.v(i11, i6.l1(0.6f, d));
        u1 u1Var = u1VarArr[i10];
        u1Var.f39097b.r(i0.a.d(u1VarArr[i10].f39098c.f22953c, u1Var.d, i6.w0(null, i6.f19074q7, false)));
        invalidate();
    }

    public final void c(final int i10, float f7, boolean z10) {
        final float f10;
        boolean[] zArr = this.e;
        if (zArr[2] && this.f39118i0 == i10) {
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
            this.f39134w = d;
            i6.l1(0.55f, d);
            this.f39118i0 = i10;
            this.f39136x = i0.a.d(f7, -1, -16777216);
            int d10 = i0.a.d(1.0f - f7, -1, -16777216);
            this.f39138y = d10;
            int i11 = this.f39136x;
            h4 h4Var = ((org.telegram.ui.k0) this).B0;
            k kVar = h4Var.f34140i0;
            if (kVar != null) {
                kVar.c(i11, d10);
            }
            this.f39129s.setColor(this.f39136x);
            this.v.setColor(i6.v(this.f39136x, i6.l1(AndroidUtilities.lerp(0.07f, 0.2f, f7), this.f39134w)));
            int l1 = i6.l1(0.6f, this.f39138y);
            fi.o oVar = this.f39109b0;
            oVar.setHintTextColor(l1);
            oVar.setTextColor(this.f39138y);
            oVar.setCursorColor(this.f39138y);
            oVar.setHandlesColor(this.f39138y);
            this.f39112d0.setProgressColor(i6.w0(null, i6.Rk, false));
            int d11 = i0.a.d(this.f39107a0, this.f39134w, this.f39138y);
            org.telegram.ui.ActionBar.g2 g2Var = this.M;
            g2Var.a(d11);
            g2Var.b(i0.a.d(this.f39107a0, this.f39134w, this.f39138y));
            int i12 = this.f39134w;
            t1 t1Var = this.P;
            t1Var.f20467c.setColor(i12);
            t1Var.invalidateSelf();
            int i13 = this.f39134w;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            this.R.setColorFilter(new PorterDuffColorFilter(i13, mode));
            this.O.setColorFilter(new PorterDuffColorFilter(this.f39134w, mode));
            this.J.setColorFilter(new PorterDuffColorFilter(this.f39134w, mode));
            int v = i6.v(i10, i6.l1(0.22f, this.f39134w));
            this.f39119j0 = v;
            i6.B1(this.N, v, true);
            i6.B1(this.Q, this.f39119j0, true);
            i6.B1(this.S, this.f39119j0, true);
            i6.B1(this.K, this.f39119j0, true);
            int l12 = i6.l1(0.6f, this.f39134w);
            fi.o oVar2 = this.V;
            oVar2.setHintTextColor(l12);
            oVar2.setTextColor(this.f39134w);
            oVar2.setCursorColor(this.f39134w);
            oVar2.setHandlesColor(this.f39134w);
            u3 u3Var = h4Var.K;
            if (u3Var != null) {
                u3Var.i();
            }
            invalidate();
            return;
        }
        ValueAnimator valueAnimator = this.f39120k0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i14 = this.f39118i0;
        this.f39117h0 = i14;
        if (AndroidUtilities.computePerceivedBrightness(i14) <= 0.721f) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        if (AndroidUtilities.computePerceivedBrightness(i10) > 0.721f) {
            f11 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f39120k0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                v1 v1Var = v1.this;
                v1Var.getClass();
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                v1Var.c(i0.a.d(floatValue, v1Var.f39117h0, i10), AndroidUtilities.lerp(f10, f11, floatValue), false);
            }
        });
        this.f39120k0.addListener(new h00(this, i10, f11, 1));
        this.f39120k0.start();
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
        if (this.f39113e0) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        a(canvas, i10 + this.F, 1.0f, this.f39130s0);
        float right = this.H.getRight();
        float left = this.I.getLeft();
        boolean z10 = this.f39113e0;
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
        float f11 = this.f39110c;
        u1[] u1VarArr = this.f39108b;
        if (f11 < 1.0f) {
            canvas.save();
            float width = (getWidth() * this.f39110c) - (Utilities.clamp01(this.f39110c * 2.0f) * AndroidUtilities.dp(30.0f));
            canvas.translate(right + width, f7);
            AndroidUtilities.lerp(1.0f, 0.5f, this.f39110c);
            u1VarArr[0].a(canvas, (left - right) - width, f10 - f7, (1.0f - this.U) * (1.0f - this.f39110c));
            canvas.restore();
        }
        if (this.f39110c > 0.0f) {
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getWidth() * this.f39110c, getHeight());
            canvas.translate(right, f7);
            canvas.translate((1.0f - this.f39110c) * AndroidUtilities.dp(-12.0f), 0.0f);
            float lerp = AndroidUtilities.lerp(1.0f, 0.5f, 1.0f - this.f39110c);
            float f12 = f10 - f7;
            canvas.scale(lerp, lerp, 0.0f, f12 / 2.0f);
            u1VarArr[1].a(canvas, left - right, f12, (1.0f - this.f39107a0) * (1.0f - this.U) * this.f39110c);
            canvas.restore();
        }
        float f13 = this.f39107a0;
        RectF rectF = this.f39106a;
        if (f13 > 0.0f) {
            Paint paint = this.f39129s;
            int alpha = paint.getAlpha();
            paint.setAlpha((int) (alpha * this.f39107a0));
            float width2 = getWidth();
            if (this.f39113e0) {
                i13 = AndroidUtilities.statusBarHeight;
            }
            canvas.drawRect(0.0f, 0.0f, width2, i13 + this.F, paint);
            paint.setAlpha(alpha);
            float f14 = (f7 + f10) / 2.0f;
            float dp = AndroidUtilities.dp(42.0f) / 2.0f;
            rectF.set(AndroidUtilities.dp(6.0f), f14 - dp, AndroidUtilities.lerp(left, getWidth() - AndroidUtilities.dp(6.0f), this.f39107a0), f14 + dp);
            Paint paint2 = this.v;
            int alpha2 = paint2.getAlpha();
            paint2.setAlpha((int) (alpha2 * this.f39107a0));
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
        q1 q1Var = this.f39140z0;
        if (action == 0) {
            this.A0 = false;
            AndroidUtilities.cancelRunOnUIThread(q1Var);
            if (motionEvent.getX() > this.H.getRight() && motionEvent.getX() < this.I.getLeft() && !this.T && !this.W) {
                this.f39137x0 = motionEvent.getX();
                motionEvent.getY();
                this.f39139y0 = System.currentTimeMillis();
                AndroidUtilities.runOnUIThread(q1Var, ViewConfiguration.getLongPressTimeout() * 0.8f);
            }
        } else if (motionEvent.getAction() == 2 && ((float) (System.currentTimeMillis() - this.f39139y0)) > ViewConfiguration.getLongPressTimeout() * 0.8f) {
            AndroidUtilities.cancelRunOnUIThread(q1Var);
            this.A0 = true;
            l3 l3Var = ((org.telegram.ui.k0) this).B0.f34151u0[0];
            float clamp01 = Utilities.clamp01(l3Var.getProgress() + ((motionEvent.getX() - this.f39137x0) / (getWidth() * 0.8f)));
            if (!l3Var.c() && l3Var.f() && (webView = l3Var.f35313f.getWebView()) != null) {
                webView.setScrollProgress(clamp01);
                l3Var.K.f0();
            }
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(q1Var);
            this.f39139y0 = 0L;
        }
        this.f39137x0 = motionEvent.getX();
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(int i10, boolean z10) {
        float f7;
        u1 u1Var = this.f39108b[i10];
        if (u1Var.e != z10) {
            u1Var.e = z10;
            c6 c6Var = u1Var.f39098c;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            c6Var.d(f7, true);
            invalidate();
        }
    }

    public final void f(int i10, String str) {
        u1[] u1VarArr = this.f39108b;
        CharSequence charSequence = u1VarArr[i10].f39097b.f26089g;
        if (charSequence != null && TextUtils.equals(charSequence.toString(), str)) {
            return;
        }
        u1VarArr[i10].f39097b.q(Emoji.replaceEmoji(str, u1VarArr[i10].f39097b.f26085a.getFontMetricsInt(), false), false, true);
    }

    public final void g(int i10, String str, boolean z10) {
        u1[] u1VarArr = this.f39108b;
        CharSequence charSequence = u1VarArr[i10].f39096a.f26089g;
        if (charSequence != null && TextUtils.equals(charSequence.toString(), str)) {
            return;
        }
        u1VarArr[i10].f39096a.q(Emoji.replaceEmoji(str, u1VarArr[i10].f39096a.f26085a.getFontMetricsInt(), false), z10, true);
    }

    public int getBackgroundColor() {
        return this.f39118i0;
    }

    public g2 getInstantViewLoader() {
        return null;
    }

    public int getTextColor() {
        return this.f39134w;
    }

    public String getTitle() {
        CharSequence charSequence = this.f39108b[0].f39096a.f26089g;
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
        ValueAnimator valueAnimator = this.f39131t0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.T = z10;
        fi.o oVar = this.V;
        boolean z11 = false;
        oVar.setVisibility(0);
        float f10 = 0.0f;
        if (!this.f39132u0 && !z10) {
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
        this.f39131t0 = ofFloat;
        ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.r0(this, 6));
        this.f39131t0.addListener(new h70(12, this, z10));
        this.f39131t0.setInterpolator(qr.h);
        this.f39131t0.setDuration(320L);
        this.f39131t0.start();
        boolean z12 = !z10;
        AndroidUtilities.updateViewShow(this.O, z12, true, true);
        AndroidUtilities.updateViewShow(this.R, z12, true, true);
        if (oVar.length() > 0 && this.T) {
            z11 = true;
        }
        AndroidUtilities.updateViewShow(this.J, z11, true, true);
    }

    public final void i() {
        u1[] u1VarArr = this.f39108b;
        u1 u1Var = u1VarArr[0];
        u1VarArr[0] = u1VarArr[1];
        u1VarArr[1] = u1Var;
        float[] fArr = this.d;
        float f7 = fArr[0];
        fArr[0] = fArr[1];
        fArr[1] = f7;
        Paint[] paintArr = this.f39114f;
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
        if (this.f39113e0) {
            i12 = AndroidUtilities.statusBarHeight;
        } else {
            i12 = 0;
        }
        super.onMeasure(i10, wl.C(56.0f, i12, 1073741824));
    }

    public void setBackButton(boolean z10) {
        float f7;
        this.f39132u0 = z10;
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
        this.f39132u0 = z10;
    }

    public void setHasForward(boolean z10) {
        this.f39124o0 = z10;
    }

    public void setHeight(int i10) {
        if (this.F != i10) {
            this.F = i10;
            float pow = (float) Math.pow(i10 / AndroidUtilities.dp(56.0f), 0.5d);
            this.G = pow;
            xd xdVar = this.H;
            xdVar.setScaleX(pow);
            xdVar.setScaleY(this.G);
            xdVar.setTranslationX((1.0f - this.G) * AndroidUtilities.dp(42.0f));
            xdVar.setTranslationY((1.0f - this.G) * AndroidUtilities.dp(-12.0f));
            float f7 = this.G;
            xd xdVar2 = this.I;
            xdVar2.setScaleX(f7);
            xdVar2.setScaleY(this.G);
            xdVar2.setTranslationX((1.0f - this.G) * (-AndroidUtilities.dp(42.0f)));
            xdVar2.setTranslationY((1.0f - this.G) * AndroidUtilities.dp(-12.0f));
            this.f39112d0.setTranslationY(this.F - AndroidUtilities.dp(56.0f));
            invalidate();
        }
    }

    public void setIsLocal(boolean z10) {
        this.f39126q0 = z10;
    }

    public void setIsTonsite(boolean z10) {
        this.f39125p0 = z10;
    }

    public void setMenuColors(int i10) {
        double atan2;
        int i11;
        boolean z10 = false;
        double[] j3 = g5.j(g5.f18689a, g5.j(g5.f18691c, new double[]{Color.red(i10) / 255.0d, Color.green(i10) / 255.0d, Color.blue(i10) / 255.0d}));
        for (int i12 = 0; i12 < 3; i12++) {
            j3[i12] = Math.cbrt(j3[i12]);
        }
        double[] j10 = g5.j(g5.f18690b, j3);
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
        this.f39121l0 = i11;
        if (!z10) {
            i13 = -16777216;
        }
        this.m0 = i13;
        this.f39123n0 = i6.l1(0.6f, i13);
    }

    public void setMenuListener(Utilities.Callback<Integer> callback) {
        this.f39115f0 = callback;
    }

    public void setMenuType(int i10) {
        if (this.f39116g0 != i10) {
            this.f39116g0 = i10;
        }
    }

    public void setProgress(float f7) {
        this.d[0] = f7;
        invalidate();
    }

    public void setTransitionProgress(float f7) {
        this.f39110c = f7;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return true;
    }

    public void setIsLoaded(boolean z10) {
    }
}
