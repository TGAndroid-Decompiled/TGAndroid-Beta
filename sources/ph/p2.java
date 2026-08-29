package ph;

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
import i7.f6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import nh.t4;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.z3;
import org.telegram.ui.Components.av0;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.m20;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.nd0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.al0;
import org.telegram.ui.ef0;
import org.telegram.ui.it0;
import org.telegram.ui.ka1;
import org.telegram.ui.p60;
import org.telegram.ui.tn;
import org.telegram.ui.xx0;
public final class p2 extends Dialog implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.s3 {
    public static final HashSet S0 = new HashSet();
    public static final av0 T0;
    public static int U0;
    public final c6 A;
    public boolean A0;
    public boolean B;
    public boolean B0;
    public int C;
    public float C0;
    public long D;
    public ka1 D0;
    public long E;
    public Drawable E0;
    public long F;
    public final HashMap F0;
    public int G;
    public j70 G0;
    public long H;
    public g0 H0;
    public String I;
    public boolean I0;
    public final Paint J;
    public float J0;
    public final Paint K;
    public ValueAnimator K0;
    public final Paint L;
    public ValueAnimator L0;
    public int M;
    public boolean M0;
    public int N;
    public ValueAnimator N0;
    public boolean O;
    public boolean O0;
    public final Paint P;
    public String P0;
    public boolean Q;
    public org.telegram.ui.h3 Q0;
    public boolean R;
    public boolean R0;
    public final m2 S;
    public final FrameLayout.LayoutParams T;
    public final Drawable U;
    public org.telegram.ui.ActionBar.w0 V;
    public BotFullscreenButtons.OptionsIcon W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public int f45956a;
    public boolean f45957a0;
    public float f45958b;
    public float f45959b0;
    public o1.k f45960c;
    public float f45961c0;
    public Boolean d;
    public boolean f45962d0;
    public final o2 f45963e;
    public int f45964e0;
    public final Rect f45965f;
    public int f45966f0;
    public Activity f45967g0;
    public final Rect h;
    public final l2 f45968h0;
    public final BotFullscreenButtons f45969i0;
    public mc f45970j0;
    public f0 f45971k0;
    public final FrameLayout f45972l0;
    public final FrameLayout.LayoutParams m0;
    public int f45973n;
    public boolean f45974n0;
    public final nd0 f45975o0;
    public final q1 f45976p0;
    public int f45977q0;
    public final org.telegram.ui.ActionBar.m3 f45978r;
    public y3 f45979r0;
    public final a5.j f45980s;
    public boolean f45981s0;
    public boolean f45982t0;
    public boolean f45983u0;
    public final g2 v;
    public Boolean f45984v0;
    public final FrameLayout.LayoutParams f45985w;
    public boolean f45986w0;
    public final h2 f45987x;
    public u0 f45988x0;
    public final n2 f45989y;
    public boolean f45990y0;
    public org.telegram.ui.ActionBar.l3 f45991z0;

    static {
        av0 av0Var = new av0(new xx0(22), new xx0(23));
        av0Var.f26899c = 100.0f;
        T0 = av0Var;
        U0 = 0;
    }

    public p2(Context context, c6 c6Var) {
        super(context, R.style.TransparentDialog);
        Object obj;
        this.f45958b = 0.0f;
        this.f45965f = new Rect();
        this.h = new Rect();
        this.f45973n = 0;
        boolean z10 = true;
        Paint paint = new Paint(1);
        this.J = paint;
        Paint paint2 = new Paint();
        this.K = paint2;
        this.L = new Paint(1);
        this.P = new Paint(1);
        this.f45976p0 = new q1(this, 1);
        this.f45977q0 = -1;
        this.f45983u0 = false;
        this.f45984v0 = null;
        this.F0 = new HashMap();
        this.I0 = false;
        this.M0 = true;
        this.R0 = false;
        this.A = c6Var;
        this.f45956a = g6.w0(null, g6.Ii, false);
        g2 g2Var = new g2(this, context, 0);
        this.v = g2Var;
        g2Var.setAllowFullSizeSwipe(true);
        g2Var.setShouldWaitWebViewScroll(true);
        int i10 = g6.f23062d6;
        h2 h2Var = new h2(this, context, c6Var, g6.v0(i10, c6Var));
        this.f45987x = h2Var;
        h2Var.setOnVerifiedAge(this.D0);
        h2Var.setDelegate(new k2(this, context, c6Var));
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(4.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(1073741824);
        this.M = g6.v0(i10, c6Var);
        int v02 = g6.v0(g6.f23009a7, c6Var);
        this.N = v02;
        AndroidUtilities.setNavigationBarColor((Dialog) this, v02, false);
        o2 o2Var = new o2(this, context);
        this.f45963e = o2Var;
        o2Var.setDelegate(new s1(this, 0));
        FrameLayout.LayoutParams e10 = f6.e(-1, -1, 49);
        this.f45985w = e10;
        o2Var.addView(g2Var, e10);
        l2 l2Var = new l2(this, getContext(), c6Var);
        this.f45968h0 = l2Var;
        l2Var.setOnButtonClickListener(new t1(this, 0));
        l2Var.setOnResizeListener(new q1(this, 3));
        o2Var.addView(l2Var, f6.e(-1, -2, 81));
        BotFullscreenButtons botFullscreenButtons = new BotFullscreenButtons(getContext());
        this.f45969i0 = botFullscreenButtons;
        botFullscreenButtons.setAlpha(0.0f);
        botFullscreenButtons.setVisibility(8);
        z10 = (MessagesController.getInstance(this.C).disableBotFullscreenBlur || SharedConfig.getDevicePerformanceClass() < 2) ? false : false;
        this.f45957a0 = z10;
        if (z10) {
            obj = g2Var.getRenderNode();
        } else {
            obj = null;
        }
        botFullscreenButtons.setParentRenderNode(obj);
        o2Var.addView(botFullscreenButtons, f6.e(-1, -1, 119));
        botFullscreenButtons.setOnCloseClickListener(new q1(this, 4));
        botFullscreenButtons.setOnCollapseClickListener(new q1(this, 5));
        botFullscreenButtons.setOnMenuClickListener(new q1(this, 6));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f45972l0 = frameLayout;
        FrameLayout.LayoutParams e11 = f6.e(-1, 200, 55);
        this.m0 = e11;
        o2Var.addView(frameLayout, e11);
        this.U = getContext().getDrawable(R.drawable.header_shadow).mutate();
        ?? lVar = new org.telegram.ui.ActionBar.l(context, c6Var);
        this.S = lVar;
        lVar.setBackgroundColor(0);
        lVar.setBackButtonImage(R.drawable.ic_close_white);
        A();
        lVar.setActionBarMenuOnItemClick(new al0(this, 28));
        lVar.setAlpha(0.0f);
        FrameLayout.LayoutParams e12 = f6.e(-1, -2, 49);
        this.T = e12;
        o2Var.addView((View) lVar, e12);
        ?? j3Var = new j3(context, c6Var);
        this.f45989y = j3Var;
        o2Var.addView((View) j3Var, f6.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
        h2Var.setWebViewProgressListener(new ag.p(this, 4));
        g2Var.addView(h2Var, f6.c(-1.0f, -1));
        g2Var.setScrollListener(new q1(this, 7));
        g2Var.setScrollEndListener(new q1(this, 8));
        g2Var.setDelegate(new r1(this));
        g2Var.setIsKeyboardVisible(new r1(this));
        nd0 nd0Var = new nd0(context);
        this.f45975o0 = nd0Var;
        o2Var.addView(nd0Var, f6.c(-1.0f, -1));
        setContentView(o2Var, new ViewGroup.LayoutParams(-1, -1));
        D();
        LaunchActivity launchActivity = LaunchActivity.C1;
        org.telegram.ui.ActionBar.m3 P = launchActivity != null ? launchActivity.P() : null;
        this.f45978r = P;
        if (P != null) {
            org.telegram.ui.web.t1 t1Var = new org.telegram.ui.web.t1(o2Var, 9);
            q1 q1Var = new q1(this, 2);
            P.E.add(t1Var);
            P.F.add(q1Var);
            this.f45980s = new a5.j(P);
        }
    }

    public static void d(p2 p2Var) {
        if (!p2Var.I0) {
            super.dismiss();
            p2Var.I0 = true;
        }
    }

    public static WindowInsets e(p2 p2Var, View view, WindowInsets windowInsets) {
        r0.j1 j1Var = r0.m1.h(view, windowInsets).f46843a;
        i0.b f9 = j1Var.f(2);
        p2Var.f45965f.set(f9.f8186a, f9.f8187b, f9.f8188c, f9.d);
        i0.b f10 = j1Var.f(647);
        Rect rect = p2Var.h;
        rect.set(Math.max(f10.f8186a, windowInsets.getStableInsetLeft()), Math.max(f10.f8187b, windowInsets.getStableInsetTop()), Math.max(f10.f8188c, windowInsets.getStableInsetRight()), Math.max(f10.d, windowInsets.getStableInsetBottom()));
        int i10 = Build.VERSION.SDK_INT;
        if (i10 <= 28) {
            rect.top = Math.max(rect.top, AndroidUtilities.getStatusBarHeight(p2Var.getContext()));
        }
        int i11 = j1Var.f(8).d;
        if (i11 > rect.bottom && i11 > AndroidUtilities.dp(20.0f)) {
            p2Var.f45973n = i11;
        } else {
            p2Var.f45973n = 0;
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
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
        c2Var.N = string;
        c2Var.P = AndroidUtilities.replaceTags(formatString);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.Components.u1(i10, j10, tL_attachMenuBot, runnable));
        j7.l1.u(R.string.Cancel, alertDialog$Builder, null);
    }

    public static JSONObject p(c6 c6Var, final boolean z10) {
        try {
            JSONObject jSONObject = new JSONObject();
            final int v = g6.v(-16777216, g6.v0(g6.f23133h5, c6Var));
            Utilities.CallbackReturn callbackReturn = new Utilities.CallbackReturn() {
                @Override
                public final Object run(Object obj) {
                    int v10 = g6.v(v, ((Integer) obj).intValue());
                    Integer valueOf = Integer.valueOf(v10);
                    if (z10) {
                        return String.format(Locale.US, "#%02X%02X%02X", Integer.valueOf(Color.red(v10)), Integer.valueOf(Color.green(v10)), Integer.valueOf(Color.blue(v10)));
                    }
                    return valueOf;
                }
            };
            jSONObject.put("bg_color", callbackReturn.run(Integer.valueOf(v)));
            jSONObject.put("section_bg_color", callbackReturn.run(Integer.valueOf(g6.v0(g6.f23062d6, c6Var))));
            int i10 = g6.f23009a7;
            jSONObject.put("secondary_bg_color", callbackReturn.run(Integer.valueOf(g6.v0(i10, c6Var))));
            jSONObject.put("text_color", callbackReturn.run(Integer.valueOf(g6.v0(g6.G6, c6Var))));
            jSONObject.put("hint_color", callbackReturn.run(Integer.valueOf(g6.v0(g6.H6, c6Var))));
            jSONObject.put("link_color", callbackReturn.run(Integer.valueOf(g6.v0(g6.J6, c6Var))));
            jSONObject.put("button_color", callbackReturn.run(Integer.valueOf(g6.v0(g6.Oh, c6Var))));
            jSONObject.put("button_text_color", callbackReturn.run(Integer.valueOf(g6.v0(g6.Sh, c6Var))));
            jSONObject.put("header_bg_color", callbackReturn.run(Integer.valueOf(g6.v0(g6.f23329s8, c6Var))));
            jSONObject.put("accent_text_color", callbackReturn.run(Integer.valueOf(g6.v0(g6.q6, c6Var))));
            jSONObject.put("section_header_text_color", callbackReturn.run(Integer.valueOf(g6.v0(g6.L6, c6Var))));
            jSONObject.put("subtitle_text_color", callbackReturn.run(Integer.valueOf(g6.v0(g6.f23450z6, c6Var))));
            jSONObject.put("destructive_text_color", callbackReturn.run(Integer.valueOf(g6.v0(g6.f23279p7, c6Var))));
            jSONObject.put("section_separator_color", callbackReturn.run(Integer.valueOf(g6.v0(g6.f23063d7, c6Var))));
            jSONObject.put("bottom_bar_bg_color", callbackReturn.run(Integer.valueOf(g6.v0(i10, c6Var))));
            return jSONObject;
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }

    public final void A() {
        if (!this.Q) {
            int i10 = g6.G6;
            c6 c6Var = this.A;
            int v02 = g6.v0(i10, c6Var);
            m2 m2Var = this.S;
            m2Var.setTitleColor(v02);
            m2Var.C(g6.v0(i10, c6Var), false);
            m2Var.B(g6.v0(g6.f23367u8, c6Var), false);
            m2Var.D(g6.v0(g6.G8, c6Var), false);
            m2Var.E(g6.v0(g6.E8, c6Var), false, false);
            m2Var.E(g6.v0(g6.F8, c6Var), true, false);
            m2Var.F(g6.v0(g6.I5, c6Var), false);
        }
        this.f45987x.setFlickerViewColor(this.L.getColor());
    }

    public final void B() {
        mc mcVar;
        boolean z10;
        h0 c3 = h0.c(getContext(), this.C, this.D);
        ArrayList arrayList = c3.f45824e;
        g0 g0Var = c3.f45825f;
        boolean z11 = true;
        if (g0Var == null) {
            mc mcVar2 = this.f45970j0;
            if (mcVar2 != null) {
                mcVar2.b();
                this.f45970j0 = null;
            }
        } else if ((g0Var.c() && !g0Var.f45812l) || g0Var.f45811k) {
            if (this.H0 != g0Var && (mcVar = this.f45970j0) != null) {
                mcVar.b();
                this.f45970j0 = null;
            }
            mc mcVar3 = this.f45970j0;
            if (mcVar3 == null || !mcVar3.f30654l) {
                this.H0 = g0Var;
                f0 f0Var = new f0(getContext(), this.A);
                this.f45971k0 = f0Var;
                mc f9 = mc.f(this.f45972l0, f0Var, 5000);
                this.f45970j0 = f9;
                f9.k(true);
            }
            if (this.f45971k0.c(g0Var)) {
                this.f45970j0 = null;
            }
            g0Var.f45811k = false;
            g0Var.f45812l = true;
        } else {
            f0 f0Var2 = this.f45971k0;
            if (f0Var2 != null) {
                this.H0 = g0Var;
                if (f0Var2.c(g0Var)) {
                    this.f45970j0 = null;
                }
            }
        }
        C();
        for (Map.Entry entry : this.F0.entrySet()) {
            org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) entry.getValue();
            g0 g0Var2 = (g0) entry.getKey();
            g1Var.setText(g0Var2.f45805c);
            if (!g0Var2.c()) {
                g1Var.setSubtext(AndroidUtilities.formatFileSize(g0Var2.f45808g));
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
                g1Var.f22964b.setPadding(0, 0, AndroidUtilities.dp(32.0f), 0);
            } else if (g0Var2.f45809i) {
                g1Var.setVisibility(8);
            } else {
                g1Var.setRightIcon(0);
                g1Var.f22964b.setPadding(0, 0, 0, 0);
            }
            g1Var.setOnClickListener(new org.telegram.ui.web.c(2, this, g0Var2));
        }
        BotFullscreenButtons.OptionsIcon optionsIcon = this.W;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if (((g0) obj).c()) {
                    z10 = true;
                    break;
                }
            } else {
                z10 = false;
                break;
            }
        }
        optionsIcon.setDownloading(z10);
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
                z11 = false;
                break;
            }
        }
        this.f45969i0.setDownloading(z11);
    }

    public final void C() {
        f0 f0Var = this.f45971k0;
        if (f0Var == null) {
            return;
        }
        if (this.Z) {
            f0Var.setArrow(AndroidUtilities.lerp(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(26.0f), this.f45959b0));
        } else if (this.f45958b > 0.5f) {
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
        BotFullscreenButtons botFullscreenButtons = this.f45969i0;
        Rect rect = this.h;
        botFullscreenButtons.setInsets(rect);
        boolean z10 = this.Z;
        h2 h2Var = this.f45987x;
        o2 o2Var = this.f45963e;
        l2 l2Var = this.f45968h0;
        int i16 = 0;
        if (z10) {
            if (l2Var != null && l2Var.getTotalHeight() > 0) {
                i14 = rect.bottom;
            } else {
                i14 = 0;
            }
            int i17 = rect.left;
            int i18 = rect.top;
            int i19 = rect.right;
            if (this.f45973n > i14 || (l2Var != null && l2Var.getTotalHeight() > 0)) {
                i15 = 0;
            } else {
                i15 = rect.bottom;
            }
            Rect rect2 = new Rect(i17, i18, i19, i15);
            int dp = AndroidUtilities.dp(46.0f);
            h2Var.K(rect2, false);
            h2Var.J(dp, false);
            o2Var.setPadding(0, 0, 0, Math.max(this.f45973n, i14));
        } else {
            h2Var.K(new Rect(0, 0, 0, 0), false);
            h2Var.J(0, false);
            int i20 = rect.left;
            int i21 = rect.right;
            int i22 = this.f45973n;
            org.telegram.ui.ActionBar.m3 m3Var = this.f45978r;
            if (m3Var != null) {
                i10 = m3Var.D;
            } else {
                i10 = 0;
            }
            o2Var.setPadding(i20, 0, i21, Math.max(i22, i10 + rect.bottom));
        }
        this.f45985w.topMargin = AndroidUtilities.dp(24.0f);
        boolean z11 = this.Z;
        if (!z11) {
            i11 = 0;
        } else {
            i11 = rect.left;
        }
        FrameLayout.LayoutParams layoutParams = this.T;
        layoutParams.leftMargin = i11;
        layoutParams.rightMargin = 0;
        if (!z11) {
            i12 = 0;
        } else {
            i12 = rect.left;
        }
        FrameLayout.LayoutParams layoutParams2 = this.m0;
        layoutParams2.leftMargin = i12;
        if (!z11) {
            i13 = 0;
        } else {
            i13 = rect.right;
        }
        layoutParams2.rightMargin = i13;
        boolean z12 = this.f45962d0;
        g2 g2Var = this.v;
        if (!z12) {
            g2Var.setSwipeOffsetAnimationDisallowed(true);
            if (this.Z) {
                g2Var.setTopActionBarOffsetY(-AndroidUtilities.dp(24.0f));
            } else {
                g2Var.setTopActionBarOffsetY((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(24.0f));
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
        if (!this.Z) {
            i16 = 8;
        }
        botFullscreenButtons.setVisibility(i16);
    }

    public final void E() {
        boolean z10;
        int i10;
        boolean z11 = true;
        if (this.Q) {
            z10 = !this.O;
        } else {
            z10 = (AndroidUtilities.isTablet() || i0.a.f(g6.w0(null, g6.f23062d6, true)) < 0.7210000157356262d || this.f45958b < 0.85f) ? false : false;
        }
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z10) {
            this.d = Boolean.valueOf(z10);
            if (Build.VERSION.SDK_INT >= 23) {
                o2 o2Var = this.f45963e;
                int systemUiVisibility = o2Var.getSystemUiVisibility();
                if (z10) {
                    i10 = systemUiVisibility | 8192;
                } else {
                    i10 = systemUiVisibility & (-8193);
                }
                o2Var.setSystemUiVisibility(i10);
            }
        }
    }

    public final void F() {
        org.telegram.ui.web.w0 webView;
        h2 h2Var = this.f45987x;
        if (h2Var == null || (webView = h2Var.getWebView()) == null) {
            return;
        }
        webView.setBackgroundColor(this.L.getColor());
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
            boolean z10 = this.Z;
            if (z10) {
                attributes.flags = i10 | attributes.flags;
            } else {
                attributes.flags = (~i10) & attributes.flags;
            }
            o2 o2Var = this.f45963e;
            if (z10 && (((l2Var = this.f45968h0) == null || l2Var.getTotalHeight() <= 0) && !o2Var.f45932t0)) {
                o2Var.setSystemUiVisibility(o2Var.getSystemUiVisibility() | 2);
            } else {
                o2Var.setSystemUiVisibility(o2Var.getSystemUiVisibility() & (-3));
            }
            window.setAttributes(attributes);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.l3 a() {
        boolean z10;
        String str;
        boolean z11;
        boolean booleanValue;
        float f9;
        org.telegram.ui.ActionBar.l3 l3Var = new org.telegram.ui.ActionBar.l3();
        l3Var.f23653o = this.M;
        l3Var.f23652n = this.f45977q0;
        l3Var.f23650l = this.Q;
        l3Var.f23651m = this.R;
        l3Var.f23654p = this.L.getColor();
        l3Var.f23641a = this.f45979r0;
        boolean z12 = false;
        h2 h2Var = this.f45987x;
        if (h2Var != null && h2Var.J) {
            z10 = true;
        } else {
            z10 = false;
        }
        l3Var.f23656r = z10;
        l3Var.B = g6.I.q();
        org.telegram.ui.web.w0 w0Var = null;
        if (h2Var != null) {
            str = h2Var.getUrlLoaded();
        } else {
            str = null;
        }
        l3Var.v = str;
        g2 g2Var = this.v;
        if ((g2Var == null || g2Var.getSwipeOffsetY() >= 0.0f) && !this.f45982t0 && !m() && !this.Z) {
            z11 = false;
        } else {
            z11 = true;
        }
        l3Var.h = z11;
        l3Var.f23661x = this.Z;
        l3Var.f23662y = this.f45957a0;
        Boolean bool = this.f45984v0;
        if (bool == null) {
            booleanValue = this.f45983u0;
        } else {
            booleanValue = bool.booleanValue();
        }
        l3Var.f23663z = booleanValue;
        if (g2Var != null) {
            f9 = g2Var.getOffsetY();
        } else {
            f9 = Float.MAX_VALUE;
        }
        l3Var.f23647i = f9;
        l3Var.A = this.f45986w0;
        l3Var.f23657s = this.f45981s0;
        l3Var.f23660w = this.f45974n0;
        l3Var.f23658t = this.X;
        l3Var.f23648j = (g2Var == null || g2Var.I) ? true : true;
        l3Var.f23659u = this.f45968h0.f46077e;
        l3Var.f23655q = this.N;
        u0 u0Var = this.f45988x0;
        if (u0Var != null) {
            u0Var.b();
        }
        l3Var.I = this.f45988x0;
        if (h2Var != null) {
            w0Var = h2Var.getWebView();
        }
        if (w0Var != null) {
            h2Var.g("preserveWebView");
            h2Var.f44288v0 = true;
            if (h2Var.f44275k0) {
                h2Var.v("visibility_changed", org.telegram.ui.web.z0.x(Boolean.FALSE, "is_visible"));
            }
            l3Var.f23642b = w0Var;
            l3Var.d = h2Var.getBotProxy();
            l3Var.f23644e = w0Var.getWidth();
            l3Var.f23645f = w0Var.getHeight();
            w0Var.onPause();
        }
        boolean z13 = this.O0;
        l3Var.E = z13;
        if (z13) {
            l3Var.F = this.P0;
        }
        l3Var.J = this.f45990y0;
        this.f45991z0 = l3Var;
        return l3Var;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final boolean c(org.telegram.ui.ActionBar.i3 i3Var) {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.webViewResultSent) {
            if (this.F == ((Long) objArr[0]).longValue()) {
                k(false);
            }
        } else if (i10 == NotificationCenter.didSetNewTheme) {
            this.f45963e.invalidate();
            this.f45987x.f44277n.b(g6.v0(g6.f23062d6, this.A), 153);
            A();
            E();
        } else if (i10 == NotificationCenter.botDownloadsUpdate) {
            B();
        }
    }

    @Override
    public final void dismiss(boolean z10) {
        k(false);
    }

    public final void g(TL_bots.botAppSettings botappsettings, boolean z10) {
        int i10;
        boolean z11;
        int i11;
        int i12;
        int i13;
        int i14;
        if (botappsettings != null) {
            boolean q6 = g6.I.q();
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
                t(i14 | (-16777216), true, z10);
            }
            if (z11) {
                if (q6) {
                    i12 = botappsettings.background_dark_color;
                } else {
                    i12 = botappsettings.background_color;
                }
                v(i12 | (-16777216), z10);
                if (q6) {
                    i13 = botappsettings.background_dark_color;
                } else {
                    i13 = botappsettings.background_color;
                }
                y(i13 | (-16777216), z10);
            }
        }
    }

    @Override
    public final int getNavigationBarColor(int i10) {
        return i0.a.d(this.J0, i10, this.N);
    }

    @Override
    public final org.telegram.ui.ActionBar.t3 mo37getWindowView() {
        return this.f45963e;
    }

    public final void h() {
        LaunchActivity launchActivity;
        if (!this.I0 && (launchActivity = LaunchActivity.C1) != null) {
            launchActivity.H(true, true, true);
        }
        o2 o2Var = this.f45963e;
        if (o2Var != null) {
            o2Var.invalidate();
        }
    }

    public final void i() {
        if (this.Q0 == null) {
            org.telegram.ui.h3 h3Var = new org.telegram.ui.h3(getContext());
            this.Q0 = h3Var;
            this.v.addView(h3Var, f6.c(-1.0f, -1));
            this.Q0.setTranslationY(-1.0f);
            this.Q0.h.setOnClickListener(new y1(this, 0));
            this.Q0.setBackgroundColor(this.L.getColor());
            AndroidUtilities.updateViewVisibilityAnimated(this.Q0, this.O0, 1.0f, false);
        }
    }

    public final void k(boolean z10) {
        int i10;
        LaunchActivity launchActivity;
        if (this.Y) {
            return;
        }
        int i11 = 0;
        if (this.D0 != null) {
            z10 = false;
        }
        this.Y = true;
        z(false);
        AndroidUtilities.cancelRunOnUIThread(this.f45976p0);
        NotificationCenter.getInstance(this.C).removeObserver(this, NotificationCenter.webViewResultSent);
        NotificationCenter.getInstance(this.C).removeObserver(this, NotificationCenter.botDownloadsUpdate);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
        if (z10 && ((launchActivity = LaunchActivity.C1) == null || launchActivity.f35601u0 == null)) {
            z10 = false;
        }
        if (z10) {
            o1.k kVar = this.f45960c;
            if (kVar != null) {
                kVar.f19045u.f19052i = 0.0f;
                kVar.f();
            }
            LaunchActivity.C1.f35601u0.b(this);
        } else {
            l2 l2Var = this.f45968h0;
            if (l2Var != null) {
                l2Var.animate().translationY(l2Var.getTotalHeight()).alpha(0.0f).setDuration(160L).setInterpolator(jr.h).start();
            }
            this.f45987x.h();
            g2 g2Var = this.v;
            int height = g2Var.getHeight();
            if (l2Var != null) {
                i10 = l2Var.getTotalHeight();
            } else {
                i10 = 0;
            }
            int i12 = height + i10;
            Rect rect = this.h;
            int R = this.f45963e.R() + i12 + rect.top + rect.bottom;
            if (m()) {
                i11 = AndroidUtilities.dp(200.0f);
            }
            g2Var.f(R + i11, true, new q1(this, 0));
        }
        S0.remove(this);
    }

    public final Activity l() {
        Activity ownerActivity = getOwnerActivity();
        if (ownerActivity == null) {
            ownerActivity = LaunchActivity.C1;
        }
        if (ownerActivity == null) {
            return AndroidUtilities.findActivity(getContext());
        }
        return ownerActivity;
    }

    public final boolean m() {
        if (!this.Z) {
            Boolean bool = this.f45984v0;
            if (bool == null) {
                if (!this.f45983u0) {
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
        boolean z10;
        if (this.f45979r0 != null) {
            long max = Math.max(0L, 60000 - (System.currentTimeMillis() - this.f45979r0.f46178r));
            String str = null;
            this.f45984v0 = null;
            TLObject tLObject = this.f45979r0.f46177q;
            if (tLObject instanceof TLRPC.TL_webViewResultUrl) {
                TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject;
                this.F = tL_webViewResultUrl.query_id;
                str = tL_webViewResultUrl.url;
                z10 = tL_webViewResultUrl.same_origin;
                this.f45984v0 = Boolean.valueOf(tL_webViewResultUrl.fullsize);
                boolean z11 = this.A0;
                if (!z11) {
                    x(tL_webViewResultUrl.fullscreen, !z11, this.f45957a0);
                }
            } else {
                if (tLObject instanceof TLRPC.TL_appWebViewResultUrl) {
                    this.F = 0L;
                    str = ((TLRPC.TL_appWebViewResultUrl) tLObject).url;
                } else if (tLObject instanceof TLRPC.TL_simpleWebViewResultUrl) {
                    this.F = 0L;
                    str = ((TLRPC.TL_simpleWebViewResultUrl) tLObject).url;
                }
                z10 = false;
            }
            h2 h2Var = this.f45987x;
            if (z10) {
                h2Var.setTrustedOrigin(str);
            }
            if (str != null && !this.A0) {
                MediaDataController.getInstance(this.C).increaseWebappRating(this.f45979r0.f46165c);
                h2Var.r(this.C, str);
            }
            AndroidUtilities.runOnUIThread(this.f45976p0, max);
            g2 g2Var = this.v;
            if (g2Var != null) {
                g2Var.setFullSize(m());
            }
        }
    }

    public final void o(boolean z10) {
        if (this.f45990y0 == z10) {
            return;
        }
        this.f45990y0 = z10;
        if (this.R0) {
            if (z10) {
                U0++;
            } else {
                U0--;
            }
        }
        if (U0 > 0) {
            AndroidUtilities.lockOrientation(l());
        } else {
            AndroidUtilities.unlockOrientation(l());
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u(true);
        if (this.f45960c == null) {
            o1.k kVar = new o1.k(this, T0);
            o1.l lVar = new o1.l();
            lVar.b(1200.0f);
            lVar.a(1.0f);
            kVar.f19045u = lVar;
            this.f45960c = kVar;
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.f45975o0.getVisibility() == 0) {
            if (getOwnerActivity() != null) {
                getOwnerActivity().finish();
            }
        } else if (this.f45987x.z()) {
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
        boolean z10 = true;
        if (i10 >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        if (this.Z) {
            attributes.flags = i12 | 512;
        } else {
            attributes.flags = i11 & (-515);
        }
        window.setAttributes(attributes);
        if (i10 >= 23) {
            window.setStatusBarColor(0);
        }
        o2 o2Var = this.f45963e;
        o2Var.setFitsSystemWindows(true);
        o2Var.setSystemUiVisibility(1792);
        o2Var.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
            @Override
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                return p2.e(p2.this, view, windowInsets);
            }
        });
        if (this.Z && ((l2Var = this.f45968h0) == null || l2Var.getTotalHeight() <= 0)) {
            o2Var.setSystemUiVisibility(o2Var.getSystemUiVisibility() | 2);
        } else {
            o2Var.setSystemUiVisibility(o2Var.getSystemUiVisibility() & (-3));
        }
        if (i10 >= 26) {
            if (i0.a.f(this.N) < 0.7210000157356262d) {
                z10 = false;
            }
            AndroidUtilities.setLightNavigationBar(this, z10);
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewTheme);
        NotificationCenter.getInstance(this.C).addObserver(this, NotificationCenter.botDownloadsUpdate);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u(false);
        o1.k kVar = this.f45960c;
        if (kVar != null) {
            kVar.c();
            this.f45960c = null;
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
            ((LaunchActivity) context).f35607x0.add(this.f45975o0);
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
            ((LaunchActivity) context).f35607x0.remove(this.f45975o0);
        }
    }

    public final boolean q() {
        String str;
        if (this.f45974n0) {
            TLRPC.User user = MessagesController.getInstance(this.C).getUser(Long.valueOf(this.D));
            if (user != null) {
                str = ContactsController.formatName(user.first_name, user.last_name);
            } else {
                str = null;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            alertDialog$Builder.f22714a.N = str;
            alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.BotWebViewChangesMayNotBeSaved);
            alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewCloseAnyway), new r1(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
            c2Var.show();
            ((TextView) c2Var.d(-1)).setTextColor(g6.v0(g6.f23295q7, this.A));
            return false;
        }
        k(false);
        return true;
    }

    public final void r() {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        View view;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i10;
        int i11;
        ArrayList arrayList;
        int v02;
        int v03;
        int l1;
        TLRPC.User user = MessagesController.getInstance(this.C).getUser(Long.valueOf(this.D));
        ArrayList<TLRPC.TL_attachMenuBot> arrayList2 = MediaDataController.getInstance(this.C).getAttachMenuBots().bots;
        int size = arrayList2.size();
        int i12 = 0;
        while (true) {
            if (i12 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList2.get(i12);
                i12++;
                tL_attachMenuBot = tL_attachMenuBot2;
                if (tL_attachMenuBot.bot_id == this.D) {
                    break;
                }
            } else {
                tL_attachMenuBot = null;
                break;
            }
        }
        j70 j70Var = this.G0;
        if (j70Var != null) {
            j70Var.u();
        }
        if (this.Z) {
            view = this.f45969i0;
        } else {
            view = this.V;
        }
        j70 G = j70.G(this.f45963e, this.A, view, true);
        this.G0 = G;
        ArrayList arrayList3 = h0.c(getContext(), this.C, this.D).f45824e;
        HashMap hashMap = this.F0;
        hashMap.clear();
        if (!arrayList3.isEmpty()) {
            j70 J = G.J();
            J.c(R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), new it0(G, 25), false);
            J.k();
            int size2 = arrayList3.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj = arrayList3.get(i13);
                i13++;
                g0 g0Var = (g0) obj;
                String str = g0Var.f45805c;
                ef0 ef0Var = new ef0(15);
                c6 c6Var = J.d;
                if (J.f29575e == null) {
                    arrayList = arrayList3;
                } else {
                    org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, J.f29575e, J.d, false, false);
                    arrayList = arrayList3;
                    g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                    g1Var.setText(str);
                    g1Var.setSubtext("");
                    Integer num = J.f29585j0;
                    if (num != null) {
                        v02 = num.intValue();
                    } else {
                        v02 = g6.v0(g6.E8, c6Var);
                    }
                    Integer num2 = J.f29587k0;
                    if (num2 != null) {
                        v03 = num2.intValue();
                    } else {
                        v03 = g6.v0(g6.F8, c6Var);
                    }
                    g1Var.c(v02, v03);
                    Integer num3 = J.f29589l0;
                    if (num3 != null) {
                        l1 = num3.intValue();
                    } else {
                        l1 = g6.l1(0.12f, g6.v0(g6.E8, c6Var));
                    }
                    g1Var.setSelectorColor(l1);
                    g1Var.setOnClickListener(new org.telegram.ui.Components.h0(J, ef0Var));
                    int i14 = J.S;
                    if (i14 > 0) {
                        g1Var.setMinimumWidth(AndroidUtilities.dp(i14));
                        J.r(g1Var, f6.n(J.S, -2));
                    } else {
                        J.r(g1Var, f6.n(-1, -2));
                        hashMap.put(g0Var, J.y());
                        arrayList3 = arrayList;
                    }
                }
                hashMap.put(g0Var, J.y());
                arrayList3 = arrayList;
            }
            B();
            J.S = AndroidUtilities.dp(180.0f);
            G.c(R.drawable.menu_download_round, LocaleController.getString(R.string.BotDownloads), new ih.z2(G, J, 9), false);
            G.k();
        }
        if (this.D0 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        G.l(R.drawable.msg_bot, LocaleController.getString(R.string.BotWebViewOpenBot), new q1(this, 9), z10);
        if (this.D0 == null && this.X) {
            z11 = true;
        } else {
            z11 = false;
        }
        G.l(R.drawable.msg_settings, LocaleController.getString(R.string.BotWebViewSettings), new q1(this, 10), z11);
        G.c(R.drawable.msg_retry, LocaleController.getString(R.string.BotWebViewReloadPage), new q1(this, 11), false);
        if (this.D0 == null && user != null && user.bot_has_main_app) {
            z12 = true;
        } else {
            z12 = false;
        }
        G.l(R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut), new q1(this, 12), z12);
        if (this.D0 == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        G.l(R.drawable.menu_intro, LocaleController.getString(R.string.BotWebViewToS), new q1(this, 13), z13);
        if (this.D0 == null) {
            z14 = true;
        } else {
            z14 = false;
        }
        G.l(R.drawable.msg_report, LocaleController.getString(R.string.BotWebViewReportBot), new q1(this, 14), z14);
        if (this.D0 == null && tL_attachMenuBot != null && (tL_attachMenuBot.show_in_side_menu || tL_attachMenuBot.show_in_attach_menu)) {
            z15 = true;
        } else {
            z15 = false;
        }
        G.l(R.drawable.msg_delete, LocaleController.getString(R.string.BotWebViewDeleteBot), new q1(this, 15), z15);
        if (this.M != g6.w0(null, g6.f23062d6, false)) {
            if (AndroidUtilities.computePerceivedBrightness(this.M) >= 0.721f) {
                i10 = -1;
            } else {
                i10 = -15198183;
            }
            if (AndroidUtilities.computePerceivedBrightness(i10) >= 0.721f) {
                i11 = -16777216;
            } else {
                i11 = -1;
            }
            int l12 = g6.l1(0.85f, i11);
            int l13 = g6.l1(0.1f, i11);
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
        G.f29601t = false;
        G.f29600s = 0;
        G.Z();
    }

    @Override
    public final void release() {
        if (this.I0) {
            return;
        }
        try {
            super.dismiss();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        z(false);
    }

    public final void s(org.telegram.ui.ActionBar.o2 o2Var, y3 y3Var) {
        TLRPC.User user;
        org.telegram.ui.ActionBar.a0 a0Var;
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        org.telegram.ui.ActionBar.a0 a0Var2;
        boolean z10;
        TLRPC.InputPeer inputPeer;
        TLRPC.InputPeer inputPeer2;
        boolean z11;
        TL_bots.botAppSettings botappsettings;
        boolean z12;
        this.f45979r0 = y3Var;
        int i10 = y3Var.f46163a;
        this.C = i10;
        this.E = y3Var.f46164b;
        this.D = y3Var.f46165c;
        this.G = y3Var.h;
        this.H = y3Var.f46169i;
        this.I = y3Var.f46166e;
        TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(this.D));
        CharSequence userName = UserObject.getUserName(user2);
        boolean z13 = false;
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(AndroidUtilities.dp(20.0f));
            userName = Emoji.replaceEmoji(userName, textPaint.getFontMetricsInt(), false);
        } catch (Exception unused) {
        }
        m2 m2Var = this.S;
        m2Var.setTitle(userName);
        TLRPC.UserFull userFull = MessagesController.getInstance(this.C).getUserFull(this.D);
        c6 c6Var = this.A;
        if ((user2 != null && user2.verified) || (userFull != null && (user = userFull.user) != null && user.verified)) {
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.verified_profile).mutate();
            this.E0 = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(g6.v0(g6.Oh, c6Var), PorterDuff.Mode.SRC_IN));
            this.E0.setAlpha(255);
            m2Var.getTitleTextView().setDrawablePadding(AndroidUtilities.dp(2.0f));
            m2Var.getTitleTextView().i(new bg.m1(this, 8));
        }
        BotFullscreenButtons botFullscreenButtons = this.f45969i0;
        if (botFullscreenButtons != null) {
            String userName2 = UserObject.getUserName(user2);
            if (user2 != null && user2.verified) {
                z12 = true;
            } else {
                z12 = false;
            }
            botFullscreenButtons.setName(userName2, z12);
        }
        org.telegram.ui.ActionBar.a0 n10 = m2Var.n();
        n10.removeAllViews();
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(this.C).getAttachMenuBots().bots;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i11);
                i11++;
                tL_attachMenuBot = tL_attachMenuBot2;
                a0Var = n10;
                if (tL_attachMenuBot.bot_id == this.D) {
                    break;
                }
                n10 = a0Var;
            } else {
                a0Var = n10;
                tL_attachMenuBot = null;
                break;
            }
        }
        if (!this.A0) {
            if (userFull != null) {
                TL_bots.BotInfo botInfo = userFull.bot_info;
                if (botInfo != null && (botappsettings = botInfo.app_settings) != null) {
                    g(botappsettings, false);
                }
                z11 = true;
            } else {
                z11 = true;
                MessagesController.getInstance(this.C).loadFullUser(user2, 0, true, new t1(this, 1));
            }
            if (y3Var.f46176p) {
                x(z11, false, this.f45957a0);
            }
        }
        if (this.D0 == null) {
            a0Var2 = a0Var;
            a0Var2.a(R.id.menu_collapse_bot, R.drawable.arrow_more);
        } else {
            a0Var2 = a0Var;
        }
        BotFullscreenButtons.OptionsIcon optionsIcon = new BotFullscreenButtons.OptionsIcon(getContext());
        this.W = optionsIcon;
        org.telegram.ui.ActionBar.w0 d = a0Var2.d(0, optionsIcon);
        this.V = d;
        d.setOnClickListener(new y1(this, 1));
        m2Var.setActionBarMenuOnItemClick(new b2(this));
        JSONObject p10 = p(c6Var, false);
        TLRPC.User user3 = MessagesController.getInstance(this.C).getUser(Long.valueOf(this.D));
        h2 h2Var = this.f45987x;
        h2Var.setBotUser(user3);
        h2Var.q(this.C, this.D);
        TLRPC.User user4 = y3Var.f46173m;
        if (tL_attachMenuBot != null && tL_attachMenuBot.show_in_side_menu && !MediaDataController.getInstance(this.C).isShortcutAdded(this.D, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT)) {
            if (user4 == null) {
                user4 = MessagesController.getInstance(this.C).getUser(Long.valueOf(this.D));
            }
            if (user4 != null && user4.photo != null && !FileLoader.getInstance(this.C).getPathToAttach(user4.photo.photo_small, true).exists()) {
                MediaDataController.getInstance(this.C).preloadImage(ImageLocation.getForUser(this.C, user4, 1), 0);
            }
        }
        if (y3Var.f46177q != null) {
            n();
            return;
        }
        int i12 = y3Var.f46168g;
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
                                ConnectionsManager.getInstance(this.C).sendRequestTyped(tL_messages_requestChatJoinWebView, new Object(), new t4(this, 11), 66);
                                return;
                            }
                            return;
                        }
                        TLRPC.TL_messages_requestMainWebView tL_messages_requestMainWebView = new TLRPC.TL_messages_requestMainWebView();
                        tL_messages_requestMainWebView.bot = MessagesController.getInstance(this.C).getInputUser(y3Var.f46165c);
                        tL_messages_requestMainWebView.platform = "android";
                        if (o2Var instanceof tn) {
                            tn tnVar = (tn) o2Var;
                            if (tnVar.i() != null) {
                                inputPeer2 = MessagesController.getInputPeer(tnVar.i());
                            } else {
                                inputPeer2 = MessagesController.getInputPeer(tnVar.f42787e);
                            }
                        } else {
                            inputPeer2 = MessagesController.getInstance(this.C).getInputPeer(y3Var.f46164b);
                        }
                        tL_messages_requestMainWebView.peer = inputPeer2;
                        tL_messages_requestMainWebView.compact = y3Var.f46175o;
                        tL_messages_requestMainWebView.fullscreen = y3Var.f46176p;
                        if (!TextUtils.isEmpty(y3Var.f46172l)) {
                            tL_messages_requestMainWebView.start_param = y3Var.f46172l;
                            tL_messages_requestMainWebView.flags |= 2;
                        }
                        if (p10 != null) {
                            TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                            tL_messages_requestMainWebView.theme_params = tL_dataJSON2;
                            tL_dataJSON2.data = p10.toString();
                            tL_messages_requestMainWebView.flags |= 1;
                        }
                        ConnectionsManager.getInstance(this.C).sendRequest(tL_messages_requestMainWebView, new a2(this, 5), 66);
                        return;
                    }
                    TLRPC.TL_messages_requestAppWebView tL_messages_requestAppWebView = new TLRPC.TL_messages_requestAppWebView();
                    TLRPC.TL_inputBotAppID tL_inputBotAppID = new TLRPC.TL_inputBotAppID();
                    TLRPC.BotApp botApp = y3Var.f46170j;
                    tL_inputBotAppID.f22450id = botApp.f22389id;
                    tL_inputBotAppID.access_hash = botApp.access_hash;
                    tL_messages_requestAppWebView.app = tL_inputBotAppID;
                    tL_messages_requestAppWebView.write_allowed = y3Var.f46171k;
                    tL_messages_requestAppWebView.platform = "android";
                    if (o2Var instanceof tn) {
                        tn tnVar2 = (tn) o2Var;
                        if (tnVar2.i() != null) {
                            inputPeer = MessagesController.getInputPeer(tnVar2.i());
                        } else {
                            inputPeer = MessagesController.getInputPeer(tnVar2.f42787e);
                        }
                    } else {
                        inputPeer = MessagesController.getInputPeer(y3Var.f46173m);
                    }
                    tL_messages_requestAppWebView.peer = inputPeer;
                    tL_messages_requestAppWebView.compact = y3Var.f46175o;
                    tL_messages_requestAppWebView.fullscreen = y3Var.f46176p;
                    if (!TextUtils.isEmpty(y3Var.f46172l)) {
                        tL_messages_requestAppWebView.start_param = y3Var.f46172l;
                        tL_messages_requestAppWebView.flags |= 2;
                    }
                    if (p10 != null) {
                        TLRPC.TL_dataJSON tL_dataJSON3 = new TLRPC.TL_dataJSON();
                        tL_messages_requestAppWebView.theme_params = tL_dataJSON3;
                        tL_dataJSON3.data = p10.toString();
                        tL_messages_requestAppWebView.flags |= 4;
                    }
                    ConnectionsManager.getInstance(this.C).sendRequest(tL_messages_requestAppWebView, new a2(this, 4), 66);
                    return;
                }
                TLRPC.TL_messages_requestWebView tL_messages_requestWebView = new TLRPC.TL_messages_requestWebView();
                tL_messages_requestWebView.bot = MessagesController.getInstance(this.C).getInputUser(this.D);
                tL_messages_requestWebView.peer = MessagesController.getInstance(this.C).getInputPeer(this.D);
                tL_messages_requestWebView.platform = "android";
                tL_messages_requestWebView.compact = y3Var.f46175o;
                tL_messages_requestWebView.fullscreen = y3Var.f46176p;
                tL_messages_requestWebView.url = y3Var.f46167f;
                tL_messages_requestWebView.flags |= 2;
                if (p10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON4 = new TLRPC.TL_dataJSON();
                    tL_messages_requestWebView.theme_params = tL_dataJSON4;
                    tL_dataJSON4.data = p10.toString();
                    tL_messages_requestWebView.flags |= 4;
                }
                ConnectionsManager.getInstance(this.C).sendRequest(tL_messages_requestWebView, new a2(this, 1));
                NotificationCenter.getInstance(this.C).addObserver(this, NotificationCenter.webViewResultSent);
                return;
            }
            TLRPC.TL_messages_requestSimpleWebView tL_messages_requestSimpleWebView = new TLRPC.TL_messages_requestSimpleWebView();
            if ((y3Var.f46174n & 1) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            tL_messages_requestSimpleWebView.from_switch_webview = z10;
            tL_messages_requestSimpleWebView.bot = MessagesController.getInstance(this.C).getInputUser(this.D);
            tL_messages_requestSimpleWebView.platform = "android";
            if ((y3Var.f46174n & 2) != 0) {
                z13 = true;
            }
            tL_messages_requestSimpleWebView.from_side_menu = z13;
            tL_messages_requestSimpleWebView.compact = y3Var.f46175o;
            tL_messages_requestSimpleWebView.fullscreen = y3Var.f46176p;
            if (p10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON5 = new TLRPC.TL_dataJSON();
                tL_messages_requestSimpleWebView.theme_params = tL_dataJSON5;
                tL_dataJSON5.data = p10.toString();
                tL_messages_requestSimpleWebView.flags |= 1;
            }
            if (!TextUtils.isEmpty(y3Var.f46167f)) {
                tL_messages_requestSimpleWebView.flags |= 8;
                tL_messages_requestSimpleWebView.url = y3Var.f46167f;
            }
            if (!TextUtils.isEmpty(y3Var.f46172l)) {
                tL_messages_requestSimpleWebView.start_param = y3Var.f46172l;
                tL_messages_requestSimpleWebView.flags |= 16;
            }
            ConnectionsManager.getInstance(this.C).sendRequest(tL_messages_requestSimpleWebView, new a2(this, 2));
            return;
        }
        TLRPC.TL_messages_requestWebView tL_messages_requestWebView2 = new TLRPC.TL_messages_requestWebView();
        tL_messages_requestWebView2.peer = MessagesController.getInstance(this.C).getInputPeer(this.E);
        tL_messages_requestWebView2.bot = MessagesController.getInstance(this.C).getInputUser(this.D);
        tL_messages_requestWebView2.platform = "android";
        tL_messages_requestWebView2.compact = y3Var.f46175o;
        tL_messages_requestWebView2.fullscreen = y3Var.f46176p;
        String str = y3Var.f46167f;
        if (str != null) {
            tL_messages_requestWebView2.url = str;
            tL_messages_requestWebView2.flags |= 2;
        }
        if (this.G != 0) {
            TLRPC.InputReplyTo createReplyInput = SendMessagesHelper.getInstance(this.C).createReplyInput(this.G);
            tL_messages_requestWebView2.reply_to = createReplyInput;
            if (this.H != 0) {
                createReplyInput.monoforum_peer_id = MessagesController.getInstance(this.C).getInputPeer(this.H);
                tL_messages_requestWebView2.reply_to.flags |= 32;
            }
            tL_messages_requestWebView2.flags |= 1;
        } else if (this.H != 0) {
            TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
            tL_messages_requestWebView2.reply_to = tL_inputReplyToMonoForum;
            tL_inputReplyToMonoForum.monoforum_peer_id = MessagesController.getInstance(this.C).getInputPeer(this.H);
            tL_messages_requestWebView2.flags |= 1;
        }
        if (p10 != null) {
            TLRPC.TL_dataJSON tL_dataJSON6 = new TLRPC.TL_dataJSON();
            tL_messages_requestWebView2.theme_params = tL_dataJSON6;
            tL_dataJSON6.data = p10.toString();
            tL_messages_requestWebView2.flags |= 4;
        }
        ConnectionsManager.getInstance(this.C).sendRequest(tL_messages_requestWebView2, new a2(this, 3));
        NotificationCenter.getInstance(this.C).addObserver(this, NotificationCenter.webViewResultSent);
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        z(true);
        o2 o2Var = this.f45963e;
        o2Var.setAlpha(0.0f);
        o2Var.addOnLayoutChangeListener(new m.t2(this, 1));
        super.show();
        this.I0 = false;
        S0.add(this);
    }

    public final void t(final int i10, boolean z10, boolean z11) {
        int i11;
        boolean z12;
        final int i12 = this.M;
        g6.b(0.35f, -0.1f, i10);
        final o1 o1Var = new o1();
        int i13 = 0;
        if (this.Q) {
            i11 = this.M;
        } else {
            i11 = 0;
        }
        SparseIntArray sparseIntArray = o1Var.f45928a;
        c6 c6Var = this.A;
        o1Var.c(sparseIntArray, i11, c6Var);
        this.Q = z10;
        if (i0.a.f(i10) < 0.7210000157356262d) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.O = z12;
        if (this.Q) {
            i13 = i10;
        }
        o1Var.c(o1Var.f45929b, i13, c6Var);
        if (z11) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(jr.f29800f);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    int d = i0.a.d(floatValue, i12, i10);
                    p2 p2Var = p2.this;
                    p2Var.M = d;
                    p2Var.h();
                    o2 o2Var = p2Var.f45963e;
                    o2Var.invalidate();
                    m2 m2Var = p2Var.S;
                    m2Var.setBackgroundColor(p2Var.M);
                    o1 o1Var2 = o1Var;
                    o1Var2.b(m2Var, floatValue);
                    p2Var.f45956a = o1Var2.a(g6.Ii);
                    o2Var.invalidate();
                }
            });
            duration.addListener(new f2(this, i12, i10, o1Var));
            duration.start();
        } else {
            this.M = i10;
            h();
            o2 o2Var = this.f45963e;
            o2Var.invalidate();
            int i14 = this.M;
            m2 m2Var = this.S;
            m2Var.setBackgroundColor(i14);
            o1Var.b(m2Var, 1.0f);
            this.f45956a = o1Var.a(g6.Ii);
            o2Var.invalidate();
        }
        E();
    }

    public final void u(boolean z10) {
        if (this.R0 == z10) {
            return;
        }
        this.R0 = z10;
        if (z10) {
            if (this.f45990y0) {
                U0++;
            }
        } else if (this.f45990y0) {
            U0--;
        }
        if (U0 > 0) {
            AndroidUtilities.lockOrientation(l());
        } else {
            AndroidUtilities.unlockOrientation(l());
        }
    }

    public final void v(int i10, boolean z10) {
        Paint paint = this.L;
        int color = paint.getColor();
        boolean z11 = true;
        this.R = true;
        ValueAnimator valueAnimator = this.L0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z10) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            this.L0 = duration;
            duration.setInterpolator(jr.f29800f);
            this.L0.addUpdateListener(new x1(this, color, i10, 0));
            this.L0.addListener(new z3(this, i10, 9));
            this.L0.start();
            return;
        }
        paint.setColor(i10);
        A();
        this.f45963e.invalidate();
        org.telegram.ui.h3 h3Var = this.Q0;
        if (h3Var != null) {
            if (AndroidUtilities.computePerceivedBrightness(paint.getColor()) > 0.721f) {
                z11 = false;
            }
            h3Var.b(z11, false);
            this.Q0.setBackgroundColor(paint.getColor());
        }
        F();
    }

    public final void w(boolean z10) {
        if (this.f45983u0 != z10) {
            this.f45983u0 = z10;
            g2 g2Var = this.v;
            if (g2Var != null) {
                g2Var.setFullSize(m());
            }
        }
    }

    public final void x(boolean z10, boolean z11, boolean z12) {
        boolean z13;
        float f9;
        float f10;
        float f11;
        float f12;
        int currentActionBarHeight;
        float f13;
        Point point;
        Object obj;
        if (this.Z == z10) {
            return;
        }
        this.Z = z10;
        int i10 = 0;
        if (z12 && !MessagesController.getInstance(this.C).disableBotFullscreenBlur && SharedConfig.getDevicePerformanceClass() >= 2) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f45957a0 = z13;
        ValueAnimator valueAnimator = this.N0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        BotFullscreenButtons botFullscreenButtons = this.f45969i0;
        g2 g2Var = this.v;
        if (botFullscreenButtons != null) {
            botFullscreenButtons.setPreview(z10, z11);
            if (this.f45957a0) {
                obj = g2Var.getRenderNode();
            } else {
                obj = null;
            }
            botFullscreenButtons.setParentRenderNode(obj);
        }
        this.f45964e0 = g2Var.getWidth();
        this.f45966f0 = g2Var.getHeight();
        this.M0 = false;
        l2 l2Var = this.f45968h0;
        h2 h2Var = this.f45987x;
        m2 m2Var = this.S;
        if (z11) {
            D();
            G();
            C();
            if (AndroidUtilities.isTablet() && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isSmallTablet()) {
                int i11 = AndroidUtilities.displaySize.x;
                f10 = (i11 - ((int) (Math.min(i11, point.y) * 0.8f))) / 2.0f;
            } else {
                f10 = 0.0f;
            }
            int i12 = this.h.left;
            if (z10) {
                f11 = i12 + f10;
            } else {
                f11 = (-i12) - f10;
            }
            if (!z10) {
                f10 = -f10;
            }
            if (z10) {
                f12 = g2Var.getTranslationY();
            } else {
                f12 = -AndroidUtilities.dp(24.0f);
            }
            if (z10) {
                currentActionBarHeight = -AndroidUtilities.dp(24.0f);
            } else {
                currentActionBarHeight = (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(24.0f);
            }
            float f14 = currentActionBarHeight;
            float currentActionBarHeight2 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            o1.k kVar = g2Var.v;
            if (kVar != null) {
                kVar.c();
            }
            o1.k kVar2 = g2Var.C;
            if (kVar2 != null) {
                kVar2.c();
            }
            g2Var.setSwipeOffsetAnimationDisallowed(true);
            m2Var.setVisibility(0);
            if (z10) {
                g2Var.setTopActionBarOffsetY(-AndroidUtilities.dp(24.0f));
            } else {
                g2Var.setTopActionBarOffsetY(currentActionBarHeight2 - AndroidUtilities.dp(24.0f));
            }
            g2Var.c();
            g2Var.invalidate();
            this.f45961c0 = 0.0f;
            if (z10) {
                f13 = 0.0f;
            } else {
                f13 = 1.0f;
            }
            this.f45959b0 = f13;
            m2Var.setAlpha(1.0f - f13);
            m2Var.setTranslationY((-org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) * this.f45959b0);
            g2Var.setTranslationY(AndroidUtilities.lerp(f12, f14, this.f45961c0));
            g2Var.setTranslationX(AndroidUtilities.lerp(f11, 0.0f, this.f45961c0));
            l2Var.setTranslationX(AndroidUtilities.lerp(f10, 0.0f, this.f45961c0));
            botFullscreenButtons.setAlpha(this.f45959b0);
            this.f45963e.invalidate();
            h2Var.setViewPortHeightOffset(g2Var.getTranslationY() - f14);
            h2Var.n(false, false);
            this.f45962d0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.N0 = ofFloat;
            float f15 = f11;
            ofFloat.addUpdateListener(new d2(this, z10, f12, f14, f15, f10));
            this.N0.addListener(new e2(this, z10, currentActionBarHeight2, f15));
            this.N0.setDuration(280L);
            this.N0.setInterpolator(jr.h);
            this.N0.start();
            return;
        }
        this.f45962d0 = false;
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        this.f45959b0 = f9;
        this.f45961c0 = 0.0f;
        D();
        G();
        if (z10) {
            i10 = 8;
        }
        m2Var.setVisibility(i10);
        m2Var.setAlpha(1.0f - this.f45959b0);
        m2Var.setTranslationY((-org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) * this.f45959b0);
        l2Var.setTranslationX(0.0f);
        botFullscreenButtons.setAlpha(this.f45959b0);
        h2Var.setViewPortHeightOffset(0.0f);
        h2Var.n(true, true);
        C();
    }

    public final void y(int i10, boolean z10) {
        int i11 = this.N;
        l2 l2Var = this.f45968h0;
        Paint paint = l2Var.f46074a;
        l2Var.f46077e.f558b = i10;
        paint.setColor(i10);
        if (!z10) {
            l2Var.d.a(i10, true);
        }
        if (z10) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(jr.f29800f);
            duration.addUpdateListener(new x1(this, i11, i10, 1));
            duration.addListener(new m20(this, i11, i10, 3));
            duration.start();
        } else {
            this.N = i10;
            h();
        }
        AndroidUtilities.setNavigationBarColor((Dialog) this, this.N, false);
    }

    public final void z(boolean z10) {
        float f9;
        ValueAnimator valueAnimator = this.K0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.J0;
        float f11 = 0.0f;
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        if (Math.abs(f10 - f9) < 0.01f) {
            return;
        }
        float f12 = this.J0;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
        this.K0 = ofFloat;
        ofFloat.addListener(new p60(14, this, z10));
        this.K0.addUpdateListener(new p1(this, 0));
        this.K0.setInterpolator(jr.h);
        this.K0.setDuration(220L);
        this.K0.start();
    }

    @Override
    public final void dismiss() {
        k(false);
    }

    @Override
    public final void setLastVisible(boolean z10) {
    }
}
