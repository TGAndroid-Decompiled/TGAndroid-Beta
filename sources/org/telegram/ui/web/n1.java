package org.telegram.ui.web;

import ai.u2;
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
import bi.d6;
import bi.f5;
import c8.cb;
import c8.ma;
import fi.c2;
import hi.t6;
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
import org.telegram.messenger.w7;
import org.telegram.messenger.x10;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.j6;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.y60;
import org.telegram.ui.Components.z41;
import org.telegram.ui.Wallet.c5;
import org.telegram.ui.cr;
import org.telegram.ui.p51;
public final class n1 extends b51 implements fs {
    public c2 f53257e;
    public final x10 f53258f;
    public long h;
    public long f53259n;
    public long f53260r;
    public int f53261s;
    public int f53262w;

    public n1(org.telegram.ui.q qVar) {
        this.f53258f = qVar;
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
    public final void Z(ArrayList arrayList, z41 z41Var) {
        String str;
        ArrayList<TL_account.WebDomainException> arrayList2;
        ArrayList<TL_account.WebDomainException> arrayList3;
        boolean S2 = getMessagesController().S2();
        arrayList.size();
        String M0 = gd.M0(2131752846, null);
        l41 l41Var = new l41(9);
        l41Var.d = 1;
        l41Var.f37018m = M0;
        l41Var.L(S2);
        arrayList.add(l41Var);
        arrayList.add(l41.C(gd.M0(2131752845, null)));
        int i7 = 0;
        if (!S2) {
            getMessagesController().U2();
            l41 i10 = l41.i(17, gd.M0(2131742676, null));
            i10.L(getMessagesController().U2());
            arrayList.add(i10);
            arrayList.add(l41.C(gd.M0(2131742675, null)));
            arrayList.add(l41.u(gd.M0(2131752854, null)));
            arrayList.size();
            c2 c2Var = this.f53257e;
            String M02 = gd.M0(2131752838, null);
            l41 l41Var2 = new l41(3);
            l41Var2.d = 16;
            l41Var2.H = c2Var;
            l41Var2.f37018m = M02;
            l41Var2.f37023r = true;
            arrayList.add(l41Var2);
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
                int i11 = l1.f53233b;
                l41 K = l41.K(l1.class);
                K.f37018m = str2;
                K.f37020o = str3;
                K.C = j3;
                arrayList.add(K);
            }
            arrayList.add(l41.C(gd.M0(2131752855, null)));
            if (!arrayList3.isEmpty()) {
                arrayList.size();
                l41 e10 = l41.e(5, gd.M0(2131752837, null));
                e10.f37024s = true;
                arrayList.add(e10);
                arrayList.add(l41.C(null));
                return;
            }
            return;
        }
        arrayList.size();
        String M03 = gd.M0(2131752851, null);
        long j10 = this.f53259n;
        String str4 = "";
        if (j10 <= 0) {
            str = "";
        } else {
            str = org.telegram.messenger.g0.i0(j10, false, false);
        }
        arrayList.add(l41.d(3, 2131231777, M03, str));
        arrayList.size();
        String M04 = gd.M0(2131752853, null);
        long j11 = this.h;
        if (j11 > 0) {
            str4 = org.telegram.messenger.g0.i0(j11, false, false);
        }
        arrayList.add(l41.d(2, 2131231776, M04, str4));
        arrayList.add(l41.C(gd.M0(2131752849, null)));
        if (this.f53260r > 0) {
            arrayList.size();
            arrayList.add(l41.c(9, 2131231778, gd.M0(2131752839, null)));
            arrayList.size();
            arrayList.add(l41.d(7, 2131231776, gd.M0(2131752844, null), gd.H(',', "BrowserSettingsHistoryPages", (int) this.f53260r)));
            arrayList.add(l41.C(null));
        }
        arrayList.add(l41.u(gd.M0(2131752835, null)));
        arrayList.size();
        c2 c2Var2 = this.f53257e;
        String M05 = gd.M0(2131752838, null);
        l41 l41Var3 = new l41(3);
        l41Var3.d = 15;
        l41Var3.H = c2Var2;
        l41Var3.f37018m = M05;
        l41Var3.f37023r = true;
        arrayList.add(l41Var3);
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
            int i13 = l1.f53233b;
            l41 K2 = l41.K(l1.class);
            K2.f37018m = str5;
            K2.f37020o = str6;
            K2.C = j12;
            arrayList.add(K2);
        }
        arrayList.add(l41.C(gd.M0(2131752836, null)));
        if (!arrayList2.isEmpty()) {
            arrayList.size();
            l41 e11 = l41.e(5, gd.M0(2131752837, null));
            e11.f37024s = true;
            arrayList.add(e11);
            arrayList.add(l41.C(null));
        }
        arrayList.size();
        arrayList.add(l41.d(6, 2131232356, gd.M0(2131745604, null), e1.a().f53128a));
        arrayList.add(l41.C(gd.M0(2131752831, null)));
        boolean z10 = s2.f26723a;
    }

    @Override
    public final CharSequence a0() {
        return gd.M0(2131752830, null);
    }

    @Override
    public final void b0(l41 l41Var, View view) {
        View view2;
        int i7;
        int i10;
        boolean z10;
        int i11;
        int i12 = l41Var.d;
        if (i12 == 12) {
            bz.J();
            ((r8) view).setChecked(bz.f23206v0);
        } else if (i12 == 13) {
            bz.f23209w0 = !bz.f23209w0;
            SharedPreferences.Editor edit = mp.g1().edit();
            edit.putBoolean("onlyLocalInstantView", bz.f23209w0);
            edit.apply();
            ((r8) view).setChecked(bz.f23209w0);
        } else if (i12 == 17) {
            boolean z11 = !getMessagesController().U2();
            mp messagesController = getMessagesController();
            TL_account.TL_webBrowserSettings tL_webBrowserSettings = messagesController.E8;
            if (tL_webBrowserSettings != null) {
                messagesController.G5(tL_webBrowserSettings.open_external_browser, z11);
            }
            ((r8) view).setChecked(z11);
            this.f33530a.f34607g3.O(true);
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
                    i11 = n6.f29434f6;
                } else {
                    i11 = n6.f29415e6;
                }
                r8Var.b(n6.x0(null, i11, false), S2);
                this.f33530a.f34607g3.O(true);
            } else if (i12 == 10) {
                mp messagesController3 = getMessagesController();
                TL_account.TL_webBrowserSettings tL_webBrowserSettings3 = messagesController3.E8;
                if (tL_webBrowserSettings3 != null) {
                    messagesController3.G5(tL_webBrowserSettings3.open_external_browser, true);
                }
                this.f33530a.f34607g3.O(true);
            } else if (i12 == 11) {
                mp messagesController4 = getMessagesController();
                TL_account.TL_webBrowserSettings tL_webBrowserSettings4 = messagesController4.E8;
                if (tL_webBrowserSettings4 != null) {
                    messagesController4.G5(tL_webBrowserSettings4.open_external_browser, false);
                }
                this.f33530a.f34607g3.O(true);
            } else {
                String str = "";
                if (i12 == 2) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
                    String M0 = gd.M0(2131752853, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
                    u1Var.S = M0;
                    if (this.h != 0) {
                        str = a8.p0.s(new StringBuilder(" ("), org.telegram.messenger.g0.i0(this.h, false, false), ")");
                    }
                    u1Var.U = gd.a0(null, null, 2131752852, str);
                    alertDialog$Builder.k(gd.M0(2131752090, null), new org.telegram.ui.ActionBar.r1(this) {
                        public final n1 f53227b;

                        {
                            this.f53227b = this;
                        }

                        @Override
                        public final void h(org.telegram.ui.ActionBar.u1 u1Var2, int i13) {
                            switch (r2) {
                                case 0:
                                    n1 n1Var = this.f53227b;
                                    org.telegram.messenger.t0.f26915b.deleteDatabase("webview.db");
                                    org.telegram.messenger.t0.f26915b.deleteDatabase("webviewCache.db");
                                    WebStorage.getInstance().deleteAllData();
                                    try {
                                        WebView webView = new WebView(n1Var.getParentActivity());
                                        webView.clearCache(true);
                                        webView.clearHistory();
                                        webView.destroy();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        File file = new File(org.telegram.messenger.t0.f26915b.getApplicationInfo().dataDir, "app_webview");
                                        if (file.exists()) {
                                            n1.d0(file, Boolean.FALSE);
                                        }
                                    } catch (Exception e10) {
                                        a8.g(e10, true);
                                    }
                                    try {
                                        File file2 = new File(org.telegram.messenger.t0.f26915b.getApplicationInfo().dataDir, "cache/WebView");
                                        if (file2.exists()) {
                                            n1.d0(file2, null);
                                        }
                                    } catch (Exception e11) {
                                        a8.g(e11, true);
                                    }
                                    a2 b10 = a2.b();
                                    HashMap hashMap = b10.f53105a;
                                    if (hashMap == null) {
                                        b10.f53107c = false;
                                        b10.f53106b = true;
                                        b10.f53105a = new HashMap();
                                    } else {
                                        hashMap.clear();
                                    }
                                    b10.d();
                                    n1Var.f0();
                                    return;
                                case 1:
                                    n1 n1Var2 = this.f53227b;
                                    CookieManager cookieManager = CookieManager.getInstance();
                                    cookieManager.removeAllCookies(null);
                                    cookieManager.flush();
                                    try {
                                        File file3 = new File(org.telegram.messenger.t0.f26915b.getApplicationInfo().dataDir, "app_webview");
                                        if (file3.exists()) {
                                            n1.d0(file3, Boolean.TRUE);
                                        }
                                    } catch (Exception e12) {
                                        a8.g(e12, true);
                                    }
                                    n1Var2.f0();
                                    return;
                                case 2:
                                    n1 n1Var3 = this.f53227b;
                                    try {
                                        cb.f4519c.clear();
                                        cb.d.clear();
                                        File file4 = new File(w7.z(4), "webhistory.dat");
                                        if (file4.exists()) {
                                            file4.delete();
                                        }
                                    } catch (Exception e13) {
                                        a8.g(e13, true);
                                    }
                                    n1Var3.f53260r = 0L;
                                    n1Var3.f33530a.f34607g3.O(true);
                                    return;
                                default:
                                    n1 n1Var4 = this.f53227b;
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
                                    n1Var4.f33530a.f34607g3.O(true);
                                    return;
                            }
                        }
                    });
                    alertDialog$Builder.h(gd.M0(2131752578, null), null);
                    alertDialog$Builder.d(-1);
                    alertDialog$Builder.p();
                } else if (i12 == 3) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
                    String M02 = gd.M0(2131752851, null);
                    org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f28746a;
                    u1Var2.S = M02;
                    if (this.f53259n != 0) {
                        str = a8.p0.s(new StringBuilder(" ("), org.telegram.messenger.g0.i0(this.f53259n, false, false), ")");
                    }
                    u1Var2.U = gd.a0(null, null, 2131752850, str);
                    alertDialog$Builder2.k(gd.M0(2131752090, null), new org.telegram.ui.ActionBar.r1(this) {
                        public final n1 f53227b;

                        {
                            this.f53227b = this;
                        }

                        @Override
                        public final void h(org.telegram.ui.ActionBar.u1 u1Var22, int i13) {
                            switch (r2) {
                                case 0:
                                    n1 n1Var = this.f53227b;
                                    org.telegram.messenger.t0.f26915b.deleteDatabase("webview.db");
                                    org.telegram.messenger.t0.f26915b.deleteDatabase("webviewCache.db");
                                    WebStorage.getInstance().deleteAllData();
                                    try {
                                        WebView webView = new WebView(n1Var.getParentActivity());
                                        webView.clearCache(true);
                                        webView.clearHistory();
                                        webView.destroy();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        File file = new File(org.telegram.messenger.t0.f26915b.getApplicationInfo().dataDir, "app_webview");
                                        if (file.exists()) {
                                            n1.d0(file, Boolean.FALSE);
                                        }
                                    } catch (Exception e10) {
                                        a8.g(e10, true);
                                    }
                                    try {
                                        File file2 = new File(org.telegram.messenger.t0.f26915b.getApplicationInfo().dataDir, "cache/WebView");
                                        if (file2.exists()) {
                                            n1.d0(file2, null);
                                        }
                                    } catch (Exception e11) {
                                        a8.g(e11, true);
                                    }
                                    a2 b10 = a2.b();
                                    HashMap hashMap = b10.f53105a;
                                    if (hashMap == null) {
                                        b10.f53107c = false;
                                        b10.f53106b = true;
                                        b10.f53105a = new HashMap();
                                    } else {
                                        hashMap.clear();
                                    }
                                    b10.d();
                                    n1Var.f0();
                                    return;
                                case 1:
                                    n1 n1Var2 = this.f53227b;
                                    CookieManager cookieManager = CookieManager.getInstance();
                                    cookieManager.removeAllCookies(null);
                                    cookieManager.flush();
                                    try {
                                        File file3 = new File(org.telegram.messenger.t0.f26915b.getApplicationInfo().dataDir, "app_webview");
                                        if (file3.exists()) {
                                            n1.d0(file3, Boolean.TRUE);
                                        }
                                    } catch (Exception e12) {
                                        a8.g(e12, true);
                                    }
                                    n1Var2.f0();
                                    return;
                                case 2:
                                    n1 n1Var3 = this.f53227b;
                                    try {
                                        cb.f4519c.clear();
                                        cb.d.clear();
                                        File file4 = new File(w7.z(4), "webhistory.dat");
                                        if (file4.exists()) {
                                            file4.delete();
                                        }
                                    } catch (Exception e13) {
                                        a8.g(e13, true);
                                    }
                                    n1Var3.f53260r = 0L;
                                    n1Var3.f33530a.f34607g3.O(true);
                                    return;
                                default:
                                    n1 n1Var4 = this.f53227b;
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
                                    n1Var4.f33530a.f34607g3.O(true);
                                    return;
                            }
                        }
                    });
                    alertDialog$Builder2.h(gd.M0(2131752578, null), null);
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
                        j3 = Math.min(j3, ((w0) obj).f53388b);
                    }
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
                    String M03 = gd.M0(2131752844, null);
                    org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder3.f28746a;
                    u1Var3.S = M03;
                    u1Var3.U = gd.a0(null, null, 2131752843, gd.u(j3 / 1000, false));
                    alertDialog$Builder3.k(gd.M0(2131752090, null), new org.telegram.ui.ActionBar.r1(this) {
                        public final n1 f53227b;

                        {
                            this.f53227b = this;
                        }

                        @Override
                        public final void h(org.telegram.ui.ActionBar.u1 u1Var22, int i132) {
                            switch (r2) {
                                case 0:
                                    n1 n1Var = this.f53227b;
                                    org.telegram.messenger.t0.f26915b.deleteDatabase("webview.db");
                                    org.telegram.messenger.t0.f26915b.deleteDatabase("webviewCache.db");
                                    WebStorage.getInstance().deleteAllData();
                                    try {
                                        WebView webView = new WebView(n1Var.getParentActivity());
                                        webView.clearCache(true);
                                        webView.clearHistory();
                                        webView.destroy();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        File file = new File(org.telegram.messenger.t0.f26915b.getApplicationInfo().dataDir, "app_webview");
                                        if (file.exists()) {
                                            n1.d0(file, Boolean.FALSE);
                                        }
                                    } catch (Exception e10) {
                                        a8.g(e10, true);
                                    }
                                    try {
                                        File file2 = new File(org.telegram.messenger.t0.f26915b.getApplicationInfo().dataDir, "cache/WebView");
                                        if (file2.exists()) {
                                            n1.d0(file2, null);
                                        }
                                    } catch (Exception e11) {
                                        a8.g(e11, true);
                                    }
                                    a2 b10 = a2.b();
                                    HashMap hashMap = b10.f53105a;
                                    if (hashMap == null) {
                                        b10.f53107c = false;
                                        b10.f53106b = true;
                                        b10.f53105a = new HashMap();
                                    } else {
                                        hashMap.clear();
                                    }
                                    b10.d();
                                    n1Var.f0();
                                    return;
                                case 1:
                                    n1 n1Var2 = this.f53227b;
                                    CookieManager cookieManager = CookieManager.getInstance();
                                    cookieManager.removeAllCookies(null);
                                    cookieManager.flush();
                                    try {
                                        File file3 = new File(org.telegram.messenger.t0.f26915b.getApplicationInfo().dataDir, "app_webview");
                                        if (file3.exists()) {
                                            n1.d0(file3, Boolean.TRUE);
                                        }
                                    } catch (Exception e12) {
                                        a8.g(e12, true);
                                    }
                                    n1Var2.f0();
                                    return;
                                case 2:
                                    n1 n1Var3 = this.f53227b;
                                    try {
                                        cb.f4519c.clear();
                                        cb.d.clear();
                                        File file4 = new File(w7.z(4), "webhistory.dat");
                                        if (file4.exists()) {
                                            file4.delete();
                                        }
                                    } catch (Exception e13) {
                                        a8.g(e13, true);
                                    }
                                    n1Var3.f53260r = 0L;
                                    n1Var3.f33530a.f34607g3.O(true);
                                    return;
                                default:
                                    n1 n1Var4 = this.f53227b;
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
                                    n1Var4.f33530a.f34607g3.O(true);
                                    return;
                            }
                        }
                    });
                    alertDialog$Builder3.h(gd.M0(2131752578, null), null);
                    alertDialog$Builder3.d(-1);
                    alertDialog$Builder3.p();
                } else if (i12 == 9) {
                    x0[] x0VarArr = {null};
                    h2 x0Var = new x0(null, new p51(17, this, x0VarArr));
                    x0VarArr[0] = x0Var;
                    presentFragment(x0Var);
                } else if (i12 == 5) {
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
                    String M04 = gd.M0(2131742679, null);
                    org.telegram.ui.ActionBar.u1 u1Var4 = alertDialog$Builder4.f28746a;
                    u1Var4.S = M04;
                    u1Var4.U = gd.M0(2131742680, null);
                    alertDialog$Builder4.k(gd.M0(2131751587, null), new org.telegram.ui.ActionBar.r1(this) {
                        public final n1 f53227b;

                        {
                            this.f53227b = this;
                        }

                        @Override
                        public final void h(org.telegram.ui.ActionBar.u1 u1Var22, int i132) {
                            switch (r2) {
                                case 0:
                                    n1 n1Var = this.f53227b;
                                    org.telegram.messenger.t0.f26915b.deleteDatabase("webview.db");
                                    org.telegram.messenger.t0.f26915b.deleteDatabase("webviewCache.db");
                                    WebStorage.getInstance().deleteAllData();
                                    try {
                                        WebView webView = new WebView(n1Var.getParentActivity());
                                        webView.clearCache(true);
                                        webView.clearHistory();
                                        webView.destroy();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        File file = new File(org.telegram.messenger.t0.f26915b.getApplicationInfo().dataDir, "app_webview");
                                        if (file.exists()) {
                                            n1.d0(file, Boolean.FALSE);
                                        }
                                    } catch (Exception e10) {
                                        a8.g(e10, true);
                                    }
                                    try {
                                        File file2 = new File(org.telegram.messenger.t0.f26915b.getApplicationInfo().dataDir, "cache/WebView");
                                        if (file2.exists()) {
                                            n1.d0(file2, null);
                                        }
                                    } catch (Exception e11) {
                                        a8.g(e11, true);
                                    }
                                    a2 b10 = a2.b();
                                    HashMap hashMap = b10.f53105a;
                                    if (hashMap == null) {
                                        b10.f53107c = false;
                                        b10.f53106b = true;
                                        b10.f53105a = new HashMap();
                                    } else {
                                        hashMap.clear();
                                    }
                                    b10.d();
                                    n1Var.f0();
                                    return;
                                case 1:
                                    n1 n1Var2 = this.f53227b;
                                    CookieManager cookieManager = CookieManager.getInstance();
                                    cookieManager.removeAllCookies(null);
                                    cookieManager.flush();
                                    try {
                                        File file3 = new File(org.telegram.messenger.t0.f26915b.getApplicationInfo().dataDir, "app_webview");
                                        if (file3.exists()) {
                                            n1.d0(file3, Boolean.TRUE);
                                        }
                                    } catch (Exception e12) {
                                        a8.g(e12, true);
                                    }
                                    n1Var2.f0();
                                    return;
                                case 2:
                                    n1 n1Var3 = this.f53227b;
                                    try {
                                        cb.f4519c.clear();
                                        cb.d.clear();
                                        File file4 = new File(w7.z(4), "webhistory.dat");
                                        if (file4.exists()) {
                                            file4.delete();
                                        }
                                    } catch (Exception e13) {
                                        a8.g(e13, true);
                                    }
                                    n1Var3.f53260r = 0L;
                                    n1Var3.f33530a.f34607g3.O(true);
                                    return;
                                default:
                                    n1 n1Var4 = this.f53227b;
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
                                    n1Var4.f33530a.f34607g3.O(true);
                                    return;
                            }
                        }
                    });
                    alertDialog$Builder4.h(gd.M0(2131752578, null), null);
                    alertDialog$Builder4.d(-1);
                    alertDialog$Builder4.p();
                } else if (l41Var.H(l1.class)) {
                    m1 m1Var = (m1) view;
                    String str2 = m1Var.f53248e;
                    y60 G = y60.G((ViewGroup) this.fragmentView, null, m1Var);
                    G.f42375s = 40;
                    G.c(2131231786, gd.M0(2131746126, null), new c5(23, this, str2), false);
                    G.a0();
                } else {
                    int i14 = l41Var.d;
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
                                charSequenceArr[i15] = ((e1) b10.get(i15)).f53128a;
                                j6 j6Var = new j6(getParentActivity(), null);
                                j6Var.setPadding(org.telegram.messenger.g0.L(4.0f), r62, org.telegram.messenger.g0.L(4.0f), r62);
                                j6Var.a(n6.x0(null, n6.f29452g7, r62), n6.x0(null, n6.E5, r62));
                                CharSequence charSequence = charSequenceArr[i15];
                                if (i15 == bz.f23189p0) {
                                    z10 = true;
                                } else {
                                    z10 = r62;
                                }
                                j6Var.b(charSequence, z10);
                                int i16 = n6.f29488i6;
                                org.telegram.ui.Cells.y h02 = n6.h0(n6.x0(null, i16, r62), 2, -1);
                                q6 M = u6.M(i16);
                                j6Var.setBackground(h02);
                                u6.j(j6Var, h02, null, M, null);
                                linearLayout.addView(j6Var);
                                j6Var.setOnClickListener(new f5(i15, view, atomicReference));
                                i15++;
                                r62 = 0;
                            }
                            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(getParentActivity());
                            String M05 = gd.M0(2131745604, null);
                            org.telegram.ui.ActionBar.u1 u1Var5 = alertDialog$Builder5.f28746a;
                            u1Var5.S = M05;
                            alertDialog$Builder5.o(linearLayout);
                            alertDialog$Builder5.h(gd.M0(2131752578, null), null);
                            atomicReference.set(u1Var5);
                            showDialog(u1Var5);
                        }
                    } else if (i14 != 15 && i14 != 16) {
                    } else {
                        boolean S22 = getMessagesController().S2();
                        if (getMessagesController().R2(S22)) {
                            b5.r0(this, gd.M0(2131742677, null), gd.M0(2131742678, null), null);
                            return;
                        }
                        Activity parentActivity = getParentActivity();
                        i6 resourceProvider = getResourceProvider();
                        u2 u2Var = new u2(11, this, S22);
                        Pattern pattern = b5.f33529a;
                        Activity W = org.telegram.messenger.g0.W(parentActivity);
                        if (W != null) {
                            view2 = W.getCurrentFocus();
                        } else {
                            view2 = null;
                        }
                        org.telegram.ui.ActionBar.u1[] u1VarArr = new org.telegram.ui.ActionBar.u1[1];
                        AlertDialog$Builder alertDialog$Builder6 = new AlertDialog$Builder(0, parentActivity, resourceProvider);
                        if (S22) {
                            i7 = 2131752857;
                        } else {
                            i7 = 2131752856;
                        }
                        String M06 = gd.M0(i7, null);
                        org.telegram.ui.ActionBar.u1 u1Var6 = alertDialog$Builder6.f28746a;
                        u1Var6.S = M06;
                        if (S22) {
                            i10 = 2131752859;
                        } else {
                            i10 = 2131752858;
                        }
                        u1Var6.U = gd.M0(i10, null);
                        ?? editTextBoldCursor = new EditTextBoldCursor(parentActivity);
                        editTextBoldCursor.setTextSize(1, 16.0f);
                        int i17 = n6.f29504j5;
                        u6.U(editTextBoldCursor, i17, resourceProvider);
                        u6.D(editTextBoldCursor, n6.Oi, resourceProvider);
                        editTextBoldCursor.setHint(gd.M0(2131752860, null));
                        editTextBoldCursor.setInputType(17);
                        editTextBoldCursor.setImeOptions(6);
                        editTextBoldCursor.setSingleLine(true);
                        editTextBoldCursor.setFocusable(true);
                        editTextBoldCursor.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(13.0f));
                        editTextBoldCursor.setCursorWidth(1.5f);
                        editTextBoldCursor.A(n6.f29636q6, resourceProvider);
                        ShapeDrawable d02 = n6.d0(org.telegram.messenger.g0.L(22.0f), n6.r1(0.06f, n6.w0(i17, resourceProvider)));
                        q6 K = u6.K(0.06f, i17);
                        editTextBoldCursor.setBackground(d02);
                        u6.j(editTextBoldCursor, d02, K, null, resourceProvider);
                        org.telegram.messenger.camera.i iVar = new org.telegram.messenger.camera.i(editTextBoldCursor, u2Var, u1VarArr, view2, 20);
                        editTextBoldCursor.setOnEditorActionListener(new org.telegram.ui.Components.g(iVar, 1));
                        LinearLayout linearLayout2 = new LinearLayout(parentActivity);
                        linearLayout2.setOrientation(1);
                        linearLayout2.addView((View) editTextBoldCursor, ma.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
                        alertDialog$Builder6.c();
                        alertDialog$Builder6.o(linearLayout2);
                        u1Var6.f30026a = Math.min(org.telegram.messenger.g0.L(320.0f), (org.telegram.messenger.g0.f24121q.x * 85) / 100);
                        alertDialog$Builder6.k(gd.M0(2131751343, null), new org.telegram.ui.Components.b0(iVar, 2));
                        alertDialog$Builder6.h(gd.M0(2131752578, null), new cr(10));
                        u1VarArr[0] = u1Var6;
                        u1Var6.f30051k0 = false;
                        u1Var6.setOnDismissListener(new org.telegram.ui.Components.y0(editTextBoldCursor, 1));
                        u1VarArr[0].setOnShowListener(new org.telegram.ui.Components.c1(0, editTextBoldCursor));
                        u1VarArr[0].show();
                    }
                }
            }
        }
    }

    @Override
    public final boolean c0(l41 l41Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        Drawable mutate = context.getResources().getDrawable(2131232561).mutate();
        Drawable g10 = i5.c.g(context, 2131232562);
        int themedColor = getThemedColor(n6.N6);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        g10.setColorFilter(new PorterDuffColorFilter(getThemedColor(n6.f29526k7), mode));
        c2 c2Var = new c2(mutate, g10, 4);
        c2Var.f37617y = org.telegram.messenger.g0.L(2.0f);
        this.f53257e = c2Var;
        this.fragmentView = super.createView(context);
        this.f33530a.r1();
        this.f33530a.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        d6 d6Var;
        if (i7 == ks.T5 && (d6Var = this.f33530a) != null) {
            d6Var.f34607g3.O(true);
        }
    }

    public final void f0() {
        z41 z41Var;
        ArrayList a10 = cb.a(new t6(this, 24));
        if (a10 != null) {
            this.f53260r = a10.size();
            d6 d6Var = this.f33530a;
            if (d6Var != null && (z41Var = d6Var.f34607g3) != null && d6Var.H) {
                z41Var.O(true);
            }
        }
        Utilities.f22782e.c(new z0(this, 2));
    }

    @Override
    public final ck0 getListViewForSimpleGlass() {
        return this.f33530a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        f0();
        getNotificationCenter().c(this, ks.T5);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, ks.T5);
    }

    @Override
    public final void onThemeColorsChanged() {
        boolean z10;
        super.onThemeColorsChanged();
        try {
            c2 c2Var = this.f53257e;
            if (c2Var != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int themedColor = getThemedColor(n6.N6);
                int themedColor2 = getThemedColor(n6.f29526k7);
                if (themedColor == this.f53261s && themedColor2 == this.f53262w) {
                    return;
                }
                this.f53261s = themedColor;
                this.f53262w = themedColor2;
                Drawable drawable = c2Var.f37607a;
                if (drawable != null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                }
                Drawable drawable2 = c2Var.f37608b;
                if (drawable2 != null) {
                    drawable2.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY));
                }
                d6 d6Var = this.f33530a;
                if (d6Var != null) {
                    d6Var.g1();
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
