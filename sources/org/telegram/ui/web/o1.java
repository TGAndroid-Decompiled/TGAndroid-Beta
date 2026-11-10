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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.p5;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.j6;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.u4;
import org.telegram.ui.Components.x31;
import org.telegram.ui.cr;
public final class o1 extends o41 implements ls {
    public i2 f51195e;
    public final c20 f51196f;
    public long h;
    public long f51197n;
    public long f51198r;
    public int f51199s;
    public int f51200w;

    public o1(org.telegram.ui.q qVar) {
        this.f51196f = qVar;
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
        x31 x31Var = new x31(9);
        x31Var.d = 1;
        x31Var.f40156l = M0;
        x31Var.L(M2);
        arrayList.add(x31Var);
        arrayList.add(x31.C(id.M0(2131752856, null)));
        int i7 = 0;
        if (!M2) {
            getMessagesController().O2();
            x31 i10 = x31.i(17, id.M0(2131742934, null));
            i10.L(getMessagesController().O2());
            arrayList.add(i10);
            arrayList.add(x31.C(id.M0(2131742933, null)));
            arrayList.add(x31.u(id.M0(2131752865, null)));
            arrayList.size();
            i2 i2Var = this.f51195e;
            String M02 = id.M0(2131752849, null);
            x31 x31Var2 = new x31(3);
            x31Var2.d = 16;
            x31Var2.G = i2Var;
            x31Var2.f40156l = M02;
            x31Var2.f40161q = true;
            arrayList.add(x31Var2);
            TL_account.TL_webBrowserSettings tL_webBrowserSettings = getMessagesController().f24957y8;
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
                int i11 = m1.f51177b;
                x31 K = x31.K(m1.class);
                K.f40156l = str2;
                K.f40158n = str3;
                K.B = j3;
                arrayList.add(K);
            }
            arrayList.add(x31.C(id.M0(2131752866, null)));
            if (!arrayList3.isEmpty()) {
                arrayList.size();
                x31 e10 = x31.e(5, id.M0(2131752848, null));
                e10.f40162r = true;
                arrayList.add(e10);
                arrayList.add(x31.C(null));
                return;
            }
            return;
        }
        arrayList.size();
        String M03 = id.M0(2131752862, null);
        long j10 = this.f51197n;
        String str4 = "";
        if (j10 <= 0) {
            str = "";
        } else {
            str = org.telegram.messenger.g0.i0(j10, false, false);
        }
        arrayList.add(x31.d(3, 2131231776, M03, str));
        arrayList.size();
        String M04 = id.M0(2131752864, null);
        long j11 = this.h;
        if (j11 > 0) {
            str4 = org.telegram.messenger.g0.i0(j11, false, false);
        }
        arrayList.add(x31.d(2, 2131231775, M04, str4));
        arrayList.add(x31.C(id.M0(2131752860, null)));
        if (this.f51198r > 0) {
            arrayList.size();
            arrayList.add(x31.c(9, 2131231777, id.M0(2131752850, null)));
            arrayList.size();
            arrayList.add(x31.d(7, 2131231775, id.M0(2131752855, null), id.H(',', "BrowserSettingsHistoryPages", (int) this.f51198r)));
            arrayList.add(x31.C(null));
        }
        arrayList.add(x31.u(id.M0(2131752846, null)));
        arrayList.size();
        i2 i2Var2 = this.f51195e;
        String M05 = id.M0(2131752849, null);
        x31 x31Var3 = new x31(3);
        x31Var3.d = 15;
        x31Var3.G = i2Var2;
        x31Var3.f40156l = M05;
        x31Var3.f40161q = true;
        arrayList.add(x31Var3);
        TL_account.TL_webBrowserSettings tL_webBrowserSettings2 = getMessagesController().f24957y8;
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
            int i13 = m1.f51177b;
            x31 K2 = x31.K(m1.class);
            K2.f40156l = str5;
            K2.f40158n = str6;
            K2.B = j12;
            arrayList.add(K2);
        }
        arrayList.add(x31.C(id.M0(2131752847, null)));
        if (!arrayList2.isEmpty()) {
            arrayList.size();
            x31 e11 = x31.e(5, id.M0(2131752848, null));
            e11.f40162r = true;
            arrayList.add(e11);
            arrayList.add(x31.C(null));
        }
        arrayList.size();
        arrayList.add(x31.d(6, 2131232354, id.M0(2131745799, null), f1.a().f51064a));
        arrayList.add(x31.C(id.M0(2131752842, null)));
        boolean z9 = r2.f25216a;
    }

    @Override
    public final CharSequence a0() {
        return id.M0(2131752841, null);
    }

    @Override
    public final void b0(x31 x31Var, View view) {
        View view2;
        int i7;
        int i10;
        boolean z9;
        int i11;
        int i12 = x31Var.d;
        if (i12 == 12) {
            iz.J();
            ((r8) view).setChecked(iz.f23447v0);
        } else if (i12 == 13) {
            iz.f23450w0 = !iz.f23450w0;
            SharedPreferences.Editor edit = qp.e1().edit();
            edit.putBoolean("onlyLocalInstantView", iz.f23450w0);
            edit.apply();
            ((r8) view).setChecked(iz.f23450w0);
        } else if (i12 == 17) {
            boolean z10 = !getMessagesController().O2();
            qp messagesController = getMessagesController();
            TL_account.TL_webBrowserSettings tL_webBrowserSettings = messagesController.f24957y8;
            if (tL_webBrowserSettings != null) {
                messagesController.u5(tL_webBrowserSettings.open_external_browser, z10);
            }
            ((r8) view).setChecked(z10);
            this.f36518a.f37496f3.O(true);
        } else {
            ?? r72 = 0;
            if (i12 == 1) {
                qp messagesController2 = getMessagesController();
                TL_account.TL_webBrowserSettings tL_webBrowserSettings2 = messagesController2.f24957y8;
                if (tL_webBrowserSettings2 != null) {
                    messagesController2.u5(!tL_webBrowserSettings2.open_external_browser, tL_webBrowserSettings2.display_close_button);
                }
                boolean M2 = getMessagesController().M2();
                r8 r8Var = (r8) view;
                r8Var.setChecked(M2);
                if (M2) {
                    i11 = m6.f27928f6;
                } else {
                    i11 = m6.f27909e6;
                }
                r8Var.b(m6.x0(null, i11, false), M2);
                this.f36518a.f37496f3.O(true);
            } else if (i12 == 10) {
                qp messagesController3 = getMessagesController();
                TL_account.TL_webBrowserSettings tL_webBrowserSettings3 = messagesController3.f24957y8;
                if (tL_webBrowserSettings3 != null) {
                    messagesController3.u5(tL_webBrowserSettings3.open_external_browser, true);
                }
                this.f36518a.f37496f3.O(true);
            } else if (i12 == 11) {
                qp messagesController4 = getMessagesController();
                TL_account.TL_webBrowserSettings tL_webBrowserSettings4 = messagesController4.f24957y8;
                if (tL_webBrowserSettings4 != null) {
                    messagesController4.u5(tL_webBrowserSettings4.open_external_browser, false);
                }
                this.f36518a.f37496f3.O(true);
            } else {
                String str = "";
                if (i12 == 2) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
                    String M0 = id.M0(2131752864, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                    u1Var.R = M0;
                    if (this.h != 0) {
                        str = a8.p0.s(new StringBuilder(" ("), org.telegram.messenger.g0.i0(this.h, false, false), ")");
                    }
                    u1Var.T = id.a0(null, null, 2131752863, str);
                    alertDialog$Builder.k(id.M0(2131752101, null), new org.telegram.ui.ActionBar.r1(this) {
                        public final o1 f51169b;

                        {
                            this.f51169b = this;
                        }

                        @Override
                        public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i13) {
                            switch (r2) {
                                case 0:
                                    o1 o1Var = this.f51169b;
                                    org.telegram.messenger.t0.f25570b.deleteDatabase("webview.db");
                                    org.telegram.messenger.t0.f25570b.deleteDatabase("webviewCache.db");
                                    WebStorage.getInstance().deleteAllData();
                                    try {
                                        WebView webView = new WebView(o1Var.getParentActivity());
                                        webView.clearCache(true);
                                        webView.clearHistory();
                                        webView.destroy();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        File file = new File(org.telegram.messenger.t0.f25570b.getApplicationInfo().dataDir, "app_webview");
                                        if (file.exists()) {
                                            o1.d0(file, Boolean.FALSE);
                                        }
                                    } catch (Exception e10) {
                                        a8.g(e10, true);
                                    }
                                    try {
                                        File file2 = new File(org.telegram.messenger.t0.f25570b.getApplicationInfo().dataDir, "cache/WebView");
                                        if (file2.exists()) {
                                            o1.d0(file2, null);
                                        }
                                    } catch (Exception e11) {
                                        a8.g(e11, true);
                                    }
                                    b2 b10 = b2.b();
                                    HashMap hashMap = b10.f51042a;
                                    if (hashMap == null) {
                                        b10.f51044c = false;
                                        b10.f51043b = true;
                                        b10.f51042a = new HashMap();
                                    } else {
                                        hashMap.clear();
                                    }
                                    b10.d();
                                    o1Var.f0();
                                    return;
                                case 1:
                                    o1 o1Var2 = this.f51169b;
                                    CookieManager cookieManager = CookieManager.getInstance();
                                    cookieManager.removeAllCookies(null);
                                    cookieManager.flush();
                                    try {
                                        File file3 = new File(org.telegram.messenger.t0.f25570b.getApplicationInfo().dataDir, "app_webview");
                                        if (file3.exists()) {
                                            o1.d0(file3, Boolean.TRUE);
                                        }
                                    } catch (Exception e12) {
                                        a8.g(e12, true);
                                    }
                                    o1Var2.f0();
                                    return;
                                case 2:
                                    o1 o1Var3 = this.f51169b;
                                    try {
                                        xa.f5958c.clear();
                                        xa.d.clear();
                                        File file4 = new File(w7.z(4), "webhistory.dat");
                                        if (file4.exists()) {
                                            file4.delete();
                                        }
                                    } catch (Exception e13) {
                                        a8.g(e13, true);
                                    }
                                    o1Var3.f51198r = 0L;
                                    o1Var3.f36518a.f37496f3.O(true);
                                    return;
                                default:
                                    o1 o1Var4 = this.f51169b;
                                    qp messagesController5 = o1Var4.getMessagesController();
                                    TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.f24957y8;
                                    if (tL_webBrowserSettings5 != null) {
                                        tL_webBrowserSettings5.open_external_browser = true;
                                        tL_webBrowserSettings5.display_close_button = true;
                                        tL_webBrowserSettings5.external_exceptions.clear();
                                        messagesController5.f24957y8.inapp_exceptions.clear();
                                        messagesController5.Q4(messagesController5.f24957y8);
                                    }
                                    messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new d3.b(1), new fl(messagesController5, 6));
                                    o1Var4.f36518a.f37496f3.O(true);
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
                    org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27300a;
                    u1Var2.R = M02;
                    if (this.f51197n != 0) {
                        str = a8.p0.s(new StringBuilder(" ("), org.telegram.messenger.g0.i0(this.f51197n, false, false), ")");
                    }
                    u1Var2.T = id.a0(null, null, 2131752861, str);
                    alertDialog$Builder2.k(id.M0(2131752101, null), new org.telegram.ui.ActionBar.r1(this) {
                        public final o1 f51169b;

                        {
                            this.f51169b = this;
                        }

                        @Override
                        public final void g(org.telegram.ui.ActionBar.u1 u1Var22, int i13) {
                            switch (r2) {
                                case 0:
                                    o1 o1Var = this.f51169b;
                                    org.telegram.messenger.t0.f25570b.deleteDatabase("webview.db");
                                    org.telegram.messenger.t0.f25570b.deleteDatabase("webviewCache.db");
                                    WebStorage.getInstance().deleteAllData();
                                    try {
                                        WebView webView = new WebView(o1Var.getParentActivity());
                                        webView.clearCache(true);
                                        webView.clearHistory();
                                        webView.destroy();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        File file = new File(org.telegram.messenger.t0.f25570b.getApplicationInfo().dataDir, "app_webview");
                                        if (file.exists()) {
                                            o1.d0(file, Boolean.FALSE);
                                        }
                                    } catch (Exception e10) {
                                        a8.g(e10, true);
                                    }
                                    try {
                                        File file2 = new File(org.telegram.messenger.t0.f25570b.getApplicationInfo().dataDir, "cache/WebView");
                                        if (file2.exists()) {
                                            o1.d0(file2, null);
                                        }
                                    } catch (Exception e11) {
                                        a8.g(e11, true);
                                    }
                                    b2 b10 = b2.b();
                                    HashMap hashMap = b10.f51042a;
                                    if (hashMap == null) {
                                        b10.f51044c = false;
                                        b10.f51043b = true;
                                        b10.f51042a = new HashMap();
                                    } else {
                                        hashMap.clear();
                                    }
                                    b10.d();
                                    o1Var.f0();
                                    return;
                                case 1:
                                    o1 o1Var2 = this.f51169b;
                                    CookieManager cookieManager = CookieManager.getInstance();
                                    cookieManager.removeAllCookies(null);
                                    cookieManager.flush();
                                    try {
                                        File file3 = new File(org.telegram.messenger.t0.f25570b.getApplicationInfo().dataDir, "app_webview");
                                        if (file3.exists()) {
                                            o1.d0(file3, Boolean.TRUE);
                                        }
                                    } catch (Exception e12) {
                                        a8.g(e12, true);
                                    }
                                    o1Var2.f0();
                                    return;
                                case 2:
                                    o1 o1Var3 = this.f51169b;
                                    try {
                                        xa.f5958c.clear();
                                        xa.d.clear();
                                        File file4 = new File(w7.z(4), "webhistory.dat");
                                        if (file4.exists()) {
                                            file4.delete();
                                        }
                                    } catch (Exception e13) {
                                        a8.g(e13, true);
                                    }
                                    o1Var3.f51198r = 0L;
                                    o1Var3.f36518a.f37496f3.O(true);
                                    return;
                                default:
                                    o1 o1Var4 = this.f51169b;
                                    qp messagesController5 = o1Var4.getMessagesController();
                                    TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.f24957y8;
                                    if (tL_webBrowserSettings5 != null) {
                                        tL_webBrowserSettings5.open_external_browser = true;
                                        tL_webBrowserSettings5.display_close_button = true;
                                        tL_webBrowserSettings5.external_exceptions.clear();
                                        messagesController5.f24957y8.inapp_exceptions.clear();
                                        messagesController5.Q4(messagesController5.f24957y8);
                                    }
                                    messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new d3.b(1), new fl(messagesController5, 6));
                                    o1Var4.f36518a.f37496f3.O(true);
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
                        j3 = Math.min(j3, ((y0) obj).f51338b);
                    }
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
                    String M03 = id.M0(2131752855, null);
                    org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder3.f27300a;
                    u1Var3.R = M03;
                    u1Var3.T = id.a0(null, null, 2131752854, id.u(j3 / 1000, false));
                    alertDialog$Builder3.k(id.M0(2131752101, null), new org.telegram.ui.ActionBar.r1(this) {
                        public final o1 f51169b;

                        {
                            this.f51169b = this;
                        }

                        @Override
                        public final void g(org.telegram.ui.ActionBar.u1 u1Var22, int i132) {
                            switch (r2) {
                                case 0:
                                    o1 o1Var = this.f51169b;
                                    org.telegram.messenger.t0.f25570b.deleteDatabase("webview.db");
                                    org.telegram.messenger.t0.f25570b.deleteDatabase("webviewCache.db");
                                    WebStorage.getInstance().deleteAllData();
                                    try {
                                        WebView webView = new WebView(o1Var.getParentActivity());
                                        webView.clearCache(true);
                                        webView.clearHistory();
                                        webView.destroy();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        File file = new File(org.telegram.messenger.t0.f25570b.getApplicationInfo().dataDir, "app_webview");
                                        if (file.exists()) {
                                            o1.d0(file, Boolean.FALSE);
                                        }
                                    } catch (Exception e10) {
                                        a8.g(e10, true);
                                    }
                                    try {
                                        File file2 = new File(org.telegram.messenger.t0.f25570b.getApplicationInfo().dataDir, "cache/WebView");
                                        if (file2.exists()) {
                                            o1.d0(file2, null);
                                        }
                                    } catch (Exception e11) {
                                        a8.g(e11, true);
                                    }
                                    b2 b10 = b2.b();
                                    HashMap hashMap = b10.f51042a;
                                    if (hashMap == null) {
                                        b10.f51044c = false;
                                        b10.f51043b = true;
                                        b10.f51042a = new HashMap();
                                    } else {
                                        hashMap.clear();
                                    }
                                    b10.d();
                                    o1Var.f0();
                                    return;
                                case 1:
                                    o1 o1Var2 = this.f51169b;
                                    CookieManager cookieManager = CookieManager.getInstance();
                                    cookieManager.removeAllCookies(null);
                                    cookieManager.flush();
                                    try {
                                        File file3 = new File(org.telegram.messenger.t0.f25570b.getApplicationInfo().dataDir, "app_webview");
                                        if (file3.exists()) {
                                            o1.d0(file3, Boolean.TRUE);
                                        }
                                    } catch (Exception e12) {
                                        a8.g(e12, true);
                                    }
                                    o1Var2.f0();
                                    return;
                                case 2:
                                    o1 o1Var3 = this.f51169b;
                                    try {
                                        xa.f5958c.clear();
                                        xa.d.clear();
                                        File file4 = new File(w7.z(4), "webhistory.dat");
                                        if (file4.exists()) {
                                            file4.delete();
                                        }
                                    } catch (Exception e13) {
                                        a8.g(e13, true);
                                    }
                                    o1Var3.f51198r = 0L;
                                    o1Var3.f36518a.f37496f3.O(true);
                                    return;
                                default:
                                    o1 o1Var4 = this.f51169b;
                                    qp messagesController5 = o1Var4.getMessagesController();
                                    TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.f24957y8;
                                    if (tL_webBrowserSettings5 != null) {
                                        tL_webBrowserSettings5.open_external_browser = true;
                                        tL_webBrowserSettings5.display_close_button = true;
                                        tL_webBrowserSettings5.external_exceptions.clear();
                                        messagesController5.f24957y8.inapp_exceptions.clear();
                                        messagesController5.Q4(messagesController5.f24957y8);
                                    }
                                    messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new d3.b(1), new fl(messagesController5, 6));
                                    o1Var4.f36518a.f37496f3.O(true);
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
                    org.telegram.ui.ActionBar.u1 u1Var4 = alertDialog$Builder4.f27300a;
                    u1Var4.R = M04;
                    u1Var4.T = id.M0(2131742938, null);
                    alertDialog$Builder4.k(id.M0(2131751598, null), new org.telegram.ui.ActionBar.r1(this) {
                        public final o1 f51169b;

                        {
                            this.f51169b = this;
                        }

                        @Override
                        public final void g(org.telegram.ui.ActionBar.u1 u1Var22, int i132) {
                            switch (r2) {
                                case 0:
                                    o1 o1Var = this.f51169b;
                                    org.telegram.messenger.t0.f25570b.deleteDatabase("webview.db");
                                    org.telegram.messenger.t0.f25570b.deleteDatabase("webviewCache.db");
                                    WebStorage.getInstance().deleteAllData();
                                    try {
                                        WebView webView = new WebView(o1Var.getParentActivity());
                                        webView.clearCache(true);
                                        webView.clearHistory();
                                        webView.destroy();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        File file = new File(org.telegram.messenger.t0.f25570b.getApplicationInfo().dataDir, "app_webview");
                                        if (file.exists()) {
                                            o1.d0(file, Boolean.FALSE);
                                        }
                                    } catch (Exception e10) {
                                        a8.g(e10, true);
                                    }
                                    try {
                                        File file2 = new File(org.telegram.messenger.t0.f25570b.getApplicationInfo().dataDir, "cache/WebView");
                                        if (file2.exists()) {
                                            o1.d0(file2, null);
                                        }
                                    } catch (Exception e11) {
                                        a8.g(e11, true);
                                    }
                                    b2 b10 = b2.b();
                                    HashMap hashMap = b10.f51042a;
                                    if (hashMap == null) {
                                        b10.f51044c = false;
                                        b10.f51043b = true;
                                        b10.f51042a = new HashMap();
                                    } else {
                                        hashMap.clear();
                                    }
                                    b10.d();
                                    o1Var.f0();
                                    return;
                                case 1:
                                    o1 o1Var2 = this.f51169b;
                                    CookieManager cookieManager = CookieManager.getInstance();
                                    cookieManager.removeAllCookies(null);
                                    cookieManager.flush();
                                    try {
                                        File file3 = new File(org.telegram.messenger.t0.f25570b.getApplicationInfo().dataDir, "app_webview");
                                        if (file3.exists()) {
                                            o1.d0(file3, Boolean.TRUE);
                                        }
                                    } catch (Exception e12) {
                                        a8.g(e12, true);
                                    }
                                    o1Var2.f0();
                                    return;
                                case 2:
                                    o1 o1Var3 = this.f51169b;
                                    try {
                                        xa.f5958c.clear();
                                        xa.d.clear();
                                        File file4 = new File(w7.z(4), "webhistory.dat");
                                        if (file4.exists()) {
                                            file4.delete();
                                        }
                                    } catch (Exception e13) {
                                        a8.g(e13, true);
                                    }
                                    o1Var3.f51198r = 0L;
                                    o1Var3.f36518a.f37496f3.O(true);
                                    return;
                                default:
                                    o1 o1Var4 = this.f51169b;
                                    qp messagesController5 = o1Var4.getMessagesController();
                                    TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.f24957y8;
                                    if (tL_webBrowserSettings5 != null) {
                                        tL_webBrowserSettings5.open_external_browser = true;
                                        tL_webBrowserSettings5.display_close_button = true;
                                        tL_webBrowserSettings5.external_exceptions.clear();
                                        messagesController5.f24957y8.inapp_exceptions.clear();
                                        messagesController5.Q4(messagesController5.f24957y8);
                                    }
                                    messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new d3.b(1), new fl(messagesController5, 6));
                                    o1Var4.f36518a.f37496f3.O(true);
                                    return;
                            }
                        }
                    });
                    alertDialog$Builder4.h(id.M0(2131752589, null), null);
                    alertDialog$Builder4.d(-1);
                    alertDialog$Builder4.p();
                } else if (x31Var.H(m1.class)) {
                    n1 n1Var = (n1) view;
                    String str2 = n1Var.f51187e;
                    k60 F = k60.F((ViewGroup) this.fragmentView, null, n1Var);
                    F.f35219s = 40;
                    F.c(2131231785, id.M0(2131746321, null), new s(6, this, str2), false);
                    F.Z();
                } else {
                    int i14 = x31Var.d;
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
                                charSequenceArr[i15] = ((f1) b10.get(i15)).f51064a;
                                j6 j6Var = new j6(getParentActivity(), null);
                                j6Var.setPadding(org.telegram.messenger.g0.L(4.0f), r72, org.telegram.messenger.g0.L(4.0f), r72);
                                j6Var.a(m6.x0(null, m6.f27946g7, r72), m6.x0(null, m6.E5, r72));
                                CharSequence charSequence = charSequenceArr[i15];
                                if (i15 == iz.f23430p0) {
                                    z9 = true;
                                } else {
                                    z9 = r72;
                                }
                                j6Var.b(charSequence, z9);
                                int i16 = m6.f27982i6;
                                org.telegram.ui.Cells.y h02 = m6.h0(m6.x0(null, i16, r72), 2, -1);
                                p6 M = t6.M(i16);
                                j6Var.setBackground(h02);
                                t6.j(j6Var, h02, null, M, null);
                                linearLayout.addView(j6Var);
                                j6Var.setOnClickListener(new la(i15, view, atomicReference));
                                i15++;
                                r72 = 0;
                            }
                            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(getParentActivity());
                            String M05 = id.M0(2131745799, null);
                            org.telegram.ui.ActionBar.u1 u1Var5 = alertDialog$Builder5.f27300a;
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
                            u4.r0(this, id.M0(2131742935, null), id.M0(2131742936, null), null);
                            return;
                        }
                        Activity parentActivity = getParentActivity();
                        h6 resourceProvider = getResourceProvider();
                        b9 b9Var = new b9(10, this, M22);
                        Pattern pattern = u4.f38507a;
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
                        org.telegram.ui.ActionBar.u1 u1Var6 = alertDialog$Builder6.f27300a;
                        u1Var6.R = M06;
                        if (M22) {
                            i10 = 2131752870;
                        } else {
                            i10 = 2131752869;
                        }
                        u1Var6.T = id.M0(i10, null);
                        ?? editTextBoldCursor = new EditTextBoldCursor(parentActivity);
                        editTextBoldCursor.setTextSize(1, 16.0f);
                        int i17 = m6.f27998j5;
                        t6.U(editTextBoldCursor, i17, resourceProvider);
                        t6.D(editTextBoldCursor, m6.Li, resourceProvider);
                        editTextBoldCursor.setHint(id.M0(2131752871, null));
                        editTextBoldCursor.setInputType(17);
                        editTextBoldCursor.setImeOptions(6);
                        editTextBoldCursor.setSingleLine(true);
                        editTextBoldCursor.setFocusable(true);
                        editTextBoldCursor.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(13.0f));
                        editTextBoldCursor.setCursorWidth(1.5f);
                        editTextBoldCursor.z(m6.f28130q6, resourceProvider);
                        ShapeDrawable d02 = m6.d0(org.telegram.messenger.g0.L(22.0f), m6.r1(0.06f, m6.w0(i17, resourceProvider)));
                        p6 K = t6.K(0.06f, i17);
                        editTextBoldCursor.setBackground(d02);
                        t6.j(editTextBoldCursor, d02, K, null, resourceProvider);
                        org.telegram.ui.m6 m6Var = new org.telegram.ui.m6((Object) editTextBoldCursor, b9Var, u1VarArr, view2, 15);
                        editTextBoldCursor.setOnEditorActionListener(new org.telegram.ui.Components.s0(m6Var, 0));
                        LinearLayout linearLayout2 = new LinearLayout(parentActivity);
                        linearLayout2.setOrientation(1);
                        linearLayout2.addView((View) editTextBoldCursor, ha.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
                        alertDialog$Builder6.c();
                        alertDialog$Builder6.o(linearLayout2);
                        u1Var6.f28537a = Math.min(org.telegram.messenger.g0.L(320.0f), (org.telegram.messenger.g0.f22567q.x * 85) / 100);
                        alertDialog$Builder6.k(id.M0(2131751354, null), new org.telegram.ui.Components.t(m6Var, 2));
                        alertDialog$Builder6.h(id.M0(2131752589, null), new cr(5));
                        u1VarArr[0] = u1Var6;
                        u1Var6.f28560j0 = false;
                        u1Var6.setOnDismissListener(new org.telegram.ui.Components.o0(editTextBoldCursor, 1));
                        u1VarArr[0].setOnShowListener(new org.telegram.ui.Components.t0(0, editTextBoldCursor));
                        u1VarArr[0].show();
                    }
                }
            }
        }
    }

    @Override
    public final boolean c0(x31 x31Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        Drawable mutate = context.getResources().getDrawable(2131232559).mutate();
        Drawable h = jg.g.h(context, 2131232560);
        int themedColor = getThemedColor(m6.N6);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        h.setColorFilter(new PorterDuffColorFilter(getThemedColor(m6.f28020k7), mode));
        i2 i2Var = new i2(mutate, h, 4);
        i2Var.f40384y = org.telegram.messenger.g0.L(2.0f);
        this.f51195e = i2Var;
        this.fragmentView = super.createView(context);
        this.f36518a.r1();
        this.f36518a.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        w3 w3Var;
        if (i7 == qs.R5 && (w3Var = this.f36518a) != null) {
            w3Var.f37496f3.O(true);
        }
    }

    public final void f0() {
        m41 m41Var;
        ArrayList a10 = xa.a(new ii.c(this, 18));
        if (a10 != null) {
            this.f51198r = a10.size();
            w3 w3Var = this.f36518a;
            if (w3Var != null && (m41Var = w3Var.f37496f3) != null && w3Var.G) {
                m41Var.O(true);
            }
        }
        Utilities.f21341e.c(new p5(this, 16));
    }

    @Override
    public final pj0 getListViewForSimpleGlass() {
        return this.f36518a;
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
            i2 i2Var = this.f51195e;
            if (i2Var != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                int themedColor = getThemedColor(m6.N6);
                int themedColor2 = getThemedColor(m6.f28020k7);
                if (themedColor == this.f51199s && themedColor2 == this.f51200w) {
                    return;
                }
                this.f51199s = themedColor;
                this.f51200w = themedColor2;
                Drawable drawable = i2Var.f40374a;
                if (drawable != null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                }
                Drawable drawable2 = i2Var.f40375b;
                if (drawable2 != null) {
                    drawable2.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY));
                }
                w3 w3Var = this.f36518a;
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
