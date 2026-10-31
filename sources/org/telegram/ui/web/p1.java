package org.telegram.ui.web;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.LinearLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.b8;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.il;
import org.telegram.messenger.q20;
import org.telegram.messenger.tz;
import org.telegram.messenger.us;
import org.telegram.messenger.v2;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w5;
import org.telegram.ui.ActionBar.w6;
import org.telegram.ui.Cells.m5;
import org.telegram.ui.Cells.n6;
import org.telegram.ui.Cells.t8;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.r51;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.z60;
import org.telegram.ui.Wallet.k3;
import org.telegram.ui.f11;
import org.telegram.ui.fp;
import org.telegram.ui.nc;
import org.telegram.ui.zw0;
import w7.b6;
import w7.m6;
public final class p1 extends r51 implements us {
    public zw0 e;
    public final q20 f43162f;
    public long h;
    public long f43163n;
    public long f43164r;
    public int f43165s;
    public int f43166w;

    public p1(org.telegram.ui.p pVar) {
        this.f43162f = pVar;
    }

    public static boolean c0(File file, Boolean bool) {
        boolean z10;
        if (file == null || !file.exists()) {
            return false;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                z10 = true;
                for (File file2 : listFiles) {
                    if ((bool == null || bool.booleanValue() == file2.getName().startsWith("Cookies")) && !c0(file2, bool)) {
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

    public static long d0(File file, Boolean bool) {
        long j10 = 0;
        if (file == null || !file.exists()) {
            return 0L;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    j10 += d0(file2, bool);
                }
                return j10;
            }
        } else if (bool == null || bool.booleanValue() == file.getName().startsWith("Cookies")) {
            return file.length();
        }
        return 0L;
    }

    @Override
    public final void Y(ArrayList arrayList, p51 p51Var) {
        String str;
        ArrayList<TL_account.WebDomainException> arrayList2;
        ArrayList<TL_account.WebDomainException> arrayList3;
        boolean K2 = getMessagesController().K2();
        arrayList.size();
        String L0 = cd.L0(2131752857, null);
        a51 a51Var = new a51(9);
        a51Var.d = 1;
        a51Var.f24292l = L0;
        a51Var.L(K2);
        arrayList.add(a51Var);
        arrayList.add(a51.C(cd.L0(2131752856, null)));
        int i10 = 0;
        if (!K2) {
            getMessagesController().M2();
            a51 i11 = a51.i(17, cd.L0(2131742960, null));
            i11.L(getMessagesController().M2());
            arrayList.add(i11);
            arrayList.add(a51.C(cd.L0(2131742959, null)));
            arrayList.add(a51.u(cd.L0(2131752865, null)));
            arrayList.size();
            zw0 zw0Var = this.e;
            String L02 = cd.L0(2131752849, null);
            a51 a51Var2 = new a51(3);
            a51Var2.d = 16;
            a51Var2.G = zw0Var;
            a51Var2.f24292l = L02;
            a51Var2.f24297q = true;
            arrayList.add(a51Var2);
            TL_account.TL_webBrowserSettings tL_webBrowserSettings = getMessagesController().f18967z8;
            if (tL_webBrowserSettings == null) {
                arrayList3 = new ArrayList<>();
            } else {
                arrayList3 = tL_webBrowserSettings.inapp_exceptions;
            }
            int size = arrayList3.size();
            while (i10 < size) {
                TL_account.WebDomainException webDomainException = arrayList3.get(i10);
                i10++;
                TL_account.WebDomainException webDomainException2 = webDomainException;
                String str2 = webDomainException2.domain;
                String str3 = webDomainException2.title;
                long j10 = webDomainException2.favicon;
                int i12 = n1.f43145b;
                a51 K = a51.K(n1.class);
                K.f24292l = str2;
                K.f24294n = str3;
                K.B = j10;
                arrayList.add(K);
            }
            arrayList.add(a51.C(cd.L0(2131752866, null)));
            if (!arrayList3.isEmpty()) {
                arrayList.size();
                a51 e = a51.e(5, cd.L0(2131752848, null));
                e.f24298r = true;
                arrayList.add(e);
                arrayList.add(a51.C(null));
                return;
            }
            return;
        }
        arrayList.size();
        String L03 = cd.L0(2131752862, null);
        long j11 = this.f43163n;
        String str4 = "";
        if (j11 <= 0) {
            str = "";
        } else {
            str = org.telegram.messenger.i0.i0(j11, false, false);
        }
        arrayList.add(a51.d(3, 2131231775, L03, str));
        arrayList.size();
        String L04 = cd.L0(2131752864, null);
        long j12 = this.h;
        if (j12 > 0) {
            str4 = org.telegram.messenger.i0.i0(j12, false, false);
        }
        arrayList.add(a51.d(2, 2131231774, L04, str4));
        arrayList.add(a51.C(cd.L0(2131752860, null)));
        if (this.f43164r > 0) {
            arrayList.size();
            arrayList.add(a51.c(9, 2131231776, cd.L0(2131752850, null)));
            arrayList.size();
            arrayList.add(a51.d(7, 2131231774, cd.L0(2131752855, null), cd.H(',', "BrowserSettingsHistoryPages", (int) this.f43164r)));
            arrayList.add(a51.C(null));
        }
        arrayList.add(a51.u(cd.L0(2131752846, null)));
        arrayList.size();
        zw0 zw0Var2 = this.e;
        String L05 = cd.L0(2131752849, null);
        a51 a51Var3 = new a51(3);
        a51Var3.d = 15;
        a51Var3.G = zw0Var2;
        a51Var3.f24292l = L05;
        a51Var3.f24297q = true;
        arrayList.add(a51Var3);
        TL_account.TL_webBrowserSettings tL_webBrowserSettings2 = getMessagesController().f18967z8;
        if (tL_webBrowserSettings2 == null) {
            arrayList2 = new ArrayList<>();
        } else {
            arrayList2 = tL_webBrowserSettings2.external_exceptions;
        }
        int size2 = arrayList2.size();
        int i13 = 0;
        while (i13 < size2) {
            TL_account.WebDomainException webDomainException3 = arrayList2.get(i13);
            i13++;
            TL_account.WebDomainException webDomainException4 = webDomainException3;
            String str5 = webDomainException4.domain;
            String str6 = webDomainException4.title;
            long j13 = webDomainException4.favicon;
            int i14 = n1.f43145b;
            a51 K3 = a51.K(n1.class);
            K3.f24292l = str5;
            K3.f24294n = str6;
            K3.B = j13;
            arrayList.add(K3);
        }
        arrayList.add(a51.C(cd.L0(2131752847, null)));
        if (!arrayList2.isEmpty()) {
            arrayList.size();
            a51 e7 = a51.e(5, cd.L0(2131752848, null));
            e7.f24298r = true;
            arrayList.add(e7);
            arrayList.add(a51.C(null));
        }
        arrayList.size();
        arrayList.add(a51.d(6, 2131232353, cd.L0(2131745816, null), g1.a().f43045a));
        arrayList.add(a51.C(cd.L0(2131752842, null)));
        boolean z10 = v2.f18448a;
    }

    @Override
    public final CharSequence Z() {
        return cd.L0(2131752841, null);
    }

    @Override
    public final void a0(a51 a51Var, View view) {
        View view2;
        int i10;
        int i11;
        boolean z10;
        int i12;
        int i13 = a51Var.d;
        if (i13 == 12) {
            tz.J();
            ((t8) view).setChecked(tz.f18189v0);
        } else if (i13 == 13) {
            tz.f18192w0 = !tz.f18192w0;
            SharedPreferences.Editor edit = vp.d1().edit();
            edit.putBoolean("onlyLocalInstantView", tz.f18192w0);
            edit.apply();
            ((t8) view).setChecked(tz.f18192w0);
        } else if (i13 == 17) {
            boolean z11 = !getMessagesController().M2();
            vp messagesController = getMessagesController();
            TL_account.TL_webBrowserSettings tL_webBrowserSettings = messagesController.f18967z8;
            if (tL_webBrowserSettings != null) {
                messagesController.r5(tL_webBrowserSettings.open_external_browser, z11);
            }
            ((t8) view).setChecked(z11);
            this.f29837a.f30819f3.O(true);
        } else if (i13 == 1) {
            vp messagesController2 = getMessagesController();
            TL_account.TL_webBrowserSettings tL_webBrowserSettings2 = messagesController2.f18967z8;
            if (tL_webBrowserSettings2 != null) {
                messagesController2.r5(!tL_webBrowserSettings2.open_external_browser, tL_webBrowserSettings2.display_close_button);
            }
            boolean K2 = getMessagesController().K2();
            t8 t8Var = (t8) view;
            t8Var.setChecked(K2);
            if (K2) {
                i12 = t6.f20966f6;
            } else {
                i12 = t6.f20948e6;
            }
            t8Var.b(t6.x0(null, i12, false), K2);
            this.f29837a.f30819f3.O(true);
        } else if (i13 == 10) {
            vp messagesController3 = getMessagesController();
            TL_account.TL_webBrowserSettings tL_webBrowserSettings3 = messagesController3.f18967z8;
            if (tL_webBrowserSettings3 != null) {
                messagesController3.r5(tL_webBrowserSettings3.open_external_browser, true);
            }
            this.f29837a.f30819f3.O(true);
        } else if (i13 == 11) {
            vp messagesController4 = getMessagesController();
            TL_account.TL_webBrowserSettings tL_webBrowserSettings4 = messagesController4.f18967z8;
            if (tL_webBrowserSettings4 != null) {
                messagesController4.r5(tL_webBrowserSettings4.open_external_browser, false);
            }
            this.f29837a.f30819f3.O(true);
        } else {
            String str = "";
            if (i13 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
                String L0 = cd.L0(2131752864, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                x1Var.R = L0;
                if (this.h != 0) {
                    str = a1.g.r(new StringBuilder(" ("), org.telegram.messenger.i0.i0(this.h, false, false), ")");
                }
                x1Var.T = cd.a0(null, null, 2131752863, str);
                alertDialog$Builder.k(cd.L0(2131752101, null), new org.telegram.ui.ActionBar.u1(this) {
                    public final p1 f43138b;

                    {
                        this.f43138b = this;
                    }

                    @Override
                    public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i14) {
                        switch (r2) {
                            case 0:
                                p1 p1Var = this.f43138b;
                                org.telegram.messenger.w0.f19025b.deleteDatabase("webview.db");
                                org.telegram.messenger.w0.f19025b.deleteDatabase("webviewCache.db");
                                WebStorage.getInstance().deleteAllData();
                                try {
                                    WebView webView = new WebView(p1Var.getParentActivity());
                                    webView.clearCache(true);
                                    webView.clearHistory();
                                    webView.destroy();
                                } catch (Exception unused) {
                                }
                                try {
                                    File file = new File(org.telegram.messenger.w0.f19025b.getApplicationInfo().dataDir, "app_webview");
                                    if (file.exists()) {
                                        p1.c0(file, Boolean.FALSE);
                                    }
                                } catch (Exception e) {
                                    f8.g(e, true);
                                }
                                try {
                                    File file2 = new File(org.telegram.messenger.w0.f19025b.getApplicationInfo().dataDir, "cache/WebView");
                                    if (file2.exists()) {
                                        p1.c0(file2, null);
                                    }
                                } catch (Exception e7) {
                                    f8.g(e7, true);
                                }
                                d2 b10 = d2.b();
                                HashMap hashMap = b10.f43017a;
                                if (hashMap == null) {
                                    b10.f43019c = false;
                                    b10.f43018b = true;
                                    b10.f43017a = new HashMap();
                                } else {
                                    hashMap.clear();
                                }
                                b10.d();
                                p1Var.e0();
                                return;
                            case 1:
                                p1 p1Var2 = this.f43138b;
                                CookieManager cookieManager = CookieManager.getInstance();
                                cookieManager.removeAllCookies(null);
                                cookieManager.flush();
                                try {
                                    File file3 = new File(org.telegram.messenger.w0.f19025b.getApplicationInfo().dataDir, "app_webview");
                                    if (file3.exists()) {
                                        p1.c0(file3, Boolean.TRUE);
                                    }
                                } catch (Exception e10) {
                                    f8.g(e10, true);
                                }
                                p1Var2.e0();
                                return;
                            case 2:
                                p1 p1Var3 = this.f43138b;
                                try {
                                    m6.f52648c.clear();
                                    m6.d.clear();
                                    File file4 = new File(b8.z(4), "webhistory.dat");
                                    if (file4.exists()) {
                                        file4.delete();
                                    }
                                } catch (Exception e11) {
                                    f8.g(e11, true);
                                }
                                p1Var3.f43164r = 0L;
                                p1Var3.f29837a.f30819f3.O(true);
                                return;
                            default:
                                p1 p1Var4 = this.f43138b;
                                vp messagesController5 = p1Var4.getMessagesController();
                                TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.f18967z8;
                                if (tL_webBrowserSettings5 != null) {
                                    tL_webBrowserSettings5.open_external_browser = true;
                                    tL_webBrowserSettings5.display_close_button = true;
                                    tL_webBrowserSettings5.external_exceptions.clear();
                                    messagesController5.f18967z8.inapp_exceptions.clear();
                                    messagesController5.N4(messagesController5.f18967z8);
                                }
                                messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new a3.b(1), new il(messagesController5, 6));
                                p1Var4.f29837a.f30819f3.O(true);
                                return;
                        }
                    }
                });
                alertDialog$Builder.h(cd.L0(2131752589, null), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
            } else if (i13 == 3) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
                String L02 = cd.L0(2131752862, null);
                org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.f20134a;
                x1Var2.R = L02;
                if (this.f43163n != 0) {
                    str = a1.g.r(new StringBuilder(" ("), org.telegram.messenger.i0.i0(this.f43163n, false, false), ")");
                }
                x1Var2.T = cd.a0(null, null, 2131752861, str);
                alertDialog$Builder2.k(cd.L0(2131752101, null), new org.telegram.ui.ActionBar.u1(this) {
                    public final p1 f43138b;

                    {
                        this.f43138b = this;
                    }

                    @Override
                    public final void h(org.telegram.ui.ActionBar.x1 x1Var22, int i14) {
                        switch (r2) {
                            case 0:
                                p1 p1Var = this.f43138b;
                                org.telegram.messenger.w0.f19025b.deleteDatabase("webview.db");
                                org.telegram.messenger.w0.f19025b.deleteDatabase("webviewCache.db");
                                WebStorage.getInstance().deleteAllData();
                                try {
                                    WebView webView = new WebView(p1Var.getParentActivity());
                                    webView.clearCache(true);
                                    webView.clearHistory();
                                    webView.destroy();
                                } catch (Exception unused) {
                                }
                                try {
                                    File file = new File(org.telegram.messenger.w0.f19025b.getApplicationInfo().dataDir, "app_webview");
                                    if (file.exists()) {
                                        p1.c0(file, Boolean.FALSE);
                                    }
                                } catch (Exception e) {
                                    f8.g(e, true);
                                }
                                try {
                                    File file2 = new File(org.telegram.messenger.w0.f19025b.getApplicationInfo().dataDir, "cache/WebView");
                                    if (file2.exists()) {
                                        p1.c0(file2, null);
                                    }
                                } catch (Exception e7) {
                                    f8.g(e7, true);
                                }
                                d2 b10 = d2.b();
                                HashMap hashMap = b10.f43017a;
                                if (hashMap == null) {
                                    b10.f43019c = false;
                                    b10.f43018b = true;
                                    b10.f43017a = new HashMap();
                                } else {
                                    hashMap.clear();
                                }
                                b10.d();
                                p1Var.e0();
                                return;
                            case 1:
                                p1 p1Var2 = this.f43138b;
                                CookieManager cookieManager = CookieManager.getInstance();
                                cookieManager.removeAllCookies(null);
                                cookieManager.flush();
                                try {
                                    File file3 = new File(org.telegram.messenger.w0.f19025b.getApplicationInfo().dataDir, "app_webview");
                                    if (file3.exists()) {
                                        p1.c0(file3, Boolean.TRUE);
                                    }
                                } catch (Exception e10) {
                                    f8.g(e10, true);
                                }
                                p1Var2.e0();
                                return;
                            case 2:
                                p1 p1Var3 = this.f43138b;
                                try {
                                    m6.f52648c.clear();
                                    m6.d.clear();
                                    File file4 = new File(b8.z(4), "webhistory.dat");
                                    if (file4.exists()) {
                                        file4.delete();
                                    }
                                } catch (Exception e11) {
                                    f8.g(e11, true);
                                }
                                p1Var3.f43164r = 0L;
                                p1Var3.f29837a.f30819f3.O(true);
                                return;
                            default:
                                p1 p1Var4 = this.f43138b;
                                vp messagesController5 = p1Var4.getMessagesController();
                                TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.f18967z8;
                                if (tL_webBrowserSettings5 != null) {
                                    tL_webBrowserSettings5.open_external_browser = true;
                                    tL_webBrowserSettings5.display_close_button = true;
                                    tL_webBrowserSettings5.external_exceptions.clear();
                                    messagesController5.f18967z8.inapp_exceptions.clear();
                                    messagesController5.N4(messagesController5.f18967z8);
                                }
                                messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new a3.b(1), new il(messagesController5, 6));
                                p1Var4.f29837a.f30819f3.O(true);
                                return;
                        }
                    }
                });
                alertDialog$Builder2.h(cd.L0(2131752589, null), null);
                alertDialog$Builder2.d(-1);
                alertDialog$Builder2.p();
            } else if (i13 == 7) {
                ArrayList a2 = m6.a(null);
                int size = a2.size();
                long j10 = Long.MAX_VALUE;
                int i14 = 0;
                while (i14 < size) {
                    Object obj = a2.get(i14);
                    i14++;
                    j10 = Math.min(j10, ((a1) obj).f42983b);
                }
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
                String L03 = cd.L0(2131752855, null);
                org.telegram.ui.ActionBar.x1 x1Var3 = alertDialog$Builder3.f20134a;
                x1Var3.R = L03;
                x1Var3.T = cd.a0(null, null, 2131752854, cd.u(j10 / 1000, false));
                alertDialog$Builder3.k(cd.L0(2131752101, null), new org.telegram.ui.ActionBar.u1(this) {
                    public final p1 f43138b;

                    {
                        this.f43138b = this;
                    }

                    @Override
                    public final void h(org.telegram.ui.ActionBar.x1 x1Var22, int i142) {
                        switch (r2) {
                            case 0:
                                p1 p1Var = this.f43138b;
                                org.telegram.messenger.w0.f19025b.deleteDatabase("webview.db");
                                org.telegram.messenger.w0.f19025b.deleteDatabase("webviewCache.db");
                                WebStorage.getInstance().deleteAllData();
                                try {
                                    WebView webView = new WebView(p1Var.getParentActivity());
                                    webView.clearCache(true);
                                    webView.clearHistory();
                                    webView.destroy();
                                } catch (Exception unused) {
                                }
                                try {
                                    File file = new File(org.telegram.messenger.w0.f19025b.getApplicationInfo().dataDir, "app_webview");
                                    if (file.exists()) {
                                        p1.c0(file, Boolean.FALSE);
                                    }
                                } catch (Exception e) {
                                    f8.g(e, true);
                                }
                                try {
                                    File file2 = new File(org.telegram.messenger.w0.f19025b.getApplicationInfo().dataDir, "cache/WebView");
                                    if (file2.exists()) {
                                        p1.c0(file2, null);
                                    }
                                } catch (Exception e7) {
                                    f8.g(e7, true);
                                }
                                d2 b10 = d2.b();
                                HashMap hashMap = b10.f43017a;
                                if (hashMap == null) {
                                    b10.f43019c = false;
                                    b10.f43018b = true;
                                    b10.f43017a = new HashMap();
                                } else {
                                    hashMap.clear();
                                }
                                b10.d();
                                p1Var.e0();
                                return;
                            case 1:
                                p1 p1Var2 = this.f43138b;
                                CookieManager cookieManager = CookieManager.getInstance();
                                cookieManager.removeAllCookies(null);
                                cookieManager.flush();
                                try {
                                    File file3 = new File(org.telegram.messenger.w0.f19025b.getApplicationInfo().dataDir, "app_webview");
                                    if (file3.exists()) {
                                        p1.c0(file3, Boolean.TRUE);
                                    }
                                } catch (Exception e10) {
                                    f8.g(e10, true);
                                }
                                p1Var2.e0();
                                return;
                            case 2:
                                p1 p1Var3 = this.f43138b;
                                try {
                                    m6.f52648c.clear();
                                    m6.d.clear();
                                    File file4 = new File(b8.z(4), "webhistory.dat");
                                    if (file4.exists()) {
                                        file4.delete();
                                    }
                                } catch (Exception e11) {
                                    f8.g(e11, true);
                                }
                                p1Var3.f43164r = 0L;
                                p1Var3.f29837a.f30819f3.O(true);
                                return;
                            default:
                                p1 p1Var4 = this.f43138b;
                                vp messagesController5 = p1Var4.getMessagesController();
                                TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.f18967z8;
                                if (tL_webBrowserSettings5 != null) {
                                    tL_webBrowserSettings5.open_external_browser = true;
                                    tL_webBrowserSettings5.display_close_button = true;
                                    tL_webBrowserSettings5.external_exceptions.clear();
                                    messagesController5.f18967z8.inapp_exceptions.clear();
                                    messagesController5.N4(messagesController5.f18967z8);
                                }
                                messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new a3.b(1), new il(messagesController5, 6));
                                p1Var4.f29837a.f30819f3.O(true);
                                return;
                        }
                    }
                });
                alertDialog$Builder3.h(cd.L0(2131752589, null), null);
                alertDialog$Builder3.d(-1);
                alertDialog$Builder3.p();
            } else if (i13 == 9) {
                b1[] b1VarArr = {null};
                k2 b1Var = new b1(null, new f11(19, this, b1VarArr));
                b1VarArr[0] = b1Var;
                presentFragment(b1Var);
            } else if (i13 == 5) {
                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
                String L04 = cd.L0(2131742963, null);
                org.telegram.ui.ActionBar.x1 x1Var4 = alertDialog$Builder4.f20134a;
                x1Var4.R = L04;
                x1Var4.T = cd.L0(2131742964, null);
                alertDialog$Builder4.k(cd.L0(2131751599, null), new org.telegram.ui.ActionBar.u1(this) {
                    public final p1 f43138b;

                    {
                        this.f43138b = this;
                    }

                    @Override
                    public final void h(org.telegram.ui.ActionBar.x1 x1Var22, int i142) {
                        switch (r2) {
                            case 0:
                                p1 p1Var = this.f43138b;
                                org.telegram.messenger.w0.f19025b.deleteDatabase("webview.db");
                                org.telegram.messenger.w0.f19025b.deleteDatabase("webviewCache.db");
                                WebStorage.getInstance().deleteAllData();
                                try {
                                    WebView webView = new WebView(p1Var.getParentActivity());
                                    webView.clearCache(true);
                                    webView.clearHistory();
                                    webView.destroy();
                                } catch (Exception unused) {
                                }
                                try {
                                    File file = new File(org.telegram.messenger.w0.f19025b.getApplicationInfo().dataDir, "app_webview");
                                    if (file.exists()) {
                                        p1.c0(file, Boolean.FALSE);
                                    }
                                } catch (Exception e) {
                                    f8.g(e, true);
                                }
                                try {
                                    File file2 = new File(org.telegram.messenger.w0.f19025b.getApplicationInfo().dataDir, "cache/WebView");
                                    if (file2.exists()) {
                                        p1.c0(file2, null);
                                    }
                                } catch (Exception e7) {
                                    f8.g(e7, true);
                                }
                                d2 b10 = d2.b();
                                HashMap hashMap = b10.f43017a;
                                if (hashMap == null) {
                                    b10.f43019c = false;
                                    b10.f43018b = true;
                                    b10.f43017a = new HashMap();
                                } else {
                                    hashMap.clear();
                                }
                                b10.d();
                                p1Var.e0();
                                return;
                            case 1:
                                p1 p1Var2 = this.f43138b;
                                CookieManager cookieManager = CookieManager.getInstance();
                                cookieManager.removeAllCookies(null);
                                cookieManager.flush();
                                try {
                                    File file3 = new File(org.telegram.messenger.w0.f19025b.getApplicationInfo().dataDir, "app_webview");
                                    if (file3.exists()) {
                                        p1.c0(file3, Boolean.TRUE);
                                    }
                                } catch (Exception e10) {
                                    f8.g(e10, true);
                                }
                                p1Var2.e0();
                                return;
                            case 2:
                                p1 p1Var3 = this.f43138b;
                                try {
                                    m6.f52648c.clear();
                                    m6.d.clear();
                                    File file4 = new File(b8.z(4), "webhistory.dat");
                                    if (file4.exists()) {
                                        file4.delete();
                                    }
                                } catch (Exception e11) {
                                    f8.g(e11, true);
                                }
                                p1Var3.f43164r = 0L;
                                p1Var3.f29837a.f30819f3.O(true);
                                return;
                            default:
                                p1 p1Var4 = this.f43138b;
                                vp messagesController5 = p1Var4.getMessagesController();
                                TL_account.TL_webBrowserSettings tL_webBrowserSettings5 = messagesController5.f18967z8;
                                if (tL_webBrowserSettings5 != null) {
                                    tL_webBrowserSettings5.open_external_browser = true;
                                    tL_webBrowserSettings5.display_close_button = true;
                                    tL_webBrowserSettings5.external_exceptions.clear();
                                    messagesController5.f18967z8.inapp_exceptions.clear();
                                    messagesController5.N4(messagesController5.f18967z8);
                                }
                                messagesController5.getConnectionsManager().sendRequestTyped(new TL_account.deleteWebBrowserSettingsExceptions(), new a3.b(1), new il(messagesController5, 6));
                                p1Var4.f29837a.f30819f3.O(true);
                                return;
                        }
                    }
                });
                alertDialog$Builder4.h(cd.L0(2131752589, null), null);
                alertDialog$Builder4.d(-1);
                alertDialog$Builder4.p();
            } else if (a51Var.H(n1.class)) {
                o1 o1Var = (o1) view;
                String str2 = o1Var.e;
                z60 F = z60.F((ViewGroup) this.fragmentView, null, o1Var);
                F.f32941s = 40;
                F.c(2131231784, cd.L0(2131746336, null), new k3(28, this, str2), false);
                F.Z();
            } else {
                int i15 = a51Var.d;
                if (i15 == 6) {
                    if (getParentActivity() != null) {
                        AtomicReference atomicReference = new AtomicReference();
                        LinearLayout linearLayout = new LinearLayout(getParentActivity());
                        linearLayout.setOrientation(1);
                        ArrayList b10 = g1.b();
                        int size2 = b10.size();
                        CharSequence[] charSequenceArr = new CharSequence[size2];
                        for (int i16 = 0; i16 < size2; i16++) {
                            charSequenceArr[i16] = ((g1) b10.get(i16)).f43045a;
                            n6 n6Var = new n6(getParentActivity(), null);
                            n6Var.setPadding(org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f), 0);
                            n6Var.a(t6.x0(null, t6.f20986g7, false), t6.x0(null, t6.E5, false));
                            CharSequence charSequence = charSequenceArr[i16];
                            if (i16 == tz.f18172p0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            n6Var.b(charSequence, z10);
                            int i17 = t6.f21020i6;
                            org.telegram.ui.Cells.y h02 = t6.h0(t6.x0(null, i17, false), 2, -1);
                            w6 N = a7.N(i17);
                            n6Var.setBackground(h02);
                            a7.k(n6Var, h02, null, N, null);
                            linearLayout.addView(n6Var);
                            n6Var.setOnClickListener(new jg.w1(i16, view, atomicReference));
                        }
                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(getParentActivity());
                        String L05 = cd.L0(2131745816, null);
                        org.telegram.ui.ActionBar.x1 x1Var5 = alertDialog$Builder5.f20134a;
                        x1Var5.R = L05;
                        alertDialog$Builder5.o(linearLayout);
                        alertDialog$Builder5.h(cd.L0(2131752589, null), null);
                        atomicReference.set(x1Var5);
                        showDialog(x1Var5);
                    }
                } else if (i15 == 15 || i15 == 16) {
                    boolean K22 = getMessagesController().K2();
                    if (getMessagesController().J2(K22)) {
                        s4.t0(this, cd.L0(2131742961, null), cd.L0(2131742962, null), null);
                        return;
                    }
                    Activity parentActivity = getParentActivity();
                    p6 resourceProvider = getResourceProvider();
                    nc ncVar = new nc(6, this, K22);
                    Pattern pattern = s4.f30123a;
                    Activity W = org.telegram.messenger.i0.W(parentActivity);
                    if (W != null) {
                        view2 = W.getCurrentFocus();
                    } else {
                        view2 = null;
                    }
                    org.telegram.ui.ActionBar.x1[] x1VarArr = new org.telegram.ui.ActionBar.x1[1];
                    AlertDialog$Builder alertDialog$Builder6 = new AlertDialog$Builder(0, parentActivity, resourceProvider);
                    if (K22) {
                        i10 = 2131752868;
                    } else {
                        i10 = 2131752867;
                    }
                    String L06 = cd.L0(i10, null);
                    org.telegram.ui.ActionBar.x1 x1Var6 = alertDialog$Builder6.f20134a;
                    x1Var6.R = L06;
                    if (K22) {
                        i11 = 2131752870;
                    } else {
                        i11 = 2131752869;
                    }
                    x1Var6.T = cd.L0(i11, null);
                    ?? editTextBoldCursor = new EditTextBoldCursor(parentActivity);
                    editTextBoldCursor.setTextSize(1, 16.0f);
                    int i18 = t6.f21037j5;
                    a7.V(editTextBoldCursor, i18, resourceProvider);
                    a7.E(editTextBoldCursor, t6.Li, resourceProvider);
                    editTextBoldCursor.setHint(cd.L0(2131752871, null));
                    editTextBoldCursor.setInputType(17);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setSingleLine(true);
                    editTextBoldCursor.setFocusable(true);
                    editTextBoldCursor.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(13.0f));
                    editTextBoldCursor.setCursorWidth(1.5f);
                    editTextBoldCursor.z(t6.q6, resourceProvider);
                    ShapeDrawable d02 = t6.d0(org.telegram.messenger.i0.L(22.0f), t6.r1(0.06f, t6.w0(i18, resourceProvider)));
                    w6 L = a7.L(0.06f, i18);
                    editTextBoldCursor.setBackground(d02);
                    a7.k(editTextBoldCursor, d02, L, null, resourceProvider);
                    fp fpVar = new fp((KeyEvent.Callback) editTextBoldCursor, (Object) ncVar, (Object) x1VarArr, (Object) view2, 5);
                    editTextBoldCursor.setOnEditorActionListener(new org.telegram.ui.Components.t0(fpVar, 0));
                    LinearLayout linearLayout2 = new LinearLayout(parentActivity);
                    linearLayout2.setOrientation(1);
                    linearLayout2.addView((View) editTextBoldCursor, b6.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
                    alertDialog$Builder6.c();
                    alertDialog$Builder6.o(linearLayout2);
                    x1Var6.f21468a = Math.min(org.telegram.messenger.i0.L(320.0f), (org.telegram.messenger.i0.f16026q.x * 85) / 100);
                    alertDialog$Builder6.k(cd.L0(2131751355, null), new org.telegram.ui.Components.t(fpVar, 2));
                    alertDialog$Builder6.h(cd.L0(2131752589, null), new m5(19));
                    x1VarArr[0] = x1Var6;
                    x1Var6.f21490j0 = false;
                    x1Var6.setOnDismissListener(new org.telegram.ui.Components.r0(editTextBoldCursor, 1));
                    x1VarArr[0].setOnShowListener(new org.telegram.ui.Components.u0(0, editTextBoldCursor));
                    x1VarArr[0].show();
                }
            }
        }
    }

    @Override
    public final boolean b0(a51 a51Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        Drawable mutate = context.getResources().getDrawable(2131232556).mutate();
        Drawable f7 = i0.a.f(context, 2131232557);
        int themedColor = getThemedColor(t6.N6);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        f7.setColorFilter(new PorterDuffColorFilter(getThemedColor(t6.f21059k7), mode));
        zw0 zw0Var = new zw0(mutate, f7, 1);
        zw0Var.f25848y = org.telegram.messenger.i0.L(2.0f);
        this.e = zw0Var;
        this.fragmentView = super.createView(context);
        this.f29837a.r1();
        this.f29837a.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ii iiVar;
        if (i10 == zs.R5 && (iiVar = this.f29837a) != null) {
            iiVar.f30819f3.O(true);
        }
    }

    public final void e0() {
        p51 p51Var;
        ArrayList a2 = m6.a(new ag.l(this, 29));
        if (a2 != null) {
            this.f43164r = a2.size();
            ii iiVar = this.f29837a;
            if (iiVar != null && (p51Var = iiVar.f30819f3) != null && iiVar.G) {
                p51Var.O(true);
            }
        }
        Utilities.e.c(new w5(this, 19));
    }

    @Override
    public final tk0 getListViewForSimpleGlass() {
        return this.f29837a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        e0();
        getNotificationCenter().c(this, zs.R5);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, zs.R5);
    }

    @Override
    public final void onThemeColorsChanged() {
        boolean z10;
        super.onThemeColorsChanged();
        try {
            zw0 zw0Var = this.e;
            if (zw0Var != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int themedColor = getThemedColor(t6.N6);
                int themedColor2 = getThemedColor(t6.f21059k7);
                if (themedColor == this.f43165s && themedColor2 == this.f43166w) {
                    return;
                }
                this.f43165s = themedColor;
                this.f43166w = themedColor2;
                Drawable drawable = zw0Var.f25839a;
                if (drawable != null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                }
                Drawable drawable2 = zw0Var.f25840b;
                if (drawable2 != null) {
                    drawable2.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY));
                }
                ii iiVar = this.f29837a;
                if (iiVar != null) {
                    iiVar.g1();
                }
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
