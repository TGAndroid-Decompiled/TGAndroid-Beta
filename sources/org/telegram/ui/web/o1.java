package org.telegram.ui.web;

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
import bi.b9;
import bi.la;
import c8.ha;
import c8.xa;
import di.i2;
import fi.w3;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.c20;
import org.telegram.messenger.fl;
import org.telegram.messenger.id;
import org.telegram.messenger.iz;
import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.r2;
import org.telegram.messenger.w7;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.o5;
import org.telegram.ui.ActionBar.o6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Cells.j6;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.v4;
import org.telegram.ui.Components.y31;
import org.telegram.ui.br;
import org.telegram.ui.m6;
public final class o1 extends o41 implements ls {
    public i2 f51241e;
    public final c20 f51242f;
    public long h;
    public long f51243n;
    public long f51244r;
    public int f51245s;
    public int f51246w;

    public o1(org.telegram.ui.q qVar) {
        this.f51242f = qVar;
    }

    public static boolean d0(File file, Boolean bool) {
        boolean z9;
        if (file == null || !file.exists()) {
            return false;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                z9 = true;
                for (File file2 : listFiles) {
                    if ((bool == null || bool.booleanValue() == file2.getName().startsWith("Cookies")) && !d0(file2, bool)) {
                        z9 = false;
                    }
                }
            } else {
                z9 = true;
            }
            if (z9) {
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
    public final void Z(ArrayList arrayList, m41 m41Var) {
        String str;
        ArrayList<TL_account.WebDomainException> arrayList2;
        ArrayList<TL_account.WebDomainException> arrayList3;
        boolean M2 = getMessagesController().M2();
        arrayList.size();
        String M0 = id.M0(2131752857, null);
        y31 y31Var = new y31(9);
        y31Var.d = 1;
        y31Var.f40568l = M0;
        y31Var.L(M2);
        arrayList.add(y31Var);
        arrayList.add(y31.C(id.M0(2131752856, null)));
        int i7 = 0;
        if (!M2) {
            getMessagesController().O2();
            y31 i10 = y31.i(17, id.M0(2131742934, null));
            i10.L(getMessagesController().O2());
            arrayList.add(i10);
            arrayList.add(y31.C(id.M0(2131742933, null)));
            arrayList.add(y31.u(id.M0(2131752865, null)));
            arrayList.size();
            i2 i2Var = this.f51241e;
            String M02 = id.M0(2131752849, null);
            y31 y31Var2 = new y31(3);
            y31Var2.d = 16;
            y31Var2.G = i2Var;
            y31Var2.f40568l = M02;
            y31Var2.f40573q = true;
            arrayList.add(y31Var2);
            TL_account.TL_webBrowserSettings tL_webBrowserSettings = getMessagesController().f24953y8;
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
                int i11 = m1.f51223b;
                y31 K = y31.K(m1.class);
                K.f40568l = str2;
                K.f40570n = str3;
                K.B = j3;
                arrayList.add(K);
            }
            arrayList.add(y31.C(id.M0(2131752866, null)));
            if (!arrayList3.isEmpty()) {
                arrayList.size();
                y31 e10 = y31.e(5, id.M0(2131752848, null));
                e10.f40574r = true;
                arrayList.add(e10);
                arrayList.add(y31.C(null));
                return;
            }
            return;
        }
        arrayList.size();
        String M03 = id.M0(2131752862, null);
        long j10 = this.f51243n;
        String str4 = "";
        if (j10 <= 0) {
            str = "";
        } else {
            str = org.telegram.messenger.g0.i0(j10, false, false);
        }
        arrayList.add(y31.d(3, 2131231776, M03, str));
        arrayList.size();
        String M04 = id.M0(2131752864, null);
        long j11 = this.h;
        if (j11 > 0) {
            str4 = org.telegram.messenger.g0.i0(j11, false, false);
        }
        arrayList.add(y31.d(2, 2131231775, M04, str4));
        arrayList.add(y31.C(id.M0(2131752860, null)));
        if (this.f51244r > 0) {
            arrayList.size();
            arrayList.add(y31.c(9, 2131231777, id.M0(2131752850, null)));
            arrayList.size();
            arrayList.add(y31.d(7, 2131231775, id.M0(2131752855, null), id.H(',', "BrowserSettingsHistoryPages", (int) this.f51244r)));
            arrayList.add(y31.C(null));
        }
        arrayList.add(y31.u(id.M0(2131752846, null)));
        arrayList.size();
        i2 i2Var2 = this.f51241e;
        String M05 = id.M0(2131752849, null);
        y31 y31Var3 = new y31(3);
        y31Var3.d = 15;
        y31Var3.G = i2Var2;
        y31Var3.f40568l = M05;
        y31Var3.f40573q = true;
        arrayList.add(y31Var3);
        TL_account.TL_webBrowserSettings tL_webBrowserSettings2 = getMessagesController().f24953y8;
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
            int i13 = m1.f51223b;
            y31 K2 = y31.K(m1.class);
            K2.f40568l = str5;
            K2.f40570n = str6;
            K2.B = j12;
            arrayList.add(K2);
        }
        arrayList.add(y31.C(id.M0(2131752847, null)));
        if (!arrayList2.isEmpty()) {
            arrayList.size();
            y31 e11 = y31.e(5, id.M0(2131752848, null));
            e11.f40574r = true;
            arrayList.add(e11);
            arrayList.add(y31.C(null));
        }
        arrayList.size();
        arrayList.add(y31.d(6, 2131232354, id.M0(2131745799, null), f1.a().f51110a));
        arrayList.add(y31.C(id.M0(2131752842, null)));
        boolean z9 = r2.f25212a;
    }

    @Override
    public final CharSequence a0() {
        return id.M0(2131752841, null);
    }

    @Override
    public final void b0(y31 y31Var, View view) {
        View view2;
        int i7;
        int i10;
        boolean z9;
        int i11;
        int i12 = y31Var.d;
        if (i12 == 12) {
            iz.J();
            ((r8) view).setChecked(iz.f23443v0);
        } else if (i12 == 13) {
            iz.f23446w0 = !iz.f23446w0;
            SharedPreferences.Editor edit = qp.e1().edit();
            edit.putBoolean("onlyLocalInstantView", iz.f23446w0);
            edit.apply();
            ((r8) view).setChecked(iz.f23446w0);
        } else if (i12 == 17) {
            boolean z10 = !getMessagesController().O2();
            qp messagesController = getMessagesController();
            TL_account.TL_webBrowserSettings tL_webBrowserSettings = messagesController.f24953y8;
            if (tL_webBrowserSettings != null) {
                messagesController.u5(tL_webBrowserSettings.open_external_browser, z10);
            }
            ((r8) view).setChecked(z10);
            this.f36649a.f37556f3.O(true);
        } else {
            ?? r72 = 0;
            if (i12 == 1) {
                qp messagesController2 = getMessagesController();
                TL_account.TL_webBrowserSettings tL_webBrowserSettings2 = messagesController2.f24953y8;
                if (tL_webBrowserSettings2 != null) {
                    messagesController2.u5(!tL_webBrowserSettings2.open_external_browser, tL_webBrowserSettings2.display_close_button);
                }
                boolean M2 = getMessagesController().M2();
                r8 r8Var = (r8) view;
                r8Var.setChecked(M2);
                if (M2) {
                    i11 = l6.f27903f6;
                } else {
                    i11 = l6.f27884e6;
                }
                r8Var.b(l6.x0(null, i11, false), M2);
                this.f36649a.f37556f3.O(true);
            } else if (i12 == 10) {
                qp messagesController3 = getMessagesController();
                TL_account.TL_webBrowserSettings tL_webBrowserSettings3 = messagesController3.f24953y8;
                if (tL_webBrowserSettings3 != null) {
                    messagesController3.u5(tL_webBrowserSettings3.open_external_browser, true);
                }
                this.f36649a.f37556f3.O(true);
            } else if (i12 == 11) {
                qp messagesController4 = getMessagesController();
                TL_account.TL_webBrowserSettings tL_webBrowserSettings4 = messagesController4.f24953y8;
                if (tL_webBrowserSettings4 != null) {
                    messagesController4.u5(tL_webBrowserSettings4.open_external_browser, false);
                }
                this.f36649a.f37556f3.O(true);
            } else {
                String str = "";
                if (i12 == 2) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
                    String M0 = id.M0(2131752864, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                    u1Var.R = M0;
                    if (this.h != 0) {
                        str = a8.p0.s(new StringBuilder(" ("), org.telegram.messenger.g0.i0(this.h, false, false), ")");
                    }
                    u1Var.T = id.a0(null, null, 2131752863, str);
                    alertDialog$Builder.k(id.M0(2131752101, null), new org.telegram.ui.ActionBar.r1(this) {
                        public final o1 f51215b;

                        {
                            this.f51215b = this;
                        }

                        @Override
                        public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i13) {
                            switch (r2) {
                                case 0:
                                    o1 o1Var = this.f51215b;
                                    org.telegram.messenger.t0.f25566b.deleteDatabase("webview.db");
                                    org.telegram.messenger.t0.f25566b.deleteDatabase("webviewCache.db");
                                    WebStorage.getInstance().deleteAllData();
                                    try {
                                        WebView webView = new WebView(o1Var.getParentActivity());
                                        webView.clearCache(true);
                                        webView.clearHistory();
                                        webView.destroy();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        File file = new File(org.telegram.messenger.t0.f25566b.getApplicationInfo().dataDir, "app_webview");
                                        if (file.exists()) {
                                            o1.d0(file, Boolean.FALSE);
                                        }
                                    } catch (Exception e10) {
                                        a8.g(e10, true);
                                    }
                                    try {
                                        File file2 = new File(org.telegram.messenger.t0.f25566b.getApplicationInfo().dataDir, "cache/WebView");
                                        if (file2.exists()) {
                                            o1.d0(file2, null);
                                        }
                                    } catch (Exception e11) {
                                        a8.g(e11, true);
                                    }
                                    b2 b10 = b2.b();
                                    HashMap hashMap = b10.f51088a;
                                    if (hashMap == null) {
                                        b10.f51090c = false;
                                        b10.f51089b = true;
                                        b10.f51088a = new HashMap();
                                    } else {
                                        hashMap.clear();
                                    }
                                    b10.d();
                                    o1Var.f0();
                                    return;
                                case 1:
                                    o1 o1Var2 = this.f51215b;
                                    CookieManager cookieManager = CookieManager.getInstance();
                                    cookieManager.removeAllCookies(null);
                                    cookieManager.flush();
                                    try {
                                        File file3 = new File(org.telegram.messenger.t0.f25566b.getApplicationInfo().dataDir, "app_webview");
                                        if (file3.exists()) {
                                            o1.d0(file3, Boolean.TRUE);
                                        }
                                    } catch (Exception e12) {
                                        a8.g(e12, true);
                                    }
                                    o1Var2.f0();
                                    return;
                                case 2:
                                    o1 o1Var3 = this.f51215b;
                                    try {
                                        xa.f5953c.clear();
                                        xa.d.clear();
                                        File file4 = new File(w7.z(4), "webhistory.dat");
                                        if (file4.exists()) {
                                            file4.delete();
                                        }
                                    } catch (Exception e13) {
                                        a8.g(e13, true);
                                    }
                                    o1Var3.f51244r = 0L;
                                    o1Var3.f36649a.f37556f3.O(true);
                                    return;
                                default:
                                    o1 o1Var4 = this.f51215b;
                                    qp messagesController5 = o1Var4.getMessagesController();
                                    TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.f24953y8;
                                    if (tL_webBrowserSettings5 != null) {
                                        tL_webBrowserSettings5.open_external_browser = true;
                                        tL_webBrowserSettings5.display_close_button = true;
                                        tL_webBrowserSettings5.external_exceptions.clear();
                                        messagesController5.f24953y8.inapp_exceptions.clear();
                                        messagesController5.Q4(messagesController5.f24953y8);
                                    }
                                    messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new d3.b(1), new fl(messagesController5, 6));
                                    o1Var4.f36649a.f37556f3.O(true);
                                    return;
                            }
                        }
                    });
                    alertDialog$Builder.h(id.M0(2131752589, null), null);
                    alertDialog$Builder.d(-1);
                    alertDialog$Builder.p();
                } else if (i12 == 3) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
                    String M02 = id.M0(2131752862, null);
                    org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27296a;
                    u1Var2.R = M02;
                    if (this.f51243n != 0) {
                        str = a8.p0.s(new StringBuilder(" ("), org.telegram.messenger.g0.i0(this.f51243n, false, false), ")");
                    }
                    u1Var2.T = id.a0(null, null, 2131752861, str);
                    alertDialog$Builder2.k(id.M0(2131752101, null), new org.telegram.ui.ActionBar.r1(this) {
                        public final o1 f51215b;

                        {
                            this.f51215b = this;
                        }

                        @Override
                        public final void g(org.telegram.ui.ActionBar.u1 u1Var22, int i13) {
                            switch (r2) {
                                case 0:
                                    o1 o1Var = this.f51215b;
                                    org.telegram.messenger.t0.f25566b.deleteDatabase("webview.db");
                                    org.telegram.messenger.t0.f25566b.deleteDatabase("webviewCache.db");
                                    WebStorage.getInstance().deleteAllData();
                                    try {
                                        WebView webView = new WebView(o1Var.getParentActivity());
                                        webView.clearCache(true);
                                        webView.clearHistory();
                                        webView.destroy();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        File file = new File(org.telegram.messenger.t0.f25566b.getApplicationInfo().dataDir, "app_webview");
                                        if (file.exists()) {
                                            o1.d0(file, Boolean.FALSE);
                                        }
                                    } catch (Exception e10) {
                                        a8.g(e10, true);
                                    }
                                    try {
                                        File file2 = new File(org.telegram.messenger.t0.f25566b.getApplicationInfo().dataDir, "cache/WebView");
                                        if (file2.exists()) {
                                            o1.d0(file2, null);
                                        }
                                    } catch (Exception e11) {
                                        a8.g(e11, true);
                                    }
                                    b2 b10 = b2.b();
                                    HashMap hashMap = b10.f51088a;
                                    if (hashMap == null) {
                                        b10.f51090c = false;
                                        b10.f51089b = true;
                                        b10.f51088a = new HashMap();
                                    } else {
                                        hashMap.clear();
                                    }
                                    b10.d();
                                    o1Var.f0();
                                    return;
                                case 1:
                                    o1 o1Var2 = this.f51215b;
                                    CookieManager cookieManager = CookieManager.getInstance();
                                    cookieManager.removeAllCookies(null);
                                    cookieManager.flush();
                                    try {
                                        File file3 = new File(org.telegram.messenger.t0.f25566b.getApplicationInfo().dataDir, "app_webview");
                                        if (file3.exists()) {
                                            o1.d0(file3, Boolean.TRUE);
                                        }
                                    } catch (Exception e12) {
                                        a8.g(e12, true);
                                    }
                                    o1Var2.f0();
                                    return;
                                case 2:
                                    o1 o1Var3 = this.f51215b;
                                    try {
                                        xa.f5953c.clear();
                                        xa.d.clear();
                                        File file4 = new File(w7.z(4), "webhistory.dat");
                                        if (file4.exists()) {
                                            file4.delete();
                                        }
                                    } catch (Exception e13) {
                                        a8.g(e13, true);
                                    }
                                    o1Var3.f51244r = 0L;
                                    o1Var3.f36649a.f37556f3.O(true);
                                    return;
                                default:
                                    o1 o1Var4 = this.f51215b;
                                    qp messagesController5 = o1Var4.getMessagesController();
                                    TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.f24953y8;
                                    if (tL_webBrowserSettings5 != null) {
                                        tL_webBrowserSettings5.open_external_browser = true;
                                        tL_webBrowserSettings5.display_close_button = true;
                                        tL_webBrowserSettings5.external_exceptions.clear();
                                        messagesController5.f24953y8.inapp_exceptions.clear();
                                        messagesController5.Q4(messagesController5.f24953y8);
                                    }
                                    messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new d3.b(1), new fl(messagesController5, 6));
                                    o1Var4.f36649a.f37556f3.O(true);
                                    return;
                            }
                        }
                    });
                    alertDialog$Builder2.h(id.M0(2131752589, null), null);
                    alertDialog$Builder2.d(-1);
                    alertDialog$Builder2.p();
                } else if (i12 == 7) {
                    ArrayList a10 = xa.a(null);
                    int size = a10.size();
                    long j3 = Long.MAX_VALUE;
                    int i13 = 0;
                    while (i13 < size) {
                        Object obj = a10.get(i13);
                        i13++;
                        j3 = Math.min(j3, ((y0) obj).f51384b);
                    }
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
                    String M03 = id.M0(2131752855, null);
                    org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder3.f27296a;
                    u1Var3.R = M03;
                    u1Var3.T = id.a0(null, null, 2131752854, id.u(j3 / 1000, false));
                    alertDialog$Builder3.k(id.M0(2131752101, null), new org.telegram.ui.ActionBar.r1(this) {
                        public final o1 f51215b;

                        {
                            this.f51215b = this;
                        }

                        @Override
                        public final void g(org.telegram.ui.ActionBar.u1 u1Var22, int i132) {
                            switch (r2) {
                                case 0:
                                    o1 o1Var = this.f51215b;
                                    org.telegram.messenger.t0.f25566b.deleteDatabase("webview.db");
                                    org.telegram.messenger.t0.f25566b.deleteDatabase("webviewCache.db");
                                    WebStorage.getInstance().deleteAllData();
                                    try {
                                        WebView webView = new WebView(o1Var.getParentActivity());
                                        webView.clearCache(true);
                                        webView.clearHistory();
                                        webView.destroy();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        File file = new File(org.telegram.messenger.t0.f25566b.getApplicationInfo().dataDir, "app_webview");
                                        if (file.exists()) {
                                            o1.d0(file, Boolean.FALSE);
                                        }
                                    } catch (Exception e10) {
                                        a8.g(e10, true);
                                    }
                                    try {
                                        File file2 = new File(org.telegram.messenger.t0.f25566b.getApplicationInfo().dataDir, "cache/WebView");
                                        if (file2.exists()) {
                                            o1.d0(file2, null);
                                        }
                                    } catch (Exception e11) {
                                        a8.g(e11, true);
                                    }
                                    b2 b10 = b2.b();
                                    HashMap hashMap = b10.f51088a;
                                    if (hashMap == null) {
                                        b10.f51090c = false;
                                        b10.f51089b = true;
                                        b10.f51088a = new HashMap();
                                    } else {
                                        hashMap.clear();
                                    }
                                    b10.d();
                                    o1Var.f0();
                                    return;
                                case 1:
                                    o1 o1Var2 = this.f51215b;
                                    CookieManager cookieManager = CookieManager.getInstance();
                                    cookieManager.removeAllCookies(null);
                                    cookieManager.flush();
                                    try {
                                        File file3 = new File(org.telegram.messenger.t0.f25566b.getApplicationInfo().dataDir, "app_webview");
                                        if (file3.exists()) {
                                            o1.d0(file3, Boolean.TRUE);
                                        }
                                    } catch (Exception e12) {
                                        a8.g(e12, true);
                                    }
                                    o1Var2.f0();
                                    return;
                                case 2:
                                    o1 o1Var3 = this.f51215b;
                                    try {
                                        xa.f5953c.clear();
                                        xa.d.clear();
                                        File file4 = new File(w7.z(4), "webhistory.dat");
                                        if (file4.exists()) {
                                            file4.delete();
                                        }
                                    } catch (Exception e13) {
                                        a8.g(e13, true);
                                    }
                                    o1Var3.f51244r = 0L;
                                    o1Var3.f36649a.f37556f3.O(true);
                                    return;
                                default:
                                    o1 o1Var4 = this.f51215b;
                                    qp messagesController5 = o1Var4.getMessagesController();
                                    TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.f24953y8;
                                    if (tL_webBrowserSettings5 != null) {
                                        tL_webBrowserSettings5.open_external_browser = true;
                                        tL_webBrowserSettings5.display_close_button = true;
                                        tL_webBrowserSettings5.external_exceptions.clear();
                                        messagesController5.f24953y8.inapp_exceptions.clear();
                                        messagesController5.Q4(messagesController5.f24953y8);
                                    }
                                    messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new d3.b(1), new fl(messagesController5, 6));
                                    o1Var4.f36649a.f37556f3.O(true);
                                    return;
                            }
                        }
                    });
                    alertDialog$Builder3.h(id.M0(2131752589, null), null);
                    alertDialog$Builder3.d(-1);
                    alertDialog$Builder3.p();
                } else if (i12 == 9) {
                    z0[] z0VarArr = {null};
                    f2 z0Var = new z0(null, new org.telegram.ui.Wallet.s(13, this, z0VarArr));
                    z0VarArr[0] = z0Var;
                    presentFragment(z0Var);
                } else if (i12 == 5) {
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
                    String M04 = id.M0(2131742937, null);
                    org.telegram.ui.ActionBar.u1 u1Var4 = alertDialog$Builder4.f27296a;
                    u1Var4.R = M04;
                    u1Var4.T = id.M0(2131742938, null);
                    alertDialog$Builder4.k(id.M0(2131751598, null), new org.telegram.ui.ActionBar.r1(this) {
                        public final o1 f51215b;

                        {
                            this.f51215b = this;
                        }

                        @Override
                        public final void g(org.telegram.ui.ActionBar.u1 u1Var22, int i132) {
                            switch (r2) {
                                case 0:
                                    o1 o1Var = this.f51215b;
                                    org.telegram.messenger.t0.f25566b.deleteDatabase("webview.db");
                                    org.telegram.messenger.t0.f25566b.deleteDatabase("webviewCache.db");
                                    WebStorage.getInstance().deleteAllData();
                                    try {
                                        WebView webView = new WebView(o1Var.getParentActivity());
                                        webView.clearCache(true);
                                        webView.clearHistory();
                                        webView.destroy();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        File file = new File(org.telegram.messenger.t0.f25566b.getApplicationInfo().dataDir, "app_webview");
                                        if (file.exists()) {
                                            o1.d0(file, Boolean.FALSE);
                                        }
                                    } catch (Exception e10) {
                                        a8.g(e10, true);
                                    }
                                    try {
                                        File file2 = new File(org.telegram.messenger.t0.f25566b.getApplicationInfo().dataDir, "cache/WebView");
                                        if (file2.exists()) {
                                            o1.d0(file2, null);
                                        }
                                    } catch (Exception e11) {
                                        a8.g(e11, true);
                                    }
                                    b2 b10 = b2.b();
                                    HashMap hashMap = b10.f51088a;
                                    if (hashMap == null) {
                                        b10.f51090c = false;
                                        b10.f51089b = true;
                                        b10.f51088a = new HashMap();
                                    } else {
                                        hashMap.clear();
                                    }
                                    b10.d();
                                    o1Var.f0();
                                    return;
                                case 1:
                                    o1 o1Var2 = this.f51215b;
                                    CookieManager cookieManager = CookieManager.getInstance();
                                    cookieManager.removeAllCookies(null);
                                    cookieManager.flush();
                                    try {
                                        File file3 = new File(org.telegram.messenger.t0.f25566b.getApplicationInfo().dataDir, "app_webview");
                                        if (file3.exists()) {
                                            o1.d0(file3, Boolean.TRUE);
                                        }
                                    } catch (Exception e12) {
                                        a8.g(e12, true);
                                    }
                                    o1Var2.f0();
                                    return;
                                case 2:
                                    o1 o1Var3 = this.f51215b;
                                    try {
                                        xa.f5953c.clear();
                                        xa.d.clear();
                                        File file4 = new File(w7.z(4), "webhistory.dat");
                                        if (file4.exists()) {
                                            file4.delete();
                                        }
                                    } catch (Exception e13) {
                                        a8.g(e13, true);
                                    }
                                    o1Var3.f51244r = 0L;
                                    o1Var3.f36649a.f37556f3.O(true);
                                    return;
                                default:
                                    o1 o1Var4 = this.f51215b;
                                    qp messagesController5 = o1Var4.getMessagesController();
                                    TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.f24953y8;
                                    if (tL_webBrowserSettings5 != null) {
                                        tL_webBrowserSettings5.open_external_browser = true;
                                        tL_webBrowserSettings5.display_close_button = true;
                                        tL_webBrowserSettings5.external_exceptions.clear();
                                        messagesController5.f24953y8.inapp_exceptions.clear();
                                        messagesController5.Q4(messagesController5.f24953y8);
                                    }
                                    messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new d3.b(1), new fl(messagesController5, 6));
                                    o1Var4.f36649a.f37556f3.O(true);
                                    return;
                            }
                        }
                    });
                    alertDialog$Builder4.h(id.M0(2131752589, null), null);
                    alertDialog$Builder4.d(-1);
                    alertDialog$Builder4.p();
                } else if (y31Var.H(m1.class)) {
                    n1 n1Var = (n1) view;
                    String str2 = n1Var.f51233e;
                    l60 F = l60.F((ViewGroup) this.fragmentView, null, n1Var);
                    F.f35617s = 40;
                    F.c(2131231785, id.M0(2131746321, null), new s(6, this, str2), false);
                    F.Z();
                } else {
                    int i14 = y31Var.d;
                    if (i14 == 6) {
                        if (getParentActivity() != null) {
                            AtomicReference atomicReference = new AtomicReference();
                            LinearLayout linearLayout = new LinearLayout(getParentActivity());
                            linearLayout.setOrientation(1);
                            ArrayList b10 = f1.b();
                            int size2 = b10.size();
                            CharSequence[] charSequenceArr = new CharSequence[size2];
                            int i15 = 0;
                            while (i15 < size2) {
                                charSequenceArr[i15] = ((f1) b10.get(i15)).f51110a;
                                j6 j6Var = new j6(getParentActivity(), null);
                                j6Var.setPadding(org.telegram.messenger.g0.L(4.0f), r72, org.telegram.messenger.g0.L(4.0f), r72);
                                j6Var.a(l6.x0(null, l6.f27921g7, r72), l6.x0(null, l6.E5, r72));
                                CharSequence charSequence = charSequenceArr[i15];
                                if (i15 == iz.f23426p0) {
                                    z9 = true;
                                } else {
                                    z9 = r72;
                                }
                                j6Var.b(charSequence, z9);
                                int i16 = l6.f27957i6;
                                org.telegram.ui.Cells.y h02 = l6.h0(l6.x0(null, i16, r72), 2, -1);
                                o6 M = s6.M(i16);
                                j6Var.setBackground(h02);
                                s6.j(j6Var, h02, null, M, null);
                                linearLayout.addView(j6Var);
                                j6Var.setOnClickListener(new la(i15, view, atomicReference));
                                i15++;
                                r72 = 0;
                            }
                            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(getParentActivity());
                            String M05 = id.M0(2131745799, null);
                            org.telegram.ui.ActionBar.u1 u1Var5 = alertDialog$Builder5.f27296a;
                            u1Var5.R = M05;
                            alertDialog$Builder5.o(linearLayout);
                            alertDialog$Builder5.h(id.M0(2131752589, null), null);
                            atomicReference.set(u1Var5);
                            showDialog(u1Var5);
                        }
                    } else if (i14 != 15 && i14 != 16) {
                    } else {
                        boolean M22 = getMessagesController().M2();
                        if (getMessagesController().L2(M22)) {
                            v4.r0(this, id.M0(2131742935, null), id.M0(2131742936, null), null);
                            return;
                        }
                        Activity parentActivity = getParentActivity();
                        g6 resourceProvider = getResourceProvider();
                        b9 b9Var = new b9(10, this, M22);
                        Pattern pattern = v4.f38913a;
                        Activity W = org.telegram.messenger.g0.W(parentActivity);
                        if (W != null) {
                            view2 = W.getCurrentFocus();
                        } else {
                            view2 = null;
                        }
                        org.telegram.ui.ActionBar.u1[] u1VarArr = new org.telegram.ui.ActionBar.u1[1];
                        AlertDialog$Builder alertDialog$Builder6 = new AlertDialog$Builder(0, parentActivity, resourceProvider);
                        if (M22) {
                            i7 = 2131752868;
                        } else {
                            i7 = 2131752867;
                        }
                        String M06 = id.M0(i7, null);
                        org.telegram.ui.ActionBar.u1 u1Var6 = alertDialog$Builder6.f27296a;
                        u1Var6.R = M06;
                        if (M22) {
                            i10 = 2131752870;
                        } else {
                            i10 = 2131752869;
                        }
                        u1Var6.T = id.M0(i10, null);
                        ?? editTextBoldCursor = new EditTextBoldCursor(parentActivity);
                        editTextBoldCursor.setTextSize(1, 16.0f);
                        int i17 = l6.f27973j5;
                        s6.U(editTextBoldCursor, i17, resourceProvider);
                        s6.D(editTextBoldCursor, l6.Li, resourceProvider);
                        editTextBoldCursor.setHint(id.M0(2131752871, null));
                        editTextBoldCursor.setInputType(17);
                        editTextBoldCursor.setImeOptions(6);
                        editTextBoldCursor.setSingleLine(true);
                        editTextBoldCursor.setFocusable(true);
                        editTextBoldCursor.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(13.0f));
                        editTextBoldCursor.setCursorWidth(1.5f);
                        editTextBoldCursor.z(l6.f28105q6, resourceProvider);
                        ShapeDrawable d02 = l6.d0(org.telegram.messenger.g0.L(22.0f), l6.r1(0.06f, l6.w0(i17, resourceProvider)));
                        o6 K = s6.K(0.06f, i17);
                        editTextBoldCursor.setBackground(d02);
                        s6.j(editTextBoldCursor, d02, K, null, resourceProvider);
                        m6 m6Var = new m6((Object) editTextBoldCursor, b9Var, u1VarArr, view2, 15);
                        editTextBoldCursor.setOnEditorActionListener(new org.telegram.ui.Components.t0(m6Var, 0));
                        LinearLayout linearLayout2 = new LinearLayout(parentActivity);
                        linearLayout2.setOrientation(1);
                        linearLayout2.addView((View) editTextBoldCursor, ha.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
                        alertDialog$Builder6.c();
                        alertDialog$Builder6.o(linearLayout2);
                        u1Var6.f28542a = Math.min(org.telegram.messenger.g0.L(320.0f), (org.telegram.messenger.g0.f22563q.x * 85) / 100);
                        alertDialog$Builder6.k(id.M0(2131751354, null), new org.telegram.ui.Components.u(m6Var, 2));
                        alertDialog$Builder6.h(id.M0(2131752589, null), new br(5));
                        u1VarArr[0] = u1Var6;
                        u1Var6.f28565j0 = false;
                        u1Var6.setOnDismissListener(new org.telegram.ui.Components.p0(editTextBoldCursor, 1));
                        u1VarArr[0].setOnShowListener(new org.telegram.ui.Components.u0(0, editTextBoldCursor));
                        u1VarArr[0].show();
                    }
                }
            }
        }
    }

    @Override
    public final boolean c0(y31 y31Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        Drawable mutate = context.getResources().getDrawable(2131232559).mutate();
        Drawable h = jg.g.h(context, 2131232560);
        int themedColor = getThemedColor(l6.N6);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        h.setColorFilter(new PorterDuffColorFilter(getThemedColor(l6.f27995k7), mode));
        i2 i2Var = new i2(mutate, h, 4);
        i2Var.f40454y = org.telegram.messenger.g0.L(2.0f);
        this.f51241e = i2Var;
        this.fragmentView = super.createView(context);
        this.f36649a.r1();
        this.f36649a.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        w3 w3Var;
        if (i7 == qs.R5 && (w3Var = this.f36649a) != null) {
            w3Var.f37556f3.O(true);
        }
    }

    public final void f0() {
        m41 m41Var;
        ArrayList a10 = xa.a(new ii.c(this, 18));
        if (a10 != null) {
            this.f51244r = a10.size();
            w3 w3Var = this.f36649a;
            if (w3Var != null && (m41Var = w3Var.f37556f3) != null && w3Var.G) {
                m41Var.O(true);
            }
        }
        Utilities.f21336e.c(new o5(this, 16));
    }

    @Override
    public final qj0 getListViewForSimpleGlass() {
        return this.f36649a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        f0();
        getNotificationCenter().c(this, qs.R5);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, qs.R5);
    }

    @Override
    public final void onThemeColorsChanged() {
        boolean z9;
        super.onThemeColorsChanged();
        try {
            i2 i2Var = this.f51241e;
            if (i2Var != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                int themedColor = getThemedColor(l6.N6);
                int themedColor2 = getThemedColor(l6.f27995k7);
                if (themedColor == this.f51245s && themedColor2 == this.f51246w) {
                    return;
                }
                this.f51245s = themedColor;
                this.f51246w = themedColor2;
                Drawable drawable = i2Var.f40444a;
                if (drawable != null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                }
                Drawable drawable2 = i2Var.f40445b;
                if (drawable2 != null) {
                    drawable2.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY));
                }
                w3 w3Var = this.f36649a;
                if (w3Var != null) {
                    w3Var.g1();
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
