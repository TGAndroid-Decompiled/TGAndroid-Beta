package org.telegram.ui.web;

import ai.x2;
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
import bi.f6;
import bi.h5;
import c8.cb;
import c8.ma;
import fi.c2;
import hi.s6;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.bl;
import org.telegram.messenger.cz;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.s2;
import org.telegram.messenger.w7;
import org.telegram.messenger.y10;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.k6;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Wallet.u4;
import org.telegram.ui.cr;
import org.telegram.ui.p51;
public final class n1 extends e51 implements gs {
    public c2 f53255e;
    public final y10 f53256f;
    public long h;
    public long f53257n;
    public long f53258r;
    public int f53259s;
    public int f53260w;

    public n1(org.telegram.ui.q qVar) {
        this.f53256f = qVar;
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
    public final void Z(ArrayList arrayList, c51 c51Var) {
        String str;
        ArrayList<TL_account.WebDomainException> arrayList2;
        ArrayList<TL_account.WebDomainException> arrayList3;
        boolean S2 = getMessagesController().S2();
        arrayList.size();
        String N0 = hd.N0(2131752845, null);
        o41 o41Var = new o41(9);
        o41Var.d = 1;
        o41Var.f38092m = N0;
        o41Var.L(S2);
        arrayList.add(o41Var);
        arrayList.add(o41.C(hd.N0(2131752844, null)));
        int i7 = 0;
        if (!S2) {
            getMessagesController().U2();
            o41 i10 = o41.i(17, hd.N0(2131742668, null));
            i10.L(getMessagesController().U2());
            arrayList.add(i10);
            arrayList.add(o41.C(hd.N0(2131742667, null)));
            arrayList.add(o41.u(hd.N0(2131752853, null)));
            arrayList.size();
            c2 c2Var = this.f53255e;
            String N02 = hd.N0(2131752837, null);
            o41 o41Var2 = new o41(3);
            o41Var2.d = 16;
            o41Var2.H = c2Var;
            o41Var2.f38092m = N02;
            o41Var2.f38097r = true;
            arrayList.add(o41Var2);
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
                int i11 = l1.f53231b;
                o41 K = o41.K(l1.class);
                K.f38092m = str2;
                K.f38094o = str3;
                K.C = j3;
                arrayList.add(K);
            }
            arrayList.add(o41.C(hd.N0(2131752854, null)));
            if (!arrayList3.isEmpty()) {
                arrayList.size();
                o41 e10 = o41.e(5, hd.N0(2131752836, null));
                e10.f38098s = true;
                arrayList.add(e10);
                arrayList.add(o41.C(null));
                return;
            }
            return;
        }
        arrayList.size();
        String N03 = hd.N0(2131752850, null);
        long j10 = this.f53257n;
        String str4 = "";
        if (j10 <= 0) {
            str = "";
        } else {
            str = org.telegram.messenger.g0.i0(j10, false, false);
        }
        arrayList.add(o41.d(3, 2131231777, N03, str));
        arrayList.size();
        String N04 = hd.N0(2131752852, null);
        long j11 = this.h;
        if (j11 > 0) {
            str4 = org.telegram.messenger.g0.i0(j11, false, false);
        }
        arrayList.add(o41.d(2, 2131231776, N04, str4));
        arrayList.add(o41.C(hd.N0(2131752848, null)));
        if (this.f53258r > 0) {
            arrayList.size();
            arrayList.add(o41.c(9, 2131231778, hd.N0(2131752838, null)));
            arrayList.size();
            arrayList.add(o41.d(7, 2131231776, hd.N0(2131752843, null), hd.H(',', "BrowserSettingsHistoryPages", (int) this.f53258r)));
            arrayList.add(o41.C(null));
        }
        arrayList.add(o41.u(hd.N0(2131752834, null)));
        arrayList.size();
        c2 c2Var2 = this.f53255e;
        String N05 = hd.N0(2131752837, null);
        o41 o41Var3 = new o41(3);
        o41Var3.d = 15;
        o41Var3.H = c2Var2;
        o41Var3.f38092m = N05;
        o41Var3.f38097r = true;
        arrayList.add(o41Var3);
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
            int i13 = l1.f53231b;
            o41 K2 = o41.K(l1.class);
            K2.f38092m = str5;
            K2.f38094o = str6;
            K2.C = j12;
            arrayList.add(K2);
        }
        arrayList.add(o41.C(hd.N0(2131752835, null)));
        if (!arrayList2.isEmpty()) {
            arrayList.size();
            o41 e11 = o41.e(5, hd.N0(2131752836, null));
            e11.f38098s = true;
            arrayList.add(e11);
            arrayList.add(o41.C(null));
        }
        arrayList.size();
        arrayList.add(o41.d(6, 2131232356, hd.N0(2131745603, null), e1.a().f53126a));
        arrayList.add(o41.C(hd.N0(2131752830, null)));
        boolean z10 = s2.f26730a;
    }

    @Override
    public final CharSequence a0() {
        return hd.N0(2131752829, null);
    }

    @Override
    public final void b0(o41 o41Var, View view) {
        View view2;
        int i7;
        int i10;
        boolean z10;
        int i11;
        int i12 = o41Var.d;
        if (i12 == 12) {
            cz.J();
            ((s8) view).setChecked(cz.f23448v0);
        } else if (i12 == 13) {
            cz.f23451w0 = !cz.f23451w0;
            SharedPreferences.Editor edit = np.g1().edit();
            edit.putBoolean("onlyLocalInstantView", cz.f23451w0);
            edit.apply();
            ((s8) view).setChecked(cz.f23451w0);
        } else if (i12 == 17) {
            boolean z11 = !getMessagesController().U2();
            np messagesController = getMessagesController();
            TL_account.TL_webBrowserSettings tL_webBrowserSettings = messagesController.E8;
            if (tL_webBrowserSettings != null) {
                messagesController.G5(tL_webBrowserSettings.open_external_browser, z11);
            }
            ((s8) view).setChecked(z11);
            this.f34681a.f35790g3.O(true);
        } else {
            ?? r62 = 0;
            if (i12 == 1) {
                np messagesController2 = getMessagesController();
                TL_account.TL_webBrowserSettings tL_webBrowserSettings2 = messagesController2.E8;
                if (tL_webBrowserSettings2 != null) {
                    messagesController2.G5(!tL_webBrowserSettings2.open_external_browser, tL_webBrowserSettings2.display_close_button);
                }
                boolean S2 = getMessagesController().S2();
                s8 s8Var = (s8) view;
                s8Var.setChecked(S2);
                if (S2) {
                    i11 = m6.f29419f6;
                } else {
                    i11 = m6.f29400e6;
                }
                s8Var.b(m6.x0(null, i11, false), S2);
                this.f34681a.f35790g3.O(true);
            } else if (i12 == 10) {
                np messagesController3 = getMessagesController();
                TL_account.TL_webBrowserSettings tL_webBrowserSettings3 = messagesController3.E8;
                if (tL_webBrowserSettings3 != null) {
                    messagesController3.G5(tL_webBrowserSettings3.open_external_browser, true);
                }
                this.f34681a.f35790g3.O(true);
            } else if (i12 == 11) {
                np messagesController4 = getMessagesController();
                TL_account.TL_webBrowserSettings tL_webBrowserSettings4 = messagesController4.E8;
                if (tL_webBrowserSettings4 != null) {
                    messagesController4.G5(tL_webBrowserSettings4.open_external_browser, false);
                }
                this.f34681a.f35790g3.O(true);
            } else {
                String str = "";
                if (i12 == 2) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
                    String N0 = hd.N0(2131752852, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
                    t1Var.S = N0;
                    if (this.h != 0) {
                        str = a8.p0.s(new StringBuilder(" ("), org.telegram.messenger.g0.i0(this.h, false, false), ")");
                    }
                    t1Var.U = hd.a0(null, null, 2131752851, str);
                    alertDialog$Builder.k(hd.N0(2131752089, null), new org.telegram.ui.ActionBar.q1(this) {
                        public final n1 f53225b;

                        {
                            this.f53225b = this;
                        }

                        @Override
                        public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i13) {
                            switch (r2) {
                                case 0:
                                    n1 n1Var = this.f53225b;
                                    org.telegram.messenger.t0.f26931b.deleteDatabase("webview.db");
                                    org.telegram.messenger.t0.f26931b.deleteDatabase("webviewCache.db");
                                    WebStorage.getInstance().deleteAllData();
                                    try {
                                        WebView webView = new WebView(n1Var.getParentActivity());
                                        webView.clearCache(true);
                                        webView.clearHistory();
                                        webView.destroy();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        File file = new File(org.telegram.messenger.t0.f26931b.getApplicationInfo().dataDir, "app_webview");
                                        if (file.exists()) {
                                            n1.d0(file, Boolean.FALSE);
                                        }
                                    } catch (Exception e10) {
                                        a8.g(e10, true);
                                    }
                                    try {
                                        File file2 = new File(org.telegram.messenger.t0.f26931b.getApplicationInfo().dataDir, "cache/WebView");
                                        if (file2.exists()) {
                                            n1.d0(file2, null);
                                        }
                                    } catch (Exception e11) {
                                        a8.g(e11, true);
                                    }
                                    a2 b10 = a2.b();
                                    HashMap hashMap = b10.f53103a;
                                    if (hashMap == null) {
                                        b10.f53105c = false;
                                        b10.f53104b = true;
                                        b10.f53103a = new HashMap();
                                    } else {
                                        hashMap.clear();
                                    }
                                    b10.d();
                                    n1Var.f0();
                                    return;
                                case 1:
                                    n1 n1Var2 = this.f53225b;
                                    CookieManager cookieManager = CookieManager.getInstance();
                                    cookieManager.removeAllCookies(null);
                                    cookieManager.flush();
                                    try {
                                        File file3 = new File(org.telegram.messenger.t0.f26931b.getApplicationInfo().dataDir, "app_webview");
                                        if (file3.exists()) {
                                            n1.d0(file3, Boolean.TRUE);
                                        }
                                    } catch (Exception e12) {
                                        a8.g(e12, true);
                                    }
                                    n1Var2.f0();
                                    return;
                                case 2:
                                    n1 n1Var3 = this.f53225b;
                                    try {
                                        cb.f4548c.clear();
                                        cb.d.clear();
                                        File file4 = new File(w7.z(4), "webhistory.dat");
                                        if (file4.exists()) {
                                            file4.delete();
                                        }
                                    } catch (Exception e13) {
                                        a8.g(e13, true);
                                    }
                                    n1Var3.f53258r = 0L;
                                    n1Var3.f34681a.f35790g3.O(true);
                                    return;
                                default:
                                    n1 n1Var4 = this.f53225b;
                                    np messagesController5 = n1Var4.getMessagesController();
                                    TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.E8;
                                    if (tL_webBrowserSettings5 != null) {
                                        tL_webBrowserSettings5.open_external_browser = true;
                                        tL_webBrowserSettings5.display_close_button = true;
                                        tL_webBrowserSettings5.external_exceptions.clear();
                                        messagesController5.E8.inapp_exceptions.clear();
                                        messagesController5.c5(messagesController5.E8);
                                    }
                                    messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new d3.b(1), new bl(messagesController5, 6));
                                    n1Var4.f34681a.f35790g3.O(true);
                                    return;
                            }
                        }
                    });
                    alertDialog$Builder.h(hd.N0(2131752577, null), null);
                    alertDialog$Builder.d(-1);
                    alertDialog$Builder.p();
                } else if (i12 == 3) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
                    String N02 = hd.N0(2131752850, null);
                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28777a;
                    t1Var2.S = N02;
                    if (this.f53257n != 0) {
                        str = a8.p0.s(new StringBuilder(" ("), org.telegram.messenger.g0.i0(this.f53257n, false, false), ")");
                    }
                    t1Var2.U = hd.a0(null, null, 2131752849, str);
                    alertDialog$Builder2.k(hd.N0(2131752089, null), new org.telegram.ui.ActionBar.q1(this) {
                        public final n1 f53225b;

                        {
                            this.f53225b = this;
                        }

                        @Override
                        public final void h(org.telegram.ui.ActionBar.t1 t1Var22, int i13) {
                            switch (r2) {
                                case 0:
                                    n1 n1Var = this.f53225b;
                                    org.telegram.messenger.t0.f26931b.deleteDatabase("webview.db");
                                    org.telegram.messenger.t0.f26931b.deleteDatabase("webviewCache.db");
                                    WebStorage.getInstance().deleteAllData();
                                    try {
                                        WebView webView = new WebView(n1Var.getParentActivity());
                                        webView.clearCache(true);
                                        webView.clearHistory();
                                        webView.destroy();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        File file = new File(org.telegram.messenger.t0.f26931b.getApplicationInfo().dataDir, "app_webview");
                                        if (file.exists()) {
                                            n1.d0(file, Boolean.FALSE);
                                        }
                                    } catch (Exception e10) {
                                        a8.g(e10, true);
                                    }
                                    try {
                                        File file2 = new File(org.telegram.messenger.t0.f26931b.getApplicationInfo().dataDir, "cache/WebView");
                                        if (file2.exists()) {
                                            n1.d0(file2, null);
                                        }
                                    } catch (Exception e11) {
                                        a8.g(e11, true);
                                    }
                                    a2 b10 = a2.b();
                                    HashMap hashMap = b10.f53103a;
                                    if (hashMap == null) {
                                        b10.f53105c = false;
                                        b10.f53104b = true;
                                        b10.f53103a = new HashMap();
                                    } else {
                                        hashMap.clear();
                                    }
                                    b10.d();
                                    n1Var.f0();
                                    return;
                                case 1:
                                    n1 n1Var2 = this.f53225b;
                                    CookieManager cookieManager = CookieManager.getInstance();
                                    cookieManager.removeAllCookies(null);
                                    cookieManager.flush();
                                    try {
                                        File file3 = new File(org.telegram.messenger.t0.f26931b.getApplicationInfo().dataDir, "app_webview");
                                        if (file3.exists()) {
                                            n1.d0(file3, Boolean.TRUE);
                                        }
                                    } catch (Exception e12) {
                                        a8.g(e12, true);
                                    }
                                    n1Var2.f0();
                                    return;
                                case 2:
                                    n1 n1Var3 = this.f53225b;
                                    try {
                                        cb.f4548c.clear();
                                        cb.d.clear();
                                        File file4 = new File(w7.z(4), "webhistory.dat");
                                        if (file4.exists()) {
                                            file4.delete();
                                        }
                                    } catch (Exception e13) {
                                        a8.g(e13, true);
                                    }
                                    n1Var3.f53258r = 0L;
                                    n1Var3.f34681a.f35790g3.O(true);
                                    return;
                                default:
                                    n1 n1Var4 = this.f53225b;
                                    np messagesController5 = n1Var4.getMessagesController();
                                    TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.E8;
                                    if (tL_webBrowserSettings5 != null) {
                                        tL_webBrowserSettings5.open_external_browser = true;
                                        tL_webBrowserSettings5.display_close_button = true;
                                        tL_webBrowserSettings5.external_exceptions.clear();
                                        messagesController5.E8.inapp_exceptions.clear();
                                        messagesController5.c5(messagesController5.E8);
                                    }
                                    messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new d3.b(1), new bl(messagesController5, 6));
                                    n1Var4.f34681a.f35790g3.O(true);
                                    return;
                            }
                        }
                    });
                    alertDialog$Builder2.h(hd.N0(2131752577, null), null);
                    alertDialog$Builder2.d(-1);
                    alertDialog$Builder2.p();
                } else if (i12 == 7) {
                    ArrayList a10 = cb.a(null);
                    int size = a10.size();
                    long j3 = Long.MAX_VALUE;
                    int i13 = 0;
                    while (i13 < size) {
                        Object obj = a10.get(i13);
                        i13++;
                        j3 = Math.min(j3, ((w0) obj).f53386b);
                    }
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
                    String N03 = hd.N0(2131752843, null);
                    org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder3.f28777a;
                    t1Var3.S = N03;
                    t1Var3.U = hd.a0(null, null, 2131752842, hd.u(j3 / 1000, false));
                    alertDialog$Builder3.k(hd.N0(2131752089, null), new org.telegram.ui.ActionBar.q1(this) {
                        public final n1 f53225b;

                        {
                            this.f53225b = this;
                        }

                        @Override
                        public final void h(org.telegram.ui.ActionBar.t1 t1Var22, int i132) {
                            switch (r2) {
                                case 0:
                                    n1 n1Var = this.f53225b;
                                    org.telegram.messenger.t0.f26931b.deleteDatabase("webview.db");
                                    org.telegram.messenger.t0.f26931b.deleteDatabase("webviewCache.db");
                                    WebStorage.getInstance().deleteAllData();
                                    try {
                                        WebView webView = new WebView(n1Var.getParentActivity());
                                        webView.clearCache(true);
                                        webView.clearHistory();
                                        webView.destroy();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        File file = new File(org.telegram.messenger.t0.f26931b.getApplicationInfo().dataDir, "app_webview");
                                        if (file.exists()) {
                                            n1.d0(file, Boolean.FALSE);
                                        }
                                    } catch (Exception e10) {
                                        a8.g(e10, true);
                                    }
                                    try {
                                        File file2 = new File(org.telegram.messenger.t0.f26931b.getApplicationInfo().dataDir, "cache/WebView");
                                        if (file2.exists()) {
                                            n1.d0(file2, null);
                                        }
                                    } catch (Exception e11) {
                                        a8.g(e11, true);
                                    }
                                    a2 b10 = a2.b();
                                    HashMap hashMap = b10.f53103a;
                                    if (hashMap == null) {
                                        b10.f53105c = false;
                                        b10.f53104b = true;
                                        b10.f53103a = new HashMap();
                                    } else {
                                        hashMap.clear();
                                    }
                                    b10.d();
                                    n1Var.f0();
                                    return;
                                case 1:
                                    n1 n1Var2 = this.f53225b;
                                    CookieManager cookieManager = CookieManager.getInstance();
                                    cookieManager.removeAllCookies(null);
                                    cookieManager.flush();
                                    try {
                                        File file3 = new File(org.telegram.messenger.t0.f26931b.getApplicationInfo().dataDir, "app_webview");
                                        if (file3.exists()) {
                                            n1.d0(file3, Boolean.TRUE);
                                        }
                                    } catch (Exception e12) {
                                        a8.g(e12, true);
                                    }
                                    n1Var2.f0();
                                    return;
                                case 2:
                                    n1 n1Var3 = this.f53225b;
                                    try {
                                        cb.f4548c.clear();
                                        cb.d.clear();
                                        File file4 = new File(w7.z(4), "webhistory.dat");
                                        if (file4.exists()) {
                                            file4.delete();
                                        }
                                    } catch (Exception e13) {
                                        a8.g(e13, true);
                                    }
                                    n1Var3.f53258r = 0L;
                                    n1Var3.f34681a.f35790g3.O(true);
                                    return;
                                default:
                                    n1 n1Var4 = this.f53225b;
                                    np messagesController5 = n1Var4.getMessagesController();
                                    TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.E8;
                                    if (tL_webBrowserSettings5 != null) {
                                        tL_webBrowserSettings5.open_external_browser = true;
                                        tL_webBrowserSettings5.display_close_button = true;
                                        tL_webBrowserSettings5.external_exceptions.clear();
                                        messagesController5.E8.inapp_exceptions.clear();
                                        messagesController5.c5(messagesController5.E8);
                                    }
                                    messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new d3.b(1), new bl(messagesController5, 6));
                                    n1Var4.f34681a.f35790g3.O(true);
                                    return;
                            }
                        }
                    });
                    alertDialog$Builder3.h(hd.N0(2131752577, null), null);
                    alertDialog$Builder3.d(-1);
                    alertDialog$Builder3.p();
                } else if (i12 == 9) {
                    x0[] x0VarArr = {null};
                    g2 x0Var = new x0(null, new p51(17, this, x0VarArr));
                    x0VarArr[0] = x0Var;
                    presentFragment(x0Var);
                } else if (i12 == 5) {
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
                    String N04 = hd.N0(2131742671, null);
                    org.telegram.ui.ActionBar.t1 t1Var4 = alertDialog$Builder4.f28777a;
                    t1Var4.S = N04;
                    t1Var4.U = hd.N0(2131742672, null);
                    alertDialog$Builder4.k(hd.N0(2131751586, null), new org.telegram.ui.ActionBar.q1(this) {
                        public final n1 f53225b;

                        {
                            this.f53225b = this;
                        }

                        @Override
                        public final void h(org.telegram.ui.ActionBar.t1 t1Var22, int i132) {
                            switch (r2) {
                                case 0:
                                    n1 n1Var = this.f53225b;
                                    org.telegram.messenger.t0.f26931b.deleteDatabase("webview.db");
                                    org.telegram.messenger.t0.f26931b.deleteDatabase("webviewCache.db");
                                    WebStorage.getInstance().deleteAllData();
                                    try {
                                        WebView webView = new WebView(n1Var.getParentActivity());
                                        webView.clearCache(true);
                                        webView.clearHistory();
                                        webView.destroy();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        File file = new File(org.telegram.messenger.t0.f26931b.getApplicationInfo().dataDir, "app_webview");
                                        if (file.exists()) {
                                            n1.d0(file, Boolean.FALSE);
                                        }
                                    } catch (Exception e10) {
                                        a8.g(e10, true);
                                    }
                                    try {
                                        File file2 = new File(org.telegram.messenger.t0.f26931b.getApplicationInfo().dataDir, "cache/WebView");
                                        if (file2.exists()) {
                                            n1.d0(file2, null);
                                        }
                                    } catch (Exception e11) {
                                        a8.g(e11, true);
                                    }
                                    a2 b10 = a2.b();
                                    HashMap hashMap = b10.f53103a;
                                    if (hashMap == null) {
                                        b10.f53105c = false;
                                        b10.f53104b = true;
                                        b10.f53103a = new HashMap();
                                    } else {
                                        hashMap.clear();
                                    }
                                    b10.d();
                                    n1Var.f0();
                                    return;
                                case 1:
                                    n1 n1Var2 = this.f53225b;
                                    CookieManager cookieManager = CookieManager.getInstance();
                                    cookieManager.removeAllCookies(null);
                                    cookieManager.flush();
                                    try {
                                        File file3 = new File(org.telegram.messenger.t0.f26931b.getApplicationInfo().dataDir, "app_webview");
                                        if (file3.exists()) {
                                            n1.d0(file3, Boolean.TRUE);
                                        }
                                    } catch (Exception e12) {
                                        a8.g(e12, true);
                                    }
                                    n1Var2.f0();
                                    return;
                                case 2:
                                    n1 n1Var3 = this.f53225b;
                                    try {
                                        cb.f4548c.clear();
                                        cb.d.clear();
                                        File file4 = new File(w7.z(4), "webhistory.dat");
                                        if (file4.exists()) {
                                            file4.delete();
                                        }
                                    } catch (Exception e13) {
                                        a8.g(e13, true);
                                    }
                                    n1Var3.f53258r = 0L;
                                    n1Var3.f34681a.f35790g3.O(true);
                                    return;
                                default:
                                    n1 n1Var4 = this.f53225b;
                                    np messagesController5 = n1Var4.getMessagesController();
                                    TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.E8;
                                    if (tL_webBrowserSettings5 != null) {
                                        tL_webBrowserSettings5.open_external_browser = true;
                                        tL_webBrowserSettings5.display_close_button = true;
                                        tL_webBrowserSettings5.external_exceptions.clear();
                                        messagesController5.E8.inapp_exceptions.clear();
                                        messagesController5.c5(messagesController5.E8);
                                    }
                                    messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new d3.b(1), new bl(messagesController5, 6));
                                    n1Var4.f34681a.f35790g3.O(true);
                                    return;
                            }
                        }
                    });
                    alertDialog$Builder4.h(hd.N0(2131752577, null), null);
                    alertDialog$Builder4.d(-1);
                    alertDialog$Builder4.p();
                } else if (o41Var.H(l1.class)) {
                    m1 m1Var = (m1) view;
                    String str2 = m1Var.f53246e;
                    a70 G = a70.G((ViewGroup) this.fragmentView, null, m1Var);
                    G.f33397s = 40;
                    G.c(2131231786, hd.N0(2131746125, null), new u4(25, this, str2), false);
                    G.a0();
                } else {
                    int i14 = o41Var.d;
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
                                charSequenceArr[i15] = ((e1) b10.get(i15)).f53126a;
                                k6 k6Var = new k6(getParentActivity(), null);
                                k6Var.setPadding(org.telegram.messenger.g0.L(4.0f), r62, org.telegram.messenger.g0.L(4.0f), r62);
                                k6Var.a(m6.x0(null, m6.f29437g7, r62), m6.x0(null, m6.E5, r62));
                                CharSequence charSequence = charSequenceArr[i15];
                                if (i15 == cz.f23431p0) {
                                    z10 = true;
                                } else {
                                    z10 = r62;
                                }
                                k6Var.b(charSequence, z10);
                                int i16 = m6.f29473i6;
                                org.telegram.ui.Cells.y h02 = m6.h0(m6.x0(null, i16, r62), 2, -1);
                                p6 M = t6.M(i16);
                                k6Var.setBackground(h02);
                                t6.j(k6Var, h02, null, M, null);
                                linearLayout.addView(k6Var);
                                k6Var.setOnClickListener(new h5(i15, view, atomicReference));
                                i15++;
                                r62 = 0;
                            }
                            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(getParentActivity());
                            String N05 = hd.N0(2131745603, null);
                            org.telegram.ui.ActionBar.t1 t1Var5 = alertDialog$Builder5.f28777a;
                            t1Var5.S = N05;
                            alertDialog$Builder5.o(linearLayout);
                            alertDialog$Builder5.h(hd.N0(2131752577, null), null);
                            atomicReference.set(t1Var5);
                            showDialog(t1Var5);
                        }
                    } else if (i14 != 15 && i14 != 16) {
                    } else {
                        boolean S22 = getMessagesController().S2();
                        if (getMessagesController().R2(S22)) {
                            c5.r0(this, hd.N0(2131742669, null), hd.N0(2131742670, null), null);
                            return;
                        }
                        Activity parentActivity = getParentActivity();
                        h6 resourceProvider = getResourceProvider();
                        x2 x2Var = new x2(11, this, S22);
                        Pattern pattern = c5.f34013a;
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
                        String N06 = hd.N0(i7, null);
                        org.telegram.ui.ActionBar.t1 t1Var6 = alertDialog$Builder6.f28777a;
                        t1Var6.S = N06;
                        if (S22) {
                            i10 = 2131752858;
                        } else {
                            i10 = 2131752857;
                        }
                        t1Var6.U = hd.N0(i10, null);
                        ?? editTextBoldCursor = new EditTextBoldCursor(parentActivity);
                        editTextBoldCursor.setTextSize(1, 16.0f);
                        int i17 = m6.f29489j5;
                        t6.U(editTextBoldCursor, i17, resourceProvider);
                        t6.D(editTextBoldCursor, m6.Oi, resourceProvider);
                        editTextBoldCursor.setHint(hd.N0(2131752859, null));
                        editTextBoldCursor.setInputType(17);
                        editTextBoldCursor.setImeOptions(6);
                        editTextBoldCursor.setSingleLine(true);
                        editTextBoldCursor.setFocusable(true);
                        editTextBoldCursor.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(13.0f));
                        editTextBoldCursor.setCursorWidth(1.5f);
                        editTextBoldCursor.A(m6.f29621q6, resourceProvider);
                        ShapeDrawable d02 = m6.d0(org.telegram.messenger.g0.L(22.0f), m6.r1(0.06f, m6.w0(i17, resourceProvider)));
                        p6 K = t6.K(0.06f, i17);
                        editTextBoldCursor.setBackground(d02);
                        t6.j(editTextBoldCursor, d02, K, null, resourceProvider);
                        org.telegram.messenger.camera.i iVar = new org.telegram.messenger.camera.i(editTextBoldCursor, x2Var, t1VarArr, view2, 20);
                        editTextBoldCursor.setOnEditorActionListener(new org.telegram.ui.Components.h(iVar, 1));
                        LinearLayout linearLayout2 = new LinearLayout(parentActivity);
                        linearLayout2.setOrientation(1);
                        linearLayout2.addView((View) editTextBoldCursor, ma.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
                        alertDialog$Builder6.c();
                        alertDialog$Builder6.o(linearLayout2);
                        t1Var6.f30010a = Math.min(org.telegram.messenger.g0.L(320.0f), (org.telegram.messenger.g0.f24046q.x * 85) / 100);
                        alertDialog$Builder6.k(hd.N0(2131751342, null), new org.telegram.ui.Components.c0(iVar, 2));
                        alertDialog$Builder6.h(hd.N0(2131752577, null), new cr(10));
                        t1VarArr[0] = t1Var6;
                        t1Var6.f30035k0 = false;
                        t1Var6.setOnDismissListener(new org.telegram.ui.Components.z0(editTextBoldCursor, 1));
                        t1VarArr[0].setOnShowListener(new org.telegram.ui.Components.d1(0, editTextBoldCursor));
                        t1VarArr[0].show();
                    }
                }
            }
        }
    }

    @Override
    public final boolean c0(o41 o41Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        Drawable mutate = context.getResources().getDrawable(2131232561).mutate();
        Drawable g10 = i5.c.g(context, 2131232562);
        int themedColor = getThemedColor(m6.N6);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        g10.setColorFilter(new PorterDuffColorFilter(getThemedColor(m6.f29511k7), mode));
        c2 c2Var = new c2(mutate, g10, 4);
        c2Var.f38340y = org.telegram.messenger.g0.L(2.0f);
        this.f53255e = c2Var;
        this.fragmentView = super.createView(context);
        this.f34681a.r1();
        this.f34681a.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        f6 f6Var;
        if (i7 == ls.U5 && (f6Var = this.f34681a) != null) {
            f6Var.f35790g3.O(true);
        }
    }

    public final void f0() {
        c51 c51Var;
        ArrayList a10 = cb.a(new s6(this, 24));
        if (a10 != null) {
            this.f53258r = a10.size();
            f6 f6Var = this.f34681a;
            if (f6Var != null && (c51Var = f6Var.f35790g3) != null && f6Var.H) {
                c51Var.O(true);
            }
        }
        Utilities.f22810e.c(new z0(this, 2));
    }

    @Override
    public final ek0 getListViewForSimpleGlass() {
        return this.f34681a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        f0();
        getNotificationCenter().c(this, ls.U5);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, ls.U5);
    }

    @Override
    public final void onThemeColorsChanged() {
        boolean z10;
        super.onThemeColorsChanged();
        try {
            c2 c2Var = this.f53255e;
            if (c2Var != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int themedColor = getThemedColor(m6.N6);
                int themedColor2 = getThemedColor(m6.f29511k7);
                if (themedColor == this.f53259s && themedColor2 == this.f53260w) {
                    return;
                }
                this.f53259s = themedColor;
                this.f53260w = themedColor2;
                Drawable drawable = c2Var.f38330a;
                if (drawable != null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                }
                Drawable drawable2 = c2Var.f38331b;
                if (drawable2 != null) {
                    drawable2.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY));
                }
                f6 f6Var = this.f34681a;
                if (f6Var != null) {
                    f6Var.g1();
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
