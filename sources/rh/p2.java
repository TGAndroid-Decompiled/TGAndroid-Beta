package rh;

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
import k7.b6;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.a4;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.s20;
import org.telegram.ui.Components.wd0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fb1;
import org.telegram.ui.j21;
import org.telegram.ui.ll0;
import org.telegram.ui.s61;
import org.telegram.ui.yt0;
import org.telegram.ui.zn;
import ph.d4;
import ph.ga;
import ph.s8;
public final class p2 extends Dialog implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.t3 {
    public static final HashSet T0 = new HashSet();
    public static final iv0 U0;
    public static int V0;
    public org.telegram.ui.ActionBar.m3 A0;
    public final f6 B;
    public boolean B0;
    public boolean C;
    public boolean C0;
    public int D;
    public float D0;
    public long E;
    public fb1 E0;
    public long F;
    public Drawable F0;
    public long G;
    public final HashMap G0;
    public int H;
    public p70 H0;
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
    public org.telegram.ui.h3 R0;
    public boolean S;
    public boolean S0;
    public final m2 T;
    public final FrameLayout.LayoutParams U;
    public final Drawable V;
    public org.telegram.ui.ActionBar.w0 W;
    public BotFullscreenButtons.OptionsIcon X;
    public boolean Y;
    public boolean Z;
    public int f43730a;
    public boolean f43731a0;
    public float f43732b;
    public boolean f43733b0;
    public o1.j f43734c;
    public float f43735c0;
    public Boolean d;
    public float f43736d0;
    public final o2 e;
    public boolean f43737e0;
    public final Rect f43738f;
    public int f43739f0;
    public int f43740g0;
    public final Rect h;
    public Activity f43741h0;
    public final l2 f43742i0;
    public final BotFullscreenButtons f43743j0;
    public ic f43744k0;
    public f0 f43745l0;
    public final FrameLayout m0;
    public int f43746n;
    public final FrameLayout.LayoutParams f43747n0;
    public boolean f43748o0;
    public final wd0 f43749p0;
    public final q1 f43750q0;
    public final org.telegram.ui.ActionBar.n3 f43751r;
    public int f43752r0;
    public final c5.j f43753s;
    public y3 f43754s0;
    public boolean f43755t0;
    public boolean f43756u0;
    public final g2 v;
    public boolean f43757v0;
    public final FrameLayout.LayoutParams f43758w;
    public Boolean f43759w0;
    public final h2 f43760x;
    public boolean f43761x0;
    public final n2 f43762y;
    public u0 f43763y0;
    public boolean f43764z0;

    static {
        iv0 iv0Var = new iv0(new rg.a(11), new rg.a(12));
        iv0Var.f25780c = 100.0f;
        U0 = iv0Var;
        V0 = 0;
    }

    public p2(Context context, f6 f6Var) {
        super(context, R.style.TransparentDialog);
        Object obj;
        this.f43732b = 0.0f;
        this.f43738f = new Rect();
        this.h = new Rect();
        this.f43746n = 0;
        boolean z4 = true;
        Paint paint = new Paint(1);
        this.K = paint;
        Paint paint2 = new Paint();
        this.L = paint2;
        this.M = new Paint(1);
        this.Q = new Paint(1);
        this.f43750q0 = new q1(this, 1);
        this.f43752r0 = -1;
        this.f43757v0 = false;
        this.f43759w0 = null;
        this.G0 = new HashMap();
        this.J0 = false;
        this.N0 = true;
        this.S0 = false;
        this.B = f6Var;
        this.f43730a = j6.w0(null, j6.Ii, false);
        g2 g2Var = new g2(this, context, 0);
        this.v = g2Var;
        g2Var.setAllowFullSizeSwipe(true);
        g2Var.setShouldWaitWebViewScroll(true);
        int i10 = j6.f19881d6;
        h2 h2Var = new h2(this, context, f6Var, j6.v0(i10, f6Var));
        this.f43760x = h2Var;
        h2Var.setOnVerifiedAge(this.E0);
        h2Var.setDelegate(new k2(this, context, f6Var));
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(4.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(1073741824);
        this.N = j6.v0(i10, f6Var);
        int v02 = j6.v0(j6.f19827a7, f6Var);
        this.O = v02;
        AndroidUtilities.setNavigationBarColor((Dialog) this, v02, false);
        o2 o2Var = new o2(this, context);
        this.e = o2Var;
        o2Var.setDelegate(new s1(this, 0));
        FrameLayout.LayoutParams e = b6.e(-1, -1, 49);
        this.f43758w = e;
        o2Var.addView(g2Var, e);
        l2 l2Var = new l2(this, getContext(), f6Var);
        this.f43742i0 = l2Var;
        l2Var.setOnButtonClickListener(new t1(this, 0));
        l2Var.setOnResizeListener(new q1(this, 3));
        o2Var.addView(l2Var, b6.e(-1, -2, 81));
        BotFullscreenButtons botFullscreenButtons = new BotFullscreenButtons(getContext());
        this.f43743j0 = botFullscreenButtons;
        botFullscreenButtons.setAlpha(0.0f);
        botFullscreenButtons.setVisibility(8);
        z4 = (MessagesController.getInstance(this.D).disableBotFullscreenBlur || SharedConfig.getDevicePerformanceClass() < 2) ? false : false;
        this.f43733b0 = z4;
        if (z4) {
            obj = g2Var.getRenderNode();
        } else {
            obj = null;
        }
        botFullscreenButtons.setParentRenderNode(obj);
        o2Var.addView(botFullscreenButtons, b6.e(-1, -1, 119));
        botFullscreenButtons.setOnCloseClickListener(new q1(this, 4));
        botFullscreenButtons.setOnCollapseClickListener(new q1(this, 5));
        botFullscreenButtons.setOnMenuClickListener(new q1(this, 6));
        FrameLayout frameLayout = new FrameLayout(context);
        this.m0 = frameLayout;
        FrameLayout.LayoutParams e6 = b6.e(-1, 200, 55);
        this.f43747n0 = e6;
        o2Var.addView(frameLayout, e6);
        this.V = getContext().getDrawable(R.drawable.header_shadow).mutate();
        ?? kVar = new org.telegram.ui.ActionBar.k(context, f6Var);
        this.T = kVar;
        kVar.setBackgroundColor(0);
        kVar.setBackButtonImage(R.drawable.ic_close_white);
        A();
        kVar.setActionBarMenuOnItemClick(new ll0(this, 28));
        kVar.setAlpha(0.0f);
        FrameLayout.LayoutParams e10 = b6.e(-1, -2, 49);
        this.U = e10;
        o2Var.addView((View) kVar, e10);
        ?? j3Var = new j3(context, f6Var);
        this.f43762y = j3Var;
        o2Var.addView((View) j3Var, b6.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
        h2Var.setWebViewProgressListener(new cg.o(this, 4));
        g2Var.addView(h2Var, b6.c(-1.0f, -1));
        g2Var.setScrollListener(new q1(this, 7));
        g2Var.setScrollEndListener(new q1(this, 8));
        g2Var.setDelegate(new r1(this));
        g2Var.setIsKeyboardVisible(new r1(this));
        wd0 wd0Var = new wd0(context);
        this.f43749p0 = wd0Var;
        o2Var.addView(wd0Var, b6.c(-1.0f, -1));
        setContentView(o2Var, new ViewGroup.LayoutParams(-1, -1));
        D();
        LaunchActivity launchActivity = LaunchActivity.D1;
        org.telegram.ui.ActionBar.n3 P = launchActivity != null ? launchActivity.P() : null;
        this.f43751r = P;
        if (P != null) {
            ga gaVar = new ga(o2Var, 12);
            q1 q1Var = new q1(this, 2);
            P.F.add(gaVar);
            P.G.add(q1Var);
            this.f43753s = new c5.j(P);
        }
    }

    public static void d(p2 p2Var) {
        if (!p2Var.J0) {
            super.dismiss();
            p2Var.J0 = true;
        }
    }

    public static WindowInsets e(p2 p2Var, View view, WindowInsets windowInsets) {
        r0.j1 j1Var = r0.m1.h(view, windowInsets).f43154a;
        i0.b f10 = j1Var.f(2);
        p2Var.f43738f.set(f10.f7196a, f10.f7197b, f10.f7198c, f10.d);
        i0.b f11 = j1Var.f(647);
        Rect rect = p2Var.h;
        rect.set(Math.max(f11.f7196a, windowInsets.getStableInsetLeft()), Math.max(f11.f7197b, windowInsets.getStableInsetTop()), Math.max(f11.f7198c, windowInsets.getStableInsetRight()), Math.max(f11.d, windowInsets.getStableInsetBottom()));
        int i10 = Build.VERSION.SDK_INT;
        if (i10 <= 28) {
            rect.top = Math.max(rect.top, AndroidUtilities.getStatusBarHeight(p2Var.getContext()));
        }
        int i11 = j1Var.f(8).d;
        if (i11 > rect.bottom && i11 > AndroidUtilities.dp(20.0f)) {
            p2Var.f43746n = i11;
        } else {
            p2Var.f43746n = 0;
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
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
        d2Var.O = string;
        d2Var.Q = AndroidUtilities.replaceTags(formatString);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.Components.s1(i10, j10, tL_attachMenuBot, runnable));
        kf.k0.u(R.string.Cancel, alertDialog$Builder, null);
    }

    public static JSONObject p(f6 f6Var, final boolean z4) {
        try {
            JSONObject jSONObject = new JSONObject();
            final int v = j6.v(-16777216, j6.v0(j6.f19952h5, f6Var));
            Utilities.CallbackReturn callbackReturn = new Utilities.CallbackReturn() {
                @Override
                public final Object run(Object obj) {
                    int v10 = j6.v(v, ((Integer) obj).intValue());
                    Integer valueOf = Integer.valueOf(v10);
                    if (z4) {
                        return String.format(Locale.US, "#%02X%02X%02X", Integer.valueOf(Color.red(v10)), Integer.valueOf(Color.green(v10)), Integer.valueOf(Color.blue(v10)));
                    }
                    return valueOf;
                }
            };
            jSONObject.put("bg_color", callbackReturn.run(Integer.valueOf(v)));
            jSONObject.put("section_bg_color", callbackReturn.run(Integer.valueOf(j6.v0(j6.f19881d6, f6Var))));
            int i10 = j6.f19827a7;
            jSONObject.put("secondary_bg_color", callbackReturn.run(Integer.valueOf(j6.v0(i10, f6Var))));
            jSONObject.put("text_color", callbackReturn.run(Integer.valueOf(j6.v0(j6.G6, f6Var))));
            jSONObject.put("hint_color", callbackReturn.run(Integer.valueOf(j6.v0(j6.H6, f6Var))));
            jSONObject.put("link_color", callbackReturn.run(Integer.valueOf(j6.v0(j6.J6, f6Var))));
            jSONObject.put("button_color", callbackReturn.run(Integer.valueOf(j6.v0(j6.Oh, f6Var))));
            jSONObject.put("button_text_color", callbackReturn.run(Integer.valueOf(j6.v0(j6.Sh, f6Var))));
            jSONObject.put("header_bg_color", callbackReturn.run(Integer.valueOf(j6.v0(j6.f20151s8, f6Var))));
            jSONObject.put("accent_text_color", callbackReturn.run(Integer.valueOf(j6.v0(j6.f20115q6, f6Var))));
            jSONObject.put("section_header_text_color", callbackReturn.run(Integer.valueOf(j6.v0(j6.L6, f6Var))));
            jSONObject.put("subtitle_text_color", callbackReturn.run(Integer.valueOf(j6.v0(j6.f20273z6, f6Var))));
            jSONObject.put("destructive_text_color", callbackReturn.run(Integer.valueOf(j6.v0(j6.f20097p7, f6Var))));
            jSONObject.put("section_separator_color", callbackReturn.run(Integer.valueOf(j6.v0(j6.f19882d7, f6Var))));
            jSONObject.put("bottom_bar_bg_color", callbackReturn.run(Integer.valueOf(j6.v0(i10, f6Var))));
            return jSONObject;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public final void A() {
        if (!this.R) {
            int i10 = j6.G6;
            f6 f6Var = this.B;
            int v02 = j6.v0(i10, f6Var);
            m2 m2Var = this.T;
            m2Var.setTitleColor(v02);
            m2Var.C(j6.v0(i10, f6Var), false);
            m2Var.B(j6.v0(j6.f20184u8, f6Var), false);
            m2Var.D(j6.v0(j6.G8, f6Var), false);
            m2Var.E(j6.v0(j6.E8, f6Var), false, false);
            m2Var.E(j6.v0(j6.F8, f6Var), true, false);
            m2Var.F(j6.v0(j6.I5, f6Var), false);
        }
        this.f43760x.setFlickerViewColor(this.M.getColor());
    }

    public final void B() {
        ic icVar;
        boolean z4;
        h0 c3 = h0.c(getContext(), this.D, this.E);
        ArrayList arrayList = c3.e;
        g0 g0Var = c3.f43610f;
        boolean z10 = true;
        if (g0Var == null) {
            ic icVar2 = this.f43744k0;
            if (icVar2 != null) {
                icVar2.b();
                this.f43744k0 = null;
            }
        } else if ((g0Var.c() && !g0Var.f43597l) || g0Var.f43596k) {
            if (this.I0 != g0Var && (icVar = this.f43744k0) != null) {
                icVar.b();
                this.f43744k0 = null;
            }
            ic icVar3 = this.f43744k0;
            if (icVar3 == null || !icVar3.f25673l) {
                this.I0 = g0Var;
                f0 f0Var = new f0(getContext(), this.B);
                this.f43745l0 = f0Var;
                ic f10 = ic.f(this.m0, f0Var, 5000);
                this.f43744k0 = f10;
                f10.k(true);
            }
            if (this.f43745l0.c(g0Var)) {
                this.f43744k0 = null;
            }
            g0Var.f43596k = false;
            g0Var.f43597l = true;
        } else {
            f0 f0Var2 = this.f43745l0;
            if (f0Var2 != null) {
                this.I0 = g0Var;
                if (f0Var2.c(g0Var)) {
                    this.f43744k0 = null;
                }
            }
        }
        C();
        for (Map.Entry entry : this.G0.entrySet()) {
            org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) entry.getValue();
            g0 g0Var2 = (g0) entry.getKey();
            g1Var.setText(g0Var2.f43591c);
            if (!g0Var2.c()) {
                g1Var.setSubtext(AndroidUtilities.formatFileSize(g0Var2.f43593g));
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
                g1Var.f19678b.setPadding(0, 0, AndroidUtilities.dp(32.0f), 0);
            } else if (g0Var2.f43594i) {
                g1Var.setVisibility(8);
            } else {
                g1Var.setRightIcon(0);
                g1Var.f19678b.setPadding(0, 0, 0, 0);
            }
            g1Var.setOnClickListener(new s8(2, this, g0Var2));
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
        this.f43743j0.setDownloading(z10);
    }

    public final void C() {
        f0 f0Var = this.f43745l0;
        if (f0Var == null) {
            return;
        }
        if (this.f43731a0) {
            f0Var.setArrow(AndroidUtilities.lerp(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(26.0f), this.f43735c0));
        } else if (this.f43732b > 0.5f) {
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
        BotFullscreenButtons botFullscreenButtons = this.f43743j0;
        Rect rect = this.h;
        botFullscreenButtons.setInsets(rect);
        boolean z4 = this.f43731a0;
        h2 h2Var = this.f43760x;
        o2 o2Var = this.e;
        l2 l2Var = this.f43742i0;
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
            if (this.f43746n > i14 || (l2Var != null && l2Var.getTotalHeight() > 0)) {
                i15 = 0;
            } else {
                i15 = rect.bottom;
            }
            Rect rect2 = new Rect(i17, i18, i19, i15);
            int dp = AndroidUtilities.dp(46.0f);
            h2Var.Q(rect2, false);
            h2Var.P(dp, false);
            o2Var.setPadding(0, 0, 0, Math.max(this.f43746n, i14));
        } else {
            h2Var.Q(new Rect(0, 0, 0, 0), false);
            h2Var.P(0, false);
            int i20 = rect.left;
            int i21 = rect.right;
            int i22 = this.f43746n;
            org.telegram.ui.ActionBar.n3 n3Var = this.f43751r;
            if (n3Var != null) {
                i10 = n3Var.E;
            } else {
                i10 = 0;
            }
            o2Var.setPadding(i20, 0, i21, Math.max(i22, i10 + rect.bottom));
        }
        this.f43758w.topMargin = AndroidUtilities.dp(24.0f);
        boolean z10 = this.f43731a0;
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
        FrameLayout.LayoutParams layoutParams2 = this.f43747n0;
        layoutParams2.leftMargin = i12;
        if (!z10) {
            i13 = 0;
        } else {
            i13 = rect.right;
        }
        layoutParams2.rightMargin = i13;
        boolean z11 = this.f43737e0;
        g2 g2Var = this.v;
        if (!z11) {
            g2Var.setSwipeOffsetAnimationDisallowed(true);
            if (this.f43731a0) {
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
        if (!this.f43731a0) {
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
            z4 = (AndroidUtilities.isTablet() || i0.a.f(j6.w0(null, j6.f19881d6, true)) < 0.7210000157356262d || this.f43732b < 0.85f) ? false : false;
        }
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z4) {
            this.d = Boolean.valueOf(z4);
            if (Build.VERSION.SDK_INT >= 23) {
                o2 o2Var = this.e;
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
        org.telegram.ui.web.y0 webView;
        h2 h2Var = this.f43760x;
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
            boolean z4 = this.f43731a0;
            if (z4) {
                attributes.flags = i10 | attributes.flags;
            } else {
                attributes.flags = (~i10) & attributes.flags;
            }
            o2 o2Var = this.e;
            if (z4 && (((l2Var = this.f43742i0) == null || l2Var.getTotalHeight() <= 0) && !o2Var.f43708u0)) {
                o2Var.setSystemUiVisibility(o2Var.getSystemUiVisibility() | 2);
            } else {
                o2Var.setSystemUiVisibility(o2Var.getSystemUiVisibility() & (-3));
            }
            window.setAttributes(attributes);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.m3 a() {
        boolean z4;
        String str;
        boolean z10;
        String str2;
        boolean z11;
        boolean booleanValue;
        float f10;
        org.telegram.ui.ActionBar.m3 m3Var = new org.telegram.ui.ActionBar.m3();
        m3Var.f20436q = this.N;
        m3Var.f20435p = this.f43752r0;
        m3Var.f20433n = this.R;
        m3Var.f20434o = this.S;
        m3Var.f20437r = this.M.getColor();
        m3Var.f20423a = this.f43754s0;
        boolean z12 = false;
        h2 h2Var = this.f43760x;
        if (h2Var != null && h2Var.K) {
            z4 = true;
        } else {
            z4 = false;
        }
        m3Var.f20439t = z4;
        m3Var.D = j6.I.q();
        org.telegram.ui.web.y0 y0Var = null;
        if (h2Var != null) {
            str = h2Var.getUrlLoaded();
        } else {
            str = null;
        }
        m3Var.f20442x = str;
        if (h2Var != null && h2Var.f39401q0) {
            z10 = true;
        } else {
            z10 = false;
        }
        m3Var.e = z10;
        if (h2Var != null) {
            str2 = h2Var.getTrustedOrigin();
        } else {
            str2 = null;
        }
        m3Var.f20426f = str2;
        g2 g2Var = this.v;
        if ((g2Var == null || g2Var.getSwipeOffsetY() >= 0.0f) && !this.f43756u0 && !m() && !this.f43731a0) {
            z11 = false;
        } else {
            z11 = true;
        }
        m3Var.f20429j = z11;
        m3Var.f20444z = this.f43731a0;
        m3Var.A = this.f43733b0;
        Boolean bool = this.f43759w0;
        if (bool == null) {
            booleanValue = this.f43757v0;
        } else {
            booleanValue = bool.booleanValue();
        }
        m3Var.B = booleanValue;
        if (g2Var != null) {
            f10 = g2Var.getOffsetY();
        } else {
            f10 = Float.MAX_VALUE;
        }
        m3Var.f20430k = f10;
        m3Var.C = this.f43761x0;
        m3Var.f20440u = this.f43755t0;
        m3Var.f20443y = this.f43748o0;
        m3Var.v = this.Y;
        m3Var.f20431l = (g2Var == null || g2Var.J) ? true : true;
        m3Var.f20441w = this.f43742i0.e;
        m3Var.f20438s = this.O;
        u0 u0Var = this.f43763y0;
        if (u0Var != null) {
            u0Var.b();
        }
        m3Var.K = this.f43763y0;
        if (h2Var != null) {
            y0Var = h2Var.getWebView();
        }
        if (y0Var != null) {
            h2Var.M();
            m3Var.f20424b = y0Var;
            m3Var.d = h2Var.getBotProxy();
            m3Var.f20427g = y0Var.getWidth();
            m3Var.h = y0Var.getHeight();
            y0Var.onPause();
        }
        boolean z13 = this.P0;
        m3Var.G = z13;
        if (z13) {
            m3Var.H = this.Q0;
        }
        m3Var.L = this.f43764z0;
        this.A0 = m3Var;
        return m3Var;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final boolean c(org.telegram.ui.ActionBar.j3 j3Var) {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.webViewResultSent) {
            if (this.G == ((Long) objArr[0]).longValue()) {
                k(false);
            }
        } else if (i10 == NotificationCenter.didSetNewTheme) {
            this.e.invalidate();
            this.f43760x.f39397n.b(j6.v0(j6.f19881d6, this.B), 153);
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
            boolean q10 = j6.I.q();
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
    public final org.telegram.ui.ActionBar.u3 mo37getWindowView() {
        return this.e;
    }

    public final void h() {
        LaunchActivity launchActivity;
        if (!this.J0 && (launchActivity = LaunchActivity.D1) != null) {
            launchActivity.H(true, true, true);
        }
        o2 o2Var = this.e;
        if (o2Var != null) {
            o2Var.invalidate();
        }
    }

    public final void i() {
        if (this.R0 == null) {
            org.telegram.ui.h3 h3Var = new org.telegram.ui.h3(getContext());
            this.R0 = h3Var;
            this.v.addView(h3Var, b6.c(-1.0f, -1));
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
        AndroidUtilities.cancelRunOnUIThread(this.f43750q0);
        NotificationCenter.getInstance(this.D).removeObserver(this, NotificationCenter.webViewResultSent);
        NotificationCenter.getInstance(this.D).removeObserver(this, NotificationCenter.botDownloadsUpdate);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
        if (z4 && ((launchActivity = LaunchActivity.D1) == null || launchActivity.f31628v0 == null)) {
            z4 = false;
        }
        if (z4) {
            o1.j jVar = this.f43734c;
            if (jVar != null) {
                jVar.f16178u.f16184i = 0.0f;
                jVar.f();
            }
            LaunchActivity.D1.f31628v0.b(this);
        } else {
            l2 l2Var = this.f43742i0;
            if (l2Var != null) {
                l2Var.animate().translationY(l2Var.getTotalHeight()).alpha(0.0f).setDuration(160L).setInterpolator(mr.h).start();
            }
            this.f43760x.i();
            g2 g2Var = this.v;
            int height = g2Var.getHeight();
            if (l2Var != null) {
                i10 = l2Var.getTotalHeight();
            } else {
                i10 = 0;
            }
            int i12 = height + i10;
            Rect rect = this.h;
            int R = this.e.R() + i12 + rect.top + rect.bottom;
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
        if (!this.f43731a0) {
            Boolean bool = this.f43759w0;
            if (bool == null) {
                if (!this.f43757v0) {
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
        if (this.f43754s0 != null) {
            long max = Math.max(0L, 60000 - (System.currentTimeMillis() - this.f43754s0.f43933r));
            String str = null;
            this.f43759w0 = null;
            TLObject tLObject = this.f43754s0.f43932q;
            if (tLObject instanceof TLRPC.TL_webViewResultUrl) {
                TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject;
                this.G = tL_webViewResultUrl.query_id;
                str = tL_webViewResultUrl.url;
                z4 = tL_webViewResultUrl.same_origin;
                this.f43759w0 = Boolean.valueOf(tL_webViewResultUrl.fullsize);
                boolean z10 = this.B0;
                if (!z10) {
                    x(tL_webViewResultUrl.fullscreen, !z10, this.f43733b0);
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
            if (str != null && !this.B0) {
                MediaDataController.getInstance(this.D).increaseWebappRating(this.f43754s0.f43921c);
                this.f43760x.u(this.D, str, z4);
            }
            AndroidUtilities.runOnUIThread(this.f43750q0, max);
            g2 g2Var = this.v;
            if (g2Var != null) {
                g2Var.setFullSize(m());
            }
        }
    }

    public final void o(boolean z4) {
        if (this.f43764z0 == z4) {
            return;
        }
        this.f43764z0 = z4;
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
        if (this.f43734c == null) {
            o1.j jVar = new o1.j(this, U0);
            o1.k kVar = new o1.k();
            kVar.b(1200.0f);
            kVar.a(1.0f);
            jVar.f16178u = kVar;
            this.f43734c = jVar;
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.f43749p0.getVisibility() == 0) {
            if (getOwnerActivity() != null) {
                getOwnerActivity().finish();
            }
        } else if (this.f43760x.D()) {
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
        if (this.f43731a0) {
            attributes.flags = i12 | 512;
        } else {
            attributes.flags = i11 & (-515);
        }
        window.setAttributes(attributes);
        if (i10 >= 23) {
            window.setStatusBarColor(0);
        }
        o2 o2Var = this.e;
        o2Var.setFitsSystemWindows(true);
        o2Var.setSystemUiVisibility(1792);
        o2Var.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
            @Override
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                return p2.e(p2.this, view, windowInsets);
            }
        });
        if (this.f43731a0 && ((l2Var = this.f43742i0) == null || l2Var.getTotalHeight() <= 0)) {
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
        o1.j jVar = this.f43734c;
        if (jVar != null) {
            jVar.c();
            this.f43734c = null;
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
            ((LaunchActivity) context).f31634y0.add(this.f43749p0);
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
            ((LaunchActivity) context).f31634y0.remove(this.f43749p0);
        }
    }

    public final boolean q() {
        String str;
        if (this.f43748o0) {
            TLRPC.User user = MessagesController.getInstance(this.D).getUser(Long.valueOf(this.E));
            if (user != null) {
                str = ContactsController.formatName(user.first_name, user.last_name);
            } else {
                str = null;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            alertDialog$Builder.f19478a.O = str;
            alertDialog$Builder.f19478a.Q = LocaleController.getString(R.string.BotWebViewChangesMayNotBeSaved);
            alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewCloseAnyway), new r1(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
            d2Var.show();
            ((TextView) d2Var.d(-1)).setTextColor(j6.v0(j6.f20116q7, this.B));
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
        p70 p70Var = this.H0;
        if (p70Var != null) {
            p70Var.u();
        }
        if (this.f43731a0) {
            view = this.f43743j0;
        } else {
            view = this.W;
        }
        p70 G = p70.G(this.e, this.B, view, true);
        this.H0 = G;
        ArrayList arrayList3 = h0.c(getContext(), this.D, this.E).e;
        HashMap hashMap = this.G0;
        hashMap.clear();
        if (!arrayList3.isEmpty()) {
            p70 J = G.J();
            J.c(R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), new yt0(G, 25), false);
            J.k();
            int size2 = arrayList3.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj = arrayList3.get(i13);
                i13++;
                g0 g0Var = (g0) obj;
                String str = g0Var.f43591c;
                j21 j21Var = new j21(15);
                f6 f6Var = J.d;
                if (J.e == null) {
                    arrayList = arrayList3;
                } else {
                    org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, J.e, J.d, false, false);
                    arrayList = arrayList3;
                    g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                    g1Var.setText(str);
                    g1Var.setSubtext("");
                    Integer num = J.f27762j0;
                    if (num != null) {
                        v02 = num.intValue();
                    } else {
                        v02 = j6.v0(j6.E8, f6Var);
                    }
                    Integer num2 = J.f27764k0;
                    if (num2 != null) {
                        v03 = num2.intValue();
                    } else {
                        v03 = j6.v0(j6.F8, f6Var);
                    }
                    g1Var.c(v02, v03);
                    Integer num3 = J.f27766l0;
                    if (num3 != null) {
                        l1 = num3.intValue();
                    } else {
                        l1 = j6.l1(0.12f, j6.v0(j6.E8, f6Var));
                    }
                    g1Var.setSelectorColor(l1);
                    g1Var.setOnClickListener(new org.telegram.ui.Components.g0(J, j21Var));
                    int i14 = J.S;
                    if (i14 > 0) {
                        g1Var.setMinimumWidth(AndroidUtilities.dp(i14));
                        J.r(g1Var, b6.n(J.S, -2));
                    } else {
                        J.r(g1Var, b6.n(-1, -2));
                        hashMap.put(g0Var, J.y());
                        arrayList3 = arrayList;
                    }
                }
                hashMap.put(g0Var, J.y());
                arrayList3 = arrayList;
            }
            B();
            J.S = AndroidUtilities.dp(180.0f);
            G.c(R.drawable.menu_download_round, LocaleController.getString(R.string.BotDownloads), new kh.y2(G, J, 9), false);
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
        if (this.N != j6.w0(null, j6.f19881d6, false)) {
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
            int l12 = j6.l1(0.85f, i11);
            int l13 = j6.l1(0.1f, i11);
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
        G.f27778t = false;
        G.f27777s = 0;
        G.Z();
    }

    @Override
    public final void release() {
        if (this.J0) {
            return;
        }
        try {
            super.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
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
        this.f43754s0 = y3Var;
        int i10 = y3Var.f43919a;
        this.D = i10;
        this.F = y3Var.f43920b;
        this.E = y3Var.f43921c;
        this.H = y3Var.h;
        this.I = y3Var.f43924i;
        this.J = y3Var.e;
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
        f6 f6Var = this.B;
        if ((user2 != null && user2.verified) || (userFull != null && (user = userFull.user) != null && user.verified)) {
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.verified_profile).mutate();
            this.F0 = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.Oh, f6Var), PorterDuff.Mode.SRC_IN));
            this.F0.setAlpha(255);
            m2Var.getTitleTextView().setDrawablePadding(AndroidUtilities.dp(2.0f));
            m2Var.getTitleTextView().i(new dg.k1(this, 8));
        }
        BotFullscreenButtons botFullscreenButtons = this.f43743j0;
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
            if (y3Var.f43931p) {
                x(z10, false, this.f43733b0);
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
        JSONObject p10 = p(f6Var, false);
        TLRPC.User user3 = MessagesController.getInstance(this.D).getUser(Long.valueOf(this.E));
        h2 h2Var = this.f43760x;
        h2Var.setBotUser(user3);
        h2Var.t(this.D, this.E);
        TLRPC.User user4 = y3Var.f43928m;
        if (tL_attachMenuBot != null && tL_attachMenuBot.show_in_side_menu && !MediaDataController.getInstance(this.D).isShortcutAdded(this.E, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT)) {
            if (user4 == null) {
                user4 = MessagesController.getInstance(this.D).getUser(Long.valueOf(this.E));
            }
            if (user4 != null && user4.photo != null && !FileLoader.getInstance(this.D).getPathToAttach(user4.photo.photo_small, true).exists()) {
                MediaDataController.getInstance(this.D).preloadImage(ImageLocation.getForUser(this.D, user4, 1), 0);
            }
        }
        if (y3Var.f43932q != null) {
            n();
            return;
        }
        int i12 = y3Var.f43923g;
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
                        tL_messages_requestMainWebView.bot = MessagesController.getInstance(this.D).getInputUser(y3Var.f43921c);
                        tL_messages_requestMainWebView.platform = "android";
                        if (p2Var instanceof zn) {
                            zn znVar = (zn) p2Var;
                            if (znVar.i() != null) {
                                inputPeer2 = MessagesController.getInputPeer(znVar.i());
                            } else {
                                inputPeer2 = MessagesController.getInputPeer(znVar.e);
                            }
                        } else {
                            inputPeer2 = MessagesController.getInstance(this.D).getInputPeer(y3Var.f43920b);
                        }
                        tL_messages_requestMainWebView.peer = inputPeer2;
                        tL_messages_requestMainWebView.compact = y3Var.f43930o;
                        tL_messages_requestMainWebView.fullscreen = y3Var.f43931p;
                        if (!TextUtils.isEmpty(y3Var.f43927l)) {
                            tL_messages_requestMainWebView.start_param = y3Var.f43927l;
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
                    TLRPC.BotApp botApp = y3Var.f43925j;
                    tL_inputBotAppID.f19217id = botApp.f19156id;
                    tL_inputBotAppID.access_hash = botApp.access_hash;
                    tL_messages_requestAppWebView.app = tL_inputBotAppID;
                    tL_messages_requestAppWebView.write_allowed = y3Var.f43926k;
                    tL_messages_requestAppWebView.platform = "android";
                    if (p2Var instanceof zn) {
                        zn znVar2 = (zn) p2Var;
                        if (znVar2.i() != null) {
                            inputPeer = MessagesController.getInputPeer(znVar2.i());
                        } else {
                            inputPeer = MessagesController.getInputPeer(znVar2.e);
                        }
                    } else {
                        inputPeer = MessagesController.getInputPeer(y3Var.f43928m);
                    }
                    tL_messages_requestAppWebView.peer = inputPeer;
                    tL_messages_requestAppWebView.compact = y3Var.f43930o;
                    tL_messages_requestAppWebView.fullscreen = y3Var.f43931p;
                    if (!TextUtils.isEmpty(y3Var.f43927l)) {
                        tL_messages_requestAppWebView.start_param = y3Var.f43927l;
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
                tL_messages_requestWebView.compact = y3Var.f43930o;
                tL_messages_requestWebView.fullscreen = y3Var.f43931p;
                tL_messages_requestWebView.url = y3Var.f43922f;
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
            if ((y3Var.f43929n & 1) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            tL_messages_requestSimpleWebView.from_switch_webview = z4;
            tL_messages_requestSimpleWebView.bot = MessagesController.getInstance(this.D).getInputUser(this.E);
            tL_messages_requestSimpleWebView.platform = "android";
            if ((y3Var.f43929n & 2) != 0) {
                z12 = true;
            }
            tL_messages_requestSimpleWebView.from_side_menu = z12;
            tL_messages_requestSimpleWebView.compact = y3Var.f43930o;
            tL_messages_requestSimpleWebView.fullscreen = y3Var.f43931p;
            if (p10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON5 = new TLRPC.TL_dataJSON();
                tL_messages_requestSimpleWebView.theme_params = tL_dataJSON5;
                tL_dataJSON5.data = p10.toString();
                tL_messages_requestSimpleWebView.flags |= 1;
            }
            if (!TextUtils.isEmpty(y3Var.f43922f)) {
                tL_messages_requestSimpleWebView.flags |= 8;
                tL_messages_requestSimpleWebView.url = y3Var.f43922f;
            }
            if (!TextUtils.isEmpty(y3Var.f43927l)) {
                tL_messages_requestSimpleWebView.start_param = y3Var.f43927l;
                tL_messages_requestSimpleWebView.flags |= 16;
            }
            ConnectionsManager.getInstance(this.D).sendRequest(tL_messages_requestSimpleWebView, new a2(this, 2));
            return;
        }
        TLRPC.TL_messages_requestWebView tL_messages_requestWebView2 = new TLRPC.TL_messages_requestWebView();
        tL_messages_requestWebView2.peer = MessagesController.getInstance(this.D).getInputPeer(this.F);
        tL_messages_requestWebView2.bot = MessagesController.getInstance(this.D).getInputUser(this.E);
        tL_messages_requestWebView2.platform = "android";
        tL_messages_requestWebView2.compact = y3Var.f43930o;
        tL_messages_requestWebView2.fullscreen = y3Var.f43931p;
        String str = y3Var.f43922f;
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
        o2 o2Var = this.e;
        o2Var.setAlpha(0.0f);
        o2Var.addOnLayoutChangeListener(new m.t2(this, 1));
        super.show();
        this.J0 = false;
        T0.add(this);
    }

    public final void t(final int i10, boolean z4, boolean z10) {
        int i11;
        boolean z11;
        final int i12 = this.N;
        j6.b(0.35f, -0.1f, i10);
        final o1 o1Var = new o1();
        int i13 = 0;
        if (this.R) {
            i11 = this.N;
        } else {
            i11 = 0;
        }
        SparseIntArray sparseIntArray = o1Var.f43704a;
        f6 f6Var = this.B;
        o1Var.c(sparseIntArray, i11, f6Var);
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
        o1Var.c(o1Var.f43705b, i13, f6Var);
        if (z10) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(mr.f27122f);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    int d = i0.a.d(floatValue, i12, i10);
                    p2 p2Var = p2.this;
                    p2Var.N = d;
                    p2Var.h();
                    o2 o2Var = p2Var.e;
                    o2Var.invalidate();
                    m2 m2Var = p2Var.T;
                    m2Var.setBackgroundColor(p2Var.N);
                    o1 o1Var2 = o1Var;
                    o1Var2.b(m2Var, floatValue);
                    p2Var.f43730a = o1Var2.a(j6.Ii);
                    o2Var.invalidate();
                }
            });
            duration.addListener(new f2(this, i12, i10, o1Var));
            duration.start();
        } else {
            this.N = i10;
            h();
            o2 o2Var = this.e;
            o2Var.invalidate();
            int i14 = this.N;
            m2 m2Var = this.T;
            m2Var.setBackgroundColor(i14);
            o1Var.b(m2Var, 1.0f);
            this.f43730a = o1Var.a(j6.Ii);
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
            if (this.f43764z0) {
                V0++;
            }
        } else if (this.f43764z0) {
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
            duration.setInterpolator(mr.f27122f);
            this.M0.addUpdateListener(new x1(this, color, i10, 0));
            this.M0.addListener(new a4(this, i10, 9));
            this.M0.start();
            return;
        }
        paint.setColor(i10);
        A();
        this.e.invalidate();
        org.telegram.ui.h3 h3Var = this.R0;
        if (h3Var != null) {
            if (AndroidUtilities.computePerceivedBrightness(paint.getColor()) > 0.721f) {
                z10 = false;
            }
            h3Var.b(z10, false);
            this.R0.setBackgroundColor(paint.getColor());
        }
        F();
    }

    public final void w(boolean z4) {
        if (this.f43757v0 != z4) {
            this.f43757v0 = z4;
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
        if (this.f43731a0 == z4) {
            return;
        }
        this.f43731a0 = z4;
        int i10 = 0;
        if (z11 && !MessagesController.getInstance(this.D).disableBotFullscreenBlur && SharedConfig.getDevicePerformanceClass() >= 2) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f43733b0 = z12;
        ValueAnimator valueAnimator = this.O0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        BotFullscreenButtons botFullscreenButtons = this.f43743j0;
        g2 g2Var = this.v;
        if (botFullscreenButtons != null) {
            botFullscreenButtons.setPreview(z4, z10);
            if (this.f43733b0) {
                obj = g2Var.getRenderNode();
            } else {
                obj = null;
            }
            botFullscreenButtons.setParentRenderNode(obj);
        }
        this.f43739f0 = g2Var.getWidth();
        this.f43740g0 = g2Var.getHeight();
        this.N0 = false;
        l2 l2Var = this.f43742i0;
        h2 h2Var = this.f43760x;
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
            this.f43736d0 = 0.0f;
            if (z4) {
                f14 = 0.0f;
            } else {
                f14 = 1.0f;
            }
            this.f43735c0 = f14;
            m2Var.setAlpha(1.0f - f14);
            m2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * this.f43735c0);
            g2Var.setTranslationY(AndroidUtilities.lerp(f13, f15, this.f43736d0));
            g2Var.setTranslationX(AndroidUtilities.lerp(f12, 0.0f, this.f43736d0));
            l2Var.setTranslationX(AndroidUtilities.lerp(f11, 0.0f, this.f43736d0));
            botFullscreenButtons.setAlpha(this.f43735c0);
            this.e.invalidate();
            h2Var.setViewPortHeightOffset(g2Var.getTranslationY() - f15);
            h2Var.o(false, false);
            this.f43737e0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.O0 = ofFloat;
            float f16 = f12;
            ofFloat.addUpdateListener(new d2(this, z4, f13, f15, f16, f11));
            this.O0.addListener(new e2(this, z4, currentActionBarHeight2, f16));
            this.O0.setDuration(280L);
            this.O0.setInterpolator(mr.h);
            this.O0.start();
            return;
        }
        this.f43737e0 = false;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f43735c0 = f10;
        this.f43736d0 = 0.0f;
        D();
        G();
        if (z4) {
            i10 = 8;
        }
        m2Var.setVisibility(i10);
        m2Var.setAlpha(1.0f - this.f43735c0);
        m2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * this.f43735c0);
        l2Var.setTranslationX(0.0f);
        botFullscreenButtons.setAlpha(this.f43735c0);
        h2Var.setViewPortHeightOffset(0.0f);
        h2Var.o(true, true);
        C();
    }

    public final void y(int i10, boolean z4) {
        int i11 = this.O;
        l2 l2Var = this.f43742i0;
        Paint paint = l2Var.f43838a;
        l2Var.e.f1378b = i10;
        paint.setColor(i10);
        if (!z4) {
            l2Var.d.a(i10, true);
        }
        if (z4) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(mr.f27122f);
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
        ofFloat.addListener(new s61(14, this, z4));
        this.L0.addUpdateListener(new p1(this, 0));
        this.L0.setInterpolator(mr.h);
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
