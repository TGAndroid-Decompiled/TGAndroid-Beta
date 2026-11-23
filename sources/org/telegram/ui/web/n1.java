package org.telegram.ui.web;

import ai.o2;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.LinearLayout;
import bi.k5;
import c8.hb;
import c8.na;
import fi.c2;
import hi.c7;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.al;
import org.telegram.messenger.bz;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.s2;
import org.telegram.messenger.w10;
import org.telegram.messenger.w7;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.j6;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.d51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.x60;
import org.telegram.ui.a31;
import org.telegram.ui.cr;
public final class n1 extends d51 implements fs {
    public c2 f53490e;
    public final w10 f53491f;
    public long h;
    public long f53492n;
    public long f53493r;
    public int f53494s;
    public int f53495w;

    public n1(org.telegram.ui.q qVar) {
        this.f53491f = qVar;
    }

    public static boolean d0(File file, Boolean bool) {
        boolean z10;
        if (file == null || !file.exists()) {
            return false;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                z10 = true;
                for (File file2 : listFiles) {
                    if ((bool == null || bool.booleanValue() == file2.getName().startsWith("Cookies")) && !d0(file2, bool)) {
                        z10 = false;
                    }
                }
            } else {
                z10 = true;
            }
            if (z10) {
                file.delete();
            }
        } else if (bool != null && bool.booleanValue() != file.getName().startsWith("Cookies")) {
            return false;
        } else {
            file.delete();
        }
        return true;
    }

    public static long e0(File file, Boolean bool) {
        long j3 = 0;
        if (file == null || !file.exists()) {
            return 0L;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    j3 += e0(file2, bool);
                }
                return j3;
            }
        } else if (bool == null || bool.booleanValue() == file.getName().startsWith("Cookies")) {
            return file.length();
        }
        return 0L;
    }

    @Override
    public final void Z(ArrayList arrayList, b51 b51Var) {
        String str;
        ArrayList<TL_account.WebDomainException> arrayList2;
        ArrayList<TL_account.WebDomainException> arrayList3;
        boolean S2 = getMessagesController().S2();
        arrayList.size();
        String N0 = gd.N0(2131752845, null);
        n41 n41Var = new n41(9);
        n41Var.d = 1;
        n41Var.f37655m = N0;
        n41Var.L(S2);
        arrayList.add(n41Var);
        arrayList.add(n41.C(gd.N0(2131752844, null)));
        int i7 = 0;
        if (!S2) {
            getMessagesController().U2();
            n41 i10 = n41.i(17, gd.N0(2131742663, null));
            i10.L(getMessagesController().U2());
            arrayList.add(i10);
            arrayList.add(n41.C(gd.N0(2131742662, null)));
            arrayList.add(n41.u(gd.N0(2131752853, null)));
            arrayList.size();
            c2 c2Var = this.f53490e;
            String N02 = gd.N0(2131752837, null);
            n41 n41Var2 = new n41(3);
            n41Var2.d = 16;
            n41Var2.H = c2Var;
            n41Var2.f37655m = N02;
            n41Var2.f37660r = true;
            arrayList.add(n41Var2);
            TL_account.TL_webBrowserSettings tL_webBrowserSettings = getMessagesController().E8;
            if (tL_webBrowserSettings == null) {
                arrayList3 = new ArrayList<>();
            } else {
                arrayList3 = tL_webBrowserSettings.inapp_exceptions;
            }
            int size = arrayList3.size();
            while (i7 < size) {
                TL_account.WebDomainException webDomainException = arrayList3.get(i7);
                i7++;
                TL_account.WebDomainException webDomainException2 = webDomainException;
                String str2 = webDomainException2.domain;
                String str3 = webDomainException2.title;
                long j3 = webDomainException2.favicon;
                int i11 = l1.f53466b;
                n41 K = n41.K(l1.class);
                K.f37655m = str2;
                K.f37657o = str3;
                K.C = j3;
                arrayList.add(K);
            }
            arrayList.add(n41.C(gd.N0(2131752854, null)));
            if (!arrayList3.isEmpty()) {
                arrayList.size();
                n41 e10 = n41.e(5, gd.N0(2131752836, null));
                e10.f37661s = true;
                arrayList.add(e10);
                arrayList.add(n41.C(null));
                return;
            }
            return;
        }
        arrayList.size();
        String N03 = gd.N0(2131752850, null);
        long j10 = this.f53492n;
        String str4 = "";
        if (j10 <= 0) {
            str = "";
        } else {
            str = org.telegram.messenger.g0.i0(j10, false, false);
        }
        arrayList.add(n41.d(3, 2131231780, N03, str));
        arrayList.size();
        String N04 = gd.N0(2131752852, null);
        long j11 = this.h;
        if (j11 > 0) {
            str4 = org.telegram.messenger.g0.i0(j11, false, false);
        }
        arrayList.add(n41.d(2, 2131231779, N04, str4));
        arrayList.add(n41.C(gd.N0(2131752848, null)));
        if (this.f53493r > 0) {
            arrayList.size();
            arrayList.add(n41.c(9, 2131231781, gd.N0(2131752838, null)));
            arrayList.size();
            arrayList.add(n41.d(7, 2131231779, gd.N0(2131752843, null), gd.H(',', "BrowserSettingsHistoryPages", (int) this.f53493r)));
            arrayList.add(n41.C(null));
        }
        arrayList.add(n41.u(gd.N0(2131752834, null)));
        arrayList.size();
        c2 c2Var2 = this.f53490e;
        String N05 = gd.N0(2131752837, null);
        n41 n41Var3 = new n41(3);
        n41Var3.d = 15;
        n41Var3.H = c2Var2;
        n41Var3.f37655m = N05;
        n41Var3.f37660r = true;
        arrayList.add(n41Var3);
        TL_account.TL_webBrowserSettings tL_webBrowserSettings2 = getMessagesController().E8;
        if (tL_webBrowserSettings2 == null) {
            arrayList2 = new ArrayList<>();
        } else {
            arrayList2 = tL_webBrowserSettings2.external_exceptions;
        }
        int size2 = arrayList2.size();
        int i12 = 0;
        while (i12 < size2) {
            TL_account.WebDomainException webDomainException3 = arrayList2.get(i12);
            i12++;
            TL_account.WebDomainException webDomainException4 = webDomainException3;
            String str5 = webDomainException4.domain;
            String str6 = webDomainException4.title;
            long j12 = webDomainException4.favicon;
            int i13 = l1.f53466b;
            n41 K2 = n41.K(l1.class);
            K2.f37655m = str5;
            K2.f37657o = str6;
            K2.C = j12;
            arrayList.add(K2);
        }
        arrayList.add(n41.C(gd.N0(2131752835, null)));
        if (!arrayList2.isEmpty()) {
            arrayList.size();
            n41 e11 = n41.e(5, gd.N0(2131752836, null));
            e11.f37661s = true;
            arrayList.add(e11);
            arrayList.add(n41.C(null));
        }
        arrayList.size();
        arrayList.add(n41.d(6, 2131232359, gd.N0(2131745603, null), e1.a().f53361a));
        arrayList.add(n41.C(gd.N0(2131752830, null)));
        boolean z10 = s2.f26829a;
    }

    @Override
    public final CharSequence a0() {
        return gd.N0(2131752829, null);
    }

    @Override
    public final void b0(n41 n41Var, View view) {
        View view2;
        int i7;
        int i10;
        boolean z10;
        int i11;
        int i12 = n41Var.d;
        if (i12 == 12) {
            bz.J();
            ((r8) view).setChecked(bz.f23328v0);
        } else if (i12 == 13) {
            bz.f23331w0 = !bz.f23331w0;
            SharedPreferences.Editor edit = mp.g1().edit();
            edit.putBoolean("onlyLocalInstantView", bz.f23331w0);
            edit.apply();
            ((r8) view).setChecked(bz.f23331w0);
        } else if (i12 == 17) {
            boolean z11 = !getMessagesController().U2();
            mp messagesController = getMessagesController();
            TL_account.TL_webBrowserSettings tL_webBrowserSettings = messagesController.E8;
            if (tL_webBrowserSettings != null) {
                messagesController.G5(tL_webBrowserSettings.open_external_browser, z11);
            }
            ((r8) view).setChecked(z11);
            this.f34213a.f35323g3.O(true);
        } else {
            ?? r62 = 0;
            if (i12 == 1) {
                mp messagesController2 = getMessagesController();
                TL_account.TL_webBrowserSettings tL_webBrowserSettings2 = messagesController2.E8;
                if (tL_webBrowserSettings2 != null) {
                    messagesController2.G5(!tL_webBrowserSettings2.open_external_browser, tL_webBrowserSettings2.display_close_button);
                }
                boolean S2 = getMessagesController().S2();
                r8 r8Var = (r8) view;
                r8Var.setChecked(S2);
                if (S2) {
                    i11 = n6.f29489f6;
                } else {
                    i11 = n6.f29470e6;
                }
                r8Var.b(n6.x0(null, i11, false), S2);
                this.f34213a.f35323g3.O(true);
            } else if (i12 == 10) {
                mp messagesController3 = getMessagesController();
                TL_account.TL_webBrowserSettings tL_webBrowserSettings3 = messagesController3.E8;
                if (tL_webBrowserSettings3 != null) {
                    messagesController3.G5(tL_webBrowserSettings3.open_external_browser, true);
                }
                this.f34213a.f35323g3.O(true);
            } else if (i12 == 11) {
                mp messagesController4 = getMessagesController();
                TL_account.TL_webBrowserSettings tL_webBrowserSettings4 = messagesController4.E8;
                if (tL_webBrowserSettings4 != null) {
                    messagesController4.G5(tL_webBrowserSettings4.open_external_browser, false);
                }
                this.f34213a.f35323g3.O(true);
            } else {
                String str = "";
                if (i12 == 2) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
                    String N0 = gd.N0(2131752852, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                    t1Var.S = N0;
                    if (this.h != 0) {
                        str = a8.p0.s(new StringBuilder(" ("), org.telegram.messenger.g0.i0(this.h, false, false), ")");
                    }
                    t1Var.U = gd.a0(null, null, 2131752851, str);
                    alertDialog$Builder.k(gd.N0(2131752089, null), new org.telegram.ui.ActionBar.q1(this) {
                        public final n1 f53460b;

                        {
                            this.f53460b = this;
                        }

                        @Override
                        public final void i(org.telegram.ui.ActionBar.t1 t1Var2, int i13) {
                            switch (r2) {
                                case 0:
                                    n1 n1Var = this.f53460b;
                                    org.telegram.messenger.t0.f27013b.deleteDatabase("webview.db");
                                    org.telegram.messenger.t0.f27013b.deleteDatabase("webviewCache.db");
                                    WebStorage.getInstance().deleteAllData();
                                    try {
                                        WebView webView = new WebView(n1Var.getParentActivity());
                                        webView.clearCache(true);
                                        webView.clearHistory();
                                        webView.destroy();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        File file = new File(org.telegram.messenger.t0.f27013b.getApplicationInfo().dataDir, "app_webview");
                                        if (file.exists()) {
                                            n1.d0(file, Boolean.FALSE);
                                        }
                                    } catch (Exception e10) {
                                        a8.g(e10, true);
                                    }
                                    try {
                                        File file2 = new File(org.telegram.messenger.t0.f27013b.getApplicationInfo().dataDir, "cache/WebView");
                                        if (file2.exists()) {
                                            n1.d0(file2, null);
                                        }
                                    } catch (Exception e11) {
                                        a8.g(e11, true);
                                    }
                                    b2 b10 = b2.b();
                                    HashMap hashMap = b10.f53343a;
                                    if (hashMap == null) {
                                        b10.f53345c = false;
                                        b10.f53344b = true;
                                        b10.f53343a = new HashMap();
                                    } else {
                                        hashMap.clear();
                                    }
                                    b10.d();
                                    n1Var.f0();
                                    return;
                                case 1:
                                    n1 n1Var2 = this.f53460b;
                                    CookieManager cookieManager = CookieManager.getInstance();
                                    cookieManager.removeAllCookies(null);
                                    cookieManager.flush();
                                    try {
                                        File file3 = new File(org.telegram.messenger.t0.f27013b.getApplicationInfo().dataDir, "app_webview");
                                        if (file3.exists()) {
                                            n1.d0(file3, Boolean.TRUE);
                                        }
                                    } catch (Exception e12) {
                                        a8.g(e12, true);
                                    }
                                    n1Var2.f0();
                                    return;
                                case 2:
                                    n1 n1Var3 = this.f53460b;
                                    try {
                                        hb.f4809c.clear();
                                        hb.d.clear();
                                        File file4 = new File(w7.z(4), "webhistory.dat");
                                        if (file4.exists()) {
                                            file4.delete();
                                        }
                                    } catch (Exception e13) {
                                        a8.g(e13, true);
                                    }
                                    n1Var3.f53493r = 0L;
                                    n1Var3.f34213a.f35323g3.O(true);
                                    return;
                                default:
                                    n1 n1Var4 = this.f53460b;
                                    mp messagesController5 = n1Var4.getMessagesController();
                                    TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.E8;
                                    if (tL_webBrowserSettings5 != null) {
                                        tL_webBrowserSettings5.open_external_browser = true;
                                        tL_webBrowserSettings5.display_close_button = true;
                                        tL_webBrowserSettings5.external_exceptions.clear();
                                        messagesController5.E8.inapp_exceptions.clear();
                                        messagesController5.c5(messagesController5.E8);
                                    }
                                    messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new d3.b(1), new al(messagesController5, 6));
                                    n1Var4.f34213a.f35323g3.O(true);
                                    return;
                            }
                        }
                    });
                    alertDialog$Builder.h(gd.N0(2131752577, null), null);
                    alertDialog$Builder.d(-1);
                    alertDialog$Builder.p();
                } else if (i12 == 3) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
                    String N02 = gd.N0(2131752850, null);
                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28835a;
                    t1Var2.S = N02;
                    if (this.f53492n != 0) {
                        str = a8.p0.s(new StringBuilder(" ("), org.telegram.messenger.g0.i0(this.f53492n, false, false), ")");
                    }
                    t1Var2.U = gd.a0(null, null, 2131752849, str);
                    alertDialog$Builder2.k(gd.N0(2131752089, null), new org.telegram.ui.ActionBar.q1(this) {
                        public final n1 f53460b;

                        {
                            this.f53460b = this;
                        }

                        @Override
                        public final void i(org.telegram.ui.ActionBar.t1 t1Var22, int i13) {
                            switch (r2) {
                                case 0:
                                    n1 n1Var = this.f53460b;
                                    org.telegram.messenger.t0.f27013b.deleteDatabase("webview.db");
                                    org.telegram.messenger.t0.f27013b.deleteDatabase("webviewCache.db");
                                    WebStorage.getInstance().deleteAllData();
                                    try {
                                        WebView webView = new WebView(n1Var.getParentActivity());
                                        webView.clearCache(true);
                                        webView.clearHistory();
                                        webView.destroy();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        File file = new File(org.telegram.messenger.t0.f27013b.getApplicationInfo().dataDir, "app_webview");
                                        if (file.exists()) {
                                            n1.d0(file, Boolean.FALSE);
                                        }
                                    } catch (Exception e10) {
                                        a8.g(e10, true);
                                    }
                                    try {
                                        File file2 = new File(org.telegram.messenger.t0.f27013b.getApplicationInfo().dataDir, "cache/WebView");
                                        if (file2.exists()) {
                                            n1.d0(file2, null);
                                        }
                                    } catch (Exception e11) {
                                        a8.g(e11, true);
                                    }
                                    b2 b10 = b2.b();
                                    HashMap hashMap = b10.f53343a;
                                    if (hashMap == null) {
                                        b10.f53345c = false;
                                        b10.f53344b = true;
                                        b10.f53343a = new HashMap();
                                    } else {
                                        hashMap.clear();
                                    }
                                    b10.d();
                                    n1Var.f0();
                                    return;
                                case 1:
                                    n1 n1Var2 = this.f53460b;
                                    CookieManager cookieManager = CookieManager.getInstance();
                                    cookieManager.removeAllCookies(null);
                                    cookieManager.flush();
                                    try {
                                        File file3 = new File(org.telegram.messenger.t0.f27013b.getApplicationInfo().dataDir, "app_webview");
                                        if (file3.exists()) {
                                            n1.d0(file3, Boolean.TRUE);
                                        }
                                    } catch (Exception e12) {
                                        a8.g(e12, true);
                                    }
                                    n1Var2.f0();
                                    return;
                                case 2:
                                    n1 n1Var3 = this.f53460b;
                                    try {
                                        hb.f4809c.clear();
                                        hb.d.clear();
                                        File file4 = new File(w7.z(4), "webhistory.dat");
                                        if (file4.exists()) {
                                            file4.delete();
                                        }
                                    } catch (Exception e13) {
                                        a8.g(e13, true);
                                    }
                                    n1Var3.f53493r = 0L;
                                    n1Var3.f34213a.f35323g3.O(true);
                                    return;
                                default:
                                    n1 n1Var4 = this.f53460b;
                                    mp messagesController5 = n1Var4.getMessagesController();
                                    TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.E8;
                                    if (tL_webBrowserSettings5 != null) {
                                        tL_webBrowserSettings5.open_external_browser = true;
                                        tL_webBrowserSettings5.display_close_button = true;
                                        tL_webBrowserSettings5.external_exceptions.clear();
                                        messagesController5.E8.inapp_exceptions.clear();
                                        messagesController5.c5(messagesController5.E8);
                                    }
                                    messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new d3.b(1), new al(messagesController5, 6));
                                    n1Var4.f34213a.f35323g3.O(true);
                                    return;
                            }
                        }
                    });
                    alertDialog$Builder2.h(gd.N0(2131752577, null), null);
                    alertDialog$Builder2.d(-1);
                    alertDialog$Builder2.p();
                } else if (i12 == 7) {
                    ArrayList a10 = hb.a(null);
                    int size = a10.size();
                    long j3 = Long.MAX_VALUE;
                    int i13 = 0;
                    while (i13 < size) {
                        Object obj = a10.get(i13);
                        i13++;
                        j3 = Math.min(j3, ((w0) obj).f53619b);
                    }
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
                    String N03 = gd.N0(2131752843, null);
                    org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder3.f28835a;
                    t1Var3.S = N03;
                    t1Var3.U = gd.a0(null, null, 2131752842, gd.u(j3 / 1000, false));
                    alertDialog$Builder3.k(gd.N0(2131752089, null), new org.telegram.ui.ActionBar.q1(this) {
                        public final n1 f53460b;

                        {
                            this.f53460b = this;
                        }

                        @Override
                        public final void i(org.telegram.ui.ActionBar.t1 t1Var22, int i132) {
                            switch (r2) {
                                case 0:
                                    n1 n1Var = this.f53460b;
                                    org.telegram.messenger.t0.f27013b.deleteDatabase("webview.db");
                                    org.telegram.messenger.t0.f27013b.deleteDatabase("webviewCache.db");
                                    WebStorage.getInstance().deleteAllData();
                                    try {
                                        WebView webView = new WebView(n1Var.getParentActivity());
                                        webView.clearCache(true);
                                        webView.clearHistory();
                                        webView.destroy();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        File file = new File(org.telegram.messenger.t0.f27013b.getApplicationInfo().dataDir, "app_webview");
                                        if (file.exists()) {
                                            n1.d0(file, Boolean.FALSE);
                                        }
                                    } catch (Exception e10) {
                                        a8.g(e10, true);
                                    }
                                    try {
                                        File file2 = new File(org.telegram.messenger.t0.f27013b.getApplicationInfo().dataDir, "cache/WebView");
                                        if (file2.exists()) {
                                            n1.d0(file2, null);
                                        }
                                    } catch (Exception e11) {
                                        a8.g(e11, true);
                                    }
                                    b2 b10 = b2.b();
                                    HashMap hashMap = b10.f53343a;
                                    if (hashMap == null) {
                                        b10.f53345c = false;
                                        b10.f53344b = true;
                                        b10.f53343a = new HashMap();
                                    } else {
                                        hashMap.clear();
                                    }
                                    b10.d();
                                    n1Var.f0();
                                    return;
                                case 1:
                                    n1 n1Var2 = this.f53460b;
                                    CookieManager cookieManager = CookieManager.getInstance();
                                    cookieManager.removeAllCookies(null);
                                    cookieManager.flush();
                                    try {
                                        File file3 = new File(org.telegram.messenger.t0.f27013b.getApplicationInfo().dataDir, "app_webview");
                                        if (file3.exists()) {
                                            n1.d0(file3, Boolean.TRUE);
                                        }
                                    } catch (Exception e12) {
                                        a8.g(e12, true);
                                    }
                                    n1Var2.f0();
                                    return;
                                case 2:
                                    n1 n1Var3 = this.f53460b;
                                    try {
                                        hb.f4809c.clear();
                                        hb.d.clear();
                                        File file4 = new File(w7.z(4), "webhistory.dat");
                                        if (file4.exists()) {
                                            file4.delete();
                                        }
                                    } catch (Exception e13) {
                                        a8.g(e13, true);
                                    }
                                    n1Var3.f53493r = 0L;
                                    n1Var3.f34213a.f35323g3.O(true);
                                    return;
                                default:
                                    n1 n1Var4 = this.f53460b;
                                    mp messagesController5 = n1Var4.getMessagesController();
                                    TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.E8;
                                    if (tL_webBrowserSettings5 != null) {
                                        tL_webBrowserSettings5.open_external_browser = true;
                                        tL_webBrowserSettings5.display_close_button = true;
                                        tL_webBrowserSettings5.external_exceptions.clear();
                                        messagesController5.E8.inapp_exceptions.clear();
                                        messagesController5.c5(messagesController5.E8);
                                    }
                                    messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new d3.b(1), new al(messagesController5, 6));
                                    n1Var4.f34213a.f35323g3.O(true);
                                    return;
                            }
                        }
                    });
                    alertDialog$Builder3.h(gd.N0(2131752577, null), null);
                    alertDialog$Builder3.d(-1);
                    alertDialog$Builder3.p();
                } else if (i12 == 9) {
                    x0[] x0VarArr = {null};
                    g2 x0Var = new x0(null, new a31(18, this, x0VarArr));
                    x0VarArr[0] = x0Var;
                    presentFragment(x0Var);
                } else if (i12 == 5) {
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
                    String N04 = gd.N0(2131742666, null);
                    org.telegram.ui.ActionBar.t1 t1Var4 = alertDialog$Builder4.f28835a;
                    t1Var4.S = N04;
                    t1Var4.U = gd.N0(2131742667, null);
                    alertDialog$Builder4.k(gd.N0(2131751586, null), new org.telegram.ui.ActionBar.q1(this) {
                        public final n1 f53460b;

                        {
                            this.f53460b = this;
                        }

                        @Override
                        public final void i(org.telegram.ui.ActionBar.t1 t1Var22, int i132) {
                            switch (r2) {
                                case 0:
                                    n1 n1Var = this.f53460b;
                                    org.telegram.messenger.t0.f27013b.deleteDatabase("webview.db");
                                    org.telegram.messenger.t0.f27013b.deleteDatabase("webviewCache.db");
                                    WebStorage.getInstance().deleteAllData();
                                    try {
                                        WebView webView = new WebView(n1Var.getParentActivity());
                                        webView.clearCache(true);
                                        webView.clearHistory();
                                        webView.destroy();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        File file = new File(org.telegram.messenger.t0.f27013b.getApplicationInfo().dataDir, "app_webview");
                                        if (file.exists()) {
                                            n1.d0(file, Boolean.FALSE);
                                        }
                                    } catch (Exception e10) {
                                        a8.g(e10, true);
                                    }
                                    try {
                                        File file2 = new File(org.telegram.messenger.t0.f27013b.getApplicationInfo().dataDir, "cache/WebView");
                                        if (file2.exists()) {
                                            n1.d0(file2, null);
                                        }
                                    } catch (Exception e11) {
                                        a8.g(e11, true);
                                    }
                                    b2 b10 = b2.b();
                                    HashMap hashMap = b10.f53343a;
                                    if (hashMap == null) {
                                        b10.f53345c = false;
                                        b10.f53344b = true;
                                        b10.f53343a = new HashMap();
                                    } else {
                                        hashMap.clear();
                                    }
                                    b10.d();
                                    n1Var.f0();
                                    return;
                                case 1:
                                    n1 n1Var2 = this.f53460b;
                                    CookieManager cookieManager = CookieManager.getInstance();
                                    cookieManager.removeAllCookies(null);
                                    cookieManager.flush();
                                    try {
                                        File file3 = new File(org.telegram.messenger.t0.f27013b.getApplicationInfo().dataDir, "app_webview");
                                        if (file3.exists()) {
                                            n1.d0(file3, Boolean.TRUE);
                                        }
                                    } catch (Exception e12) {
                                        a8.g(e12, true);
                                    }
                                    n1Var2.f0();
                                    return;
                                case 2:
                                    n1 n1Var3 = this.f53460b;
                                    try {
                                        hb.f4809c.clear();
                                        hb.d.clear();
                                        File file4 = new File(w7.z(4), "webhistory.dat");
                                        if (file4.exists()) {
                                            file4.delete();
                                        }
                                    } catch (Exception e13) {
                                        a8.g(e13, true);
                                    }
                                    n1Var3.f53493r = 0L;
                                    n1Var3.f34213a.f35323g3.O(true);
                                    return;
                                default:
                                    n1 n1Var4 = this.f53460b;
                                    mp messagesController5 = n1Var4.getMessagesController();
                                    TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.E8;
                                    if (tL_webBrowserSettings5 != null) {
                                        tL_webBrowserSettings5.open_external_browser = true;
                                        tL_webBrowserSettings5.display_close_button = true;
                                        tL_webBrowserSettings5.external_exceptions.clear();
                                        messagesController5.E8.inapp_exceptions.clear();
                                        messagesController5.c5(messagesController5.E8);
                                    }
                                    messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new d3.b(1), new al(messagesController5, 6));
                                    n1Var4.f34213a.f35323g3.O(true);
                                    return;
                            }
                        }
                    });
                    alertDialog$Builder4.h(gd.N0(2131752577, null), null);
                    alertDialog$Builder4.d(-1);
                    alertDialog$Builder4.p();
                } else if (n41Var.H(l1.class)) {
                    m1 m1Var = (m1) view;
                    String str2 = m1Var.f53481e;
                    x60 G = x60.G((ViewGroup) this.fragmentView, null, m1Var);
                    G.f41892s = 40;
                    G.c(2131231789, gd.N0(2131746125, null), new org.telegram.ui.Wallet.r(29, this, str2), false);
                    G.a0();
                } else {
                    int i14 = n41Var.d;
                    if (i14 == 6) {
                        if (getParentActivity() != null) {
                            AtomicReference atomicReference = new AtomicReference();
                            LinearLayout linearLayout = new LinearLayout(getParentActivity());
                            linearLayout.setOrientation(1);
                            ArrayList b10 = e1.b();
                            int size2 = b10.size();
                            CharSequence[] charSequenceArr = new CharSequence[size2];
                            int i15 = 0;
                            while (i15 < size2) {
                                charSequenceArr[i15] = ((e1) b10.get(i15)).f53361a;
                                j6 j6Var = new j6(getParentActivity(), null);
                                j6Var.setPadding(org.telegram.messenger.g0.L(4.0f), r62, org.telegram.messenger.g0.L(4.0f), r62);
                                j6Var.a(n6.x0(null, n6.f29507g7, r62), n6.x0(null, n6.E5, r62));
                                CharSequence charSequence = charSequenceArr[i15];
                                if (i15 == bz.f23311p0) {
                                    z10 = true;
                                } else {
                                    z10 = r62;
                                }
                                j6Var.b(charSequence, z10);
                                int i16 = n6.f29543i6;
                                org.telegram.ui.Cells.y h02 = n6.h0(n6.x0(null, i16, r62), 2, -1);
                                q6 M = u6.M(i16);
                                j6Var.setBackground(h02);
                                u6.j(j6Var, h02, null, M, null);
                                linearLayout.addView(j6Var);
                                j6Var.setOnClickListener(new k5(i15, view, atomicReference));
                                i15++;
                                r62 = 0;
                            }
                            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(getParentActivity());
                            String N05 = gd.N0(2131745603, null);
                            org.telegram.ui.ActionBar.t1 t1Var5 = alertDialog$Builder5.f28835a;
                            t1Var5.S = N05;
                            alertDialog$Builder5.o(linearLayout);
                            alertDialog$Builder5.h(gd.N0(2131752577, null), null);
                            atomicReference.set(t1Var5);
                            showDialog(t1Var5);
                        }
                    } else if (i14 != 15 && i14 != 16) {
                    } else {
                        boolean S22 = getMessagesController().S2();
                        if (getMessagesController().R2(S22)) {
                            b5.r0(this, gd.N0(2131742664, null), gd.N0(2131742665, null), null);
                            return;
                        }
                        Activity parentActivity = getParentActivity();
                        i6 resourceProvider = getResourceProvider();
                        o2 o2Var = new o2(11, this, S22);
                        Pattern pattern = b5.f33627a;
                        Activity W = org.telegram.messenger.g0.W(parentActivity);
                        if (W != null) {
                            view2 = W.getCurrentFocus();
                        } else {
                            view2 = null;
                        }
                        org.telegram.ui.ActionBar.t1[] t1VarArr = new org.telegram.ui.ActionBar.t1[1];
                        AlertDialog$Builder alertDialog$Builder6 = new AlertDialog$Builder(0, parentActivity, resourceProvider);
                        if (S22) {
                            i7 = 2131752856;
                        } else {
                            i7 = 2131752855;
                        }
                        String N06 = gd.N0(i7, null);
                        org.telegram.ui.ActionBar.t1 t1Var6 = alertDialog$Builder6.f28835a;
                        t1Var6.S = N06;
                        if (S22) {
                            i10 = 2131752858;
                        } else {
                            i10 = 2131752857;
                        }
                        t1Var6.U = gd.N0(i10, null);
                        ?? editTextBoldCursor = new EditTextBoldCursor(parentActivity);
                        editTextBoldCursor.setTextSize(1, 16.0f);
                        int i17 = n6.f29559j5;
                        u6.U(editTextBoldCursor, i17, resourceProvider);
                        u6.D(editTextBoldCursor, n6.Oi, resourceProvider);
                        editTextBoldCursor.setHint(gd.N0(2131752859, null));
                        editTextBoldCursor.setInputType(17);
                        editTextBoldCursor.setImeOptions(6);
                        editTextBoldCursor.setSingleLine(true);
                        editTextBoldCursor.setFocusable(true);
                        editTextBoldCursor.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(13.0f));
                        editTextBoldCursor.setCursorWidth(1.5f);
                        editTextBoldCursor.A(n6.f29691q6, resourceProvider);
                        ShapeDrawable d02 = n6.d0(org.telegram.messenger.g0.L(22.0f), n6.r1(0.06f, n6.w0(i17, resourceProvider)));
                        q6 K = u6.K(0.06f, i17);
                        editTextBoldCursor.setBackground(d02);
                        u6.j(editTextBoldCursor, d02, K, null, resourceProvider);
                        oi.h hVar = new oi.h(editTextBoldCursor, o2Var, t1VarArr, view2, 21);
                        editTextBoldCursor.setOnEditorActionListener(new org.telegram.ui.Components.g(hVar, 1));
                        LinearLayout linearLayout2 = new LinearLayout(parentActivity);
                        linearLayout2.setOrientation(1);
                        linearLayout2.addView((View) editTextBoldCursor, na.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
                        alertDialog$Builder6.c();
                        alertDialog$Builder6.o(linearLayout2);
                        t1Var6.f30068a = Math.min(org.telegram.messenger.g0.L(320.0f), (org.telegram.messenger.g0.f24226q.x * 85) / 100);
                        alertDialog$Builder6.k(gd.N0(2131751342, null), new org.telegram.ui.Components.b0(hVar, 2));
                        alertDialog$Builder6.h(gd.N0(2131752577, null), new cr(10));
                        t1VarArr[0] = t1Var6;
                        t1Var6.f30093k0 = false;
                        t1Var6.setOnDismissListener(new org.telegram.ui.Components.y0(editTextBoldCursor, 1));
                        t1VarArr[0].setOnShowListener(new org.telegram.ui.Components.c1(0, editTextBoldCursor));
                        t1VarArr[0].show();
                    }
                }
            }
        }
    }

    @Override
    public final boolean c0(n41 n41Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        Drawable mutate = context.getResources().getDrawable(2131232564).mutate();
        Drawable g10 = i5.c.g(context, 2131232565);
        int themedColor = getThemedColor(n6.N6);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        g10.setColorFilter(new PorterDuffColorFilter(getThemedColor(n6.f29581k7), mode));
        c2 c2Var = new c2(mutate, g10, 4);
        c2Var.f37205y = org.telegram.messenger.g0.L(2.0f);
        this.f53490e = c2Var;
        this.fragmentView = super.createView(context);
        this.f34213a.r1();
        this.f34213a.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        bi.i6 i6Var;
        if (i7 == ks.U5 && (i6Var = this.f34213a) != null) {
            i6Var.f35323g3.O(true);
        }
    }

    public final void f0() {
        b51 b51Var;
        ArrayList a10 = hb.a(new c7(this, 24));
        if (a10 != null) {
            this.f53493r = a10.size();
            bi.i6 i6Var = this.f34213a;
            if (i6Var != null && (b51Var = i6Var.f35323g3) != null && i6Var.H) {
                b51Var.O(true);
            }
        }
        Utilities.f22877e.c(new z0(this, 2));
    }

    @Override
    public final ek0 getListViewForSimpleGlass() {
        return this.f34213a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        f0();
        getNotificationCenter().c(this, ks.U5);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, ks.U5);
    }

    @Override
    public final void onThemeColorsChanged() {
        boolean z10;
        super.onThemeColorsChanged();
        try {
            c2 c2Var = this.f53490e;
            if (c2Var != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int themedColor = getThemedColor(n6.N6);
                int themedColor2 = getThemedColor(n6.f29581k7);
                if (themedColor == this.f53494s && themedColor2 == this.f53495w) {
                    return;
                }
                this.f53494s = themedColor;
                this.f53495w = themedColor2;
                Drawable drawable = c2Var.f37195a;
                if (drawable != null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                }
                Drawable drawable2 = c2Var.f37196b;
                if (drawable2 != null) {
                    drawable2.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY));
                }
                bi.i6 i6Var = this.f34213a;
                if (i6Var != null) {
                    i6Var.g1();
                }
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
