package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class r3 extends FrameLayout {
    public boolean B;
    public String C;
    public String D;
    public boolean E;
    public float F;
    public d3 G;
    public final n4 H;
    public int f37683a;
    public final m3 f37684b;
    public final l4 f37685c;
    public final f2.i0 d;
    public final o3 e;
    public final p3 f37686f;
    public boolean h;
    public boolean f37687n;
    public h3 f37688r;
    public boolean f37689s;
    public boolean v;
    public int f37690w;
    public int f37691x;
    public org.telegram.ui.web.f2 f37692y;

    public r3(n4 n4Var, Activity activity) {
        super(activity);
        boolean z4;
        this.H = n4Var;
        int i10 = org.telegram.ui.ActionBar.j6.Pk;
        this.f37690w = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        this.f37691x = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        this.B = false;
        this.F = -1.0f;
        new Matrix();
        m3 m3Var = new m3(this, activity);
        this.f37684b = m3Var;
        m3Var.setClipToPadding(false);
        m3Var.setPadding(0, AndroidUtilities.dp(56.0f), 0, 0);
        m3Var.setTopGlowOffset(AndroidUtilities.dp(56.0f));
        ((f2.l) m3Var.getItemAnimator()).C = false;
        if (n4Var.H != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        l4 l4Var = new l4(n4Var, activity, z4);
        this.f37685c = l4Var;
        m3Var.setAdapter(l4Var);
        f2.i0 i0Var = new f2.i0(1, false);
        this.d = i0Var;
        m3Var.setLayoutManager(i0Var);
        m3Var.setOnScrollListener(new n3(this, 0));
        addView(m3Var, k7.b6.c(-1.0f, -1));
        o3 o3Var = new o3(this, getContext());
        this.e = o3Var;
        o3Var.setShouldWaitWebViewScroll(true);
        o3Var.setFullSize(true);
        o3Var.setAllowFullSizeSwipe(true);
        p3 p3Var = new p3(this, getContext(), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
        this.f37686f = p3Var;
        p3Var.setOnCloseRequestedListener(new Runnable(this) {
            public final r3 f35412b;

            {
                this.f35412b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        n4 n4Var2 = this.f35412b.H;
                        LaunchActivity launchActivity = LaunchActivity.D1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.n3 P = launchActivity.P();
                            if (P != null) {
                                boolean z10 = false;
                                int i11 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.n3.H;
                                    if (i11 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i11));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i12 = 0;
                                            while (i12 < size) {
                                                Object obj = arrayList.get(i12);
                                                i12++;
                                                org.telegram.ui.ActionBar.m3 m3Var2 = (org.telegram.ui.ActionBar.m3) obj;
                                                if (m3Var2.J == n4Var2) {
                                                    z10 = P.h(i11, m3Var2, true);
                                                }
                                            }
                                            continue;
                                        }
                                        i11++;
                                    }
                                }
                                if (z10) {
                                    return;
                                }
                            }
                            n4Var2.o(true, true);
                            return;
                        }
                        return;
                    case 1:
                        this.f35412b.f37686f.o(true, false);
                        return;
                    default:
                        r3 r3Var = this.f35412b;
                        o3 o3Var2 = r3Var.e;
                        r3Var.f37686f.o(false, false);
                        h3 h3Var = r3Var.f37688r;
                        if (h3Var != null) {
                            h3Var.f34556a.setTranslationY(((o3Var2.getTopActionBarOffsetY() + (-o3Var2.getOffsetY())) - o3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        r3Var.H.f0();
                        return;
                }
            }
        });
        p3Var.setWebViewProgressListener(new l3(this, 0));
        p3Var.setDelegate(new q3(this));
        p3Var.setWebViewScrollListener(new h(this, 2));
        o3Var.addView(p3Var, k7.b6.c(-1.0f, -1));
        o3Var.setScrollEndListener(new Runnable(this) {
            public final r3 f35412b;

            {
                this.f35412b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        n4 n4Var2 = this.f35412b.H;
                        LaunchActivity launchActivity = LaunchActivity.D1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.n3 P = launchActivity.P();
                            if (P != null) {
                                boolean z10 = false;
                                int i11 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.n3.H;
                                    if (i11 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i11));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i12 = 0;
                                            while (i12 < size) {
                                                Object obj = arrayList.get(i12);
                                                i12++;
                                                org.telegram.ui.ActionBar.m3 m3Var2 = (org.telegram.ui.ActionBar.m3) obj;
                                                if (m3Var2.J == n4Var2) {
                                                    z10 = P.h(i11, m3Var2, true);
                                                }
                                            }
                                            continue;
                                        }
                                        i11++;
                                    }
                                }
                                if (z10) {
                                    return;
                                }
                            }
                            n4Var2.o(true, true);
                            return;
                        }
                        return;
                    case 1:
                        this.f35412b.f37686f.o(true, false);
                        return;
                    default:
                        r3 r3Var = this.f35412b;
                        o3 o3Var2 = r3Var.e;
                        r3Var.f37686f.o(false, false);
                        h3 h3Var = r3Var.f37688r;
                        if (h3Var != null) {
                            h3Var.f34556a.setTranslationY(((o3Var2.getTopActionBarOffsetY() + (-o3Var2.getOffsetY())) - o3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        r3Var.H.f0();
                        return;
                }
            }
        });
        o3Var.setDelegate(new c1(this, 1));
        o3Var.setScrollListener(new Runnable(this) {
            public final r3 f35412b;

            {
                this.f35412b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        n4 n4Var2 = this.f35412b.H;
                        LaunchActivity launchActivity = LaunchActivity.D1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.n3 P = launchActivity.P();
                            if (P != null) {
                                boolean z10 = false;
                                int i11 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.n3.H;
                                    if (i11 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i11));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i12 = 0;
                                            while (i12 < size) {
                                                Object obj = arrayList.get(i12);
                                                i12++;
                                                org.telegram.ui.ActionBar.m3 m3Var2 = (org.telegram.ui.ActionBar.m3) obj;
                                                if (m3Var2.J == n4Var2) {
                                                    z10 = P.h(i11, m3Var2, true);
                                                }
                                            }
                                            continue;
                                        }
                                        i11++;
                                    }
                                }
                                if (z10) {
                                    return;
                                }
                            }
                            n4Var2.o(true, true);
                            return;
                        }
                        return;
                    case 1:
                        this.f35412b.f37686f.o(true, false);
                        return;
                    default:
                        r3 r3Var = this.f35412b;
                        o3 o3Var2 = r3Var.e;
                        r3Var.f37686f.o(false, false);
                        h3 h3Var = r3Var.f37688r;
                        if (h3Var != null) {
                            h3Var.f34556a.setTranslationY(((o3Var2.getTopActionBarOffsetY() + (-o3Var2.getOffsetY())) - o3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        r3Var.H.f0();
                        return;
                }
            }
        });
        o3Var.setTopActionBarOffsetY(AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight);
        addView(o3Var, k7.b6.c(-1.0f, -1));
        b();
        setType(0);
    }

    public static void a(r3 r3Var, boolean z4, int i10) {
        n4 n4Var = r3Var.H;
        a4 a4Var = n4Var.H;
        if (z4) {
            int v = org.telegram.ui.ActionBar.j6.v(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false), i10);
            r3Var.f37690w = v;
            if (r3Var == n4Var.f36375r0[0]) {
                if (SharedConfig.adaptableColorInBrowser) {
                    n4Var.f36363e0.d(v, true);
                }
                if (a4Var != null) {
                    a4Var.i();
                }
            }
        } else {
            int v10 = org.telegram.ui.ActionBar.j6.v(-1, i10);
            r3Var.f37691x = v10;
            if (r3Var == n4Var.f36375r0[0]) {
                if (SharedConfig.adaptableColorInBrowser) {
                    n4Var.f36363e0.setMenuColors(v10);
                }
                if (a4Var != null) {
                    a4Var.i();
                }
            }
        }
        n4Var.f0();
    }

    public final void b() {
        boolean z4;
        this.f37689s = false;
        this.v = false;
        setWeb(null);
        p3 p3Var = this.f37686f;
        p3Var.i();
        p3Var.f39381a = null;
        int i10 = org.telegram.ui.ActionBar.j6.Pk;
        this.f37690w = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        this.f37691x = w02;
        h3 h3Var = this.f37688r;
        if (h3Var != null) {
            if (AndroidUtilities.computePerceivedBrightness(w02) <= 0.721f) {
                z4 = true;
            } else {
                z4 = false;
            }
            h3Var.b(z4, true);
            this.f37688r.setBackgroundColor(this.f37691x);
            h3 h3Var2 = this.f37688r;
            this.f37687n = false;
            AndroidUtilities.updateViewVisibilityAnimated(h3Var2, false, 1.0f, false);
        }
        l4 l4Var = this.f37685c;
        l4Var.B = null;
        l4Var.e.clear();
        l4Var.f35642f.clear();
        l4Var.f35645s.clear();
        l4Var.v.clear();
        l4Var.h.clear();
        l4Var.f35644r.clear();
        l4Var.f35643n.clear();
        l4Var.f35647x.clear();
        l4Var.f35646w.clear();
        l4Var.C = null;
        l4Var.l();
        invalidate();
    }

    public final boolean c() {
        if (this.f37683a == 0) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        l4 l4Var;
        TLRPC.WebPage webPage;
        TL_iv.Page page;
        if (!f() && (l4Var = this.f37685c) != null && (webPage = l4Var.B) != null && (page = webPage.cached_page) != null && page.local != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public final boolean e() {
        org.telegram.ui.web.y0 webView;
        String v;
        if (!f() || (webView = getWebView()) == null || (v = org.telegram.ui.web.c1.v(webView.getUrl())) == null || !org.telegram.ui.web.c1.q(Uri.parse(v))) {
            return false;
        }
        return true;
    }

    public final boolean f() {
        if (this.f37683a == 1) {
            return true;
        }
        return false;
    }

    public final void g() {
        int i10;
        if (c()) {
            a4 a4Var = this.H.H;
            int i11 = 0;
            if (a4Var != null) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (a4Var != null) {
                i11 = AndroidUtilities.dp(32.0f);
            }
            this.d.h1(i10, i11);
        } else if (f()) {
            o3 o3Var = this.e;
            o3Var.setSwipeOffsetY(o3Var.getTopActionBarOffsetY() + (-o3Var.getOffsetY()));
        }
    }

    public int getActionBarColor() {
        if (f() && SharedConfig.adaptableColorInBrowser) {
            return this.f37690w;
        }
        int i10 = org.telegram.ui.ActionBar.j6.Pk;
        this.H.getClass();
        return org.telegram.ui.ActionBar.j6.w0(null, i10, false);
    }

    public l4 getAdapter() {
        return this.f37685c;
    }

    public int getBackgroundColor() {
        if (f() && SharedConfig.adaptableColorInBrowser) {
            if (this.f37687n) {
                return org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false);
            }
            return this.f37691x;
        }
        return org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false);
    }

    public float getListTop() {
        int i10;
        if (c()) {
            m3 m3Var = this.f37684b;
            float height = m3Var.getHeight();
            for (int i11 = 0; i11 < m3Var.getChildCount(); i11++) {
                View childAt = m3Var.getChildAt(i11);
                if (m3Var.getLayoutManager() == null) {
                    i10 = 0;
                } else {
                    m3Var.getLayoutManager().getClass();
                    i10 = RecyclerView.U(childAt).f5777f;
                }
                if (i10 == 2147483646) {
                    height = Math.min(height, childAt.getBottom());
                } else {
                    height = Math.min(height, childAt.getTop());
                }
            }
            return height;
        } else if (f()) {
            return this.e.getTranslationY();
        } else {
            return 0.0f;
        }
    }

    public org.telegram.ui.Components.rl0 getListView() {
        return this.f37684b;
    }

    public float getProgress() {
        org.telegram.ui.web.y0 webView;
        l4 l4Var;
        int i10;
        int B;
        View m9;
        float min;
        a4 a4Var = this.H.H;
        if (c()) {
            float f10 = this.F;
            if (f10 >= 0.0f) {
                return f10;
            }
            f2.i0 i0Var = this.d;
            int L0 = i0Var.L0();
            View m10 = i0Var.m(L0);
            if (m10 != null) {
                int[] iArr = this.f37685c.F;
                m3 m3Var = this.f37684b;
                int i11 = 0;
                if (iArr == null) {
                    int N0 = i0Var.N0();
                    if (a4Var != null) {
                        if (L0 < 1) {
                            L0 = 1;
                        }
                        if (N0 < 1) {
                            N0 = 1;
                        }
                    }
                    int B2 = i0Var.B() - 2;
                    if (N0 >= B2) {
                        m9 = i0Var.m(B2);
                    } else {
                        m9 = i0Var.m(L0);
                    }
                    if (m9 != null) {
                        float width = getWidth() / (B - 1);
                        float measuredHeight = m9.getMeasuredHeight();
                        if (N0 >= B2) {
                            min = (((B2 - L0) * width) * (m3Var.getMeasuredHeight() - m9.getTop())) / measuredHeight;
                        } else {
                            min = (1.0f - ((Math.min(0, m9.getTop() - m3Var.getPaddingTop()) + measuredHeight) / measuredHeight)) * width;
                        }
                        return ((L0 * width) + min) / getWidth();
                    }
                } else {
                    int i12 = L0 - 1;
                    if (i12 >= 0 && i12 < iArr.length) {
                        i10 = iArr[i12];
                    } else {
                        i10 = 0;
                    }
                    if (L0 != 0 || a4Var == null) {
                        i11 = -m10.getTop();
                    }
                    return Utilities.clamp01((i10 + i11) / Math.max(1, l4Var.G - m3Var.getHeight()));
                }
            }
        } else if (f() && (webView = this.f37686f.getWebView()) != null) {
            return webView.getScrollProgress();
        }
        return 0.0f;
    }

    public String getSubtitle() {
        org.telegram.ui.web.y0 webView;
        String uri;
        String[] split;
        o0 o0Var;
        if (!f() || (webView = this.f37686f.getWebView()) == null) {
            return "";
        }
        if (TextUtils.equals(this.C, webView.getUrl())) {
            return this.D;
        }
        try {
            String url = webView.getUrl();
            this.C = url;
            Uri parse = Uri.parse(org.telegram.ui.web.c1.v(url));
            if (parse.getScheme() != null && (parse.getScheme().equalsIgnoreCase("http") || parse.getScheme().equalsIgnoreCase("https"))) {
                uri = parse.getSchemeSpecificPart();
            } else {
                uri = parse.toString();
            }
            try {
                if (!e()) {
                    try {
                        Uri parse2 = Uri.parse(uri);
                        if (parse2.getHost() != null) {
                            parse = parse2;
                        }
                        String a2 = ze.d.a(parse.getHost());
                        if (a2.split("\\.").length > 2 && (o0Var = this.H.f36363e0) != null && ph.f3.g(a2, o0Var.B) > AndroidUtilities.displaySize.x - AndroidUtilities.dp(162.0f)) {
                            a2 = split[split.length - 2] + '.' + split[split.length - 1];
                        }
                        uri = ze.d.v(parse, null, "", a2, null);
                    } catch (Exception e) {
                        FileLog.e((Throwable) e, false);
                    }
                    uri = URLDecoder.decode(uri.replaceAll("\\+", "%2b"), "UTF-8");
                }
            } catch (Exception e6) {
                FileLog.e(e6);
            }
            if (uri.startsWith("//")) {
                uri = uri.substring(2);
            }
            if (uri.startsWith("www.")) {
                uri = uri.substring(4);
            }
            if (uri.endsWith("/")) {
                uri = uri.substring(0, uri.length() - 1);
            }
            int indexOf = uri.indexOf("#");
            if (indexOf >= 0) {
                uri = uri.substring(0, indexOf);
            }
            this.D = uri;
            return uri;
        } catch (Exception unused) {
            return webView.getUrl();
        }
    }

    public String getTitle() {
        org.telegram.ui.web.y0 webView;
        String str;
        String str2;
        if (c()) {
            TLRPC.WebPage webPage = this.f37685c.B;
            if (webPage != null && (str2 = webPage.site_name) != null) {
                return str2;
            }
            if (webPage != null && (str = webPage.title) != null) {
                return str;
            }
        }
        if (f() && (webView = this.f37686f.getWebView()) != null) {
            return webView.getTitle();
        }
        return "";
    }

    public org.telegram.ui.web.c1 getWebContainer() {
        return this.f37686f;
    }

    public org.telegram.ui.web.y0 getWebView() {
        p3 p3Var = this.f37686f;
        if (p3Var != null) {
            return p3Var.getWebView();
        }
        return null;
    }

    @Override
    public final void onAttachedToWindow() {
        h3 h3Var;
        boolean z4;
        super.onAttachedToWindow();
        if (this.f37687n && (h3Var = this.f37688r) != null) {
            int i10 = org.telegram.ui.ActionBar.j6.Pk;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.w0(null, i10, false)) <= 0.721f) {
                z4 = true;
            } else {
                z4 = false;
            }
            h3Var.b(z4, false);
            this.f37688r.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        }
    }

    public void setLastVisible(boolean z4) {
        if (this.E != z4) {
            this.E = z4;
            this.f37686f.setKeyboardFocusable(z4);
        }
    }

    @Override
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        n4 n4Var = this.H;
        n4Var.f0();
        if (n4Var.f36361c0.f20767f) {
            n4Var.f36362d0.invalidate();
        }
        if (n4Var.f36361c0.e) {
            n4Var.f36362d0.invalidate();
            n4Var.X((int) (((AndroidUtilities.dp(56.0f) - n4Var.f36361c0.h) * (f10 / getMeasuredWidth())) + n4Var.f36361c0.h));
        }
        a4 a4Var = n4Var.H;
        if (a4Var != null) {
            a4Var.n();
        }
    }

    public void setType(int i10) {
        int i11;
        if (this.f37683a != i10) {
            b();
        }
        this.f37683a = i10;
        int i12 = 8;
        if (c()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        this.f37684b.setVisibility(i11);
        if (f()) {
            i12 = 0;
        }
        this.e.setVisibility(i12);
    }

    public void setWeb(d3 d3Var) {
        d3 d3Var2 = this.G;
        if (d3Var2 != d3Var) {
            if (d3Var2 != null) {
                d3Var2.c(this);
            }
            this.G = d3Var;
            if (d3Var != null) {
                org.telegram.ui.web.y0 y0Var = d3Var.f20424b;
                p3 p3Var = this.f37686f;
                if (y0Var != null) {
                    y0Var.onResume();
                    p3Var.O(UserConfig.selectedAccount, d3Var.f20424b, d3Var.d, d3Var.f20442x, false);
                    a(this, true, d3Var.f20436q);
                    a(this, false, d3Var.f20437r);
                } else {
                    String str = d3Var.f20442x;
                    if (str != null) {
                        p3Var.u(UserConfig.selectedAccount, str, false);
                    }
                }
            }
            org.telegram.ui.web.f2 f2Var = this.f37692y;
            if (f2Var != null) {
                f2Var.a();
                org.telegram.ui.web.f2 f2Var2 = this.f37692y;
                TLRPC.TL_webPage tL_webPage = f2Var2.f39444j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.h2.o(tL_webPage);
                    f2Var2.f39444j = null;
                }
                this.f37692y = null;
            }
        }
    }
}
