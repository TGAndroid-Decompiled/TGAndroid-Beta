package org.telegram.ui.web;

import ai.h3;
import ai.h4;
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
import b8.mf;
import b8.xf;
import ci.b8;
import ei.m2;
import gi.j8;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.r2;
import org.telegram.messenger.u10;
import org.telegram.messenger.w7;
import org.telegram.messenger.wk;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.d4;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.i6;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.h41;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.e51;
import org.telegram.ui.hc1;
public final class m1 extends h41 implements cs {
    public m2 f50949e;
    public final u10 f50950f;
    public long h;
    public long f50951n;
    public long f50952r;
    public int f50953s;
    public int f50954w;

    public m1(org.telegram.ui.q qVar) {
        this.f50950f = qVar;
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
        long j10 = 0;
        if (file == null || !file.exists()) {
            return 0L;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    j10 += e0(file2, bool);
                }
                return j10;
            }
        } else if (bool == null || bool.booleanValue() == file.getName().startsWith("Cookies")) {
            return file.length();
        }
        return 0L;
    }

    @Override
    public final void Z(ArrayList arrayList, f41 f41Var) {
        String str;
        ArrayList<TL_account.WebDomainException> arrayList2;
        ArrayList<TL_account.WebDomainException> arrayList3;
        boolean M2 = getMessagesController().M2();
        arrayList.size();
        String M0 = bd.M0(2131752857, null);
        r31 r31Var = new r31(9);
        r31Var.d = 1;
        r31Var.f37627l = M0;
        r31Var.L(M2);
        arrayList.add(r31Var);
        arrayList.add(r31.C(bd.M0(2131752856, null)));
        int i3 = 0;
        if (!M2) {
            getMessagesController().O2();
            r31 i10 = r31.i(17, bd.M0(2131742944, null));
            i10.L(getMessagesController().O2());
            arrayList.add(i10);
            arrayList.add(r31.C(bd.M0(2131742943, null)));
            arrayList.add(r31.u(bd.M0(2131752865, null)));
            arrayList.size();
            m2 m2Var = this.f50949e;
            String M02 = bd.M0(2131752849, null);
            r31 r31Var2 = new r31(3);
            r31Var2.d = 16;
            r31Var2.G = m2Var;
            r31Var2.f37627l = M02;
            r31Var2.f37632q = true;
            arrayList.add(r31Var2);
            TL_account.TL_webBrowserSettings tL_webBrowserSettings = getMessagesController().f23178y8;
            if (tL_webBrowserSettings == null) {
                arrayList3 = new ArrayList<>();
            } else {
                arrayList3 = tL_webBrowserSettings.inapp_exceptions;
            }
            int size = arrayList3.size();
            while (i3 < size) {
                TL_account.WebDomainException webDomainException = arrayList3.get(i3);
                i3++;
                TL_account.WebDomainException webDomainException2 = webDomainException;
                String str2 = webDomainException2.domain;
                String str3 = webDomainException2.title;
                long j10 = webDomainException2.favicon;
                int i11 = k1.f50924b;
                r31 K = r31.K(k1.class);
                K.f37627l = str2;
                K.f37629n = str3;
                K.B = j10;
                arrayList.add(K);
            }
            arrayList.add(r31.C(bd.M0(2131752866, null)));
            if (!arrayList3.isEmpty()) {
                arrayList.size();
                r31 e10 = r31.e(5, bd.M0(2131752848, null));
                e10.f37633r = true;
                arrayList.add(e10);
                arrayList.add(r31.C(null));
                return;
            }
            return;
        }
        arrayList.size();
        String M03 = bd.M0(2131752862, null);
        long j11 = this.f50951n;
        String str4 = "";
        if (j11 <= 0) {
            str = "";
        } else {
            str = org.telegram.messenger.g0.i0(j11, false, false);
        }
        arrayList.add(r31.d(3, 2131231776, M03, str));
        arrayList.size();
        String M04 = bd.M0(2131752864, null);
        long j12 = this.h;
        if (j12 > 0) {
            str4 = org.telegram.messenger.g0.i0(j12, false, false);
        }
        arrayList.add(r31.d(2, 2131231775, M04, str4));
        arrayList.add(r31.C(bd.M0(2131752860, null)));
        if (this.f50952r > 0) {
            arrayList.size();
            arrayList.add(r31.c(9, 2131231777, bd.M0(2131752850, null)));
            arrayList.size();
            arrayList.add(r31.d(7, 2131231775, bd.M0(2131752855, null), bd.H(',', "BrowserSettingsHistoryPages", (int) this.f50952r)));
            arrayList.add(r31.C(null));
        }
        arrayList.add(r31.u(bd.M0(2131752846, null)));
        arrayList.size();
        m2 m2Var2 = this.f50949e;
        String M05 = bd.M0(2131752849, null);
        r31 r31Var3 = new r31(3);
        r31Var3.d = 15;
        r31Var3.G = m2Var2;
        r31Var3.f37627l = M05;
        r31Var3.f37632q = true;
        arrayList.add(r31Var3);
        TL_account.TL_webBrowserSettings tL_webBrowserSettings2 = getMessagesController().f23178y8;
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
            long j13 = webDomainException4.favicon;
            int i13 = k1.f50924b;
            r31 K2 = r31.K(k1.class);
            K2.f37627l = str5;
            K2.f37629n = str6;
            K2.B = j13;
            arrayList.add(K2);
        }
        arrayList.add(r31.C(bd.M0(2131752847, null)));
        if (!arrayList2.isEmpty()) {
            arrayList.size();
            r31 e11 = r31.e(5, bd.M0(2131752848, null));
            e11.f37633r = true;
            arrayList.add(e11);
            arrayList.add(r31.C(null));
        }
        arrayList.size();
        arrayList.add(r31.d(6, 2131232354, bd.M0(2131745809, null), d1.a().f50829a));
        arrayList.add(r31.C(bd.M0(2131752842, null)));
        boolean z10 = r2.f25040a;
    }

    @Override
    public final CharSequence a0() {
        return bd.M0(2131752841, null);
    }

    @Override
    public final void b0(r31 r31Var, View view) {
        View view2;
        int i3;
        int i10;
        boolean z10;
        int i11;
        int i12 = r31Var.d;
        if (i12 == 12) {
            az.J();
            ((q8) view).setChecked(az.f21670v0);
        } else if (i12 == 13) {
            az.f21673w0 = !az.f21673w0;
            SharedPreferences.Editor edit = hp.e1().edit();
            edit.putBoolean("onlyLocalInstantView", az.f21673w0);
            edit.apply();
            ((q8) view).setChecked(az.f21673w0);
        } else if (i12 == 17) {
            boolean z11 = !getMessagesController().O2();
            hp messagesController = getMessagesController();
            TL_account.TL_webBrowserSettings tL_webBrowserSettings = messagesController.f23178y8;
            if (tL_webBrowserSettings != null) {
                messagesController.u5(tL_webBrowserSettings.open_external_browser, z11);
            }
            ((q8) view).setChecked(z11);
            this.f34298a.f35594g3.O(true);
        } else if (i12 == 1) {
            hp messagesController2 = getMessagesController();
            TL_account.TL_webBrowserSettings tL_webBrowserSettings2 = messagesController2.f23178y8;
            if (tL_webBrowserSettings2 != null) {
                messagesController2.u5(!tL_webBrowserSettings2.open_external_browser, tL_webBrowserSettings2.display_close_button);
            }
            boolean M2 = getMessagesController().M2();
            q8 q8Var = (q8) view;
            q8Var.setChecked(M2);
            if (M2) {
                i11 = k6.f27917f6;
            } else {
                i11 = k6.f27898e6;
            }
            q8Var.b(k6.x0(null, i11, false), M2);
            this.f34298a.f35594g3.O(true);
        } else if (i12 == 10) {
            hp messagesController3 = getMessagesController();
            TL_account.TL_webBrowserSettings tL_webBrowserSettings3 = messagesController3.f23178y8;
            if (tL_webBrowserSettings3 != null) {
                messagesController3.u5(tL_webBrowserSettings3.open_external_browser, true);
            }
            this.f34298a.f35594g3.O(true);
        } else if (i12 == 11) {
            hp messagesController4 = getMessagesController();
            TL_account.TL_webBrowserSettings tL_webBrowserSettings4 = messagesController4.f23178y8;
            if (tL_webBrowserSettings4 != null) {
                messagesController4.u5(tL_webBrowserSettings4.open_external_browser, false);
            }
            this.f34298a.f35594g3.O(true);
        } else {
            String str = "";
            if (i12 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
                String M0 = bd.M0(2131752864, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                s1Var.S = M0;
                if (this.h != 0) {
                    str = a1.g.s(new StringBuilder(" ("), org.telegram.messenger.g0.i0(this.h, false, false), ")");
                }
                s1Var.U = bd.a0(null, null, 2131752863, str);
                alertDialog$Builder.k(bd.M0(2131752101, null), new org.telegram.ui.ActionBar.p1(this) {
                    public final m1 f50917b;

                    {
                        this.f50917b = this;
                    }

                    @Override
                    public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i13) {
                        switch (r2) {
                            case 0:
                                m1 m1Var = this.f50917b;
                                org.telegram.messenger.t0.f25457b.deleteDatabase("webview.db");
                                org.telegram.messenger.t0.f25457b.deleteDatabase("webviewCache.db");
                                WebStorage.getInstance().deleteAllData();
                                try {
                                    WebView webView = new WebView(m1Var.getParentActivity());
                                    webView.clearCache(true);
                                    webView.clearHistory();
                                    webView.destroy();
                                } catch (Exception unused) {
                                }
                                try {
                                    File file = new File(org.telegram.messenger.t0.f25457b.getApplicationInfo().dataDir, "app_webview");
                                    if (file.exists()) {
                                        m1.d0(file, Boolean.FALSE);
                                    }
                                } catch (Exception e10) {
                                    a8.g(e10, true);
                                }
                                try {
                                    File file2 = new File(org.telegram.messenger.t0.f25457b.getApplicationInfo().dataDir, "cache/WebView");
                                    if (file2.exists()) {
                                        m1.d0(file2, null);
                                    }
                                } catch (Exception e11) {
                                    a8.g(e11, true);
                                }
                                z1 b10 = z1.b();
                                HashMap hashMap = b10.f51134a;
                                if (hashMap == null) {
                                    b10.f51136c = false;
                                    b10.f51135b = true;
                                    b10.f51134a = new HashMap();
                                } else {
                                    hashMap.clear();
                                }
                                b10.d();
                                m1Var.f0();
                                return;
                            case 1:
                                m1 m1Var2 = this.f50917b;
                                CookieManager cookieManager = CookieManager.getInstance();
                                cookieManager.removeAllCookies(null);
                                cookieManager.flush();
                                try {
                                    File file3 = new File(org.telegram.messenger.t0.f25457b.getApplicationInfo().dataDir, "app_webview");
                                    if (file3.exists()) {
                                        m1.d0(file3, Boolean.TRUE);
                                    }
                                } catch (Exception e12) {
                                    a8.g(e12, true);
                                }
                                m1Var2.f0();
                                return;
                            case 2:
                                m1 m1Var3 = this.f50917b;
                                try {
                                    xf.f3128c.clear();
                                    xf.d.clear();
                                    File file4 = new File(w7.z(4), "webhistory.dat");
                                    if (file4.exists()) {
                                        file4.delete();
                                    }
                                } catch (Exception e13) {
                                    a8.g(e13, true);
                                }
                                m1Var3.f50952r = 0L;
                                m1Var3.f34298a.f35594g3.O(true);
                                return;
                            default:
                                m1 m1Var4 = this.f50917b;
                                hp messagesController5 = m1Var4.getMessagesController();
                                TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.f23178y8;
                                if (tL_webBrowserSettings5 != null) {
                                    tL_webBrowserSettings5.open_external_browser = true;
                                    tL_webBrowserSettings5.display_close_button = true;
                                    tL_webBrowserSettings5.external_exceptions.clear();
                                    messagesController5.f23178y8.inapp_exceptions.clear();
                                    messagesController5.Q4(messagesController5.f23178y8);
                                }
                                messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new c3.b(1), new wk(messagesController5, 6));
                                m1Var4.f34298a.f35594g3.O(true);
                                return;
                        }
                    }
                });
                alertDialog$Builder.h(bd.M0(2131752589, null), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
            } else if (i12 == 3) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
                String M02 = bd.M0(2131752862, null);
                org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.f27343a;
                s1Var2.S = M02;
                if (this.f50951n != 0) {
                    str = a1.g.s(new StringBuilder(" ("), org.telegram.messenger.g0.i0(this.f50951n, false, false), ")");
                }
                s1Var2.U = bd.a0(null, null, 2131752861, str);
                alertDialog$Builder2.k(bd.M0(2131752101, null), new org.telegram.ui.ActionBar.p1(this) {
                    public final m1 f50917b;

                    {
                        this.f50917b = this;
                    }

                    @Override
                    public final void g(org.telegram.ui.ActionBar.s1 s1Var22, int i13) {
                        switch (r2) {
                            case 0:
                                m1 m1Var = this.f50917b;
                                org.telegram.messenger.t0.f25457b.deleteDatabase("webview.db");
                                org.telegram.messenger.t0.f25457b.deleteDatabase("webviewCache.db");
                                WebStorage.getInstance().deleteAllData();
                                try {
                                    WebView webView = new WebView(m1Var.getParentActivity());
                                    webView.clearCache(true);
                                    webView.clearHistory();
                                    webView.destroy();
                                } catch (Exception unused) {
                                }
                                try {
                                    File file = new File(org.telegram.messenger.t0.f25457b.getApplicationInfo().dataDir, "app_webview");
                                    if (file.exists()) {
                                        m1.d0(file, Boolean.FALSE);
                                    }
                                } catch (Exception e10) {
                                    a8.g(e10, true);
                                }
                                try {
                                    File file2 = new File(org.telegram.messenger.t0.f25457b.getApplicationInfo().dataDir, "cache/WebView");
                                    if (file2.exists()) {
                                        m1.d0(file2, null);
                                    }
                                } catch (Exception e11) {
                                    a8.g(e11, true);
                                }
                                z1 b10 = z1.b();
                                HashMap hashMap = b10.f51134a;
                                if (hashMap == null) {
                                    b10.f51136c = false;
                                    b10.f51135b = true;
                                    b10.f51134a = new HashMap();
                                } else {
                                    hashMap.clear();
                                }
                                b10.d();
                                m1Var.f0();
                                return;
                            case 1:
                                m1 m1Var2 = this.f50917b;
                                CookieManager cookieManager = CookieManager.getInstance();
                                cookieManager.removeAllCookies(null);
                                cookieManager.flush();
                                try {
                                    File file3 = new File(org.telegram.messenger.t0.f25457b.getApplicationInfo().dataDir, "app_webview");
                                    if (file3.exists()) {
                                        m1.d0(file3, Boolean.TRUE);
                                    }
                                } catch (Exception e12) {
                                    a8.g(e12, true);
                                }
                                m1Var2.f0();
                                return;
                            case 2:
                                m1 m1Var3 = this.f50917b;
                                try {
                                    xf.f3128c.clear();
                                    xf.d.clear();
                                    File file4 = new File(w7.z(4), "webhistory.dat");
                                    if (file4.exists()) {
                                        file4.delete();
                                    }
                                } catch (Exception e13) {
                                    a8.g(e13, true);
                                }
                                m1Var3.f50952r = 0L;
                                m1Var3.f34298a.f35594g3.O(true);
                                return;
                            default:
                                m1 m1Var4 = this.f50917b;
                                hp messagesController5 = m1Var4.getMessagesController();
                                TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.f23178y8;
                                if (tL_webBrowserSettings5 != null) {
                                    tL_webBrowserSettings5.open_external_browser = true;
                                    tL_webBrowserSettings5.display_close_button = true;
                                    tL_webBrowserSettings5.external_exceptions.clear();
                                    messagesController5.f23178y8.inapp_exceptions.clear();
                                    messagesController5.Q4(messagesController5.f23178y8);
                                }
                                messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new c3.b(1), new wk(messagesController5, 6));
                                m1Var4.f34298a.f35594g3.O(true);
                                return;
                        }
                    }
                });
                alertDialog$Builder2.h(bd.M0(2131752589, null), null);
                alertDialog$Builder2.d(-1);
                alertDialog$Builder2.p();
            } else if (i12 == 7) {
                ArrayList a10 = xf.a(null);
                int size = a10.size();
                long j10 = Long.MAX_VALUE;
                int i13 = 0;
                while (i13 < size) {
                    Object obj = a10.get(i13);
                    i13++;
                    j10 = Math.min(j10, ((x0) obj).f51103b);
                }
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
                String M03 = bd.M0(2131752855, null);
                org.telegram.ui.ActionBar.s1 s1Var3 = alertDialog$Builder3.f27343a;
                s1Var3.S = M03;
                s1Var3.U = bd.a0(null, null, 2131752854, bd.u(j10 / 1000, false));
                alertDialog$Builder3.k(bd.M0(2131752101, null), new org.telegram.ui.ActionBar.p1(this) {
                    public final m1 f50917b;

                    {
                        this.f50917b = this;
                    }

                    @Override
                    public final void g(org.telegram.ui.ActionBar.s1 s1Var22, int i132) {
                        switch (r2) {
                            case 0:
                                m1 m1Var = this.f50917b;
                                org.telegram.messenger.t0.f25457b.deleteDatabase("webview.db");
                                org.telegram.messenger.t0.f25457b.deleteDatabase("webviewCache.db");
                                WebStorage.getInstance().deleteAllData();
                                try {
                                    WebView webView = new WebView(m1Var.getParentActivity());
                                    webView.clearCache(true);
                                    webView.clearHistory();
                                    webView.destroy();
                                } catch (Exception unused) {
                                }
                                try {
                                    File file = new File(org.telegram.messenger.t0.f25457b.getApplicationInfo().dataDir, "app_webview");
                                    if (file.exists()) {
                                        m1.d0(file, Boolean.FALSE);
                                    }
                                } catch (Exception e10) {
                                    a8.g(e10, true);
                                }
                                try {
                                    File file2 = new File(org.telegram.messenger.t0.f25457b.getApplicationInfo().dataDir, "cache/WebView");
                                    if (file2.exists()) {
                                        m1.d0(file2, null);
                                    }
                                } catch (Exception e11) {
                                    a8.g(e11, true);
                                }
                                z1 b10 = z1.b();
                                HashMap hashMap = b10.f51134a;
                                if (hashMap == null) {
                                    b10.f51136c = false;
                                    b10.f51135b = true;
                                    b10.f51134a = new HashMap();
                                } else {
                                    hashMap.clear();
                                }
                                b10.d();
                                m1Var.f0();
                                return;
                            case 1:
                                m1 m1Var2 = this.f50917b;
                                CookieManager cookieManager = CookieManager.getInstance();
                                cookieManager.removeAllCookies(null);
                                cookieManager.flush();
                                try {
                                    File file3 = new File(org.telegram.messenger.t0.f25457b.getApplicationInfo().dataDir, "app_webview");
                                    if (file3.exists()) {
                                        m1.d0(file3, Boolean.TRUE);
                                    }
                                } catch (Exception e12) {
                                    a8.g(e12, true);
                                }
                                m1Var2.f0();
                                return;
                            case 2:
                                m1 m1Var3 = this.f50917b;
                                try {
                                    xf.f3128c.clear();
                                    xf.d.clear();
                                    File file4 = new File(w7.z(4), "webhistory.dat");
                                    if (file4.exists()) {
                                        file4.delete();
                                    }
                                } catch (Exception e13) {
                                    a8.g(e13, true);
                                }
                                m1Var3.f50952r = 0L;
                                m1Var3.f34298a.f35594g3.O(true);
                                return;
                            default:
                                m1 m1Var4 = this.f50917b;
                                hp messagesController5 = m1Var4.getMessagesController();
                                TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.f23178y8;
                                if (tL_webBrowserSettings5 != null) {
                                    tL_webBrowserSettings5.open_external_browser = true;
                                    tL_webBrowserSettings5.display_close_button = true;
                                    tL_webBrowserSettings5.external_exceptions.clear();
                                    messagesController5.f23178y8.inapp_exceptions.clear();
                                    messagesController5.Q4(messagesController5.f23178y8);
                                }
                                messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new c3.b(1), new wk(messagesController5, 6));
                                m1Var4.f34298a.f35594g3.O(true);
                                return;
                        }
                    }
                });
                alertDialog$Builder3.h(bd.M0(2131752589, null), null);
                alertDialog$Builder3.d(-1);
                alertDialog$Builder3.p();
            } else if (i12 == 9) {
                y0[] y0VarArr = {null};
                d2 y0Var = new y0(null, new e51(16, this, y0VarArr));
                y0VarArr[0] = y0Var;
                presentFragment(y0Var);
            } else if (i12 == 5) {
                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
                String M04 = bd.M0(2131742947, null);
                org.telegram.ui.ActionBar.s1 s1Var4 = alertDialog$Builder4.f27343a;
                s1Var4.S = M04;
                s1Var4.U = bd.M0(2131742948, null);
                alertDialog$Builder4.k(bd.M0(2131751599, null), new org.telegram.ui.ActionBar.p1(this) {
                    public final m1 f50917b;

                    {
                        this.f50917b = this;
                    }

                    @Override
                    public final void g(org.telegram.ui.ActionBar.s1 s1Var22, int i132) {
                        switch (r2) {
                            case 0:
                                m1 m1Var = this.f50917b;
                                org.telegram.messenger.t0.f25457b.deleteDatabase("webview.db");
                                org.telegram.messenger.t0.f25457b.deleteDatabase("webviewCache.db");
                                WebStorage.getInstance().deleteAllData();
                                try {
                                    WebView webView = new WebView(m1Var.getParentActivity());
                                    webView.clearCache(true);
                                    webView.clearHistory();
                                    webView.destroy();
                                } catch (Exception unused) {
                                }
                                try {
                                    File file = new File(org.telegram.messenger.t0.f25457b.getApplicationInfo().dataDir, "app_webview");
                                    if (file.exists()) {
                                        m1.d0(file, Boolean.FALSE);
                                    }
                                } catch (Exception e10) {
                                    a8.g(e10, true);
                                }
                                try {
                                    File file2 = new File(org.telegram.messenger.t0.f25457b.getApplicationInfo().dataDir, "cache/WebView");
                                    if (file2.exists()) {
                                        m1.d0(file2, null);
                                    }
                                } catch (Exception e11) {
                                    a8.g(e11, true);
                                }
                                z1 b10 = z1.b();
                                HashMap hashMap = b10.f51134a;
                                if (hashMap == null) {
                                    b10.f51136c = false;
                                    b10.f51135b = true;
                                    b10.f51134a = new HashMap();
                                } else {
                                    hashMap.clear();
                                }
                                b10.d();
                                m1Var.f0();
                                return;
                            case 1:
                                m1 m1Var2 = this.f50917b;
                                CookieManager cookieManager = CookieManager.getInstance();
                                cookieManager.removeAllCookies(null);
                                cookieManager.flush();
                                try {
                                    File file3 = new File(org.telegram.messenger.t0.f25457b.getApplicationInfo().dataDir, "app_webview");
                                    if (file3.exists()) {
                                        m1.d0(file3, Boolean.TRUE);
                                    }
                                } catch (Exception e12) {
                                    a8.g(e12, true);
                                }
                                m1Var2.f0();
                                return;
                            case 2:
                                m1 m1Var3 = this.f50917b;
                                try {
                                    xf.f3128c.clear();
                                    xf.d.clear();
                                    File file4 = new File(w7.z(4), "webhistory.dat");
                                    if (file4.exists()) {
                                        file4.delete();
                                    }
                                } catch (Exception e13) {
                                    a8.g(e13, true);
                                }
                                m1Var3.f50952r = 0L;
                                m1Var3.f34298a.f35594g3.O(true);
                                return;
                            default:
                                m1 m1Var4 = this.f50917b;
                                hp messagesController5 = m1Var4.getMessagesController();
                                TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.f23178y8;
                                if (tL_webBrowserSettings5 != null) {
                                    tL_webBrowserSettings5.open_external_browser = true;
                                    tL_webBrowserSettings5.display_close_button = true;
                                    tL_webBrowserSettings5.external_exceptions.clear();
                                    messagesController5.f23178y8.inapp_exceptions.clear();
                                    messagesController5.Q4(messagesController5.f23178y8);
                                }
                                messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new c3.b(1), new wk(messagesController5, 6));
                                m1Var4.f34298a.f35594g3.O(true);
                                return;
                        }
                    }
                });
                alertDialog$Builder4.h(bd.M0(2131752589, null), null);
                alertDialog$Builder4.d(-1);
                alertDialog$Builder4.p();
            } else if (r31Var.H(k1.class)) {
                l1 l1Var = (l1) view;
                String str2 = l1Var.f50942e;
                f60 F = f60.F((ViewGroup) this.fragmentView, null, l1Var);
                F.f33747s = 40;
                F.c(2131231785, bd.M0(2131746329, null), new hc1(10, this, str2), false);
                F.Z();
            } else {
                int i14 = r31Var.d;
                if (i14 == 6) {
                    if (getParentActivity() != null) {
                        AtomicReference atomicReference = new AtomicReference();
                        LinearLayout linearLayout = new LinearLayout(getParentActivity());
                        linearLayout.setOrientation(1);
                        ArrayList b10 = d1.b();
                        int size2 = b10.size();
                        CharSequence[] charSequenceArr = new CharSequence[size2];
                        for (int i15 = 0; i15 < size2; i15++) {
                            charSequenceArr[i15] = ((d1) b10.get(i15)).f50829a;
                            i6 i6Var = new i6(getParentActivity(), null);
                            i6Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                            i6Var.a(k6.x0(null, k6.g7, false), k6.x0(null, k6.E5, false));
                            CharSequence charSequence = charSequenceArr[i15];
                            if (i15 == az.f21653p0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            i6Var.b(charSequence, z10);
                            int i16 = k6.f27972i6;
                            org.telegram.ui.Cells.y h02 = k6.h0(k6.x0(null, i16, false), 2, -1);
                            n6 N = r6.N(i16);
                            i6Var.setBackground(h02);
                            r6.k(i6Var, h02, null, N, null);
                            linearLayout.addView(i6Var);
                            i6Var.setOnClickListener(new h3(i15, view, atomicReference));
                        }
                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(getParentActivity());
                        String M05 = bd.M0(2131745809, null);
                        org.telegram.ui.ActionBar.s1 s1Var5 = alertDialog$Builder5.f27343a;
                        s1Var5.S = M05;
                        alertDialog$Builder5.o(linearLayout);
                        alertDialog$Builder5.h(bd.M0(2131752589, null), null);
                        atomicReference.set(s1Var5);
                        showDialog(s1Var5);
                    }
                } else if (i14 == 15 || i14 == 16) {
                    boolean M22 = getMessagesController().M2();
                    if (getMessagesController().L2(M22)) {
                        t4.t0(this, bd.M0(2131742945, null), bd.M0(2131742946, null), null);
                        return;
                    }
                    Activity parentActivity = getParentActivity();
                    e6 resourceProvider = getResourceProvider();
                    b8 b8Var = new b8(10, this, M22);
                    Pattern pattern = t4.f38241a;
                    Activity W = org.telegram.messenger.g0.W(parentActivity);
                    if (W != null) {
                        view2 = W.getCurrentFocus();
                    } else {
                        view2 = null;
                    }
                    org.telegram.ui.ActionBar.s1[] s1VarArr = new org.telegram.ui.ActionBar.s1[1];
                    AlertDialog$Builder alertDialog$Builder6 = new AlertDialog$Builder(0, parentActivity, resourceProvider);
                    if (M22) {
                        i3 = 2131752868;
                    } else {
                        i3 = 2131752867;
                    }
                    String M06 = bd.M0(i3, null);
                    org.telegram.ui.ActionBar.s1 s1Var6 = alertDialog$Builder6.f27343a;
                    s1Var6.S = M06;
                    if (M22) {
                        i10 = 2131752870;
                    } else {
                        i10 = 2131752869;
                    }
                    s1Var6.U = bd.M0(i10, null);
                    ?? editTextBoldCursor = new EditTextBoldCursor(parentActivity);
                    editTextBoldCursor.setTextSize(1, 16.0f);
                    int i17 = k6.f27988j5;
                    r6.V(editTextBoldCursor, i17, resourceProvider);
                    r6.E(editTextBoldCursor, k6.Li, resourceProvider);
                    editTextBoldCursor.setHint(bd.M0(2131752871, null));
                    editTextBoldCursor.setInputType(17);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setSingleLine(true);
                    editTextBoldCursor.setFocusable(true);
                    editTextBoldCursor.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(13.0f));
                    editTextBoldCursor.setCursorWidth(1.5f);
                    editTextBoldCursor.z(k6.f28121q6, resourceProvider);
                    ShapeDrawable d02 = k6.d0(org.telegram.messenger.g0.L(22.0f), k6.r1(0.06f, k6.w0(i17, resourceProvider)));
                    n6 L = r6.L(0.06f, i17);
                    editTextBoldCursor.setBackground(d02);
                    r6.k(editTextBoldCursor, d02, L, null, resourceProvider);
                    o4.b1 b1Var = new o4.b1(editTextBoldCursor, b8Var, s1VarArr, view2, 21);
                    editTextBoldCursor.setOnEditorActionListener(new org.telegram.ui.Components.s0(b1Var, 0));
                    LinearLayout linearLayout2 = new LinearLayout(parentActivity);
                    linearLayout2.setOrientation(1);
                    linearLayout2.addView((View) editTextBoldCursor, mf.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
                    alertDialog$Builder6.c();
                    alertDialog$Builder6.o(linearLayout2);
                    s1Var6.f28523a = Math.min(org.telegram.messenger.g0.L(320.0f), (org.telegram.messenger.g0.f22608q.x * 85) / 100);
                    alertDialog$Builder6.k(bd.M0(2131751355, null), new org.telegram.ui.Components.t(b1Var, 2));
                    alertDialog$Builder6.h(bd.M0(2131752589, null), new org.telegram.ui.Components.c(2));
                    s1VarArr[0] = s1Var6;
                    s1Var6.f28548k0 = false;
                    s1Var6.setOnDismissListener(new org.telegram.ui.Components.p0(editTextBoldCursor, 1));
                    s1VarArr[0].setOnShowListener(new org.telegram.ui.Components.t0(0, editTextBoldCursor));
                    s1VarArr[0].show();
                }
            }
        }
    }

    @Override
    public final boolean c0(r31 r31Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        Drawable mutate = context.getResources().getDrawable(2131232557).mutate();
        Drawable g7 = k2.p1.g(context, 2131232558);
        int themedColor = getThemedColor(k6.N6);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        g7.setColorFilter(new PorterDuffColorFilter(getThemedColor(k6.f28008k7), mode));
        m2 m2Var = new m2(mutate, g7, 4);
        m2Var.f40448y = org.telegram.messenger.g0.L(2.0f);
        this.f50949e = m2Var;
        this.fragmentView = super.createView(context);
        this.f34298a.r1();
        this.f34298a.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        h4 h4Var;
        if (i3 == hs.R5 && (h4Var = this.f34298a) != null) {
            h4Var.f35594g3.O(true);
        }
    }

    public final void f0() {
        f41 f41Var;
        ArrayList a10 = xf.a(new j8(this, 21));
        if (a10 != null) {
            this.f50952r = a10.size();
            h4 h4Var = this.f34298a;
            if (h4Var != null && (f41Var = h4Var.f35594g3) != null && h4Var.H) {
                f41Var.O(true);
            }
        }
        Utilities.f21387e.c(new d4(this, 23));
    }

    @Override
    public final tj0 getListViewForSimpleGlass() {
        return this.f34298a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        f0();
        getNotificationCenter().c(this, hs.R5);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, hs.R5);
    }

    @Override
    public final void onThemeColorsChanged() {
        boolean z10;
        super.onThemeColorsChanged();
        try {
            m2 m2Var = this.f50949e;
            if (m2Var != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int themedColor = getThemedColor(k6.N6);
                int themedColor2 = getThemedColor(k6.f28008k7);
                if (themedColor == this.f50953s && themedColor2 == this.f50954w) {
                    return;
                }
                this.f50953s = themedColor;
                this.f50954w = themedColor2;
                Drawable drawable = m2Var.f40438a;
                if (drawable != null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                }
                Drawable drawable2 = m2Var.f40439b;
                if (drawable2 != null) {
                    drawable2.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY));
                }
                h4 h4Var = this.f34298a;
                if (h4Var != null) {
                    h4Var.g1();
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
