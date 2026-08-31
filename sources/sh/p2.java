package sh;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import k7.c6;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.b4;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.s20;
import org.telegram.ui.Components.xd0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ll0;
import org.telegram.ui.qd1;
import org.telegram.ui.sj0;
import org.telegram.ui.tt0;
import org.telegram.ui.xn;
import org.telegram.ui.ya1;
import qh.d4;
import qh.r8;
import qh.v9;
public final class p2 extends Dialog implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.u3 {
    public static final HashSet T0 = new HashSet();
    public static final jv0 U0;
    public static int V0;
    public org.telegram.ui.ActionBar.n3 A0;
    public final g6 B;
    public boolean B0;
    public boolean C;
    public boolean C0;
    public int D;
    public float D0;
    public long E;
    public ya1 E0;
    public long F;
    public Drawable F0;
    public long G;
    public final HashMap G0;
    public int H;
    public q70 H0;
    public long I;
    public g0 I0;
    public String J;
    public boolean J0;
    public final Paint K;
    public float K0;
    public final Paint L;
    public ValueAnimator L0;
    public final Paint M;
    public ValueAnimator M0;
    public int N;
    public boolean N0;
    public int O;
    public ValueAnimator O0;
    public boolean P;
    public boolean P0;
    public final Paint Q;
    public String Q0;
    public boolean R;
    public org.telegram.ui.f3 R0;
    public boolean S;
    public boolean S0;
    public final m2 T;
    public final FrameLayout.LayoutParams U;
    public final Drawable V;
    public org.telegram.ui.ActionBar.w0 W;
    public BotFullscreenButtons.OptionsIcon X;
    public boolean Y;
    public boolean Z;
    public int f47581a;
    public boolean f47582a0;
    public float f47583b;
    public boolean f47584b0;
    public o1.j f47585c;
    public float f47586c0;
    public Boolean d;
    public float f47587d0;
    public final o2 f47588e;
    public boolean f47589e0;
    public final Rect f47590f;
    public int f47591f0;
    public int f47592g0;
    public final Rect h;
    public Activity f47593h0;
    public final l2 f47594i0;
    public final BotFullscreenButtons f47595j0;
    public ic f47596k0;
    public f0 f47597l0;
    public final FrameLayout m0;
    public int f47598n;
    public final FrameLayout.LayoutParams f47599n0;
    public boolean f47600o0;
    public final xd0 f47601p0;
    public final q1 f47602q0;
    public final org.telegram.ui.ActionBar.o3 f47603r;
    public int f47604r0;
    public final c5.j f47605s;
    public y3 f47606s0;
    public boolean f47607t0;
    public boolean f47608u0;
    public final g2 v;
    public boolean f47609v0;
    public final FrameLayout.LayoutParams f47610w;
    public Boolean f47611w0;
    public final h2 f47612x;
    public boolean f47613x0;
    public final n2 f47614y;
    public u0 f47615y0;
    public boolean f47616z0;

    static {
        jv0 jv0Var = new jv0(new sg.a(2), new sg.a(3));
        jv0Var.f28218c = 100.0f;
        U0 = jv0Var;
        V0 = 0;
    }

    public p2(Context context, g6 g6Var) {
        super(context, R.style.TransparentDialog);
        Object obj;
        this.f47583b = 0.0f;
        this.f47590f = new Rect();
        this.h = new Rect();
        this.f47598n = 0;
        boolean z4 = true;
        Paint paint = new Paint(1);
        this.K = paint;
        Paint paint2 = new Paint();
        this.L = paint2;
        this.M = new Paint(1);
        this.Q = new Paint(1);
        this.f47602q0 = new q1(this, 1);
        this.f47604r0 = -1;
        this.f47609v0 = false;
        this.f47611w0 = null;
        this.G0 = new HashMap();
        this.J0 = false;
        this.N0 = true;
        this.S0 = false;
        this.B = g6Var;
        this.f47581a = k6.w0(null, k6.Ii, false);
        g2 g2Var = new g2(this, context, 0);
        this.v = g2Var;
        g2Var.setAllowFullSizeSwipe(true);
        g2Var.setShouldWaitWebViewScroll(true);
        int i10 = k6.f21659d6;
        h2 h2Var = new h2(this, context, g6Var, k6.v0(i10, g6Var));
        this.f47612x = h2Var;
        h2Var.setOnVerifiedAge(this.E0);
        h2Var.setDelegate(new k2(this, context, g6Var));
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(4.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(1073741824);
        this.N = k6.v0(i10, g6Var);
        int v02 = k6.v0(k6.f21605a7, g6Var);
        this.O = v02;
        AndroidUtilities.setNavigationBarColor((Dialog) this, v02, false);
        o2 o2Var = new o2(this, context);
        this.f47588e = o2Var;
        o2Var.setDelegate(new s1(this, 0));
        FrameLayout.LayoutParams e6 = c6.e(-1, -1, 49);
        this.f47610w = e6;
        o2Var.addView(g2Var, e6);
        l2 l2Var = new l2(this, getContext(), g6Var);
        this.f47594i0 = l2Var;
        l2Var.setOnButtonClickListener(new t1(this, 0));
        l2Var.setOnResizeListener(new q1(this, 3));
        o2Var.addView(l2Var, c6.e(-1, -2, 81));
        BotFullscreenButtons botFullscreenButtons = new BotFullscreenButtons(getContext());
        this.f47595j0 = botFullscreenButtons;
        botFullscreenButtons.setAlpha(0.0f);
        botFullscreenButtons.setVisibility(8);
        z4 = (MessagesController.getInstance(this.D).disableBotFullscreenBlur || SharedConfig.getDevicePerformanceClass() < 2) ? false : false;
        this.f47584b0 = z4;
        if (z4) {
            obj = g2Var.getRenderNode();
        } else {
            obj = null;
        }
        botFullscreenButtons.setParentRenderNode(obj);
        o2Var.addView(botFullscreenButtons, c6.e(-1, -1, 119));
        botFullscreenButtons.setOnCloseClickListener(new q1(this, 4));
        botFullscreenButtons.setOnCollapseClickListener(new q1(this, 5));
        botFullscreenButtons.setOnMenuClickListener(new q1(this, 6));
        FrameLayout frameLayout = new FrameLayout(context);
        this.m0 = frameLayout;
        FrameLayout.LayoutParams e10 = c6.e(-1, 200, 55);
        this.f47599n0 = e10;
        o2Var.addView(frameLayout, e10);
        this.V = getContext().getDrawable(R.drawable.header_shadow).mutate();
        ?? kVar = new org.telegram.ui.ActionBar.k(context, g6Var);
        this.T = kVar;
        kVar.setBackgroundColor(0);
        kVar.setBackButtonImage(R.drawable.ic_close_white);
        A();
        kVar.setActionBarMenuOnItemClick(new ll0(this, 28));
        kVar.setAlpha(0.0f);
        FrameLayout.LayoutParams e11 = c6.e(-1, -2, 49);
        this.U = e11;
        o2Var.addView((View) kVar, e11);
        ?? j3Var = new j3(context, g6Var);
        this.f47614y = j3Var;
        o2Var.addView((View) j3Var, c6.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
        h2Var.setWebViewProgressListener(new dg.o(this, 4));
        g2Var.addView(h2Var, c6.c(-1.0f, -1));
        g2Var.setScrollListener(new q1(this, 7));
        g2Var.setScrollEndListener(new q1(this, 8));
        g2Var.setDelegate(new r1(this));
        g2Var.setIsKeyboardVisible(new r1(this));
        xd0 xd0Var = new xd0(context);
        this.f47601p0 = xd0Var;
        o2Var.addView(xd0Var, c6.c(-1.0f, -1));
        setContentView(o2Var, new ViewGroup.LayoutParams(-1, -1));
        D();
        LaunchActivity launchActivity = LaunchActivity.D1;
        org.telegram.ui.ActionBar.o3 P = launchActivity != null ? launchActivity.P() : null;
        this.f47603r = P;
        if (P != null) {
            v9 v9Var = new v9(o2Var, 13);
            q1 q1Var = new q1(this, 2);
            P.F.add(v9Var);
            P.G.add(q1Var);
            this.f47605s = new c5.j(P);
        }
    }

    public static void d(p2 p2Var) {
        if (!p2Var.J0) {
            super.dismiss();
            p2Var.J0 = true;
        }
    }

    public static WindowInsets e(p2 p2Var, View view, WindowInsets windowInsets) {
        r0.j1 j1Var = r0.m1.h(view, windowInsets).f46452a;
        i0.b f10 = j1Var.f(2);
        p2Var.f47590f.set(f10.f7757a, f10.f7758b, f10.f7759c, f10.d);
        i0.b f11 = j1Var.f(647);
        Rect rect = p2Var.h;
        rect.set(Math.max(f11.f7757a, windowInsets.getStableInsetLeft()), Math.max(f11.f7758b, windowInsets.getStableInsetTop()), Math.max(f11.f7759c, windowInsets.getStableInsetRight()), Math.max(f11.d, windowInsets.getStableInsetBottom()));
        int i10 = Build.VERSION.SDK_INT;
        if (i10 <= 28) {
            rect.top = Math.max(rect.top, AndroidUtilities.getStatusBarHeight(p2Var.getContext()));
        }
        int i11 = j1Var.f(8).d;
        if (i11 > rect.bottom && i11 > AndroidUtilities.dp(20.0f)) {
            p2Var.f47598n = i11;
        } else {
            p2Var.f47598n = 0;
        }
        p2Var.D();
        if (i10 >= 30) {
            return WindowInsets.CONSUMED;
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    public static void j(int i10, long j10, Runnable runnable) {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(i10).getAttachMenuBots().bots;
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
        String formatString = LocaleController.formatString(R.string.BotRemoveFromMenu, tL_attachMenuBot.short_name);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(LaunchActivity.R().getContext());
        String string = LocaleController.getString(R.string.BotRemoveFromMenuTitle);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
        d2Var.O = string;
        d2Var.Q = AndroidUtilities.replaceTags(formatString);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.Components.s1(i10, j10, tL_attachMenuBot, runnable));
        l.d.u(R.string.Cancel, alertDialog$Builder, null);
    }

    public static JSONObject p(g6 g6Var, final boolean z4) {
        try {
            JSONObject jSONObject = new JSONObject();
            final int v = k6.v(-16777216, k6.v0(k6.f21731h5, g6Var));
            Utilities.CallbackReturn callbackReturn = new Utilities.CallbackReturn() {
                @Override
                public final Object run(Object obj) {
                    int v10 = k6.v(v, ((Integer) obj).intValue());
                    Integer valueOf = Integer.valueOf(v10);
                    if (z4) {
                        return String.format(Locale.US, "#%02X%02X%02X", Integer.valueOf(Color.red(v10)), Integer.valueOf(Color.green(v10)), Integer.valueOf(Color.blue(v10)));
                    }
                    return valueOf;
                }
            };
            jSONObject.put("bg_color", callbackReturn.run(Integer.valueOf(v)));
            jSONObject.put("section_bg_color", callbackReturn.run(Integer.valueOf(k6.v0(k6.f21659d6, g6Var))));
            int i10 = k6.f21605a7;
            jSONObject.put("secondary_bg_color", callbackReturn.run(Integer.valueOf(k6.v0(i10, g6Var))));
            jSONObject.put("text_color", callbackReturn.run(Integer.valueOf(k6.v0(k6.G6, g6Var))));
            jSONObject.put("hint_color", callbackReturn.run(Integer.valueOf(k6.v0(k6.H6, g6Var))));
            jSONObject.put("link_color", callbackReturn.run(Integer.valueOf(k6.v0(k6.J6, g6Var))));
            jSONObject.put("button_color", callbackReturn.run(Integer.valueOf(k6.v0(k6.Oh, g6Var))));
            jSONObject.put("button_text_color", callbackReturn.run(Integer.valueOf(k6.v0(k6.Sh, g6Var))));
            jSONObject.put("header_bg_color", callbackReturn.run(Integer.valueOf(k6.v0(k6.f21930s8, g6Var))));
            jSONObject.put("accent_text_color", callbackReturn.run(Integer.valueOf(k6.v0(k6.f21894q6, g6Var))));
            jSONObject.put("section_header_text_color", callbackReturn.run(Integer.valueOf(k6.v0(k6.L6, g6Var))));
            jSONObject.put("subtitle_text_color", callbackReturn.run(Integer.valueOf(k6.v0(k6.f22053z6, g6Var))));
            jSONObject.put("destructive_text_color", callbackReturn.run(Integer.valueOf(k6.v0(k6.f21876p7, g6Var))));
            jSONObject.put("section_separator_color", callbackReturn.run(Integer.valueOf(k6.v0(k6.f21660d7, g6Var))));
            jSONObject.put("bottom_bar_bg_color", callbackReturn.run(Integer.valueOf(k6.v0(i10, g6Var))));
            return jSONObject;
        } catch (Exception e6) {
            FileLog.e(e6);
            return null;
        }
    }

    public final void A() {
        if (!this.R) {
            int i10 = k6.G6;
            g6 g6Var = this.B;
            int v02 = k6.v0(i10, g6Var);
            m2 m2Var = this.T;
            m2Var.setTitleColor(v02);
            m2Var.C(k6.v0(i10, g6Var), false);
            m2Var.B(k6.v0(k6.f21963u8, g6Var), false);
            m2Var.D(k6.v0(k6.G8, g6Var), false);
            m2Var.E(k6.v0(k6.E8, g6Var), false, false);
            m2Var.E(k6.v0(k6.F8, g6Var), true, false);
            m2Var.F(k6.v0(k6.I5, g6Var), false);
        }
        this.f47612x.setFlickerViewColor(this.M.getColor());
    }

    public final void B() {
        ic icVar;
        boolean z4;
        h0 c3 = h0.c(getContext(), this.D, this.E);
        ArrayList arrayList = c3.f47449e;
        g0 g0Var = c3.f47450f;
        boolean z10 = true;
        if (g0Var == null) {
            ic icVar2 = this.f47596k0;
            if (icVar2 != null) {
                icVar2.b();
                this.f47596k0 = null;
            }
        } else if ((g0Var.c() && !g0Var.f47436l) || g0Var.f47435k) {
            if (this.I0 != g0Var && (icVar = this.f47596k0) != null) {
                icVar.b();
                this.f47596k0 = null;
            }
            ic icVar3 = this.f47596k0;
            if (icVar3 == null || !icVar3.f27747l) {
                this.I0 = g0Var;
                f0 f0Var = new f0(getContext(), this.B);
                this.f47597l0 = f0Var;
                ic f10 = ic.f(this.m0, f0Var, 5000);
                this.f47596k0 = f10;
                f10.k(true);
            }
            if (this.f47597l0.c(g0Var)) {
                this.f47596k0 = null;
            }
            g0Var.f47435k = false;
            g0Var.f47436l = true;
        } else {
            f0 f0Var2 = this.f47597l0;
            if (f0Var2 != null) {
                this.I0 = g0Var;
                if (f0Var2.c(g0Var)) {
                    this.f47596k0 = null;
                }
            }
        }
        C();
        for (Map.Entry entry : this.G0.entrySet()) {
            org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) entry.getValue();
            g0 g0Var2 = (g0) entry.getKey();
            g1Var.setText(g0Var2.f47429c);
            if (!g0Var2.c()) {
                g1Var.setSubtext(AndroidUtilities.formatFileSize(g0Var2.f47432g));
            } else {
                Pair b10 = g0Var2.b();
                if (((Long) b10.second).longValue() > 0) {
                    g1Var.setSubtext(AndroidUtilities.formatFileSize(((Long) b10.first).longValue()) + " / " + AndroidUtilities.formatFileSize(((Long) b10.second).longValue()));
                } else {
                    g1Var.setSubtext(AndroidUtilities.formatFileSize(((Long) b10.first).longValue()));
                }
            }
            if (g0Var2.c()) {
                g1Var.setRightIcon(R.drawable.msg_close);
                g1Var.f21374b.setPadding(0, 0, AndroidUtilities.dp(32.0f), 0);
            } else if (g0Var2.f47433i) {
                g1Var.setVisibility(8);
            } else {
                g1Var.setRightIcon(0);
                g1Var.f21374b.setPadding(0, 0, 0, 0);
            }
            g1Var.setOnClickListener(new r8(2, this, g0Var2));
        }
        BotFullscreenButtons.OptionsIcon optionsIcon = this.X;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if (((g0) obj).c()) {
                    z4 = true;
                    break;
                }
            } else {
                z4 = false;
                break;
            }
        }
        optionsIcon.setDownloading(z4);
        int size2 = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 < size2) {
                Object obj2 = arrayList.get(i11);
                i11++;
                if (((g0) obj2).c()) {
                    break;
                }
            } else {
                z10 = false;
                break;
            }
        }
        this.f47595j0.setDownloading(z10);
    }

    public final void C() {
        f0 f0Var = this.f47597l0;
        if (f0Var == null) {
            return;
        }
        if (this.f47582a0) {
            f0Var.setArrow(AndroidUtilities.lerp(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(26.0f), this.f47586c0));
        } else if (this.f47583b > 0.5f) {
            f0Var.setArrow(AndroidUtilities.dp(24.0f));
        } else {
            f0Var.setArrow(-1);
        }
    }

    public final void D() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        BotFullscreenButtons botFullscreenButtons = this.f47595j0;
        Rect rect = this.h;
        botFullscreenButtons.setInsets(rect);
        boolean z4 = this.f47582a0;
        h2 h2Var = this.f47612x;
        o2 o2Var = this.f47588e;
        l2 l2Var = this.f47594i0;
        int i16 = 0;
        if (z4) {
            if (l2Var != null && l2Var.getTotalHeight() > 0) {
                i14 = rect.bottom;
            } else {
                i14 = 0;
            }
            int i17 = rect.left;
            int i18 = rect.top;
            int i19 = rect.right;
            if (this.f47598n > i14 || (l2Var != null && l2Var.getTotalHeight() > 0)) {
                i15 = 0;
            } else {
                i15 = rect.bottom;
            }
            Rect rect2 = new Rect(i17, i18, i19, i15);
            int dp = AndroidUtilities.dp(46.0f);
            h2Var.K(rect2, false);
            h2Var.J(dp, false);
            o2Var.setPadding(0, 0, 0, Math.max(this.f47598n, i14));
        } else {
            h2Var.K(new Rect(0, 0, 0, 0), false);
            h2Var.J(0, false);
            int i20 = rect.left;
            int i21 = rect.right;
            int i22 = this.f47598n;
            org.telegram.ui.ActionBar.o3 o3Var = this.f47603r;
            if (o3Var != null) {
                i10 = o3Var.E;
            } else {
                i10 = 0;
            }
            o2Var.setPadding(i20, 0, i21, Math.max(i22, i10 + rect.bottom));
        }
        this.f47610w.topMargin = AndroidUtilities.dp(24.0f);
        boolean z10 = this.f47582a0;
        if (!z10) {
            i11 = 0;
        } else {
            i11 = rect.left;
        }
        FrameLayout.LayoutParams layoutParams = this.U;
        layoutParams.leftMargin = i11;
        layoutParams.rightMargin = 0;
        if (!z10) {
            i12 = 0;
        } else {
            i12 = rect.left;
        }
        FrameLayout.LayoutParams layoutParams2 = this.f47599n0;
        layoutParams2.leftMargin = i12;
        if (!z10) {
            i13 = 0;
        } else {
            i13 = rect.right;
        }
        layoutParams2.rightMargin = i13;
        boolean z11 = this.f47589e0;
        g2 g2Var = this.v;
        if (!z11) {
            g2Var.setSwipeOffsetAnimationDisallowed(true);
            if (this.f47582a0) {
                g2Var.setTopActionBarOffsetY(-AndroidUtilities.dp(24.0f));
            } else {
                g2Var.setTopActionBarOffsetY((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(24.0f));
            }
            g2Var.setSwipeOffsetAnimationDisallowed(false);
            g2Var.c();
            g2Var.invalidate();
            g2Var.requestLayout();
        }
        if (g2Var != null) {
            g2Var.setFullSize(m());
        }
        l2Var.requestLayout();
        o2Var.requestLayout();
        if (!this.f47582a0) {
            i16 = 8;
        }
        botFullscreenButtons.setVisibility(i16);
    }

    public final void E() {
        boolean z4;
        int i10;
        boolean z10 = true;
        if (this.R) {
            z4 = !this.P;
        } else {
            z4 = (AndroidUtilities.isTablet() || i0.a.f(k6.w0(null, k6.f21659d6, true)) < 0.7210000157356262d || this.f47583b < 0.85f) ? false : false;
        }
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z4) {
            this.d = Boolean.valueOf(z4);
            if (Build.VERSION.SDK_INT >= 23) {
                o2 o2Var = this.f47588e;
                int systemUiVisibility = o2Var.getSystemUiVisibility();
                if (z4) {
                    i10 = systemUiVisibility | 8192;
                } else {
                    i10 = systemUiVisibility & (-8193);
                }
                o2Var.setSystemUiVisibility(i10);
            }
        }
    }

    public final void F() {
        org.telegram.ui.web.x0 webView;
        h2 h2Var = this.f47612x;
        if (h2Var == null || (webView = h2Var.getWebView()) == null) {
            return;
        }
        webView.setBackgroundColor(this.M.getColor());
    }

    public final void G() {
        int i10;
        l2 l2Var;
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
            boolean z4 = this.f47582a0;
            if (z4) {
                attributes.flags = i10 | attributes.flags;
            } else {
                attributes.flags = (~i10) & attributes.flags;
            }
            o2 o2Var = this.f47588e;
            if (z4 && (((l2Var = this.f47594i0) == null || l2Var.getTotalHeight() <= 0) && !o2Var.f47557u0)) {
                o2Var.setSystemUiVisibility(o2Var.getSystemUiVisibility() | 2);
            } else {
                o2Var.setSystemUiVisibility(o2Var.getSystemUiVisibility() & (-3));
            }
            window.setAttributes(attributes);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.n3 a() {
        boolean z4;
        String str;
        boolean z10;
        boolean booleanValue;
        float f10;
        org.telegram.ui.ActionBar.n3 n3Var = new org.telegram.ui.ActionBar.n3();
        n3Var.f22172o = this.N;
        n3Var.f22171n = this.f47604r0;
        n3Var.f22169l = this.R;
        n3Var.f22170m = this.S;
        n3Var.f22173p = this.M.getColor();
        n3Var.f22160a = this.f47606s0;
        boolean z11 = false;
        h2 h2Var = this.f47612x;
        if (h2Var != null && h2Var.K) {
            z4 = true;
        } else {
            z4 = false;
        }
        n3Var.f22175r = z4;
        n3Var.B = k6.I.q();
        org.telegram.ui.web.x0 x0Var = null;
        if (h2Var != null) {
            str = h2Var.getUrlLoaded();
        } else {
            str = null;
        }
        n3Var.v = str;
        g2 g2Var = this.v;
        if ((g2Var == null || g2Var.getSwipeOffsetY() >= 0.0f) && !this.f47608u0 && !m() && !this.f47582a0) {
            z10 = false;
        } else {
            z10 = true;
        }
        n3Var.h = z10;
        n3Var.f22180x = this.f47582a0;
        n3Var.f22181y = this.f47584b0;
        Boolean bool = this.f47611w0;
        if (bool == null) {
            booleanValue = this.f47609v0;
        } else {
            booleanValue = bool.booleanValue();
        }
        n3Var.f22182z = booleanValue;
        if (g2Var != null) {
            f10 = g2Var.getOffsetY();
        } else {
            f10 = Float.MAX_VALUE;
        }
        n3Var.f22166i = f10;
        n3Var.A = this.f47613x0;
        n3Var.f22176s = this.f47607t0;
        n3Var.f22179w = this.f47600o0;
        n3Var.f22177t = this.Y;
        n3Var.f22167j = (g2Var == null || g2Var.J) ? true : true;
        n3Var.f22178u = this.f47594i0.f47702e;
        n3Var.f22174q = this.O;
        u0 u0Var = this.f47615y0;
        if (u0Var != null) {
            u0Var.b();
        }
        n3Var.I = this.f47615y0;
        if (h2Var != null) {
            x0Var = h2Var.getWebView();
        }
        if (x0Var != null) {
            h2Var.g("preserveWebView");
            h2Var.f42495w0 = true;
            if (h2Var.f42481l0) {
                h2Var.v("visibility_changed", org.telegram.ui.web.a1.x(Boolean.FALSE, "is_visible"));
            }
            n3Var.f22161b = x0Var;
            n3Var.d = h2Var.getBotProxy();
            n3Var.f22163e = x0Var.getWidth();
            n3Var.f22164f = x0Var.getHeight();
            x0Var.onPause();
        }
        boolean z12 = this.P0;
        n3Var.E = z12;
        if (z12) {
            n3Var.F = this.Q0;
        }
        n3Var.J = this.f47616z0;
        this.A0 = n3Var;
        return n3Var;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final boolean c(org.telegram.ui.ActionBar.k3 k3Var) {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.webViewResultSent) {
            if (this.G == ((Long) objArr[0]).longValue()) {
                k(false);
            }
        } else if (i10 == NotificationCenter.didSetNewTheme) {
            this.f47588e.invalidate();
            this.f47612x.f42482n.b(k6.v0(k6.f21659d6, this.B), 153);
            A();
            E();
        } else if (i10 == NotificationCenter.botDownloadsUpdate) {
            B();
        }
    }

    @Override
    public final void dismiss(boolean z4) {
        k(false);
    }

    public final void g(TL_bots.botAppSettings botappsettings, boolean z4) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        if (botappsettings != null) {
            boolean q10 = k6.I.q();
            int i15 = botappsettings.flags;
            if (q10) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            if ((i10 & i15) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (q10) {
                i11 = 16;
            } else {
                i11 = 8;
            }
            if ((i15 & i11) != 0) {
                if (q10) {
                    i14 = botappsettings.header_dark_color;
                } else {
                    i14 = botappsettings.header_color;
                }
                t(i14 | (-16777216), true, z4);
            }
            if (z10) {
                if (q10) {
                    i12 = botappsettings.background_dark_color;
                } else {
                    i12 = botappsettings.background_color;
                }
                v(i12 | (-16777216), z4);
                if (q10) {
                    i13 = botappsettings.background_dark_color;
                } else {
                    i13 = botappsettings.background_color;
                }
                y(i13 | (-16777216), z4);
            }
        }
    }

    @Override
    public final int getNavigationBarColor(int i10) {
        return i0.a.d(this.K0, i10, this.O);
    }

    @Override
    public final org.telegram.ui.ActionBar.v3 mo36getWindowView() {
        return this.f47588e;
    }

    public final void h() {
        LaunchActivity launchActivity;
        if (!this.J0 && (launchActivity = LaunchActivity.D1) != null) {
            launchActivity.H(true, true, true);
        }
        o2 o2Var = this.f47588e;
        if (o2Var != null) {
            o2Var.invalidate();
        }
    }

    public final void i() {
        if (this.R0 == null) {
            org.telegram.ui.f3 f3Var = new org.telegram.ui.f3(getContext());
            this.R0 = f3Var;
            this.v.addView(f3Var, c6.c(-1.0f, -1));
            this.R0.setTranslationY(-1.0f);
            this.R0.h.setOnClickListener(new y1(this, 0));
            this.R0.setBackgroundColor(this.M.getColor());
            AndroidUtilities.updateViewVisibilityAnimated(this.R0, this.P0, 1.0f, false);
        }
    }

    public final void k(boolean z4) {
        int i10;
        LaunchActivity launchActivity;
        if (this.Z) {
            return;
        }
        int i11 = 0;
        if (this.E0 != null) {
            z4 = false;
        }
        this.Z = true;
        z(false);
        AndroidUtilities.cancelRunOnUIThread(this.f47602q0);
        NotificationCenter.getInstance(this.D).removeObserver(this, NotificationCenter.webViewResultSent);
        NotificationCenter.getInstance(this.D).removeObserver(this, NotificationCenter.botDownloadsUpdate);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
        if (z4 && ((launchActivity = LaunchActivity.D1) == null || launchActivity.f34176v0 == null)) {
            z4 = false;
        }
        if (z4) {
            o1.j jVar = this.f47585c;
            if (jVar != null) {
                jVar.f16336u.f16343i = 0.0f;
                jVar.f();
            }
            LaunchActivity.D1.f34176v0.b(this);
        } else {
            l2 l2Var = this.f47594i0;
            if (l2Var != null) {
                l2Var.animate().translationY(l2Var.getTotalHeight()).alpha(0.0f).setDuration(160L).setInterpolator(pr.h).start();
            }
            this.f47612x.h();
            g2 g2Var = this.v;
            int height = g2Var.getHeight();
            if (l2Var != null) {
                i10 = l2Var.getTotalHeight();
            } else {
                i10 = 0;
            }
            int i12 = height + i10;
            Rect rect = this.h;
            int R = this.f47588e.R() + i12 + rect.top + rect.bottom;
            if (m()) {
                i11 = AndroidUtilities.dp(200.0f);
            }
            g2Var.f(R + i11, true, new q1(this, 0));
        }
        T0.remove(this);
    }

    public final Activity l() {
        Activity ownerActivity = getOwnerActivity();
        if (ownerActivity == null) {
            ownerActivity = LaunchActivity.D1;
        }
        if (ownerActivity == null) {
            return AndroidUtilities.findActivity(getContext());
        }
        return ownerActivity;
    }

    public final boolean m() {
        if (!this.f47582a0) {
            Boolean bool = this.f47611w0;
            if (bool == null) {
                if (!this.f47609v0) {
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

    public final void n() {
        boolean z4;
        if (this.f47606s0 != null) {
            long max = Math.max(0L, 60000 - (System.currentTimeMillis() - this.f47606s0.f47803r));
            String str = null;
            this.f47611w0 = null;
            TLObject tLObject = this.f47606s0.f47802q;
            if (tLObject instanceof TLRPC.TL_webViewResultUrl) {
                TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject;
                this.G = tL_webViewResultUrl.query_id;
                str = tL_webViewResultUrl.url;
                z4 = tL_webViewResultUrl.same_origin;
                this.f47611w0 = Boolean.valueOf(tL_webViewResultUrl.fullsize);
                boolean z10 = this.B0;
                if (!z10) {
                    x(tL_webViewResultUrl.fullscreen, !z10, this.f47584b0);
                }
            } else {
                if (tLObject instanceof TLRPC.TL_appWebViewResultUrl) {
                    this.G = 0L;
                    str = ((TLRPC.TL_appWebViewResultUrl) tLObject).url;
                } else if (tLObject instanceof TLRPC.TL_simpleWebViewResultUrl) {
                    this.G = 0L;
                    str = ((TLRPC.TL_simpleWebViewResultUrl) tLObject).url;
                }
                z4 = false;
            }
            h2 h2Var = this.f47612x;
            if (z4) {
                h2Var.setTrustedOrigin(str);
            }
            if (str != null && !this.B0) {
                MediaDataController.getInstance(this.D).increaseWebappRating(this.f47606s0.f47790c);
                h2Var.r(this.D, str);
            }
            AndroidUtilities.runOnUIThread(this.f47602q0, max);
            g2 g2Var = this.v;
            if (g2Var != null) {
                g2Var.setFullSize(m());
            }
        }
    }

    public final void o(boolean z4) {
        if (this.f47616z0 == z4) {
            return;
        }
        this.f47616z0 = z4;
        if (this.S0) {
            if (z4) {
                V0++;
            } else {
                V0--;
            }
        }
        if (V0 > 0) {
            AndroidUtilities.lockOrientation(l());
        } else {
            AndroidUtilities.unlockOrientation(l());
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u(true);
        if (this.f47585c == null) {
            o1.j jVar = new o1.j(this, U0);
            o1.k kVar = new o1.k();
            kVar.b(1200.0f);
            kVar.a(1.0f);
            jVar.f16336u = kVar;
            this.f47585c = jVar;
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.f47601p0.getVisibility() == 0) {
            if (getOwnerActivity() != null) {
                getOwnerActivity().finish();
            }
        } else if (this.f47612x.z()) {
        } else {
            k(true);
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        l2 l2Var;
        super.onCreate(bundle);
        Window window = getWindow();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            window.addFlags(-2147483392);
        } else {
            window.addFlags(-2147417856);
        }
        window.setWindowAnimations(R.style.DialogNoAnimation);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.gravity = 51;
        attributes.dimAmount = 0.0f;
        int i11 = attributes.flags;
        int i12 = i11 & (-3);
        attributes.flags = i12;
        attributes.softInputMode = 16;
        attributes.height = -1;
        boolean z4 = true;
        if (i10 >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        if (this.f47582a0) {
            attributes.flags = i12 | 512;
        } else {
            attributes.flags = i11 & (-515);
        }
        window.setAttributes(attributes);
        if (i10 >= 23) {
            window.setStatusBarColor(0);
        }
        o2 o2Var = this.f47588e;
        o2Var.setFitsSystemWindows(true);
        o2Var.setSystemUiVisibility(1792);
        o2Var.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
            @Override
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                return p2.e(p2.this, view, windowInsets);
            }
        });
        if (this.f47582a0 && ((l2Var = this.f47594i0) == null || l2Var.getTotalHeight() <= 0)) {
            o2Var.setSystemUiVisibility(o2Var.getSystemUiVisibility() | 2);
        } else {
            o2Var.setSystemUiVisibility(o2Var.getSystemUiVisibility() & (-3));
        }
        if (i10 >= 26) {
            if (i0.a.f(this.O) < 0.7210000157356262d) {
                z4 = false;
            }
            AndroidUtilities.setLightNavigationBar(this, z4);
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewTheme);
        NotificationCenter.getInstance(this.D).addObserver(this, NotificationCenter.botDownloadsUpdate);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u(false);
        o1.j jVar = this.f47585c;
        if (jVar != null) {
            jVar.c();
            this.f47585c = null;
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
            ((LaunchActivity) context).f34182y0.add(this.f47601p0);
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
            ((LaunchActivity) context).f34182y0.remove(this.f47601p0);
        }
    }

    public final boolean q() {
        String str;
        if (this.f47600o0) {
            TLRPC.User user = MessagesController.getInstance(this.D).getUser(Long.valueOf(this.E));
            if (user != null) {
                str = ContactsController.formatName(user.first_name, user.last_name);
            } else {
                str = null;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            alertDialog$Builder.f21166a.O = str;
            alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.BotWebViewChangesMayNotBeSaved);
            alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewCloseAnyway), new r1(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
            d2Var.show();
            ((TextView) d2Var.d(-1)).setTextColor(k6.v0(k6.f21895q7, this.B));
            return false;
        }
        k(false);
        return true;
    }

    public final void r() {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        View view;
        boolean z4;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i10;
        int i11;
        ArrayList arrayList;
        int v02;
        int v03;
        int l1;
        TLRPC.User user = MessagesController.getInstance(this.D).getUser(Long.valueOf(this.E));
        ArrayList<TLRPC.TL_attachMenuBot> arrayList2 = MediaDataController.getInstance(this.D).getAttachMenuBots().bots;
        int size = arrayList2.size();
        int i12 = 0;
        while (true) {
            if (i12 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList2.get(i12);
                i12++;
                tL_attachMenuBot = tL_attachMenuBot2;
                if (tL_attachMenuBot.bot_id == this.E) {
                    break;
                }
            } else {
                tL_attachMenuBot = null;
                break;
            }
        }
        q70 q70Var = this.H0;
        if (q70Var != null) {
            q70Var.u();
        }
        if (this.f47582a0) {
            view = this.f47595j0;
        } else {
            view = this.W;
        }
        q70 G = q70.G(this.f47588e, this.B, view, true);
        this.H0 = G;
        ArrayList arrayList3 = h0.c(getContext(), this.D, this.E).f47449e;
        HashMap hashMap = this.G0;
        hashMap.clear();
        if (!arrayList3.isEmpty()) {
            q70 J = G.J();
            J.c(R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), new tt0(G, 25), false);
            J.k();
            int size2 = arrayList3.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj = arrayList3.get(i13);
                i13++;
                g0 g0Var = (g0) obj;
                String str = g0Var.f47429c;
                sj0 sj0Var = new sj0(17);
                g6 g6Var = J.d;
                if (J.f30304e == null) {
                    arrayList = arrayList3;
                } else {
                    org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, J.f30304e, J.d, false, false);
                    arrayList = arrayList3;
                    g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                    g1Var.setText(str);
                    g1Var.setSubtext("");
                    Integer num = J.f30314j0;
                    if (num != null) {
                        v02 = num.intValue();
                    } else {
                        v02 = k6.v0(k6.E8, g6Var);
                    }
                    Integer num2 = J.f30316k0;
                    if (num2 != null) {
                        v03 = num2.intValue();
                    } else {
                        v03 = k6.v0(k6.F8, g6Var);
                    }
                    g1Var.c(v02, v03);
                    Integer num3 = J.f30318l0;
                    if (num3 != null) {
                        l1 = num3.intValue();
                    } else {
                        l1 = k6.l1(0.12f, k6.v0(k6.E8, g6Var));
                    }
                    g1Var.setSelectorColor(l1);
                    g1Var.setOnClickListener(new org.telegram.ui.Components.g0(J, sj0Var));
                    int i14 = J.S;
                    if (i14 > 0) {
                        g1Var.setMinimumWidth(AndroidUtilities.dp(i14));
                        J.r(g1Var, c6.n(J.S, -2));
                    } else {
                        J.r(g1Var, c6.n(-1, -2));
                        hashMap.put(g0Var, J.y());
                        arrayList3 = arrayList;
                    }
                }
                hashMap.put(g0Var, J.y());
                arrayList3 = arrayList;
            }
            B();
            J.S = AndroidUtilities.dp(180.0f);
            G.c(R.drawable.menu_download_round, LocaleController.getString(R.string.BotDownloads), new lh.y2(G, J, 9), false);
            G.k();
        }
        if (this.E0 == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        G.l(R.drawable.msg_bot, LocaleController.getString(R.string.BotWebViewOpenBot), new q1(this, 9), z4);
        if (this.E0 == null && this.Y) {
            z10 = true;
        } else {
            z10 = false;
        }
        G.l(R.drawable.msg_settings, LocaleController.getString(R.string.BotWebViewSettings), new q1(this, 10), z10);
        G.c(R.drawable.msg_retry, LocaleController.getString(R.string.BotWebViewReloadPage), new q1(this, 11), false);
        if (this.E0 == null && user != null && user.bot_has_main_app) {
            z11 = true;
        } else {
            z11 = false;
        }
        G.l(R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut), new q1(this, 12), z11);
        if (this.E0 == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        G.l(R.drawable.menu_intro, LocaleController.getString(R.string.BotWebViewToS), new q1(this, 13), z12);
        if (this.E0 == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        G.l(R.drawable.msg_report, LocaleController.getString(R.string.BotWebViewReportBot), new q1(this, 14), z13);
        if (this.E0 == null && tL_attachMenuBot != null && (tL_attachMenuBot.show_in_side_menu || tL_attachMenuBot.show_in_attach_menu)) {
            z14 = true;
        } else {
            z14 = false;
        }
        G.l(R.drawable.msg_delete, LocaleController.getString(R.string.BotWebViewDeleteBot), new q1(this, 15), z14);
        if (this.N != k6.w0(null, k6.f21659d6, false)) {
            if (AndroidUtilities.computePerceivedBrightness(this.N) >= 0.721f) {
                i10 = -1;
            } else {
                i10 = -15198183;
            }
            if (AndroidUtilities.computePerceivedBrightness(i10) >= 0.721f) {
                i11 = -16777216;
            } else {
                i11 = -1;
            }
            int l12 = k6.l1(0.85f, i11);
            int l13 = k6.l1(0.1f, i11);
            G.P(i10);
            for (int i15 = 0; i15 < G.x(); i15++) {
                View w10 = G.w(i15);
                if (w10 instanceof org.telegram.ui.ActionBar.g1) {
                    org.telegram.ui.ActionBar.g1 g1Var2 = (org.telegram.ui.ActionBar.g1) w10;
                    g1Var2.c(i11, l12);
                    g1Var2.setSelectorColor(l13);
                }
            }
        }
        G.V(5);
        G.a0(-this.h.right, 0.0f);
        G.U = true;
        G.f30330t = false;
        G.f30329s = 0;
        G.Z();
    }

    @Override
    public final void release() {
        if (this.J0) {
            return;
        }
        try {
            super.dismiss();
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        z(false);
    }

    public final void s(org.telegram.ui.ActionBar.p2 p2Var, y3 y3Var) {
        TLRPC.User user;
        org.telegram.ui.ActionBar.z zVar;
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        org.telegram.ui.ActionBar.z zVar2;
        boolean z4;
        TLRPC.InputPeer inputPeer;
        TLRPC.InputPeer inputPeer2;
        boolean z10;
        TL_bots.botAppSettings botappsettings;
        boolean z11;
        this.f47606s0 = y3Var;
        int i10 = y3Var.f47788a;
        this.D = i10;
        this.F = y3Var.f47789b;
        this.E = y3Var.f47790c;
        this.H = y3Var.h;
        this.I = y3Var.f47794i;
        this.J = y3Var.f47791e;
        TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(this.E));
        CharSequence userName = UserObject.getUserName(user2);
        boolean z12 = false;
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(AndroidUtilities.dp(20.0f));
            userName = Emoji.replaceEmoji(userName, textPaint.getFontMetricsInt(), false);
        } catch (Exception unused) {
        }
        m2 m2Var = this.T;
        m2Var.setTitle(userName);
        TLRPC.UserFull userFull = MessagesController.getInstance(this.D).getUserFull(this.E);
        g6 g6Var = this.B;
        if ((user2 != null && user2.verified) || (userFull != null && (user = userFull.user) != null && user.verified)) {
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.verified_profile).mutate();
            this.F0 = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(k6.v0(k6.Oh, g6Var), PorterDuff.Mode.SRC_IN));
            this.F0.setAlpha(255);
            m2Var.getTitleTextView().setDrawablePadding(AndroidUtilities.dp(2.0f));
            m2Var.getTitleTextView().i(new eg.i1(this, 8));
        }
        BotFullscreenButtons botFullscreenButtons = this.f47595j0;
        if (botFullscreenButtons != null) {
            String userName2 = UserObject.getUserName(user2);
            if (user2 != null && user2.verified) {
                z11 = true;
            } else {
                z11 = false;
            }
            botFullscreenButtons.setName(userName2, z11);
        }
        org.telegram.ui.ActionBar.z n10 = m2Var.n();
        n10.removeAllViews();
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(this.D).getAttachMenuBots().bots;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i11);
                i11++;
                tL_attachMenuBot = tL_attachMenuBot2;
                zVar = n10;
                if (tL_attachMenuBot.bot_id == this.E) {
                    break;
                }
                n10 = zVar;
            } else {
                zVar = n10;
                tL_attachMenuBot = null;
                break;
            }
        }
        if (!this.B0) {
            if (userFull != null) {
                TL_bots.BotInfo botInfo = userFull.bot_info;
                if (botInfo != null && (botappsettings = botInfo.app_settings) != null) {
                    g(botappsettings, false);
                }
                z10 = true;
            } else {
                z10 = true;
                MessagesController.getInstance(this.D).loadFullUser(user2, 0, true, new t1(this, 1));
            }
            if (y3Var.f47801p) {
                x(z10, false, this.f47584b0);
            }
        }
        if (this.E0 == null) {
            zVar2 = zVar;
            zVar2.a(R.id.menu_collapse_bot, R.drawable.arrow_more);
        } else {
            zVar2 = zVar;
        }
        BotFullscreenButtons.OptionsIcon optionsIcon = new BotFullscreenButtons.OptionsIcon(getContext());
        this.X = optionsIcon;
        org.telegram.ui.ActionBar.w0 d = zVar2.d(0, optionsIcon);
        this.W = d;
        d.setOnClickListener(new y1(this, 1));
        m2Var.setActionBarMenuOnItemClick(new b2(this));
        JSONObject p10 = p(g6Var, false);
        TLRPC.User user3 = MessagesController.getInstance(this.D).getUser(Long.valueOf(this.E));
        h2 h2Var = this.f47612x;
        h2Var.setBotUser(user3);
        h2Var.q(this.D, this.E);
        TLRPC.User user4 = y3Var.f47798m;
        if (tL_attachMenuBot != null && tL_attachMenuBot.show_in_side_menu && !MediaDataController.getInstance(this.D).isShortcutAdded(this.E, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT)) {
            if (user4 == null) {
                user4 = MessagesController.getInstance(this.D).getUser(Long.valueOf(this.E));
            }
            if (user4 != null && user4.photo != null && !FileLoader.getInstance(this.D).getPathToAttach(user4.photo.photo_small, true).exists()) {
                MediaDataController.getInstance(this.D).preloadImage(ImageLocation.getForUser(this.D, user4, 1), 0);
            }
        }
        if (y3Var.f47802q != null) {
            n();
            return;
        }
        int i12 = y3Var.f47793g;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 == 5) {
                                TLRPC.TL_messages_requestChatJoinWebView tL_messages_requestChatJoinWebView = new TLRPC.TL_messages_requestChatJoinWebView();
                                tL_messages_requestChatJoinWebView.platform = "android";
                                tL_messages_requestChatJoinWebView.query_id = y3Var.d;
                                if (p10 != null) {
                                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                    tL_messages_requestChatJoinWebView.theme_params = tL_dataJSON;
                                    tL_dataJSON.data = p10.toString();
                                }
                                ConnectionsManager.getInstance(this.D).sendRequestTyped(tL_messages_requestChatJoinWebView, new Object(), new d4(this, 11), 66);
                                return;
                            }
                            return;
                        }
                        TLRPC.TL_messages_requestMainWebView tL_messages_requestMainWebView = new TLRPC.TL_messages_requestMainWebView();
                        tL_messages_requestMainWebView.bot = MessagesController.getInstance(this.D).getInputUser(y3Var.f47790c);
                        tL_messages_requestMainWebView.platform = "android";
                        if (p2Var instanceof xn) {
                            xn xnVar = (xn) p2Var;
                            if (xnVar.i() != null) {
                                inputPeer2 = MessagesController.getInputPeer(xnVar.i());
                            } else {
                                inputPeer2 = MessagesController.getInputPeer(xnVar.f43165e);
                            }
                        } else {
                            inputPeer2 = MessagesController.getInstance(this.D).getInputPeer(y3Var.f47789b);
                        }
                        tL_messages_requestMainWebView.peer = inputPeer2;
                        tL_messages_requestMainWebView.compact = y3Var.f47800o;
                        tL_messages_requestMainWebView.fullscreen = y3Var.f47801p;
                        if (!TextUtils.isEmpty(y3Var.f47797l)) {
                            tL_messages_requestMainWebView.start_param = y3Var.f47797l;
                            tL_messages_requestMainWebView.flags |= 2;
                        }
                        if (p10 != null) {
                            TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                            tL_messages_requestMainWebView.theme_params = tL_dataJSON2;
                            tL_dataJSON2.data = p10.toString();
                            tL_messages_requestMainWebView.flags |= 1;
                        }
                        ConnectionsManager.getInstance(this.D).sendRequest(tL_messages_requestMainWebView, new a2(this, 5), 66);
                        return;
                    }
                    TLRPC.TL_messages_requestAppWebView tL_messages_requestAppWebView = new TLRPC.TL_messages_requestAppWebView();
                    TLRPC.TL_inputBotAppID tL_inputBotAppID = new TLRPC.TL_inputBotAppID();
                    TLRPC.BotApp botApp = y3Var.f47795j;
                    tL_inputBotAppID.f20901id = botApp.f20840id;
                    tL_inputBotAppID.access_hash = botApp.access_hash;
                    tL_messages_requestAppWebView.app = tL_inputBotAppID;
                    tL_messages_requestAppWebView.write_allowed = y3Var.f47796k;
                    tL_messages_requestAppWebView.platform = "android";
                    if (p2Var instanceof xn) {
                        xn xnVar2 = (xn) p2Var;
                        if (xnVar2.i() != null) {
                            inputPeer = MessagesController.getInputPeer(xnVar2.i());
                        } else {
                            inputPeer = MessagesController.getInputPeer(xnVar2.f43165e);
                        }
                    } else {
                        inputPeer = MessagesController.getInputPeer(y3Var.f47798m);
                    }
                    tL_messages_requestAppWebView.peer = inputPeer;
                    tL_messages_requestAppWebView.compact = y3Var.f47800o;
                    tL_messages_requestAppWebView.fullscreen = y3Var.f47801p;
                    if (!TextUtils.isEmpty(y3Var.f47797l)) {
                        tL_messages_requestAppWebView.start_param = y3Var.f47797l;
                        tL_messages_requestAppWebView.flags |= 2;
                    }
                    if (p10 != null) {
                        TLRPC.TL_dataJSON tL_dataJSON3 = new TLRPC.TL_dataJSON();
                        tL_messages_requestAppWebView.theme_params = tL_dataJSON3;
                        tL_dataJSON3.data = p10.toString();
                        tL_messages_requestAppWebView.flags |= 4;
                    }
                    ConnectionsManager.getInstance(this.D).sendRequest(tL_messages_requestAppWebView, new a2(this, 4), 66);
                    return;
                }
                TLRPC.TL_messages_requestWebView tL_messages_requestWebView = new TLRPC.TL_messages_requestWebView();
                tL_messages_requestWebView.bot = MessagesController.getInstance(this.D).getInputUser(this.E);
                tL_messages_requestWebView.peer = MessagesController.getInstance(this.D).getInputPeer(this.E);
                tL_messages_requestWebView.platform = "android";
                tL_messages_requestWebView.compact = y3Var.f47800o;
                tL_messages_requestWebView.fullscreen = y3Var.f47801p;
                tL_messages_requestWebView.url = y3Var.f47792f;
                tL_messages_requestWebView.flags |= 2;
                if (p10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON4 = new TLRPC.TL_dataJSON();
                    tL_messages_requestWebView.theme_params = tL_dataJSON4;
                    tL_dataJSON4.data = p10.toString();
                    tL_messages_requestWebView.flags |= 4;
                }
                ConnectionsManager.getInstance(this.D).sendRequest(tL_messages_requestWebView, new a2(this, 1));
                NotificationCenter.getInstance(this.D).addObserver(this, NotificationCenter.webViewResultSent);
                return;
            }
            TLRPC.TL_messages_requestSimpleWebView tL_messages_requestSimpleWebView = new TLRPC.TL_messages_requestSimpleWebView();
            if ((y3Var.f47799n & 1) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            tL_messages_requestSimpleWebView.from_switch_webview = z4;
            tL_messages_requestSimpleWebView.bot = MessagesController.getInstance(this.D).getInputUser(this.E);
            tL_messages_requestSimpleWebView.platform = "android";
            if ((y3Var.f47799n & 2) != 0) {
                z12 = true;
            }
            tL_messages_requestSimpleWebView.from_side_menu = z12;
            tL_messages_requestSimpleWebView.compact = y3Var.f47800o;
            tL_messages_requestSimpleWebView.fullscreen = y3Var.f47801p;
            if (p10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON5 = new TLRPC.TL_dataJSON();
                tL_messages_requestSimpleWebView.theme_params = tL_dataJSON5;
                tL_dataJSON5.data = p10.toString();
                tL_messages_requestSimpleWebView.flags |= 1;
            }
            if (!TextUtils.isEmpty(y3Var.f47792f)) {
                tL_messages_requestSimpleWebView.flags |= 8;
                tL_messages_requestSimpleWebView.url = y3Var.f47792f;
            }
            if (!TextUtils.isEmpty(y3Var.f47797l)) {
                tL_messages_requestSimpleWebView.start_param = y3Var.f47797l;
                tL_messages_requestSimpleWebView.flags |= 16;
            }
            ConnectionsManager.getInstance(this.D).sendRequest(tL_messages_requestSimpleWebView, new a2(this, 2));
            return;
        }
        TLRPC.TL_messages_requestWebView tL_messages_requestWebView2 = new TLRPC.TL_messages_requestWebView();
        tL_messages_requestWebView2.peer = MessagesController.getInstance(this.D).getInputPeer(this.F);
        tL_messages_requestWebView2.bot = MessagesController.getInstance(this.D).getInputUser(this.E);
        tL_messages_requestWebView2.platform = "android";
        tL_messages_requestWebView2.compact = y3Var.f47800o;
        tL_messages_requestWebView2.fullscreen = y3Var.f47801p;
        String str = y3Var.f47792f;
        if (str != null) {
            tL_messages_requestWebView2.url = str;
            tL_messages_requestWebView2.flags |= 2;
        }
        if (this.H != 0) {
            TLRPC.InputReplyTo createReplyInput = SendMessagesHelper.getInstance(this.D).createReplyInput(this.H);
            tL_messages_requestWebView2.reply_to = createReplyInput;
            if (this.I != 0) {
                createReplyInput.monoforum_peer_id = MessagesController.getInstance(this.D).getInputPeer(this.I);
                tL_messages_requestWebView2.reply_to.flags |= 32;
            }
            tL_messages_requestWebView2.flags |= 1;
        } else if (this.I != 0) {
            TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
            tL_messages_requestWebView2.reply_to = tL_inputReplyToMonoForum;
            tL_inputReplyToMonoForum.monoforum_peer_id = MessagesController.getInstance(this.D).getInputPeer(this.I);
            tL_messages_requestWebView2.flags |= 1;
        }
        if (p10 != null) {
            TLRPC.TL_dataJSON tL_dataJSON6 = new TLRPC.TL_dataJSON();
            tL_messages_requestWebView2.theme_params = tL_dataJSON6;
            tL_dataJSON6.data = p10.toString();
            tL_messages_requestWebView2.flags |= 4;
        }
        ConnectionsManager.getInstance(this.D).sendRequest(tL_messages_requestWebView2, new a2(this, 3));
        NotificationCenter.getInstance(this.D).addObserver(this, NotificationCenter.webViewResultSent);
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        z(true);
        o2 o2Var = this.f47588e;
        o2Var.setAlpha(0.0f);
        o2Var.addOnLayoutChangeListener(new m.s2(this, 1));
        super.show();
        this.J0 = false;
        T0.add(this);
    }

    public final void t(final int i10, boolean z4, boolean z10) {
        int i11;
        boolean z11;
        final int i12 = this.N;
        k6.b(0.35f, -0.1f, i10);
        final o1 o1Var = new o1();
        int i13 = 0;
        if (this.R) {
            i11 = this.N;
        } else {
            i11 = 0;
        }
        SparseIntArray sparseIntArray = o1Var.f47553a;
        g6 g6Var = this.B;
        o1Var.c(sparseIntArray, i11, g6Var);
        this.R = z4;
        if (i0.a.f(i10) < 0.7210000157356262d) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.P = z11;
        if (this.R) {
            i13 = i10;
        }
        o1Var.c(o1Var.f47554b, i13, g6Var);
        if (z10) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(pr.f30183f);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    int d = i0.a.d(floatValue, i12, i10);
                    p2 p2Var = p2.this;
                    p2Var.N = d;
                    p2Var.h();
                    o2 o2Var = p2Var.f47588e;
                    o2Var.invalidate();
                    m2 m2Var = p2Var.T;
                    m2Var.setBackgroundColor(p2Var.N);
                    o1 o1Var2 = o1Var;
                    o1Var2.b(m2Var, floatValue);
                    p2Var.f47581a = o1Var2.a(k6.Ii);
                    o2Var.invalidate();
                }
            });
            duration.addListener(new f2(this, i12, i10, o1Var));
            duration.start();
        } else {
            this.N = i10;
            h();
            o2 o2Var = this.f47588e;
            o2Var.invalidate();
            int i14 = this.N;
            m2 m2Var = this.T;
            m2Var.setBackgroundColor(i14);
            o1Var.b(m2Var, 1.0f);
            this.f47581a = o1Var.a(k6.Ii);
            o2Var.invalidate();
        }
        E();
    }

    public final void u(boolean z4) {
        if (this.S0 == z4) {
            return;
        }
        this.S0 = z4;
        if (z4) {
            if (this.f47616z0) {
                V0++;
            }
        } else if (this.f47616z0) {
            V0--;
        }
        if (V0 > 0) {
            AndroidUtilities.lockOrientation(l());
        } else {
            AndroidUtilities.unlockOrientation(l());
        }
    }

    public final void v(int i10, boolean z4) {
        Paint paint = this.M;
        int color = paint.getColor();
        boolean z10 = true;
        this.S = true;
        ValueAnimator valueAnimator = this.M0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z4) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            this.M0 = duration;
            duration.setInterpolator(pr.f30183f);
            this.M0.addUpdateListener(new x1(this, color, i10, 0));
            this.M0.addListener(new b4(this, i10, 9));
            this.M0.start();
            return;
        }
        paint.setColor(i10);
        A();
        this.f47588e.invalidate();
        org.telegram.ui.f3 f3Var = this.R0;
        if (f3Var != null) {
            if (AndroidUtilities.computePerceivedBrightness(paint.getColor()) > 0.721f) {
                z10 = false;
            }
            f3Var.b(z10, false);
            this.R0.setBackgroundColor(paint.getColor());
        }
        F();
    }

    public final void w(boolean z4) {
        if (this.f47609v0 != z4) {
            this.f47609v0 = z4;
            g2 g2Var = this.v;
            if (g2Var != null) {
                g2Var.setFullSize(m());
            }
        }
    }

    public final void x(boolean z4, boolean z10, boolean z11) {
        boolean z12;
        float f10;
        float f11;
        float f12;
        float f13;
        int currentActionBarHeight;
        float f14;
        Point point;
        Object obj;
        if (this.f47582a0 == z4) {
            return;
        }
        this.f47582a0 = z4;
        int i10 = 0;
        if (z11 && !MessagesController.getInstance(this.D).disableBotFullscreenBlur && SharedConfig.getDevicePerformanceClass() >= 2) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f47584b0 = z12;
        ValueAnimator valueAnimator = this.O0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        BotFullscreenButtons botFullscreenButtons = this.f47595j0;
        g2 g2Var = this.v;
        if (botFullscreenButtons != null) {
            botFullscreenButtons.setPreview(z4, z10);
            if (this.f47584b0) {
                obj = g2Var.getRenderNode();
            } else {
                obj = null;
            }
            botFullscreenButtons.setParentRenderNode(obj);
        }
        this.f47591f0 = g2Var.getWidth();
        this.f47592g0 = g2Var.getHeight();
        this.N0 = false;
        l2 l2Var = this.f47594i0;
        h2 h2Var = this.f47612x;
        m2 m2Var = this.T;
        if (z10) {
            D();
            G();
            C();
            if (AndroidUtilities.isTablet() && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isSmallTablet()) {
                int i11 = AndroidUtilities.displaySize.x;
                f11 = (i11 - ((int) (Math.min(i11, point.y) * 0.8f))) / 2.0f;
            } else {
                f11 = 0.0f;
            }
            int i12 = this.h.left;
            if (z4) {
                f12 = i12 + f11;
            } else {
                f12 = (-i12) - f11;
            }
            if (!z4) {
                f11 = -f11;
            }
            if (z4) {
                f13 = g2Var.getTranslationY();
            } else {
                f13 = -AndroidUtilities.dp(24.0f);
            }
            if (z4) {
                currentActionBarHeight = -AndroidUtilities.dp(24.0f);
            } else {
                currentActionBarHeight = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(24.0f);
            }
            float f15 = currentActionBarHeight;
            float currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            o1.j jVar = g2Var.v;
            if (jVar != null) {
                jVar.c();
            }
            o1.j jVar2 = g2Var.D;
            if (jVar2 != null) {
                jVar2.c();
            }
            g2Var.setSwipeOffsetAnimationDisallowed(true);
            m2Var.setVisibility(0);
            if (z4) {
                g2Var.setTopActionBarOffsetY(-AndroidUtilities.dp(24.0f));
            } else {
                g2Var.setTopActionBarOffsetY(currentActionBarHeight2 - AndroidUtilities.dp(24.0f));
            }
            g2Var.c();
            g2Var.invalidate();
            this.f47587d0 = 0.0f;
            if (z4) {
                f14 = 0.0f;
            } else {
                f14 = 1.0f;
            }
            this.f47586c0 = f14;
            m2Var.setAlpha(1.0f - f14);
            m2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * this.f47586c0);
            g2Var.setTranslationY(AndroidUtilities.lerp(f13, f15, this.f47587d0));
            g2Var.setTranslationX(AndroidUtilities.lerp(f12, 0.0f, this.f47587d0));
            l2Var.setTranslationX(AndroidUtilities.lerp(f11, 0.0f, this.f47587d0));
            botFullscreenButtons.setAlpha(this.f47586c0);
            this.f47588e.invalidate();
            h2Var.setViewPortHeightOffset(g2Var.getTranslationY() - f15);
            h2Var.n(false, false);
            this.f47589e0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.O0 = ofFloat;
            float f16 = f12;
            ofFloat.addUpdateListener(new d2(this, z4, f13, f15, f16, f11));
            this.O0.addListener(new e2(this, z4, currentActionBarHeight2, f16));
            this.O0.setDuration(280L);
            this.O0.setInterpolator(pr.h);
            this.O0.start();
            return;
        }
        this.f47589e0 = false;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f47586c0 = f10;
        this.f47587d0 = 0.0f;
        D();
        G();
        if (z4) {
            i10 = 8;
        }
        m2Var.setVisibility(i10);
        m2Var.setAlpha(1.0f - this.f47586c0);
        m2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * this.f47586c0);
        l2Var.setTranslationX(0.0f);
        botFullscreenButtons.setAlpha(this.f47586c0);
        h2Var.setViewPortHeightOffset(0.0f);
        h2Var.n(true, true);
        C();
    }

    public final void y(int i10, boolean z4) {
        int i11 = this.O;
        l2 l2Var = this.f47594i0;
        Paint paint = l2Var.f47699a;
        l2Var.f47702e.f1474b = i10;
        paint.setColor(i10);
        if (!z4) {
            l2Var.d.a(i10, true);
        }
        if (z4) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(pr.f30183f);
            duration.addUpdateListener(new x1(this, i11, i10, 1));
            duration.addListener(new s20(this, i11, i10, 3));
            duration.start();
        } else {
            this.O = i10;
            h();
        }
        AndroidUtilities.setNavigationBarColor((Dialog) this, this.O, false);
    }

    public final void z(boolean z4) {
        float f10;
        ValueAnimator valueAnimator = this.L0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.K0;
        float f12 = 0.0f;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        if (Math.abs(f11 - f10) < 0.01f) {
            return;
        }
        float f13 = this.K0;
        if (z4) {
            f12 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f12);
        this.L0 = ofFloat;
        ofFloat.addListener(new qd1(14, this, z4));
        this.L0.addUpdateListener(new p1(this, 0));
        this.L0.setInterpolator(pr.h);
        this.L0.setDuration(220L);
        this.L0.start();
    }

    @Override
    public final void dismiss() {
        k(false);
    }

    @Override
    public final void setLastVisible(boolean z4) {
    }
}
