package xh;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.d5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
import org.telegram.messenger.ah;
import org.telegram.messenger.at;
import org.telegram.messenger.b8;
import org.telegram.messenger.dd;
import org.telegram.messenger.f8;
import org.telegram.messenger.i20;
import org.telegram.messenger.i5;
import org.telegram.messenger.jc;
import org.telegram.messenger.k6;
import org.telegram.messenger.rz;
import org.telegram.messenger.s20;
import org.telegram.messenger.uz;
import org.telegram.messenger.vi;
import org.telegram.messenger.vs;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.pu0;
import org.telegram.ui.Components.rz0;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.x10;
import org.telegram.ui.Components.z60;
import org.telegram.ui.Components.zc0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.i71;
import org.telegram.ui.qr0;
import org.telegram.ui.un;
import org.telegram.ui.xv0;
import w7.b6;
public final class m2 extends Dialog implements vs, org.telegram.ui.ActionBar.n3 {
    public static final HashSet f53888a1 = new HashSet();
    public static final pu0 f53889b1;
    public static int f53890c1;
    public Boolean A0;
    public boolean B0;
    public s0 C0;
    public final e2 D;
    public boolean D0;
    public final k2 E;
    public org.telegram.ui.ActionBar.h3 E0;
    public final p6 F;
    public boolean F0;
    public boolean G;
    public boolean G0;
    public int H;
    public float H0;
    public long I;
    public boolean I0;
    public long J;
    public boolean J0;
    public long K;
    public int K0;
    public int L;
    public i71 L0;
    public long M;
    public Drawable M0;
    public String N;
    public final HashMap N0;
    public final Paint O;
    public z60 O0;
    public final Paint P;
    public e0 P0;
    public final Paint Q;
    public boolean Q0;
    public int R;
    public float R0;
    public int S;
    public ValueAnimator S0;
    public boolean T;
    public ValueAnimator T0;
    public final Paint U;
    public boolean U0;
    public boolean V;
    public ValueAnimator V0;
    public boolean W;
    public boolean W0;
    public final j2 X;
    public String X0;
    public final FrameLayout.LayoutParams Y;
    public org.telegram.ui.b3 Y0;
    public final Drawable Z;
    public boolean Z0;
    public int f53891a;
    public org.telegram.ui.ActionBar.t0 f53892a0;
    public int f53893b;
    public org.telegram.messenger.k2 f53894b0;
    public float f53895c;
    public boolean f53896c0;
    public o1.j d;
    public boolean f53897d0;
    public Boolean e;
    public boolean f53898e0;
    public final l2 f53899f;
    public boolean f53900f0;
    public float f53901g0;
    public final Rect h;
    public float f53902h0;
    public boolean f53903i0;
    public int f53904j0;
    public int f53905k0;
    public Activity f53906l0;
    public final i2 m0;
    public final Rect f53907n;
    public final org.telegram.messenger.l2 f53908n0;
    public wb f53909o0;
    public c0 f53910p0;
    public final FrameLayout f53911q0;
    public int f53912r;
    public final FrameLayout.LayoutParams f53913r0;
    public final org.telegram.ui.ActionBar.i3 f53914s;
    public boolean f53915s0;
    public final zc0 f53916t0;
    public final q1 f53917u0;
    public int f53918v0;
    public final bh.d f53919w;
    public t3 f53920w0;
    public final d2 f53921x;
    public boolean f53922x0;
    public final FrameLayout.LayoutParams f53923y;
    public boolean f53924y0;
    public boolean f53925z0;

    static {
        pu0 pu0Var = new pu0(new xg.a(16), new xg.a(17));
        pu0Var.f29554c = 100.0f;
        f53889b1 = pu0Var;
        f53890c1 = 0;
    }

    public m2(Context context, p6 p6Var) {
        super(context, 2131755352);
        boolean z10;
        Object obj;
        org.telegram.ui.ActionBar.i3 i3Var;
        this.f53895c = 0.0f;
        this.h = new Rect();
        this.f53907n = new Rect();
        this.f53912r = 0;
        Paint paint = new Paint(1);
        this.O = paint;
        Paint paint2 = new Paint();
        this.P = paint2;
        this.Q = new Paint(1);
        this.U = new Paint(1);
        this.f53917u0 = new q1(this, 1);
        this.f53918v0 = -1;
        this.f53925z0 = false;
        this.A0 = null;
        this.I0 = true;
        this.N0 = new HashMap();
        this.Q0 = false;
        this.U0 = true;
        this.Z0 = false;
        this.F = p6Var;
        int x02 = t6.x0(null, t6.wj, false);
        this.f53893b = x02;
        this.f53891a = x02;
        d2 d2Var = new d2(this, context, 0);
        this.f53921x = d2Var;
        d2Var.setAllowFullSizeSwipe(true);
        d2Var.setShouldWaitWebViewScroll(true);
        int i10 = t6.f20930d6;
        e2 e2Var = new e2(this, context, p6Var, t6.w0(i10, p6Var), 0);
        this.D = e2Var;
        e2Var.setOnVerifiedAge(this.L0);
        e2Var.setDelegate(new h2(this, context, p6Var));
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(4.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(1073741824);
        this.R = t6.w0(i10, p6Var);
        int w02 = t6.w0(t6.f20873a7, p6Var);
        this.S = w02;
        org.telegram.messenger.i0.t3(this, w02, false, null);
        l2 l2Var = new l2(this, context);
        this.f53899f = l2Var;
        l2Var.setDelegate(new bi.s1(this, 1));
        FrameLayout.LayoutParams e = b6.e(-1, -1, 49);
        this.f53923y = e;
        l2Var.addView(d2Var, e);
        i2 i2Var = new i2(this, getContext(), p6Var);
        this.m0 = i2Var;
        i2Var.setOnButtonClickListener(new s1(this, 0));
        i2Var.setOnResizeListener(new q1(this, 3));
        l2Var.addView(i2Var, b6.e(-1, -2, 81));
        org.telegram.messenger.l2 l2Var2 = new org.telegram.messenger.l2(getContext());
        this.f53908n0 = l2Var2;
        l2Var2.setAlpha(0.0f);
        l2Var2.setVisibility(8);
        if (!wp.r1(this.H).H6 && uz.o() >= 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f53900f0 = z10;
        if (z10) {
            obj = d2Var.getRenderNode();
        } else {
            obj = null;
        }
        l2Var2.setParentRenderNode(obj);
        l2Var.addView(l2Var2, b6.e(-1, -1, 119));
        l2Var2.setOnCloseClickListener(new q1(this, 4));
        l2Var2.setOnCollapseClickListener(new q1(this, 5));
        l2Var2.setOnMenuClickListener(new q1(this, 6));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f53911q0 = frameLayout;
        FrameLayout.LayoutParams e7 = b6.e(-1, 200, 55);
        this.f53913r0 = e7;
        l2Var.addView(frameLayout, e7);
        this.Z = getContext().getDrawable(2131231238).mutate();
        ?? lVar = new org.telegram.ui.ActionBar.l(context, p6Var);
        this.X = lVar;
        lVar.setBackgroundColor(0);
        lVar.setBackButtonImage(2131231270);
        F();
        lVar.setActionBarMenuOnItemClick(new y1(this, 1));
        lVar.setAlpha(0.0f);
        FrameLayout.LayoutParams e10 = b6.e(-1, -2, 49);
        this.Y = e10;
        l2Var.addView((View) lVar, e10);
        ?? f3Var = new f3(context, p6Var);
        this.E = f3Var;
        l2Var.addView((View) f3Var, b6.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
        e2Var.setWebViewProgressListener(new ig.i(this, 4));
        d2Var.addView(e2Var, b6.c(-1.0f, -1));
        d2Var.setScrollListener(new q1(this, 7));
        d2Var.setScrollEndListener(new q1(this, 8));
        d2Var.setDelegate(new r1(this));
        d2Var.setIsKeyboardVisible(new r1(this));
        zc0 zc0Var = new zc0(context);
        this.f53916t0 = zc0Var;
        l2Var.addView(zc0Var, b6.c(-1.0f, -1));
        setContentView(l2Var, new ViewGroup.LayoutParams(-1, -1));
        I();
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity != null) {
            i3Var = launchActivity.N();
        } else {
            i3Var = null;
        }
        this.f53914s = i3Var;
        if (i3Var != null) {
            d0 d0Var = new d0(l2Var, 5);
            q1 q1Var = new q1(this, 2);
            i3Var.I.add(d0Var);
            i3Var.J.add(q1Var);
            this.f53919w = new bh.d(i3Var);
        }
    }

    public static void f(m2 m2Var) {
        if (!m2Var.Q0) {
            super.dismiss();
            m2Var.Q0 = true;
        }
    }

    public static WindowInsets h(m2 m2Var, View view, WindowInsets windowInsets) {
        int i10;
        r0.g1 g1Var = r0.j1.h(view, windowInsets).f46143a;
        i0.c f7 = g1Var.f(2);
        m2Var.h.set(f7.f7766a, f7.f7767b, f7.f7768c, f7.d);
        i0.c f10 = g1Var.f(647);
        Rect rect = m2Var.f53907n;
        rect.set(Math.max(f10.f7766a, windowInsets.getStableInsetLeft()), Math.max(f10.f7767b, windowInsets.getStableInsetTop()), Math.max(f10.f7768c, windowInsets.getStableInsetRight()), Math.max(f10.d, windowInsets.getStableInsetBottom()));
        int i11 = Build.VERSION.SDK_INT;
        if (i11 <= 28) {
            int i12 = rect.top;
            Context context = m2Var.getContext();
            Typeface typeface = org.telegram.messenger.i0.f16145a;
            int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                i10 = context.getResources().getDimensionPixelSize(identifier);
            } else {
                i10 = 0;
            }
            rect.top = Math.max(i12, i10);
        }
        int i13 = g1Var.f(8).d;
        if (i13 > rect.bottom && i13 > org.telegram.messenger.i0.L(20.0f)) {
            m2Var.f53912r = i13;
        } else {
            m2Var.f53912r = 0;
        }
        m2Var.I();
        if (i11 >= 30) {
            return WindowInsets.CONSUMED;
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    public static void j(m2 m2Var) {
        super.dismiss();
    }

    public static void n(int i10, long j10, Runnable runnable) {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = vi.b0(i10).f18636b.bots;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i11);
                i11++;
                TLRPC.TL_attachMenuBot tL_attachMenuBot3 = tL_attachMenuBot2;
                if (tL_attachMenuBot3.bot_id == j10) {
                    tL_attachMenuBot = tL_attachMenuBot3;
                    break;
                }
            } else {
                tL_attachMenuBot = null;
                break;
            }
        }
        if (tL_attachMenuBot == null) {
            return;
        }
        String a02 = dd.a0(null, null, 2131753002, tL_attachMenuBot.short_name);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(LaunchActivity.Q().getContext());
        String L0 = dd.L0(2131753001, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
        x1Var.R = L0;
        x1Var.T = org.telegram.messenger.i0.W2(a02);
        alertDialog$Builder.k(dd.L0(2131747847, null), new di.a(i10, j10, tL_attachMenuBot, runnable));
        i0.a.s(null, 2131752589, alertDialog$Builder, null);
    }

    public static JSONObject u(p6 p6Var, final boolean z10) {
        try {
            JSONObject jSONObject = new JSONObject();
            final int w9 = t6.w(-16777216, t6.w0(t6.f21002h5, p6Var));
            s20 s20Var = new s20() {
                @Override
                public final Object a(Object obj) {
                    int w10 = t6.w(w9, ((Integer) obj).intValue());
                    Integer valueOf = Integer.valueOf(w10);
                    if (z10) {
                        return String.format(Locale.US, "#%02X%02X%02X", Integer.valueOf(Color.red(w10)), Integer.valueOf(Color.green(w10)), Integer.valueOf(Color.blue(w10)));
                    }
                    return valueOf;
                }
            };
            jSONObject.put("bg_color", s20Var.a(Integer.valueOf(w9)));
            jSONObject.put("section_bg_color", s20Var.a(Integer.valueOf(t6.w0(t6.f20930d6, p6Var))));
            int i10 = t6.f20873a7;
            jSONObject.put("secondary_bg_color", s20Var.a(Integer.valueOf(t6.w0(i10, p6Var))));
            jSONObject.put("text_color", s20Var.a(Integer.valueOf(t6.w0(t6.G6, p6Var))));
            jSONObject.put("hint_color", s20Var.a(Integer.valueOf(t6.w0(t6.H6, p6Var))));
            jSONObject.put("link_color", s20Var.a(Integer.valueOf(t6.w0(t6.J6, p6Var))));
            jSONObject.put("button_color", s20Var.a(Integer.valueOf(t6.w0(t6.Ci, p6Var))));
            jSONObject.put("button_text_color", s20Var.a(Integer.valueOf(t6.w0(t6.Gi, p6Var))));
            jSONObject.put("header_bg_color", s20Var.a(Integer.valueOf(t6.w0(t6.f21207s8, p6Var))));
            jSONObject.put("accent_text_color", s20Var.a(Integer.valueOf(t6.w0(t6.q6, p6Var))));
            jSONObject.put("section_header_text_color", s20Var.a(Integer.valueOf(t6.w0(t6.L6, p6Var))));
            jSONObject.put("subtitle_text_color", s20Var.a(Integer.valueOf(t6.w0(t6.f21331z6, p6Var))));
            jSONObject.put("destructive_text_color", s20Var.a(Integer.valueOf(t6.w0(t6.f21154p7, p6Var))));
            jSONObject.put("section_separator_color", s20Var.a(Integer.valueOf(t6.w0(t6.f20931d7, p6Var))));
            jSONObject.put("bottom_bar_bg_color", s20Var.a(Integer.valueOf(t6.w0(i10, p6Var))));
            return jSONObject;
        } catch (Exception e) {
            f8.g(e, true);
            return null;
        }
    }

    public final void A(int i10, boolean z10) {
        Paint paint = this.Q;
        int color = paint.getColor();
        boolean z11 = true;
        this.W = true;
        ValueAnimator valueAnimator = this.T0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z10) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            this.T0 = duration;
            duration.setInterpolator(gr.f26523f);
            this.T0.addUpdateListener(new o1(this, color, i10, 0));
            this.T0.addListener(new d5(this, i10, 14));
            this.T0.start();
            return;
        }
        paint.setColor(i10);
        F();
        this.f53899f.invalidate();
        org.telegram.ui.b3 b3Var = this.Y0;
        if (b3Var != null) {
            if (org.telegram.messenger.i0.B(paint.getColor()) > 0.721f) {
                z11 = false;
            }
            b3Var.b(z11, false);
            this.Y0.setBackgroundColor(paint.getColor());
        }
        K();
    }

    public final void B(boolean z10) {
        if (this.f53925z0 != z10) {
            this.f53925z0 = z10;
            d2 d2Var = this.f53921x;
            if (d2Var != null) {
                d2Var.setFullSize(r());
            }
        }
    }

    public final void C(boolean z10, boolean z11, boolean z12) {
        boolean z13;
        float f7;
        float f10;
        float f11;
        float f12;
        int currentActionBarHeight;
        float f13;
        Point point;
        Object obj;
        if (this.f53898e0 == z10) {
            return;
        }
        this.f53898e0 = z10;
        int i10 = 0;
        if (z12 && !wp.r1(this.H).H6 && uz.o() >= 2) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f53900f0 = z13;
        ValueAnimator valueAnimator = this.V0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        org.telegram.messenger.l2 l2Var = this.f53908n0;
        d2 d2Var = this.f53921x;
        if (l2Var != null) {
            org.telegram.messenger.a aVar = l2Var.f16866a0;
            org.telegram.messenger.i0.r(aVar);
            l2Var.M = z10;
            if (!z11) {
                l2Var.N.f(z10, true);
            }
            l2Var.invalidate();
            if (z10) {
                org.telegram.messenger.i0.h3(aVar, 2500L);
            }
            if (this.f53900f0) {
                obj = d2Var.getRenderNode();
            } else {
                obj = null;
            }
            l2Var.setParentRenderNode(obj);
        }
        this.f53904j0 = d2Var.getWidth();
        this.f53905k0 = d2Var.getHeight();
        this.U0 = false;
        i2 i2Var = this.m0;
        e2 e2Var = this.D;
        j2 j2Var = this.X;
        if (z11) {
            I();
            L();
            H();
            if (org.telegram.messenger.i0.Q1() && !org.telegram.messenger.i0.E && !org.telegram.messenger.i0.P1()) {
                int i11 = org.telegram.messenger.i0.f16172q.x;
                f10 = (i11 - ((int) (Math.min(i11, point.y) * 0.8f))) / 2.0f;
            } else {
                f10 = 0.0f;
            }
            int i12 = this.f53907n.left;
            if (z10) {
                f11 = i12 + f10;
            } else {
                f11 = (-i12) - f10;
            }
            if (!z10) {
                f10 = -f10;
            }
            if (z10) {
                f12 = d2Var.getTranslationY();
            } else {
                f12 = -org.telegram.messenger.i0.L(24.0f);
            }
            if (z10) {
                currentActionBarHeight = -org.telegram.messenger.i0.L(24.0f);
            } else {
                currentActionBarHeight = (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.f16166m) - org.telegram.messenger.i0.L(24.0f);
            }
            float f14 = currentActionBarHeight;
            float currentActionBarHeight2 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.f16166m;
            o1.j jVar = d2Var.f53827w;
            if (jVar != null) {
                jVar.d();
            }
            o1.j jVar2 = d2Var.G;
            if (jVar2 != null) {
                jVar2.d();
            }
            d2Var.setSwipeOffsetAnimationDisallowed(true);
            j2Var.setVisibility(0);
            if (z10) {
                d2Var.setTopActionBarOffsetY(-org.telegram.messenger.i0.L(24.0f));
            } else {
                d2Var.setTopActionBarOffsetY(currentActionBarHeight2 - org.telegram.messenger.i0.L(24.0f));
            }
            d2Var.c();
            d2Var.invalidate();
            this.f53902h0 = 0.0f;
            if (z10) {
                f13 = 0.0f;
            } else {
                f13 = 1.0f;
            }
            this.f53901g0 = f13;
            j2Var.setAlpha(1.0f - f13);
            j2Var.setTranslationY((-org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) * this.f53901g0);
            d2Var.setTranslationY(org.telegram.messenger.i0.T1(f12, f14, this.f53902h0));
            d2Var.setTranslationX(org.telegram.messenger.i0.T1(f11, 0.0f, this.f53902h0));
            i2Var.setTranslationX(org.telegram.messenger.i0.T1(f10, 0.0f, this.f53902h0));
            l2Var.setAlpha(this.f53901g0);
            this.f53899f.invalidate();
            e2Var.setViewPortHeightOffset(d2Var.getTranslationY() - f14);
            e2Var.n(false, false);
            this.f53903i0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.V0 = ofFloat;
            float f15 = f11;
            ofFloat.addUpdateListener(new a2(this, z10, f12, f14, f15, f10));
            this.V0.addListener(new b2(this, z10, currentActionBarHeight2, f15));
            this.V0.setDuration(280L);
            this.V0.setInterpolator(gr.h);
            this.V0.start();
            return;
        }
        this.f53903i0 = false;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f53901g0 = f7;
        this.f53902h0 = 0.0f;
        I();
        L();
        if (z10) {
            i10 = 8;
        }
        j2Var.setVisibility(i10);
        j2Var.setAlpha(1.0f - this.f53901g0);
        j2Var.setTranslationY((-org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) * this.f53901g0);
        i2Var.setTranslationX(0.0f);
        l2Var.setAlpha(this.f53901g0);
        e2Var.setViewPortHeightOffset(0.0f);
        e2Var.n(true, true);
        H();
    }

    public final void D(int i10, boolean z10) {
        this.I0 = false;
        int i11 = this.S;
        i2 i2Var = this.m0;
        Paint paint = i2Var.f54014a;
        i2Var.e.f281b = i10;
        paint.setColor(i10);
        if (!z10) {
            i2Var.d.a(i10, true);
        }
        if (z10) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(gr.f26523f);
            duration.addUpdateListener(new o1(this, i11, i10, 1));
            duration.addListener(new x10(this, i11, i10, 3));
            duration.start();
        } else {
            this.S = i10;
            l();
        }
        org.telegram.messenger.i0.t3(this, this.S, false, null);
    }

    public final void E(boolean z10) {
        float f7;
        ValueAnimator valueAnimator = this.S0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.R0;
        float f11 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        if (Math.abs(f10 - f7) < 0.01f) {
            return;
        }
        float f12 = this.R0;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
        this.S0 = ofFloat;
        ofFloat.addListener(new sg.y(15, this, z10));
        this.S0.addUpdateListener(new p1(this, 0));
        this.S0.setInterpolator(gr.h);
        this.S0.setDuration(220L);
        this.S0.start();
    }

    public final void F() {
        if (!this.V) {
            int i10 = t6.G6;
            p6 p6Var = this.F;
            int w02 = t6.w0(i10, p6Var);
            j2 j2Var = this.X;
            j2Var.setTitleColor(w02);
            j2Var.D(t6.w0(i10, p6Var), false);
            j2Var.C(t6.w0(t6.f21245u8, p6Var), false);
            j2Var.F(t6.w0(t6.G8, p6Var), false);
            j2Var.G(t6.w0(t6.E8, p6Var), false, false);
            j2Var.G(t6.w0(t6.F8, p6Var), true, false);
            j2Var.H(t6.w0(t6.I5, p6Var), false);
        }
        this.D.setFlickerViewColor(this.Q.getColor());
    }

    public final void G() {
        wb wbVar;
        boolean z10;
        f0 c10 = f0.c(getContext(), this.H, this.I);
        ArrayList arrayList = c10.e;
        e0 e0Var = c10.f53774f;
        boolean z11 = true;
        if (e0Var == null) {
            wb wbVar2 = this.f53909o0;
            if (wbVar2 != null) {
                wbVar2.b();
                this.f53909o0 = null;
            }
        } else if ((e0Var.c() && !e0Var.f53757l) || e0Var.f53756k) {
            if (this.P0 != e0Var && (wbVar = this.f53909o0) != null) {
                wbVar.b();
                this.f53909o0 = null;
            }
            wb wbVar3 = this.f53909o0;
            if (wbVar3 == null || !wbVar3.f32203l) {
                this.P0 = e0Var;
                c0 c0Var = new c0(getContext(), this.F);
                this.f53910p0 = c0Var;
                wb f7 = wb.f(this.f53911q0, c0Var, 5000);
                this.f53909o0 = f7;
                f7.k(true);
            }
            if (this.f53910p0.c(e0Var)) {
                this.f53909o0 = null;
            }
            e0Var.f53756k = false;
            e0Var.f53757l = true;
        } else {
            c0 c0Var2 = this.f53910p0;
            if (c0Var2 != null) {
                this.P0 = e0Var;
                if (c0Var2.c(e0Var)) {
                    this.f53909o0 = null;
                }
            }
        }
        H();
        for (Map.Entry entry : this.N0.entrySet()) {
            org.telegram.ui.ActionBar.b1 b1Var = (org.telegram.ui.ActionBar.b1) entry.getValue();
            e0 e0Var2 = (e0) entry.getKey();
            b1Var.setText(e0Var2.f53751c);
            if (!e0Var2.c()) {
                b1Var.setSubtext(org.telegram.messenger.i0.i0(e0Var2.f53753g, false, false));
            } else {
                Pair b10 = e0Var2.b();
                if (((Long) b10.second).longValue() > 0) {
                    b1Var.setSubtext(org.telegram.messenger.i0.i0(((Long) b10.first).longValue(), false, false) + " / " + org.telegram.messenger.i0.i0(((Long) b10.second).longValue(), false, false));
                } else {
                    b1Var.setSubtext(org.telegram.messenger.i0.i0(((Long) b10.first).longValue(), false, false));
                }
            }
            if (e0Var2.c()) {
                b1Var.setRightIcon(2131232095);
                b1Var.f20166b.setPadding(0, 0, org.telegram.messenger.i0.L(32.0f), 0);
            } else if (e0Var2.f53754i) {
                b1Var.setVisibility(8);
            } else {
                b1Var.setRightIcon(0);
                b1Var.f20166b.setPadding(0, 0, 0, 0);
            }
            b1Var.setOnClickListener(new rh.u1(12, this, e0Var2));
        }
        org.telegram.messenger.k2 k2Var = this.f53894b0;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if (((e0) obj).c()) {
                    z10 = true;
                    break;
                }
            } else {
                z10 = false;
                break;
            }
        }
        if (k2Var.e != z10) {
            k2Var.e = z10;
            k2Var.invalidateSelf();
        }
        int size2 = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 < size2) {
                Object obj2 = arrayList.get(i11);
                i11++;
                if (((e0) obj2).c()) {
                    break;
                }
            } else {
                z11 = false;
                break;
            }
        }
        this.f53908n0.setDownloading(z11);
    }

    public final void H() {
        c0 c0Var = this.f53910p0;
        if (c0Var == null) {
            return;
        }
        if (this.f53898e0) {
            c0Var.setArrow(org.telegram.messenger.i0.W1(this.f53901g0, org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(26.0f)));
        } else if (this.f53895c > 0.5f) {
            c0Var.setArrow(org.telegram.messenger.i0.L(24.0f));
        } else {
            c0Var.setArrow(-1);
        }
    }

    public final void I() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        org.telegram.messenger.l2 l2Var = this.f53908n0;
        Rect rect = this.f53907n;
        l2Var.setInsets(rect);
        boolean z10 = this.f53898e0;
        e2 e2Var = this.D;
        l2 l2Var2 = this.f53899f;
        i2 i2Var = this.m0;
        int i16 = 0;
        if (z10) {
            if (i2Var != null && i2Var.getTotalHeight() > 0) {
                i14 = rect.bottom;
            } else {
                i14 = 0;
            }
            int i17 = rect.left;
            int i18 = rect.top;
            int i19 = rect.right;
            if (this.f53912r > i14 || (i2Var != null && i2Var.getTotalHeight() > 0)) {
                i15 = 0;
            } else {
                i15 = rect.bottom;
            }
            Rect rect2 = new Rect(i17, i18, i19, i15);
            int L = org.telegram.messenger.i0.L(46.0f);
            e2Var.P(rect2, false);
            e2Var.O(L, false);
            l2Var2.setPadding(0, 0, 0, Math.max(this.f53912r, i14));
        } else {
            e2Var.P(new Rect(0, 0, 0, 0), false);
            e2Var.O(0, false);
            int i20 = rect.left;
            int i21 = rect.right;
            int i22 = this.f53912r;
            org.telegram.ui.ActionBar.i3 i3Var = this.f53914s;
            if (i3Var != null) {
                i10 = i3Var.H;
            } else {
                i10 = 0;
            }
            l2Var2.setPadding(i20, 0, i21, Math.max(i22, i10 + rect.bottom));
        }
        this.f53923y.topMargin = org.telegram.messenger.i0.L(24.0f);
        boolean z11 = this.f53898e0;
        if (!z11) {
            i11 = 0;
        } else {
            i11 = rect.left;
        }
        FrameLayout.LayoutParams layoutParams = this.Y;
        layoutParams.leftMargin = i11;
        layoutParams.rightMargin = 0;
        if (!z11) {
            i12 = 0;
        } else {
            i12 = rect.left;
        }
        FrameLayout.LayoutParams layoutParams2 = this.f53913r0;
        layoutParams2.leftMargin = i12;
        if (!z11) {
            i13 = 0;
        } else {
            i13 = rect.right;
        }
        layoutParams2.rightMargin = i13;
        boolean z12 = this.f53903i0;
        d2 d2Var = this.f53921x;
        if (!z12) {
            d2Var.setSwipeOffsetAnimationDisallowed(true);
            if (this.f53898e0) {
                d2Var.setTopActionBarOffsetY(-org.telegram.messenger.i0.L(24.0f));
            } else {
                d2Var.setTopActionBarOffsetY((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.f16166m) - org.telegram.messenger.i0.L(24.0f));
            }
            d2Var.setSwipeOffsetAnimationDisallowed(false);
            d2Var.c();
            d2Var.invalidate();
            d2Var.requestLayout();
        }
        if (d2Var != null) {
            d2Var.setFullSize(r());
        }
        i2Var.requestLayout();
        l2Var2.requestLayout();
        if (!this.f53898e0) {
            i16 = 8;
        }
        l2Var.setVisibility(i16);
    }

    public final void J() {
        boolean z10;
        int i10;
        boolean z11 = true;
        if (this.V) {
            z10 = !this.T;
        } else {
            z10 = (org.telegram.messenger.i0.Q1() || i0.b.h(t6.x0(null, t6.f20930d6, true)) < 0.7210000157356262d || this.f53895c < 0.85f) ? false : false;
        }
        Boolean bool = this.e;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        this.e = Boolean.valueOf(z10);
        l2 l2Var = this.f53899f;
        int systemUiVisibility = l2Var.getSystemUiVisibility();
        if (z10) {
            i10 = systemUiVisibility | 8192;
        } else {
            i10 = systemUiVisibility & (-8193);
        }
        l2Var.setSystemUiVisibility(i10);
    }

    public final void K() {
        org.telegram.ui.web.v0 webView;
        e2 e2Var = this.D;
        if (e2Var == null || (webView = e2Var.getWebView()) == null) {
            return;
        }
        webView.setBackgroundColor(this.Q.getColor());
    }

    public final void L() {
        int i10;
        i2 i2Var;
        try {
            Window window = getWindow();
            if (window == null) {
                return;
            }
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (Build.VERSION.SDK_INT <= 28) {
                i10 = 1024;
            } else {
                i10 = 512;
            }
            boolean z10 = this.f53898e0;
            if (z10) {
                attributes.flags = i10 | attributes.flags;
            } else {
                attributes.flags = (~i10) & attributes.flags;
            }
            l2 l2Var = this.f53899f;
            if (z10 && (((i2Var = this.m0) == null || i2Var.getTotalHeight() <= 0) && !l2Var.f53873g0)) {
                l2Var.setSystemUiVisibility(l2Var.getSystemUiVisibility() | 2);
            } else {
                l2Var.setSystemUiVisibility(l2Var.getSystemUiVisibility() & (-3));
            }
            window.setAttributes(attributes);
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override
    public final void a(boolean z10) {
        o(false);
    }

    @Override
    public final org.telegram.ui.ActionBar.h3 c() {
        boolean z10;
        String str;
        boolean z11;
        String str2;
        boolean z12;
        boolean booleanValue;
        float f7;
        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3();
        h3Var.f20368q = this.R;
        h3Var.f20367p = this.f53918v0;
        h3Var.f20365n = this.V;
        h3Var.f20366o = this.W;
        h3Var.f20369r = this.Q.getColor();
        h3Var.f20355a = this.f53920w0;
        boolean z13 = false;
        e2 e2Var = this.D;
        if (e2Var != null && e2Var.N) {
            z10 = true;
        } else {
            z10 = false;
        }
        h3Var.f20371t = z10;
        h3Var.D = t6.I.q();
        org.telegram.ui.web.v0 v0Var = null;
        if (e2Var != null) {
            str = e2Var.getUrlLoaded();
        } else {
            str = null;
        }
        h3Var.f20374x = str;
        if (e2Var != null && e2Var.f43084t0) {
            z11 = true;
        } else {
            z11 = false;
        }
        h3Var.e = z11;
        if (e2Var != null) {
            str2 = e2Var.getTrustedOrigin();
        } else {
            str2 = null;
        }
        h3Var.f20358f = str2;
        d2 d2Var = this.f53921x;
        if ((d2Var == null || d2Var.getSwipeOffsetY() >= 0.0f) && !this.f53924y0 && !r() && !this.f53898e0) {
            z12 = false;
        } else {
            z12 = true;
        }
        h3Var.f20361j = z12;
        h3Var.f20376z = this.f53898e0;
        h3Var.A = this.f53900f0;
        Boolean bool = this.A0;
        if (bool == null) {
            booleanValue = this.f53925z0;
        } else {
            booleanValue = bool.booleanValue();
        }
        h3Var.B = booleanValue;
        if (d2Var != null) {
            f7 = d2Var.getOffsetY();
        } else {
            f7 = Float.MAX_VALUE;
        }
        h3Var.f20362k = f7;
        h3Var.C = this.B0;
        h3Var.f20372u = this.f53922x0;
        h3Var.f20375y = this.f53915s0;
        h3Var.v = this.f53896c0;
        if (d2Var == null || d2Var.M) {
            z13 = true;
        }
        h3Var.f20363l = z13;
        h3Var.f20373w = this.m0.e;
        h3Var.f20370s = this.S;
        s0 s0Var = this.C0;
        if (s0Var != null) {
            s0Var.b();
        }
        h3Var.K = this.C0;
        if (e2Var != null) {
            v0Var = e2Var.getWebView();
        }
        if (v0Var != null) {
            e2Var.L();
            h3Var.f20356b = v0Var;
            h3Var.d = e2Var.getBotProxy();
            h3Var.f20359g = v0Var.getWidth();
            h3Var.h = v0Var.getHeight();
            v0Var.onPause();
        }
        boolean z14 = this.W0;
        h3Var.G = z14;
        if (z14) {
            h3Var.H = this.X0;
        }
        h3Var.L = this.D0;
        this.E0 = h3Var;
        return h3Var;
    }

    @Override
    public final org.telegram.ui.ActionBar.o3 mo30d() {
        return this.f53899f;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == at.f14828z1) {
            if (this.K == ((Long) objArr[0]).longValue()) {
                o(false);
            }
        } else if (i10 == at.f14753n4) {
            this.f53899f.invalidate();
            this.D.f43075n.b(t6.w0(t6.f20930d6, this.F), 153);
            F();
            J();
        } else if (i10 == at.J3) {
            G();
        }
    }

    @Override
    public final void dismiss() {
        o(false);
    }

    @Override
    public final int e(int i10) {
        return i0.b.f(this.R0, i10, this.S);
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final boolean i(org.telegram.ui.ActionBar.d3 d3Var) {
        return false;
    }

    public final void k(TL_bots.botAppSettings botappsettings, boolean z10) {
        int i10;
        boolean z11;
        int i11;
        int i12;
        int i13;
        int i14;
        if (botappsettings != null) {
            boolean q6 = t6.I.q();
            int i15 = botappsettings.flags;
            if (q6) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            if ((i10 & i15) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (q6) {
                i11 = 16;
            } else {
                i11 = 8;
            }
            if ((i15 & i11) != 0) {
                if (q6) {
                    i14 = botappsettings.header_dark_color;
                } else {
                    i14 = botappsettings.header_color;
                }
                y(i14 | (-16777216), true, z10);
            }
            if (z11) {
                if (q6) {
                    i12 = botappsettings.background_dark_color;
                } else {
                    i12 = botappsettings.background_color;
                }
                A(i12 | (-16777216), z10);
                if (q6) {
                    i13 = botappsettings.background_dark_color;
                } else {
                    i13 = botappsettings.background_color;
                }
                D(i13 | (-16777216), z10);
            }
        }
    }

    public final void l() {
        LaunchActivity launchActivity;
        if (!this.Q0 && (launchActivity = LaunchActivity.I1) != null) {
            launchActivity.F(true, true, true);
        }
        l2 l2Var = this.f53899f;
        if (l2Var != null) {
            l2Var.invalidate();
        }
    }

    public final void m() {
        if (this.Y0 == null) {
            org.telegram.ui.b3 b3Var = new org.telegram.ui.b3(getContext());
            this.Y0 = b3Var;
            this.f53921x.addView(b3Var, b6.c(-1.0f, -1));
            this.Y0.setTranslationY(-1.0f);
            this.Y0.h.setOnClickListener(new t1(this, 0));
            this.Y0.setBackgroundColor(this.Q.getColor());
            org.telegram.messenger.i0.Y3(this.Y0, this.W0, 1.0f, true, false);
        }
    }

    public final void o(boolean z10) {
        int i10;
        LaunchActivity launchActivity;
        if (this.f53897d0) {
            return;
        }
        int i11 = 0;
        if (this.L0 != null) {
            z10 = false;
        }
        this.f53897d0 = true;
        E(false);
        org.telegram.messenger.i0.r(this.f53917u0);
        at.f(this.H).n(this, at.f14828z1);
        at.f(this.H).n(this, at.J3);
        at.e().n(this, at.f14753n4);
        if (z10 && ((launchActivity = LaunchActivity.I1) == null || launchActivity.f33400y0 == null)) {
            z10 = false;
        }
        if (z10) {
            o1.j jVar = this.d;
            if (jVar != null) {
                jVar.f13958m.f13965i = 0.0f;
                jVar.h();
            }
            LaunchActivity.I1.f33400y0.b(this);
        } else {
            i2 i2Var = this.m0;
            if (i2Var != null) {
                i2Var.animate().translationY(i2Var.getTotalHeight()).alpha(0.0f).setDuration(160L).setInterpolator(gr.h).start();
            }
            this.D.h();
            d2 d2Var = this.f53921x;
            int height = d2Var.getHeight();
            if (i2Var != null) {
                i10 = i2Var.getTotalHeight();
            } else {
                i10 = 0;
            }
            int i12 = height + i10;
            Rect rect = this.f53907n;
            int Q = this.f53899f.Q() + i12 + rect.top + rect.bottom;
            if (r()) {
                i11 = org.telegram.messenger.i0.L(200.0f);
            }
            d2Var.f(Q + i11, true, new q1(this, 0));
        }
        f53888a1.remove(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z(true);
        if (this.d == null) {
            o1.j jVar = new o1.j(this, f53889b1);
            o1.k kVar = new o1.k();
            kVar.b(1200.0f);
            kVar.a(1.0f);
            jVar.f13958m = kVar;
            this.d = jVar;
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.f53916t0.getVisibility() == 0) {
            if (getOwnerActivity() != null) {
                getOwnerActivity().finish();
            }
        } else if (this.D.C()) {
        } else {
            o(true);
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        i2 i2Var;
        super.onCreate(bundle);
        Window window = getWindow();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            window.addFlags(-2147483392);
        } else {
            window.addFlags(-2147417856);
        }
        window.setWindowAnimations(2131755178);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.gravity = 51;
        attributes.dimAmount = 0.0f;
        int i11 = attributes.flags;
        int i12 = i11 & (-3);
        attributes.flags = i12;
        attributes.softInputMode = 16;
        attributes.height = -1;
        boolean z10 = true;
        if (i10 >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        if (this.f53898e0) {
            attributes.flags = i12 | 512;
        } else {
            attributes.flags = i11 & (-515);
        }
        window.setAttributes(attributes);
        window.setStatusBarColor(0);
        l2 l2Var = this.f53899f;
        l2Var.setFitsSystemWindows(true);
        l2Var.setSystemUiVisibility(1792);
        l2Var.setOnApplyWindowInsetsListener(new org.telegram.ui.ActionBar.o2(this, 1));
        if (this.f53898e0 && ((i2Var = this.m0) == null || i2Var.getTotalHeight() <= 0)) {
            l2Var.setSystemUiVisibility(l2Var.getSystemUiVisibility() | 2);
        } else {
            l2Var.setSystemUiVisibility(l2Var.getSystemUiVisibility() & (-3));
        }
        if (i10 >= 26) {
            if (i0.b.h(this.S) < 0.7210000157356262d) {
                z10 = false;
            }
            org.telegram.messenger.i0.m3(this, z10);
        }
        at.e().c(this, at.f14753n4);
        at.f(this.H).c(this, at.J3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z(false);
        o1.j jVar = this.d;
        if (jVar != null) {
            jVar.d();
            this.d = null;
        }
    }

    @Override
    public final void onStart() {
        super.onStart();
        Context context = getContext();
        if ((context instanceof ContextWrapper) && !(context instanceof LaunchActivity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof LaunchActivity) {
            ((LaunchActivity) context).B0.add(this.f53916t0);
        }
    }

    @Override
    public final void onStop() {
        super.onStop();
        Context context = getContext();
        if ((context instanceof ContextWrapper) && !(context instanceof LaunchActivity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof LaunchActivity) {
            ((LaunchActivity) context).B0.remove(this.f53916t0);
        }
    }

    public final Activity p() {
        Activity ownerActivity = getOwnerActivity();
        if (ownerActivity == null) {
            ownerActivity = LaunchActivity.I1;
        }
        if (ownerActivity == null) {
            return org.telegram.messenger.i0.W(getContext());
        }
        return ownerActivity;
    }

    public final boolean q() {
        t3 t3Var = this.f53920w0;
        if (t3Var != null && t3Var.f54074g == 6) {
            return true;
        }
        return false;
    }

    public final boolean r() {
        if (!this.f53898e0) {
            Boolean bool = this.A0;
            if (bool == null) {
                if (!this.f53925z0) {
                    return false;
                }
                return true;
            } else if (!bool.booleanValue()) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }

    @Override
    public final void release() {
        if (this.Q0) {
            return;
        }
        try {
            super.dismiss();
        } catch (Exception e) {
            f8.g(e, true);
        }
        E(false);
    }

    public final void s() {
        String str;
        boolean z10;
        int i10;
        if (this.f53920w0 != null) {
            long max = Math.max(0L, 60000 - (System.currentTimeMillis() - this.f53920w0.f54084r));
            TLRPC.TL_topPeer tL_topPeer = null;
            this.A0 = null;
            TLObject tLObject = this.f53920w0.f54083q;
            if (tLObject instanceof TLRPC.TL_webViewResultUrl) {
                TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject;
                this.K = tL_webViewResultUrl.query_id;
                str = tL_webViewResultUrl.url;
                z10 = tL_webViewResultUrl.same_origin;
                this.A0 = Boolean.valueOf(tL_webViewResultUrl.fullsize);
                boolean z11 = this.F0;
                if (!z11) {
                    C(tL_webViewResultUrl.fullscreen, !z11, this.f53900f0);
                }
            } else {
                if (tLObject instanceof TLRPC.TL_appWebViewResultUrl) {
                    this.K = 0L;
                    str = ((TLRPC.TL_appWebViewResultUrl) tLObject).url;
                } else if (tLObject instanceof TLRPC.TL_simpleWebViewResultUrl) {
                    this.K = 0L;
                    str = ((TLRPC.TL_simpleWebViewResultUrl) tLObject).url;
                } else {
                    str = null;
                }
                z10 = false;
            }
            if (str != null && !this.F0) {
                vi b02 = vi.b0(this.H);
                long j10 = this.f53920w0.f54072c;
                TLRPC.User Z1 = b02.getMessagesController().Z1(Long.valueOf(j10));
                if (Z1 != null && Z1.bot) {
                    if (b02.getUserConfig().G != 0) {
                        i10 = Math.max(1, ((int) (System.currentTimeMillis() / 1000)) - b02.getUserConfig().G);
                    } else {
                        i10 = 60;
                    }
                    int i11 = 0;
                    while (true) {
                        if (i11 >= b02.l1.size()) {
                            break;
                        }
                        TLRPC.TL_topPeer tL_topPeer2 = (TLRPC.TL_topPeer) b02.l1.get(i11);
                        if (tL_topPeer2.peer.user_id == j10) {
                            tL_topPeer = tL_topPeer2;
                            break;
                        }
                        i11++;
                    }
                    if (tL_topPeer == null) {
                        tL_topPeer = new TLRPC.TL_topPeer();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_topPeer.peer = tL_peerUser;
                        tL_peerUser.user_id = j10;
                        b02.l1.add(tL_topPeer);
                    }
                    tL_topPeer.rating = Math.exp(i10 / b02.getMessagesController().Z2) + tL_topPeer.rating;
                    Collections.sort(b02.l1, new a4.d(23));
                    if (b02.l1.size() > 20) {
                        a1.g.x(1, b02.l1);
                    }
                    b02.getMessagesStorage().f16331a.c(new ah(b02, j10, 2, tL_topPeer.rating));
                    b02.getNotificationCenter().k(at.V0, new Object[0]);
                }
                this.D.t(this.H, str, z10);
            }
            org.telegram.messenger.i0.h3(this.f53917u0, max);
            d2 d2Var = this.f53921x;
            if (d2Var != null) {
                d2Var.setFullSize(r());
            }
        }
    }

    @Override
    public final void show() {
        if (!org.telegram.messenger.i0.M1(getContext())) {
            return;
        }
        E(true);
        l2 l2Var = this.f53899f;
        l2Var.setAlpha(0.0f);
        l2Var.addOnLayoutChangeListener(new ag.t(this, 2));
        super.show();
        this.Q0 = false;
        f53888a1.add(this);
    }

    public final void t(boolean z10) {
        if (this.D0 == z10) {
            return;
        }
        this.D0 = z10;
        if (this.Z0) {
            if (z10) {
                f53890c1++;
            } else {
                f53890c1--;
            }
        }
        if (f53890c1 > 0) {
            org.telegram.messenger.i0.f2(p());
        } else {
            org.telegram.messenger.i0.P3(p());
        }
    }

    public final boolean v() {
        String str;
        if (this.f53915s0) {
            TLRPC.User Z1 = wp.r1(this.H).Z1(Long.valueOf(this.I));
            if (Z1 != null) {
                str = i5.m(0, Z1.first_name, Z1.last_name);
            } else {
                str = null;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
            x1Var.R = str;
            x1Var.T = dd.L0(2131752917, null);
            alertDialog$Builder.k(dd.L0(2131752916, null), new r1(this));
            alertDialog$Builder.h(dd.L0(2131752589, null), null);
            x1Var.show();
            ((TextView) x1Var.d(-1)).setTextColor(t6.w0(t6.f21171q7, this.F));
            return false;
        }
        o(false);
        return true;
    }

    public final void w() {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        View view;
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i11;
        int i12;
        ArrayList arrayList;
        int i13;
        int w02;
        int w03;
        boolean q6 = q();
        TLRPC.User Z1 = wp.r1(this.H).Z1(Long.valueOf(this.I));
        ArrayList<TLRPC.TL_attachMenuBot> arrayList2 = vi.b0(this.H).f18636b.bots;
        int size = arrayList2.size();
        int i14 = 0;
        while (true) {
            if (i14 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList2.get(i14);
                i14++;
                tL_attachMenuBot = tL_attachMenuBot2;
                if (tL_attachMenuBot.bot_id == this.I) {
                    break;
                }
            } else {
                tL_attachMenuBot = null;
                break;
            }
        }
        z60 z60Var = this.O0;
        if (z60Var != null) {
            z60Var.u();
        }
        if (this.f53898e0) {
            view = this.f53908n0;
        } else {
            view = this.f53892a0;
        }
        z60 G = z60.G(this.f53899f, this.F, view, true);
        this.O0 = G;
        ArrayList arrayList3 = f0.c(getContext(), this.H, this.I).e;
        HashMap hashMap = this.N0;
        hashMap.clear();
        if (!arrayList3.isEmpty()) {
            z60 J = G.J();
            J.c(2131232056, dd.L0(2131753756, null), new qr0(G, 27), false);
            J.k();
            int size2 = arrayList3.size();
            int i15 = 0;
            while (i15 < size2) {
                Object obj = arrayList3.get(i15);
                i15++;
                e0 e0Var = (e0) obj;
                String str = e0Var.f53751c;
                r5.a aVar = new r5.a(17);
                p6 p6Var = J.d;
                if (J.e == null) {
                    arrayList = arrayList3;
                    i13 = size2;
                } else {
                    org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(0, J.e, J.d, false, false);
                    arrayList = arrayList3;
                    i13 = size2;
                    b1Var.setPadding(org.telegram.messenger.i0.L(18.0f), 0, org.telegram.messenger.i0.L(18.0f), 0);
                    b1Var.setText(str);
                    b1Var.setSubtext("");
                    Integer num = J.f33029j0;
                    if (num == null && J.f33031k0 == null) {
                        b1Var.c(t6.E8, t6.F8);
                    } else {
                        if (num != null) {
                            w02 = num.intValue();
                        } else {
                            w02 = t6.w0(t6.E8, p6Var);
                        }
                        Integer num2 = J.f33031k0;
                        if (num2 != null) {
                            w03 = num2.intValue();
                        } else {
                            w03 = t6.w0(t6.F8, p6Var);
                        }
                        b1Var.d(w02, w03);
                    }
                    Integer num3 = J.f33033l0;
                    if (num3 != null) {
                        b1Var.setSelectorColor(num3.intValue());
                    } else {
                        b1Var.h(0.12f, t6.E8);
                    }
                    b1Var.setOnClickListener(new org.telegram.ui.Components.h0(J, aVar));
                    int i16 = J.S;
                    if (i16 > 0) {
                        b1Var.setMinimumWidth(org.telegram.messenger.i0.L(i16));
                        J.r(b1Var, b6.o(J.S, -2));
                    } else {
                        J.r(b1Var, b6.o(-1, -2));
                        hashMap.put(e0Var, J.y());
                        size2 = i13;
                        arrayList3 = arrayList;
                    }
                }
                hashMap.put(e0Var, J.y());
                size2 = i13;
                arrayList3 = arrayList;
            }
            i10 = -1;
            G();
            J.S = org.telegram.messenger.i0.L(180.0f);
            G.c(2131231788, dd.L0(2131753094, null), new bi.k(G, J, 11), false);
            G.k();
        } else {
            i10 = -1;
        }
        if (this.L0 == null && !q6) {
            z10 = true;
        } else {
            z10 = false;
        }
        G.l(2131232071, dd.L0(2131752912, null), new q1(this, 9), z10);
        if (this.L0 == null && this.f53896c0) {
            z11 = true;
        } else {
            z11 = false;
        }
        G.l(2131232359, dd.L0(2131752897, null), new q1(this, 10), z11);
        G.c(2131232341, dd.L0(2131752911, null), new xv0(15, this, q6), false);
        if (this.L0 == null && Z1 != null && Z1.bot_has_main_app) {
            z12 = true;
        } else {
            z12 = false;
        }
        G.l(2131232182, dd.L0(2131754390, null), new q1(this, 11), z12);
        if (this.L0 == null && !q6) {
            z13 = true;
        } else {
            z13 = false;
        }
        G.l(2131231834, dd.L0(2131752894, null), new q1(this, 12), z13);
        if (this.L0 == null && !q6) {
            z14 = true;
        } else {
            z14 = false;
        }
        G.l(2131232332, dd.L0(2131752910, null), new q1(this, 13), z14);
        if (this.L0 == null && tL_attachMenuBot != null && (tL_attachMenuBot.show_in_side_menu || tL_attachMenuBot.show_in_attach_menu)) {
            z15 = true;
        } else {
            z15 = false;
        }
        G.l(2131232107, dd.L0(2131752915, null), new q1(this, 14), z15);
        if (this.R != t6.x0(null, t6.f20930d6, false)) {
            if (org.telegram.messenger.i0.B(this.R) >= 0.721f) {
                i11 = i10;
            } else {
                i11 = -15198183;
            }
            if (org.telegram.messenger.i0.B(i11) >= 0.721f) {
                i12 = -16777216;
            } else {
                i12 = i10;
            }
            int r12 = t6.r1(0.85f, i12);
            int r13 = t6.r1(0.1f, i12);
            G.P(i11);
            for (int i17 = 0; i17 < G.x(); i17++) {
                View w9 = G.w(i17);
                if (w9 instanceof org.telegram.ui.ActionBar.b1) {
                    org.telegram.ui.ActionBar.b1 b1Var2 = (org.telegram.ui.ActionBar.b1) w9;
                    b1Var2.d(i12, r12);
                    b1Var2.setSelectorColor(r13);
                }
            }
        }
        G.V(5);
        G.a0(-this.f53907n.right, 0.0f);
        G.U = true;
        G.f33045t = false;
        G.f33044s = 0;
        G.Z();
    }

    public final void x(org.telegram.ui.ActionBar.k2 k2Var, t3 t3Var) {
        boolean z10;
        TLRPC.User Z1;
        CharSequence p5;
        TLRPC.UserFull a2;
        TLRPC.User user;
        org.telegram.ui.ActionBar.y yVar;
        TLRPC.UserFull userFull;
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        org.telegram.ui.ActionBar.y yVar2;
        boolean z11;
        boolean z12;
        TLRPC.InputPeer m12;
        TLRPC.InputPeer i12;
        boolean z13;
        boolean z14;
        TL_bots.botAppSettings botappsettings;
        String p9;
        boolean z15;
        this.f53920w0 = t3Var;
        int i10 = t3Var.f54070a;
        this.H = i10;
        this.J = t3Var.f54071b;
        this.I = t3Var.f54072c;
        this.L = t3Var.h;
        this.M = t3Var.f54075i;
        this.N = t3Var.e;
        if (t3Var.f54074g == 6) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            Z1 = null;
        } else {
            Z1 = wp.r1(i10).Z1(Long.valueOf(this.I));
        }
        if (z10) {
            p5 = t3Var.e;
        } else {
            p5 = i20.p(Z1);
        }
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(org.telegram.messenger.i0.L(20.0f));
            p5 = k6.m(p5, textPaint.getFontMetricsInt(), false, null, 0);
        } catch (Exception unused) {
        }
        j2 j2Var = this.X;
        j2Var.setTitle(p5);
        if (z10) {
            a2 = null;
        } else {
            a2 = wp.r1(this.H).a2(this.I);
        }
        p6 p6Var = this.F;
        if ((Z1 != null && Z1.verified) || (a2 != null && (user = a2.user) != null && user.verified)) {
            this.M0 = getContext().getResources().getDrawable(2131232791).mutate();
            a7.y(j2Var.getTitleTextView(), this.M0, t6.Ci, p6Var, PorterDuff.Mode.SRC_IN);
            this.M0.setAlpha(255);
            j2Var.getTitleTextView().setDrawablePadding(org.telegram.messenger.i0.L(2.0f));
            j2Var.getTitleTextView().i(new jg.x0(this, 9));
        }
        org.telegram.messenger.l2 l2Var = this.f53908n0;
        if (l2Var != null) {
            if (z10) {
                p9 = t3Var.e;
            } else {
                p9 = i20.p(Z1);
            }
            if (Z1 != null && Z1.verified) {
                z15 = true;
            } else {
                z15 = false;
            }
            l2Var.T = new rz0(p9, 13.0f, org.telegram.messenger.i0.o());
            if (!z15) {
                l2Var.U = null;
                l2Var.V = null;
            } else {
                l2Var.U = l2Var.getContext().getResources().getDrawable(2131232789).mutate();
                l2Var.V = l2Var.getContext().getResources().getDrawable(2131232790).mutate();
            }
        }
        org.telegram.ui.ActionBar.y p10 = j2Var.p();
        p10.removeAllViews();
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = vi.b0(this.H).f18636b.bots;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i11);
                i11++;
                tL_attachMenuBot = tL_attachMenuBot2;
                yVar = p10;
                userFull = a2;
                if (tL_attachMenuBot.bot_id == this.I) {
                    break;
                }
                p10 = yVar;
                a2 = userFull;
            } else {
                yVar = p10;
                userFull = a2;
                tL_attachMenuBot = null;
                break;
            }
        }
        if (!this.F0 && !z10) {
            if (userFull != null) {
                TL_bots.BotInfo botInfo = userFull.bot_info;
                if (botInfo != null && (botappsettings = botInfo.app_settings) != null) {
                    z13 = false;
                    k(botappsettings, false);
                } else {
                    z13 = false;
                }
                z14 = true;
            } else {
                z13 = false;
                z14 = true;
                wp.r1(this.H).U2(Z1, 0, true, new s1(this, 1));
            }
            if (t3Var.f54082p) {
                C(z14, z13, this.f53900f0);
            }
        }
        if (this.L0 == null) {
            yVar2 = yVar;
            yVar2.a(2131296492, 2131230871);
        } else {
            yVar2 = yVar;
        }
        org.telegram.messenger.k2 k2Var2 = new org.telegram.messenger.k2(getContext());
        this.f53894b0 = k2Var2;
        org.telegram.ui.ActionBar.t0 d = yVar2.d(0, k2Var2);
        this.f53892a0 = d;
        d.setOnClickListener(new t1(this, 1));
        j2Var.setActionBarMenuOnItemClick(new y1(this, 0));
        JSONObject u10 = u(p6Var, false);
        e2 e2Var = this.D;
        e2Var.setBotUser(Z1);
        if (!z10) {
            e2Var.s(this.H, this.I);
            TLRPC.User user2 = t3Var.f54079m;
            if (tL_attachMenuBot != null && tL_attachMenuBot.show_in_side_menu) {
                vi.b0(this.H);
                if (!vi.z0(vi.f18630c2, this.I)) {
                    if (user2 == null) {
                        user2 = wp.r1(this.H).Z1(Long.valueOf(this.I));
                    }
                    if (user2 != null && user2.photo != null) {
                        b8.G(this.H);
                        if (!b8.K(user2.photo.photo_small, null, true, true).exists()) {
                            vi.b0(this.H).l1(jc.l(this.H, 1, user2), 0);
                        }
                    }
                }
            }
        }
        if (t3Var.f54083q != null) {
            s();
            return;
        }
        int i13 = t3Var.f54074g;
        int i14 = at.f14828z1;
        switch (i13) {
            case 0:
                TLRPC.TL_messages_requestWebView tL_messages_requestWebView = new TLRPC.TL_messages_requestWebView();
                tL_messages_requestWebView.peer = wp.r1(this.H).i1(this.J);
                tL_messages_requestWebView.bot = wp.r1(this.H).n1(this.I);
                tL_messages_requestWebView.platform = "android";
                tL_messages_requestWebView.compact = t3Var.f54081o;
                tL_messages_requestWebView.fullscreen = t3Var.f54082p;
                String str = t3Var.f54073f;
                if (str != null) {
                    tL_messages_requestWebView.url = str;
                    tL_messages_requestWebView.flags |= 2;
                }
                if (this.L != 0) {
                    rz.C(this.H);
                    int i15 = this.L;
                    TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                    tL_inputReplyToMessage.reply_to_msg_id = i15;
                    tL_messages_requestWebView.reply_to = tL_inputReplyToMessage;
                    if (this.M != 0) {
                        tL_inputReplyToMessage.monoforum_peer_id = wp.r1(this.H).i1(this.M);
                        tL_messages_requestWebView.reply_to.flags |= 32;
                    }
                    tL_messages_requestWebView.flags |= 1;
                } else if (this.M != 0) {
                    TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                    tL_messages_requestWebView.reply_to = tL_inputReplyToMonoForum;
                    tL_inputReplyToMonoForum.monoforum_peer_id = wp.r1(this.H).i1(this.M);
                    tL_messages_requestWebView.flags |= 1;
                }
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_messages_requestWebView.theme_params = tL_dataJSON;
                    tL_dataJSON.data = u10.toString();
                    tL_messages_requestWebView.flags |= 4;
                }
                ConnectionsManager.getInstance(this.H).sendRequest(tL_messages_requestWebView, new x1(this, 3));
                at.f(this.H).c(this, i14);
                return;
            case 1:
                TLRPC.TL_messages_requestSimpleWebView tL_messages_requestSimpleWebView = new TLRPC.TL_messages_requestSimpleWebView();
                if ((t3Var.f54080n & 1) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                tL_messages_requestSimpleWebView.from_switch_webview = z11;
                tL_messages_requestSimpleWebView.bot = wp.r1(this.H).n1(this.I);
                tL_messages_requestSimpleWebView.platform = "android";
                if ((t3Var.f54080n & 2) != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                tL_messages_requestSimpleWebView.from_side_menu = z12;
                tL_messages_requestSimpleWebView.compact = t3Var.f54081o;
                tL_messages_requestSimpleWebView.fullscreen = t3Var.f54082p;
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                    tL_messages_requestSimpleWebView.theme_params = tL_dataJSON2;
                    tL_dataJSON2.data = u10.toString();
                    tL_messages_requestSimpleWebView.flags |= 1;
                }
                if (!TextUtils.isEmpty(t3Var.f54073f)) {
                    tL_messages_requestSimpleWebView.flags |= 8;
                    tL_messages_requestSimpleWebView.url = t3Var.f54073f;
                }
                if (!TextUtils.isEmpty(t3Var.f54078l)) {
                    tL_messages_requestSimpleWebView.start_param = t3Var.f54078l;
                    tL_messages_requestSimpleWebView.flags |= 16;
                }
                ConnectionsManager.getInstance(this.H).sendRequest(tL_messages_requestSimpleWebView, new x1(this, 2));
                return;
            case 2:
                TLRPC.TL_messages_requestWebView tL_messages_requestWebView2 = new TLRPC.TL_messages_requestWebView();
                tL_messages_requestWebView2.bot = wp.r1(this.H).n1(this.I);
                tL_messages_requestWebView2.peer = wp.r1(this.H).i1(this.I);
                tL_messages_requestWebView2.platform = "android";
                tL_messages_requestWebView2.compact = t3Var.f54081o;
                tL_messages_requestWebView2.fullscreen = t3Var.f54082p;
                tL_messages_requestWebView2.url = t3Var.f54073f;
                tL_messages_requestWebView2.flags |= 2;
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON3 = new TLRPC.TL_dataJSON();
                    tL_messages_requestWebView2.theme_params = tL_dataJSON3;
                    tL_dataJSON3.data = u10.toString();
                    tL_messages_requestWebView2.flags |= 4;
                }
                ConnectionsManager.getInstance(this.H).sendRequest(tL_messages_requestWebView2, new x1(this, 1));
                at.f(this.H).c(this, i14);
                return;
            case 3:
                TLRPC.TL_messages_requestAppWebView tL_messages_requestAppWebView = new TLRPC.TL_messages_requestAppWebView();
                TLRPC.TL_inputBotAppID tL_inputBotAppID = new TLRPC.TL_inputBotAppID();
                TLRPC.BotApp botApp = t3Var.f54076j;
                tL_inputBotAppID.f19852id = botApp.f19791id;
                tL_inputBotAppID.access_hash = botApp.access_hash;
                tL_messages_requestAppWebView.app = tL_inputBotAppID;
                tL_messages_requestAppWebView.write_allowed = t3Var.f54077k;
                tL_messages_requestAppWebView.platform = "android";
                if (k2Var instanceof un) {
                    un unVar = (un) k2Var;
                    if (unVar.j() != null) {
                        m12 = wp.m1(unVar.j());
                    } else {
                        m12 = wp.k1(unVar.e);
                    }
                } else {
                    m12 = wp.m1(t3Var.f54079m);
                }
                tL_messages_requestAppWebView.peer = m12;
                tL_messages_requestAppWebView.compact = t3Var.f54081o;
                tL_messages_requestAppWebView.fullscreen = t3Var.f54082p;
                if (!TextUtils.isEmpty(t3Var.f54078l)) {
                    tL_messages_requestAppWebView.start_param = t3Var.f54078l;
                    tL_messages_requestAppWebView.flags |= 2;
                }
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON4 = new TLRPC.TL_dataJSON();
                    tL_messages_requestAppWebView.theme_params = tL_dataJSON4;
                    tL_dataJSON4.data = u10.toString();
                    tL_messages_requestAppWebView.flags |= 4;
                }
                ConnectionsManager.getInstance(this.H).sendRequest(tL_messages_requestAppWebView, new x1(this, 4), 66);
                return;
            case 4:
                TLRPC.TL_messages_requestMainWebView tL_messages_requestMainWebView = new TLRPC.TL_messages_requestMainWebView();
                tL_messages_requestMainWebView.bot = wp.r1(this.H).n1(t3Var.f54072c);
                tL_messages_requestMainWebView.platform = "android";
                if (k2Var instanceof un) {
                    un unVar2 = (un) k2Var;
                    if (unVar2.j() != null) {
                        i12 = wp.m1(unVar2.j());
                    } else {
                        i12 = wp.k1(unVar2.e);
                    }
                } else {
                    i12 = wp.r1(this.H).i1(t3Var.f54071b);
                }
                tL_messages_requestMainWebView.peer = i12;
                tL_messages_requestMainWebView.compact = t3Var.f54081o;
                tL_messages_requestMainWebView.fullscreen = t3Var.f54082p;
                if (!TextUtils.isEmpty(t3Var.f54078l)) {
                    tL_messages_requestMainWebView.start_param = t3Var.f54078l;
                    tL_messages_requestMainWebView.flags |= 2;
                }
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON5 = new TLRPC.TL_dataJSON();
                    tL_messages_requestMainWebView.theme_params = tL_dataJSON5;
                    tL_dataJSON5.data = u10.toString();
                    tL_messages_requestMainWebView.flags |= 1;
                }
                ConnectionsManager.getInstance(this.H).sendRequest(tL_messages_requestMainWebView, new x1(this, 5), 66);
                return;
            case 5:
                TLRPC.TL_messages_requestChatJoinWebView tL_messages_requestChatJoinWebView = new TLRPC.TL_messages_requestChatJoinWebView();
                tL_messages_requestChatJoinWebView.platform = "android";
                tL_messages_requestChatJoinWebView.query_id = t3Var.d;
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON6 = new TLRPC.TL_dataJSON();
                    tL_messages_requestChatJoinWebView.theme_params = tL_dataJSON6;
                    tL_dataJSON6.data = u10.toString();
                }
                ConnectionsManager.getInstance(this.H).sendRequestTyped(tL_messages_requestChatJoinWebView, new a3.b(1), new n1(this, 0), 66);
                return;
            case 6:
                if (!this.F0) {
                    e2Var.t(this.H, t3Var.f54073f, false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void y(final int i10, boolean z10, boolean z11) {
        int i11;
        boolean z12;
        final int i12 = this.R;
        t6.b(0.35f, -0.1f, i10);
        final m1 m1Var = new m1();
        int i13 = 0;
        if (this.V) {
            i11 = this.R;
        } else {
            i11 = 0;
        }
        SparseIntArray sparseIntArray = m1Var.f53885a;
        p6 p6Var = this.F;
        m1Var.c(sparseIntArray, i11, p6Var);
        this.V = z10;
        if (i0.b.h(i10) < 0.7210000157356262d) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.T = z12;
        if (this.V) {
            i13 = i10;
        }
        m1Var.c(m1Var.f53886b, i13, p6Var);
        if (z11) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(gr.f26523f);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    int f7 = i0.b.f(floatValue, i12, i10);
                    m2 m2Var = m2.this;
                    m2Var.R = f7;
                    m2Var.l();
                    l2 l2Var = m2Var.f53899f;
                    l2Var.invalidate();
                    j2 j2Var = m2Var.X;
                    j2Var.setBackgroundColor(m2Var.R);
                    m1 m1Var2 = m1Var;
                    m1Var2.b(j2Var, floatValue);
                    m2Var.f53891a = m1Var2.a(t6.wj);
                    l2Var.invalidate();
                }
            });
            duration.addListener(new c2(this, i12, i10, m1Var));
            duration.start();
        } else {
            this.R = i10;
            l();
            l2 l2Var = this.f53899f;
            l2Var.invalidate();
            int i14 = this.R;
            j2 j2Var = this.X;
            j2Var.setBackgroundColor(i14);
            m1Var.b(j2Var, 1.0f);
            this.f53891a = m1Var.a(t6.wj);
            l2Var.invalidate();
        }
        J();
    }

    public final void z(boolean z10) {
        if (this.Z0 == z10) {
            return;
        }
        this.Z0 = z10;
        if (z10) {
            if (this.D0) {
                f53890c1++;
            }
        } else if (this.D0) {
            f53890c1--;
        }
        if (f53890c1 > 0) {
            org.telegram.messenger.i0.f2(p());
        } else {
            org.telegram.messenger.i0.P3(p());
        }
    }

    @Override
    public final void b(boolean z10) {
    }
}
